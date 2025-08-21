package E5;

import B1.LocaleList;
import F1.LineHeightStyle;
import F1.TextGeometricTransform;
import F1.TextIndent;
import F1.j;
import F1.k;
import F1.l;
import H1.t;
import P0.e;
import V0.C5489q0;
import V0.Shadow;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5801e;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.F1;
import androidx.compose.ui.platform.Q1;
import androidx.compose.ui.text.TextStyle;
import com.adobe.marketing.mobile.assurance.internal.C6544a;
import com.adobe.marketing.mobile.assurance.internal.C6548e;
import com.adobe.marketing.mobile.assurance.internal.EnumC6554k;
import com.adobe.marketing.mobile.assurance.internal.Y;
import d0.C13572f;
import d0.C13575i;
import j0.C14889J;
import j0.C14903g;
import java.util.List;
import kotlin.AbstractC18269l;
import kotlin.C18045v;
import kotlin.C18049x;
import kotlin.C18280w;
import kotlin.C18281x;
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
import l0.C15432b;
import l0.InterfaceC15433c;
import l0.w;
import r0.C16806i;
import u1.PlatformTextStyle;
import v5.C17639e;
import w5.C17842a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a%\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0016\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "onClick", "b", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/adobe/marketing/mobile/assurance/internal/k;", "LV0/q0;", "e", "(Lcom/adobe/marketing/mobile/assurance/internal/k;)J", "assurance_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class a {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: E5.a$a, reason: collision with other inner class name */
    static final class C0138a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f7018f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0138a(Activity activity) {
            super(0);
            this.f7018f = activity;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f7018f.finish();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function1<w, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ z1<List<C6544a.StatusLog>> f7019f;

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: E5.a$b$a, reason: collision with other inner class name */
        static final class C0139a extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<List<C6544a.StatusLog>> f7020f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0139a(z1<? extends List<C6544a.StatusLog>> z1Var) {
                super(4);
                this.f7020f = z1Var;
            }

            public final void a(InterfaceC15433c items, int i10, Composer composer, int i11) {
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
                String message = this.f7020f.getValue().get(i10).getMessage();
                long jE = a.e(this.f7020f.getValue().get(i10).getLevel());
                Modifier modifierA = F1.a(Modifier.INSTANCE, "logEntry");
                F5.a aVar = F5.a.f9034a;
                N1.b(message, modifierA, 0L, 0L, null, null, aVar.d().a().getFamily(), 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(jE, H1.w.i(aVar.d().a().getSize().getSmall()), (FontWeight) null, (C18280w) null, (C18281x) null, (AbstractC18269l) null, (String) null, 0L, (F1.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, (j) null, (l) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (F1.f) null, (F1.e) null, 4194300, (DefaultConstructorMarker) null), composer2, 1572912, 0, 65468);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15433c interfaceC15433c, Integer num, Composer composer, Integer num2) {
                a(interfaceC15433c, num.intValue(), composer, num2.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(z1<? extends List<C6544a.StatusLog>> z1Var) {
            super(1);
            this.f7019f = z1Var;
        }

        public final void a(w LazyColumn) {
            Intrinsics.j(LazyColumn, "$this$LazyColumn");
            w.b(LazyColumn, this.f7019f.getValue().size(), null, null, ComposableLambdaKt.composableLambdaInstance(1424914109, true, new C0139a(this.f7019f)), 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(w wVar) {
            a(wVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f7021f = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C6548e.appState.a();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class d extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Activity f7022f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Activity activity) {
            super(0);
            this.f7022f = activity;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Y yB = C6548e.f63072a.b();
            if (yB != null) {
                yB.c();
            }
            this.f7022f.finish();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7023f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10) {
            super(2);
            this.f7023f = i10;
        }

        public final void a(Composer composer, int i10) {
            a.a(composer, J0.a(this.f7023f | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f7024f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10) {
            super(2);
            this.f7024f = i10;
        }

        public final void a(Composer composer, int i10) {
            a.a(composer, J0.a(this.f7024f | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class g extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f7025f;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Function0<Unit> function0) {
            super(0);
            this.f7025f = function0;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f7025f.invoke();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f7026f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f7027g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f7028h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Modifier modifier, Function0<Unit> function0, int i10) {
            super(2);
            this.f7026f = modifier;
            this.f7027g = function0;
            this.f7028h = i10;
        }

        public final void a(Composer composer, int i10) {
            a.b(this.f7026f, this.f7027g, composer, J0.a(this.f7028h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
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
            Activity activityA = C17639e.a((Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g()));
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
            F5.a aVar = F5.a.f9034a;
            Modifier modifierA = F1.a(D.k(androidx.compose.foundation.b.d(modifierF, aVar.a(), null, 2, null), H1.h.p(8), 0.0f, 2, null), "statusView");
            C5800d c5800d = C5800d.f48779a;
            C5800d.f fVarO = c5800d.o(H1.h.p(24));
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(fVarO, companion3.k(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C6034t0.g());
            t tVar = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion4.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C = A.c(modifierA);
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
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
            C14903g c14903g = C14903g.f139698a;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyI = C5804h.i(companion3.o(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar2 = (H1.d) composerStartRestartGroup.o(C6034t0.g());
            t tVar2 = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q13 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            Function0<InterfaceC5953g> function0A2 = companion4.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C2 = A.c(companion2);
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
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
            C5806j c5806j = C5806j.f48836a;
            C17842a.a(composerStartRestartGroup, 0);
            b(c5806j.g(companion2, companion3.n()), new C0138a(activityA), composerStartRestartGroup, 0);
            composerStartRestartGroup.U();
            composerStartRestartGroup.v();
            composerStartRestartGroup.U();
            composerStartRestartGroup.U();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = C6548e.appState.c();
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            z1 z1Var = (z1) objB3;
            C5800d.f fVarB = c5800d.b();
            Modifier modifierA2 = F1.a(androidx.compose.foundation.b.d(J.c(J.h(companion2, 0.0f, 1, null), (zBooleanValue || zBooleanValue2) ? 0.7f : 0.9f), aVar.c(), null, 2, null), "logsPanel");
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA2 = C5807k.a(fVarB, companion3.k(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar3 = (H1.d) composerStartRestartGroup.o(C6034t0.g());
            t tVar3 = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q14 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            Function0<InterfaceC5953g> function0A3 = companion4.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C3 = A.c(modifierA2);
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
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
            C15432b.b(modifierA3, null, null, false, null, null, null, false, (Function1) objB4, composerStartRestartGroup, 6, 254);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.U();
            composerStartRestartGroup.v();
            composerStartRestartGroup.U();
            composerStartRestartGroup.U();
            C5800d.f fVarE = c5800d.e();
            Modifier modifierH = J.h(companion2, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyB = G.b(fVarE, companion3.l(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar4 = (H1.d) composerStartRestartGroup.o(C6034t0.g());
            t tVar4 = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q15 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            Function0<InterfaceC5953g> function0A4 = companion4.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C4 = A.c(modifierH);
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
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
            C14889J c14889j = C14889J.f139620a;
            Modifier modifierA4 = F1.a(companion2, "clearLogButton");
            c cVar = c.f7021f;
            E5.b bVar = E5.b.f7029a;
            C18049x.d(cVar, modifierA4, false, null, null, null, null, null, null, bVar.a(), composerStartRestartGroup, 805306422, 508);
            Modifier modifierA5 = F1.a(companion2, "statusDisconnectButton");
            float fP = H1.h.p(2);
            C5489q0.Companion companion5 = C5489q0.INSTANCE;
            C18049x.c(new d(activityA), modifierA5, false, null, null, C16806i.c(H1.h.p(20)), C13575i.a(fP, companion5.h()), C18045v.f169801a.h(companion5.i(), companion5.k(), 0L, composerStartRestartGroup, (C18045v.f169812l << 9) | 54, 4), null, bVar.b(), composerStartRestartGroup, 806879280, 284);
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
            int[] iArr = new int[EnumC6554k.values().length];
            try {
                iArr[EnumC6554k.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC6554k.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC6554k.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC6554k.CRITICAL.ordinal()] = 4;
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
            Modifier modifierF = J.F(J.v(T0.e.a(Modifier.INSTANCE, C16806i.f()), H1.h.p(32)), null, false, 3, null);
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
            C5489q0.Companion companion = C5489q0.INSTANCE;
            Modifier modifierA = F1.a(C5801e.b(C13572f.e(modifierD, C13575i.a(fP, companion.k()), C16806i.f()), 1.0f, false, 2, null).then(modifier), "statusCloseButton");
            C5800d.f fVarB = C5800d.f48779a.b();
            e.c cVarI = P0.e.INSTANCE.i();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyB = G.b(fVarB, cVarI, composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar = (H1.d) composerStartRestartGroup.o(C6034t0.g());
            t tVar = (t) composerStartRestartGroup.o(C6034t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C6034t0.t());
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            Function3<V0<InterfaceC5953g>, Composer, Integer, Unit> function3C = A.c(modifierA);
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
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
            C14889J c14889j = C14889J.f139620a;
            composer2 = composerStartRestartGroup;
            N1.b("✕", null, 0L, 0L, null, null, AbstractC18269l.INSTANCE.d(), 0L, null, null, 0L, 0, false, 0, 0, null, new TextStyle(companion.k(), H1.w.i(14), (FontWeight) null, (C18280w) null, (C18281x) null, (AbstractC18269l) null, (String) null, 0L, (F1.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, (j) null, (l) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (F1.f) null, (F1.e) null, 4194300, (DefaultConstructorMarker) null), composer2, 6, 1572864, 65470);
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
    public static final long e(EnumC6554k enumC6554k) {
        int i10 = i.$EnumSwitchMapping$0[enumC6554k.ordinal()];
        if (i10 == 1) {
            return C5489q0.INSTANCE.f();
        }
        if (i10 == 2) {
            return C5489q0.INSTANCE.c();
        }
        if (i10 == 3) {
            return C5489q0.INSTANCE.l();
        }
        if (i10 == 4) {
            return C5489q0.INSTANCE.h();
        }
        throw new NoWhenBranchMatchedException();
    }
}
