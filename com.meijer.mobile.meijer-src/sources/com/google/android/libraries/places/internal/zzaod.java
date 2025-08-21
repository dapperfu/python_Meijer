package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaod extends zzbae implements zzbbm {
    private static final zzaod zzH;
    private static volatile zzbbt zzI;
    private zzaoh zzA;
    private zzaoh zzB;
    private zzaoh zzC;
    private zzaoh zzD;
    private zzaoh zzE;
    private zzaoh zzF;
    private zzbam zzG = zzbae.zzbr();
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private zzaof zzj;
    private zzaof zzk;
    private zzaof zzl;
    private zzaof zzm;
    private zzaof zzn;
    private zzaof zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private float zzs;
    private int zzt;
    private double zzu;
    private int zzv;
    private int zzw;
    private float zzx;
    private long zzy;
    private double zzz;

    static {
        zzaod zzaodVar = new zzaod();
        zzH = zzaodVar;
        zzbae.zzbn(zzaod.class, zzaodVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzH, "\u0001\u001d\u0000\u0001\u0001\u001d\u001d\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဂ\u0004\u0006င\f\u0007င\r\bခ\u000e\tင\u000f\nက\u0010\u000bင\u0011\fင\u0012\rခ\u0013\u000eဂ\u0014\u000fက\u0015\u0010ဉ\u0005\u0011ဉ\u0006\u0012ဉ\u0007\u0013ဉ\b\u0014ဉ\t\u0015ဉ\n\u0016ဉ\u0016\u0017ဉ\u0017\u0018ဉ\u0018\u0019ဉ\u0019\u001aဉ\u001a\u001bဉ\u001b\u001cင\u000b\u001d'", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzp", "zzG"});
        }
        if (i11 == 3) {
            return new zzaod();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaoc(bArr);
        }
        if (i11 == 5) {
            return zzH;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzI;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaod.class) {
            try {
                zzazzVar = zzI;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzH);
                    zzI = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzaod() {
    }
}
