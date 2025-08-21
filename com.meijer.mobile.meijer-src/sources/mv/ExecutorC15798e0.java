package mv;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.JvmField;
import rv.C16972i;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lmv/e0;", "Ljava/util/concurrent/Executor;", "Lmv/K;", "dispatcher", "<init>", "(Lmv/K;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "a", "Lmv/K;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mv.e0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class ExecutorC15798e0 implements Executor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final AbstractC15779K dispatcher;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable block) {
        AbstractC15779K abstractC15779K = this.dispatcher;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f143553a;
        if (C16972i.d(abstractC15779K, emptyCoroutineContext)) {
            C16972i.c(this.dispatcher, emptyCoroutineContext, block);
        } else {
            block.run();
        }
    }

    public String toString() {
        return this.dispatcher.getName();
    }

    public ExecutorC15798e0(AbstractC15779K abstractC15779K) {
        this.dispatcher = abstractC15779K;
    }
}
