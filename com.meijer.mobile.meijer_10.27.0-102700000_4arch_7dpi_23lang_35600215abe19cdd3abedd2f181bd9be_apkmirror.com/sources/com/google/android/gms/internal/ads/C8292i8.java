package com.google.android.gms.internal.ads;

import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.i8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8292i8 {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet f74888a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private static String f74889b = "media3.common";

    public static synchronized String a() {
        return f74889b;
    }

    public static synchronized void b(String str) {
        if (f74888a.add(str)) {
            f74889b = f74889b + ", " + str;
        }
    }
}
