package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10418f0;

/* loaded from: classes6.dex */
public final class X1 extends AbstractC10418f0<X1, a> implements L0 {
    private static final X1 zzbfc;
    private static volatile T0<X1> zzbg;
    private int zzbb;
    private int zzbfa = -1;
    private int zzbfb;

    public static final class a extends AbstractC10418f0.a<X1, a> implements L0 {
        private a() {
            super(X1.zzbfc);
        }

        /* synthetic */ a(Z1 z12) {
            this();
        }
    }

    public enum b implements InterfaceC10427i0 {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);


        /* renamed from: w, reason: collision with root package name */
        private static final InterfaceC10430j0<b> f82090w = new a2();

        /* renamed from: a, reason: collision with root package name */
        private final int f82092a;

        b(int i10) {
            this.f82092a = i10;
        }

        public static b a(int i10) {
            if (i10 == 100) {
                return COMBINED;
            }
            switch (i10) {
                case 0:
                    return UNKNOWN_MOBILE_SUBTYPE;
                case 1:
                    return GPRS;
                case 2:
                    return EDGE;
                case 3:
                    return UMTS;
                case 4:
                    return CDMA;
                case 5:
                    return EVDO_0;
                case 6:
                    return EVDO_A;
                case 7:
                    return RTT;
                case 8:
                    return HSDPA;
                case 9:
                    return HSUPA;
                case 10:
                    return HSPA;
                case 11:
                    return IDEN;
                case 12:
                    return EVDO_B;
                case 13:
                    return LTE;
                case 14:
                    return EHRPD;
                case 15:
                    return HSPAP;
                case 16:
                    return GSM;
                case 17:
                    return TD_SCDMA;
                case 18:
                    return IWLAN;
                case 19:
                    return LTE_CA;
                default:
                    return null;
            }
        }

        public static InterfaceC10430j0<b> b() {
            return f82090w;
        }

        @Override // com.google.android.gms.internal.clearcut.InterfaceC10427i0
        public final int zzc() {
            return this.f82092a;
        }
    }

    public enum c implements InterfaceC10427i0 {
        NONE(-1),
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17);


        /* renamed from: u, reason: collision with root package name */
        private static final InterfaceC10430j0<c> f82112u = new b2();

        /* renamed from: a, reason: collision with root package name */
        private final int f82114a;

        c(int i10) {
            this.f82114a = i10;
        }

        public static c a(int i10) {
            switch (i10) {
                case -1:
                    return NONE;
                case 0:
                    return MOBILE;
                case 1:
                    return WIFI;
                case 2:
                    return MOBILE_MMS;
                case 3:
                    return MOBILE_SUPL;
                case 4:
                    return MOBILE_DUN;
                case 5:
                    return MOBILE_HIPRI;
                case 6:
                    return WIMAX;
                case 7:
                    return BLUETOOTH;
                case 8:
                    return DUMMY;
                case 9:
                    return ETHERNET;
                case 10:
                    return MOBILE_FOTA;
                case 11:
                    return MOBILE_IMS;
                case 12:
                    return MOBILE_CBS;
                case 13:
                    return WIFI_P2P;
                case 14:
                    return MOBILE_IA;
                case 15:
                    return MOBILE_EMERGENCY;
                case 16:
                    return PROXY;
                case 17:
                    return VPN;
                default:
                    return null;
            }
        }

        public static InterfaceC10430j0<c> b() {
            return f82112u;
        }

        @Override // com.google.android.gms.internal.clearcut.InterfaceC10427i0
        public final int zzc() {
            return this.f82114a;
        }
    }

    static {
        X1 x12 = new X1();
        zzbfc = x12;
        AbstractC10418f0.m(X1.class, x12);
    }

    private X1() {
    }

    /* JADX WARN: Type inference failed for: r3v13, types: [com.google.android.gms.internal.clearcut.T0<com.google.android.gms.internal.clearcut.X1>, com.google.android.gms.internal.clearcut.f0$b] */
    @Override // com.google.android.gms.internal.clearcut.AbstractC10418f0
    protected final Object f(int i10, Object obj, Object obj2) {
        T0<X1> t02;
        Z1 z12 = null;
        switch (Z1.f82158a[i10 - 1]) {
            case 1:
                return new X1();
            case 2:
                return new a(z12);
            case 3:
                return AbstractC10418f0.g(zzbfc, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001", new Object[]{"zzbb", "zzbfa", c.b(), "zzbfb", b.b()});
            case 4:
                return zzbfc;
            case 5:
                T0<X1> t03 = zzbg;
                if (t03 != null) {
                    return t03;
                }
                synchronized (X1.class) {
                    try {
                        T0<X1> t04 = zzbg;
                        t02 = t04;
                        if (t04 == null) {
                            ?? bVar = new AbstractC10418f0.b(zzbfc);
                            zzbg = bVar;
                            t02 = bVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return t02;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
