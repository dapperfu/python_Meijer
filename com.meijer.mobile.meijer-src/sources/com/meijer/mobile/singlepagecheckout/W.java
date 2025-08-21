package com.meijer.mobile.singlepagecheckout;

import Ki.C;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5926k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.semantics.Role;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.review.CartItemsDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState;
import com.meijer.mobile.meijer.activity.checkout.review.EntryDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.SubstitutionPreferenceDecorator;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import ek.C13806b;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14888I;
import ji.C15042c;
import ki.InterfaceC15153W;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C4107g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import qi.C16671b;
import r1.C16819m;
import ri.C16912d;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u001aA\u0010\t\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%²\u0006\u000e\u0010!\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010#\u001a\u00020\"8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0012\u001a\u0004\u0018\u00010$8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010#\u001a\u00020\"8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "viewState", "Lkotlin/Function0;", "", "onEditCart", "onEditSubstitutionPreference", "p", "(LKi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/u;", "cartItemsDecorator", "m", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/u;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;", "substitutionPreference", "", "error", "v", "(LKi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "fullStoryId", "onClick", "r", "(LKi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "content", "k", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/enums/EnumEntries;", "Lcom/meijer/mobile/singlepagecheckout/b;", "a", "Lkotlin/enums/EnumEntries;", "cartItems", "lastAction", "", "displayError", "", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    private static final EnumEntries<EnumC13028b> f119079a = EnumC13028b.b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CartItemsDecorator f119080a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f119081b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119082c;

        a(CartItemsDecorator cartItemsDecorator, int i10, LocalThemeScope localThemeScope) {
            this.f119080a = cartItemsDecorator;
            this.f119081b = i10;
            this.f119082c = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(30612350, i10, -1, "com.meijer.mobile.singlepagecheckout.CartSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditCartSubstitutionCard.kt:126)");
            }
            if (!this.f119080a.c().isEmpty() && this.f119081b < this.f119080a.c().size()) {
                EntryDecorator entryDecorator = this.f119080a.c().get(this.f119081b);
                Modifier modifierV = androidx.compose.foundation.layout.J.v(Modifier.INSTANCE, this.f119082c.getAdsSpacing().getNine().getDp());
                String imageUrl = entryDecorator.getImageUrl();
                String str = imageUrl == null ? "" : imageUrl;
                String name = entryDecorator.getName();
                String imageUrl2 = entryDecorator.getImageUrl();
                C13806b.b(modifierV, str, name, imageUrl2 == null ? "" : imageUrl2, InterfaceC5926k.INSTANCE.e(), false, P0.e.INSTANCE.e(), null, 0.0f, composer, 1597440, HttpResponseStatus.ERROR_REQUESTED_RANGE_NOT_SATISFIABLE);
            }
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
    static final class b implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119083a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f119084a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f119085b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.W$b$a$a, reason: collision with other inner class name */
            static final class C1924a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f119086a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC15153W f119087b;

                C1924a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                    this.f119086a = localThemeScope;
                    this.f119087b = interfaceC15153W;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(373424242, i10, -1, "com.meijer.mobile.singlepagecheckout.CartSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditCartSubstitutionCard.kt:163)");
                    }
                    si.j.h(this.f119086a, this.f119087b.getLabels().getInfoBlockMessage(), C16338g.c(C15042c.f140908e, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W) {
                this.f119084a = localThemeScope;
                this.f119085b = interfaceC15153W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1205136378, i10, -1, "com.meijer.mobile.singlepagecheckout.CartSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditCartSubstitutionCard.kt:162)");
                }
                C4107g.e(null, 0.0f, ComposableLambdaKt.c(373424242, true, new C1924a(this.f119084a, this.f119085b), composer, 54), composer, 384, 3);
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

        b(LocalThemeScope localThemeScope) {
            this.f119083a = localThemeScope;
        }

        public final void a(InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1212168045, i10, -1, "com.meijer.mobile.singlepagecheckout.CartSection.<anonymous>.<anonymous>.<anonymous> (EditCartSubstitutionCard.kt:161)");
            }
            C16912d.e(this.f119083a, Assemble.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.c(-1205136378, true, new a(this.f119083a, Assemble), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.InfoBlock.f142332c << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            a(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119088a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f119089b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f119090c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f119091d;

        c(LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, Function0<Unit> function0, Function0<Unit> function02) {
            this.f119088a = localThemeScope;
            this.f119089b = checkoutViewState;
            this.f119090c = function0;
            this.f119091d = function02;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1396884438, i10, -1, "com.meijer.mobile.singlepagecheckout.EditCartSubstitutionCard.<anonymous> (EditCartSubstitutionCard.kt:77)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, this.f119088a.getAdsSpacing().getFive().getDp());
            LocalThemeScope localThemeScope = this.f119088a;
            CheckoutViewState checkoutViewState = this.f119089b;
            Function0<Unit> function0 = this.f119090c;
            Function0<Unit> function02 = this.f119091d;
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14903g c14903g = C14903g.f139698a;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.l(), composer, 0);
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
            Composer composerA2 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion3.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            q1.Label labelY = q1.Label.y(new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 383, null), InterfaceC14888I.b(C14889J.f139620a, companion, 1.0f, false, 2, null), null, null, null, 0, false, 0, null, null, 510, null);
            String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100611P9, composer, 0);
            int i11 = LocalThemeScope.f17314g;
            si.j.h(localThemeScope, labelY, strC, null, composer, (q1.Label.f142335j << 3) | i11, 4);
            C16671b.b(localThemeScope, new q1.h.DrawableIcon(C.i.b.f17093d, null, null, null, 0.0f, null, null, 126, null), null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            composer.v();
            C17983Z.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 5, null), localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
            W.m(localThemeScope, checkoutViewState.getCartItems(), function0, composer, i11);
            C17983Z.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 5, null), localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
            W.v(localThemeScope, checkoutViewState.getSubstitutionPreference(), companion, null, function02, composer, i11 | 3456, 0);
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
    static final class d implements Function3<InterfaceC15153W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f119092a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f119093b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f119094a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC15153W f119095b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f119096c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.W$d$a$a, reason: collision with other inner class name */
            static final class C1925a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f119097a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC15153W f119098b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f119099c;

                C1925a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W, String str) {
                    this.f119097a = localThemeScope;
                    this.f119098b = interfaceC15153W;
                    this.f119099c = str;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(813196636, i10, -1, "com.meijer.mobile.singlepagecheckout.SubstitutionPreferenceSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditCartSubstitutionCard.kt:213)");
                    }
                    si.j.h(this.f119097a, this.f119098b.getLabels().getInfoBlockMessage(), this.f119099c, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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

            a(LocalThemeScope localThemeScope, InterfaceC15153W interfaceC15153W, String str) {
                this.f119094a = localThemeScope;
                this.f119095b = interfaceC15153W;
                this.f119096c = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(790084680, i10, -1, "com.meijer.mobile.singlepagecheckout.SubstitutionPreferenceSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditCartSubstitutionCard.kt:212)");
                }
                C4107g.e(null, 0.0f, ComposableLambdaKt.c(813196636, true, new C1925a(this.f119094a, this.f119095b, this.f119096c), composer, 54), composer, 384, 3);
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

        d(LocalThemeScope localThemeScope, String str) {
            this.f119092a = localThemeScope;
            this.f119093b = str;
        }

        public final void a(InterfaceC15153W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(2101479259, i10, -1, "com.meijer.mobile.singlepagecheckout.SubstitutionPreferenceSection.<anonymous>.<anonymous>.<anonymous> (EditCartSubstitutionCard.kt:211)");
            }
            C16912d.e(this.f119092a, Assemble.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.c(790084680, true, new a(this.f119092a, Assemble, this.f119093b), composer, 54), composer, LocalThemeScope.f17314g | 384 | (q1.InfoBlock.f142332c << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15153W interfaceC15153W, Composer composer, Integer num) {
            a(interfaceC15153W, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(LocalThemeScope localThemeScope, final CartItemsDecorator cartItemsDecorator, final Function0<Unit> function0, Composer composer, final int i10) {
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Composer composerStartRestartGroup = composer.startRestartGroup(-57019619);
        int i11 = (i10 & 6) == 0 ? ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10 : i10;
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(cartItemsDecorator) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-57019619, i12, -1, "com.meijer.mobile.singlepagecheckout.CartSection (EditCartSubstitutionCard.kt:116)");
            }
            Unit unit = null;
            Modifier modifierD = androidx.compose.foundation.layout.J.D(androidx.compose.foundation.layout.J.h(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5800d.f48779a.o(localThemeScope2.getAdsSpacing().getFour().getDp()), P0.e.INSTANCE.l(), composerStartRestartGroup, 0);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierD);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            composerStartRestartGroup.startReplaceGroup(645097806);
            int i13 = 0;
            for (EnumC13028b enumC13028b : f119079a) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.w();
                }
                k(localThemeScope2, null, ComposableLambdaKt.c(30612350, true, new a(cartItemsDecorator, i13, localThemeScope2), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f17314g | 384, 1);
                localThemeScope2 = localThemeScope;
                i13 = i14;
            }
            composerStartRestartGroup.P();
            String extraItemCount = cartItemsDecorator.getExtraItemCount();
            composerStartRestartGroup.startReplaceGroup(645121756);
            if (extraItemCount != null) {
                Modifier modifierC = androidx.compose.foundation.layout.A.c(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getTen().getDp()), 0.0f, H1.h.p(-localThemeScope.getAdsSpacing().getTwo().getDp()), 1, null);
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.b(), P0.e.INSTANCE.k(), composerStartRestartGroup, 6);
                int iA2 = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierC);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A2 = companion2.a();
                if (composerStartRestartGroup.k() == null) {
                    C5859f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.I(function0A2);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyA, companion2.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5884sR2, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                si.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null), cartItemsDecorator.getExtraItemCount(), null, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14) | (q1.Label.f142335j << 3), 4);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.v();
                unit = Unit.f143329a;
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(645121283);
            if (unit == null) {
                localThemeScope2 = localThemeScope;
                k(localThemeScope2, null, null, composerStartRestartGroup, LocalThemeScope.f17314g | (i12 & 14), 3);
            } else {
                localThemeScope2 = localThemeScope;
            }
            composerStartRestartGroup.P();
            C14890K.a(InterfaceC14888I.b(c14889j, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            String strC = C16338g.c(com.meijer.mobile.meijer.Y.f100777Y4, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i12 & 896) == 256;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.M
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W.n(function0);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            int i15 = LocalThemeScope.f17314g;
            int i16 = i12 & 14;
            r(localThemeScope2, strC, (Function0) objB, composerStartRestartGroup, i15 | i16);
            composerStartRestartGroup.v();
            Integer error = cartItemsDecorator.getError();
            composerStartRestartGroup.startReplaceGroup(1038782450);
            if (error != null) {
                Ki.Q.e(localThemeScope2, ki.L0.f141930a, ComposableLambdaKt.c(-1212168045, true, new b(localThemeScope2), composerStartRestartGroup, 54), composerStartRestartGroup, i15 | 384 | i16 | (ki.L0.f141931b << 3));
                Unit unit2 = Unit.f143329a;
            }
            composerStartRestartGroup.P();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.singlepagecheckout.N
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return W.o(localThemeScope2, cartItemsDecorator, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, Modifier modifier, Function2 function2, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, modifier, function2, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, CartItemsDecorator cartItemsDecorator, Function0 function0, int i10, Composer composer, int i11) {
        m(localThemeScope, cartItemsDecorator, function0, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ki.LocalThemeScope r19, androidx.compose.ui.Modifier r20, final com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, final kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.W.p(Ki.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.D1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, CheckoutViewState checkoutViewState, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, modifier, checkoutViewState, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final void r(final LocalThemeScope localThemeScope, final String str, final Function0<Unit> function0, Composer composer, final int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-559721500);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(str) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function0) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-559721500, i11, -1, "com.meijer.mobile.singlepagecheckout.SPCEditButton (EditCartSubstitutionCard.kt:233)");
            }
            Ki.I eight = localThemeScope.getAdsTypography().getHeadings().getEight();
            Ki.T adsColorEnabled01 = localThemeScope.getAdsColors().getAdsColorEnabled01();
            Modifier modifierC = androidx.compose.foundation.layout.A.c(androidx.compose.foundation.layout.D.m(Modifier.INSTANCE, 0.0f, 0.0f, localThemeScope.getAdsSpacing().getFour().getDp(), 0.0f, 11, null), 0.0f, localThemeScope.getAdsSpacing().getTwo().getDp(), 1, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z10 = (i11 & 896) == 256;
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.singlepagecheckout.S
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return W.s(function0);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            Modifier modifierD = ClickableKt.d(modifierC, false, null, null, (Function0) objB, 7, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function1() { // from class: com.meijer.mobile.singlepagecheckout.T
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return W.t((r1.u) obj);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            si.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsAttribute(C16819m.d(modifierD, false, (Function1) objB2, 1, null), "Button", str), adsColorEnabled01, null, null, 0, false, 0, eight, null, 380, null), C16338g.c(com.meijer.mobile.meijer.Y.f100492J4, composerStartRestartGroup, 0), null, composerStartRestartGroup, (q1.Label.f142335j << 3) | (i11 & 14) | LocalThemeScope.f17314g, 4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.singlepagecheckout.U
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return W.u(localThemeScope, str, function0, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        r1.s.s0(semantics, Role.INSTANCE.a());
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, String str, Function0 function0, int i10, Composer composer, int i11) {
        r(localThemeScope, str, function0, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(final Ki.LocalThemeScope r33, com.meijer.mobile.meijer.activity.checkout.review.SubstitutionPreferenceDecorator r34, androidx.compose.ui.Modifier r35, java.lang.String r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.W.v(Ki.M, com.meijer.mobile.meijer.activity.checkout.review.Y1, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, SubstitutionPreferenceDecorator substitutionPreferenceDecorator, Modifier modifier, String str, Function0 function0, int i10, int i11, Composer composer, int i12) {
        v(localThemeScope, substitutionPreferenceDecorator, modifier, str, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    private static final void k(final LocalThemeScope localThemeScope, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-48691689);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i17 != 0) {
                function2 = C13052h.f119210a.a();
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-48691689, i12, -1, "com.meijer.mobile.singlepagecheckout.CartItemContainer (EditCartSubstitutionCard.kt:256)");
            }
            Modifier modifierV = androidx.compose.foundation.layout.J.v(modifier, localThemeScope.getAdsSpacing().getNine().getDp());
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierV);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i12 >> 6) & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        final Function2<? super Composer, ? super Integer, Unit> function22 = function2;
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.singlepagecheckout.V
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return W.l(localThemeScope, modifier2, function22, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Function0 function0) {
        function0.invoke();
        return Unit.f143329a;
    }
}
