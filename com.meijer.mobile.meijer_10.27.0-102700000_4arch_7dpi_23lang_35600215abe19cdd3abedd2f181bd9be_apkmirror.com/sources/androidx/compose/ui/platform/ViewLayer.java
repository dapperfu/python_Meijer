package androidx.compose.ui.platform;

import U0.MutableRect;
import V0.C5330k0;
import V0.C5331k1;
import V0.C5349s0;
import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.OwnedLayer;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u0080\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002:?B_\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00128\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\b\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020$H\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010#J!\u0010&\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020(H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0016¢\u0006\u0004\b+\u0010,J7\u00103\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u00192\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020.2\u0006\u00101\u001a\u00020.2\u0006\u00102\u001a\u00020.H\u0014¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u000fH\u0016¢\u0006\u0004\b5\u0010,J\u000f\u00106\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u0010,J\u000f\u00107\u001a\u00020\u000fH\u0016¢\u0006\u0004\b7\u0010,J\"\u0010:\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020<2\u0006\u00109\u001a\u00020\u0019H\u0016¢\u0006\u0004\b2\u0010>JW\u0010?\u001a\u00020\u000f28\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016¢\u0006\u0004\b?\u0010@J\u001a\u0010C\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020AH\u0016ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u001a\u0010E\u001a\u00020\u000f2\u0006\u0010B\u001a\u00020AH\u0016ø\u0001\u0000¢\u0006\u0004\bE\u0010DJ\u000f\u0010F\u001a\u00020\u000fH\u0002¢\u0006\u0004\bF\u0010,J\u000f\u0010G\u001a\u00020\u000fH\u0002¢\u0006\u0004\bG\u0010,R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bC\u0010H\u001a\u0004\bI\u0010JR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b2\u0010K\u001a\u0004\bL\u0010MRJ\u0010\u0010\u001a6\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010NR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010OR\u0014\u0010R\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010QR\u0016\u0010T\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010SR\u0018\u0010W\u001a\u0004\u0018\u00010U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010VR*\u0010[\u001a\u00020\u00192\u0006\u0010X\u001a\u00020\u00198\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010S\u001a\u0004\b0\u0010\u001b\"\u0004\bY\u0010ZR\u0016\u0010\\\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010SR\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010^R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00010`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001c\u0010f\u001a\u00020d8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b/\u0010eR\u0016\u0010h\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010SR\u001a\u0010m\u001a\u00020i8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010e\u001a\u0004\bk\u0010lR\u0016\u0010p\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u001a\u0010s\u001a\u00020A8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020i8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010lR$\u0010{\u001a\u00020v2\u0006\u0010X\u001a\u00020v8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u0016\u0010\u007f\u001a\u0004\u0018\u00010|8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0081\u0001"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Landroidx/compose/ui/node/OwnedLayer;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "container", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "name", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Landroidx/compose/ui/platform/DrawChildContainer;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/graphics/g;", "scope", "g", "(Landroidx/compose/ui/graphics/g;)V", "", "hasOverlappingRendering", "()Z", "LU0/f;", "position", "f", "(J)Z", "LH1/r;", "size", "e", "(J)V", "LH1/n;", "i", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "invalidate", "()V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "destroy", "j", "forceLayout", "point", "inverse", "c", "(JZ)J", "LU0/d;", "rect", "(LU0/d;Z)V", "d", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "LV0/k1;", "matrix", "a", "([F)V", "h", "v", "u", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "Landroidx/compose/ui/platform/Y0;", "Landroidx/compose/ui/platform/Y0;", "outlineResolver", "Z", "clipToBounds", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "clipBoundsCache", "value", "setInvalidated", "(Z)V", "isInvalidated", "drawnWithZ", "LV0/k0;", "LV0/k0;", "canvasHolder", "Landroidx/compose/ui/platform/R0;", "k", "Landroidx/compose/ui/platform/R0;", "matrixCache", "Landroidx/compose/ui/graphics/i;", "J", "mTransformOrigin", "m", "mHasOverlappingRendering", "", "n", "getLayerId", "()J", "layerId", "o", "I", "mutatedFields", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "getOwnerViewId", "ownerViewId", "", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "LV0/q1;", "getManualClipPath", "()LV0/q1;", "manualClipPath", "p", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ViewLayer extends View implements OwnedLayer, FSDispatchDraw {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f51949q = 8;

    /* renamed from: r, reason: collision with root package name */
    private static final Function2<View, Matrix, Unit> f51950r = b.f51971f;

    /* renamed from: s, reason: collision with root package name */
    private static final ViewOutlineProvider f51951s = new a();

    /* renamed from: t, reason: collision with root package name */
    private static Method f51952t;

    /* renamed from: u, reason: collision with root package name */
    private static Field f51953u;

    /* renamed from: v, reason: collision with root package name */
    private static boolean f51954v;

    /* renamed from: w, reason: collision with root package name */
    private static boolean f51955w;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final DrawChildContainer container;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> invalidateParentLayer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Y0 outlineResolver;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean clipToBounds;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Rect clipBoundsCache;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithZ;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C5330k0 canvasHolder;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final R0<View> matrixCache;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long mTransformOrigin;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean mHasOverlappingRendering;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long layerId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/platform/ViewLayer$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.h(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineB = ((ViewLayer) view).outlineResolver.b();
            Intrinsics.g(outlineB);
            outline.set(outlineB);
        }

        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "view", "Landroid/graphics/Matrix;", "matrix", "", "a", "(Landroid/view/View;Landroid/graphics/Matrix;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function2<View, Matrix, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f51971f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(View view, Matrix matrix) {
            a(view, matrix);
            return Unit.f142422a;
        }

        public final void a(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e\"\u0004\b\u0011\u0010\u0012R&\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$c;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "d", "(Landroid/view/View;)V", "", "<set-?>", "hasRetrievedMethod", "Z", "a", "()Z", "shouldUseDispatchDraw", "b", "c", "(Z)V", "Lkotlin/Function2;", "Landroid/graphics/Matrix;", "getMatrix", "Lkotlin/jvm/functions/Function2;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.ViewLayer$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @SuppressLint({"BanUncheckedReflection"})
        public final void d(View view) {
            try {
                if (!a()) {
                    ViewLayer.f51954v = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f51952t = View.class.getDeclaredMethod("updateDisplayListIfDirty", null);
                        ViewLayer.f51953u = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.f51952t = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f51953u = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.f51952t;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.f51953u;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.f51953u;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.f51952t;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }

        public final boolean a() {
            return ViewLayer.f51954v;
        }

        public final boolean b() {
            return ViewLayer.f51955w;
        }

        public final void c(boolean z10) {
            ViewLayer.f51955w = z10;
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        setInvalidated(false);
        this.ownerView.R0();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.P0(this);
        this.container.removeViewInLayout(this);
    }

    public boolean drawChild(android.graphics.Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_d76c4ae5d7a7adaa50c86d0874e9fea6(canvas, view, j10);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public void fsSuperDispatchDraw_d76c4ae5d7a7adaa50c86d0874e9fea6(android.graphics.Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_d76c4ae5d7a7adaa50c86d0874e9fea6(android.graphics.Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer$d;", "", "<init>", "()V", "Landroid/view/View;", "view", "", "a", "(Landroid/view/View;)J", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f51972a = new d();

        private d() {
        }

        @JvmStatic
        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.isInvalidated) {
            this.isInvalidated = z10;
            this.ownerView.G0(this, z10);
        }
    }

    private final void u() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.g(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void v() {
        setOutlineProvider(this.outlineResolver.b() != null ? f51951s : null);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void a(float[] matrix) {
        C5331k1.l(matrix, this.matrixCache.b(this));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void b(MutableRect rect, boolean inverse) {
        if (inverse) {
            this.matrixCache.f(this, rect);
        } else {
            this.matrixCache.d(this, rect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public long c(long point, boolean inverse) {
        return inverse ? this.matrixCache.g(this, point) : this.matrixCache.e(this, point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void d(Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer) {
        this.container.addView(this);
        this.matrixCache.h();
        this.clipToBounds = false;
        this.drawnWithZ = false;
        this.mTransformOrigin = androidx.compose.ui.graphics.i.INSTANCE.a();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        setInvalidated(false);
    }

    @Override // android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        boolean z10;
        C5330k0 c5330k0 = this.canvasHolder;
        android.graphics.Canvas canvasZ = c5330k0.getAndroidCanvas().getInternalCanvas();
        c5330k0.getAndroidCanvas().A(canvas);
        androidx.compose.ui.graphics.a aVarA = c5330k0.getAndroidCanvas();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z10 = false;
        } else {
            aVarA.save();
            this.outlineResolver.a(aVarA);
            z10 = true;
        }
        Function2<? super Canvas, ? super GraphicsLayer, Unit> function2 = this.drawBlock;
        if (function2 != null) {
            function2.invoke(aVarA, null);
        }
        if (z10) {
            aVarA.i();
        }
        c5330k0.getAndroidCanvas().A(canvasZ);
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void e(long size) {
        int i10 = (int) (size >> 32);
        int i11 = (int) (size & 4294967295L);
        if (i10 == getWidth() && i11 == getHeight()) {
            return;
        }
        setPivotX(androidx.compose.ui.graphics.i.f(this.mTransformOrigin) * i10);
        setPivotY(androidx.compose.ui.graphics.i.g(this.mTransformOrigin) * i11);
        v();
        layout(getLeft(), getTop(), getLeft() + i10, getTop() + i11);
        u();
        this.matrixCache.c();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public boolean f(long position) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & position));
        if (this.clipToBounds) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.f(position);
        }
        return true;
    }

    public final DrawChildContainer getContainer() {
        return this.container;
    }

    public long getLayerId() {
        return this.layerId;
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.ownerView);
        }
        return -1L;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo13getUnderlyingMatrixsQKQjiQ() {
        return this.matrixCache.b(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void h(float[] matrix) {
        float[] fArrA = this.matrixCache.a(this);
        if (fArrA != null) {
            C5331k1.l(matrix, fArrA);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.mHasOverlappingRendering;
    }

    @Override // android.view.View, androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void j() {
        if (!this.isInvalidated || f51955w) {
            return;
        }
        INSTANCE.d(this);
        setInvalidated(false);
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, Function2<? super Canvas, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
        this.outlineResolver = new Y0();
        this.canvasHolder = new C5330k0();
        this.matrixCache = new R0<>(f51950r);
        this.mTransformOrigin = androidx.compose.ui.graphics.i.INSTANCE.a();
        this.mHasOverlappingRendering = true;
        setWillNotDraw(false);
        drawChildContainer.addView(this);
        this.layerId = View.generateViewId();
    }

    private final V0.q1 getManualClipPath() {
        if (getClipToOutline() && !this.outlineResolver.e()) {
            return this.outlineResolver.d();
        }
        return null;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer parentLayer) {
        boolean z10;
        if (getElevation() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.drawnWithZ = z10;
        if (z10) {
            canvas.l();
        }
        this.container.a(canvas, this, getDrawingTime());
        if (this.drawnWithZ) {
            canvas.t();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void g(androidx.compose.ui.graphics.g scope) {
        boolean z10;
        boolean z11;
        boolean z12;
        Function0<Unit> function0;
        boolean z13;
        int iB = scope.getMutatedFields() | this.mutatedFields;
        if ((iB & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
            long jD0 = scope.getTransformOrigin();
            this.mTransformOrigin = jD0;
            setPivotX(androidx.compose.ui.graphics.i.f(jD0) * getWidth());
            setPivotY(androidx.compose.ui.graphics.i.g(this.mTransformOrigin) * getHeight());
        }
        if ((iB & 1) != 0) {
            setScaleX(scope.getScaleX());
        }
        if ((iB & 2) != 0) {
            setScaleY(scope.getScaleY());
        }
        if ((iB & 4) != 0) {
            setAlpha(scope.getAlpha());
        }
        if ((iB & 8) != 0) {
            setTranslationX(scope.getTranslationX());
        }
        if ((iB & 16) != 0) {
            setTranslationY(scope.getTranslationY());
        }
        if ((iB & 32) != 0) {
            setElevation(scope.getShadowElevation());
        }
        if ((iB & 1024) != 0) {
            setRotation(scope.getRotationZ());
        }
        if ((iB & 256) != 0) {
            setRotationX(scope.getRotationX());
        }
        if ((iB & 512) != 0) {
            setRotationY(scope.getRotationY());
        }
        if ((iB & RecyclerView.m.FLAG_MOVED) != 0) {
            setCameraDistancePx(scope.getCameraDistance());
        }
        boolean z14 = false;
        if (getManualClipPath() != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (scope.getClip() && scope.getShape() != V0.x1.a()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((iB & 24576) != 0) {
            if (scope.getClip() && scope.getShape() == V0.x1.a()) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.clipToBounds = z13;
            u();
            setClipToOutline(z11);
        }
        boolean zH = this.outlineResolver.h(scope.getOutline(), scope.getAlpha(), z11, scope.getShadowElevation(), scope.getSize());
        if (this.outlineResolver.getCacheIsDirty()) {
            v();
        }
        if (getManualClipPath() != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12 || (z12 && zH)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (function0 = this.invalidateParentLayer) != null) {
            function0.invoke();
        }
        if ((iB & 7963) != 0) {
            this.matrixCache.c();
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            if ((iB & 64) != 0) {
                R1.f51906a.a(this, C5349s0.j(scope.getAmbientShadowColor()));
            }
            if ((iB & 128) != 0) {
                R1.f51906a.b(this, C5349s0.j(scope.getSpotShadowColor()));
            }
        }
        if (i10 >= 31 && (131072 & iB) != 0) {
            S1 s12 = S1.f51936a;
            scope.I();
            s12.a(this, null);
        }
        if ((iB & 32768) != 0) {
            int iR = scope.getCompositingStrategy();
            c.Companion companion = androidx.compose.ui.graphics.c.INSTANCE;
            if (androidx.compose.ui.graphics.c.e(iR, companion.c())) {
                setLayerType(2, null);
            } else if (androidx.compose.ui.graphics.c.e(iR, companion.b())) {
                setLayerType(0, null);
                this.mHasOverlappingRendering = z14;
            } else {
                setLayerType(0, null);
            }
            z14 = true;
            this.mHasOverlappingRendering = z14;
        }
        this.mutatedFields = scope.getMutatedFields();
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void i(long position) {
        int iK = H1.n.k(position);
        if (iK != getLeft()) {
            offsetLeftAndRight(iK - getLeft());
            this.matrixCache.c();
        }
        int iL = H1.n.l(position);
        if (iL != getTop()) {
            offsetTopAndBottom(iL - getTop());
            this.matrixCache.c();
        }
    }

    public final void setCameraDistancePx(float f10) {
        setCameraDistance(f10 * getResources().getDisplayMetrics().densityDpi);
    }
}
