package mv;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0003J\u0019\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0017\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004¨\u0006\""}, d2 = {"Lmv/b1;", "Lmv/G0;", "<init>", "()V", "", "state", "", "A", "(I)Ljava/lang/Void;", "Lmv/C0;", "job", "", "B", "(Lmv/C0;)V", "y", "", "cause", "w", "(Ljava/lang/Throwable;)V", "Ljava/lang/Thread;", "kotlin.jvm.PlatformType", "e", "Ljava/lang/Thread;", "targetThread", "Lmv/h0;", "f", "Lmv/h0;", "cancelHandle", "", "v", "()Z", "onCancelling", "", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
final class b1 extends G0 {

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f151705g = AtomicIntegerFieldUpdater.newUpdater(b1.class, "_state$volatile");
    private volatile /* synthetic */ int _state$volatile;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Thread targetThread = Thread.currentThread();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15804h0 cancelHandle;

    public final void B(C0 job) {
        int i10;
        this.cancelHandle = F0.m(job, false, this, 1, null);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f151705g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 == 2 || i10 == 3) {
                    return;
                }
                A(i10);
                throw new KotlinNothingValueException();
            }
        } while (!f151705g.compareAndSet(this, i10, 0));
    }

    @Override // mv.G0
    public boolean v() {
        return true;
    }

    private final Void A(int state) {
        throw new IllegalStateException(("Illegal state " + state).toString());
    }

    @Override // mv.G0
    public void w(Throwable cause) {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f151705g;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 1 && i10 != 2 && i10 != 3) {
                    A(i10);
                    throw new KotlinNothingValueException();
                }
                return;
            }
        } while (!f151705g.compareAndSet(this, i10, 2));
        this.targetThread.interrupt();
        f151705g.set(this, 3);
    }

    public final void y() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f151705g;
        while (true) {
            int i10 = atomicIntegerFieldUpdater.get(this);
            if (i10 != 0) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        A(i10);
                        throw new KotlinNothingValueException();
                    }
                }
            } else if (f151705g.compareAndSet(this, i10, 1)) {
                InterfaceC15804h0 interfaceC15804h0 = this.cancelHandle;
                if (interfaceC15804h0 != null) {
                    interfaceC15804h0.dispose();
                    return;
                }
                return;
            }
        }
    }
}
