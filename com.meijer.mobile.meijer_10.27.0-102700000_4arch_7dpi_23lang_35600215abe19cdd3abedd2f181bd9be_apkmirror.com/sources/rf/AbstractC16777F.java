package rf;

import java.nio.charset.Charset;
import java.util.List;
import rf.C16772A;
import rf.C16780b;
import rf.C16781c;
import rf.C16782d;
import rf.C16783e;
import rf.C16784f;
import rf.C16785g;
import rf.h;
import rf.i;
import rf.k;
import rf.l;
import rf.m;
import rf.n;
import rf.o;
import rf.p;
import rf.q;
import rf.r;
import rf.s;
import rf.t;
import rf.u;
import rf.v;
import rf.w;
import rf.x;
import rf.y;
import rf.z;

/* renamed from: rf.F, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC16777F {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f158212a = Charset.forName("UTF-8");

    /* renamed from: rf.F$a */
    public static abstract class a {

        /* renamed from: rf.F$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC2446a {

            /* renamed from: rf.F$a$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC2447a {
                public abstract AbstractC2446a a();

                public abstract AbstractC2447a b(String str);

                public abstract AbstractC2447a c(String str);

                public abstract AbstractC2447a d(String str);
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public static AbstractC2447a a() {
                return new C16782d.b();
            }
        }

        /* renamed from: rf.F$a$b */
        public static abstract class b {
            public abstract a a();

            public abstract b b(List<AbstractC2446a> list);

            public abstract b c(int i10);

            public abstract b d(int i10);

            public abstract b e(String str);

            public abstract b f(long j10);

            public abstract b g(int i10);

            public abstract b h(long j10);

            public abstract b i(long j10);

            public abstract b j(String str);
        }

        public abstract List<AbstractC2446a> b();

        public abstract int c();

        public abstract int d();

        public abstract String e();

        public abstract long f();

        public abstract int g();

        public abstract long h();

        public abstract long i();

        public abstract String j();

        public static b a() {
            return new C16781c.b();
        }
    }

    /* renamed from: rf.F$b */
    public static abstract class b {
        public abstract AbstractC16777F a();

        public abstract b b(a aVar);

        public abstract b c(String str);

        public abstract b d(String str);

        public abstract b e(String str);

        public abstract b f(String str);

        public abstract b g(String str);

        public abstract b h(String str);

        public abstract b i(String str);

        public abstract b j(d dVar);

        public abstract b k(int i10);

        public abstract b l(String str);

        public abstract b m(e eVar);
    }

    /* renamed from: rf.F$c */
    public static abstract class c {

        /* renamed from: rf.F$c$a */
        public static abstract class a {
            public abstract c a();

            public abstract a b(String str);

            public abstract a c(String str);
        }

        public abstract String b();

        public abstract String c();

        public static a a() {
            return new C16783e.b();
        }
    }

    /* renamed from: rf.F$d */
    public static abstract class d {

        /* renamed from: rf.F$d$a */
        public static abstract class a {
            public abstract d a();

            public abstract a b(List<b> list);

            public abstract a c(String str);
        }

        /* renamed from: rf.F$d$b */
        public static abstract class b {

            /* renamed from: rf.F$d$b$a */
            public static abstract class a {
                public abstract b a();

                public abstract a b(byte[] bArr);

                public abstract a c(String str);
            }

            public abstract byte[] b();

            public abstract String c();

            public static a a() {
                return new C16785g.b();
            }
        }

        public abstract List<b> b();

        public abstract String c();

        public static a a() {
            return new C16784f.b();
        }
    }

    /* renamed from: rf.F$e */
    public static abstract class e {

        /* renamed from: rf.F$e$a */
        public static abstract class a {

            /* renamed from: rf.F$e$a$a, reason: collision with other inner class name */
            public static abstract class AbstractC2448a {
                public abstract a a();

                public abstract AbstractC2448a b(String str);

                public abstract AbstractC2448a c(String str);

                public abstract AbstractC2448a d(String str);

                public abstract AbstractC2448a e(String str);

                public abstract AbstractC2448a f(String str);

                public abstract AbstractC2448a g(String str);
            }

            /* renamed from: rf.F$e$a$b */
            public static abstract class b {
                public abstract String a();
            }

            public abstract String b();

            public abstract String c();

            public abstract String d();

            public abstract String e();

            public abstract String f();

            public abstract b g();

            public abstract String h();

            public static AbstractC2448a a() {
                return new i.b();
            }
        }

        /* renamed from: rf.F$e$b */
        public static abstract class b {
            public abstract e a();

            public abstract b b(a aVar);

            public abstract b c(String str);

            public abstract b d(boolean z10);

            public abstract b e(c cVar);

            public abstract b f(Long l10);

            public abstract b g(List<d> list);

            public abstract b h(String str);

            public abstract b i(int i10);

            public abstract b j(String str);

            public abstract b l(AbstractC2463e abstractC2463e);

            public abstract b m(long j10);

            public abstract b n(f fVar);

            public b k(byte[] bArr) {
                return j(new String(bArr, AbstractC16777F.f158212a));
            }
        }

        /* renamed from: rf.F$e$c */
        public static abstract class c {

            /* renamed from: rf.F$e$c$a */
            public static abstract class a {
                public abstract c a();

                public abstract a b(int i10);

                public abstract a c(int i10);

                public abstract a d(long j10);

                public abstract a e(String str);

                public abstract a f(String str);

                public abstract a g(String str);

                public abstract a h(long j10);

                public abstract a i(boolean z10);

                public abstract a j(int i10);
            }

            public abstract int b();

            public abstract int c();

            public abstract long d();

            public abstract String e();

            public abstract String f();

            public abstract String g();

            public abstract long h();

            public abstract int i();

            public abstract boolean j();

            public static a a() {
                return new k.b();
            }
        }

        /* renamed from: rf.F$e$d */
        public static abstract class d {

            /* renamed from: rf.F$e$d$a */
            public static abstract class a {

                /* renamed from: rf.F$e$d$a$a, reason: collision with other inner class name */
                public static abstract class AbstractC2449a {
                    public abstract a a();

                    public abstract AbstractC2449a b(List<c> list);

                    public abstract AbstractC2449a c(Boolean bool);

                    public abstract AbstractC2449a d(c cVar);

                    public abstract AbstractC2449a e(List<c> list);

                    public abstract AbstractC2449a f(b bVar);

                    public abstract AbstractC2449a g(List<c> list);

                    public abstract AbstractC2449a h(int i10);
                }

                /* renamed from: rf.F$e$d$a$b */
                public static abstract class b {

                    /* renamed from: rf.F$e$d$a$b$a, reason: collision with other inner class name */
                    public static abstract class AbstractC2450a {

                        /* renamed from: rf.F$e$d$a$b$a$a, reason: collision with other inner class name */
                        public static abstract class AbstractC2451a {
                            public abstract AbstractC2450a a();

                            public abstract AbstractC2451a b(long j10);

                            public abstract AbstractC2451a c(String str);

                            public abstract AbstractC2451a d(long j10);

                            public abstract AbstractC2451a e(String str);

                            public AbstractC2451a f(byte[] bArr) {
                                return e(new String(bArr, AbstractC16777F.f158212a));
                            }
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract long d();

                        public abstract String e();

                        public static AbstractC2451a a() {
                            return new o.b();
                        }

                        public byte[] f() {
                            String strE = e();
                            if (strE != null) {
                                return strE.getBytes(AbstractC16777F.f158212a);
                            }
                            return null;
                        }
                    }

                    /* renamed from: rf.F$e$d$a$b$b, reason: collision with other inner class name */
                    public static abstract class AbstractC2452b {
                        public abstract b a();

                        public abstract AbstractC2452b b(a aVar);

                        public abstract AbstractC2452b c(List<AbstractC2450a> list);

                        public abstract AbstractC2452b d(c cVar);

                        public abstract AbstractC2452b e(AbstractC2454d abstractC2454d);

                        public abstract AbstractC2452b f(List<AbstractC2456e> list);
                    }

                    /* renamed from: rf.F$e$d$a$b$c */
                    public static abstract class c {

                        /* renamed from: rf.F$e$d$a$b$c$a, reason: collision with other inner class name */
                        public static abstract class AbstractC2453a {
                            public abstract c a();

                            public abstract AbstractC2453a b(c cVar);

                            public abstract AbstractC2453a c(List<AbstractC2456e.AbstractC2458b> list);

                            public abstract AbstractC2453a d(int i10);

                            public abstract AbstractC2453a e(String str);

                            public abstract AbstractC2453a f(String str);
                        }

                        public abstract c b();

                        public abstract List<AbstractC2456e.AbstractC2458b> c();

                        public abstract int d();

                        public abstract String e();

                        public abstract String f();

                        public static AbstractC2453a a() {
                            return new p.b();
                        }
                    }

                    /* renamed from: rf.F$e$d$a$b$d, reason: collision with other inner class name */
                    public static abstract class AbstractC2454d {

                        /* renamed from: rf.F$e$d$a$b$d$a, reason: collision with other inner class name */
                        public static abstract class AbstractC2455a {
                            public abstract AbstractC2454d a();

                            public abstract AbstractC2455a b(long j10);

                            public abstract AbstractC2455a c(String str);

                            public abstract AbstractC2455a d(String str);
                        }

                        public abstract long b();

                        public abstract String c();

                        public abstract String d();

                        public static AbstractC2455a a() {
                            return new q.b();
                        }
                    }

                    /* renamed from: rf.F$e$d$a$b$e, reason: collision with other inner class name */
                    public static abstract class AbstractC2456e {

                        /* renamed from: rf.F$e$d$a$b$e$a, reason: collision with other inner class name */
                        public static abstract class AbstractC2457a {
                            public abstract AbstractC2456e a();

                            public abstract AbstractC2457a b(List<AbstractC2458b> list);

                            public abstract AbstractC2457a c(int i10);

                            public abstract AbstractC2457a d(String str);
                        }

                        /* renamed from: rf.F$e$d$a$b$e$b, reason: collision with other inner class name */
                        public static abstract class AbstractC2458b {

                            /* renamed from: rf.F$e$d$a$b$e$b$a, reason: collision with other inner class name */
                            public static abstract class AbstractC2459a {
                                public abstract AbstractC2458b a();

                                public abstract AbstractC2459a b(String str);

                                public abstract AbstractC2459a c(int i10);

                                public abstract AbstractC2459a d(long j10);

                                public abstract AbstractC2459a e(long j10);

                                public abstract AbstractC2459a f(String str);
                            }

                            public abstract String b();

                            public abstract int c();

                            public abstract long d();

                            public abstract long e();

                            public abstract String f();

                            public static AbstractC2459a a() {
                                return new s.b();
                            }
                        }

                        public abstract List<AbstractC2458b> b();

                        public abstract int c();

                        public abstract String d();

                        public static AbstractC2457a a() {
                            return new r.b();
                        }
                    }

                    public abstract a b();

                    public abstract List<AbstractC2450a> c();

                    public abstract c d();

                    public abstract AbstractC2454d e();

                    public abstract List<AbstractC2456e> f();

                    public static AbstractC2452b a() {
                        return new n.b();
                    }
                }

                /* renamed from: rf.F$e$d$a$c */
                public static abstract class c {

                    /* renamed from: rf.F$e$d$a$c$a, reason: collision with other inner class name */
                    public static abstract class AbstractC2460a {
                        public abstract c a();

                        public abstract AbstractC2460a b(boolean z10);

                        public abstract AbstractC2460a c(int i10);

                        public abstract AbstractC2460a d(int i10);

                        public abstract AbstractC2460a e(String str);
                    }

                    public abstract int b();

                    public abstract int c();

                    public abstract String d();

                    public abstract boolean e();

                    public static AbstractC2460a a() {
                        return new t.b();
                    }
                }

                public abstract List<c> b();

                public abstract Boolean c();

                public abstract c d();

                public abstract List<c> e();

                public abstract b f();

                public abstract List<c> g();

                public abstract int h();

                public abstract AbstractC2449a i();

                public static AbstractC2449a a() {
                    return new m.b();
                }
            }

            /* renamed from: rf.F$e$d$b */
            public static abstract class b {
                public abstract d a();

                public abstract b b(a aVar);

                public abstract b c(c cVar);

                public abstract b d(AbstractC2461d abstractC2461d);

                public abstract b e(f fVar);

                public abstract b f(long j10);

                public abstract b g(String str);
            }

            /* renamed from: rf.F$e$d$c */
            public static abstract class c {

                /* renamed from: rf.F$e$d$c$a */
                public static abstract class a {
                    public abstract c a();

                    public abstract a b(Double d10);

                    public abstract a c(int i10);

                    public abstract a d(long j10);

                    public abstract a e(int i10);

                    public abstract a f(boolean z10);

                    public abstract a g(long j10);
                }

                public abstract Double b();

                public abstract int c();

                public abstract long d();

                public abstract int e();

                public abstract long f();

                public abstract boolean g();

                public static a a() {
                    return new u.b();
                }
            }

            /* renamed from: rf.F$e$d$d, reason: collision with other inner class name */
            public static abstract class AbstractC2461d {

                /* renamed from: rf.F$e$d$d$a */
                public static abstract class a {
                    public abstract AbstractC2461d a();

                    public abstract a b(String str);
                }

                public abstract String b();

                public static a a() {
                    return new v.b();
                }
            }

            /* renamed from: rf.F$e$d$e, reason: collision with other inner class name */
            public static abstract class AbstractC2462e {

                /* renamed from: rf.F$e$d$e$a */
                public static abstract class a {
                    public abstract AbstractC2462e a();

                    public abstract a b(String str);

                    public abstract a c(String str);

                    public abstract a d(b bVar);

                    public abstract a e(long j10);
                }

                /* renamed from: rf.F$e$d$e$b */
                public static abstract class b {

                    /* renamed from: rf.F$e$d$e$b$a */
                    public static abstract class a {
                        public abstract b a();

                        public abstract a b(String str);

                        public abstract a c(String str);
                    }

                    public abstract String b();

                    public abstract String c();

                    public static a a() {
                        return new x.b();
                    }
                }

                public abstract String b();

                public abstract String c();

                public abstract b d();

                public abstract long e();

                public static a a() {
                    return new w.b();
                }
            }

            /* renamed from: rf.F$e$d$f */
            public static abstract class f {

                /* renamed from: rf.F$e$d$f$a */
                public static abstract class a {
                    public abstract f a();

                    public abstract a b(List<AbstractC2462e> list);
                }

                public abstract List<AbstractC2462e> b();

                public static a a() {
                    return new y.b();
                }
            }

            public abstract a b();

            public abstract c c();

            public abstract AbstractC2461d d();

            public abstract f e();

            public abstract long f();

            public abstract String g();

            public abstract b h();

            public static b a() {
                return new l.b();
            }
        }

        /* renamed from: rf.F$e$e, reason: collision with other inner class name */
        public static abstract class AbstractC2463e {

            /* renamed from: rf.F$e$e$a */
            public static abstract class a {
                public abstract AbstractC2463e a();

                public abstract a b(String str);

                public abstract a c(boolean z10);

                public abstract a d(int i10);

                public abstract a e(String str);
            }

            public abstract String b();

            public abstract int c();

            public abstract String d();

            public abstract boolean e();

            public static a a() {
                return new z.b();
            }
        }

        /* renamed from: rf.F$e$f */
        public static abstract class f {

            /* renamed from: rf.F$e$f$a */
            public static abstract class a {
                public abstract f a();

                public abstract a b(String str);
            }

            public abstract String b();

            public static a a() {
                return new C16772A.b();
            }
        }

        public abstract a b();

        public abstract String c();

        public abstract c d();

        public abstract Long e();

        public abstract List<d> f();

        public abstract String g();

        public abstract int h();

        public abstract String i();

        public abstract AbstractC2463e k();

        public abstract long l();

        public abstract f m();

        public abstract boolean n();

        public abstract b o();

        public static b a() {
            return new h.b().d(false);
        }

        public byte[] j() {
            return i().getBytes(AbstractC16777F.f158212a);
        }

        e p(String str) {
            return o().c(str).a();
        }

        e q(List<d> list) {
            return o().g(list).a();
        }

        e r(long j10, boolean z10, String str) {
            b bVarO = o();
            bVarO.f(Long.valueOf(j10));
            bVarO.d(z10);
            if (str != null) {
                bVarO.n(f.a().b(str).a());
            }
            return bVarO.a();
        }
    }

    public abstract a c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract String i();

    public abstract String j();

    public abstract d k();

    public abstract int l();

    public abstract String m();

    public abstract e n();

    protected abstract b o();

    public static b b() {
        return new C16780b.C2465b();
    }

    public AbstractC16777F q(a aVar) {
        return aVar == null ? this : o().b(aVar).a();
    }

    public AbstractC16777F p(String str) {
        b bVarC = o().c(str);
        if (n() != null) {
            bVarC.m(n().p(str));
        }
        return bVarC.a();
    }

    public AbstractC16777F r(List<e.d> list) {
        if (n() != null) {
            return o().m(n().q(list)).a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }

    public AbstractC16777F s(String str) {
        return o().f(str).a();
    }

    public AbstractC16777F t(String str) {
        return o().g(str).a();
    }

    public AbstractC16777F u(d dVar) {
        return o().m(null).j(dVar).a();
    }

    public AbstractC16777F v(long j10, boolean z10, String str) {
        b bVarO = o();
        if (n() != null) {
            bVarO.m(n().r(j10, z10, str));
        }
        return bVarO.a();
    }
}
