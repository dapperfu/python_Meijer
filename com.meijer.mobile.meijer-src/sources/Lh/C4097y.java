package Lh;

import Gh.a;
import Ih.C3834a;
import Ki.LocalThemeScope;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import bk.AbstractC6392a;
import bk.C6393b;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import d0.C13590y;
import dk.C13698b;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import ki.ProductCardTags;
import ki.q1;
import kotlin.C17983Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import p1.C16338g;
import yr.C18370z;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a9\u0010\t\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a-\u0010\u0011\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a1\u0010\u0016\u001a\u00020\u0007*\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u001c²\u0006\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0019\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\r8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\r8\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "LIh/a$a;", "addressesCardViewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "LGh/a;", "", "onNavigationRequest", "h", "(LKi/M;LIh/a$a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "m", "(LKi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "isPrimaryAddress", "", PlaceTypes.ADDRESS, "f", "(LKi/M;ZLjava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lbk/a;", "emptyStateTitle", "emptyStateDescription", "k", "(LKi/M;Lbk/a;Lbk/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lastAction", "isLoading", "showEmptyState", "showPrimaryAddress", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Lh.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4097y {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Lh.y$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18932a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f18933b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f18934c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Lh.y$a$a, reason: collision with other inner class name */
        /* synthetic */ class C0334a extends AdaptedFunctionReference implements Function1<LocalThemeScope, ProductCardTags> {

            /* renamed from: h, reason: collision with root package name */
            public static final C0334a f18935h = new C0334a();

            C0334a() {
                super(1, ProductCardTags.class, "<init>", "<init>(Lcom/meijer/mobile/android_acres_library/foundations/v2/LocalThemeScope;Lcom/meijer/mobile/android_acres_library/assemblies/TagTemplates$ProductCardTags;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ProductCardTags invoke(LocalThemeScope p02) {
                Intrinsics.j(p02, "p0");
                return new ProductCardTags(p02, null, 2, null);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Lh.y$a$b */
        static final class b implements Function3<ProductCardTags, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f18936a;

            b(LocalThemeScope localThemeScope) {
                this.f18936a = localThemeScope;
            }

            public final void a(ProductCardTags Assemble, Composer composer, int i10) {
                int i11;
                Intrinsics.j(Assemble, "$this$Assemble");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(Assemble) : composer.D(Assemble) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-158697217, i11, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.AddressDetails.<anonymous>.<anonymous>.<anonymous> (AddressesCard.kt:161)");
                }
                Ii.h.h(this.f18936a, q1.Tag.y(Assemble.getTags().getPickupOnly(), this.f18936a.getAdsColors().getAdsColorBrandPrimary(), q1.Label.y(Assemble.getTags().getPickupOnly().getLabel(), Assemble.getTags().getPickupOnly().getLabel().getModifier().then(androidx.compose.foundation.layout.D.k(C18370z.f(Modifier.INSTANCE, "primary_address_tag", null, 2, null), H1.h.p(4), 0.0f, 2, null)), this.f18936a.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, null, null, 508, null), null, null, 12, null), C16338g.c(Gh.h.f12935m4, composer, 0), null, composer, (q1.Tag.f142423e << 3) | LocalThemeScope.f17314g, 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ProductCardTags productCardTags, Composer composer, Integer num) {
                a(productCardTags, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, boolean z10, String str) {
            this.f18932a = localThemeScope;
            this.f18933b = z10;
            this.f18934c = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2139985946, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.AddressDetails.<anonymous> (AddressesCard.kt:158)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, this.f18932a.getAdsSpacing().getThree().getDp());
            boolean z10 = this.f18933b;
            LocalThemeScope localThemeScope = this.f18932a;
            String str = this.f18934c;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierI);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
            composer.startReplaceGroup(-1259151038);
            if (z10) {
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = C0334a.f18935h;
                    composer.t(objB);
                }
                composer.P();
                Ki.Q.f(localThemeScope, (Function1) objB, ComposableLambdaKt.c(-158697217, true, new b(localThemeScope), composer, 54), composer, LocalThemeScope.f17314g | 432);
                C14890K.a(androidx.compose.foundation.layout.J.i(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            }
            composer.P();
            si.j.h(localThemeScope, new q1.Label(C18370z.f(companion, PlaceTypes.ADDRESS, null, 2, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null), str, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
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
    /* renamed from: Lh.y$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f18937a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Modifier f18938b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C3834a.AddressesCardViewState f18939c;

        b(LocalThemeScope localThemeScope, Modifier modifier, C3834a.AddressesCardViewState addressesCardViewState) {
            this.f18937a = localThemeScope;
            this.f18938b = modifier;
            this.f18939c = addressesCardViewState;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1244971901, i10, -1, "com.meijer.mobile.accounts.ux.composables.basescreen.AddressesCard.<anonymous> (AddressesCard.kt:73)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierI = androidx.compose.foundation.layout.D.i(companion, this.f18937a.getAdsSpacing().getFive().getDp());
            LocalThemeScope localThemeScope = this.f18937a;
            Modifier modifier = this.f18938b;
            C3834a.AddressesCardViewState addressesCardViewState = this.f18939c;
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
            int i11 = LocalThemeScope.f17314g;
            C4097y.m(localThemeScope, modifierH, composer, i11 | 48, 0);
            C14890K.a(androidx.compose.foundation.layout.J.i(modifier, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
            C17983Z.a(null, 0L, 0.0f, 0.0f, composer, 0, 15);
            if (addressesCardViewState.getIsLoading()) {
                composer.startReplaceGroup(1196457212);
                yr.N.b(localThemeScope, null, composer, i11, 1);
                composer.P();
            } else {
                composer.startReplaceGroup(1196561930);
                C14890K.a(androidx.compose.foundation.layout.J.i(modifier, localThemeScope.getAdsSpacing().getFive().getDp()), composer, 0);
                composer.startReplaceGroup(177147371);
                if (!C6393b.a(addressesCardViewState.getSavedAddressesMessage())) {
                    si.j.h(localThemeScope, new q1.Label(C18370z.f(companion, "saved_addresses_message", null, 2, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven().d(localThemeScope.getAdsColors().getAdsColorText02()), null, 382, null), C13698b.a(addressesCardViewState.getSavedAddressesMessage(), composer, AbstractC6392a.f60445b), null, composer, i11 | (q1.Label.f142335j << 3), 4);
                    C14890K.a(androidx.compose.foundation.layout.J.i(modifier, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                }
                composer.P();
                Modifier modifierH2 = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5800d.g(), companion2.i(), composer, 48);
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
                C13590y.a(C16335d.c(Gh.e.f12636a, composer, 0), C16338g.c(Gh.h.f12909j, composer, 0), C18370z.f(companion, "addresses_image", null, 2, null), null, null, 0.0f, null, composer, 0, BinsView.TOTE_HEIGHT_DP);
                C14890K.a(androidx.compose.foundation.layout.J.z(modifier, localThemeScope.getAdsSpacing().getSeven().getDp()), composer, 0);
                String address = addressesCardViewState.getAddress();
                if (address == null || address.length() <= 0) {
                    composer.startReplaceGroup(-1611351544);
                    AbstractC6392a emptyStateTitle = addressesCardViewState.getEmptyStateTitle();
                    AbstractC6392a emptyStateDescription = addressesCardViewState.getEmptyStateDescription();
                    int i12 = AbstractC6392a.f60445b;
                    C4097y.k(localThemeScope, emptyStateTitle, emptyStateDescription, null, composer, (i12 << 3) | i11 | (i12 << 6), 4);
                    composer.P();
                } else {
                    composer.startReplaceGroup(-1611574744);
                    C4097y.f(localThemeScope, addressesCardViewState.getIsPrimaryAddress(), addressesCardViewState.getAddress(), null, composer, i11, 4);
                    composer.P();
                }
                composer.v();
                composer.P();
            }
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ki.LocalThemeScope r18, final boolean r19, final java.lang.String r20, androidx.compose.ui.Modifier r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.C4097y.f(Ki.M, boolean, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(LocalThemeScope localThemeScope, boolean z10, String str, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        f(localThemeScope, z10, str, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final Ki.LocalThemeScope r21, final Ih.C3834a.AddressesCardViewState r22, androidx.compose.ui.Modifier r23, final kotlin.jvm.functions.Function1<? super Gh.a, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.C4097y.h(Ki.M, Ih.a$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function1 function1) {
        function1.invoke(new a.Addresses(false));
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(LocalThemeScope localThemeScope, C3834a.AddressesCardViewState addressesCardViewState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        h(localThemeScope, addressesCardViewState, modifier, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final Ki.LocalThemeScope r39, final bk.AbstractC6392a r40, final bk.AbstractC6392a r41, androidx.compose.ui.Modifier r42, androidx.compose.runtime.Composer r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.C4097y.k(Ki.M, bk.a, bk.a, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(LocalThemeScope localThemeScope, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        k(localThemeScope, abstractC6392a, abstractC6392a2, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(Ki.LocalThemeScope r30, androidx.compose.ui.Modifier r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Lh.C4097y.m(Ki.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        m(localThemeScope, modifier, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
