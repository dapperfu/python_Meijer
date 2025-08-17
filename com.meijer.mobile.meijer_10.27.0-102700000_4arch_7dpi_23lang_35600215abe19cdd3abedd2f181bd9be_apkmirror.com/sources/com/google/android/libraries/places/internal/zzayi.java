package com.google.android.libraries.places.internal;

import java.util.Iterator;

/* loaded from: classes6.dex */
public final class zzayi extends zzbae implements zzbbm {
    private static final zzayi zzw;
    private static volatile zzbbt zzx;
    private int zzb;
    private int zzh;
    private boolean zzj;
    private double zzk;
    private int zzl;
    private int zzm;
    private boolean zzp;
    private zzayd zzq;
    private zzayf zzr;
    private zzayb zzs;
    private zzaxm zzt;
    private zzayh zzu;
    private boolean zzv;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";
    private String zzn = "";
    private zzbam zzo = zzbae.zzbr();

    public static zzayi zzc() {
        return zzw;
    }

    final /* synthetic */ void zzf(String str) {
        this.zzg = str;
    }

    final /* synthetic */ void zzg(String str) {
        this.zzi = str;
    }

    final /* synthetic */ void zzh(boolean z10) {
        this.zzj = z10;
    }

    final /* synthetic */ void zzi(double d10) {
        this.zzk = d10;
    }

    final /* synthetic */ void zzj(int i10) {
        this.zzl = i10;
    }

    final /* synthetic */ void zzl(boolean z10) {
        this.zzp = z10;
    }

    final /* synthetic */ void zzr(boolean z10) {
        this.zzv = true;
    }

    final /* synthetic */ void zzt(int i10) {
        this.zzh = i10 - 2;
    }

    static {
        zzayi zzayiVar = new zzayi();
        zzw = zzayiVar;
        zzbae.zzbn(zzayi.class, zzayiVar);
    }

    public static zzaxz zza() {
        return (zzaxz) zzw.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzw, "\u0000\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007\u0007\t\u0000\n\u0004\u000b,\f\u0007\rဉ\u0000\u000eဉ\u0001\u000fဉ\u0002\u0010ဉ\u0003\u0011ဉ\u0004\u0012\u0004\u0013Ȉ\u0014\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzm", "zzn", "zzv"});
        }
        if (i11 == 3) {
            return new zzayi();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaxz(bArr);
        }
        if (i11 == 5) {
            return zzw;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzx;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzayi.class) {
            try {
                zzazzVar = zzx;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzw);
                    zzx = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    final /* synthetic */ void zzk(Iterable iterable) {
        zzbam zzbamVar = this.zzo;
        if (!zzbamVar.zza()) {
            this.zzo = zzbae.zzbs(zzbamVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzo.zzh(((zzaxc) it.next()).zza());
        }
    }

    private zzayi() {
    }

    final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zze = str;
    }

    final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zzf = str;
    }

    final /* synthetic */ void zzm(zzayd zzaydVar) {
        zzaydVar.getClass();
        this.zzq = zzaydVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzn(zzayf zzayfVar) {
        zzayfVar.getClass();
        this.zzr = zzayfVar;
        this.zzb |= 2;
    }

    final /* synthetic */ void zzo(zzayb zzaybVar) {
        zzaybVar.getClass();
        this.zzs = zzaybVar;
        this.zzb |= 4;
    }

    final /* synthetic */ void zzp(zzaxm zzaxmVar) {
        zzaxmVar.getClass();
        this.zzt = zzaxmVar;
        this.zzb |= 8;
    }

    final /* synthetic */ void zzq(zzayh zzayhVar) {
        zzayhVar.getClass();
        this.zzu = zzayhVar;
        this.zzb |= 16;
    }
}
