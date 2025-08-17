package tv;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\t\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a[\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0004\b\u000b\u0010\f\u001a=\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001aw\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e2:\u0010\n\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\"$\u0010\u0017\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"*\u0010\u001a\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"T", "Ltv/f;", "e", "(Ltv/f;)Ltv/f;", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "old", "new", "", "areEquivalent", "f", "(Ltv/f;Lkotlin/jvm/functions/Function2;)Ltv/f;", "K", "Lkotlin/Function1;", "keySelector", "g", "(Ltv/f;Lkotlin/jvm/functions/Function1;)Ltv/f;", "", "h", "(Ltv/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Ltv/f;", "a", "Lkotlin/jvm/functions/Function1;", "defaultKeySelector", "b", "Lkotlin/jvm/functions/Function2;", "defaultAreEquivalent", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes13.dex */
final /* synthetic */ class r {

    /* renamed from: a, reason: collision with root package name */
    private static final Function1<Object, Object> f162247a = new Function1() { // from class: tv.p
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return r.d(obj);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    private static final Function2<Object, Object, Boolean> f162248b = new Function2() { // from class: tv.q
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(r.c(obj, obj2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC17152f<T> e(InterfaceC17152f<? extends T> interfaceC17152f) {
        return interfaceC17152f instanceof P ? interfaceC17152f : h(interfaceC17152f, f162247a, f162248b);
    }

    public static final <T> InterfaceC17152f<T> f(InterfaceC17152f<? extends T> interfaceC17152f, Function2<? super T, ? super T, Boolean> function2) {
        Function1<Object, Object> function1 = f162247a;
        Intrinsics.h(function2, "null cannot be cast to non-null type kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Boolean>");
        return h(interfaceC17152f, function1, (Function2) TypeIntrinsics.f(function2, 2));
    }

    public static final <T, K> InterfaceC17152f<T> g(InterfaceC17152f<? extends T> interfaceC17152f, Function1<? super T, ? extends K> function1) {
        return h(interfaceC17152f, function1, f162248b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> InterfaceC17152f<T> h(InterfaceC17152f<? extends T> interfaceC17152f, Function1<? super T, ? extends Object> function1, Function2<Object, Object, Boolean> function2) {
        if (interfaceC17152f instanceof C17151e) {
            C17151e c17151e = (C17151e) interfaceC17152f;
            if (c17151e.keySelector == function1 && c17151e.areEquivalent == function2) {
                return interfaceC17152f;
            }
        }
        return new C17151e(interfaceC17152f, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Object obj, Object obj2) {
        return Intrinsics.e(obj, obj2);
    }
}
