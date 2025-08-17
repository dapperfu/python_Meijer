package d0;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.widget.EdgeEffect;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.AbstractC5817m;
import androidx.compose.ui.node.InterfaceC5814j;
import androidx.compose.ui.node.InterfaceC5823t;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J#\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J#\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u0015J+\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000f2\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010#\u001a\u00020\"*\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Ld0/b0;", "Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/node/t;", "Landroidx/compose/ui/node/j;", "pointerInputNode", "Ld0/a;", "overscrollEffect", "Ld0/s;", "edgeEffectWrapper", "<init>", "(Landroidx/compose/ui/node/j;Ld0/a;Ld0/s;)V", "", "X2", "()Z", "W2", "Landroid/widget/EdgeEffect;", "left", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "canvas", "R2", "(Landroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "top", "T2", "right", "S2", "bottom", "Q2", "", "rotationDegrees", "edgeEffect", "U2", "(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z", "LX0/c;", "", "I", "(LX0/c;)V", "q", "Ld0/a;", "r", "Ld0/s;", "Landroid/graphics/RenderNode;", "s", "Landroid/graphics/RenderNode;", "_renderNode", "V2", "()Landroid/graphics/RenderNode;", "renderNode", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class b0 extends AbstractC5817m implements InterfaceC5823t {

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final C13434a overscrollEffect;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final C13451s edgeEffectWrapper;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private RenderNode _renderNode;

    private final boolean T2(EdgeEffect top, Canvas canvas) {
        return U2(0.0f, top, canvas);
    }

    private final boolean U2(float rotationDegrees, EdgeEffect edgeEffect, Canvas canvas) {
        if (rotationDegrees == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(rotationDegrees);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean Q2(EdgeEffect bottom, Canvas canvas) {
        return U2(180.0f, bottom, canvas);
    }

    private final boolean R2(EdgeEffect left, Canvas canvas) {
        return U2(270.0f, left, canvas);
    }

    private final boolean S2(EdgeEffect right, Canvas canvas) {
        return U2(90.0f, right, canvas);
    }

    private final RenderNode V2() {
        RenderNode renderNode = this._renderNode;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNodeA = W.a("AndroidEdgeEffectOverscrollEffect");
        this._renderNode = renderNodeA;
        return renderNodeA;
    }

    private final boolean W2() {
        C13451s c13451s = this.edgeEffectWrapper;
        return c13451s.s() || c13451s.t() || c13451s.v() || c13451s.w();
    }

    private final boolean X2() {
        C13451s c13451s = this.edgeEffectWrapper;
        return c13451s.z() || c13451s.A() || c13451s.p() || c13451s.q();
    }

    @Override // androidx.compose.ui.node.InterfaceC5823t
    public void I(X0.c cVar) {
        long j10;
        boolean zR2;
        float f10;
        float f11;
        this.overscrollEffect.p(cVar.b());
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(cVar.getDrawContext().g());
        this.overscrollEffect.i().getValue();
        if (U0.k.k(cVar.b())) {
            cVar.a2();
            return;
        }
        if (!nativeCanvas.isHardwareAccelerated()) {
            this.edgeEffectWrapper.f();
            cVar.a2();
            return;
        }
        float fI1 = cVar.I1(C13446m.b());
        C13451s c13451s = this.edgeEffectWrapper;
        boolean zX2 = X2();
        boolean zW2 = W2();
        if (zX2 && zW2) {
            V2().setPosition(0, 0, nativeCanvas.getWidth(), nativeCanvas.getHeight());
        } else if (zX2) {
            V2().setPosition(0, 0, nativeCanvas.getWidth() + (MathKt.d(fI1) * 2), nativeCanvas.getHeight());
        } else {
            if (!zW2) {
                cVar.a2();
                return;
            }
            V2().setPosition(0, 0, nativeCanvas.getWidth(), nativeCanvas.getHeight() + (MathKt.d(fI1) * 2));
        }
        RecordingCanvas recordingCanvasBeginRecording = V2().beginRecording();
        if (c13451s.t()) {
            EdgeEffect edgeEffectJ = c13451s.j();
            S2(edgeEffectJ, recordingCanvasBeginRecording);
            edgeEffectJ.finish();
        }
        if (c13451s.s()) {
            EdgeEffect edgeEffectI = c13451s.i();
            zR2 = R2(edgeEffectI, recordingCanvasBeginRecording);
            if (c13451s.u()) {
                float fIntBitsToFloat = Float.intBitsToFloat((int) (this.overscrollEffect.h() & 4294967295L));
                C13450q c13450q = C13450q.f126991a;
                j10 = 4294967295L;
                c13450q.e(c13451s.j(), c13450q.c(edgeEffectI), 1 - fIntBitsToFloat);
            } else {
                j10 = 4294967295L;
            }
        } else {
            j10 = 4294967295L;
            zR2 = false;
        }
        if (c13451s.A()) {
            EdgeEffect edgeEffectN = c13451s.n();
            Q2(edgeEffectN, recordingCanvasBeginRecording);
            edgeEffectN.finish();
        }
        if (c13451s.z()) {
            EdgeEffect edgeEffectM = c13451s.m();
            zR2 = T2(edgeEffectM, recordingCanvasBeginRecording) || zR2;
            if (c13451s.B()) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.overscrollEffect.h() >> 32));
                C13450q c13450q2 = C13450q.f126991a;
                c13450q2.e(c13451s.n(), c13450q2.c(edgeEffectM), fIntBitsToFloat2);
            }
        }
        if (c13451s.w()) {
            EdgeEffect edgeEffectL = c13451s.l();
            R2(edgeEffectL, recordingCanvasBeginRecording);
            edgeEffectL.finish();
        }
        if (c13451s.v()) {
            EdgeEffect edgeEffectK = c13451s.k();
            zR2 = S2(edgeEffectK, recordingCanvasBeginRecording) || zR2;
            if (c13451s.x()) {
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.overscrollEffect.h() & j10));
                C13450q c13450q3 = C13450q.f126991a;
                c13450q3.e(c13451s.l(), c13450q3.c(edgeEffectK), fIntBitsToFloat3);
            }
        }
        if (c13451s.q()) {
            EdgeEffect edgeEffectH = c13451s.h();
            T2(edgeEffectH, recordingCanvasBeginRecording);
            edgeEffectH.finish();
        }
        if (c13451s.p()) {
            EdgeEffect edgeEffectG = c13451s.g();
            boolean z10 = Q2(edgeEffectG, recordingCanvasBeginRecording) || zR2;
            if (c13451s.r()) {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.overscrollEffect.h() >> 32));
                C13450q c13450q4 = C13450q.f126991a;
                c13450q4.e(c13451s.h(), c13450q4.c(edgeEffectG), 1 - fIntBitsToFloat4);
            }
            zR2 = z10;
        }
        if (zR2) {
            this.overscrollEffect.j();
        }
        float f12 = zW2 ? 0.0f : fI1;
        if (zX2) {
            fI1 = 0.0f;
        }
        H1.t layoutDirection = cVar.getLayoutDirection();
        androidx.compose.ui.graphics.Canvas Canvas = AndroidCanvas_androidKt.Canvas(recordingCanvasBeginRecording);
        long jB = cVar.b();
        H1.d density = cVar.getDrawContext().getDensity();
        H1.t layoutDirection2 = cVar.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvasG = cVar.getDrawContext().g();
        long jB2 = cVar.getDrawContext().b();
        GraphicsLayer graphicsLayer = cVar.getDrawContext().getGraphicsLayer();
        X0.d drawContext = cVar.getDrawContext();
        drawContext.a(cVar);
        drawContext.d(layoutDirection);
        drawContext.j(Canvas);
        drawContext.h(jB);
        drawContext.f(null);
        Canvas.save();
        try {
            cVar.getDrawContext().getTransform().d(f12, fI1);
            try {
                cVar.a2();
                Canvas.i();
                X0.d drawContext2 = cVar.getDrawContext();
                drawContext2.a(density);
                drawContext2.d(layoutDirection2);
                drawContext2.j(canvasG);
                drawContext2.h(jB2);
                drawContext2.f(graphicsLayer);
                V2().endRecording();
                int iSave = nativeCanvas.save();
                nativeCanvas.translate(f10, f11);
                nativeCanvas.drawRenderNode(V2());
                nativeCanvas.restoreToCount(iSave);
            } finally {
                cVar.getDrawContext().getTransform().d(-f12, -fI1);
            }
        } catch (Throwable th2) {
            Canvas.i();
            X0.d drawContext3 = cVar.getDrawContext();
            drawContext3.a(density);
            drawContext3.d(layoutDirection2);
            drawContext3.j(canvasG);
            drawContext3.h(jB2);
            drawContext3.f(graphicsLayer);
            throw th2;
        }
    }

    public b0(InterfaceC5814j interfaceC5814j, C13434a c13434a, C13451s c13451s) {
        this.overscrollEffect = c13434a;
        this.edgeEffectWrapper = c13451s;
        K2(interfaceC5814j);
    }
}
