package S6;

import android.os.Looper;
import androidx.room.G;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u0000 \u0018*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u000eB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0010\u0010\f\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0005R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"LS6/e;", "E", "LS6/d;", "Ljava/lang/Runnable;", "<init>", "()V", "", "h", "()Z", "", "e", "g", "f", "()Ljava/lang/Object;", "a", "get", "run", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "state", "", "b", "Ljava/lang/Object;", "value", "c", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public abstract class e<E> implements d<E>, Runnable {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    private static Thread f34450d;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger state = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile Object value;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0005\u001a\u0004\u0018\u00010\u00048@@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"LS6/e$a;", "", "<init>", "()V", "Ljava/lang/Thread;", "_mainThread", "Ljava/lang/Thread;", "b", "()Ljava/lang/Thread;", "set_mainThread$bugsnag_android_core_release", "(Ljava/lang/Thread;)V", "get_mainThread$bugsnag_android_core_release$annotations", "a", "mainThread", "", "TASK_STATE_COMPLETE", "I", "TASK_STATE_FAILED", "TASK_STATE_PENDING", "TASK_STATE_RUNNING", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: S6.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Thread a() {
            Thread threadB = b();
            Intrinsics.g(threadB);
            return threadB;
        }

        public final Thread b() {
            if (e.f34450d == null) {
                e.f34450d = Looper.getMainLooper().getThread();
            }
            return e.f34450d;
        }
    }

    private final void e() {
        synchronized (this) {
            while (!g()) {
                try {
                    wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Unit unit = Unit.f143329a;
        }
    }

    public abstract E f();

    private final boolean g() {
        int i10 = this.state.get();
        return (i10 == 0 || i10 == 1) ? false : true;
    }

    @Override // S6.d
    public E a() {
        while (true) {
            int i10 = this.state.get();
            if (i10 != 0) {
                if (i10 == 1) {
                    e();
                } else {
                    if (i10 == 2) {
                        return (E) this.value;
                    }
                    if (i10 == 999) {
                        return null;
                    }
                }
            } else if (h()) {
                e();
            } else {
                run();
            }
        }
    }

    @Override // S6.d
    public E get() throws Throwable {
        while (true) {
            int i10 = this.state.get();
            if (i10 != 0) {
                if (i10 == 1) {
                    e();
                } else {
                    if (i10 == 2) {
                        return (E) this.value;
                    }
                    if (i10 == 999) {
                        Object obj = this.value;
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                        }
                        throw ((Throwable) obj);
                    }
                }
            } else if (h()) {
                e();
            } else {
                run();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.state.compareAndSet(0, 1)) {
            try {
                this.value = f();
                this.state.set(2);
                synchronized (this) {
                    notifyAll();
                    Unit unit = Unit.f143329a;
                }
            } catch (Throwable th2) {
                try {
                    this.value = th2;
                    this.state.set(G.MAX_BIND_PARAMETER_CNT);
                    synchronized (this) {
                        notifyAll();
                        Unit unit2 = Unit.f143329a;
                    }
                } catch (Throwable th3) {
                    synchronized (this) {
                        notifyAll();
                        Unit unit3 = Unit.f143329a;
                        throw th3;
                    }
                }
            }
        }
    }

    private final boolean h() {
        if (Thread.currentThread() == INSTANCE.a()) {
            return true;
        }
        return false;
    }
}
