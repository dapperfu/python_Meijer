package in;

import Ki.LocalThemeScope;
import P0.e;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bk.AbstractC6392a;
import c5.C6484c;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.review.EntryDecorator;
import dk.C13698b;
import es.OrderDetailStatusDayDateTimeDecorator;
import hn.OrderDetailAddressDecorator;
import hn.OrderDetailContactNumberDecorator;
import hn.OrderDetailShopperInfoDecorator;
import j0.C14889J;
import j0.C14903g;
import j0.InterfaceC14888I;
import java.util.List;
import java.util.Locale;
import ki.C15132A;
import ki.C15134C;
import ki.j1;
import ki.q1;
import kotlin.C18054z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import oi.E0;
import p1.C16335d;
import p1.C16338g;
import pi.C16453n;
import wo.C17905b;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u000b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aO\u0010\u0015\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0019\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u001d\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a%\u0010!\u001a\u00020\u0005*\u00020\u00002\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Les/c;", "decorator", "", "k", "(LKi/M;Landroidx/compose/ui/Modifier;Les/c;Landroidx/compose/runtime/Composer;II)V", "Lhn/e;", "Lkotlin/Function0;", "onClickAddress", "g", "(LKi/M;Landroidx/compose/ui/Modifier;Lhn/e;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "statusIcon", "statusTextIcon", "Lbk/a;", "formattedTotalItems", "Lin/c;", "orderCartDecorator", "onClickViewItems", "o", "(LKi/M;Landroidx/compose/ui/Modifier;IILbk/a;Lin/c;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lhn/f;", "onClickPhoneNumber", "i", "(LKi/M;Landroidx/compose/ui/Modifier;Lhn/f;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lhn/l;", "onClickRateAndTip", "m", "(LKi/M;Landroidx/compose/ui/Modifier;Lhn/l;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "textValue", "q", "(LKi/M;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: in.S, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C14800S {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: in.S$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138435a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderDetailAddressDecorator f138436b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138437c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: in.S$a$a, reason: collision with other inner class name */
        static final class C2191a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138438a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f138439b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f138440c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: in.S$a$a$a, reason: collision with other inner class name */
            static final class C2192a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f138441a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f138442b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractC6392a f138443c;

                C2192a(LocalThemeScope localThemeScope, j1 j1Var, AbstractC6392a abstractC6392a) {
                    this.f138441a = localThemeScope;
                    this.f138442b = j1Var;
                    this.f138443c = abstractC6392a;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2051300286, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderAddress.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:173)");
                    }
                    LocalThemeScope localThemeScope = this.f138441a;
                    q1.Label labelY = q1.Label.y(this.f138442b.getLabels().getEnabledLabel(), null, this.f138441a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f138441a.getAdsTypography().getHeadings().getSeven(), null, 381, null);
                    String upperCase = C13698b.a(this.f138443c, composer, AbstractC6392a.f60445b).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    si.j.h(localThemeScope, labelY, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            C2191a(LocalThemeScope localThemeScope, Function0<Unit> function0, AbstractC6392a abstractC6392a) {
                this.f138438a = localThemeScope;
                this.f138439b = function0;
                this.f138440c = abstractC6392a;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(1743473675, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderAddress.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:166)");
                }
                E0.b(this.f138438a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.a(H1.h.p(0)), androidx.compose.foundation.layout.J.k(Modifier.INSTANCE, H1.h.p(24), 0.0f, 2, null), false, null, 831, null), this.f138439b, ComposableLambdaKt.c(2051300286, true, new C2192a(this.f138438a, Assemble, this.f138440c), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, OrderDetailAddressDecorator orderDetailAddressDecorator, Function0<Unit> function0) {
            this.f138435a = localThemeScope;
            this.f138436b = orderDetailAddressDecorator;
            this.f138437c = function0;
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
            LocalThemeScope localThemeScope = this.f138435a;
            OrderDetailAddressDecorator orderDetailAddressDecorator = this.f138436b;
            Function0<Unit> function0 = this.f138437c;
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
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
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
            C18054z0.a(C16335d.c(orderDetailAddressDecorator.getIcon(), composer, 0), null, null, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 48, 4);
            q1.Label label = new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null)), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 382, null);
            AbstractC6392a title = orderDetailAddressDecorator.getTitle();
            int i11 = AbstractC6392a.f60445b;
            String strA = C13698b.a(title, composer, i11);
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.c(), companion2.l(), composer, 6);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH);
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
            D1.c(composerA3, measurePolicyB2, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            AbstractC6392a actionText = orderDetailAddressDecorator.getActionText();
            composer.startReplaceGroup(1568421041);
            if (actionText != null) {
                Ki.Q.e(localThemeScope, C15132A.f141851a, ComposableLambdaKt.c(1743473675, true, new C2191a(localThemeScope, function0, actionText), composer, 54), composer, i12 | 384 | (C15132A.f141852b << 3));
            }
            composer.P();
            composer.v();
            composer.v();
            si.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion, H1.h.p(40), 0.0f, 0.0f, 0.0f, 14, null)), localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 380, null), C13698b.a(orderDetailAddressDecorator.getSubtitle(), composer, i11), null, composer, i12 | (i13 << 3), 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: in.S$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138444a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderDetailContactNumberDecorator f138445b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138446c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: in.S$b$a */
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138447a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f138448b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f138449c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: in.S$b$a$a, reason: collision with other inner class name */
            static final class C2193a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f138450a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f138451b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ AbstractC6392a f138452c;

                C2193a(LocalThemeScope localThemeScope, j1 j1Var, AbstractC6392a abstractC6392a) {
                    this.f138450a = localThemeScope;
                    this.f138451b = j1Var;
                    this.f138452c = abstractC6392a;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-1186800856, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderContactNumber.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:330)");
                    }
                    LocalThemeScope localThemeScope = this.f138450a;
                    q1.Label labelY = q1.Label.y(this.f138451b.getLabels().getEnabledLabel(), null, this.f138450a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f138450a.getAdsTypography().getHeadings().getSeven(), null, 381, null);
                    String upperCase = C13698b.a(this.f138452c, composer, AbstractC6392a.f60445b).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    si.j.h(localThemeScope, labelY, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            a(LocalThemeScope localThemeScope, Function0<Unit> function0, AbstractC6392a abstractC6392a) {
                this.f138447a = localThemeScope;
                this.f138448b = function0;
                this.f138449c = abstractC6392a;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-244662283, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderContactNumber.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:323)");
                }
                E0.b(this.f138447a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.a(H1.h.p(0)), androidx.compose.foundation.layout.J.k(Modifier.INSTANCE, H1.h.p(24), 0.0f, 2, null), false, null, 831, null), this.f138448b, ComposableLambdaKt.c(-1186800856, true, new C2193a(this.f138447a, Assemble, this.f138449c), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        b(LocalThemeScope localThemeScope, OrderDetailContactNumberDecorator orderDetailContactNumberDecorator, Function0<Unit> function0) {
            this.f138444a = localThemeScope;
            this.f138445b = orderDetailContactNumberDecorator;
            this.f138446c = function0;
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
            LocalThemeScope localThemeScope = this.f138444a;
            OrderDetailContactNumberDecorator orderDetailContactNumberDecorator = this.f138445b;
            Function0<Unit> function0 = this.f138446c;
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
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.c(), companion2.l(), composer, 6);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
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
            C18054z0.a(C16335d.c(orderDetailContactNumberDecorator.getIcon(), composer, 0), null, null, localThemeScope.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 48, 4);
            q1.Label label = new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null)), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 382, null);
            AbstractC6392a title = orderDetailContactNumberDecorator.getTitle();
            int i11 = AbstractC6392a.f60445b;
            String strA = C13698b.a(title, composer, i11);
            int i12 = LocalThemeScope.f17314g;
            int i13 = q1.Label.f142335j;
            si.j.h(localThemeScope, label, strA, null, composer, i12 | (i13 << 3), 4);
            Modifier modifierH2 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.c(), companion2.l(), composer, 6);
            int iA3 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR3 = composer.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierH2);
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
            D1.c(composerA3, measurePolicyB2, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            AbstractC6392a actionText = orderDetailContactNumberDecorator.getActionText();
            composer.startReplaceGroup(236944670);
            if (actionText != null) {
                Ki.Q.e(localThemeScope, C15132A.f141851a, ComposableLambdaKt.c(-244662283, true, new a(localThemeScope, function0, actionText), composer, 54), composer, i12 | 384 | (C15132A.f141852b << 3));
            }
            composer.P();
            composer.v();
            composer.v();
            si.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion, H1.h.p(40), 0.0f, 0.0f, 0.0f, 14, null)), localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 380, null), C13698b.a(orderDetailContactNumberDecorator.getSubtitle(), composer, i11), null, composer, i12 | (i13 << 3), 4);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: in.S$c */
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ OrderDetailStatusDayDateTimeDecorator f138453a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138454b;

        c(OrderDetailStatusDayDateTimeDecorator orderDetailStatusDayDateTimeDecorator, LocalThemeScope localThemeScope) {
            this.f138453a = orderDetailStatusDayDateTimeDecorator;
            this.f138454b = localThemeScope;
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
            OrderDetailStatusDayDateTimeDecorator orderDetailStatusDayDateTimeDecorator = this.f138453a;
            LocalThemeScope localThemeScope2 = this.f138454b;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion3.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion4.a();
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
            D1.c(composerA, measurePolicyA, companion4.e());
            D1.c(composerA, interfaceC5884sR, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C14903g c14903g = C14903g.f139698a;
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion3.l(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion2);
            Function0<InterfaceC5953g> function0A2 = companion4.a();
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
            D1.c(composerA2, measurePolicyB, companion4.e());
            D1.c(composerA2, interfaceC5884sR2, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion4.f());
            C14889J c14889j = C14889J.f139620a;
            C18054z0.a(C16335d.c(orderDetailStatusDayDateTimeDecorator.getIcon(), composer, 0), null, null, localThemeScope2.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 48, 4);
            if (orderDetailStatusDayDateTimeDecorator.getIsRescheduled()) {
                composer.startReplaceGroup(1773709152);
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion2, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyG = C5804h.g(companion3.o(), false);
                int iA3 = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierM);
                Function0<InterfaceC5953g> function0A3 = companion4.a();
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
                D1.c(composerA3, measurePolicyG, companion4.e());
                D1.c(composerA3, interfaceC5884sR3, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion4.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion4.f());
                C5806j c5806j = C5806j.f48836a;
                companion = companion2;
                si.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.b.d(companion2, localThemeScope2.getAdsColors().getAdsColorSupportWarningBg().getColor(), null, 2, null), localThemeScope2.getAdsColors().getAdsColorSupportWarning(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBody().getTwo(), null, 380, null), C16338g.c(com.meijer.mobile.meijer.Y.f100764Xa, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                localThemeScope = localThemeScope2;
                composer2 = composer;
                composer2.v();
                composer2.P();
            } else {
                composer.startReplaceGroup(1774293316);
                companion = companion2;
                si.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.m(companion2, H1.h.p(f10), 0.0f, H1.h.p(6), 0.0f, 10, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 382, null), C13698b.a(orderDetailStatusDayDateTimeDecorator.getTitle(), composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
                AbstractC6392a title = orderDetailStatusDayDateTimeDecorator.getTitle();
                int i11 = AbstractC6392a.f60445b;
                String strA = C13698b.a(title, composer2, i11);
                int i12 = LocalThemeScope.f17314g;
                int i13 = q1.Label.f142335j;
                Composer composer3 = composer2;
                LocalThemeScope localThemeScope3 = localThemeScope;
                si.j.h(localThemeScope3, label, strA, null, composer3, i12 | (i13 << 3), 4);
                companion = companion5;
                si.j.h(localThemeScope3, new q1.Label(androidx.compose.foundation.layout.D.m(companion5, H1.h.p(f11), 0.0f, H1.h.p(f12), 0.0f, 10, null), null, null, null, 0, false, 0, localThemeScope3.getAdsTypography().getBody().getOne(), null, 382, null), C13698b.a(orderDetailStatusDayDateTimeDecorator.getOriginalPickUp(), composer3, i11), null, composer3, i12 | (i13 << 3), 4);
                localThemeScope = localThemeScope3;
                composer2 = composer3;
            }
            composer2.P();
            AbstractC6392a earlyDeliveryPossible = orderDetailStatusDayDateTimeDecorator.getEarlyDeliveryPossible();
            composer2.startReplaceGroup(190788652);
            if (earlyDeliveryPossible != null) {
                si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion, H1.h.p(40), 0.0f, H1.h.p(8), 0.0f, 10, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null), C13698b.a(earlyDeliveryPossible, composer2, AbstractC6392a.f60445b), null, composer2, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: in.S$d */
    static final class d implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ OrderDetailShopperInfoDecorator f138455a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138456b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138457c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: in.S$d$a */
        static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138458a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ OrderDetailShopperInfoDecorator f138459b;

            a(LocalThemeScope localThemeScope, OrderDetailShopperInfoDecorator orderDetailShopperInfoDecorator) {
                this.f138458a = localThemeScope;
                this.f138459b = orderDetailShopperInfoDecorator;
            }

            public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
                Intrinsics.j(AdsRow, "$this$AdsRow");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(793308637, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderShopperInfo.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:430)");
                }
                LocalThemeScope localThemeScope = this.f138458a;
                OrderDetailShopperInfoDecorator.Companion.RateInfo rateInfo = this.f138459b.getRateInfo();
                int rating = rateInfo != null ? rateInfo.getRating() : 0;
                int i11 = LocalThemeScope.f17314g;
                yr.h0.c(localThemeScope, null, rating, 0.0f, null, null, null, null, 0, composer, i11, 253);
                si.j.h(this.f138458a, new q1.Label(null, null, null, null, 0, false, 0, this.f138458a.getAdsTypography().getBodyCompact().getOne(), null, 383, null), C16338g.d(com.meijer.mobile.meijer.Y.f100709Uc, new Object[]{Double.valueOf(this.f138459b.getRateInfo() != null ? r5.getRating() : 0)}, composer, 0), null, composer, i11 | (q1.Label.f142335j << 3), 4);
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

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: in.S$d$b */
        static final class b implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138460a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f138461b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f138462c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: in.S$d$b$a */
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f138463a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f138464b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f138465c;

                a(LocalThemeScope localThemeScope, j1 j1Var, String str) {
                    this.f138463a = localThemeScope;
                    this.f138464b = j1Var;
                    this.f138465c = str;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(31342128, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderShopperInfo.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:466)");
                    }
                    si.j.h(this.f138463a, this.f138464b.getLabels().getEnabledLabel(), this.f138465c, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            b(LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
                this.f138460a = localThemeScope;
                this.f138461b = function0;
                this.f138462c = str;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-140932477, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderShopperInfo.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:460)");
                }
                E0.b(this.f138460a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, null, androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, H1.h.p(40), H1.h.p(12), 0.0f, 0.0f, 12, null), false, null, 895, null), this.f138461b, ComposableLambdaKt.c(31342128, true, new a(this.f138460a, Assemble, this.f138462c), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        d(OrderDetailShopperInfoDecorator orderDetailShopperInfoDecorator, LocalThemeScope localThemeScope, Function0<Unit> function0) {
            this.f138455a = orderDetailShopperInfoDecorator;
            this.f138456b = localThemeScope;
            this.f138457c = function0;
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
            AbstractC6392a tipDate;
            AbstractC6392a authCode;
            AbstractC6392a tipId;
            AbstractC6392a tipAmount;
            AbstractC6392a description;
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
            OrderDetailShopperInfoDecorator orderDetailShopperInfoDecorator3 = this.f138455a;
            LocalThemeScope localThemeScope2 = this.f138456b;
            Function0<Unit> function02 = this.f138457c;
            C5800d c5800d = C5800d.f48779a;
            C5800d.m mVarH = c5800d.h();
            e.Companion companion3 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(mVarH, companion3.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion4 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion4.a();
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
            D1.c(composerA, measurePolicyA, companion4.e());
            D1.c(composerA, interfaceC5884sR, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion4.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion4.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion3.l(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
            Function0<InterfaceC5953g> function0A2 = companion4.a();
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
            D1.c(composerA2, measurePolicyB, companion4.e());
            D1.c(composerA2, interfaceC5884sR2, companion4.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion4.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            D1.c(composerA2, modifierE2, companion4.f());
            C14889J c14889j = C14889J.f139620a;
            C18054z0.a(C16335d.c(orderDetailShopperInfoDecorator3.getShopperInfo().getShopperImage(), composer, 0), null, FullStoryAnnotationsKt.fsMask(companion2), localThemeScope2.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 48, 0);
            if (orderDetailShopperInfoDecorator3.getShopperInfo().getShopperName().length() == 0) {
                composer.startReplaceGroup(-1136060732);
                companion = companion2;
                function0 = function02;
                z10 = false;
                i11 = 3;
                localThemeScope = localThemeScope2;
                si.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion2, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null)), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 382, null), C13698b.a(orderDetailShopperInfoDecorator3.getDescription(), composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                composer2 = composer;
                composer2.P();
            } else {
                localThemeScope = localThemeScope2;
                composer.startReplaceGroup(-1135620191);
                companion = companion2;
                i11 = 3;
                function0 = function02;
                z10 = false;
                si.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion2, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null)), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 382, null), C13698b.a(AbstractC6392a.INSTANCE.d(com.meijer.mobile.meijer.Y.f100370Ci, orderDetailShopperInfoDecorator3.getShopperInfo().getShopperName()), composer, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
                si.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsMask(androidx.compose.foundation.layout.D.m(companion5, H1.h.p(40), 0.0f, 0.0f, 0.0f, 14, null)), localThemeScope.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 380, null), C13698b.a(description, composer2, AbstractC6392a.f60445b), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << i13), 4);
                composer2 = composer;
            }
            composer2.P();
            composer2.startReplaceGroup(-93162183);
            if (orderDetailShopperInfoDecorator.getRatingVisibility()) {
                i14 = 0;
                float f11 = 8;
                C16453n.i(localThemeScope, new q1.Row(androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), null, false, i13, null), H1.h.p(i12), H1.h.p(f11), 0.0f, H1.h.p(f11), 4, null), null, companion3.i(), 2, null), ComposableLambdaKt.c(793308637, true, new a(localThemeScope, orderDetailShopperInfoDecorator), composer2, 54), composer2, LocalThemeScope.f17314g | 384 | (q1.Row.f142392d << i13));
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
                si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(companion6, H1.h.p(i12), 0.0f, 0.0f, 0.0f, 14, null), localThemeScope.getAdsColors().getAdsColorText02(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 380, null), C16338g.c(com.meijer.mobile.meijer.Y.f100329Ah, composer2, i17), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                composer2 = composer;
            }
            composer2.P();
            composer2.startReplaceGroup(-93118270);
            if (orderDetailShopperInfoDecorator2.getButtonVisibility()) {
                Ki.Q.e(localThemeScope, C15134C.f141860a, ComposableLambdaKt.c(-140932477, true, new b(localThemeScope, function0, C16338g.c((!orderDetailShopperInfoDecorator2.getIsTipped() || orderDetailShopperInfoDecorator2.getIsRated()) ? (orderDetailShopperInfoDecorator2.getIsTipped() || !orderDetailShopperInfoDecorator2.getIsRated()) ? com.meijer.mobile.meijer.Y.f100690Tc : C17905b.f167307B : C17905b.f167333x, composer2, i17)), composer2, i16), composer2, LocalThemeScope.f17314g | 384 | (C15134C.f141861b << 3));
            }
            composer2.P();
            composer2.startReplaceGroup(-93086192);
            if (orderDetailShopperInfoDecorator2.getTipInfoVisibility()) {
                Modifier.Companion companion7 = companion;
                Modifier modifierM = androidx.compose.foundation.layout.D.m(companion7, H1.h.p(40), H1.h.p(i15), 0.0f, 0.0f, 12, null);
                MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.g(), companion3.l(), composer2, i17);
                int iA3 = C5859f.a(composer2, i17);
                InterfaceC5884s interfaceC5884sR3 = composer2.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierM);
                Function0<InterfaceC5953g> function0A3 = companion4.a();
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
                D1.c(composerA3, measurePolicyB2, companion4.e());
                D1.c(composerA3, interfaceC5884sR3, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion4.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion4.f());
                MeasurePolicy measurePolicyA2 = C5807k.a(c5800d.h(), companion3.k(), composer2, i17);
                int iA4 = C5859f.a(composer2, i17);
                InterfaceC5884s interfaceC5884sR4 = composer2.r();
                Modifier modifierE4 = androidx.compose.ui.b.e(composer2, companion7);
                Function0<InterfaceC5953g> function0A4 = companion4.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A4);
                } else {
                    composer2.s();
                }
                Composer composerA4 = D1.a(composer2);
                D1.c(composerA4, measurePolicyA2, companion4.e());
                D1.c(composerA4, interfaceC5884sR4, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion4.b();
                if (composerA4.getInserting() || !Intrinsics.e(composerA4.B(), Integer.valueOf(iA4))) {
                    composerA4.t(Integer.valueOf(iA4));
                    composerA4.n(Integer.valueOf(iA4), function2B4);
                }
                D1.c(composerA4, modifierE4, companion4.f());
                composer2.startReplaceGroup(-1595027508);
                if (orderDetailShopperInfoDecorator2.getTipAmountVisibility()) {
                    C14800S.q(localThemeScope, C16338g.c(com.meijer.mobile.meijer.Y.f101107oh, composer2, i17), null, composer2, LocalThemeScope.f17314g, 2);
                }
                composer2.P();
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100547M2, composer2, i17);
                int i19 = LocalThemeScope.f17314g;
                C14800S.q(localThemeScope, strC, null, composer2, i19, 2);
                C14800S.q(localThemeScope, C16338g.c(com.meijer.mobile.meijer.Y.f100791Z, composer2, i17), null, composer2, i19, 2);
                C14800S.q(localThemeScope, C16338g.c(com.meijer.mobile.meijer.Y.f101127ph, composer2, i17), null, composer2, i19, 2);
                composer2.v();
                Modifier modifierM2 = androidx.compose.foundation.layout.D.m(companion7, H1.h.p(24), 0.0f, 0.0f, 0.0f, 14, null);
                MeasurePolicy measurePolicyA3 = C5807k.a(c5800d.h(), companion3.k(), composer2, i17);
                int iA5 = C5859f.a(composer2, i17);
                InterfaceC5884s interfaceC5884sR5 = composer2.r();
                Modifier modifierE5 = androidx.compose.ui.b.e(composer2, modifierM2);
                Function0<InterfaceC5953g> function0A5 = companion4.a();
                if (composer2.k() == null) {
                    C5859f.c();
                }
                composer2.F();
                if (composer2.getInserting()) {
                    composer2.I(function0A5);
                } else {
                    composer2.s();
                }
                Composer composerA5 = D1.a(composer2);
                D1.c(composerA5, measurePolicyA3, companion4.e());
                D1.c(composerA5, interfaceC5884sR5, companion4.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B5 = companion4.b();
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
                    C14800S.q(localThemeScope, C13698b.a(tipAmount, composer2, AbstractC6392a.f60445b), FullStoryAnnotationsKt.fsMask(companion7), composer2, i19, 0);
                }
                composer2.P();
                OrderDetailShopperInfoDecorator.Companion.TipInfo tipInfo2 = orderDetailShopperInfoDecorator2.getTipInfo();
                if (tipInfo2 == null || (tipDate = tipInfo2.getTipDate()) == null) {
                    tipDate = orderDetailShopperInfoDecorator2.getRateAndTipInfo().getTipDate();
                }
                int i20 = AbstractC6392a.f60445b;
                C14800S.q(localThemeScope, C13698b.a(tipDate, composer2, i20), FullStoryAnnotationsKt.fsMask(companion7), composer2, i19, 0);
                OrderDetailShopperInfoDecorator.Companion.TipInfo tipInfo3 = orderDetailShopperInfoDecorator2.getTipInfo();
                if (tipInfo3 == null || (authCode = tipInfo3.getAuthCode()) == null) {
                    authCode = orderDetailShopperInfoDecorator2.getRateAndTipInfo().getAuthCode();
                }
                C14800S.q(localThemeScope, C13698b.a(authCode, composer2, i20), FullStoryAnnotationsKt.fsMask(companion7), composer2, i19, 0);
                OrderDetailShopperInfoDecorator.Companion.TipInfo tipInfo4 = orderDetailShopperInfoDecorator2.getTipInfo();
                if (tipInfo4 == null || (tipId = tipInfo4.getTipId()) == null) {
                    tipId = orderDetailShopperInfoDecorator2.getRateAndTipInfo().getTipId();
                }
                C14800S.q(localThemeScope, C13698b.a(tipId, composer2, i20), FullStoryAnnotationsKt.fsMask(companion7), composer2, i19, 0);
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
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: in.S$e */
    static final class e implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f138466a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f138467b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f138468c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f138469d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f138470e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ OrderDetailCartItem f138471f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: in.S$e$a */
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f138472a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function0<Unit> f138473b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f138474c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: in.S$e$a$a, reason: collision with other inner class name */
            static final class C2194a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f138475a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f138476b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ int f138477c;

                C2194a(LocalThemeScope localThemeScope, j1 j1Var, int i10) {
                    this.f138475a = localThemeScope;
                    this.f138476b = j1Var;
                    this.f138477c = i10;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(256186556, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderedItems.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:241)");
                    }
                    LocalThemeScope localThemeScope = this.f138475a;
                    q1.Label labelY = q1.Label.y(this.f138476b.getLabels().getEnabledLabel(), null, this.f138475a.getAdsColors().getAdsColorBrandPrimary(), null, null, 0, false, 0, this.f138475a.getAdsTypography().getHeadings().getSeven(), null, 381, null);
                    String upperCase = C16338g.c(this.f138477c, composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    si.j.h(localThemeScope, labelY, upperCase, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            a(LocalThemeScope localThemeScope, Function0<Unit> function0, int i10) {
                this.f138472a = localThemeScope;
                this.f138473b = function0;
                this.f138474c = i10;
            }

            public final void a(j1 Assemble, Composer composer, int i10) {
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-939441137, i10, -1, "com.meijer.mobile.meijer.activity.orders.decorators.compose.OrderedItems.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PickupDetailsView.kt:234)");
                }
                E0.b(this.f138472a, q1.d.StandardButton.y(Assemble.getButtons().getEnabledButton(), false, null, null, null, null, null, androidx.compose.foundation.layout.D.a(H1.h.p(0)), androidx.compose.foundation.layout.J.k(Modifier.INSTANCE, H1.h.p(24), 0.0f, 2, null), false, null, 831, null), this.f138473b, ComposableLambdaKt.c(256186556, true, new C2194a(this.f138472a, Assemble, this.f138474c), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
                a(j1Var, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        e(LocalThemeScope localThemeScope, int i10, AbstractC6392a abstractC6392a, Function0<Unit> function0, int i11, OrderDetailCartItem orderDetailCartItem) {
            this.f138466a = localThemeScope;
            this.f138467b = i10;
            this.f138468c = abstractC6392a;
            this.f138469d = function0;
            this.f138470e = i11;
            this.f138471f = orderDetailCartItem;
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
            LocalThemeScope localThemeScope2 = this.f138466a;
            int i11 = this.f138467b;
            AbstractC6392a abstractC6392a = this.f138468c;
            Function0<Unit> function0 = this.f138469d;
            int i12 = this.f138470e;
            OrderDetailCartItem orderDetailCartItem = this.f138471f;
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
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
            int iA2 = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR2 = composer.r();
            Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion);
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
            C18054z0.a(C16335d.c(i11, composer, 0), null, null, localThemeScope2.getAdsColors().getAdsColorBrandPrimary().getColor(), composer, 48, 4);
            q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion, H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null), null, null, null, 0, false, 0, localThemeScope2.getAdsTypography().getHeadings().getSeven(), null, 382, null);
            String strA = C13698b.a(abstractC6392a, composer, AbstractC6392a.f60445b);
            int i13 = LocalThemeScope.f17314g;
            Composer composer2 = composer;
            LocalThemeScope localThemeScope3 = localThemeScope2;
            si.j.h(localThemeScope3, label, strA, null, composer2, i13 | (q1.Label.f142335j << 3), 4);
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB2 = androidx.compose.foundation.layout.G.b(c5800d.c(), companion2.l(), composer2, 6);
            int iA3 = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR3 = composer2.r();
            Modifier modifierE3 = androidx.compose.ui.b.e(composer2, modifierH);
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
            D1.c(composerA3, measurePolicyB2, companion3.e());
            D1.c(composerA3, interfaceC5884sR3, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion3.b();
            if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                composerA3.t(Integer.valueOf(iA3));
                composerA3.n(Integer.valueOf(iA3), function2B3);
            }
            D1.c(composerA3, modifierE3, companion3.f());
            Ki.Q.e(localThemeScope3, C15132A.f141851a, ComposableLambdaKt.c(-939441137, true, new a(localThemeScope3, function0, i12), composer2, 54), composer2, i13 | 384 | (C15132A.f141852b << 3));
            composer2.v();
            composer2.v();
            Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null), H1.h.p(40), 0.0f, 0.0f, 0.0f, 14, null);
            MeasurePolicy measurePolicyB3 = androidx.compose.foundation.layout.G.b(c5800d.f(), companion2.l(), composer2, 6);
            int iA4 = C5859f.a(composer2, 0);
            InterfaceC5884s interfaceC5884sR4 = composer2.r();
            Modifier modifierE4 = androidx.compose.ui.b.e(composer2, modifierM);
            Function0<InterfaceC5953g> function0A4 = companion3.a();
            if (composer2.k() == null) {
                C5859f.c();
            }
            composer2.F();
            if (composer2.getInserting()) {
                composer2.I(function0A4);
            } else {
                composer2.s();
            }
            Composer composerA4 = D1.a(composer2);
            D1.c(composerA4, measurePolicyB3, companion3.e());
            D1.c(composerA4, interfaceC5884sR4, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B4 = companion3.b();
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
                    C15669h.a aVar = new C15669h.a((Context) composer2.o(AndroidCompositionLocals_androidKt.g()));
                    String imageUrl = entryDecorator.getImageUrl();
                    if (imageUrl == null) {
                        imageUrl = "";
                    }
                    C6484c.d(aVar.f(imageUrl).e(true).c(), entryDecorator.getName(), a5.a.a((Context) composer2.o(AndroidCompositionLocals_androidKt.g())), androidx.compose.foundation.layout.J.v(Modifier.INSTANCE, H1.h.p(64)), C16335d.c(Cj.i.f4726O1, composer2, 0), C16335d.c(Cj.i.f4726O1, composer2, 0), null, null, null, null, null, InterfaceC5926k.INSTANCE.e(), 0.0f, null, 0, false, null, composer, 3072, 48, 128960);
                    composer2 = composer;
                    localThemeScope3 = localThemeScope3;
                }
                localThemeScope = localThemeScope3;
                Unit unit = Unit.f143329a;
            }
            composer.P();
            q1.Label label2 = new q1.Label(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, H1.h.p(24), 0.0f, 0.0f, 13, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null);
            String extraItemCount = orderDetailCartItem.getExtraItemCount();
            si.j.h(localThemeScope, label2, extraItemCount == null ? "" : extraItemCount, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
    public static final void g(final Ki.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final hn.OrderDetailAddressDecorator r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.C14800S.g(Ki.M, androidx.compose.ui.Modifier, hn.e, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, OrderDetailAddressDecorator orderDetailAddressDecorator, Function0 function0, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, orderDetailAddressDecorator, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void i(final Ki.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final hn.OrderDetailContactNumberDecorator r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.C14800S.i(Ki.M, androidx.compose.ui.Modifier, hn.f, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, Modifier modifier, OrderDetailContactNumberDecorator orderDetailContactNumberDecorator, Function0 function0, int i10, int i11, Composer composer, int i12) {
        i(localThemeScope, modifier, orderDetailContactNumberDecorator, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void k(final Ki.LocalThemeScope r17, androidx.compose.ui.Modifier r18, final es.OrderDetailStatusDayDateTimeDecorator r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.C14800S.k(Ki.M, androidx.compose.ui.Modifier, es.c, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Modifier modifier, OrderDetailStatusDayDateTimeDecorator orderDetailStatusDayDateTimeDecorator, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, modifier, orderDetailStatusDayDateTimeDecorator, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void m(final Ki.LocalThemeScope r18, androidx.compose.ui.Modifier r19, final hn.OrderDetailShopperInfoDecorator r20, final kotlin.jvm.functions.Function0<kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.C14800S.m(Ki.M, androidx.compose.ui.Modifier, hn.l, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, OrderDetailShopperInfoDecorator orderDetailShopperInfoDecorator, Function0 function0, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, orderDetailShopperInfoDecorator, function0, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void o(final Ki.LocalThemeScope r22, androidx.compose.ui.Modifier r23, final int r24, final int r25, final bk.AbstractC6392a r26, final in.OrderDetailCartItem r27, final kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.C14800S.o(Ki.M, androidx.compose.ui.Modifier, int, int, bk.a, in.c, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, AbstractC6392a abstractC6392a, OrderDetailCartItem orderDetailCartItem, Function0 function0, int i12, int i13, Composer composer, int i14) {
        o(localThemeScope, modifier, i10, i11, abstractC6392a, orderDetailCartItem, function0, composer, J0.a(i12 | 1), i13);
        return Unit.f143329a;
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
    public static final void q(final Ki.LocalThemeScope r20, final java.lang.String r21, androidx.compose.ui.Modifier r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: in.C14800S.q(Ki.M, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(LocalThemeScope localThemeScope, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        q(localThemeScope, str, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
