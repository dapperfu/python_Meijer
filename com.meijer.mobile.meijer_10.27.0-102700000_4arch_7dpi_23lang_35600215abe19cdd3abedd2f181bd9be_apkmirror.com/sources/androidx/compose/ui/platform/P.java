package androidx.compose.ui.platform;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.compose.runtime.InterfaceC5698b0;
import j2.C14840h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16639f0;
import qv.C16644i;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u00016\b\u0007\u0018\u0000 @2\u00020\u0001:\u0001\u001cB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0016\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00120*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010,R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00105\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00102R\u0014\u00109\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0017\u0010?\u001a\u00020:8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006A"}, d2 = {"Landroidx/compose/ui/platform/P;", "Lqv/K;", "Landroid/view/Choreographer;", "choreographer", "Landroid/os/Handler;", "handler", "<init>", "(Landroid/view/Choreographer;Landroid/os/Handler;)V", "Ljava/lang/Runnable;", "g1", "()Ljava/lang/Runnable;", "", "j1", "()V", "", "frameTimeNanos", "i1", "(J)V", "Landroid/view/Choreographer$FrameCallback;", "callback", "m1", "(Landroid/view/Choreographer$FrameCallback;)V", "o1", "Lkotlin/coroutines/CoroutineContext;", "context", "block", "L0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "c", "Landroid/view/Choreographer;", "e1", "()Landroid/view/Choreographer;", "d", "Landroid/os/Handler;", "", "e", "Ljava/lang/Object;", "lock", "Lkotlin/collections/ArrayDeque;", "f", "Lkotlin/collections/ArrayDeque;", "toRunTrampolined", "", "g", "Ljava/util/List;", "toRunOnFrame", "h", "spareToRunOnFrame", "", "i", "Z", "scheduledTrampolineDispatch", "j", "scheduledFrameDispatch", "androidx/compose/ui/platform/P$d", "k", "Landroidx/compose/ui/platform/P$d;", "dispatchCallback", "Landroidx/compose/runtime/b0;", "l", "Landroidx/compose/runtime/b0;", "f1", "()Landroidx/compose/runtime/b0;", "frameClock", "m", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class P extends AbstractC16618K {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: n, reason: collision with root package name */
    public static final int f51881n = 8;

    /* renamed from: o, reason: collision with root package name */
    private static final Lazy<CoroutineContext> f51882o = LazyKt.b(a.f51894f);

    /* renamed from: p, reason: collision with root package name */
    private static final ThreadLocal<CoroutineContext> f51883p = new b();

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Choreographer choreographer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque<Runnable> toRunTrampolined;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private List<Choreographer.FrameCallback> toRunOnFrame;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private List<Choreographer.FrameCallback> spareToRunOnFrame;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean scheduledTrampolineDispatch;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean scheduledFrameDispatch;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final d dispatchCallback;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5698b0 frameClock;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "c", "()Lkotlin/coroutines/CoroutineContext;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function0<CoroutineContext> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f51894f = new a();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lqv/O;)Landroid/view/Choreographer;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.platform.P$a$a, reason: collision with other inner class name */
        static final class C1060a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Choreographer>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f51895a;

            C1060a(Continuation<? super C1060a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1060a(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Choreographer> continuation) {
                return ((C1060a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f51895a == 0) {
                    ResultKt.b(obj);
                    return Choreographer.getInstance();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final CoroutineContext invoke() {
            P p10 = new P(Q.b() ? Choreographer.getInstance() : (Choreographer) C16644i.e(C16639f0.c(), new C1060a(null)), C14840h.a(Looper.getMainLooper()), null);
            return p10.m0(p10.getFrameClock());
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/platform/P$b", "Ljava/lang/ThreadLocal;", "Lkotlin/coroutines/CoroutineContext;", "a", "()Lkotlin/coroutines/CoroutineContext;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class b extends ThreadLocal<CoroutineContext> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CoroutineContext initialValue() {
            Choreographer choreographer = Choreographer.getInstance();
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper == null) {
                throw new IllegalStateException("no Looper on this thread");
            }
            P p10 = new P(choreographer, C14840h.a(looperMyLooper), null);
            return p10.m0(p10.getFrameClock());
        }

        b() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\t\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/platform/P$c;", "", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "Main$delegate", "Lkotlin/Lazy;", "b", "()Lkotlin/coroutines/CoroutineContext;", "Main", "a", "CurrentThread", "Ljava/lang/ThreadLocal;", "currentThread", "Ljava/lang/ThreadLocal;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.P$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CoroutineContext a() {
            if (Q.b()) {
                return b();
            }
            CoroutineContext coroutineContext = (CoroutineContext) P.f51883p.get();
            if (coroutineContext != null) {
                return coroutineContext;
            }
            throw new IllegalStateException("no AndroidUiDispatcher for this thread");
        }

        public final CoroutineContext b() {
            return (CoroutineContext) P.f51882o.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/compose/ui/platform/P$d", "Landroid/view/Choreographer$FrameCallback;", "Ljava/lang/Runnable;", "", "run", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class d implements Choreographer.FrameCallback, Runnable {
        d() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            P.this.handler.removeCallbacks(this);
            P.this.j1();
            P.this.i1(frameTimeNanos);
        }

        @Override // java.lang.Runnable
        public void run() {
            P.this.j1();
            Object obj = P.this.lock;
            P p10 = P.this;
            synchronized (obj) {
                try {
                    if (p10.toRunOnFrame.isEmpty()) {
                        p10.getChoreographer().removeFrameCallback(this);
                        p10.scheduledFrameDispatch = false;
                    }
                    Unit unit = Unit.f142422a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public /* synthetic */ P(Choreographer choreographer, Handler handler, DefaultConstructorMarker defaultConstructorMarker) {
        this(choreographer, handler);
    }

    private P(Choreographer choreographer, Handler handler) {
        this.choreographer = choreographer;
        this.handler = handler;
        this.lock = new Object();
        this.toRunTrampolined = new ArrayDeque<>();
        this.toRunOnFrame = new ArrayList();
        this.spareToRunOnFrame = new ArrayList();
        this.dispatchCallback = new d();
        this.frameClock = new S(choreographer, this);
    }

    private final Runnable g1() {
        Runnable runnableY;
        synchronized (this.lock) {
            runnableY = this.toRunTrampolined.y();
        }
        return runnableY;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i1(long frameTimeNanos) {
        synchronized (this.lock) {
            if (this.scheduledFrameDispatch) {
                this.scheduledFrameDispatch = false;
                List<Choreographer.FrameCallback> list = this.toRunOnFrame;
                this.toRunOnFrame = this.spareToRunOnFrame;
                this.spareToRunOnFrame = list;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).doFrame(frameTimeNanos);
                }
                list.clear();
            }
        }
    }

    @Override // qv.AbstractC16618K
    public void L0(CoroutineContext context, Runnable block) {
        synchronized (this.lock) {
            try {
                this.toRunTrampolined.addLast(block);
                if (!this.scheduledTrampolineDispatch) {
                    this.scheduledTrampolineDispatch = true;
                    this.handler.post(this.dispatchCallback);
                    if (!this.scheduledFrameDispatch) {
                        this.scheduledFrameDispatch = true;
                        this.choreographer.postFrameCallback(this.dispatchCallback);
                    }
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e1, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    /* renamed from: f1, reason: from getter */
    public final InterfaceC5698b0 getFrameClock() {
        return this.frameClock;
    }

    public final void m1(Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            try {
                this.toRunOnFrame.add(callback);
                if (!this.scheduledFrameDispatch) {
                    this.scheduledFrameDispatch = true;
                    this.choreographer.postFrameCallback(this.dispatchCallback);
                }
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o1(Choreographer.FrameCallback callback) {
        synchronized (this.lock) {
            this.toRunOnFrame.remove(callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j1() {
        boolean z10;
        do {
            Runnable runnableG1 = g1();
            while (runnableG1 != null) {
                runnableG1.run();
                runnableG1 = g1();
            }
            synchronized (this.lock) {
                if (this.toRunTrampolined.isEmpty()) {
                    z10 = false;
                    this.scheduledTrampolineDispatch = false;
                } else {
                    z10 = true;
                }
            }
        } while (z10);
    }
}
