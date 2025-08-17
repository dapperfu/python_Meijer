package com.google.android.libraries.places.internal;

import java.util.List;

/* loaded from: classes6.dex */
public final class zzayk extends zzbae implements zzbbm {
    private static final zzayk zzi;
    private static volatile zzbbt zzj;
    private zzbao zzb = zzbae.zzbu();
    private zzbao zze = zzbae.zzbu();
    private zzbao zzf = zzbae.zzbu();
    private String zzg = "";
    private String zzh = "";

    public static zzayk zzd() {
        return zzi;
    }

    public final List zza() {
        return this.zzb;
    }

    public final List zzc() {
        return this.zze;
    }

    static {
        zzayk zzaykVar = new zzayk();
        zzi = zzaykVar;
        zzbae.zzbn(zzayk.class, zzaykVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004Ȉ\u0005Ȉ", new Object[]{"zzb", zzaww.class, "zze", zzaxq.class, "zzf", zzaug.class, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzayk();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzayj(bArr);
        }
        if (i11 == 5) {
            return zzi;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzj;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzayk.class) {
            try {
                zzazzVar = zzj;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzi);
                    zzj = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzayk() {
    }
}
