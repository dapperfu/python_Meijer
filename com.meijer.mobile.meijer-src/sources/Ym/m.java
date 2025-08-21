package Ym;

import P0.e;
import V0.C5490r0;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.selection.SelectableKt;
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
import com.meijer.mobile.meijer.activity.find.filter.j;
import com.meijer.mobile.meijer.activity.find.filter.s;
import d0.C13590y;
import j0.C14889J;
import kotlin.C17943E0;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.t1;
import p1.C16335d;
import q0.C16579a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/o;", "filterViewModel", "Lcom/meijer/mobile/meijer/activity/find/filter/s$d;", "item", "", "e", "(Lcom/meijer/mobile/meijer/activity/find/filter/o;Lcom/meijer/mobile/meijer/activity/find/filter/s$d;Landroidx/compose/runtime/Composer;I)V", "", "selected", "Lkotlin/Function0;", "onClick", "", "text", "h", "(ZLkotlin/jvm/functions/Function0;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class m {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43206a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f43207b;

        a(String str, boolean z10) {
            this.f43206a = str;
            this.f43207b = z10;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1892657064, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.items.StatelessSimpleClickableItem.<anonymous>.<anonymous> (SimpleClickableSortItem.kt:62)");
            }
            C17943E0 c17943e0 = C17943E0.f167967a;
            int i11 = C17943E0.f167968b;
            TextStyle h62 = c17943e0.c(composer, i11).getH6();
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            N1.b(this.f43206a, D.i(companion, H1.h.p(f10)), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, h62, composer, 48, 0, 65532);
            C5800d.e eVarC = C5800d.f48779a.c();
            Modifier modifierH = J.h(companion, 0.0f, 1, null);
            boolean z10 = this.f43207b;
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
            composer.startReplaceGroup(54443799);
            if (z10) {
                C13590y.a(C16335d.c(Cj.i.f4732Q1, composer, 0), "", D.m(J.v(companion, H1.h.p(40)), 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), null, null, 0.0f, C5490r0.Companion.c(C5490r0.INSTANCE, c17943e0.a(composer, i11).j(), 0, 2, null), composer, 432, 56);
            }
            composer.P();
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

    public static final void e(final com.meijer.mobile.meijer.activity.find.filter.o filterViewModel, final s.SimpleSortItem item, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(filterViewModel, "filterViewModel");
        Intrinsics.j(item, "item");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1456837156);
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
                ComposerKt.U(-1456837156, i11, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.items.SimpleClickableItem (SimpleClickableSortItem.kt:32)");
            }
            boolean selected = item.getSelected();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(filterViewModel) | composerStartRestartGroup.D(item);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Ym.i
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.f(filterViewModel, item);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            h(selected, (Function0) objB, item.getSortItem().getDisplayName(), composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ym.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m.g(filterViewModel, item, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(com.meijer.mobile.meijer.activity.find.filter.o oVar, s.SimpleSortItem simpleSortItem) {
        oVar.u(new j.SelectSort(simpleSortItem.getSortItem()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(com.meijer.mobile.meijer.activity.find.filter.o oVar, s.SimpleSortItem simpleSortItem, int i10, Composer composer, int i11) {
        e(oVar, simpleSortItem, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void h(final boolean z10, final Function0<Unit> onClick, final String text, Composer composer, final int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(onClick, "onClick");
        Intrinsics.j(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1728811848);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.a(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(onClick) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(text) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1728811848, i11, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.items.StatelessSimpleClickableItem (SimpleClickableSortItem.kt:47)");
            }
            e.c cVarI = P0.e.INSTANCE.i();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierA = C16579a.a(companion);
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), cVarI, composerStartRestartGroup, 48);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierA);
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
            Modifier modifierI = D.i(J.h(companion, 0.0f, 1, null), H1.h.p(f10));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z11 = (i11 & 112) == 32;
            Object objB = composerStartRestartGroup.B();
            if (z11 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Ym.k
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return m.i(onClick);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            composer2 = composerStartRestartGroup;
            t1.a(SelectableKt.b(modifierI, z10, false, null, (Function0) objB, 6, null), null, 0L, 0L, null, fP, ComposableLambdaKt.c(1892657064, true, new a(text, z10), composerStartRestartGroup, 54), composer2, 1769472, 30);
            composer2.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ym.l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m.j(z10, onClick, text, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(boolean z10, Function0 function0, String str, int i10, Composer composer, int i11) {
        h(z10, function0, str, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}
