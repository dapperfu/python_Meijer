package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzacn extends zzbae implements zzbbm {
    private static final zzacn zzo;
    private static volatile zzbbt zzp;
    private int zzb;
    private long zze;
    private long zzf;
    private zzbao zzg = zzbae.zzbu();
    private zzbao zzh = zzbae.zzbu();
    private zzbao zzi = zzbae.zzbu();
    private zzbao zzj = zzbae.zzbu();
    private zzacw zzk;
    private zzacw zzl;
    private zzacw zzm;
    private zzacw zzn;

    static {
        zzacn zzacnVar = new zzacn();
        zzo = zzacnVar;
        zzbae.zzbn(zzacn.class, zzacnVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzo, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003\u001b\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", zzacp.class, "zzh", zzacp.class, "zzi", zzacp.class, "zzj", zzacp.class, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i11 == 3) {
            return new zzacn();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzacm(bArr);
        }
        if (i11 == 5) {
            return zzo;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzp;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzacn.class) {
            try {
                zzazzVar = zzp;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzo);
                    zzp = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzacn() {
    }
}
