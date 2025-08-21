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

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ9\u0010\u0012\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\r*\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J/\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJi\u0010'\u001a\u00020&2\u000e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010\u00182\u0006\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\rH\u0016¢\u0006\u0004\b'\u0010(J=\u00100\u001a\u00020/2\u0006\u0010)\u001a\u00020\r2\u0006\u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\r2\u0006\u0010.\u001a\u00020-H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J,\u00106\u001a\u00020&*\u00020\u001b2\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0006\u00105\u001a\u00020/H\u0016ø\u0001\u0001¢\u0006\u0004\b6\u00107J)\u0010;\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010:\u001a\u00020\rH\u0016¢\u0006\u0004\b;\u0010<J)\u0010>\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b>\u0010<J)\u0010?\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010:\u001a\u00020\rH\u0016¢\u0006\u0004\b?\u0010<J)\u0010@\u001a\u00020\r*\u0002082\f\u00104\u001a\b\u0012\u0004\u0012\u000209022\u0006\u0010=\u001a\u00020\rH\u0016¢\u0006\u0004\b@\u0010<J\u0010\u0010B\u001a\u00020AHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\rHÖ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010H\u001a\u00020-2\b\u0010G\u001a\u0004\u0018\u00010FHÖ\u0003¢\u0006\u0004\bH\u0010IR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010JR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006M"}, d2 = {"Landroidx/compose/foundation/layout/l;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lj0/F;", "Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "LP0/e$b;", "horizontalAlignment", "<init>", "(Landroidx/compose/foundation/layout/d$m;LP0/e$b;)V", "Landroidx/compose/ui/layout/f0;", "placeable", "Lj0/H;", "parentData", "", "crossAxisLayoutSize", "beforeCrossAxisAlignmentLine", "LH1/t;", "layoutDirection", "v", "(Landroidx/compose/ui/layout/f0;Lj0/H;IILH1/t;)I", "h", "(Landroidx/compose/ui/layout/f0;)I", "k", "mainAxisLayoutSize", "", "childrenMainAxisSize", "mainAxisPositions", "Landroidx/compose/ui/layout/K;", "measureScope", "", "c", "(I[I[ILandroidx/compose/ui/layout/K;)V", "", "placeables", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "Landroidx/compose/ui/layout/J;", "f", "([Landroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/K;I[III[IIII)Landroidx/compose/ui/layout/J;", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "LH1/b;", "a", "(IIIIZ)J", "", "Landroidx/compose/ui/layout/I;", "measurables", "constraints", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "height", "i", "(Landroidx/compose/ui/layout/s;Ljava/util/List;I)I", "width", "g", "e", "j", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/layout/d$m;", "b", "LP0/e$b;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.l, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final /* data */ class ColumnMeasurePolicy implements MeasurePolicy, InterfaceC14885F {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final C5800d.m verticalArrangement;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final e.b horizontalAlignment;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.l$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0[] f48841f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ColumnMeasurePolicy f48842g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f48843h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f48844i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.K f48845j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int[] f48846k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0[] f0VarArr, ColumnMeasurePolicy columnMeasurePolicy, int i10, int i11, androidx.compose.ui.layout.K k10, int[] iArr) {
            super(1);
            this.f48841f = f0VarArr;
            this.f48842g = columnMeasurePolicy;
            this.f48843h = i10;
            this.f48844i = i11;
            this.f48845j = k10;
            this.f48846k = iArr;
        }

        public final void a(f0.a aVar) {
            f0[] f0VarArr = this.f48841f;
            ColumnMeasurePolicy columnMeasurePolicy = this.f48842g;
            int i10 = this.f48843h;
            int i11 = this.f48844i;
            androidx.compose.ui.layout.K k10 = this.f48845j;
            int[] iArr = this.f48846k;
            int length = f0VarArr.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length) {
                f0 f0Var = f0VarArr[i12];
                Intrinsics.g(f0Var);
                f0.a.h(aVar, f0Var, columnMeasurePolicy.v(f0Var, C14884E.d(f0Var), i10, i11, k10.getLayoutDirection()), iArr[i13], 0.0f, 4, null);
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
        if (!(other instanceof ColumnMeasurePolicy)) {
            return false;
        }
        ColumnMeasurePolicy columnMeasurePolicy = (ColumnMeasurePolicy) other;
        return Intrinsics.e(this.verticalArrangement, columnMeasurePolicy.verticalArrangement) && Intrinsics.e(this.horizontalAlignment, columnMeasurePolicy.horizontalAlignment);
    }

    public int hashCode() {
        return (this.verticalArrangement.hashCode() * 31) + this.horizontalAlignment.hashCode();
    }

    public String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.verticalArrangement + ", horizontalAlignment=" + this.horizontalAlignment + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int v(f0 placeable, RowColumnParentData parentData, int crossAxisLayoutSize, int beforeCrossAxisAlignmentLine, H1.t layoutDirection) {
        AbstractC5809m crossAxisAlignment = parentData != null ? parentData.getCrossAxisAlignment() : null;
        return crossAxisAlignment != null ? crossAxisAlignment.a(crossAxisLayoutSize - placeable.getWidth(), layoutDirection, placeable, beforeCrossAxisAlignmentLine) : this.horizontalAlignment.a(0, crossAxisLayoutSize - placeable.getWidth(), layoutDirection);
    }

    @Override // j0.InterfaceC14885F
    public void c(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, androidx.compose.ui.layout.K measureScope) {
        this.verticalArrangement.b(measureScope, mainAxisLayoutSize, childrenMainAxisSize, mainAxisPositions);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int e(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        return C14919w.f139748a.f(list, i10, interfaceC5933s.E0(this.verticalArrangement.getSpacing()));
    }

    @Override // j0.InterfaceC14885F
    public androidx.compose.ui.layout.J f(f0[] placeables, androidx.compose.ui.layout.K measureScope, int beforeCrossAxisAlignmentLine, int[] mainAxisPositions, int mainAxisLayoutSize, int crossAxisLayoutSize, int[] crossAxisOffset, int currentLineIndex, int startIndex, int endIndex) {
        return androidx.compose.ui.layout.K.G0(measureScope, crossAxisLayoutSize, mainAxisLayoutSize, null, new a(placeables, this, crossAxisLayoutSize, beforeCrossAxisAlignmentLine, measureScope, mainAxisPositions), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int g(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        return C14919w.f139748a.g(list, i10, interfaceC5933s.E0(this.verticalArrangement.getSpacing()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int i(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        return C14919w.f139748a.h(list, i10, interfaceC5933s.E0(this.verticalArrangement.getSpacing()));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int j(InterfaceC5933s interfaceC5933s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        return C14919w.f139748a.e(list, i10, interfaceC5933s.E0(this.verticalArrangement.getSpacing()));
    }

    public ColumnMeasurePolicy(C5800d.m mVar, e.b bVar) {
        this.verticalArrangement = mVar;
        this.horizontalAlignment = bVar;
    }

    @Override // j0.InterfaceC14885F
    public long a(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
        return C5807k.b(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K k10, List<? extends androidx.compose.ui.layout.I> list, long j10) {
        return C14886G.a(this, H1.b.m(j10), H1.b.n(j10), H1.b.k(j10), H1.b.l(j10), k10.E0(this.verticalArrangement.getSpacing()), k10, list, new f0[list.size()], 0, list.size(), (3072 & 1024) != 0 ? null : null, (3072 & RecyclerView.m.FLAG_MOVED) != 0 ? 0 : 0);
    }

    @Override // j0.InterfaceC14885F
    public int h(f0 f0Var) {
        return f0Var.getHeight();
    }

    @Override // j0.InterfaceC14885F
    public int k(f0 f0Var) {
        return f0Var.getWidth();
    }
}
