package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzvn extends zzbae implements zzbbm {
    private static final zzvn zzj;
    private static volatile zzbbt zzk;
    private int zzb;
    private zzve zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        zzvn zzvnVar = new zzvn();
        zzj = zzvnVar;
        zzbae.zzbn(zzvn.class, zzvnVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzvn();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzvm(bArr);
        }
        if (i11 == 5) {
            return zzj;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzk;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzvn.class) {
            try {
                zzazzVar = zzk;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzj);
                    zzk = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzvn() {
    }
}
