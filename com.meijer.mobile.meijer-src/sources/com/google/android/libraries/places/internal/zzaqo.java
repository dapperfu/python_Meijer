package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaqo extends zzbae implements zzbbm {
    private static final zzaqo zzg;
    private static volatile zzbbt zzh;
    private int zzb;
    private zzbee zze;
    private zzbee zzf;

    public static zzaqo zze() {
        return zzg;
    }

    static {
        zzaqo zzaqoVar = new zzaqo();
        zzg = zzaqoVar;
        zzbae.zzbn(zzaqo.class, zzaqoVar);
    }

    public static zzaqn zzd() {
        return (zzaqn) zzg.zzbj();
    }

    public final zzbee zza() {
        zzbee zzbeeVar = this.zze;
        return zzbeeVar == null ? zzbee.zzg() : zzbeeVar;
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
            return new zzaqo();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaqn(bArr);
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
        synchronized (zzaqo.class) {
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

    public final zzbee zzc() {
        zzbee zzbeeVar = this.zzf;
        return zzbeeVar == null ? zzbee.zzg() : zzbeeVar;
    }

    private zzaqo() {
    }

    final /* synthetic */ void zzf(zzbee zzbeeVar) {
        zzbeeVar.getClass();
        this.zze = zzbeeVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzg(zzbee zzbeeVar) {
        zzbeeVar.getClass();
        this.zzf = zzbeeVar;
        this.zzb |= 2;
    }
}
