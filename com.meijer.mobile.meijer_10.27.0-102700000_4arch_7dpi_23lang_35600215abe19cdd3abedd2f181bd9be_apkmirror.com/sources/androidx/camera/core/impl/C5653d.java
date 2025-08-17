package androidx.camera.core.impl;

import C.C2979w;
import androidx.camera.core.impl.w;
import java.util.List;

/* renamed from: androidx.camera.core.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5653d extends w.f {

    /* renamed from: a, reason: collision with root package name */
    private final DeferrableSurface f47363a;

    /* renamed from: b, reason: collision with root package name */
    private final List<DeferrableSurface> f47364b;

    /* renamed from: c, reason: collision with root package name */
    private final String f47365c;

    /* renamed from: d, reason: collision with root package name */
    private final int f47366d;

    /* renamed from: e, reason: collision with root package name */
    private final int f47367e;

    /* renamed from: f, reason: collision with root package name */
    private final C2979w f47368f;

    /* renamed from: androidx.camera.core.impl.d$b */
    static final class b extends w.f.a {

        /* renamed from: a, reason: collision with root package name */
        private DeferrableSurface f47369a;

        /* renamed from: b, reason: collision with root package name */
        private List<DeferrableSurface> f47370b;

        /* renamed from: c, reason: collision with root package name */
        private String f47371c;

        /* renamed from: d, reason: collision with root package name */
        private Integer f47372d;

        /* renamed from: e, reason: collision with root package name */
        private Integer f47373e;

        /* renamed from: f, reason: collision with root package name */
        private C2979w f47374f;

        @Override // androidx.camera.core.impl.w.f.a
        public w.f a() {
            String str = "";
            if (this.f47369a == null) {
                str = " surface";
            }
            if (this.f47370b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f47372d == null) {
                str = str + " mirrorMode";
            }
            if (this.f47373e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f47374f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new C5653d(this.f47369a, this.f47370b, this.f47371c, this.f47372d.intValue(), this.f47373e.intValue(), this.f47374f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.w.f.a
        public w.f.a b(C2979w c2979w) {
            if (c2979w == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f47374f = c2979w;
            return this;
        }

        @Override // androidx.camera.core.impl.w.f.a
        public w.f.a d(String str) {
            this.f47371c = str;
            return this;
        }

        @Override // androidx.camera.core.impl.w.f.a
        public w.f.a e(List<DeferrableSurface> list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f47370b = list;
            return this;
        }

        public w.f.a g(DeferrableSurface deferrableSurface) {
            if (deferrableSurface == null) {
                throw new NullPointerException("Null surface");
            }
            this.f47369a = deferrableSurface;
            return this;
        }

        b() {
        }

        @Override // androidx.camera.core.impl.w.f.a
        public w.f.a c(int i10) {
            this.f47372d = Integer.valueOf(i10);
            return this;
        }

        @Override // androidx.camera.core.impl.w.f.a
        public w.f.a f(int i10) {
            this.f47373e = Integer.valueOf(i10);
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
            if (this.f47363a.equals(fVar.f()) && this.f47364b.equals(fVar.e()) && ((str = this.f47365c) != null ? str.equals(fVar.d()) : fVar.d() == null) && this.f47366d == fVar.c() && this.f47367e == fVar.g() && this.f47368f.equals(fVar.b())) {
                return true;
            }
        }
        return false;
    }

    private C5653d(DeferrableSurface deferrableSurface, List<DeferrableSurface> list, String str, int i10, int i11, C2979w c2979w) {
        this.f47363a = deferrableSurface;
        this.f47364b = list;
        this.f47365c = str;
        this.f47366d = i10;
        this.f47367e = i11;
        this.f47368f = c2979w;
    }

    @Override // androidx.camera.core.impl.w.f
    public C2979w b() {
        return this.f47368f;
    }

    @Override // androidx.camera.core.impl.w.f
    public int c() {
        return this.f47366d;
    }

    @Override // androidx.camera.core.impl.w.f
    public String d() {
        return this.f47365c;
    }

    @Override // androidx.camera.core.impl.w.f
    public List<DeferrableSurface> e() {
        return this.f47364b;
    }

    @Override // androidx.camera.core.impl.w.f
    public DeferrableSurface f() {
        return this.f47363a;
    }

    @Override // androidx.camera.core.impl.w.f
    public int g() {
        return this.f47367e;
    }

    public int hashCode() {
        int iHashCode = (((this.f47363a.hashCode() ^ 1000003) * 1000003) ^ this.f47364b.hashCode()) * 1000003;
        String str = this.f47365c;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f47366d) * 1000003) ^ this.f47367e) * 1000003) ^ this.f47368f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f47363a + ", sharedSurfaces=" + this.f47364b + ", physicalCameraId=" + this.f47365c + ", mirrorMode=" + this.f47366d + ", surfaceGroupId=" + this.f47367e + ", dynamicRange=" + this.f47368f + "}";
    }
}
