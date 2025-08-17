package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class zzgnt extends RuntimeException {
    public zzgnt(String str) {
        super(str);
    }

    public zzgnt(String str, Throwable th2) {
        super(str, th2);
    }

    public zzgnt(Throwable th2) {
        super(th2);
    }

    public static Object a(Gp0 gp0) {
        try {
            return gp0.zza();
        } catch (Exception e10) {
            throw new zzgnt(e10);
        }
    }
}
