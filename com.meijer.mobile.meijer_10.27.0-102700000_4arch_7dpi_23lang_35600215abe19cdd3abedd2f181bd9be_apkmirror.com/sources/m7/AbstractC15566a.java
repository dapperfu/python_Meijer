package m7;

import V6.k;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.n;
import com.bumptech.glide.load.resource.bitmap.o;
import com.bumptech.glide.load.resource.bitmap.u;
import com.bumptech.glide.load.resource.bitmap.w;
import h7.C14383c;
import java.util.Map;
import m7.AbstractC15566a;
import p7.C16265b;
import p7.l;

/* renamed from: m7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC15566a<T extends AbstractC15566a<T>> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int f149871a;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f149875e;

    /* renamed from: f, reason: collision with root package name */
    private int f149876f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f149877g;

    /* renamed from: h, reason: collision with root package name */
    private int f149878h;

    /* renamed from: m, reason: collision with root package name */
    private boolean f149883m;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f149885o;

    /* renamed from: p, reason: collision with root package name */
    private int f149886p;

    /* renamed from: t, reason: collision with root package name */
    private boolean f149890t;

    /* renamed from: u, reason: collision with root package name */
    private Resources.Theme f149891u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f149892v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f149893w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f149894x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f149896z;

    /* renamed from: b, reason: collision with root package name */
    private float f149872b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    private X6.a f149873c = X6.a.f39161e;

    /* renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.g f149874d = com.bumptech.glide.g.NORMAL;

    /* renamed from: i, reason: collision with root package name */
    private boolean f149879i = true;

    /* renamed from: j, reason: collision with root package name */
    private int f149880j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f149881k = -1;

    /* renamed from: l, reason: collision with root package name */
    private V6.e f149882l = o7.c.a();

    /* renamed from: n, reason: collision with root package name */
    private boolean f149884n = true;

    /* renamed from: q, reason: collision with root package name */
    private V6.g f149887q = new V6.g();

    /* renamed from: r, reason: collision with root package name */
    private Map<Class<?>, k<?>> f149888r = new C16265b();

    /* renamed from: s, reason: collision with root package name */
    private Class<?> f149889s = Object.class;

    /* renamed from: y, reason: collision with root package name */
    private boolean f149895y = true;

    private static boolean K(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private T U(o oVar, k<Bitmap> kVar) {
        return (T) b0(oVar, kVar, false);
    }

    private T a0(o oVar, k<Bitmap> kVar) {
        return (T) b0(oVar, kVar, true);
    }

    private T d0() {
        return this;
    }

    public T P() {
        this.f149890t = true;
        return (T) d0();
    }

    public T k0(k<Bitmap> kVar) {
        return (T) l0(kVar, true);
    }

    private boolean J(int i10) {
        return K(this.f149871a, i10);
    }

    private T b0(o oVar, k<Bitmap> kVar, boolean z10) {
        T t10 = z10 ? (T) m0(oVar, kVar) : (T) V(oVar, kVar);
        t10.f149895y = true;
        return t10;
    }

    public final Map<Class<?>, k<?>> A() {
        return this.f149888r;
    }

    public final boolean C() {
        return this.f149896z;
    }

    public final boolean D() {
        return this.f149893w;
    }

    protected final boolean E() {
        return this.f149892v;
    }

    public final boolean F(AbstractC15566a<?> abstractC15566a) {
        return Float.compare(abstractC15566a.f149872b, this.f149872b) == 0 && this.f149876f == abstractC15566a.f149876f && l.d(this.f149875e, abstractC15566a.f149875e) && this.f149878h == abstractC15566a.f149878h && l.d(this.f149877g, abstractC15566a.f149877g) && this.f149886p == abstractC15566a.f149886p && l.d(this.f149885o, abstractC15566a.f149885o) && this.f149879i == abstractC15566a.f149879i && this.f149880j == abstractC15566a.f149880j && this.f149881k == abstractC15566a.f149881k && this.f149883m == abstractC15566a.f149883m && this.f149884n == abstractC15566a.f149884n && this.f149893w == abstractC15566a.f149893w && this.f149894x == abstractC15566a.f149894x && this.f149873c.equals(abstractC15566a.f149873c) && this.f149874d == abstractC15566a.f149874d && this.f149887q.equals(abstractC15566a.f149887q) && this.f149888r.equals(abstractC15566a.f149888r) && this.f149889s.equals(abstractC15566a.f149889s) && l.d(this.f149882l, abstractC15566a.f149882l) && l.d(this.f149891u, abstractC15566a.f149891u);
    }

    public final boolean G() {
        return this.f149879i;
    }

    public final boolean H() {
        return J(8);
    }

    boolean I() {
        return this.f149895y;
    }

    public final boolean L() {
        return this.f149884n;
    }

    public final boolean M() {
        return this.f149883m;
    }

    public final boolean N() {
        return J(RecyclerView.m.FLAG_MOVED);
    }

    public final boolean O() {
        return l.t(this.f149881k, this.f149880j);
    }

    public T Q() {
        return (T) V(o.f64074e, new com.bumptech.glide.load.resource.bitmap.l());
    }

    public T R() {
        return (T) U(o.f64073d, new m());
    }

    public T S() {
        return (T) U(o.f64072c, new w());
    }

    final T V(o oVar, k<Bitmap> kVar) {
        if (this.f149892v) {
            return (T) clone().V(oVar, kVar);
        }
        i(oVar);
        return (T) l0(kVar, false);
    }

    public T W(int i10, int i11) {
        if (this.f149892v) {
            return (T) clone().W(i10, i11);
        }
        this.f149881k = i10;
        this.f149880j = i11;
        this.f149871a |= 512;
        return (T) e0();
    }

    public T X(Drawable drawable) {
        if (this.f149892v) {
            return (T) clone().X(drawable);
        }
        this.f149877g = drawable;
        int i10 = this.f149871a | 64;
        this.f149878h = 0;
        this.f149871a = i10 & (-129);
        return (T) e0();
    }

    public T Y(com.bumptech.glide.g gVar) {
        if (this.f149892v) {
            return (T) clone().Y(gVar);
        }
        this.f149874d = (com.bumptech.glide.g) p7.k.d(gVar);
        this.f149871a |= 8;
        return (T) e0();
    }

    T Z(V6.f<?> fVar) {
        if (this.f149892v) {
            return (T) clone().Z(fVar);
        }
        this.f149887q.c(fVar);
        return (T) e0();
    }

    public T a(AbstractC15566a<?> abstractC15566a) {
        if (this.f149892v) {
            return (T) clone().a(abstractC15566a);
        }
        if (K(abstractC15566a.f149871a, 2)) {
            this.f149872b = abstractC15566a.f149872b;
        }
        if (K(abstractC15566a.f149871a, 262144)) {
            this.f149893w = abstractC15566a.f149893w;
        }
        if (K(abstractC15566a.f149871a, 1048576)) {
            this.f149896z = abstractC15566a.f149896z;
        }
        if (K(abstractC15566a.f149871a, 4)) {
            this.f149873c = abstractC15566a.f149873c;
        }
        if (K(abstractC15566a.f149871a, 8)) {
            this.f149874d = abstractC15566a.f149874d;
        }
        if (K(abstractC15566a.f149871a, 16)) {
            this.f149875e = abstractC15566a.f149875e;
            this.f149876f = 0;
            this.f149871a &= -33;
        }
        if (K(abstractC15566a.f149871a, 32)) {
            this.f149876f = abstractC15566a.f149876f;
            this.f149875e = null;
            this.f149871a &= -17;
        }
        if (K(abstractC15566a.f149871a, 64)) {
            this.f149877g = abstractC15566a.f149877g;
            this.f149878h = 0;
            this.f149871a &= -129;
        }
        if (K(abstractC15566a.f149871a, 128)) {
            this.f149878h = abstractC15566a.f149878h;
            this.f149877g = null;
            this.f149871a &= -65;
        }
        if (K(abstractC15566a.f149871a, 256)) {
            this.f149879i = abstractC15566a.f149879i;
        }
        if (K(abstractC15566a.f149871a, 512)) {
            this.f149881k = abstractC15566a.f149881k;
            this.f149880j = abstractC15566a.f149880j;
        }
        if (K(abstractC15566a.f149871a, 1024)) {
            this.f149882l = abstractC15566a.f149882l;
        }
        if (K(abstractC15566a.f149871a, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            this.f149889s = abstractC15566a.f149889s;
        }
        if (K(abstractC15566a.f149871a, 8192)) {
            this.f149885o = abstractC15566a.f149885o;
            this.f149886p = 0;
            this.f149871a &= -16385;
        }
        if (K(abstractC15566a.f149871a, 16384)) {
            this.f149886p = abstractC15566a.f149886p;
            this.f149885o = null;
            this.f149871a &= -8193;
        }
        if (K(abstractC15566a.f149871a, 32768)) {
            this.f149891u = abstractC15566a.f149891u;
        }
        if (K(abstractC15566a.f149871a, 65536)) {
            this.f149884n = abstractC15566a.f149884n;
        }
        if (K(abstractC15566a.f149871a, 131072)) {
            this.f149883m = abstractC15566a.f149883m;
        }
        if (K(abstractC15566a.f149871a, RecyclerView.m.FLAG_MOVED)) {
            this.f149888r.putAll(abstractC15566a.f149888r);
            this.f149895y = abstractC15566a.f149895y;
        }
        if (K(abstractC15566a.f149871a, 524288)) {
            this.f149894x = abstractC15566a.f149894x;
        }
        if (!this.f149884n) {
            this.f149888r.clear();
            int i10 = this.f149871a;
            this.f149883m = false;
            this.f149871a = i10 & (-133121);
            this.f149895y = true;
        }
        this.f149871a |= abstractC15566a.f149871a;
        this.f149887q.b(abstractC15566a.f149887q);
        return (T) e0();
    }

    public T b() {
        if (this.f149890t && !this.f149892v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f149892v = true;
        return (T) P();
    }

    public T c() {
        return (T) m0(o.f64073d, new n());
    }

    public T e(Class<?> cls) {
        if (this.f149892v) {
            return (T) clone().e(cls);
        }
        this.f149889s = (Class) p7.k.d(cls);
        this.f149871a |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        return (T) e0();
    }

    protected final T e0() {
        if (this.f149890t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) d0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC15566a) {
            return F((AbstractC15566a) obj);
        }
        return false;
    }

    public T f(X6.a aVar) {
        if (this.f149892v) {
            return (T) clone().f(aVar);
        }
        this.f149873c = (X6.a) p7.k.d(aVar);
        this.f149871a |= 4;
        return (T) e0();
    }

    public <Y> T f0(V6.f<Y> fVar, Y y10) {
        if (this.f149892v) {
            return (T) clone().f0(fVar, y10);
        }
        p7.k.d(fVar);
        p7.k.d(y10);
        this.f149887q.d(fVar, y10);
        return (T) e0();
    }

    public T g() {
        return (T) f0(h7.i.f134496b, Boolean.TRUE);
    }

    public T g0(V6.e eVar) {
        if (this.f149892v) {
            return (T) clone().g0(eVar);
        }
        this.f149882l = (V6.e) p7.k.d(eVar);
        this.f149871a |= 1024;
        return (T) e0();
    }

    public T h0(float f10) {
        if (this.f149892v) {
            return (T) clone().h0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f149872b = f10;
        this.f149871a |= 2;
        return (T) e0();
    }

    public int hashCode() {
        return l.o(this.f149891u, l.o(this.f149882l, l.o(this.f149889s, l.o(this.f149888r, l.o(this.f149887q, l.o(this.f149874d, l.o(this.f149873c, l.p(this.f149894x, l.p(this.f149893w, l.p(this.f149884n, l.p(this.f149883m, l.n(this.f149881k, l.n(this.f149880j, l.p(this.f149879i, l.o(this.f149885o, l.n(this.f149886p, l.o(this.f149877g, l.n(this.f149878h, l.o(this.f149875e, l.n(this.f149876f, l.l(this.f149872b)))))))))))))))))))));
    }

    public T i(o oVar) {
        return (T) f0(o.f64077h, p7.k.d(oVar));
    }

    public T i0(boolean z10) {
        if (this.f149892v) {
            return (T) clone().i0(true);
        }
        this.f149879i = !z10;
        this.f149871a |= 256;
        return (T) e0();
    }

    public T j() {
        return (T) a0(o.f64072c, new w());
    }

    public T j0(Resources.Theme theme) {
        if (this.f149892v) {
            return (T) clone().j0(theme);
        }
        this.f149891u = theme;
        if (theme != null) {
            this.f149871a |= 32768;
            return (T) f0(f7.l.f130827b, theme);
        }
        this.f149871a &= -32769;
        return (T) Z(f7.l.f130827b);
    }

    public final X6.a k() {
        return this.f149873c;
    }

    public final int l() {
        return this.f149876f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    T l0(k<Bitmap> kVar, boolean z10) {
        if (this.f149892v) {
            return (T) clone().l0(kVar, z10);
        }
        u uVar = new u(kVar, z10);
        n0(Bitmap.class, kVar, z10);
        n0(Drawable.class, uVar, z10);
        n0(BitmapDrawable.class, uVar.a(), z10);
        n0(C14383c.class, new h7.f(kVar), z10);
        return (T) e0();
    }

    public final Drawable m() {
        return this.f149875e;
    }

    final T m0(o oVar, k<Bitmap> kVar) {
        if (this.f149892v) {
            return (T) clone().m0(oVar, kVar);
        }
        i(oVar);
        return (T) k0(kVar);
    }

    public final Drawable n() {
        return this.f149885o;
    }

    <Y> T n0(Class<Y> cls, k<Y> kVar, boolean z10) {
        if (this.f149892v) {
            return (T) clone().n0(cls, kVar, z10);
        }
        p7.k.d(cls);
        p7.k.d(kVar);
        this.f149888r.put(cls, kVar);
        int i10 = this.f149871a;
        this.f149884n = true;
        this.f149871a = 67584 | i10;
        this.f149895y = false;
        if (z10) {
            this.f149871a = i10 | 198656;
            this.f149883m = true;
        }
        return (T) e0();
    }

    public final int o() {
        return this.f149886p;
    }

    public T o0(boolean z10) {
        if (this.f149892v) {
            return (T) clone().o0(z10);
        }
        this.f149896z = z10;
        this.f149871a |= 1048576;
        return (T) e0();
    }

    public final boolean p() {
        return this.f149894x;
    }

    public final V6.g q() {
        return this.f149887q;
    }

    public final int r() {
        return this.f149880j;
    }

    public final int s() {
        return this.f149881k;
    }

    public final Drawable t() {
        return this.f149877g;
    }

    public final int u() {
        return this.f149878h;
    }

    public final com.bumptech.glide.g v() {
        return this.f149874d;
    }

    public final Class<?> w() {
        return this.f149889s;
    }

    public final V6.e x() {
        return this.f149882l;
    }

    public final float y() {
        return this.f149872b;
    }

    public final Resources.Theme z() {
        return this.f149891u;
    }

    @Override // 
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t10 = (T) super.clone();
            V6.g gVar = new V6.g();
            t10.f149887q = gVar;
            gVar.b(this.f149887q);
            C16265b c16265b = new C16265b();
            t10.f149888r = c16265b;
            c16265b.putAll(this.f149888r);
            t10.f149890t = false;
            t10.f149892v = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
