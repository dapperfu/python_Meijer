package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzauu extends zzbae implements zzbbm {
    private static final zzauu zzh;
    private static volatile zzbbt zzi;
    private String zzb = "";
    private int zze;
    private int zzf;
    private boolean zzg;

    public static zzauu zzc() {
        return zzh;
    }

    final /* synthetic */ void zzd(String str) {
        this.zzb = str;
    }

    final /* synthetic */ void zze(int i10) {
        this.zze = i10;
    }

    final /* synthetic */ void zzf(int i10) {
        this.zzf = i10;
    }

    final /* synthetic */ void zzg(boolean z10) {
        this.zzg = true;
    }

    static {
        zzauu zzauuVar = new zzauu();
        zzh = zzauuVar;
        zzbae.zzbn(zzauu.class, zzauuVar);
    }

    public static zzaut zza() {
        return (zzaut) zzh.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzauu();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaut(bArr);
        }
        if (i11 == 5) {
            return zzh;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzi;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzauu.class) {
            try {
                zzazzVar = zzi;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzh);
                    zzi = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzauu() {
    }
}
