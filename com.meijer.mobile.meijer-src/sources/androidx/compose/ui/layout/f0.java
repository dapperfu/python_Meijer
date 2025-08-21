package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b'\u0018\u00002\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J=\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0019\u0010\r\u001a\u0015\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n¢\u0006\u0002\b\fH$ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0014ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R0\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R0\u0010+\u001a\u00020'2\u0006\u0010\u001f\u001a\u00020'8\u0004@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#\"\u0004\b*\u0010%R*\u0010.\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00068\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b,\u0010!\u001a\u0004\b-\u0010#R\u0014\u00100\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u0019R\u0014\u00102\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00063"}, d2 = {"Landroidx/compose/ui/layout/f0;", "Landroidx/compose/ui/layout/L;", "<init>", "()V", "", "S0", "LH1/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/e;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "V0", "(JFLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "T0", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "", "<set-?>", "a", "I", "R0", "()I", "width", "b", "B0", "height", "LH1/r;", "value", "c", "J", "L0", "()J", "Z0", "(J)V", "measuredSize", "LH1/b;", "d", "Q0", "b1", "measurementConstraints", "e", "y0", "apparentToRealOffset", "M0", "measuredWidth", "J0", "measuredHeight", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class f0 implements L {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int height;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long measuredSize;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long measurementConstraints = g0.f51310b;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long apparentToRealOffset = H1.n.INSTANCE.b();

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\f\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0012J&\u0010\u0014\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\rJA\u0010\u0019\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0002\b\u0017ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJF\u0010\u001b\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u001b\u0010\u001cJF\u0010\u001d\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b\u001d\u0010\u001cJA\u0010\u001e\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0019\b\u0002\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0002\b\u0017ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ.\u0010\u000f\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010!J.\u0010\"\u001a\u00020\u0005*\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\"\u0010!J&\u0010$\u001a\u00020\u00052\u0017\u0010#\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0002\b\u0017¢\u0006\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u000e8$X¤\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8$X¤\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "<init>", "()V", "Landroidx/compose/ui/layout/f0;", "", "f", "(Landroidx/compose/ui/layout/f0;)V", "LH1/n;", "position", "", "zIndex", "m", "(Landroidx/compose/ui/layout/f0;JF)V", "", "x", "y", "k", "(Landroidx/compose/ui/layout/f0;IIF)V", "g", "i", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/e;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "q", "(Landroidx/compose/ui/layout/f0;JFLkotlin/jvm/functions/Function1;)V", "o", "(Landroidx/compose/ui/layout/f0;IIFLkotlin/jvm/functions/Function1;)V", "u", "w", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "(Landroidx/compose/ui/layout/f0;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "r", "block", "A", "(Lkotlin/jvm/functions/Function1;)V", "", "a", "Z", "motionFrameOfReferencePlacement", "e", "()I", "parentWidth", "LH1/t;", "d", "()LH1/t;", "parentLayoutDirection", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean motionFrameOfReferencePlacement;

        public final void A(Function1<? super a, Unit> block) {
            this.motionFrameOfReferencePlacement = true;
            block.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: d */
        public abstract H1.t getParentLayoutDirection();

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: e */
        public abstract int getParentWidth();

        public final void g(f0 f0Var, int i10, int i11, float f10) {
            long jF = H1.n.f((i11 & 4294967295L) | (i10 << 32));
            f(f0Var);
            f0Var.V0(H1.n.o(jF, f0Var.apparentToRealOffset), f10, null);
        }

        public final void k(f0 f0Var, int i10, int i11, float f10) {
            long jF = H1.n.f((i10 << 32) | (i11 & 4294967295L));
            if (getParentLayoutDirection() == H1.t.f13338a || getParentWidth() == 0) {
                f(f0Var);
                f0Var.V0(H1.n.o(jF, f0Var.apparentToRealOffset), f10, null);
            } else {
                long jF2 = H1.n.f((((getParentWidth() - f0Var.getWidth()) - H1.n.k(jF)) << 32) | (H1.n.l(jF) & 4294967295L));
                f(f0Var);
                f0Var.V0(H1.n.o(jF2, f0Var.apparentToRealOffset), f10, null);
            }
        }

        public final void o(f0 f0Var, int i10, int i11, float f10, Function1<? super androidx.compose.ui.graphics.e, Unit> function1) {
            long jF = H1.n.f((i10 << 32) | (i11 & 4294967295L));
            if (getParentLayoutDirection() == H1.t.f13338a || getParentWidth() == 0) {
                f(f0Var);
                f0Var.V0(H1.n.o(jF, f0Var.apparentToRealOffset), f10, function1);
            } else {
                long jF2 = H1.n.f((((getParentWidth() - f0Var.getWidth()) - H1.n.k(jF)) << 32) | (H1.n.l(jF) & 4294967295L));
                f(f0Var);
                f0Var.V0(H1.n.o(jF2, f0Var.apparentToRealOffset), f10, function1);
            }
        }

        public final void u(f0 f0Var, int i10, int i11, float f10, Function1<? super androidx.compose.ui.graphics.e, Unit> function1) {
            long jF = H1.n.f((i11 & 4294967295L) | (i10 << 32));
            f(f0Var);
            f0Var.V0(H1.n.o(jF, f0Var.apparentToRealOffset), f10, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void f(f0 f0Var) {
            if (f0Var instanceof androidx.compose.ui.node.Z) {
                ((androidx.compose.ui.node.Z) f0Var).R(this.motionFrameOfReferencePlacement);
            }
        }

        public static /* synthetic */ void h(a aVar, f0 f0Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.g(f0Var, i10, i11, f10);
        }

        public static /* synthetic */ void j(a aVar, f0 f0Var, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.i(f0Var, j10, f10);
        }

        public static /* synthetic */ void l(a aVar, f0 f0Var, int i10, int i11, float f10, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.k(f0Var, i10, i11, f10);
        }

        public static /* synthetic */ void n(a aVar, f0 f0Var, long j10, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            aVar.m(f0Var, j10, f10);
        }

        public static /* synthetic */ void p(a aVar, f0 f0Var, int i10, int i11, float f10, Function1 function1, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                function1 = g0.f51309a;
            }
            aVar.o(f0Var, i10, i11, f11, function1);
        }

        public static /* synthetic */ void s(a aVar, f0 f0Var, long j10, float f10, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                function1 = g0.f51309a;
            }
            aVar.q(f0Var, j10, f11, function1);
        }

        public static /* synthetic */ void t(a aVar, f0 f0Var, long j10, GraphicsLayer graphicsLayer, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.r(f0Var, j10, graphicsLayer, f10);
        }

        public static /* synthetic */ void v(a aVar, f0 f0Var, int i10, int i11, float f10, Function1 function1, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i12 & 4) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i12 & 8) != 0) {
                function1 = g0.f51309a;
            }
            aVar.u(f0Var, i10, i11, f11, function1);
        }

        public static /* synthetic */ void y(a aVar, f0 f0Var, long j10, float f10, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 2) != 0) {
                f10 = 0.0f;
            }
            float f11 = f10;
            if ((i10 & 4) != 0) {
                function1 = g0.f51309a;
            }
            aVar.w(f0Var, j10, f11, function1);
        }

        public static /* synthetic */ void z(a aVar, f0 f0Var, long j10, GraphicsLayer graphicsLayer, float f10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i10 & 4) != 0) {
                f10 = 0.0f;
            }
            aVar.x(f0Var, j10, graphicsLayer, f10);
        }

        public final void i(f0 f0Var, long j10, float f10) {
            f(f0Var);
            f0Var.V0(H1.n.o(j10, f0Var.apparentToRealOffset), f10, null);
        }

        public final void m(f0 f0Var, long j10, float f10) {
            if (getParentLayoutDirection() == H1.t.f13338a || getParentWidth() == 0) {
                f(f0Var);
                f0Var.V0(H1.n.o(j10, f0Var.apparentToRealOffset), f10, null);
                return;
            }
            long jF = H1.n.f((H1.n.l(j10) & 4294967295L) | (((getParentWidth() - f0Var.getWidth()) - H1.n.k(j10)) << 32));
            f(f0Var);
            f0Var.V0(H1.n.o(jF, f0Var.apparentToRealOffset), f10, null);
        }

        public final void q(f0 f0Var, long j10, float f10, Function1<? super androidx.compose.ui.graphics.e, Unit> function1) {
            if (getParentLayoutDirection() == H1.t.f13338a || getParentWidth() == 0) {
                f(f0Var);
                f0Var.V0(H1.n.o(j10, f0Var.apparentToRealOffset), f10, function1);
                return;
            }
            long jF = H1.n.f((H1.n.l(j10) & 4294967295L) | (((getParentWidth() - f0Var.getWidth()) - H1.n.k(j10)) << 32));
            f(f0Var);
            f0Var.V0(H1.n.o(jF, f0Var.apparentToRealOffset), f10, function1);
        }

        public final void r(f0 f0Var, long j10, GraphicsLayer graphicsLayer, float f10) {
            if (getParentLayoutDirection() == H1.t.f13338a || getParentWidth() == 0) {
                f(f0Var);
                f0Var.T0(H1.n.o(j10, f0Var.apparentToRealOffset), f10, graphicsLayer);
                return;
            }
            long jF = H1.n.f((H1.n.l(j10) & 4294967295L) | (((getParentWidth() - f0Var.getWidth()) - H1.n.k(j10)) << 32));
            f(f0Var);
            f0Var.T0(H1.n.o(jF, f0Var.apparentToRealOffset), f10, graphicsLayer);
        }

        public final void w(f0 f0Var, long j10, float f10, Function1<? super androidx.compose.ui.graphics.e, Unit> function1) {
            f(f0Var);
            f0Var.V0(H1.n.o(j10, f0Var.apparentToRealOffset), f10, function1);
        }

        public final void x(f0 f0Var, long j10, GraphicsLayer graphicsLayer, float f10) {
            f(f0Var);
            f0Var.T0(H1.n.o(j10, f0Var.apparentToRealOffset), f10, graphicsLayer);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void T0(long position, float zIndex, GraphicsLayer layer) {
        V0(position, zIndex, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void V0(long position, float zIndex, Function1<? super androidx.compose.ui.graphics.e, Unit> layerBlock);

    private final void S0() {
        this.width = RangesKt.o((int) (this.measuredSize >> 32), H1.b.n(this.measurementConstraints), H1.b.l(this.measurementConstraints));
        this.height = RangesKt.o((int) (this.measuredSize & 4294967295L), H1.b.m(this.measurementConstraints), H1.b.k(this.measurementConstraints));
        int i10 = this.width;
        long j10 = this.measuredSize;
        this.apparentToRealOffset = H1.n.f((((i10 - ((int) (j10 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j10 & 4294967295L))) / 2)));
    }

    /* renamed from: B0, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public int J0() {
        return (int) (this.measuredSize & 4294967295L);
    }

    /* renamed from: L0, reason: from getter */
    protected final long getMeasuredSize() {
        return this.measuredSize;
    }

    public int M0() {
        return (int) (this.measuredSize >> 32);
    }

    /* renamed from: Q0, reason: from getter */
    protected final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    /* renamed from: R0, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    protected final void Z0(long j10) {
        if (H1.r.e(this.measuredSize, j10)) {
            return;
        }
        this.measuredSize = j10;
        S0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b1(long j10) {
        if (H1.b.f(this.measurementConstraints, j10)) {
            return;
        }
        this.measurementConstraints = j10;
        S0();
    }

    /* renamed from: y0, reason: from getter */
    protected final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    public f0() {
        long j10 = 0;
        this.measuredSize = H1.r.c((j10 & 4294967295L) | (j10 << 32));
    }
}
