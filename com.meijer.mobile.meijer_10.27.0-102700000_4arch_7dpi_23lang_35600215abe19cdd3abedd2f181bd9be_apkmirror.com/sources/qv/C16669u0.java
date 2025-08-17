package qv;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005*\f\b\u0007\u0010\u0007\"\u00020\u00062\u00020\u0006¨\u0006\b"}, d2 = {"Ljava/util/concurrent/Executor;", "Lqv/K;", "b", "(Ljava/util/concurrent/Executor;)Lqv/K;", "a", "(Lqv/K;)Ljava/util/concurrent/Executor;", "Lqv/s0;", "CloseableCoroutineDispatcher", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.u0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C16669u0 {
    public static final Executor a(AbstractC16618K abstractC16618K) {
        Executor executor;
        AbstractC16665s0 abstractC16665s0 = abstractC16618K instanceof AbstractC16665s0 ? (AbstractC16665s0) abstractC16618K : null;
        return (abstractC16665s0 == null || (executor = abstractC16665s0.getExecutor()) == null) ? new ExecutorC16637e0(abstractC16618K) : executor;
    }

    @JvmName
    public static final AbstractC16618K b(Executor executor) {
        AbstractC16618K abstractC16618K;
        ExecutorC16637e0 executorC16637e0 = executor instanceof ExecutorC16637e0 ? (ExecutorC16637e0) executor : null;
        return (executorC16637e0 == null || (abstractC16618K = executorC16637e0.dispatcher) == null) ? new C16667t0(executor) : abstractC16618K;
    }
}
