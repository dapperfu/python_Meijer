package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzaur extends zzbae implements zzbbm {
    private static final zzaur zzh;
    private static volatile zzbbt zzi;
    private int zzb;
    private int zze;
    private zzbei zzf;
    private zzbck zzg;

    public final zzauq zza() {
        zzauq zzauqVar;
        switch (this.zze) {
            case 0:
                zzauqVar = zzauq.FUEL_TYPE_UNSPECIFIED;
                break;
            case 1:
                zzauqVar = zzauq.DIESEL;
                break;
            case 2:
                zzauqVar = zzauq.REGULAR_UNLEADED;
                break;
            case 3:
                zzauqVar = zzauq.MIDGRADE;
                break;
            case 4:
                zzauqVar = zzauq.PREMIUM;
                break;
            case 5:
                zzauqVar = zzauq.SP91;
                break;
            case 6:
                zzauqVar = zzauq.SP91_E10;
                break;
            case 7:
                zzauqVar = zzauq.SP92;
                break;
            case 8:
                zzauqVar = zzauq.SP95;
                break;
            case 9:
                zzauqVar = zzauq.SP95_E10;
                break;
            case 10:
                zzauqVar = zzauq.SP98;
                break;
            case 11:
                zzauqVar = zzauq.SP99;
                break;
            case 12:
                zzauqVar = zzauq.SP100;
                break;
            case 13:
                zzauqVar = zzauq.LPG;
                break;
            case 14:
                zzauqVar = zzauq.E80;
                break;
            case 15:
                zzauqVar = zzauq.E85;
                break;
            case 16:
                zzauqVar = zzauq.METHANE;
                break;
            case 17:
                zzauqVar = zzauq.BIO_DIESEL;
                break;
            case 18:
                zzauqVar = zzauq.TRUCK_DIESEL;
                break;
            case 19:
                zzauqVar = zzauq.DIESEL_PLUS;
                break;
            case 20:
                zzauqVar = zzauq.E100;
                break;
            default:
                zzauqVar = null;
                break;
        }
        return zzauqVar == null ? zzauq.UNRECOGNIZED : zzauqVar;
    }

    static {
        zzaur zzaurVar = new zzaur();
        zzh = zzaurVar;
        zzbae.zzbn(zzaur.class, zzaurVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbae
    protected final Object zzb(int i10, Object obj, Object obj2) {
        zzbbt zzazzVar;
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzbae.zzbo(zzh, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zzaur();
        }
        byte[] bArr = null;
        if (i11 == 4) {
            return new zzaup(bArr);
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
        synchronized (zzaur.class) {
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

    public final zzbei zzc() {
        zzbei zzbeiVar = this.zzf;
        return zzbeiVar == null ? zzbei.zzg() : zzbeiVar;
    }

    public final zzbck zzd() {
        zzbck zzbckVar = this.zzg;
        return zzbckVar == null ? zzbck.zzg() : zzbckVar;
    }

    private zzaur() {
    }
}
