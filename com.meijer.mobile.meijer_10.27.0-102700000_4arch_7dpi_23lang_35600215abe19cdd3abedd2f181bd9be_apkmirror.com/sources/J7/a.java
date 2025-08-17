package J7;

import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17146H;
import tv.C17154h;
import tv.InterfaceC17139A;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B5\u0012$\b\u0002\u0010\u0006\u001a\u001e\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\u00052\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\f\u0010\rR0\u0010\u0006\u001a\u001e\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"LJ7/a;", "", "Ltv/A;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "flow", "Lqv/O;", "scope", "<init>", "(Ltv/A;Lqv/O;)V", "body", "b", "(Lkotlin/jvm/functions/Function1;)V", "a", "Ltv/A;", "Lqv/O;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<Function1<Continuation<? super Unit>, Object>> flow;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O scope;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "enrichmentTask", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.events.EventFlowGovernor$1", f = "EventFlowGovernor.kt", l = {29}, m = "invokeSuspend")
    /* renamed from: J7.a$a, reason: collision with other inner class name */
    static final class C0236a extends SuspendLambda implements Function2<Function1<? super Continuation<? super Unit>, ? extends Object>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14706a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14707b;

        C0236a(Continuation<? super C0236a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0236a c0236a = new C0236a(continuation);
            c0236a.f14707b = obj;
            return c0236a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) {
            return ((C0236a) create(function1, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f14706a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Function1 function1 = (Function1) this.f14707b;
                this.f14706a = 1;
                if (function1.invoke(this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.events.EventFlowGovernor$enqueue$1", f = "EventFlowGovernor.kt", l = {39}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f14708a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> f14710c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f14710c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(this.f14710c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f14708a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = a.this.flow;
                Function1<Continuation<? super Unit>, Object> function1 = this.f14710c;
                this.f14708a = 1;
                if (interfaceC17139A.emit(function1, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public a(InterfaceC17139A<Function1<Continuation<? super Unit>, Object>> flow, InterfaceC16622O scope) {
        Intrinsics.j(flow, "flow");
        Intrinsics.j(scope, "scope");
        this.flow = flow;
        this.scope = scope;
        C17154h.J(C17154h.O(flow, new C0236a(null)), scope);
    }

    public final void b(Function1<? super Continuation<? super Unit>, ? extends Object> body) {
        Intrinsics.j(body, "body");
        C16648k.d(this.scope, null, null, new b(body, null), 3, null);
    }

    public /* synthetic */ a(InterfaceC17139A interfaceC17139A, InterfaceC16622O interfaceC16622O, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C17146H.b(0, a.e.API_PRIORITY_OTHER, null, 4, null) : interfaceC17139A, interfaceC16622O);
    }
}
