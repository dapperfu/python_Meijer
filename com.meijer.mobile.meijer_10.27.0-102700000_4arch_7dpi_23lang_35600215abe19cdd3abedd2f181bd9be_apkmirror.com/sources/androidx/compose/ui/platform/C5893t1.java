package androidx.compose.ui.platform;

import V0.C5330k0;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J5\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00109R\u0014\u0010\r\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00109R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00109R\u0014\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00109R\u0014\u0010=\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u00109R\u0014\u0010?\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00109R$\u0010F\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010I\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER$\u0010L\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bJ\u0010C\"\u0004\bK\u0010ER$\u0010O\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bM\u0010C\"\u0004\bN\u0010ER$\u0010R\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bP\u0010C\"\u0004\bQ\u0010ER$\u0010U\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bS\u00109\"\u0004\bT\u0010\u0015R$\u0010X\u001a\u00020\u000b2\u0006\u0010A\u001a\u00020\u000b8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bV\u00109\"\u0004\bW\u0010\u0015R$\u0010[\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bY\u0010C\"\u0004\bZ\u0010ER$\u0010^\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\\\u0010C\"\u0004\b]\u0010ER$\u0010a\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b_\u0010C\"\u0004\b`\u0010ER$\u0010d\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bb\u0010C\"\u0004\bc\u0010ER$\u0010g\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\be\u0010C\"\u0004\bf\u0010ER$\u0010j\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bh\u0010C\"\u0004\bi\u0010ER$\u0010n\u001a\u00020\u00102\u0006\u0010A\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bk\u0010l\"\u0004\b7\u0010mR$\u0010q\u001a\u00020\u00102\u0006\u0010A\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bo\u0010l\"\u0004\bp\u0010mR$\u0010s\u001a\u00020@2\u0006\u0010A\u001a\u00020@8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b-\u0010C\"\u0004\br\u0010ER(\u0010y\u001a\u0004\u0018\u00010t2\b\u0010A\u001a\u0004\u0018\u00010t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR*\u0010|\u001a\u0002052\u0006\u0010A\u001a\u0002058V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bz\u00109\"\u0004\b{\u0010\u0015R\u0014\u0010~\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010l\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u007f"}, d2 = {"Landroidx/compose/ui/platform/t1;", "Landroidx/compose/ui/platform/w0;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Landroid/graphics/Outline;", "outline", "", "G", "(Landroid/graphics/Outline;)V", "", "left", "top", "right", "bottom", "", "w", "(IIII)Z", "offset", "C", "(I)V", "y", "LV0/k0;", "canvasHolder", "LV0/q1;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "F", "(LV0/k0;LV0/q1;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "matrix", "B", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "t", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "A", "(Z)Z", "o", "()V", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroid/graphics/RenderNode;", "b", "Landroid/graphics/RenderNode;", "renderNode", "Landroidx/compose/ui/graphics/c;", "c", "I", "internalCompositingStrategy", "()I", "f", "r", "getWidth", "width", "getHeight", "height", "", "value", "getScaleX", "()F", "h", "(F)V", "scaleX", "getScaleY", "m", "scaleY", "getTranslationX", "n", "translationX", "getTranslationY", "e", "translationY", "s", "x", "elevation", "getAmbientShadowColor", "H", "ambientShadowColor", "getSpotShadowColor", "J", "spotShadowColor", "getRotationZ", "l", "rotationZ", "getRotationX", "j", "rotationX", "getRotationY", "k", "rotationY", "getCameraDistance", "i", "cameraDistance", "getPivotX", "D", "pivotX", "getPivotY", "E", "pivotY", "z", "()Z", "(Z)V", "clipToOutline", "q", "v", "clipToBounds", "d", "alpha", "LV0/y1;", "getRenderEffect", "()LV0/y1;", "g", "(LV0/y1;)V", "renderEffect", "getCompositingStrategy--NrFUSI", "u", "compositingStrategy", "p", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.platform.t1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5893t1 implements InterfaceC5901w0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final RenderNode renderNode = d0.W.a("Compose");

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int internalCompositingStrategy = androidx.compose.ui.graphics.c.INSTANCE.a();

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public boolean A(boolean hasOverlappingRendering) {
        return this.renderNode.setHasOverlappingRendering(hasOverlappingRendering);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void B(Matrix matrix) {
        this.renderNode.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void C(int offset) {
        this.renderNode.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void D(float f10) {
        this.renderNode.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void E(float f10) {
        this.renderNode.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void F(C5330k0 canvasHolder, V0.q1 clipPath, Function1<? super Canvas, Unit> drawBlock) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().A(recordingCanvasBeginRecording);
        androidx.compose.ui.graphics.a androidCanvas = canvasHolder.getAndroidCanvas();
        if (clipPath != null) {
            androidCanvas.save();
            Canvas.j(androidCanvas, clipPath, 0, 2, null);
        }
        drawBlock.invoke(androidCanvas);
        if (clipPath != null) {
            androidCanvas.i();
        }
        canvasHolder.getAndroidCanvas().A(internalCanvas);
        this.renderNode.endRecording();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void G(Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void H(int i10) {
        this.renderNode.setAmbientShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void I(boolean z10) {
        this.renderNode.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void J(int i10) {
        this.renderNode.setSpotShadowColor(i10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public float a() {
        return this.renderNode.getAlpha();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    /* renamed from: b */
    public int getLeft() {
        return this.renderNode.getLeft();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    /* renamed from: c */
    public int getRight() {
        return this.renderNode.getRight();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void d(float f10) {
        this.renderNode.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void e(float f10) {
        this.renderNode.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    /* renamed from: f */
    public int getTop() {
        return this.renderNode.getTop();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void g(V0.y1 y1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            C5896u1.f52201a.a(this.renderNode, y1Var);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public int getHeight() {
        return this.renderNode.getHeight();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public int getWidth() {
        return this.renderNode.getWidth();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void h(float f10) {
        this.renderNode.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void i(float f10) {
        this.renderNode.setCameraDistance(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void j(float f10) {
        this.renderNode.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void k(float f10) {
        this.renderNode.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void l(float f10) {
        this.renderNode.setRotationZ(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void m(float f10) {
        this.renderNode.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void n(float f10) {
        this.renderNode.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void o() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public boolean p() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    /* renamed from: q */
    public boolean getClipToBounds() {
        return this.renderNode.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    /* renamed from: r */
    public int getBottom() {
        return this.renderNode.getBottom();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public float s() {
        return this.renderNode.getElevation();
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void t(android.graphics.Canvas canvas) {
        canvas.drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void u(int i10) {
        RenderNode renderNode = this.renderNode;
        c.Companion companion = androidx.compose.ui.graphics.c.INSTANCE;
        if (androidx.compose.ui.graphics.c.e(i10, companion.c())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.c.e(i10, companion.b())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i10;
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void v(boolean z10) {
        this.renderNode.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public boolean w(int left, int top, int right, int bottom) {
        return this.renderNode.setPosition(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void x(float f10) {
        this.renderNode.setElevation(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public void y(int offset) {
        this.renderNode.offsetTopAndBottom(offset);
    }

    @Override // androidx.compose.ui.platform.InterfaceC5901w0
    public boolean z() {
        return this.renderNode.getClipToOutline();
    }

    public C5893t1(AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
    }
}
