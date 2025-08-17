package com.google.android.libraries.places.internal;

import java.util.List;

/* loaded from: classes6.dex */
public final class zzash extends zzbae implements zzbbm {
    private static final zzash zzq;
    private static volatile zzbbt zzr;
    private int zzb;
    private zzbee zzg;
    private int zzh;
    private zzaqo zzi;
    private zzaqo zzj;
    private zzbek zzl;
    private zzasm zzp;
    private String zze = "";
    private String zzf = "";
    private String zzk = "";
    private zzbao zzm = zzbae.zzbu();
    private zzbao zzn = zzbae.zzbu();
    private zzbao zzo = zzbae.zzbu();

    public final String zza() {
        return this.zzf;
    }

    public final List zzc() {
        return this.zzo;
    }

    static {
        zzash zzashVar = new zzash();
        zzq = zzashVar;
        zzbae.zzbn(zzash.class, zzashVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzq, "\u0000\f\u0000\u0001\u0001\r\f\u0000\u0003\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\f\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\bဉ\u0003\t\u001b\u000b\u001b\fȚ\rဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzasf.class, "zzn", zzbeg.class, "zzo", "zzp"});
        }
        if (i11 == 3) {
            return new zzash();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzasg(bArr);
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
        synchronized (zzash.class) {
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

    private zzash() {
    }
}
