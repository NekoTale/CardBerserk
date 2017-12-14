package com.github.nekotale.myfirstgame;

import com.github.nekotale.core.StorageService;

/**
 * Created by mds on 14.12.17.
 */

public class AndroidStorageService implements StorageService {

    @Override
    public void printPlatform() {
        System.out.println("Android");
    }

}
