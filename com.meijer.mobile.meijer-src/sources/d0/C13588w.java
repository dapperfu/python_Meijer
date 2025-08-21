package d0;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.node.AbstractC5959m;
import androidx.compose.ui.node.InterfaceC5956j;
import androidx.compose.ui.node.InterfaceC5965t;
import j0.InterfaceC14882C;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0014\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J'\u0010\u0019\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J'\u0010\u001b\u001a\u00020\u0013*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0015J6\u0010!\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u000e2\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0013\u0010%\u001a\u00020$*\u00020#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Ld0/w;", "Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/node/t;", "Landroidx/compose/ui/node/j;", "pointerInputNode", "Ld0/a;", "overscrollEffect", "Ld0/s;", "edgeEffectWrapper", "Lj0/C;", "glowDrawPadding", "<init>", "(Landroidx/compose/ui/node/j;Ld0/a;Ld0/s;Lj0/C;)V", "LX0/f;", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "", "R2", "(LX0/f;Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "T2", "right", "S2", "bottom", "Q2", "", "rotationDegrees", "LU0/f;", "offset", "edgeEffect", "U2", "(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "LX0/c;", "", "I", "(LX0/c;)V", "q", "Ld0/a;", "r", "Ld0/s;", "s", "Lj0/C;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: d0.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C13588w extends AbstractC5959m implements InterfaceC5965t {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final C13567a overscrollEffect;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final C13584s edgeEffectWrapper;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14882C glowDrawPadding;

    private final boolean Q2(X0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        float fI1 = fVar.I1(this.glowDrawPadding.getBottom());
        float f10 = -Float.intBitsToFloat((int) (fVar.b() >> 32));
        float f11 = (-Float.intBitsToFloat((int) (fVar.b() & 4294967295L))) + fI1;
        return U2(180.0f, U0.f.e((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)), edgeEffect, canvas);
    }

    private final boolean T2(X0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        float fI1 = fVar.I1(this.glowDrawPadding.getTop());
        return U2(0.0f, U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(fI1) & 4294967295L)), edgeEffect, canvas);
    }

    @Override // androidx.compose.ui.node.InterfaceC5965t
    public void I(X0.c cVar) {
        this.overscrollEffect.p(cVar.b());
        if (U0.k.k(cVar.b())) {
            cVar.a2();
            return;
        }
        cVar.a2();
        this.overscrollEffect.i().getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(cVar.getDrawContext().g());
        C13584s c13584s = this.edgeEffectWrapper;
        boolean zR2 = c13584s.s() ? R2(cVar, c13584s.i(), nativeCanvas) : false;
        if (c13584s.z()) {
            zR2 = T2(cVar, c13584s.m(), nativeCanvas) || zR2;
        }
        if (c13584s.v()) {
            zR2 = S2(cVar, c13584s.k(), nativeCanvas) || zR2;
        }
        if (c13584s.p()) {
            zR2 = Q2(cVar, c13584s.g(), nativeCanvas) || zR2;
        }
        if (zR2) {
            this.overscrollEffect.j();
        }
    }

    public C13588w(InterfaceC5956j interfaceC5956j, C13567a c13567a, C13584s c13584s, InterfaceC14882C interfaceC14882C) {
        this.overscrollEffect = c13567a;
        this.edgeEffectWrapper = c13584s;
        this.glowDrawPadding = interfaceC14882C;
        K2(interfaceC5956j);
    }

    private final boolean R2(X0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        float f10 = -Float.intBitsToFloat((int) (fVar.b() & 4294967295L));
        float fI1 = fVar.I1(this.glowDrawPadding.b(fVar.getLayoutDirection()));
        return U2(270.0f, U0.f.e((Float.floatToRawIntBits(f10) << 32) | (4294967295L & Float.floatToRawIntBits(fI1))), edgeEffect, canvas);
    }

    private final boolean S2(X0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        float fI1 = (-MathKt.d(Float.intBitsToFloat((int) (fVar.b() >> 32)))) + fVar.I1(this.glowDrawPadding.c(fVar.getLayoutDirection()));
        return U2(90.0f, U0.f.e((Float.floatToRawIntBits(fI1) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32)), edgeEffect, canvas);
    }

    private final boolean U2(float rotationDegrees, long offset, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(rotationDegrees);
        canvas.translate(Float.intBitsToFloat((int) (offset >> 32)), Float.intBitsToFloat((int) (offset & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }
}
