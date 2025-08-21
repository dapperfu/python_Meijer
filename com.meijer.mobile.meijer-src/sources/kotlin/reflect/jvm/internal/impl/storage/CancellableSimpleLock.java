package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes14.dex */
public final class CancellableSimpleLock extends DefaultSimpleLock {

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f147535c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1<InterruptedException, Unit> f147536d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CancellableSimpleLock(Lock lock, Runnable checkCancelled, Function1<? super InterruptedException, Unit> interruptedExceptionHandler) {
        super(lock);
        Intrinsics.j(lock, "lock");
        Intrinsics.j(checkCancelled, "checkCancelled");
        Intrinsics.j(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f147535c = checkCancelled;
        this.f147536d = interruptedExceptionHandler;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock, kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f147535c.run();
            } catch (InterruptedException e10) {
                this.f147536d.invoke(e10);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CancellableSimpleLock(Runnable checkCancelled, Function1<? super InterruptedException, Unit> interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        Intrinsics.j(checkCancelled, "checkCancelled");
        Intrinsics.j(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
