package qv;

import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import qv.AbstractC16653m0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8$X¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lqv/n0;", "Lqv/l0;", "<init>", "()V", "", "o1", "", "now", "Lqv/m0$c;", "delayedTask", "m1", "(JLqv/m0$c;)V", "Ljava/lang/Thread;", "j1", "()Ljava/lang/Thread;", "thread", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qv.n0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC16655n0 extends AbstractC16651l0 {
    /* renamed from: j1 */
    protected abstract Thread getThread();

    protected void m1(long now, AbstractC16653m0.c delayedTask) {
        RunnableC16627U.f157621i.V1(now, delayedTask);
    }

    protected final void o1() {
        Thread thread = getThread();
        if (Thread.currentThread() != thread) {
            C16632c.a();
            LockSupport.unpark(thread);
        }
    }
}
