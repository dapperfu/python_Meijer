package com.google.ads.interactivemedia.v3.internal;

import sun.misc.Unsafe;

/* loaded from: classes4.dex */
public final /* synthetic */ class zztj {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!f.a(unsafe, obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }
}
