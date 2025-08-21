package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class zzajx extends zzbae implements zzbbm {
    private static final zzajx zzm;
    private static volatile zzbbt zzn;
    private int zzb;
    private int zze;
    private int zzf;
    private zzbam zzg = zzbae.zzbr();
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;

    final /* synthetic */ void zzf(boolean z10) {
        this.zzb |= 8;
        this.zzi = z10;
    }

    final /* synthetic */ void zzg(boolean z10) {
        this.zzb |= 16;
        this.zzj = z10;
    }

    final /* synthetic */ void zzk(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 1;
    }

    static {
        zzajx zzajxVar = new zzajx();
        zzm = zzajxVar;
        zzbae.zzbn(zzajx.class, zzajxVar);
    }

    public static zzajn zza() {
        return (zzajn) zzm.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ࠬ\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007᠌\u0005\b᠌\u0006", new Object[]{"zzb", "zze", zzajs.zza, "zzf", zzajt.zza, "zzg", zzajq.zza, "zzh", zzajv.zza, "zzi", "zzj", "zzk", zzajo.zza, "zzl", zzajy.zza});
        }
        if (i11 == 3) {
            return new zzajx();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzajn(bArr);
        }
        if (i11 == 5) {
            return zzm;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzn;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzajx.class) {
            try {
                zzazzVar = zzn;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzm);
                    zzn = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzd(Iterable iterable) {
        zzbam zzbamVar = this.zzg;
        if (!zzbamVar.zza()) {
            this.zzg = zzbae.zzbs(zzbamVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzg.zzh(((zzajr) it.next()).zza());
        }
    }

    private zzajx() {
    }

    final /* synthetic */ void zzc(zzaju zzajuVar) {
        this.zzf = zzajuVar.zza();
        this.zzb |= 2;
    }

    final /* synthetic */ void zze(zzajw zzajwVar) {
        this.zzh = zzajwVar.zza();
        this.zzb |= 4;
    }

    final /* synthetic */ void zzh(zzajp zzajpVar) {
        this.zzk = zzajpVar.zza();
        this.zzb |= 32;
    }

    final /* synthetic */ void zzi(zzajz zzajzVar) {
        this.zzl = zzajzVar.zza();
        this.zzb |= 64;
    }
}
