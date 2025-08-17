package gd;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: gd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class ServiceConnectionC14242a implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    boolean f133303a = false;

    /* renamed from: b, reason: collision with root package name */
    private final BlockingQueue f133304b = new LinkedBlockingQueue();

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }

    public IBinder a(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        com.google.android.gms.common.internal.r.k("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f133303a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f133303a = true;
        IBinder iBinder = (IBinder) this.f133304b.poll(j10, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f133304b.add(iBinder);
    }
}
