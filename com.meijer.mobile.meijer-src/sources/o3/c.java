package o3;

import a3.t;
import a3.y;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.AbstractC6194h;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import d3.P;
import h3.G;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends AbstractC6194h implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    private y f153599A;

    /* renamed from: B, reason: collision with root package name */
    private long f153600B;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC16069a f153601r;

    /* renamed from: s, reason: collision with root package name */
    private final b f153602s;

    /* renamed from: t, reason: collision with root package name */
    private final Handler f153603t;

    /* renamed from: u, reason: collision with root package name */
    private final G3.b f153604u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f153605v;

    /* renamed from: w, reason: collision with root package name */
    private G3.a f153606w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f153607x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f153608y;

    /* renamed from: z, reason: collision with root package name */
    private long f153609z;

    public c(b bVar, Looper looper) {
        this(bVar, looper, InterfaceC16069a.f153598a);
    }

    private void r0(y yVar, List<y.a> list) {
        for (int i10 = 0; i10 < yVar.e(); i10++) {
            t tVarA = yVar.d(i10).a();
            if (tVarA == null || !this.f153601r.a(tVarA)) {
                list.add(yVar.d(i10));
            } else {
                G3.a aVarB = this.f153601r.b(tVarA);
                byte[] bArr = (byte[]) C13599a.e(yVar.d(i10).c());
                this.f153604u.o();
                this.f153604u.F(bArr.length);
                ((ByteBuffer) P.h(this.f153604u.f55689d)).put(bArr);
                this.f153604u.G();
                y yVarA = aVarB.a(this.f153604u);
                if (yVarA != null) {
                    r0(yVarA, list);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean b() {
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void d0() {
        this.f153599A = null;
        this.f153606w = null;
        this.f153600B = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void g0(long j10, boolean z10) {
        this.f153599A = null;
        this.f153607x = false;
        this.f153608y = false;
    }

    @Override // androidx.media3.exoplayer.H0
    public void h(long j10, long j11) {
        boolean zV0 = true;
        while (zV0) {
            w0();
            zV0 = v0(j10);
        }
    }

    public c(b bVar, Looper looper, InterfaceC16069a interfaceC16069a) {
        this(bVar, looper, interfaceC16069a, false);
    }

    private void t0(y yVar) {
        Handler handler = this.f153603t;
        if (handler != null) {
            handler.obtainMessage(1, yVar).sendToTarget();
        } else {
            u0(yVar);
        }
    }

    private void u0(y yVar) {
        this.f153602s.q(yVar);
    }

    private boolean v0(long j10) {
        boolean z10;
        y yVar = this.f153599A;
        if (yVar == null || (!this.f153605v && yVar.f45075b > s0(j10))) {
            z10 = false;
        } else {
            t0(this.f153599A);
            this.f153599A = null;
            z10 = true;
        }
        if (this.f153607x && this.f153599A == null) {
            this.f153608y = true;
        }
        return z10;
    }

    private void w0() {
        if (this.f153607x || this.f153599A != null) {
            return;
        }
        this.f153604u.o();
        G gV = V();
        int iO0 = o0(gV, this.f153604u, 0);
        if (iO0 != -4) {
            if (iO0 == -5) {
                this.f153609z = ((t) C13599a.e(gV.f134662b)).f44772t;
                return;
            }
            return;
        }
        if (this.f153604u.u()) {
            this.f153607x = true;
            return;
        }
        if (this.f153604u.f55691f >= X()) {
            G3.b bVar = this.f153604u;
            bVar.f11180j = this.f153609z;
            bVar.G();
            y yVarA = ((G3.a) P.h(this.f153606w)).a(this.f153604u);
            if (yVarA != null) {
                ArrayList arrayList = new ArrayList(yVarA.e());
                r0(yVarA, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f153599A = new y(s0(this.f153604u.f55691f), arrayList);
            }
        }
    }

    @Override // androidx.media3.exoplayer.I0
    public int a(t tVar) {
        if (this.f153601r.a(tVar)) {
            return I0.v(tVar.f44751N == 0 ? 4 : 2);
        }
        return I0.v(0);
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean c() {
        return this.f153608y;
    }

    @Override // androidx.media3.exoplayer.H0, androidx.media3.exoplayer.I0
    public String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        u0((y) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.AbstractC6194h
    protected void m0(t[] tVarArr, long j10, long j11, r.b bVar) {
        this.f153606w = this.f153601r.b(tVarArr[0]);
        y yVar = this.f153599A;
        if (yVar != null) {
            this.f153599A = yVar.c((yVar.f45075b + this.f153600B) - j11);
        }
        this.f153600B = j11;
    }

    public c(b bVar, Looper looper, InterfaceC16069a interfaceC16069a, boolean z10) {
        super(5);
        this.f153602s = (b) C13599a.e(bVar);
        this.f153603t = looper == null ? null : P.y(looper, this);
        this.f153601r = (InterfaceC16069a) C13599a.e(interfaceC16069a);
        this.f153605v = z10;
        this.f153604u = new G3.b();
        this.f153600B = -9223372036854775807L;
    }

    private long s0(long j10) {
        boolean z10;
        boolean z11 = false;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.g(z10);
        if (this.f153600B != -9223372036854775807L) {
            z11 = true;
        }
        C13599a.g(z11);
        return j10 - this.f153600B;
    }
}
