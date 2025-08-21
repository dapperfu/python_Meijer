package ze;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes4.dex */
final class s implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f172722a;

    /* synthetic */ s(t tVar, r rVar) {
        this.f172722a = tVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f172722a.f172725b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        t tVar = this.f172722a;
        tVar.c().post(new p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f172722a.f172725b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        t tVar = this.f172722a;
        tVar.c().post(new q(this));
    }
}
