package com.google.android.gms.internal.pal;

/* loaded from: classes6.dex */
public final class E4 extends B0 implements InterfaceC10706h1 {
    private static final E4 zzb;
    private int zze;
    private long zzg;
    private long zzk;
    private long zzl;
    private long zzn;
    private int zzr;
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzm = "";
    private String zzo = "";
    private String zzp = "";
    private I0 zzq = B0.q();

    static /* synthetic */ void v(E4 e42, long j10) {
        e42.zze |= 2;
        e42.zzg = j10;
    }

    static /* synthetic */ void z(E4 e42, String str) {
        e42.zze |= 16;
        e42.zzj = str;
    }

    static {
        E4 e42 = new E4();
        zzb = e42;
        B0.j(E4.class, e42);
    }

    public static D2 t() {
        return (D2) zzb.l();
    }

    @Override // com.google.android.gms.internal.pal.B0
    protected final Object r(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return B0.h(zzb, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", E3.class, "zzr", C10643d4.f83084a});
        }
        if (i11 == 3) {
            return new E4();
        }
        C10587a c10587a = null;
        if (i11 == 4) {
            return new D2(c10587a);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    private E4() {
    }

    static /* synthetic */ void A(E4 e42, String str) {
        str.getClass();
        e42.zze |= 1;
        e42.zzf = str;
    }

    static /* synthetic */ void w(E4 e42, String str) {
        str.getClass();
        e42.zze |= 4;
        e42.zzh = str;
    }

    static /* synthetic */ void y(E4 e42, String str) {
        str.getClass();
        e42.zze |= 8;
        e42.zzi = str;
    }
}
