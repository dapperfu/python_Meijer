package rv;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mv.Y0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"*\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"2\u0010\u0017\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00150\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013\"&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013¨\u0006\u001b"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "context", "", "g", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "countOrElement", "i", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "", "f", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lrv/E;", "a", "Lrv/E;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lkotlin/coroutines/CoroutineContext$Element;", "b", "Lkotlin/jvm/functions/Function2;", "countAll", "Lmv/Y0;", "c", "findOne", "Lrv/S;", "d", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: rv.L, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C16957L {

    /* renamed from: a, reason: collision with root package name */
    @JvmField
    public static final C16950E f159623a = new C16950E("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    private static final Function2<Object, CoroutineContext.Element, Object> f159624b = new Function2() { // from class: rv.I
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C16957L.d(obj, (CoroutineContext.Element) obj2);
        }
    };

    /* renamed from: c, reason: collision with root package name */
    private static final Function2<Y0<?>, CoroutineContext.Element, Y0<?>> f159625c = new Function2() { // from class: rv.J
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C16957L.e((Y0) obj, (CoroutineContext.Element) obj2);
        }
    };

    /* renamed from: d, reason: collision with root package name */
    private static final Function2<C16963S, CoroutineContext.Element, C16963S> f159626d = new Function2() { // from class: rv.K
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return C16957L.h((C16963S) obj, (CoroutineContext.Element) obj2);
        }
    };

    public static final Object g(CoroutineContext coroutineContext) {
        Object objB = coroutineContext.b(0, f159624b);
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
        if (obj == f159623a) {
            return;
        }
        if (obj instanceof C16963S) {
            ((C16963S) obj).b(coroutineContext);
            return;
        }
        Object objB = coroutineContext.b(null, f159625c);
        Intrinsics.h(objB, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((Y0) objB).Y(coroutineContext, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16963S h(C16963S c16963s, CoroutineContext.Element element) {
        if (element instanceof Y0) {
            Y0<?> y02 = (Y0) element;
            c16963s.a(y02, y02.E0(c16963s.context));
        }
        return c16963s;
    }

    public static final Object i(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = g(coroutineContext);
        }
        if (obj == 0) {
            return f159623a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.b(new C16963S(coroutineContext, ((Number) obj).intValue()), f159626d);
        }
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((Y0) obj).E0(coroutineContext);
    }
}
