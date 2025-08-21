package com.google.android.libraries.places.internal;

import java.util.List;

/* loaded from: classes6.dex */
public final class zzatg extends zzbae implements zzbbm {
    private static final zzatg zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private zzate zzg;
    private zzatm zzh;
    private int zzj;
    private String zze = "";
    private String zzf = "";
    private zzbao zzi = zzbae.zzbu();

    public static zzatg zzg() {
        return zzk;
    }

    public final String zza() {
        return this.zzf;
    }

    public final List zze() {
        return this.zzi;
    }

    public final int zzf() {
        return this.zzj;
    }

    static {
        zzatg zzatgVar = new zzatg();
        zzk = zzatgVar;
        zzbae.zzbn(zzatg.class, zzatgVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ț\u0006\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzatg();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzatf(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzl;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzatg.class) {
            try {
                zzazzVar = zzl;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzk);
                    zzl = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    public final zzate zzc() {
        zzate zzateVar = this.zzg;
        return zzateVar == null ? zzate.zzd() : zzateVar;
    }

    public final zzatm zzd() {
        zzatm zzatmVar = this.zzh;
        return zzatmVar == null ? zzatm.zzd() : zzatmVar;
    }

    private zzatg() {
    }
}
