package k8;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: e, reason: collision with root package name */
    public static final o f141692e = a().e();

    /* renamed from: a, reason: collision with root package name */
    private final int f141693a;

    /* renamed from: b, reason: collision with root package name */
    private final int f141694b;

    /* renamed from: c, reason: collision with root package name */
    private final int f141695c;

    /* renamed from: d, reason: collision with root package name */
    private final int f141696d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f141697a = 100;

        /* renamed from: b, reason: collision with root package name */
        private int f141698b = 100;

        /* renamed from: c, reason: collision with root package name */
        private int f141699c = HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES;

        /* renamed from: d, reason: collision with root package name */
        private int f141700d = 3;

        public o e() {
            return new o(this);
        }

        public b f(int i10) {
            this.f141698b = i10;
            return this;
        }

        public b g(int i10) {
            this.f141700d = i10;
            return this;
        }

        public b h(int i10) {
            this.f141697a = i10;
            return this;
        }

        public b i(int i10) {
            this.f141699c = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f141693a == oVar.f141693a && this.f141694b == oVar.f141694b && this.f141695c == oVar.f141695c && this.f141696d == oVar.f141696d) {
                return true;
            }
        }
        return false;
    }

    private o(b bVar) {
        this.f141693a = bVar.f141697a;
        this.f141694b = bVar.f141698b;
        this.f141695c = bVar.f141699c;
        this.f141696d = bVar.f141700d;
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f141694b;
    }

    public int c() {
        return this.f141696d;
    }

    public int d() {
        return this.f141693a;
    }

    public int e() {
        return this.f141695c;
    }

    public int hashCode() {
        return (((((this.f141693a * 31) + this.f141694b) * 31) + this.f141695c) * 31) + this.f141696d;
    }

    public String toString() {
        return "RageTapConfiguration{tapDuration=" + this.f141693a + ", dispersionRadius=" + this.f141694b + ", timespanDifference=" + this.f141695c + ", minimumNumberOfTaps=" + this.f141696d + '}';
    }
}
