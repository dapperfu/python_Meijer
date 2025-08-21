package k6;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import h6.C14474e;
import java.util.ArrayList;
import java.util.List;
import w6.C17845a;
import w6.C17847c;

/* renamed from: k6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC15093a<K, A> {

    /* renamed from: c, reason: collision with root package name */
    private final d<K> f141623c;

    /* renamed from: e, reason: collision with root package name */
    protected C17847c<A> f141625e;

    /* renamed from: a, reason: collision with root package name */
    final List<b> f141621a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private boolean f141622b = false;

    /* renamed from: d, reason: collision with root package name */
    protected float f141624d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private A f141626f = null;

    /* renamed from: g, reason: collision with root package name */
    private float f141627g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f141628h = -1.0f;

    /* renamed from: k6.a$b */
    public interface b {
        void a();
    }

    /* renamed from: k6.a$c */
    private static final class c<T> implements d<T> {
        private c() {
        }

        @Override // k6.AbstractC15093a.d
        public boolean c(float f10) {
            return false;
        }

        @Override // k6.AbstractC15093a.d
        public float d() {
            return 0.0f;
        }

        @Override // k6.AbstractC15093a.d
        public boolean isEmpty() {
            return true;
        }

        @Override // k6.AbstractC15093a.d
        public boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // k6.AbstractC15093a.d
        public C17845a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // k6.AbstractC15093a.d
        public float e() {
            return 1.0f;
        }
    }

    /* renamed from: k6.a$d */
    private interface d<T> {
        boolean a(float f10);

        C17845a<T> b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    /* renamed from: k6.a$e */
    private static final class e<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        private final List<? extends C17845a<T>> f141629a;

        /* renamed from: c, reason: collision with root package name */
        private C17845a<T> f141631c = null;

        /* renamed from: d, reason: collision with root package name */
        private float f141632d = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        private C17845a<T> f141630b = f(0.0f);

        @Override // k6.AbstractC15093a.d
        public boolean isEmpty() {
            return false;
        }

        private C17845a<T> f(float f10) {
            List<? extends C17845a<T>> list = this.f141629a;
            C17845a<T> c17845a = list.get(list.size() - 1);
            if (f10 >= c17845a.f()) {
                return c17845a;
            }
            for (int size = this.f141629a.size() - 2; size >= 1; size--) {
                C17845a<T> c17845a2 = this.f141629a.get(size);
                if (this.f141630b != c17845a2 && c17845a2.a(f10)) {
                    return c17845a2;
                }
            }
            return this.f141629a.get(0);
        }

        @Override // k6.AbstractC15093a.d
        public boolean a(float f10) {
            C17845a<T> c17845a = this.f141631c;
            C17845a<T> c17845a2 = this.f141630b;
            if (c17845a == c17845a2 && this.f141632d == f10) {
                return true;
            }
            this.f141631c = c17845a2;
            this.f141632d = f10;
            return false;
        }

        @Override // k6.AbstractC15093a.d
        public C17845a<T> b() {
            return this.f141630b;
        }

        @Override // k6.AbstractC15093a.d
        public boolean c(float f10) {
            if (this.f141630b.a(f10)) {
                return !this.f141630b.i();
            }
            this.f141630b = f(f10);
            return true;
        }

        @Override // k6.AbstractC15093a.d
        public float d() {
            return this.f141629a.get(0).f();
        }

        @Override // k6.AbstractC15093a.d
        public float e() {
            return this.f141629a.get(r0.size() - 1).c();
        }

        e(List<? extends C17845a<T>> list) {
            this.f141629a = list;
        }
    }

    /* renamed from: k6.a$f */
    private static final class f<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        private final C17845a<T> f141633a;

        /* renamed from: b, reason: collision with root package name */
        private float f141634b = -1.0f;

        @Override // k6.AbstractC15093a.d
        public boolean isEmpty() {
            return false;
        }

        @Override // k6.AbstractC15093a.d
        public boolean a(float f10) {
            if (this.f141634b == f10) {
                return true;
            }
            this.f141634b = f10;
            return false;
        }

        @Override // k6.AbstractC15093a.d
        public C17845a<T> b() {
            return this.f141633a;
        }

        @Override // k6.AbstractC15093a.d
        public boolean c(float f10) {
            return !this.f141633a.i();
        }

        @Override // k6.AbstractC15093a.d
        public float d() {
            return this.f141633a.f();
        }

        @Override // k6.AbstractC15093a.d
        public float e() {
            return this.f141633a.c();
        }

        f(List<? extends C17845a<T>> list) {
            this.f141633a = list.get(0);
        }
    }

    abstract A i(C17845a<K> c17845a, float f10);

    public void m() {
        this.f141622b = true;
    }

    protected boolean p() {
        return false;
    }

    @SuppressLint({"Range"})
    private float g() {
        if (this.f141627g == -1.0f) {
            this.f141627g = this.f141623c.d();
        }
        return this.f141627g;
    }

    public void a(b bVar) {
        this.f141621a.add(bVar);
    }

    @SuppressLint({"Range"})
    float c() {
        if (this.f141628h == -1.0f) {
            this.f141628h = this.f141623c.e();
        }
        return this.f141628h;
    }

    float e() {
        if (this.f141622b) {
            return 0.0f;
        }
        C17845a<K> c17845aB = b();
        if (c17845aB.i()) {
            return 0.0f;
        }
        return (this.f141624d - c17845aB.f()) / (c17845aB.c() - c17845aB.f());
    }

    public float f() {
        return this.f141624d;
    }

    protected A j(C17845a<K> c17845a, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f141625e != null;
    }

    public void o(C17847c<A> c17847c) {
        C17847c<A> c17847c2 = this.f141625e;
        if (c17847c2 != null) {
            c17847c2.c(null);
        }
        this.f141625e = c17847c;
        if (c17847c != null) {
            c17847c.c(this);
        }
    }

    AbstractC15093a(List<? extends C17845a<K>> list) {
        this.f141623c = q(list);
    }

    private static <T> d<T> q(List<? extends C17845a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    protected C17845a<K> b() {
        if (C14474e.h()) {
            C14474e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        C17845a<K> c17845aB = this.f141623c.b();
        if (C14474e.h()) {
            C14474e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return c17845aB;
    }

    protected float d() {
        Interpolator interpolator;
        C17845a<K> c17845aB = b();
        if (c17845aB != null && !c17845aB.i() && (interpolator = c17845aB.f166947d) != null) {
            return interpolator.getInterpolation(e());
        }
        return 0.0f;
    }

    public A h() {
        A aI;
        float fE = e();
        if (this.f141625e == null && this.f141623c.a(fE) && !p()) {
            return this.f141626f;
        }
        C17845a<K> c17845aB = b();
        Interpolator interpolator = c17845aB.f166948e;
        if (interpolator != null && c17845aB.f166949f != null) {
            aI = j(c17845aB, fE, interpolator.getInterpolation(fE), c17845aB.f166949f.getInterpolation(fE));
        } else {
            aI = i(c17845aB, d());
        }
        this.f141626f = aI;
        return aI;
    }

    public void l() {
        if (C14474e.h()) {
            C14474e.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i10 = 0; i10 < this.f141621a.size(); i10++) {
            this.f141621a.get(i10).a();
        }
        if (C14474e.h()) {
            C14474e.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void n(float f10) {
        if (C14474e.h()) {
            C14474e.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f141623c.isEmpty()) {
            if (C14474e.h()) {
                C14474e.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f141624d) {
            if (C14474e.h()) {
                C14474e.c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f141624d = f10;
            if (this.f141623c.c(f10)) {
                l();
            }
            if (C14474e.h()) {
                C14474e.c("BaseKeyframeAnimation#setProgress");
            }
        }
    }
}
