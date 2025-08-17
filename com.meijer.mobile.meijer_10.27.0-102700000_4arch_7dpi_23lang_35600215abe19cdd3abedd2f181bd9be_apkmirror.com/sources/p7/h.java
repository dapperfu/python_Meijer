package p7;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class h<T, Y> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<T, a<Y>> f155660a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b, reason: collision with root package name */
    private final long f155661b;

    /* renamed from: c, reason: collision with root package name */
    private long f155662c;

    /* renamed from: d, reason: collision with root package name */
    private long f155663d;

    public synchronized Y g(T t10) {
        a<Y> aVar;
        aVar = this.f155660a.get(t10);
        return aVar != null ? aVar.f155664a : null;
    }

    public synchronized long h() {
        return this.f155662c;
    }

    protected int i(Y y10) {
        return 1;
    }

    protected void j(T t10, Y y10) {
    }

    public synchronized Y k(T t10, Y y10) {
        int i10 = i(y10);
        long j10 = i10;
        if (j10 >= this.f155662c) {
            j(t10, y10);
            return null;
        }
        if (y10 != null) {
            this.f155663d += j10;
        }
        a<Y> aVarPut = this.f155660a.put(t10, y10 == null ? null : new a<>(y10, i10));
        if (aVarPut != null) {
            this.f155663d -= aVarPut.f155665b;
            if (!aVarPut.f155664a.equals(y10)) {
                j(t10, aVarPut.f155664a);
            }
        }
        f();
        return aVarPut != null ? aVarPut.f155664a : null;
    }

    public synchronized Y l(T t10) {
        a<Y> aVarRemove = this.f155660a.remove(t10);
        if (aVarRemove == null) {
            return null;
        }
        this.f155663d -= aVarRemove.f155665b;
        return aVarRemove.f155664a;
    }

    protected synchronized void m(long j10) {
        while (this.f155663d > j10) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f155660a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f155663d -= value.f155665b;
            T key = next.getKey();
            it.remove();
            j(key, value.f155664a);
        }
    }

    static final class a<Y> {

        /* renamed from: a, reason: collision with root package name */
        final Y f155664a;

        /* renamed from: b, reason: collision with root package name */
        final int f155665b;

        a(Y y10, int i10) {
            this.f155664a = y10;
            this.f155665b = i10;
        }
    }

    private void f() {
        m(this.f155662c);
    }

    public void b() {
        m(0L);
    }

    public h(long j10) {
        this.f155661b = j10;
        this.f155662c = j10;
    }
}
