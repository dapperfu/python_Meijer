package androidx.compose.ui.graphics.layer;

import H1.s;
import H1.t;
import V0.C5306c0;
import V0.C5330k0;
import V0.C5346q0;
import V0.C5347r0;
import V0.C5349s0;
import V0.y1;
import Y0.F;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.layer.a;
import d0.W;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\u0010\u001a\u00020\n*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J*\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010!\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J@\u0010\u0018\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0017\u0010,\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\n0)¢\u0006\u0002\b+H\u0016¢\u0006\u0004\b\u0018\u0010-J\u0017\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010\u001b\u001a\u00020?8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b@\u00106R\u0018\u0010D\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010G\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010J\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR*\u0010R\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\b:\u0010QR0\u0010Y\u001a\u00020S2\u0006\u0010L\u001a\u00020S8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bT\u0010!\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR.\u0010`\u001a\u0004\u0018\u00010Z2\b\u0010L\u001a\u0004\u0018\u00010Z8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b@\u0010]\"\u0004\b^\u0010_R0\u0010e\u001a\u00020a2\u0006\u0010L\u001a\u00020a8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bb\u00106\u001a\u0004\bc\u00108\"\u0004\b6\u0010dR*\u0010h\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bf\u0010N\u001a\u0004\bg\u0010P\"\u0004\bE\u0010QR*\u0010j\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b5\u0010N\u001a\u0004\bi\u0010P\"\u0004\bb\u0010QR*\u0010m\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bk\u0010N\u001a\u0004\bl\u0010P\"\u0004\bf\u0010QR*\u0010o\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bU\u0010N\u001a\u0004\bn\u0010P\"\u0004\b<\u0010QR*\u0010s\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bp\u0010N\u001a\u0004\bq\u0010P\"\u0004\br\u0010QR0\u0010x\u001a\u00020t2\u0006\u0010L\u001a\u00020t8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bu\u00106\u001a\u0004\bv\u00108\"\u0004\bw\u0010dR0\u0010{\u001a\u00020t2\u0006\u0010L\u001a\u00020t8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u00106\u001a\u0004\by\u00108\"\u0004\bz\u0010dR*\u0010}\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bv\u0010N\u001a\u0004\b|\u0010P\"\u0004\bM\u0010QR*\u0010\u007f\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b~\u0010N\u001a\u0004\b~\u0010P\"\u0004\bT\u0010QR+\u0010\u0080\u0001\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\by\u0010N\u001a\u0004\b\u0019\u0010P\"\u0004\b[\u0010QR,\u0010\u0082\u0001\u001a\u00020K2\u0006\u0010L\u001a\u00020K8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b\u0018\u0010N\u001a\u0005\b\u0081\u0001\u0010P\"\u0004\bH\u0010QR.\u0010\u0086\u0001\u001a\u00020\u00132\u0006\u0010L\u001a\u00020\u00138\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0004\b\u0019\u0010I\u001a\u0005\b\u0083\u0001\u0010\u0015\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0087\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010IR\u0017\u0010\u0088\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010IR2\u0010\u000f\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020\u000e8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0005\b\u0089\u0001\u0010!\u001a\u0004\bu\u0010V\"\u0005\b\u008a\u0001\u0010XR&\u0010\u008b\u0001\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\u0081\u0001\u0010I\u001a\u0005\b\u008b\u0001\u0010\u0015\"\u0005\bN\u0010\u0085\u0001R5\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008c\u00012\t\u0010L\u001a\u0005\u0018\u00010\u008c\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u0005\bp\u0010\u008f\u0001\"\u0005\bB\u0010\u0090\u0001R\u0015\u0010\u0091\u0001\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0092\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/d;", "Landroidx/compose/ui/graphics/layer/b;", "", "ownerId", "LV0/k0;", "canvasHolder", "LX0/a;", "canvasDrawScope", "<init>", "(JLV0/k0;LX0/a;)V", "", "b", "()V", "Landroid/graphics/RenderNode;", "Landroidx/compose/ui/graphics/layer/a;", "compositingStrategy", "c", "(Landroid/graphics/RenderNode;I)V", "T", "", "O", "()Z", "R", "", "x", "y", "LH1/r;", "size", "t", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "I", "(Landroid/graphics/Outline;J)V", "LH1/d;", "density", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "LX0/f;", "Lkotlin/ExtensionFunctionType;", "block", "(LH1/d;LH1/t;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "M", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroid/graphics/Matrix;", "A", "()Landroid/graphics/Matrix;", "o", "J", "getOwnerId", "()J", "LV0/k0;", "d", "LX0/a;", "e", "Landroid/graphics/RenderNode;", "renderNode", "LU0/k;", "f", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "layerPaint", "h", "Landroid/graphics/Matrix;", "matrix", "i", "Z", "outlineIsProvided", "", "value", "j", "F", "a", "()F", "(F)V", "alpha", "LV0/c0;", "k", "q", "()I", "setBlendMode-s9anfk8", "(I)V", "blendMode", "LV0/r0;", "l", "LV0/r0;", "()LV0/r0;", "setColorFilter", "(LV0/r0;)V", "colorFilter", "LU0/f;", "m", "getPivotOffset-F1C5BW0", "(J)V", "pivotOffset", "n", "G", "scaleX", "V", "scaleY", "p", "Q", "translationX", "P", "translationY", "r", "L", "H", "shadowElevation", "LV0/q0;", "s", "u", "z", "ambientShadowColor", "w", "E", "spotShadowColor", "S", "rotationX", "v", "rotationY", "rotationZ", "C", "cameraDistance", "N", "D", "(Z)V", "clip", "clipToBounds", "clipToOutline", "B", "K", "isInvalidated", "LV0/y1;", "renderEffect", "LV0/y1;", "()LV0/y1;", "(LV0/y1;)V", "hasDisplayList", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class d implements b {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private boolean clipToOutline;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long ownerId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C5330k0 canvasHolder;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final X0.a canvasDrawScope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final RenderNode renderNode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Paint layerPaint;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Matrix matrix;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean outlineIsProvided;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int blendMode;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private C5347r0 colorFilter;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    public d(long j10, C5330k0 c5330k0, X0.a aVar) {
        this.ownerId = j10;
        this.canvasHolder = c5330k0;
        this.canvasDrawScope = aVar;
        RenderNode renderNodeA = W.a("graphicsLayer");
        this.renderNode = renderNodeA;
        this.size = U0.k.INSTANCE.b();
        renderNodeA.setClipToBounds(false);
        a.Companion companion = a.INSTANCE;
        c(renderNodeA, companion.a());
        this.alpha = 1.0f;
        this.blendMode = C5306c0.INSTANCE.B();
        this.pivotOffset = U0.f.INSTANCE.b();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        C5346q0.Companion companion2 = C5346q0.INSTANCE;
        this.ambientShadowColor = companion2.a();
        this.spotShadowColor = companion2.a();
        this.cameraDistance = 8.0f;
        this.compositingStrategy = companion.a();
        this.isInvalidated = true;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public y1 r() {
        return null;
    }

    private final void c(RenderNode renderNode, int i10) {
        a.Companion companion = a.INSTANCE;
        if (a.e(i10, companion.c())) {
            renderNode.setUseCompositingLayer(true, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (a.e(i10, companion.b())) {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public Matrix A() {
        Matrix matrix = this.matrix;
        if (matrix == null) {
            matrix = new Matrix();
            this.matrix = matrix;
        }
        this.renderNode.getMatrix(matrix);
        return matrix;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: C, reason: from getter */
    public float getCameraDistance() {
        return this.cameraDistance;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void D(boolean z10) {
        this.clip = z10;
        b();
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void E(long j10) {
        this.spotShadowColor = j10;
        this.renderNode.setSpotShadowColor(C5349s0.j(j10));
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void F(boolean z10) {
        this.isInvalidated = z10;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: G, reason: from getter */
    public float getScaleX() {
        return this.scaleX;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void H(float f10) {
        this.shadowElevation = f10;
        this.renderNode.setElevation(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void I(Outline outline, long outlineSize) {
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        b();
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void J(long j10) {
        this.pivotOffset = j10;
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            this.renderNode.resetPivot();
        } else {
            this.renderNode.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.renderNode.setPivotY(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        }
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void K(int i10) {
        this.compositingStrategy = i10;
        T();
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: L, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
    }

    /* renamed from: N, reason: from getter */
    public boolean getClip() {
        return this.clip;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: P, reason: from getter */
    public float getTranslationY() {
        return this.translationY;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: Q, reason: from getter */
    public float getTranslationX() {
        return this.translationX;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: S, reason: from getter */
    public float getRotationX() {
        return this.rotationX;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: V, reason: from getter */
    public float getScaleY() {
        return this.scaleY;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: a, reason: from getter */
    public float getAlpha() {
        return this.alpha;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void d(float f10) {
        this.alpha = f10;
        this.renderNode.setAlpha(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void e(float f10) {
        this.translationY = f10;
        this.renderNode.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: f, reason: from getter */
    public C5347r0 getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void g(y1 y1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            F.f39958a.a(this.renderNode, y1Var);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void h(float f10) {
        this.scaleX = f10;
        this.renderNode.setScaleX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void i(float f10) {
        this.cameraDistance = f10;
        this.renderNode.setCameraDistance(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void j(float f10) {
        this.rotationX = f10;
        this.renderNode.setRotationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void k(float f10) {
        this.rotationY = f10;
        this.renderNode.setRotationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void l(float f10) {
        this.rotationZ = f10;
        this.renderNode.setRotationZ(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void m(float f10) {
        this.scaleY = f10;
        this.renderNode.setScaleY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void n(float f10) {
        this.translationX = f10;
        this.renderNode.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void o() {
        this.renderNode.discardDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public boolean p() {
        return this.renderNode.hasDisplayList();
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: q, reason: from getter */
    public int getBlendMode() {
        return this.blendMode;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: s, reason: from getter */
    public int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void t(int x10, int y10, long size) {
        this.renderNode.setPosition(x10, y10, ((int) (size >> 32)) + x10, ((int) (4294967295L & size)) + y10);
        this.size = s.d(size);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: u, reason: from getter */
    public long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: v, reason: from getter */
    public float getRotationY() {
        return this.rotationY;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: w, reason: from getter */
    public long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void x(H1.d density, t layoutDirection, GraphicsLayer layer, Function1<? super X0.f, Unit> block) {
        RecordingCanvas recordingCanvasBeginRecording = this.renderNode.beginRecording();
        try {
            C5330k0 c5330k0 = this.canvasHolder;
            Canvas internalCanvas = c5330k0.getAndroidCanvas().getInternalCanvas();
            c5330k0.getAndroidCanvas().A(recordingCanvasBeginRecording);
            androidx.compose.ui.graphics.a androidCanvas = c5330k0.getAndroidCanvas();
            X0.d drawContext = this.canvasDrawScope.getDrawContext();
            drawContext.a(density);
            drawContext.d(layoutDirection);
            drawContext.f(layer);
            drawContext.h(this.size);
            drawContext.j(androidCanvas);
            block.invoke(this.canvasDrawScope);
            c5330k0.getAndroidCanvas().A(internalCanvas);
            this.renderNode.endRecording();
            F(false);
        } catch (Throwable th2) {
            this.renderNode.endRecording();
            throw th2;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: y, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void z(long j10) {
        this.ambientShadowColor = j10;
        this.renderNode.setAmbientShadowColor(C5349s0.j(j10));
    }

    private final boolean O() {
        if (!a.e(getCompositingStrategy(), a.INSTANCE.c()) && !R()) {
            r();
            return false;
        }
        return true;
    }

    private final boolean R() {
        if (C5306c0.E(getBlendMode(), C5306c0.INSTANCE.B()) && getColorFilter() == null) {
            return false;
        }
        return true;
    }

    private final void T() {
        if (O()) {
            c(this.renderNode, a.INSTANCE.c());
        } else {
            c(this.renderNode, getCompositingStrategy());
        }
    }

    private final void b() {
        boolean z10;
        boolean z11 = false;
        if (getClip() && !this.outlineIsProvided) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (getClip() && this.outlineIsProvided) {
            z11 = true;
        }
        if (z10 != this.clipToBounds) {
            this.clipToBounds = z10;
            this.renderNode.setClipToBounds(z10);
        }
        if (z11 != this.clipToOutline) {
            this.clipToOutline = z11;
            this.renderNode.setClipToOutline(z11);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void M(androidx.compose.ui.graphics.Canvas canvas) {
        AndroidCanvas_androidKt.getNativeCanvas(canvas).drawRenderNode(this.renderNode);
    }

    public /* synthetic */ d(long j10, C5330k0 c5330k0, X0.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i10 & 2) != 0 ? new C5330k0() : c5330k0, (i10 & 4) != 0 ? new X0.a() : aVar);
    }
}
