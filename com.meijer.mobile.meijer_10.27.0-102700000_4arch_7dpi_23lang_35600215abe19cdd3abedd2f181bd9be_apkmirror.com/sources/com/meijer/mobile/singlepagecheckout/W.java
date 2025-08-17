package com.meijer.mobile.singlepagecheckout;

import Ji.C;
import Ji.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.InterfaceC5784k;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.semantics.Role;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.checkout.review.CartItemsDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState;
import com.meijer.mobile.meijer.activity.checkout.review.EntryDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.SubstitutionPreferenceDecorator;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import dk.C13530b;
import ii.C14732c;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import ji.InterfaceC14919W;
import ji.q1;
import kotlin.C17917Z;
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
import p1.C16193g;
import pi.C16307b;
import qi.C16531d;
import r1.C16705m;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u001aA\u0010\t\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\r\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u0013\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a)\u0010\u0017\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a-\u0010\u001a\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%²\u0006\u000e\u0010!\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010#\u001a\u00020\"8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0012\u001a\u0004\u0018\u00010$8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010!\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010#\u001a\u00020\"8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00118\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/meijer/mobile/meijer/activity/checkout/review/D1;", "viewState", "Lkotlin/Function0;", "", "onEditCart", "onEditSubstitutionPreference", "p", "(LJi/M;Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/review/D1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/u;", "cartItemsDecorator", "m", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/u;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;", "substitutionPreference", "", "error", "v", "(LJi/M;Lcom/meijer/mobile/meijer/activity/checkout/review/Y1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "fullStoryId", "onClick", "r", "(LJi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "content", "k", "(LJi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/enums/EnumEntries;", "Lcom/meijer/mobile/singlepagecheckout/b;", "a", "Lkotlin/enums/EnumEntries;", "cartItems", "lastAction", "", "displayError", "", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    private static final EnumEntries<EnumC12902b> f118085a = EnumC12902b.b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CartItemsDecorator f118086a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f118087b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118088c;

        a(CartItemsDecorator cartItemsDecorator, int i10, LocalThemeScope localThemeScope) {
            this.f118086a = cartItemsDecorator;
            this.f118087b = i10;
            this.f118088c = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(30612350, i10, -1, "com.meijer.mobile.singlepagecheckout.CartSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditCartSubstitutionCard.kt:126)");
            }
            if (!this.f118086a.c().isEmpty() && this.f118087b < this.f118086a.c().size()) {
                EntryDecorator entryDecorator = this.f118086a.c().get(this.f118087b);
                Modifier modifierV = androidx.compose.foundation.layout.J.v(Modifier.INSTANCE, this.f118088c.getAdsSpacing().getNine().getDp());
                String imageUrl = entryDecorator.getImageUrl();
                String str = imageUrl == null ? "" : imageUrl;
                String name = entryDecorator.getName();
                String imageUrl2 = entryDecorator.getImageUrl();
                C13530b.b(modifierV, str, name, imageUrl2 == null ? "" : imageUrl2, InterfaceC5784k.INSTANCE.e(), false, P0.e.INSTANCE.e(), null, 0.0f, composer, 1597440, HttpResponseStatus.ERROR_REQUESTED_RANGE_NOT_SATISFIABLE);
            }
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
    static final class b implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118089a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118090a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f118091b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.W$b$a$a, reason: collision with other inner class name */
            static final class C1915a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f118092a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC14919W f118093b;

                C1915a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                    this.f118092a = localThemeScope;
                    this.f118093b = interfaceC14919W;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(373424242, i10, -1, "com.meijer.mobile.singlepagecheckout.CartSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditCartSubstitutionCard.kt:163)");
                    }
                    ri.j.h(this.f118092a, this.f118093b.getLabels().getInfoBlockMessage(), C16193g.c(C14732c.f138022e, composer, 0), null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W) {
                this.f118090a = localThemeScope;
                this.f118091b = interfaceC14919W;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1205136378, i10, -1, "com.meijer.mobile.singlepagecheckout.CartSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditCartSubstitutionCard.kt:162)");
                }
                kotlin.g.e(null, 0.0f, ComposableLambdaKt.c(373424242, true, new C1915a(this.f118090a, this.f118091b), composer, 54), composer, 384, 3);
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

        b(LocalThemeScope localThemeScope) {
            this.f118089a = localThemeScope;
        }

        public final void a(InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-1212168045, i10, -1, "com.meijer.mobile.singlepagecheckout.CartSection.<anonymous>.<anonymous>.<anonymous> (EditCartSubstitutionCard.kt:161)");
            }
            C16531d.e(this.f118089a, Assemble.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.c(-1205136378, true, new a(this.f118089a, Assemble), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.InfoBlock.f140077c << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            a(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class c implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118094a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CheckoutViewState f118095b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f118096c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f118097d;

        c(LocalThemeScope localThemeScope, CheckoutViewState checkoutViewState, Function0<Unit> function0, Function0<Unit> function02) {
            this.f118094a = localThemeScope;
            this.f118095b = checkoutViewState;
            this.f118096c = function0;
            this.f118097d = function02;
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
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, this.f118094a.getAdsSpacing().getFive().getDp());
            LocalThemeScope localThemeScope = this.f118094a;
            CheckoutViewState checkoutViewState = this.f118095b;
            Function0<Unit> function0 = this.f118096c;
            Function0<Unit> function02 = this.f118097d;
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
            Composer composerA = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
            C14815g c14815g = C14815g.f139108a;
            Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.l(), composer, 0);
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
            Composer composerA2 = androidx.compose.runtime.D1.a(composer);
            androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
            androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
            if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                composerA2.t(Integer.valueOf(iA2));
                composerA2.n(Integer.valueOf(iA2), function2B2);
            }
            androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
            q1.Label labelY = q1.Label.y(new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSix(), null, 383, null), InterfaceC14800I.b(C14801J.f139030a, companion, 1.0f, false, 2, null), null, null, null, 0, false, 0, null, null, 510, null);
            String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99692M9, composer, 0);
            int i11 = LocalThemeScope.f15770g;
            ri.j.h(localThemeScope, labelY, strC, null, composer, (q1.Label.f140080j << 3) | i11, 4);
            C16307b.b(localThemeScope, new q1.h.DrawableIcon(C.i.b.f15549d, null, null, null, 0.0f, null, null, 126, null), null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
            composer.v();
            C17917Z.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 5, null), localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
            W.m(localThemeScope, checkoutViewState.getCartItems(), function0, composer, i11);
            C17917Z.a(androidx.compose.foundation.layout.D.m(companion, 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 0.0f, localThemeScope.getAdsSpacing().getThree().getDp(), 5, null), localThemeScope.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 0, 12);
            W.v(localThemeScope, checkoutViewState.getSubstitutionPreference(), companion, null, function02, composer, i11 | 3456, 0);
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
    static final class d implements Function3<InterfaceC14919W, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f118098a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f118099b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f118100a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC14919W f118101b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f118102c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.W$d$a$a, reason: collision with other inner class name */
            static final class C1916a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f118103a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC14919W f118104b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ String f118105c;

                C1916a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, String str) {
                    this.f118103a = localThemeScope;
                    this.f118104b = interfaceC14919W;
                    this.f118105c = str;
                }

                public final void a(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(813196636, i10, -1, "com.meijer.mobile.singlepagecheckout.SubstitutionPreferenceSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditCartSubstitutionCard.kt:213)");
                    }
                    ri.j.h(this.f118103a, this.f118104b.getLabels().getInfoBlockMessage(), this.f118105c, null, composer, LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
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

            a(LocalThemeScope localThemeScope, InterfaceC14919W interfaceC14919W, String str) {
                this.f118100a = localThemeScope;
                this.f118101b = interfaceC14919W;
                this.f118102c = str;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(790084680, i10, -1, "com.meijer.mobile.singlepagecheckout.SubstitutionPreferenceSection.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditCartSubstitutionCard.kt:212)");
                }
                kotlin.g.e(null, 0.0f, ComposableLambdaKt.c(813196636, true, new C1916a(this.f118100a, this.f118101b, this.f118102c), composer, 54), composer, 384, 3);
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

        d(LocalThemeScope localThemeScope, String str) {
            this.f118098a = localThemeScope;
            this.f118099b = str;
        }

        public final void a(InterfaceC14919W Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(2101479259, i10, -1, "com.meijer.mobile.singlepagecheckout.SubstitutionPreferenceSection.<anonymous>.<anonymous>.<anonymous> (EditCartSubstitutionCard.kt:211)");
            }
            C16531d.e(this.f118098a, Assemble.getInfoBlocks().getErrorBlock(), ComposableLambdaKt.c(790084680, true, new a(this.f118098a, Assemble, this.f118099b), composer, 54), composer, LocalThemeScope.f15770g | 384 | (q1.InfoBlock.f140077c << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14919W interfaceC14919W, Composer composer, Integer num) {
            a(interfaceC14919W, composer, num.intValue());
            return Unit.f142422a;
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
            MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(C5658d.f48555a.o(localThemeScope2.getAdsSpacing().getFour().getDp()), P0.e.INSTANCE.l(), composerStartRestartGroup, 0);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierD);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyB, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C14801J c14801j = C14801J.f139030a;
            composerStartRestartGroup.startReplaceGroup(645097806);
            int i13 = 0;
            for (EnumC12902b enumC12902b : f118085a) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    CollectionsKt.w();
                }
                k(localThemeScope2, null, ComposableLambdaKt.c(30612350, true, new a(cartItemsDecorator, i13, localThemeScope2), composerStartRestartGroup, 54), composerStartRestartGroup, (i12 & 14) | LocalThemeScope.f15770g | 384, 1);
                localThemeScope2 = localThemeScope;
                i13 = i14;
            }
            composerStartRestartGroup.P();
            String extraItemCount = cartItemsDecorator.getExtraItemCount();
            composerStartRestartGroup.startReplaceGroup(645121756);
            if (extraItemCount != null) {
                Modifier modifierC = androidx.compose.foundation.layout.A.c(androidx.compose.foundation.layout.J.i(Modifier.INSTANCE, localThemeScope.getAdsSpacing().getTen().getDp()), 0.0f, H1.h.p(-localThemeScope.getAdsSpacing().getTwo().getDp()), 1, null);
                MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.b(), P0.e.INSTANCE.k(), composerStartRestartGroup, 6);
                int iA2 = C5717f.a(composerStartRestartGroup, 0);
                InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierC);
                InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A2 = companion2.a();
                if (composerStartRestartGroup.k() == null) {
                    C5717f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.I(function0A2);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA2 = androidx.compose.runtime.D1.a(composerStartRestartGroup);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyA, companion2.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion2.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion2.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion2.f());
                C14815g c14815g = C14815g.f139108a;
                ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null), cartItemsDecorator.getExtraItemCount(), null, composerStartRestartGroup, LocalThemeScope.f15770g | (i12 & 14) | (q1.Label.f140080j << 3), 4);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.v();
                unit = Unit.f142422a;
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.startReplaceGroup(645121283);
            if (unit == null) {
                localThemeScope2 = localThemeScope;
                k(localThemeScope2, null, null, composerStartRestartGroup, LocalThemeScope.f15770g | (i12 & 14), 3);
            } else {
                localThemeScope2 = localThemeScope;
            }
            composerStartRestartGroup.P();
            C14802K.a(InterfaceC14800I.b(c14801j, Modifier.INSTANCE, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            String strC = C16193g.c(com.meijer.mobile.meijer.Y.f99915Y4, composerStartRestartGroup, 0);
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
            int i15 = LocalThemeScope.f15770g;
            int i16 = i12 & 14;
            r(localThemeScope2, strC, (Function0) objB, composerStartRestartGroup, i15 | i16);
            composerStartRestartGroup.v();
            Integer error = cartItemsDecorator.getError();
            composerStartRestartGroup.startReplaceGroup(1038782450);
            if (error != null) {
                Ji.Q.e(localThemeScope2, ji.L0.f139675a, ComposableLambdaKt.c(-1212168045, true, new b(localThemeScope2), composerStartRestartGroup, 54), composerStartRestartGroup, i15 | 384 | i16 | (ji.L0.f139676b << 3));
                Unit unit2 = Unit.f142422a;
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
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(LocalThemeScope localThemeScope, CartItemsDecorator cartItemsDecorator, Function0 function0, int i10, Composer composer, int i11) {
        m(localThemeScope, cartItemsDecorator, function0, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
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
    public static final void p(final Ji.LocalThemeScope r19, androidx.compose.ui.Modifier r20, final com.meijer.mobile.meijer.activity.checkout.review.CheckoutViewState r21, final kotlin.jvm.functions.Function0<kotlin.Unit> r22, final kotlin.jvm.functions.Function0<kotlin.Unit> r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.W.p(Ji.M, androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.review.D1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, Modifier modifier, CheckoutViewState checkoutViewState, Function0 function0, Function0 function02, int i10, int i11, Composer composer, int i12) {
        p(localThemeScope, modifier, checkoutViewState, function0, function02, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
            Ji.I eight = localThemeScope.getAdsTypography().getHeadings().getEight();
            Ji.T adsColorEnabled01 = localThemeScope.getAdsColors().getAdsColorEnabled01();
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
            ri.j.h(localThemeScope, new q1.Label(FullStoryAnnotationsKt.fsAttribute(C16705m.d(modifierD, false, (Function1) objB2, 1, null), "Button", str), adsColorEnabled01, null, null, 0, false, 0, eight, null, 380, null), C16193g.c(com.meijer.mobile.meijer.Y.f99630J4, composerStartRestartGroup, 0), null, composerStartRestartGroup, (q1.Label.f140080j << 3) | (i11 & 14) | LocalThemeScope.f15770g, 4);
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
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(LocalThemeScope localThemeScope, String str, Function0 function0, int i10, Composer composer, int i11) {
        r(localThemeScope, str, function0, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
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
    public static final void v(final Ji.LocalThemeScope r33, com.meijer.mobile.meijer.activity.checkout.review.SubstitutionPreferenceDecorator r34, androidx.compose.ui.Modifier r35, java.lang.String r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.singlepagecheckout.W.v(Ji.M, com.meijer.mobile.meijer.activity.checkout.review.Y1, androidx.compose.ui.Modifier, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(r1.u semantics) {
        Intrinsics.j(semantics, "$this$semantics");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, SubstitutionPreferenceDecorator substitutionPreferenceDecorator, Modifier modifier, String str, Function0 function0, int i10, int i11, Composer composer, int i12) {
        v(localThemeScope, substitutionPreferenceDecorator, modifier, str, function0, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
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
                function2 = C12925h.f118215a.a();
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-48691689, i12, -1, "com.meijer.mobile.singlepagecheckout.CartItemContainer (EditCartSubstitutionCard.kt:256)");
            }
            Modifier modifierV = androidx.compose.foundation.layout.J.v(modifier, localThemeScope.getAdsSpacing().getNine().getDp());
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierV);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = androidx.compose.runtime.D1.a(composerStartRestartGroup);
            androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion.e());
            androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            androidx.compose.runtime.D1.c(composerA, modifierE, companion.f());
            C5664j c5664j = C5664j.f48612a;
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
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }
}
