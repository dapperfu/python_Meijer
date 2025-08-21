package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0010\u001a\u00020\u000f*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/text/m0;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function0;", "", "shouldMeasureLinks", "", "Landroidx/compose/ui/geometry/Rect;", "placements", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "a", "Lkotlin/jvm/functions/Function0;", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class m0 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<Boolean> shouldMeasureLinks;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<List<Rect>> placements;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<Pair<androidx.compose.ui.layout.f0, H1.n>> f49850f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<Pair<androidx.compose.ui.layout.f0, Function0<H1.n>>> f49851g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends Pair<? extends androidx.compose.ui.layout.f0, H1.n>> list, List<? extends Pair<? extends androidx.compose.ui.layout.f0, ? extends Function0<H1.n>>> list2) {
            super(1);
            this.f49850f = list;
            this.f49851g = list2;
        }

        public final void a(f0.a aVar) {
            List<Pair<androidx.compose.ui.layout.f0, H1.n>> list = this.f49850f;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Pair<androidx.compose.ui.layout.f0, H1.n> pair = list.get(i10);
                    f0.a.j(aVar, pair.a(), pair.b().getPackedValue(), 0.0f, 2, null);
                }
            }
            List<Pair<androidx.compose.ui.layout.f0, Function0<H1.n>>> list2 = this.f49851g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    Pair<androidx.compose.ui.layout.f0, Function0<H1.n>> pair2 = list2.get(i11);
                    androidx.compose.ui.layout.f0 f0VarA = pair2.a();
                    Function0<H1.n> function0B = pair2.b();
                    f0.a.j(aVar, f0VarA, function0B != null ? function0B.invoke().getPackedValue() : H1.n.INSTANCE.b(), 0.0f, 2, null);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K k10, List<? extends androidx.compose.ui.layout.I> list, long j10) {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(list.size());
        List<? extends androidx.compose.ui.layout.I> list2 = list;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            androidx.compose.ui.layout.I i11 = list.get(i10);
            if (!(i11.getParentData() instanceof q0)) {
                arrayList2.add(i11);
            }
        }
        List<Rect> listInvoke = this.placements.invoke();
        if (listInvoke != null) {
            ArrayList arrayList3 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Rect rect = listInvoke.get(i12);
                Pair pair = rect != null ? new Pair(((androidx.compose.ui.layout.I) arrayList2.get(i12)).k0(H1.c.b(0, (int) Math.floor(rect.l() - rect.getLeft()), 0, (int) Math.floor(rect.i() - rect.getTop()), 5, null)), H1.n.c(H1.n.f((Math.round(rect.getTop()) & 4294967295L) | (Math.round(rect.getLeft()) << 32)))) : null;
                if (pair != null) {
                    arrayList3.add(pair);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list2.size();
        for (int i13 = 0; i13 < size3; i13++) {
            androidx.compose.ui.layout.I i14 = list.get(i13);
            if (i14.getParentData() instanceof q0) {
                arrayList4.add(i14);
            }
        }
        return androidx.compose.ui.layout.K.G0(k10, H1.b.l(j10), H1.b.k(j10), null, new a(arrayList, C5816f.k(arrayList4, this.shouldMeasureLinks)), 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m0(Function0<Boolean> function0, Function0<? extends List<Rect>> function02) {
        this.shouldMeasureLinks = function0;
        this.placements = function02;
    }
}
