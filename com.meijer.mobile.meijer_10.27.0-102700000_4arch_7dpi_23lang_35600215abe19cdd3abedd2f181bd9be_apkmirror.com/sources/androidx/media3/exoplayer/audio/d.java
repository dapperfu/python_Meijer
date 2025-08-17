package androidx.media3.exoplayer.audio;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f55906d = new b().d();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f55907a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f55908b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f55909c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f55910a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f55911b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f55912c;

        public d d() {
            if (this.f55910a || !(this.f55911b || this.f55912c)) {
                return new d(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z10) {
            this.f55910a = z10;
            return this;
        }

        public b f(boolean z10) {
            this.f55911b = z10;
            return this;
        }

        public b g(boolean z10) {
            this.f55912c = z10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f55907a == dVar.f55907a && this.f55908b == dVar.f55908b && this.f55909c == dVar.f55909c) {
                return true;
            }
        }
        return false;
    }

    private d(b bVar) {
        this.f55907a = bVar.f55910a;
        this.f55908b = bVar.f55911b;
        this.f55909c = bVar.f55912c;
    }

    public int hashCode() {
        return ((this.f55907a ? 1 : 0) << 2) + ((this.f55908b ? 1 : 0) << 1) + (this.f55909c ? 1 : 0);
    }
}
