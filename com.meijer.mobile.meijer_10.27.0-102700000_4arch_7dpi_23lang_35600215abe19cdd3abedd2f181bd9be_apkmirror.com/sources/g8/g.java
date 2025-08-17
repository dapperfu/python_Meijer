package g8;

import android.os.Looper;
import com.dynatrace.android.agent.comm.InvalidResponseException;
import com.medallia.digital.mobilesdk.l8;
import g8.C14222e;
import h8.C14385a;
import h8.C14387c;
import h8.C14388d;
import h8.C14389e;
import j8.InterfaceC14874a;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import k8.C15118d;
import k8.q;
import o8.C16002a;
import o8.C16003b;
import o8.C16005d;
import u8.C17233a;
import y7.AbstractC18186a;

/* loaded from: classes4.dex */
public class g {

    /* renamed from: v, reason: collision with root package name */
    private static final String f133019v = x.f133195a + "CommunicationManager";

    /* renamed from: a, reason: collision with root package name */
    protected C16002a f133020a;

    /* renamed from: b, reason: collision with root package name */
    C14389e f133021b;

    /* renamed from: l, reason: collision with root package name */
    private Thread f133031l;

    /* renamed from: m, reason: collision with root package name */
    private Timer f133032m;

    /* renamed from: n, reason: collision with root package name */
    private h f133033n;

    /* renamed from: q, reason: collision with root package name */
    private g8.f f133036q;

    /* renamed from: r, reason: collision with root package name */
    private ThreadPoolExecutor f133037r;

    /* renamed from: c, reason: collision with root package name */
    C14222e.a f133022c = new C14222e.a();

    /* renamed from: d, reason: collision with root package name */
    C14217B f133023d = C14217B.f132991c;

    /* renamed from: f, reason: collision with root package name */
    private final Object f133025f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final Object f133026g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private AbstractC18186a f133027h = new AbstractC18186a.Enabled(false);

    /* renamed from: i, reason: collision with root package name */
    private AtomicBoolean f133028i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    private AtomicBoolean f133029j = new AtomicBoolean(false);

    /* renamed from: k, reason: collision with root package name */
    private AtomicBoolean f133030k = new AtomicBoolean(false);

    /* renamed from: o, reason: collision with root package name */
    private boolean f133034o = false;

    /* renamed from: p, reason: collision with root package name */
    private long f133035p = 0;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC14874a f133038s = null;

    /* renamed from: t, reason: collision with root package name */
    private boolean f133039t = false;

    /* renamed from: u, reason: collision with root package name */
    private volatile boolean f133040u = true;

    /* renamed from: e, reason: collision with root package name */
    private f f133024e = new f(this, null);

