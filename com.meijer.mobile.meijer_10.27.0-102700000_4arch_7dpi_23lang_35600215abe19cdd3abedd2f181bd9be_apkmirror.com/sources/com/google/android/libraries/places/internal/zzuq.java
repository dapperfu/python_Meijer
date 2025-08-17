package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzuq extends zzbae implements zzbbm {
    private static final zzuq zzn;
    private static volatile zzbbt zzo;
    private int zzb;
    private int zzf;
    private int zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private String zze = "";
    private String zzh = "";

    final /* synthetic */ void zzc(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void zzd(int i10) {
        this.zzb |= 2;
        this.zzf = i10;
    }

    static {
        zzuq zzuqVar = new zzuq();
        zzn = zzuqVar;
        zzbae.zzbn(zzuq.class, zzuqVar);
    }

    public static zzul zza() {
        return (zzul) zzn.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007\t᠌\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzum.zza, "zzk", zzuo.zza, "zzl", zzun.zza, "zzm", zzup.zza});
        }
        if (i11 == 3) {
            return new zzuq();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzul(bArr);
        }
        if (i11 == 5) {
            return zzn;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzo;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzuq.class) {
            try {
                zzazzVar = zzo;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzn);
                    zzo = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzuq() {
    }
}
