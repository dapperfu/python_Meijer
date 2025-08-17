package vv;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16620M;
import qv.InterfaceC16643h0;
import qv.InterfaceC16654n;
import qv.V;
import qv.Y;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u00015B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0015\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\n\u0010\u0015\u001a\u00060\rj\u0002`\u000eH\u0017¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ&\u0010 \u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0096\u0001¢\u0006\u0004\b \u0010!J,\u0010#\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001c2\n\u0010\u0015\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010.\u001a\f\u0012\b\u0012\u00060\rj\u0002`\u000e0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00103\u001a\u00060/j\u0002`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u000b\u00104\u001a\u00020/8\u0002X\u0082\u0004¨\u00066"}, d2 = {"Lvv/k;", "Lqv/K;", "Lqv/Y;", "dispatcher", "", "parallelism", "", "name", "<init>", "(Lqv/K;ILjava/lang/String;)V", "", "c1", "()Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "b1", "()Ljava/lang/Runnable;", "U0", "(ILjava/lang/String;)Lqv/K;", "Lkotlin/coroutines/CoroutineContext;", "context", "block", "", "L0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "N0", "toString", "()Ljava/lang/String;", "", "timeMillis", "Lqv/n;", "continuation", "j0", "(JLqv/n;)V", "Lqv/h0;", "w", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lqv/h0;", "d", "Lqv/K;", "e", "I", "f", "Ljava/lang/String;", "Lvv/p;", "g", "Lvv/p;", "queue", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "h", "Ljava/lang/Object;", "workerAllocationLock", "runningWorkers", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: vv.k, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17655k extends AbstractC16618K implements Y {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f165116i = AtomicIntegerFieldUpdater.newUpdater(C17655k.class, "runningWorkers$volatile");

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Y f165117c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K dispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int parallelism;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C17660p<Runnable> queue;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Object workerAllocationLock;
    private volatile /* synthetic */ int runningWorkers$volatile;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lvv/k$a;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(Lvv/k;Ljava/lang/Runnable;)V", "", "run", "()V", "a", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: vv.k$a */
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
                    C16620M.a(EmptyCoroutineContext.f142646a, th2);
                }
                Runnable runnableB1 = C17655k.this.b1();
                if (runnableB1 == null) {
                    return;
                }
                try {
                    this.currentTask = runnableB1;
                    i10++;
                    if (i10 >= 16 && C17653i.d(C17655k.this.dispatcher, C17655k.this)) {
                        C17653i.c(C17655k.this.dispatcher, C17655k.this, this);
                        return;
                    }
                } catch (Throwable th3) {
                    Object obj = C17655k.this.workerAllocationLock;
                    C17655k c17655k = C17655k.this;
                    synchronized (obj) {
                        C17655k.a1().decrementAndGet(c17655k);
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
    public static final /* synthetic */ AtomicIntegerFieldUpdater a1() {
        return f165116i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable b1() {
        while (true) {
            Runnable runnableE = this.queue.e();
            if (runnableE != null) {
                return runnableE;
            }
            synchronized (this.workerAllocationLock) {
                f165116i.decrementAndGet(this);
                if (this.queue.c() == 0) {
                    return null;
                }
                f165116i.incrementAndGet(this);
            }
        }
    }

    private final boolean c1() {
        synchronized (this.workerAllocationLock) {
            if (f165116i.get(this) >= this.parallelism) {
                return false;
            }
            f165116i.incrementAndGet(this);
            return true;
        }
    }

    @Override // qv.AbstractC16618K
    public void L0(CoroutineContext context, Runnable block) {
        Runnable runnableB1;
        this.queue.a(block);
        if (f165116i.get(this) >= this.parallelism || !c1() || (runnableB1 = b1()) == null) {
            return;
        }
        try {
            C17653i.c(this.dispatcher, this, new a(runnableB1));
        } catch (Throwable th2) {
            f165116i.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // qv.AbstractC16618K
    public void N0(CoroutineContext context, Runnable block) {
        Runnable runnableB1;
        this.queue.a(block);
        if (f165116i.get(this) >= this.parallelism || !c1() || (runnableB1 = b1()) == null) {
            return;
        }
        try {
            this.dispatcher.N0(this, new a(runnableB1));
        } catch (Throwable th2) {
            f165116i.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // qv.Y
    public void j0(long timeMillis, InterfaceC16654n<? super Unit> continuation) {
        this.f165117c.j0(timeMillis, continuation);
    }

    @Override // qv.AbstractC16618K
    /* renamed from: toString */
    public String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        return this.dispatcher + ".limitedParallelism(" + this.parallelism + ')';
    }

    @Override // qv.Y
    public InterfaceC16643h0 w(long timeMillis, Runnable block, CoroutineContext context) {
        return this.f165117c.w(timeMillis, block, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17655k(AbstractC16618K abstractC16618K, int i10, String str) {
        Y y10;
        if (abstractC16618K instanceof Y) {
            y10 = (Y) abstractC16618K;
        } else {
            y10 = null;
        }
        this.f165117c = y10 == null ? V.a() : y10;
        this.dispatcher = abstractC16618K;
        this.parallelism = i10;
        this.name = str;
        this.queue = new C17660p<>(false);
        this.workerAllocationLock = new Object();
    }

    @Override // qv.AbstractC16618K
    public AbstractC16618K U0(int parallelism, String name) {
        C17656l.a(parallelism);
        if (parallelism >= this.parallelism) {
            return C17656l.b(this, name);
        }
        return super.U0(parallelism, name);
    }
}
