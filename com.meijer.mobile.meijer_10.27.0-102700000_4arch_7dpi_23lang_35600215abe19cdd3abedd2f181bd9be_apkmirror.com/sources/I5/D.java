package I5;

import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.InterfaceC6456o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LI5/D;", "LI5/x;", "", "eventType", "eventSource", "Lcom/adobe/marketing/mobile/o;", "listener", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/adobe/marketing/mobile/o;)V", "Lcom/adobe/marketing/mobile/h;", "event", "", "b", "(Lcom/adobe/marketing/mobile/h;)Z", "", "a", "(Lcom/adobe/marketing/mobile/h;)V", "Ljava/lang/String;", "getEventType", "()Ljava/lang/String;", "getEventSource", "c", "Lcom/adobe/marketing/mobile/o;", "getListener", "()Lcom/adobe/marketing/mobile/o;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class D extends x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String eventType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String eventSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6456o listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(String eventType, String eventSource, InterfaceC6456o listener) {
        super(null);
        Intrinsics.j(eventType, "eventType");
        Intrinsics.j(eventSource, "eventSource");
        Intrinsics.j(listener, "listener");
        this.eventType = eventType;
        this.eventSource = eventSource;
        this.listener = listener;
    }

    public void a(C6449h event) {
        Intrinsics.j(event, "event");
        try {
            this.listener.a(event);
        } catch (Exception e10) {
            Q5.t.a("MobileCore", "ExtensionListenerContainer", "Exception thrown for EventId " + event.x() + ". " + e10, new Object[0]);
        }
    }

    public boolean b(C6449h event) {
        Intrinsics.j(event, "event");
        return event.s() != null ? Intrinsics.e(this.eventType, "com.adobe.eventType._wildcard_") && Intrinsics.e(this.eventSource, "com.adobe.eventSource._wildcard_") : (StringsKt.H(this.eventType, event.w(), true) && StringsKt.H(this.eventSource, event.t(), true)) || (Intrinsics.e(this.eventType, "com.adobe.eventType._wildcard_") && Intrinsics.e(this.eventSource, "com.adobe.eventSource._wildcard_"));
    }
}
