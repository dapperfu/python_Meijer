package com.google.maps.android;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes7.dex */
public class PackageManager {
    private Class<?> pmClass;
    private Object pmInstance;

    public PackageInfo getPackageInfo(String str, int i10) {
        try {
            return new PackageInfo(Class.forName("android.content.pm.PackageInfo"), this.pmClass.getMethod("getPackageInfo", String.class, Integer.TYPE).invoke(this.pmInstance, str, Integer.valueOf(i10)));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public PackageManager(Class<?> cls, Object obj) {
        this.pmClass = cls;
        this.pmInstance = obj;
    }
}
