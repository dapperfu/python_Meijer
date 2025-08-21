package mv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmv/U0;", "Lmv/a;", "", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "", "active", "<init>", "(Lkotlin/coroutines/CoroutineContext;Z)V", "", "exception", "z0", "(Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
class U0 extends AbstractC15789a<Unit> {
    public U0(CoroutineContext coroutineContext, boolean z10) {
        super(coroutineContext, true, z10);
    }

    @Override // mv.H0
    protected boolean z0(Throwable exception) {
        C15781M.a(getContext(), exception);
        return true;
    }
}
