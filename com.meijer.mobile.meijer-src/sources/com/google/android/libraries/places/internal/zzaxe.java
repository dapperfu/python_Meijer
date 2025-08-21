package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaxe extends zzbae implements zzbbm {
    private static final zzaxe zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzbei zze;
    private zzbei zzf;

    public static zzaxe zzf() {
        return zzg;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zzd() {
        return (this.zzb & 2) != 0;
    }

    static {
        zzaxe zzaxeVar = new zzaxe();
        zzg = zzaxeVar;
        zzbae.zzbn(zzaxe.class, zzaxeVar);
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
            return new zzaxe();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaxd(bArr);
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
        synchronized (zzaxe.class) {
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

    public final zzbei zzc() {
        zzbei zzbeiVar = this.zze;
        return zzbeiVar == null ? zzbei.zzg() : zzbeiVar;
    }

    public final zzbei zze() {
        zzbei zzbeiVar = this.zzf;
        return zzbeiVar == null ? zzbei.zzg() : zzbeiVar;
    }

    private zzaxe() {
    }
}
