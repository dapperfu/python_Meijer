package D5;

import B1.LocaleList;
import F1.LineHeightStyle;
import F1.TextGeometricTransform;
import F1.TextIndent;
import F1.j;
import F1.k;
import F1.l;
import H1.t;
import P0.e;
import V0.C5346q0;
import V0.Shadow;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5659e;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.V0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import androidx.compose.ui.text.TextStyle;
import com.adobe.marketing.mobile.assurance.internal.C6419a;
import com.adobe.marketing.mobile.assurance.internal.C6423e;
import com.adobe.marketing.mobile.assurance.internal.EnumC6429k;
import com.adobe.marketing.mobile.assurance.internal.Y;
import d0.C13439f;
import d0.C13442i;
import j0.C14801J;
import j0.C14815g;
import java.util.List;
import kotlin.AbstractC18142l;
import kotlin.C17979v;
import kotlin.C17983x;
import kotlin.C18153w;
import kotlin.C18154x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15342b;
import l0.InterfaceC15343c;
import l0.w;
import r0.C16692i;
import u1.PlatformTextStyle;
import u5.C17226e;
import v5.C17509a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a%\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0016\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "onClick", "b", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/adobe/marketing/mobile/assurance/internal/k;", "LV0/q0;", "e", "(Lcom/adobe/marketing/mobile/assurance/internal/k;)J", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: D5.a$a, reason: collision with other inner class name */
    static final class C0093a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f5032f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0093a(Activity activity) {
            super(0);
            this.f5032f = activity;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f5032f.finish();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function1<w, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<List<C6419a.StatusLog>> f5033f;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: D5.a$b$a, reason: collision with other inner class name */
        static final class C0094a extends Lambda implements Function4<InterfaceC15343c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<List<C6419a.StatusLog>> f5034f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0094a(z1<? extends List<C6419a.StatusLog>> z1Var) {
                super(4);
                this.f5034f = z1Var;
            }

            public final void a(InterfaceC15343c items, int i10, Composer composer, int i11) {
                Composer composer2;
                int i12;
                Intrinsics.j(items, "$this$items");
                if ((i11 & 112) == 0) {
                    composer2 = composer;
                    i12 = (composer2.d(i10) ? 32 : 16) | i11;
                } else {
                    composer2 = composer;
                    i12 = i11;
                }
                if ((i12 & 721) == 144 && composer2.j()) {
                    composer2.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1424914109, i11, -1, "com.adobe.marketing.mobile.assurance.internal.ui.status.AssuranceStatusScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AssuranceStatusScreen.kt:104)");
                }
                String message = this.f5034f.getValue().get(i10).getMessage();
                long jE = a.e(this.f5034f.getValue().get(i10).getLevel());
                Modifier modifierA = F1.a(Modifier.INSTANCE, "logEntry");
                E5.a aVar = E5.a.f7617a;
                N1.b(message, modifierA, 0L, 0L, null, null, aVar.d().a().getFamily(), 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(jE, H1.w.i(aVar.d().a().getSize().getSmall()), (FontWeight) null, (C18153w) null, (C18154x) null, (AbstractC18142l) null, (String) null, 0L, (F1.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, (j) null, (l) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (F1.f) null, (F1.e) null, 4194300, (DefaultConstructorMarker) null), composer2, 1572912, 0, 65468);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Integer num, Composer composer, Integer num2) {
                a(interfaceC15343c, num.intValue(), composer, num2.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(z1<? extends List<C6419a.StatusLog>> z1Var) {
            super(1);
            this.f5033f = z1Var;
        }

        public final void a(w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            w.b(LazyColumn, this.f5033f.getValue().size(), null, null, ComposableLambdaKt.composableLambdaInstance(1424914109, true, new C0094a(this.f5033f)), 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(w wVar) {
            a(wVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f5035f = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C6423e.appState.a();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class d extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f5036f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Activity activity) {
            super(0);
            this.f5036f = activity;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Y yB = C6423e.f62233a.b();
            if (yB != null) {
                yB.c();
            }
            this.f5036f.finish();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5037f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10) {
            super(2);
            this.f5037f = i10;
        }

        public final void a(Composer composer, int i10) {
            a.a(composer, J0.a(this.f5037f | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f5038f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10) {
            super(2);
            this.f5038f = i10;
        }

        public final void a(Composer composer, int i10) {
            a.a(composer, J0.a(this.f5038f | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class g extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f5039f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function0<Unit> function0) {
            super(0);
            this.f5039f = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f5039f.invoke();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f5040f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f5041g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f5042h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Modifier modifier, Function0<Unit> function0, int i10) {
            super(2);
            this.f5040f = modifier;
            this.f5041g = function0;
            this.f5042h = i10;
        }

        public final void a(Composer composer, int i10) {
            a.b(this.f5040f, this.f5041g, composer, J0.a(this.f5042h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(2092925300);
        if (i10 == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2092925300, i10, -1, "com.adobe.marketing.mobile.assurance.internal.ui.status.AssuranceStatusScreen (AssuranceStatusScreen.kt:60)");
            }
            Activity activityA = C17226e.a((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g()));
            if (activityA == null) {
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                T0 t0L = composerStartRestartGroup.l();
                if (t0L == null) {
                    return;
                }
                t0L.a(new f(i10));
                return;
            }
            composerStartRestartGroup.startReplaceableGroup(-1501704512);
            Configuration configuration = (Configuration) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.f());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = Boolean.valueOf((configuration.uiMode & 15) == 4);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            boolean zBooleanValue = ((Boolean) objB).booleanValue();
            composerStartRestartGroup.U();
            composerStartRestartGroup.startReplaceableGroup(-1501704337);
            Configuration configuration2 = (Configuration) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.f());
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                int i11 = configuration2.orientation;
                objB2 = Boolean.valueOf(i11 == 2 || i11 == 0);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            boolean zBooleanValue2 = ((Boolean) objB2).booleanValue();
            composerStartRestartGroup.U();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierF = J.f(companion2, 0.0f, 1, null);
            E5.a aVar = E5.a.f7617a;
            Modifier modifierA = F1.a(D.k(androidx.compose.foundation.b.d(modifierF, aVar.a(), null, 2, null), H1.h.p(8), 0.0f, 2, null), "statusView");
            C5658d c5658d = C5658d.f48555a;
            C5658d.f fVarO = c5658d.o(H1.h.p(24));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(fVarO, companion3.k(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C5892t0.g());
            t tVar = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion4.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C = A.c(modifierA);
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            composerStartRestartGroup.G();
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion4.e());
            D1.c(composerA, dVar, companion4.c());
            D1.c(composerA, tVar, companion4.d());
            D1.c(composerA, q12, companion4.h());
            composerStartRestartGroup.c();
            function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C14815g c14815g = C14815g.f139108a;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyI = C5662h.i(companion3.o(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar2 = (H1.d) composerStartRestartGroup.o(C5892t0.g());
            t tVar2 = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q13 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            Function0<InterfaceC5811g> function0A2 = companion4.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C2 = A.c(companion2);
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            composerStartRestartGroup.G();
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyI, companion4.e());
            D1.c(composerA2, dVar2, companion4.c());
            D1.c(composerA2, tVar2, companion4.d());
            D1.c(composerA2, q13, companion4.h());
            composerStartRestartGroup.c();
            function3C2.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C5664j c5664j = C5664j.f48612a;
            C17509a.a(composerStartRestartGroup, 0);
            b(c5664j.g(companion2, companion3.n()), new C0093a(activityA), composerStartRestartGroup, 0);
            composerStartRestartGroup.U();
            composerStartRestartGroup.v();
            composerStartRestartGroup.U();
            composerStartRestartGroup.U();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = C6423e.appState.c();
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            z1 z1Var = (z1) objB3;
            C5658d.f fVarB = c5658d.b();
            Modifier modifierA2 = F1.a(androidx.compose.foundation.b.d(J.c(J.h(companion2, 0.0f, 1, null), (zBooleanValue || zBooleanValue2) ? 0.7f : 0.9f), aVar.c(), null, 2, null), "logsPanel");
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA2 = C5665k.a(fVarB, companion3.k(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar3 = (H1.d) composerStartRestartGroup.o(C5892t0.g());
            t tVar3 = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q14 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            Function0<InterfaceC5811g> function0A3 = companion4.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C3 = A.c(modifierA2);
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            composerStartRestartGroup.G();
            Composer composerA3 = D1.a(composerStartRestartGroup);
            D1.c(composerA3, measurePolicyA2, companion4.e());
            D1.c(composerA3, dVar3, companion4.c());
            D1.c(composerA3, tVar3, companion4.d());
            D1.c(composerA3, q14, companion4.h());
            composerStartRestartGroup.c();
            function3C3.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Modifier modifierA3 = F1.a(D.i(J.d(J.h(companion2, 0.0f, 1, null), 0.0f, 1, null), aVar.b().b().getSmall()), "logsContent");
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zV = composerStartRestartGroup.V(z1Var);
            Object objB4 = composerStartRestartGroup.B();
            if (zV || objB4 == companion.a()) {
                objB4 = new b(z1Var);
                composerStartRestartGroup.t(objB4);
            }
            composerStartRestartGroup.U();
            C15342b.b(modifierA3, null, null, false, null, null, null, false, (Function1) objB4, composerStartRestartGroup, 6, 254);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.U();
            composerStartRestartGroup.v();
            composerStartRestartGroup.U();
            composerStartRestartGroup.U();
            C5658d.f fVarE = c5658d.e();
            Modifier modifierH = J.h(companion2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyB = G.b(fVarE, companion3.l(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar4 = (H1.d) composerStartRestartGroup.o(C5892t0.g());
            t tVar4 = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q15 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            Function0<InterfaceC5811g> function0A4 = companion4.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C4 = A.c(modifierH);
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A4);
            } else {
                composerStartRestartGroup.s();
            }
            composerStartRestartGroup.G();
            Composer composerA4 = D1.a(composerStartRestartGroup);
            D1.c(composerA4, measurePolicyB, companion4.e());
            D1.c(composerA4, dVar4, companion4.c());
            D1.c(composerA4, tVar4, companion4.d());
            D1.c(composerA4, q15, companion4.h());
            composerStartRestartGroup.c();
            function3C4.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            C14801J c14801j = C14801J.f139030a;
            Modifier modifierA4 = F1.a(companion2, "clearLogButton");
            c cVar = c.f5035f;
            D5.b bVar = D5.b.f5043a;
            C17983x.d(cVar, modifierA4, false, null, null, null, null, null, null, bVar.a(), composerStartRestartGroup, 805306422, 508);
            Modifier modifierA5 = F1.a(companion2, "statusDisconnectButton");
            float fP = H1.h.p(2);
            C5346q0.Companion companion5 = C5346q0.INSTANCE;
            C17983x.c(new d(activityA), modifierA5, false, null, null, C16692i.c(H1.h.p(20)), C13442i.a(fP, companion5.h()), C17979v.f168713a.h(companion5.i(), companion5.k(), 0L, composerStartRestartGroup, (C17979v.f168724l << 9) | 54, 4), null, bVar.b(), composerStartRestartGroup, 806879280, 284);
            composerStartRestartGroup.U();
            composerStartRestartGroup.v();
            composerStartRestartGroup.U();
            composerStartRestartGroup.U();
            composerStartRestartGroup.U();
            composerStartRestartGroup.v();
            composerStartRestartGroup.U();
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L2 = composerStartRestartGroup.l();
        if (t0L2 == null) {
            return;
        }
        t0L2.a(new e(i10));
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class i {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC6429k.values().length];
            try {
                iArr[EnumC6429k.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6429k.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6429k.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6429k.CRITICAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Modifier modifier, Function0<Unit> function0, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-322146224);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.V(modifier) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-322146224, i11, -1, "com.adobe.marketing.mobile.assurance.internal.ui.status.CloseButton (AssuranceStatusScreen.kt:160)");
            }
            Modifier modifierF = J.F(J.v(T0.e.a(Modifier.INSTANCE, C16692i.f()), H1.h.p(32)), null, false, 3, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zV = composerStartRestartGroup.V(function0);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new g(function0);
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            Modifier modifierD = ClickableKt.d(modifierF, false, null, null, (Function0) objB, 7, null);
            float fP = H1.h.p(1);
            C5346q0.Companion companion = C5346q0.INSTANCE;
            Modifier modifierA = F1.a(C5659e.b(C13439f.e(modifierD, C13442i.a(fP, companion.k()), C16692i.f()), 1.0f, false, 2, null).then(modifier), "statusCloseButton");
            C5658d.f fVarB = C5658d.f48555a.b();
            e.c cVarI = P0.e.INSTANCE.i();
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
            if (composerStartRestartGroup.h()) {
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
            composer2 = composerStartRestartGroup;
            N1.b("✕", null, 0L, 0L, null, null, AbstractC18142l.INSTANCE.d(), 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(companion.k(), H1.w.i(14), (FontWeight) null, (C18153w) null, (C18154x) null, (AbstractC18142l) null, (String) null, 0L, (F1.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, (j) null, (l) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (F1.f) null, (F1.e) null, 4194300, (DefaultConstructorMarker) null), composer2, 6, 1572864, 65470);
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
        t0L.a(new h(modifier, function0, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(EnumC6429k enumC6429k) {
        int i10 = i.$EnumSwitchMapping$0[enumC6429k.ordinal()];
        if (i10 == 1) {
            return C5346q0.INSTANCE.f();
        }
        if (i10 == 2) {
            return C5346q0.INSTANCE.c();
        }
        if (i10 == 3) {
            return C5346q0.INSTANCE.l();
        }
        if (i10 == 4) {
            return C5346q0.INSTANCE.h();
        }
        throw new NoWhenBranchMatchedException();
    }
}
