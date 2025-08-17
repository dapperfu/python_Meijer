package ua;

import Z9.NotificationInformation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import va.C17534j;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lua/j;", "Ljava/lang/Runnable;", "Lva/j;", "silentNotificationInformationListenerProvider", "LZ9/a;", "notificationInformation", "<init>", "(Lva/j;LZ9/a;)V", "", "run", "()V", "a", "Lva/j;", "b", "LZ9/a;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C17534j silentNotificationInformationListenerProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final NotificationInformation notificationInformation;

    public j(C17534j silentNotificationInformationListenerProvider, NotificationInformation notificationInformation) {
        Intrinsics.j(silentNotificationInformationListenerProvider, "silentNotificationInformationListenerProvider");
        Intrinsics.j(notificationInformation, "notificationInformation");
        this.silentNotificationInformationListenerProvider = silentNotificationInformationListenerProvider;
        this.notificationInformation = notificationInformation;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.silentNotificationInformationListenerProvider.a();
    }
}