    class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (g.this.f133033n == null) {
                if (x.f133196b) {
                    x8.f.u(g.f133019v, "invalid DataSendTimerTask appeared");
                }
                g.this.K();
                return;
            }
            if (!g.this.f133033n.f() && !g.this.f133030k.get()) {
                g.this.K();
                l.w(99L);
                g.this.f133033n = null;
                return;
            }
            long jC = g.this.f133023d.c() - g.this.f133035p;
            if (g.this.f133033n.i()) {
                g.this.f133028i.set(g.this.f133033n.e());
                if (!g.this.f133028i.get()) {
                    if (x.f133196b) {
                        x8.f.u(g.f133019v, String.format("ReconnWait: mUemActive=%b lastCheck=%ds ago", Boolean.valueOf(g.this.f133030k.get()), Long.valueOf(jC / 1000)));
                        return;
                    }
                    return;
                }
            }
            if (jC >= 7200000 && !g.this.f133039t) {
                g.this.f133028i.set(true);
            }
            if (!g.this.f133028i.get()) {
                if (g.this.f133040u) {
                    x8.f.a("dtxLegacyCommunication", "taskTimer: keep waiting for the GET request executed via BPv4");
                } else {
                    g.this.f133028i.set(g.this.f133033n.e() && n8.b.b().m());
                }
            }
            if (x.f133196b) {
                x8.f.u(g.f133019v, String.format("TaskTimer mForceUemUpdate=%b mUemActive=%b waitingForInitialBPv4Config=%b", Boolean.valueOf(g.this.f133028i.get()), Boolean.valueOf(g.this.f133030k.get()), Boolean.valueOf(g.this.f133040u)));
            }
            if (g.this.f133030k.get() || g.this.f133028i.get()) {
                if (!g.this.f133040u) {
                    if (g.this.f133036q.d()) {
                        g.this.f133029j.set(true);
                    }
                    if (p.f133106s.get() == 1) {
                        g.this.f133029j.set(true);
                        p.f133106s.set(2);
                    }
                }
                if (x.f133196b) {
                    x8.f.u(g.f133019v, String.format("TaskTimer mForceSendEvent=%s thread ID=%d", Boolean.valueOf(g.this.f133029j.get()), Long.valueOf(x8.f.h(g.this.f133031l))));
                }
                if (g.this.f133029j.get() || g.this.f133028i.get()) {
                    synchronized (g.this.f133031l) {
                        g.this.f133031l.notify();
                    }
                    g gVar = g.this;
                    gVar.f133035p = gVar.f133023d.c();
                }
            }
        }
    }

    private class c extends Thread {
        /* synthetic */ c(g gVar, a aVar) {
            this();
        }

        private c() {
            super(x.f133195a + "EventSenderThread");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            boolean z10;
            g.this.f133034o = true;
            do {
                try {
                    synchronized (this) {
                        try {
                            if (!g.this.f133034o) {
                                return;
                            }
                            wait();
                            z10 = g.this.f133034o;
                            g.this.q(C17233a.h().m());
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e10) {
                    if (x.f133196b) {
                        x8.f.v(g.f133019v, e10.getMessage(), e10);
                        return;
                    }
                    return;
                }
            } while (z10);
        }
    }

    private class d extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final k8.q f133044a;

        /* renamed from: b, reason: collision with root package name */
        private final C14388d f133045b;

        /* renamed from: c, reason: collision with root package name */
        private final int f133046c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f133047d;

        /* renamed from: e, reason: collision with root package name */
        private final long f133048e;

        /* renamed from: f, reason: collision with root package name */
        private final int f133049f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f133050g;

        /* synthetic */ d(g gVar, k8.q qVar, C14388d c14388d, int i10, boolean z10, long j10, int i11, a aVar) {
            this(qVar, c14388d, i10, z10, j10, i11);
        }

        private d(k8.q qVar, C14388d c14388d, int i10, boolean z10, long j10, int i11) {
            this.f133050g = false;
            setName("POST CrashReport");
            this.f133044a = qVar;
            this.f133045b = c14388d;
            this.f133046c = i10;
            this.f133047d = z10;
            this.f133048e = j10;
            this.f133049f = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            return this.f133050g;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f133050g = g.this.B(this.f133044a, this.f133045b, this.f133046c, this.f133047d, this.f133048e, this.f133049f, false);
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
        private File f133057a;

        /* synthetic */ f(g gVar, a aVar) {
            this();
        }

        public boolean a() {
            boolean z10 = false;
            try {
                File file = new File(C14219b.e().d().getCacheDir() + File.separator + "Write.lock");
                boolean zExists = file.exists();
                if (!zExists || g.this.f133023d.c() - file.lastModified() <= l8.b.f92525b) {
                    z10 = zExists;
                } else {
                    file.delete();
                    if (x.f133196b) {
                        x8.f.u(g.f133019v, "Force taking write lock");
                    }
                }
                if (!z10) {
                    try {
                    } catch (IOException e10) {
                        if (x.f133196b) {
                            x8.f.w(g.f133019v, e10.toString());
                        }
                    }
                    if (file.createNewFile()) {
                        file.deleteOnExit();
                        this.f133057a = file;
                    } else {
                        z10 = true;
                    }
                }
                return !z10;
            } catch (Exception e11) {
                if (x.f133196b) {
                    x8.f.w(g.f133019v, e11.toString());
                }
                return false;
            }
        }

        private f() {
        }

        void b() {
            File file = this.f133057a;
            if (file != null) {
                file.delete();
                this.f133057a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B(k8.q qVar, C14388d c14388d, int i10, boolean z10, long j10, int i11, boolean z11) throws NumberFormatException {
        Exception exc;
        boolean zA;
        try {
            if (C14219b.e().f133002b.get() || C14219b.e().f133001a.get() || !z10) {
                zA = false;
            } else {
                zA = C14222e.a(c14388d);
                if (zA) {
                    try {
                        C14219b.e().f133001a.set(true);
                    } catch (Exception e10) {
                        exc = e10;
                        if (zA) {
                            C14219b.e().f133001a.set(false);
                        }
                        if (x.f133196b) {
                            D("data request failed", exc);
                        }
                        z(exc);
                        return false;
                    }
                }
            }
            k8.q qVarG = this.f133021b.g(qVar, c14388d.a(), i10, j10, i11, z11);
            if (zA) {
                C14219b.e().h(true);
                C14219b.e().f133001a.set(false);
            }
            w(qVarG);
            return true;
        } catch (Exception e11) {
            exc = e11;
            zA = false;
        }
    }

    private void v(n8.b bVar, k8.q qVar) {
        h hVar;
        u(bVar, qVar, true);
        if (this.f133032m == null || (hVar = this.f133033n) == null) {
            return;
        }
        hVar.g(true, false);
    }

    private void w(k8.q qVar) {
        h hVar;
        u(null, qVar, true);
        if (this.f133032m == null || (hVar = this.f133033n) == null) {
            return;
        }
        hVar.g(true, false);
    }

    synchronized void I(boolean z10) {
        h hVar;
        try {
            if (this.f133032m != null) {
                return;
            }
            if (z10 || (hVar = this.f133033n) == null) {
                this.f133033n = new h(3);
            } else {
                hVar.j();
            }
            Timer timer = new Timer(f133019v);
            this.f133032m = timer;
            timer.schedule(new b(), this.f133034o ? 0L : 100L, 10000L);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    protected synchronized void K() {
        try {
            Timer timer = this.f133032m;
            if (timer != null) {
                timer.cancel();
                this.f133032m.purge();
            }
            this.f133032m = null;
            this.f133036q.e();
            h hVar = this.f133033n;
            if (hVar != null) {
                hVar.c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f133041a;

        static {
            int[] iArr = new int[e.values().length];
            f133041a = iArr;
            try {
                iArr[e.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f133041a[e.MORE_DATA_AVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f133041a[e.DATA_NOT_SENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f133041a[e.NO_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void A(boolean z10) {
        h hVar;
        this.f133030k.set(false);
        if (this.f133032m == null || (hVar = this.f133033n) == null) {
            return;
        }
        hVar.g(false, z10);
    }

    private void D(String str, Exception exc) {
        if (!(exc instanceof UnknownHostException)) {
            x8.f.v(f133019v, str, exc);
            return;
        }
        String str2 = f133019v;
        x8.f.u(str2, str);
        x8.f.u(str2, exc.toString());
    }

    private void L(n8.b bVar) {
        if (x.f133196b) {
            x8.f.u(f133019v, "updateSessionPropertiesForEvents");
        }
        C16003b.e().b();
        this.f133020a.i(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(boolean z10) throws NumberFormatException {
        if (x.f133196b) {
            x8.f.u(f133019v, String.format("EventSender active ... mForceSendEvent=%b mForceUemUpdate=%b", Boolean.valueOf(this.f133029j.get()), Boolean.valueOf(this.f133028i.get())));
        }
        k8.q qVarF = C14219b.e().f();
        if (!z10) {
            this.f133020a.e(this.f133023d.c(), qVarF.C());
            return;
        }
        n8.b bVarB = n8.b.b();
        if (!bVarB.n() || !this.f133029j.compareAndSet(true, false)) {
            if (this.f133028i.get()) {
                s(qVarF, bVarB);
                return;
            } else {
                if (bVarB.n() || !this.f133029j.get()) {
                    return;
                }
                s(qVarF, bVarB);
                return;
            }
        }
        int i10 = a.f133041a[F(qVarF, bVarB.f151062b).ordinal()];
        if (i10 == 1) {
            y(qVarF);
            return;
        }
        if (i10 == 2) {
            this.f133029j.set(true);
            y(qVarF);
        } else if (i10 == 3) {
            this.f133029j.set(true);
        } else if (i10 == 4 && this.f133028i.get()) {
            s(qVarF, bVarB);
        }
    }

    private void s(k8.q qVar, n8.b bVar) throws NumberFormatException {
        this.f133020a.e(this.f133023d.c(), qVar.C());
        boolean zN = true;
        try {
            v(bVar, this.f133021b.f(qVar, !bVar.n(), C14219b.e().f133003c, bVar));
            zN = n8.b.b().n();
        } catch (Exception e10) {
            if (x.f133196b) {
                D("beacon request failed", e10);
            }
            z(e10);
        }
        if (zN) {
            this.f133028i.set(false);
        }
        if (x.f133196b) {
            x8.f.u(f133019v, String.format("UEM state update: UEM state: %b mForceUemUpdate: %b", Boolean.valueOf(this.f133030k.get()), Boolean.valueOf(this.f133028i.get())));
        }
    }

    private void u(n8.b bVar, k8.q qVar, boolean z10) {
        InterfaceC14874a interfaceC14874a;
        synchronized (this.f133025f) {
            try {
                k8.q qVarF = C14219b.e().f();
                if (qVar.A() < qVarF.A()) {
                    x8.f.a("dtxLegacyCommunication", "discard too old configuration");
                    return;
                }
                boolean z11 = false;
                this.f133030k.set(qVar.D() && (this.f133027h instanceof AbstractC18186a.Enabled));
                if (qVar.z() != q.c.ERROR) {
                    C14219b.e().f133004d.o(qVar);
                } else if (x.f133196b) {
                    x8.f.u(f133019v, "Received faulty settings that will turn the agent off");
                }
                l.g(qVar);
                qVar.A();
                qVarF.A();
                if (z10 && (interfaceC14874a = this.f133038s) != null) {
                    interfaceC14874a.a(qVar);
                }
                if (bVar == null || bVar.n()) {
                    return;
                }
                synchronized (this.f133026g) {
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
                        this.f133020a.b(bVar.f151062b, bVar.f151063c);
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
            C14387c c14387cA = ((InvalidResponseException) exc).a();
            if (c14387cA.f134504a == 429 && (list = c14387cA.f134507d.get("Retry-After")) != null && !list.isEmpty()) {
                try {
                    int i10 = Integer.parseInt(list.get(0));
                    this.f133030k.set(false);
                    C16003b.e().b();
                    l.f133079i.a();
                    h hVar = this.f133033n;
                    if (hVar != null) {
                        hVar.h(i10);
                        return;
                    }
                } catch (NumberFormatException e10) {
                    if (x.f133196b) {
                        x8.f.x(f133019v, "can't parse Retry-After header", e10);
                    }
                }
            }
        }
        A(false);
    }

    boolean C() {
        return this.f133030k.get();
    }

    boolean E(p pVar, int i10, n8.b bVar, int i11) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pVar.b().toString());
        C14388d c14388d = new C14388d(l.n(pVar.f133115h) + this.f133022c.a(bVar.f151061a, i11, bVar.f151066f), arrayList);
        boolean z10 = Thread.currentThread() == Looper.getMainLooper().getThread();
        boolean z11 = pVar.j() == 0;
        k8.q qVarF = C14219b.e().f();
        if (!z10) {
            return B(qVarF, c14388d, i10, z11, bVar.f151062b, bVar.f151063c, false);
        }
        d dVar = new d(this, qVarF, c14388d, i10, z11, bVar.f151062b, bVar.f151063c, null);
        dVar.start();
        try {
            dVar.join(5000L);
        } catch (InterruptedException e10) {
            if (x.f133196b) {
                x8.f.x(f133019v, "crash reporting thread problem", e10);
            }
        }
        return dVar.b();
    }

    e F(k8.q qVar, long j10) {
        e eVar;
        String str;
        StringBuilder sb2;
        if (!this.f133024e.a()) {
            return e.NO_DATA;
        }
        try {
            long jC = this.f133023d.c();
            if (x.f133196b) {
                x8.f.u(f133019v, "sendMonitoringData begin @" + jC);
            }
            C16003b.e().b();
            this.f133020a.e(jC, qVar.C());
            if (qVar.C()) {
                this.f133020a.d(qVar.s());
            }
            C16005d c16005dG = this.f133020a.g(qVar.H(), this.f133022c, jC);
            if (c16005dG == null) {
                eVar = e.NO_DATA;
                if (x.f133196b) {
                    str = f133019v;
                    sb2 = new StringBuilder();
                    sb2.append("sendMonitoringData end @");
                    sb2.append(this.f133023d.c());
                    x8.f.u(str, sb2.toString());
                }
            } else {
                boolean z10 = !c16005dG.f153224g;
                long j11 = c16005dG.f153218a;
                if (B(qVar, c16005dG.f153223f, c16005dG.f153221d, j11 == j10, j11, c16005dG.f153219b, z10)) {
                    this.f133020a.f(c16005dG);
                    eVar = c16005dG.f153224g ? e.FINISHED : e.MORE_DATA_AVAILABLE;
                    if (x.f133196b) {
                        str = f133019v;
                        sb2 = new StringBuilder();
                        sb2.append("sendMonitoringData end @");
                        sb2.append(this.f133023d.c());
                        x8.f.u(str, sb2.toString());
                    }
                } else {
                    eVar = e.DATA_NOT_SENT;
                    if (x.f133196b) {
                        str = f133019v;
                        sb2 = new StringBuilder();
                        sb2.append("sendMonitoringData end @");
                        sb2.append(this.f133023d.c());
                        x8.f.u(str, sb2.toString());
                    }
                }
            }
            this.f133024e.b();
            return eVar;
        } catch (Throwable th2) {
            if (x.f133196b) {
                x8.f.u(f133019v, "sendMonitoringData end @" + this.f133023d.c());
            }
            this.f133024e.b();
            throw th2;
        }
    }

    protected void G(long j10) throws InterruptedException {
        ThreadPoolExecutor threadPoolExecutor = this.f133037r;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdownNow();
        }
        this.f133030k.set(false);
        Thread thread = this.f133031l;
        if (x.f133196b) {
            x8.f.u(f133019v, String.format("Shutdown allocated time: %s ms threadId=%s", Long.valueOf(j10), Long.valueOf(x8.f.h(thread))));
        }
        long jC = this.f133023d.c();
        synchronized (thread) {
            try {
                if (this.f133040u) {
                    x8.f.a("dtxLegacyCommunication", "cannot flush events while still waiting for BPv4 configuration");
                } else {
                    this.f133029j.set(true);
                }
                this.f133034o = false;
                thread.notify();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (thread.isAlive()) {
            try {
                thread.join(j10);
            } catch (InterruptedException e10) {
                if (x.f133196b) {
                    x8.f.x(f133019v, String.format("Thread to send final events Interrupted, allotted time: %s ms", Long.valueOf(j10)), e10);
                }
            }
            if (thread.isAlive() && x.f133196b) {
                x8.f.w(f133019v, String.format("Thread to send final events didn't complete in allotted time:%s ms", Long.valueOf(j10)));
            }
        }
        this.f133021b.e();
        this.f133040u = true;
        if (x.f133196b) {
            x8.f.u(f133019v, String.format("Shutdown took: %s ms threadID=%s", Long.valueOf(this.f133023d.c() - jC), Long.valueOf(x8.f.h(thread))));
        }
    }

    void H(n8.b bVar) {
        if (this.f133040u) {
            x8.f.a("dtxLegacyCommunication", "startNewSession: waiting for the GET request executed via BPv4");
        } else {
            this.f133028i.set(bVar.m());
        }
    }

    void J(C16002a c16002a, C15118d c15118d, InterfaceC14220c interfaceC14220c, InterfaceC14874a interfaceC14874a) {
        this.f133038s = interfaceC14874a;
        this.f133020a = c16002a;
        c15118d.getClass();
        boolean zE = C14219b.e().f().E();
        this.f133039t = zE;
        if (!zE) {
            this.f133040u = false;
        }
        this.f133021b = new C14389e(new C14385a(c15118d), c15118d, new k8.r(c15118d.f141619b));
        Thread thread = this.f133031l;
        if (thread != null && thread.isAlive()) {
            try {
                this.f133031l.interrupt();
            } catch (Exception e10) {
                if (x.f133196b) {
                    x8.f.x(f133019v, "event sender thread problem", e10);
                }
            }
        }
        c cVar = new c(this, null);
        this.f133031l = cVar;
        cVar.start();
        this.f133030k.set(true);
    }

    protected void r() {
        if (this.f133040u) {
            x8.f.a("dtxLegacyCommunication", "cannot flush events while still waiting for BPv4 configuration");
            return;
        }
        synchronized (this.f133031l) {
            this.f133029j.set(true);
            this.f133031l.notify();
        }
    }

    public void t(AbstractC18186a abstractC18186a) {
        this.f133027h = abstractC18186a;
        this.f133030k.set((abstractC18186a instanceof AbstractC18186a.Enabled) && C14219b.e().f().D());
        x8.f.a("dtxLegacyCommunication", "applied AgentState: " + abstractC18186a + " mUemActive: " + this.f133030k.get());
    }

    g(g8.f fVar) {
        this.f133036q = fVar;
    }

    private void y(k8.q qVar) throws NumberFormatException {
        n8.b bVarB = n8.b.b();
        if (bVarB.n()) {
            this.f133028i.set(false);
        } else if (this.f133028i.get()) {
            s(qVar, bVarB);
        }
    }

    public void x(k8.q qVar) {
        u(n8.b.b(), qVar, false);
        if (this.f133040u && this.f133032m != null && this.f133033n != null) {
            x8.f.a("dtxLegacyCommunication", "config received from OneAgent, notify connection state: connected == true, restartTimer == false");
            this.f133033n.g(true, false);
        }
        this.f133040u = false;
    }
}
