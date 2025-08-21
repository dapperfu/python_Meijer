package in;

import Ki.LocalThemeScope;
import P0.e;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c5.C6484c;
import hn.OrderOutOfStockListDecorator;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import ki.q1;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import p1.C16335d;
import p1.C16338g;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lhn/p;", "decorator", "", "b", "(LKi/M;Landroidx/compose/ui/Modifier;Lhn/p;Landroidx/compose/runtime/Composer;II)V", "Lnk/b;", "a", "Lnk/b;", "price", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: in.k, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14818k {

    /* renamed from: a, reason: collision with root package name */
    private static final nk.b f138607a = Co.l.e("USD", null, 3.79d, "$3.79", 0.0d, null);

    public static final void b(final LocalThemeScope localThemeScope, Modifier modifier, final OrderOutOfStockListDecorator decorator, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(decorator, "decorator");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1917104118);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(decorator) ? 256 : 128;
        }
        if ((i12 & 131) == 130 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = (i11 & 1) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(-1917104118, i12, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderOutOfStockItem (OrderOutOfStockItem.kt:48)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierH = androidx.compose.foundation.layout.J.H(androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null), H1.h.p(f10)), null, false, 3, null);
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composerStartRestartGroup, 0);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            C15669h.a aVar = new C15669h.a((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g()));
            String strB = decorator.b();
            if (strB == null) {
                strB = "";
            }
            C6484c.d(aVar.f(strB).e(true).c(), null, a5.a.a((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), companion, C16335d.c(Cj.i.f4726O1, composerStartRestartGroup, 0), C16335d.c(Cj.i.f4726O1, composerStartRestartGroup, 0), null, null, null, null, null, InterfaceC5926k.INSTANCE.e(), 0.0f, null, 0, false, null, composerStartRestartGroup, 3120, 48, 128960);
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion2.k(), composerStartRestartGroup, 0);
            int iA3 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierM);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = D1.a(composerStartRestartGroup);
            D1.c(composerA3, measurePolicyA2, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100981ia, composerStartRestartGroup, 0);
            q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null);
            int i13 = LocalThemeScope.f17314g;
            int i14 = i12 & 14;
            int i15 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strC, null, composerStartRestartGroup, (i15 << 3) | i13 | i14, 4);
            float f11 = 8;
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f11), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null), decorator.getTitle(), null, composerStartRestartGroup, i13 | i14 | (i15 << 3), 4);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.e(), companion2.l(), composerStartRestartGroup, 6);
            int iA4 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR4 = composerStartRestartGroup.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            Function0<InterfaceC5953g> function0A4 = companion3.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A4);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA4 = D1.a(composerStartRestartGroup);
            D1.c(composerA4, measurePolicyB2, companion3.e());
            D1.c(composerA4, interfaceC5884sR4, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            D1.c(composerA4, modifierE4, companion3.f());
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f11), 0.0f, 0.0f, 13, null), null, F1.k.INSTANCE.b(), null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne().g(FontWeight.INSTANCE.a()), null, 378, null), decorator.getTotalPriceRawValue(), null, composerStartRestartGroup, i13 | i14 | (i15 << 3), 4);
            C14890K.a(InterfaceC14888I.b(c14889j, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f11), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null), decorator.a().b((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g())), null, composerStartRestartGroup, i13 | i14 | (i15 << 3), 4);
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: in.j
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C14818k.c(localThemeScope, modifier2, decorator, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, Modifier modifier, OrderOutOfStockListDecorator orderOutOfStockListDecorator, int i10, int i11, Composer composer, int i12) {
        b(localThemeScope, modifier, orderOutOfStockListDecorator, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
