package androidx.media3.exoplayer.audio;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f56130d = new b().d();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f56131a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f56132b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f56133c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f56134a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f56135b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f56136c;

        public d d() {
            if (this.f56134a || !(this.f56135b || this.f56136c)) {
                return new d(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z10) {
            this.f56134a = z10;
            return this;
        }

        public b f(boolean z10) {
            this.f56135b = z10;
            return this;
        }

        public b g(boolean z10) {
            this.f56136c = z10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f56131a == dVar.f56131a && this.f56132b == dVar.f56132b && this.f56133c == dVar.f56133c) {
                return true;
            }
        }
        return false;
    }

    private d(b bVar) {
        this.f56131a = bVar.f56134a;
        this.f56132b = bVar.f56135b;
        this.f56133c = bVar.f56136c;
    }

    public int hashCode() {
        return ((this.f56131a ? 1 : 0) << 2) + ((this.f56132b ? 1 : 0) << 1) + (this.f56133c ? 1 : 0);
    }
}
