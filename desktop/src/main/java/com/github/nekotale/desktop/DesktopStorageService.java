package com.github.nekotale.desktop;

import com.github.nekotale.core.StorageService;

/**
 * Created by mds on 14.12.17.
 */

public class DesktopStorageService implements StorageService {
    @Override
    public void printPlatform() {
        System.out.println("PC");
    }
}
