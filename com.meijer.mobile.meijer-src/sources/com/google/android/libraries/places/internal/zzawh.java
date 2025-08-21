package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzawh extends zzbae implements zzbbm {
    private static final zzawh zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzawg zze;
    private zzawg zzf;

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zzd() {
        return (this.zzb & 2) != 0;
    }

    static {
        zzawh zzawhVar = new zzawh();
        zzg = zzawhVar;
        zzbae.zzbn(zzawh.class, zzawhVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzawh();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzawe(bArr);
        }
        if (i11 == 5) {
            return zzg;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzh;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzawh.class) {
            try {
                zzazzVar = zzh;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzg);
                    zzh = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    public final zzawg zzc() {
        zzawg zzawgVar = this.zze;
        return zzawgVar == null ? zzawg.zzh() : zzawgVar;
    }

    public final zzawg zze() {
        zzawg zzawgVar = this.zzf;
        return zzawgVar == null ? zzawg.zzh() : zzawgVar;
    }

    private zzawh() {
    }
}
