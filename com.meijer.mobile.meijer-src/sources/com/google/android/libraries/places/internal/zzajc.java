package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class zzajc extends zzbae implements zzbbm {
    private static final zzajc zzl;
    private static volatile zzbbt zzm;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private zzbam zzh = zzbae.zzbr();
    private int zzi;
    private int zzj;
    private boolean zzk;

    final /* synthetic */ void zzf(int i10) {
        this.zzb |= 16;
        this.zzj = i10;
    }

    final /* synthetic */ void zzh(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzi(int i10) {
        this.zzi = i10 - 1;
        this.zzb |= 8;
    }

    static {
        zzajc zzajcVar = new zzajc();
        zzl = zzajcVar;
        zzbae.zzbn(zzajc.class, zzajcVar);
    }

    public static zzait zza() {
        return (zzait) zzl.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ࠬ\u0005᠌\u0003\u0006င\u0004\u0007ဇ\u0005", new Object[]{"zzb", "zze", zzaix.zza, "zzf", zzaja.zza, "zzg", zzaiy.zza, "zzh", zzaiv.zza, "zzi", zzaiu.zza, "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzajc();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzait(bArr);
        }
        if (i11 == 5) {
            return zzl;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzm;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzajc.class) {
            try {
                zzazzVar = zzm;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzl);
                    zzm = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zze(Iterable iterable) {
        zzbam zzbamVar = this.zzh;
        if (!zzbamVar.zza()) {
            this.zzh = zzbae.zzbs(zzbamVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzh.zzh(((zzaiw) it.next()).zza());
        }
    }

    private zzajc() {
    }

    final /* synthetic */ void zzc(zzajb zzajbVar) {
        this.zzf = zzajbVar.zza();
        this.zzb |= 2;
    }

    final /* synthetic */ void zzd(zzaiz zzaizVar) {
        this.zzg = zzaizVar.zza();
        this.zzb |= 4;
    }
}
