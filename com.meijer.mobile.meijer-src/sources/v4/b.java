package v4;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.Z;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0002%#B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00028\u00000\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\fJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\fJ\u001b\u0010!\u001a\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010.R\u0014\u00102\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00101R\u0016\u00105\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00104R$\u0010:\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b6\u0010\u001c\"\u0004\b8\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010?R\u0011\u0010C\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lv4/b;", "", "", "timeoutAmount", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "Lv4/b$b;", "watch", "<init>", "(JLjava/util/concurrent/TimeUnit;Lv4/b$b;)V", "", "e", "()V", "LB4/d;", "delegateOpenHelper", "l", "(LB4/d;)V", "Lmv/O;", "coroutineScope", "k", "(Lmv/O;)V", "V", "Lkotlin/Function1;", "LB4/c;", "block", "h", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "j", "()LB4/c;", "g", "f", "Lkotlin/Function0;", "onAutoClose", "n", "(Lkotlin/jvm/functions/Function0;)V", "a", "Lv4/b$b;", "b", "LB4/d;", "c", "Lmv/O;", "d", "Lkotlin/jvm/functions/Function0;", "onAutoCloseCallback", "Ljava/lang/Object;", "lock", "J", "autoCloseTimeoutInMs", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "referenceCount", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/util/concurrent/atomic/AtomicLong;", "lastDecrementRefCountTimeStamp", "i", "LB4/c;", "setDelegateDatabase$room_runtime_release", "(LB4/c;)V", "delegateDatabase", "", "Z", "manuallyClosed", "Lmv/C0;", "Lmv/C0;", "autoCloseJob", "m", "()Z", "isActive", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2614b watch;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private B4.d delegateOpenHelper;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15783O coroutineScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onAutoCloseCallback;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long autoCloseTimeoutInMs;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger referenceCount;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private AtomicLong lastDecrementRefCountTimeStamp;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private B4.c delegateDatabase;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean manuallyClosed;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private C0 autoCloseJob;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lv4/b$b;", "", "", "a", "()J", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: v4.b$b, reason: collision with other inner class name */
    public interface InterfaceC2614b {
        long a();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.room.support.AutoCloser$decrementCountAndScheduleClose$2", f = "AutoCloser.android.kt", l = {167}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f165544a;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f165544a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                long j10 = b.this.autoCloseTimeoutInMs;
                this.f165544a = 1;
                if (Z.b(j10, this) == objF) {
                    return objF;
                }
            }
            b.this.e();
            return Unit.f143329a;
        }
    }

    public b(long j10, TimeUnit timeUnit, InterfaceC2614b watch) {
        Intrinsics.j(timeUnit, "timeUnit");
        Intrinsics.j(watch, "watch");
        this.watch = watch;
        this.lock = new Object();
        this.autoCloseTimeoutInMs = timeUnit.toMillis(j10);
        this.referenceCount = new AtomicInteger(0);
        this.lastDecrementRefCountTimeStamp = new AtomicLong(watch.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        synchronized (this.lock) {
            try {
                if (this.watch.a() - this.lastDecrementRefCountTimeStamp.get() < this.autoCloseTimeoutInMs) {
                    return;
                }
                if (this.referenceCount.get() != 0) {
                    return;
                }
                Function0<Unit> function0 = this.onAutoCloseCallback;
                if (function0 == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should  have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                function0.invoke();
                B4.c cVar = this.delegateDatabase;
                if (cVar != null && cVar.isOpen()) {
                    cVar.close();
                }
                this.delegateDatabase = null;
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f() {
        synchronized (this.lock) {
            try {
                this.manuallyClosed = true;
                C0 c02 = this.autoCloseJob;
                if (c02 != null) {
                    C0.a.a(c02, null, 1, null);
                }
                this.autoCloseJob = null;
                B4.c cVar = this.delegateDatabase;
                if (cVar != null) {
                    cVar.close();
                }
                this.delegateDatabase = null;
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        InterfaceC15783O interfaceC15783O;
        int iDecrementAndGet = this.referenceCount.decrementAndGet();
        if (iDecrementAndGet < 0) {
            throw new IllegalStateException("Unbalanced reference count.");
        }
        this.lastDecrementRefCountTimeStamp.set(this.watch.a());
        if (iDecrementAndGet == 0) {
            InterfaceC15783O interfaceC15783O2 = this.coroutineScope;
            if (interfaceC15783O2 == null) {
                Intrinsics.x("coroutineScope");
                interfaceC15783O = null;
            } else {
                interfaceC15783O = interfaceC15783O2;
            }
            this.autoCloseJob = C15809k.d(interfaceC15783O, null, null, new c(null), 3, null);
        }
    }

    public final <V> V h(Function1<? super B4.c, ? extends V> block) {
        Intrinsics.j(block, "block");
        try {
            return block.invoke(j());
        } finally {
            g();
        }
    }

    /* renamed from: i, reason: from getter */
    public final B4.c getDelegateDatabase() {
        return this.delegateDatabase;
    }

    public final B4.c j() {
        C0 c02 = this.autoCloseJob;
        B4.d dVar = null;
        if (c02 != null) {
            C0.a.a(c02, null, 1, null);
        }
        this.autoCloseJob = null;
        this.referenceCount.incrementAndGet();
        if (this.manuallyClosed) {
            throw new IllegalStateException("Attempting to open already closed database.");
        }
        synchronized (this.lock) {
            B4.c cVar = this.delegateDatabase;
            if (cVar != null && cVar.isOpen()) {
                return cVar;
            }
            B4.d dVar2 = this.delegateOpenHelper;
            if (dVar2 == null) {
                Intrinsics.x("delegateOpenHelper");
            } else {
                dVar = dVar2;
            }
            B4.c cVarC2 = dVar.C2();
            this.delegateDatabase = cVarC2;
            return cVarC2;
        }
    }

    public final void k(InterfaceC15783O coroutineScope) {
        Intrinsics.j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
    }

    public final void l(B4.d delegateOpenHelper) {
        Intrinsics.j(delegateOpenHelper, "delegateOpenHelper");
        if (delegateOpenHelper instanceof g) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.delegateOpenHelper = delegateOpenHelper;
    }

    public final boolean m() {
        return !this.manuallyClosed;
    }

    public final void n(Function0<Unit> onAutoClose) {
        Intrinsics.j(onAutoClose, "onAutoClose");
        this.onAutoCloseCallback = onAutoClose;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long b() {
        return SystemClock.uptimeMillis();
    }

    public /* synthetic */ b(long j10, TimeUnit timeUnit, InterfaceC2614b interfaceC2614b, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, timeUnit, (i10 & 4) != 0 ? new InterfaceC2614b() { // from class: v4.a
            @Override // v4.b.InterfaceC2614b
            public final long a() {
                return b.b();
            }
        } : interfaceC2614b);
    }
}
