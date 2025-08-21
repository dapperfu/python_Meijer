package uv;

import com.medallia.digital.mobilesdk.l3;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001f*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\"\u0010\u001eJ!\u0010$\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\r¢\u0006\u0004\b$\u0010%J)\u0010&\u001a\u00020\u00162\n\u0010\n\u001a\u00060\bj\u0002`\t2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014¢\u0006\u0004\b&\u0010\u0018J\u000f\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b'\u0010\u001eJ\u0015\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u0019¢\u0006\u0004\b)\u0010*R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,R\u0014\u00100\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0013\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00018\u0002X\u0082\u0004R\u000b\u00104\u001a\u00020\u00018\u0002X\u0082\u0004R\u000b\u00105\u001a\u00020\u00018\u0002X\u0082\u0004R\u000b\u00106\u001a\u00020\u00018\u0002X\u0082\u0004¨\u00067"}, d2 = {"Luv/l;", "", "<init>", "()V", "Luv/h;", "task", "b", "(Luv/h;)Luv/h;", "", "Lkotlinx/coroutines/scheduling/StealingMode;", "stealingMode", "p", "(I)Luv/h;", "", "onlyBlocking", "o", "(Z)Luv/h;", "index", "q", "(IZ)Luv/h;", "Lkotlin/jvm/internal/Ref$ObjectRef;", "stolenTaskRef", "", "s", "(ILkotlin/jvm/internal/Ref$ObjectRef;)J", "Luv/d;", "queue", "n", "(Luv/d;)Z", "m", "()Luv/h;", "", "c", "(Luv/h;)V", "k", "fair", "a", "(Luv/h;Z)Luv/h;", "r", "l", "globalQueue", "j", "(Luv/d;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "e", "()I", "bufferSize", "i", "size", "lastScheduledTask", "producerIndex", "consumerIndex", "blockingTasksInBuffer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: uv.l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C17496l {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f164650b = AtomicReferenceFieldUpdater.newUpdater(C17496l.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f164651c = AtomicIntegerFieldUpdater.newUpdater(C17496l.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f164652d = AtomicIntegerFieldUpdater.newUpdater(C17496l.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f164653e = AtomicIntegerFieldUpdater.newUpdater(C17496l.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicReferenceArray<AbstractRunnableC17492h> buffer = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final AbstractRunnableC17492h l() {
        return o(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r(int stealingMode, Ref.ObjectRef<AbstractRunnableC17492h> stolenTaskRef) {
        T tM = stealingMode == 3 ? m() : p(stealingMode);
        if (tM == 0) {
            return s(stealingMode, stolenTaskRef);
        }
        stolenTaskRef.f143742a = tM;
        return -1L;
    }

    private final void c(AbstractRunnableC17492h abstractRunnableC17492h) {
        if (abstractRunnableC17492h == null || !abstractRunnableC17492h.taskContext) {
            return;
        }
        f164653e.decrementAndGet(this);
    }

    private final AbstractRunnableC17492h q(int index, boolean onlyBlocking) {
        int i10 = index & l3.f93324d;
        AbstractRunnableC17492h abstractRunnableC17492h = this.buffer.get(i10);
        if (abstractRunnableC17492h == null || abstractRunnableC17492h.taskContext != onlyBlocking || !ov.l.a(this.buffer, i10, abstractRunnableC17492h, null)) {
            return null;
        }
        if (onlyBlocking) {
            f164653e.decrementAndGet(this);
        }
        return abstractRunnableC17492h;
    }

    public final AbstractRunnableC17492h a(AbstractRunnableC17492h task, boolean fair) {
        if (fair) {
            return b(task);
        }
        AbstractRunnableC17492h abstractRunnableC17492h = (AbstractRunnableC17492h) f164650b.getAndSet(this, task);
        if (abstractRunnableC17492h == null) {
            return null;
        }
        return b(abstractRunnableC17492h);
    }

    private final AbstractRunnableC17492h b(AbstractRunnableC17492h task) {
        if (e() == 127) {
            return task;
        }
        if (task.taskContext) {
            f164653e.incrementAndGet(this);
        }
        int i10 = f164651c.get(this) & l3.f93324d;
        while (this.buffer.get(i10) != null) {
            Thread.yield();
        }
        this.buffer.lazySet(i10, task);
        f164651c.incrementAndGet(this);
        return null;
    }

    private final int e() {
        return f164651c.get(this) - f164652d.get(this);
    }

    private final AbstractRunnableC17492h m() {
        AbstractRunnableC17492h andSet;
        while (true) {
            int i10 = f164652d.get(this);
            if (i10 - f164651c.get(this) == 0) {
                return null;
            }
            int i11 = i10 & l3.f93324d;
            if (f164652d.compareAndSet(this, i10, i10 + 1) && (andSet = this.buffer.getAndSet(i11, null)) != null) {
                c(andSet);
                return andSet;
            }
        }
    }

    private final boolean n(C17488d queue) {
        AbstractRunnableC17492h abstractRunnableC17492hM = m();
        if (abstractRunnableC17492hM == null) {
            return false;
        }
        queue.a(abstractRunnableC17492hM);
        return true;
    }

    private final AbstractRunnableC17492h o(boolean onlyBlocking) {
        AbstractRunnableC17492h abstractRunnableC17492h;
        do {
            abstractRunnableC17492h = (AbstractRunnableC17492h) f164650b.get(this);
            if (abstractRunnableC17492h == null || abstractRunnableC17492h.taskContext != onlyBlocking) {
                int i10 = f164652d.get(this);
                int i11 = f164651c.get(this);
                while (i10 != i11) {
                    if (onlyBlocking && f164653e.get(this) == 0) {
                        return null;
                    }
                    i11--;
                    AbstractRunnableC17492h abstractRunnableC17492hQ = q(i11, onlyBlocking);
                    if (abstractRunnableC17492hQ != null) {
                        return abstractRunnableC17492hQ;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.b.a(f164650b, this, abstractRunnableC17492h, null));
        return abstractRunnableC17492h;
    }

    private final AbstractRunnableC17492h p(int stealingMode) {
        int i10 = f164652d.get(this);
        int i11 = f164651c.get(this);
        boolean z10 = true;
        if (stealingMode != 1) {
            z10 = false;
        }
        while (i10 != i11) {
            if (z10 && f164653e.get(this) == 0) {
                return null;
            }
            int i12 = i10 + 1;
            AbstractRunnableC17492h abstractRunnableC17492hQ = q(i10, z10);
            if (abstractRunnableC17492hQ == null) {
                i10 = i12;
            } else {
                return abstractRunnableC17492hQ;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object, uv.h] */
    private final long s(int stealingMode, Ref.ObjectRef<AbstractRunnableC17492h> stolenTaskRef) {
        ?? r02;
        int i10;
        do {
            r02 = (AbstractRunnableC17492h) f164650b.get(this);
            if (r02 == 0) {
                return -2L;
            }
            if (r02.taskContext) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            if ((i10 & stealingMode) == 0) {
                return -2L;
            }
            long jA = C17494j.f164648f.a() - r02.submissionTime;
            long j10 = C17494j.f164644b;
            if (jA < j10) {
                return j10 - jA;
            }
        } while (!androidx.concurrent.futures.b.a(f164650b, this, r02, null));
        stolenTaskRef.f143742a = r02;
        return -1L;
    }

    public final int i() {
        if (f164650b.get(this) != null) {
            return e() + 1;
        }
        return e();
    }

    public final void j(C17488d globalQueue) {
        AbstractRunnableC17492h abstractRunnableC17492h = (AbstractRunnableC17492h) f164650b.getAndSet(this, null);
        if (abstractRunnableC17492h != null) {
            globalQueue.a(abstractRunnableC17492h);
        }
        while (n(globalQueue)) {
        }
    }

    public final AbstractRunnableC17492h k() {
        AbstractRunnableC17492h abstractRunnableC17492h = (AbstractRunnableC17492h) f164650b.getAndSet(this, null);
        if (abstractRunnableC17492h == null) {
            return m();
        }
        return abstractRunnableC17492h;
    }
}
