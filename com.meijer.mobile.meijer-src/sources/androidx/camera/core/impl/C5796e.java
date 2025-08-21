package androidx.camera.core.impl;

import C.C3037w;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.x;

/* renamed from: androidx.camera.core.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5796e extends x {

    /* renamed from: b, reason: collision with root package name */
    private final Size f47599b;

    /* renamed from: c, reason: collision with root package name */
    private final C3037w f47600c;

    /* renamed from: d, reason: collision with root package name */
    private final Range<Integer> f47601d;

    /* renamed from: e, reason: collision with root package name */
    private final k f47602e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f47603f;

    /* renamed from: androidx.camera.core.impl.e$b */
    static final class b extends x.a {

        /* renamed from: a, reason: collision with root package name */
        private Size f47604a;

        /* renamed from: b, reason: collision with root package name */
        private C3037w f47605b;

        /* renamed from: c, reason: collision with root package name */
        private Range<Integer> f47606c;

        /* renamed from: d, reason: collision with root package name */
        private k f47607d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f47608e;

        b() {
        }

        @Override // androidx.camera.core.impl.x.a
        public x a() {
            String str = "";
            if (this.f47604a == null) {
                str = " resolution";
            }
            if (this.f47605b == null) {
                str = str + " dynamicRange";
            }
            if (this.f47606c == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f47608e == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new C5796e(this.f47604a, this.f47605b, this.f47606c, this.f47607d, this.f47608e.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.x.a
        public x.a b(C3037w c3037w) {
            if (c3037w == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f47605b = c3037w;
            return this;
        }

        @Override // androidx.camera.core.impl.x.a
        public x.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f47606c = range;
            return this;
        }

        @Override // androidx.camera.core.impl.x.a
        public x.a d(k kVar) {
            this.f47607d = kVar;
            return this;
        }

        @Override // androidx.camera.core.impl.x.a
        public x.a e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f47604a = size;
            return this;
        }

        private b(x xVar) {
            this.f47604a = xVar.e();
            this.f47605b = xVar.b();
            this.f47606c = xVar.c();
            this.f47607d = xVar.d();
            this.f47608e = Boolean.valueOf(xVar.f());
        }

        @Override // androidx.camera.core.impl.x.a
        public x.a f(boolean z10) {
            this.f47608e = Boolean.valueOf(z10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        k kVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (this.f47599b.equals(xVar.e()) && this.f47600c.equals(xVar.b()) && this.f47601d.equals(xVar.c()) && ((kVar = this.f47602e) != null ? kVar.equals(xVar.d()) : xVar.d() == null) && this.f47603f == xVar.f()) {
                return true;
            }
        }
        return false;
    }

    private C5796e(Size size, C3037w c3037w, Range<Integer> range, k kVar, boolean z10) {
        this.f47599b = size;
        this.f47600c = c3037w;
        this.f47601d = range;
        this.f47602e = kVar;
        this.f47603f = z10;
    }

    @Override // androidx.camera.core.impl.x
    public C3037w b() {
        return this.f47600c;
    }

    @Override // androidx.camera.core.impl.x
    public Range<Integer> c() {
        return this.f47601d;
    }

    @Override // androidx.camera.core.impl.x
    public k d() {
        return this.f47602e;
    }

    @Override // androidx.camera.core.impl.x
    public Size e() {
        return this.f47599b;
    }

    @Override // androidx.camera.core.impl.x
    public boolean f() {
        return this.f47603f;
    }

    @Override // androidx.camera.core.impl.x
    public x.a g() {
        return new b(this);
    }

    public int hashCode() {
        int iHashCode = (((((this.f47599b.hashCode() ^ 1000003) * 1000003) ^ this.f47600c.hashCode()) * 1000003) ^ this.f47601d.hashCode()) * 1000003;
        k kVar = this.f47602e;
        return ((iHashCode ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003) ^ (this.f47603f ? 1231 : 1237);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f47599b + ", dynamicRange=" + this.f47600c + ", expectedFrameRateRange=" + this.f47601d + ", implementationOptions=" + this.f47602e + ", zslDisabled=" + this.f47603f + "}";
    }
}
