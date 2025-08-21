package r4;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u0018\u0010\u0012\u001a\u00060\u000fj\u0002`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\n¨\u0006\u0019"}, d2 = {"Lr4/a;", "", "Landroidx/room/concurrent/SynchronizedObject;", "Lkotlin/Function0;", "", "closeAction", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "a", "()Z", "d", "()V", "b", "Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/atomic/AtomicInteger;", "Landroidx/room/concurrent/AtomicInt;", "Ljava/util/concurrent/atomic/AtomicInteger;", "blockers", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "c", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closeInitiated", "isClosed", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: r4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16833a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<Unit> closeAction;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger blockers;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean closeInitiated;

    public final boolean a() {
        synchronized (this) {
            if (c()) {
                return false;
            }
            this.blockers.incrementAndGet();
            return true;
        }
    }

    public final void b() {
        synchronized (this) {
            if (this.closeInitiated.compareAndSet(false, true)) {
                Unit unit = Unit.f143329a;
                while (this.blockers.get() != 0) {
                }
                this.closeAction.invoke();
            }
        }
    }

    public final void d() {
        synchronized (this) {
            this.blockers.decrementAndGet();
            if (this.blockers.get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
            Unit unit = Unit.f143329a;
        }
    }

    public C16833a(Function0<Unit> closeAction) {
        Intrinsics.j(closeAction, "closeAction");
        this.closeAction = closeAction;
        this.blockers = new AtomicInteger(0);
        this.closeInitiated = new AtomicBoolean(false);
    }

    private final boolean c() {
        return this.closeInitiated.get();
    }
}
