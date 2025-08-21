package mv;

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
import mv.AbstractC15779K;
import rv.C16971h;
import rv.C16972i;
import rv.C16974k;
import rv.C16975l;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H&¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0017¢\u0006\u0004\b\u0018\u0010\u0017J'\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\u0004\b\u0000\u0010\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u00152\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0016¢\u0006\u0004\b \u0010!¨\u0006$"}, d2 = {"Lmv/K;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "<init>", "()V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "P0", "(Lkotlin/coroutines/CoroutineContext;)Z", "", "parallelism", "", "name", "S0", "(ILjava/lang/String;)Lmv/K;", "Q0", "(I)Lmv/K;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "J0", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "K0", "T", "Lkotlin/coroutines/Continuation;", "continuation", "j", "(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;", "h", "(Lkotlin/coroutines/Continuation;)V", "toString", "()Ljava/lang/String;", "b", "a", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.K, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC15779K extends AbstractCoroutineContextElement implements ContinuationInterceptor {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmv/K$a;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lmv/K;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @ExperimentalStdlibApi
    /* renamed from: mv.K$a, reason: from kotlin metadata */
    public static final class Companion extends AbstractCoroutineContextKey<ContinuationInterceptor, AbstractC15779K> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(ContinuationInterceptor.INSTANCE, new Function1() { // from class: mv.J
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC15779K.Companion.d((CoroutineContext.Element) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AbstractC15779K d(CoroutineContext.Element element) {
            if (element instanceof AbstractC15779K) {
                return (AbstractC15779K) element;
            }
            return null;
        }
    }

    public abstract void J0(CoroutineContext context, Runnable block);

    public boolean P0(CoroutineContext context) {
        return true;
    }

    @Deprecated
    public /* synthetic */ AbstractC15779K Q0(int parallelism) {
        return S0(parallelism, null);
    }

    public AbstractC15779K() {
        super(ContinuationInterceptor.INSTANCE);
    }

    public static /* synthetic */ AbstractC15779K T0(AbstractC15779K abstractC15779K, int i10, String str, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: limitedParallelism");
        }
        if ((i11 & 2) != 0) {
            str = null;
        }
        return abstractC15779K.S0(i10, str);
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final void h(Continuation<?> continuation) {
        Intrinsics.h(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C16971h) continuation).q();
    }

    @Override // kotlin.coroutines.ContinuationInterceptor
    public final <T> Continuation<T> j(Continuation<? super T> continuation) {
        return new C16971h(this, continuation);
    }

    public String toString() {
        return C15787T.a(this) + '@' + C15787T.b(this);
    }

    public void K0(CoroutineContext context, Runnable block) {
        C16972i.c(this, context, block);
    }

    public AbstractC15779K S0(int parallelism, String name) {
        C16975l.a(parallelism);
        return new C16974k(this, parallelism, name);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E g(CoroutineContext.Key<E> key) {
        return (E) ContinuationInterceptor.DefaultImpls.a(this, key);
    }

    @Override // kotlin.coroutines.AbstractCoroutineContextElement, kotlin.coroutines.CoroutineContext
    public CoroutineContext x0(CoroutineContext.Key<?> key) {
        return ContinuationInterceptor.DefaultImpls.b(this, key);
    }
}
