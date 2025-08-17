package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzamu extends zzbae implements zzbbm {
    private static final zzamu zzp;
    private static volatile zzbbt zzq;
    private int zzb;
    private int zze;
    private boolean zzg;
    private double zzh;
    private int zzi;
    private boolean zzk;
    private zzamd zzl;
    private zzams zzm;
    private zzani zzn;
    private boolean zzo;
    private String zzf = "";
    private zzbam zzj = zzbae.zzbr();

    final /* synthetic */ void zzc(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    final /* synthetic */ void zzd(boolean z10) {
        this.zzb |= 4;
        this.zzg = z10;
    }

    final /* synthetic */ void zze(double d10) {
        this.zzb |= 8;
        this.zzh = d10;
    }

    final /* synthetic */ void zzf(int i10) {
        this.zzb |= 16;
        this.zzi = i10;
    }

    final /* synthetic */ void zzh(boolean z10) {
        this.zzb |= 32;
        this.zzk = z10;
    }

    final /* synthetic */ void zzl(boolean z10) {
        this.zzb |= 512;
        this.zzo = z10;
    }

    final /* synthetic */ void zzn(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 1;
    }

    static {
        zzamu zzamuVar = new zzamu();
        zzp = zzamuVar;
        zzbae.zzbn(zzamu.class, zzamuVar);
    }

    public static zzamq zza() {
        return (zzamq) zzp.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzp, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004က\u0003\u0005င\u0004\u0006'\u0007ဇ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000bဇ\t", new Object[]{"zzb", "zze", zzamt.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i11 == 3) {
            return new zzamu();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzamq(bArr);
        }
        if (i11 == 5) {
            return zzp;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzq;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzamu.class) {
            try {
                zzazzVar = zzq;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzp);
                    zzq = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzg(Iterable iterable) {
        zzbam zzbamVar = this.zzj;
        if (!zzbamVar.zza()) {
            this.zzj = zzbae.zzbs(zzbamVar);
        }
        zzaym.zzbc(iterable, this.zzj);
    }

    private zzamu() {
    }

    final /* synthetic */ void zzi(zzamd zzamdVar) {
        zzamdVar.getClass();
        this.zzl = zzamdVar;
        this.zzb |= 64;
    }

    final /* synthetic */ void zzj(zzams zzamsVar) {
        zzamsVar.getClass();
        this.zzm = zzamsVar;
        this.zzb |= 128;
    }

    final /* synthetic */ void zzk(zzani zzaniVar) {
        zzaniVar.getClass();
        this.zzn = zzaniVar;
        this.zzb |= 256;
    }
}
