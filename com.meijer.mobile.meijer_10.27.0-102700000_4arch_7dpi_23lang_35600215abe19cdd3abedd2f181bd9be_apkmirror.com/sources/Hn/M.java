package Hn;

import Hn.M;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5811g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "content", "b", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class M {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final a f12964a = new a();

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(List list, Ref.IntRef intRef, Ref.IntRef intRef2, f0.a layout) {
            Intrinsics.j(layout, "$this$layout");
            int iMax = 0;
            for (List list2 : CollectionsKt.r1(list, 3, 3, false, 4, null)) {
                f0 f0Var = (f0) list2.get(0);
                f0 f0Var2 = (f0) list2.get(1);
                f0 f0Var3 = (f0) list2.get(2);
                f0.a aVar = layout;
                f0.a.l(aVar, f0Var, 0, iMax, 0.0f, 4, null);
                int i10 = intRef.f142833a;
                f0.a.l(aVar, f0Var2, i10, iMax, 0.0f, 4, null);
                f0.a.l(aVar, f0Var3, i10 + intRef2.f142833a, iMax, 0.0f, 4, null);
                iMax += Math.max(f0Var.getHeight(), Math.max(f0Var2.getHeight(), f0Var3.getHeight()));
                layout = aVar;
            }
            return Unit.f142422a;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K Layout, List<? extends androidx.compose.ui.layout.I> measurableList, long j10) {
            Intrinsics.j(Layout, "$this$Layout");
            Intrinsics.j(measurableList, "measurableList");
            List<? extends androidx.compose.ui.layout.I> list = measurableList;
            final ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((androidx.compose.ui.layout.I) it.next()).k0(j10));
            }
            final Ref.IntRef intRef = new Ref.IntRef();
            final Ref.IntRef intRef2 = new Ref.IntRef();
            int iMax = 0;
            int iMax2 = 0;
            for (List list2 : CollectionsKt.r1(arrayList, 3, 3, false, 4, null)) {
                f0 f0Var = (f0) list2.get(0);
                f0 f0Var2 = (f0) list2.get(1);
                f0 f0Var3 = (f0) list2.get(2);
                intRef.f142833a = Math.max(intRef.f142833a, f0Var.M0());
                intRef2.f142833a = Math.max(intRef2.f142833a, f0Var2.M0());
                iMax2 = Math.max(iMax2, f0Var3.M0());
                iMax += Math.max(f0Var.getHeight(), Math.max(f0Var2.getHeight(), f0Var3.getHeight()));
            }
            return androidx.compose.ui.layout.K.G0(Layout, Math.min(H1.b.l(j10), intRef.f142833a + intRef2.f142833a + iMax2), iMax, null, new Function1() { // from class: Hn.L
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return M.a.b(arrayList, intRef, intRef2, (f0.a) obj);
                }
            }, 4, null);
        }

        a() {
        }
    }

    public static final void b(final Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-166365417);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.V(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(content) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-166365417, i12, -1, "com.meijer.mobile.meijer.activity.store.compose.ThreeColumnTable (ThreeColumnTable.kt:26)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f12964a;
                composerStartRestartGroup.t(objB);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objB;
            composerStartRestartGroup.P();
            int i14 = ((i12 >> 3) & 14) | 384 | ((i12 << 3) & 112);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            int i15 = ((i14 << 6) & 896) | 6;
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicy, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            content.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 6) & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Hn.K
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return M.c(modifier, content, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(Modifier modifier, Function2 function2, int i10, int i11, Composer composer, int i12) {
        b(modifier, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
