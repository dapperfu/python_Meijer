package androidx.camera.core.impl;

import C.C2979w;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.x;

/* renamed from: androidx.camera.core.impl.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5654e extends x {

    /* renamed from: b, reason: collision with root package name */
    private final Size f47375b;

    /* renamed from: c, reason: collision with root package name */
    private final C2979w f47376c;

    /* renamed from: d, reason: collision with root package name */
    private final Range<Integer> f47377d;

    /* renamed from: e, reason: collision with root package name */
    private final k f47378e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f47379f;

    /* renamed from: androidx.camera.core.impl.e$b */
    static final class b extends x.a {

        /* renamed from: a, reason: collision with root package name */
        private Size f47380a;

        /* renamed from: b, reason: collision with root package name */
        private C2979w f47381b;

        /* renamed from: c, reason: collision with root package name */
        private Range<Integer> f47382c;

        /* renamed from: d, reason: collision with root package name */
        private k f47383d;

        /* renamed from: e, reason: collision with root package name */
        private Boolean f47384e;

        b() {
        }

        @Override // androidx.camera.core.impl.x.a
        public x a() {
            String str = "";
            if (this.f47380a == null) {
                str = " resolution";
            }
            if (this.f47381b == null) {
                str = str + " dynamicRange";
            }
            if (this.f47382c == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f47384e == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new C5654e(this.f47380a, this.f47381b, this.f47382c, this.f47383d, this.f47384e.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.x.a
        public x.a b(C2979w c2979w) {
            if (c2979w == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f47381b = c2979w;
            return this;
        }

        @Override // androidx.camera.core.impl.x.a
        public x.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f47382c = range;
            return this;
        }

        @Override // androidx.camera.core.impl.x.a
        public x.a d(k kVar) {
            this.f47383d = kVar;
            return this;
        }

        @Override // androidx.camera.core.impl.x.a
        public x.a e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f47380a = size;
            return this;
        }

        private b(x xVar) {
            this.f47380a = xVar.e();
            this.f47381b = xVar.b();
            this.f47382c = xVar.c();
            this.f47383d = xVar.d();
            this.f47384e = Boolean.valueOf(xVar.f());
        }

        @Override // androidx.camera.core.impl.x.a
        public x.a f(boolean z10) {
            this.f47384e = Boolean.valueOf(z10);
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
            if (this.f47375b.equals(xVar.e()) && this.f47376c.equals(xVar.b()) && this.f47377d.equals(xVar.c()) && ((kVar = this.f47378e) != null ? kVar.equals(xVar.d()) : xVar.d() == null) && this.f47379f == xVar.f()) {
                return true;
            }
        }
        return false;
    }

    private C5654e(Size size, C2979w c2979w, Range<Integer> range, k kVar, boolean z10) {
        this.f47375b = size;
        this.f47376c = c2979w;
        this.f47377d = range;
        this.f47378e = kVar;
        this.f47379f = z10;
    }

    @Override // androidx.camera.core.impl.x
    public C2979w b() {
        return this.f47376c;
    }

    @Override // androidx.camera.core.impl.x
    public Range<Integer> c() {
        return this.f47377d;
    }

    @Override // androidx.camera.core.impl.x
    public k d() {
        return this.f47378e;
    }

    @Override // androidx.camera.core.impl.x
    public Size e() {
        return this.f47375b;
    }

    @Override // androidx.camera.core.impl.x
    public boolean f() {
        return this.f47379f;
    }

    @Override // androidx.camera.core.impl.x
    public x.a g() {
        return new b(this);
    }

    public int hashCode() {
        int iHashCode = (((((this.f47375b.hashCode() ^ 1000003) * 1000003) ^ this.f47376c.hashCode()) * 1000003) ^ this.f47377d.hashCode()) * 1000003;
        k kVar = this.f47378e;
        return ((iHashCode ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003) ^ (this.f47379f ? 1231 : 1237);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f47375b + ", dynamicRange=" + this.f47376c + ", expectedFrameRateRange=" + this.f47377d + ", implementationOptions=" + this.f47378e + ", zslDisabled=" + this.f47379f + "}";
    }
}
