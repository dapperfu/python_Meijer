package c5;

import U0.k;
import V0.C5490r0;
import android.os.SystemClock;
import androidx.compose.runtime.A0;
import androidx.compose.runtime.C5844c1;
import androidx.compose.runtime.InterfaceC5866i0;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.n0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B;\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0015\u001a\u00020\u0014*\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0014*\u00020\u0010H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0014¢\u0006\u0004\b!\u0010\"R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R+\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00105R\u0016\u00107\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010+R+\u0010=\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R/\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010-\u001a\u0004\u0018\u00010\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b>\u0010@\"\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u000f¨\u0006D"}, d2 = {"Lc5/o;", "LZ0/c;", "start", "end", "Landroidx/compose/ui/layout/k;", "contentScale", "", "durationMillis", "", "fadeStart", "preferExactIntrinsicSize", "<init>", "(LZ0/c;LZ0/c;Landroidx/compose/ui/layout/k;IZZ)V", "LU0/k;", "o", "()J", "LX0/f;", PlaceTypes.PAINTER, "", "alpha", "", "p", "(LX0/f;LZ0/c;F)V", "srcSize", "dstSize", "n", "(JJ)J", "m", "(LX0/f;)V", "a", "(F)Z", "LV0/r0;", "colorFilter", "c", "(LV0/r0;)Z", "g", "LZ0/c;", "h", "i", "Landroidx/compose/ui/layout/k;", "j", "I", "k", "Z", "l", "<set-?>", "Landroidx/compose/runtime/j0;", "r", "()I", "u", "(I)V", "invalidateTick", "", "J", "startTimeMillis", "isDone", "Landroidx/compose/runtime/i0;", "s", "()F", "v", "(F)V", "maxAlpha", "q", "Landroidx/compose/runtime/l0;", "()LV0/r0;", "t", "(LV0/r0;)V", "intrinsicSize", "coil-compose-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class o extends Z0.c {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Z0.c start;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Z0.c end;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5926k contentScale;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int durationMillis;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean fadeStart;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean preferExactIntrinsicSize;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean isDone;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5868j0 invalidateTick = C5844c1.a(0);

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long startTimeMillis = -1;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5866i0 maxAlpha = A0.a(1.0f);

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 colorFilter = t1.e(null, null, 2, null);

    private final long n(long srcSize, long dstSize) {
        k.Companion companion = U0.k.INSTANCE;
        return (srcSize == companion.a() || U0.k.k(srcSize) || dstSize == companion.a() || U0.k.k(dstSize)) ? dstSize : n0.a(srcSize, this.contentScale.a(srcSize, dstSize));
    }

    private final long o() {
        Z0.c cVar = this.start;
        long jK = cVar != null ? cVar.k() : U0.k.INSTANCE.b();
        Z0.c cVar2 = this.end;
        long jK2 = cVar2 != null ? cVar2.k() : U0.k.INSTANCE.b();
        k.Companion companion = U0.k.INSTANCE;
        boolean z10 = jK != companion.a();
        boolean z11 = jK2 != companion.a();
        if (z10 && z11) {
            return U0.l.a(Math.max(U0.k.i(jK), U0.k.i(jK2)), Math.max(U0.k.g(jK), U0.k.g(jK2)));
        }
        if (this.preferExactIntrinsicSize) {
            if (z10) {
                return jK;
            }
            if (z11) {
                return jK2;
            }
        }
        return companion.a();
    }

    private final void p(X0.f fVar, Z0.c cVar, float f10) {
        if (cVar == null || f10 <= 0.0f) {
            return;
        }
        long jB = fVar.b();
        long jN = n(cVar.k(), jB);
        if (jB == U0.k.INSTANCE.a() || U0.k.k(jB)) {
            cVar.j(fVar, jN, f10, q());
            return;
        }
        float f11 = 2;
        float fI = (U0.k.i(jB) - U0.k.i(jN)) / f11;
        float fG = (U0.k.g(jB) - U0.k.g(jN)) / f11;
        fVar.getDrawContext().getTransform().j(fI, fG, fI, fG);
        cVar.j(fVar, jN, f10, q());
        X0.h transform = fVar.getDrawContext().getTransform();
        float f12 = -fI;
        float f13 = -fG;
        transform.j(f12, f13, f12, f13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final C5490r0 q() {
        return (C5490r0) this.colorFilter.getValue();
    }

    private final int r() {
        return this.invalidateTick.a();
    }

    private final float s() {
        return this.maxAlpha.b();
    }

    private final void t(C5490r0 c5490r0) {
        this.colorFilter.setValue(c5490r0);
    }

    private final void u(int i10) {
        this.invalidateTick.i(i10);
    }

    private final void v(float f10) {
        this.maxAlpha.A(f10);
    }

    @Override // Z0.c
    protected void m(X0.f fVar) {
        if (this.isDone) {
            p(fVar, this.end, s());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.startTimeMillis == -1) {
            this.startTimeMillis = jUptimeMillis;
        }
        float f10 = (jUptimeMillis - this.startTimeMillis) / this.durationMillis;
        float fN = RangesKt.n(f10, 0.0f, 1.0f) * s();
        float fS = this.fadeStart ? s() - fN : s();
        this.isDone = f10 >= 1.0f;
        p(fVar, this.start, fS);
        p(fVar, this.end, fN);
        if (this.isDone) {
            this.start = null;
        } else {
            u(r() + 1);
        }
    }

    public o(Z0.c cVar, Z0.c cVar2, InterfaceC5926k interfaceC5926k, int i10, boolean z10, boolean z11) {
        this.start = cVar;
        this.end = cVar2;
        this.contentScale = interfaceC5926k;
        this.durationMillis = i10;
        this.fadeStart = z10;
        this.preferExactIntrinsicSize = z11;
    }

    @Override // Z0.c
    protected boolean a(float alpha) {
        v(alpha);
        return true;
    }

    @Override // Z0.c
    protected boolean c(C5490r0 colorFilter) {
        t(colorFilter);
        return true;
    }

    @Override // Z0.c
    public long k() {
        return o();
    }
}
