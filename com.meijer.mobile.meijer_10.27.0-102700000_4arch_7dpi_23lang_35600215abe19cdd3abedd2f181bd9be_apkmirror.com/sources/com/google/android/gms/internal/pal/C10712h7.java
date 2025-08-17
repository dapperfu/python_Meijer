package com.google.android.gms.internal.pal;

import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.pal.h7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C10712h7 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!com.google.ads.interactivemedia.v3.internal.f.a(unsafe, obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }
}
