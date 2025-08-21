package androidx.compose.ui.platform;

import V0.C5473k0;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b0\b\u0001\u0018\u0000 x2\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ5\u0010$\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00060!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\u0016H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001c\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010:\u001a\u0004\b6\u0010=\"\u0004\b>\u0010\u001bR\"\u0010\u0013\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010:\u001a\u0004\b@\u0010=\"\u0004\bA\u0010\u001bR\"\u0010\u0014\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b@\u0010:\u001a\u0004\b9\u0010=\"\u0004\bB\u0010\u001bR\"\u0010\u0015\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010:\u001a\u0004\bD\u0010=\"\u0004\bE\u0010\u001bR*\u0010M\u001a\u00020\u00162\u0006\u0010F\u001a\u00020\u00168\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010O\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010=R\u0014\u0010Q\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010=R$\u0010S\u001a\u0004\u0018\u00010R8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bC\u0010WR$\u0010\\\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bY\u0010Z\"\u0004\bG\u0010[R$\u0010_\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b]\u0010Z\"\u0004\b^\u0010[R$\u0010b\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b`\u0010Z\"\u0004\ba\u0010[R$\u0010d\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bc\u0010Z\"\u0004\b?\u0010[R$\u0010g\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\be\u0010Z\"\u0004\bf\u0010[R$\u0010j\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bh\u0010=\"\u0004\bi\u0010\u001bR$\u0010m\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u00118V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bk\u0010=\"\u0004\bl\u0010\u001bR$\u0010p\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bn\u0010Z\"\u0004\bo\u0010[R$\u0010s\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bq\u0010Z\"\u0004\br\u0010[R$\u0010v\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bt\u0010Z\"\u0004\bu\u0010[R$\u0010y\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bw\u0010Z\"\u0004\bx\u0010[R$\u0010|\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bz\u0010Z\"\u0004\b{\u0010[R$\u0010\u007f\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b}\u0010Z\"\u0004\b~\u0010[R&\u0010\u0081\u0001\u001a\u00020\u00162\u0006\u0010F\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\r\u001a\u0005\b\u0080\u0001\u0010J\"\u0004\b:\u0010LR%\u0010\u0082\u0001\u001a\u00020X2\u0006\u0010F\u001a\u00020X8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b2\u0010Z\"\u0004\b<\u0010[R-\u0010\u0085\u0001\u001a\u0002082\u0006\u0010F\u001a\u0002088V@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010=\"\u0005\b\u0084\u0001\u0010\u001bR\u0016\u0010\u0087\u0001\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0088\u0001"}, d2 = {"Landroidx/compose/ui/platform/g1;", "Landroidx/compose/ui/platform/w0;", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "K", "()V", "Landroid/view/RenderNode;", "renderNode", "P", "(Landroid/view/RenderNode;)V", "Landroid/graphics/Outline;", "outline", "G", "(Landroid/graphics/Outline;)V", "", "left", "top", "right", "bottom", "", "w", "(IIII)Z", "offset", "C", "(I)V", "y", "LV0/k0;", "canvasHolder", "LV0/q1;", "clipPath", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "drawBlock", "F", "(LV0/k0;LV0/q1;Lkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Matrix;", "matrix", "B", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/Canvas;", "canvas", "t", "(Landroid/graphics/Canvas;)V", "hasOverlappingRendering", "A", "(Z)Z", "o", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "b", "Landroid/view/RenderNode;", "Landroidx/compose/ui/graphics/c;", "c", "I", "internalCompositingStrategy", "d", "()I", "M", "e", "f", "O", "N", "g", "r", "L", "value", "h", "Z", "q", "()Z", "v", "(Z)V", "clipToBounds", "getWidth", "width", "getHeight", "height", "LV0/y1;", "renderEffect", "LV0/y1;", "getRenderEffect", "()LV0/y1;", "(LV0/y1;)V", "", "getScaleX", "()F", "(F)V", "scaleX", "getScaleY", "m", "scaleY", "getTranslationX", "n", "translationX", "getTranslationY", "translationY", "s", "x", "elevation", "getAmbientShadowColor", "H", "ambientShadowColor", "getSpotShadowColor", "J", "spotShadowColor", "getRotationZ", "l", "rotationZ", "getRotationX", "j", "rotationX", "getRotationY", "k", "rotationY", "getCameraDistance", "i", "cameraDistance", "getPivotX", "D", "pivotX", "getPivotY", "E", "pivotY", "z", "clipToOutline", "alpha", "getCompositingStrategy--NrFUSI", "u", "compositingStrategy", "p", "hasDisplayList", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.platform.g1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5997g1 implements InterfaceC6043w0 {

    /* renamed from: k, reason: collision with root package name */
    private static boolean f52311k;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final RenderNode renderNode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int internalCompositingStrategy;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int left;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int top;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int right;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int bottom;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* renamed from: j, reason: collision with root package name */
    public static final int f52310j = 8;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f52312l = true;

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void g(V0.y1 y1Var) {
    }

    private final void K() {
        C6041v1.f52491a.a(this.renderNode);
    }

    private final void P(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            C6044w1 c6044w1 = C6044w1.f52493a;
            c6044w1.c(renderNode, c6044w1.a(renderNode));
            c6044w1.d(renderNode, c6044w1.b(renderNode));
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public boolean A(boolean hasOverlappingRendering) {
        return this.renderNode.setHasOverlappingRendering(hasOverlappingRendering);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void B(Matrix matrix) {
        this.renderNode.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void D(float f10) {
        this.renderNode.setPivotX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void E(float f10) {
        this.renderNode.setPivotY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void F(C5473k0 canvasHolder, V0.q1 clipPath, Function1<? super Canvas, Unit> drawBlock) {
        DisplayListCanvas displayListCanvasStart = this.renderNode.start(getWidth(), getHeight());
        android.graphics.Canvas internalCanvas = canvasHolder.getAndroidCanvas().getInternalCanvas();
        canvasHolder.getAndroidCanvas().A((android.graphics.Canvas) displayListCanvasStart);
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
        this.renderNode.end(displayListCanvasStart);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void G(Outline outline) {
        this.renderNode.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void H(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            C6044w1.f52493a.c(this.renderNode, i10);
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void I(boolean z10) {
        this.renderNode.setClipToOutline(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void J(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            C6044w1.f52493a.d(this.renderNode, i10);
        }
    }

    public void L(int i10) {
        this.bottom = i10;
    }

    public void M(int i10) {
        this.left = i10;
    }

    public void N(int i10) {
        this.right = i10;
    }

    public void O(int i10) {
        this.top = i10;
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public float a() {
        return this.renderNode.getAlpha();
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    /* renamed from: b, reason: from getter */
    public int getLeft() {
        return this.left;
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    /* renamed from: c, reason: from getter */
    public int getRight() {
        return this.right;
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void d(float f10) {
        this.renderNode.setAlpha(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void e(float f10) {
        this.renderNode.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    /* renamed from: f, reason: from getter */
    public int getTop() {
        return this.top;
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void h(float f10) {
        this.renderNode.setScaleX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void i(float f10) {
        this.renderNode.setCameraDistance(-f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void j(float f10) {
        this.renderNode.setRotationX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void k(float f10) {
        this.renderNode.setRotationY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void l(float f10) {
        this.renderNode.setRotation(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void m(float f10) {
        this.renderNode.setScaleY(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void n(float f10) {
        this.renderNode.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public boolean p() {
        return this.renderNode.isValid();
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    /* renamed from: q, reason: from getter */
    public boolean getClipToBounds() {
        return this.clipToBounds;
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    /* renamed from: r, reason: from getter */
    public int getBottom() {
        return this.bottom;
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public float s() {
        return this.renderNode.getElevation();
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void t(android.graphics.Canvas canvas) {
        Intrinsics.h(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void u(int i10) {
        c.Companion companion = androidx.compose.ui.graphics.c.INSTANCE;
        if (androidx.compose.ui.graphics.c.e(i10, companion.c())) {
            this.renderNode.setLayerType(2);
            this.renderNode.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.c.e(i10, companion.b())) {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(false);
        } else {
            this.renderNode.setLayerType(0);
            this.renderNode.setHasOverlappingRendering(true);
        }
        this.internalCompositingStrategy = i10;
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void v(boolean z10) {
        this.clipToBounds = z10;
        this.renderNode.setClipToBounds(z10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void x(float f10) {
        this.renderNode.setElevation(f10);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public boolean z() {
        return this.renderNode.getClipToOutline();
    }

    public C5997g1(AndroidComposeView androidComposeView) {
        this.ownerView = androidComposeView;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.renderNode = renderNodeCreate;
        this.internalCompositingStrategy = androidx.compose.ui.graphics.c.INSTANCE.a();
        if (f52312l) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            P(renderNodeCreate);
            K();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f52312l = false;
        }
        if (!f52311k) {
        } else {
            throw new NoClassDefFoundError();
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void C(int offset) {
        M(getLeft() + offset);
        N(getRight() + offset);
        this.renderNode.offsetLeftAndRight(offset);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public int getHeight() {
        return getBottom() - getTop();
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public int getWidth() {
        return getRight() - getLeft();
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void o() {
        K();
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public boolean w(int left, int top, int right, int bottom) {
        M(left);
        O(top);
        N(right);
        L(bottom);
        return this.renderNode.setLeftTopRightBottom(left, top, right, bottom);
    }

    @Override // androidx.compose.ui.platform.InterfaceC6043w0
    public void y(int offset) {
        O(getTop() + offset);
        L(getBottom() + offset);
        this.renderNode.offsetTopAndBottom(offset);
    }
}
