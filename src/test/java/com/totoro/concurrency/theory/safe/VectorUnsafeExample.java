package com.totoro.concurrency.theory.safe;

import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: totoro
 * @createDate: 2023 03 22 23 20
 * @description:
 **/
public class VectorUnsafeExample {

    private static Vector<Integer> vector = new Vector<>();

    public static void main(String[] args) {

        while (true){
            for (int i = 0; i < 100; i++) {
                vector.add(i);
            }

            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.execute(() ->{
                for (int i = 0; i < vector.size(); i++) {
                    vector.remove(i);
                }
            });

            executorService.execute(() -> {
                for (int i = 0; i < vector.size(); i++) {
                    vector.get(i);
                }
            });

            executorService.shutdown();
        }
    }
}
