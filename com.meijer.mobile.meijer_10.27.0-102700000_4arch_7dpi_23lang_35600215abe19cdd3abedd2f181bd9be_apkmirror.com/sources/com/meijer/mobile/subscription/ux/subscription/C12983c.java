package com.meijer.mobile.subscription.ux.subscription;

import Ji.LocalThemeScope;
import Ji.Q;
import P0.e;
import ak.AbstractC5607a;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import com.meijer.mobile.subscription.ux.subscription.C12983c;
import com.meijer.mobile.subscription.ux.subscription.j;
import cr.SubscriptionDetails;
import d0.T;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14794C;
import j0.InterfaceC14814f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ji.InterfaceC14920X;
import ji.Q0;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kr.C15307d;
import ni.C15866v0;
import ni.P0;
import p1.C16193g;
import pr.AbstractC16364a;
import pr.SubscriptionSummaryDecorator;
import yr.C18299z;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001as\u0010\u0011\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0015\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001d²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/ranges/IntRange;", "frequencyWeeksRange", "quantityRange", "Lkotlin/Function1;", "Lcom/meijer/mobile/subscription/ux/subscription/j;", "", "onAction", "Lkotlin/Function0;", "onExit", "Lpr/c;", "subscriptionSummary", "onShowSubscriptionInfoBottomSheet", "Lcom/meijer/mobile/subscription/ux/subscription/H;", "viewState", "c", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lpr/c;Lkotlin/jvm/functions/Function0;Lcom/meijer/mobile/subscription/ux/subscription/H;Landroidx/compose/runtime/Composer;II)V", "", "description", "g", "(LJi/M;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "", "selectedFrequency", "selectedQuantity", "lastAction", "", "isSubscriptionLoading", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.subscription.ux.subscription.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C12983c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.c$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119014a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f119015b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f119016c;

        a(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails, Function0<Unit> function0) {
            this.f119014a = localThemeScope;
            this.f119015b = subscriptionDetails;
            this.f119016c = function0;
        }

        public final void a(Composer composer, int i10) {
            String strC;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1613147400, i10, -1, "com.meijer.mobile.subscription.ux.subscription.AddManageSubscriptionContent.<anonymous> (AddManageSubscriptionContent.kt:89)");
            }
            LocalThemeScope localThemeScope = this.f119014a;
            if (this.f119015b != null) {
                composer.startReplaceGroup(-248539286);
                strC = C16193g.c(C15307d.f147855V, composer, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(-248535356);
                strC = C16193g.c(C15307d.f147885m0, composer, 0);
                composer.P();
            }
            jr.m.c(localThemeScope, null, strC, AbstractC5607a.INSTANCE.d(C15307d.f147872g, new Object[0]), null, this.f119016c, null, composer, LocalThemeScope.f15770g | (AbstractC5607a.f45514b << 9), 41);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.c$b */
    static final class b implements Function3<InterfaceC14794C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SubscriptionViewState f119017a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119018b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SubscriptionSummaryDecorator f119019c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f119020d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<j, Unit> f119021e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f119022f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map<String, Integer> f119023g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f119024h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f119025i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f119026j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ List<String> f119027k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ IntRange f119028l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f119029m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f119030n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC5726j0 f119031o;

        /* JADX WARN: Multi-variable type inference failed */
        b(SubscriptionViewState subscriptionViewState, LocalThemeScope localThemeScope, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function0<Unit> function0, Function1<? super j, Unit> function1, SubscriptionDetails subscriptionDetails, Map<String, Integer> map, String str, String str2, String str3, List<String> list, IntRange intRange, Function0<Unit> function02, InterfaceC5726j0 interfaceC5726j0, InterfaceC5726j0 interfaceC5726j02) {
            this.f119017a = subscriptionViewState;
            this.f119018b = localThemeScope;
            this.f119019c = subscriptionSummaryDecorator;
            this.f119020d = function0;
            this.f119021e = function1;
            this.f119022f = subscriptionDetails;
            this.f119023g = map;
            this.f119024h = str;
            this.f119025i = str2;
            this.f119026j = str3;
            this.f119027k = list;
            this.f119028l = intRange;
            this.f119029m = function02;
            this.f119030n = interfaceC5726j0;
            this.f119031o = interfaceC5726j02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(AbstractC16364a it) {
            Intrinsics.j(it, "it");
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Map map, Function1 function1, String value, boolean z10) {
            Intrinsics.j(value, "value");
            Integer num = (Integer) map.get(value);
            if (num != null) {
                function1.invoke(new j.ChangeFrequency(num.intValue()));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(IntRange intRange, Function1 function1, String value, boolean z10) {
            Intrinsics.j(value, "value");
            Integer numV = StringsKt.v(value);
            if (numV == null || !intRange.p(numV.intValue())) {
                numV = null;
            }
            if (numV != null) {
                function1.invoke(new j.ChangeQuantity(numV.intValue()));
            }
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function1 function1, SubscriptionViewState subscriptionViewState) {
            function1.invoke(new j.SaveSubscription(subscriptionViewState.getSubscriptionDecorator()));
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(Function1 function1) {
            function1.invoke(j.k.f119052a);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(Function1 function1) {
            function1.invoke(j.d.f119045a);
            return Unit.f142422a;
        }

        public final void g(InterfaceC14794C paddingValues, Composer composer, int i10) {
            int i11;
            LocalThemeScope localThemeScope;
            Composer composer2;
            Map<String, Integer> map;
            String str;
            String str2;
            Map<String, Integer> map2;
            SubscriptionViewState subscriptionViewState;
            final Function1<j, Unit> function1;
            List<String> list;
            int i12;
            String str3;
            Object next;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(paddingValues) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-949708799, i11, -1, "com.meijer.mobile.subscription.ux.subscription.AddManageSubscriptionContent.<anonymous> (AddManageSubscriptionContent.kt:100)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = J.f(companion, 0.0f, 1, null);
            SubscriptionViewState subscriptionViewState2 = this.f119017a;
            LocalThemeScope localThemeScope2 = this.f119018b;
            SubscriptionSummaryDecorator subscriptionSummaryDecorator = this.f119019c;
            Function0<Unit> function0 = this.f119020d;
            final Function1<j, Unit> function12 = this.f119021e;
            SubscriptionDetails subscriptionDetails = this.f119022f;
            Map<String, Integer> map3 = this.f119023g;
            String str4 = this.f119024h;
            String str5 = this.f119025i;
            String str6 = this.f119026j;
            List<String> list2 = this.f119027k;
            final IntRange intRange = this.f119028l;
            Function0<Unit> function02 = this.f119029m;
            InterfaceC5726j0 interfaceC5726j0 = this.f119030n;
            InterfaceC5726j0 interfaceC5726j02 = this.f119031o;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
            InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C5664j c5664j = C5664j.f48612a;
            if (subscriptionViewState2.getIsSubscriptionLoading()) {
                composer.startReplaceGroup(1666369198);
                C12983c.g(localThemeScope2, null, composer, LocalThemeScope.f15770g, 1);
                composer.P();
            } else {
                composer.startReplaceGroup(1666558391);
                Modifier modifierG = T.g(J.D(J.h(androidx.compose.foundation.layout.D.h(companion, paddingValues), 0.0f, 1, null), null, false, 3, null), T.c(0, composer, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), companion2.k(), composer, 0);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierG);
                Function0<InterfaceC5811g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = D1.a(composer);
                D1.c(composerA2, measurePolicyA, companion3.e());
                D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14815g c14815g = C14815g.f139108a;
                composer.startReplaceGroup(41287111);
                if (subscriptionSummaryDecorator != null) {
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.subscription.ux.subscription.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C12983c.b.k((AbstractC16364a) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    localThemeScope = localThemeScope2;
                    map = map3;
                    defpackage.p.f(localThemeScope, subscriptionSummaryDecorator, null, function0, (Function1) objB, composer, LocalThemeScope.f15770g | 24576, 2);
                    composer2 = composer;
                } else {
                    localThemeScope = localThemeScope2;
                    composer2 = composer;
                    map = map3;
                }
                composer2.P();
                String strC = C16193g.c(C15307d.f147907x0, composer2, 0);
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null);
                composer2.startReplaceGroup(5004770);
                boolean zV = composer2.V(function12);
                Object objB2 = composer2.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C12983c.b.q(function12);
                        }
                    };
                    composer2.t(objB2);
                }
                composer2.P();
                int i13 = LocalThemeScope.f15770g;
                jr.j.b(localThemeScope, strC, modifierM, (Function0) objB2, composer2, i13, 0);
                composer2.startReplaceGroup(41314916);
                if (subscriptionDetails != null) {
                    Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 8, null);
                    MeasurePolicy measurePolicyG2 = C5662h.g(companion2.o(), false);
                    int iA3 = C5717f.a(composer2, 0);
                    InterfaceC5742s interfaceC5742sR3 = composer2.r();
                    Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierM2);
                    Function0<InterfaceC5811g> function0A3 = companion3.a();
                    if (composer2.k() == null) {
                        C5717f.c();
                    }
                    composer2.F();
                    if (composer2.getInserting()) {
                        composer2.I(function0A3);
                    } else {
                        composer2.s();
                    }
                    Composer composerA3 = D1.a(composer2);
                    D1.c(composerA3, measurePolicyG2, companion3.e());
                    D1.c(composerA3, interfaceC5742sR3, companion3.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                    if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                        composerA3.t(Integer.valueOf(iA3));
                        composerA3.n(Integer.valueOf(iA3), function2B3);
                    }
                    D1.c(composerA3, modifierE3, companion3.f());
                    C15866v0 c15866v0 = C15866v0.f151806a;
                    String strC2 = C16193g.c(C15307d.f147892q, composer2, 0);
                    Modifier modifierF2 = C18299z.f(companion, C16193g.c(C15307d.f147892q, composer2, 0), null, 2, null);
                    composer2.startReplaceGroup(5004770);
                    boolean zV2 = composer2.V(function12);
                    Object objB3 = composer2.B();
                    if (zV2 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C12983c.b.r(function12);
                            }
                        };
                        composer2.t(objB3);
                    }
                    composer2.P();
                    str2 = null;
                    str = str4;
                    subscriptionViewState = subscriptionViewState2;
                    Composer composer3 = composer2;
                    map2 = map;
                    list = list2;
                    function1 = function12;
                    i12 = 0;
                    P0.k(localThemeScope, c15866v0, strC2, (Function0) objB3, modifierF2, null, true, 0L, false, composer3, 1572864 | i13 | (C15866v0.f151807b << 3), 208);
                    composer2 = composer3;
                    composer2.v();
                } else {
                    str = str4;
                    str2 = null;
                    map2 = map;
                    subscriptionViewState = subscriptionViewState2;
                    function1 = function12;
                    list = list2;
                    i12 = 0;
                }
                composer2.P();
                List listJ1 = CollectionsKt.j1(map2.keySet());
                if (subscriptionDetails != null) {
                    Iterator<T> it = map2.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = str2;
                            break;
                        } else {
                            next = it.next();
                            if (((Number) ((Map.Entry) next).getValue()).intValue() == C12983c.d(interfaceC5726j0)) {
                                break;
                            }
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    str3 = entry != null ? (String) entry.getKey() : str2;
                } else {
                    str3 = str2;
                }
                String strC3 = C16193g.c(C15307d.f147837G, composer2, i12);
                composer2.startReplaceGroup(-1633490746);
                final Map<String, Integer> map4 = map2;
                boolean zD = composer2.D(map4) | composer2.V(function1);
                Object objB4 = composer2.B();
                if (zD || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new Function2() { // from class: com.meijer.mobile.subscription.ux.subscription.g
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C12983c.b.l(map4, function1, (String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                    composer2.t(objB4);
                }
                composer2.P();
                int i14 = LocalThemeScope.f15770g;
                String str7 = str;
                jr.h.b(localThemeScope, null, str7, str5, listJ1, str3, strC3, (Function2) objB4, composer, i14, 1);
                if (subscriptionDetails != null) {
                    String strValueOf = String.valueOf(C12983c.e(interfaceC5726j02));
                    if (list.contains(strValueOf)) {
                        str2 = strValueOf;
                    }
                }
                String str8 = str2;
                String strC4 = C16193g.c(C15307d.f147875h0, composer, i12);
                composer.startReplaceGroup(-1633490746);
                boolean zD2 = composer.D(intRange) | composer.V(function1);
                Object objB5 = composer.B();
                if (zD2 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new Function2() { // from class: com.meijer.mobile.subscription.ux.subscription.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C12983c.b.o(intRange, function1, (String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                    composer.t(objB5);
                }
                composer.P();
                jr.h.b(localThemeScope, null, str7, str6, list, str8, strC4, (Function2) objB5, composer, i14, 1);
                C14802K.a(InterfaceC14814f.b(c14815g, Modifier.INSTANCE, 1.0f, false, 2, null), composer, i12);
                boolean zE = subscriptionViewState.e();
                String strC5 = C16193g.c(C15307d.f147901u0, composer, i12);
                String strC6 = C16193g.c(C15307d.f147876i, composer, i12);
                composer.startReplaceGroup(-1633490746);
                final SubscriptionViewState subscriptionViewState3 = subscriptionViewState;
                boolean zV3 = composer.V(function1) | composer.D(subscriptionViewState3);
                Object objB6 = composer.B();
                if (zV3 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C12983c.b.p(function1, subscriptionViewState3);
                        }
                    };
                    composer.t(objB6);
                }
                composer.P();
                jr.d.b(localThemeScope, null, zE, strC5, strC6, null, null, null, 0.0f, (Function0) objB6, function02, composer, i14, 0, 241);
                composer.v();
                composer.P();
            }
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14794C interfaceC14794C, Composer composer, Integer num) {
            g(interfaceC14794C, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.c$c, reason: collision with other inner class name */
    static final class C1932c implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119032a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f119033b;

        C1932c(LocalThemeScope localThemeScope, String str) {
            this.f119032a = localThemeScope;
            this.f119033b = str;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1121267670, i10, -1, "com.meijer.mobile.subscription.ux.subscription.ProgressBar.<anonymous> (AddManageSubscriptionContent.kt:205)");
            }
            q1.k.LargeV2 largeLoadingV2 = Assemble.getLoading().getLargeLoadingV2();
            Bi.o oVar = Bi.o.f2584a;
            Bi.m.e(this.f119032a, J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoadingV2, oVar, null, this.f119033b, null, composer, LocalThemeScope.f15770g | 3120 | (q1.k.LargeV2.f140096f << 6), 40);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
            a(interfaceC14920X, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final Ji.LocalThemeScope r33, androidx.compose.ui.Modifier r34, kotlin.ranges.IntRange r35, kotlin.ranges.IntRange r36, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.subscription.ux.subscription.j, kotlin.Unit> r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, final pr.SubscriptionSummaryDecorator r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, final com.meijer.mobile.subscription.ux.subscription.SubscriptionViewState r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.subscription.ux.subscription.C12983c.c(Ji.M, androidx.compose.ui.Modifier, kotlin.ranges.IntRange, kotlin.ranges.IntRange, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, pr.c, kotlin.jvm.functions.Function0, com.meijer.mobile.subscription.ux.subscription.H, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, IntRange intRange, IntRange intRange2, Function1 function1, Function0 function0, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function0 function02, SubscriptionViewState subscriptionViewState, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, intRange, intRange2, function1, function0, subscriptionSummaryDecorator, function02, subscriptionViewState, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    public static final void g(final LocalThemeScope localThemeScope, final String str, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(337560059);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                str = "";
            }
            if (ComposerKt.M()) {
                ComposerKt.U(337560059, i12, -1, "com.meijer.mobile.subscription.ux.subscription.ProgressBar (AddManageSubscriptionContent.kt:203)");
            }
            Q.e(localThemeScope, Q0.b.f139711a, ComposableLambdaKt.c(-1121267670, true, new C1932c(localThemeScope, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384 | (Q0.b.f139712b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.subscription.ux.subscription.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C12983c.h(localThemeScope, str, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, String str, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, str, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(InterfaceC5726j0 interfaceC5726j0) {
        return interfaceC5726j0.a();
    }
}
