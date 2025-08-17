package o3;

import a3.t;
import a3.y;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.AbstractC6052h;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.source.r;
import d3.C13466a;
import d3.P;
import h3.G;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends AbstractC6052h implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    private y f153154A;

    /* renamed from: B, reason: collision with root package name */
    private long f153155B;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC15994a f153156r;

    /* renamed from: s, reason: collision with root package name */
    private final b f153157s;

    /* renamed from: t, reason: collision with root package name */
    private final Handler f153158t;

    /* renamed from: u, reason: collision with root package name */
    private final G3.b f153159u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f153160v;

    /* renamed from: w, reason: collision with root package name */
    private G3.a f153161w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f153162x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f153163y;

    /* renamed from: z, reason: collision with root package name */
    private long f153164z;

    public c(b bVar, Looper looper) {
        this(bVar, looper, InterfaceC15994a.f153153a);
    }

    private void r0(y yVar, List<y.a> list) {
        for (int i10 = 0; i10 < yVar.e(); i10++) {
            t tVarA = yVar.d(i10).a();
            if (tVarA == null || !this.f153156r.a(tVarA)) {
                list.add(yVar.d(i10));
            } else {
                G3.a aVarB = this.f153156r.b(tVarA);
                byte[] bArr = (byte[]) C13466a.e(yVar.d(i10).c());
                this.f153159u.o();
                this.f153159u.F(bArr.length);
                ((ByteBuffer) P.h(this.f153159u.f55465d)).put(bArr);
                this.f153159u.G();
                y yVarA = aVarB.a(this.f153159u);
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

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void d0() {
        this.f153154A = null;
        this.f153161w = null;
        this.f153155B = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void g0(long j10, boolean z10) {
        this.f153154A = null;
        this.f153162x = false;
        this.f153163y = false;
    }

    @Override // androidx.media3.exoplayer.H0
    public void h(long j10, long j11) {
        boolean zV0 = true;
        while (zV0) {
            w0();
            zV0 = v0(j10);
        }
    }

    public c(b bVar, Looper looper, InterfaceC15994a interfaceC15994a) {
        this(bVar, looper, interfaceC15994a, false);
    }

    private void t0(y yVar) {
        Handler handler = this.f153158t;
        if (handler != null) {
            handler.obtainMessage(1, yVar).sendToTarget();
        } else {
            u0(yVar);
        }
    }

    private void u0(y yVar) {
        this.f153157s.q(yVar);
    }

    private boolean v0(long j10) {
        boolean z10;
        y yVar = this.f153154A;
        if (yVar == null || (!this.f153160v && yVar.f44257b > s0(j10))) {
            z10 = false;
        } else {
            t0(this.f153154A);
            this.f153154A = null;
            z10 = true;
        }
        if (this.f153162x && this.f153154A == null) {
            this.f153163y = true;
        }
        return z10;
    }

    private void w0() {
        if (this.f153162x || this.f153154A != null) {
            return;
        }
        this.f153159u.o();
        G gV = V();
        int iO0 = o0(gV, this.f153159u, 0);
        if (iO0 != -4) {
            if (iO0 == -5) {
                this.f153164z = ((t) C13466a.e(gV.f134191b)).f43954t;
                return;
            }
            return;
        }
        if (this.f153159u.u()) {
            this.f153162x = true;
            return;
        }
        if (this.f153159u.f55467f >= X()) {
            G3.b bVar = this.f153159u;
            bVar.f11255j = this.f153164z;
            bVar.G();
            y yVarA = ((G3.a) P.h(this.f153161w)).a(this.f153159u);
            if (yVarA != null) {
                ArrayList arrayList = new ArrayList(yVarA.e());
                r0(yVarA, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.f153154A = new y(s0(this.f153159u.f55467f), arrayList);
            }
        }
    }

    @Override // androidx.media3.exoplayer.I0
    public int a(t tVar) {
        if (this.f153156r.a(tVar)) {
            return I0.v(tVar.f43933N == 0 ? 4 : 2);
        }
        return I0.v(0);
    }

    @Override // androidx.media3.exoplayer.H0
    public boolean c() {
        return this.f153163y;
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

    @Override // androidx.media3.exoplayer.AbstractC6052h
    protected void m0(t[] tVarArr, long j10, long j11, r.b bVar) {
        this.f153161w = this.f153156r.b(tVarArr[0]);
        y yVar = this.f153154A;
        if (yVar != null) {
            this.f153154A = yVar.c((yVar.f44257b + this.f153155B) - j11);
        }
        this.f153155B = j11;
    }

    public c(b bVar, Looper looper, InterfaceC15994a interfaceC15994a, boolean z10) {
        super(5);
        this.f153157s = (b) C13466a.e(bVar);
        this.f153158t = looper == null ? null : P.y(looper, this);
        this.f153156r = (InterfaceC15994a) C13466a.e(interfaceC15994a);
        this.f153160v = z10;
        this.f153159u = new G3.b();
        this.f153155B = -9223372036854775807L;
    }

    private long s0(long j10) {
        boolean z10;
        boolean z11 = false;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.g(z10);
        if (this.f153155B != -9223372036854775807L) {
            z11 = true;
        }
        C13466a.g(z11);
        return j10 - this.f153155B;
    }
}
