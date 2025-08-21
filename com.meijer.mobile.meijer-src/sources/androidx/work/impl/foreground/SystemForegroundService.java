package androidx.work.impl.foreground;

import O4.AbstractC4373v;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.ServiceC6178y;
import androidx.work.impl.foreground.a;

/* loaded from: classes4.dex */
public class SystemForegroundService extends ServiceC6178y implements a.b {

    /* renamed from: e, reason: collision with root package name */
    private static final String f59420e = AbstractC4373v.i("SystemFgService");

    /* renamed from: f, reason: collision with root package name */
    private static SystemForegroundService f59421f = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f59422b;

    /* renamed from: c, reason: collision with root package name */
    androidx.work.impl.foreground.a f59423c;

    /* renamed from: d, reason: collision with root package name */
    NotificationManager f59424d;

    static class b {
        static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                AbstractC4373v.e().l(SystemForegroundService.f59420e, "Unable to start foreground service", e10);
            } catch (SecurityException e11) {
                AbstractC4373v.e().l(SystemForegroundService.f59420e, "Unable to start foreground service", e11);
            }
        }
    }

    @Override // android.app.Service
    public void onTimeout(int i10) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f59423c.n(i10, RecyclerView.m.FLAG_MOVED);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f59422b = true;
        AbstractC4373v.e().a(f59420e, "Shutting down.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f59421f = null;
        stopSelf();
    }

    static class a {
        static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(int i10, Notification notification) {
        this.f59424d.notify(i10, notification);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i10, int i11, Notification notification) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            b.a(this, i10, notification, i11);
        } else if (i12 >= 29) {
            a.a(this, i10, notification, i11);
        } else {
            startForeground(i10, notification);
        }
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i10) {
        this.f59424d.cancel(i10);
    }

    private void f() {
        this.f59424d = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f59423c = aVar;
        aVar.o(this);
    }

    @Override // androidx.view.ServiceC6178y, android.app.Service
    public void onCreate() {
        super.onCreate();
        f59421f = this;
        f();
    }

    @Override // androidx.view.ServiceC6178y, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f59423c.l();
    }

    @Override // androidx.view.ServiceC6178y, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f59422b) {
            AbstractC4373v.e().f(f59420e, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f59423c.l();
            f();
            this.f59422b = false;
        }
        if (intent != null) {
            this.f59423c.m(intent);
            return 3;
        }
        return 3;
    }

    public void onTimeout(int i10, int i11) {
        this.f59423c.n(i10, i11);
    }
}
