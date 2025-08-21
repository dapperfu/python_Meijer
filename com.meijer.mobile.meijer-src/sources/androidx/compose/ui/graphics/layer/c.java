package androidx.compose.ui.graphics.layer;

import H1.r;
import H1.s;
import H1.t;
import V0.C5449c0;
import V0.C5473k0;
import V0.C5489q0;
import V0.C5490r0;
import V0.C5492s0;
import V0.y1;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.layer.a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 b2\u00020\u0001:\u0001cB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010 \u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J$\u0010%\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J@\u0010\u001c\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u000e0-¢\u0006\u0002\b/H\u0016¢\u0006\u0004\b\u001c\u00101J\u0017\u00104\u001a\u00020\u000e2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000eH\u0016¢\u0006\u0004\b9\u0010\u0015J\u000f\u0010:\u001a\u00020\u000eH\u0000¢\u0006\u0004\b:\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010>R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001c\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bC\u0010;R\u0018\u0010G\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010$\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bN\u0010;R0\u0010\r\u001a\u00020\f2\u0006\u0010O\u001a\u00020\f8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bP\u0010%\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010\u0010R0\u0010X\u001a\u00020T2\u0006\u0010O\u001a\u00020T8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bU\u0010%\u001a\u0004\bV\u0010R\"\u0004\bW\u0010\u0010R.\u0010_\u001a\u0004\u0018\u00010Y2\b\u0010O\u001a\u0004\u0018\u00010Y8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\bC\u0010\\\"\u0004\b]\u0010^R*\u0010f\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\b?\u0010eR\u0016\u0010g\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010LR0\u0010l\u001a\u00020h2\u0006\u0010O\u001a\u00020h8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bi\u0010;\u001a\u0004\bj\u0010=\"\u0004\b;\u0010kR*\u0010n\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bV\u0010b\u001a\u0004\bm\u0010d\"\u0004\bH\u0010eR*\u0010q\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bo\u0010b\u001a\u0004\bp\u0010d\"\u0004\bZ\u0010eR*\u0010s\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bQ\u0010b\u001a\u0004\br\u0010d\"\u0004\ba\u0010eR*\u0010u\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b \u0010b\u001a\u0004\bt\u0010d\"\u0004\bA\u0010eR*\u0010y\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bv\u0010b\u001a\u0004\bw\u0010d\"\u0004\bx\u0010eR0\u0010}\u001a\u00020z2\u0006\u0010O\u001a\u00020z8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b{\u0010;\u001a\u0004\bv\u0010=\"\u0004\b|\u0010kR1\u0010\u0080\u0001\u001a\u00020z2\u0006\u0010O\u001a\u00020z8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b~\u0010;\u001a\u0004\b~\u0010=\"\u0004\b\u007f\u0010kR,\u0010\u0082\u0001\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b\u001c\u0010b\u001a\u0005\b\u0081\u0001\u0010d\"\u0004\bN\u0010eR+\u0010\u0083\u0001\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010b\u001a\u0004\b{\u0010d\"\u0004\bP\u0010eR+\u0010\u0084\u0001\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b|\u0010b\u001a\u0004\b\u001d\u0010d\"\u0004\bU\u0010eR,\u0010\u0086\u0001\u001a\u00020`2\u0006\u0010O\u001a\u00020`8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b7\u0010b\u001a\u0005\b\u0085\u0001\u0010d\"\u0004\bK\u0010eR/\u0010\u008b\u0001\u001a\u00020\u00112\u0006\u0010O\u001a\u00020\u00118\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\b\u0087\u0001\u0010L\u001a\u0005\b\u0088\u0001\u0010\u0013\"\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008c\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010LR\u0018\u0010\u008d\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010LR%\u0010\u008e\u0001\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0014\n\u0004\b\u007f\u0010L\u001a\u0005\b\u008e\u0001\u0010\u0013\"\u0005\bb\u0010\u008a\u0001R*\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0005\bo\u0010\u0092\u0001\"\u0005\bE\u0010\u0093\u0001R\u0015\u0010\u0094\u0001\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0095\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/c;", "Landroidx/compose/ui/graphics/layer/b;", "Landroid/view/View;", "ownerView", "", "ownerId", "LV0/k0;", "canvasHolder", "LX0/a;", "canvasDrawScope", "<init>", "(Landroid/view/View;JLV0/k0;LX0/a;)V", "Landroidx/compose/ui/graphics/layer/a;", "compositingStrategy", "", "c", "(I)V", "", "R", "()Z", "T", "()V", "b", "Landroid/view/RenderNode;", "renderNode", "U", "(Landroid/view/RenderNode;)V", "", "x", "y", "LH1/r;", "size", "t", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "I", "(Landroid/graphics/Outline;J)V", "LH1/d;", "density", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "LX0/f;", "Lkotlin/ExtensionFunctionType;", "block", "(LH1/d;LH1/t;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "M", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroid/graphics/Matrix;", "A", "()Landroid/graphics/Matrix;", "o", "N", "J", "getOwnerId", "()J", "LV0/k0;", "d", "LX0/a;", "e", "Landroid/view/RenderNode;", "f", "Landroid/graphics/Paint;", "g", "Landroid/graphics/Paint;", "layerPaint", "h", "Landroid/graphics/Matrix;", "matrix", "i", "Z", "outlineIsProvided", "j", "value", "k", "s", "()I", "K", "LV0/c0;", "l", "q", "setBlendMode-s9anfk8", "blendMode", "LV0/r0;", "m", "LV0/r0;", "()LV0/r0;", "setColorFilter", "(LV0/r0;)V", "colorFilter", "", "n", "F", "a", "()F", "(F)V", "alpha", "shouldManuallySetCenterPivot", "LU0/f;", "p", "getPivotOffset-F1C5BW0", "(J)V", "pivotOffset", "G", "scaleX", "r", "V", "scaleY", "Q", "translationX", "P", "translationY", "u", "L", "H", "shadowElevation", "LV0/q0;", "v", "z", "ambientShadowColor", "w", "E", "spotShadowColor", "S", "rotationX", "rotationY", "rotationZ", "C", "cameraDistance", "B", "O", "D", "(Z)V", "clip", "clipToBounds", "clipToOutline", "isInvalidated", "LV0/y1;", "renderEffect", "LV0/y1;", "()LV0/y1;", "(LV0/y1;)V", "hasDisplayList", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: G, reason: collision with root package name */
    private static boolean f51053G;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private boolean clipToOutline;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long ownerId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C5473k0 canvasHolder;

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
    private long outlineSize;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int blendMode;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private C5490r0 colorFilter;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean shouldManuallySetCenterPivot;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* renamed from: H, reason: collision with root package name */
    private static final AtomicBoolean f51054H = new AtomicBoolean(true);

    public c(View view, long j10, C5473k0 c5473k0, X0.a aVar) {
        this.ownerId = j10;
        this.canvasHolder = c5473k0;
        this.canvasDrawScope = aVar;
        RenderNode renderNodeCreate = RenderNode.create("Compose", view);
        this.renderNode = renderNodeCreate;
        r.Companion companion = r.INSTANCE;
        this.size = companion.a();
        this.outlineSize = companion.a();
        if (f51054H.getAndSet(false)) {
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
            U(renderNodeCreate);
            N();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
        }
        if (f51053G) {
            throw new NoClassDefFoundError();
        }
        renderNodeCreate.setClipToBounds(false);
        a.Companion companion2 = a.INSTANCE;
        c(companion2.a());
        this.compositingStrategy = companion2.a();
        this.blendMode = C5449c0.INSTANCE.B();
        this.alpha = 1.0f;
        this.pivotOffset = U0.f.INSTANCE.b();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        C5489q0.Companion companion3 = C5489q0.INSTANCE;
        this.ambientShadowColor = companion3.a();
        this.spotShadowColor = companion3.a();
        this.cameraDistance = 8.0f;
        this.isInvalidated = true;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void g(y1 y1Var) {
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public y1 r() {
        return null;
    }

    private final void U(RenderNode renderNode) {
        if (Build.VERSION.SDK_INT >= 28) {
            i iVar = i.f51155a;
            iVar.c(renderNode, iVar.a(renderNode));
            iVar.d(renderNode, iVar.b(renderNode));
        }
    }

    private final void c(int compositingStrategy) {
        RenderNode renderNode = this.renderNode;
        a.Companion companion = a.INSTANCE;
        if (a.e(compositingStrategy, companion.c())) {
            renderNode.setLayerType(2);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(true);
        } else if (a.e(compositingStrategy, companion.b())) {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setLayerPaint(this.layerPaint);
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
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j10;
            i.f51155a.d(this.renderNode, C5492s0.j(j10));
        }
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
        this.outlineSize = outlineSize;
        this.renderNode.setOutline(outline);
        this.outlineIsProvided = outline != null;
        b();
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void J(long j10) {
        this.pivotOffset = j10;
        if ((9223372034707292159L & j10) == 9205357640488583168L) {
            this.shouldManuallySetCenterPivot = true;
            this.renderNode.setPivotX(((int) (this.size >> 32)) / 2.0f);
            this.renderNode.setPivotY(((int) (4294967295L & this.size)) / 2.0f);
        } else {
            this.shouldManuallySetCenterPivot = false;
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

    public final void N() {
        h.f51154a.a(this.renderNode);
    }

    /* renamed from: O, reason: from getter */
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
    public C5490r0 getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void h(float f10) {
        this.scaleX = f10;
        this.renderNode.setScaleX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void i(float f10) {
        this.cameraDistance = f10;
        this.renderNode.setCameraDistance(-f10);
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
        this.renderNode.setRotation(f10);
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
    public boolean p() {
        return this.renderNode.isValid();
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
        int i10 = (int) (size >> 32);
        int i11 = (int) (4294967295L & size);
        this.renderNode.setLeftTopRightBottom(x10, y10, x10 + i10, y10 + i11);
        if (r.e(this.size, size)) {
            return;
        }
        if (this.shouldManuallySetCenterPivot) {
            this.renderNode.setPivotX(i10 / 2.0f);
            this.renderNode.setPivotY(i11 / 2.0f);
        }
        this.size = size;
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
        Canvas canvasStart = this.renderNode.start(Math.max((int) (this.size >> 32), (int) (this.outlineSize >> 32)), Math.max((int) (this.size & 4294967295L), (int) (this.outlineSize & 4294967295L)));
        try {
            C5473k0 c5473k0 = this.canvasHolder;
            Canvas internalCanvas = c5473k0.getAndroidCanvas().getInternalCanvas();
            c5473k0.getAndroidCanvas().A(canvasStart);
            androidx.compose.ui.graphics.a androidCanvas = c5473k0.getAndroidCanvas();
            X0.a aVar = this.canvasDrawScope;
            long jD = s.d(this.size);
            H1.d density2 = aVar.getDrawContext().getDensity();
            t layoutDirection2 = aVar.getDrawContext().getLayoutDirection();
            androidx.compose.ui.graphics.Canvas canvasG = aVar.getDrawContext().g();
            long jB = aVar.getDrawContext().b();
            GraphicsLayer graphicsLayer = aVar.getDrawContext().getGraphicsLayer();
            X0.d drawContext = aVar.getDrawContext();
            drawContext.a(density);
            drawContext.d(layoutDirection);
            drawContext.j(androidCanvas);
            drawContext.h(jD);
            drawContext.f(layer);
            androidCanvas.save();
            try {
                block.invoke(aVar);
                androidCanvas.i();
                X0.d drawContext2 = aVar.getDrawContext();
                drawContext2.a(density2);
                drawContext2.d(layoutDirection2);
                drawContext2.j(canvasG);
                drawContext2.h(jB);
                drawContext2.f(graphicsLayer);
                c5473k0.getAndroidCanvas().A(internalCanvas);
                this.renderNode.end(canvasStart);
                F(false);
            } catch (Throwable th2) {
                androidCanvas.i();
                X0.d drawContext3 = aVar.getDrawContext();
                drawContext3.a(density2);
                drawContext3.d(layoutDirection2);
                drawContext3.j(canvasG);
                drawContext3.h(jB);
                drawContext3.f(graphicsLayer);
                throw th2;
            }
        } catch (Throwable th3) {
            this.renderNode.end(canvasStart);
            throw th3;
        }
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: y, reason: from getter */
    public float getRotationZ() {
        return this.rotationZ;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void z(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.ambientShadowColor = j10;
            i.f51155a.c(this.renderNode, C5492s0.j(j10));
        }
    }

    private final boolean R() {
        if (!a.e(getCompositingStrategy(), a.INSTANCE.c()) && C5449c0.E(getBlendMode(), C5449c0.INSTANCE.B()) && getColorFilter() == null) {
            return false;
        }
        return true;
    }

    private final void T() {
        if (R()) {
            c(a.INSTANCE.c());
        } else {
            c(getCompositingStrategy());
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
        DisplayListCanvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        Intrinsics.h(nativeCanvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        nativeCanvas.drawRenderNode(this.renderNode);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void o() {
        N();
    }

    public /* synthetic */ c(View view, long j10, C5473k0 c5473k0, X0.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, j10, (i10 & 4) != 0 ? new C5473k0() : c5473k0, (i10 & 8) != 0 ? new X0.a() : aVar);
    }
}
