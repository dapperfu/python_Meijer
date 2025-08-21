package androidx.compose.ui.platform;

import U0.MutableRect;
import V0.AbstractC5480m1;
import V0.C5474k1;
import V0.C5477l1;
import V0.InterfaceC5453d1;
import Y0.C5592a;
import android.os.Build;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.OwnedLayer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import j1.C14920a;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002Bi\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u00128\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u0016J\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020&H\u0016ø\u0001\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020)H\u0016ø\u0001\u0001¢\u0006\u0004\b+\u0010(J!\u0010,\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0016¢\u0006\u0004\b.\u0010\u0016J\u000f\u0010/\u001a\u00020\u000fH\u0016¢\u0006\u0004\b/\u0010\u0016J\u000f\u00100\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u0010\u0016J\"\u00103\u001a\u00020!2\u0006\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020#H\u0016ø\u0001\u0001¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u000f2\u0006\u00106\u001a\u0002052\u0006\u00102\u001a\u00020#H\u0016¢\u0006\u0004\b7\u00108JW\u00109\u001a\u00020\u000f28\u0010\u0010\u001a4\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0016¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u0018H\u0016ø\u0001\u0001¢\u0006\u0004\b<\u0010=J\u001a\u0010>\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020\u0018H\u0016ø\u0001\u0001¢\u0006\u0004\b>\u0010=R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010?R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010@R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010ARJ\u0010\u0010\u001a6\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010BR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010CR\u001c\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b$\u0010DR\u0016\u0010F\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010ER\u001a\u0010H\u001a\u00020\u00188\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b>\u0010GR\u001e\u0010I\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b'\u0010GR$\u0010M\u001a\u00020#2\u0006\u0010J\u001a\u00020#8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b.\u0010E\"\u0004\bK\u0010LR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010T\u001a\u00020R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010SR\u0014\u0010\u001e\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010VR\u0016\u0010Y\u001a\u00020W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010XR\u001c\u0010[\u001a\u00020Z8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010DR\u0018\u0010^\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010]R\u0016\u0010_\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010ER\u0016\u0010a\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010ER\u0016\u0010c\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010ER\u0016\u0010e\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010ER%\u0010k\u001a\u0013\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u000f0f¢\u0006\u0002\bh8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001a\u0010m\u001a\u00020\u00188VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\bl\u0010\u001a\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006n"}, d2 = {"Landroidx/compose/ui/platform/F0;", "Landroidx/compose/ui/node/OwnedLayer;", "", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "LV0/d1;", "context", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Lkotlin/Function2;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ParameterName;", "name", "canvas", "parentLayer", "", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "<init>", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;LV0/d1;Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "o", "()V", "q", "LV0/k1;", "m", "()[F", "l", "p", "Landroidx/compose/ui/graphics/g;", "scope", "g", "(Landroidx/compose/ui/graphics/g;)V", "LU0/f;", "position", "", "f", "(J)Z", "LH1/n;", "i", "(J)V", "LH1/r;", "size", "e", "drawLayer", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "j", "invalidate", "destroy", "point", "inverse", "c", "(JZ)J", "LU0/d;", "rect", "b", "(LU0/d;Z)V", "d", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "matrix", "a", "([F)V", "h", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "LV0/d1;", "Landroidx/compose/ui/platform/AndroidComposeView;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function0;", "J", "Z", "isDestroyed", "[F", "matrixCache", "inverseMatrixCache", "value", "n", "(Z)V", "isDirty", "LH1/d;", "k", "LH1/d;", "density", "LH1/t;", "LH1/t;", "layoutDirection", "LX0/a;", "LX0/a;", "", "I", "mutatedFields", "Landroidx/compose/ui/graphics/i;", "transformOrigin", "LV0/m1;", "LV0/m1;", "outline", "isMatrixDirty", "r", "isInverseMatrixDirty", "s", "isIdentity", "t", "drawnWithEnabledZ", "Lkotlin/Function1;", "LX0/f;", "Lkotlin/ExtensionFunctionType;", "u", "Lkotlin/jvm/functions/Function1;", "recordLambda", "getUnderlyingMatrix-sQKQjiQ", "underlyingMatrix", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class F0 implements OwnedLayer {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private GraphicsLayer graphicsLayer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5453d1 context;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView ownerView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> invalidateParentLayer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isDestroyed;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float[] matrixCache;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float[] inverseMatrixCache;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isDirty;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private H1.d density;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private H1.t layoutDirection;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final X0.a scope;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int mutatedFields;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private AbstractC5480m1 outline;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean isMatrixDirty;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isInverseMatrixDirty;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isIdentity;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean drawnWithEnabledZ;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Function1<X0.f, Unit> recordLambda;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function1<X0.f, Unit> {
        a() {
            super(1);
        }

        public final void a(X0.f fVar) {
            F0 f02 = F0.this;
            Canvas canvasG = fVar.getDrawContext().g();
            Function2 function2 = f02.drawBlock;
            if (function2 != null) {
                function2.invoke(canvasG, fVar.getDrawContext().getGraphicsLayer());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f143329a;
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.isDestroyed = true;
        n(false);
        InterfaceC5453d1 interfaceC5453d1 = this.context;
        if (interfaceC5453d1 != null) {
            interfaceC5453d1.b(this.graphicsLayer);
            this.ownerView.P0(this);
        }
    }

    private final float[] l() {
        float[] fArrC = this.inverseMatrixCache;
        if (fArrC == null) {
            fArrC = C5474k1.c(null, 1, null);
            this.inverseMatrixCache = fArrC;
        }
        if (!this.isInverseMatrixDirty) {
            if (Float.isNaN(fArrC[0])) {
                return null;
            }
            return fArrC;
        }
        this.isInverseMatrixDirty = false;
        float[] fArrM = m();
        if (this.isIdentity) {
            return fArrM;
        }
        if (P0.a(fArrM, fArrC)) {
            return fArrC;
        }
        fArrC[0] = Float.NaN;
        return null;
    }

    private final void n(boolean z10) {
        if (z10 != this.isDirty) {
            this.isDirty = z10;
            this.ownerView.G0(this, z10);
        }
    }

    private final void o() {
        if (Build.VERSION.SDK_INT >= 26) {
            e2.f52301a.a(this.ownerView);
        } else {
            this.ownerView.invalidate();
        }
    }

    private final void p() {
        if (this.isMatrixDirty) {
            GraphicsLayer graphicsLayer = this.graphicsLayer;
            long jB = (graphicsLayer.getPivotOffset() & 9223372034707292159L) == 9205357640488583168L ? U0.l.b(H1.s.d(this.size)) : graphicsLayer.getPivotOffset();
            C5474k1.i(this.matrixCache, Float.intBitsToFloat((int) (jB >> 32)), Float.intBitsToFloat((int) (jB & 4294967295L)), graphicsLayer.y(), graphicsLayer.z(), 1.0f, graphicsLayer.q(), graphicsLayer.r(), graphicsLayer.s(), graphicsLayer.t(), graphicsLayer.u(), 1.0f);
            this.isMatrixDirty = false;
            this.isIdentity = C5477l1.a(this.matrixCache);
        }
    }

    private final void q() {
        Function0<Unit> function0;
        AbstractC5480m1 abstractC5480m1 = this.outline;
        if (abstractC5480m1 == null) {
            return;
        }
        C5592a.b(this.graphicsLayer, abstractC5480m1);
        if (!(abstractC5480m1 instanceof AbstractC5480m1.a) || Build.VERSION.SDK_INT >= 33 || (function0 = this.invalidateParentLayer) == null) {
            return;
        }
        function0.invoke();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void b(MutableRect rect, boolean inverse) {
        float[] fArrL = inverse ? l() : m();
        if (this.isIdentity) {
            return;
        }
        if (fArrL == null) {
            rect.g(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            C5474k1.g(fArrL, rect);
        }
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public long c(long point, boolean inverse) {
        float[] fArrM;
        if (inverse) {
            fArrM = l();
            if (fArrM == null) {
                return U0.f.INSTANCE.a();
            }
        } else {
            fArrM = m();
        }
        return this.isIdentity ? point : C5474k1.f(fArrM, point);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void d(Function2<? super Canvas, ? super GraphicsLayer, Unit> drawBlock, Function0<Unit> invalidateParentLayer) {
        InterfaceC5453d1 interfaceC5453d1 = this.context;
        if (interfaceC5453d1 == null) {
            C14920a.c("currently reuse is only supported when we manage the layer lifecycle");
            throw new KotlinNothingValueException();
        }
        if (!this.graphicsLayer.getIsReleased()) {
            C14920a.a("layer should have been released before reuse");
        }
        this.graphicsLayer = interfaceC5453d1.a();
        this.isDestroyed = false;
        this.drawBlock = drawBlock;
        this.invalidateParentLayer = invalidateParentLayer;
        this.isMatrixDirty = false;
        this.isInverseMatrixDirty = false;
        this.isIdentity = true;
        C5474k1.h(this.matrixCache);
        float[] fArr = this.inverseMatrixCache;
        if (fArr != null) {
            C5474k1.h(fArr);
        }
        this.transformOrigin = androidx.compose.ui.graphics.i.INSTANCE.a();
        this.drawnWithEnabledZ = false;
        long j10 = a.e.API_PRIORITY_OTHER;
        this.size = H1.r.c((j10 & 4294967295L) | (j10 << 32));
        this.outline = null;
        this.mutatedFields = 0;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void e(long size) {
        if (H1.r.e(size, this.size)) {
            return;
        }
        this.size = size;
        invalidate();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public boolean f(long position) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (position >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (position & 4294967295L));
        if (this.graphicsLayer.getClip()) {
            return C1.c(this.graphicsLayer.o(), fIntBitsToFloat, fIntBitsToFloat2, null, null, 24, null);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void i(long position) {
        this.graphicsLayer.c0(position);
        o();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if (this.isDirty || this.isDestroyed) {
            return;
        }
        this.ownerView.invalidate();
        n(true);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void j() {
        if (this.isDirty) {
            if (!androidx.compose.ui.graphics.i.e(this.transformOrigin, androidx.compose.ui.graphics.i.INSTANCE.a()) && !H1.r.e(this.graphicsLayer.getSize(), this.size)) {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float f10 = androidx.compose.ui.graphics.i.f(this.transformOrigin) * ((int) (this.size >> 32));
                float fG = androidx.compose.ui.graphics.i.g(this.transformOrigin) * ((int) (this.size & 4294967295L));
                graphicsLayer.P(U0.f.e((Float.floatToRawIntBits(fG) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)));
            }
            this.graphicsLayer.E(this.density, this.layoutDirection, this.size, this.recordLambda);
            n(false);
        }
    }

    public F0(GraphicsLayer graphicsLayer, InterfaceC5453d1 interfaceC5453d1, AndroidComposeView androidComposeView, Function2<? super Canvas, ? super GraphicsLayer, Unit> function2, Function0<Unit> function0) {
        this.graphicsLayer = graphicsLayer;
        this.context = interfaceC5453d1;
        this.ownerView = androidComposeView;
        this.drawBlock = function2;
        this.invalidateParentLayer = function0;
        long j10 = a.e.API_PRIORITY_OTHER;
        this.size = H1.r.c((j10 & 4294967295L) | (j10 << 32));
        this.matrixCache = C5474k1.c(null, 1, null);
        this.density = H1.f.b(1.0f, 0.0f, 2, null);
        this.layoutDirection = H1.t.f13338a;
        this.scope = new X0.a();
        this.transformOrigin = androidx.compose.ui.graphics.i.INSTANCE.a();
        this.isIdentity = true;
        this.recordLambda = new a();
    }

    private final float[] m() {
        p();
        return this.matrixCache;
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void a(float[] matrix) {
        C5474k1.l(matrix, m());
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas, GraphicsLayer parentLayer) {
        boolean z10;
        j();
        if (this.graphicsLayer.v() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.drawnWithEnabledZ = z10;
        X0.d drawContext = this.scope.getDrawContext();
        drawContext.j(canvas);
        drawContext.f(parentLayer);
        C5592a.a(this.scope, this.graphicsLayer);
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void g(androidx.compose.ui.graphics.g scope) {
        int iB;
        Function0<Unit> function0;
        int mutatedFields = scope.getMutatedFields() | this.mutatedFields;
        this.layoutDirection = scope.getLayoutDirection();
        this.density = scope.getGraphicsDensity();
        int i10 = mutatedFields & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
        if (i10 != 0) {
            this.transformOrigin = scope.getTransformOrigin();
        }
        if ((mutatedFields & 1) != 0) {
            this.graphicsLayer.X(scope.getScaleX());
        }
        if ((mutatedFields & 2) != 0) {
            this.graphicsLayer.Y(scope.getScaleY());
        }
        if ((mutatedFields & 4) != 0) {
            this.graphicsLayer.J(scope.getAlpha());
        }
        if ((mutatedFields & 8) != 0) {
            this.graphicsLayer.d0(scope.getTranslationX());
        }
        if ((mutatedFields & 16) != 0) {
            this.graphicsLayer.e0(scope.getTranslationY());
        }
        if ((mutatedFields & 32) != 0) {
            this.graphicsLayer.Z(scope.getShadowElevation());
            if (scope.getShadowElevation() > 0.0f && !this.drawnWithEnabledZ && (function0 = this.invalidateParentLayer) != null) {
                function0.invoke();
            }
        }
        if ((mutatedFields & 64) != 0) {
            this.graphicsLayer.K(scope.getAmbientShadowColor());
        }
        if ((mutatedFields & 128) != 0) {
            this.graphicsLayer.b0(scope.getSpotShadowColor());
        }
        if ((mutatedFields & 1024) != 0) {
            this.graphicsLayer.V(scope.getRotationZ());
        }
        if ((mutatedFields & 256) != 0) {
            this.graphicsLayer.T(scope.getRotationX());
        }
        if ((mutatedFields & 512) != 0) {
            this.graphicsLayer.U(scope.getRotationY());
        }
        if ((mutatedFields & RecyclerView.m.FLAG_MOVED) != 0) {
            this.graphicsLayer.L(scope.getCameraDistance());
        }
        if (i10 != 0) {
            if (androidx.compose.ui.graphics.i.e(this.transformOrigin, androidx.compose.ui.graphics.i.INSTANCE.a())) {
                this.graphicsLayer.P(U0.f.INSTANCE.b());
            } else {
                GraphicsLayer graphicsLayer = this.graphicsLayer;
                float f10 = androidx.compose.ui.graphics.i.f(this.transformOrigin) * ((int) (this.size >> 32));
                graphicsLayer.P(U0.f.e((Float.floatToRawIntBits(androidx.compose.ui.graphics.i.g(this.transformOrigin) * ((int) (this.size & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32)));
            }
        }
        if ((mutatedFields & 16384) != 0) {
            this.graphicsLayer.M(scope.getClip());
        }
        if ((131072 & mutatedFields) != 0) {
            GraphicsLayer graphicsLayer2 = this.graphicsLayer;
            scope.I();
            graphicsLayer2.S(null);
        }
        if ((32768 & mutatedFields) != 0) {
            GraphicsLayer graphicsLayer3 = this.graphicsLayer;
            int compositingStrategy = scope.getCompositingStrategy();
            c.Companion companion = androidx.compose.ui.graphics.c.INSTANCE;
            if (androidx.compose.ui.graphics.c.e(compositingStrategy, companion.a())) {
                iB = androidx.compose.ui.graphics.layer.a.INSTANCE.a();
            } else if (androidx.compose.ui.graphics.c.e(compositingStrategy, companion.c())) {
                iB = androidx.compose.ui.graphics.layer.a.INSTANCE.c();
            } else if (androidx.compose.ui.graphics.c.e(compositingStrategy, companion.b())) {
                iB = androidx.compose.ui.graphics.layer.a.INSTANCE.b();
            } else {
                throw new IllegalStateException("Not supported composition strategy");
            }
            graphicsLayer3.N(iB);
        }
        boolean z10 = true;
        if ((mutatedFields & 7963) != 0) {
            this.isMatrixDirty = true;
            this.isInverseMatrixDirty = true;
        }
        if (!Intrinsics.e(this.outline, scope.getOutline())) {
            this.outline = scope.getOutline();
            q();
        } else {
            z10 = false;
        }
        this.mutatedFields = scope.getMutatedFields();
        if (mutatedFields == 0 && !z10) {
            return;
        }
        o();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo13getUnderlyingMatrixsQKQjiQ() {
        return m();
    }

    @Override // androidx.compose.ui.node.OwnedLayer
    public void h(float[] matrix) {
        float[] fArrL = l();
        if (fArrL != null) {
            C5474k1.l(matrix, fArrL);
        }
    }
}
