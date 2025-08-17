package androidx.media3.exoplayer.drm;

import a3.C5569i;
import a3.o;
import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.drm.m;
import androidx.media3.exoplayer.upstream.b;
import d3.C13466a;
import d3.C13478m;
import d3.InterfaceC13477l;
import d3.P;
import d3.r;
import g3.InterfaceC14195b;
import i3.E1;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import k3.t;

/* loaded from: classes.dex */
class DefaultDrmSession implements DrmSession {

    /* renamed from: a, reason: collision with root package name */
    public final List<o.b> f56020a;

    /* renamed from: b, reason: collision with root package name */
    private final m f56021b;

    /* renamed from: c, reason: collision with root package name */
    private final a f56022c;

    /* renamed from: d, reason: collision with root package name */
    private final b f56023d;

    /* renamed from: e, reason: collision with root package name */
    private final int f56024e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f56025f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f56026g;

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, String> f56027h;

    /* renamed from: i, reason: collision with root package name */
    private final C13478m<h.a> f56028i;

    /* renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f56029j;

    /* renamed from: k, reason: collision with root package name */
    private final E1 f56030k;

    /* renamed from: l, reason: collision with root package name */
    private final p f56031l;

    /* renamed from: m, reason: collision with root package name */
    private final UUID f56032m;

    /* renamed from: n, reason: collision with root package name */
    private final Looper f56033n;

    /* renamed from: o, reason: collision with root package name */
    private final e f56034o;

    /* renamed from: p, reason: collision with root package name */
    private int f56035p;

    /* renamed from: q, reason: collision with root package name */
    private int f56036q;

    /* renamed from: r, reason: collision with root package name */
    private HandlerThread f56037r;

    /* renamed from: s, reason: collision with root package name */
    private c f56038s;

    /* renamed from: t, reason: collision with root package name */
    private InterfaceC14195b f56039t;

    /* renamed from: u, reason: collision with root package name */
    private DrmSession.DrmSessionException f56040u;

    /* renamed from: v, reason: collision with root package name */
    private byte[] f56041v;

    /* renamed from: w, reason: collision with root package name */
    private byte[] f56042w;

    /* renamed from: x, reason: collision with root package name */
    private m.a f56043x;

    /* renamed from: y, reason: collision with root package name */
    private m.d f56044y;

    public interface a {
        void a(Exception exc, boolean z10);

        void b();

        void c(DefaultDrmSession defaultDrmSession);
    }

    public interface b {
        void a(DefaultDrmSession defaultDrmSession, int i10);

        void b(DefaultDrmSession defaultDrmSession, int i10);
    }

