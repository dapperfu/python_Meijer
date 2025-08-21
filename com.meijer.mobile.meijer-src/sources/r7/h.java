package r7;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class h<T, Y> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<T, a<Y>> f159417a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private final long f159418b;

    /* renamed from: c, reason: collision with root package name */
    private long f159419c;

    /* renamed from: d, reason: collision with root package name */
    private long f159420d;

    public synchronized Y g(T t10) {
        a<Y> aVar;
        aVar = this.f159417a.get(t10);
        return aVar != null ? aVar.f159421a : null;
    }

    public synchronized long h() {
        return this.f159419c;
    }

    protected int i(Y y10) {
        return 1;
    }

    protected void j(T t10, Y y10) {
    }

    public synchronized Y k(T t10, Y y10) {
        int i10 = i(y10);
        long j10 = i10;
        if (j10 >= this.f159419c) {
            j(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f159420d += j10;
        }
        a<Y> aVarPut = this.f159417a.put(t10, y10 == null ? null : new a<>(y10, i10));
        if (aVarPut != null) {
            this.f159420d -= aVarPut.f159422b;
            if (!aVarPut.f159421a.equals(y10)) {
                j(t10, aVarPut.f159421a);
            }
        }
        f();
        return aVarPut != null ? aVarPut.f159421a : null;
    }

    public synchronized Y l(T t10) {
        a<Y> aVarRemove = this.f159417a.remove(t10);
        if (aVarRemove == null) {
            return null;
        }
        this.f159420d -= aVarRemove.f159422b;
        return aVarRemove.f159421a;
    }

    protected synchronized void m(long j10) {
        while (this.f159420d > j10) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f159417a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f159420d -= value.f159422b;
            T key = next.getKey();
            it.remove();
            j(key, value.f159421a);
        }
    }

    static final class a<Y> {

        /* renamed from: a, reason: collision with root package name */
        final Y f159421a;

        /* renamed from: b, reason: collision with root package name */
        final int f159422b;

        a(Y y10, int i10) {
            this.f159421a = y10;
            this.f159422b = i10;
        }
    }

    private void f() {
        m(this.f159419c);
    }

    public void b() {
        m(0L);
    }

    public h(long j10) {
        this.f159418b = j10;
        this.f159419c = j10;
    }
}
