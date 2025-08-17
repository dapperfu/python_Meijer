package com.google.maps.android;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes7.dex */
public class Context {
    private Class<?> contextClass;
    private Object contextInstance;
    private PackageManager packageManager;

    public String getPackageName() {
        try {
            return (String) this.contextClass.getMethod("getPackageName", null).invoke(getContextInstance(), null);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static Context getApplicationContext() {
        try {
            return new Context(Class.forName("android.content.Context"));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private Object getContextInstance() {
        Object obj = this.contextInstance;
        if (obj != null) {
            return obj;
        }
        try {
            this.contextInstance = Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            e10.printStackTrace();
        }
        return this.contextInstance;
    }

    public PackageManager getPackageManager() {
        PackageManager packageManager = this.packageManager;
        if (packageManager != null) {
            return packageManager;
        }
        try {
            this.packageManager = new PackageManager(Class.forName("android.content.pm.PackageManager"), this.contextClass.getMethod("getPackageManager", null).invoke(getContextInstance(), null));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
            e10.printStackTrace();
        }
        return this.packageManager;
    }

    Context(Class<?> cls) {
        this.contextClass = cls;
    }
}
