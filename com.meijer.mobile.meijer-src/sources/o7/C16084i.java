package o7;

import X6.k;
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
import r7.l;

/* renamed from: o7.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16084i<R> implements InterfaceC16079d, com.bumptech.glide.request.target.i, InterfaceC16083h {

    /* renamed from: E, reason: collision with root package name */
    private static final boolean f153697E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A, reason: collision with root package name */
    private int f153698A;

    /* renamed from: B, reason: collision with root package name */
    private int f153699B;

    /* renamed from: C, reason: collision with root package name */
    private boolean f153700C;

    /* renamed from: D, reason: collision with root package name */
    private RuntimeException f153701D;

    /* renamed from: a, reason: collision with root package name */
    private int f153702a;

    /* renamed from: b, reason: collision with root package name */
    private final String f153703b;

    /* renamed from: c, reason: collision with root package name */
    private final s7.c f153704c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f153705d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC16081f<R> f153706e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC16080e f153707f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f153708g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.d f153709h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f153710i;

    /* renamed from: j, reason: collision with root package name */
    private final Class<R> f153711j;

    /* renamed from: k, reason: collision with root package name */
    private final AbstractC16076a<?> f153712k;

    /* renamed from: l, reason: collision with root package name */
    private final int f153713l;

    /* renamed from: m, reason: collision with root package name */
    private final int f153714m;

    /* renamed from: n, reason: collision with root package name */
    private final com.bumptech.glide.g f153715n;

    /* renamed from: o, reason: collision with root package name */
    private final com.bumptech.glide.request.target.j<R> f153716o;

    /* renamed from: p, reason: collision with root package name */
    private final List<InterfaceC16081f<R>> f153717p;

    /* renamed from: q, reason: collision with root package name */
    private final p7.c<? super R> f153718q;

    /* renamed from: r, reason: collision with root package name */
    private final Executor f153719r;

    /* renamed from: s, reason: collision with root package name */
    private Z6.c<R> f153720s;

    /* renamed from: t, reason: collision with root package name */
    private j.d f153721t;

    /* renamed from: u, reason: collision with root package name */
    private long f153722u;

    /* renamed from: v, reason: collision with root package name */
    private volatile com.bumptech.glide.load.engine.j f153723v;

    /* renamed from: w, reason: collision with root package name */
    private a f153724w;

    /* renamed from: x, reason: collision with root package name */
    private Drawable f153725x;

    /* renamed from: y, reason: collision with root package name */
    private Drawable f153726y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f153727z;

    /* renamed from: o7.i$a */
    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    @Override // o7.InterfaceC16083h
    public void b(GlideException glideException) {
        y(glideException, 5);
    }

    private void g() {
        if (this.f153700C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean j() {
        InterfaceC16080e interfaceC16080e = this.f153707f;
        return interfaceC16080e == null || interfaceC16080e.c(this);
    }

    private boolean k() {
        InterfaceC16080e interfaceC16080e = this.f153707f;
        return interfaceC16080e == null || interfaceC16080e.b(this);
    }

    private boolean l() {
        InterfaceC16080e interfaceC16080e = this.f153707f;
        return interfaceC16080e == null || interfaceC16080e.d(this);
    }

    private void n(Object obj) {
        List<InterfaceC16081f<R>> list = this.f153717p;
        if (list == null) {
            return;
        }
        for (InterfaceC16081f<R> interfaceC16081f : list) {
            if (interfaceC16081f instanceof AbstractC16078c) {
                ((AbstractC16078c) interfaceC16081f).c(obj);
            }
        }
    }

    private Drawable o() {
        if (this.f153725x == null) {
            Drawable drawableM = this.f153712k.m();
            this.f153725x = drawableM;
            if (drawableM == null && this.f153712k.l() > 0) {
                this.f153725x = s(this.f153712k.l());
            }
        }
        return this.f153725x;
    }

    private Drawable p() {
        if (this.f153727z == null) {
            Drawable drawableN = this.f153712k.n();
            this.f153727z = drawableN;
            if (drawableN == null && this.f153712k.o() > 0) {
                this.f153727z = s(this.f153712k.o());
            }
        }
        return this.f153727z;
    }

    private Drawable q() {
        if (this.f153726y == null) {
            Drawable drawableT = this.f153712k.t();
            this.f153726y = drawableT;
            if (drawableT == null && this.f153712k.u() > 0) {
                this.f153726y = s(this.f153712k.u());
            }
        }
        return this.f153726y;
    }

    private boolean r() {
        InterfaceC16080e interfaceC16080e = this.f153707f;
        return interfaceC16080e == null || !interfaceC16080e.getRoot().a();
    }

    private Drawable s(int i10) {
        return h7.i.a(this.f153708g, i10, this.f153712k.z() != null ? this.f153712k.z() : this.f153708g.getTheme());
    }

    private void t(String str) {
        FS.log_v("GlideRequest", str + " this: " + this.f153703b);
    }

    private static int u(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * i10);
    }

    private void v() {
        InterfaceC16080e interfaceC16080e = this.f153707f;
        if (interfaceC16080e != null) {
            interfaceC16080e.f(this);
        }
    }

    private void w() {
        InterfaceC16080e interfaceC16080e = this.f153707f;
        if (interfaceC16080e != null) {
            interfaceC16080e.g(this);
        }
    }

    public static <R> C16084i<R> x(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, AbstractC16076a<?> abstractC16076a, int i10, int i11, com.bumptech.glide.g gVar, com.bumptech.glide.request.target.j<R> jVar, InterfaceC16081f<R> interfaceC16081f, List<InterfaceC16081f<R>> list, InterfaceC16080e interfaceC16080e, com.bumptech.glide.load.engine.j jVar2, p7.c<? super R> cVar, Executor executor) {
        return new C16084i<>(context, dVar, obj, obj2, cls, abstractC16076a, i10, i11, gVar, jVar, interfaceC16081f, list, interfaceC16080e, jVar2, cVar, executor);
    }

    private void y(GlideException glideException, int i10) {
        boolean zB;
        this.f153704c.c();
        synchronized (this.f153705d) {
            try {
                glideException.k(this.f153701D);
                int iH = this.f153709h.h();
                if (iH <= i10) {
                    FS.log_w("Glide", "Load failed for [" + this.f153710i + "] with dimensions [" + this.f153698A + "x" + this.f153699B + "]", glideException);
                    if (iH <= 4) {
                        glideException.g("Glide");
                    }
                }
                this.f153721t = null;
                this.f153724w = a.FAILED;
                v();
                boolean z10 = true;
                this.f153700C = true;
                try {
                    List<InterfaceC16081f<R>> list = this.f153717p;
                    if (list != null) {
                        Iterator<InterfaceC16081f<R>> it = list.iterator();
                        zB = false;
                        while (it.hasNext()) {
                            zB |= it.next().b(glideException, this.f153710i, this.f153716o, r());
                        }
                    } else {
                        zB = false;
                    }
                    InterfaceC16081f<R> interfaceC16081f = this.f153706e;
                    if (interfaceC16081f == null || !interfaceC16081f.b(glideException, this.f153710i, this.f153716o, r())) {
                        z10 = false;
                    }
                    if (!(zB | z10)) {
                        A();
                    }
                    this.f153700C = false;
                    s7.b.f("GlideRequest", this.f153702a);
                } catch (Throwable th2) {
                    this.f153700C = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // o7.InterfaceC16079d
    public boolean a() {
        boolean z10;
        synchronized (this.f153705d) {
            z10 = this.f153724w == a.COMPLETE;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o7.InterfaceC16083h
    public void c(Z6.c<?> cVar, X6.a aVar, boolean z10) {
        this.f153704c.c();
        Z6.c<?> cVar2 = null;
        try {
            synchronized (this.f153705d) {
                try {
                    this.f153721t = null;
                    if (cVar == null) {
                        b(new GlideException("Expected to receive a Resource<R> with an object of " + this.f153711j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = cVar.get();
                    try {
                        if (obj == null || !this.f153711j.isAssignableFrom(obj.getClass())) {
                            this.f153720s = null;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Expected to receive an object of ");
                            sb2.append(this.f153711j);
                            sb2.append(" but instead got ");
                            sb2.append(obj != null ? obj.getClass() : "");
                            sb2.append("{");
                            sb2.append(obj);
                            sb2.append("} inside Resource{");
                            sb2.append(cVar);
                            sb2.append("}.");
                            sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            b(new GlideException(sb2.toString()));
                        } else if (l()) {
                            z(cVar, obj, aVar, z10);
                            return;
                        } else {
                            this.f153720s = null;
                            this.f153724w = a.COMPLETE;
                            s7.b.f("GlideRequest", this.f153702a);
                        }
                        this.f153723v.k(cVar);
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
                this.f153723v.k(cVar2);
            }
            throw th4;
        }
    }

    @Override // o7.InterfaceC16079d
    public void clear() {
        synchronized (this.f153705d) {
            try {
                g();
                this.f153704c.c();
                a aVar = this.f153724w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                m();
                Z6.c<R> cVar = this.f153720s;
                if (cVar != null) {
                    this.f153720s = null;
                } else {
                    cVar = null;
                }
                if (j()) {
                    this.f153716o.onLoadCleared(q());
                }
                s7.b.f("GlideRequest", this.f153702a);
                this.f153724w = aVar2;
                if (cVar != null) {
                    this.f153723v.k(cVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.request.target.i
    public void d(int i10, int i11) throws Throwable {
        C16084i<R> c16084i = this;
        c16084i.f153704c.c();
        Object obj = c16084i.f153705d;
        synchronized (obj) {
            try {
                try {
                    boolean z10 = f153697E;
                    if (z10) {
                        c16084i.t("Got onSizeReady in " + r7.g.a(c16084i.f153722u));
                    }
                    if (c16084i.f153724w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        c16084i.f153724w = aVar;
                        float fY = c16084i.f153712k.y();
                        c16084i.f153698A = u(i10, fY);
                        c16084i.f153699B = u(i11, fY);
                        if (z10) {
                            c16084i.t("finished setup for calling load in " + r7.g.a(c16084i.f153722u));
                        }
                        try {
                            com.bumptech.glide.load.engine.j jVar = c16084i.f153723v;
                            com.bumptech.glide.d dVar = c16084i.f153709h;
                            try {
                                Object obj2 = c16084i.f153710i;
                                X6.e eVarX = c16084i.f153712k.x();
                                try {
                                    int i12 = c16084i.f153698A;
                                    int i13 = c16084i.f153699B;
                                    Class<?> clsW = c16084i.f153712k.w();
                                    Class<R> cls = c16084i.f153711j;
                                    try {
                                        com.bumptech.glide.g gVar = c16084i.f153715n;
                                        Z6.a aVarK = c16084i.f153712k.k();
                                        Map<Class<?>, k<?>> mapA = c16084i.f153712k.A();
                                        boolean zM = c16084i.f153712k.M();
                                        boolean zI = c16084i.f153712k.I();
                                        X6.g gVarQ = c16084i.f153712k.q();
                                        boolean zG = c16084i.f153712k.G();
                                        boolean zD = c16084i.f153712k.D();
                                        boolean zC = c16084i.f153712k.C();
                                        boolean zP = c16084i.f153712k.p();
                                        Executor executor = c16084i.f153719r;
                                        c16084i = obj;
                                        try {
                                            c16084i.f153721t = jVar.f(dVar, obj2, eVarX, i12, i13, clsW, cls, gVar, aVarK, mapA, zM, zI, gVarQ, zG, zD, zC, zP, c16084i, executor);
                                            if (c16084i.f153724w != aVar) {
                                                c16084i.f153721t = null;
                                            }
                                            if (z10) {
                                                c16084i.t("finished onSizeReady in " + r7.g.a(c16084i.f153722u));
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        c16084i = obj;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    c16084i = obj;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c16084i = obj;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            c16084i = obj;
                        }
                    }
                } catch (Throwable th7) {
                    th = th7;
                    c16084i = obj;
                }
            } catch (Throwable th8) {
                th = th8;
            }
        }
    }

    @Override // o7.InterfaceC16079d
    public boolean e() {
        boolean z10;
        synchronized (this.f153705d) {
            z10 = this.f153724w == a.CLEARED;
        }
        return z10;
    }

    @Override // o7.InterfaceC16083h
    public Object f() {
        this.f153704c.c();
        return this.f153705d;
    }

    @Override // o7.InterfaceC16079d
    public boolean h(InterfaceC16079d interfaceC16079d) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        AbstractC16076a<?> abstractC16076a;
        com.bumptech.glide.g gVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        AbstractC16076a<?> abstractC16076a2;
        com.bumptech.glide.g gVar2;
        int size2;
        if (!(interfaceC16079d instanceof C16084i)) {
            return false;
        }
        synchronized (this.f153705d) {
            try {
                i10 = this.f153713l;
                i11 = this.f153714m;
                obj = this.f153710i;
                cls = this.f153711j;
                abstractC16076a = this.f153712k;
                gVar = this.f153715n;
                List<InterfaceC16081f<R>> list = this.f153717p;
                size = list != null ? list.size() : 0;
            } finally {
            }
        }
        C16084i c16084i = (C16084i) interfaceC16079d;
        synchronized (c16084i.f153705d) {
            try {
                i12 = c16084i.f153713l;
                i13 = c16084i.f153714m;
                obj2 = c16084i.f153710i;
                cls2 = c16084i.f153711j;
                abstractC16076a2 = c16084i.f153712k;
                gVar2 = c16084i.f153715n;
                List<InterfaceC16081f<R>> list2 = c16084i.f153717p;
                size2 = list2 != null ? list2.size() : 0;
            } finally {
            }
        }
        return i10 == i12 && i11 == i13 && l.c(obj, obj2) && cls.equals(cls2) && l.b(abstractC16076a, abstractC16076a2) && gVar == gVar2 && size == size2;
    }

    @Override // o7.InterfaceC16079d
    public void i() {
        synchronized (this.f153705d) {
            try {
                g();
                this.f153704c.c();
                this.f153722u = r7.g.b();
                Object obj = this.f153710i;
                if (obj == null) {
                    if (l.t(this.f153713l, this.f153714m)) {
                        this.f153698A = this.f153713l;
                        this.f153699B = this.f153714m;
                    }
                    y(new GlideException("Received null model"), p() == null ? 5 : 3);
                    return;
                }
                a aVar = this.f153724w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    c(this.f153720s, X6.a.MEMORY_CACHE, false);
                    return;
                }
                n(obj);
                this.f153702a = s7.b.b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.f153724w = aVar3;
                if (l.t(this.f153713l, this.f153714m)) {
                    d(this.f153713l, this.f153714m);
                } else {
                    this.f153716o.getSize(this);
                }
                a aVar4 = this.f153724w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && k()) {
                    this.f153716o.onLoadStarted(q());
                }
                if (f153697E) {
                    t("finished run method in " + r7.g.a(this.f153722u));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o7.InterfaceC16079d
    public boolean isComplete() {
        boolean z10;
        synchronized (this.f153705d) {
            z10 = this.f153724w == a.COMPLETE;
        }
        return z10;
    }

    @Override // o7.InterfaceC16079d
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f153705d) {
            try {
                a aVar = this.f153724w;
                z10 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } finally {
            }
        }
        return z10;
    }

    @Override // o7.InterfaceC16079d
    public void pause() {
        synchronized (this.f153705d) {
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
        synchronized (this.f153705d) {
            obj = this.f153710i;
            cls = this.f153711j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    private C16084i(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, AbstractC16076a<?> abstractC16076a, int i10, int i11, com.bumptech.glide.g gVar, com.bumptech.glide.request.target.j<R> jVar, InterfaceC16081f<R> interfaceC16081f, List<InterfaceC16081f<R>> list, InterfaceC16080e interfaceC16080e, com.bumptech.glide.load.engine.j jVar2, p7.c<? super R> cVar, Executor executor) {
        String strValueOf;
        if (f153697E) {
            strValueOf = String.valueOf(super.hashCode());
        } else {
            strValueOf = null;
        }
        this.f153703b = strValueOf;
        this.f153704c = s7.c.a();
        this.f153705d = obj;
        this.f153708g = context;
        this.f153709h = dVar;
        this.f153710i = obj2;
        this.f153711j = cls;
        this.f153712k = abstractC16076a;
        this.f153713l = i10;
        this.f153714m = i11;
        this.f153715n = gVar;
        this.f153716o = jVar;
        this.f153706e = interfaceC16081f;
        this.f153717p = list;
        this.f153707f = interfaceC16080e;
        this.f153723v = jVar2;
        this.f153718q = cVar;
        this.f153719r = executor;
        this.f153724w = a.PENDING;
        if (this.f153701D == null && dVar.g().a(c.C1252c.class)) {
            this.f153701D = new RuntimeException("Glide request origin trace");
        }
    }

    private void A() {
        Drawable drawableQ;
        if (!k()) {
            return;
        }
        if (this.f153710i == null) {
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
        this.f153716o.onLoadFailed(drawableQ);
    }

    private void m() {
        g();
        this.f153704c.c();
        this.f153716o.removeCallback(this);
        j.d dVar = this.f153721t;
        if (dVar != null) {
            dVar.a();
            this.f153721t = null;
        }
    }

    private void z(Z6.c<R> cVar, R r10, X6.a aVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean zR = r();
        this.f153724w = a.COMPLETE;
        this.f153720s = cVar;
        if (this.f153709h.h() <= 3) {
            FS.log_d("Glide", "Finished loading " + r10.getClass().getSimpleName() + " from " + aVar + " for " + this.f153710i + " with size [" + this.f153698A + "x" + this.f153699B + "] in " + r7.g.a(this.f153722u) + " ms");
        }
        w();
        boolean z13 = true;
        this.f153700C = true;
        try {
            List<InterfaceC16081f<R>> list = this.f153717p;
            if (list != null) {
                z11 = false;
                for (InterfaceC16081f<R> interfaceC16081f : list) {
                    R r11 = r10;
                    X6.a aVar2 = aVar;
                    boolean zA = interfaceC16081f.a(r11, this.f153710i, this.f153716o, aVar2, zR) | z11;
                    if (interfaceC16081f instanceof AbstractC16078c) {
                        z12 = z10;
                        zA |= ((AbstractC16078c) interfaceC16081f).d(r11, this.f153710i, this.f153716o, aVar2, zR, z12);
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
            X6.a aVar3 = aVar;
            InterfaceC16081f<R> interfaceC16081f2 = this.f153706e;
            if (interfaceC16081f2 == null || !interfaceC16081f2.a(r12, this.f153710i, this.f153716o, aVar3, zR)) {
                z13 = false;
            }
            if (!(z13 | z11)) {
                this.f153716o.onResourceReady(r12, this.f153718q.a(aVar3, zR));
            }
            this.f153700C = false;
            s7.b.f("GlideRequest", this.f153702a);
        } catch (Throwable th2) {
            this.f153700C = false;
            throw th2;
        }
    }
}