    @SuppressLint({"HandlerLeak"})
    private class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private boolean f56045a;

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f56045a = true;
        }

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            d dVar = (d) message.obj;
            if (!dVar.f56048b) {
                return false;
            }
            int i10 = dVar.f56051e + 1;
            dVar.f56051e = i10;
            if (i10 > DefaultDrmSession.this.f56029j.b(3)) {
                return false;
            }
            long jA = DefaultDrmSession.this.f56029j.a(new b.a(new p3.i(dVar.f56047a, mediaDrmCallbackException.f56096a, mediaDrmCallbackException.f56097b, mediaDrmCallbackException.f56098c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f56049c, mediaDrmCallbackException.f56099d), new p3.j(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), dVar.f56051e));
            if (jA == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f56045a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jA);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(p3.i.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Throwable thB;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    thB = DefaultDrmSession.this.f56031l.b(DefaultDrmSession.this.f56032m, (m.d) dVar.f56050d);
                } else {
                    if (i10 != 2) {
                        throw new RuntimeException();
                    }
                    thB = DefaultDrmSession.this.f56031l.a(DefaultDrmSession.this.f56032m, (m.a) dVar.f56050d);
                }
            } catch (MediaDrmCallbackException e10) {
                boolean zA = a(message, e10);
                thB = e10;
                if (zA) {
                    return;
                }
            } catch (Exception e11) {
                r.j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                thB = e11;
            }
            DefaultDrmSession.this.f56029j.c(dVar.f56047a);
            synchronized (this) {
                try {
                    if (!this.f56045a) {
                        DefaultDrmSession.this.f56034o.obtainMessage(message.what, Pair.create(dVar.f56050d, thB)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 1) {
                DefaultDrmSession.this.C(obj, obj2);
            } else {
                if (i10 != 2) {
                    return;
                }
                DefaultDrmSession.this.w(obj, obj2);
            }
        }
    }

    private boolean G() {
        try {
            this.f56021b.d(this.f56041v, this.f56042w);
            return true;
        } catch (Exception | NoSuchMethodError e10) {
            v(e10, 1);
            return false;
        }
    }

    void z(int i10) {
        if (i10 != 2) {
            return;
        }
        y();
    }

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th2) {
            super(th2);
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f56047a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f56048b;

        /* renamed from: c, reason: collision with root package name */
        public final long f56049c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f56050d;

        /* renamed from: e, reason: collision with root package name */
        public int f56051e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f56047a = j10;
            this.f56048b = z10;
            this.f56049c = j11;
            this.f56050d = obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C(Object obj, Object obj2) {
        if (obj == this.f56044y) {
            if (this.f56035p == 2 || u()) {
                this.f56044y = null;
                if (obj2 instanceof Exception) {
                    this.f56022c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f56021b.e((byte[]) obj2);
                    this.f56022c.b();
                } catch (Exception e10) {
                    this.f56022c.a(e10, true);
                }
            }
        }
    }

    private void E(byte[] bArr, int i10, boolean z10) {
        try {
            this.f56043x = this.f56021b.m(bArr, this.f56020a, i10, this.f56027h);
            ((c) P.h(this.f56038s)).b(2, C13466a.e(this.f56043x), z10);
        } catch (Exception | NoSuchMethodError e10) {
            x(e10, true);
        }
    }

    private void q(InterfaceC13477l<h.a> interfaceC13477l) {
        Iterator<h.a> it = this.f56028i.V1().iterator();
        while (it.hasNext()) {
            interfaceC13477l.accept(it.next());
        }
    }

    private void r(boolean z10) {
        if (this.f56026g) {
            return;
        }
        byte[] bArr = (byte[]) P.h(this.f56041v);
        int i10 = this.f56024e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f56042w == null || G()) {
                    E(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            C13466a.e(this.f56042w);
            C13466a.e(this.f56041v);
            E(this.f56042w, 3, z10);
            return;
        }
        if (this.f56042w == null) {
            E(bArr, 1, z10);
            return;
        }
        if (this.f56035p == 4 || G()) {
            long jS = s();
            if (this.f56024e != 0 || jS > 60) {
                if (jS <= 0) {
                    v(new KeysExpiredException(), 2);
                    return;
                } else {
                    this.f56035p = 4;
                    q(new InterfaceC13477l() { // from class: k3.c
                        @Override // d3.InterfaceC13477l
                        public final void accept(Object obj) {
                            ((h.a) obj).j();
                        }
                    });
                    return;
                }
            }
            r.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jS);
            E(bArr, 2, z10);
        }
    }

    private long s() {
        if (!C5569i.f43835d.equals(this.f56032m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) C13466a.e(t.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean u() {
        int i10 = this.f56035p;
        return i10 == 3 || i10 == 4;
    }

    private void v(final Throwable th2, int i10) {
        this.f56040u = new DrmSession.DrmSessionException(th2, j.b(th2, i10));
        r.e("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            q(new InterfaceC13477l() { // from class: androidx.media3.exoplayer.drm.c
                @Override // d3.InterfaceC13477l
                public final void accept(Object obj) {
                    ((h.a) obj).l((Exception) th2);
                }
            });
        } else {
            if (!(th2 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th2);
            }
            if (!j.e(th2) && !j.d(th2)) {
                throw ((Error) th2);
            }
        }
        if (this.f56035p != 4) {
            this.f56035p = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(Object obj, Object obj2) {
        if (obj == this.f56043x && u()) {
            this.f56043x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                x((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f56024e == 3) {
                    this.f56021b.j((byte[]) P.h(this.f56042w), bArr);
                    q(new InterfaceC13477l() { // from class: k3.a
                        @Override // d3.InterfaceC13477l
                        public final void accept(Object obj3) {
                            ((h.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] bArrJ = this.f56021b.j(this.f56041v, bArr);
                int i10 = this.f56024e;
                if ((i10 == 2 || (i10 == 0 && this.f56042w != null)) && bArrJ != null && bArrJ.length != 0) {
                    this.f56042w = bArrJ;
                }
                this.f56035p = 4;
                q(new InterfaceC13477l() { // from class: k3.b
                    @Override // d3.InterfaceC13477l
                    public final void accept(Object obj3) {
                        ((h.a) obj3).h();
                    }
                });
            } catch (Exception e10) {
                e = e10;
                x(e, true);
            } catch (NoSuchMethodError e11) {
                e = e11;
                x(e, true);
            }
        }
    }

    private void x(Throwable th2, boolean z10) {
        if ((th2 instanceof NotProvisionedException) || j.d(th2)) {
            this.f56022c.c(this);
        } else {
            v(th2, z10 ? 1 : 2);
        }
    }

    private void y() {
        if (this.f56024e == 0 && this.f56035p == 4) {
            P.h(this.f56041v);
            r(false);
        }
    }

    void B(Exception exc, boolean z10) {
        v(exc, z10 ? 1 : 3);
    }

    void F() {
        this.f56044y = this.f56021b.b();
        ((c) P.h(this.f56038s)).b(1, C13466a.e(this.f56044y), true);
    }

    public DefaultDrmSession(UUID uuid, m mVar, a aVar, b bVar, List<o.b> list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap<String, String> map, p pVar, Looper looper, androidx.media3.exoplayer.upstream.b bVar2, E1 e12) {
        if (i10 == 1 || i10 == 3) {
            C13466a.e(bArr);
        }
        this.f56032m = uuid;
        this.f56022c = aVar;
        this.f56023d = bVar;
        this.f56021b = mVar;
        this.f56024e = i10;
        this.f56025f = z10;
        this.f56026g = z11;
        if (bArr != null) {
            this.f56042w = bArr;
            this.f56020a = null;
        } else {
            this.f56020a = Collections.unmodifiableList((List) C13466a.e(list));
        }
        this.f56027h = map;
        this.f56031l = pVar;
        this.f56028i = new C13478m<>();
        this.f56029j = bVar2;
        this.f56030k = e12;
        this.f56035p = 2;
        this.f56033n = looper;
        this.f56034o = new e(looper);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean D() {
        /*
            r4 = this;
            boolean r0 = r4.u()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            androidx.media3.exoplayer.drm.m r0 = r4.f56021b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r0.c()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f56041v = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            androidx.media3.exoplayer.drm.m r2 = r4.f56021b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            i3.E1 r3 = r4.f56030k     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.l(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            androidx.media3.exoplayer.drm.m r0 = r4.f56021b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r2 = r4.f56041v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            g3.b r0 = r0.g(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.f56039t = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r0 = 3
            r4.f56035p = r0     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            androidx.media3.exoplayer.drm.b r2 = new androidx.media3.exoplayer.drm.b     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r2.<init>()     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            r4.q(r2)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            byte[] r0 = r4.f56041v     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            d3.C13466a.e(r0)     // Catch: java.lang.NoSuchMethodError -> L32 java.lang.Exception -> L34 android.media.NotProvisionedException -> L45
            return r1
        L32:
            r0 = move-exception
            goto L35
        L34:
            r0 = move-exception
        L35:
            boolean r2 = androidx.media3.exoplayer.drm.j.d(r0)
            if (r2 == 0) goto L41
            androidx.media3.exoplayer.drm.DefaultDrmSession$a r0 = r4.f56022c
            r0.c(r4)
            goto L4a
        L41:
            r4.v(r0, r1)
            goto L4a
        L45:
            androidx.media3.exoplayer.drm.DefaultDrmSession$a r0 = r4.f56022c
            r0.c(r4)
        L4a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.DefaultDrmSession.D():boolean");
    }

    private void H() {
        if (Thread.currentThread() != this.f56033n.getThread()) {
            r.j("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f56033n.getThread().getName(), new IllegalStateException());
        }
    }

    void A() {
        if (D()) {
            r(true);
        }
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID a() {
        H();
        return this.f56032m;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean b() {
        H();
        return this.f56025f;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final InterfaceC14195b d() {
        H();
        return this.f56039t;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void e(h.a aVar) {
        H();
        boolean z10 = false;
        if (this.f56036q < 0) {
            r.d("DefaultDrmSession", "Session reference count less than zero: " + this.f56036q);
            this.f56036q = 0;
        }
        if (aVar != null) {
            this.f56028i.a(aVar);
        }
        int i10 = this.f56036q + 1;
        this.f56036q = i10;
        if (i10 == 1) {
            if (this.f56035p == 2) {
                z10 = true;
            }
            C13466a.g(z10);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f56037r = handlerThread;
            handlerThread.start();
            this.f56038s = new c(this.f56037r.getLooper());
            if (D()) {
                r(true);
            }
        } else if (aVar != null && u() && this.f56028i.e(aVar) == 1) {
            aVar.k(this.f56035p);
        }
        this.f56023d.a(this, this.f56036q);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public Map<String, String> f() {
        H();
        byte[] bArr = this.f56041v;
        if (bArr == null) {
            return null;
        }
        return this.f56021b.a(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void g(h.a aVar) {
        H();
        int i10 = this.f56036q;
        if (i10 <= 0) {
            r.d("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f56036q = i11;
        if (i11 == 0) {
            this.f56035p = 0;
            ((e) P.h(this.f56034o)).removeCallbacksAndMessages(null);
            ((c) P.h(this.f56038s)).c();
            this.f56038s = null;
            ((HandlerThread) P.h(this.f56037r)).quit();
            this.f56037r = null;
            this.f56039t = null;
            this.f56040u = null;
            this.f56043x = null;
            this.f56044y = null;
            byte[] bArr = this.f56041v;
            if (bArr != null) {
                this.f56021b.i(bArr);
                this.f56041v = null;
            }
        }
        if (aVar != null) {
            this.f56028i.f(aVar);
            if (this.f56028i.e(aVar) == 0) {
                aVar.m();
            }
        }
        this.f56023d.b(this, this.f56036q);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        H();
        if (this.f56035p == 1) {
            return this.f56040u;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        H();
        return this.f56035p;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean h(String str) {
        H();
        return this.f56021b.h((byte[]) C13466a.i(this.f56041v), str);
    }

    public boolean t(byte[] bArr) {
        H();
        return Arrays.equals(this.f56041v, bArr);
    }
}
