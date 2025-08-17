package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzata extends zzbae implements zzbbm {
    private static final zzata zzq;
    private static volatile zzbbt zzr;
    private int zzb;
    private zzasx zzf;
    private zzasz zzg;
    private zzbee zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzp;
    private String zze = "";
    private zzbao zzh = zzbae.zzbu();
    private zzbao zzi = zzbae.zzbu();
    private String zzj = "";
    private String zzk = "";
    private String zzo = "";

    public static zzata zzc() {
        return zzq;
    }

    final /* synthetic */ void zzj(String str) {
        this.zzk = str;
    }

    final /* synthetic */ void zzl(int i10) {
        this.zzm = i10;
    }

    final /* synthetic */ void zzn(boolean z10) {
        this.zzp = true;
    }

    static {
        zzata zzataVar = new zzata();
        zzq = zzataVar;
        zzbae.zzbn(zzata.class, zzataVar);
    }

    public static zzasv zza() {
        return (zzasv) zzq.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzq, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ț\u0005Ț\u0006Ȉ\u0007Ȉ\bဉ\u0002\t\u0004\n\u0007\u000bȈ\f\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i11 == 3) {
            return new zzata();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzasv(bArr);
        }
        if (i11 == 5) {
            return zzq;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzr;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzata.class) {
            try {
                zzazzVar = zzr;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzq);
                    zzr = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzata() {
    }

    final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zze = str;
    }

    final /* synthetic */ void zze(zzasx zzasxVar) {
        zzasxVar.getClass();
        this.zzf = zzasxVar;
        this.zzb |= 1;
    }

    final /* synthetic */ void zzf(zzasz zzaszVar) {
        zzaszVar.getClass();
        this.zzg = zzaszVar;
        this.zzb |= 2;
    }

    final /* synthetic */ void zzg(String str) {
        str.getClass();
        zzbao zzbaoVar = this.zzh;
        if (!zzbaoVar.zza()) {
            this.zzh = zzbae.zzbv(zzbaoVar);
        }
        this.zzh.add(str);
    }

    final /* synthetic */ void zzh(String str) {
        str.getClass();
        zzbao zzbaoVar = this.zzi;
        if (!zzbaoVar.zza()) {
            this.zzi = zzbae.zzbv(zzbaoVar);
        }
        this.zzi.add(str);
    }

    final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzj = str;
    }

    final /* synthetic */ void zzk(zzbee zzbeeVar) {
        zzbeeVar.getClass();
        this.zzl = zzbeeVar;
        this.zzb |= 4;
    }

    final /* synthetic */ void zzm(String str) {
        str.getClass();
        this.zzo = str;
    }
}
