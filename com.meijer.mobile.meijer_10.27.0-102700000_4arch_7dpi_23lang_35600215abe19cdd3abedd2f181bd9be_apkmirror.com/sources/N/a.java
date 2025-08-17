package N;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f21252a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<T> f21253b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f21254c = new Object();

    /* renamed from: d, reason: collision with root package name */
    final b<T> f21255d;

    public T a() {
        T tRemoveLast;
        synchronized (this.f21254c) {
            tRemoveLast = this.f21253b.removeLast();
        }
        return tRemoveLast;
    }

    public void b(T t10) {
        T tA;
        synchronized (this.f21254c) {
            try {
                tA = this.f21253b.size() >= this.f21252a ? a() : null;
                this.f21253b.addFirst(t10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b<T> bVar = this.f21255d;
        if (bVar == null || tA == null) {
            return;
        }
        bVar.a(tA);
    }

    public boolean c() {
        boolean zIsEmpty;
        synchronized (this.f21254c) {
            zIsEmpty = this.f21253b.isEmpty();
        }
        return zIsEmpty;
    }

    public a(int i10, b<T> bVar) {
        this.f21252a = i10;
        this.f21253b = new ArrayDeque<>(i10);
        this.f21255d = bVar;
    }
}
