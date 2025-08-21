package rv;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15781M;
import mv.InterfaceC15804h0;
import mv.InterfaceC15815n;
import mv.V;
import mv.Y;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u00015B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0015\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0015\u001a\u00060\rj\u0002`\u000eH\u0017¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0096\u0001¢\u0006\u0004\b \u0010!J,\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0015\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010.\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00103\u001a\u00060/j\u0002`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u000b\u00104\u001a\u00020/8\u0002X\u0082\u0004¨\u00066"}, d2 = {"Lrv/k;", "Lmv/K;", "Lmv/Y;", "dispatcher", "", "parallelism", "", "name", "<init>", "(Lmv/K;ILjava/lang/String;)V", "", "c1", "()Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "a1", "()Ljava/lang/Runnable;", "S0", "(ILjava/lang/String;)Lmv/K;", "Lkotlin/coroutines/CoroutineContext;", "context", "block", "", "J0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "K0", "toString", "()Ljava/lang/String;", "", "timeMillis", "Lmv/n;", "continuation", "H0", "(JLmv/n;)V", "Lmv/h0;", "w", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lmv/h0;", "d", "Lmv/K;", "e", "I", "f", "Ljava/lang/String;", "Lrv/p;", "g", "Lrv/p;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "h", "Ljava/lang/Object;", "workerAllocationLock", "runningWorkers", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: rv.k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16974k extends AbstractC15779K implements Y {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f159650i = AtomicIntegerFieldUpdater.newUpdater(C16974k.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Y f159651c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K dispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int parallelism;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C16979p<Runnable> queue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Object workerAllocationLock;
    private volatile /* synthetic */ int runningWorkers$volatile;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lrv/k$a;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(Lrv/k;Ljava/lang/Runnable;)V", "", "run", "()V", "a", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: rv.k$a */
    private final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Runnable currentTask;

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (Throwable th2) {
                    C15781M.a(EmptyCoroutineContext.f143553a, th2);
                }
                Runnable runnableA1 = C16974k.this.a1();
                if (runnableA1 == null) {
                    return;
                }
                try {
                    this.currentTask = runnableA1;
                    i10++;
                    if (i10 >= 16 && C16972i.d(C16974k.this.dispatcher, C16974k.this)) {
                        C16972i.c(C16974k.this.dispatcher, C16974k.this, this);
                        return;
                    }
                } catch (Throwable th3) {
                    Object obj = C16974k.this.workerAllocationLock;
                    C16974k c16974k = C16974k.this;
                    synchronized (obj) {
                        C16974k.Z0().decrementAndGet(c16974k);
                        throw th3;
                    }
                }
            }
        }

        public a(Runnable runnable) {
            this.currentTask = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater Z0() {
        return f159650i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable a1() {
        while (true) {
            Runnable runnableE = this.queue.e();
            if (runnableE != null) {
                return runnableE;
            }
            synchronized (this.workerAllocationLock) {
                f159650i.decrementAndGet(this);
                if (this.queue.c() == 0) {
                    return null;
                }
                f159650i.incrementAndGet(this);
            }
        }
    }

    private final boolean c1() {
        synchronized (this.workerAllocationLock) {
            if (f159650i.get(this) >= this.parallelism) {
                return false;
            }
            f159650i.incrementAndGet(this);
            return true;
        }
    }

    @Override // mv.Y
    public void H0(long timeMillis, InterfaceC15815n<? super Unit> continuation) {
        this.f159651c.H0(timeMillis, continuation);
    }

    @Override // mv.AbstractC15779K
    public void J0(CoroutineContext context, Runnable block) {
        Runnable runnableA1;
        this.queue.a(block);
        if (f159650i.get(this) >= this.parallelism || !c1() || (runnableA1 = a1()) == null) {
            return;
        }
        try {
            C16972i.c(this.dispatcher, this, new a(runnableA1));
        } catch (Throwable th2) {
            f159650i.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // mv.AbstractC15779K
    public void K0(CoroutineContext context, Runnable block) {
        Runnable runnableA1;
        this.queue.a(block);
        if (f159650i.get(this) >= this.parallelism || !c1() || (runnableA1 = a1()) == null) {
            return;
        }
        try {
            this.dispatcher.K0(this, new a(runnableA1));
        } catch (Throwable th2) {
            f159650i.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // mv.AbstractC15779K
    /* renamed from: toString */
    public String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        return this.dispatcher + ".limitedParallelism(" + this.parallelism + ')';
    }

    @Override // mv.Y
    public InterfaceC15804h0 w(long timeMillis, Runnable block, CoroutineContext context) {
        return this.f159651c.w(timeMillis, block, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C16974k(AbstractC15779K abstractC15779K, int i10, String str) {
        Y y10;
        if (abstractC15779K instanceof Y) {
            y10 = (Y) abstractC15779K;
        } else {
            y10 = null;
        }
        this.f159651c = y10 == null ? V.a() : y10;
        this.dispatcher = abstractC15779K;
        this.parallelism = i10;
        this.name = str;
        this.queue = new C16979p<>(false);
        this.workerAllocationLock = new Object();
    }

    @Override // mv.AbstractC15779K
    public AbstractC15779K S0(int parallelism, String name) {
        C16975l.a(parallelism);
        if (parallelism >= this.parallelism) {
            return C16975l.b(this, name);
        }
        return super.S0(parallelism, name);
    }
}
