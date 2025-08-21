package Ym;

import P0.e;
import V0.C5489q0;
import android.content.Context;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.find.filter.j;
import com.meijer.mobile.meijer.activity.find.filter.s;
import j0.C14889J;
import kotlin.C17943E0;
import kotlin.C18054z0;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.t1;
import y0.C18233a;
import z0.C18411b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\f\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/o;", "filterViewModel", "Lcom/meijer/mobile/meijer/activity/find/filter/s$a;", "item", "", "e", "(Lcom/meijer/mobile/meijer/activity/find/filter/o;Lcom/meijer/mobile/meijer/activity/find/filter/s$a;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function0;", "onClick", "", "text", "subText", "h", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43190a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43191b;

        a(String str, String str2) {
            this.f43190a = str;
            this.f43191b = str2;
        }

        public final void a(Composer composer, int i10) {
            C17943E0 c17943e0;
            int i11;
            Modifier.Companion companion;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2099133569, i10, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.items.StatelessDrillDownItem.<anonymous>.<anonymous> (DrillDownItem.kt:75)");
            }
            C5800d c5800d = C5800d.f48779a;
            C5800d.e eVarG = c5800d.g();
            String str = this.f43190a;
            String str2 = this.f43191b;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(eVarG, companion3.l(), composer, 6);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion2);
            InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion4.a();
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
            D1.c(composerA, measurePolicyB, companion4.e());
            D1.c(composerA, interfaceC5884sR, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C14889J c14889j = C14889J.f139620a;
            C17943E0 c17943e02 = C17943E0.f167967a;
            int i12 = C17943E0.f167968b;
            float f10 = 16;
            float f11 = 0;
            N1.b(str, D.l(companion2, H1.h.p(f10), H1.h.p(f10), H1.h.p(f11), H1.h.p(f10)), 0L, 0L, null, FontWeight.INSTANCE.f(), null, 0L, null, null, 0L, 0, false, 0, 0, null, c17943e02.c(composer, i12).getH6(), composer, 196656, 0, 65500);
            Composer composer2 = composer;
            composer2.startReplaceGroup(-1787223099);
            if (str2 == null) {
                companion = companion2;
                c17943e0 = c17943e02;
                i11 = i12;
            } else {
                c17943e0 = c17943e02;
                i11 = i12;
                companion = companion2;
                N1.b(' ' + str2, D.l(companion2, H1.h.p(f11), H1.h.p(f10), H1.h.p(f10), H1.h.p(f10)), C5489q0.INSTANCE.d(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c17943e02.c(composer2, i12).getH6(), composer, 432, 0, 65528);
                composer2 = composer;
            }
            composer2.P();
            composer2.v();
            C5800d.e eVarC = c5800d.c();
            Modifier modifierH = J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = G.b(eVarC, companion3.l(), composer2, 6);
            int iA2 = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR2 = composer2.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierH);
            Function0<InterfaceC5953g> function0A2 = companion4.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A2);
            } else {
                composer2.s();
            }
            Composer composerA2 = D1.a(composer2);
            D1.c(composerA2, measurePolicyB2, companion4.e());
            D1.c(composerA2, interfaceC5884sR2, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion4.f());
            C18054z0.b(C18411b.a(C18233a.f171038a.a()), null, J.v(D.i(companion, H1.h.p(f10)), H1.h.p(26)), c17943e0.a(composer2, i11).j(), composer2, 432, 0);
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

    public static final void e(final com.meijer.mobile.meijer.activity.find.filter.o filterViewModel, final s.DrillDownItem item, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(filterViewModel, "filterViewModel");
        Intrinsics.j(item, "item");
        Composer composerStartRestartGroup = composer.startRestartGroup(-205974663);
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
                ComposerKt.U(-205974663, i11, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.items.DrillDownItem (DrillDownItem.kt:35)");
            }
            final String name = item.getName();
            composerStartRestartGroup.startReplaceGroup(-373151362);
            if (name == null) {
                Integer nameRes = item.getNameRes();
                name = nameRes == null ? null : ((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())).getString(nameRes.intValue());
            }
            composerStartRestartGroup.P();
            if (name == null) {
                name = "";
            }
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zD = composerStartRestartGroup.D(filterViewModel) | composerStartRestartGroup.V(name) | composerStartRestartGroup.D(item);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Ym.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e.f(filterViewModel, name, item);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            h((Function0) objB, Gk.e.h(name, CollectionsKt.p("to", "is", "and", "a")), item.getSubText(), composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ym.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e.g(filterViewModel, item, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(com.meijer.mobile.meijer.activity.find.filter.o oVar, String str, s.DrillDownItem drillDownItem) {
        oVar.u(new j.DrillDown(str, drillDownItem.c()));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(com.meijer.mobile.meijer.activity.find.filter.o oVar, s.DrillDownItem drillDownItem, int i10, Composer composer, int i11) {
        e(oVar, drillDownItem, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public static final void h(final Function0<Unit> onClick, final String text, final String str, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(onClick, "onClick");
        Intrinsics.j(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(733389791);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(onClick) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(text) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(str) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(733389791, i11, -1, "com.meijer.mobile.meijer.activity.find.filter.layouts.content.items.StatelessDrillDownItem (DrillDownItem.kt:61)");
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
            boolean z10 = (i11 & 14) == 4;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: Ym.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e.j(onClick);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            t1.a(FullStoryAnnotationsKt.fsUnmask(D.i(J.h(ClickableKt.d(companion, false, null, null, (Function0) objB, 7, null), 0.0f, 1, null), H1.h.p(f10))), null, 0L, 0L, null, fP, ComposableLambdaKt.c(-2099133569, true, new a(text, str), composerStartRestartGroup, 54), composerStartRestartGroup, 1769472, 30);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Ym.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e.i(onClick, text, str, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function0 function0, String str, String str2, int i10, Composer composer, int i11) {
        h(function0, str, str2, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}
