package sv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import qv.C16620M;
import sv.w;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lsv/s;", "E", "Lsv/h;", "Lsv/t;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lsv/g;", "channel", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lsv/g;)V", "", "value", "l1", "(Lkotlin/Unit;)V", "", "cause", "", "handled", "g1", "(Ljava/lang/Throwable;Z)V", "a", "()Z", "isActive", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
final class s<E> extends h<E> implements t<E> {
    public s(CoroutineContext coroutineContext, g<E> gVar) {
        super(coroutineContext, gVar, true, true);
    }

    @Override // qv.AbstractC16628a, qv.H0, qv.C0
    public boolean a() {
        return super.a();
    }

    @Override // qv.AbstractC16628a
    protected void g1(Throwable cause, boolean handled) {
        if (!k1().q(cause) && !handled) {
            C16620M.a(getF142363a(), cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // qv.AbstractC16628a
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public void h1(Unit value) {
        w.a.a(k1(), null, 1, null);
    }

    @Override // sv.t
    public /* bridge */ /* synthetic */ w w() {
        return j1();
    }
}
