package pv;

import kotlin.AbstractC16771c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lpv/I;", "Lqv/c;", "Lpv/G;", "<init>", "()V", "flow", "", "c", "(Lpv/G;)Z", "", "Lkotlin/coroutines/Continuation;", "", "d", "(Lpv/G;)[Lkotlin/coroutines/Continuation;", "", "a", "J", "index", "b", "Lkotlin/coroutines/Continuation;", "cont", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class I extends AbstractC16771c<C16554G<?>> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public long index = -1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public Continuation<? super Unit> cont;

    @Override // kotlin.AbstractC16771c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(C16554G<?> flow) {
        if (this.index >= 0) {
            return false;
        }
        this.index = flow.Y();
        return true;
    }

    @Override // kotlin.AbstractC16771c
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Continuation<Unit>[] b(C16554G<?> flow) {
        long j10 = this.index;
        this.index = -1L;
        this.cont = null;
        return flow.X(j10);
    }
}
