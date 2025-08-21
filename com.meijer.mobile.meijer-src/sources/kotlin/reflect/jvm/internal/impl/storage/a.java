package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes14.dex */
class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f147567a;

    /* renamed from: b, reason: collision with root package name */
    private final Thread f147568b = Thread.currentThread();

    public boolean b() {
        return this.f147568b == Thread.currentThread();
    }

    a(T t10) {
        this.f147567a = t10;
    }

    public T a() {
        if (b()) {
            return this.f147567a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }
}
