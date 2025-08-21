package com.meijer.mobile.meijer.activity.checkout.confirmation;

import Ki.LocalThemeScope;
import L1.C4010g;
import L1.D;
import L1.n;
import L1.x;
import P0.e;
import android.content.Context;
import android.graphics.Typeface;
import android.widget.TextView;
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
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bk.AbstractC6392a;
import c5.C6484c;
import com.meijer.mobile.meijer.activity.checkout.confirmation.C11924u;
import com.meijer.mobile.meijer.activity.checkout.review.CartItemsDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.EntryDecorator;
import d0.C13590y;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.util.Locale;
import ki.C15132A;
import ki.j1;
import ki.q1;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.N1;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import oi.E0;
import p1.C16335d;
import p1.C16338g;
import r1.C16819m;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;", "order", "", "e", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/confirmation/p;Landroidx/compose/runtime/Composer;I)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C11924u {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.u$a */
    static final class a implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f103139a = new a();

        a() {
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.u$b */
    static final class b implements Function1<C4010g, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f103140a = new b();

        b() {
        }

        public final void a(C4010g constrainAs) {
            Intrinsics.j(constrainAs, "$this$constrainAs");
            D.a.a(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
            x.a.a(constrainAs.getBottom(), constrainAs.getParent().getBottom(), 0.0f, 0.0f, 6, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C4010g c4010g) {
            a(c4010g);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.u$c */
    static final class c implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103141a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f103142b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrderConfirmationDecorator f103143c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.u$c$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f103144a;

            a(LocalThemeScope localThemeScope) {
                this.f103144a = localThemeScope;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1605477520, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationDetailSection.<anonymous>.<anonymous>.<anonymous> (OrderConfirmationDetailSection.kt:157)");
                }
                LocalThemeScope localThemeScope = this.f103144a;
                q1.Label label = new q1.Label(null, this.f103144a.getAdsColors().getAdsColorEnabled01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null);
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f101000ja, composer, 0);
                Locale US = Locale.US;
                Intrinsics.i(US, "US");
                String upperCase = strC.toUpperCase(US);
                Intrinsics.i(upperCase, "toUpperCase(...)");
                si.j.h(localThemeScope, label, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        c(LocalThemeScope localThemeScope, Context context, OrderConfirmationDecorator orderConfirmationDecorator) {
            this.f103141a = localThemeScope;
            this.f103142b = context;
            this.f103143c = orderConfirmationDecorator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Context context, OrderConfirmationDecorator orderConfirmationDecorator) {
            Bl.l lVar = Bl.l.f3131a;
            String orderNumber = orderConfirmationDecorator != null ? orderConfirmationDecorator.getOrderNumber() : null;
            if (orderNumber == null) {
                orderNumber = "";
            }
            context.startActivity(Bl.l.b(lVar, context, orderNumber, null, null, 12, null));
            return Unit.f143329a;
        }

        public final void b(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1471719267, i10, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationDetailSection.<anonymous>.<anonymous> (OrderConfirmationDetailSection.kt:146)");
            }
            LocalThemeScope localThemeScope = this.f103141a;
            q1.d.StandardButton enabledButton = Assemble.getButtons().getEnabledButton();
            composer.startReplaceGroup(-1633490746);
            boolean zD = composer.D(this.f103142b) | composer.D(this.f103143c);
            final Context context = this.f103142b;
            final OrderConfirmationDecorator orderConfirmationDecorator = this.f103143c;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C11924u.c.c(context, orderConfirmationDecorator);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            E0.b(localThemeScope, enabledButton, (Function0) objB, ComposableLambdaKt.c(1605477520, true, new a(this.f103141a), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            b(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.u$d */
    public static final class d extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ L1.A f103145f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(L1.A a10) {
            super(1);
            this.f103145f = a10;
        }

        public final void a(r1.u semantics) {
            Intrinsics.j(semantics, "$this$semantics");
            L1.C.a(semantics, this.f103145f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.confirmation.u$e */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f103146f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L1.n f103147g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function0 f103148h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ CartItemsDecorator f103149i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f103150j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(L1.n nVar, int i10, Function0 function0, CartItemsDecorator cartItemsDecorator, LocalThemeScope localThemeScope) {
            super(2);
            this.f103147g = nVar;
            this.f103148h = function0;
            this.f103149i = cartItemsDecorator;
            this.f103150j = localThemeScope;
            this.f103146f = i10;
        }

        public final void a(Composer composer, int i10) {
            Composer composer2 = composer;
            if (((i10 & 11) ^ 2) == 0 && composer2.j()) {
                composer2.K();
                return;
            }
            int helpersHashCode = this.f103147g.getHelpersHashCode();
            this.f103147g.i();
            L1.n nVar = this.f103147g;
            composer2.startReplaceGroup(782247487);
            n.b bVarM = nVar.m();
            L1.h hVarA = bVarM.a();
            L1.h hVarC = bVarM.c();
            Modifier.Companion companion = Modifier.INSTANCE;
            char c10 = 8702;
            composer2.startReplaceGroup(1849434622);
            Object objB = composer2.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = a.f103139a;
                composer2.t(objB);
            }
            composer2.P();
            Modifier modifierK = nVar.k(companion, hVarA, (Function1) objB);
            int i11 = 0;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer2, 0);
            int iA = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR = composer2.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierK);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A);
            } else {
                composer2.s();
            }
            Composer composerA = D1.a(composer2);
            D1.c(composerA, measurePolicyB, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14889J c14889j = C14889J.f139620a;
            composer2.startReplaceGroup(-496544180);
            for (EntryDecorator entryDecorator : CollectionsKt.b1(this.f103149i.d(), this.f103149i.c().size())) {
                C15669h c15669hC = new C15669h.a((Context) composer2.o(AndroidCompositionLocals_androidKt.g())).f(entryDecorator.getImageUrl()).c();
                a5.h hVarA2 = a5.a.a((Context) composer2.o(AndroidCompositionLocals_androidKt.g()));
                String name = entryDecorator.getName();
                InterfaceC5926k interfaceC5926kB = InterfaceC5926k.INSTANCE.b();
                Z0.c cVarC = C16335d.c(Cj.i.f4726O1, composer2, i11);
                Z0.c cVarC2 = C16335d.c(Cj.i.f4726O1, composer2, i11);
                Modifier.Companion companion3 = Modifier.INSTANCE;
                C6484c.d(c15669hC, name, hVarA2, androidx.compose.foundation.layout.J.v(companion3, H1.h.p(75)), null, cVarC2, cVarC, null, null, null, null, interfaceC5926kB, 0.0f, null, 0, false, null, composer, 3072, 48, 128912);
                composer2 = composer;
                C14890K.a(androidx.compose.foundation.layout.J.z(companion3, H1.h.p(6)), composer2, 6);
                i11 = i11;
                helpersHashCode = helpersHashCode;
                nVar = nVar;
                hVarC = hVarC;
                c10 = 8702;
            }
            int i12 = helpersHashCode;
            L1.n nVar2 = nVar;
            L1.h hVar = hVarC;
            composer2.P();
            composer2.v();
            String extraItemCount = this.f103149i.getExtraItemCount();
            composer2.startReplaceGroup(-1914391784);
            if (extraItemCount != null) {
                LocalThemeScope localThemeScope = this.f103150j;
                Ki.I one = localThemeScope.getAdsTypography().getBodyCompact().getOne();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                composer2.startReplaceGroup(1849434622);
                Object objB2 = composer2.B();
                if (objB2 == Composer.INSTANCE.a()) {
                    objB2 = b.f103140a;
                    composer2.t(objB2);
                }
                composer2.P();
                si.j.h(localThemeScope, new q1.Label(nVar2.k(companion4, hVar, (Function1) objB2), null, null, null, 0, false, 0, one, null, 382, null), extraItemCount, null, composer2, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
            }
            composer.P();
            composer.P();
            if (this.f103147g.getHelpersHashCode() != i12) {
                this.f103148h.invoke();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [androidx.compose.runtime.n1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v29 */
    public static final void e(LocalThemeScope localThemeScope, final OrderConfirmationDecorator orderConfirmationDecorator, Composer composer, final int i10) {
        int i11;
        float f10;
        int i12;
        int i13;
        int i14;
        Context context;
        ?? r42;
        int i15;
        float f11;
        boolean z10;
        int i16;
        Modifier.Companion companion;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Intrinsics.j(localThemeScope2, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1981138533);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(orderConfirmationDecorator) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1981138533, i11, -1, "com.meijer.mobile.meijer.activity.checkout.confirmation.OrderConfirmationDetailSection (OrderConfirmationDetailSection.kt:54)");
            }
            Context context2 = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f12 = 16;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), H1.h.p(f12));
            C5800d c5800d = C5800d.f48779a;
            C5800d.e eVarG = c5800d.g();
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(eVarG, companion3.l(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierI);
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
            D1.c(composerA, measurePolicyB, companion4.e());
            D1.c(composerA, interfaceC5884sR, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C14889J c14889j = C14889J.f139620a;
            Integer numValueOf = orderConfirmationDecorator != null ? Integer.valueOf(orderConfirmationDecorator.getCartSummaryImageResourceId()) : null;
            composerStartRestartGroup.startReplaceGroup(2072995453);
            if (numValueOf == null) {
                f10 = f12;
                i12 = 1;
            } else {
                f10 = f12;
                i12 = 1;
                C13590y.a(C16335d.c(numValueOf.intValue(), composerStartRestartGroup, 0), null, null, null, null, 0.0f, null, composerStartRestartGroup, 48, 124);
                composerStartRestartGroup = composerStartRestartGroup;
                Unit unit = Unit.f143329a;
            }
            composerStartRestartGroup.P();
            C14890K.a(androidx.compose.foundation.layout.J.z(companion2, H1.h.p(f10)), composerStartRestartGroup, 6);
            Modifier modifierB = InterfaceC14888I.b(c14889j, companion2, 1.0f, false, 2, null);
            MeasurePolicy measurePolicyA = C5807k.a(c5800d.h(), companion3.k(), composerStartRestartGroup, 0);
            int iA2 = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierB);
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
            D1.c(composerA2, measurePolicyA, companion4.e());
            D1.c(composerA2, interfaceC5884sR2, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion4.f());
            C14903g c14903g = C14903g.f139698a;
            Ki.I iG = localThemeScope2.getAdsTypography().getBodyCompact().getTwo().g(FontWeight.INSTANCE.f());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion5 = Composer.INSTANCE;
            if (objB == companion5.a()) {
                objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C11924u.g((r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            q1.Label label = new q1.Label(C16819m.d(companion2, false, (Function1) objB, i12, null), null, null, null, 0, false, 0, iG, null, 382, null);
            String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100611P9, composerStartRestartGroup, 0);
            int i17 = LocalThemeScope.f17314g;
            int i18 = i11 & 14;
            int i19 = i11;
            Composer composer2 = composerStartRestartGroup;
            float f13 = f10;
            si.j.h(localThemeScope2, label, strC, null, composer2, i17 | i18 | (q1.Label.f142335j << 3), 4);
            final AbstractC6392a abstractC6392aG = orderConfirmationDecorator != null ? orderConfirmationDecorator.g() : null;
            composer2.startReplaceGroup(-144753782);
            if (abstractC6392aG == null) {
                i15 = 4;
                i14 = i17;
                context = context2;
                i13 = i18;
                composerStartRestartGroup = composer2;
                r42 = 0;
            } else {
                composer2.startReplaceGroup(-1633490746);
                boolean zD = composer2.D(abstractC6392aG) | (i18 == 4 || ((i19 & 8) != 0 && composer2.D(localThemeScope2)));
                Object objB2 = composer2.B();
                if (zD || objB2 == companion5.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C11924u.h(abstractC6392aG, localThemeScope2, (Context) obj);
                        }
                    };
                    composer2.t(objB2);
                }
                Function1 function1 = (Function1) objB2;
                composer2.P();
                i13 = i18;
                i14 = i17;
                context = context2;
                composerStartRestartGroup = composer2;
                r42 = 0;
                i15 = 4;
                androidx.compose.ui.viewinterop.e.a(function1, null, null, composerStartRestartGroup, 0, 6);
                Unit unit2 = Unit.f143329a;
            }
            composerStartRestartGroup.P();
            final AbstractC6392a abstractC6392aF = orderConfirmationDecorator != null ? orderConfirmationDecorator.f() : r42;
            composerStartRestartGroup.startReplaceGroup(-144737566);
            if (abstractC6392aF == null) {
                z10 = true;
                f11 = 0.0f;
            } else {
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean zD2 = composerStartRestartGroup.D(abstractC6392aF) | (i13 == i15 || ((i19 & 8) != 0 && composerStartRestartGroup.D(localThemeScope2)));
                Object objB3 = composerStartRestartGroup.B();
                if (zD2 || objB3 == companion5.a()) {
                    objB3 = new Function1() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.s
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C11924u.f(abstractC6392aF, localThemeScope2, (Context) obj);
                        }
                    };
                    composerStartRestartGroup.t(objB3);
                }
                composerStartRestartGroup.P();
                float fP = H1.h.p(i15);
                f11 = 0.0f;
                Modifier modifierK = androidx.compose.foundation.layout.D.k(companion2, 0.0f, fP, 1, r42);
                z10 = true;
                androidx.compose.ui.viewinterop.e.a((Function1) objB3, modifierK, null, composerStartRestartGroup, 48, 4);
                Unit unit3 = Unit.f143329a;
            }
            composerStartRestartGroup.P();
            CartItemsDecorator cartItems = orderConfirmationDecorator != null ? orderConfirmationDecorator.getCartItems() : r42;
            composerStartRestartGroup.startReplaceGroup(-144720962);
            if (cartItems == null) {
                i16 = i13;
                companion = companion2;
            } else {
                Modifier modifierH = androidx.compose.foundation.layout.J.h(companion2, f11, z10 ? 1 : 0, r42);
                composerStartRestartGroup.startReplaceableGroup(-270267587);
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                Object objB4 = composerStartRestartGroup.B();
                if (objB4 == companion5.a()) {
                    objB4 = new L1.A();
                    composerStartRestartGroup.t(objB4);
                }
                composerStartRestartGroup.U();
                L1.A a10 = (L1.A) objB4;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                Object objB5 = composerStartRestartGroup.B();
                if (objB5 == companion5.a()) {
                    objB5 = new L1.n();
                    composerStartRestartGroup.t(objB5);
                }
                composerStartRestartGroup.U();
                L1.n nVar = (L1.n) objB5;
                composerStartRestartGroup.startReplaceableGroup(-3687241);
                Object objB6 = composerStartRestartGroup.B();
                if (objB6 == companion5.a()) {
                    objB6 = t1.e(Boolean.FALSE, r42, 2, r42);
                    composerStartRestartGroup.t(objB6);
                }
                composerStartRestartGroup.U();
                Composer composer3 = composerStartRestartGroup;
                Pair<MeasurePolicy, Function0<Unit>> pairH = L1.l.h(257, nVar, (InterfaceC5872l0) objB6, a10, composer3, 4544);
                composerStartRestartGroup = composer3;
                MeasurePolicy measurePolicyA2 = pairH.a();
                Function0<Unit> function0B = pairH.b();
                Modifier modifierD = C16819m.d(modifierH, false, new d(a10), z10 ? 1 : 0, r42);
                boolean z11 = z10 ? 1 : 0;
                i16 = i13;
                CartItemsDecorator cartItemsDecorator = cartItems;
                localThemeScope2 = localThemeScope;
                i14 = i14;
                z10 = z11;
                androidx.compose.ui.layout.A.a(modifierD, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, z11, new e(nVar, 6, function0B, cartItemsDecorator, localThemeScope)), measurePolicyA2, composerStartRestartGroup, 48, 0);
                composerStartRestartGroup.U();
                Integer error = cartItemsDecorator.getError();
                composerStartRestartGroup.startReplaceGroup(-144660650);
                if (error == null) {
                    companion = companion2;
                } else {
                    companion = companion2;
                    N1.b(C16338g.c(error.intValue(), composerStartRestartGroup, 0), androidx.compose.foundation.b.d(androidx.compose.foundation.layout.J.h(androidx.compose.foundation.layout.D.i(companion2, H1.h.p(f13)), 0.0f, z10 ? 1 : 0, null), localThemeScope2.getAdsColors().getAdsColorSupportError().getColor(), null, 2, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composerStartRestartGroup, 0, 0, 131068);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Unit unit4 = Unit.f143329a;
                }
                composerStartRestartGroup.P();
                Unit unit5 = Unit.f143329a;
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            C14890K.a(androidx.compose.foundation.layout.J.z(companion, H1.h.p(f13)), composerStartRestartGroup, 6);
            Ki.Q.e(localThemeScope2, C15132A.f141851a, ComposableLambdaKt.c(1471719267, z10, new c(localThemeScope2, context, orderConfirmationDecorator), composerStartRestartGroup, 54), composerStartRestartGroup, i14 | 384 | i16 | (C15132A.f141852b << 3));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.checkout.confirmation.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C11924u.i(localThemeScope2, orderConfirmationDecorator, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView f(AbstractC6392a abstractC6392a, LocalThemeScope localThemeScope, Context context) {
        Intrinsics.j(context, "context");
        TextView textView = new TextView(context);
        ck.d.f(textView, abstractC6392a);
        textView.setTextSize(H1.v.h(localThemeScope.getAdsTypography().getBodyCompact().getTwo().getStyle().l()));
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.v(semantics);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView h(AbstractC6392a abstractC6392a, LocalThemeScope localThemeScope, Context context) {
        Intrinsics.j(context, "context");
        TextView textView = new TextView(context);
        ck.d.f(textView, abstractC6392a);
        textView.setTextSize(H1.v.h(localThemeScope.getAdsTypography().getBodyCompact().getTwo().getStyle().l()));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, OrderConfirmationDecorator orderConfirmationDecorator, int i10, Composer composer, int i11) {
        e(localThemeScope, orderConfirmationDecorator, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
