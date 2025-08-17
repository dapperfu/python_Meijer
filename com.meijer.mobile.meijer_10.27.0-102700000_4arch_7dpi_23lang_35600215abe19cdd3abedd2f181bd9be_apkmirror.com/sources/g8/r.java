package g8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import k8.C15118d;
import k8.C15121g;

/* loaded from: classes4.dex */
public class r extends q {

    /* renamed from: Q, reason: collision with root package name */
    private static volatile r f133137Q;

    /* renamed from: A, reason: collision with root package name */
    private volatile long f133139A;

    /* renamed from: B, reason: collision with root package name */
    private volatile int f133140B;

    /* renamed from: C, reason: collision with root package name */
    private volatile int f133141C;

    /* renamed from: D, reason: collision with root package name */
    private volatile boolean f133142D;

    /* renamed from: E, reason: collision with root package name */
    private volatile boolean f133143E;

    /* renamed from: F, reason: collision with root package name */
    private volatile boolean f133144F;

    /* renamed from: G, reason: collision with root package name */
    private volatile boolean f133145G;

    /* renamed from: H, reason: collision with root package name */
    private volatile boolean f133146H;

    /* renamed from: I, reason: collision with root package name */
    private volatile boolean f133147I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f133148J;

    /* renamed from: K, reason: collision with root package name */
    private volatile Timer f133149K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f133150L;

    /* renamed from: M, reason: collision with root package name */
    private static final String f133133M = x.f133195a + "DTXAutoAction";

    /* renamed from: N, reason: collision with root package name */
    static int f133134N = C15121g.a().f141625h;

    /* renamed from: O, reason: collision with root package name */
    static int f133135O = C15121g.a().f141626i;

    /* renamed from: P, reason: collision with root package name */
    static boolean f133136P = true;

    /* renamed from: R, reason: collision with root package name */
    private static List<r> f133138R = Collections.synchronizedList(new ArrayList(5));

    class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        int f133151a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f133152b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f133153c;

