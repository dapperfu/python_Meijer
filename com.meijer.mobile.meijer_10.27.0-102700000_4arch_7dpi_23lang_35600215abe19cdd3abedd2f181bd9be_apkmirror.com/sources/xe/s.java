package xe;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes4.dex */
final class s implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f169573a;

    /* synthetic */ s(t tVar, r rVar) {
        this.f169573a = tVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f169573a.f169576b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        t tVar = this.f169573a;
        tVar.c().post(new p(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f169573a.f169576b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        t tVar = this.f169573a;
        tVar.c().post(new q(this));
    }
}
