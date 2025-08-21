package androidx.compose.ui.platform;

import U0.MutableRect;
import V0.C5473k0;
import V0.C5474k1;
import V0.C5492s0;
import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.OwnedLayer;
import androidx.recyclerview.widget.RecyclerView;
import com.fullstory.FS;
import com.fullstory.instrumentation.frameworks.compose.FSComposeRenderNodeLayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u00010BW\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00128\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020\fH\u0016¢\u0006\u0004\b%\u0010\u0013J!\u0010&\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\fH\u0016¢\u0006\u0004\b(\u0010\u0013J\u000f\u0010)\u001a\u00020\fH\u0016¢\u0006\u0004\b)\u0010\u0013J\"\u0010,\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010+\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020.2\u0006\u0010+\u001a\u00020\u001cH\u0016¢\u0006\u0004\b0\u00101JW\u00102\u001a\u00020\f28\u0010\r\u001a4\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0016¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u00020\f2\u0006\u00105\u001a\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001a\u00108\u001a\u00020\f2\u0006\u00105\u001a\u000204H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00107R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b6\u00109\u001a\u0004\b:\u0010;RJ\u0010\r\u001a6\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010<R\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010=R$\u0010?\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u001c8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010DR\u0016\u0010F\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010@R\u0016\u0010G\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010@R\u0018\u0010J\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020L0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010MR\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010PR\u001c\u0010T\u001a\u00020R8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b(\u0010SR\u0014\u0010V\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010UR\u0016\u0010Y\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010XR\u001a\u0010\\\u001a\u0002048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bZ\u0010[\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "name", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "l", "()V", "k", "(Landroidx/compose/ui/graphics/Canvas;)V", "Landroidx/compose/ui/graphics/g;", "scope", "g", "(Landroidx/compose/ui/graphics/g;)V", "LU0/f;", "position", "", "f", "(J)Z", "LH1/r;", "size", "e", "(J)V", "LH1/n;", "i", "invalidate", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "j", "destroy", "point", "inverse", "c", "(JZ)J", "LU0/d;", "rect", "b", "(LU0/d;Z)V", "d", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "LV0/k1;", "matrix", "a", "([F)V", "h", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "value", "isDirty", "Z", "setDirty", "(Z)V", "Landroidx/compose/ui/platform/Y0;", "Landroidx/compose/ui/platform/Y0;", "outlineResolver", "isDestroyed", "drawnWithZ", "LV0/o1;", "LV0/o1;", "softwareLayerPaint", "Landroidx/compose/ui/platform/R0;", "Landroidx/compose/ui/platform/w0;", "Landroidx/compose/ui/platform/R0;", "matrixCache", "LV0/k0;", "LV0/k0;", "canvasHolder", "Landroidx/compose/ui/graphics/i;", "J", "transformOrigin", "Landroidx/compose/ui/platform/w0;", "renderNode", "", "I", "mutatedFields", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "m", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RenderNodeLayer implements OwnedLayer, FSComposeRenderNodeLayer {

    /* renamed from: n, reason: collision with root package name */
    public static final int f52132n = 8;

    /* renamed from: o, reason: collision with root package name */
    private static final Function2<InterfaceC6043w0, Matrix, Unit> f52133o = a.f52146f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> invalidateParentLayer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isDestroyed;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithZ;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private V0.o1 softwareLayerPaint;
    private boolean isDirty;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6043w0 renderNode;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Y0 outlineResolver = new Y0();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final R0<InterfaceC6043w0> matrixCache = new R0<>(f52133o);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C5473k0 canvasHolder = new C5473k0();

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin = androidx.compose.ui.graphics.i.INSTANCE.a();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/platform/w0;", "rn", "Landroid/graphics/Matrix;", "matrix", "", "a", "(Landroidx/compose/ui/platform/w0;Landroid/graphics/Matrix;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function2<InterfaceC6043w0, Matrix, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f52146f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6043w0 interfaceC6043w0, Matrix matrix) {
            a(interfaceC6043w0, matrix);
            return Unit.f143329a;
        }

        public final void a(InterfaceC6043w0 interfaceC6043w0, Matrix matrix) {
            interfaceC6043w0.B(matrix);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/Canvas;", "it", "", "a", "(Landroidx/compose/ui/graphics/Canvas;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<Canvas, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Canvas, GraphicsLayer, Unit> f52147f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super Canvas, ? super GraphicsLayer, Unit> function2) {
            super(1);
            this.f52147f = function2;
        }

        public final void a(Canvas canvas) {
            this.f52147f.invoke(canvas, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Canvas canvas) {
            a(canvas);
            return Unit.f143329a;
        }
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeRenderNodeLayer
    public void _fsDrawLayer(Object obj) {
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeRenderNodeLayer
    public void _fsDrawLayer(Object obj, Object obj2) {
        __fs_original_drawLayer((Canvas) obj, (GraphicsLayer) obj2);
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeRenderNodeLayer
    /* renamed from: _fsIsDirty, reason: from getter */
    public final boolean getIsDirty() {
        return this.isDirty;
    }

    @Override // com.fullstory.instrumentation.frameworks.compose.FSComposeRenderNodeLayer
    public void _fsSetDirty(boolean z10) {
        setDirty(z10);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer parentLayer) {
        if (FS.compose_shouldDrawLayer(this, canvas, AndroidCanvas_androidKt.getNativeCanvas(canvas), parentLayer)) {
            __fs_original_drawLayer(canvas, parentLayer);
        }
    }

    private final void k(Canvas canvas) {
        if (this.renderNode.z() || this.renderNode.getClipToBounds()) {
            this.outlineResolver.a(canvas);
        }
    }

    private final void l() {
        if (Build.VERSION.SDK_INT >= 26) {
            e2.f52301a.a(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    private final void setDirty(boolean z10) {
        if (z10 != this.isDirty) {
            this.isDirty = z10;
            this.ownerView.G0(this, z10);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void a(float[] matrix) {
        C5474k1.l(matrix, this.matrixCache.b(this.renderNode));
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void b(MutableRect rect, boolean inverse) {
        if (inverse) {
            this.matrixCache.f(this.renderNode, rect);
        } else {
            this.matrixCache.d(this.renderNode, rect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public long c(long point, boolean inverse) {
        return inverse ? this.matrixCache.g(this.renderNode, point) : this.matrixCache.e(this.renderNode, point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void d(Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer) {
        this.matrixCache.h();
        setDirty(false);
        this.isDestroyed = false;
        this.drawnWithZ = false;
        this.transformOrigin = androidx.compose.ui.graphics.i.INSTANCE.a();
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        if (this.renderNode.p()) {
            this.renderNode.o();
        }
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        setDirty(false);
        this.ownerView.R0();
        this.ownerView.P0(this);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void e(long size) {
        int i10 = (int) (size >> 32);
        int i11 = (int) (size & 4294967295L);
        this.renderNode.D(androidx.compose.ui.graphics.i.f(this.transformOrigin) * i10);
        this.renderNode.E(androidx.compose.ui.graphics.i.g(this.transformOrigin) * i11);
        InterfaceC6043w0 interfaceC6043w0 = this.renderNode;
        if (interfaceC6043w0.w(interfaceC6043w0.getLeft(), this.renderNode.getTop(), this.renderNode.getLeft() + i10, this.renderNode.getTop() + i11)) {
            this.renderNode.G(this.outlineResolver.b());
            invalidate();
            this.matrixCache.c();
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public boolean f(long position) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & position));
        if (this.renderNode.getClipToBounds()) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) this.renderNode.getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) this.renderNode.getHeight());
        }
        if (this.renderNode.z()) {
            return this.outlineResolver.f(position);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo13getUnderlyingMatrixsQKQjiQ() {
        return this.matrixCache.b(this.renderNode);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void h(float[] matrix) {
        float[] fArrA = this.matrixCache.a(this.renderNode);
        if (fArrA != null) {
            C5474k1.l(matrix, fArrA);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void i(long position) {
        int iB = this.renderNode.getLeft();
        int iF = this.renderNode.getTop();
        int iK = H1.n.k(position);
        int iL = H1.n.l(position);
        if (iB == iK && iF == iL) {
            return;
        }
        if (iB != iK) {
            this.renderNode.C(iK - iB);
        }
        if (iF != iL) {
            this.renderNode.y(iL - iF);
        }
        l();
        this.matrixCache.c();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        setDirty(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void j() {
        if (this.isDirty || !this.renderNode.p()) {
            V0.q1 q1VarD = (!this.renderNode.z() || this.outlineResolver.e()) ? null : this.outlineResolver.d();
            Function2<? super Canvas, ? super GraphicsLayer, Unit> function2 = this.drawBlock;
            if (function2 != null) {
                this.renderNode.F(this.canvasHolder, q1VarD, new c(function2));
            }
            setDirty(false);
        }
    }

    public RenderNodeLayer(AndroidComposeView androidComposeView, Function2<? super Canvas, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        InterfaceC6043w0 c5997g1;
        this.ownerView = androidComposeView;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
        if (Build.VERSION.SDK_INT >= 29) {
            c5997g1 = new C6035t1(androidComposeView);
        } else {
            c5997g1 = new C5997g1(androidComposeView);
        }
        c5997g1.A(true);
        c5997g1.v(false);
        this.renderNode = c5997g1;
    }

    public void __fs_original_drawLayer(Canvas canvas, GraphicsLayer graphicsLayer) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean z10 = false;
        if (nativeCanvas.isHardwareAccelerated()) {
            j();
            if (this.renderNode.s() > 0.0f) {
                z10 = true;
            }
            this.drawnWithZ = z10;
            if (z10) {
                canvas.l();
            }
            this.renderNode.t(nativeCanvas);
            if (this.drawnWithZ) {
                canvas.t();
                return;
            }
            return;
        }
        float fB = this.renderNode.getLeft();
        float f10 = this.renderNode.getTop();
        float fC = this.renderNode.getRight();
        float fR = this.renderNode.getBottom();
        if (this.renderNode.a() < 1.0f) {
            V0.o1 o1VarA = this.softwareLayerPaint;
            if (o1VarA == null) {
                o1VarA = V0.P.a();
                this.softwareLayerPaint = o1VarA;
            }
            o1VarA.d(this.renderNode.a());
            nativeCanvas.saveLayer(fB, f10, fC, fR, o1VarA.getInternalPaint());
        } else {
            canvas.save();
        }
        canvas.d(fB, f10);
        canvas.u(this.matrixCache.b(this.renderNode));
        k(canvas);
        Function2<? super Canvas, ? super GraphicsLayer, Unit> function2 = this.drawBlock;
        if (function2 != null) {
            function2.invoke(canvas, null);
        }
        canvas.i();
        setDirty(false);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void g(androidx.compose.ui.graphics.g scope) {
        boolean z10;
        boolean z11;
        Function0<Unit> function0;
        boolean z12;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        int i10 = mutatedFields & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        if (i10 != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        boolean z13 = false;
        if (this.renderNode.z() && !this.outlineResolver.e()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((mutatedFields & 1) != 0) {
            this.renderNode.h(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.renderNode.m(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.renderNode.d(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.renderNode.n(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.renderNode.e(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.renderNode.x(scope.getShadowElevation());
        }
        if ((mutatedFields & 64) != 0) {
            this.renderNode.H(C5492s0.j(scope.getAmbientShadowColor()));
        }
        if ((mutatedFields & 128) != 0) {
            this.renderNode.J(C5492s0.j(scope.getSpotShadowColor()));
        }
        if ((mutatedFields & 1024) != 0) {
            this.renderNode.l(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.renderNode.j(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.renderNode.k(scope.getRotationY());
        }
        if ((mutatedFields & RecyclerView.m.FLAG_MOVED) != 0) {
            this.renderNode.i(scope.getCameraDistance());
        }
        if (i10 != 0) {
            this.renderNode.D(androidx.compose.ui.graphics.i.f(this.transformOrigin) * this.renderNode.getWidth());
            this.renderNode.E(androidx.compose.ui.graphics.i.g(this.transformOrigin) * this.renderNode.getHeight());
        }
        if (scope.getClip() && scope.getShape() != V0.x1.a()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((mutatedFields & 24576) != 0) {
            this.renderNode.I(z11);
            InterfaceC6043w0 interfaceC6043w0 = this.renderNode;
            if (scope.getClip() && scope.getShape() == V0.x1.a()) {
                z12 = true;
            } else {
                z12 = false;
            }
            interfaceC6043w0.v(z12);
        }
        if ((131072 & mutatedFields) != 0) {
            InterfaceC6043w0 interfaceC6043w02 = this.renderNode;
            scope.I();
            interfaceC6043w02.g(null);
        }
        if ((32768 & mutatedFields) != 0) {
            this.renderNode.u(scope.getCompositingStrategy());
        }
        boolean zH = this.outlineResolver.h(scope.getOutline(), scope.getAlpha(), z11, scope.getShadowElevation(), scope.getSize());
        if (this.outlineResolver.getCacheIsDirty()) {
            this.renderNode.G(this.outlineResolver.b());
        }
        if (z11 && !this.outlineResolver.e()) {
            z13 = true;
        }
        if (z10 == z13 && (!z13 || !zH)) {
            l();
        } else {
            invalidate();
        }
        if (!this.drawnWithZ && this.renderNode.s() > 0.0f && (function0 = this.invalidateParentLayer) != null) {
            function0.invoke();
        }
        if ((mutatedFields & 7963) != 0) {
            this.matrixCache.c();
        }
        this.mutatedFields = scope.getMutatedFields();
    }
}
