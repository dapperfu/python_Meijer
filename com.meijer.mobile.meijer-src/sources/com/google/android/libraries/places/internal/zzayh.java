package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzayh extends zzbae implements zzbbm {
    private static final zzayh zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private zzaxb zze;
    private int zzf;
    private zzazm zzg;
    private zzazm zzh;
    private zzazm zzi;
    private int zzj;

    static {
        zzayh zzayhVar = new zzayh();
        zzk = zzayhVar;
        zzbae.zzbn(zzayh.class, zzayhVar);
    }

    public static zzayg zza() {
        return (zzayg) zzk.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0005င\u0005\u0006ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzh", "zzi", "zzj", "zzg"});
        }
        if (i11 == 3) {
            return new zzayh();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzayg(bArr);
        }
        if (i11 == 5) {
            return zzk;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzl;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzayh.class) {
            try {
                zzazzVar = zzl;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzk);
                    zzl = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzayh() {
    }

    final /* synthetic */ void zzc(zzaxb zzaxbVar) {
        zzaxbVar.getClass();
        this.zze = zzaxbVar;
        this.zzb |= 1;
    }
}
