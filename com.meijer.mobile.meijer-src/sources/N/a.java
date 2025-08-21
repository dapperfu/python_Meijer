package N;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final int f20516a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque<T> f20517b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f20518c = new Object();

    /* renamed from: d, reason: collision with root package name */
    final b<T> f20519d;

    public T a() {
        T tRemoveLast;
        synchronized (this.f20518c) {
            tRemoveLast = this.f20517b.removeLast();
        }
        return tRemoveLast;
    }

    public void b(T t10) {
        T tA;
        synchronized (this.f20518c) {
            try {
                tA = this.f20517b.size() >= this.f20516a ? a() : null;
                this.f20517b.addFirst(t10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        b<T> bVar = this.f20519d;
        if (bVar == null || tA == null) {
            return;
        }
        bVar.a(tA);
    }

    public boolean c() {
        boolean zIsEmpty;
        synchronized (this.f20518c) {
            zIsEmpty = this.f20517b.isEmpty();
        }
        return zIsEmpty;
    }

    public a(int i10, b<T> bVar) {
        this.f20516a = i10;
        this.f20517b = new ArrayDeque<>(i10);
        this.f20519d = bVar;
    }
}
