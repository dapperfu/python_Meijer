package C5;

import B1.LocaleList;
import C5.c;
import F1.LineHeightStyle;
import F1.TextGeometricTransform;
import F1.TextIndent;
import F1.l;
import H1.t;
import H1.w;
import P0.e;
import V0.C5346q0;
import V0.C5349s0;
import V0.Shadow;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.V0;
import androidx.compose.runtime.t1;
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
import kotlin.C17906T0;
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
import p1.C16193g;
import r0.C16692i;
import u1.PlatformTextStyle;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "LC5/c;", "buttonState", "Lkotlin/Function0;", "", "onClick", "a", "(Landroidx/compose/ui/Modifier;LC5/c;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class e {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f3641f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0<Unit> function0) {
            super(0);
            this.f3641f = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f3641f.invoke();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f3642f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ c f3643g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f3644h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f3645i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f3646j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Modifier modifier, c cVar, Function0<Unit> function0, int i10, int i11) {
            super(2);
            this.f3642f = modifier;
            this.f3643g = cVar;
            this.f3644h = function0;
            this.f3645i = i10;
            this.f3646j = i11;
        }

        public final void a(Composer composer, int i10) {
            e.a(this.f3642f, this.f3643g, this.f3644h, composer, J0.a(this.f3645i | 1), this.f3646j);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(Modifier modifier, c buttonState, Function0<Unit> onClick, Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        Modifier modifier3;
        Composer composer2;
        Intrinsics.j(buttonState, "buttonState");
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2011920267);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.V(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.V(buttonState) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            i12 |= composerStartRestartGroup.D(onClick) ? 256 : 128;
        }
        if ((i12 & 731) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier3 = modifier2;
            composer2 = composerStartRestartGroup;
        } else {
            Modifier modifier4 = i13 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.M()) {
                ComposerKt.U(2011920267, i12, -1, "com.adobe.marketing.mobile.assurance.internal.ui.quickconnect.ProgressButton (ProgressButton.kt:49)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = t1.e(Boolean.valueOf(buttonState.getClickable()), null, 2, null);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            e.c cVarI = P0.e.INSTANCE.i();
            C5658d.f fVarB = C5658d.f48555a.b();
            boolean zBooleanValue = ((Boolean) ((InterfaceC5730l0) objB).getValue()).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zV = composerStartRestartGroup.V(onClick);
            Object objB2 = composerStartRestartGroup.B();
            if (zV || objB2 == companion.a()) {
                objB2 = new a(onClick);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            modifier3 = modifier4;
            Modifier modifierA = F1.a(androidx.compose.foundation.b.c(ClickableKt.d(modifier4, zBooleanValue, null, null, (Function0) objB2, 6, null), buttonState.getBackgroundColor(), C16692i.c(H1.h.p(20))), "progressButton");
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyB = G.b(fVarB, cVarI, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C5892t0.g());
            t tVar = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C = A.c(modifierA);
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
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, dVar, companion2.c());
            D1.c(composerA, tVar, companion2.d());
            D1.c(composerA, q12, companion2.h());
            composerStartRestartGroup.c();
            function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C14801J c14801j = C14801J.f139030a;
            composerStartRestartGroup.startReplaceableGroup(-1147832562);
            if (buttonState instanceof c.d) {
                Modifier modifierV = J.v(F1.a(Modifier.INSTANCE, "progressIndicator"), H1.h.p(25));
                E5.a aVar = E5.a.f7617a;
                C17906T0.a(D.m(modifierV, aVar.b().b().getSmall(), aVar.b().b().getXSmall(), 0.0f, aVar.b().b().getXSmall(), 4, null), C5349s0.d(4279923688L), H1.h.p(2), 0L, 0, composerStartRestartGroup, 438, 24);
            }
            composerStartRestartGroup.U();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            E5.a aVar2 = E5.a.f7617a;
            composer2 = composerStartRestartGroup;
            N1.b(C16193g.c(buttonState.getText(), composerStartRestartGroup, 0), F1.a(D.i(companion3, aVar2.b().b().getSmall()), "progressButtonText"), buttonState.getForegroundColor(), 0L, null, null, AbstractC18142l.INSTANCE.d(), 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(C5346q0.INSTANCE.k(), w.i(aVar2.d().a().getSize().getMedium()), (FontWeight) null, (C18153w) null, (C18154x) null, (AbstractC18142l) null, (String) null, 0L, (F1.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (F1.k) null, (Shadow) null, (F1.j) null, (l) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (F1.f) null, (F1.e) null, 4194300, (DefaultConstructorMarker) null), composer2, 48, 1572864, 65464);
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
        t0L.a(new b(modifier3, buttonState, onClick, i10, i11));
    }
}
