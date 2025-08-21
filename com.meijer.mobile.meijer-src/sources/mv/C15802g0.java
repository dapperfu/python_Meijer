package mv;

import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lmv/g0;", "Lmv/h0;", "Ljava/util/concurrent/Future;", "future", "<init>", "(Ljava/util/concurrent/Future;)V", "", "dispose", "()V", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/concurrent/Future;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.g0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C15802g0 implements InterfaceC15804h0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Future<?> future;

    @Override // mv.InterfaceC15804h0
    public void dispose() {
        this.future.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.future + ']';
    }

    public C15802g0(Future<?> future) {
        this.future = future;
    }
}
