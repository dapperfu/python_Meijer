package kotlin;

import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import wv.C17866b;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002)\b\u0001\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001¢\u0006\u0002\b\u0005H\u0080@¢\u0006\u0004\b\u0007\u0010\b\u001aR\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\u000025\b\u0001\u0010\u0006\u001a/\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\t¢\u0006\u0002\b\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"R", "Lkotlin/Function2;", "Lqv/O;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function3;", "Ltv/g;", "", "Ltv/f;", "b", "(Lkotlin/jvm/functions/Function3;)Ltv/f;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: uv.m, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17345m {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"uv/m$a", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: uv.m$a */
    public static final class a<R> implements InterfaceC17152f<R> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function3 f163595a;

        public a(Function3 function3) {
            this.f163595a = function3;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super R> interfaceC17153g, Continuation<? super Unit> continuation) {
            Object objA = C17345m.a(new b(this.f163595a, interfaceC17153g, null), continuation);
            return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: uv.m$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f163596a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f163597b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC16622O, InterfaceC17153g<? super R>, Continuation<? super Unit>, Object> f163598c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC17153g<R> f163599d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function3<? super InterfaceC16622O, ? super InterfaceC17153g<? super R>, ? super Continuation<? super Unit>, ? extends Object> function3, InterfaceC17153g<? super R> interfaceC17153g, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f163598c = function3;
            this.f163599d = interfaceC17153g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f163598c, this.f163599d, continuation);
            bVar.f163597b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f163596a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f163597b;
                Function3<InterfaceC16622O, InterfaceC17153g<? super R>, Continuation<? super Unit>, Object> function3 = this.f163598c;
                Object obj2 = this.f163599d;
                this.f163596a = 1;
                if (function3.invoke(interfaceC16622O, obj2, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public static final <R> Object a(@BuilderInference Function2<? super InterfaceC16622O, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        C17344l c17344l = new C17344l(continuation.getContext(), continuation);
        Object objD = C17866b.d(c17344l, c17344l, function2);
        if (objD == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objD;
    }

    public static final <R> InterfaceC17152f<R> b(@BuilderInference Function3<? super InterfaceC16622O, ? super InterfaceC17153g<? super R>, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new a(function3);
    }
}
