package com.medallia.digital.mobilesdk;

/* loaded from: classes7.dex */
final class j1 {

    /* renamed from: d, reason: collision with root package name */
    protected static final int f92266d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static final long f92267e = 5000;

    /* renamed from: f, reason: collision with root package name */
    protected static final j1 f92268f = new b().a(Long.valueOf(f92267e)).a();

    /* renamed from: a, reason: collision with root package name */
    final long f92269a;

    /* renamed from: b, reason: collision with root package name */
    final c f92270b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f92271c;

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f92272a = j1.f92267e;

        /* renamed from: b, reason: collision with root package name */
        private c f92273b = c.TOP;

        /* renamed from: c, reason: collision with root package name */
        private boolean f92274c = false;

        protected b() {
        }

        protected b a(c cVar) {
            this.f92273b = cVar;
            return this;
        }

        protected b a(Long l10) {
            if (l10 != null) {
                this.f92272a = l10.longValue();
            }
            return this;
        }

        protected b a(boolean z10) {
            this.f92274c = z10;
            return this;
        }

        protected j1 a() {
            return new j1(this);
        }
    }

    enum c {
        TOP,
        BOTTOM;

        static c getPosition(String str) {
            if (str != null) {
                c cVar = BOTTOM;
                if (str.equalsIgnoreCase(cVar.toString())) {
                    return cVar;
                }
            }
            return TOP;
        }
    }

    private j1(b bVar) {
        this.f92269a = bVar.f92272a;
        this.f92270b = bVar.f92273b;
        this.f92271c = bVar.f92274c;
    }

    public String toString() {
        return "DefaultBannerConfigurations{durationInMilliseconds=" + this.f92269a + '}';
    }
}
