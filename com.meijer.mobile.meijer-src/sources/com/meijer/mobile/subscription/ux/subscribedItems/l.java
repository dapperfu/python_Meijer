package com.meijer.mobile.subscription.ux.subscribedItems;

import Ki.C;
import Ki.LocalThemeScope;
import Ki.T;
import P0.e;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.layout.x;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bk.AbstractC6392a;
import c5.C6484c;
import com.meijer.mobile.subscription.ux.subscribedItems.q;
import cr.SubscriptionDetails;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import java.util.List;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C18051y;
import kotlin.Metadata;
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
import kr.C15408b;
import kr.C15409c;
import kr.C15410d;
import l0.C15429A;
import l0.InterfaceC15433c;
import l0.w;
import m5.C15669h;
import p1.C16338g;
import r0.C16806i;
import r0.RoundedCornerShape;
import yr.C18370z;
import yr.N;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a?\u0010\t\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001aO\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0014\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a%\u0010\u0018\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001a\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u001a\u0010\u0019\u001a'\u0010\u001d\u001a\u00020\u0005*\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006%²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002²\u0006\u0010\u0010\"\u001a\u0004\u0018\u00010!8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010$\u001a\u00020#8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcr/j;", "", "subscriptionCardClick", "Lkotlin/Function0;", "onBackPressed", "h", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "subscriptionDetailsList", "Lj0/C;", "paddingValues", "Ll0/A;", "listState", "o", "(LKi/M;Ljava/util/List;Lj0/C;Ll0/A;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "subscriptionDetails", "r", "(LKi/M;Lcr/j;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/subscription/ux/subscribedItems/t;", "decorator", "t", "(LKi/M;Lcom/meijer/mobile/subscription/ux/subscribedItems/t;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "k", "Lcom/meijer/mobile/subscription/ux/subscribedItems/r;", "errorStateDecorator", "m", "(LKi/M;Lcom/meijer/mobile/subscription/ux/subscribedItems/r;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/subscription/ux/subscribedItems/q;", "productUiState", "", "lastAction", "", "isSubscriptionLoading", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119765a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f119766b;

        a(LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f119765a = localThemeScope;
            this.f119766b = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1155316344, i10, -1, "com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemContent.<anonymous> (SubscribedItemContent.kt:82)");
            }
            jr.m.c(this.f119765a, null, C16338g.c(C15410d.f148754K0, composer, 0), AbstractC6392a.INSTANCE.d(C15410d.f148782g, new Object[0]), C.f.d.f17051e, this.f119766b, null, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 9) | (C.f.d.f17052f << 12), 33);
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
    static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119767a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C15429A f119768b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<SubscriptionDetails, Unit> f119769c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z1<q> f119770d;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, C15429A c15429a, Function1<? super SubscriptionDetails, Unit> function1, z1<? extends q> z1Var) {
            this.f119767a = localThemeScope;
            this.f119768b = c15429a;
            this.f119769c = function1;
            this.f119770d = z1Var;
        }

        public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
            int i11;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = (composer.V(paddingValues) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(877146801, i11, -1, "com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemContent.<anonymous> (SubscribedItemContent.kt:91)");
            }
            q qVarI = l.i(this.f119770d);
            if (qVarI instanceof q.c) {
                composer.startReplaceGroup(499421316);
                N.b(this.f119767a, null, composer, LocalThemeScope.f17314g, 1);
                composer.P();
            } else if (qVarI instanceof q.SubscriptionDetailsLoaded) {
                composer.startReplaceGroup(499546525);
                int i12 = i11;
                LocalThemeScope localThemeScope = this.f119767a;
                q qVarI2 = l.i(this.f119770d);
                Intrinsics.h(qVarI2, "null cannot be cast to non-null type com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemViewState.SubscriptionDetailsLoaded");
                l.o(localThemeScope, ((q.SubscriptionDetailsLoaded) qVarI2).a(), paddingValues, this.f119768b, null, this.f119769c, composer, LocalThemeScope.f17314g | ((i12 << 6) & 896), 8);
                composer.P();
            } else if (qVarI instanceof q.Empty) {
                composer.startReplaceGroup(499990073);
                LocalThemeScope localThemeScope2 = this.f119767a;
                q qVarI3 = l.i(this.f119770d);
                Intrinsics.h(qVarI3, "null cannot be cast to non-null type com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemViewState.Empty");
                l.m(localThemeScope2, ((q.Empty) qVarI3).getDecorator(), null, composer, (AbstractC6392a.f60445b << 3) | LocalThemeScope.f17314g, 2);
                composer.P();
            } else {
                if (!(qVarI instanceof q.Error)) {
                    composer.startReplaceGroup(1124487680);
                    composer.P();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(500222201);
                LocalThemeScope localThemeScope3 = this.f119767a;
                q qVarI4 = l.i(this.f119770d);
                Intrinsics.h(qVarI4, "null cannot be cast to non-null type com.meijer.mobile.subscription.ux.subscribedItems.SubscribedItemViewState.Error");
                l.m(localThemeScope3, ((q.Error) qVarI4).getDecorator(), null, composer, (AbstractC6392a.f60445b << 3) | LocalThemeScope.f17314g, 2);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
            a(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function0<Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<SubscriptionDetails, Unit> f119771a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f119772b;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super SubscriptionDetails, Unit> function1, SubscriptionDetails subscriptionDetails) {
            this.f119771a = function1;
            this.f119772b = subscriptionDetails;
        }

        public final void a() {
            this.f119771a.invoke(this.f119772b);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119773a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionDetails f119774b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SubscriptionOrderDetailsDecorator f119775c;

        d(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails, SubscriptionOrderDetailsDecorator tVar) {
            this.f119773a = localThemeScope;
            this.f119774b = subscriptionDetails;
            this.f119775c = tVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1161679978, i10, -1, "com.meijer.mobile.subscription.ux.subscribedItems.SubscriptionMainCardContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubscribedItemContent.kt:155)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = D.i(companion, this.f119773a.getAdsSpacing().getFive().getDp());
            LocalThemeScope localThemeScope = this.f119773a;
            SubscriptionDetails subscriptionDetails = this.f119774b;
            SubscriptionOrderDetailsDecorator tVar = this.f119775c;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier modifierH = J.h(companion, 0.0f, 1, null);
            int i11 = LocalThemeScope.f17314g;
            l.r(localThemeScope, subscriptionDetails, modifierH, composer, i11 | 384, 0);
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            l.t(localThemeScope, tVar, null, composer, i11, 2);
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
            Modifier modifierH2 = J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH2);
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
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            C15669h c15669hC = new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(tVar.getProductImageUrl()).e(true).p(C15408b.f148728g).j(C15408b.f148728g).c();
            a5.h hVarA = a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            InterfaceC5926k interfaceC5926kA = InterfaceC5926k.INSTANCE.a();
            C6484c.e(c15669hC, null, hVarA, J.v(C18370z.f(companion, "subscriptions_image", null, 2, null), localThemeScope.getAdsSpacing().getThirteen().getDp()), null, null, companion2.e(), interfaceC5926kA, 0.0f, null, 0, false, null, composer, 14155824, 0, 7984);
            C14890K.a(J.z(companion, localThemeScope.getAdsSpacing().getSeven().getDp()), composer, 0);
            l.k(localThemeScope, tVar, null, composer, i11, 2);
            composer.v();
            composer.v();
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

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class e extends Lambda implements Function1<Integer, Object> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f119776f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List list) {
            super(1);
            this.f119776f = list;
        }

        public final Object a(int i10) {
            this.f119776f.get(i10);
            return null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ll0/c;", "", "it", "", "a", "(Ll0/c;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {2, 1, 0})
    @SourceDebugExtension
    public static final class f extends Lambda implements Function4<InterfaceC15433c, Integer, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f119777f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119778g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1 f119779h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List list, LocalThemeScope localThemeScope, Function1 function1) {
            super(4);
            this.f119777f = list;
            this.f119778g = localThemeScope;
            this.f119779h = function1;
        }

        public final void a(InterfaceC15433c interfaceC15433c, int i10, Composer composer, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = i11 | (composer.V(interfaceC15433c) ? 4 : 2);
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
                ComposerKt.U(-1091073711, i12, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            SubscriptionDetails subscriptionDetails = (SubscriptionDetails) this.f119777f.get(i10);
            composer.startReplaceGroup(-1127397413);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(subscriptionDetails);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new SubscriptionOrderDetailsDecorator(subscriptionDetails);
                composer.t(objB);
            }
            SubscriptionOrderDetailsDecorator tVar = (SubscriptionOrderDetailsDecorator) objB;
            composer.P();
            Modifier modifierF = C18370z.f(D.k(J.h(Modifier.INSTANCE, 0.0f, 1, null), this.f119778g.getAdsSpacing().getFive().getDp(), 0.0f, 2, null), "subscriptions_card_" + i10, null, 2, null);
            float dp2 = this.f119778g.getAdsSpacing().getOne().getDp();
            RoundedCornerShape roundedCornerShapeC = C16806i.c(this.f119778g.getAdsSpacing().getThree().getDp());
            composer.startReplaceGroup(-1633490746);
            boolean zV2 = composer.V(this.f119779h) | composer.D(subscriptionDetails);
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new c(this.f119779h, subscriptionDetails);
                composer.t(objB2);
            }
            composer.P();
            C18051y.b((Function0) objB2, modifierF, false, roundedCornerShapeC, 0L, 0L, null, dp2, null, ComposableLambdaKt.c(1161679978, true, new d(this.f119778g, subscriptionDetails, tVar), composer, 54), composer, 805306368, 372);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class g implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119780a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ SubscriptionOrderDetailsDecorator f119781b;

        g(LocalThemeScope localThemeScope, SubscriptionOrderDetailsDecorator tVar) {
            this.f119780a = localThemeScope;
            this.f119781b = tVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(708313691, i10, -1, "com.meijer.mobile.subscription.ux.subscribedItems.SubscriptionsOrderDetailsCard.<anonymous> (SubscribedItemContent.kt:236)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierJ = D.j(x.a(J.h(companion, 0.0f, 1, null), j0.x.f139749a), this.f119780a.getAdsSpacing().getFour().getDp(), this.f119780a.getAdsSpacing().getTwo().getDp());
            C5800d c5800d = C5800d.f48779a;
            C5800d.f fVarD = c5800d.d();
            LocalThemeScope localThemeScope = this.f119780a;
            SubscriptionOrderDetailsDecorator tVar = this.f119781b;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(fVarD, companion2.k(), composer, 6);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            C14890K.a(J.z(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            Modifier modifierF = C18370z.f(companion, "subscription_order_details", null, 2, null);
            MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion2.k(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierF);
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
            D1.c(composerA2, measurePolicyA2, companion3.e());
            D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            Modifier modifierF2 = C18370z.f(companion, "next_order_row", null, 2, null);
            MeasurePolicy measurePolicyB = G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierF2);
            Function0<InterfaceC5953g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyB, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            C14889J c14889j = C14889J.f139620a;
            int i11 = 382;
            DefaultConstructorMarker defaultConstructorMarker = null;
            T t10 = null;
            F1.k kVar = null;
            F1.j jVar = null;
            int i12 = 0;
            boolean z10 = false;
            int i13 = 0;
            Integer num = null;
            q1.Label label = new q1.Label(C18370z.f(companion, "next_order_title_text", null, 2, null), t10, kVar, jVar, i12, z10, i13, localThemeScope.getAdsTypography().getHeadings().getSeven(), num, i11, defaultConstructorMarker);
            String strC = C16338g.c(C15410d.f148771a0, composer, 0);
            int i14 = LocalThemeScope.f17314g;
            int i15 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strC, null, composer, i14 | (i15 << 3), 4);
            C14890K.a(J.z(companion, localThemeScope.getAdsSpacing().getOne().getDp()), composer, 0);
            si.j.h(localThemeScope, new q1.Label(C18370z.f(companion, "next_order_value_text", null, 2, null), t10, kVar, jVar, i12, z10, i13, localThemeScope.getAdsTypography().getHeadings().getSeven(), num, i11, defaultConstructorMarker), tVar.getFormattedNextOrderDate(), null, composer, i14 | (i15 << 3), 4);
            composer.v();
            C14890K.a(J.i(companion, localThemeScope.getAdsSpacing().getTwo().getDp()), composer, 0);
            si.j.h(localThemeScope, new q1.Label(C18370z.f(companion, "delivery_detail_text", null, 2, null), t10, kVar, jVar, i12, z10, i13, localThemeScope.getAdsTypography().getBodyCompact().getTwo(), num, i11, defaultConstructorMarker), C16338g.a(C15409c.f148731a, tVar.getDeliveryWeek(), new Object[]{Integer.valueOf(tVar.getDeliveryWeek())}, composer, 0), null, composer, i14 | (i15 << 3), 4);
            composer.v();
            composer.v();
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final kotlin.jvm.functions.Function1<? super cr.SubscriptionDetails, kotlin.Unit> r35, final kotlin.jvm.functions.Function0<kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.subscription.ux.subscribedItems.l.h(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, Function0 function0, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, modifier, function1, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ki.LocalThemeScope r27, com.meijer.mobile.subscription.ux.subscribedItems.SubscriptionOrderDetailsDecorator r28, androidx.compose.ui.Modifier r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.subscription.ux.subscribedItems.l.k(Ki.M, com.meijer.mobile.subscription.ux.subscribedItems.t, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, SubscriptionOrderDetailsDecorator tVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, tVar, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ki.LocalThemeScope r37, final com.meijer.mobile.subscription.ux.subscribedItems.SubscriptionEmptyErrorStateDecorator r38, androidx.compose.ui.Modifier r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.subscription.ux.subscribedItems.l.m(Ki.M, com.meijer.mobile.subscription.ux.subscribedItems.r, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, SubscriptionEmptyErrorStateDecorator subscriptionEmptyErrorStateDecorator, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, subscriptionEmptyErrorStateDecorator, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Ki.LocalThemeScope r21, final java.util.List<cr.SubscriptionDetails> r22, final j0.InterfaceC14882C r23, final l0.C15429A r24, androidx.compose.ui.Modifier r25, final kotlin.jvm.functions.Function1<? super cr.SubscriptionDetails, kotlin.Unit> r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.subscription.ux.subscribedItems.l.o(Ki.M, java.util.List, j0.C, l0.A, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(List list, LocalThemeScope localThemeScope, Function1 function1, w LazyColumn) {
        Intrinsics.j(LazyColumn, "$this$LazyColumn");
        LazyColumn.i(list.size(), null, new e(list), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new f(list, localThemeScope, function1)));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, List list, InterfaceC14882C interfaceC14882C, C15429A c15429a, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        o(localThemeScope, list, interfaceC14882C, c15429a, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(final Ki.LocalThemeScope r28, cr.SubscriptionDetails r29, androidx.compose.ui.Modifier r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.subscription.ux.subscribedItems.l.r(Ki.M, cr.j, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(LocalThemeScope localThemeScope, SubscriptionDetails subscriptionDetails, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        r(localThemeScope, subscriptionDetails, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(final Ki.LocalThemeScope r17, final com.meijer.mobile.subscription.ux.subscribedItems.SubscriptionOrderDetailsDecorator r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.subscription.ux.subscribedItems.l.t(Ki.M, com.meijer.mobile.subscription.ux.subscribedItems.t, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, SubscriptionOrderDetailsDecorator tVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        t(localThemeScope, tVar, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q i(z1<? extends q> z1Var) {
        return z1Var.getValue();
    }
}
