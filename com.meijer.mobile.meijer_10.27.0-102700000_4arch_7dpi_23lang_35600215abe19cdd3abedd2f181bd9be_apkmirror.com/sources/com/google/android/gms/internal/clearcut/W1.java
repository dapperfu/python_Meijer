package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10293f0;

/* loaded from: classes6.dex */
public final class W1 extends AbstractC10293f0<W1, a> implements L0 {
    private static volatile T0<W1> zzbg;
    private static final W1 zztx;
    private int zzbb;
    private int zztu;
    private String zztv = "";
    private String zztw = "";

    public static final class a extends AbstractC10293f0.a<W1, a> implements L0 {
        private a() {
            super(W1.zztx);
        }

        /* synthetic */ a(Z1 z12) {
            this();
        }
    }

    static {
        W1 w12 = new W1();
        zztx = w12;
        AbstractC10293f0.m(W1.class, w12);
    }

    private W1() {
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [com.google.android.gms.internal.clearcut.T0<com.google.android.gms.internal.clearcut.W1>, com.google.android.gms.internal.clearcut.f0$b] */
    @Override // com.google.android.gms.internal.clearcut.AbstractC10293f0
    protected final Object f(int i10, Object obj, Object obj2) {
        T0<W1> t02;
        Z1 z12 = null;
        switch (Z1.f81318a[i10 - 1]) {
            case 1:
                return new W1();
            case 2:
                return new a(z12);
            case 3:
                return AbstractC10293f0.g(zztx, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\b\u0002", new Object[]{"zzbb", "zztu", "zztv", "zztw"});
            case 4:
                return zztx;
            case 5:
                T0<W1> t03 = zzbg;
                if (t03 != null) {
                    return t03;
                }
                synchronized (W1.class) {
                    try {
                        T0<W1> t04 = zzbg;
                        t02 = t04;
                        if (t04 == null) {
                            ?? bVar = new AbstractC10293f0.b(zztx);
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
