package i8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import m8.C15689d;
import m8.C15692g;

/* loaded from: classes4.dex */
public class r extends q {

    /* renamed from: Q, reason: collision with root package name */
    private static volatile r f137353Q;

    /* renamed from: A, reason: collision with root package name */
    private volatile long f137355A;

    /* renamed from: B, reason: collision with root package name */
    private volatile int f137356B;

    /* renamed from: C, reason: collision with root package name */
    private volatile int f137357C;

    /* renamed from: D, reason: collision with root package name */
    private volatile boolean f137358D;

    /* renamed from: E, reason: collision with root package name */
    private volatile boolean f137359E;

    /* renamed from: F, reason: collision with root package name */
    private volatile boolean f137360F;

    /* renamed from: G, reason: collision with root package name */
    private volatile boolean f137361G;

    /* renamed from: H, reason: collision with root package name */
    private volatile boolean f137362H;

    /* renamed from: I, reason: collision with root package name */
    private volatile boolean f137363I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f137364J;

    /* renamed from: K, reason: collision with root package name */
    private volatile Timer f137365K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f137366L;

    /* renamed from: M, reason: collision with root package name */
    private static final String f137349M = x.f137411a + "DTXAutoAction";

    /* renamed from: N, reason: collision with root package name */
    static int f137350N = C15692g.a().f150771h;

    /* renamed from: O, reason: collision with root package name */
    static int f137351O = C15692g.a().f150772i;

    /* renamed from: P, reason: collision with root package name */
    static boolean f137352P = true;

    /* renamed from: R, reason: collision with root package name */
    private static List<r> f137354R = Collections.synchronizedList(new ArrayList(5));

    class a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        int f137367a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f137368b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f137369c;