        a(int i10, boolean z10) {
            this.f133152b = i10;
            this.f133153c = z10;
            this.f133151a = i10;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int i10 = this.f133151a;
            if (i10 > 0) {
                this.f133151a = i10 - 1;
                if (!this.f133153c) {
                    return;
                }
            } else {
                r.this.Q();
            }
            r.this.b0(this.f133151a);
        }
    }

    private synchronized void P(r rVar, boolean z10) {
        if (f133137Q == rVar) {
            f133137Q = null;
            if (z10 && rVar != null) {
                f133138R.add(rVar);
            }
        }
    }

    public static void S() {
        ArrayList arrayList;
        g0(null);
        synchronized (f133138R) {
            arrayList = new ArrayList(f133138R);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((r) it.next()).J();
            } catch (Exception e10) {
                if (x.f133196b) {
                    x8.f.x(f133133M, "GAUA close all internal errors", e10);
                }
            }
        }
    }

    public static r T(String str, n8.b bVar, int i10) {
        return U(str, bVar, i10, true);
    }

    private synchronized Timer W(boolean z10) {
        Timer timer;
        try {
            if (z10) {
                if (this.f133149K != null) {
                    R(this.f133149K);
                }
                timer = new Timer(f133133M);
                this.f133149K = timer;
            } else {
                timer = this.f133149K;
                this.f133149K = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return timer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(int i10) {
        int i11;
        this.f133147I = true;
        if (x.f133196b) {
            x8.f.u(f133133M, String.format("onUA: onTimerPop for %s intv=%d WR=%d action=%d", h(), Integer.valueOf(i10), Integer.valueOf(this.f133140B), Integer.valueOf(this.f133141C)));
        }
        if (!this.f133146H) {
            P(this, true);
        }
        if (this.f133140B > 0 || this.f133141C > 0) {
            if (!this.f133146H) {
                this.f133146H = true;
                if (Y() && this.f133141C > 0) {
                    Iterator<p> it = F().iterator();
                    J8.d dVar = null;
                    boolean z10 = false;
                    while (it.hasNext()) {
                        p next = it.next();
                        if (next instanceof J8.f) {
                            z10 = true;
                        } else if (next instanceof J8.d) {
                            dVar = (J8.d) next;
                        }
                    }
                    if (!z10 && dVar != null) {
                        if (x.f133196b) {
                            x8.f.u(f133133M, "onUA: detected pending AppStart action after grace period; dropping AppStart action");
                        }
                        N(dVar.h());
                        this.f133145G = true;
                        dVar.O();
                    }
                }
                if (x.f133196b) {
                    x8.f.u(f133133M, String.format("onUA: starting waiting period for %s", h()));
                }
                long jM = f133135O - (m() - n());
                if (jM > 1000) {
                    i11 = 1000;
                } else {
                    if (jM < 0) {
                        jM = 0;
                    }
                    i11 = 100;
                }
                long j10 = i11;
                e0(j10, j10, Math.round(jM / i11) - 1, true);
                return;
            }
            if (i10 > 0) {
                return;
            }
        }
        Q();
        if (x.f133196b) {
            x8.f.u(f133133M, String.format("onUA: closing %s", h()));
        }
        J();
    }

    public void Q() {
        R(W(false));
    }

    public synchronized void Z() {
        if (s()) {
            return;
        }
        this.f133139A = m();
        if (x.f133196b) {
            x8.f.u(f133133M, String.format("onUA: new eT=%d dur=%d", Long.valueOf(this.f133139A), Long.valueOf(this.f133139A - n())));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f133155a;

        static {
            int[] iArr = new int[w.values().length];
            f133155a = iArr;
            try {
                iArr[w.f133175h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f133155a[w.f133176i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f133155a[w.f133174g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f133155a[w.f133182o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f133155a[w.f133183p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f133155a[w.f133173f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    protected r(String str, n8.b bVar, int i10, boolean z10) {
        super(str, w.f133171d, 0L, bVar, i10, z10, null);
        this.f133139A = 0L;
        this.f133140B = 0;
        this.f133141C = 0;
        this.f133142D = false;
        this.f133143E = false;
        this.f133144F = false;
        this.f133145G = false;
        this.f133146H = false;
        this.f133148J = false;
        this.f133149K = null;
        this.f133150L = false;
        l.d(str, 1, j(), this, bVar, i10, new String[0]);
    }

    private void R(Timer timer) {
        this.f133147I = this.f133146H;
        if (x.f133196b) {
            x8.f.u(f133133M, "onUA: cancel timer=" + timer + " graceTimeOver=" + this.f133147I);
        }
        if (timer != null) {
            timer.cancel();
            timer.purge();
        }
    }

    static r U(String str, n8.b bVar, int i10, boolean z10) {
        r rVar = new r(str, bVar, i10, z10);
        g0(rVar);
        if (x.f133196b) {
            x8.f.u(f133133M, String.format("onUA: new GAUA %s @ %d", str, Long.valueOf(rVar.n())));
        }
        return rVar;
    }

    public static r V() {
        return f133137Q;
    }

    private boolean X(p pVar) {
        switch (b.f133155a[pVar.f().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    public static void c0(C15118d c15118d) {
        f133134N = c15118d.f141625h;
        f133135O = c15118d.f141626i;
        f133136P = c15118d.f141627j;
    }

    private void e0(long j10, long j11, int i10, boolean z10) {
        if (x.f133196b) {
            x8.f.u(f133133M, String.format("onUA: startTimer for %s delay=%dms period=%dms #period=%d", h(), Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)));
        }
        a aVar = new a(i10, z10);
        for (int i11 = 3; i11 > 0; i11--) {
            try {
                W(true).schedule(aVar, j10, j11);
                return;
            } catch (IllegalArgumentException unused) {
                return;
            } catch (IllegalStateException unused2) {
            }
        }
    }

    private static synchronized r g0(r rVar) {
        r rVar2;
        rVar2 = f133137Q;
        f133137Q = rVar;
        if (rVar2 != null) {
            f133138R.add(rVar2);
        }
        return rVar2;
    }

    @Override // g8.q
    protected void M(p pVar) {
        if (pVar == null) {
            return;
        }
        if (x.f133196b) {
            x8.f.u(f133133M, String.format("onUA: add child %s to %s", pVar.h(), h()));
        }
        int iP = pVar.p();
        if (iP == 5) {
            this.f133141C++;
            this.f133143E = true;
        } else if (iP != 100 && iP != 110) {
            this.f133144F = X(pVar);
        } else {
            this.f133140B++;
            this.f133142D = true;
        }
    }

    @Override // g8.q, g8.p
    public StringBuilder b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("et=");
        sb2.append(this.f133117j.e());
        sb2.append("&na=");
        sb2.append(x8.f.t(h()));
        sb2.append("&it=");
        sb2.append(x8.f.e());
        sb2.append("&ca=");
        sb2.append(o());
        sb2.append("&pa=");
        sb2.append(j());
        sb2.append("&s0=");
        sb2.append(g());
        sb2.append("&t0=");
        sb2.append(n());
        sb2.append("&s1=");
        sb2.append(this.f133129u);
        sb2.append("&t1=");
        sb2.append(e() - n());
        sb2.append("&mo=");
        sb2.append(this.f133150L ? "1" : "0");
        sb2.append("&fw=");
        sb2.append(this.f133131w ? "1" : "0");
        return sb2;
    }

    public void f0() {
        if (this.f133149K == null) {
            d0(f133134N);
        }
    }

    @Override // g8.p
    protected long i() {
        if (this.f133142D || this.f133143E) {
            if (x.f133196b) {
                x8.f.u(f133133M, String.format("onUA: use adjusted eT=%d dur=%d", Long.valueOf(this.f133139A), Long.valueOf(this.f133139A - n())));
            }
            return this.f133139A;
        }
        if (this.f133139A <= 0) {
            return super.i();
        }
        if (x.f133196b) {
            x8.f.u(f133133M, String.format("onUA (empty): use adjusted eT=%d dur=%d", Long.valueOf(this.f133139A), Long.valueOf(this.f133139A - n())));
        }
        return this.f133139A;
    }

    private boolean Y() {
        return h().equals("Loading " + C14219b.f132997k);
    }

    @Override // g8.q
    protected boolean I() {
        return super.I();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    @Override // g8.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J() {
        /*
            r10 = this;
            r10.Q()
            r0 = 1
            r10.f133146H = r0
            r10.f133147I = r0
            r1 = 0
            r10.P(r10, r1)
            java.util.List<g8.r> r2 = g8.r.f133138R
            r2.remove(r10)
            boolean r2 = g8.x.f133196b
            if (r2 == 0) goto L46
            java.lang.String r2 = g8.r.f133133M
            java.lang.String r3 = r10.h()
            boolean r4 = r10.f133148J
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r5 = r10.f133142D
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r6 = r10.f133143E
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r7 = r10.f133144F
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            long r8 = r10.f133139A
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8}
            java.lang.String r4 = "onUA: leave %s - abandon=%b WR=%b action=%b modified=%b eT=%d"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            x8.f.u(r2, r3)
        L46:
            boolean r2 = r10.f133148J
            if (r2 == 0) goto L4e
            super.K(r1)
            return
        L4e:
            boolean r2 = r10.f133142D
            if (r2 != 0) goto L56
            boolean r2 = r10.f133143E
            if (r2 == 0) goto L5e
        L56:
            long r2 = r10.f133139A
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L69
        L5e:
            boolean r2 = g8.r.f133136P
            if (r2 != 0) goto L69
            boolean r2 = r10.f133144F
            if (r2 == 0) goto L67
            goto L69
        L67:
            r2 = r1
            goto L6a
        L69:
            r2 = r0
        L6a:
            if (r2 == 0) goto Ld5
            boolean r3 = r10.Y()
            if (r3 == 0) goto Ld5
            int r3 = r10.f133141C
            if (r3 != 0) goto L92
            boolean r0 = r10.f133145G
            if (r0 == 0) goto Ld5
            boolean r0 = g8.x.f133196b
            if (r0 == 0) goto Ld6
            java.lang.String r0 = g8.r.f133133M
            java.lang.String r2 = r10.h()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "onUA: dropping AUA %s after already dropping AppStart action"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            x8.f.u(r0, r2)
            goto Ld6
        L92:
            java.util.Vector r3 = r10.F()
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
            r5 = r1
        L9c:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto Lb6
            java.lang.Object r6 = r3.next()
            g8.p r6 = (g8.p) r6
            boolean r7 = r6 instanceof J8.f
            if (r7 == 0) goto Lae
            r5 = r0
            goto L9c
        Lae:
            boolean r7 = r6 instanceof J8.d
            if (r7 == 0) goto L9c
            J8.d r6 = (J8.d) r6
            r4 = r6
            goto L9c
        Lb6:
            if (r5 != 0) goto Ld5
            if (r4 == 0) goto Ld5
            r4.O()
            boolean r0 = g8.x.f133196b
            if (r0 == 0) goto Ld6
            java.lang.String r0 = g8.r.f133133M
            java.lang.String r2 = r10.h()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "onUA: dropping pending AppStart action because AUA %s is closed"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            x8.f.u(r0, r2)
            goto Ld6
        Ld5:
            r1 = r2
        Ld6:
            super.K(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.r.J():void");
    }

    @Override // g8.q
    public void N(String str) {
        if (str.startsWith(E.a())) {
            this.f133140B--;
        } else {
            this.f133141C--;
        }
        super.N(str);
    }

    public void a0(q qVar) {
        if (F().contains(qVar)) {
            if (x.f133196b) {
                x8.f.u(f133133M, String.format("onUA: child %s of %s done", qVar.h(), h()));
            }
            Z();
            this.f133141C--;
        }
    }

    public void d0(int i10) {
        Q();
        if (i10 <= 0) {
            b0(0);
            return;
        }
        if (x.f133196b) {
            x8.f.u(f133133M, String.format("onUA: start grace period for %s", h()));
        }
        long j10 = i10;
        e0(j10, j10, 0, false);
    }
}
