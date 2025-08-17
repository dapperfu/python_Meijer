package ut;

import At.a;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import cb.C6380a;
import cb.C6381b;
import ib.C14712a;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import ot.C16176b;
import ot.InterfaceC16175a;

/* renamed from: ut.h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C17322h implements InterfaceC16175a, InterfaceRunnableC17328n, Dt.e {

    /* renamed from: r, reason: collision with root package name */
    private static final C6380a f163491r = C6381b.a(C17322h.class.getName());

    /* renamed from: s, reason: collision with root package name */
    private static int f163492s;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC17320f f163493a;

    /* renamed from: b, reason: collision with root package name */
    private final Random f163494b;

    /* renamed from: d, reason: collision with root package name */
    private final Dt.f f163496d;

    /* renamed from: e, reason: collision with root package name */
    private final Za.e f163497e;

    /* renamed from: f, reason: collision with root package name */
    private final String f163498f;

    /* renamed from: g, reason: collision with root package name */
    private final nt.d f163499g;

    /* renamed from: h, reason: collision with root package name */
    private final nt.e f163500h;

    /* renamed from: j, reason: collision with root package name */
    private final C16176b f163502j;

    /* renamed from: k, reason: collision with root package name */
    private final At.a f163503k;

    /* renamed from: n, reason: collision with root package name */
    private long f163506n;

    /* renamed from: o, reason: collision with root package name */
    private long f163507o;

    /* renamed from: q, reason: collision with root package name */
    private Thread f163509q;

    /* renamed from: c, reason: collision with root package name */
    private List<C17315a> f163495c = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private boolean f163504l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f163505m = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f163508p = true;

    /* renamed from: i, reason: collision with root package name */
    private final EnumC17327m f163501i = EnumC17327m.LOCATION;

    @Override // ut.InterfaceRunnableC17328n
    public final void a(long j10) {
        int i10 = a.C0026a.f1614a[this.f163503k.d().ordinal()];
        long jMin = Math.min(j10, 1800000L);
        if (this.f163506n < jMin) {
            this.f163506n = jMin;
        }
    }

    @Override // ut.InterfaceRunnableC17328n
    public final void c() {
        synchronized (this) {
            this.f163504l = true;
            notifyAll();
        }
    }

    @Override // ut.InterfaceRunnableC17328n
    public final void d() {
        synchronized (this) {
            notifyAll();
        }
    }

    public final synchronized void e() {
        if (this.f163508p) {
            while (this.f163509q != null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            this.f163508p = false;
            Thread thread = new Thread(this, this.f163498f);
            this.f163509q = thread;
            thread.start();
        }
    }

    public final synchronized void f() {
        if (!this.f163508p) {
            this.f163508p = true;
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        C17315a c17315aRemove;
        try {
            this.f163502j.h(this);
            while (!this.f163508p) {
                this.f163504l = false;
                if (this.f163505m) {
                    this.f163506n = 100L;
                } else {
                    this.f163506n = this.f163503k.a();
                }
                if (this.f163505m) {
                    this.f163500h.a();
                    this.f163493a.b();
                    this.f163500h.b();
                } else {
                    this.f163500h.a();
                    h();
                    try {
                        if (this.f163495c.size() > 0) {
                            while (true) {
                                synchronized (this.f163495c) {
                                    try {
                                        if (this.f163495c.size() == 0) {
                                            break;
                                        } else {
                                            c17315aRemove = this.f163495c.remove(0);
                                        }
                                    } finally {
                                    }
                                }
                                this.f163493a.a(c17315aRemove);
                            }
                        } else {
                            h();
                            this.f163493a.a();
                        }
                        i();
                        this.f163500h.b();
                    } finally {
                    }
                }
                long jMax = this.f163506n;
                if (!this.f163505m) {
                    jMax = Math.max(1500L, jMax + (((this.f163494b.nextInt(7) * 30000) / 6) - 15000));
                }
                this.f163507o = jMax;
                this.f163505m = false;
                Thread.currentThread().isInterrupted();
                g();
                if (g()) {
                    nt.d dVar = this.f163499g;
                    long j10 = this.f163507o;
                    EnumC17327m enumC17327m = this.f163501i;
                    try {
                        Context context = dVar.f152804a;
                        Intent intent = new Intent();
                        intent.setPackage(dVar.f152807d);
                        intent.setAction(dVar.f152807d + "." + enumC17327m.name());
                        dVar.f152806c.setRepeating(0, dVar.f152805b.a() + j10, j10, PendingIntent.getBroadcast(context, 0, intent, 268435456));
                        enumC17327m.name();
                    } catch (Exception unused) {
                        nt.d.f152803f.g("Unable to set alarm for {} in: {} secs", enumC17327m.name(), Double.valueOf(j10 / 1000.0d));
                    }
                    try {
                        synchronized (this) {
                            try {
                                if (!this.f163508p) {
                                    wait(this.f163507o + 2000);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (InterruptedException unused2) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            synchronized (this) {
                this.f163508p = true;
                this.f163509q = null;
                notifyAll();
            }
        } catch (Throwable th3) {
            synchronized (this) {
                this.f163508p = true;
                this.f163509q = null;
                notifyAll();
                throw th3;
            }
        }
    }

    private boolean g() {
        return !this.f163504l;
    }

    private void h() {
        this.f163496d.c();
    }

    private void i() {
        this.f163496d.a(this.f163497e.a() + 5000);
    }

    @Override // ot.InterfaceC16175a
    public final void b(Activity activity) {
        if (activity != null) {
            synchronized (this) {
                this.f163505m = true;
                notifyAll();
            }
        }
    }

    @Override // ut.InterfaceRunnableC17328n
    public final void v0(double d10) {
        a((long) (this.f163506n * d10));
    }

    public C17322h(InterfaceC17320f interfaceC17320f, Dt.f fVar, C16176b c16176b, nt.d dVar, Za.e eVar, At.a aVar, C14712a c14712a) {
        this.f163502j = c16176b;
        this.f163503k = aVar;
        this.f163506n = aVar.a();
        StringBuilder sb2 = new StringBuilder("LocationMonitor-");
        int i10 = f163492s + 1;
        f163492s = i10;
        sb2.append(i10);
        String string = sb2.toString();
        this.f163498f = string;
        this.f163499g = dVar;
        this.f163500h = new nt.e(c14712a, string);
        this.f163493a = interfaceC17320f;
        this.f163496d = fVar;
        this.f163497e = eVar;
        fVar.b(this);
        this.f163494b = new Random(System.currentTimeMillis());
    }

    @Override // Dt.e
    public final void a(C17315a c17315a) {
        synchronized (this.f163495c) {
            this.f163495c.add(c17315a);
        }
        c();
    }
}
