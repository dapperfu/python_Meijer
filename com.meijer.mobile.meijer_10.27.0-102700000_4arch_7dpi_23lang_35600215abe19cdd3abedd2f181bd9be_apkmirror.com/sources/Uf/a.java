package Uf;

import java.util.Locale;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f35995c;

    /* renamed from: a, reason: collision with root package name */
    private final c f35996a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f35997b;

    public a(c cVar) {
        this.f35997b = false;
        this.f35996a = cVar == null ? c.c() : cVar;
    }

    public static a e() {
        if (f35995c == null) {
            synchronized (a.class) {
                try {
                    if (f35995c == null) {
                        f35995c = new a();
                    }
                } finally {
                }
            }
        }
        return f35995c;
    }

    public void a(String str) {
        if (this.f35997b) {
            this.f35996a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f35997b) {
            this.f35996a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f35997b) {
            this.f35996a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f35997b) {
            this.f35996a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f35997b) {
            this.f35996a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f35997b) {
            this.f35996a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f35997b;
    }

    public void i(boolean z10) {
        this.f35997b = z10;
    }

    public void j(String str) {
        if (this.f35997b) {
            this.f35996a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f35997b) {
            this.f35996a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private a() {
        this(null);
    }
}
