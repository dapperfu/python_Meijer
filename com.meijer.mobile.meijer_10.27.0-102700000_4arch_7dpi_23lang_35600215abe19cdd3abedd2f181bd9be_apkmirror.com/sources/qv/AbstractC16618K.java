package qv;

import kotlin.Deprecated;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.AbstractCoroutineContextKey;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qv.AbstractC16618K;
import vv.C17652h;
import vv.C17653i;
import vv.C17655k;
import vv.C17656l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0017¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00152\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!¨\u0006$"}, d2 = {"Lqv/K;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "R0", "(Lkotlin/coroutines/CoroutineContext;)Z", "", "parallelism", "", "name", "U0", "(ILjava/lang/String;)Lqv/K;", "S0", "(I)Lqv/K;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "L0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "N0", "T", "Lkotlin/coroutines/Continuation;", "continuation", "j", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "h", "(Lkotlin/coroutines/Continuation;)V", "toString", "()Ljava/lang/String;", "b", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.K, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC16618K extends AbstractCoroutineContextElement implements ContinuationInterceptor {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqv/K$a;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lqv/K;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ExperimentalStdlibApi
    /* renamed from: qv.K$a, reason: from kotlin metadata */
    public static final class Companion extends AbstractCoroutineContextKey<ContinuationInterceptor, AbstractC16618K> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(ContinuationInterceptor.INSTANCE, new Function1() { // from class: qv.J
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC16618K.Companion.d((CoroutineContext.Element) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC16618K d(CoroutineContext.Element element) {
            if (element instanceof AbstractC16618K) {
                return (AbstractC16618K) element;
            }
            return null;
        }
    }

    public abstract void L0(CoroutineContext context, Runnable block);

    public boolean R0(CoroutineContext context) {
        return true;
    }

    @Deprecated
    public /* synthetic */ AbstractC16618K S0(int parallelism) {
        return U0(parallelism, null);
    }

    public AbstractC16618K() {
        super(ContinuationInterceptor.INSTANCE);
    }

    public static /* synthetic */ AbstractC16618K V0(AbstractC16618K abstractC16618K, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return abstractC16618K.U0(i10, str);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void h(Continuation<?> continuation) {
        Intrinsics.h(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C17652h) continuation).r();
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final <T> Continuation<T> j(Continuation<? super T> continuation) {
        return new C17652h(this, continuation);
    }

    public String toString() {
        return C16626T.a(this) + '@' + C16626T.b(this);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    public CoroutineContext F0(CoroutineContext.Key<?> key) {
        return ContinuationInterceptor.DefaultImpls.b(this, key);
    }

    public void N0(CoroutineContext context, Runnable block) {
        C17653i.c(this, context, block);
    }

    public AbstractC16618K U0(int parallelism, String name) {
        C17656l.a(parallelism);
        return new C17655k(this, parallelism, name);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E g(CoroutineContext.Key<E> key) {
        return (E) ContinuationInterceptor.DefaultImpls.a(this, key);
    }
}
