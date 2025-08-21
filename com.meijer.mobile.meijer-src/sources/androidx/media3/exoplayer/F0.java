package androidx.media3.exoplayer;

import android.os.Looper;
import d3.C13599a;
import d3.InterfaceC13606h;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    private final b f55802a;

    /* renamed from: b, reason: collision with root package name */
    private final a f55803b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC13606h f55804c;

    /* renamed from: d, reason: collision with root package name */
    private final a3.F f55805d;

    /* renamed from: e, reason: collision with root package name */
    private int f55806e;

    /* renamed from: f, reason: collision with root package name */
    private Object f55807f;

    /* renamed from: g, reason: collision with root package name */
    private Looper f55808g;

    /* renamed from: h, reason: collision with root package name */
    private int f55809h;

    /* renamed from: i, reason: collision with root package name */
    private long f55810i = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private boolean f55811j = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f55812k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f55813l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f55814m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f55815n;

    public interface a {
        void h(F0 f02);
    }

    public interface b {
        void x(int i10, Object obj) throws ExoPlaybackException;
    }

    public synchronized boolean i() {
        return this.f55815n;
    }

    public synchronized void j(boolean z10) {
        this.f55813l = z10 | this.f55813l;
        this.f55814m = true;
        notifyAll();
    }

    public boolean a() {
        return this.f55811j;
    }

    public Looper b() {
        return this.f55808g;
    }

    public int c() {
        return this.f55809h;
    }

    public Object d() {
        return this.f55807f;
    }

    public long e() {
        return this.f55810i;
    }

    public b f() {
        return this.f55802a;
    }

    public a3.F g() {
        return this.f55805d;
    }

    public int h() {
        return this.f55806e;
    }

    public F0 k() {
        C13599a.g(!this.f55812k);
        if (this.f55810i == -9223372036854775807L) {
            C13599a.a(this.f55811j);
        }
        this.f55812k = true;
        this.f55803b.h(this);
        return this;
    }

    public F0 l(Object obj) {
        C13599a.g(!this.f55812k);
        this.f55807f = obj;
        return this;
    }

    public F0 m(int i10) {
        C13599a.g(!this.f55812k);
        this.f55806e = i10;
        return this;
    }

    public F0(a aVar, b bVar, a3.F f10, int i10, InterfaceC13606h interfaceC13606h, Looper looper) {
        this.f55803b = aVar;
        this.f55802a = bVar;
        this.f55805d = f10;
        this.f55808g = looper;
        this.f55804c = interfaceC13606h;
        this.f55809h = i10;
    }
}
