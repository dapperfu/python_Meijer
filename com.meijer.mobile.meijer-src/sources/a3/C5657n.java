package a3;

import d3.C13599a;
import d3.P;
import java.util.Objects;

/* renamed from: a3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5657n {

    /* renamed from: e, reason: collision with root package name */
    public static final C5657n f44677e = new b(0).e();

    /* renamed from: f, reason: collision with root package name */
    private static final String f44678f = P.y0(0);

    /* renamed from: g, reason: collision with root package name */
    private static final String f44679g = P.y0(1);

    /* renamed from: h, reason: collision with root package name */
    private static final String f44680h = P.y0(2);

    /* renamed from: i, reason: collision with root package name */
    private static final String f44681i = P.y0(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f44682a;

    /* renamed from: b, reason: collision with root package name */
    public final int f44683b;

    /* renamed from: c, reason: collision with root package name */
    public final int f44684c;

    /* renamed from: d, reason: collision with root package name */
    public final String f44685d;

    /* renamed from: a3.n$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f44686a;

        /* renamed from: b, reason: collision with root package name */
        private int f44687b;

        /* renamed from: c, reason: collision with root package name */
        private int f44688c;

        /* renamed from: d, reason: collision with root package name */
        private String f44689d;

        public C5657n e() {
            C13599a.a(this.f44687b <= this.f44688c);
            return new C5657n(this);
        }

        public b f(int i10) {
            this.f44688c = i10;
            return this;
        }

        public b g(int i10) {
            this.f44687b = i10;
            return this;
        }

        public b(int i10) {
            this.f44686a = i10;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5657n)) {
            return false;
        }
        C5657n c5657n = (C5657n) obj;
        return this.f44682a == c5657n.f44682a && this.f44683b == c5657n.f44683b && this.f44684c == c5657n.f44684c && Objects.equals(this.f44685d, c5657n.f44685d);
    }

    private C5657n(b bVar) {
        this.f44682a = bVar.f44686a;
        this.f44683b = bVar.f44687b;
        this.f44684c = bVar.f44688c;
        this.f44685d = bVar.f44689d;
    }

    public int hashCode() {
        int i10 = (((((527 + this.f44682a) * 31) + this.f44683b) * 31) + this.f44684c) * 31;
        String str = this.f44685d;
        return i10 + (str == null ? 0 : str.hashCode());
    }
}
