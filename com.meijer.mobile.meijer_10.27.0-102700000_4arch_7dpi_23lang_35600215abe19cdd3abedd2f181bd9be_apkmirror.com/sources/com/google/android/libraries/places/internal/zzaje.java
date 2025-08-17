package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaje extends zzbae implements zzbbm {
    private static final zzaje zzl;
    private static volatile zzbbt zzm;
    private int zzb;
    private int zze;
    private boolean zzi;
    private int zzk;
    private zzbao zzf = zzbae.zzbu();
    private String zzg = "";
    private String zzh = "";
    private zzbao zzj = zzbae.zzbu();

    final /* synthetic */ void zzd(int i10) {
        this.zzb |= 16;
        this.zzk = i10;
    }

    static {
        zzaje zzajeVar = new zzaje();
        zzl = zzajeVar;
        zzbae.zzbn(zzaje.class, zzajeVar);
    }

    public static zzajd zza() {
        return (zzajd) zzl.zzbj();
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001င\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006\u001a\u0007င\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzaje();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzajd(bArr);
        }
        if (i11 == 5) {
            return zzl;
        }
        if (i11 != 6) {
            throw null;
        }
        zzbbt zzbbtVar = zzm;
        if (zzbbtVar != null) {
            return zzbbtVar;
        }
        synchronized (zzaje.class) {
            try {
                zzazzVar = zzm;
                if (zzazzVar == null) {
                    zzazzVar = new zzazz(zzl);
                    zzm = zzazzVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzazzVar;
    }

    private zzaje() {
    }

    final /* synthetic */ void zzc(String str) {
        str.getClass();
        zzbao zzbaoVar = this.zzf;
        if (!zzbaoVar.zza()) {
            this.zzf = zzbae.zzbv(zzbaoVar);
        }
        this.zzf.add(str);
    }
}
