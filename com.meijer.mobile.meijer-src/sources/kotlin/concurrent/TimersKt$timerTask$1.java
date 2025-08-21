package kotlin.concurrent;

import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "", "run", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes8.dex */
public final class TimersKt$timerTask$1 extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Function1<TimerTask, Unit> f143537a;

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        this.f143537a.invoke(this);
    }
}
