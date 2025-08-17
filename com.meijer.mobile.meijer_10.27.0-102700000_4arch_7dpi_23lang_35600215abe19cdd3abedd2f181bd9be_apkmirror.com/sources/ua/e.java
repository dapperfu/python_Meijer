package ua;

import android.app.NotificationManager;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import za.NotificationData;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lua/e;", "Ljava/lang/Runnable;", "Landroid/content/Context;", "context", "Lza/k;", "notificationData", "<init>", "(Landroid/content/Context;Lza/k;)V", "", "run", "()V", "a", "Landroid/content/Context;", "b", "Lza/k;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements Runnable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final NotificationData notificationData;

    public e(Context context, NotificationData notificationData) {
        Intrinsics.j(context, "context");
        this.context = context;
        this.notificationData = notificationData;
    }

    @Override // java.lang.Runnable
    public void run() {
        String collapseId;
        Object systemService = this.context.getSystemService("notification");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationData notificationData = this.notificationData;
        if (notificationData == null || (collapseId = notificationData.getCollapseId()) == null) {
            return;
        }
        notificationManager.cancel(collapseId, collapseId.hashCode());
    }
}
