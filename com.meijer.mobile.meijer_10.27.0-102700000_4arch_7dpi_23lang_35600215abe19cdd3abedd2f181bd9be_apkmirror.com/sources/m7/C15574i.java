package m7;

import V6.k;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.j;
import com.fullstory.FS;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p7.l;

/* renamed from: m7.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15574i<R> implements InterfaceC15569d, com.bumptech.glide.request.target.i, InterfaceC15573h {

    /* renamed from: E, reason: collision with root package name */
    private static final boolean f149910E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    private int f149911A;

    /* renamed from: B, reason: collision with root package name */
    private int f149912B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f149913C;

    /* renamed from: D, reason: collision with root package name */
    private RuntimeException f149914D;

    /* renamed from: a, reason: collision with root package name */
    private int f149915a;

    /* renamed from: b, reason: collision with root package name */
    private final String f149916b;

    /* renamed from: c, reason: collision with root package name */
    private final q7.c f149917c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f149918d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC15571f<R> f149919e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC15570e f149920f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f149921g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.d f149922h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f149923i;

    /* renamed from: j, reason: collision with root package name */
    private final Class<R> f149924j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC15566a<?> f149925k;

    /* renamed from: l, reason: collision with root package name */
    private final int f149926l;

    /* renamed from: m, reason: collision with root package name */
    private final int f149927m;

    /* renamed from: n, reason: collision with root package name */
    private final com.bumptech.glide.g f149928n;

    /* renamed from: o, reason: collision with root package name */
    private final com.bumptech.glide.request.target.j<R> f149929o;

    /* renamed from: p, reason: collision with root package name */
    private final List<InterfaceC15571f<R>> f149930p;

    /* renamed from: q, reason: collision with root package name */
    private final n7.c<? super R> f149931q;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f149932r;

    /* renamed from: s, reason: collision with root package name */
    private X6.c<R> f149933s;

    /* renamed from: t, reason: collision with root package name */
    private j.d f149934t;

    /* renamed from: u, reason: collision with root package name */
    private long f149935u;

    /* renamed from: v, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.j f149936v;

    /* renamed from: w, reason: collision with root package name */
    private a f149937w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f149938x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f149939y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f149940z;

    /* renamed from: m7.i$a */
    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    @Override // m7.InterfaceC15573h
    public void c(GlideException glideException) {
        y(glideException, 5);
    }

    private void h() {
        if (this.f149913C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean j() {
        InterfaceC15570e interfaceC15570e = this.f149920f;
        return interfaceC15570e == null || interfaceC15570e.d(this);
    }

    private boolean k() {
        InterfaceC15570e interfaceC15570e = this.f149920f;
        return interfaceC15570e == null || interfaceC15570e.b(this);
    }

    private boolean l() {
        InterfaceC15570e interfaceC15570e = this.f149920f;
        return interfaceC15570e == null || interfaceC15570e.h(this);
    }

    private void n(Object obj) {
        List<InterfaceC15571f<R>> list = this.f149930p;
        if (list == null) {
            return;
        }
        for (InterfaceC15571f<R> interfaceC15571f : list) {
            if (interfaceC15571f instanceof AbstractC15568c) {
                ((AbstractC15568c) interfaceC15571f).c(obj);
            }
        }
    }

    private Drawable o() {
        if (this.f149938x == null) {
            Drawable drawableM = this.f149925k.m();
            this.f149938x = drawableM;
            if (drawableM == null && this.f149925k.l() > 0) {
                this.f149938x = s(this.f149925k.l());
            }
        }
        return this.f149938x;
    }

    private Drawable p() {
        if (this.f149940z == null) {
            Drawable drawableN = this.f149925k.n();
            this.f149940z = drawableN;
            if (drawableN == null && this.f149925k.o() > 0) {
                this.f149940z = s(this.f149925k.o());
            }
        }
        return this.f149940z;
    }

    private Drawable q() {
        if (this.f149939y == null) {
            Drawable drawableT = this.f149925k.t();
            this.f149939y = drawableT;
            if (drawableT == null && this.f149925k.u() > 0) {
                this.f149939y = s(this.f149925k.u());
            }
        }
        return this.f149939y;
    }

    private boolean r() {
        InterfaceC15570e interfaceC15570e = this.f149920f;
        return interfaceC15570e == null || !interfaceC15570e.getRoot().a();
    }

    private Drawable s(int i10) {
        return f7.i.a(this.f149921g, i10, this.f149925k.z() != null ? this.f149925k.z() : this.f149921g.getTheme());
    }

    private void t(String str) {
        FS.log_v("GlideRequest", str + " this: " + this.f149916b);
    }

    private static int u(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    private void v() {
        InterfaceC15570e interfaceC15570e = this.f149920f;
        if (interfaceC15570e != null) {
            interfaceC15570e.g(this);
        }
    }

    private void w() {
        InterfaceC15570e interfaceC15570e = this.f149920f;
        if (interfaceC15570e != null) {
            interfaceC15570e.c(this);
        }
    }

    public static <R> C15574i<R> x(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, AbstractC15566a<?> abstractC15566a, int i10, int i11, com.bumptech.glide.g gVar, com.bumptech.glide.request.target.j<R> jVar, InterfaceC15571f<R> interfaceC15571f, List<InterfaceC15571f<R>> list, InterfaceC15570e interfaceC15570e, com.bumptech.glide.load.engine.j jVar2, n7.c<? super R> cVar, Executor executor) {
        return new C15574i<>(context, dVar, obj, obj2, cls, abstractC15566a, i10, i11, gVar, jVar, interfaceC15571f, list, interfaceC15570e, jVar2, cVar, executor);
    }

    private void y(GlideException glideException, int i10) {
        boolean zB;
        this.f149917c.c();
        synchronized (this.f149918d) {
            try {
                glideException.k(this.f149914D);
                int iH = this.f149922h.h();
                if (iH <= i10) {
                    FS.log_w("Glide", "Load failed for [" + this.f149923i + "] with dimensions [" + this.f149911A + "x" + this.f149912B + "]", glideException);
                    if (iH <= 4) {
                        glideException.g("Glide");
                    }
                }
                this.f149934t = null;
                this.f149937w = a.FAILED;
                v();
                boolean z10 = true;
                this.f149913C = true;
                try {
                    List<InterfaceC15571f<R>> list = this.f149930p;
                    if (list != null) {
                        Iterator<InterfaceC15571f<R>> it = list.iterator();
                        zB = false;
                        while (it.hasNext()) {
                            zB |= it.next().b(glideException, this.f149923i, this.f149929o, r());
                        }
                    } else {
                        zB = false;
                    }
                    InterfaceC15571f<R> interfaceC15571f = this.f149919e;
                    if (interfaceC15571f == null || !interfaceC15571f.b(glideException, this.f149923i, this.f149929o, r())) {
                        z10 = false;
                    }
                    if (!(zB | z10)) {
                        A();
                    }
                    this.f149913C = false;
                    q7.b.f("GlideRequest", this.f149915a);
                } catch (Throwable th2) {
                    this.f149913C = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // m7.InterfaceC15569d
    public boolean a() {
        boolean z10;
        synchronized (this.f149918d) {
            z10 = this.f149937w == a.COMPLETE;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m7.InterfaceC15573h
    public void b(X6.c<?> cVar, V6.a aVar, boolean z10) {
        this.f149917c.c();
        X6.c<?> cVar2 = null;
        try {
            synchronized (this.f149918d) {
                try {
                    this.f149934t = null;
                    if (cVar == null) {
                        c(new GlideException("Expected to receive a Resource<R> with an object of " + this.f149924j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = cVar.get();
                    try {
                        if (obj == null || !this.f149924j.isAssignableFrom(obj.getClass())) {
                            this.f149933s = null;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Expected to receive an object of ");
                            sb2.append(this.f149924j);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(cVar);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            c(new GlideException(sb2.toString()));
                        } else if (l()) {
                            z(cVar, obj, aVar, z10);
                            return;
                        } else {
                            this.f149933s = null;
                            this.f149937w = a.COMPLETE;
                            q7.b.f("GlideRequest", this.f149915a);
                        }
                        this.f149936v.k(cVar);
                    } catch (Throwable th2) {
                        cVar2 = cVar;
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            if (cVar2 != null) {
                this.f149936v.k(cVar2);
            }
            throw th4;
        }
    }

    @Override // m7.InterfaceC15569d
    public void clear() {
        synchronized (this.f149918d) {
            try {
                h();
                this.f149917c.c();
                a aVar = this.f149937w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                m();
                X6.c<R> cVar = this.f149933s;
                if (cVar != null) {
                    this.f149933s = null;
                } else {
                    cVar = null;
                }
                if (j()) {
                    this.f149929o.onLoadCleared(q());
                }
                q7.b.f("GlideRequest", this.f149915a);
                this.f149937w = aVar2;
                if (cVar != null) {
                    this.f149936v.k(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.target.i
    public void d(int i10, int i11) throws Throwable {
        C15574i<R> c15574i = this;
        c15574i.f149917c.c();
        Object obj = c15574i.f149918d;
        synchronized (obj) {
            try {
                try {
                    boolean z10 = f149910E;
                    if (z10) {
                        c15574i.t("Got onSizeReady in " + p7.g.a(c15574i.f149935u));
                    }
                    if (c15574i.f149937w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        c15574i.f149937w = aVar;
                        float fY = c15574i.f149925k.y();
                        c15574i.f149911A = u(i10, fY);
                        c15574i.f149912B = u(i11, fY);
                        if (z10) {
                            c15574i.t("finished setup for calling load in " + p7.g.a(c15574i.f149935u));
                        }
                        try {
                            com.bumptech.glide.load.engine.j jVar = c15574i.f149936v;
                            com.bumptech.glide.d dVar = c15574i.f149922h;
                            try {
                                Object obj2 = c15574i.f149923i;
                                V6.e eVarX = c15574i.f149925k.x();
                                try {
                                    int i12 = c15574i.f149911A;
                                    int i13 = c15574i.f149912B;
                                    Class<?> clsW = c15574i.f149925k.w();
                                    Class<R> cls = c15574i.f149924j;
                                    try {
                                        com.bumptech.glide.g gVar = c15574i.f149928n;
                                        X6.a aVarK = c15574i.f149925k.k();
                                        Map<Class<?>, k<?>> mapA = c15574i.f149925k.A();
                                        boolean zM = c15574i.f149925k.M();
                                        boolean zI = c15574i.f149925k.I();
                                        V6.g gVarQ = c15574i.f149925k.q();
                                        boolean zG = c15574i.f149925k.G();
                                        boolean zD = c15574i.f149925k.D();
                                        boolean zC = c15574i.f149925k.C();
                                        boolean zP = c15574i.f149925k.p();
                                        Executor executor = c15574i.f149932r;
                                        c15574i = obj;
                                        try {
                                            c15574i.f149934t = jVar.f(dVar, obj2, eVarX, i12, i13, clsW, cls, gVar, aVarK, mapA, zM, zI, gVarQ, zG, zD, zC, zP, c15574i, executor);
                                            if (c15574i.f149937w != aVar) {
                                                c15574i.f149934t = null;
                                            }
                                            if (z10) {
                                                c15574i.t("finished onSizeReady in " + p7.g.a(c15574i.f149935u));
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c15574i = obj;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    c15574i = obj;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c15574i = obj;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            c15574i = obj;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    c15574i = obj;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    @Override // m7.InterfaceC15569d
    public boolean e(InterfaceC15569d interfaceC15569d) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        AbstractC15566a<?> abstractC15566a;
        com.bumptech.glide.g gVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        AbstractC15566a<?> abstractC15566a2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(interfaceC15569d instanceof C15574i)) {
            return false;
        }
        synchronized (this.f149918d) {
            try {
                i10 = this.f149926l;
                i11 = this.f149927m;
                obj = this.f149923i;
                cls = this.f149924j;
                abstractC15566a = this.f149925k;
                gVar = this.f149928n;
                List<InterfaceC15571f<R>> list = this.f149930p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        C15574i c15574i = (C15574i) interfaceC15569d;
        synchronized (c15574i.f149918d) {
            try {
                i12 = c15574i.f149926l;
                i13 = c15574i.f149927m;
                obj2 = c15574i.f149923i;
                cls2 = c15574i.f149924j;
                abstractC15566a2 = c15574i.f149925k;
                gVar2 = c15574i.f149928n;
                List<InterfaceC15571f<R>> list2 = c15574i.f149930p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i10 == i12 && i11 == i13 && l.c(obj, obj2) && cls.equals(cls2) && l.b(abstractC15566a, abstractC15566a2) && gVar == gVar2 && size == size2;
    }

    @Override // m7.InterfaceC15569d
    public boolean f() {
        boolean z10;
        synchronized (this.f149918d) {
            z10 = this.f149937w == a.CLEARED;
        }
        return z10;
    }

    @Override // m7.InterfaceC15573h
    public Object g() {
        this.f149917c.c();
        return this.f149918d;
    }

    @Override // m7.InterfaceC15569d
    public void i() {
        synchronized (this.f149918d) {
            try {
                h();
                this.f149917c.c();
                this.f149935u = p7.g.b();
                Object obj = this.f149923i;
                if (obj == null) {
                    if (l.t(this.f149926l, this.f149927m)) {
                        this.f149911A = this.f149926l;
                        this.f149912B = this.f149927m;
                    }
                    y(new GlideException("Received null model"), p() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f149937w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    b(this.f149933s, V6.a.MEMORY_CACHE, false);
                    return;
                }
                n(obj);
                this.f149915a = q7.b.b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f149937w = aVar3;
                if (l.t(this.f149926l, this.f149927m)) {
                    d(this.f149926l, this.f149927m);
                } else {
                    this.f149929o.getSize(this);
                }
                a aVar4 = this.f149937w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && k()) {
                    this.f149929o.onLoadStarted(q());
                }
                if (f149910E) {
                    t("finished run method in " + p7.g.a(this.f149935u));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m7.InterfaceC15569d
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f149918d) {
            z10 = this.f149937w == a.COMPLETE;
        }
        return z10;
    }

    @Override // m7.InterfaceC15569d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f149918d) {
            try {
                a aVar = this.f149937w;
                z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z10;
    }

    @Override // m7.InterfaceC15569d
    public void pause() {
        synchronized (this.f149918d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f149918d) {
            obj = this.f149923i;
            cls = this.f149924j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    private C15574i(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, AbstractC15566a<?> abstractC15566a, int i10, int i11, com.bumptech.glide.g gVar, com.bumptech.glide.request.target.j<R> jVar, InterfaceC15571f<R> interfaceC15571f, List<InterfaceC15571f<R>> list, InterfaceC15570e interfaceC15570e, com.bumptech.glide.load.engine.j jVar2, n7.c<? super R> cVar, Executor executor) {
        String strValueOf;
        if (f149910E) {
            strValueOf = String.valueOf(super.hashCode());
        } else {
            strValueOf = null;
        }
        this.f149916b = strValueOf;
        this.f149917c = q7.c.a();
        this.f149918d = obj;
        this.f149921g = context;
        this.f149922h = dVar;
        this.f149923i = obj2;
        this.f149924j = cls;
        this.f149925k = abstractC15566a;
        this.f149926l = i10;
        this.f149927m = i11;
        this.f149928n = gVar;
        this.f149929o = jVar;
        this.f149919e = interfaceC15571f;
        this.f149930p = list;
        this.f149920f = interfaceC15570e;
        this.f149936v = jVar2;
        this.f149931q = cVar;
        this.f149932r = executor;
        this.f149937w = a.PENDING;
        if (this.f149914D == null && dVar.g().a(c.C1243c.class)) {
            this.f149914D = new RuntimeException("Glide request origin trace");
        }
    }

    private void A() {
        Drawable drawableQ;
        if (!k()) {
            return;
        }
        if (this.f149923i == null) {
            drawableQ = p();
        } else {
            drawableQ = null;
        }
        if (drawableQ == null) {
            drawableQ = o();
        }
        if (drawableQ == null) {
            drawableQ = q();
        }
        this.f149929o.onLoadFailed(drawableQ);
    }

    private void m() {
        h();
        this.f149917c.c();
        this.f149929o.removeCallback(this);
        j.d dVar = this.f149934t;
        if (dVar != null) {
            dVar.a();
            this.f149934t = null;
        }
    }

    private void z(X6.c<R> cVar, R r10, V6.a aVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean zR = r();
        this.f149937w = a.COMPLETE;
        this.f149933s = cVar;
        if (this.f149922h.h() <= 3) {
            FS.log_d("Glide", "Finished loading " + r10.getClass().getSimpleName() + " from " + aVar + " for " + this.f149923i + " with size [" + this.f149911A + "x" + this.f149912B + "] in " + p7.g.a(this.f149935u) + " ms");
        }
        w();
        boolean z13 = true;
        this.f149913C = true;
        try {
            List<InterfaceC15571f<R>> list = this.f149930p;
            if (list != null) {
                z11 = false;
                for (InterfaceC15571f<R> interfaceC15571f : list) {
                    R r11 = r10;
                    V6.a aVar2 = aVar;
                    boolean zA = interfaceC15571f.a(r11, this.f149923i, this.f149929o, aVar2, zR) | z11;
                    if (interfaceC15571f instanceof AbstractC15568c) {
                        z12 = z10;
                        zA |= ((AbstractC15568c) interfaceC15571f).d(r11, this.f149923i, this.f149929o, aVar2, zR, z12);
                    } else {
                        z12 = z10;
                    }
                    aVar = aVar2;
                    z10 = z12;
                    z11 = zA;
                    r10 = r11;
                }
            } else {
                z11 = false;
            }
            R r12 = r10;
            V6.a aVar3 = aVar;
            InterfaceC15571f<R> interfaceC15571f2 = this.f149919e;
            if (interfaceC15571f2 == null || !interfaceC15571f2.a(r12, this.f149923i, this.f149929o, aVar3, zR)) {
                z13 = false;
            }
            if (!(z13 | z11)) {
                this.f149929o.onResourceReady(r12, this.f149931q.a(aVar3, zR));
            }
            this.f149913C = false;
            q7.b.f("GlideRequest", this.f149915a);
        } catch (Throwable th2) {
            this.f149913C = false;
            throw th2;
        }
    }
}
