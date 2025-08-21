package Ym;

import P0.e;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.meijer.activity.find.filter.j;
import com.meijer.mobile.meijer.activity.find.filter.s;
import j0.C14889J;
import kotlin.C17936B;
import kotlin.C17938C;
import kotlin.C17943E0;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.t1;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a;\u0010\u000f\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/o;", "filterViewModel", "Lcom/meijer/mobile/meijer/activity/find/filter/s$c;", "item", "", "e", "(Lcom/meijer/mobile/meijer/activity/find/filter/o;Lcom/meijer/mobile/meijer/activity/find/filter/s$c;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function1;", "", "onClick", "", "text", "selected", "", "quantity", "h", "(Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZLjava/lang/Number;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class r {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43219a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Number f43220b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f43221c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Boolean, Unit> f43222d;

        /* JADX WARN: Multi-variable type inference failed */
        a(String str, Number number, boolean z10, Function1<? super Boolean, Unit> function1) {
            this.f43219a = str;
            this.f43220b = number;
            this.f43221c = z10;
            this.f43222d = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(602717814, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.items.StatelessSimpleMultiSelectItem.<anonymous>.<anonymous> (SimpleMultiSelectItem.kt:71)");
            }
            String str = this.f43219a + " (" + this.f43220b + ')';
            C17943E0 c17943e0 = C17943E0.f167967a;
            int i11 = C17943E0.f167968b;
            TextStyle h62 = c17943e0.c(composer, i11).getH6();
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            N1.b(str, D.i(companion, H1.h.p(f10)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h62, composer, 48, 0, 65532);
            C5800d.e eVarC = C5800d.f48779a.c();
            Modifier modifierH = J.h(companion, 0.0f, 1, null);
            boolean z10 = this.f43221c;
            Function1<Boolean, Unit> function1 = this.f43222d;
            MeasurePolicy measurePolicyB = G.b(eVarC, P0.e.INSTANCE.l(), composer, 6);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierH);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            C17938C.a(z10, function1, D.i(companion, H1.h.p(f10)), false, null, C17936B.f167813a.a(c17943e0.a(composer, i11).j(), 0L, 0L, 0L, 0L, composer, C17936B.f167814b << 15, 30), composer, 384, 24);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void e(final com.meijer.mobile.meijer.activity.find.filter.o filterViewModel, final s.SimpleFilterItem item, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(filterViewModel, "filterViewModel");
        Intrinsics.j(item, "item");
        Composer composerStartRestartGroup = composer.startRestartGroup(1202022688);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(filterViewModel) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(item) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1202022688, i11, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.items.SimpleMultiSelectItem (SimpleMultiSelectItem.kt:28)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(filterViewModel) | composerStartRestartGroup.D(item);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: Ym.n
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.f(filterViewModel, item, ((Boolean) obj).booleanValue());
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            Function1 function1 = (Function1) objB;
            composerStartRestartGroup.P();
            String displayName = item.getFilterItem().getDisplayName();
            if (displayName == null) {
                displayName = "";
            }
            h(function1, displayName, item.getSelected(), item.getQuantity(), composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ym.o
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.g(filterViewModel, item, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(com.meijer.mobile.meijer.activity.find.filter.o oVar, s.SimpleFilterItem simpleFilterItem, boolean z10) {
        oVar.u(new j.SelectFilter(new Pair(simpleFilterItem.getFilterFacet(), simpleFilterItem.getFilterItem()), z10));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(com.meijer.mobile.meijer.activity.find.filter.o oVar, s.SimpleFilterItem simpleFilterItem, int i10, Composer composer, int i11) {
        e(oVar, simpleFilterItem, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void h(final Function1<? super Boolean, Unit> onClick, final String text, final boolean z10, final Number quantity, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(onClick, "onClick");
        Intrinsics.j(text, "text");
        Intrinsics.j(quantity, "quantity");
        Composer composerStartRestartGroup = composer.startRestartGroup(1715371734);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(onClick) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(text) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.a(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(quantity) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1715371734, i11, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.items.StatelessSimpleMultiSelectItem (SimpleMultiSelectItem.kt:58)");
            }
            e.c cVarI = P0.e.INSTANCE.i();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), cVarI, composerStartRestartGroup, 48);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            float f10 = 0;
            float fP = H1.h.p(f10);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z11 = (i11 & 14) == 4;
            Object objB = composerStartRestartGroup.B();
            if (z11 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Ym.p
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.i(onClick);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            t1.a(D.i(J.h(ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), 0.0f, 1, null), H1.h.p(f10)), null, 0L, 0L, null, fP, ComposableLambdaKt.c(602717814, true, new a(text, quantity, z10, onClick), composerStartRestartGroup, 54), composerStartRestartGroup, 1769472, 30);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ym.q
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.j(onClick, text, z10, quantity, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function1 function1) {
        function1.invoke(Boolean.FALSE);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function1 function1, String str, boolean z10, Number number, int i10, Composer composer, int i11) {
        h(function1, str, z10, number, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
