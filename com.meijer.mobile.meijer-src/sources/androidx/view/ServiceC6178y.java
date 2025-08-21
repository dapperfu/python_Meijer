package androidx.view;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/y;", "Landroid/app/Service;", "Landroidx/lifecycle/s;", "<init>", "()V", "", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "startId", "onStart", "(Landroid/content/Intent;I)V", "flags", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "Landroidx/lifecycle/W;", "a", "Landroidx/lifecycle/W;", "dispatcher", "Landroidx/lifecycle/l;", "getLifecycle", "()Landroidx/lifecycle/l;", "lifecycle", "lifecycle-service_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ServiceC6178y extends Service implements InterfaceC6172s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6148W dispatcher = new C6148W(this);

    @Override // androidx.view.InterfaceC6172s
    public AbstractC6165l getLifecycle() {
        return this.dispatcher.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.j(intent, "intent");
        this.dispatcher.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.dispatcher.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.dispatcher.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    @Deprecated
    public void onStart(Intent intent, int startId) {
        this.dispatcher.e();
        super.onStart(intent, startId);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
}
