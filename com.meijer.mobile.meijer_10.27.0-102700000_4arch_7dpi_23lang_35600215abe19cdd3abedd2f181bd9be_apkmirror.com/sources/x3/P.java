package x3;

import d3.C13466a;
import java.io.IOException;
import x3.O;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f169098a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f169099b;

    /* renamed from: c, reason: collision with root package name */
    private int f169100c;

    /* renamed from: d, reason: collision with root package name */
    private long f169101d;

    /* renamed from: e, reason: collision with root package name */
    private int f169102e;

    /* renamed from: f, reason: collision with root package name */
    private int f169103f;

    /* renamed from: g, reason: collision with root package name */
    private int f169104g;

    public void b() {
        this.f169099b = false;
        this.f169100c = 0;
    }

    public void a(O o10, O.a aVar) {
        if (this.f169100c > 0) {
            o10.c(this.f169101d, this.f169102e, this.f169103f, this.f169104g, aVar);
            this.f169100c = 0;
        }
    }

    public void c(O o10, long j10, int i10, int i11, int i12, O.a aVar) {
        C13466a.h(this.f169104g <= i11 + i12, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f169099b) {
            int i13 = this.f169100c;
            int i14 = i13 + 1;
            this.f169100c = i14;
            if (i13 == 0) {
                this.f169101d = j10;
                this.f169102e = i10;
                this.f169103f = 0;
            }
            this.f169103f += i11;
            this.f169104g = i12;
            if (i14 >= 16) {
                a(o10, aVar);
            }
        }
    }

    public void d(InterfaceC18012q interfaceC18012q) throws IOException {
        if (this.f169099b) {
            return;
        }
        interfaceC18012q.m(this.f169098a, 0, 10);
        interfaceC18012q.d();
        if (C17997b.j(this.f169098a) == 0) {
            return;
        }
        this.f169099b = true;
    }
}
