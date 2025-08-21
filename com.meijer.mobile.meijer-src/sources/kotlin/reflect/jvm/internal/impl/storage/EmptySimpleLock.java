package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes14.dex */
public final class EmptySimpleLock implements SimpleLock {

    /* renamed from: b, reason: collision with root package name */
    public static final EmptySimpleLock f147538b = new EmptySimpleLock();

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void unlock() {
    }

    private EmptySimpleLock() {
    }
}
