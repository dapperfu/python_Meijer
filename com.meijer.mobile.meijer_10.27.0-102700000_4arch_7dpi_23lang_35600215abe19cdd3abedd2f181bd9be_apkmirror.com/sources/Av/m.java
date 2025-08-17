package Av;

import io.constructor.data.local.PreferencesHelper;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import vv.AbstractC17628B;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00178\u0006¨\u0006\u0019"}, d2 = {"LAv/m;", "Lvv/B;", "", PreferencesHelper.PREF_ID, "prev", "", "pointers", "<init>", "(JLAv/m;I)V", "index", "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", "s", "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "", "toString", "()Ljava/lang/String;", "r", "()I", "numberOfSlots", "", "acquirers", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
final class m extends AbstractC17628B<m> {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f1645e;

    public String toString() {
        return "SemaphoreSegment[id=" + this.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String + ", hashCode=" + hashCode() + ']';
    }

    /* renamed from: v, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF1645e() {
        return this.f1645e;
    }

    public m(long j10, m mVar, int i10) {
        super(j10, mVar, i10);
        this.f1645e = new AtomicReferenceArray(l.f1644f);
    }

    @Override // vv.AbstractC17628B
    public int r() {
        return l.f1644f;
    }

    @Override // vv.AbstractC17628B
    public void s(int index, Throwable cause, CoroutineContext context) {
        getF1645e().set(index, l.f1643e);
        t();
    }
}
