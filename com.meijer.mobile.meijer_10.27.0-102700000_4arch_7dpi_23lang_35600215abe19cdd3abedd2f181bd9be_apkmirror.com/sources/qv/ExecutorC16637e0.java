package qv;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.JvmField;
import vv.C17653i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lqv/e0;", "Ljava/util/concurrent/Executor;", "Lqv/K;", "dispatcher", "<init>", "(Lqv/K;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "a", "Lqv/K;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.e0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class ExecutorC16637e0 implements Executor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final AbstractC16618K dispatcher;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable block) {
        AbstractC16618K abstractC16618K = this.dispatcher;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f142646a;
        if (C17653i.d(abstractC16618K, emptyCoroutineContext)) {
            C17653i.c(this.dispatcher, emptyCoroutineContext, block);
        } else {
            block.run();
        }
    }

    public String toString() {
        return this.dispatcher.getName();
    }

    public ExecutorC16637e0(AbstractC16618K abstractC16618K) {
        this.dispatcher = abstractC16618K;
    }
}
