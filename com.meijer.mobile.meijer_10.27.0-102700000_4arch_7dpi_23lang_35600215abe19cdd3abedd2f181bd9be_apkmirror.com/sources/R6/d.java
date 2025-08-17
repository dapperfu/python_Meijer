package R6;

import android.app.ActivityManager;
import android.os.storage.StorageManager;
import com.bugsnag.android.C6504y;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LR6/d;", "LR6/c;", "LR6/b;", "contextModule", "<init>", "(LR6/b;)V", "Landroid/os/storage/StorageManager;", "b", "Landroid/os/storage/StorageManager;", "e", "()Landroid/os/storage/StorageManager;", "storageManager", "Landroid/app/ActivityManager;", "c", "Landroid/app/ActivityManager;", "d", "()Landroid/app/ActivityManager;", "activityManager", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class d extends c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StorageManager storageManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ActivityManager activityManager;

    /* renamed from: d, reason: from getter */
    public final ActivityManager getActivityManager() {
        return this.activityManager;
    }

    /* renamed from: e, reason: from getter */
    public final StorageManager getStorageManager() {
        return this.storageManager;
    }

    public d(b bVar) {
        this.storageManager = C6504y.d(bVar.getCtx());
        this.activityManager = C6504y.a(bVar.getCtx());
    }
}
