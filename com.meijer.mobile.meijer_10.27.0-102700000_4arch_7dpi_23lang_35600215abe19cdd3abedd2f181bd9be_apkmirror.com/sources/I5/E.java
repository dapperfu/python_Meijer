package I5;

import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.InterfaceC6443b;
import java.util.concurrent.ScheduledFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LI5/E;", "LI5/x;", "", "triggerEventId", "Ljava/util/concurrent/ScheduledFuture;", "", "timeoutTask", "Lcom/adobe/marketing/mobile/b;", "Lcom/adobe/marketing/mobile/h;", "listener", "<init>", "(Ljava/lang/String;Ljava/util/concurrent/ScheduledFuture;Lcom/adobe/marketing/mobile/b;)V", "event", "", "d", "(Lcom/adobe/marketing/mobile/h;)Z", "c", "(Lcom/adobe/marketing/mobile/h;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/util/concurrent/ScheduledFuture;", "()Ljava/util/concurrent/ScheduledFuture;", "Lcom/adobe/marketing/mobile/b;", "getListener", "()Lcom/adobe/marketing/mobile/b;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class E extends x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String triggerEventId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ScheduledFuture<Unit> timeoutTask;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6443b<C6449h> listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(String triggerEventId, ScheduledFuture<Unit> scheduledFuture, InterfaceC6443b<C6449h> listener) {
        super(null);
        Intrinsics.j(triggerEventId, "triggerEventId");
        Intrinsics.j(listener, "listener");
        this.triggerEventId = triggerEventId;
        this.timeoutTask = scheduledFuture;
        this.listener = listener;
    }

    public final ScheduledFuture<Unit> a() {
        return this.timeoutTask;
    }

    /* renamed from: b, reason: from getter */
    public final String getTriggerEventId() {
        return this.triggerEventId;
    }

    public void c(C6449h event) {
        Intrinsics.j(event, "event");
        try {
            this.listener.a(event);
        } catch (Exception e10) {
            Q5.t.a("MobileCore", "ResponseListenerContainer", "Exception thrown for EventId " + event.x() + ". " + e10, new Object[0]);
        }
    }

    public boolean d(C6449h event) {
        Intrinsics.j(event, "event");
        return Intrinsics.e(event.s(), this.triggerEventId);
    }
}
