package androidx.work.impl.background.systemalarm;

import N4.AbstractC4333v;
import W4.G;
import android.content.Intent;
import androidx.view.ServiceC6036y;
import androidx.work.impl.background.systemalarm.g;

/* loaded from: classes4.dex */
public class SystemAlarmService extends ServiceC6036y implements g.c {

    /* renamed from: d, reason: collision with root package name */
    private static final String f59177d = AbstractC4333v.i("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    private g f59178b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f59179c;

    @Override // androidx.work.impl.background.systemalarm.g.c
    public void b() {
        this.f59179c = true;
        AbstractC4333v.e().a(f59177d, "All commands completed in dispatcher");
        G.a();
        stopSelf();
    }

    private void e() {
        g gVar = new g(this);
        this.f59178b = gVar;
        gVar.m(this);
    }

    @Override // androidx.view.ServiceC6036y, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f59179c = false;
    }

    @Override // androidx.view.ServiceC6036y, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f59179c = true;
        this.f59178b.k();
    }

    @Override // androidx.view.ServiceC6036y, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f59179c) {
            AbstractC4333v.e().f(f59177d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f59178b.k();
            e();
            this.f59179c = false;
        }
        if (intent != null) {
            this.f59178b.a(intent, i11);
            return 3;
        }
        return 3;
    }
}
