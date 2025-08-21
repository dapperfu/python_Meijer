package androidx.compose.foundation.layout;

import Z.C5616n;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.layout.InterfaceC5933s;
import androidx.compose.ui.layout.f0;
import com.google.android.gms.common.api.a;
import j0.C14881B;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u001c\u001a\u00020\u001b*\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010!\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b!\u0010\"J/\u0010$\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010\"J/\u0010%\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010#\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\"J/\u0010&\u001a\u00020\u000e*\u00020\u001e2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00162\u0006\u0010 \u001a\u00020\u000eH\u0016¢\u0006\u0004\b&\u0010\"JK\u0010)\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010'\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J+\u0010,\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e¢\u0006\u0004\b,\u0010-JK\u0010/\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b/\u0010*J\u0019\u00101\u001a\u00020\u000e*\u00020\u001f2\u0006\u00100\u001a\u00020\u000e¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\u000e*\u00020\u001f2\u0006\u00100\u001a\u00020\u000e¢\u0006\u0004\b3\u00102J\u0019\u00104\u001a\u00020\u000e*\u00020\u001f2\u0006\u00100\u001a\u00020\u000e¢\u0006\u0004\b4\u00102J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b8\u00109J\u001a\u0010<\u001a\u00020\u00032\b\u0010;\u001a\u0004\u0018\u00010:HÖ\u0003¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b@\u0010B\u001a\u0004\bC\u0010DR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010IR\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010\r\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bM\u0010IR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010NR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010P\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Q"}, d2 = {"Landroidx/compose/foundation/layout/t;", "Landroidx/compose/ui/layout/N;", "Landroidx/compose/foundation/layout/s;", "", "isHorizontal", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "LH1/h;", "mainAxisSpacing", "Landroidx/compose/foundation/layout/m;", "crossAxisAlignment", "crossAxisArrangementSpacing", "", "maxItemsInMainAxis", "maxLines", "Landroidx/compose/foundation/layout/r;", "overflow", "<init>", "(ZLandroidx/compose/foundation/layout/d$e;Landroidx/compose/foundation/layout/d$m;FLandroidx/compose/foundation/layout/m;FIILandroidx/compose/foundation/layout/r;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "height", "i", "(Landroidx/compose/ui/layout/s;Ljava/util/List;I)I", "width", "g", "j", "e", "crossAxisAvailable", "crossAxisSpacing", "u", "(Ljava/util/List;IIIIILandroidx/compose/foundation/layout/r;)I", "arrangementSpacing", "o", "(Ljava/util/List;II)I", "mainAxisAvailable", "n", "size", "p", "(Landroidx/compose/ui/layout/r;I)I", "t", "v", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Landroidx/compose/foundation/layout/d$e;", "r", "()Landroidx/compose/foundation/layout/d$e;", "c", "Landroidx/compose/foundation/layout/d$m;", "s", "()Landroidx/compose/foundation/layout/d$m;", "F", "Landroidx/compose/foundation/layout/m;", "m", "()Landroidx/compose/foundation/layout/m;", "f", "I", "h", "Landroidx/compose/foundation/layout/r;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.layout.t, reason: from toString */
/* loaded from: classes.dex */
final /* data */ class FlowMeasurePolicy implements androidx.compose.ui.layout.N, s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isHorizontal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final C5800d.e horizontalArrangement;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final C5800d.m verticalArrangement;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float mainAxisSpacing;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5809m crossAxisAlignment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final float crossAxisArrangementSpacing;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxItemsInMainAxis;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxLines;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final FlowLayoutOverflowState overflow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.t$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f48944f = new a();

        a() {
            super(1);
        }

        public final void a(f0.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.t$b */
    static final class b extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f48945f = new b();

        b() {
            super(1);
        }

        public final void a(f0.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    public /* synthetic */ FlowMeasurePolicy(boolean z10, C5800d.e eVar, C5800d.m mVar, float f10, AbstractC5809m abstractC5809m, float f11, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, eVar, mVar, f10, abstractC5809m, f11, i10, i11, flowLayoutOverflowState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) other;
        return this.isHorizontal == flowMeasurePolicy.isHorizontal && Intrinsics.e(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && Intrinsics.e(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && H1.h.u(this.mainAxisSpacing, flowMeasurePolicy.mainAxisSpacing) && Intrinsics.e(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && H1.h.u(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis && this.maxLines == flowMeasurePolicy.maxLines && Intrinsics.e(this.overflow, flowMeasurePolicy.overflow);
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.isHorizontal) * 31) + this.horizontalArrangement.hashCode()) * 31) + this.verticalArrangement.hashCode()) * 31) + H1.h.w(this.mainAxisSpacing)) * 31) + this.crossAxisAlignment.hashCode()) * 31) + H1.h.w(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.maxItemsInMainAxis)) * 31) + Integer.hashCode(this.maxLines)) * 31) + this.overflow.hashCode();
    }

    public String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.isHorizontal + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisSpacing=" + ((Object) H1.h.z(this.mainAxisSpacing)) + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) H1.h.z(this.crossAxisArrangementSpacing)) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ", maxLines=" + this.maxLines + ", overflow=" + this.overflow + ')';
    }

    private FlowMeasurePolicy(boolean z10, C5800d.e eVar, C5800d.m mVar, float f10, AbstractC5809m abstractC5809m, float f11, int i10, int i11, FlowLayoutOverflowState flowLayoutOverflowState) {
        this.isHorizontal = z10;
        this.horizontalArrangement = eVar;
        this.verticalArrangement = mVar;
        this.mainAxisSpacing = f10;
        this.crossAxisAlignment = abstractC5809m;
        this.crossAxisArrangementSpacing = f11;
        this.maxItemsInMainAxis = i10;
        this.maxLines = i11;
        this.overflow = flowLayoutOverflowState;
    }

    @Override // androidx.compose.foundation.layout.s
    /* renamed from: b, reason: from getter */
    public boolean getIsHorizontal() {
        return this.isHorizontal;
    }

    @Override // androidx.compose.ui.layout.N
    public androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K k10, List<? extends List<? extends androidx.compose.ui.layout.I>> list, long j10) {
        if (this.maxLines == 0 || this.maxItemsInMainAxis == 0 || list.isEmpty() || (H1.b.k(j10) == 0 && this.overflow.getType() != q.a.f48902a)) {
            return androidx.compose.ui.layout.K.G0(k10, 0, 0, null, a.f48944f, 4, null);
        }
        List list2 = (List) CollectionsKt.s0(list);
        if (list2.isEmpty()) {
            return androidx.compose.ui.layout.K.G0(k10, 0, 0, null, b.f48945f, 4, null);
        }
        List list3 = (List) CollectionsKt.v0(list, 1);
        androidx.compose.ui.layout.I i10 = list3 != null ? (androidx.compose.ui.layout.I) CollectionsKt.u0(list3) : null;
        List list4 = (List) CollectionsKt.v0(list, 2);
        androidx.compose.ui.layout.I i11 = list4 != null ? (androidx.compose.ui.layout.I) CollectionsKt.u0(list4) : null;
        this.overflow.j(list2.size());
        this.overflow.l(this, i10, i11, j10);
        return p.d(k10, this, list2.iterator(), this.mainAxisSpacing, this.crossAxisArrangementSpacing, C14881B.c(j10, getIsHorizontal() ? j0.y.f139753a : j0.y.f139754b), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // androidx.compose.ui.layout.N
    public int e(InterfaceC5933s interfaceC5933s, List<? extends List<? extends androidx.compose.ui.layout.r>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.v0(list, 1);
        androidx.compose.ui.layout.r rVar = list2 != null ? (androidx.compose.ui.layout.r) CollectionsKt.u0(list2) : null;
        List list3 = (List) CollectionsKt.v0(list, 2);
        flowLayoutOverflowState.m(rVar, list3 != null ? (androidx.compose.ui.layout.r) CollectionsKt.u0(list3) : null, getIsHorizontal(), H1.c.b(0, 0, 0, i10, 7, null));
        if (getIsHorizontal()) {
            List<? extends androidx.compose.ui.layout.r> listM = (List) CollectionsKt.u0(list);
            if (listM == null) {
                listM = CollectionsKt.m();
            }
            return o(listM, i10, interfaceC5933s.E0(this.mainAxisSpacing));
        }
        List<? extends androidx.compose.ui.layout.r> listM2 = (List) CollectionsKt.u0(list);
        if (listM2 == null) {
            listM2 = CollectionsKt.m();
        }
        return n(listM2, i10, interfaceC5933s.E0(this.mainAxisSpacing), interfaceC5933s.E0(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // androidx.compose.ui.layout.N
    public int g(InterfaceC5933s interfaceC5933s, List<? extends List<? extends androidx.compose.ui.layout.r>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.v0(list, 1);
        androidx.compose.ui.layout.r rVar = list2 != null ? (androidx.compose.ui.layout.r) CollectionsKt.u0(list2) : null;
        List list3 = (List) CollectionsKt.v0(list, 2);
        flowLayoutOverflowState.m(rVar, list3 != null ? (androidx.compose.ui.layout.r) CollectionsKt.u0(list3) : null, getIsHorizontal(), H1.c.b(0, i10, 0, 0, 13, null));
        if (getIsHorizontal()) {
            List<? extends androidx.compose.ui.layout.r> listM = (List) CollectionsKt.u0(list);
            if (listM == null) {
                listM = CollectionsKt.m();
            }
            return n(listM, i10, interfaceC5933s.E0(this.mainAxisSpacing), interfaceC5933s.E0(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends androidx.compose.ui.layout.r> listM2 = (List) CollectionsKt.u0(list);
        if (listM2 == null) {
            listM2 = CollectionsKt.m();
        }
        return u(listM2, i10, interfaceC5933s.E0(this.mainAxisSpacing), interfaceC5933s.E0(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // androidx.compose.ui.layout.N
    public int i(InterfaceC5933s interfaceC5933s, List<? extends List<? extends androidx.compose.ui.layout.r>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.v0(list, 1);
        androidx.compose.ui.layout.r rVar = list2 != null ? (androidx.compose.ui.layout.r) CollectionsKt.u0(list2) : null;
        List list3 = (List) CollectionsKt.v0(list, 2);
        flowLayoutOverflowState.m(rVar, list3 != null ? (androidx.compose.ui.layout.r) CollectionsKt.u0(list3) : null, getIsHorizontal(), H1.c.b(0, 0, 0, i10, 7, null));
        if (getIsHorizontal()) {
            List<? extends androidx.compose.ui.layout.r> listM = (List) CollectionsKt.u0(list);
            if (listM == null) {
                listM = CollectionsKt.m();
            }
            return u(listM, i10, interfaceC5933s.E0(this.mainAxisSpacing), interfaceC5933s.E0(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends androidx.compose.ui.layout.r> listM2 = (List) CollectionsKt.u0(list);
        if (listM2 == null) {
            listM2 = CollectionsKt.m();
        }
        return n(listM2, i10, interfaceC5933s.E0(this.mainAxisSpacing), interfaceC5933s.E0(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
    }

    @Override // androidx.compose.ui.layout.N
    public int j(InterfaceC5933s interfaceC5933s, List<? extends List<? extends androidx.compose.ui.layout.r>> list, int i10) {
        FlowLayoutOverflowState flowLayoutOverflowState = this.overflow;
        List list2 = (List) CollectionsKt.v0(list, 1);
        androidx.compose.ui.layout.r rVar = list2 != null ? (androidx.compose.ui.layout.r) CollectionsKt.u0(list2) : null;
        List list3 = (List) CollectionsKt.v0(list, 2);
        flowLayoutOverflowState.m(rVar, list3 != null ? (androidx.compose.ui.layout.r) CollectionsKt.u0(list3) : null, getIsHorizontal(), H1.c.b(0, i10, 0, 0, 13, null));
        if (getIsHorizontal()) {
            List<? extends androidx.compose.ui.layout.r> listM = (List) CollectionsKt.u0(list);
            if (listM == null) {
                listM = CollectionsKt.m();
            }
            return n(listM, i10, interfaceC5933s.E0(this.mainAxisSpacing), interfaceC5933s.E0(this.crossAxisArrangementSpacing), this.maxItemsInMainAxis, this.maxLines, this.overflow);
        }
        List<? extends androidx.compose.ui.layout.r> listM2 = (List) CollectionsKt.u0(list);
        if (listM2 == null) {
            listM2 = CollectionsKt.m();
        }
        return o(listM2, i10, interfaceC5933s.E0(this.mainAxisSpacing));
    }

    @Override // androidx.compose.foundation.layout.s
    /* renamed from: m, reason: from getter */
    public AbstractC5809m getCrossAxisAlignment() {
        return this.crossAxisAlignment;
    }

    public final int n(List<? extends androidx.compose.ui.layout.r> measurables, int mainAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        long jB;
        int i10 = 0;
        if (measurables.isEmpty()) {
            jB = C5616n.b(0, 0);
        } else {
            o oVar = new o(maxItemsInMainAxis, overflow, C14881B.a(0, mainAxisAvailable, 0, a.e.API_PRIORITY_OTHER), maxLines, mainAxisSpacing, crossAxisSpacing, null);
            androidx.compose.ui.layout.r rVar = (androidx.compose.ui.layout.r) CollectionsKt.v0(measurables, 0);
            int iT = rVar != null ? t(rVar, mainAxisAvailable) : 0;
            int iV = rVar != null ? v(rVar, iT) : 0;
            int i11 = 0;
            if (oVar.b(measurables.size() > 1, 0, C5616n.b(mainAxisAvailable, a.e.API_PRIORITY_OTHER), rVar == null ? null : C5616n.a(C5616n.b(iV, iT)), 0, 0, 0, false, false).getIsLastItemInContainer()) {
                C5616n c5616nF = overflow.f(rVar != null, 0, 0);
                jB = C5616n.b(c5616nF != null ? C5616n.f(c5616nF.getPackedValue()) : 0, 0);
            } else {
                int size = measurables.size();
                int i12 = mainAxisAvailable;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    if (i13 >= size) {
                        break;
                    }
                    int i18 = i12 - iV;
                    int i19 = i13 + 1;
                    int iMax = Math.max(i17, iT);
                    androidx.compose.ui.layout.r rVar2 = (androidx.compose.ui.layout.r) CollectionsKt.v0(measurables, i19);
                    int iT2 = rVar2 != null ? t(rVar2, mainAxisAvailable) : i10;
                    int iV2 = rVar2 != null ? v(rVar2, iT2) + mainAxisSpacing : i10;
                    boolean z10 = i13 + 2 < measurables.size();
                    int i20 = i19 - i15;
                    int i21 = i16;
                    int i22 = iV2;
                    int i23 = iT2;
                    o.b bVarB = oVar.b(z10, i20, C5616n.b(i18, a.e.API_PRIORITY_OTHER), rVar2 == null ? null : C5616n.a(C5616n.b(iV2, iT2)), i21, i11, iMax, false, false);
                    if (bVarB.getIsLastItemInLine()) {
                        int iF = i11 + iMax + crossAxisSpacing;
                        o.a aVarA = oVar.a(bVarB, rVar2 != null, i21, iF, i18, i20);
                        int i24 = i22 - mainAxisSpacing;
                        i16 = i21 + 1;
                        if (bVarB.getIsLastItemInContainer()) {
                            if (aVarA != null) {
                                long ellipsisSize = aVarA.getEllipsisSize();
                                if (!aVarA.getPlaceEllipsisOnLastContentLine()) {
                                    iF += C5616n.f(ellipsisSize) + crossAxisSpacing;
                                }
                            }
                            i11 = iF;
                            i14 = i19;
                        } else {
                            i11 = iF;
                            iV = i24;
                            i15 = i19;
                            i17 = 0;
                            i12 = mainAxisAvailable;
                        }
                    } else {
                        i12 = i18;
                        i16 = i21;
                        i17 = iMax;
                        iV = i22;
                    }
                    iT = i23;
                    i13 = i19;
                    i14 = i13;
                    i10 = 0;
                }
                jB = C5616n.b(i11 - crossAxisSpacing, i14);
            }
        }
        return C5616n.e(jB);
    }

    public final int o(List<? extends androidx.compose.ui.layout.r> measurables, int height, int arrangementSpacing) {
        int i10 = this.maxItemsInMainAxis;
        int size = measurables.size();
        int i11 = 0;
        int iMax = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < size) {
            int iP = p(measurables.get(i11), height) + arrangementSpacing;
            int i14 = i11 + 1;
            if (i14 - i12 == i10 || i14 == measurables.size()) {
                iMax = Math.max(iMax, (i13 + iP) - arrangementSpacing);
                i13 = 0;
                i12 = i11;
            } else {
                i13 += iP;
            }
            i11 = i14;
        }
        return iMax;
    }

    @Override // androidx.compose.foundation.layout.s
    /* renamed from: r, reason: from getter */
    public C5800d.e getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    @Override // androidx.compose.foundation.layout.s
    /* renamed from: s, reason: from getter */
    public C5800d.m getVerticalArrangement() {
        return this.verticalArrangement;
    }

    public final int u(List<? extends androidx.compose.ui.layout.r> measurables, int crossAxisAvailable, int mainAxisSpacing, int crossAxisSpacing, int maxItemsInMainAxis, int maxLines, FlowLayoutOverflowState overflow) {
        List<? extends androidx.compose.ui.layout.r> list = measurables;
        int i10 = maxItemsInMainAxis;
        int i11 = maxLines;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            androidx.compose.ui.layout.r rVar = list.get(i12);
            int iV = v(rVar, crossAxisAvailable);
            iArr[i12] = iV;
            iArr2[i12] = t(rVar, iV);
        }
        int i13 = a.e.API_PRIORITY_OTHER;
        if (i11 != Integer.MAX_VALUE && i10 != Integer.MAX_VALUE) {
            i13 = i10 * i11;
        }
        int iMin = Math.min(i13 - (((i13 >= list.size() || !(overflow.getType() == q.a.f48904c || overflow.getType() == q.a.f48905d)) && (i13 < list.size() || i11 < overflow.getMinLinesToShowCollapse() || overflow.getType() != q.a.f48905d)) ? 0 : 1), list.size());
        int iX0 = ArraysKt.X0(iArr) + ((list.size() - 1) * mainAxisSpacing);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int iE = iArr2[0];
        IntIterator it = new IntRange(1, ArraysKt.k0(iArr2)).iterator();
        while (it.hasNext()) {
            int i14 = iArr2[it.nextInt()];
            if (iE < i14) {
                iE = i14;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i15 = iArr[0];
        IntIterator it2 = new IntRange(1, ArraysKt.k0(iArr)).iterator();
        while (it2.hasNext()) {
            int i16 = iArr[it2.nextInt()];
            if (i15 < i16) {
                i15 = i16;
            }
        }
        int i17 = i15;
        int i18 = iX0;
        while (i17 <= i18 && iE != crossAxisAvailable) {
            int i19 = (i17 + i18) / 2;
            long jF = p.f(list, iArr, iArr2, i19, mainAxisSpacing, crossAxisSpacing, i10, i11, overflow);
            iE = C5616n.e(jF);
            int iF = C5616n.f(jF);
            if (iE > crossAxisAvailable || iF < iMin) {
                i17 = i19 + 1;
                if (i17 > i18) {
                    return i17;
                }
            } else {
                if (iE >= crossAxisAvailable) {
                    return i19;
                }
                i18 = i19 - 1;
            }
            list = measurables;
            i10 = maxItemsInMainAxis;
            i11 = maxLines;
            iX0 = i19;
        }
        return iX0;
    }

    public final int p(androidx.compose.ui.layout.r rVar, int i10) {
        if (getIsHorizontal()) {
            return rVar.j0(i10);
        }
        return rVar.A(i10);
    }

    public final int t(androidx.compose.ui.layout.r rVar, int i10) {
        if (getIsHorizontal()) {
            return rVar.W(i10);
        }
        return rVar.d0(i10);
    }

    public final int v(androidx.compose.ui.layout.r rVar, int i10) {
        if (getIsHorizontal()) {
            return rVar.d0(i10);
        }
        return rVar.W(i10);
    }
}
