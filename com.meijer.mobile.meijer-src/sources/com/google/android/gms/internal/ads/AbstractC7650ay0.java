package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ay0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7650ay0 {
    public abstract void a(String str);

    public static AbstractC7650ay0 b(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new Vx0(cls.getSimpleName()) : new Xx0(cls.getSimpleName());
    }
}
