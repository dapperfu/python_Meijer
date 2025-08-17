package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzatq extends zzbae implements zzbbm {
    private static final zzatq zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzbee zze;
    private double zzf;

    final /* synthetic */ void zzd(double d10) {
        this.zzf = d10;
    }

    static {
        zzatq zzatqVar = new zzatq();
        zzg = zzatqVar;
        zzbae.zzbn(zzatq.class, zzatqVar);
    }

    public static zzatp zza() {
        return (zzatp) zzg.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzatq();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzatp(bArr);
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
        synchronized (zzatq.class) {
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

    private zzatq() {
    }

    final /* synthetic */ void zzc(zzbee zzbeeVar) {
        zzbeeVar.getClass();
        this.zze = zzbeeVar;
        this.zzb |= 1;
    }
}
