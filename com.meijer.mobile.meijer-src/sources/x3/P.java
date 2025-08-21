package x3;

import d3.C13599a;
import java.io.IOException;
import x3.O;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f170186a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f170187b;

    /* renamed from: c, reason: collision with root package name */
    private int f170188c;

    /* renamed from: d, reason: collision with root package name */
    private long f170189d;

    /* renamed from: e, reason: collision with root package name */
    private int f170190e;

    /* renamed from: f, reason: collision with root package name */
    private int f170191f;

    /* renamed from: g, reason: collision with root package name */
    private int f170192g;

    public void b() {
        this.f170187b = false;
        this.f170188c = 0;
    }

    public void a(O o10, O.a aVar) {
        if (this.f170188c > 0) {
            o10.c(this.f170189d, this.f170190e, this.f170191f, this.f170192g, aVar);
            this.f170188c = 0;
        }
    }

    public void c(O o10, long j10, int i10, int i11, int i12, O.a aVar) {
        C13599a.h(this.f170192g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f170187b) {
            int i13 = this.f170188c;
            int i14 = i13 + 1;
            this.f170188c = i14;
            if (i13 == 0) {
                this.f170189d = j10;
                this.f170190e = i10;
                this.f170191f = 0;
            }
            this.f170191f += i11;
            this.f170192g = i12;
            if (i14 >= 16) {
                a(o10, aVar);
            }
        }
    }

    public void d(InterfaceC18078q interfaceC18078q) throws IOException {
        if (this.f170187b) {
            return;
        }
        interfaceC18078q.m(this.f170186a, 0, 10);
        interfaceC18078q.d();
        if (C18063b.j(this.f170186a) == 0) {
            return;
        }
        this.f170187b = true;
    }
}
