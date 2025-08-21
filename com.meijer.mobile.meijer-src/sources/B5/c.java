package B5;

import B1.LocaleList;
import F1.LineHeightStyle;
import F1.TextGeometricTransform;
import F1.TextIndent;
import F1.f;
import F1.j;
import F1.k;
import F1.l;
import H1.t;
import H1.w;
import P0.e;
import V0.C5489q0;
import V0.Shadow;
import androidx.compose.foundation.layout.C5800d;
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
import j0.C14889J;
import kotlin.AbstractC18269l;
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

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "text", "", "a", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class c {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f2551f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f2552g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, int i10) {
            super(2);
            this.f2551f = str;
            this.f2552g = i10;
        }

        public final void a(Composer composer, int i10) {
            c.a(this.f2551f, composer, J0.a(this.f2552g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(String text, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Intrinsics.j(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(693481658);
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
                ComposerKt.U(693481658, i11, -1, "com.adobe.marketing.mobile.assurance.internal.ui.pin.error.PinAuthErrorMessageContent (PinAuthErrorMessageContent.kt:37)");
            }
            C5800d.f fVarB = C5800d.f48779a.b();
            e.Companion companion = P0.e.INSTANCE;
            e.c cVarL = companion.l();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyB = G.b(fVarB, cVarL, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C6034t0.g());
            t tVar = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C = A.c(companion2);
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
            composer2 = composerStartRestartGroup;
            N1.b(text, F1.a(D.m(J.F(J.h(companion2, 0.0f, 1, null), companion.e(), false, 2, null), 0.0f, 0.0f, 0.0f, F5.a.f9034a.b().b().getXSmall(), 7, null), "pinErrorContent"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(C5489q0.INSTANCE.k(), w.i(18), FontWeight.INSTANCE.e(), (C18280w) null, (C18281x) null, AbstractC18269l.INSTANCE.d(), (String) null, 0L, (F1.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, j.h(j.INSTANCE.f()), (l) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (f) null, (F1.e) null, 4177880, (DefaultConstructorMarker) null), composer2, (i11 & 14) | 48, 0, 65532);
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
