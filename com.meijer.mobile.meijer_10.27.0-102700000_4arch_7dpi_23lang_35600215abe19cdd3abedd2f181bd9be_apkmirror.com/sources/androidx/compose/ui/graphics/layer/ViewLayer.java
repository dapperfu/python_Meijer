package androidx.compose.ui.graphics.layer;

import H1.t;
import V0.C5330k0;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.fullstory.FS;
import com.fullstory.instrumentation.FSDispatchDraw;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b%\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001(B#\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ@\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001fH\u0014¢\u0006\u0004\b!\u0010\"J7\u0010)\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0014¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0016H\u0016¢\u0006\u0004\b+\u0010\u001cR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u00100\u001a\u0004\b1\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00103R\"\u00107\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00104\u001a\u0004\b(\u0010\u001e\"\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R*\u0010?\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u000b8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u00104\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u00106R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR'\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayer;", "Landroid/view/View;", "ownerView", "LV0/k0;", "canvasHolder", "LX0/a;", "canvasDrawScope", "<init>", "(Landroid/view/View;LV0/k0;LX0/a;)V", "Landroid/graphics/Outline;", "outline", "", "d", "(Landroid/graphics/Outline;)Z", "LH1/d;", "density", "LH1/t;", "layoutDirection", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "parentLayer", "Lkotlin/Function1;", "LX0/f;", "", "Lkotlin/ExtensionFunctionType;", "drawBlock", "c", "(LH1/d;LH1/t;Landroidx/compose/ui/graphics/layer/GraphicsLayer;Lkotlin/jvm/functions/Function1;)V", "invalidate", "()V", "hasOverlappingRendering", "()Z", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "changed", "", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "forceLayout", "a", "Landroid/view/View;", "getOwnerView", "()Landroid/view/View;", "LV0/k0;", "getCanvasHolder", "()LV0/k0;", "LX0/a;", "Z", "setInvalidated", "(Z)V", "isInvalidated", "e", "Landroid/graphics/Outline;", "layerOutline", "value", "f", "getCanUseCompositingLayer$ui_graphics_release", "setCanUseCompositingLayer$ui_graphics_release", "canUseCompositingLayer", "g", "LH1/d;", "h", "LH1/t;", "i", "Lkotlin/jvm/functions/Function1;", "j", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "k", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ViewLayer extends View implements FSDispatchDraw {

    /* renamed from: l, reason: collision with root package name */
    private static final ViewOutlineProvider f50809l = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final View ownerView;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C5330k0 canvasHolder;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final X0.a canvasDrawScope;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isInvalidated;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Outline layerOutline;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean canUseCompositingLayer;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private H1.d density;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private t layoutDirection;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private Function1<? super X0.f, Unit> drawBlock;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer parentLayer;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/compose/ui/graphics/layer/ViewLayer$a", "Landroid/view/ViewOutlineProvider;", "Landroid/view/View;", "view", "Landroid/graphics/Outline;", "outline", "", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof ViewLayer) || (outline2 = ((ViewLayer) view).layerOutline) == null) {
                return;
            }
            outline.set(outline2);
        }

        a() {
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j10) {
        return fsSuperDrawChild_bba3a2fd611ad699d880b7e718a210d5(canvas, view, j10);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    public void fsSuperDispatchDraw_bba3a2fd611ad699d880b7e718a210d5(Canvas canvas) {
        if (FS.isRecordingDispatchDraw(this, canvas)) {
            return;
        }
        super.dispatchDraw(canvas);
    }

    public boolean fsSuperDrawChild_bba3a2fd611ad699d880b7e718a210d5(Canvas canvas, View view, long j10) {
        if (FS.isRecordingDrawChild(this, canvas, view, j10)) {
            return false;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsInvalidated() {
        return this.isInvalidated;
    }

    public final void c(H1.d density, t layoutDirection, GraphicsLayer parentLayer, Function1<? super X0.f, Unit> drawBlock) {
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = drawBlock;
        this.parentLayer = parentLayer;
    }

    public final boolean d(Outline outline) {
        this.layerOutline = outline;
        return g.f50929a.a(this);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        C5330k0 c5330k0 = this.canvasHolder;
        Canvas canvasZ = c5330k0.getAndroidCanvas().getInternalCanvas();
        c5330k0.getAndroidCanvas().A(canvas);
        androidx.compose.ui.graphics.a aVarA = c5330k0.getAndroidCanvas();
        X0.a aVar = this.canvasDrawScope;
        H1.d dVar = this.density;
        t tVar = this.layoutDirection;
        float width = getWidth();
        float height = getHeight();
        long jD = U0.k.d((Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        GraphicsLayer graphicsLayer = this.parentLayer;
        Function1<? super X0.f, Unit> function1 = this.drawBlock;
        H1.d density = aVar.getDrawContext().getDensity();
        t layoutDirection = aVar.getDrawContext().getLayoutDirection();
        androidx.compose.ui.graphics.Canvas canvasG = aVar.getDrawContext().g();
        long jB = aVar.getDrawContext().b();
        GraphicsLayer graphicsLayerI = aVar.getDrawContext().getGraphicsLayer();
        X0.d dVarL1 = aVar.getDrawContext();
        dVarL1.a(dVar);
        dVarL1.d(tVar);
        dVarL1.j(aVarA);
        dVarL1.h(jD);
        dVarL1.f(graphicsLayer);
        aVarA.save();
        try {
            function1.invoke(aVar);
            aVarA.i();
            X0.d dVarL12 = aVar.getDrawContext();
            dVarL12.a(density);
            dVarL12.d(layoutDirection);
            dVarL12.j(canvasG);
            dVarL12.h(jB);
            dVarL12.f(graphicsLayerI);
            c5330k0.getAndroidCanvas().A(canvasZ);
            this.isInvalidated = false;
        } catch (Throwable th2) {
            aVarA.i();
            X0.d dVarL13 = aVar.getDrawContext();
            dVarL13.a(density);
            dVarL13.d(layoutDirection);
            dVarL13.j(canvasG);
            dVarL13.h(jB);
            dVarL13.f(graphicsLayerI);
            throw th2;
        }
    }

    /* renamed from: getCanUseCompositingLayer$ui_graphics_release, reason: from getter */
    public final boolean getCanUseCompositingLayer() {
        return this.canUseCompositingLayer;
    }

    public final C5330k0 getCanvasHolder() {
        return this.canvasHolder;
    }

    public final View getOwnerView() {
        return this.ownerView;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z10) {
        if (this.canUseCompositingLayer != z10) {
            this.canUseCompositingLayer = z10;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z10) {
        this.isInvalidated = z10;
    }

    public ViewLayer(View view, C5330k0 c5330k0, X0.a aVar) {
        super(view.getContext());
        this.ownerView = view;
        this.canvasHolder = c5330k0;
        this.canvasDrawScope = aVar;
        setOutlineProvider(f50809l);
        this.canUseCompositingLayer = true;
        this.density = X0.e.a();
        this.layoutDirection = t.f12006a;
        this.drawBlock = b.INSTANCE.a();
        setWillNotDraw(false);
        setClipBounds(null);
    }
}
