package com.meijer.mobile.meijer.activity.orders;

import F1.k;
import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import android.content.Context;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import c5.C6484c;
import com.meijer.mobile.meijer.activity.orders.F0;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.BorderStroke;
import d0.C13575i;
import dk.C13698b;
import hn.OrderSubstitutionsListDecorator;
import j0.InterfaceC14888I;
import j0.InterfaceC14902f;
import java.util.Locale;
import ki.C15134C;
import ki.j1;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C18045v;
import kotlin.InterfaceC18043u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m5.C15669h;
import p1.C16338g;
import pi.C16453n;
import qi.C16671b;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u001aC\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0001¢\u0006\u0004\b\b\u0010\t\u001aW\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00042\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001aO\u0010\u001b\u001a\u00020\u0005*\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\u0005*\u00020\u0000H\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\"²\u0006\u000e\u0010\u001f\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u00198\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u00198\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Lhn/q;", "substitutionItem", "Lkotlin/Function1;", "", "", "onSubstitutionAccepted", "onSubstitutionRejected", "j", "(LKi/M;Lhn/q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "itemId", "Lvo/b;", "substitutionScreenType", "", "customerSubstitutionPreference", "l", "(LKi/M;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lvo/b;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "productImage", "productName", "productPrice", "Lbk/a;", "itemQuantity", "productTotalPrice", "LF1/k;", "priceDecoration", "", "isSubstitutedItem", "h", "(LKi/M;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbk/a;Ljava/lang/String;LF1/k;ZLandroidx/compose/runtime/Composer;II)V", "w", "(LKi/M;Landroidx/compose/runtime/Composer;I)V", "isSubstitutionRejectButtonChecked", "isSubstitutionAcceptButtonChecked", "areButtonsEnabled", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class F0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f111041a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f111042b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f111043c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f111044d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f111045e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f111046f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ F1.k f111047g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f111048h;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.orders.F0$a$a, reason: collision with other inner class name */
        static final class C1689a implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f111049a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f111050b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f111051c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f111052d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ F1.k f111053e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f111054f;

            C1689a(boolean z10, LocalThemeScope localThemeScope, String str, String str2, F1.k kVar, String str3) {
                this.f111049a = z10;
                this.f111050b = localThemeScope;
                this.f111051c = str;
                this.f111052d = str2;
                this.f111053e = kVar;
                this.f111054f = str3;
            }

            public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
                Intrinsics.j(AdsColumn, "$this$AdsColumn");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1691284, i10, -1, "com.meijer.mobile.meijer.activity.orders.HalfSubstitutionItem.<anonymous>.<anonymous>.<anonymous> (ReviewOrderSubstitutionItem.kt:250)");
                }
                composer.startReplaceGroup(-1625322764);
                if (!this.f111049a) {
                    LocalThemeScope localThemeScope = this.f111050b;
                    si.j.h(localThemeScope, new q1.Label(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, 0.0f, H1.h.p(16), 0.0f, 11, null), this.f111050b.getAdsColors().getAdsColorText01(), null, null, F1.t.INSTANCE.b(), false, 1, localThemeScope.getAdsTypography().getHeadings().getEight(), null, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, null), C16338g.c(com.meijer.mobile.meijer.Y.f100981ia, composer, 0), null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
                }
                composer.P();
                LocalThemeScope localThemeScope2 = this.f111050b;
                Ki.I eight = localThemeScope2.getAdsTypography().getHeadings().getEight();
                Ki.T adsColorText01 = this.f111049a ? this.f111050b.getAdsColors().getAdsColorText01() : this.f111050b.getAdsColors().getAdsColorDisabled();
                Modifier.Companion companion = Modifier.INSTANCE;
                float f10 = 8;
                q1.Label label = new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), adsColorText01, null, null, F1.t.INSTANCE.b(), false, 1, eight, null, HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, null);
                String str = this.f111051c;
                int i11 = LocalThemeScope.f17314g;
                int i12 = q1.Label.f142335j;
                si.j.h(localThemeScope2, label, str, null, composer, i11 | (i12 << 3), 4);
                LocalThemeScope localThemeScope3 = this.f111050b;
                si.j.h(localThemeScope3, new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), this.f111049a ? this.f111050b.getAdsColors().getAdsColorText01() : this.f111050b.getAdsColors().getAdsColorsDisabled(), null, null, 0, false, 0, localThemeScope3.getAdsTypography().getHeadings().getEight(), null, 380, null), C16338g.d(com.meijer.mobile.meijer.Y.f101106og, new Object[]{this.f111052d}, composer, 0), null, composer, i11 | (i12 << 3), 4);
                LocalThemeScope localThemeScope4 = this.f111050b;
                si.j.h(localThemeScope4, new q1.Label(androidx.compose.foundation.layout.D.m(companion, 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null), this.f111049a ? this.f111050b.getAdsColors().getAdsColorText01() : this.f111050b.getAdsColors().getAdsColorsDisabled(), this.f111053e, null, 0, false, 0, localThemeScope4.getAdsTypography().getHeadings().getSeven(), null, 376, null), this.f111054f, null, composer, i11 | (i12 << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
                a(interfaceC14902f, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(String str, LocalThemeScope localThemeScope, boolean z10, AbstractC6392a abstractC6392a, String str2, String str3, F1.k kVar, String str4) {
            this.f111041a = str;
            this.f111042b = localThemeScope;
            this.f111043c = z10;
            this.f111044d = abstractC6392a;
            this.f111045e = str2;
            this.f111046f = str3;
            this.f111047g = kVar;
            this.f111048h = str4;
        }

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(AdsRow) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(348053180, i11, -1, "com.meijer.mobile.meijer.activity.orders.HalfSubstitutionItem.<anonymous> (ReviewOrderSubstitutionItem.kt:231)");
            }
            C15669h c15669hC = new C15669h.a((Context) composer.o(AndroidCompositionLocals_androidKt.g())).f(this.f111041a).p(com.meijer.mobile.meijer.S.f99542A).j(com.meijer.mobile.meijer.S.f99542A).c();
            a5.h hVarA = a5.a.a((Context) composer.o(AndroidCompositionLocals_androidKt.g()));
            Modifier.Companion companion = Modifier.INSTANCE;
            C6484c.e(c15669hC, null, hVarA, androidx.compose.foundation.layout.J.v(companion, H1.h.p(104)), null, null, null, null, 0.0f, null, 0, false, null, composer, 3120, 0, 8176);
            float f10 = 16;
            Modifier modifierM = androidx.compose.foundation.layout.D.m(InterfaceC14888I.b(AdsRow, companion, 1.0f, false, 2, null), H1.h.p(f10), 0.0f, 0.0f, 0.0f, 14, null);
            LocalThemeScope localThemeScope = this.f111042b;
            boolean z10 = this.f111043c;
            AbstractC6392a abstractC6392a = this.f111044d;
            String str = this.f111045e;
            String str2 = this.f111046f;
            F1.k kVar = this.f111047g;
            String str3 = this.f111048h;
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierM);
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
            q1.Column column = new q1.Column(null, null, null, 7, null);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-1691284, true, new C1689a(z10, localThemeScope, str, str2, kVar, str3), composer, 54);
            int i12 = LocalThemeScope.f17314g;
            C16453n.e(localThemeScope, column, composableLambdaC, composer, i12 | 384 | (q1.Column.f142240d << 3));
            Ki.I six = localThemeScope.getAdsTypography().getHeadings().getSix();
            Modifier modifierM2 = androidx.compose.foundation.layout.D.m(c5806j.g(companion, companion2.c()), 0.0f, H1.h.p(f10), 0.0f, 0.0f, 13, null);
            int iB = F1.j.INSTANCE.b();
            Ki.z adsColors = localThemeScope.getAdsColors();
            si.j.h(localThemeScope, new q1.Label(modifierM2, z10 ? adsColors.getAdsColorText01() : adsColors.getAdsColorsDisabled(), null, F1.j.h(iB), 0, false, 0, six, null, 372, null), C13698b.a(abstractC6392a, composer, AbstractC6392a.f60445b), null, composer, i12 | (q1.Label.f142335j << 3), 4);
            composer.v();
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
    static final class b implements Function3<InterfaceC14902f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f111055a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OrderSubstitutionsListDecorator f111056b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f111057c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f111058d;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, OrderSubstitutionsListDecorator orderSubstitutionsListDecorator, Function1<? super Integer, Unit> function1, Function1<? super Integer, Unit> function12) {
            this.f111055a = localThemeScope;
            this.f111056b = orderSubstitutionsListDecorator;
            this.f111057c = function1;
            this.f111058d = function12;
        }

        public final void a(InterfaceC14902f AdsColumn, Composer composer, int i10) {
            Intrinsics.j(AdsColumn, "$this$AdsColumn");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2128182636, i10, -1, "com.meijer.mobile.meijer.activity.orders.ReviewOrderSubstitutionItem.<anonymous> (ReviewOrderSubstitutionItem.kt:59)");
            }
            LocalThemeScope localThemeScope = this.f111055a;
            String strG = this.f111056b.g();
            String title = this.f111056b.getTitle();
            String totalPriceRawValue = this.f111056b.getTotalPriceRawValue();
            AbstractC6392a abstractC6392aC = this.f111056b.c();
            String totalPriceRawValue2 = this.f111056b.getTotalPriceRawValue();
            k.Companion companion = F1.k.INSTANCE;
            F1.k kVarB = companion.b();
            int i11 = LocalThemeScope.f17314g;
            int i12 = AbstractC6392a.f60445b;
            F0.h(localThemeScope, strG, title, totalPriceRawValue, abstractC6392aC, totalPriceRawValue2, kVarB, false, composer, 1572864 | i11 | (i12 << 12), 64);
            F0.w(this.f111055a, composer, i11);
            F0.h(this.f111055a, this.f111056b.h(), this.f111056b.getTitleSubstituted(), this.f111056b.getTotalPriceRawValueSubstituted(), this.f111056b.c(), this.f111056b.getTotalPriceRawValueSubstituted(), companion.c(), true, composer, 14155776 | i11 | (i12 << 12), 0);
            F0.l(this.f111055a, this.f111056b.getItemId(), this.f111057c, this.f111058d, this.f111056b.getSubstitutionScreenType(), this.f111056b.getCustomerSubstitutionPreference(), composer, i11);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14902f interfaceC14902f, Composer composer, Integer num) {
            a(interfaceC14902f, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f111059a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f111060b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f111061c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f111062d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f111063e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Boolean> f111064f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Unit> f111065g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        static final class a implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f111066a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14888I f111067b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f111068c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f111069d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<Integer, Unit> f111070e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f111071f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f111072g;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.meijer.activity.orders.F0$c$a$a, reason: collision with other inner class name */
            static final class C1690a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111073a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f111074b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f111075c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f111076d;

                C1690a(LocalThemeScope localThemeScope, j1 j1Var, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02) {
                    this.f111073a = localThemeScope;
                    this.f111074b = j1Var;
                    this.f111075c = interfaceC5872l0;
                    this.f111076d = interfaceC5872l02;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-674284481, i10, -1, "com.meijer.mobile.meijer.activity.orders.SubstitutionButtons.<anonymous>.<anonymous>.<anonymous> (ReviewOrderSubstitutionItem.kt:145)");
                    }
                    composer.startReplaceGroup(552676376);
                    if (F0.r(this.f111075c)) {
                        C16671b.b(this.f111073a, q1.h.DrawableIcon.y(this.f111074b.getIcons().getEnabledIcon(), C.f.o.f17066e, null, null, null, 0.0f, this.f111073a.getAdsColors().getAdsColorSupportError(), null, 94, null), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
                    }
                    composer.P();
                    LocalThemeScope localThemeScope = this.f111073a;
                    q1.Label labelY = q1.Label.y(Cr.a.b(this.f111074b.getLabels(), F0.n(this.f111076d)), null, F0.r(this.f111075c) ? this.f111073a.getAdsColors().getAdsColorSupportError() : this.f111074b.getLabels().getEnabledLabel().getColor(), null, null, 0, false, 0, null, null, 509, null);
                    String upperCase = C16338g.c(com.meijer.mobile.meijer.Y.f101086ng, composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    si.j.h(localThemeScope, labelY, upperCase, null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1, int i10, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02) {
                F0.s(interfaceC5872l0, true);
                F0.v(interfaceC5872l02, false);
                function1.invoke(Integer.valueOf(i10));
                return Unit.f143329a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(LocalThemeScope localThemeScope, InterfaceC14888I interfaceC14888I, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, Function1<? super Integer, Unit> function1, int i10, InterfaceC5872l0<Boolean> interfaceC5872l03) {
                this.f111066a = localThemeScope;
                this.f111067b = interfaceC14888I;
                this.f111068c = interfaceC5872l0;
                this.f111069d = interfaceC5872l02;
                this.f111070e = function1;
                this.f111071f = i10;
                this.f111072g = interfaceC5872l03;
            }

            public final void b(j1 Assemble, Composer composer, int i10) {
                LocalThemeScope localThemeScope;
                boolean z10;
                InterfaceC18043u colors;
                Composer composer2 = composer;
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(-525823028, i10, -1, "com.meijer.mobile.meijer.activity.orders.SubstitutionButtons.<anonymous>.<anonymous> (ReviewOrderSubstitutionItem.kt:119)");
                }
                LocalThemeScope localThemeScope2 = this.f111066a;
                q1.d.StandardButton standardButtonA = Cr.a.a(Assemble.getButtons(), F0.n(this.f111072g));
                Modifier modifierM = androidx.compose.foundation.layout.D.m(InterfaceC14888I.b(this.f111067b, Modifier.INSTANCE, 1.0f, false, 2, null), H1.h.p(16), 0.0f, H1.h.p(8), 0.0f, 10, null);
                BorderStroke borderStrokeA = F0.r(this.f111068c) ? C13575i.a(H1.h.p(1), this.f111066a.getAdsColors().getAdsColorSupportError().getColor()) : Cr.a.a(Assemble.getButtons(), F0.n(this.f111072g)).getBorder();
                composer2.startReplaceGroup(1490233634);
                if (F0.r(this.f111068c)) {
                    localThemeScope = localThemeScope2;
                    z10 = true;
                    colors = C18045v.f169801a.a(this.f111066a.getAdsColors().getAdsColorSupportErrorBg().getColor(), 0L, this.f111066a.getAdsColors().getAdsColorSupportErrorBg().getColor(), 0L, composer, C18045v.f169812l << 12, 10);
                    composer2 = composer;
                } else {
                    localThemeScope = localThemeScope2;
                    z10 = true;
                    colors = Cr.a.a(Assemble.getButtons(), F0.n(this.f111072g)).getColors();
                }
                InterfaceC18043u interfaceC18043u = colors;
                composer2.P();
                q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(standardButtonA, false, null, null, null, borderStrokeA, interfaceC18043u, null, modifierM, false, null, 847, null);
                composer2.startReplaceGroup(-1224400529);
                boolean zV = composer2.V(this.f111068c) | composer2.V(this.f111069d) | composer2.V(this.f111070e) | composer2.d(this.f111071f);
                final Function1<Integer, Unit> function1 = this.f111070e;
                final int i11 = this.f111071f;
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f111068c;
                final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f111069d;
                Object objB = composer2.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.G0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return F0.c.a.c(function1, i11, interfaceC5872l0, interfaceC5872l02);
                        }
                    };
                    composer2.t(objB);
                }
                composer2.P();
                oi.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(-674284481, z10, new C1690a(this.f111066a, Assemble, this.f111068c, this.f111072g), composer2, 54), composer2, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
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
        @SourceDebugExtension
        static final class b implements Function3<j1, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f111077a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14888I f111078b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f111079c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f111080d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Function1<Integer, Unit> f111081e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f111082f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<Boolean> f111083g;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            static final class a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f111084a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ j1 f111085b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f111086c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<Boolean> f111087d;

                a(LocalThemeScope localThemeScope, j1 j1Var, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02) {
                    this.f111084a = localThemeScope;
                    this.f111085b = j1Var;
                    this.f111086c = interfaceC5872l0;
                    this.f111087d = interfaceC5872l02;
                }

                public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                    Intrinsics.j(AdsButton, "$this$AdsButton");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(4729704, i10, -1, "com.meijer.mobile.meijer.activity.orders.SubstitutionButtons.<anonymous>.<anonymous>.<anonymous> (ReviewOrderSubstitutionItem.kt:193)");
                    }
                    composer.startReplaceGroup(250279175);
                    if (F0.u(this.f111086c)) {
                        C16671b.b(this.f111084a, q1.h.DrawableIcon.y(this.f111085b.getIcons().getEnabledIcon(), C.f.m.f17063e, null, null, null, 0.0f, this.f111084a.getAdsColors().getAdsColorSupportSuccess(), null, 94, null), null, null, composer, LocalThemeScope.f17314g | (q1.h.DrawableIcon.f142322h << 3), 6);
                    }
                    composer.P();
                    LocalThemeScope localThemeScope = this.f111084a;
                    q1.Label labelY = q1.Label.y(Cr.a.b(this.f111085b.getLabels(), F0.n(this.f111087d)), null, F0.u(this.f111086c) ? this.f111084a.getAdsColors().getAdsColorSupportSuccess() : this.f111085b.getLabels().getEnabledLabel().getColor(), null, null, 0, false, 0, null, null, 509, null);
                    String upperCase = C16338g.c(com.meijer.mobile.meijer.Y.f101066mg, composer, 0).toUpperCase(Locale.ROOT);
                    Intrinsics.i(upperCase, "toUpperCase(...)");
                    si.j.h(localThemeScope, labelY, upperCase, null, composer, (q1.Label.f142335j << 3) | LocalThemeScope.f17314g, 4);
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(Function1 function1, int i10, InterfaceC5872l0 interfaceC5872l0, InterfaceC5872l0 interfaceC5872l02) {
                F0.s(interfaceC5872l0, false);
                F0.v(interfaceC5872l02, true);
                function1.invoke(Integer.valueOf(i10));
                return Unit.f143329a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(LocalThemeScope localThemeScope, InterfaceC14888I interfaceC14888I, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, Function1<? super Integer, Unit> function1, int i10, InterfaceC5872l0<Boolean> interfaceC5872l03) {
                this.f111077a = localThemeScope;
                this.f111078b = interfaceC14888I;
                this.f111079c = interfaceC5872l0;
                this.f111080d = interfaceC5872l02;
                this.f111081e = function1;
                this.f111082f = i10;
                this.f111083g = interfaceC5872l03;
            }

            public final void b(j1 Assemble, Composer composer, int i10) {
                LocalThemeScope localThemeScope;
                boolean z10;
                InterfaceC18043u colors;
                Composer composer2 = composer;
                Intrinsics.j(Assemble, "$this$Assemble");
                if (ComposerKt.M()) {
                    ComposerKt.U(942265269, i10, -1, "com.meijer.mobile.meijer.activity.orders.SubstitutionButtons.<anonymous>.<anonymous> (ReviewOrderSubstitutionItem.kt:167)");
                }
                LocalThemeScope localThemeScope2 = this.f111077a;
                q1.d.StandardButton enabledButton = F0.n(this.f111083g) ? Assemble.getButtons().getEnabledButton() : Assemble.getButtons().getDisabledButton();
                Modifier modifierM = androidx.compose.foundation.layout.D.m(InterfaceC14888I.b(this.f111078b, Modifier.INSTANCE, 1.0f, false, 2, null), H1.h.p(8), 0.0f, H1.h.p(16), 0.0f, 10, null);
                BorderStroke borderStrokeA = F0.u(this.f111080d) ? C13575i.a(H1.h.p(1), this.f111077a.getAdsColors().getAdsColorSupportSuccess().getColor()) : Cr.a.a(Assemble.getButtons(), F0.n(this.f111083g)).getBorder();
                composer2.startReplaceGroup(-721152913);
                if (F0.u(this.f111080d)) {
                    localThemeScope = localThemeScope2;
                    z10 = true;
                    colors = C18045v.f169801a.a(this.f111077a.getAdsColors().getAdsColorSupportSuccessBg().getColor(), 0L, this.f111077a.getAdsColors().getAdsColorSupportSuccessBg().getColor(), 0L, composer, C18045v.f169812l << 12, 10);
                    composer2 = composer;
                } else {
                    localThemeScope = localThemeScope2;
                    z10 = true;
                    colors = Cr.a.a(Assemble.getButtons(), F0.n(this.f111083g)).getColors();
                }
                InterfaceC18043u interfaceC18043u = colors;
                composer2.P();
                q1.d.StandardButton standardButtonY = q1.d.StandardButton.y(enabledButton, false, null, null, null, borderStrokeA, interfaceC18043u, null, modifierM, false, null, 847, null);
                composer2.startReplaceGroup(-1224400529);
                boolean zV = composer2.V(this.f111079c) | composer2.V(this.f111080d) | composer2.V(this.f111081e) | composer2.d(this.f111082f);
                final Function1<Integer, Unit> function1 = this.f111081e;
                final int i11 = this.f111082f;
                final InterfaceC5872l0<Boolean> interfaceC5872l0 = this.f111079c;
                final InterfaceC5872l0<Boolean> interfaceC5872l02 = this.f111080d;
                Object objB = composer2.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.H0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return F0.c.b.c(function1, i11, interfaceC5872l0, interfaceC5872l02);
                        }
                    };
                    composer2.t(objB);
                }
                composer2.P();
                oi.E0.b(localThemeScope, standardButtonY, (Function0) objB, ComposableLambdaKt.c(4729704, z10, new a(this.f111077a, Assemble, this.f111080d, this.f111083g), composer2, 54), composer2, (q1.d.StandardButton.f142229k << 3) | LocalThemeScope.f17314g | 3072);
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

        public final void a(InterfaceC14888I AdsRow, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsRow, "$this$AdsRow");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(AdsRow) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(608201392, i11, -1, "com.meijer.mobile.meijer.activity.orders.SubstitutionButtons.<anonymous> (ReviewOrderSubstitutionItem.kt:118)");
            }
            LocalThemeScope localThemeScope = this.f111059a;
            C15134C c15134c = C15134C.f141860a;
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(-525823028, true, new a(localThemeScope, AdsRow, this.f111060b, this.f111061c, this.f111062d, this.f111063e, this.f111064f), composer, 54);
            int i12 = LocalThemeScope.f17314g;
            int i13 = C15134C.f141861b;
            Ki.Q.e(localThemeScope, c15134c, composableLambdaC, composer, i12 | 384 | (i13 << 3));
            LocalThemeScope localThemeScope2 = this.f111059a;
            Ki.Q.e(localThemeScope2, c15134c, ComposableLambdaKt.c(942265269, true, new b(localThemeScope2, AdsRow, this.f111060b, this.f111061c, this.f111065g, this.f111063e, this.f111064f), composer, 54), composer, i12 | 384 | (i13 << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, InterfaceC5872l0<Boolean> interfaceC5872l0, InterfaceC5872l0<Boolean> interfaceC5872l02, Function1<? super Integer, Unit> function1, int i10, InterfaceC5872l0<Boolean> interfaceC5872l03, Function1<? super Integer, Unit> function12) {
            this.f111059a = localThemeScope;
            this.f111060b = interfaceC5872l0;
            this.f111061c = interfaceC5872l02;
            this.f111062d = function1;
            this.f111063e = i10;
            this.f111064f = interfaceC5872l03;
            this.f111065g = function12;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
            a(interfaceC14888I, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(Ki.LocalThemeScope r21, final java.lang.String r22, final java.lang.String r23, final java.lang.String r24, final bk.AbstractC6392a r25, final java.lang.String r26, final F1.k r27, boolean r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.orders.F0.h(Ki.M, java.lang.String, java.lang.String, java.lang.String, bk.a, java.lang.String, F1.k, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, String str, String str2, String str3, AbstractC6392a abstractC6392a, String str4, F1.k kVar, boolean z10, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, str, str2, str3, abstractC6392a, str4, kVar, z10, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void j(final LocalThemeScope localThemeScope, final OrderSubstitutionsListDecorator substitutionItem, final Function1<? super Integer, Unit> onSubstitutionAccepted, final Function1<? super Integer, Unit> onSubstitutionRejected, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(substitutionItem, "substitutionItem");
        Intrinsics.j(onSubstitutionAccepted, "onSubstitutionAccepted");
        Intrinsics.j(onSubstitutionRejected, "onSubstitutionRejected");
        Composer composerStartRestartGroup = composer.startRestartGroup(696737482);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(substitutionItem) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onSubstitutionAccepted) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.D(onSubstitutionRejected) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) == 1170 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(696737482, i11, -1, "com.meijer.mobile.meijer.activity.orders.ReviewOrderSubstitutionItem (ReviewOrderSubstitutionItem.kt:57)");
            }
            C16453n.e(localThemeScope, new q1.Column(null, null, null, 7, null), ComposableLambdaKt.c(-2128182636, true, new b(localThemeScope, substitutionItem, onSubstitutionAccepted, onSubstitutionRejected), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (q1.Column.f142240d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.y0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return F0.k(localThemeScope, substitutionItem, onSubstitutionAccepted, onSubstitutionRejected, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, OrderSubstitutionsListDecorator orderSubstitutionsListDecorator, Function1 function1, Function1 function12, int i10, Composer composer, int i11) {
        j(localThemeScope, orderSubstitutionsListDecorator, function1, function12, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(final LocalThemeScope localThemeScope, final int i10, final Function1<? super Integer, Unit> function1, final Function1<? super Integer, Unit> function12, final vo.b bVar, final String str, Composer composer, final int i11) {
        int i12;
        Function1<? super Integer, Unit> function13;
        Function1<? super Integer, Unit> function14;
        Composer composerStartRestartGroup = composer.startRestartGroup(-212187408);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            function13 = function1;
            i12 |= composerStartRestartGroup.D(function13) ? 256 : 128;
        } else {
            function13 = function1;
        }
        if ((i11 & 3072) == 0) {
            function14 = function12;
            i12 |= composerStartRestartGroup.D(function14) ? RecyclerView.m.FLAG_MOVED : 1024;
        } else {
            function14 = function12;
        }
        if ((i11 & 24576) == 0) {
            i12 |= composerStartRestartGroup.d(bVar == null ? -1 : bVar.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= composerStartRestartGroup.V(str) ? 131072 : 65536;
        }
        if ((74899 & i12) == 74898 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-212187408, i12, -1, "com.meijer.mobile.meijer.activity.orders.SubstitutionButtons (ReviewOrderSubstitutionItem.kt:94)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.A0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.q();
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) L0.c.c(objArr, null, null, (Function0) objB, composerStartRestartGroup, 3072, 6);
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.B0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.t();
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            InterfaceC5872l0 interfaceC5872l02 = (InterfaceC5872l0) L0.c.c(objArr2, null, null, (Function0) objB2, composerStartRestartGroup, 3072, 6);
            Object[] objArr3 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB3 = composerStartRestartGroup.B();
            if (objB3 == companion.a()) {
                objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.orders.C0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return F0.m();
                    }
                };
                composerStartRestartGroup.t(objB3);
            }
            composerStartRestartGroup.P();
            InterfaceC5872l0 interfaceC5872l03 = (InterfaceC5872l0) L0.c.c(objArr3, null, null, (Function0) objB3, composerStartRestartGroup, 3072, 6);
            if (bVar == vo.b.f166128g && str != null) {
                o(interfaceC5872l03, false);
                if (Intrinsics.e(str, "ACCEPTED")) {
                    s(interfaceC5872l0, false);
                    v(interfaceC5872l02, true);
                } else if (Intrinsics.e(str, "REJECTED")) {
                    s(interfaceC5872l0, true);
                    v(interfaceC5872l02, false);
                }
            }
            C16453n.i(localThemeScope, new q1.Row(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, H1.h.p(16), 0.0f, H1.h.p(8), 5, null), null, null, 6, null), ComposableLambdaKt.c(608201392, true, new c(localThemeScope, interfaceC5872l0, interfaceC5872l02, function14, i10, interfaceC5872l03, function13), composerStartRestartGroup, 54), composerStartRestartGroup, LocalThemeScope.f17314g | 384 | (i12 & 14) | (q1.Row.f142392d << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.D0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return F0.p(localThemeScope, i10, function1, function12, bVar, str, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5872l0 m() {
        return t1.e(Boolean.TRUE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(LocalThemeScope localThemeScope, int i10, Function1 function1, Function1 function12, vo.b bVar, String str, int i11, Composer composer, int i12) {
        l(localThemeScope, i10, function1, function12, bVar, str, composer, J0.a(i11 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5872l0 q() {
        return t1.e(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC5872l0 t() {
        return t1.e(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(204409845);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(204409845, i11, -1, "com.meijer.mobile.meijer.activity.orders.SubstitutionDivider (ReviewOrderSubstitutionItem.kt:314)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f10 = 16;
            Modifier modifierK = androidx.compose.foundation.layout.D.k(companion, H1.h.p(f10), 0.0f, 2, null);
            e.Companion companion2 = P0.e.INSTANCE;
            MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierK);
            InterfaceC5953g.Companion companion3 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion3.a();
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
            D1.c(composerA, measurePolicyG, companion3.e());
            D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion3.f());
            C5806j c5806j = C5806j.f48836a;
            C17983Z.a(c5806j.g(companion, companion2.e()), localThemeScope2.getAdsColors().getAdsColorUIDivider().getColor(), H1.h.p(1), 0.0f, composerStartRestartGroup, 384, 8);
            localThemeScope2 = localThemeScope;
            si.j.h(localThemeScope2, new q1.Label(androidx.compose.foundation.layout.D.k(androidx.compose.foundation.b.d(c5806j.g(companion, companion2.e()), localThemeScope.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null), H1.h.p(f10), 0.0f, 2, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 382, null), C16338g.c(com.meijer.mobile.meijer.Y.f100961ha, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.orders.E0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return F0.x(localThemeScope2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        w(localThemeScope, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    private static final void o(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }
}
