package m8;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static final o f150838e = a().e();

    /* renamed from: a, reason: collision with root package name */
    private final int f150839a;

    /* renamed from: b, reason: collision with root package name */
    private final int f150840b;

    /* renamed from: c, reason: collision with root package name */
    private final int f150841c;

    /* renamed from: d, reason: collision with root package name */
    private final int f150842d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f150843a = 100;

        /* renamed from: b, reason: collision with root package name */
        private int f150844b = 100;

        /* renamed from: c, reason: collision with root package name */
        private int f150845c = HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES;

        /* renamed from: d, reason: collision with root package name */
        private int f150846d = 3;

        public o e() {
            return new o(this);
        }

        public b f(int i10) {
            this.f150844b = i10;
            return this;
        }

        public b g(int i10) {
            this.f150846d = i10;
            return this;
        }

        public b h(int i10) {
            this.f150843a = i10;
            return this;
        }

        public b i(int i10) {
            this.f150845c = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f150839a == oVar.f150839a && this.f150840b == oVar.f150840b && this.f150841c == oVar.f150841c && this.f150842d == oVar.f150842d) {
                return true;
            }
        }
        return false;
    }

    private o(b bVar) {
        this.f150839a = bVar.f150843a;
        this.f150840b = bVar.f150844b;
        this.f150841c = bVar.f150845c;
        this.f150842d = bVar.f150846d;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f150840b;
    }

    public int c() {
        return this.f150842d;
    }

    public int d() {
        return this.f150839a;
    }

    public int e() {
        return this.f150841c;
    }

    public int hashCode() {
        return (((((this.f150839a * 31) + this.f150840b) * 31) + this.f150841c) * 31) + this.f150842d;
    }

    public String toString() {
        return "RageTapConfiguration{tapDuration=" + this.f150839a + ", dispersionRadius=" + this.f150840b + ", timespanDifference=" + this.f150841c + ", minimumNumberOfTaps=" + this.f150842d + '}';
    }
}
