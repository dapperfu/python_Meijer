package hn;

import Ji.LocalThemeScope;
import P0.e;
import ak.AbstractC5607a;
import android.content.Context;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b5.C6197c;
import ck.C6408b;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.review.EntryDecorator;
import es.OrderDetailStatusDayDateTimeDecorator;
import gn.OrderDetailAddressDecorator;
import gn.OrderDetailContactNumberDecorator;
import gn.OrderDetailShopperInfoDecorator;
import j0.C14801J;
import j0.C14815g;
import j0.InterfaceC14800I;
import java.util.List;
import java.util.Locale;
import ji.C14898A;
import ji.C14900C;
import ji.j1;
import ji.q1;
import kotlin.C17988z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l5.C15372h;
import ni.E0;
import oi.C16088n;
import p1.C16190d;
import p1.C16193g;
import wo.C17843b;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aO\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0019\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u001d\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a%\u0010!\u001a\u00020\u0005*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Les/c;", "decorator", "", "k", "(LJi/M;Landroidx/compose/ui/Modifier;Les/c;Landroidx/compose/runtime/Composer;II)V", "Lgn/e;", "Lkotlin/Function0;", "onClickAddress", "g", "(LJi/M;Landroidx/compose/ui/Modifier;Lgn/e;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "statusIcon", "statusTextIcon", "Lak/a;", "formattedTotalItems", "Lhn/c;", "orderCartDecorator", "onClickViewItems", "o", "(LJi/M;Landroidx/compose/ui/Modifier;IILak/a;Lhn/c;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lgn/f;", "onClickPhoneNumber", "i", "(LJi/M;Landroidx/compose/ui/Modifier;Lgn/f;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lgn/l;", "onClickRateAndTip", "m", "(LJi/M;Landroidx/compose/ui/Modifier;Lgn/l;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "textValue", "q", "(LJi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: hn.S, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14520S {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hn.S$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f135795a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderDetailAddressDecorator f135796b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f135797c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.S$a$a, reason: collision with other inner class name */
        static final class C2148a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f135798a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f135799b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f135800c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hn.S$a$a$a, reason: collision with other inner class name */
            static final class C2149a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f135801a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f135802b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractC5607a f135803c;

                C2149a(LocalThemeScope localThemeScope, j1 j1Var, AbstractC5607a abstractC5607a) {
                    this.f135801a = localThemeScope;
                    this.f135802b = j1Var;
                    this.f135803c = abstractC5607a;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2051300286, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderAddress.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:173)");
                    }
                    LocalThemeScope localThemeScope = this.f135801a;
                    q1.Label labelY = q1.Label.y(this.f135802b.getLabels().getEnabledLabel(), null, this.f135801a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f135801a.getAdsTypography().getHeadings().getSeven(), null, 381, null);
                    String upperCase = C6408b.a(this.f135803c, composer, AbstractC5607a.f45514b).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    ri.j.h(localThemeScope, labelY, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            C2148a(LocalThemeScope localThemeScope, Function0<Unit> function0, AbstractC5607a abstractC5607a) {
                this.f135798a = localThemeScope;
                this.f135799b = function0;
                this.f135800c = abstractC5607a;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1743473675, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderAddress.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:166)");
                }
                E0.b(this.f135798a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.a(H1.h.p(0)), androidx.compose.foundation.layout.J.k(Modifier.INSTANCE, H1.h.p(24), 0.0f, 2, null), false, null, 831, null), this.f135799b, ComposableLambdaKt.c(2051300286, true, new C2149a(this.f135798a, Assemble, this.f135800c), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, OrderDetailAddressDecorator orderDetailAddressDecorator, Function0<Unit> function0) {
            this.f135795a = localThemeScope;
            this.f135796b = orderDetailAddressDecorator;
            this.f135797c = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(242433235, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderAddress.<anonymous> (PickupDetailsView.kt:138)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, 3, null), H1.h.p(f10));
            LocalThemeScope localThemeScope = this.f135795a;
            OrderDetailAddressDecorator orderDetailAddressDecorator = this.f135796b;
            Function0<Unit> function0 = this.f135797c;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
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
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            C17988z0.a(C16190d.c(orderDetailAddressDecorator.getIcon(), composer, 0), null, null, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 48, 4);
            q1.Label label = new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null)), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 382, null);
            AbstractC5607a title = orderDetailAddressDecorator.getTitle();
            int i11 = AbstractC5607a.f45514b;
            String strA = C6408b.a(title, composer, i11);
            int i12 = LocalThemeScope.f15770g;
            int i13 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.c(), companion2.l(), composer, 6);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyB2, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            AbstractC5607a actionText = orderDetailAddressDecorator.getActionText();
            composer.startReplaceGroup(1568421041);
            if (actionText != null) {
                Ji.Q.e(localThemeScope, C14898A.f139596a, ComposableLambdaKt.c(1743473675, true, new C2148a(localThemeScope, function0, actionText), composer, 54), composer, i12 | 384 | (C14898A.f139597b << 3));
            }
            composer.P();
            composer.v();
            composer.v();
            ri.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion, H1.h.p(40), 0.0f, 0.0f, 0.0f, 14, null)), localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 380, null), C6408b.a(orderDetailAddressDecorator.getSubtitle(), composer, i11), null, composer, i12 | (i13 << 3), 4);
            composer.v();
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
    /* renamed from: hn.S$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f135804a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderDetailContactNumberDecorator f135805b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f135806c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.S$b$a */
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f135807a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f135808b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f135809c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hn.S$b$a$a, reason: collision with other inner class name */
            static final class C2150a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f135810a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f135811b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractC5607a f135812c;

                C2150a(LocalThemeScope localThemeScope, j1 j1Var, AbstractC5607a abstractC5607a) {
                    this.f135810a = localThemeScope;
                    this.f135811b = j1Var;
                    this.f135812c = abstractC5607a;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1186800856, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderContactNumber.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:330)");
                    }
                    LocalThemeScope localThemeScope = this.f135810a;
                    q1.Label labelY = q1.Label.y(this.f135811b.getLabels().getEnabledLabel(), null, this.f135810a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f135810a.getAdsTypography().getHeadings().getSeven(), null, 381, null);
                    String upperCase = C6408b.a(this.f135812c, composer, AbstractC5607a.f45514b).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    ri.j.h(localThemeScope, labelY, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope, Function0<Unit> function0, AbstractC5607a abstractC5607a) {
                this.f135807a = localThemeScope;
                this.f135808b = function0;
                this.f135809c = abstractC5607a;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-244662283, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderContactNumber.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:323)");
                }
                E0.b(this.f135807a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.a(H1.h.p(0)), androidx.compose.foundation.layout.J.k(Modifier.INSTANCE, H1.h.p(24), 0.0f, 2, null), false, null, 831, null), this.f135808b, ComposableLambdaKt.c(-1186800856, true, new C2150a(this.f135807a, Assemble, this.f135809c), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b(LocalThemeScope localThemeScope, OrderDetailContactNumberDecorator orderDetailContactNumberDecorator, Function0<Unit> function0) {
            this.f135804a = localThemeScope;
            this.f135805b = orderDetailContactNumberDecorator;
            this.f135806c = function0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(837272765, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderContactNumber.<anonymous> (PickupDetailsView.kt:292)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, 3, null), H1.h.p(f10));
            LocalThemeScope localThemeScope = this.f135804a;
            OrderDetailContactNumberDecorator orderDetailContactNumberDecorator = this.f135805b;
            Function0<Unit> function0 = this.f135806c;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.c(), companion2.l(), composer, 6);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
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
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            C17988z0.a(C16190d.c(orderDetailContactNumberDecorator.getIcon(), composer, 0), null, null, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 48, 4);
            q1.Label label = new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null)), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 382, null);
            AbstractC5607a title = orderDetailContactNumberDecorator.getTitle();
            int i11 = AbstractC5607a.f45514b;
            String strA = C6408b.a(title, composer, i11);
            int i12 = LocalThemeScope.f15770g;
            int i13 = q1.Label.f140080j;
            ri.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            Modifier modifierH2 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.c(), companion2.l(), composer, 6);
            int iA3 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH2);
            Function0<InterfaceC5811g> function0A3 = companion3.a();
            if (composer.k() == null) {
                C5717f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A3);
            } else {
                composer.s();
            }
            Composer composerA3 = D1.a(composer);
            D1.c(composerA3, measurePolicyB2, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            AbstractC5607a actionText = orderDetailContactNumberDecorator.getActionText();
            composer.startReplaceGroup(236944670);
            if (actionText != null) {
                Ji.Q.e(localThemeScope, C14898A.f139596a, ComposableLambdaKt.c(-244662283, true, new a(localThemeScope, function0, actionText), composer, 54), composer, i12 | 384 | (C14898A.f139597b << 3));
            }
            composer.P();
            composer.v();
            composer.v();
            ri.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion, H1.h.p(40), 0.0f, 0.0f, 0.0f, 14, null)), localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 380, null), C6408b.a(orderDetailContactNumberDecorator.getSubtitle(), composer, i11), null, composer, i12 | (i13 << 3), 4);
            composer.v();
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
    /* renamed from: hn.S$c */
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ OrderDetailStatusDayDateTimeDecorator f135813a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f135814b;

        c(OrderDetailStatusDayDateTimeDecorator orderDetailStatusDayDateTimeDecorator, LocalThemeScope localThemeScope) {
            this.f135813a = orderDetailStatusDayDateTimeDecorator;
            this.f135814b = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            Modifier.Companion companion;
            LocalThemeScope localThemeScope;
            Composer composer2;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-96859250, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderPickupDate.<anonymous> (PickupDetailsView.kt:66)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), null, false, 3, null), H1.h.p(f10));
            OrderDetailStatusDayDateTimeDecorator orderDetailStatusDayDateTimeDecorator = this.f135813a;
            LocalThemeScope localThemeScope2 = this.f135814b;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion3.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion4.a();
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
            D1.c(composerA, measurePolicyA, companion4.e());
            D1.c(composerA, interfaceC5742sR, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C14815g c14815g = C14815g.f139108a;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion3.l(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion2);
            Function0<InterfaceC5811g> function0A2 = companion4.a();
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
            D1.c(composerA2, measurePolicyB, companion4.e());
            D1.c(composerA2, interfaceC5742sR2, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion4.f());
            C14801J c14801j = C14801J.f139030a;
            C17988z0.a(C16190d.c(orderDetailStatusDayDateTimeDecorator.getIcon(), composer, 0), null, null, localThemeScope2.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 48, 4);
            if (orderDetailStatusDayDateTimeDecorator.getIsRescheduled()) {
                composer.startReplaceGroup(1773709152);
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyG = C5662h.g(companion3.o(), false);
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM);
                Function0<InterfaceC5811g> function0A3 = companion4.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A3);
                } else {
                    composer.s();
                }
                Composer composerA3 = D1.a(composer);
                D1.c(composerA3, measurePolicyG, companion4.e());
                D1.c(composerA3, interfaceC5742sR3, companion4.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion4.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion4.f());
                C5664j c5664j = C5664j.f48612a;
                companion = companion2;
                ri.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.b.d(companion2, localThemeScope2.getAdsColors().getAdsColorSupportWarningBg().getColor(), null, 2, null), localThemeScope2.getAdsColors().getAdsColorSupportWarning(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getTwo(), null, 380, null), C16193g.c(com.meijer.mobile.meijer.Y.f99845Ua, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                localThemeScope = localThemeScope2;
                composer2 = composer;
                composer2.v();
                composer2.P();
            } else {
                composer.startReplaceGroup(1774293316);
                companion = companion2;
                ri.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.m(companion2, H1.h.p(f10), 0.0f, H1.h.p(6), 0.0f, 10, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 382, null), C6408b.a(orderDetailStatusDayDateTimeDecorator.getTitle(), composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                localThemeScope = localThemeScope2;
                composer2 = composer;
                composer2.P();
            }
            composer2.v();
            composer2.startReplaceGroup(190765975);
            if (orderDetailStatusDayDateTimeDecorator.getIsRescheduled()) {
                float f11 = 40;
                float f12 = 8;
                Modifier.Companion companion5 = companion;
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion5, H1.h.p(f11), 0.0f, H1.h.p(f12), 0.0f, 10, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null);
                AbstractC5607a title = orderDetailStatusDayDateTimeDecorator.getTitle();
                int i11 = AbstractC5607a.f45514b;
                String strA = C6408b.a(title, composer2, i11);
                int i12 = LocalThemeScope.f15770g;
                int i13 = q1.Label.f140080j;
                Composer composer3 = composer2;
                LocalThemeScope localThemeScope3 = localThemeScope;
                ri.j.h(localThemeScope3, label, strA, null, composer3, i12 | (i13 << 3), 4);
                companion = companion5;
                ri.j.h(localThemeScope3, new q1.Label(androidx.compose.foundation.layout.D.m(companion5, H1.h.p(f11), 0.0f, H1.h.p(f12), 0.0f, 10, null), null, null, null, 0, false, 0, localThemeScope3.getAdsTypography().getBody().getOne(), null, 382, null), C6408b.a(orderDetailStatusDayDateTimeDecorator.getOriginalPickUp(), composer3, i11), null, composer3, i12 | (i13 << 3), 4);
                localThemeScope = localThemeScope3;
                composer2 = composer3;
            }
            composer2.P();
            AbstractC5607a earlyDeliveryPossible = orderDetailStatusDayDateTimeDecorator.getEarlyDeliveryPossible();
            composer2.startReplaceGroup(190788652);
            if (earlyDeliveryPossible != null) {
                ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion, H1.h.p(40), 0.0f, H1.h.p(8), 0.0f, 10, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null), C6408b.a(earlyDeliveryPossible, composer2, AbstractC5607a.f45514b), null, composer2, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
            }
            composer.P();
            composer.v();
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
    /* renamed from: hn.S$d */
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ OrderDetailShopperInfoDecorator f135815a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f135816b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f135817c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hn.S$d$a */
        static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f135818a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ OrderDetailShopperInfoDecorator f135819b;

            a(LocalThemeScope localThemeScope, OrderDetailShopperInfoDecorator orderDetailShopperInfoDecorator) {
                this.f135818a = localThemeScope;
                this.f135819b = orderDetailShopperInfoDecorator;
            }

            public final void a(InterfaceC14800I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(793308637, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderShopperInfo.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:430)");
                }
                LocalThemeScope localThemeScope = this.f135818a;
                OrderDetailShopperInfoDecorator.Companion.RateInfo rateInfo = this.f135819b.getRateInfo();
                int rating = rateInfo != null ? rateInfo.getRating() : 0;
                int i11 = LocalThemeScope.f15770g;
                yr.h0.c(localThemeScope, null, rating, 0.0f, null, null, null, null, 0, composer, i11, 253);
                ri.j.h(this.f135818a, new q1.Label(null, null, null, null, 0, false, 0, this.f135818a.getAdsTypography().getBodyCompact().getOne(), null, 383, null), C16193g.d(com.meijer.mobile.meijer.Y.f99790Rc, new Object[]{Double.valueOf(this.f135819b.getRateInfo() != null ? r5.getRating() : 0)}, composer, 0), null, composer, i11 | (q1.Label.f140080j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                a(interfaceC14800I, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.S$d$b */
        static final class b implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f135820a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f135821b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f135822c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hn.S$d$b$a */
            static final class a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f135823a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f135824b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f135825c;

                a(LocalThemeScope localThemeScope, j1 j1Var, String str) {
                    this.f135823a = localThemeScope;
                    this.f135824b = j1Var;
                    this.f135825c = str;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(31342128, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderShopperInfo.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:466)");
                    }
                    ri.j.h(this.f135823a, this.f135824b.getLabels().getEnabledLabel(), this.f135825c, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            b(LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
                this.f135820a = localThemeScope;
                this.f135821b = function0;
                this.f135822c = str;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-140932477, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderShopperInfo.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:460)");
                }
                E0.b(this.f135820a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, H1.h.p(40), H1.h.p(12), 0.0f, 0.0f, 12, null), false, null, 895, null), this.f135821b, ComposableLambdaKt.c(31342128, true, new a(this.f135820a, Assemble, this.f135822c), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        d(OrderDetailShopperInfoDecorator orderDetailShopperInfoDecorator, LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f135815a = orderDetailShopperInfoDecorator;
            this.f135816b = localThemeScope;
            this.f135817c = function0;
        }

        public final void a(Composer composer, int i10) {
            LocalThemeScope localThemeScope;
            Modifier.Companion companion;
            int i11;
            Function0<Unit> function0;
            boolean z10;
            Composer composer2;
            int i12;
            int i13;
            OrderDetailShopperInfoDecorator orderDetailShopperInfoDecorator;
            int i14;
            int i15;
            OrderDetailShopperInfoDecorator orderDetailShopperInfoDecorator2;
            int i16;
            int i17;
            AbstractC5607a tipDate;
            AbstractC5607a authCode;
            AbstractC5607a tipId;
            AbstractC5607a tipAmount;
            AbstractC5607a description;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-404787499, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderShopperInfo.<anonymous> (PickupDetailsView.kt:364)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null), null, false, 3, null), H1.h.p(f10));
            OrderDetailShopperInfoDecorator orderDetailShopperInfoDecorator3 = this.f135815a;
            LocalThemeScope localThemeScope2 = this.f135816b;
            Function0<Unit> function02 = this.f135817c;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion3.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5811g.Companion companion4 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion4.a();
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
            D1.c(composerA, measurePolicyA, companion4.e());
            D1.c(composerA, interfaceC5742sR, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C14815g c14815g = C14815g.f139108a;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion3.l(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
            Function0<InterfaceC5811g> function0A2 = companion4.a();
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
            D1.c(composerA2, measurePolicyB, companion4.e());
            D1.c(composerA2, interfaceC5742sR2, companion4.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion4.f());
            C14801J c14801j = C14801J.f139030a;
            C17988z0.a(C16190d.c(orderDetailShopperInfoDecorator3.getShopperInfo().getShopperImage(), composer, 0), null, FullStoryAnnotationsKt.fsMask(companion2), localThemeScope2.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 48, 0);
            if (orderDetailShopperInfoDecorator3.getShopperInfo().getShopperName().length() == 0) {
                composer.startReplaceGroup(-1136060732);
                companion = companion2;
                function0 = function02;
                z10 = false;
                i11 = 3;
                localThemeScope = localThemeScope2;
                ri.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion2, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null)), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 382, null), C6408b.a(orderDetailShopperInfoDecorator3.getDescription(), composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                composer2 = composer;
                composer2.P();
            } else {
                localThemeScope = localThemeScope2;
                composer.startReplaceGroup(-1135620191);
                companion = companion2;
                i11 = 3;
                function0 = function02;
                z10 = false;
                ri.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion2, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null)), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 382, null), C6408b.a(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100426xi, orderDetailShopperInfoDecorator3.getShopperInfo().getShopperName()), composer, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                composer2 = composer;
                composer2.P();
            }
            composer2.v();
            composer2.startReplaceGroup(-93183350);
            if (!orderDetailShopperInfoDecorator3.getDescriptionVisibility() || orderDetailShopperInfoDecorator3.getShopperInfo().getShopperName().length() <= 0 || (description = orderDetailShopperInfoDecorator3.getDescription()) == null) {
                i12 = 40;
                i13 = i11;
                orderDetailShopperInfoDecorator = orderDetailShopperInfoDecorator3;
            } else {
                Modifier.Companion companion5 = companion;
                i13 = i11;
                companion = companion5;
                i12 = 40;
                function0 = function0;
                orderDetailShopperInfoDecorator = orderDetailShopperInfoDecorator3;
                ri.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion5, H1.h.p(40), 0.0f, 0.0f, 0.0f, 14, null)), localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 380, null), C6408b.a(description, composer2, AbstractC5607a.f45514b), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << i13), 4);
                composer2 = composer;
            }
            composer2.P();
            composer2.startReplaceGroup(-93162183);
            if (orderDetailShopperInfoDecorator.getRatingVisibility()) {
                i14 = 0;
                float f11 = 8;
                C16088n.i(localThemeScope, new q1.Row(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, i13, null), H1.h.p(i12), H1.h.p(f11), 0.0f, H1.h.p(f11), 4, null), null, companion3.i(), 2, null), ComposableLambdaKt.c(793308637, true, new a(localThemeScope, orderDetailShopperInfoDecorator), composer2, 54), composer2, LocalThemeScope.f15770g | 384 | (q1.Row.f140137d << i13));
            } else {
                i14 = 0;
            }
            composer2.P();
            composer2.startReplaceGroup(-93133092);
            if (orderDetailShopperInfoDecorator.getIsTipped() || !orderDetailShopperInfoDecorator.getIsRated()) {
                i15 = 8;
                orderDetailShopperInfoDecorator2 = orderDetailShopperInfoDecorator;
                i16 = 54;
                i17 = i14;
            } else {
                int i18 = i14;
                Modifier.Companion companion6 = companion;
                orderDetailShopperInfoDecorator2 = orderDetailShopperInfoDecorator;
                i17 = i18;
                companion = companion6;
                i16 = 54;
                function0 = function0;
                i15 = 8;
                ri.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion6, H1.h.p(i12), 0.0f, 0.0f, 0.0f, 14, null), localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 380, null), C16193g.c(com.meijer.mobile.meijer.Y.f100385vh, composer2, i17), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                composer2 = composer;
            }
            composer2.P();
            composer2.startReplaceGroup(-93118270);
            if (orderDetailShopperInfoDecorator2.getButtonVisibility()) {
                Ji.Q.e(localThemeScope, C14900C.f139605a, ComposableLambdaKt.c(-140932477, true, new b(localThemeScope, function0, C16193g.c((!orderDetailShopperInfoDecorator2.getIsTipped() || orderDetailShopperInfoDecorator2.getIsRated()) ? (orderDetailShopperInfoDecorator2.getIsTipped() || !orderDetailShopperInfoDecorator2.getIsRated()) ? com.meijer.mobile.meijer.Y.f99771Qc : C17843b.f166239B : C17843b.f166265x, composer2, i17)), composer2, i16), composer2, LocalThemeScope.f15770g | 384 | (C14900C.f139606b << 3));
            }
            composer2.P();
            composer2.startReplaceGroup(-93086192);
            if (orderDetailShopperInfoDecorator2.getTipInfoVisibility()) {
                Modifier.Companion companion7 = companion;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion7, H1.h.p(40), H1.h.p(i15), 0.0f, 0.0f, 12, null);
                MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.g(), companion3.l(), composer2, i17);
                int iA3 = C5717f.a(composer2, i17);
                InterfaceC5742s interfaceC5742sR3 = composer2.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierM);
                Function0<InterfaceC5811g> function0A3 = companion4.a();
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
                D1.c(composerA3, measurePolicyB2, companion4.e());
                D1.c(composerA3, interfaceC5742sR3, companion4.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion4.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion4.f());
                MeasurePolicy measurePolicyA2 = C5665k.a(c5658d.h(), companion3.k(), composer2, i17);
                int iA4 = C5717f.a(composer2, i17);
                InterfaceC5742s interfaceC5742sR4 = composer2.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer2, companion7);
                Function0<InterfaceC5811g> function0A4 = companion4.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A4);
                } else {
                    composer2.s();
                }
                Composer composerA4 = D1.a(composer2);
                D1.c(composerA4, measurePolicyA2, companion4.e());
                D1.c(composerA4, interfaceC5742sR4, companion4.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion4.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion4.f());
                composer2.startReplaceGroup(-1595027508);
                if (orderDetailShopperInfoDecorator2.getTipAmountVisibility()) {
                    C14520S.q(localThemeScope, C16193g.c(com.meijer.mobile.meijer.Y.f100145jh, composer2, i17), null, composer2, LocalThemeScope.f15770g, 2);
                }
                composer2.P();
                String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99685M2, composer2, i17);
                int i19 = LocalThemeScope.f15770g;
                C14520S.q(localThemeScope, strC, null, composer2, i19, 2);
                C14520S.q(localThemeScope, C16193g.c(com.meijer.mobile.meijer.Y.f99929Z, composer2, i17), null, composer2, i19, 2);
                C14520S.q(localThemeScope, C16193g.c(com.meijer.mobile.meijer.Y.f100165kh, composer2, i17), null, composer2, i19, 2);
                composer2.v();
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion7, H1.h.p(24), 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyA3 = C5665k.a(c5658d.h(), companion3.k(), composer2, i17);
                int iA5 = C5717f.a(composer2, i17);
                InterfaceC5742s interfaceC5742sR5 = composer2.r();
                Modifier modifierE5 = androidx.compose.ui.b.e(composer2, modifierM2);
                Function0<InterfaceC5811g> function0A5 = companion4.a();
                if (composer2.k() == null) {
                    C5717f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A5);
                } else {
                    composer2.s();
                }
                Composer composerA5 = D1.a(composer2);
                D1.c(composerA5, measurePolicyA3, companion4.e());
                D1.c(composerA5, interfaceC5742sR5, companion4.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B5 = companion4.b();
                if (composerA5.getInserting() || !Intrinsics.e(composerA5.B(), Integer.valueOf(iA5))) {
                    composerA5.t(Integer.valueOf(iA5));
                    composerA5.n(Integer.valueOf(iA5), function2B5);
                }
                D1.c(composerA5, modifierE5, companion4.f());
                composer2.startReplaceGroup(1642874077);
                if (orderDetailShopperInfoDecorator2.getTipAmountVisibility()) {
                    OrderDetailShopperInfoDecorator.Companion.TipInfo tipInfo = orderDetailShopperInfoDecorator2.getTipInfo();
                    if (tipInfo == null || (tipAmount = tipInfo.getTipAmount()) == null) {
                        tipAmount = orderDetailShopperInfoDecorator2.getRateAndTipInfo().getTipAmount();
                    }
                    C14520S.q(localThemeScope, C6408b.a(tipAmount, composer2, AbstractC5607a.f45514b), FullStoryAnnotationsKt.fsMask(companion7), composer2, i19, 0);
                }
                composer2.P();
                OrderDetailShopperInfoDecorator.Companion.TipInfo tipInfo2 = orderDetailShopperInfoDecorator2.getTipInfo();
                if (tipInfo2 == null || (tipDate = tipInfo2.getTipDate()) == null) {
                    tipDate = orderDetailShopperInfoDecorator2.getRateAndTipInfo().getTipDate();
                }
                int i20 = AbstractC5607a.f45514b;
                C14520S.q(localThemeScope, C6408b.a(tipDate, composer2, i20), FullStoryAnnotationsKt.fsMask(companion7), composer2, i19, 0);
                OrderDetailShopperInfoDecorator.Companion.TipInfo tipInfo3 = orderDetailShopperInfoDecorator2.getTipInfo();
                if (tipInfo3 == null || (authCode = tipInfo3.getAuthCode()) == null) {
                    authCode = orderDetailShopperInfoDecorator2.getRateAndTipInfo().getAuthCode();
                }
                C14520S.q(localThemeScope, C6408b.a(authCode, composer2, i20), FullStoryAnnotationsKt.fsMask(companion7), composer2, i19, 0);
                OrderDetailShopperInfoDecorator.Companion.TipInfo tipInfo4 = orderDetailShopperInfoDecorator2.getTipInfo();
                if (tipInfo4 == null || (tipId = tipInfo4.getTipId()) == null) {
                    tipId = orderDetailShopperInfoDecorator2.getRateAndTipInfo().getTipId();
                }
                C14520S.q(localThemeScope, C6408b.a(tipId, composer2, i20), FullStoryAnnotationsKt.fsMask(companion7), composer2, i19, 0);
                composer.v();
                composer.v();
            }
            composer.P();
            composer.v();
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
    /* renamed from: hn.S$e */
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f135826a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f135827b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f135828c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f135829d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f135830e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ OrderDetailCartItem f135831f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: hn.S$e$a */
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f135832a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f135833b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f135834c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hn.S$e$a$a, reason: collision with other inner class name */
            static final class C2151a implements Function3<InterfaceC14800I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f135835a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f135836b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f135837c;

                C2151a(LocalThemeScope localThemeScope, j1 j1Var, int i10) {
                    this.f135835a = localThemeScope;
                    this.f135836b = j1Var;
                    this.f135837c = i10;
                }

                public final void a(InterfaceC14800I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(256186556, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderedItems.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:241)");
                    }
                    LocalThemeScope localThemeScope = this.f135835a;
                    q1.Label labelY = q1.Label.y(this.f135836b.getLabels().getEnabledLabel(), null, this.f135835a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f135835a.getAdsTypography().getHeadings().getSeven(), null, 381, null);
                    String upperCase = C16193g.c(this.f135837c, composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    ri.j.h(localThemeScope, labelY, upperCase, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14800I interfaceC14800I, Composer composer, Integer num) {
                    a(interfaceC14800I, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope, Function0<Unit> function0, int i10) {
                this.f135832a = localThemeScope;
                this.f135833b = function0;
                this.f135834c = i10;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-939441137, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderedItems.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:234)");
                }
                E0.b(this.f135832a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.a(H1.h.p(0)), androidx.compose.foundation.layout.J.k(Modifier.INSTANCE, H1.h.p(24), 0.0f, 2, null), false, null, 831, null), this.f135833b, ComposableLambdaKt.c(256186556, true, new C2151a(this.f135832a, Assemble, this.f135834c), composer, 54), composer, LocalThemeScope.f15770g | 3072 | (q1.d.StandardButton.f139974k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        e(LocalThemeScope localThemeScope, int i10, AbstractC5607a abstractC5607a, Function0<Unit> function0, int i11, OrderDetailCartItem orderDetailCartItem) {
            this.f135826a = localThemeScope;
            this.f135827b = i10;
            this.f135828c = abstractC5607a;
            this.f135829d = function0;
            this.f135830e = i11;
            this.f135831f = orderDetailCartItem;
        }

        public final void a(Composer composer, int i10) {
            LocalThemeScope localThemeScope;
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1612089325, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderedItems.<anonymous> (PickupDetailsView.kt:209)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, 3, null), H1.h.p(f10));
            LocalThemeScope localThemeScope2 = this.f135826a;
            int i11 = this.f135827b;
            AbstractC5607a abstractC5607a = this.f135828c;
            Function0<Unit> function0 = this.f135829d;
            int i12 = this.f135830e;
            OrderDetailCartItem orderDetailCartItem = this.f135831f;
            C5658d c5658d = C5658d.f48555a;
            C5658d.m mVarH = c5658d.h();
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(mVarH, companion2.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
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
            D1.c(composerA, measurePolicyA, companion3.e());
            D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
            int iA2 = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
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
            D1.c(composerA2, measurePolicyB, companion3.e());
            D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion3.f());
            C14801J c14801j = C14801J.f139030a;
            C17988z0.a(C16190d.c(i11, composer, 0), null, null, localThemeScope2.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 48, 4);
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 382, null);
            String strA = C6408b.a(abstractC5607a, composer, AbstractC5607a.f45514b);
            int i13 = LocalThemeScope.f15770g;
            Composer composer2 = composer;
            LocalThemeScope localThemeScope3 = localThemeScope2;
            ri.j.h(localThemeScope3, label, strA, null, composer2, i13 | (q1.Label.f140080j << 3), 4);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5658d.c(), companion2.l(), composer2, 6);
            int iA3 = C5717f.a(composer2, 0);
            InterfaceC5742s interfaceC5742sR3 = composer2.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierH);
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
            D1.c(composerA3, measurePolicyB2, companion3.e());
            D1.c(composerA3, interfaceC5742sR3, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            Ji.Q.e(localThemeScope3, C14898A.f139596a, ComposableLambdaKt.c(-939441137, true, new a(localThemeScope3, function0, i12), composer2, 54), composer2, i13 | 384 | (C14898A.f139597b << 3));
            composer2.v();
            composer2.v();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), H1.h.p(40), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5658d.f(), companion2.l(), composer2, 6);
            int iA4 = C5717f.a(composer2, 0);
            InterfaceC5742s interfaceC5742sR4 = composer2.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer2, modifierM);
            Function0<InterfaceC5811g> function0A4 = companion3.a();
            if (composer2.k() == null) {
                C5717f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A4);
            } else {
                composer2.s();
            }
            Composer composerA4 = D1.a(composer2);
            D1.c(composerA4, measurePolicyB3, companion3.e());
            D1.c(composerA4, interfaceC5742sR4, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B4 = companion3.b();
            if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                composerA4.t(Integer.valueOf(iA4));
                composerA4.n(Integer.valueOf(iA4), function2B4);
            }
            D1.c(composerA4, modifierE4, companion3.f());
            List<EntryDecorator> listB = orderDetailCartItem.b();
            composer2.startReplaceGroup(1322928593);
            if (listB == null) {
                localThemeScope = localThemeScope3;
            } else {
                for (EntryDecorator entryDecorator : listB) {
                    C15372h.a aVar = new C15372h.a((Context) composer2.o(AndroidCompositionLocals_androidKt.g()));
                    String imageUrl = entryDecorator.getImageUrl();
                    if (imageUrl == null) {
                        imageUrl = "";
                    }
                    C6197c.d(aVar.f(imageUrl).e(true).c(), entryDecorator.getName(), Z4.a.a((Context) composer2.o(AndroidCompositionLocals_androidKt.g())), androidx.compose.foundation.layout.J.v(Modifier.INSTANCE, H1.h.p(64)), C16190d.c(Bj.i.f2681O1, composer2, 0), C16190d.c(Bj.i.f2681O1, composer2, 0), null, null, null, null, null, InterfaceC5784k.INSTANCE.e(), 0.0f, null, 0, false, null, composer, 3072, 48, 128960);
                    composer2 = composer;
                    localThemeScope3 = localThemeScope3;
                }
                localThemeScope = localThemeScope3;
                Unit unit = Unit.f142422a;
            }
            composer.P();
            q1.Label label2 = new q1.Label(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, H1.h.p(24), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null);
            String extraItemCount = orderDetailCartItem.getExtraItemCount();
            ri.j.h(localThemeScope, label2, extraItemCount == null ? "" : extraItemCount, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
            composer.v();
            composer.v();
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final gn.OrderDetailAddressDecorator r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.C14520S.g(Ji.M, androidx.compose.ui.Modifier, gn.e, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, OrderDetailAddressDecorator orderDetailAddressDecorator, Function0 function0, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, orderDetailAddressDecorator, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final gn.OrderDetailContactNumberDecorator r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.C14520S.i(Ji.M, androidx.compose.ui.Modifier, gn.f, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Modifier modifier, OrderDetailContactNumberDecorator orderDetailContactNumberDecorator, Function0 function0, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, modifier, orderDetailContactNumberDecorator, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ji.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final es.OrderDetailStatusDayDateTimeDecorator r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.C14520S.k(Ji.M, androidx.compose.ui.Modifier, es.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Modifier modifier, OrderDetailStatusDayDateTimeDecorator orderDetailStatusDayDateTimeDecorator, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, modifier, orderDetailStatusDayDateTimeDecorator, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final gn.OrderDetailShopperInfoDecorator r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.C14520S.m(Ji.M, androidx.compose.ui.Modifier, gn.l, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, OrderDetailShopperInfoDecorator orderDetailShopperInfoDecorator, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, orderDetailShopperInfoDecorator, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Ji.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final int r24, final int r25, final ak.AbstractC5607a r26, final hn.OrderDetailCartItem r27, final kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.C14520S.o(Ji.M, androidx.compose.ui.Modifier, int, int, ak.a, hn.c, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, AbstractC5607a abstractC5607a, OrderDetailCartItem orderDetailCartItem, Function0 function0, int i12, int i13, Composer composer, int i14) {
        o(localThemeScope, modifier, i10, i11, abstractC5607a, orderDetailCartItem, function0, composer, J0.a(i12 | 1), i13);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final Ji.LocalThemeScope r20, final java.lang.String r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hn.C14520S.q(Ji.M, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, str, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }
}
