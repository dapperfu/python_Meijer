package androidx.media3.exoplayer;

import android.os.Looper;
import d3.C13466a;
import d3.InterfaceC13473h;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    private final b f55578a;

    /* renamed from: b, reason: collision with root package name */
    private final a f55579b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC13473h f55580c;

    /* renamed from: d, reason: collision with root package name */
    private final a3.F f55581d;

    /* renamed from: e, reason: collision with root package name */
    private int f55582e;

    /* renamed from: f, reason: collision with root package name */
    private Object f55583f;

    /* renamed from: g, reason: collision with root package name */
    private Looper f55584g;

    /* renamed from: h, reason: collision with root package name */
    private int f55585h;

    /* renamed from: i, reason: collision with root package name */
    private long f55586i = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private boolean f55587j = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f55588k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f55589l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f55590m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f55591n;

    public interface a {
        void h(F0 f02);
    }

    public interface b {
        void x(int i10, Object obj) throws ExoPlaybackException;
    }

    public synchronized boolean i() {
        return this.f55591n;
    }

    public synchronized void j(boolean z10) {
        this.f55589l = z10 | this.f55589l;
        this.f55590m = true;
        notifyAll();
    }

    public boolean a() {
        return this.f55587j;
    }

    public Looper b() {
        return this.f55584g;
    }

    public int c() {
        return this.f55585h;
    }

    public Object d() {
        return this.f55583f;
    }

    public long e() {
        return this.f55586i;
    }

    public b f() {
        return this.f55578a;
    }

    public a3.F g() {
        return this.f55581d;
    }

    public int h() {
        return this.f55582e;
    }

    public F0 k() {
        C13466a.g(!this.f55588k);
        if (this.f55586i == -9223372036854775807L) {
            C13466a.a(this.f55587j);
        }
        this.f55588k = true;
        this.f55579b.h(this);
        return this;
    }

    public F0 l(Object obj) {
        C13466a.g(!this.f55588k);
        this.f55583f = obj;
        return this;
    }

    public F0 m(int i10) {
        C13466a.g(!this.f55588k);
        this.f55582e = i10;
        return this;
    }

    public F0(a aVar, b bVar, a3.F f10, int i10, InterfaceC13473h interfaceC13473h, Looper looper) {
        this.f55579b = aVar;
        this.f55578a = bVar;
        this.f55581d = f10;
        this.f55584g = looper;
        this.f55580c = interfaceC13473h;
        this.f55585h = i10;
    }
}
