package mv;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import rv.C16946A;
import rv.C16957L;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u0019\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\f0\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lmv/f1;", "T", "Lrv/A;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "", "l1", "()V", "", "oldValue", "m1", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "k1", "()Z", "j1", "state", "f1", "(Ljava/lang/Object;)V", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "e", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "threadLocalIsSet", "Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class f1<T> extends C16946A<T> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ThreadLocal<Pair<CoroutineContext, Object>> threadStateToRecover;
    private volatile boolean threadLocalIsSet;

    public final void m1(CoroutineContext context, Object oldValue) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(TuplesKt.a(context, oldValue));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f1(CoroutineContext coroutineContext, Continuation<? super T> continuation) {
        g1 g1Var = g1.f151738a;
        super(coroutineContext.g(g1Var) == null ? coroutineContext.n0(g1Var) : coroutineContext, continuation);
        this.threadStateToRecover = new ThreadLocal<>();
        if (continuation.getContext().g(ContinuationInterceptor.INSTANCE) instanceof AbstractC15779K) {
            return;
        }
        Object objI = C16957L.i(coroutineContext, null);
        C16957L.f(coroutineContext, objI);
        m1(coroutineContext, objI);
    }

    private final void l1() {
        if (this.threadLocalIsSet) {
            Pair<CoroutineContext, Object> pair = this.threadStateToRecover.get();
            if (pair != null) {
                C16957L.f(pair.a(), pair.b());
            }
            this.threadStateToRecover.remove();
        }
    }

    public final boolean k1() {
        boolean z10 = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z10;
    }

    @Override // rv.C16946A, mv.AbstractC15789a
    protected void f1(Object state) {
        l1();
        Object objA = C15772D.a(state, this.uCont);
        Continuation<T> continuation = this.uCont;
        CoroutineContext f143270a = continuation.getContext();
        f1<?> f1VarM = null;
        Object objI = C16957L.i(f143270a, null);
        if (objI != C16957L.f159623a) {
            f1VarM = C15777I.m(continuation, f143270a, objI);
        }
        try {
            this.uCont.resumeWith(objA);
            Unit unit = Unit.f143329a;
            if (f1VarM != null && !f1VarM.k1()) {
                return;
            }
            C16957L.f(f143270a, objI);
        } catch (Throwable th2) {
            if (f1VarM == null || f1VarM.k1()) {
                C16957L.f(f143270a, objI);
            }
            throw th2;
        }
    }

    @Override // rv.C16946A
    public void j1() {
        l1();
    }
}
