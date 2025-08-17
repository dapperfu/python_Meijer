package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzuk extends zzbae implements zzbbm {
    private static final zzuk zzK;
    private static volatile zzbbt zzL;
    private zzcl zzA;
    private zzbd zzB;
    private zzaeo zzC;
    private zzbu zzD;
    private zzcb zzE;
    private zzaov zzF;
    private zzzl zzG;
    private zzaom zzH;
    private zzaoi zzI;
    private int zzb;
    private zzakz zzf;
    private zzwu zzg;
    private zzaox zzh;
    private zzagr zzi;
    private zzacb zzj;
    private zzbm zzk;
    private zzwp zzl;
    private zzvx zzm;
    private zzzj zzn;
    private zzadx zzo;
    private zzaer zzp;
    private zzaet zzq;
    private zzuy zzr;
    private zzaad zzs;
    private zzd zzt;
    private zzal zzu;
    private zzar zzv;
    private zzcz zzw;
    private zzat zzx;
    private zzay zzy;
    private zzae zzz;
    private byte zzJ = 2;
    private int zze = 1;

    final /* synthetic */ void zze(int i10) {
        this.zze = 1;
        this.zzb = 1 | this.zzb;
    }

    static {
        zzuk zzukVar = new zzuk();
        zzK = zzukVar;
        zzbae.zzbn(zzuk.class, zzukVar);
    }

    public static zzui zza() {
        return (zzui) zzK.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzJ);
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzK, "\u0001\u001f\u0000\u0001\u0001 \u001f\u0000\u0000\u0002\u0001᠌\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000fဉ\r\u0010ဉ\u000e\u0011ဉ\u000f\u0012ဉ\u0010\u0013ဉ\u0011\u0014ဉ\u0012\u0015ဉ\u0013\u0016ဉ\u0014\u0017ဉ\u0015\u0018ဉ\u0016\u0019ဉ\u0017\u001aဉ\u0018\u001bဉ\u0019\u001cဉ\u001a\u001dဉ\u001b\u001eဉ\u001c\u001fဉ\u001d ဉ\u001e", new Object[]{"zzb", "zze", zzuj.zza, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI"});
        }
        if (i11 == 3) {
            return new zzuk();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzui(bArr);
        }
        if (i11 == 5) {
            return zzK;
        }
        if (i11 != 6) {
            this.zzJ = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzbbt zzbbtVar = zzL;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzuk.class) {
            try {
                zzazzVar = zzL;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzK);
                    zzL = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzuk() {
    }

    final /* synthetic */ void zzc(zzakz zzakzVar) {
        zzakzVar.getClass();
        this.zzf = zzakzVar;
        this.zzb |= 2;
    }
}
