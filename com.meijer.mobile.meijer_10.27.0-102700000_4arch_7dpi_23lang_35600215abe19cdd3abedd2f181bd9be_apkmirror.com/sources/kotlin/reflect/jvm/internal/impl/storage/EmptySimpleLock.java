package kotlin.reflect.jvm.internal.impl.storage;

/* loaded from: classes13.dex */
public final class EmptySimpleLock implements SimpleLock {

    /* renamed from: b, reason: collision with root package name */
    public static final EmptySimpleLock f146631b = new EmptySimpleLock();

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void unlock() {
    }

    private EmptySimpleLock() {
    }
}
