package Z0;

import H1.t;
import U0.h;
import U0.k;
import V0.C5347r0;
import V0.P;
import V0.o1;
import X0.f;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0014H$¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00172\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ2\u0010!\u001a\u00020\t*\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0016\u0010'\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010(R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010)R\u0016\u0010\u001c\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R%\u00100\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\t0,¢\u0006\u0002\b-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00103\u001a\u00020\u001f8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b1\u00102\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00064"}, d2 = {"LZ0/c;", "", "<init>", "()V", "LV0/o1;", "l", "()LV0/o1;", "LV0/r0;", "colorFilter", "", "h", "(LV0/r0;)V", "", "alpha", "g", "(F)V", "LH1/t;", "rtl", "i", "(LH1/t;)V", "LX0/f;", "m", "(LX0/f;)V", "", "a", "(F)Z", "c", "(LV0/r0;)Z", "layoutDirection", "d", "(LH1/t;)Z", "LU0/k;", "size", "j", "(LX0/f;JFLV0/r0;)V", "LV0/o1;", "layerPaint", "b", "Z", "useLayer", "LV0/r0;", "F", "e", "LH1/t;", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "f", "Lkotlin/jvm/functions/Function1;", "drawLambda", "k", "()J", "intrinsicSize", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private o1 layerPaint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean useLayer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C5347r0 colorFilter;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float alpha = 1.0f;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection = t.f12006a;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function1<f, Unit> drawLambda = new a();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<f, Unit> {
        a() {
            super(1);
        }

        public final void a(f fVar) {
            c.this.m(fVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f fVar) {
            a(fVar);
            return Unit.f142422a;
        }
    }

    protected boolean a(float alpha) {
        return false;
    }

    protected boolean c(C5347r0 colorFilter) {
        return false;
    }

    protected boolean d(t layoutDirection) {
        return false;
    }

    public abstract long k();

    protected abstract void m(f fVar);

    private final void g(float alpha) {
        if (this.alpha == alpha) {
            return;
        }
        if (!a(alpha)) {
            if (alpha == 1.0f) {
                o1 o1Var = this.layerPaint;
                if (o1Var != null) {
                    o1Var.d(alpha);
                }
                this.useLayer = false;
            } else {
                l().d(alpha);
                this.useLayer = true;
            }
        }
        this.alpha = alpha;
    }

    private final void h(C5347r0 colorFilter) {
        if (Intrinsics.e(this.colorFilter, colorFilter)) {
            return;
        }
        if (!c(colorFilter)) {
            if (colorFilter == null) {
                o1 o1Var = this.layerPaint;
                if (o1Var != null) {
                    o1Var.z(null);
                }
                this.useLayer = false;
            } else {
                l().z(colorFilter);
                this.useLayer = true;
            }
        }
        this.colorFilter = colorFilter;
    }

    private final void i(t rtl) {
        if (this.layoutDirection != rtl) {
            d(rtl);
            this.layoutDirection = rtl;
        }
    }

    private final o1 l() {
        o1 o1Var = this.layerPaint;
        if (o1Var != null) {
            return o1Var;
        }
        o1 o1VarA = P.a();
        this.layerPaint = o1VarA;
        return o1VarA;
    }

    public final void j(f fVar, long j10, float f10, C5347r0 c5347r0) {
        g(f10);
        h(c5347r0);
        i(fVar.getLayoutDirection());
        int i10 = (int) (j10 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() >> 32)) - Float.intBitsToFloat(i10);
        int i11 = (int) (j10 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - Float.intBitsToFloat(i11);
        fVar.getDrawContext().getTransform().j(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f10 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i10) > 0.0f && Float.intBitsToFloat(i11) > 0.0f) {
                    if (this.useLayer) {
                        long jC = U0.f.INSTANCE.c();
                        float fIntBitsToFloat3 = Float.intBitsToFloat(i10);
                        float fIntBitsToFloat4 = Float.intBitsToFloat(i11);
                        Rect rectB = h.b(jC, k.d((Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32)));
                        Canvas canvasG = fVar.getDrawContext().g();
                        try {
                            canvasG.q(rectB, l());
                            m(fVar);
                            canvasG.i();
                        } catch (Throwable th2) {
                            canvasG.i();
                            throw th2;
                        }
                    } else {
                        m(fVar);
                    }
                }
            } catch (Throwable th3) {
                fVar.getDrawContext().getTransform().j(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
                throw th3;
            }
        }
        fVar.getDrawContext().getTransform().j(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
    }
}
