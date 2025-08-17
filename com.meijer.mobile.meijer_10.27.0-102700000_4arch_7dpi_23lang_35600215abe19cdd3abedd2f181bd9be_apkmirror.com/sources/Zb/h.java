package Zb;

import java.util.List;

/* loaded from: classes4.dex */
public abstract class h<T> implements f<T> {

    /* renamed from: a, reason: collision with root package name */
    private long f42593a;

    /* renamed from: b, reason: collision with root package name */
    private f<T> f42594b;

    /* renamed from: c, reason: collision with root package name */
    private f<Long> f42595c;

    /* renamed from: d, reason: collision with root package name */
    private Class<T> f42596d;

    @Override // Zb.f
    public final void a(String str, T t10) {
        this.f42594b.a(str, t10);
        this.f42595c.a(str, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // Zb.f
    public final int b() {
        return this.f42594b.b();
    }

    @Override // Zb.f
    public final T b(String str, Class<T> cls) {
        Long lB = this.f42595c.b(str, Long.class);
        if (lB != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f42593a < 1 || jCurrentTimeMillis <= lB.longValue() || ((int) (jCurrentTimeMillis - lB.longValue())) / 1000 < this.f42593a) {
                return this.f42594b.b(str, this.f42596d);
            }
        }
        this.f42595c.a(str);
        this.f42594b.a(str);
        return null;
    }

    @Override // Zb.f
    public final List<T> c(Class<T> cls) {
        return this.f42594b.c(this.f42596d);
    }

    public final void d(String str, T t10) {
        if (this.f42595c.b(str, Long.class) != null) {
            this.f42594b.a(str, t10);
        } else {
            a(str, t10);
        }
    }

    public h(Class<T> cls, long j10, f<T> fVar, f<Long> fVar2) {
        this.f42593a = j10;
        this.f42594b = fVar;
        this.f42595c = fVar2;
        this.f42596d = cls;
    }

    @Override // Zb.f
    public final void a(String str) {
        this.f42594b.a(str);
        this.f42595c.a(str);
    }

    @Override // Zb.f
    public final void a() {
        this.f42594b.a();
        this.f42595c.a();
    }
}
