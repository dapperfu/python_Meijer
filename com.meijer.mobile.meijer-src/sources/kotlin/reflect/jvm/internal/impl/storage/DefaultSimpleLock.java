package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public class DefaultSimpleLock implements SimpleLock {

    /* renamed from: b, reason: collision with root package name */
    private final Lock f147537b;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultSimpleLock() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public DefaultSimpleLock(Lock lock) {
        Intrinsics.j(lock, "lock");
        this.f147537b = lock;
    }

    protected final Lock a() {
        return this.f147537b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        this.f147537b.lock();
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void unlock() {
        this.f147537b.unlock();
    }

    public /* synthetic */ DefaultSimpleLock(Lock lock, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ReentrantLock() : lock);
    }
}
