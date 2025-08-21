package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public interface zzbwk {
    public static final zzbwk zza;

    long zza();

    static {
        zzbwk zzbmfVar;
        try {
            Class.forName("j$.time.Instant");
            zzbmfVar = new zzbpm();
        } catch (ClassNotFoundException unused) {
            zzbmfVar = new zzbmf();
        }
        zza = zzbmfVar;
    }
}
