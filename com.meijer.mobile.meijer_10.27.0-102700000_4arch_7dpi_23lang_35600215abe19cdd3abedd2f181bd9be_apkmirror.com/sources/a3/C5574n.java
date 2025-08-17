package a3;

import d3.C13466a;
import d3.P;
import java.util.Objects;

/* renamed from: a3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5574n {

    /* renamed from: e, reason: collision with root package name */
    public static final C5574n f43859e = new b(0).e();

    /* renamed from: f, reason: collision with root package name */
    private static final String f43860f = P.y0(0);

    /* renamed from: g, reason: collision with root package name */
    private static final String f43861g = P.y0(1);

    /* renamed from: h, reason: collision with root package name */
    private static final String f43862h = P.y0(2);

    /* renamed from: i, reason: collision with root package name */
    private static final String f43863i = P.y0(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f43864a;

    /* renamed from: b, reason: collision with root package name */
    public final int f43865b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43866c;

    /* renamed from: d, reason: collision with root package name */
    public final String f43867d;

    /* renamed from: a3.n$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f43868a;

        /* renamed from: b, reason: collision with root package name */
        private int f43869b;

        /* renamed from: c, reason: collision with root package name */
        private int f43870c;

        /* renamed from: d, reason: collision with root package name */
        private String f43871d;

        public C5574n e() {
            C13466a.a(this.f43869b <= this.f43870c);
            return new C5574n(this);
        }

        public b f(int i10) {
            this.f43870c = i10;
            return this;
        }

        public b g(int i10) {
            this.f43869b = i10;
            return this;
        }

        public b(int i10) {
            this.f43868a = i10;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5574n)) {
            return false;
        }
        C5574n c5574n = (C5574n) obj;
        return this.f43864a == c5574n.f43864a && this.f43865b == c5574n.f43865b && this.f43866c == c5574n.f43866c && Objects.equals(this.f43867d, c5574n.f43867d);
    }

    private C5574n(b bVar) {
        this.f43864a = bVar.f43868a;
        this.f43865b = bVar.f43869b;
        this.f43866c = bVar.f43870c;
        this.f43867d = bVar.f43871d;
    }

    public int hashCode() {
        int i10 = (((((527 + this.f43864a) * 31) + this.f43865b) * 31) + this.f43866c) * 31;
        String str = this.f43867d;
        return i10 + (str == null ? 0 : str.hashCode());
    }
}
