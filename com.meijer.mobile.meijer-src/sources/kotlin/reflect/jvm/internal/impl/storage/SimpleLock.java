package kotlin.reflect.jvm.internal.impl.storage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes14.dex */
public interface SimpleLock {

    /* renamed from: a, reason: collision with root package name */
    public static final Companion f147565a = Companion.f147566a;

    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f147566a = new Companion();

        public final DefaultSimpleLock a(Runnable runnable, Function1<? super InterruptedException, Unit> function1) {
            return (runnable == null || function1 == null) ? new DefaultSimpleLock(null, 1, null) : new CancellableSimpleLock(runnable, function1);
        }

        private Companion() {
        }
    }

    void lock();

    void unlock();
}
