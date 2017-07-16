package me.ron.tbar.util;

import android.os.Build;

/**
 * Created by mike on 17-7-16.
 */
public final class RuntimeUtil {

    private RuntimeUtil() {
        throw new AssertionError();
    }

    public static boolean theVersionGreaterThanKitKat() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT;
    }

}
