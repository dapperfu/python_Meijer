package vv;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.Y0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"*\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"2\u0010\u0017\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00150\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013\"&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013¨\u0006\u001b"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "g", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "countOrElement", "i", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "", "f", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lvv/E;", "a", "Lvv/E;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "b", "Lkotlin/jvm/functions/Function2;", "countAll", "Lqv/Y0;", "c", "findOne", "Lvv/S;", "d", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vv.L, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C17638L {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final C17631E f165089a = new C17631E("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final Function2<Object, CoroutineContext.Element, Object> f165090b = new Function2() { // from class: vv.I
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C17638L.d(obj, (CoroutineContext.Element) obj2);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final Function2<Y0<?>, CoroutineContext.Element, Y0<?>> f165091c = new Function2() { // from class: vv.J
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C17638L.e((Y0) obj, (CoroutineContext.Element) obj2);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final Function2<C17644S, CoroutineContext.Element, C17644S> f165092d = new Function2() { // from class: vv.K
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C17638L.h((C17644S) obj, (CoroutineContext.Element) obj2);
        }
    };

    public static final Object g(CoroutineContext coroutineContext) {
        Object objB = coroutineContext.b(0, f165090b);
        Intrinsics.g(objB);
        return objB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof Y0)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Y0<?> e(Y0<?> y02, CoroutineContext.Element element) {
        if (y02 != null) {
            return y02;
        }
        if (element instanceof Y0) {
            return (Y0) element;
        }
        return null;
    }

    public static final void f(CoroutineContext coroutineContext, Object obj) {
        if (obj == f165089a) {
            return;
        }
        if (obj instanceof C17644S) {
            ((C17644S) obj).b(coroutineContext);
            return;
        }
        Object objB = coroutineContext.b(null, f165091c);
        Intrinsics.h(objB, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((Y0) objB).T(coroutineContext, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17644S h(C17644S c17644s, CoroutineContext.Element element) {
        if (element instanceof Y0) {
            Y0<?> y02 = (Y0) element;
            c17644s.a(y02, y02.J0(c17644s.context));
        }
        return c17644s;
    }

    public static final Object i(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = g(coroutineContext);
        }
        if (obj == 0) {
            return f165089a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.b(new C17644S(coroutineContext, ((Number) obj).intValue()), f165092d);
        }
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((Y0) obj).J0(coroutineContext);
    }
}
