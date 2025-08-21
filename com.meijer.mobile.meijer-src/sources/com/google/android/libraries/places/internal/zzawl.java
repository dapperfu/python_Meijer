package com.google.android.libraries.places.internal;

import java.util.List;

/* loaded from: classes6.dex */
public final class zzawl extends zzbae implements zzbbm {
    private static final zzawl zzl;
    private static volatile zzbbt zzm;
    private int zzb;
    private boolean zze;
    private int zzh;
    private zzbck zzj;
    private zzbck zzk;
    private zzbao zzf = zzbae.zzbu();
    private zzbao zzg = zzbae.zzbu();
    private zzbao zzi = zzbae.zzbu();

    public static zzawl zzl() {
        return zzl;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zzc() {
        return this.zze;
    }

    public final List zzd() {
        return this.zzf;
    }

    public final List zze() {
        return this.zzg;
    }

    public final zzawi zzf() {
        zzawi zzawiVar;
        switch (this.zzh) {
            case 0:
                zzawiVar = zzawi.SECONDARY_HOURS_TYPE_UNSPECIFIED;
                break;
            case 1:
                zzawiVar = zzawi.DRIVE_THROUGH;
                break;
            case 2:
                zzawiVar = zzawi.HAPPY_HOUR;
                break;
            case 3:
                zzawiVar = zzawi.DELIVERY;
                break;
            case 4:
                zzawiVar = zzawi.TAKEOUT;
                break;
            case 5:
                zzawiVar = zzawi.KITCHEN;
                break;
            case 6:
                zzawiVar = zzawi.BREAKFAST;
                break;
            case 7:
                zzawiVar = zzawi.LUNCH;
                break;
            case 8:
                zzawiVar = zzawi.DINNER;
                break;
            case 9:
                zzawiVar = zzawi.BRUNCH;
                break;
            case 10:
                zzawiVar = zzawi.PICKUP;
                break;
            case 11:
                zzawiVar = zzawi.ACCESS;
                break;
            case 12:
                zzawiVar = zzawi.SENIOR_HOURS;
                break;
            case 13:
                zzawiVar = zzawi.ONLINE_SERVICE_HOURS;
                break;
            default:
                zzawiVar = null;
                break;
        }
        return zzawiVar == null ? zzawi.UNRECOGNIZED : zzawiVar;
    }

    public final List zzg() {
        return this.zzi;
    }

    public final boolean zzh() {
        return (this.zzb & 2) != 0;
    }

    public final boolean zzj() {
        return (this.zzb & 4) != 0;
    }

    static {
        zzawl zzawlVar = new zzawl();
        zzl = zzawlVar;
        zzbae.zzbn(zzawl.class, zzawlVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzl, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဇ\u0000\u0002\u001b\u0003Ț\u0004\f\u0005\u001b\u0006ဉ\u0001\u0007ဉ\u0002", new Object[]{"zzb", "zze", "zzf", zzawh.class, "zzg", "zzh", "zzi", zzawk.class, "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzawl();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzawd(bArr);
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
        synchronized (zzawl.class) {
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

    public final zzbck zzi() {
        zzbck zzbckVar = this.zzj;
        return zzbckVar == null ? zzbck.zzg() : zzbckVar;
    }

    public final zzbck zzk() {
        zzbck zzbckVar = this.zzk;
        return zzbckVar == null ? zzbck.zzg() : zzbckVar;
    }

    private zzawl() {
    }
}
