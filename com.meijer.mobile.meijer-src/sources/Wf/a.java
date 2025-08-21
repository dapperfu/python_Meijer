package Wf;

import java.util.Locale;

/* loaded from: classes8.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f41020c;

    /* renamed from: a, reason: collision with root package name */
    private final c f41021a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f41022b;

    public a(c cVar) {
        this.f41022b = false;
        this.f41021a = cVar == null ? c.c() : cVar;
    }

    public static a e() {
        if (f41020c == null) {
            synchronized (a.class) {
                try {
                    if (f41020c == null) {
                        f41020c = new a();
                    }
                } finally {
                }
            }
        }
        return f41020c;
    }

    public void a(String str) {
        if (this.f41022b) {
            this.f41021a.a(str);
        }
    }

    public void b(String str, Object... objArr) {
        if (this.f41022b) {
            this.f41021a.a(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void c(String str) {
        if (this.f41022b) {
            this.f41021a.b(str);
        }
    }

    public void d(String str, Object... objArr) {
        if (this.f41022b) {
            this.f41021a.b(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public void f(String str) {
        if (this.f41022b) {
            this.f41021a.d(str);
        }
    }

    public void g(String str, Object... objArr) {
        if (this.f41022b) {
            this.f41021a.d(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    public boolean h() {
        return this.f41022b;
    }

    public void i(boolean z10) {
        this.f41022b = z10;
    }

    public void j(String str) {
        if (this.f41022b) {
            this.f41021a.e(str);
        }
    }

    public void k(String str, Object... objArr) {
        if (this.f41022b) {
            this.f41021a.e(String.format(Locale.ENGLISH, str, objArr));
        }
    }

    private a() {
        this(null);
    }
}
