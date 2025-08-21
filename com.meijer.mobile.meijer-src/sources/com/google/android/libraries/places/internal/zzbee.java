package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbee extends zzbae implements zzbbm {
    private static final zzbee zzf;
    private static volatile zzbbt zzg;
    private double zzb;
    private double zze;

    public static zzbee zzg() {
        return zzf;
    }

    public final double zzc() {
        return this.zzb;
    }

    public final double zze() {
        return this.zze;
    }

    final /* synthetic */ void zzh(double d10) {
        this.zzb = d10;
    }

    final /* synthetic */ void zzi(double d10) {
        this.zze = d10;
    }

    static {
        zzbee zzbeeVar = new zzbee();
        zzf = zzbeeVar;
        zzbae.zzbn(zzbee.class, zzbeeVar);
    }

    public static zzbed zzf() {
        return (zzbed) zzf.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"zzb", "zze"});
        }
        if (i11 == 3) {
            return new zzbee();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzbed(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzg;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzbee.class) {
            try {
                zzazzVar = zzg;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzf);
                    zzg = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzbee() {
    }
}
