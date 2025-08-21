package in;

import Ki.LocalThemeScope;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import dk.C13698b;
import j0.C14903g;
import ki.q1;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r1.C16819m;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LKi/M;", "Lbk/a;", "titleText", "subTitleText", "", "b", "(LKi/M;Lbk/a;Lbk/a;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: in.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14816i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.i$a */
    public static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f138592f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(L1.A a10) {
            super(1);
            this.f138592f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f138592f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: in.i$b */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f138593f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f138594g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f138595h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f138596i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138597j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f138598k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(L1.n nVar, int i10, Function0 function0, AbstractC6392a abstractC6392a, LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a2) {
            super(2);
            this.f138594g = nVar;
            this.f138595h = function0;
            this.f138596i = abstractC6392a;
            this.f138597j = localThemeScope;
            this.f138598k = abstractC6392a2;
            this.f138593f = i10;
        }

        public final void a(Composer composer, int i10) {
            if (((i10 & 11) ^ 2) == 0 && composer.j()) {
                composer.K();
                return;
            }
            int helpersHashCode = this.f138594g.getHelpersHashCode();
            this.f138594g.i();
            composer.startReplaceGroup(-1073714290);
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            AbstractC6392a abstractC6392a = this.f138596i;
            int i11 = AbstractC6392a.f60445b;
            String strA = C13698b.a(abstractC6392a, composer, i11);
            Ki.I seven = this.f138597j.getAdsTypography().getHeadings().getSeven();
            float f10 = 16;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null);
            composer.startReplaceGroup(1849434622);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = c.f138599a;
                composer.t(objB);
            }
            composer.P();
            q1.Label label = new q1.Label(C16819m.d(modifierM, false, (Function1) objB, 1, null), null, null, null, 0, false, 0, seven, null, 382, null);
            LocalThemeScope localThemeScope = this.f138597j;
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            composer.startReplaceGroup(2128858729);
            AbstractC6392a abstractC6392a2 = this.f138598k;
            if (abstractC6392a2 != null) {
                si.j.h(this.f138597j, new q1.Label(androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null), null, null, null, 0, false, 0, this.f138597j.getAdsTypography().getBody().getTwo(), null, 382, null), C13698b.a(abstractC6392a2, composer, i11), null, composer, i12 | (i13 << 3), 4);
            }
            composer.P();
            composer.v();
            composer.P();
            if (this.f138594g.getHelpersHashCode() != helpersHashCode) {
                this.f138595h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: in.i$c */
    static final class c implements Function1<r1.u, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f138599a = new c();

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            r1.s.v(semantics);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }

        c() {
        }
    }

    public static final void b(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, Composer composer, final int i10) {
        int i11;
        final AbstractC6392a abstractC6392a3;
        final LocalThemeScope localThemeScope2;
        final AbstractC6392a abstractC6392a4;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-499355949);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? composerStartRestartGroup.V(abstractC6392a) : composerStartRestartGroup.D(abstractC6392a) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? composerStartRestartGroup.V(abstractC6392a2) : composerStartRestartGroup.D(abstractC6392a2) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            abstractC6392a3 = abstractC6392a;
            localThemeScope2 = localThemeScope;
            abstractC6392a4 = abstractC6392a2;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-499355949, i11, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderHeaderView (OrderHeaderView.kt:28)");
            }
            Modifier modifierM = androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, H1.h.p(24), 0.0f, H1.h.p(8), 5, null);
            composerStartRestartGroup.startReplaceableGroup(-270267587);
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new L1.A();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            L1.A a10 = (L1.A) objB;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new L1.n();
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            L1.n nVar = (L1.n) objB2;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = t1.e(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.U();
            Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB3, a10, composerStartRestartGroup, 4544);
            MeasurePolicy measurePolicyA = pairH.a();
            Function0<Unit> function0B = pairH.b();
            Modifier modifierD = C16819m.d(modifierM, false, new a(a10), 1, null);
            b bVar = new b(nVar, 6, function0B, abstractC6392a, localThemeScope, abstractC6392a2);
            abstractC6392a3 = abstractC6392a;
            localThemeScope2 = localThemeScope;
            abstractC6392a4 = abstractC6392a2;
            androidx.compose.ui.layout.A.a(modifierD, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, bVar), measurePolicyA, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: in.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C14816i.c(localThemeScope2, abstractC6392a3, abstractC6392a4, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, int i10, Composer composer, int i11) {
        b(localThemeScope, abstractC6392a, abstractC6392a2, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
