package androidx.view;

import androidx.view.AbstractC6023l;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.C16639f0;
import qv.C16648k;
import qv.F0;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/lifecycle/n;", "Landroidx/lifecycle/m;", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/l;", "lifecycle", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "(Landroidx/lifecycle/l;Lkotlin/coroutines/CoroutineContext;)V", "", "b", "()V", "Landroidx/lifecycle/s;", "source", "Landroidx/lifecycle/l$a;", "event", "onStateChanged", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "a", "Landroidx/lifecycle/l;", "()Landroidx/lifecycle/l;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6025n extends AbstractC6024m implements InterfaceC6027p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC6023l lifecycle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineContext coroutineContext;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.n$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f55284a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f55285b;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = C6025n.this.new a(continuation);
            aVar.f55285b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f55284a == 0) {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f55285b;
                if (C6025n.this.getLifecycle().getState().compareTo(AbstractC6023l.b.f55276b) < 0) {
                    F0.e(interfaceC16622O.getCoroutineContext(), null, 1, null);
                } else {
                    C6025n.this.getLifecycle().a(C6025n.this);
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C6025n(AbstractC6023l lifecycle, CoroutineContext coroutineContext) {
        Intrinsics.j(lifecycle, "lifecycle");
        Intrinsics.j(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle().getState() == AbstractC6023l.b.f55275a) {
            F0.e(getCoroutineContext(), null, 1, null);
        }
    }

    /* renamed from: a, reason: from getter */
    public AbstractC6023l getLifecycle() {
        return this.lifecycle;
    }

    @Override // qv.InterfaceC16622O
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.view.InterfaceC6027p
    public void onStateChanged(InterfaceC6030s source, AbstractC6023l.a event) {
        Intrinsics.j(source, "source");
        Intrinsics.j(event, "event");
        if (getLifecycle().getState().compareTo(AbstractC6023l.b.f55275a) <= 0) {
            getLifecycle().d(this);
            F0.e(getCoroutineContext(), null, 1, null);
        }
    }

    public final void b() {
        C16648k.d(this, C16639f0.c().Y0(), null, new a(null), 2, null);
    }
}
