package L7;

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
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B5\u0012$\b\u0002\u0010\u0006\u001a\u001e\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\f\u001a\u00020\u00052\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003¢\u0006\u0004\b\f\u0010\rR0\u0010\u0006\u001a\u001e\u0012\u001a\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"LL7/a;", "", "Lpv/A;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "flow", "Lmv/O;", "scope", "<init>", "(Lpv/A;Lmv/O;)V", "body", "b", "(Lkotlin/jvm/functions/Function1;)V", "a", "Lpv/A;", "Lmv/O;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<Function1<Continuation<? super Unit>, Object>> flow;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O scope;

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\u001c\u0010\u0002\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, d2 = {"<anonymous>", "", "enrichmentTask", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.dynatrace.agent.events.EventFlowGovernor$1", f = "EventFlowGovernor.kt", l = {29}, m = "invokeSuspend")
    /* renamed from: L7.a$a, reason: collision with other inner class name */
    static final class C0328a extends SuspendLambda implements Function2<Function1<? super Continuation<? super Unit>, ? extends Object>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f18043a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f18044b;

        C0328a(Continuation<? super C0328a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0328a c0328a = new C0328a(continuation);
            c0328a.f18044b = obj;
            return c0328a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) {
            return ((C0328a) create(function1, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f18043a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                Function1 function1 = (Function1) this.f18044b;
                this.f18043a = 1;
                if (function1.invoke(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.dynatrace.agent.events.EventFlowGovernor$enqueue$1", f = "EventFlowGovernor.kt", l = {39}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f18045a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Continuation<? super Unit>, Object> f18047c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f18047c = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(this.f18047c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f18045a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = a.this.flow;
                Function1<Continuation<? super Unit>, Object> function1 = this.f18047c;
                this.f18045a = 1;
                if (interfaceC16548A.emit(function1, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public a(InterfaceC16548A<Function1<Continuation<? super Unit>, Object>> flow, InterfaceC15783O scope) {
        Intrinsics.j(flow, "flow");
        Intrinsics.j(scope, "scope");
        this.flow = flow;
        this.scope = scope;
        C16563h.J(C16563h.O(flow, new C0328a(null)), scope);
    }

    public final void b(Function1<? super Continuation<? super Unit>, ? extends Object> body) {
        Intrinsics.j(body, "body");
        C15809k.d(this.scope, null, null, new b(body, null), 3, null);
    }

    public /* synthetic */ a(InterfaceC16548A interfaceC16548A, InterfaceC15783O interfaceC15783O, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C16555H.b(0, a.e.API_PRIORITY_OTHER, null, 4, null) : interfaceC16548A, interfaceC15783O);
    }
}
