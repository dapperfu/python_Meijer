package qv;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqv/Y0;", "S", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext;", "context", "J0", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/Object;", "oldState", "", "T", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface Y0<S> extends CoroutineContext.Element {
    S J0(CoroutineContext context);

    void T(CoroutineContext context, S oldState);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static <S, R> R a(Y0<S> y02, R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.DefaultImpls.a(y02, r10, function2);
        }

        public static <S> CoroutineContext b(Y0<S> y02, CoroutineContext coroutineContext) {
            return CoroutineContext.Element.DefaultImpls.d(y02, coroutineContext);
        }
    }
}
