package f6;

import Q5.t;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0017\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004&(+/B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0013\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u000eJ\r\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010\u000eJ\r\u0010 \u001a\u00020\f¢\u0006\u0004\b \u0010\u000eJ\u000f\u0010!\u001a\u00020\fH\u0014¢\u0006\u0004\b!\u0010\u000eJ\r\u0010\"\u001a\u00020\t¢\u0006\u0004\b\"\u0010\u000bJ\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R%\u00107\u001a\f02R\b\u0012\u0004\u0012\u00028\u00000\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001c\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010BR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010B¨\u0006C"}, d2 = {"Lf6/f;", "T", "", "", "name", "Lf6/f$c;", "workHandler", "<init>", "(Ljava/lang/String;Lf6/f$c;)V", "", "r", "()V", "", "n", "()Z", "s", "()Ljava/lang/Object;", "q", "j", "l", "()Ljava/lang/String;", "Ljava/lang/Runnable;", "initialJob", "v", "(Ljava/lang/Runnable;)V", "finalJob", "u", "item", "o", "(Ljava/lang/Object;)Z", "x", "p", "t", "i", "w", "Lf6/f$b;", "k", "()Lf6/f$b;", "a", "Ljava/lang/String;", "b", "Lf6/f$c;", "Ljava/util/concurrent/ExecutorService;", "c", "Ljava/util/concurrent/ExecutorService;", "executorService", "Ljava/util/Queue;", "d", "Ljava/util/Queue;", "workQueue", "Lf6/f$d;", "e", "Lkotlin/Lazy;", "m", "()Lf6/f$d;", "workProcessor", "Ljava/util/concurrent/Future;", "f", "Ljava/util/concurrent/Future;", "workProcessorFuture", "g", "Lf6/f$b;", "state", "h", "Ljava/lang/Object;", "activenessMutex", "Ljava/lang/Runnable;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: f6.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13850f<T> {

    /* renamed from: k, reason: collision with root package name */
    private static final a f130791k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final int f130792l = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c<T> workHandler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ExecutorService executorService;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Queue<T> workQueue;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy workProcessor;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Future<?> workProcessorFuture;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private volatile b state;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Object activenessMutex;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private volatile Runnable initialJob;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private volatile Runnable finalJob;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf6/f$a;", "", "<init>", "()V", "", "LOG_TAG", "Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: f6.f$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lf6/f$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: f6.f$b */
    public enum b {
        NOT_STARTED,
        ACTIVE,
        PAUSED,
        SHUTDOWN
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0001H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf6/f$c;", "W", "", "item", "", "a", "(Ljava/lang/Object;)Z", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: f6.f$c */
    public interface c<W> {
        boolean a(W item);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf6/f$d;", "Ljava/lang/Runnable;", "<init>", "(Lf6/f;)V", "", "run", "()V", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: f6.f$d */
    public final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            Object objQ;
            while (!Thread.interrupted() && ((C13850f) C13850f.this).state == b.ACTIVE && C13850f.this.i() && C13850f.this.n()) {
                try {
                    objQ = C13850f.this.q();
                } catch (Exception e10) {
                    Thread.currentThread().interrupt();
                    t.f("MobileCore", C13850f.this.l(), "Exception encountered while processing item. " + e10, new Object[0]);
                }
                if (objQ == null) {
                    return;
                }
                if (((C13850f) C13850f.this).workHandler.a(objQ)) {
                    C13850f.this.s();
                } else {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
            Object obj = ((C13850f) C13850f.this).activenessMutex;
            C13850f<T> c13850f = C13850f.this;
            synchronized (obj) {
                try {
                    ((C13850f) c13850f).workProcessorFuture = null;
                    if (z10 && ((C13850f) c13850f).state == b.ACTIVE && c13850f.n()) {
                        t.e("MobileCore", c13850f.l(), "Auto resuming work processor.", new Object[0]);
                        c13850f.t();
                    }
                    Unit unit = Unit.f142422a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lf6/f$d;", "Lf6/f;", "c", "()Lf6/f$d;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: f6.f$e */
    static final class e extends Lambda implements Function0<C13850f<T>.d> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C13850f<T> f130809f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C13850f<T> c13850f) {
            super(0);
            this.f130809f = c13850f;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C13850f<T>.d invoke() {
            return this.f130809f.new d();
        }
    }

    protected boolean i() {
        return true;
    }

    public C13850f(String name, c<T> workHandler) {
        Intrinsics.j(name, "name");
        Intrinsics.j(workHandler, "workHandler");
        this.name = name;
        this.workHandler = workHandler;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.i(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor()");
        this.executorService = executorServiceNewSingleThreadExecutor;
        this.workQueue = new ConcurrentLinkedQueue();
        this.workProcessor = LazyKt.b(new e(this));
        this.state = b.NOT_STARTED;
        this.activenessMutex = new Object();
    }

    private final void j() {
        Runnable runnable = this.finalJob;
        if (runnable == null) {
            return;
        }
        this.executorService.submit(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String l() {
        return "SerialWorkDispatcher-" + this.name;
    }

    private final C13850f<T>.d m() {
        return (d) this.workProcessor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean n() {
        return this.workQueue.peek() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T q() {
        return this.workQueue.peek();
    }

    private final void r() {
        Runnable runnable = this.initialJob;
        if (runnable == null) {
            return;
        }
        this.executorService.submit(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T s() {
        return this.workQueue.poll();
    }

    /* renamed from: k, reason: from getter */
    public final b getState() {
        return this.state;
    }

    public final boolean o(T item) {
        synchronized (this.activenessMutex) {
            if (this.state == b.SHUTDOWN) {
                return false;
            }
            this.workQueue.offer(item);
            if (this.state == b.ACTIVE) {
                t();
            }
            return true;
        }
    }

    public final boolean p() {
        synchronized (this.activenessMutex) {
            if (this.state == b.SHUTDOWN) {
                throw new IllegalStateException("Cannot pause SerialWorkDispatcher (" + this.name + "). Already shutdown.");
            }
            if (this.state == b.ACTIVE) {
                this.state = b.PAUSED;
                return true;
            }
            t.a("MobileCore", l(), "SerialWorkDispatcher (" + this.name + ") is not active.", new Object[0]);
            return false;
        }
    }

    public final boolean t() {
        synchronized (this.activenessMutex) {
            if (this.state == b.SHUTDOWN) {
                throw new IllegalStateException("Cannot resume SerialWorkDispatcher (" + this.name + "). Already shutdown.");
            }
            if (this.state == b.NOT_STARTED) {
                t.a("MobileCore", l(), "SerialWorkDispatcher (" + this.name + ") has not started.", new Object[0]);
                return false;
            }
            this.state = b.ACTIVE;
            Future<?> future = this.workProcessorFuture;
            if ((future != null && !future.isDone()) || !i()) {
                return true;
            }
            this.workProcessorFuture = this.executorService.submit(m());
            return true;
        }
    }

    public final void u(Runnable finalJob) {
        Intrinsics.j(finalJob, "finalJob");
        this.finalJob = finalJob;
    }

    public final void v(Runnable initialJob) {
        Intrinsics.j(initialJob, "initialJob");
        this.initialJob = initialJob;
    }

    public final void w() {
        synchronized (this.activenessMutex) {
            try {
                b bVar = this.state;
                b bVar2 = b.SHUTDOWN;
                if (bVar == bVar2) {
                    return;
                }
                this.state = bVar2;
                Future<?> future = this.workProcessorFuture;
                if (future != null) {
                    future.cancel(true);
                }
                this.workProcessorFuture = null;
                this.workQueue.clear();
                Unit unit = Unit.f142422a;
                j();
                this.executorService.shutdown();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean x() {
        synchronized (this.activenessMutex) {
            if (this.state == b.SHUTDOWN) {
                throw new IllegalStateException("Cannot start SerialWorkDispatcher (" + this.name + "). Already shutdown.");
            }
            if (this.state == b.NOT_STARTED) {
                this.state = b.ACTIVE;
                r();
                t();
                return true;
            }
            t.a("MobileCore", l(), "SerialWorkDispatcher (" + this.name + ") has already started.", new Object[0]);
            return false;
        }
    }
}
