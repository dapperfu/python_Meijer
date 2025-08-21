package ut;

import At.a;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import eb.C13784a;
import eb.C13785b;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import kb.C15115a;
import ot.C16318b;
import ot.InterfaceC16317a;

/* renamed from: ut.h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C17474h implements InterfaceC16317a, InterfaceRunnableC17480n, Dt.e {

    /* renamed from: r, reason: collision with root package name */
    private static final C13784a f164569r = C13785b.a(C17474h.class.getName());

    /* renamed from: s, reason: collision with root package name */
    private static int f164570s;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC17472f f164571a;

    /* renamed from: b, reason: collision with root package name */
    private final Random f164572b;

    /* renamed from: d, reason: collision with root package name */
    private final Dt.f f164574d;

    /* renamed from: e, reason: collision with root package name */
    private final bb.e f164575e;

    /* renamed from: f, reason: collision with root package name */
    private final String f164576f;

    /* renamed from: g, reason: collision with root package name */
    private final nt.d f164577g;

    /* renamed from: h, reason: collision with root package name */
    private final nt.e f164578h;

    /* renamed from: j, reason: collision with root package name */
    private final C16318b f164580j;

    /* renamed from: k, reason: collision with root package name */
    private final At.a f164581k;

    /* renamed from: n, reason: collision with root package name */
    private long f164584n;

    /* renamed from: o, reason: collision with root package name */
    private long f164585o;

    /* renamed from: q, reason: collision with root package name */
    private Thread f164587q;

    /* renamed from: c, reason: collision with root package name */
    private List<C17467a> f164573c = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    private boolean f164582l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f164583m = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f164586p = true;

    /* renamed from: i, reason: collision with root package name */
    private final EnumC17479m f164579i = EnumC17479m.LOCATION;

    @Override // ut.InterfaceRunnableC17480n
    public final void a(long j10) {
        int i10 = a.C0039a.f2111a[this.f164581k.d().ordinal()];
        long jMin = Math.min(j10, 1800000L);
        if (this.f164584n < jMin) {
            this.f164584n = jMin;
        }
    }

    @Override // ut.InterfaceRunnableC17480n
    public final void c() {
        synchronized (this) {
            this.f164582l = true;
            notifyAll();
        }
    }

    @Override // ut.InterfaceRunnableC17480n
    public final void d() {
        synchronized (this) {
            notifyAll();
        }
    }

    public final synchronized void e() {
        if (this.f164586p) {
            while (this.f164587q != null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
            this.f164586p = false;
            Thread thread = new Thread(this, this.f164576f);
            this.f164587q = thread;
            thread.start();
        }
    }

    public final synchronized void f() {
        if (!this.f164586p) {
            this.f164586p = true;
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        C17467a c17467aRemove;
        try {
            this.f164580j.h(this);
            while (!this.f164586p) {
                this.f164582l = false;
                if (this.f164583m) {
                    this.f164584n = 100L;
                } else {
                    this.f164584n = this.f164581k.a();
                }
                if (this.f164583m) {
                    this.f164578h.a();
                    this.f164571a.b();
                    this.f164578h.b();
                } else {
                    this.f164578h.a();
                    h();
                    try {
                        if (this.f164573c.size() > 0) {
                            while (true) {
                                synchronized (this.f164573c) {
                                    try {
                                        if (this.f164573c.size() == 0) {
                                            break;
                                        } else {
                                            c17467aRemove = this.f164573c.remove(0);
                                        }
                                    } finally {
                                    }
                                }
                                this.f164571a.a(c17467aRemove);
                            }
                        } else {
                            h();
                            this.f164571a.a();
                        }
                        i();
                        this.f164578h.b();
                    } finally {
                    }
                }
                long jMax = this.f164584n;
                if (!this.f164583m) {
                    jMax = Math.max(1500L, jMax + (((this.f164572b.nextInt(7) * 30000) / 6) - 15000));
                }
                this.f164585o = jMax;
                this.f164583m = false;
                Thread.currentThread().isInterrupted();
                g();
                if (g()) {
                    nt.d dVar = this.f164577g;
                    long j10 = this.f164585o;
                    EnumC17479m enumC17479m = this.f164579i;
                    try {
                        Context context = dVar.f153256a;
                        Intent intent = new Intent();
                        intent.setPackage(dVar.f153259d);
                        intent.setAction(dVar.f153259d + "." + enumC17479m.name());
                        dVar.f153258c.setRepeating(0, dVar.f153257b.a() + j10, j10, PendingIntent.getBroadcast(context, 0, intent, 268435456));
                        enumC17479m.name();
                    } catch (Exception unused) {
                        nt.d.f153255f.g("Unable to set alarm for {} in: {} secs", enumC17479m.name(), Double.valueOf(j10 / 1000.0d));
                    }
                    try {
                        synchronized (this) {
                            try {
                                if (!this.f164586p) {
                                    wait(this.f164585o + 2000);
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
                this.f164586p = true;
                this.f164587q = null;
                notifyAll();
            }
        } catch (Throwable th3) {
            synchronized (this) {
                this.f164586p = true;
                this.f164587q = null;
                notifyAll();
                throw th3;
            }
        }
    }

    private boolean g() {
        return !this.f164582l;
    }

    private void h() {
        this.f164574d.c();
    }

    private void i() {
        this.f164574d.a(this.f164575e.a() + 5000);
    }

    @Override // ot.InterfaceC16317a
    public final void b(Activity activity) {
        if (activity != null) {
            synchronized (this) {
                this.f164583m = true;
                notifyAll();
            }
        }
    }

    @Override // ut.InterfaceRunnableC17480n
    public final void s0(double d10) {
        a((long) (this.f164584n * d10));
    }

    public C17474h(InterfaceC17472f interfaceC17472f, Dt.f fVar, C16318b c16318b, nt.d dVar, bb.e eVar, At.a aVar, C15115a c15115a) {
        this.f164580j = c16318b;
        this.f164581k = aVar;
        this.f164584n = aVar.a();
        StringBuilder sb2 = new StringBuilder("LocationMonitor-");
        int i10 = f164570s + 1;
        f164570s = i10;
        sb2.append(i10);
        String string = sb2.toString();
        this.f164576f = string;
        this.f164577g = dVar;
        this.f164578h = new nt.e(c15115a, string);
        this.f164571a = interfaceC17472f;
        this.f164574d = fVar;
        this.f164575e = eVar;
        fVar.b(this);
        this.f164572b = new Random(System.currentTimeMillis());
    }

    @Override // Dt.e
    public final void a(C17467a c17467a) {
        synchronized (this.f164573c) {
            this.f164573c.add(c17467a);
        }
        c();
    }
}
