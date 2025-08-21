package com.google.android.libraries.places.internal;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class zzakm extends zzbae implements zzbbm {
    private static final zzakm zzx;
    private static volatile zzbbt zzy;
    private int zzb;
    private int zze;
    private int zzf = 1;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private zzakh zzv;
    private int zzw;

    final /* synthetic */ void zzc(boolean z10) {
        this.zzb |= 4;
        this.zzg = z10;
    }

    final /* synthetic */ void zzd(boolean z10) {
        this.zzb |= 8;
        this.zzh = z10;
    }

    final /* synthetic */ void zze(boolean z10) {
        this.zzb |= 16;
        this.zzi = z10;
    }

    final /* synthetic */ void zzf(int i10) {
        this.zzb |= 32;
        this.zzj = i10;
    }

    final /* synthetic */ void zzg(int i10) {
        this.zzb |= 64;
        this.zzk = i10;
    }

    final /* synthetic */ void zzh(int i10) {
        this.zzb |= 128;
        this.zzl = i10;
    }

    final /* synthetic */ void zzi(int i10) {
        this.zzb |= 256;
        this.zzm = i10;
    }

    final /* synthetic */ void zzj(int i10) {
        this.zzb |= 512;
        this.zzn = i10;
    }

    final /* synthetic */ void zzk(int i10) {
        this.zzb |= 1024;
        this.zzo = i10;
    }

    final /* synthetic */ void zzl(int i10) {
        this.zzb |= RecyclerView.m.FLAG_MOVED;
        this.zzp = i10;
    }

    final /* synthetic */ void zzm(boolean z10) {
        this.zzb |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        this.zzq = z10;
    }

    final /* synthetic */ void zzn(int i10) {
        this.zzb |= 8192;
        this.zzr = i10;
    }

    final /* synthetic */ void zzp(int i10) {
        this.zzb |= 262144;
        this.zzw = i10;
    }

    final /* synthetic */ void zzr(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzs(int i10) {
        this.zzf = i10;
        this.zzb |= 2;
    }

    final /* synthetic */ void zzt(int i10) {
        this.zzu = i10 - 1;
        this.zzb |= 65536;
    }

    static {
        zzakm zzakmVar = new zzakm();
        zzx = zzakmVar;
        zzbae.zzbn(zzakm.class, zzakmVar);
    }

    public static zzaki zza() {
        return (zzaki) zzx.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzx, "\u0001\u0013\u0000\u0001\u0001\u0014\u0013\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\nဋ\t\u000bဋ\n\fဋ\u000b\rဇ\f\u000eဋ\r\u000fဋ\b\u0010ဋ\u000e\u0011᠌\u000f\u0012᠌\u0010\u0013ဉ\u0011\u0014င\u0012", new Object[]{"zzb", "zze", zzakl.zza, "zzf", zzake.zza, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzm", "zzs", "zzt", zzakj.zza, "zzu", zzakk.zza, "zzv", "zzw"});
        }
        if (i11 == 3) {
            return new zzakm();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaki(bArr);
        }
        if (i11 == 5) {
            return zzx;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzy;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzakm.class) {
            try {
                zzazzVar = zzy;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzx);
                    zzy = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzakm() {
    }

    final /* synthetic */ void zzo(zzakh zzakhVar) {
        zzakhVar.getClass();
        this.zzv = zzakhVar;
        this.zzb |= 131072;
    }
}
