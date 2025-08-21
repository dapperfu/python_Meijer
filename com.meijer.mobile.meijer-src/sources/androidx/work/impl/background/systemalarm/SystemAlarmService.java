package androidx.work.impl.background.systemalarm;

import O4.AbstractC4373v;
import X4.G;
import android.content.Intent;
import androidx.view.ServiceC6178y;
import androidx.work.impl.background.systemalarm.g;

/* loaded from: classes4.dex */
public class SystemAlarmService extends ServiceC6178y implements g.c {

    /* renamed from: d, reason: collision with root package name */
    private static final String f59363d = AbstractC4373v.i("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    private g f59364b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f59365c;

    @Override // androidx.work.impl.background.systemalarm.g.c
    public void b() {
        this.f59365c = true;
        AbstractC4373v.e().a(f59363d, "All commands completed in dispatcher");
        G.a();
        stopSelf();
    }

    private void e() {
        g gVar = new g(this);
        this.f59364b = gVar;
        gVar.m(this);
    }

    @Override // androidx.view.ServiceC6178y, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f59365c = false;
    }

    @Override // androidx.view.ServiceC6178y, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f59365c = true;
        this.f59364b.k();
    }

    @Override // androidx.view.ServiceC6178y, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f59365c) {
            AbstractC4373v.e().f(f59363d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.f59364b.k();
            e();
            this.f59365c = false;
        }
        if (intent != null) {
            this.f59364b.a(intent, i11);
            return 3;
        }
        return 3;
    }
}
