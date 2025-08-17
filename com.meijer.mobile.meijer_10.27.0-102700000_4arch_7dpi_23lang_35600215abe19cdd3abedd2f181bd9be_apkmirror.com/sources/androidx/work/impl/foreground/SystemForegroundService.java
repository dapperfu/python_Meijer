package androidx.work.impl.foreground;

import N4.AbstractC4333v;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.ServiceC6036y;
import androidx.work.impl.foreground.a;

/* loaded from: classes4.dex */
public class SystemForegroundService extends ServiceC6036y implements a.b {

    /* renamed from: e, reason: collision with root package name */
    private static final String f59234e = AbstractC4333v.i("SystemFgService");

    /* renamed from: f, reason: collision with root package name */
    private static SystemForegroundService f59235f = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f59236b;

    /* renamed from: c, reason: collision with root package name */
    androidx.work.impl.foreground.a f59237c;

    /* renamed from: d, reason: collision with root package name */
    NotificationManager f59238d;

    static class b {
        static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                AbstractC4333v.e().l(SystemForegroundService.f59234e, "Unable to start foreground service", e10);
            } catch (SecurityException e11) {
                AbstractC4333v.e().l(SystemForegroundService.f59234e, "Unable to start foreground service", e11);
            }
        }
    }

    @Override // android.app.Service
    public void onTimeout(int i10) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f59237c.n(i10, RecyclerView.m.FLAG_MOVED);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f59236b = true;
        AbstractC4333v.e().a(f59234e, "Shutting down.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f59235f = null;
        stopSelf();
    }

    static class a {
        static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(int i10, Notification notification) {
        this.f59238d.notify(i10, notification);
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
        this.f59238d.cancel(i10);
    }

    private void f() {
        this.f59238d = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f59237c = aVar;
        aVar.o(this);
    }

    @Override // androidx.view.ServiceC6036y, android.app.Service
    public void onCreate() {
        super.onCreate();
        f59235f = this;
        f();
    }

    @Override // androidx.view.ServiceC6036y, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f59237c.l();
    }

    @Override // androidx.view.ServiceC6036y, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f59236b) {
            AbstractC4333v.e().f(f59234e, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f59237c.l();
            f();
            this.f59236b = false;
        }
        if (intent != null) {
            this.f59237c.m(intent);
            return 3;
        }
        return 3;
    }

    public void onTimeout(int i10, int i11) {
        this.f59237c.n(i10, i11);
    }
}
