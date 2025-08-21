package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@SinceKotlin
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001:\u0002\u0013\u0014J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "", "Lkotlin/coroutines/CoroutineContext$Element;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "g", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "R", "initial", "Lkotlin/Function2;", "operation", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "context", "n0", "(Lkotlin/coroutines/CoroutineContext;)Lkotlin/coroutines/CoroutineContext;", "x0", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext;", "Key", "Element", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface CoroutineContext {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static CoroutineContext b(CoroutineContext coroutineContext, CoroutineContext context) {
            Intrinsics.j(context, "context");
            return context == EmptyCoroutineContext.f143553a ? coroutineContext : (CoroutineContext) context.b(coroutineContext, new Function2() { // from class: hv.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CoroutineContext.DefaultImpls.c((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static CoroutineContext c(CoroutineContext acc, Element element) {
            Intrinsics.j(acc, "acc");
            Intrinsics.j(element, "element");
            CoroutineContext coroutineContextX0 = acc.x0(element.getKey());
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f143553a;
            if (coroutineContextX0 == emptyCoroutineContext) {
                return element;
            }
            ContinuationInterceptor.Companion key = ContinuationInterceptor.INSTANCE;
            ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContextX0.g(key);
            if (continuationInterceptor == null) {
                return new CombinedContext(coroutineContextX0, element);
            }
            CoroutineContext coroutineContextX02 = coroutineContextX0.x0(key);
            return coroutineContextX02 == emptyCoroutineContext ? new CombinedContext(element, continuationInterceptor) : new CombinedContext(new CombinedContext(coroutineContextX02, element), continuationInterceptor);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "E", "Lkotlin/coroutines/CoroutineContext$Key;", "key", "g", "(Lkotlin/coroutines/CoroutineContext$Key;)Lkotlin/coroutines/CoroutineContext$Element;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Element extends CoroutineContext {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            public static <R> R a(Element element, R r10, Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.j(operation, "operation");
                return operation.invoke(r10, element);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends Element> E b(Element element, Key<E> key) {
                Intrinsics.j(key, "key");
                if (!Intrinsics.e(element.getKey(), key)) {
                    return null;
                }
                Intrinsics.h(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return element;
            }

            public static CoroutineContext c(Element element, Key<?> key) {
                Intrinsics.j(key, "key");
                return Intrinsics.e(element.getKey(), key) ? EmptyCoroutineContext.f143553a : element;
            }

            public static CoroutineContext d(Element element, CoroutineContext context) {
                Intrinsics.j(context, "context");
                return DefaultImpls.b(element, context);
            }
        }

        @Override // kotlin.coroutines.CoroutineContext
        <E extends Element> E g(Key<E> key);

        Key<?> getKey();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/CoroutineContext$Key;", "E", "Lkotlin/coroutines/CoroutineContext$Element;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Key<E extends Element> {
    }

    <R> R b(R initial, Function2<? super R, ? super Element, ? extends R> operation);

    <E extends Element> E g(Key<E> key);

    CoroutineContext n0(CoroutineContext context);

    CoroutineContext x0(Key<?> key);
}
