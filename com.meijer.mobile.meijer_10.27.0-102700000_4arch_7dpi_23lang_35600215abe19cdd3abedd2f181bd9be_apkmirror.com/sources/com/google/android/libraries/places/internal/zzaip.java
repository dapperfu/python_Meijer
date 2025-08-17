package com.google.android.libraries.places.internal;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class zzaip extends zzbae implements zzbbm {
    private static final zzaip zzt;
    private static volatile zzbbt zzu;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zzaid zzj;
    private zzahw zzk;
    private zzahs zzl;
    private zzanl zzm;
    private zzahy zzn;
    private zzaib zzo;
    private zzann zzp;
    private zzanv zzq;
    private zzanr zzr;
    private int zzs;

    final /* synthetic */ void zzc(int i10) {
        this.zzb |= 4;
        this.zzg = i10;
    }

    final /* synthetic */ void zzi(int i10) {
        this.zze = i10 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzj(int i10) {
        this.zzf = i10 - 1;
        this.zzb |= 2;
    }

    static {
        zzaip zzaipVar = new zzaip();
        zzt = zzaipVar;
        zzbae.zzbn(zzaip.class, zzaipVar);
    }

    public static zzaik zza() {
        return (zzaik) zzt.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzt, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000f᠌\u000e", new Object[]{"zzb", "zze", zzaim.zza, "zzf", zzaio.zza, "zzg", "zzh", zzail.zza, "zzi", zzaij.zza, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", zzain.zza});
        }
        if (i11 == 3) {
            return new zzaip();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaik(bArr);
        }
        if (i11 == 5) {
            return zzt;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzu;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaip.class) {
            try {
                zzazzVar = zzu;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzt);
                    zzu = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzaip() {
    }

    final /* synthetic */ void zzd(zzaid zzaidVar) {
        zzaidVar.getClass();
        this.zzj = zzaidVar;
        this.zzb |= 32;
    }

    final /* synthetic */ void zze(zzahs zzahsVar) {
        zzahsVar.getClass();
        this.zzl = zzahsVar;
        this.zzb |= 128;
    }

    final /* synthetic */ void zzf(zzahy zzahyVar) {
        zzahyVar.getClass();
        this.zzn = zzahyVar;
        this.zzb |= 512;
    }

    final /* synthetic */ void zzg(zzanv zzanvVar) {
        zzanvVar.getClass();
        this.zzq = zzanvVar;
        this.zzb |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
    }
}
