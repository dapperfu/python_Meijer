package w5;

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
import V0.C5346q0;
import V0.Shadow;
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.V0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import androidx.compose.ui.text.TextStyle;
import com.adobe.marketing.mobile.assurance.internal.EnumC6425g;
import j0.C14815g;
import kotlin.AbstractC18142l;
import kotlin.C17983x;
import kotlin.C18112F;
import kotlin.C18153w;
import kotlin.C18154x;
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
import u5.C17226e;
import v5.C17509a;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/assurance/internal/g;", "assuranceConnectionError", "", "a", "(Lcom/adobe/marketing/mobile/assurance/internal/g;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: w5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17773a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: w5.a$a, reason: collision with other inner class name */
    static final class C2630a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f165727f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2630a(Activity activity) {
            super(0);
            this.f165727f = activity;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Activity activity = this.f165727f;
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: w5.a$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ EnumC6425g f165728f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f165729g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(EnumC6425g enumC6425g, int i10) {
            super(2);
            this.f165728f = enumC6425g;
            this.f165729g = i10;
        }

        public final void a(Composer composer, int i10) {
            C17773a.a(this.f165728f, composer, J0.a(this.f165729g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(EnumC6425g assuranceConnectionError, Composer composer, int i10) {
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
            E5.a aVar = E5.a.f7617a;
            Modifier modifierK = D.k(androidx.compose.foundation.b.d(modifierF, aVar.a(), null, 2, null), aVar.b().b().getXLarge(), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            e.Companion companion2 = e.INSTANCE;
            MeasurePolicy measurePolicyI = C5662h.i(companion2.o(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            d dVar = (d) composerStartRestartGroup.o(C5892t0.g());
            t tVar = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C = A.c(modifierK);
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
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
            C5664j c5664j = C5664j.f48612a;
            Modifier modifierA = F1.a(J.f(companion, 0.0f, 1, null), "errorView");
            C5658d.f fVarO = C5658d.f48555a.o(aVar.b().c().getMedium());
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA = C5665k.a(fVarO, companion2.k(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            d dVar2 = (d) composerStartRestartGroup.o(C5892t0.g());
            t tVar2 = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q13 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            Function0<InterfaceC5811g> function0A2 = companion3.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C2 = A.c(modifierA);
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
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
            C14815g c14815g = C14815g.f139108a;
            C17509a.a(composerStartRestartGroup, 0);
            String strE = assuranceConnectionError.e();
            C5346q0.Companion companion4 = C5346q0.INSTANCE;
            long jH = companion4.h();
            AbstractC18142l.Companion companion5 = AbstractC18142l.INSTANCE;
            C18112F c18112fD = companion5.d();
            long jI = w.i(24);
            FontWeight.Companion companion6 = FontWeight.INSTANCE;
            composer2 = composerStartRestartGroup;
            N1.b(strE, F1.a(J.F(J.h(companion, 0.0f, 1, null), companion2.e(), false, 2, null), "errorTitle"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(jH, jI, companion6.f(), (C18153w) null, (C18154x) null, c18112fD, (String) null, 0L, (F1.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, (j) null, (l) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (f) null, (F1.e) null, 4194264, (DefaultConstructorMarker) null), composer2, 48, 0, 65532);
            N1.b(assuranceConnectionError.b(), F1.a(J.F(J.h(companion, 0.0f, 1, null), companion2.e(), false, 2, null), "errorDescription"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(companion4.k(), w.i(18), companion6.e(), (C18153w) null, (C18154x) null, companion5.d(), (String) null, 0L, (F1.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, j.h(j.INSTANCE.c()), (l) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (f) null, (F1.e) null, 4177880, (DefaultConstructorMarker) null), composer2, 48, 0, 65532);
            composer2.U();
            composer2.v();
            composer2.U();
            composer2.U();
            C17983x.d(new C2630a(C17226e.a((Context) composer2.o(AndroidCompositionLocals_androidKt.g()))), F1.a(c5664j.g(companion, companion2.b()), "dismissButton"), false, null, null, null, null, null, null, w5.b.f165730a.a(), composer2, 805306368, 508);
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
