package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class zzayb extends zzbae implements zzbbm {
    private static final zzayb zzg;
    private static volatile zzbbt zzh;
    private double zzb;
    private zzbam zze = zzbae.zzbr();
    private zzbao zzf = zzbae.zzbu();

    final /* synthetic */ void zzc(double d10) {
        this.zzb = d10;
    }

    static {
        zzayb zzaybVar = new zzayb();
        zzg = zzaybVar;
        zzbae.zzbn(zzayb.class, zzaybVar);
    }

    public static zzaya zza() {
        return (zzaya) zzg.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0000\u0002,\u0003Ț", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzayb();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaya(bArr);
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
        synchronized (zzayb.class) {
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

    final /* synthetic */ void zzd(Iterable iterable) {
        zzbam zzbamVar = this.zze;
        if (!zzbamVar.zza()) {
            this.zze = zzbae.zzbs(zzbamVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zze.zzh(((zzaun) it.next()).zza());
        }
    }

    private zzayb() {
    }
}
