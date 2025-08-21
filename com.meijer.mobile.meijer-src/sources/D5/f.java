package D5;

import B1.LocaleList;
import F1.LineHeightStyle;
import F1.TextGeometricTransform;
import F1.TextIndent;
import F1.j;
import F1.l;
import H1.t;
import H1.w;
import P0.e;
import V0.C5489q0;
import V0.Shadow;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.V0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import androidx.compose.ui.text.TextStyle;
import com.adobe.marketing.mobile.assurance.internal.EnumC6550g;
import j0.C14889J;
import j0.C14903g;
import kotlin.AbstractC18269l;
import kotlin.C18239F;
import kotlin.C18280w;
import kotlin.C18281x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.PlatformTextStyle;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/g;", "error", "", "a", "(Lcom/adobe/marketing/mobile/assurance/internal/g;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class f {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC6550g f5946f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f5947g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(EnumC6550g enumC6550g, int i10) {
            super(2);
            this.f5946f = enumC6550g;
            this.f5947g = i10;
        }

        public final void a(Composer composer, int i10) {
            f.a(this.f5946f, composer, J0.a(this.f5947g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(EnumC6550g error, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(error, "error");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1164468386);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.V(error) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1164468386, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.quickconnect.QuickConnectErrorPanel (QuickConnectErrorPanel.kt:38)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierA = F1.a(companion, "connectionErrorPanel");
            composerStartRestartGroup.startReplaceableGroup(693286680);
            C5800d c5800d = C5800d.f48779a;
            C5800d.e eVarG = c5800d.g();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(eVarG, companion2.l(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C6034t0.g());
            t tVar = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C = A.c(modifierA);
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            composerStartRestartGroup.G();
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, dVar, companion3.c());
            D1.c(composerA, tVar, companion3.d());
            D1.c(composerA, q12, companion3.h());
            composerStartRestartGroup.c();
            function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C14889J c14889j = C14889J.f139620a;
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion2.k(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar2 = (H1.d) composerStartRestartGroup.o(C6034t0.g());
            t tVar2 = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q13 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C2 = A.c(companion);
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            composerStartRestartGroup.G();
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyA, companion3.e());
            D1.c(composerA2, dVar2, companion3.c());
            D1.c(composerA2, tVar2, companion3.d());
            D1.c(composerA2, q13, companion3.h());
            composerStartRestartGroup.c();
            function3C2.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C14903g c14903g = C14903g.f139698a;
            Modifier modifierC = c14903g.c(J.h(companion, 0.0f, 1, null), companion2.g());
            F5.a aVar = F5.a.f9034a;
            Modifier modifierA2 = F1.a(D.m(modifierC, 0.0f, aVar.b().b().getSmall(), 0.0f, aVar.b().b().getXSmall(), 5, null), "connectionErrorText");
            composer2 = composerStartRestartGroup;
            String strE = error.e();
            C5489q0.Companion companion4 = C5489q0.INSTANCE;
            long jK = companion4.k();
            AbstractC18269l.Companion companion5 = AbstractC18269l.INSTANCE;
            C18239F c18239fD = companion5.d();
            j.Companion companion6 = F1.j.INSTANCE;
            N1.b(strE, modifierA2, jK, 0L, null, null, c18239fD, 0L, null, F1.j.h(companion6.a()), 0L, 0, false, 0, 0, null, new TextStyle(companion4.k(), w.i(aVar.d().a().getSize().getLarge()), FontWeight.INSTANCE.f(), (C18280w) null, (C18281x) null, (AbstractC18269l) null, (String) null, 0L, (F1.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (F1.k) null, (Shadow) null, (F1.j) null, (l) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (F1.f) null, (F1.e) null, 4194296, (DefaultConstructorMarker) null), composer2, 384, 1572864, 64952);
            Modifier modifierA3 = F1.a(D.m(c14903g.c(J.h(companion, 0.0f, 1, null), companion2.g()), 0.0f, aVar.b().b().getSmall(), 0.0f, aVar.b().b().getXSmall(), 5, null), "connectionErrorDescription");
            N1.b(error.b(), modifierA3, companion4.k(), 0L, null, null, companion5.d(), 0L, null, F1.j.h(companion6.f()), 0L, 0, false, 0, 0, null, new TextStyle(companion4.k(), w.i(aVar.d().a().getSize().getLarge()), (FontWeight) null, (C18280w) null, (C18281x) null, (AbstractC18269l) null, (String) null, 0L, (F1.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (F1.k) null, (Shadow) null, (F1.j) null, (l) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (F1.f) null, (F1.e) null, 4194300, (DefaultConstructorMarker) null), composer2, 384, 1572864, 64952);
            composer2.U();
            composer2.v();
            composer2.U();
            composer2.U();
            composer2.U();
            composer2.v();
            composer2.U();
            composer2.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composer2.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new a(error, i10));
    }
}
