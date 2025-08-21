package i8;

import A7.a;
import android.os.Looper;
import com.dynatrace.android.agent.comm.InvalidResponseException;
import com.medallia.digital.mobilesdk.l8;
import i8.C14698e;
import j8.C14963a;
import j8.C14965c;
import j8.C14966d;
import j8.C14967e;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import l8.InterfaceC15473a;
import m8.C15689d;
import m8.q;
import q8.C16610a;
import q8.C16611b;
import q8.C16613d;
import w8.C17850a;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: v, reason: collision with root package name */
    private static final String f137235v = x.f137411a + "CommunicationManager";

    /* renamed from: a, reason: collision with root package name */
    protected C16610a f137236a;

    /* renamed from: b, reason: collision with root package name */
    C14967e f137237b;

    /* renamed from: l, reason: collision with root package name */
    private Thread f137247l;

    /* renamed from: m, reason: collision with root package name */
    private Timer f137248m;

    /* renamed from: n, reason: collision with root package name */
    private h f137249n;

    /* renamed from: q, reason: collision with root package name */
    private i8.f f137252q;

    /* renamed from: r, reason: collision with root package name */
    private ThreadPoolExecutor f137253r;

    /* renamed from: c, reason: collision with root package name */
    C14698e.a f137238c = new C14698e.a();

    /* renamed from: d, reason: collision with root package name */
    C14693B f137239d = C14693B.f137207c;

    /* renamed from: f, reason: collision with root package name */
    private final Object f137241f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Object f137242g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private A7.a f137243h = new a.Enabled(false);

    /* renamed from: i, reason: collision with root package name */
    private AtomicBoolean f137244i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    private AtomicBoolean f137245j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    private AtomicBoolean f137246k = new AtomicBoolean(false);

    /* renamed from: o, reason: collision with root package name */
    private boolean f137250o = false;

    /* renamed from: p, reason: collision with root package name */
    private long f137251p = 0;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC15473a f137254s = null;

    /* renamed from: t, reason: collision with root package name */
    private boolean f137255t = false;

    /* renamed from: u, reason: collision with root package name */
    private volatile boolean f137256u = true;

    /* renamed from: e, reason: collision with root package name */
    private f f137240e = new f(this, null);

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (g.this.f137249n == null) {
                if (x.f137412b) {
                    z8.f.u(g.f137235v, "invalid DataSendTimerTask appeared");
                }
                g.this.K();
                return;
            }
            if (!g.this.f137249n.f() && !g.this.f137246k.get()) {
                g.this.K();
                l.w(99L);
                g.this.f137249n = null;
                return;
            }
            long jC = g.this.f137239d.c() - g.this.f137251p;
            if (g.this.f137249n.i()) {
                g.this.f137244i.set(g.this.f137249n.e());
                if (!g.this.f137244i.get()) {
                    if (x.f137412b) {
                        z8.f.u(g.f137235v, String.format("ReconnWait: mUemActive=%b lastCheck=%ds ago", Boolean.valueOf(g.this.f137246k.get()), Long.valueOf(jC / 1000)));
                        return;
                    }
                    return;
                }
            }
            if (jC >= 7200000 && !g.this.f137255t) {
                g.this.f137244i.set(true);
            }
            if (!g.this.f137244i.get()) {
                if (g.this.f137256u) {
                    z8.f.a("dtxLegacyCommunication", "taskTimer: keep waiting for the GET request executed via BPv4");
                } else {
                    g.this.f137244i.set(g.this.f137249n.e() && p8.b.b().m());
                }
            }
            if (x.f137412b) {
                z8.f.u(g.f137235v, String.format("TaskTimer mForceUemUpdate=%b mUemActive=%b waitingForInitialBPv4Config=%b", Boolean.valueOf(g.this.f137244i.get()), Boolean.valueOf(g.this.f137246k.get()), Boolean.valueOf(g.this.f137256u)));
            }
            if (g.this.f137246k.get() || g.this.f137244i.get()) {
                if (!g.this.f137256u) {
                    if (g.this.f137252q.d()) {
                        g.this.f137245j.set(true);
                    }
                    if (p.f137322s.get() == 1) {
                        g.this.f137245j.set(true);
                        p.f137322s.set(2);
                    }
                }
                if (x.f137412b) {
                    z8.f.u(g.f137235v, String.format("TaskTimer mForceSendEvent=%s thread ID=%d", Boolean.valueOf(g.this.f137245j.get()), Long.valueOf(z8.f.h(g.this.f137247l))));
                }
                if (g.this.f137245j.get() || g.this.f137244i.get()) {
                    synchronized (g.this.f137247l) {
                        g.this.f137247l.notify();
                    }
                    g gVar = g.this;
                    gVar.f137251p = gVar.f137239d.c();
                }
            }
        }
    }

    private class c extends Thread {
        /* synthetic */ c(g gVar, a aVar) {
            this();
        }

        private c() {
            super(x.f137411a + "EventSenderThread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z10;
            g.this.f137250o = true;
            do {
                try {
                    synchronized (this) {
                        try {
                            if (!g.this.f137250o) {
                                return;
                            }
                            wait();
                            z10 = g.this.f137250o;
                            g.this.q(C17850a.h().m());
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e10) {
                    if (x.f137412b) {
                        z8.f.v(g.f137235v, e10.getMessage(), e10);
                        return;
                    }
                    return;
                }
            } while (z10);
        }
    }

    private class d extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final m8.q f137260a;

        /* renamed from: b, reason: collision with root package name */
        private final C14966d f137261b;

        /* renamed from: c, reason: collision with root package name */
        private final int f137262c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f137263d;

        /* renamed from: e, reason: collision with root package name */
        private final long f137264e;

        /* renamed from: f, reason: collision with root package name */
        private final int f137265f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f137266g;

        /* synthetic */ d(g gVar, m8.q qVar, C14966d c14966d, int i10, boolean z10, long j10, int i11, a aVar) {
            this(qVar, c14966d, i10, z10, j10, i11);
        }

        private d(m8.q qVar, C14966d c14966d, int i10, boolean z10, long j10, int i11) {
            this.f137266g = false;
            setName("POST CrashReport");
            this.f137260a = qVar;
            this.f137261b = c14966d;
            this.f137262c = i10;
            this.f137263d = z10;
            this.f137264e = j10;
            this.f137265f = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            return this.f137266g;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f137266g = g.this.B(this.f137260a, this.f137261b, this.f137262c, this.f137263d, this.f137264e, this.f137265f, false);
        }
    }

    enum e {
        NO_DATA,
        DATA_NOT_SENT,
        MORE_DATA_AVAILABLE,
        FINISHED
    }

    protected class f {

        /* renamed from: a, reason: collision with root package name */
        private File f137273a;

        /* synthetic */ f(g gVar, a aVar) {
            this();
        }

        public boolean a() {
            boolean z10 = false;
            try {
                File file = new File(C14695b.e().d().getCacheDir() + File.separator + "Write.lock");
                boolean zExists = file.exists();
                if (!zExists || g.this.f137239d.c() - file.lastModified() <= l8.b.f93364b) {
                    z10 = zExists;
                } else {
                    file.delete();
                    if (x.f137412b) {
                        z8.f.u(g.f137235v, "Force taking write lock");
                    }
                }
                if (!z10) {
                    try {
                    } catch (IOException e10) {
                        if (x.f137412b) {
                            z8.f.w(g.f137235v, e10.toString());
                        }
                    }
                    if (file.createNewFile()) {
                        file.deleteOnExit();
                        this.f137273a = file;
                    } else {
                        z10 = true;
                    }
                }
                return !z10;
            } catch (Exception e11) {
                if (x.f137412b) {
                    z8.f.w(g.f137235v, e11.toString());
                }
                return false;
            }
        }

        private f() {
        }

        void b() {
            File file = this.f137273a;
            if (file != null) {
                file.delete();
                this.f137273a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B(m8.q qVar, C14966d c14966d, int i10, boolean z10, long j10, int i11, boolean z11) throws NumberFormatException {
        Exception exc;
        boolean zA;
        try {
            if (C14695b.e().f137218b.get() || C14695b.e().f137217a.get() || !z10) {
                zA = false;
            } else {
                zA = C14698e.a(c14966d);
                if (zA) {
                    try {
                        C14695b.e().f137217a.set(true);
                    } catch (Exception e10) {
                        exc = e10;
                        if (zA) {
                            C14695b.e().f137217a.set(false);
                        }
                        if (x.f137412b) {
                            D("data request failed", exc);
                        }
                        z(exc);
                        return false;
                    }
                }
            }
            m8.q qVarG = this.f137237b.g(qVar, c14966d.a(), i10, j10, i11, z11);
            if (zA) {
                C14695b.e().h(true);
                C14695b.e().f137217a.set(false);
            }
            w(qVarG);
            return true;
        } catch (Exception e11) {
            exc = e11;
            zA = false;
        }
    }

    private void v(p8.b bVar, m8.q qVar) {
        h hVar;
        u(bVar, qVar, true);
        if (this.f137248m == null || (hVar = this.f137249n) == null) {
            return;
        }
        hVar.g(true, false);
    }

    private void w(m8.q qVar) {
        h hVar;
        u(null, qVar, true);
        if (this.f137248m == null || (hVar = this.f137249n) == null) {
            return;
        }
        hVar.g(true, false);
    }

    synchronized void I(boolean z10) {
        h hVar;
        try {
            if (this.f137248m != null) {
                return;
            }
            if (z10 || (hVar = this.f137249n) == null) {
                this.f137249n = new h(3);
            } else {
                hVar.j();
            }
            Timer timer = new Timer(f137235v);
            this.f137248m = timer;
            timer.schedule(new b(), this.f137250o ? 0L : 100L, 10000L);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected synchronized void K() {
        try {
            Timer timer = this.f137248m;
            if (timer != null) {
                timer.cancel();
                this.f137248m.purge();
            }
            this.f137248m = null;
            this.f137252q.e();
            h hVar = this.f137249n;
            if (hVar != null) {
                hVar.c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f137257a;

        static {
            int[] iArr = new int[e.values().length];
            f137257a = iArr;
            try {
                iArr[e.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137257a[e.MORE_DATA_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f137257a[e.DATA_NOT_SENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f137257a[e.NO_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void A(boolean z10) {
        h hVar;
        this.f137246k.set(false);
        if (this.f137248m == null || (hVar = this.f137249n) == null) {
            return;
        }
        hVar.g(false, z10);
    }

    private void D(String str, Exception exc) {
        if (!(exc instanceof UnknownHostException)) {
            z8.f.v(f137235v, str, exc);
            return;
        }
        String str2 = f137235v;
        z8.f.u(str2, str);
        z8.f.u(str2, exc.toString());
    }

    private void L(p8.b bVar) {
        if (x.f137412b) {
            z8.f.u(f137235v, "updateSessionPropertiesForEvents");
        }
        C16611b.e().b();
        this.f137236a.i(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(boolean z10) throws NumberFormatException {
        if (x.f137412b) {
            z8.f.u(f137235v, String.format("EventSender active ... mForceSendEvent=%b mForceUemUpdate=%b", Boolean.valueOf(this.f137245j.get()), Boolean.valueOf(this.f137244i.get())));
        }
        m8.q qVarF = C14695b.e().f();
        if (!z10) {
            this.f137236a.e(this.f137239d.c(), qVarF.C());
            return;
        }
        p8.b bVarB = p8.b.b();
        if (!bVarB.n() || !this.f137245j.compareAndSet(true, false)) {
            if (this.f137244i.get()) {
                s(qVarF, bVarB);
                return;
            } else {
                if (bVarB.n() || !this.f137245j.get()) {
                    return;
                }
                s(qVarF, bVarB);
                return;
            }
        }
        int i10 = a.f137257a[F(qVarF, bVarB.f156193b).ordinal()];
        if (i10 == 1) {
            y(qVarF);
            return;
        }
        if (i10 == 2) {
            this.f137245j.set(true);
            y(qVarF);
        } else if (i10 == 3) {
            this.f137245j.set(true);
        } else if (i10 == 4 && this.f137244i.get()) {
            s(qVarF, bVarB);
        }
    }

    private void s(m8.q qVar, p8.b bVar) throws NumberFormatException {
        this.f137236a.e(this.f137239d.c(), qVar.C());
        boolean zN = true;
        try {
            v(bVar, this.f137237b.f(qVar, !bVar.n(), C14695b.e().f137219c, bVar));
            zN = p8.b.b().n();
        } catch (Exception e10) {
            if (x.f137412b) {
                D("beacon request failed", e10);
            }
            z(e10);
        }
        if (zN) {
            this.f137244i.set(false);
        }
        if (x.f137412b) {
            z8.f.u(f137235v, String.format("UEM state update: UEM state: %b mForceUemUpdate: %b", Boolean.valueOf(this.f137246k.get()), Boolean.valueOf(this.f137244i.get())));
        }
    }

    private void u(p8.b bVar, m8.q qVar, boolean z10) {
        InterfaceC15473a interfaceC15473a;
        synchronized (this.f137241f) {
            try {
                m8.q qVarF = C14695b.e().f();
                if (qVar.A() < qVarF.A()) {
                    z8.f.a("dtxLegacyCommunication", "discard too old configuration");
                    return;
                }
                boolean z11 = false;
                this.f137246k.set(qVar.D() && (this.f137243h instanceof a.Enabled));
                if (qVar.z() != q.c.ERROR) {
                    C14695b.e().f137220d.o(qVar);
                } else if (x.f137412b) {
                    z8.f.u(f137235v, "Received faulty settings that will turn the agent off");
                }
                l.g(qVar);
                qVar.A();
                qVarF.A();
                if (z10 && (interfaceC15473a = this.f137254s) != null) {
                    interfaceC15473a.a(qVar);
                }
                if (bVar == null || bVar.n()) {
                    return;
                }
                synchronized (this.f137242g) {
                    try {
                        if (!bVar.n()) {
                            bVar.k(qVar);
                            z11 = true;
                        }
                    } finally {
                    }
                }
                if (z11) {
                    if (bVar.m()) {
                        L(bVar);
                    } else {
                        this.f137236a.b(bVar.f156193b, bVar.f156194c);
                    }
                    l.o(bVar);
                }
            } finally {
            }
        }
    }

    private void z(Exception exc) throws NumberFormatException {
        List<String> list;
        if (exc instanceof InvalidResponseException) {
            C14965c c14965cA = ((InvalidResponseException) exc).a();
            if (c14965cA.f140191a == 429 && (list = c14965cA.f140194d.get("Retry-After")) != null && !list.isEmpty()) {
                try {
                    int i10 = Integer.parseInt(list.get(0));
                    this.f137246k.set(false);
                    C16611b.e().b();
                    l.f137295i.a();
                    h hVar = this.f137249n;
                    if (hVar != null) {
                        hVar.h(i10);
                        return;
                    }
                } catch (NumberFormatException e10) {
                    if (x.f137412b) {
                        z8.f.x(f137235v, "can't parse Retry-After header", e10);
                    }
                }
            }
        }
        A(false);
    }

    boolean C() {
        return this.f137246k.get();
    }

    boolean E(p pVar, int i10, p8.b bVar, int i11) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pVar.b().toString());
        C14966d c14966d = new C14966d(l.n(pVar.f137331h) + this.f137238c.a(bVar.f156192a, i11, bVar.f156197f), arrayList);
        boolean z10 = Thread.currentThread() == Looper.getMainLooper().getThread();
        boolean z11 = pVar.j() == 0;
        m8.q qVarF = C14695b.e().f();
        if (!z10) {
            return B(qVarF, c14966d, i10, z11, bVar.f156193b, bVar.f156194c, false);
        }
        d dVar = new d(this, qVarF, c14966d, i10, z11, bVar.f156193b, bVar.f156194c, null);
        dVar.start();
        try {
            dVar.join(5000L);
        } catch (InterruptedException e10) {
            if (x.f137412b) {
                z8.f.x(f137235v, "crash reporting thread problem", e10);
            }
        }
        return dVar.b();
    }

    e F(m8.q qVar, long j10) {
        e eVar;
        String str;
        StringBuilder sb2;
        if (!this.f137240e.a()) {
            return e.NO_DATA;
        }
        try {
            long jC = this.f137239d.c();
            if (x.f137412b) {
                z8.f.u(f137235v, "sendMonitoringData begin @" + jC);
            }
            C16611b.e().b();
            this.f137236a.e(jC, qVar.C());
            if (qVar.C()) {
                this.f137236a.d(qVar.s());
            }
            C16613d c16613dG = this.f137236a.g(qVar.H(), this.f137238c, jC);
            if (c16613dG == null) {
                eVar = e.NO_DATA;
                if (x.f137412b) {
                    str = f137235v;
                    sb2 = new StringBuilder();
                    sb2.append("sendMonitoringData end @");
                    sb2.append(this.f137239d.c());
                    z8.f.u(str, sb2.toString());
                }
            } else {
                boolean z10 = !c16613dG.f158076g;
                long j11 = c16613dG.f158070a;
                if (B(qVar, c16613dG.f158075f, c16613dG.f158073d, j11 == j10, j11, c16613dG.f158071b, z10)) {
                    this.f137236a.f(c16613dG);
                    eVar = c16613dG.f158076g ? e.FINISHED : e.MORE_DATA_AVAILABLE;
                    if (x.f137412b) {
                        str = f137235v;
                        sb2 = new StringBuilder();
                        sb2.append("sendMonitoringData end @");
                        sb2.append(this.f137239d.c());
                        z8.f.u(str, sb2.toString());
                    }
                } else {
                    eVar = e.DATA_NOT_SENT;
                    if (x.f137412b) {
                        str = f137235v;
                        sb2 = new StringBuilder();
                        sb2.append("sendMonitoringData end @");
                        sb2.append(this.f137239d.c());
                        z8.f.u(str, sb2.toString());
                    }
                }
            }
            this.f137240e.b();
            return eVar;
        } catch (Throwable th2) {
            if (x.f137412b) {
                z8.f.u(f137235v, "sendMonitoringData end @" + this.f137239d.c());
            }
            this.f137240e.b();
            throw th2;
        }
    }

    protected void G(long j10) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = this.f137253r;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdownNow();
        }
        this.f137246k.set(false);
        Thread thread = this.f137247l;
        if (x.f137412b) {
            z8.f.u(f137235v, String.format("Shutdown allocated time: %s ms threadId=%s", Long.valueOf(j10), Long.valueOf(z8.f.h(thread))));
        }
        long jC = this.f137239d.c();
        synchronized (thread) {
            try {
                if (this.f137256u) {
                    z8.f.a("dtxLegacyCommunication", "cannot flush events while still waiting for BPv4 configuration");
                } else {
                    this.f137245j.set(true);
                }
                this.f137250o = false;
                thread.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (thread.isAlive()) {
            try {
                thread.join(j10);
            } catch (InterruptedException e10) {
                if (x.f137412b) {
                    z8.f.x(f137235v, String.format("Thread to send final events Interrupted, allotted time: %s ms", Long.valueOf(j10)), e10);
                }
            }
            if (thread.isAlive() && x.f137412b) {
                z8.f.w(f137235v, String.format("Thread to send final events didn't complete in allotted time:%s ms", Long.valueOf(j10)));
            }
        }
        this.f137237b.e();
        this.f137256u = true;
        if (x.f137412b) {
            z8.f.u(f137235v, String.format("Shutdown took: %s ms threadID=%s", Long.valueOf(this.f137239d.c() - jC), Long.valueOf(z8.f.h(thread))));
        }
    }

    void H(p8.b bVar) {
        if (this.f137256u) {
            z8.f.a("dtxLegacyCommunication", "startNewSession: waiting for the GET request executed via BPv4");
        } else {
            this.f137244i.set(bVar.m());
        }
    }

    void J(C16610a c16610a, C15689d c15689d, InterfaceC14696c interfaceC14696c, InterfaceC15473a interfaceC15473a) {
        this.f137254s = interfaceC15473a;
        this.f137236a = c16610a;
        c15689d.getClass();
        boolean zE = C14695b.e().f().E();
        this.f137255t = zE;
        if (!zE) {
            this.f137256u = false;
        }
        this.f137237b = new C14967e(new C14963a(c15689d), c15689d, new m8.r(c15689d.f150765b));
        Thread thread = this.f137247l;
        if (thread != null && thread.isAlive()) {
            try {
                this.f137247l.interrupt();
            } catch (Exception e10) {
                if (x.f137412b) {
                    z8.f.x(f137235v, "event sender thread problem", e10);
                }
            }
        }
        c cVar = new c(this, null);
        this.f137247l = cVar;
        cVar.start();
        this.f137246k.set(true);
    }

    protected void r() {
        if (this.f137256u) {
            z8.f.a("dtxLegacyCommunication", "cannot flush events while still waiting for BPv4 configuration");
            return;
        }
        synchronized (this.f137247l) {
            this.f137245j.set(true);
            this.f137247l.notify();
        }
    }

    public void t(A7.a aVar) {
        this.f137243h = aVar;
        this.f137246k.set((aVar instanceof a.Enabled) && C14695b.e().f().D());
        z8.f.a("dtxLegacyCommunication", "applied AgentState: " + aVar + " mUemActive: " + this.f137246k.get());
    }

    g(i8.f fVar) {
        this.f137252q = fVar;
    }

    private void y(m8.q qVar) throws NumberFormatException {
        p8.b bVarB = p8.b.b();
        if (bVarB.n()) {
            this.f137244i.set(false);
        } else if (this.f137244i.get()) {
            s(qVar, bVarB);
        }
    }

    public void x(m8.q qVar) {
        u(p8.b.b(), qVar, false);
        if (this.f137256u && this.f137248m != null && this.f137249n != null) {
            z8.f.a("dtxLegacyCommunication", "config received from OneAgent, notify connection state: connected == true, restartTimer == false");
            this.f137249n.g(true, false);
        }
        this.f137256u = false;
    }
}
