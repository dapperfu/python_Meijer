package o7;

import X6.k;
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
import j7.C14961c;
import java.util.Map;
import o7.AbstractC16076a;
import r7.C16869b;
import r7.l;

/* renamed from: o7.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC16076a<T extends AbstractC16076a<T>> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int f153658a;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f153662e;

    /* renamed from: f, reason: collision with root package name */
    private int f153663f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f153664g;

    /* renamed from: h, reason: collision with root package name */
    private int f153665h;

    /* renamed from: m, reason: collision with root package name */
    private boolean f153670m;

    /* renamed from: o, reason: collision with root package name */
    private Drawable f153672o;

    /* renamed from: p, reason: collision with root package name */
    private int f153673p;

    /* renamed from: t, reason: collision with root package name */
    private boolean f153677t;

    /* renamed from: u, reason: collision with root package name */
    private Resources.Theme f153678u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f153679v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f153680w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f153681x;

    /* renamed from: z, reason: collision with root package name */
    private boolean f153683z;

    /* renamed from: b, reason: collision with root package name */
    private float f153659b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    private Z6.a f153660c = Z6.a.f43639e;

    /* renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.g f153661d = com.bumptech.glide.g.NORMAL;

    /* renamed from: i, reason: collision with root package name */
    private boolean f153666i = true;

    /* renamed from: j, reason: collision with root package name */
    private int f153667j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f153668k = -1;

    /* renamed from: l, reason: collision with root package name */
    private X6.e f153669l = q7.c.a();

    /* renamed from: n, reason: collision with root package name */
    private boolean f153671n = true;

    /* renamed from: q, reason: collision with root package name */
    private X6.g f153674q = new X6.g();

    /* renamed from: r, reason: collision with root package name */
    private Map<Class<?>, k<?>> f153675r = new C16869b();

    /* renamed from: s, reason: collision with root package name */
    private Class<?> f153676s = Object.class;

    /* renamed from: y, reason: collision with root package name */
    private boolean f153682y = true;

    private static boolean K(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private T U(o oVar, k<Bitmap> kVar) {
        return (T) c0(oVar, kVar, false);
    }

    private T a0(o oVar, k<Bitmap> kVar) {
        return (T) c0(oVar, kVar, true);
    }

    private T d0() {
        return this;
    }

    public T P() {
        this.f153677t = true;
        return (T) d0();
    }

    public T k0(k<Bitmap> kVar) {
        return (T) l0(kVar, true);
    }

    private boolean J(int i10) {
        return K(this.f153658a, i10);
    }

    private T c0(o oVar, k<Bitmap> kVar, boolean z10) {
        T t10 = z10 ? (T) m0(oVar, kVar) : (T) V(oVar, kVar);
        t10.f153682y = true;
        return t10;
    }

    public final Map<Class<?>, k<?>> A() {
        return this.f153675r;
    }

    public final boolean C() {
        return this.f153683z;
    }

    public final boolean D() {
        return this.f153680w;
    }

    protected final boolean E() {
        return this.f153679v;
    }

    public final boolean F(AbstractC16076a<?> abstractC16076a) {
        return Float.compare(abstractC16076a.f153659b, this.f153659b) == 0 && this.f153663f == abstractC16076a.f153663f && l.d(this.f153662e, abstractC16076a.f153662e) && this.f153665h == abstractC16076a.f153665h && l.d(this.f153664g, abstractC16076a.f153664g) && this.f153673p == abstractC16076a.f153673p && l.d(this.f153672o, abstractC16076a.f153672o) && this.f153666i == abstractC16076a.f153666i && this.f153667j == abstractC16076a.f153667j && this.f153668k == abstractC16076a.f153668k && this.f153670m == abstractC16076a.f153670m && this.f153671n == abstractC16076a.f153671n && this.f153680w == abstractC16076a.f153680w && this.f153681x == abstractC16076a.f153681x && this.f153660c.equals(abstractC16076a.f153660c) && this.f153661d == abstractC16076a.f153661d && this.f153674q.equals(abstractC16076a.f153674q) && this.f153675r.equals(abstractC16076a.f153675r) && this.f153676s.equals(abstractC16076a.f153676s) && l.d(this.f153669l, abstractC16076a.f153669l) && l.d(this.f153678u, abstractC16076a.f153678u);
    }

    public final boolean G() {
        return this.f153666i;
    }

    public final boolean H() {
        return J(8);
    }

    boolean I() {
        return this.f153682y;
    }

    public final boolean L() {
        return this.f153671n;
    }

    public final boolean M() {
        return this.f153670m;
    }

    public final boolean N() {
        return J(RecyclerView.m.FLAG_MOVED);
    }

    public final boolean O() {
        return l.t(this.f153668k, this.f153667j);
    }

    public T Q() {
        return (T) V(o.f64914e, new com.bumptech.glide.load.resource.bitmap.l());
    }

    public T R() {
        return (T) U(o.f64913d, new m());
    }

    public T S() {
        return (T) U(o.f64912c, new w());
    }

    final T V(o oVar, k<Bitmap> kVar) {
        if (this.f153679v) {
            return (T) clone().V(oVar, kVar);
        }
        i(oVar);
        return (T) l0(kVar, false);
    }

    public T W(int i10, int i11) {
        if (this.f153679v) {
            return (T) clone().W(i10, i11);
        }
        this.f153668k = i10;
        this.f153667j = i11;
        this.f153658a |= 512;
        return (T) e0();
    }

    public T X(Drawable drawable) {
        if (this.f153679v) {
            return (T) clone().X(drawable);
        }
        this.f153664g = drawable;
        int i10 = this.f153658a | 64;
        this.f153665h = 0;
        this.f153658a = i10 & (-129);
        return (T) e0();
    }

    public T Y(com.bumptech.glide.g gVar) {
        if (this.f153679v) {
            return (T) clone().Y(gVar);
        }
        this.f153661d = (com.bumptech.glide.g) r7.k.d(gVar);
        this.f153658a |= 8;
        return (T) e0();
    }

    T Z(X6.f<?> fVar) {
        if (this.f153679v) {
            return (T) clone().Z(fVar);
        }
        this.f153674q.c(fVar);
        return (T) e0();
    }

    public T a(AbstractC16076a<?> abstractC16076a) {
        if (this.f153679v) {
            return (T) clone().a(abstractC16076a);
        }
        if (K(abstractC16076a.f153658a, 2)) {
            this.f153659b = abstractC16076a.f153659b;
        }
        if (K(abstractC16076a.f153658a, 262144)) {
            this.f153680w = abstractC16076a.f153680w;
        }
        if (K(abstractC16076a.f153658a, 1048576)) {
            this.f153683z = abstractC16076a.f153683z;
        }
        if (K(abstractC16076a.f153658a, 4)) {
            this.f153660c = abstractC16076a.f153660c;
        }
        if (K(abstractC16076a.f153658a, 8)) {
            this.f153661d = abstractC16076a.f153661d;
        }
        if (K(abstractC16076a.f153658a, 16)) {
            this.f153662e = abstractC16076a.f153662e;
            this.f153663f = 0;
            this.f153658a &= -33;
        }
        if (K(abstractC16076a.f153658a, 32)) {
            this.f153663f = abstractC16076a.f153663f;
            this.f153662e = null;
            this.f153658a &= -17;
        }
        if (K(abstractC16076a.f153658a, 64)) {
            this.f153664g = abstractC16076a.f153664g;
            this.f153665h = 0;
            this.f153658a &= -129;
        }
        if (K(abstractC16076a.f153658a, 128)) {
            this.f153665h = abstractC16076a.f153665h;
            this.f153664g = null;
            this.f153658a &= -65;
        }
        if (K(abstractC16076a.f153658a, 256)) {
            this.f153666i = abstractC16076a.f153666i;
        }
        if (K(abstractC16076a.f153658a, 512)) {
            this.f153668k = abstractC16076a.f153668k;
            this.f153667j = abstractC16076a.f153667j;
        }
        if (K(abstractC16076a.f153658a, 1024)) {
            this.f153669l = abstractC16076a.f153669l;
        }
        if (K(abstractC16076a.f153658a, RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            this.f153676s = abstractC16076a.f153676s;
        }
        if (K(abstractC16076a.f153658a, 8192)) {
            this.f153672o = abstractC16076a.f153672o;
            this.f153673p = 0;
            this.f153658a &= -16385;
        }
        if (K(abstractC16076a.f153658a, 16384)) {
            this.f153673p = abstractC16076a.f153673p;
            this.f153672o = null;
            this.f153658a &= -8193;
        }
        if (K(abstractC16076a.f153658a, 32768)) {
            this.f153678u = abstractC16076a.f153678u;
        }
        if (K(abstractC16076a.f153658a, 65536)) {
            this.f153671n = abstractC16076a.f153671n;
        }
        if (K(abstractC16076a.f153658a, 131072)) {
            this.f153670m = abstractC16076a.f153670m;
        }
        if (K(abstractC16076a.f153658a, RecyclerView.m.FLAG_MOVED)) {
            this.f153675r.putAll(abstractC16076a.f153675r);
            this.f153682y = abstractC16076a.f153682y;
        }
        if (K(abstractC16076a.f153658a, 524288)) {
            this.f153681x = abstractC16076a.f153681x;
        }
        if (!this.f153671n) {
            this.f153675r.clear();
            int i10 = this.f153658a;
            this.f153670m = false;
            this.f153658a = i10 & (-133121);
            this.f153682y = true;
        }
        this.f153658a |= abstractC16076a.f153658a;
        this.f153674q.b(abstractC16076a.f153674q);
        return (T) e0();
    }

    public T b() {
        if (this.f153677t && !this.f153679v) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f153679v = true;
        return (T) P();
    }

    public T c() {
        return (T) m0(o.f64913d, new n());
    }

    public T e(Class<?> cls) {
        if (this.f153679v) {
            return (T) clone().e(cls);
        }
        this.f153676s = (Class) r7.k.d(cls);
        this.f153658a |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        return (T) e0();
    }

    protected final T e0() {
        if (this.f153677t) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) d0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC16076a) {
            return F((AbstractC16076a) obj);
        }
        return false;
    }

    public T f(Z6.a aVar) {
        if (this.f153679v) {
            return (T) clone().f(aVar);
        }
        this.f153660c = (Z6.a) r7.k.d(aVar);
        this.f153658a |= 4;
        return (T) e0();
    }

    public <Y> T f0(X6.f<Y> fVar, Y y10) {
        if (this.f153679v) {
            return (T) clone().f0(fVar, y10);
        }
        r7.k.d(fVar);
        r7.k.d(y10);
        this.f153674q.d(fVar, y10);
        return (T) e0();
    }

    public T g() {
        return (T) f0(j7.i.f140183b, Boolean.TRUE);
    }

    public T g0(X6.e eVar) {
        if (this.f153679v) {
            return (T) clone().g0(eVar);
        }
        this.f153669l = (X6.e) r7.k.d(eVar);
        this.f153658a |= 1024;
        return (T) e0();
    }

    public T h0(float f10) {
        if (this.f153679v) {
            return (T) clone().h0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f153659b = f10;
        this.f153658a |= 2;
        return (T) e0();
    }

    public int hashCode() {
        return l.o(this.f153678u, l.o(this.f153669l, l.o(this.f153676s, l.o(this.f153675r, l.o(this.f153674q, l.o(this.f153661d, l.o(this.f153660c, l.p(this.f153681x, l.p(this.f153680w, l.p(this.f153671n, l.p(this.f153670m, l.n(this.f153668k, l.n(this.f153667j, l.p(this.f153666i, l.o(this.f153672o, l.n(this.f153673p, l.o(this.f153664g, l.n(this.f153665h, l.o(this.f153662e, l.n(this.f153663f, l.l(this.f153659b)))))))))))))))))))));
    }

    public T i(o oVar) {
        return (T) f0(o.f64917h, r7.k.d(oVar));
    }

    public T i0(boolean z10) {
        if (this.f153679v) {
            return (T) clone().i0(true);
        }
        this.f153666i = !z10;
        this.f153658a |= 256;
        return (T) e0();
    }

    public T j() {
        return (T) a0(o.f64912c, new w());
    }

    public T j0(Resources.Theme theme) {
        if (this.f153679v) {
            return (T) clone().j0(theme);
        }
        this.f153678u = theme;
        if (theme != null) {
            this.f153658a |= 32768;
            return (T) f0(h7.l.f135173b, theme);
        }
        this.f153658a &= -32769;
        return (T) Z(h7.l.f135173b);
    }

    public final Z6.a k() {
        return this.f153660c;
    }

    public final int l() {
        return this.f153663f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    T l0(k<Bitmap> kVar, boolean z10) {
        if (this.f153679v) {
            return (T) clone().l0(kVar, z10);
        }
        u uVar = new u(kVar, z10);
        n0(Bitmap.class, kVar, z10);
        n0(Drawable.class, uVar, z10);
        n0(BitmapDrawable.class, uVar.a(), z10);
        n0(C14961c.class, new j7.f(kVar), z10);
        return (T) e0();
    }

    public final Drawable m() {
        return this.f153662e;
    }

    final T m0(o oVar, k<Bitmap> kVar) {
        if (this.f153679v) {
            return (T) clone().m0(oVar, kVar);
        }
        i(oVar);
        return (T) k0(kVar);
    }

    public final Drawable n() {
        return this.f153672o;
    }

    <Y> T n0(Class<Y> cls, k<Y> kVar, boolean z10) {
        if (this.f153679v) {
            return (T) clone().n0(cls, kVar, z10);
        }
        r7.k.d(cls);
        r7.k.d(kVar);
        this.f153675r.put(cls, kVar);
        int i10 = this.f153658a;
        this.f153671n = true;
        this.f153658a = 67584 | i10;
        this.f153682y = false;
        if (z10) {
            this.f153658a = i10 | 198656;
            this.f153670m = true;
        }
        return (T) e0();
    }

    public final int o() {
        return this.f153673p;
    }

    public T o0(boolean z10) {
        if (this.f153679v) {
            return (T) clone().o0(z10);
        }
        this.f153683z = z10;
        this.f153658a |= 1048576;
        return (T) e0();
    }

    public final boolean p() {
        return this.f153681x;
    }

    public final X6.g q() {
        return this.f153674q;
    }

    public final int r() {
        return this.f153667j;
    }

    public final int s() {
        return this.f153668k;
    }

    public final Drawable t() {
        return this.f153664g;
    }

    public final int u() {
        return this.f153665h;
    }

    public final com.bumptech.glide.g v() {
        return this.f153661d;
    }

    public final Class<?> w() {
        return this.f153676s;
    }

    public final X6.e x() {
        return this.f153669l;
    }

    public final float y() {
        return this.f153659b;
    }

    public final Resources.Theme z() {
        return this.f153678u;
    }

    @Override // 
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t10 = (T) super.clone();
            X6.g gVar = new X6.g();
            t10.f153674q = gVar;
            gVar.b(this.f153674q);
            C16869b c16869b = new C16869b();
            t10.f153675r = c16869b;
            c16869b.putAll(this.f153675r);
            t10.f153677t = false;
            t10.f153679v = false;
            return t10;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }
}
