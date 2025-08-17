package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.InterfaceC5698b0;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16658p;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/platform/S;", "Landroidx/compose/runtime/b0;", "Landroid/view/Choreographer;", "choreographer", "Landroidx/compose/ui/platform/P;", "dispatcher", "<init>", "(Landroid/view/Choreographer;Landroidx/compose/ui/platform/P;)V", "R", "Lkotlin/Function1;", "", "onFrame", "J", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroid/view/Choreographer;", "e", "()Landroid/view/Choreographer;", "b", "Landroidx/compose/ui/platform/P;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class S implements InterfaceC5698b0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Choreographer choreographer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final P dispatcher;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ P f51926f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f51927g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(P p10, Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f51926f = p10;
            this.f51927g = frameCallback;
        }

        public final void a(Throwable th2) {
            this.f51926f.o1(this.f51927g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f51929g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f51929g = frameCallback;
        }

        public final void a(Throwable th2) {
            S.this.getChoreographer().removeFrameCallback(this.f51929g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "frameTimeNanos", "", "doFrame"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Choreographer.FrameCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<R> f51930a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f51931b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Long, R> f51932c;

        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC16654n<? super R> interfaceC16654n, S s10, Function1<? super Long, ? extends R> function1) {
            this.f51930a = interfaceC16654n;
            this.f51931b = s10;
            this.f51932c = function1;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objB;
            Continuation continuation = this.f51930a;
            Function1<Long, R> function1 = this.f51932c;
            try {
                Result.Companion companion = Result.INSTANCE;
                objB = Result.b(function1.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            continuation.resumeWith(objB);
        }
    }

    @Override // androidx.compose.runtime.InterfaceC5698b0
    public <R> Object J(Function1<? super Long, ? extends R> function1, Continuation<? super R> continuation) {
        P p10 = this.dispatcher;
        if (p10 == null) {
            CoroutineContext.Element elementG = continuation.getContext().g(ContinuationInterceptor.INSTANCE);
            p10 = elementG instanceof P ? (P) elementG : null;
        }
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        c cVar = new c(c16658p, this, function1);
        if (p10 == null || !Intrinsics.e(p10.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(cVar);
            c16658p.F(new b(cVar));
        } else {
            p10.m1(cVar);
            c16658p.F(new a(p10, cVar));
        }
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }

    /* renamed from: e, reason: from getter */
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    public S(Choreographer choreographer, P p10) {
        this.choreographer = choreographer;
        this.dispatcher = p10;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext F0(CoroutineContext.Key<?> key) {
        return InterfaceC5698b0.a.c(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R b(R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) InterfaceC5698b0.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E g(CoroutineContext.Key<E> key) {
        return (E) InterfaceC5698b0.a.b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext m0(CoroutineContext coroutineContext) {
        return InterfaceC5698b0.a.d(this, coroutineContext);
    }
}
