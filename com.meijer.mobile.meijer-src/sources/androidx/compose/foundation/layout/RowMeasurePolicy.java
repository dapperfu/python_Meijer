package androidx.compose.foundation.layout;

import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.ui.layout.InterfaceC5933s;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.recyclerview.widget.RecyclerView;
import j0.C14884E;
import j0.C14886G;
import j0.C14919w;
import j0.InterfaceC14885F;
import j0.RowColumnParentData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J,\u0010\u001c\u001a\u00020\u001b*\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010$\u001a\u00020#2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010%Ji\u0010,\u001a\u00020\u001b2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0&2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b,\u0010-J=\u00104\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\r2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u00020\r2\u0006\u00103\u001a\u000202H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J)\u00109\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b9\u0010:J)\u0010<\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010:J)\u0010=\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u00108\u001a\u00020\rH\u0016¢\u0006\u0004\b=\u0010:J)\u0010>\u001a\u00020\r*\u0002062\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002070\u00162\u0006\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b>\u0010:J\u0010\u0010@\u001a\u00020?HÖ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010F\u001a\u0002022\b\u0010E\u001a\u0004\u0018\u00010DHÖ\u0003¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010HR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010J\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006K"}, d2 = {"Landroidx/compose/foundation/layout/H;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lj0/F;", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "LP0/e$c;", "verticalAlignment", "<init>", "(Landroidx/compose/foundation/layout/d$e;LP0/e$c;)V", "Landroidx/compose/ui/layout/f0;", "placeable", "Lj0/H;", "parentData", "", "crossAxisLayoutSize", "beforeCrossAxisAlignmentLine", "v", "(Landroidx/compose/ui/layout/f0;Lj0/H;II)I", "h", "(Landroidx/compose/ui/layout/f0;)I", "k", "Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "measureScope", "", "c", "(I[I[ILandroidx/compose/ui/layout/K;)V", "", "placeables", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "f", "([Landroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/K;I[III[IIII)Landroidx/compose/ui/layout/J;", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "a", "(IIIIZ)J", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "height", "i", "(Landroidx/compose/ui/layout/s;Ljava/util/List;I)I", "width", "g", "e", "j", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/layout/d$e;", "b", "LP0/e$c;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.H, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class RowMeasurePolicy implements MeasurePolicy, InterfaceC14885F {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final C5800d.e horizontalArrangement;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final e.c verticalAlignment;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.H$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0[] f48663f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ RowMeasurePolicy f48664g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f48665h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f48666i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int[] f48667j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0[] f0VarArr, RowMeasurePolicy rowMeasurePolicy, int i10, int i11, int[] iArr) {
            super(1);
            this.f48663f = f0VarArr;
            this.f48664g = rowMeasurePolicy;
            this.f48665h = i10;
            this.f48666i = i11;
            this.f48667j = iArr;
        }

        public final void a(f0.a aVar) {
            f0[] f0VarArr = this.f48663f;
            RowMeasurePolicy rowMeasurePolicy = this.f48664g;
            int i10 = this.f48665h;
            int i11 = this.f48666i;
            int[] iArr = this.f48667j;
            int length = f0VarArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                f0 f0Var = f0VarArr[i12];
                Intrinsics.g(f0Var);
                f0.a.h(aVar, f0Var, iArr[i13], rowMeasurePolicy.v(f0Var, C14884E.d(f0Var), i10, i11), 0.0f, 4, null);
                i12++;
                i13++;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RowMeasurePolicy)) {
            return false;
        }
        RowMeasurePolicy rowMeasurePolicy = (RowMeasurePolicy) other;
        return Intrinsics.e(this.horizontalArrangement, rowMeasurePolicy.horizontalArrangement) && Intrinsics.e(this.verticalAlignment, rowMeasurePolicy.verticalAlignment);
    }

    public int hashCode() {
        return (this.horizontalArrangement.hashCode() * 31) + this.verticalAlignment.hashCode();
    }

    public String toString() {
        return "RowMeasurePolicy(horizontalArrangement=" + this.horizontalArrangement + ", verticalAlignment=" + this.verticalAlignment + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int v(f0 placeable, RowColumnParentData parentData, int crossAxisLayoutSize, int beforeCrossAxisAlignmentLine) {
        AbstractC5809m crossAxisAlignment = parentData != null ? parentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.a(crossAxisLayoutSize - placeable.getHeight(), H1.t.f13338a, placeable, beforeCrossAxisAlignmentLine) : this.verticalAlignment.a(0, crossAxisLayoutSize - placeable.getHeight());
    }

    @Override // j0.InterfaceC14885F
    public void c(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, androidx.compose.ui.layout.K measureScope) {
        this.horizontalArrangement.c(measureScope, mainAxisLayoutSize, childrenMainAxisSize, measureScope.getLayoutDirection(), mainAxisPositions);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int e(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        return C14919w.f139748a.b(list, i10, interfaceC5933s.E0(this.horizontalArrangement.getSpacing()));
    }

    @Override // j0.InterfaceC14885F
    public androidx.compose.ui.layout.J f(f0[] placeables, androidx.compose.ui.layout.K measureScope, int beforeCrossAxisAlignmentLine, int[] mainAxisPositions, int mainAxisLayoutSize, int crossAxisLayoutSize, int[] crossAxisOffset, int currentLineIndex, int startIndex, int endIndex) {
        return androidx.compose.ui.layout.K.G0(measureScope, mainAxisLayoutSize, crossAxisLayoutSize, null, new a(placeables, this, crossAxisLayoutSize, beforeCrossAxisAlignmentLine, mainAxisPositions), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int g(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        return C14919w.f139748a.c(list, i10, interfaceC5933s.E0(this.horizontalArrangement.getSpacing()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int i(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        return C14919w.f139748a.d(list, i10, interfaceC5933s.E0(this.horizontalArrangement.getSpacing()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int j(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        return C14919w.f139748a.a(list, i10, interfaceC5933s.E0(this.horizontalArrangement.getSpacing()));
    }

    public RowMeasurePolicy(C5800d.e eVar, e.c cVar) {
        this.horizontalArrangement = eVar;
        this.verticalAlignment = cVar;
    }

    @Override // j0.InterfaceC14885F
    public long a(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
        return G.a(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K k10, List<? extends androidx.compose.ui.layout.I> list, long j10) {
        return C14886G.a(this, H1.b.n(j10), H1.b.m(j10), H1.b.l(j10), H1.b.k(j10), k10.E0(this.horizontalArrangement.getSpacing()), k10, list, new f0[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & RecyclerView.m.FLAG_MOVED) != 0 ? 0 : 0);
    }

    @Override // j0.InterfaceC14885F
    public int h(f0 f0Var) {
        return f0Var.getWidth();
    }

    @Override // j0.InterfaceC14885F
    public int k(f0 f0Var) {
        return f0Var.getHeight();
    }
}
