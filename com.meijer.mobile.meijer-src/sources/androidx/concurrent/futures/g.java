package androidx.concurrent.futures;

import com.google.common.util.concurrent.q;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import mv.InterfaceC15815n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/concurrent/futures/g;", "T", "Ljava/lang/Runnable;", "Lcom/google/common/util/concurrent/q;", "futureToObserve", "Lmv/n;", "continuation", "<init>", "(Lcom/google/common/util/concurrent/q;Lmv/n;)V", "", "run", "()V", "a", "Lcom/google/common/util/concurrent/q;", "getFutureToObserve", "()Lcom/google/common/util/concurrent/q;", "b", "Lmv/n;", "getContinuation", "()Lmv/n;", "concurrent-futures-ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class g<T> implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q<T> futureToObserve;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15815n<T> continuation;

    @Override // java.lang.Runnable
    public void run() {
        if (this.futureToObserve.isCancelled()) {
            InterfaceC15815n.a.a(this.continuation, null, 1, null);
            return;
        }
        try {
            InterfaceC15815n<T> interfaceC15815n = this.continuation;
            Result.Companion companion = Result.INSTANCE;
            interfaceC15815n.resumeWith(Result.b(a.w(this.futureToObserve)));
        } catch (ExecutionException e10) {
            InterfaceC15815n<T> interfaceC15815n2 = this.continuation;
            Result.Companion companion2 = Result.INSTANCE;
            interfaceC15815n2.resumeWith(Result.b(ResultKt.a(e.b(e10))));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(q<T> qVar, InterfaceC15815n<? super T> interfaceC15815n) {
        this.futureToObserve = qVar;
        this.continuation = interfaceC15815n;
    }
}
