package sv;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16646j;
import qv.InterfaceC16622O;
import sv.k;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a+\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"E", "Lsv/w;", "element", "Lsv/k;", "", "a", "(Lsv/w;Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/channels/ChannelsKt")
@SourceDebugExtension
/* loaded from: classes13.dex */
final /* synthetic */ class o {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "Lsv/k;", "", "<anonymous>", "(Lqv/O;)Lsv/k;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", l = {39}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super k<? extends Unit>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f161310a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f161311b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w<E> f161312c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ E f161313d;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super k<? extends Unit>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super k<Unit>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(w<? super E> wVar, E e10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f161312c = wVar;
            this.f161313d = e10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f161312c, this.f161313d, continuation);
            aVar.f161311b = obj;
            return aVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super k<Unit>> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objA;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f161310a;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    w<E> wVar = this.f161312c;
                    E e10 = this.f161313d;
                    Result.Companion companion = Result.INSTANCE;
                    this.f161310a = 1;
                    if (wVar.r(e10, this) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f142422a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            if (Result.h(objB)) {
                objA = k.INSTANCE.c(Unit.f142422a);
            } else {
                objA = k.INSTANCE.a(Result.e(objB));
            }
            return k.b(objA);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> Object a(w<? super E> wVar, E e10) {
        Object objK = wVar.k(e10);
        if (!(objK instanceof k.c)) {
            return k.INSTANCE.c(Unit.f142422a);
        }
        return ((k) C16646j.b(null, new a(wVar, e10, null), 1, null)).getHolder();
    }
}
