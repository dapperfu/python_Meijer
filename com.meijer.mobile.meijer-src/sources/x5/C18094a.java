package x5;

import B1.LocaleList;
import F1.LineHeightStyle;
import F1.TextGeometricTransform;
import F1.TextIndent;
import F1.f;
import F1.j;
import F1.k;
import F1.l;
import H1.d;
import H1.t;
import H1.w;
import P0.e;
import V0.C5489q0;
import V0.Shadow;
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
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
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import androidx.compose.ui.text.TextStyle;
import com.adobe.marketing.mobile.assurance.internal.EnumC6550g;
import j0.C14903g;
import kotlin.AbstractC18269l;
import kotlin.C18049x;
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
import v5.C17639e;
import w5.C17842a;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/g;", "assuranceConnectionError", "", "a", "(Lcom/adobe/marketing/mobile/assurance/internal/g;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: x5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18094a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: x5.a$a, reason: collision with other inner class name */
    static final class C2736a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f170372f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2736a(Activity activity) {
            super(0);
            this.f170372f = activity;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Activity activity = this.f170372f;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: x5.a$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC6550g f170373f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f170374g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC6550g enumC6550g, int i10) {
            super(2);
            this.f170373f = enumC6550g;
            this.f170374g = i10;
        }

        public final void a(Composer composer, int i10) {
            C18094a.a(this.f170373f, composer, J0.a(this.f170374g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(EnumC6550g assuranceConnectionError, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(assuranceConnectionError, "assuranceConnectionError");
        Composer composerStartRestartGroup = composer.startRestartGroup(1182168821);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.V(assuranceConnectionError) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1182168821, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.error.AssuranceErrorScreen (AssuranceErrorScreen.kt:48)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = J.f(companion, 0.0f, 1, null);
            F5.a aVar = F5.a.f9034a;
            Modifier modifierK = D.k(androidx.compose.foundation.b.d(modifierF, aVar.a(), null, 2, null), aVar.b().b().getXLarge(), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            e.Companion companion2 = e.INSTANCE;
            MeasurePolicy measurePolicyI = C5804h.i(companion2.o(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            d dVar = (d) composerStartRestartGroup.o(C6034t0.g());
            t tVar = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C = A.c(modifierK);
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
            D1.c(composerA, measurePolicyI, companion3.e());
            D1.c(composerA, dVar, companion3.c());
            D1.c(composerA, tVar, companion3.d());
            D1.c(composerA, q12, companion3.h());
            composerStartRestartGroup.c();
            function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C5806j c5806j = C5806j.f48836a;
            Modifier modifierA = F1.a(J.f(companion, 0.0f, 1, null), "errorView");
            C5800d.f fVarO = C5800d.f48779a.o(aVar.b().c().getMedium());
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA = C5807k.a(fVarO, companion2.k(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            d dVar2 = (d) composerStartRestartGroup.o(C6034t0.g());
            t tVar2 = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q13 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            Function0<InterfaceC5953g> function0A2 = companion3.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C2 = A.c(modifierA);
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
            C17842a.a(composerStartRestartGroup, 0);
            String strE = assuranceConnectionError.e();
            C5489q0.Companion companion4 = C5489q0.INSTANCE;
            long jH = companion4.h();
            AbstractC18269l.Companion companion5 = AbstractC18269l.INSTANCE;
            C18239F c18239fD = companion5.d();
            long jI = w.i(24);
            FontWeight.Companion companion6 = FontWeight.INSTANCE;
            composer2 = composerStartRestartGroup;
            N1.b(strE, F1.a(J.F(J.h(companion, 0.0f, 1, null), companion2.e(), false, 2, null), "errorTitle"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(jH, jI, companion6.f(), (C18280w) null, (C18281x) null, c18239fD, (String) null, 0L, (F1.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, (j) null, (l) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (f) null, (F1.e) null, 4194264, (DefaultConstructorMarker) null), composer2, 48, 0, 65532);
            N1.b(assuranceConnectionError.b(), F1.a(J.F(J.h(companion, 0.0f, 1, null), companion2.e(), false, 2, null), "errorDescription"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(companion4.k(), w.i(18), companion6.e(), (C18280w) null, (C18281x) null, companion5.d(), (String) null, 0L, (F1.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, j.h(j.INSTANCE.c()), (l) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (f) null, (F1.e) null, 4177880, (DefaultConstructorMarker) null), composer2, 48, 0, 65532);
            composer2.U();
            composer2.v();
            composer2.U();
            composer2.U();
            C18049x.d(new C2736a(C17639e.a((Context) composer2.o(AndroidCompositionLocals_androidKt.g()))), F1.a(c5806j.g(companion, companion2.b()), "dismissButton"), false, null, null, null, null, null, null, x5.b.f170375a.a(), composer2, 805306368, 508);
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
        t0L.a(new b(assuranceConnectionError, i10));
    }
}
