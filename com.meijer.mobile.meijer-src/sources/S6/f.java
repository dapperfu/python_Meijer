package S6;

import android.app.ActivityManager;
import android.os.storage.StorageManager;
import com.bugsnag.android.B;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LS6/f;", "LS6/a;", "LS6/c;", "contextModule", "LR6/b;", "bgTaskService", "<init>", "(LS6/c;LR6/b;)V", "Landroid/os/storage/StorageManager;", "c", "Landroid/os/storage/StorageManager;", "b", "()Landroid/os/storage/StorageManager;", "storageManager", "Landroid/app/ActivityManager;", "d", "Landroid/app/ActivityManager;", "a", "()Landroid/app/ActivityManager;", "activityManager", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends a {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StorageManager storageManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ActivityManager activityManager;

    public f(c cVar, R6.b bVar) {
        super(bVar, null, 2, null);
        this.storageManager = B.d(cVar.getCtx());
        this.activityManager = B.a(cVar.getCtx());
    }

    /* renamed from: a, reason: from getter */
    public final ActivityManager getActivityManager() {
        return this.activityManager;
    }

    /* renamed from: b, reason: from getter */
    public final StorageManager getStorageManager() {
        return this.storageManager;
    }
}
