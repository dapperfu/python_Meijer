package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.i8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8417i8 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f75728a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private static String f75729b = "media3.common";

    public static synchronized String a() {
        return f75729b;
    }

    public static synchronized void b(String str) {
        if (f75728a.add(str)) {
            f75729b = f75729b + ", " + str;
        }
    }
}
