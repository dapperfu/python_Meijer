package tv;

import io.reactivex.v;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import mv.AbstractC15789a;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Ltv/l;", "", "T", "Lmv/a;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lio/reactivex/v;", "subscriber", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lio/reactivex/v;)V", "value", "", "h1", "(Ljava/lang/Object;)V", "", "cause", "", "handled", "g1", "(Ljava/lang/Throwable;Z)V", "d", "Lio/reactivex/v;", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
final class l<T> extends AbstractC15789a<T> {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final v<T> subscriber;

    public l(CoroutineContext coroutineContext, v<T> vVar) {
        super(coroutineContext, false, true);
        this.subscriber = vVar;
    }

    @Override // mv.AbstractC15789a
    protected void g1(Throwable cause, boolean handled) {
        try {
            if (this.subscriber.a(cause)) {
                return;
            }
        } catch (Throwable th2) {
            ExceptionsKt.a(cause, th2);
        }
        e.a(cause, getF143270a());
    }

    @Override // mv.AbstractC15789a
    protected void h1(T value) {
        try {
            this.subscriber.onSuccess(value);
        } catch (Throwable th2) {
            e.a(th2, getF143270a());
        }
    }
}
