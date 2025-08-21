package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzamj extends zzbae implements zzbbm {
    private static final zzamj zzB;
    private static volatile zzbbt zzC;
    private int zzb;
    private int zze;
    private zzaje zzh;
    private zzana zzi;
    private zzalh zzj;
    private zzakb zzk;
    private zzalf zzl;
    private zzakd zzm;
    private zzald zzn;
    private zzanc zzo;
    private zzanc zzp;
    private zzalj zzq;
    private zzakr zzr;
    private zzaml zzs;
    private zzamn zzt;
    private zzaly zzu;
    private zzalo zzv;
    private zzamp zzw;
    private zzamu zzx;
    private zzamx zzy;
    private zzalf zzz;
    private byte zzA = 2;
    private String zzf = "";
    private String zzg = "";

    final /* synthetic */ void zzk(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 1;
    }

    static {
        zzamj zzamjVar = new zzamj();
        zzB = zzamjVar;
        zzbae.zzbn(zzamj.class, zzamjVar);
    }

    public static zzamh zza() {
        return (zzamh) zzB.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzB, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0004\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဉ\u0007\tᐉ\b\nဉ\t\u000bဉ\u000b\fဉ\n\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015", new Object[]{"zzb", "zze", zzami.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzp", "zzo", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (i11 == 3) {
            return new zzamj();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzamh(bArr);
        }
        if (i11 == 5) {
            return zzB;
        }
        if (i11 != 6) {
            this.zzA = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzC;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzamj.class) {
            try {
                zzazzVar = zzC;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzB);
                    zzC = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzamj() {
    }

    final /* synthetic */ void zzc(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    final /* synthetic */ void zze(zzalf zzalfVar) {
        zzalfVar.getClass();
        this.zzl = zzalfVar;
        this.zzb |= 128;
    }

    final /* synthetic */ void zzf(zzakd zzakdVar) {
        zzakdVar.getClass();
        this.zzm = zzakdVar;
        this.zzb |= 256;
    }

    final /* synthetic */ void zzg(zzamu zzamuVar) {
        zzamuVar.getClass();
        this.zzx = zzamuVar;
        this.zzb |= 524288;
    }

    final /* synthetic */ void zzh(zzamx zzamxVar) {
        zzamxVar.getClass();
        this.zzy = zzamxVar;
        this.zzb |= 1048576;
    }

    final /* synthetic */ void zzi(zzalf zzalfVar) {
        zzalfVar.getClass();
        this.zzz = zzalfVar;
        this.zzb |= 2097152;
    }
}