        a(int i10, boolean z10) {
            this.f137368b = i10;
            this.f137369c = z10;
            this.f137367a = i10;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int i10 = this.f137367a;
            if (i10 > 0) {
                this.f137367a = i10 - 1;
                if (!this.f137369c) {
                    return;
                }
            } else {
                r.this.Q();
            }
            r.this.b0(this.f137367a);
        }
    }

    private synchronized void P(r rVar, boolean z10) {
        if (f137353Q == rVar) {
            f137353Q = null;
            if (z10 && rVar != null) {
                f137354R.add(rVar);
            }
        }
    }

    public static void S() {
        ArrayList arrayList;
        g0(null);
        synchronized (f137354R) {
            arrayList = new ArrayList(f137354R);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((r) it.next()).J();
            } catch (Exception e10) {
                if (x.f137412b) {
                    z8.f.x(f137349M, "GAUA close all internal errors", e10);
                }
            }
        }
    }

    public static r T(String str, p8.b bVar, int i10) {
        return U(str, bVar, i10, true);
    }

    private synchronized Timer W(boolean z10) {
        Timer timer;
        try {
            if (z10) {
                if (this.f137365K != null) {
                    R(this.f137365K);
                }
                timer = new Timer(f137349M);
                this.f137365K = timer;
            } else {
                timer = this.f137365K;
                this.f137365K = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return timer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(int i10) {
        int i11;
        this.f137363I = true;
        if (x.f137412b) {
            z8.f.u(f137349M, String.format("onUA: onTimerPop for %s intv=%d WR=%d action=%d", h(), Integer.valueOf(i10), Integer.valueOf(this.f137356B), Integer.valueOf(this.f137357C)));
        }
        if (!this.f137362H) {
            P(this, true);
        }
        if (this.f137356B > 0 || this.f137357C > 0) {
            if (!this.f137362H) {
                this.f137362H = true;
                if (Y() && this.f137357C > 0) {
                    Iterator<p> it = F().iterator();
                    L8.d dVar = null;
                    boolean z10 = false;
                    while (it.hasNext()) {
                        p next = it.next();
                        if (next instanceof L8.f) {
                            z10 = true;
                        } else if (next instanceof L8.d) {
                            dVar = (L8.d) next;
                        }
                    }
                    if (!z10 && dVar != null) {
                        if (x.f137412b) {
                            z8.f.u(f137349M, "onUA: detected pending AppStart action after grace period; dropping AppStart action");
                        }
                        N(dVar.h());
                        this.f137361G = true;
                        dVar.O();
                    }
                }
                if (x.f137412b) {
                    z8.f.u(f137349M, String.format("onUA: starting waiting period for %s", h()));
                }
                long jM = f137351O - (m() - n());
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
        if (x.f137412b) {
            z8.f.u(f137349M, String.format("onUA: closing %s", h()));
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
        this.f137355A = m();
        if (x.f137412b) {
            z8.f.u(f137349M, String.format("onUA: new eT=%d dur=%d", Long.valueOf(this.f137355A), Long.valueOf(this.f137355A - n())));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f137371a;

        static {
            int[] iArr = new int[w.values().length];
            f137371a = iArr;
            try {
                iArr[w.f137391h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137371a[w.f137392i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f137371a[w.f137390g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f137371a[w.f137398o.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f137371a[w.f137399p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f137371a[w.f137389f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    protected r(String str, p8.b bVar, int i10, boolean z10) {
        super(str, w.f137387d, 0L, bVar, i10, z10, null);
        this.f137355A = 0L;
        this.f137356B = 0;
        this.f137357C = 0;
        this.f137358D = false;
        this.f137359E = false;
        this.f137360F = false;
        this.f137361G = false;
        this.f137362H = false;
        this.f137364J = false;
        this.f137365K = null;
        this.f137366L = false;
        l.d(str, 1, j(), this, bVar, i10, new String[0]);
    }

    private void R(Timer timer) {
        this.f137363I = this.f137362H;
        if (x.f137412b) {
            z8.f.u(f137349M, "onUA: cancel timer=" + timer + " graceTimeOver=" + this.f137363I);
        }
        if (timer != null) {
            timer.cancel();
            timer.purge();
        }
    }

    static r U(String str, p8.b bVar, int i10, boolean z10) {
        r rVar = new r(str, bVar, i10, z10);
        g0(rVar);
        if (x.f137412b) {
            z8.f.u(f137349M, String.format("onUA: new GAUA %s @ %d", str, Long.valueOf(rVar.n())));
        }
        return rVar;
    }

    public static r V() {
        return f137353Q;
    }

    private boolean X(p pVar) {
        switch (b.f137371a[pVar.f().ordinal()]) {
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

    public static void c0(C15689d c15689d) {
        f137350N = c15689d.f150771h;
        f137351O = c15689d.f150772i;
        f137352P = c15689d.f150773j;
    }

    private void e0(long j10, long j11, int i10, boolean z10) {
        if (x.f137412b) {
            z8.f.u(f137349M, String.format("onUA: startTimer for %s delay=%dms period=%dms #period=%d", h(), Long.valueOf(j10), Long.valueOf(j11), Integer.valueOf(i10)));
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
        rVar2 = f137353Q;
        f137353Q = rVar;
        if (rVar2 != null) {
            f137354R.add(rVar2);
        }
        return rVar2;
    }

    @Override // i8.q
    protected void M(p pVar) {
        if (pVar == null) {
            return;
        }
        if (x.f137412b) {
            z8.f.u(f137349M, String.format("onUA: add child %s to %s", pVar.h(), h()));
        }
        int iP = pVar.p();
        if (iP == 5) {
            this.f137357C++;
            this.f137359E = true;
        } else if (iP != 100 && iP != 110) {
            this.f137360F = X(pVar);
        } else {
            this.f137356B++;
            this.f137358D = true;
        }
    }

    @Override // i8.q, i8.p
    public StringBuilder b() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("et=");
        sb2.append(this.f137333j.e());
        sb2.append("&na=");
        sb2.append(z8.f.t(h()));
        sb2.append("&it=");
        sb2.append(z8.f.e());
        sb2.append("&ca=");
        sb2.append(o());
        sb2.append("&pa=");
        sb2.append(j());
        sb2.append("&s0=");
        sb2.append(g());
        sb2.append("&t0=");
        sb2.append(n());
        sb2.append("&s1=");
        sb2.append(this.f137345u);
        sb2.append("&t1=");
        sb2.append(e() - n());
        sb2.append("&mo=");
        sb2.append(this.f137366L ? "1" : "0");
        sb2.append("&fw=");
        sb2.append(this.f137347w ? "1" : "0");
        return sb2;
    }

    public void f0() {
        if (this.f137365K == null) {
            d0(f137350N);
        }
    }

    @Override // i8.p
    protected long i() {
        if (this.f137358D || this.f137359E) {
            if (x.f137412b) {
                z8.f.u(f137349M, String.format("onUA: use adjusted eT=%d dur=%d", Long.valueOf(this.f137355A), Long.valueOf(this.f137355A - n())));
            }
            return this.f137355A;
        }
        if (this.f137355A <= 0) {
            return super.i();
        }
        if (x.f137412b) {
            z8.f.u(f137349M, String.format("onUA (empty): use adjusted eT=%d dur=%d", Long.valueOf(this.f137355A), Long.valueOf(this.f137355A - n())));
        }
        return this.f137355A;
    }

    private boolean Y() {
        return h().equals("Loading " + C14695b.f137213k);
    }

    @Override // i8.q
    protected boolean I() {
        return super.I();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    @Override // i8.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J() {
        /*
            r10 = this;
            r10.Q()
            r0 = 1
            r10.f137362H = r0
            r10.f137363I = r0
            r1 = 0
            r10.P(r10, r1)
            java.util.List<i8.r> r2 = i8.r.f137354R
            r2.remove(r10)
            boolean r2 = i8.x.f137412b
            if (r2 == 0) goto L46
            java.lang.String r2 = i8.r.f137349M
            java.lang.String r3 = r10.h()
            boolean r4 = r10.f137364J
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r5 = r10.f137358D
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r6 = r10.f137359E
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            boolean r7 = r10.f137360F
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            long r8 = r10.f137355A
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6, r7, r8}
            java.lang.String r4 = "onUA: leave %s - abandon=%b WR=%b action=%b modified=%b eT=%d"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            z8.f.u(r2, r3)
        L46:
            boolean r2 = r10.f137364J
            if (r2 == 0) goto L4e
            super.K(r1)
            return
        L4e:
            boolean r2 = r10.f137358D
            if (r2 != 0) goto L56
            boolean r2 = r10.f137359E
            if (r2 == 0) goto L5e
        L56:
            long r2 = r10.f137355A
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L69
        L5e:
            boolean r2 = i8.r.f137352P
            if (r2 != 0) goto L69
            boolean r2 = r10.f137360F
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
            int r3 = r10.f137357C
            if (r3 != 0) goto L92
            boolean r0 = r10.f137361G
            if (r0 == 0) goto Ld5
            boolean r0 = i8.x.f137412b
            if (r0 == 0) goto Ld6
            java.lang.String r0 = i8.r.f137349M
            java.lang.String r2 = r10.h()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "onUA: dropping AUA %s after already dropping AppStart action"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            z8.f.u(r0, r2)
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
            i8.p r6 = (i8.p) r6
            boolean r7 = r6 instanceof L8.f
            if (r7 == 0) goto Lae
            r5 = r0
            goto L9c
        Lae:
            boolean r7 = r6 instanceof L8.d
            if (r7 == 0) goto L9c
            L8.d r6 = (L8.d) r6
            r4 = r6
            goto L9c
        Lb6:
            if (r5 != 0) goto Ld5
            if (r4 == 0) goto Ld5
            r4.O()
            boolean r0 = i8.x.f137412b
            if (r0 == 0) goto Ld6
            java.lang.String r0 = i8.r.f137349M
            java.lang.String r2 = r10.h()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "onUA: dropping pending AppStart action because AUA %s is closed"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            z8.f.u(r0, r2)
            goto Ld6
        Ld5:
            r1 = r2
        Ld6:
            super.K(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.r.J():void");
    }

    @Override // i8.q
    public void N(String str) {
        if (str.startsWith(E.a())) {
            this.f137356B--;
        } else {
            this.f137357C--;
        }
        super.N(str);
    }

    public void a0(q qVar) {
        if (F().contains(qVar)) {
            if (x.f137412b) {
                z8.f.u(f137349M, String.format("onUA: child %s of %s done", qVar.h(), h()));
            }
            Z();
            this.f137357C--;
        }
    }

    public void d0(int i10) {
        Q();
        if (i10 <= 0) {
            b0(0);
            return;
        }
        if (x.f137412b) {
            z8.f.u(f137349M, String.format("onUA: start grace period for %s", h()));
        }
        long j10 = i10;
        e0(j10, j10, 0, false);
    }
}
