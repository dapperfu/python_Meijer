package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzahb extends zzady implements zzafc {
    private static final zzahb zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";

    static {
        zzahb zzahbVar = new zzahb();
        zzb = zzahbVar;
        zzady.zzaM(zzahb.class, zzahbVar);
    }

    public static zzaha zzc() {
        return (zzaha) zzb.zzay();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzady
    protected final Object zzm(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzady.zzaJ(zzb, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new zzahb();
        }
        zzagz zzagzVar = null;
        if (i11 == 4) {
            return new zzaha(zzagzVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private zzahb() {
    }

    static /* synthetic */ void zze(zzahb zzahbVar, String str) {
        str.getClass();
        zzahbVar.zzd = str;
    }

    static /* synthetic */ void zzf(zzahb zzahbVar, String str) {
        str.getClass();
        zzahbVar.zze = str;
    }

    static /* synthetic */ void zzg(zzahb zzahbVar, String str) {
        str.getClass();
        zzahbVar.zzf = str;
    }
}
