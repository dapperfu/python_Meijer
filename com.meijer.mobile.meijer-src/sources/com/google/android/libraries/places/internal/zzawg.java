package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzawg extends zzbae implements zzbbm {
    private static final zzawg zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private zzbec zzh;
    private boolean zzi;

    public static zzawg zzh() {
        return zzj;
    }

    public final int zza() {
        return this.zze;
    }

    public final int zzc() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final boolean zze() {
        return (this.zzb & 8) != 0;
    }

    public final boolean zzg() {
        return this.zzi;
    }

    static {
        zzawg zzawgVar = new zzawg();
        zzj = zzawgVar;
        zzbae.zzbn(zzawg.class, zzawgVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzj, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0005\u0007\u0006ဉ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzi", "zzh"});
        }
        if (i11 == 3) {
            return new zzawg();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzawf(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzk;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzawg.class) {
            try {
                zzazzVar = zzk;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzj);
                    zzk = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    public final zzbec zzf() {
        zzbec zzbecVar = this.zzh;
        return zzbecVar == null ? zzbec.zzg() : zzbecVar;
    }

    private zzawg() {
    }
}
