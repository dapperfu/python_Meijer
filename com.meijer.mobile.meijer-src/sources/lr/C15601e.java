package lr;

import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import com.meijer.mobile.subscription.ux.subscription.AbstractC13119k;
import com.meijer.mobile.subscription.ux.subscription.SubscriptionViewState;
import cr.SubscriptionDetails;
import defpackage.p;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14902f;
import jr.j;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kr.C15410d;
import lr.C15601e;
import p1.C16338g;
import pr.AbstractC16490a;
import pr.SubscriptionSummaryDecorator;
import yr.N;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a_\u0010\u000e\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0010\u001a\u00020\t*\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0013\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0019²\u0006\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00158\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\u00178\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lcom/meijer/mobile/subscription/ux/subscription/I;", "viewState", "Lpr/c;", "subscriptionSummary", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "", "onAction", "Lkotlin/Function0;", "onShowSubscriptionInfoBottomSheet", "onExit", "e", "(LKi/M;Lcom/meijer/mobile/subscription/ux/subscription/I;Lpr/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "i", "(LKi/M;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "onPrimaryClick", "g", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "lastAction", "", "isCancelSubscriptionLoading", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: lr.e, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15601e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lr.e$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150162a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13119k, Unit> f150163b;

        /* JADX WARN: Multi-variable type inference failed */
        a(LocalThemeScope localThemeScope, Function1<? super AbstractC13119k, Unit> function1) {
            this.f150162a = localThemeScope;
            this.f150163b = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1606501999, i10, -1, "com.meijer.mobile.subscription.ux.cancel.CancelSubscriptionContent.<anonymous> (CancelSubscriptionContent.kt:67)");
            }
            C15601e.i(this.f150162a, this.f150163b, composer, LocalThemeScope.f17314g);
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
    /* renamed from: lr.e$b */
    static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ SubscriptionViewState f150164a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150165b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SubscriptionSummaryDecorator f150166c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f150167d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<AbstractC13119k, Unit> f150168e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f150169f;

        /* JADX WARN: Multi-variable type inference failed */
        b(SubscriptionViewState subscriptionViewState, LocalThemeScope localThemeScope, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function0<Unit> function0, Function1<? super AbstractC13119k, Unit> function1, Function0<Unit> function02) {
            this.f150164a = subscriptionViewState;
            this.f150165b = localThemeScope;
            this.f150166c = subscriptionSummaryDecorator;
            this.f150167d = function0;
            this.f150168e = function1;
            this.f150169f = function02;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(AbstractC16490a it) {
            Intrinsics.j(it, "it");
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(Function1 function1) {
            function1.invoke(AbstractC13119k.m.f120030a);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(SubscriptionSummaryDecorator subscriptionSummaryDecorator, Function1 function1) {
            SubscriptionDetails subscriptionDetails;
            if (subscriptionSummaryDecorator == null || (subscriptionDetails = subscriptionSummaryDecorator.getSubscriptionDetails()) == null) {
                qw.a.INSTANCE.d("subscriptionDetails is null in onPrimaryClick", new Object[0]);
            } else {
                function1.invoke(new AbstractC13119k.CancelAndNavigateToPDP(subscriptionDetails));
            }
            return Unit.f143329a;
        }

        public final void d(InterfaceC14882C paddingValues, Composer composer, int i10) {
            int i11;
            SubscriptionSummaryDecorator subscriptionSummaryDecorator;
            LocalThemeScope localThemeScope;
            Composer composer2 = composer;
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer2.V(paddingValues) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-862523830, i11, -1, "com.meijer.mobile.subscription.ux.cancel.CancelSubscriptionContent.<anonymous> (CancelSubscriptionContent.kt:73)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = J.f(companion, 0.0f, 1, null);
            SubscriptionViewState subscriptionViewState = this.f150164a;
            LocalThemeScope localThemeScope2 = this.f150165b;
            SubscriptionSummaryDecorator subscriptionSummaryDecorator2 = this.f150166c;
            Function0<Unit> function0 = this.f150167d;
            final Function1<AbstractC13119k, Unit> function1 = this.f150168e;
            Function0<Unit> function02 = this.f150169f;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR = composer2.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer2, modifierF);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
                composer2.startReplaceGroup(1427136837);
                N.b(localThemeScope2, null, composer2, LocalThemeScope.f17314g, 1);
                composer2.P();
            } else {
                composer2.startReplaceGroup(1427242268);
                Modifier modifierD = J.D(J.h(D.h(companion, paddingValues), 0.0f, 1, null), null, false, 3, null);
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), companion2.k(), composer2, 0);
                int iA2 = C5859f.a(composer2, 0);
                InterfaceC5884s interfaceC5884sR2 = composer2.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer2, modifierD);
                Function0<InterfaceC5953g> function0A2 = companion3.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A2);
                } else {
                    composer2.s();
                }
                Composer composerA2 = D1.a(composer2);
                D1.c(composerA2, measurePolicyA, companion3.e());
                D1.c(composerA2, interfaceC5884sR2, companion3.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion3.f());
                C14903g c14903g = C14903g.f139698a;
                composer2.startReplaceGroup(508135087);
                if (subscriptionSummaryDecorator2 != null) {
                    composer2.startReplaceGroup(1849434622);
                    Object objB = composer2.B();
                    if (objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: lr.f
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return C15601e.b.e((AbstractC16490a) obj);
                            }
                        };
                        composer2.t(objB);
                    }
                    composer2.P();
                    localThemeScope = localThemeScope2;
                    subscriptionSummaryDecorator = subscriptionSummaryDecorator2;
                    p.f(localThemeScope, subscriptionSummaryDecorator, null, function0, (Function1) objB, composer, LocalThemeScope.f17314g | 24576, 2);
                    composer2 = composer;
                } else {
                    subscriptionSummaryDecorator = subscriptionSummaryDecorator2;
                    localThemeScope = localThemeScope2;
                }
                composer2.P();
                String strC = C16338g.c(C15410d.f148821z0, composer2, 0);
                Modifier modifierM = D.m(companion, localThemeScope.getAdsSpacing().getFive().getDp(), 0.0f, 0.0f, 0.0f, 14, null);
                composer2.startReplaceGroup(5004770);
                boolean zV = composer2.V(function1);
                Object objB2 = composer2.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: lr.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C15601e.b.f(function1);
                        }
                    };
                    composer2.t(objB2);
                }
                composer2.P();
                int i12 = LocalThemeScope.f17314g;
                final SubscriptionSummaryDecorator subscriptionSummaryDecorator3 = subscriptionSummaryDecorator;
                j.b(localThemeScope, strC, modifierM, (Function0) objB2, composer2, i12, 0);
                LocalThemeScope localThemeScope3 = localThemeScope;
                C14890K.a(InterfaceC14902f.b(c14903g, companion, 1.0f, false, 2, null), composer2, 0);
                C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(subscriptionSummaryDecorator3) | composer.V(function1);
                Object objB3 = composer.B();
                if (zD || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: lr.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C15601e.b.g(subscriptionSummaryDecorator3, function1);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C15601e.g(localThemeScope3, null, (Function0) objB3, function02, composer, i12, 1);
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
            d(interfaceC14882C, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lr.e$c */
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f150170a;

        c(LocalThemeScope localThemeScope) {
            this.f150170a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1565486808, i10, -1, "com.meijer.mobile.subscription.ux.cancel.SubscriptionToolbar.<anonymous> (CancelSubscriptionContent.kt:124)");
            }
            Dr.g.g(this.f150170a, C16338g.c(C15410d.f148819y0, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final Ki.LocalThemeScope r36, final com.meijer.mobile.subscription.ux.subscription.SubscriptionViewState r37, final pr.SubscriptionSummaryDecorator r38, androidx.compose.ui.Modifier r39, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.subscription.ux.subscription.AbstractC13119k, kotlin.Unit> r40, final kotlin.jvm.functions.Function0<kotlin.Unit> r41, final kotlin.jvm.functions.Function0<kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.C15601e.e(Ki.M, com.meijer.mobile.subscription.ux.subscription.I, pr.c, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(LocalThemeScope localThemeScope, SubscriptionViewState subscriptionViewState, SubscriptionSummaryDecorator subscriptionSummaryDecorator, Modifier modifier, Function1 function1, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        e(localThemeScope, subscriptionViewState, subscriptionSummaryDecorator, modifier, function1, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final kotlin.jvm.functions.Function0<kotlin.Unit> r19, final kotlin.jvm.functions.Function0<kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lr.C15601e.g(Ki.M, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, function0, function02, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void i(final LocalThemeScope localThemeScope, final Function1<? super AbstractC13119k, Unit> onAction, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(onAction, "onAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(2045045864);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(onAction) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2045045864, i11, -1, "com.meijer.mobile.subscription.ux.cancel.SubscriptionToolbar (CancelSubscriptionContent.kt:121)");
            }
            AbstractC6392a abstractC6392aD = AbstractC6392a.INSTANCE.d(C15410d.f148782g, new Object[0]);
            boolean z10 = false;
            C.f.o oVar = C.f.o.f17066e;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1565486808, true, new c(localThemeScope), composerStartRestartGroup, 54);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if ((i11 & 112) == 32) {
                z10 = true;
            }
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: lr.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C15601e.j(onAction);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, oVar, 0.0f, false, abstractC6392aD, composerStartRestartGroup, LocalThemeScope.f17314g | 24576 | (i11 & 14) | (C.f.o.f17067f << 18) | (AbstractC6392a.f60445b << 27), 199);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: lr.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C15601e.k(localThemeScope, onAction, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function1 function1) {
        function1.invoke(AbstractC13119k.f.f120023a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Function1 function1, int i10, Composer composer, int i11) {
        i(localThemeScope, function1, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
