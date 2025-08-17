package com.google.android.gms.dynamite;

import dalvik.system.PathClassLoader;

/* loaded from: classes4.dex */
final class a extends PathClassLoader {
    @Override // java.lang.ClassLoader
    protected final Class loadClass(String str, boolean z10) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z10);
    }

    a(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }
}
