package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* loaded from: classes6.dex */
interface S3 {
    Object a(String str);

    static Object b(R3 r32) {
        try {
            return r32.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return r32.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
