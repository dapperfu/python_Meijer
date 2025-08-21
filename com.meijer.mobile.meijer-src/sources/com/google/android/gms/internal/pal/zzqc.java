package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class zzqc extends RuntimeException {
    public zzqc(String str) {
        super(str);
    }

    public zzqc(String str, Throwable th2) {
        super("Creating a LegacyProtoKey failed", th2);
    }
}
