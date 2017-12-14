package com.github.nekotale.desktop;

import com.github.nekotale.core.StorageService;

public class Desktop {

    public static void main(String[] args) {
        StorageService ss = new DesktopStorageService();
        ss.printPlatform();
    }

}
