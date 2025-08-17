package com.google.android.libraries.places.internal;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzaww extends zzbae implements zzbbm {
    private static final zzaww zzaH;
    private static volatile zzbbt zzaI;
    private zzbem zzA;
    private int zzD;
    private int zzE;
    private int zzG;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private zzawl zzV;
    private zzbeg zzY;
    private boolean zzZ;
    private zzass zzaA;
    private zzawa zzaB;
    private zzaxe zzaC;
    private zzawt zzaD;
    private zzavw zzaE;
    private zzawc zzaF;
    private zzavs zzaG;
    private boolean zzaa;
    private boolean zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private boolean zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private zzawp zzal;
    private zzawn zzam;
    private zzave zzao;
    private boolean zzap;
    private boolean zzaq;
    private boolean zzar;
    private boolean zzas;
    private boolean zzat;
    private zzaus zzau;
    private zzaum zzav;
    private zzavy zzaw;
    private zzavi zzax;
    private boolean zzaz;
    private int zzb;
    private int zze;
    private zzbeg zzh;
    private zzbeg zzk;
    private zzbek zzp;
    private zzawr zzr;
    private zzbee zzs;
    private zzaqo zzt;
    private double zzu;
    private zzawl zzy;
    private int zzz;
    private String zzf = "";
    private String zzg = "";
    private zzbao zzi = zzbae.zzbu();
    private String zzj = "";
    private String zzl = "";
    private String zzm = "";
    private String zzn = "";
    private String zzo = "";
    private zzbao zzq = zzbae.zzbu();
    private String zzv = "";
    private String zzw = "";
    private zzbao zzx = zzbae.zzbu();
    private zzbao zzB = zzbae.zzbu();
    private String zzC = "";
    private zzbao zzF = zzbae.zzbu();
    private String zzH = "";
    private String zzI = "";
    private zzbao zzW = zzbae.zzbu();
    private zzbao zzX = zzbae.zzbu();
    private zzbao zzan = zzbae.zzbu();
    private zzbao zzay = zzbae.zzbu();

    public static zzaww zzaW() {
        return zzaH;
    }

    public final boolean zzA() {
        return (this.zzb & 128) != 0;
    }

    public final int zzB() {
        return this.zzz;
    }

    public final List zzC() {
        return this.zzB;
    }

    public final String zzD() {
        return this.zzC;
    }

    public final zzavm zzE() {
        int i10 = this.zzD;
        zzavm zzavmVar = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? null : zzavm.FUTURE_OPENING : zzavm.CLOSED_PERMANENTLY : zzavm.CLOSED_TEMPORARILY : zzavm.OPERATIONAL : zzavm.BUSINESS_STATUS_UNSPECIFIED;
        return zzavmVar == null ? zzavm.UNRECOGNIZED : zzavmVar;
    }

    public final zzaxc zzF() {
        int i10 = this.zzE;
        zzaxc zzaxcVar = i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? null : zzaxc.PRICE_LEVEL_VERY_EXPENSIVE : zzaxc.PRICE_LEVEL_EXPENSIVE : zzaxc.PRICE_LEVEL_MODERATE : zzaxc.PRICE_LEVEL_INEXPENSIVE : zzaxc.PRICE_LEVEL_FREE : zzaxc.PRICE_LEVEL_UNSPECIFIED;
        return zzaxcVar == null ? zzaxc.UNRECOGNIZED : zzaxcVar;
    }

    public final List zzG() {
        return this.zzF;
    }

    public final boolean zzH() {
        return (this.zzb & 512) != 0;
    }

    public final int zzI() {
        return this.zzG;
    }

    public final String zzJ() {
        return this.zzH;
    }

    public final String zzK() {
        return this.zzI;
    }

    public final boolean zzL() {
        return (this.zzb & 1024) != 0;
    }

    public final boolean zzM() {
        return this.zzJ;
    }

    public final boolean zzN() {
        return (this.zzb & RecyclerView.m.FLAG_MOVED) != 0;
    }

    public final boolean zzO() {
        return this.zzK;
    }

    public final boolean zzP() {
        return (this.zzb & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0;
    }

    public final boolean zzQ() {
        return this.zzL;
    }

    public final boolean zzR() {
        return (this.zzb & 8192) != 0;
    }

    public final boolean zzS() {
        return this.zzM;
    }

    public final boolean zzT() {
        return (this.zzb & 16384) != 0;
    }

    public final boolean zzU() {
        return this.zzN;
    }

    public final boolean zzV() {
        return (this.zzb & 32768) != 0;
    }

    public final boolean zzW() {
        return this.zzO;
    }

    public final boolean zzX() {
        return (this.zzb & 65536) != 0;
    }

    public final boolean zzY() {
        return this.zzP;
    }

    public final boolean zzZ() {
        return (this.zzb & 131072) != 0;
    }

    public final String zza() {
        return this.zzf;
    }

    public final boolean zzaA() {
        return this.zzae;
    }

    public final boolean zzaB() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    public final boolean zzaC() {
        return this.zzag;
    }

    public final boolean zzaD() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzaE() {
        return this.zzah;
    }

    public final boolean zzaF() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzaG() {
        return this.zzai;
    }

    public final boolean zzaH() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzaI() {
        return this.zzaj;
    }

    public final boolean zzaJ() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzaK() {
        return this.zzak;
    }

    public final List zzaN() {
        return this.zzan;
    }

    public final boolean zzaP() {
        return (this.zze & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0;
    }

    public final boolean zzaR() {
        return (this.zze & 8192) != 0;
    }

    public final boolean zzaT() {
        return (this.zze & 65536) != 0;
    }

    public final boolean zzaU() {
        return this.zzaz;
    }

    public final boolean zzaa() {
        return this.zzQ;
    }

    public final boolean zzab() {
        return (this.zzb & 262144) != 0;
    }

    public final boolean zzac() {
        return this.zzR;
    }

    public final boolean zzad() {
        return (this.zzb & 524288) != 0;
    }

    public final boolean zzae() {
        return this.zzS;
    }

    public final boolean zzaf() {
        return (this.zzb & 1048576) != 0;
    }

    public final boolean zzag() {
        return this.zzT;
    }

    public final boolean zzah() {
        return (this.zzb & 2097152) != 0;
    }

    public final boolean zzai() {
        return this.zzU;
    }

    public final boolean zzaj() {
        return (this.zzb & 4194304) != 0;
    }

    public final List zzal() {
        return this.zzW;
    }

    public final List zzam() {
        return this.zzX;
    }

    public final boolean zzan() {
        return (this.zzb & 8388608) != 0;
    }

    public final boolean zzap() {
        return (this.zzb & 16777216) != 0;
    }

    public final boolean zzaq() {
        return this.zzZ;
    }

    public final boolean zzar() {
        return (this.zzb & 33554432) != 0;
    }

    public final boolean zzas() {
        return this.zzaa;
    }

    public final boolean zzat() {
        return (this.zzb & 67108864) != 0;
    }

    public final boolean zzau() {
        return this.zzab;
    }

    public final boolean zzav() {
        return (this.zzb & 134217728) != 0;
    }

    public final boolean zzaw() {
        return this.zzac;
    }

    public final boolean zzax() {
        return (this.zzb & 268435456) != 0;
    }

    public final boolean zzay() {
        return this.zzad;
    }

    public final boolean zzaz() {
        return (this.zzb & 536870912) != 0;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final boolean zzd() {
        return (this.zzb & 1) != 0;
    }

    public final List zzf() {
        return this.zzi;
    }

    public final String zzg() {
        return this.zzj;
    }

    public final boolean zzh() {
        return (this.zzb & 2) != 0;
    }

    public final String zzj() {
        return this.zzl;
    }

    public final String zzk() {
        return this.zzm;
    }

    public final String zzl() {
        return this.zzn;
    }

    public final String zzm() {
        return this.zzo;
    }

    public final List zzn() {
        return this.zzq;
    }

    public final boolean zzo() {
        return (this.zzb & 8) != 0;
    }

    public final boolean zzq() {
        return (this.zzb & 16) != 0;
    }

    public final boolean zzs() {
        return (this.zzb & 32) != 0;
    }

    public final double zzu() {
        return this.zzu;
    }

    public final String zzv() {
        return this.zzv;
    }

    public final String zzw() {
        return this.zzw;
    }

    public final List zzx() {
        return this.zzx;
    }

    public final boolean zzy() {
        return (this.zzb & 64) != 0;
    }

    static {
        zzaww zzawwVar = new zzaww();
        zzaH = zzawwVar;
        zzbae.zzbn(zzaww.class, zzawwVar);
    }

    public final zzawp zzaL() {
        zzawp zzawpVar = this.zzal;
        return zzawpVar == null ? zzawp.zzj() : zzawpVar;
    }

    public final zzawn zzaM() {
        zzawn zzawnVar = this.zzam;
        return zzawnVar == null ? zzawn.zzp() : zzawnVar;
    }

    public final zzave zzaO() {
        zzave zzaveVar = this.zzao;
        return zzaveVar == null ? zzave.zzj() : zzaveVar;
    }

    public final zzaus zzaQ() {
        zzaus zzausVar = this.zzau;
        return zzausVar == null ? zzaus.zzc() : zzausVar;
    }

    public final zzaum zzaS() {
        zzaum zzaumVar = this.zzav;
        return zzaumVar == null ? zzaum.zzd() : zzaumVar;
    }

    public final zzaxe zzaV() {
        zzaxe zzaxeVar = this.zzaC;
        return zzaxeVar == null ? zzaxe.zzf() : zzaxeVar;
    }

    public final zzawl zzak() {
        zzawl zzawlVar = this.zzV;
        return zzawlVar == null ? zzawl.zzl() : zzawlVar;
    }

    public final zzbeg zzao() {
        zzbeg zzbegVar = this.zzY;
        return zzbegVar == null ? zzbeg.zzf() : zzbegVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzaH, "\u0000P\u0000\u0002\u0001\\P\u0000\t\u0000\u0001Ȉ\u0002Ȉ\u0005Ț\u0007Ȉ\bȈ\tȈ\n\u001b\u000bဉ\u0003\fဉ\u0004\rဉ\u0005\u000e\u0000\u000fȈ\u0010Ȉ\u0015ဉ\u0006\u0016င\u0007\u0018Ȉ\u0019\f\u001a\f\u001b\u001b\u001cင\t\u001dȈ\u001eȈ\u001fဉ\u0000 ဉ\u0001!ဇ\n\"ဇ\u000b#ဇ\f$ဇ\r&ဇ\u000e'ဇ\u000f(ဇ\u0010)ဇ\u0011*ဇ\u0012+ဇ\u0013,ဇ\u0014-ဇ\u0015.ဉ\u0016/\u001b1\u001b2Ȉ3Ȉ4ဉ\u00175\u001b6\u001b7ဇ\u00188ဇ\u00199ဇ\u001a:ဇ\u001b;ဇ\u001c<ဇ\u001d=ဇ\u001e>ဇ\u001f?ဇ @ဇ!Aဇ\"Bဇ#Cဉ$Fဉ%G\u001bHဉ&Iဇ'Jဇ(Kဇ)Lဇ*Mဇ+Nဉ,Oဉ-Pဉ.Qဉ/R\u001bSဇ0Tဉ1Uဉ2Vဉ3Wဉ4Xဉ\bYဉ5Zဉ\u0002[ဉ6\\ဉ7", new Object[]{"zzb", "zze", "zzf", "zzg", "zzi", "zzl", "zzm", "zzn", "zzq", zzavg.class, "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzy", "zzz", "zzC", "zzD", "zzE", "zzF", zzavk.class, "zzG", "zzH", "zzI", "zzh", "zzk", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", zzawl.class, "zzX", zzawl.class, "zzj", "zzo", "zzY", "zzx", zzaxi.class, "zzB", zzava.class, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", zzawv.class, "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", zzavu.class, "zzaz", "zzaA", "zzaB", "zzaC", "zzaD", "zzA", "zzaE", "zzp", "zzaF", "zzaG"});
        }
        if (i11 == 3) {
            return new zzaww();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzavl(bArr);
        }
        if (i11 == 5) {
            return zzaH;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzaI;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaww.class) {
            try {
                zzazzVar = zzaI;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzaH);
                    zzaI = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    public final zzbeg zze() {
        zzbeg zzbegVar = this.zzh;
        return zzbegVar == null ? zzbeg.zzf() : zzbegVar;
    }

    public final zzbeg zzi() {
        zzbeg zzbegVar = this.zzk;
        return zzbegVar == null ? zzbeg.zzf() : zzbegVar;
    }

    public final zzawr zzp() {
        zzawr zzawrVar = this.zzr;
        return zzawrVar == null ? zzawr.zzd() : zzawrVar;
    }

    public final zzbee zzr() {
        zzbee zzbeeVar = this.zzs;
        return zzbeeVar == null ? zzbee.zzg() : zzbeeVar;
    }

    public final zzaqo zzt() {
        zzaqo zzaqoVar = this.zzt;
        return zzaqoVar == null ? zzaqo.zze() : zzaqoVar;
    }

    public final zzawl zzz() {
        zzawl zzawlVar = this.zzy;
        return zzawlVar == null ? zzawl.zzl() : zzawlVar;
    }

    private zzaww() {
    }
}
