package Et;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import ib.C14712a;
import java.util.List;
import java.util.Objects;
import ut.C17315a;

/* loaded from: classes11.dex */
public class f implements LocationListener, e, Runnable {

    /* renamed from: h, reason: collision with root package name */
    private static final C6380a f9808h = C6381b.a(f.class.getName());

    /* renamed from: i, reason: collision with root package name */
    private static final C6382c f9809i = C6383d.a(f.class.getName());

    /* renamed from: j, reason: collision with root package name */
    private static int f9810j;

    /* renamed from: a, reason: collision with root package name */
    private d f9811a;

    /* renamed from: b, reason: collision with root package name */
    private List<String> f9812b;

    /* renamed from: c, reason: collision with root package name */
    private Looper f9813c;

    /* renamed from: d, reason: collision with root package name */
    private Thread f9814d;

    /* renamed from: e, reason: collision with root package name */
    private C14712a f9815e;

    /* renamed from: f, reason: collision with root package name */
    private LocationManager f9816f;

    /* renamed from: g, reason: collision with root package name */
    private Lb.c f9817g;

    private void b(List<String> list) throws Throwable {
        Throwable th2;
        synchronized (this) {
            try {
                try {
                    if (this.f9816f == null) {
                        try {
                            this.f9816f = this.f9815e.a();
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    }
                    if (this.f9816f == null || !this.f9817g.b()) {
                        this.f9816f = null;
                    } else {
                        if (this.f9814d == null) {
                            StringBuilder sb2 = new StringBuilder("FixRequest-");
                            int i10 = f9810j + 1;
                            f9810j = i10;
                            sb2.append(i10);
                            Thread thread = new Thread(this, sb2.toString());
                            this.f9814d = thread;
                            thread.start();
                        }
                        while (this.f9813c == null) {
                            try {
                                wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        }
                        for (String str : list) {
                            try {
                                try {
                                    this.f9816f.requestLocationUpdates(str, 0L, 0.0f, this, this.f9813c);
                                } catch (Exception unused2) {
                                    f9809i.f("acquireFixes FAILED from provider: {}", str);
                                }
                            } catch (Exception unused3) {
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    @Override // Et.e
    public final void a(long j10, d dVar, List<String> list) throws Throwable {
        Objects.toString(list);
        this.f9812b = list;
        this.f9811a = dVar;
        b(list);
        synchronized (this) {
            try {
                wait(j10);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this) {
            Looper.prepare();
            this.f9813c = Looper.myLooper();
            notifyAll();
        }
        Looper.loop();
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (this.f9811a.a(new C17315a(location.getLatitude(), location.getLongitude(), location.getAccuracy(), location.getProvider(), location.getTime()))) {
            synchronized (this) {
                notifyAll();
            }
        }
    }

    public f(C14712a c14712a, Lb.c cVar) {
        this.f9815e = c14712a;
        this.f9817g = cVar;
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i10, Bundle bundle) {
        String.format("onStatusChanged called with provider: %s, status: %d", str, Integer.valueOf(i10));
    }

    @Override // Et.e
    public final void a() {
        synchronized (this) {
            Objects.toString(this.f9812b);
            LocationManager locationManager = this.f9816f;
            if (locationManager != null) {
                try {
                    locationManager.removeUpdates(this);
                } catch (Exception unused) {
                }
            }
            Looper looper = this.f9813c;
            if (looper != null) {
                looper.quit();
            }
            this.f9813c = null;
            this.f9814d = null;
        }
    }
}
