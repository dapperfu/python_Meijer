package androidx.media3.exoplayer.drm;

import Ee.L;
import Ee.O;
import Ee.s0;
import Ee.y0;
import a3.C5652i;
import a3.o;
import a3.t;
import a3.z;
import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.drm.m;
import d3.C13599a;
import d3.P;
import d3.r;
import i3.E1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public class DefaultDrmSessionManager implements i {

    /* renamed from: b, reason: collision with root package name */
    private final UUID f56277b;

    /* renamed from: c, reason: collision with root package name */
    private final m.c f56278c;

    /* renamed from: d, reason: collision with root package name */
    private final p f56279d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f56280e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f56281f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f56282g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f56283h;

    /* renamed from: i, reason: collision with root package name */
    private final f f56284i;

    /* renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f56285j;

    /* renamed from: k, reason: collision with root package name */
    private final g f56286k;

    /* renamed from: l, reason: collision with root package name */
    private final long f56287l;

    /* renamed from: m, reason: collision with root package name */
    private final List<DefaultDrmSession> f56288m;

    /* renamed from: n, reason: collision with root package name */
    private final Set<e> f56289n;

    /* renamed from: o, reason: collision with root package name */
    private final Set<DefaultDrmSession> f56290o;

    /* renamed from: p, reason: collision with root package name */
    private int f56291p;

    /* renamed from: q, reason: collision with root package name */
    private m f56292q;

    /* renamed from: r, reason: collision with root package name */
    private DefaultDrmSession f56293r;

    /* renamed from: s, reason: collision with root package name */
    private DefaultDrmSession f56294s;

    /* renamed from: t, reason: collision with root package name */
    private Looper f56295t;

    /* renamed from: u, reason: collision with root package name */
    private Handler f56296u;

    /* renamed from: v, reason: collision with root package name */
    private int f56297v;

    /* renamed from: w, reason: collision with root package name */
    private byte[] f56298w;

    /* renamed from: x, reason: collision with root package name */
    private E1 f56299x;

    /* renamed from: y, reason: collision with root package name */
    volatile d f56300y;

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        private boolean f56304d;

        /* renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f56301a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        private UUID f56302b = C5652i.f44653d;

        /* renamed from: c, reason: collision with root package name */
        private m.c f56303c = n.f56350d;

        /* renamed from: e, reason: collision with root package name */
        private int[] f56305e = new int[0];

        /* renamed from: f, reason: collision with root package name */
        private boolean f56306f = true;

        /* renamed from: g, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f56307g = new androidx.media3.exoplayer.upstream.a();

        /* renamed from: h, reason: collision with root package name */
        private long f56308h = 300000;

        public b e(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                C13599a.a(z10);
            }
            this.f56305e = (int[]) iArr.clone();
            return this;
        }

        public DefaultDrmSessionManager a(p pVar) {
            return new DefaultDrmSessionManager(this.f56302b, this.f56303c, pVar, this.f56301a, this.f56304d, this.f56305e, this.f56306f, this.f56307g, this.f56308h);
        }

        public b c(boolean z10) {
            this.f56304d = z10;
            return this;
        }

        public b d(boolean z10) {
            this.f56306f = z10;
            return this;
        }

        public b b(androidx.media3.exoplayer.upstream.b bVar) {
            this.f56307g = (androidx.media3.exoplayer.upstream.b) C13599a.e(bVar);
            return this;
        }

        public b f(UUID uuid, m.c cVar) {
            this.f56302b = (UUID) C13599a.e(uuid);
            this.f56303c = (m.c) C13599a.e(cVar);
            return this;
        }
    }

    private class c implements m.b {
        private c() {
        }

        @Override // androidx.media3.exoplayer.drm.m.b
        public void a(m mVar, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) C13599a.e(DefaultDrmSessionManager.this.f56300y)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f56288m) {
                if (defaultDrmSession.t(bArr)) {
                    defaultDrmSession.z(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements i.b {

        /* renamed from: b, reason: collision with root package name */
        private final h.a f56311b;

        /* renamed from: c, reason: collision with root package name */
        private DrmSession f56312c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f56313d;

        public e(h.a aVar) {
            this.f56311b = aVar;
        }

        public static /* synthetic */ void b(e eVar, t tVar) {
            if (DefaultDrmSessionManager.this.f56291p == 0 || eVar.f56313d) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            eVar.f56312c = defaultDrmSessionManager.t((Looper) C13599a.e(defaultDrmSessionManager.f56295t), eVar.f56311b, tVar, false);
            DefaultDrmSessionManager.this.f56289n.add(eVar);
        }

        public static /* synthetic */ void c(e eVar) {
            if (eVar.f56313d) {
                return;
            }
            DrmSession drmSession = eVar.f56312c;
            if (drmSession != null) {
                drmSession.g(eVar.f56311b);
            }
            DefaultDrmSessionManager.this.f56289n.remove(eVar);
            eVar.f56313d = true;
        }

        public void d(final t tVar) {
            ((Handler) C13599a.e(DefaultDrmSessionManager.this.f56296u)).post(new Runnable() { // from class: androidx.media3.exoplayer.drm.d
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.e.b(this.f56327a, tVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.drm.i.b
        public void release() {
            P.T0((Handler) C13599a.e(DefaultDrmSessionManager.this.f56296u), new Runnable() { // from class: androidx.media3.exoplayer.drm.e
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.e.c(this.f56329a);
                }
            });
        }
    }

    private class f implements DefaultDrmSession.a {

        /* renamed from: a, reason: collision with root package name */
        private final Set<DefaultDrmSession> f56315a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        private DefaultDrmSession f56316b;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public void a(Exception exc, boolean z10) {
            this.f56316b = null;
            L lS = L.s(this.f56315a);
            this.f56315a.clear();
            y0 it = lS.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).B(exc, z10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public void b() {
            this.f56316b = null;
            L lS = L.s(this.f56315a);
            this.f56315a.clear();
            y0 it = lS.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).A();
            }
        }

        public f() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public void c(DefaultDrmSession defaultDrmSession) {
            this.f56315a.add(defaultDrmSession);
            if (this.f56316b != null) {
                return;
            }
            this.f56316b = defaultDrmSession;
            defaultDrmSession.F();
        }

        public void d(DefaultDrmSession defaultDrmSession) {
            this.f56315a.remove(defaultDrmSession);
            if (this.f56316b == defaultDrmSession) {
                this.f56316b = null;
                if (this.f56315a.isEmpty()) {
                    return;
                }
                DefaultDrmSession next = this.f56315a.iterator().next();
                this.f56316b = next;
                next.F();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class g implements DefaultDrmSession.b {
        private g() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.b
        public void b(final DefaultDrmSession defaultDrmSession, int i10) {
            if (i10 == 1 && DefaultDrmSessionManager.this.f56291p > 0 && DefaultDrmSessionManager.this.f56287l != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f56290o.add(defaultDrmSession);
                ((Handler) C13599a.e(DefaultDrmSessionManager.this.f56296u)).postAtTime(new Runnable() { // from class: androidx.media3.exoplayer.drm.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.g(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f56287l);
            } else if (i10 == 0) {
                DefaultDrmSessionManager.this.f56288m.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f56293r == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f56293r = null;
                }
                if (DefaultDrmSessionManager.this.f56294s == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f56294s = null;
                }
                DefaultDrmSessionManager.this.f56284i.d(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f56287l != -9223372036854775807L) {
                    ((Handler) C13599a.e(DefaultDrmSessionManager.this.f56296u)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f56290o.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.C();
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.b
        public void a(DefaultDrmSession defaultDrmSession, int i10) {
            if (DefaultDrmSessionManager.this.f56287l != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f56290o.remove(defaultDrmSession);
                ((Handler) C13599a.e(DefaultDrmSessionManager.this.f56296u)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }
    }

    private synchronized void z(Looper looper) {
        try {
            Looper looper2 = this.f56295t;
            if (looper2 == null) {
                this.f56295t = looper;
                this.f56296u = new Handler(looper);
            } else {
                C13599a.g(looper2 == looper);
                C13599a.e(this.f56296u);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.drm.i
    public DrmSession b(h.a aVar, t tVar) {
        H(false);
        C13599a.g(this.f56291p > 0);
        C13599a.i(this.f56295t);
        return t(this.f56295t, aVar, tVar, true);
    }

    @Override // androidx.media3.exoplayer.drm.i
    public int c(t tVar) {
        H(false);
        int iF = ((m) C13599a.e(this.f56292q)).f();
        a3.o oVar = tVar.f44771s;
        if (oVar == null) {
            if (P.I0(this.f56282g, z.k(tVar.f44767o)) == -1) {
                return 0;
            }
        } else if (!v(oVar)) {
            return 1;
        }
        return iF;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public final void g() {
        H(true);
        int i10 = this.f56291p;
        this.f56291p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f56292q == null) {
            m mVarA = this.f56278c.a(this.f56277b);
            this.f56292q = mVarA;
            mVarA.k(new c());
        } else if (this.f56287l != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f56288m.size(); i11++) {
                this.f56288m.get(i11).e(null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.i
    public final void release() {
        H(true);
        int i10 = this.f56291p - 1;
        this.f56291p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f56287l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f56288m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((DefaultDrmSession) arrayList.get(i11)).g(null);
            }
        }
        E();
        C();
    }

    private DefaultDrmSessionManager(UUID uuid, m.c cVar, p pVar, HashMap<String, String> map, boolean z10, int[] iArr, boolean z11, androidx.media3.exoplayer.upstream.b bVar, long j10) {
        C13599a.e(uuid);
        C13599a.b(!C5652i.f44651b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f56277b = uuid;
        this.f56278c = cVar;
        this.f56279d = pVar;
        this.f56280e = map;
        this.f56281f = z10;
        this.f56282g = iArr;
        this.f56283h = z11;
        this.f56285j = bVar;
        this.f56284i = new f();
        this.f56286k = new g();
        this.f56297v = 0;
        this.f56288m = new ArrayList();
        this.f56289n = s0.h();
        this.f56290o = s0.h();
        this.f56287l = j10;
    }

    private DrmSession A(int i10, boolean z10) {
        m mVar = (m) C13599a.e(this.f56292q);
        if ((mVar.f() == 2 && k3.l.f141416d) || P.I0(this.f56282g, i10) == -1 || mVar.f() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f56293r;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionX = x(L.x(), true, null, z10);
            this.f56288m.add(defaultDrmSessionX);
            this.f56293r = defaultDrmSessionX;
        } else {
            defaultDrmSession.e(null);
        }
        return this.f56293r;
    }

    private void B(Looper looper) {
        if (this.f56300y == null) {
            this.f56300y = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.f56292q != null && this.f56291p == 0 && this.f56288m.isEmpty() && this.f56289n.isEmpty()) {
            ((m) C13599a.e(this.f56292q)).release();
            this.f56292q = null;
        }
    }

    private void D() {
        y0 it = O.s(this.f56290o).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).g(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void E() {
        y0 it = O.s(this.f56289n).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
    }

    private void H(boolean z10) {
        if (z10 && this.f56295t == null) {
            r.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) C13599a.e(this.f56295t)).getThread()) {
            r.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f56295t.getThread().getName(), new IllegalStateException());
        }
    }

    private boolean v(a3.o oVar) {
        if (this.f56298w != null) {
            return true;
        }
        if (y(oVar, this.f56277b, true).isEmpty()) {
            if (oVar.f44693d != 1 || !oVar.c(0).b(C5652i.f44651b)) {
                return false;
            }
            r.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f56277b);
        }
        String str = oVar.f44692c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? P.f127888a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private DefaultDrmSession w(List<o.b> list, boolean z10, h.a aVar) {
        C13599a.e(this.f56292q);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f56277b, this.f56292q, this.f56284i, this.f56286k, list, this.f56297v, this.f56283h | z10, z10, this.f56298w, this.f56280e, this.f56279d, (Looper) C13599a.e(this.f56295t), this.f56285j, (E1) C13599a.e(this.f56299x));
        defaultDrmSession.e(aVar);
        if (this.f56287l != -9223372036854775807L) {
            defaultDrmSession.e(null);
        }
        return defaultDrmSession;
    }

    private static List<o.b> y(a3.o oVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(oVar.f44693d);
        for (int i10 = 0; i10 < oVar.f44693d; i10++) {
            o.b bVarC = oVar.c(i10);
            if ((bVarC.b(uuid) || (C5652i.f44652c.equals(uuid) && bVarC.b(C5652i.f44651b))) && (bVarC.f44698e != null || z10)) {
                arrayList.add(bVarC);
            }
        }
        return arrayList;
    }

    public void F(int i10, byte[] bArr) {
        C13599a.g(this.f56288m.isEmpty());
        if (i10 == 1 || i10 == 3) {
            C13599a.e(bArr);
        }
        this.f56297v = i10;
        this.f56298w = bArr;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public i.b a(h.a aVar, t tVar) {
        C13599a.g(this.f56291p > 0);
        C13599a.i(this.f56295t);
        e eVar = new e(aVar);
        eVar.d(tVar);
        return eVar;
    }

    private void G(DrmSession drmSession, h.a aVar) {
        drmSession.g(aVar);
        if (this.f56287l != -9223372036854775807L) {
            drmSession.g(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public DrmSession t(Looper looper, h.a aVar, t tVar, boolean z10) {
        List<o.b> listY;
        B(looper);
        a3.o oVar = tVar.f44771s;
        if (oVar == null) {
            return A(z.k(tVar.f44767o), z10);
        }
        DefaultDrmSession defaultDrmSession = null;
        Object[] objArr = 0;
        if (this.f56298w == null) {
            listY = y((a3.o) C13599a.e(oVar), this.f56277b, false);
            if (listY.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f56277b);
                r.e("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.l(missingSchemeDataException);
                }
                return new l(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            listY = null;
        }
        if (!this.f56281f) {
            defaultDrmSession = this.f56294s;
        } else {
            Iterator<DefaultDrmSession> it = this.f56288m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession next = it.next();
                if (Objects.equals(next.f56244a, listY)) {
                    defaultDrmSession = next;
                    break;
                }
            }
        }
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionX = x(listY, false, aVar, z10);
            if (!this.f56281f) {
                this.f56294s = defaultDrmSessionX;
            }
            this.f56288m.add(defaultDrmSessionX);
            return defaultDrmSessionX;
        }
        defaultDrmSession.e(aVar);
        return defaultDrmSession;
    }

    private static boolean u(DrmSession drmSession) {
        if (drmSession.getState() != 1) {
            return false;
        }
        Throwable cause = ((DrmSession.DrmSessionException) C13599a.e(drmSession.getError())).getCause();
        if (!(cause instanceof ResourceBusyException) && !j.e(cause)) {
            return false;
        }
        return true;
    }

    private DefaultDrmSession x(List<o.b> list, boolean z10, h.a aVar, boolean z11) {
        DefaultDrmSession defaultDrmSessionW = w(list, z10, aVar);
        if (u(defaultDrmSessionW) && !this.f56290o.isEmpty()) {
            D();
            G(defaultDrmSessionW, aVar);
            defaultDrmSessionW = w(list, z10, aVar);
        }
        if (u(defaultDrmSessionW) && z11 && !this.f56289n.isEmpty()) {
            E();
            if (!this.f56290o.isEmpty()) {
                D();
            }
            G(defaultDrmSessionW, aVar);
            return w(list, z10, aVar);
        }
        return defaultDrmSessionW;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public void d(Looper looper, E1 e12) {
        z(looper);
        this.f56299x = e12;
    }
}
