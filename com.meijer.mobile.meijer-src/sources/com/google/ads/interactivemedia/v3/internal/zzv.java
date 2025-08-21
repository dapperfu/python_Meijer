package com.google.ads.interactivemedia.v3.internal;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public final class zzv extends zzady implements zzafc {
    private static final zzv zzb;
    private int zzd;
    private long zzf;
    private long zzj;
    private long zzk;
    private long zzm;
    private int zzq;
    private String zze = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzl = "";
    private String zzn = "";
    private String zzo = "";
    private zzaed zzp = zzady.zzaG();

    static /* synthetic */ void zzd(zzv zzvVar, String str) {
        zzvVar.zzd |= 16;
        zzvVar.zzi = str;
    }

    static /* synthetic */ void zze(zzv zzvVar, String str) {
        zzvVar.zzd |= 1024;
        zzvVar.zzo = str;
    }

    static /* synthetic */ void zzg(zzv zzvVar, long j10) {
        zzvVar.zzd |= 2;
        zzvVar.zzf = j10;
    }

    static /* synthetic */ void zzi(zzv zzvVar, int i10) {
        zzvVar.zzq = i10 - 1;
        zzvVar.zzd |= RecyclerView.m.FLAG_MOVED;
    }

    static {
        zzv zzvVar = new zzv();
        zzb = zzvVar;
        zzady.zzaM(zzv.class, zzvVar);
    }

    public static zzq zza() {
        return (zzq) zzb.zzay();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", zzt.class, "zzq", zzu.zza});
        }
        if (i11 == 3) {
            return new zzv();
        }
        zzp zzpVar = null;
        if (i11 == 4) {
            return new zzq(zzpVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzv() {
    }

    static /* synthetic */ void zzc(zzv zzvVar, String str) {
        str.getClass();
        zzvVar.zzd |= 1;
        zzvVar.zze = str;
    }

    static /* synthetic */ void zzf(zzv zzvVar, String str) {
        str.getClass();
        zzvVar.zzd |= 8;
        zzvVar.zzh = str;
    }

    static /* synthetic */ void zzh(zzv zzvVar, String str) {
        str.getClass();
        zzvVar.zzd |= 4;
        zzvVar.zzg = str;
    }
}
