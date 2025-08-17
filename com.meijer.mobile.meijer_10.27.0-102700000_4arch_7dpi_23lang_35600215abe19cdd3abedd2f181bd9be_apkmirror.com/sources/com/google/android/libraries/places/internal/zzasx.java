package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzasx extends zzbae implements zzbbm {
    private static final zzasx zzf;
    private static volatile zzbbt zzg;
    private int zzb = 0;
    private Object zze;

    static {
        zzasx zzasxVar = new zzasx();
        zzf = zzasxVar;
        zzbae.zzbn(zzasx.class, zzasxVar);
    }

    public static zzasw zza() {
        return (zzasw) zzf.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzf, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzb", zzaqo.class, zzatq.class});
        }
        if (i11 == 3) {
            return new zzasx();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzasw(bArr);
        }
        if (i11 == 5) {
            return zzf;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzg;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzasx.class) {
            try {
                zzazzVar = zzg;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzf);
                    zzg = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzasx() {
    }

    final /* synthetic */ void zzc(zzaqo zzaqoVar) {
        zzaqoVar.getClass();
        this.zze = zzaqoVar;
        this.zzb = 1;
    }

    final /* synthetic */ void zzd(zzatq zzatqVar) {
        zzatqVar.getClass();
        this.zze = zzatqVar;
        this.zzb = 2;
    }
}
