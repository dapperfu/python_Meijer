package com.meijer.mobile.subscription.ux.subscription;

import Ki.LocalThemeScope;
import Ki.Q;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5868j0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import com.meijer.mobile.subscription.ux.subscription.AbstractC13119k;
import com.meijer.mobile.subscription.ux.subscription.C13111c;
import cr.SubscriptionDetails;
import d0.T;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ki.InterfaceC15154X;
import ki.Q0;
import ki.q1;
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
import kr.C15410d;
import oi.C16200v0;
import oi.P0;
import p1.C16338g;
import pr.AbstractC16490a;
import pr.SubscriptionSummaryDecorator;
import yr.C18370z;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001as\u0010\u0011\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0015\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u001d²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001c\u001a\u00020\u001b8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/ranges/IntRange;", "frequencyWeeksRange", "quantityRange", "Lkotlin/Function1;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "", "onAction", "Lkotlin/Function0;", "onExit", "Lpr/c;", "subscriptionSummary", "onShowSubscriptionInfoBottomSheet", "Lcom/meijer/mobile/subscription/ux/subscription/I;", "viewState", "c", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/ranges/IntRange;Lkotlin/ranges/IntRange;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lpr/c;Lkotlin/jvm/functions/Function0;Lcom/meijer/mobile/subscription/ux/subscription/I;Landroidx/compose/runtime/Composer;II)V", "", "description", "g", "(LKi/M;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "", "selectedFrequency", "selectedQuantity", "lastAction", "", "isSubscriptionLoading", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.subscription.ux.subscription.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13111c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.c$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119991a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f119992b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f119993c;

        a(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails, Function0<Unit> function0) {
            this.f119991a = localThemeScope;
            this.f119992b = subscriptionDetails;
            this.f119993c = function0;
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
            LocalThemeScope localThemeScope = this.f119991a;
            if (this.f119992b != null) {
                composer.startReplaceGroup(-248539286);
                strC = C16338g.c(C15410d.f148765V, composer, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(-248535356);
                strC = C16338g.c(C15410d.f148795m0, composer, 0);
                composer.P();
            }
            jr.m.c(localThemeScope, null, strC, AbstractC6392a.INSTANCE.d(C15410d.f148782g, new Object[0]), null, this.f119993c, null, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 9), 41);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.c$b */
    static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SubscriptionViewState f119994a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119995b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SubscriptionSummaryDecorator f119996c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f119997d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13119k, Unit> f119998e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f119999f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map<String, Integer> f120000g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f120001h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f120002i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f120003j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ List<String> f120004k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ IntRange f120005l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f120006m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f120007n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC5868j0 f120008o;

        /* JADX WARN: Multi-variable type inference failed */
        b(SubscriptionViewState subscriptionViewState, LocalThemeScope localThemeScope, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function0<Unit> function0, Function1<? super AbstractC13119k, Unit> function1, SubscriptionDetails subscriptionDetails, Map<String, Integer> map, String str, String str2, String str3, List<String> list, IntRange intRange, Function0<Unit> function02, InterfaceC5868j0 interfaceC5868j0, InterfaceC5868j0 interfaceC5868j02) {
            this.f119994a = subscriptionViewState;
            this.f119995b = localThemeScope;
            this.f119996c = subscriptionSummaryDecorator;
            this.f119997d = function0;
            this.f119998e = function1;
            this.f119999f = subscriptionDetails;
            this.f120000g = map;
            this.f120001h = str;
            this.f120002i = str2;
            this.f120003j = str3;
            this.f120004k = list;
            this.f120005l = intRange;
            this.f120006m = function02;
            this.f120007n = interfaceC5868j0;
            this.f120008o = interfaceC5868j02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(AbstractC16490a it) {
            Intrinsics.j(it, "it");
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(Map map, Function1 function1, String value, boolean z10) {
            Intrinsics.j(value, "value");
            Integer num = (Integer) map.get(value);
            if (num != null) {
                function1.invoke(new AbstractC13119k.ChangeFrequency(num.intValue()));
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(IntRange intRange, Function1 function1, String value, boolean z10) {
            Intrinsics.j(value, "value");
            Integer numV = StringsKt.v(value);
            if (numV == null || !intRange.p(numV.intValue())) {
                numV = null;
            }
            if (numV != null) {
                function1.invoke(new AbstractC13119k.ChangeQuantity(numV.intValue()));
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(Function1 function1) {
            function1.invoke(AbstractC13119k.e.f120022a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(Function1 function1) {
            function1.invoke(AbstractC13119k.m.f120030a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(Function1 function1) {
            function1.invoke(AbstractC13119k.d.f120021a);
            return Unit.f143329a;
        }

        public final void g(InterfaceC14882C paddingValues, Composer composer, int i10) {
            int i11;
            LocalThemeScope localThemeScope;
            Composer composer2;
            Map<String, Integer> map;
            String str;
            String str2;
            final Map<String, Integer> map2;
            final Function1<AbstractC13119k, Unit> function1;
            IntRange intRange;
            int i12;
            String str3;
            List<String> list;
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
            Modifier modifierF = androidx.compose.foundation.layout.J.f(companion, 0.0f, 1, null);
            SubscriptionViewState subscriptionViewState = this.f119994a;
            LocalThemeScope localThemeScope2 = this.f119995b;
            SubscriptionSummaryDecorator subscriptionSummaryDecorator = this.f119996c;
            Function0<Unit> function0 = this.f119997d;
            final Function1<AbstractC13119k, Unit> function12 = this.f119998e;
            SubscriptionDetails subscriptionDetails = this.f119999f;
            Map<String, Integer> map3 = this.f120000g;
            String str4 = this.f120001h;
            String str5 = this.f120002i;
            String str6 = this.f120003j;
            List<String> list2 = this.f120004k;
            IntRange intRange2 = this.f120005l;
            Function0<Unit> function02 = this.f120006m;
            InterfaceC5868j0 interfaceC5868j0 = this.f120007n;
            InterfaceC5868j0 interfaceC5868j02 = this.f120008o;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            if (subscriptionViewState.getIsSubscriptionLoading()) {
                composer.startReplaceGroup(1666369198);
                C13111c.g(localThemeScope2, null, composer, LocalThemeScope.f17314g, 1);
                composer.P();
            } else {
                composer.startReplaceGroup(1666557709);
                Modifier modifierG = T.g(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.h(companion, paddingValues), 0.0f, 1, null), null, false, 3, null), T.c(0, composer, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), companion2.k(), composer, 0);
                int iA2 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierG);
                Function0<InterfaceC5953g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = D1.a(composer);
                D1.c(composerA2, measurePolicyA, companion3.e());
                D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14903g c14903g = C14903g.f139698a;
                composer.startReplaceGroup(41287111);
                if (subscriptionSummaryDecorator != null) {
                    composer.startReplaceGroup(1849434622);
                    Object objB = composer.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.subscription.ux.subscription.d
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C13111c.b.k((AbstractC16490a) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    localThemeScope = localThemeScope2;
                    map = map3;
                    defpackage.p.f(localThemeScope, subscriptionSummaryDecorator, null, function0, (Function1) objB, composer, LocalThemeScope.f17314g | 24576, 2);
                    composer2 = composer;
                } else {
                    localThemeScope = localThemeScope2;
                    composer2 = composer;
                    map = map3;
                }
                composer2.P();
                String strC = C16338g.c(C15410d.f148821z0, composer2, 0);
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null);
                composer2.startReplaceGroup(5004770);
                boolean zV = composer2.V(function12);
                Object objB2 = composer2.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.e
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C13111c.b.q(function12);
                        }
                    };
                    composer2.t(objB2);
                }
                Function0 function03 = (Function0) objB2;
                composer2.P();
                int i13 = LocalThemeScope.f17314g;
                jr.j.b(localThemeScope, strC, modifierM, function03, composer2, i13, 0);
                composer2.startReplaceGroup(41314916);
                if (subscriptionDetails != null) {
                    Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion, localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 8, null);
                    MeasurePolicy measurePolicyG2 = C5804h.g(companion2.o(), false);
                    int iA3 = C5859f.a(composer2, 0);
                    InterfaceC5884s interfaceC5884sR3 = composer2.r();
                    Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierM2);
                    Function0<InterfaceC5953g> function0A3 = companion3.a();
                    if (composer2.k() == null) {
                        C5859f.c();
                    }
                    composer2.F();
                    if (composer2.getInserting()) {
                        composer2.I(function0A3);
                    } else {
                        composer2.s();
                    }
                    Composer composerA3 = D1.a(composer2);
                    D1.c(composerA3, measurePolicyG2, companion3.e());
                    D1.c(composerA3, interfaceC5884sR3, companion3.g());
                    Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
                    if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                        composerA3.t(Integer.valueOf(iA3));
                        composerA3.n(Integer.valueOf(iA3), function2B3);
                    }
                    D1.c(composerA3, modifierE3, companion3.f());
                    C16200v0 c16200v0 = C16200v0.f154265a;
                    String strC2 = C16338g.c(C15410d.f148802q, composer2, 0);
                    Modifier modifierF2 = C18370z.f(companion, C16338g.c(C15410d.f148802q, composer2, 0), null, 2, null);
                    composer2.startReplaceGroup(5004770);
                    boolean zV2 = composer2.V(function12);
                    Object objB3 = composer2.B();
                    if (zV2 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.f
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C13111c.b.r(function12);
                            }
                        };
                        composer2.t(objB3);
                    }
                    composer2.P();
                    map2 = map;
                    Composer composer3 = composer2;
                    function1 = function12;
                    intRange = intRange2;
                    i12 = 0;
                    str2 = null;
                    str = str4;
                    P0.k(localThemeScope, c16200v0, strC2, (Function0) objB3, modifierF2, null, true, 0L, false, composer3, (C16200v0.f154266b << 3) | i13 | 1572864, 208);
                    composer2 = composer3;
                    composer2.v();
                } else {
                    str = str4;
                    str2 = null;
                    map2 = map;
                    function1 = function12;
                    intRange = intRange2;
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
                            if (((Number) ((Map.Entry) next).getValue()).intValue() == C13111c.d(interfaceC5868j0)) {
                                break;
                            }
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    str3 = entry != null ? (String) entry.getKey() : str2;
                } else {
                    str3 = str2;
                }
                String strC3 = C16338g.c(C15410d.f148745G, composer2, i12);
                composer2.startReplaceGroup(-1633490746);
                boolean zD = composer2.D(map2) | composer2.V(function1);
                Object objB4 = composer2.B();
                if (zD || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new Function2() { // from class: com.meijer.mobile.subscription.ux.subscription.g
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C13111c.b.l(map2, function1, (String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                    composer2.t(objB4);
                }
                composer2.P();
                int i14 = LocalThemeScope.f17314g;
                String str7 = str;
                jr.h.b(localThemeScope, null, str7, str5, listJ1, str3, strC3, (Function2) objB4, composer, i14, 1);
                if (subscriptionDetails != null) {
                    String strValueOf = String.valueOf(C13111c.e(interfaceC5868j02));
                    list = list2;
                    if (list.contains(strValueOf)) {
                        str2 = strValueOf;
                    }
                } else {
                    list = list2;
                }
                String str8 = str2;
                String strC4 = C16338g.c(C15410d.f148785h0, composer, i12);
                composer.startReplaceGroup(-1633490746);
                final IntRange intRange3 = intRange;
                boolean zD2 = composer.D(intRange3) | composer.V(function1);
                Object objB5 = composer.B();
                if (zD2 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new Function2() { // from class: com.meijer.mobile.subscription.ux.subscription.h
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return C13111c.b.o(intRange3, function1, (String) obj, ((Boolean) obj2).booleanValue());
                        }
                    };
                    composer.t(objB5);
                }
                composer.P();
                jr.h.b(localThemeScope, null, str7, str6, list, str8, strC4, (Function2) objB5, composer, i14, 1);
                C14890K.a(InterfaceC14902f.b(c14903g, Modifier.INSTANCE, 1.0f, false, 2, null), composer, i12);
                boolean zI = subscriptionViewState.i();
                String strC5 = C16338g.c(C15410d.f148813v0, composer, i12);
                String strC6 = C16338g.c(C15410d.f148786i, composer, i12);
                composer.startReplaceGroup(5004770);
                boolean zV3 = composer.V(function1);
                Object objB6 = composer.B();
                if (zV3 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new Function0() { // from class: com.meijer.mobile.subscription.ux.subscription.i
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C13111c.b.p(function1);
                        }
                    };
                    composer.t(objB6);
                }
                composer.P();
                jr.d.b(localThemeScope, null, zI, strC5, strC6, null, null, null, 0.0f, (Function0) objB6, function02, composer, i14, 0, 241);
                composer.v();
                composer.P();
            }
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            g(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.c$c, reason: collision with other inner class name */
    static final class C1939c implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f120009a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f120010b;

        C1939c(LocalThemeScope localThemeScope, String str) {
            this.f120009a = localThemeScope;
            this.f120010b = str;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1121267670, i10, -1, "com.meijer.mobile.subscription.ux.subscription.ProgressBar.<anonymous> (AddManageSubscriptionContent.kt:205)");
            }
            q1.k.LargeV2 largeLoadingV2 = Assemble.getLoading().getLargeLoadingV2();
            Ci.o oVar = Ci.o.f4629a;
            Ci.m.e(this.f120009a, androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null), largeLoadingV2, oVar, null, this.f120010b, null, composer, LocalThemeScope.f17314g | 3120 | (q1.k.LargeV2.f142351f << 6), 40);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
            a(interfaceC15154X, composer, num.intValue());
            return Unit.f143329a;
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
    public static final void c(final Ki.LocalThemeScope r33, androidx.compose.ui.Modifier r34, kotlin.ranges.IntRange r35, kotlin.ranges.IntRange r36, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.subscription.ux.subscription.AbstractC13119k, kotlin.Unit> r37, final kotlin.jvm.functions.Function0<kotlin.Unit> r38, final pr.SubscriptionSummaryDecorator r39, final kotlin.jvm.functions.Function0<kotlin.Unit> r40, final com.meijer.mobile.subscription.ux.subscription.SubscriptionViewState r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.subscription.ux.subscription.C13111c.c(Ki.M, androidx.compose.ui.Modifier, kotlin.ranges.IntRange, kotlin.ranges.IntRange, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, pr.c, kotlin.jvm.functions.Function0, com.meijer.mobile.subscription.ux.subscription.I, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, Modifier modifier, IntRange intRange, IntRange intRange2, Function1 function1, Function0 function0, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function0 function02, SubscriptionViewState subscriptionViewState, int i10, int i11, Composer composer, int i12) {
        c(localThemeScope, modifier, intRange, intRange2, function1, function0, subscriptionSummaryDecorator, function02, subscriptionViewState, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
            Q.e(localThemeScope, Q0.b.f141966a, ComposableLambdaKt.c(-1121267670, true, new C1939c(localThemeScope, str), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384 | (Q0.b.f141967b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.subscription.ux.subscription.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C13111c.h(localThemeScope, str, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, String str, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, str, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(InterfaceC5868j0 interfaceC5868j0) {
        return interfaceC5868j0.a();
    }
}
