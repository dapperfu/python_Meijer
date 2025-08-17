package kotlin;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\"D\u0010\t\u001a,\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/Function3;", "Ltv/g;", "", "Lkotlin/coroutines/Continuation;", "", "a", "Lkotlin/jvm/functions/Function3;", "getEmitFun$annotations", "()V", "emitFun", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: uv.u, reason: from Kotlin metadata */
/* loaded from: classes13.dex */
public final class Function3 {

    /* renamed from: a, reason: collision with root package name */
    private static final kotlin.jvm.functions.Function3<InterfaceC17153g<Object>, Object, Continuation<? super Unit>, Object> f163611a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uv.u$a */
    /* synthetic */ class a extends FunctionReferenceImpl implements kotlin.jvm.functions.Function3<InterfaceC17153g<? super Object>, Object, Continuation<? super Unit>, Object>, SuspendFunction {

        /* renamed from: b, reason: collision with root package name */
        public static final a f163612b = new a();

        a() {
            super(3, InterfaceC17153g.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<Object> interfaceC17153g, Object obj, Continuation<? super Unit> continuation) {
            return interfaceC17153g.emit(obj, continuation);
        }
    }

    static {
        a aVar = a.f163612b;
        Intrinsics.h(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f163611a = (kotlin.jvm.functions.Function3) TypeIntrinsics.f(aVar, 3);
    }
}
