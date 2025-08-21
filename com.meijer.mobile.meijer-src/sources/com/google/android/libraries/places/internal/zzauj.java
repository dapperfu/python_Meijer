package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzauj extends zzbae implements zzbbm {
    private static final zzauj zzk;
    private static volatile zzbbt zzl;
    private int zzb;
    private int zze;
    private double zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zzbck zzj;

    public final zzaun zza() {
        zzaun zzaunVar;
        switch (this.zze) {
            case 0:
                zzaunVar = zzaun.EV_CONNECTOR_TYPE_UNSPECIFIED;
                break;
            case 1:
                zzaunVar = zzaun.EV_CONNECTOR_TYPE_OTHER;
                break;
            case 2:
                zzaunVar = zzaun.EV_CONNECTOR_TYPE_J1772;
                break;
            case 3:
                zzaunVar = zzaun.EV_CONNECTOR_TYPE_TYPE_2;
                break;
            case 4:
                zzaunVar = zzaun.EV_CONNECTOR_TYPE_CHADEMO;
                break;
            case 5:
                zzaunVar = zzaun.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                break;
            case 6:
                zzaunVar = zzaun.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                break;
            case 7:
                zzaunVar = zzaun.EV_CONNECTOR_TYPE_TESLA;
                break;
            case 8:
                zzaunVar = zzaun.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                break;
            case 9:
                zzaunVar = zzaun.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                break;
            case 10:
                zzaunVar = zzaun.EV_CONNECTOR_TYPE_NACS;
                break;
            default:
                zzaunVar = null;
                break;
        }
        return zzaunVar == null ? zzaun.UNRECOGNIZED : zzaunVar;
    }

    public final double zzc() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final boolean zze() {
        return (this.zzb & 1) != 0;
    }

    public final int zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zzb & 2) != 0;
    }

    public final int zzh() {
        return this.zzi;
    }

    public final boolean zzi() {
        return (this.zzb & 4) != 0;
    }

    static {
        zzauj zzaujVar = new zzauj();
        zzk = zzaujVar;
        zzbae.zzbn(zzauj.class, zzaujVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\u0000\u0003\u0004\u0004င\u0000\u0005င\u0001\u0006ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzauj();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaui(bArr);
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
        synchronized (zzauj.class) {
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

    public final zzbck zzj() {
        zzbck zzbckVar = this.zzj;
        return zzbckVar == null ? zzbck.zzg() : zzbckVar;
    }

    private zzauj() {
    }
}
