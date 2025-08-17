package v5;

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
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.G;
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
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import androidx.compose.ui.text.TextStyle;
import j0.C14801J;
import kotlin.AbstractC18142l;
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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "text", "", "a", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: v5.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17510b {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: v5.b$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f164555f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f164556g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, int i10) {
            super(2);
            this.f164555f = str;
            this.f164556g = i10;
        }

        public final void a(Composer composer, int i10) {
            C17510b.a(this.f164555f, composer, J0.a(this.f164556g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(String text, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1934510218);
        if ((i10 & 14) == 0) {
            i11 = i10 | (composerStartRestartGroup.V(text) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1934510218, i11, -1, "com.adobe.marketing.mobile.assurance.internal.ui.common.AssuranceSubHeader (AssuranceSubHeader.kt:35)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierH = J.h(companion, 0.0f, 1, null);
            C5658d.f fVarB = C5658d.f48555a.b();
            e.Companion companion2 = e.INSTANCE;
            e.c cVarL = companion2.l();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyB = G.b(fVarB, cVarL, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            d dVar = (d) composerStartRestartGroup.o(C5892t0.g());
            t tVar = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C = A.c(modifierH);
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
            D1.c(composerA, measurePolicyB, companion3.e());
            D1.c(composerA, dVar, companion3.c());
            D1.c(composerA, tVar, companion3.d());
            D1.c(composerA, q12, companion3.h());
            composerStartRestartGroup.c();
            function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C14801J c14801j = C14801J.f139030a;
            composer2 = composerStartRestartGroup;
            N1.b(text, F1.a(J.F(companion, companion2.e(), false, 2, null), "assuranceSubHeader"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(C5346q0.INSTANCE.k(), w.i(16), FontWeight.INSTANCE.e(), (C18153w) null, (C18154x) null, AbstractC18142l.INSTANCE.d(), (String) null, 0L, (F1.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, j.h(j.INSTANCE.a()), (l) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (f) null, (F1.e) null, 4177880, (DefaultConstructorMarker) null), composer2, (i11 & 14) | 48, 0, 65532);
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
        t0L.a(new a(text, i10));
    }
}
