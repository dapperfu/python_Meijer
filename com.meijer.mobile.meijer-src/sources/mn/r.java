package mn;

import Ki.LocalThemeScope;
import P0.e;
import V0.C5489q0;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.text.TextStyle;
import d0.InterfaceC13561B;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import java.util.List;
import kotlin.C17982Y0;
import kotlin.C18054z0;
import kotlin.C6304d;
import kotlin.FontWeight;
import kotlin.InterfaceC6305e;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15432b;
import l0.InterfaceC15433c;
import l0.w;
import mn.r;
import p1.C16332a;
import p1.C16335d;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u001ac\u0010\u000e\u001a\u00020\f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u000526\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0007H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LKi/M;", "", "isDividerVisible", "", "index", "Lmn/n;", "stackedPromo", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "position", "isExpanded", "", "onClick", "c", "(LKi/M;ZILmn/n;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class r {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f151214a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
        /* renamed from: mn.r$a$a, reason: collision with other inner class name */
        public static final class C2327a extends Lambda implements Function1 {

            /* renamed from: f, reason: collision with root package name */
            public static final C2327a f151215f = new C2327a();

            public C2327a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Void invoke(Integer num) {
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        public static final class b extends Lambda implements Function1<Integer, Object> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function1 f151216f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List f151217g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Function1 function1, List list) {
                super(1);
                this.f151216f = function1;
                this.f151217g = list;
            }

            public final Object a(int i10) {
                return this.f151216f.invoke(this.f151217g.get(i10));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return a(num.intValue());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
        @SourceDebugExtension
        public static final class c extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List f151218f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f151219g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list, LocalThemeScope localThemeScope) {
                super(4);
                this.f151218f = list;
                this.f151219g = localThemeScope;
            }

            public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
                int i12;
                if ((i11 & 6) == 0) {
                    i12 = (composer.V(interfaceC15433c) ? 4 : 2) | i11;
                } else {
                    i12 = i11;
                }
                if ((i11 & 48) == 0) {
                    i12 |= composer.d(i10) ? 32 : 16;
                }
                if (!composer.p((i12 & 147) != 146, i12 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                ((Number) this.f151218f.get(i10)).intValue();
                composer.startReplaceGroup(790496574);
                i.p(this.f151219g, null, composer, LocalThemeScope.f17314g, 1);
                composer.P();
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

        public final void b(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(915539749, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.StackedPromoExpandableCard.<anonymous>.<anonymous> (StackedPromoExpandableCard.kt:107)");
            }
            Modifier modifierH = J.h(Modifier.INSTANCE, 0.0f, 1, null);
            float f10 = 16;
            InterfaceC14882C interfaceC14882CE = D.e(H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(f10), 2, null);
            C5800d.f fVarO = C5800d.f48779a.o(H1.h.p(f10));
            composer.startReplaceGroup(5004770);
            boolean zD = composer.D(this.f151214a);
            final LocalThemeScope localThemeScope = this.f151214a;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: mn.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return r.a.c(localThemeScope, (w) obj);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            C15432b.c(modifierH, null, interfaceC14882CE, false, fVarO, null, null, false, null, (Function1) objB, composer, 24582, 490);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        a(LocalThemeScope localThemeScope) {
            this.f151214a = localThemeScope;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(LocalThemeScope localThemeScope, w LazyRow) {
            Intrinsics.j(LazyRow, "$this$LazyRow");
            List listP = CollectionsKt.p(1, 2, 3, 4, 5, 6, 7);
            LazyRow.i(listP.size(), null, new b(C2327a.f151215f, listP), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new c(listP, localThemeScope)));
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            b(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void c(final LocalThemeScope localThemeScope, final boolean z10, final int i10, final StackedPromo stackedPromo, final Function2<? super Integer, ? super Boolean, Unit> onClick, Composer composer, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(stackedPromo, "stackedPromo");
        Intrinsics.j(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(346268851);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.a(z10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.d(i10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= composerStartRestartGroup.V(stackedPromo) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(onClick) ? 16384 : 8192;
        }
        if ((i12 & 9363) == 9362 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(346268851, i12, -1, "com.meijer.mobile.meijer.activity.orders.screens.StackedPromoExpandableCard (StackedPromoExpandableCard.kt:45)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = h0.k.a();
                composerStartRestartGroup.t(objB);
            }
            h0.l lVar = (h0.l) objB;
            composerStartRestartGroup.P();
            int i13 = stackedPromo.getIsExpanded() ? Cj.i.f4839x : Cj.i.f4812o;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            InterfaceC13561B interfaceC13561BF = C17982Y0.f(true, 0.0f, 0L, 6, null);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z11 = ((i12 & 896) == 256) | ((57344 & i12) == 16384) | ((i12 & 7168) == 2048);
            Object objB2 = composerStartRestartGroup.B();
            if (z11 || objB2 == companion.a()) {
                objB2 = new Function0() { // from class: mn.o
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return r.d(onClick, i10, stackedPromo);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            Modifier modifierC = ClickableKt.c(companion2, lVar, interfaceC13561BF, false, null, null, (Function0) objB2, 28, null);
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion3.k(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierC);
            InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion4.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyA, companion4.e());
            D1.c(composerA, interfaceC5884sR, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier modifierH = J.h(D.i(companion2, H1.h.p(16)), 0.0f, 1, null);
            MeasurePolicy measurePolicyB = G.b(c5800d.e(), companion3.l(), composerStartRestartGroup, 6);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierH);
            Function0<InterfaceC5953g> function0A2 = companion4.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A2);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA2 = D1.a(composerStartRestartGroup);
            D1.c(composerA2, measurePolicyB, companion4.e());
            D1.c(composerA2, interfaceC5884sR2, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion4.f());
            C14889J c14889j = C14889J.f139620a;
            Z0.c cVarC = C16335d.c(Cj.i.f4741T1, composerStartRestartGroup, 0);
            C5489q0.Companion companion5 = C5489q0.INSTANCE;
            int i14 = i12;
            C18054z0.a(cVarC, null, null, companion5.j(), composerStartRestartGroup, 3120, 4);
            C14890K.a(J.z(companion2, H1.h.p(18)), composerStartRestartGroup, 6);
            Modifier modifierM = D.m(InterfaceC14888I.b(c14889j, companion2, 1.0f, false, 2, null), 0.0f, 0.0f, H1.h.p(38), 0.0f, 11, null);
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion3.k(), composerStartRestartGroup, 0);
            int iA3 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierM);
            Function0<InterfaceC5953g> function0A3 = companion4.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A3);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA3 = D1.a(composerStartRestartGroup);
            D1.c(composerA3, measurePolicyA2, companion4.e());
            D1.c(composerA3, interfaceC5884sR3, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion4.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion4.f());
            String promo = stackedPromo.getPromo();
            if (promo == null) {
                promo = "";
            }
            long jA = companion5.a();
            TextStyle h62 = Fj.c.a().getH6();
            FontWeight.Companion companion6 = FontWeight.INSTANCE;
            N1.b(promo, null, jA, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.c(h62, 0L, H1.w.i(16), companion6.j(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, H1.w.i(22), null, null, null, 0, 0, null, 16646137, null), composerStartRestartGroup, 384, 0, 65530);
            String promoDescription = stackedPromo.getPromoDescription();
            if (promoDescription == null) {
                promoDescription = "";
            }
            N1.b(promoDescription, null, companion5.a(), 0L, null, null, null, 0L, null, F1.j.h(F1.j.INSTANCE.d()), 0L, 0, false, 0, 0, null, TextStyle.c(Fj.c.a().getH6(), 0L, H1.w.i(14), companion6.j(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, H1.w.i(20), null, null, null, 0, 0, null, 16646137, null), composerStartRestartGroup, 384, 0, 65018);
            composerStartRestartGroup.v();
            C18054z0.a(C16335d.c(i13, composerStartRestartGroup, 0), stackedPromo.getIsExpanded() ? "Expanded" : "Collapsed", null, C16332a.a(Cj.g.f4661c, composerStartRestartGroup, 0), composerStartRestartGroup, 0, 4);
            composerStartRestartGroup.v();
            C6304d.e(c14903g, stackedPromo.getIsExpanded(), null, null, null, null, ComposableLambdaKt.c(915539749, true, new a(localThemeScope), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 30);
            C6304d.e(c14903g, z10, null, null, null, null, k.f151190a.a(), composerStartRestartGroup, 1572870 | (i14 & 112), 30);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: mn.p
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return r.e(localThemeScope, z10, i10, stackedPromo, onClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(LocalThemeScope localThemeScope, boolean z10, int i10, StackedPromo stackedPromo, Function2 function2, int i11, Composer composer, int i12) {
        c(localThemeScope, z10, i10, stackedPromo, function2, composer, J0.a(i11 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function2 function2, int i10, StackedPromo stackedPromo) {
        function2.invoke(Integer.valueOf(i10), Boolean.valueOf(!stackedPromo.getIsExpanded()));
        return Unit.f143329a;
    }
}
