package androidx.media3.exoplayer.drm;

import Ce.L;
import Ce.O;
import Ce.s0;
import Ce.y0;
import a3.C5569i;
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
import d3.C13466a;
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
    private final UUID f56053b;

    /* renamed from: c, reason: collision with root package name */
    private final m.c f56054c;

    /* renamed from: d, reason: collision with root package name */
    private final p f56055d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f56056e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f56057f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f56058g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f56059h;

    /* renamed from: i, reason: collision with root package name */
    private final f f56060i;

    /* renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f56061j;

    /* renamed from: k, reason: collision with root package name */
    private final g f56062k;

    /* renamed from: l, reason: collision with root package name */
    private final long f56063l;

    /* renamed from: m, reason: collision with root package name */
    private final List<DefaultDrmSession> f56064m;

    /* renamed from: n, reason: collision with root package name */
    private final Set<e> f56065n;

    /* renamed from: o, reason: collision with root package name */
    private final Set<DefaultDrmSession> f56066o;

    /* renamed from: p, reason: collision with root package name */
    private int f56067p;

    /* renamed from: q, reason: collision with root package name */
    private m f56068q;

    /* renamed from: r, reason: collision with root package name */
    private DefaultDrmSession f56069r;

    /* renamed from: s, reason: collision with root package name */
    private DefaultDrmSession f56070s;

    /* renamed from: t, reason: collision with root package name */
    private Looper f56071t;

    /* renamed from: u, reason: collision with root package name */
    private Handler f56072u;

    /* renamed from: v, reason: collision with root package name */
    private int f56073v;

    /* renamed from: w, reason: collision with root package name */
    private byte[] f56074w;

    /* renamed from: x, reason: collision with root package name */
    private E1 f56075x;

    /* renamed from: y, reason: collision with root package name */
    volatile d f56076y;

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        private boolean f56080d;

        /* renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f56077a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        private UUID f56078b = C5569i.f43835d;

        /* renamed from: c, reason: collision with root package name */
        private m.c f56079c = n.f56126d;

        /* renamed from: e, reason: collision with root package name */
        private int[] f56081e = new int[0];

        /* renamed from: f, reason: collision with root package name */
        private boolean f56082f = true;

        /* renamed from: g, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f56083g = new androidx.media3.exoplayer.upstream.a();

        /* renamed from: h, reason: collision with root package name */
        private long f56084h = 300000;

        public b e(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                C13466a.a(z10);
            }
            this.f56081e = (int[]) iArr.clone();
            return this;
        }

        public DefaultDrmSessionManager a(p pVar) {
            return new DefaultDrmSessionManager(this.f56078b, this.f56079c, pVar, this.f56077a, this.f56080d, this.f56081e, this.f56082f, this.f56083g, this.f56084h);
        }

        public b c(boolean z10) {
            this.f56080d = z10;
            return this;
        }

        public b d(boolean z10) {
            this.f56082f = z10;
            return this;
        }

        public b b(androidx.media3.exoplayer.upstream.b bVar) {
            this.f56083g = (androidx.media3.exoplayer.upstream.b) C13466a.e(bVar);
            return this;
        }

        public b f(UUID uuid, m.c cVar) {
            this.f56078b = (UUID) C13466a.e(uuid);
            this.f56079c = (m.c) C13466a.e(cVar);
            return this;
        }
    }

    private class c implements m.b {
        private c() {
        }

        @Override // androidx.media3.exoplayer.drm.m.b
        public void a(m mVar, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) C13466a.e(DefaultDrmSessionManager.this.f56076y)).obtainMessage(i10, bArr).sendToTarget();
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
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f56064m) {
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
        private final h.a f56087b;

        /* renamed from: c, reason: collision with root package name */
        private DrmSession f56088c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f56089d;

        public e(h.a aVar) {
            this.f56087b = aVar;
        }

        public static /* synthetic */ void b(e eVar, t tVar) {
            if (DefaultDrmSessionManager.this.f56067p == 0 || eVar.f56089d) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            eVar.f56088c = defaultDrmSessionManager.t((Looper) C13466a.e(defaultDrmSessionManager.f56071t), eVar.f56087b, tVar, false);
            DefaultDrmSessionManager.this.f56065n.add(eVar);
        }

        public static /* synthetic */ void c(e eVar) {
            if (eVar.f56089d) {
                return;
            }
            DrmSession drmSession = eVar.f56088c;
            if (drmSession != null) {
                drmSession.g(eVar.f56087b);
            }
            DefaultDrmSessionManager.this.f56065n.remove(eVar);
            eVar.f56089d = true;
        }

        public void d(final t tVar) {
            ((Handler) C13466a.e(DefaultDrmSessionManager.this.f56072u)).post(new Runnable() { // from class: androidx.media3.exoplayer.drm.d
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.e.b(this.f56103a, tVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.drm.i.b
        public void release() {
            P.T0((Handler) C13466a.e(DefaultDrmSessionManager.this.f56072u), new Runnable() { // from class: androidx.media3.exoplayer.drm.e
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.e.c(this.f56105a);
                }
            });
        }
    }

    private class f implements DefaultDrmSession.a {

        /* renamed from: a, reason: collision with root package name */
        private final Set<DefaultDrmSession> f56091a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        private DefaultDrmSession f56092b;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public void a(Exception exc, boolean z10) {
            this.f56092b = null;
            L lS = L.s(this.f56091a);
            this.f56091a.clear();
            y0 it = lS.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).B(exc, z10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public void b() {
            this.f56092b = null;
            L lS = L.s(this.f56091a);
            this.f56091a.clear();
            y0 it = lS.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).A();
            }
        }

        public f() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public void c(DefaultDrmSession defaultDrmSession) {
            this.f56091a.add(defaultDrmSession);
            if (this.f56092b != null) {
                return;
            }
            this.f56092b = defaultDrmSession;
            defaultDrmSession.F();
        }

        public void d(DefaultDrmSession defaultDrmSession) {
            this.f56091a.remove(defaultDrmSession);
            if (this.f56092b == defaultDrmSession) {
                this.f56092b = null;
                if (this.f56091a.isEmpty()) {
                    return;
                }
                DefaultDrmSession next = this.f56091a.iterator().next();
                this.f56092b = next;
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
            if (i10 == 1 && DefaultDrmSessionManager.this.f56067p > 0 && DefaultDrmSessionManager.this.f56063l != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f56066o.add(defaultDrmSession);
                ((Handler) C13466a.e(DefaultDrmSessionManager.this.f56072u)).postAtTime(new Runnable() { // from class: androidx.media3.exoplayer.drm.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.g(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f56063l);
            } else if (i10 == 0) {
                DefaultDrmSessionManager.this.f56064m.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f56069r == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f56069r = null;
                }
                if (DefaultDrmSessionManager.this.f56070s == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f56070s = null;
                }
                DefaultDrmSessionManager.this.f56060i.d(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f56063l != -9223372036854775807L) {
                    ((Handler) C13466a.e(DefaultDrmSessionManager.this.f56072u)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f56066o.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.C();
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.b
        public void a(DefaultDrmSession defaultDrmSession, int i10) {
            if (DefaultDrmSessionManager.this.f56063l != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f56066o.remove(defaultDrmSession);
                ((Handler) C13466a.e(DefaultDrmSessionManager.this.f56072u)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }
    }

    private synchronized void z(Looper looper) {
        try {
            Looper looper2 = this.f56071t;
            if (looper2 == null) {
                this.f56071t = looper;
                this.f56072u = new Handler(looper);
            } else {
                C13466a.g(looper2 == looper);
                C13466a.e(this.f56072u);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.drm.i
    public DrmSession b(h.a aVar, t tVar) {
        H(false);
        C13466a.g(this.f56067p > 0);
        C13466a.i(this.f56071t);
        return t(this.f56071t, aVar, tVar, true);
    }

    @Override // androidx.media3.exoplayer.drm.i
    public int c(t tVar) {
        H(false);
        int iF = ((m) C13466a.e(this.f56068q)).f();
        a3.o oVar = tVar.f43953s;
        if (oVar == null) {
            if (P.I0(this.f56058g, z.k(tVar.f43949o)) == -1) {
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
        int i10 = this.f56067p;
        this.f56067p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f56068q == null) {
            m mVarA = this.f56054c.a(this.f56053b);
            this.f56068q = mVarA;
            mVarA.k(new c());
        } else if (this.f56063l != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f56064m.size(); i11++) {
                this.f56064m.get(i11).e(null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.i
    public final void release() {
        H(true);
        int i10 = this.f56067p - 1;
        this.f56067p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f56063l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f56064m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((DefaultDrmSession) arrayList.get(i11)).g(null);
            }
        }
        E();
        C();
    }

    private DefaultDrmSessionManager(UUID uuid, m.c cVar, p pVar, HashMap<String, String> map, boolean z10, int[] iArr, boolean z11, androidx.media3.exoplayer.upstream.b bVar, long j10) {
        C13466a.e(uuid);
        C13466a.b(!C5569i.f43833b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f56053b = uuid;
        this.f56054c = cVar;
        this.f56055d = pVar;
        this.f56056e = map;
        this.f56057f = z10;
        this.f56058g = iArr;
        this.f56059h = z11;
        this.f56061j = bVar;
        this.f56060i = new f();
        this.f56062k = new g();
        this.f56073v = 0;
        this.f56064m = new ArrayList();
        this.f56065n = s0.h();
        this.f56066o = s0.h();
        this.f56063l = j10;
    }

    private DrmSession A(int i10, boolean z10) {
        m mVar = (m) C13466a.e(this.f56068q);
        if ((mVar.f() == 2 && k3.l.f141223d) || P.I0(this.f56058g, i10) == -1 || mVar.f() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f56069r;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionX = x(L.x(), true, null, z10);
            this.f56064m.add(defaultDrmSessionX);
            this.f56069r = defaultDrmSessionX;
        } else {
            defaultDrmSession.e(null);
        }
        return this.f56069r;
    }

    private void B(Looper looper) {
        if (this.f56076y == null) {
            this.f56076y = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.f56068q != null && this.f56067p == 0 && this.f56064m.isEmpty() && this.f56065n.isEmpty()) {
            ((m) C13466a.e(this.f56068q)).release();
            this.f56068q = null;
        }
    }

    private void D() {
        y0 it = O.s(this.f56066o).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).g(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void E() {
        y0 it = O.s(this.f56065n).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
    }

    private void H(boolean z10) {
        if (z10 && this.f56071t == null) {
            r.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) C13466a.e(this.f56071t)).getThread()) {
            r.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f56071t.getThread().getName(), new IllegalStateException());
        }
    }

    private boolean v(a3.o oVar) {
        if (this.f56074w != null) {
            return true;
        }
        if (y(oVar, this.f56053b, true).isEmpty()) {
            if (oVar.f43875d != 1 || !oVar.c(0).b(C5569i.f43833b)) {
                return false;
            }
            r.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f56053b);
        }
        String str = oVar.f43874c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return "cbcs".equals(str) ? P.f127086a >= 25 : ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private DefaultDrmSession w(List<o.b> list, boolean z10, h.a aVar) {
        C13466a.e(this.f56068q);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f56053b, this.f56068q, this.f56060i, this.f56062k, list, this.f56073v, this.f56059h | z10, z10, this.f56074w, this.f56056e, this.f56055d, (Looper) C13466a.e(this.f56071t), this.f56061j, (E1) C13466a.e(this.f56075x));
        defaultDrmSession.e(aVar);
        if (this.f56063l != -9223372036854775807L) {
            defaultDrmSession.e(null);
        }
        return defaultDrmSession;
    }

    private static List<o.b> y(a3.o oVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(oVar.f43875d);
        for (int i10 = 0; i10 < oVar.f43875d; i10++) {
            o.b bVarC = oVar.c(i10);
            if ((bVarC.b(uuid) || (C5569i.f43834c.equals(uuid) && bVarC.b(C5569i.f43833b))) && (bVarC.f43880e != null || z10)) {
                arrayList.add(bVarC);
            }
        }
        return arrayList;
    }

    public void F(int i10, byte[] bArr) {
        C13466a.g(this.f56064m.isEmpty());
        if (i10 == 1 || i10 == 3) {
            C13466a.e(bArr);
        }
        this.f56073v = i10;
        this.f56074w = bArr;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public i.b a(h.a aVar, t tVar) {
        C13466a.g(this.f56067p > 0);
        C13466a.i(this.f56071t);
        e eVar = new e(aVar);
        eVar.d(tVar);
        return eVar;
    }

    private void G(DrmSession drmSession, h.a aVar) {
        drmSession.g(aVar);
        if (this.f56063l != -9223372036854775807L) {
            drmSession.g(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public DrmSession t(Looper looper, h.a aVar, t tVar, boolean z10) {
        List<o.b> listY;
        B(looper);
        a3.o oVar = tVar.f43953s;
        if (oVar == null) {
            return A(z.k(tVar.f43949o), z10);
        }
        DefaultDrmSession defaultDrmSession = null;
        Object[] objArr = 0;
        if (this.f56074w == null) {
            listY = y((a3.o) C13466a.e(oVar), this.f56053b, false);
            if (listY.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f56053b);
                r.e("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.l(missingSchemeDataException);
                }
                return new l(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            listY = null;
        }
        if (!this.f56057f) {
            defaultDrmSession = this.f56070s;
        } else {
            Iterator<DefaultDrmSession> it = this.f56064m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession next = it.next();
                if (Objects.equals(next.f56020a, listY)) {
                    defaultDrmSession = next;
                    break;
                }
            }
        }
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionX = x(listY, false, aVar, z10);
            if (!this.f56057f) {
                this.f56070s = defaultDrmSessionX;
            }
            this.f56064m.add(defaultDrmSessionX);
            return defaultDrmSessionX;
        }
        defaultDrmSession.e(aVar);
        return defaultDrmSession;
    }

    private static boolean u(DrmSession drmSession) {
        if (drmSession.getState() != 1) {
            return false;
        }
        Throwable cause = ((DrmSession.DrmSessionException) C13466a.e(drmSession.getError())).getCause();
        if (!(cause instanceof ResourceBusyException) && !j.e(cause)) {
            return false;
        }
        return true;
    }

    private DefaultDrmSession x(List<o.b> list, boolean z10, h.a aVar, boolean z11) {
        DefaultDrmSession defaultDrmSessionW = w(list, z10, aVar);
        if (u(defaultDrmSessionW) && !this.f56066o.isEmpty()) {
            D();
            G(defaultDrmSessionW, aVar);
            defaultDrmSessionW = w(list, z10, aVar);
        }
        if (u(defaultDrmSessionW) && z11 && !this.f56065n.isEmpty()) {
            E();
            if (!this.f56066o.isEmpty()) {
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
        this.f56075x = e12;
    }
}
