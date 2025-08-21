package bc;

import java.util.List;

/* renamed from: bc.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6354h<T> implements InterfaceC6352f<T> {

    /* renamed from: a, reason: collision with root package name */
    private long f60260a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC6352f<T> f60261b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC6352f<Long> f60262c;

    /* renamed from: d, reason: collision with root package name */
    private Class<T> f60263d;

    @Override // bc.InterfaceC6352f
    public final void a(String str, T t10) {
        this.f60261b.a(str, t10);
        this.f60262c.a(str, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // bc.InterfaceC6352f
    public final int b() {
        return this.f60261b.b();
    }

    @Override // bc.InterfaceC6352f
    public final T b(String str, Class<T> cls) {
        Long lB = this.f60262c.b(str, Long.class);
        if (lB != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f60260a < 1 || jCurrentTimeMillis <= lB.longValue() || ((int) (jCurrentTimeMillis - lB.longValue())) / 1000 < this.f60260a) {
                return this.f60261b.b(str, this.f60263d);
            }
        }
        this.f60262c.a(str);
        this.f60261b.a(str);
        return null;
    }

    @Override // bc.InterfaceC6352f
    public final List<T> c(Class<T> cls) {
        return this.f60261b.c(this.f60263d);
    }

    public final void d(String str, T t10) {
        if (this.f60262c.b(str, Long.class) != null) {
            this.f60261b.a(str, t10);
        } else {
            a(str, t10);
        }
    }

    public AbstractC6354h(Class<T> cls, long j10, InterfaceC6352f<T> interfaceC6352f, InterfaceC6352f<Long> interfaceC6352f2) {
        this.f60260a = j10;
        this.f60261b = interfaceC6352f;
        this.f60262c = interfaceC6352f2;
        this.f60263d = cls;
    }

    @Override // bc.InterfaceC6352f
    public final void a(String str) {
        this.f60261b.a(str);
        this.f60262c.a(str);
    }

    @Override // bc.InterfaceC6352f
    public final void a() {
        this.f60261b.a();
        this.f60262c.a();
    }
}
