package mv;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005*\f\b\u0007\u0010\u0007\"\u00020\u00062\u00020\u0006¨\u0006\b"}, d2 = {"Ljava/util/concurrent/Executor;", "Lmv/K;", "b", "(Ljava/util/concurrent/Executor;)Lmv/K;", "a", "(Lmv/K;)Ljava/util/concurrent/Executor;", "Lmv/s0;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.u0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C15830u0 {
    public static final Executor a(AbstractC15779K abstractC15779K) {
        Executor executor;
        AbstractC15826s0 abstractC15826s0 = abstractC15779K instanceof AbstractC15826s0 ? (AbstractC15826s0) abstractC15779K : null;
        return (abstractC15826s0 == null || (executor = abstractC15826s0.getExecutor()) == null) ? new ExecutorC15798e0(abstractC15779K) : executor;
    }

    @JvmName
    public static final AbstractC15779K b(Executor executor) {
        AbstractC15779K abstractC15779K;
        ExecutorC15798e0 executorC15798e0 = executor instanceof ExecutorC15798e0 ? (ExecutorC15798e0) executor : null;
        return (executorC15798e0 == null || (abstractC15779K = executorC15798e0.dispatcher) == null) ? new C15828t0(executor) : abstractC15779K;
    }
}
