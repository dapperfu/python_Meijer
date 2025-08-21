package ps;

import Ki.LocalThemeScope;
import android.content.res.Resources;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import d0.InterfaceC13561B;
import dk.C13698b;
import j0.C14889J;
import ki.q1;
import kotlin.C17982Y0;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParserException;
import p1.C16339h;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J+\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\t*\u00020\u0002H\u0017¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Lps/s;", "", "LKi/M;", "", BarcodePickDeserializer.FIELD_ICON, "Lbk/a;", "title", "Landroidx/compose/ui/Modifier;", "modifier", "", "b", "(LKi/M;ILbk/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "d", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "scope", "Lkotlin/Function1;", "onClick", "f", "(LKi/M;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "g", "()I", "intentCode", "getIcon", "j", "()Lbk/a;", "label", "", "a", "()Z", "isSelected", "isVisible", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ps.s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC16533s {
    boolean a();

    default void d(LocalThemeScope localThemeScope, Composer composer, int i10) {
        Intrinsics.j(localThemeScope, "<this>");
        composer.startReplaceGroup(748297811);
        if (ComposerKt.M()) {
            ComposerKt.U(748297811, i10, -1, "com.meijer.mobile.ui.navigation.DrawerItem.SecondaryContent (ComposeDrawerItems.kt:159)");
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    int g();

    int getIcon();

    boolean isVisible();

    AbstractC6392a j();

    default void b(LocalThemeScope localThemeScope, int i10, AbstractC6392a title, Modifier modifier, Composer composer, int i11) throws XmlPullParserException, Resources.NotFoundException {
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(title, "title");
        Intrinsics.j(modifier, "modifier");
        composer.startReplaceGroup(1875459378);
        if (ComposerKt.M()) {
            ComposerKt.U(1875459378, i11, -1, "com.meijer.mobile.ui.navigation.DrawerItem.PrimaryContent (ComposeDrawerItems.kt:131)");
        }
        MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.i(), composer, 48);
        int iA = C5859f.a(composer, 0);
        InterfaceC5884s interfaceC5884sR = composer.r();
        Modifier modifierE = androidx.compose.ui.b.e(composer, modifier);
        InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
        Function0<InterfaceC5953g> function0A = companion.a();
        if (composer.k() == null) {
            C5859f.c();
        }
        composer.F();
        if (composer.h()) {
            composer.I(function0A);
        } else {
            composer.s();
        }
        Composer composerA = D1.a(composer);
        D1.c(composerA, measurePolicyB, companion.e());
        D1.c(composerA, interfaceC5884sR, companion.g());
        Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
            composerA.t(Integer.valueOf(iA));
            composerA.n(Integer.valueOf(iA), function2B);
        }
        D1.c(composerA, modifierE, companion.f());
        C14889J c14889j = C14889J.f139620a;
        a1.d dVarB = C16339h.b(a1.d.INSTANCE, i10, composer, (i11 & 112) | 6);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        C18054z0.b(dVarB, null, androidx.compose.foundation.layout.J.v(companion2, H1.h.p(24)), localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 432, 0);
        si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion2, H1.h.p(16), 0.0f, 0.0f, 0.0f, 14, null), a() ? localThemeScope.getAdsColors().getAdsColorBrandPrimary() : localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getEight(), null, 380, null), C13698b.a(title, composer, AbstractC6392a.f60445b | ((i11 >> 6) & 14)), null, composer, LocalThemeScope.f17314g | (i11 & 14) | (q1.Label.f142335j << 3), 4);
        composer.v();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    default void f(LocalThemeScope scope, final Function1<? super Integer, Unit> onClick, Composer composer, int i10) throws XmlPullParserException, Resources.NotFoundException {
        Intrinsics.j(scope, "scope");
        Intrinsics.j(onClick, "onClick");
        composer.startReplaceGroup(-527079663);
        if (ComposerKt.M()) {
            ComposerKt.U(-527079663, i10, -1, "com.meijer.mobile.ui.navigation.DrawerItem.Compose (ComposeDrawerItems.kt:165)");
        }
        composer.startReplaceGroup(282590765);
        if (isVisible()) {
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean z10 = true;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            boolean zA = a();
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objB == companion2.a()) {
                objB = h0.k.a();
                composer.t(objB);
            }
            h0.l lVar = (h0.l) objB;
            composer.P();
            InterfaceC13561B interfaceC13561BF = C17982Y0.f(true, 0.0f, 0L, 6, null);
            composer.startReplaceGroup(-1633490746);
            boolean z11 = (((i10 & 112) ^ 48) > 32 && composer.V(onClick)) || (i10 & 48) == 32;
            if ((((i10 & 896) ^ 384) <= 256 || !composer.D(this)) && (i10 & 384) != 256) {
                z10 = false;
            }
            boolean z12 = z11 | z10;
            Object objB2 = composer.B();
            if (z12 || objB2 == companion2.a()) {
                objB2 = new Function0() { // from class: ps.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InterfaceC16533s.e(onClick, this);
                    }
                };
                composer.t(objB2);
            }
            composer.P();
            Modifier modifierJ = androidx.compose.foundation.layout.D.j(SelectableKt.a(modifierH, zA, lVar, interfaceC13561BF, false, null, (Function0) objB2, 24, null), H1.h.p(24), H1.h.p(12));
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.e(), P0.e.INSTANCE.l(), composer, 6);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            int icon = getIcon();
            AbstractC6392a abstractC6392aJ = j();
            int i11 = LocalThemeScope.f17314g;
            b(scope, icon, abstractC6392aJ, companion, composer, i11 | 3072 | (AbstractC6392a.f60445b << 6) | ((i10 << 6) & 57344));
            d(scope, composer, ((i10 >> 3) & 112) | i11);
            composer.v();
        }
        composer.P();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    static Unit e(Function1 function1, InterfaceC16533s interfaceC16533s) {
        function1.invoke(Integer.valueOf(interfaceC16533s.g()));
        return Unit.f143329a;
    }
}
