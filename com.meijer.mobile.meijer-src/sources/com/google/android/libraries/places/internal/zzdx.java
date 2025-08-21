package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzdx extends zzbae implements zzbbm {
    private static final zzdx zzE;
    private static volatile zzbbt zzF;
    private float zzA;
    private float zzB;
    private boolean zzC;
    private int zzD;
    private int zzb;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private float zzi;
    private float zzj;
    private float zzk;
    private float zzl;
    private float zzm;
    private float zzn;
    private float zzo;
    private float zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private float zzt;
    private float zzu;
    private float zzv;
    private float zzw;
    private float zzx;
    private float zzy;
    private float zzz;

    static {
        zzdx zzdxVar = new zzdx();
        zzE = zzdxVar;
        zzbae.zzbn(zzdx.class, zzdxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzE, "\u0001\u001a\u0000\u0001\u0001\u001a\u001a\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\fခ\u000b\rင\f\u000eင\r\u000fင\u000e\u0010ခ\u000f\u0011ခ\u0010\u0012ခ\u0011\u0013ခ\u0012\u0014ခ\u0013\u0015ခ\u0014\u0016ခ\u0015\u0017ခ\u0016\u0018ခ\u0017\u0019ဇ\u0018\u001aင\u0019", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD"});
        }
        if (i11 == 3) {
            return new zzdx();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzdw(bArr);
        }
        if (i11 == 5) {
            return zzE;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzF;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzdx.class) {
            try {
                zzazzVar = zzF;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzE);
                    zzF = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzdx() {
    }
}
