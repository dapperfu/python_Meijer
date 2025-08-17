package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzakz extends zzbae implements zzbbm {
    private static final zzakz zzU;
    private static volatile zzbbt zzV;
    private zzaif zzA;
    private zzany zzB;
    private boolean zzC;
    private zzaip zzE;
    private boolean zzF;
    private int zzH;
    private int zzK;
    private int zzM;
    private int zzN;
    private zzbdw zzO;
    private zzahl zzP;
    private boolean zzQ;
    private zzajc zzR;
    private zzajx zzS;
    private int zzb;
    private int zze;
    private int zzf;
    private zzuq zzh;
    private zzzw zzi;
    private int zzj;
    private float zzk;
    private zzamj zzm;
    private zzais zzo;
    private zzajj zzp;
    private zzamb zzq;
    private zzalm zzr;
    private zzalu zzs;
    private zzalq zzt;
    private zzamg zzu;
    private zzakm zzv;
    private zzalb zzw;
    private zzalw zzx;
    private zzakp zzy;
    private zzajm zzz;
    private byte zzT = 2;
    private int zzg = 1;
    private zzbao zzl = zzbae.zzbu();
    private zzbao zzn = zzbae.zzbu();
    private String zzD = "";
    private String zzG = "";
    private String zzI = "";
    private String zzJ = "";
    private String zzL = "";

    final /* synthetic */ void zzi(boolean z10) {
        this.zzb |= 16777216;
        this.zzF = z10;
    }

    final /* synthetic */ void zzk(String str) {
        this.zzb |= 134217728;
        this.zzI = "4.4.1";
    }

    final /* synthetic */ void zzo(boolean z10) {
        this.zze |= 8;
        this.zzQ = z10;
    }

    final /* synthetic */ void zzs(int i10) {
        this.zzg = i10;
        this.zzb |= 2;
    }

    final /* synthetic */ void zzt(int i10) {
        this.zzK = i10 - 1;
        this.zzb |= 536870912;
    }

    final /* synthetic */ void zzu(int i10) {
        this.zzM = i10 - 1;
        this.zzb |= Integer.MIN_VALUE;
    }

    final /* synthetic */ void zzv(int i10) {
        this.zzN = i10 - 1;
        this.zze |= 1;
    }

    static {
        zzakz zzakzVar = new zzakz();
        zzU = zzakzVar;
        zzbae.zzbn(zzakz.class, zzakzVar);
    }

    public static zzaks zza() {
        return (zzaks) zzU.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzT);
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzU, "\u0001(\u0000\u0002\u0001((\u0000\u0002\u0003\u0001᠌\u0001\u0002ဉ\u0002\u0003ᐉ\u0003\u0004\u001b\u0005ᐉ\u0006\u0006\u001b\u0007ဉ\u0007\bᐉ\b\t᠌\u0004\nခ\u0005\u000bဇ\u0015\fဉ\t\rဈ\u0016\u000eဉ\n\u000fဉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012ဉ\u000e\u0013ဉ\u000f\u0014ဉ\u0010\u0015ဉ\u0011\u0016ဉ\u0012\u0017ဉ\u0013\u0018ဉ\u0017\u0019င\u0000\u001aဉ\u0014\u001bဇ\u0018\u001cဈ\u0019\u001d᠌\u001a\u001eဈ\u001b\u001fဈ\u001c ᠌\u001d!ဈ\u001e\"᠌\u001f#᠌ $ဉ!%ဉ\"&ဇ#'ဉ$(ဉ%", new Object[]{"zzb", "zze", "zzg", zzaku.zza, "zzh", "zzi", "zzl", zzaoo.class, "zzm", "zzn", zzais.class, "zzo", "zzp", "zzj", zzakt.zza, "zzk", "zzC", "zzq", "zzD", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzE", "zzf", "zzB", "zzF", "zzG", "zzH", zzakv.zza, "zzI", "zzJ", "zzK", zzaky.zza, "zzL", "zzM", zzakx.zza, "zzN", zzakw.zza, "zzO", "zzP", "zzQ", "zzR", "zzS"});
        }
        if (i11 == 3) {
            return new zzakz();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaks(bArr);
        }
        if (i11 == 5) {
            return zzU;
        }
        if (i11 != 6) {
            this.zzT = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzV;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzakz.class) {
            try {
                zzazzVar = zzV;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzU);
                    zzV = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzakz() {
    }

    final /* synthetic */ void zzc(zzuq zzuqVar) {
        zzuqVar.getClass();
        this.zzh = zzuqVar;
        this.zzb |= 4;
    }

    final /* synthetic */ void zzd(zzamj zzamjVar) {
        zzamjVar.getClass();
        this.zzm = zzamjVar;
        this.zzb |= 64;
    }

    final /* synthetic */ void zze(zzamb zzambVar) {
        zzambVar.getClass();
        this.zzq = zzambVar;
        this.zzb |= 512;
    }

    final /* synthetic */ void zzf(zzalm zzalmVar) {
        zzalmVar.getClass();
        this.zzr = zzalmVar;
        this.zzb |= 1024;
    }

    final /* synthetic */ void zzg(zzakm zzakmVar) {
        zzakmVar.getClass();
        this.zzv = zzakmVar;
        this.zzb |= 16384;
    }

    final /* synthetic */ void zzh(zzaip zzaipVar) {
        zzaipVar.getClass();
        this.zzE = zzaipVar;
        this.zzb |= 8388608;
    }

    final /* synthetic */ void zzj(String str) {
        str.getClass();
        this.zzb |= 33554432;
        this.zzG = str;
    }

    final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zzb |= 1073741824;
        this.zzL = str;
    }

    final /* synthetic */ void zzm(zzbdw zzbdwVar) {
        zzbdwVar.getClass();
        this.zzO = zzbdwVar;
        this.zze |= 2;
    }

    final /* synthetic */ void zzn(zzahl zzahlVar) {
        zzahlVar.getClass();
        this.zzP = zzahlVar;
        this.zze |= 4;
    }

    final /* synthetic */ void zzp(zzajc zzajcVar) {
        zzajcVar.getClass();
        this.zzR = zzajcVar;
        this.zze |= 16;
    }

    final /* synthetic */ void zzq(zzajx zzajxVar) {
        zzajxVar.getClass();
        this.zzS = zzajxVar;
        this.zze |= 32;
    }
}
