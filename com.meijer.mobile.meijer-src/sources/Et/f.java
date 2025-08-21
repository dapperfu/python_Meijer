package Et;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Looper;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.List;
import java.util.Objects;
import kb.C15115a;
import ut.C17467a;

/* loaded from: classes12.dex */
public class f implements LocationListener, e, Runnable {

    /* renamed from: h, reason: collision with root package name */
    private static final C13784a f8520h = C13785b.a(f.class.getName());

    /* renamed from: i, reason: collision with root package name */
    private static final C13786c f8521i = C13787d.a(f.class.getName());

    /* renamed from: j, reason: collision with root package name */
    private static int f8522j;

    /* renamed from: a, reason: collision with root package name */
    private d f8523a;

    /* renamed from: b, reason: collision with root package name */
    private List<String> f8524b;

    /* renamed from: c, reason: collision with root package name */
    private Looper f8525c;

    /* renamed from: d, reason: collision with root package name */
    private Thread f8526d;

    /* renamed from: e, reason: collision with root package name */
    private C15115a f8527e;

    /* renamed from: f, reason: collision with root package name */
    private LocationManager f8528f;

    /* renamed from: g, reason: collision with root package name */
    private Nb.c f8529g;

    private void b(List<String> list) throws Throwable {
        Throwable th2;
        synchronized (this) {
            try {
                try {
                    if (this.f8528f == null) {
                        try {
                            this.f8528f = this.f8527e.a();
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    }
                    if (this.f8528f == null || !this.f8529g.b()) {
                        this.f8528f = null;
                    } else {
                        if (this.f8526d == null) {
                            StringBuilder sb2 = new StringBuilder("FixRequest-");
                            int i10 = f8522j + 1;
                            f8522j = i10;
                            sb2.append(i10);
                            Thread thread = new Thread(this, sb2.toString());
                            this.f8526d = thread;
                            thread.start();
                        }
                        while (this.f8525c == null) {
                            try {
                                wait();
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        }
                        for (String str : list) {
                            try {
                                try {
                                    this.f8528f.requestLocationUpdates(str, 0L, 0.0f, this, this.f8525c);
                                } catch (Exception unused2) {
                                    f8521i.f("acquireFixes FAILED from provider: {}", str);
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
        this.f8524b = list;
        this.f8523a = dVar;
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
            this.f8525c = Looper.myLooper();
            notifyAll();
        }
        Looper.loop();
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (this.f8523a.a(new C17467a(location.getLatitude(), location.getLongitude(), location.getAccuracy(), location.getProvider(), location.getTime()))) {
            synchronized (this) {
                notifyAll();
            }
        }
    }

    public f(C15115a c15115a, Nb.c cVar) {
        this.f8527e = c15115a;
        this.f8529g = cVar;
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i10, Bundle bundle) {
        String.format("onStatusChanged called with provider: %s, status: %d", str, Integer.valueOf(i10));
    }

    @Override // Et.e
    public final void a() {
        synchronized (this) {
            Objects.toString(this.f8524b);
            LocationManager locationManager = this.f8528f;
            if (locationManager != null) {
                try {
                    locationManager.removeUpdates(this);
                } catch (Exception unused) {
                }
            }
            Looper looper = this.f8525c;
            if (looper != null) {
                looper.quit();
            }
            this.f8525c = null;
            this.f8526d = null;
        }
    }
}
