package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzadb extends zzbae implements zzbbm {
    private static final zzadb zzn;
    private static volatile zzbbt zzo;
    private int zzb;
    private float zze;
    private float zzf;
    private float zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;

    static {
        zzadb zzadbVar = new zzadb();
        zzn = zzadbVar;
        zzbae.zzbn(zzadb.class, zzadbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004င\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i11 == 3) {
            return new zzadb();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzada(bArr);
        }
        if (i11 == 5) {
            return zzn;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzo;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzadb.class) {
            try {
                zzazzVar = zzo;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzn);
                    zzo = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzadb() {
    }
}
