package s5;

import Q5.t;
import com.adobe.marketing.mobile.InterfaceC6418a;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001c"}, d2 = {"Ls5/g;", "", "", "debugName", "<init>", "(Ljava/lang/String;)V", "", "c", "()Z", "", "timeout", "Lcom/adobe/marketing/mobile/a;", "callback", "", "d", "(JLcom/adobe/marketing/mobile/a;)V", "b", "()V", "a", "Ljava/lang/String;", "Z", "isTimerRunning", "Ljava/util/Timer;", "Ljava/util/Timer;", "timer", "Ljava/lang/Object;", "timerMutex", "e", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String debugName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isTimerRunning;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Timer timer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object timerMutex;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"s5/g$b", "Ljava/util/TimerTask;", "", "run", "()V", "analytics_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b extends TimerTask {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6418a<Boolean> f160213b;

        b(InterfaceC6418a<Boolean> interfaceC6418a) {
            this.f160213b = interfaceC6418a;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            g.this.isTimerRunning = false;
            this.f160213b.a(Boolean.TRUE);
        }
    }

    public g(String debugName) {
        Intrinsics.j(debugName, "debugName");
        this.debugName = debugName;
        this.timerMutex = new Object();
    }

    public final void b() {
        synchronized (this.timerMutex) {
            try {
                try {
                    Timer timer = this.timer;
                    if (timer != null) {
                        timer.cancel();
                    }
                    t.e("Analytics", "TimerState", "%s timer was canceled", this.debugName);
                } catch (Exception e10) {
                    t.f("Analytics", "TimerState", "Error cancelling %s timer, failed with error: (%s)", this.debugName, e10);
                }
                this.isTimerRunning = false;
                Unit unit = Unit.f142422a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.timerMutex) {
            z10 = this.isTimerRunning;
        }
        return z10;
    }

    public final void d(long timeout, InterfaceC6418a<Boolean> callback) {
        Intrinsics.j(callback, "callback");
        synchronized (this.timerMutex) {
            if (this.isTimerRunning) {
                t.a("Analytics", "TimerState", "Timer has already started.", new Object[0]);
                return;
            }
            this.isTimerRunning = true;
            try {
                Timer timer = new Timer(this.debugName);
                this.timer = timer;
                timer.schedule(new b(callback), timeout);
                t.e("Analytics", "TimerState", "%s timer scheduled having timeout %s ms", this.debugName, Long.valueOf(timeout));
            } catch (Exception e10) {
                t.f("Analytics", "TimerState", "Error creating %s timer, failed with error: (%s)", this.debugName, e10);
            }
            Unit unit = Unit.f142422a;
        }
    }
}
