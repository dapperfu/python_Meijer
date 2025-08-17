package J7;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;
import qv.InterfaceC16622O;
import qv.Z;
import w7.InterfaceC17801a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BK\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010#R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"LJ7/c;", "", "Lw7/a;", "timeProvider", "", "maxEventsPerWindow", "windowSizeSeconds", "summaryInterval", "Lqv/O;", "coroutineScope", "Lkotlin/Function1;", "", "summaryReceiver", "<init>", "(Lw7/a;IIILqv/O;Lkotlin/jvm/functions/Function1;)V", "Ljava/util/LinkedList;", "", "now", "Lkotlin/time/Duration;", "size", "e", "(Ljava/util/LinkedList;JJ)V", "", "a", "()Z", "Lw7/a;", "getTimeProvider", "()Lw7/a;", "b", "I", "c", "d", "Lqv/O;", "f", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "g", "Ljava/util/LinkedList;", "eventWindow", "Ljava/util/concurrent/atomic/AtomicInteger;", "h", "Ljava/util/concurrent/atomic/AtomicInteger;", "dropCounter", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17801a timeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int maxEventsPerWindow;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int windowSizeSeconds;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int summaryInterval;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function1<Integer, Unit> summaryReceiver;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final LinkedList<Long> eventWindow;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger dropCounter;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.events.EventThrottler$acceptEvent$1$1", f = "EventThrottler.kt", l = {71}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14719a;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f14719a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Duration.Companion companion = Duration.INSTANCE;
                long jS = DurationKt.s(c.this.summaryInterval, DurationUnit.f147509e);
                this.f14719a = 1;
                if (Z.c(jS, this) == objF) {
                    return objF;
                }
            }
            c.this.d().invoke(Boxing.d(c.this.dropCounter.getAndSet(0)));
            return Unit.f142422a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public c(InterfaceC17801a timeProvider, int i10, Function1<? super Integer, Unit> summaryReceiver) {
        this(timeProvider, i10, 0, 0, null, summaryReceiver, 28, null);
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(summaryReceiver, "summaryReceiver");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public c(InterfaceC17801a timeProvider, int i10, int i11, int i12, InterfaceC16622O coroutineScope, Function1<? super Integer, Unit> summaryReceiver) {
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(coroutineScope, "coroutineScope");
        Intrinsics.j(summaryReceiver, "summaryReceiver");
        this.timeProvider = timeProvider;
        this.maxEventsPerWindow = i10;
        this.windowSizeSeconds = i11;
        this.summaryInterval = i12;
        this.coroutineScope = coroutineScope;
        this.summaryReceiver = summaryReceiver;
        this.eventWindow = new LinkedList<>();
        this.dropCounter = new AtomicInteger(0);
    }

    public final boolean a() throws Throwable {
        long jA;
        LinkedList<Long> linkedList;
        boolean z10;
        synchronized (this.eventWindow) {
            try {
                jA = this.timeProvider.a();
                linkedList = this.eventWindow;
                Duration.Companion companion = Duration.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                e(linkedList, jA, DurationKt.s(this.windowSizeSeconds, DurationUnit.f147509e));
                if (this.eventWindow.size() < this.maxEventsPerWindow) {
                    this.eventWindow.add(Long.valueOf(jA));
                    z10 = true;
                } else {
                    if (this.dropCounter.getAndIncrement() == 0) {
                        C16648k.d(this.coroutineScope, null, null, new a(null), 3, null);
                    }
                    z10 = false;
                }
                return z10;
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        }
    }

    public final Function1<Integer, Unit> d() {
        return this.summaryReceiver;
    }

    private final void e(LinkedList<Long> linkedList, long j10, long j11) {
        long jF = j10 - Duration.F(j11);
        while (!linkedList.isEmpty()) {
            Long lPeek = linkedList.peek();
            Intrinsics.g(lPeek);
            if (lPeek.longValue() <= jF) {
                linkedList.poll();
            } else {
                return;
            }
        }
    }

    public /* synthetic */ c(InterfaceC17801a interfaceC17801a, int i10, int i11, int i12, InterfaceC16622O interfaceC16622O, Function1 function1, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC17801a, i10, (i13 & 4) != 0 ? 60 : i11, (i13 & 8) != 0 ? 60 : i12, (i13 & 16) != 0 ? C16623P.a(C16639f0.b()) : interfaceC16622O, function1);
    }
}
