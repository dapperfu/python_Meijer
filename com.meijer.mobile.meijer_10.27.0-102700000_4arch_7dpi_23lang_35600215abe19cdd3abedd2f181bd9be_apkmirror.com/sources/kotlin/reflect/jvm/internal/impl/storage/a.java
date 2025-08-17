package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes13.dex */
class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f146660a;

    /* renamed from: b, reason: collision with root package name */
    private final Thread f146661b = Thread.currentThread();

    public boolean b() {
        return this.f146661b == Thread.currentThread();
    }

    a(T t10) {
        this.f146660a = t10;
    }

    public T a() {
        if (b()) {
            return this.f146660a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }
}
