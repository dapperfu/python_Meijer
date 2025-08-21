package com.medallia.digital.mobilesdk;

/* loaded from: classes8.dex */
final class j1 {

    /* renamed from: d, reason: collision with root package name */
    protected static final int f93105d = -1;

    /* renamed from: e, reason: collision with root package name */
    private static final long f93106e = 5000;

    /* renamed from: f, reason: collision with root package name */
    protected static final j1 f93107f = new b().a(Long.valueOf(f93106e)).a();

    /* renamed from: a, reason: collision with root package name */
    final long f93108a;

    /* renamed from: b, reason: collision with root package name */
    final c f93109b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f93110c;

    protected static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f93111a = j1.f93106e;

        /* renamed from: b, reason: collision with root package name */
        private c f93112b = c.TOP;

        /* renamed from: c, reason: collision with root package name */
        private boolean f93113c = false;

        protected b() {
        }

        protected b a(c cVar) {
            this.f93112b = cVar;
            return this;
        }

        protected b a(Long l10) {
            if (l10 != null) {
                this.f93111a = l10.longValue();
            }
            return this;
        }

        protected b a(boolean z10) {
            this.f93113c = z10;
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
        this.f93108a = bVar.f93111a;
        this.f93109b = bVar.f93112b;
        this.f93110c = bVar.f93113c;
    }

    public String toString() {
        return "DefaultBannerConfigurations{durationInMilliseconds=" + this.f93108a + '}';
    }
}
