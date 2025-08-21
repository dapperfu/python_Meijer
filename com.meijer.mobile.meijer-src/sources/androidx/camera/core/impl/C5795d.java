package androidx.camera.core.impl;

import C.C3037w;
import androidx.camera.core.impl.w;
import java.util.List;

/* renamed from: androidx.camera.core.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5795d extends w.f {

    /* renamed from: a, reason: collision with root package name */
    private final DeferrableSurface f47587a;

    /* renamed from: b, reason: collision with root package name */
    private final List<DeferrableSurface> f47588b;

    /* renamed from: c, reason: collision with root package name */
    private final String f47589c;

    /* renamed from: d, reason: collision with root package name */
    private final int f47590d;

    /* renamed from: e, reason: collision with root package name */
    private final int f47591e;

    /* renamed from: f, reason: collision with root package name */
    private final C3037w f47592f;

    /* renamed from: androidx.camera.core.impl.d$b */
    static final class b extends w.f.a {

        /* renamed from: a, reason: collision with root package name */
        private DeferrableSurface f47593a;

        /* renamed from: b, reason: collision with root package name */
        private List<DeferrableSurface> f47594b;

        /* renamed from: c, reason: collision with root package name */
        private String f47595c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f47596d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f47597e;

        /* renamed from: f, reason: collision with root package name */
        private C3037w f47598f;

        @Override // androidx.camera.core.impl.w.f.a
        public w.f a() {
            String str = "";
            if (this.f47593a == null) {
                str = " surface";
            }
            if (this.f47594b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f47596d == null) {
                str = str + " mirrorMode";
            }
            if (this.f47597e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f47598f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new C5795d(this.f47593a, this.f47594b, this.f47595c, this.f47596d.intValue(), this.f47597e.intValue(), this.f47598f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.w.f.a
        public w.f.a b(C3037w c3037w) {
            if (c3037w == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f47598f = c3037w;
            return this;
        }

        @Override // androidx.camera.core.impl.w.f.a
        public w.f.a d(String str) {
            this.f47595c = str;
            return this;
        }

        @Override // androidx.camera.core.impl.w.f.a
        public w.f.a e(List<DeferrableSurface> list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f47594b = list;
            return this;
        }

        public w.f.a g(DeferrableSurface deferrableSurface) {
            if (deferrableSurface == null) {
                throw new NullPointerException("Null surface");
            }
            this.f47593a = deferrableSurface;
            return this;
        }

        b() {
        }

        @Override // androidx.camera.core.impl.w.f.a
        public w.f.a c(int i10) {
            this.f47596d = Integer.valueOf(i10);
            return this;
        }

        @Override // androidx.camera.core.impl.w.f.a
        public w.f.a f(int i10) {
            this.f47597e = Integer.valueOf(i10);
            return this;
        }
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof w.f) {
            w.f fVar = (w.f) obj;
            if (this.f47587a.equals(fVar.f()) && this.f47588b.equals(fVar.e()) && ((str = this.f47589c) != null ? str.equals(fVar.d()) : fVar.d() == null) && this.f47590d == fVar.c() && this.f47591e == fVar.g() && this.f47592f.equals(fVar.b())) {
                return true;
            }
        }
        return false;
    }

    private C5795d(DeferrableSurface deferrableSurface, List<DeferrableSurface> list, String str, int i10, int i11, C3037w c3037w) {
        this.f47587a = deferrableSurface;
        this.f47588b = list;
        this.f47589c = str;
        this.f47590d = i10;
        this.f47591e = i11;
        this.f47592f = c3037w;
    }

    @Override // androidx.camera.core.impl.w.f
    public C3037w b() {
        return this.f47592f;
    }

    @Override // androidx.camera.core.impl.w.f
    public int c() {
        return this.f47590d;
    }

    @Override // androidx.camera.core.impl.w.f
    public String d() {
        return this.f47589c;
    }

    @Override // androidx.camera.core.impl.w.f
    public List<DeferrableSurface> e() {
        return this.f47588b;
    }

    @Override // androidx.camera.core.impl.w.f
    public DeferrableSurface f() {
        return this.f47587a;
    }

    @Override // androidx.camera.core.impl.w.f
    public int g() {
        return this.f47591e;
    }

    public int hashCode() {
        int iHashCode = (((this.f47587a.hashCode() ^ 1000003) * 1000003) ^ this.f47588b.hashCode()) * 1000003;
        String str = this.f47589c;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f47590d) * 1000003) ^ this.f47591e) * 1000003) ^ this.f47592f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f47587a + ", sharedSurfaces=" + this.f47588b + ", physicalCameraId=" + this.f47589c + ", mirrorMode=" + this.f47590d + ", surfaceGroupId=" + this.f47591e + ", dynamicRange=" + this.f47592f + "}";
    }
}
