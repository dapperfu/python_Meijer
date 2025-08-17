package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10293f0;
import java.util.List;

/* loaded from: classes6.dex */
public final class d2 extends AbstractC10293f0<d2, a> implements L0 {
    private static volatile T0<d2> zzbg;
    private static final d2 zzbir;
    private InterfaceC10308k0<b> zzbiq = AbstractC10293f0.o();

    public static final class a extends AbstractC10293f0.a<d2, a> implements L0 {
        private a() {
            super(d2.zzbir);
        }

        /* synthetic */ a(e2 e2Var) {
            this();
        }
    }

    public static final class b extends AbstractC10293f0<b, a> implements L0 {
        private static volatile T0<b> zzbg;
        private static final b zzbiv;
        private int zzbb;
        private String zzbis = "";
        private long zzbit;
        private long zzbiu;
        private int zzya;

        public static final class a extends AbstractC10293f0.a<b, a> implements L0 {
            private a() {
                super(b.zzbiv);
            }

            public final a n(String str) {
                f();
                ((b) this.f81429b).A(str);
                return this;
            }

            public final a o(long j10) {
                f();
                ((b) this.f81429b).B(j10);
                return this;
            }

            public final a p(long j10) {
                f();
                ((b) this.f81429b).C(j10);
                return this;
            }

            /* synthetic */ a(e2 e2Var) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzbiv = bVar;
            AbstractC10293f0.m(b.class, bVar);
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void A(String str) {
            str.getClass();
            this.zzbb |= 2;
            this.zzbis = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void B(long j10) {
            this.zzbb |= 4;
            this.zzbit = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void C(long j10) {
            this.zzbb |= 8;
            this.zzbiu = j10;
        }

        public static a y() {
            return (a) ((AbstractC10293f0.a) zzbiv.f(AbstractC10293f0.e.f81438e, null, null));
        }

        /* JADX WARN: Type inference failed for: r3v13, types: [com.google.android.gms.internal.clearcut.T0<com.google.android.gms.internal.clearcut.d2$b>, com.google.android.gms.internal.clearcut.f0$b] */
        @Override // com.google.android.gms.internal.clearcut.AbstractC10293f0
        protected final Object f(int i10, Object obj, Object obj2) {
            T0<b> t02;
            e2 e2Var = null;
            switch (e2.f81415a[i10 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(e2Var);
                case 3:
                    return AbstractC10293f0.g(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
                case 4:
                    return zzbiv;
                case 5:
                    T0<b> t03 = zzbg;
                    if (t03 != null) {
                        return t03;
                    }
                    synchronized (b.class) {
                        try {
                            T0<b> t04 = zzbg;
                            t02 = t04;
                            if (t04 == null) {
                                ?? bVar = new AbstractC10293f0.b(zzbiv);
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

        public final int q() {
            return this.zzya;
        }

        public final boolean u() {
            return (this.zzbb & 1) == 1;
        }

        public final String v() {
            return this.zzbis;
        }

        public final long w() {
            return this.zzbit;
        }

        public final long x() {
            return this.zzbiu;
        }
    }

    static {
        d2 d2Var = new d2();
        zzbir = d2Var;
        AbstractC10293f0.m(d2.class, d2Var);
    }

    private d2() {
    }

    public static d2 r() {
        return zzbir;
    }

    public static d2 t(byte[] bArr) throws zzco {
        return (d2) AbstractC10293f0.n(zzbir, bArr);
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [com.google.android.gms.internal.clearcut.T0<com.google.android.gms.internal.clearcut.d2>, com.google.android.gms.internal.clearcut.f0$b] */
    @Override // com.google.android.gms.internal.clearcut.AbstractC10293f0
    protected final Object f(int i10, Object obj, Object obj2) {
        T0<d2> t02;
        e2 e2Var = null;
        switch (e2.f81415a[i10 - 1]) {
            case 1:
                return new d2();
            case 2:
                return new a(e2Var);
            case 3:
                return AbstractC10293f0.g(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", b.class});
            case 4:
                return zzbir;
            case 5:
                T0<d2> t03 = zzbg;
                if (t03 != null) {
                    return t03;
                }
                synchronized (d2.class) {
                    try {
                        T0<d2> t04 = zzbg;
                        t02 = t04;
                        if (t04 == null) {
                            ?? bVar = new AbstractC10293f0.b(zzbir);
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

    public final List<b> q() {
        return this.zzbiq;
    }
}
