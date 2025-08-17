package j6;

import android.annotation.SuppressLint;
import android.view.animation.Interpolator;
import g6.C14205e;
import java.util.ArrayList;
import java.util.List;
import v6.C17512a;
import v6.C17514c;

/* renamed from: j6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC14861a<K, A> {

    /* renamed from: c, reason: collision with root package name */
    private final d<K> f139425c;

    /* renamed from: e, reason: collision with root package name */
    protected C17514c<A> f139427e;

    /* renamed from: a, reason: collision with root package name */
    final List<b> f139423a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private boolean f139424b = false;

    /* renamed from: d, reason: collision with root package name */
    protected float f139426d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private A f139428f = null;

    /* renamed from: g, reason: collision with root package name */
    private float f139429g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f139430h = -1.0f;

    /* renamed from: j6.a$b */
    public interface b {
        void a();
    }

    /* renamed from: j6.a$c */
    private static final class c<T> implements d<T> {
        private c() {
        }

        @Override // j6.AbstractC14861a.d
        public boolean c(float f10) {
            return false;
        }

        @Override // j6.AbstractC14861a.d
        public float d() {
            return 0.0f;
        }

        @Override // j6.AbstractC14861a.d
        public boolean isEmpty() {
            return true;
        }

        @Override // j6.AbstractC14861a.d
        public boolean a(float f10) {
            throw new IllegalStateException("not implemented");
        }

        @Override // j6.AbstractC14861a.d
        public C17512a<T> b() {
            throw new IllegalStateException("not implemented");
        }

        @Override // j6.AbstractC14861a.d
        public float e() {
            return 1.0f;
        }
    }

    /* renamed from: j6.a$d */
    private interface d<T> {
        boolean a(float f10);

        C17512a<T> b();

        boolean c(float f10);

        float d();

        float e();

        boolean isEmpty();
    }

    /* renamed from: j6.a$e */
    private static final class e<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        private final List<? extends C17512a<T>> f139431a;

        /* renamed from: c, reason: collision with root package name */
        private C17512a<T> f139433c = null;

        /* renamed from: d, reason: collision with root package name */
        private float f139434d = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        private C17512a<T> f139432b = f(0.0f);

        @Override // j6.AbstractC14861a.d
        public boolean isEmpty() {
            return false;
        }

        private C17512a<T> f(float f10) {
            List<? extends C17512a<T>> list = this.f139431a;
            C17512a<T> c17512a = list.get(list.size() - 1);
            if (f10 >= c17512a.f()) {
                return c17512a;
            }
            for (int size = this.f139431a.size() - 2; size >= 1; size--) {
                C17512a<T> c17512a2 = this.f139431a.get(size);
                if (this.f139432b != c17512a2 && c17512a2.a(f10)) {
                    return c17512a2;
                }
            }
            return this.f139431a.get(0);
        }

        @Override // j6.AbstractC14861a.d
        public boolean a(float f10) {
            C17512a<T> c17512a = this.f139433c;
            C17512a<T> c17512a2 = this.f139432b;
            if (c17512a == c17512a2 && this.f139434d == f10) {
                return true;
            }
            this.f139433c = c17512a2;
            this.f139434d = f10;
            return false;
        }

        @Override // j6.AbstractC14861a.d
        public C17512a<T> b() {
            return this.f139432b;
        }

        @Override // j6.AbstractC14861a.d
        public boolean c(float f10) {
            if (this.f139432b.a(f10)) {
                return !this.f139432b.i();
            }
            this.f139432b = f(f10);
            return true;
        }

        @Override // j6.AbstractC14861a.d
        public float d() {
            return this.f139431a.get(0).f();
        }

        @Override // j6.AbstractC14861a.d
        public float e() {
            return this.f139431a.get(r0.size() - 1).c();
        }

        e(List<? extends C17512a<T>> list) {
            this.f139431a = list;
        }
    }

    /* renamed from: j6.a$f */
    private static final class f<T> implements d<T> {

        /* renamed from: a, reason: collision with root package name */
        private final C17512a<T> f139435a;

        /* renamed from: b, reason: collision with root package name */
        private float f139436b = -1.0f;

        @Override // j6.AbstractC14861a.d
        public boolean isEmpty() {
            return false;
        }

        @Override // j6.AbstractC14861a.d
        public boolean a(float f10) {
            if (this.f139436b == f10) {
                return true;
            }
            this.f139436b = f10;
            return false;
        }

        @Override // j6.AbstractC14861a.d
        public C17512a<T> b() {
            return this.f139435a;
        }

        @Override // j6.AbstractC14861a.d
        public boolean c(float f10) {
            return !this.f139435a.i();
        }

        @Override // j6.AbstractC14861a.d
        public float d() {
            return this.f139435a.f();
        }

        @Override // j6.AbstractC14861a.d
        public float e() {
            return this.f139435a.c();
        }

        f(List<? extends C17512a<T>> list) {
            this.f139435a = list.get(0);
        }
    }

    abstract A i(C17512a<K> c17512a, float f10);

    public void m() {
        this.f139424b = true;
    }

    protected boolean p() {
        return false;
    }

    @SuppressLint({"Range"})
    private float g() {
        if (this.f139429g == -1.0f) {
            this.f139429g = this.f139425c.d();
        }
        return this.f139429g;
    }

    public void a(b bVar) {
        this.f139423a.add(bVar);
    }

    @SuppressLint({"Range"})
    float c() {
        if (this.f139430h == -1.0f) {
            this.f139430h = this.f139425c.e();
        }
        return this.f139430h;
    }

    float e() {
        if (this.f139424b) {
            return 0.0f;
        }
        C17512a<K> c17512aB = b();
        if (c17512aB.i()) {
            return 0.0f;
        }
        return (this.f139426d - c17512aB.f()) / (c17512aB.c() - c17512aB.f());
    }

    public float f() {
        return this.f139426d;
    }

    protected A j(C17512a<K> c17512a, float f10, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public boolean k() {
        return this.f139427e != null;
    }

    public void o(C17514c<A> c17514c) {
        C17514c<A> c17514c2 = this.f139427e;
        if (c17514c2 != null) {
            c17514c2.c(null);
        }
        this.f139427e = c17514c;
        if (c17514c != null) {
            c17514c.c(this);
        }
    }

    AbstractC14861a(List<? extends C17512a<K>> list) {
        this.f139425c = q(list);
    }

    private static <T> d<T> q(List<? extends C17512a<T>> list) {
        if (list.isEmpty()) {
            return new c();
        }
        if (list.size() == 1) {
            return new f(list);
        }
        return new e(list);
    }

    protected C17512a<K> b() {
        if (C14205e.h()) {
            C14205e.b("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        C17512a<K> c17512aB = this.f139425c.b();
        if (C14205e.h()) {
            C14205e.c("BaseKeyframeAnimation#getCurrentKeyframe");
        }
        return c17512aB;
    }

    protected float d() {
        Interpolator interpolator;
        C17512a<K> c17512aB = b();
        if (c17512aB != null && !c17512aB.i() && (interpolator = c17512aB.f164563d) != null) {
            return interpolator.getInterpolation(e());
        }
        return 0.0f;
    }

    public A h() {
        A aI;
        float fE = e();
        if (this.f139427e == null && this.f139425c.a(fE) && !p()) {
            return this.f139428f;
        }
        C17512a<K> c17512aB = b();
        Interpolator interpolator = c17512aB.f164564e;
        if (interpolator != null && c17512aB.f164565f != null) {
            aI = j(c17512aB, fE, interpolator.getInterpolation(fE), c17512aB.f164565f.getInterpolation(fE));
        } else {
            aI = i(c17512aB, d());
        }
        this.f139428f = aI;
        return aI;
    }

    public void l() {
        if (C14205e.h()) {
            C14205e.b("BaseKeyframeAnimation#notifyListeners");
        }
        for (int i10 = 0; i10 < this.f139423a.size(); i10++) {
            this.f139423a.get(i10).a();
        }
        if (C14205e.h()) {
            C14205e.c("BaseKeyframeAnimation#notifyListeners");
        }
    }

    public void n(float f10) {
        if (C14205e.h()) {
            C14205e.b("BaseKeyframeAnimation#setProgress");
        }
        if (this.f139425c.isEmpty()) {
            if (C14205e.h()) {
                C14205e.c("BaseKeyframeAnimation#setProgress");
                return;
            }
            return;
        }
        if (f10 < g()) {
            f10 = g();
        } else if (f10 > c()) {
            f10 = c();
        }
        if (f10 == this.f139426d) {
            if (C14205e.h()) {
                C14205e.c("BaseKeyframeAnimation#setProgress");
            }
        } else {
            this.f139426d = f10;
            if (this.f139425c.c(f10)) {
                l();
            }
            if (C14205e.h()) {
                C14205e.c("BaseKeyframeAnimation#setProgress");
            }
        }
    }
}
