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
import Y0.G;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.graphics.layer.view.DrawChildContainer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 x2\u00020\u0001:\u0001\u000fB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0012J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0012J*\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010#\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\"\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b#\u0010$J@\u0010\u001a\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u000e0+¢\u0006\u0002\b-H\u0016¢\u0006\u0004\b\u001a\u0010/J\u0017\u00102\u001a\u00020\u000e2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00105\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010I\u001a\n F*\u0004\u0018\u00010E0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010U\u001a\u0004\u0018\u00010R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010X\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010>R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010#R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010#R\u001c\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b]\u0010:R\u0016\u0010_\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010^R\"\u0010a\u001a\u00020\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b`\u0010^\u001a\u0004\ba\u0010\u0015\"\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010^R\u0016\u0010g\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010^R\u001a\u0010j\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bh\u0010:\u001a\u0004\bi\u0010<R0\u0010o\u001a\u00020k2\u0006\u0010l\u001a\u00020k8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010#\u001a\u0004\bd\u0010m\"\u0004\bn\u0010\u0010R.\u0010v\u001a\u0004\u0018\u00010p2\b\u0010l\u001a\u0004\u0018\u00010p8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bG\u0010s\"\u0004\bt\u0010uR0\u0010\r\u001a\u00020\f2\u0006\u0010l\u001a\u00020\f8\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bw\u0010#\u001a\u0004\bh\u0010m\"\u0004\bx\u0010\u0010R*\u0010~\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bz\u0010b\u001a\u0004\b{\u0010|\"\u0004\b=\u0010}R\u0016\u0010\u007f\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010^R5\u0010\u0083\u0001\u001a\u00030\u0080\u00012\u0007\u0010l\u001a\u00030\u0080\u00018\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0004\b\u001b\u0010:\u001a\u0005\b\u0081\u0001\u0010<\"\u0005\b:\u0010\u0082\u0001R-\u0010\u0086\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0084\u0001\u0010b\u001a\u0005\b\u0085\u0001\u0010|\"\u0004\bO\u0010}R,\u0010\u0088\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0004\b5\u0010b\u001a\u0005\b\u0087\u0001\u0010|\"\u0004\b\\\u0010}R-\u0010\u008b\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0089\u0001\u0010b\u001a\u0005\b\u008a\u0001\u0010|\"\u0004\b]\u0010}R-\u0010\u008e\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u008c\u0001\u0010b\u001a\u0005\b\u008d\u0001\u0010|\"\u0004\bB\u0010}R.\u0010\u0092\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0015\n\u0005\b\u008f\u0001\u0010b\u001a\u0005\b\u0090\u0001\u0010|\"\u0005\b\u0091\u0001\u0010}R6\u0010\u0095\u0001\u001a\u00030\u0093\u00012\u0007\u0010l\u001a\u00030\u0093\u00018\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010:\u001a\u0004\bq\u0010<\"\u0006\b\u0084\u0001\u0010\u0082\u0001R5\u0010\u0096\u0001\u001a\u00030\u0093\u00012\u0007\u0010l\u001a\u00030\u0093\u00018\u0016@VX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0004\bb\u0010:\u001a\u0004\bz\u0010<\"\u0006\b\u0094\u0001\u0010\u0082\u0001R-\u0010\u0098\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0014\n\u0005\b\u0085\u0001\u0010b\u001a\u0005\b\u0097\u0001\u0010|\"\u0004\bV\u0010}R,\u0010\u0099\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0013\n\u0005\b\u0091\u0001\u0010b\u001a\u0004\bw\u0010|\"\u0004\bY\u0010}R+\u0010\u009a\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010b\u001a\u0004\b\u001b\u0010|\"\u0004\b[\u0010}R\u001c\u0010\u009b\u0001\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\r\n\u0004\b:\u0010^\u001a\u0005\b\u0089\u0001\u0010\u0015R&\u0010\u009c\u0001\u001a\u00020y2\u0006\u0010l\u001a\u00020y8V@VX\u0096\u000e¢\u0006\r\u001a\u0005\b\u008c\u0001\u0010|\"\u0004\bS\u0010}R&\u0010\u009d\u0001\u001a\u00020\u00132\u0006\u0010l\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\r\u001a\u0004\b9\u0010\u0015\"\u0005\b\u008f\u0001\u0010cR5\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009e\u00012\t\u0010l\u001a\u0005\u0018\u00010\u009e\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0005\bf\u0010¡\u0001\"\u0005\bK\u0010¢\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006£\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/e;", "Landroidx/compose/ui/graphics/layer/b;", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "layerContainer", "", "ownerId", "LV0/k0;", "canvasHolder", "LX0/a;", "canvasDrawScope", "<init>", "(Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;JLV0/k0;LX0/a;)V", "Landroidx/compose/ui/graphics/layer/a;", "compositingStrategy", "", "b", "(I)V", "U", "()V", "", "O", "()Z", "R", "N", "T", "", "x", "y", "LH1/r;", "size", "t", "(IIJ)V", "Landroid/graphics/Outline;", "outline", "outlineSize", "I", "(Landroid/graphics/Outline;J)V", "LH1/d;", "density", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "Lkotlin/Function1;", "LX0/f;", "Lkotlin/ExtensionFunctionType;", "block", "(LH1/d;LH1/t;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "M", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroid/graphics/Matrix;", "A", "()Landroid/graphics/Matrix;", "o", "Landroidx/compose/ui/graphics/layer/view/DrawChildContainer;", "c", "J", "getOwnerId", "()J", "d", "LV0/k0;", "getCanvasHolder", "()LV0/k0;", "Landroidx/compose/ui/graphics/layer/ViewLayer;", "e", "Landroidx/compose/ui/graphics/layer/ViewLayer;", "viewLayer", "Landroid/content/res/Resources;", "kotlin.jvm.PlatformType", "f", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/Rect;", "g", "Landroid/graphics/Rect;", "clipRect", "Landroid/graphics/Paint;", "h", "Landroid/graphics/Paint;", "layerPaint", "Landroid/graphics/Picture;", "i", "Landroid/graphics/Picture;", "picture", "j", "LX0/a;", "pictureDrawScope", "k", "pictureCanvasHolder", "l", "m", "n", "Z", "clipBoundsInvalidated", "p", "isInvalidated", "F", "(Z)V", "q", "outlineIsProvided", "r", "clipToBounds", "s", "getLayerId", "layerId", "LV0/c0;", "value", "()I", "setBlendMode-s9anfk8", "blendMode", "LV0/r0;", "u", "LV0/r0;", "()LV0/r0;", "setColorFilter", "(LV0/r0;)V", "colorFilter", "v", "K", "", "w", "a", "()F", "(F)V", "alpha", "shouldManuallySetCenterPivot", "LU0/f;", "getPivotOffset-F1C5BW0", "(J)V", "pivotOffset", "z", "G", "scaleX", "V", "scaleY", "B", "Q", "translationX", "C", "P", "translationY", "D", "L", "H", "shadowElevation", "LV0/q0;", "E", "ambientShadowColor", "spotShadowColor", "S", "rotationX", "rotationY", "rotationZ", "supportsSoftwareRendering", "cameraDistance", "clip", "LV0/y1;", "renderEffect", "LV0/y1;", "()LV0/y1;", "(LV0/y1;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: L, reason: collision with root package name */
    private static final boolean f51114L = !G.f42772a.a();

    /* renamed from: M, reason: collision with root package name */
    private static final Canvas f51115M = new a();

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private float scaleY;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private float translationX;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata */
    private float shadowElevation;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata */
    private long ambientShadowColor;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata */
    private long spotShadowColor;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* renamed from: H, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* renamed from: I, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* renamed from: J, reason: collision with root package name and from kotlin metadata */
    private final boolean supportsSoftwareRendering;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final DrawChildContainer layerContainer;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long ownerId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C5473k0 canvasHolder;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ViewLayer viewLayer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Resources resources;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Rect clipRect;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Paint layerPaint;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Picture picture;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final X0.a pictureDrawScope;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final C5473k0 pictureCanvasHolder;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int x;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int y;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean clipBoundsInvalidated;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean outlineIsProvided;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long layerId;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int blendMode;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private C5490r0 colorFilter;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int compositingStrategy;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean shouldManuallySetCenterPivot;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float scaleX;

    public e(DrawChildContainer drawChildContainer, long j10, C5473k0 c5473k0, X0.a aVar) {
        this.layerContainer = drawChildContainer;
        this.ownerId = j10;
        this.canvasHolder = c5473k0;
        ViewLayer viewLayer = new ViewLayer(drawChildContainer, c5473k0, aVar);
        this.viewLayer = viewLayer;
        this.resources = drawChildContainer.getResources();
        this.clipRect = new Rect();
        boolean z10 = f51114L;
        this.picture = z10 ? new Picture() : null;
        this.pictureDrawScope = z10 ? new X0.a() : null;
        this.pictureCanvasHolder = z10 ? new C5473k0() : null;
        drawChildContainer.addView(viewLayer);
        viewLayer.setClipBounds(null);
        this.size = r.INSTANCE.a();
        this.isInvalidated = true;
        this.layerId = View.generateViewId();
        this.blendMode = C5449c0.INSTANCE.B();
        this.compositingStrategy = androidx.compose.ui.graphics.layer.a.INSTANCE.a();
        this.alpha = 1.0f;
        this.pivotOffset = U0.f.INSTANCE.c();
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        C5489q0.Companion companion = C5489q0.INSTANCE;
        this.ambientShadowColor = companion.a();
        this.spotShadowColor = companion.a();
        this.supportsSoftwareRendering = z10;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void D(boolean z10) {
        boolean z11 = false;
        this.clipToBounds = z10 && !this.outlineIsProvided;
        this.clipBoundsInvalidated = true;
        ViewLayer viewLayer = this.viewLayer;
        if (z10 && this.outlineIsProvided) {
            z11 = true;
        }
        viewLayer.setClipToOutline(z11);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public y1 r() {
        return null;
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/graphics/layer/e$a", "Landroid/graphics/Canvas;", "", "isHardwareAccelerated", "()Z", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends Canvas {
        @Override // android.graphics.Canvas
        public boolean isHardwareAccelerated() {
            return true;
        }

        a() {
        }
    }

    private final void N() {
        try {
            C5473k0 c5473k0 = this.canvasHolder;
            Canvas canvas = f51115M;
            Canvas internalCanvas = c5473k0.getAndroidCanvas().getInternalCanvas();
            c5473k0.getAndroidCanvas().A(canvas);
            androidx.compose.ui.graphics.a androidCanvas = c5473k0.getAndroidCanvas();
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.a(androidCanvas, viewLayer, viewLayer.getDrawingTime());
            c5473k0.getAndroidCanvas().A(internalCanvas);
        } catch (Throwable unused) {
        }
    }

    private final void T() {
        Rect rect;
        if (this.clipBoundsInvalidated) {
            ViewLayer viewLayer = this.viewLayer;
            if (!c() || this.outlineIsProvided) {
                rect = null;
            } else {
                rect = this.clipRect;
                rect.left = 0;
                rect.top = 0;
                rect.right = this.viewLayer.getWidth();
                rect.bottom = this.viewLayer.getHeight();
            }
            viewLayer.setClipBounds(rect);
        }
    }

    private final void b(int compositingStrategy) {
        ViewLayer viewLayer = this.viewLayer;
        a.Companion companion = androidx.compose.ui.graphics.layer.a.INSTANCE;
        boolean z10 = true;
        if (androidx.compose.ui.graphics.layer.a.e(compositingStrategy, companion.c())) {
            this.viewLayer.setLayerType(2, this.layerPaint);
        } else if (androidx.compose.ui.graphics.layer.a.e(compositingStrategy, companion.b())) {
            this.viewLayer.setLayerType(0, this.layerPaint);
            z10 = false;
        } else {
            this.viewLayer.setLayerType(0, this.layerPaint);
        }
        viewLayer.setCanUseCompositingLayer$ui_graphics_release(z10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public Matrix A() {
        return this.viewLayer.getMatrix();
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: B, reason: from getter */
    public boolean getSupportsSoftwareRendering() {
        return this.supportsSoftwareRendering;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: C */
    public float getCameraDistance() {
        return this.viewLayer.getCameraDistance() / this.resources.getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void E(long j10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.spotShadowColor = j10;
            j.f51156a.c(this.viewLayer, C5492s0.j(j10));
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
        this.viewLayer.setElevation(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void I(Outline outline, long outlineSize) {
        boolean zD = this.viewLayer.d(outline);
        if (c() && outline != null) {
            this.viewLayer.setClipToOutline(true);
            if (this.clipToBounds) {
                this.clipToBounds = false;
                this.clipBoundsInvalidated = true;
            }
        }
        this.outlineIsProvided = outline != null;
        if (zD) {
            return;
        }
        this.viewLayer.invalidate();
        N();
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void J(long j10) {
        this.pivotOffset = j10;
        if ((9223372034707292159L & j10) != 9205357640488583168L) {
            this.shouldManuallySetCenterPivot = false;
            this.viewLayer.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            this.viewLayer.setPivotY(Float.intBitsToFloat((int) (j10 & 4294967295L)));
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                j.f51156a.a(this.viewLayer);
                return;
            }
            this.shouldManuallySetCenterPivot = true;
            this.viewLayer.setPivotX(((int) (this.size >> 32)) / 2.0f);
            this.viewLayer.setPivotY(((int) (4294967295L & this.size)) / 2.0f);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void K(int i10) {
        this.compositingStrategy = i10;
        U();
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: L, reason: from getter */
    public float getShadowElevation() {
        return this.shadowElevation;
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

    public boolean c() {
        return this.clipToBounds || this.viewLayer.getClipToOutline();
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void d(float f10) {
        this.alpha = f10;
        this.viewLayer.setAlpha(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void e(float f10) {
        this.translationY = f10;
        this.viewLayer.setTranslationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    /* renamed from: f, reason: from getter */
    public C5490r0 getColorFilter() {
        return this.colorFilter;
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void g(y1 y1Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            k.f51157a.a(this.viewLayer, y1Var);
        }
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void h(float f10) {
        this.scaleX = f10;
        this.viewLayer.setScaleX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void i(float f10) {
        this.viewLayer.setCameraDistance(f10 * this.resources.getDisplayMetrics().densityDpi);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void j(float f10) {
        this.rotationX = f10;
        this.viewLayer.setRotationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void k(float f10) {
        this.rotationY = f10;
        this.viewLayer.setRotationY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void l(float f10) {
        this.rotationZ = f10;
        this.viewLayer.setRotation(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void m(float f10) {
        this.scaleY = f10;
        this.viewLayer.setScaleY(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void n(float f10) {
        this.translationX = f10;
        this.viewLayer.setTranslationX(f10);
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void o() {
        this.layerContainer.removeViewInLayout(this.viewLayer);
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
        if (r.e(this.size, size)) {
            int i10 = this.x;
            if (i10 != x10) {
                this.viewLayer.offsetLeftAndRight(x10 - i10);
            }
            int i11 = this.y;
            if (i11 != y10) {
                this.viewLayer.offsetTopAndBottom(y10 - i11);
            }
        } else {
            if (c()) {
                this.clipBoundsInvalidated = true;
            }
            int i12 = (int) (size >> 32);
            int i13 = (int) (4294967295L & size);
            this.viewLayer.layout(x10, y10, x10 + i12, y10 + i13);
            this.size = size;
            if (this.shouldManuallySetCenterPivot) {
                this.viewLayer.setPivotX(i12 / 2.0f);
                this.viewLayer.setPivotY(i13 / 2.0f);
            }
        }
        this.x = x10;
        this.y = y10;
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
        C5473k0 c5473k0;
        Canvas canvas;
        if (this.viewLayer.getParent() == null) {
            this.layerContainer.addView(this.viewLayer);
        }
        this.viewLayer.c(density, layoutDirection, layer, block);
        if (this.viewLayer.isAttachedToWindow()) {
            this.viewLayer.setVisibility(4);
            this.viewLayer.setVisibility(0);
            N();
            Picture picture = this.picture;
            if (picture != null) {
                long j10 = this.size;
                Canvas canvasBeginRecording = picture.beginRecording((int) (j10 >> 32), (int) (j10 & 4294967295L));
                try {
                    C5473k0 c5473k02 = this.pictureCanvasHolder;
                    if (c5473k02 != null) {
                        Canvas internalCanvas = c5473k02.getAndroidCanvas().getInternalCanvas();
                        c5473k02.getAndroidCanvas().A(canvasBeginRecording);
                        androidx.compose.ui.graphics.a androidCanvas = c5473k02.getAndroidCanvas();
                        X0.a aVar = this.pictureDrawScope;
                        if (aVar != null) {
                            long jD = s.d(this.size);
                            H1.d density2 = aVar.getDrawContext().getDensity();
                            t layoutDirection2 = aVar.getDrawContext().getLayoutDirection();
                            androidx.compose.ui.graphics.Canvas canvasG = aVar.getDrawContext().g();
                            c5473k0 = c5473k02;
                            canvas = internalCanvas;
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
                        } else {
                            c5473k0 = c5473k02;
                            canvas = internalCanvas;
                        }
                        c5473k0.getAndroidCanvas().A(canvas);
                        Unit unit = Unit.f143329a;
                    }
                    picture.endRecording();
                } catch (Throwable th3) {
                    picture.endRecording();
                    throw th3;
                }
            }
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
            j.f51156a.b(this.viewLayer, C5492s0.j(j10));
        }
    }

    private final boolean O() {
        if (!androidx.compose.ui.graphics.layer.a.e(getCompositingStrategy(), androidx.compose.ui.graphics.layer.a.INSTANCE.c()) && !R()) {
            return false;
        }
        return true;
    }

    private final boolean R() {
        if (C5449c0.E(getBlendMode(), C5449c0.INSTANCE.B()) && getColorFilter() == null) {
            return false;
        }
        return true;
    }

    private final void U() {
        if (O()) {
            b(androidx.compose.ui.graphics.layer.a.INSTANCE.c());
        } else {
            b(getCompositingStrategy());
        }
    }

    @Override // androidx.compose.ui.graphics.layer.b
    public void M(androidx.compose.ui.graphics.Canvas canvas) {
        T();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (nativeCanvas.isHardwareAccelerated()) {
            DrawChildContainer drawChildContainer = this.layerContainer;
            ViewLayer viewLayer = this.viewLayer;
            drawChildContainer.a(canvas, viewLayer, viewLayer.getDrawingTime());
        } else {
            Picture picture = this.picture;
            if (picture != null) {
                nativeCanvas.drawPicture(picture);
            }
        }
    }

    public /* synthetic */ e(DrawChildContainer drawChildContainer, long j10, C5473k0 c5473k0, X0.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawChildContainer, j10, (i10 & 4) != 0 ? new C5473k0() : c5473k0, (i10 & 8) != 0 ? new X0.a() : aVar);
    }
}
