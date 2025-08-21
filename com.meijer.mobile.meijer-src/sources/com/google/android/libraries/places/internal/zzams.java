package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class zzams extends zzbae implements zzbbm {
    private static final zzams zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private double zze;
    private zzbam zzf = zzbae.zzbr();

    final /* synthetic */ void zzc(double d10) {
        this.zzb |= 1;
        this.zze = d10;
    }

    static {
        zzams zzamsVar = new zzams();
        zzg = zzamsVar;
        zzbae.zzbn(zzams.class, zzamsVar);
    }

    public static zzamr zza() {
        return (zzamr) zzg.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001က\u0000\u0002ࠬ", new Object[]{"zzb", "zze", "zzf", zzahp.zza});
        }
        if (i11 == 3) {
            return new zzams();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzamr(bArr);
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
        synchronized (zzams.class) {
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
        zzbam zzbamVar = this.zzf;
        if (!zzbamVar.zza()) {
            this.zzf = zzbae.zzbs(zzbamVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzf.zzh(((zzahq) it.next()).zza());
        }
    }

    private zzams() {
    }
}
