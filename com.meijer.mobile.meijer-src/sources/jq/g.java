package jq;

import Ci.o;
import F1.j;
import Ki.I;
import Ki.LocalThemeScope;
import Ki.T;
import P0.e;
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bk.AbstractC6392a;
import d0.C13590y;
import dk.C13698b;
import e.C13736d;
import hq.ShopAndScanCheckoutSummaryDecorator;
import j0.C14889J;
import j0.C14890K;
import j0.C14903g;
import j0.InterfaceC14882C;
import j0.InterfaceC14888I;
import java.util.List;
import jq.h;
import ki.InterfaceC15154X;
import ki.q1;
import kotlin.C17983Z;
import kotlin.C18009i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16335d;
import p1.C16338g;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\r\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a1\u0010\u000f\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a9\u0010\u0011\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00050\nH\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00138\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Ljq/h;", "viewModel", "Landroidx/compose/ui/Modifier;", "modifier", "", "r", "(LKi/M;Ljq/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Ljq/h$f;", "viewState", "Lkotlin/Function1;", "Ljq/h$b;", "sendEvent", "j", "(LKi/M;Landroidx/compose/ui/Modifier;Ljq/h$f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "g", "(LKi/M;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "l", "(LKi/M;Ljq/h$f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", "loaderState", "isError", "shopandscan_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f141134a;

        a(LocalThemeScope localThemeScope) {
            this.f141134a = localThemeScope;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-683779502, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.checkout.CheckoutAppBar.<anonymous> (ShopAndScanCheckoutScreen.kt:137)");
            }
            g.h(this.f141134a, C16338g.c(com.meijer.mobile.shopandscan.e.f117875O, composer, 0), composer, 0);
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
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f141135a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<h.b, Unit> f141136b;

        /* JADX WARN: Multi-variable type inference failed */
        b(LocalThemeScope localThemeScope, Function1<? super h.b, Unit> function1) {
            this.f141135a = localThemeScope;
            this.f141136b = function1;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2013323391, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.checkout.CheckoutContent.<anonymous> (ShopAndScanCheckoutScreen.kt:94)");
            }
            g.g(this.f141135a, null, this.f141136b, composer, LocalThemeScope.f17314g, 1);
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
    static final class c implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f141137a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h.CheckoutState f141138b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<h.b, Unit> f141139c;

        /* JADX WARN: Multi-variable type inference failed */
        c(LocalThemeScope localThemeScope, h.CheckoutState checkoutState, Function1<? super h.b, Unit> function1) {
            this.f141137a = localThemeScope;
            this.f141138b = checkoutState;
            this.f141139c = function1;
        }

        public final void a(InterfaceC14882C paddingValues, Composer composer, int i10) {
            Intrinsics.j(paddingValues, "paddingValues");
            if ((i10 & 6) == 0) {
                i10 |= composer.V(paddingValues) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1839933592, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.checkout.CheckoutContent.<anonymous> (ShopAndScanCheckoutScreen.kt:97)");
            }
            g.l(this.f141137a, this.f141138b, D.h(Modifier.INSTANCE, paddingValues), this.f141139c, composer, LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 3), 0);
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
    static final class d implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Modifier f141140a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f141141b;

        d(Modifier modifier, LocalThemeScope localThemeScope) {
            this.f141140a = modifier;
            this.f141141b = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(1195955983, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.checkout.CheckoutContentComponent.<anonymous> (ShopAndScanCheckoutScreen.kt:149)");
            }
            q1.k.Large largeLoading = Assemble.getLoading().getLargeLoading();
            o oVar = o.f4629a;
            Ci.m.d(this.f141141b, J.f(this.f141140a, 0.0f, 1, null), largeLoading, oVar, C16338g.c(com.meijer.mobile.shopandscan.e.f117852F, composer, 0), null, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.Large.f142345f << 6), 48);
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

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\u008a\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0013"}, d2 = {"jq/g$e", "", "", "image", "description", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: jq.g$e, reason: from toString */
    public static final /* data */ class CheckoutHeaderData {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int image;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int description;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CheckoutHeaderData)) {
                return false;
            }
            CheckoutHeaderData checkoutHeaderData = (CheckoutHeaderData) other;
            return this.image == checkoutHeaderData.image && this.description == checkoutHeaderData.description;
        }

        /* renamed from: a, reason: from getter */
        public final int getDescription() {
            return this.description;
        }

        /* renamed from: b, reason: from getter */
        public final int getImage() {
            return this.image;
        }

        public int hashCode() {
            return (Integer.hashCode(this.image) * 31) + Integer.hashCode(this.description);
        }

        public String toString() {
            return "CheckoutHeaderData(image=" + this.image + ", description=" + this.description + ')';
        }

        public CheckoutHeaderData(int i10, int i11) {
            this.image = i10;
            this.description = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(LocalThemeScope localThemeScope, String str, Composer composer, int i10) {
        composer.startReplaceGroup(-1160522548);
        if (ComposerKt.M()) {
            ComposerKt.U(-1160522548, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.checkout.CheckoutAppBar.CheckoutToolbarTitle (ShopAndScanCheckoutScreen.kt:112)");
        }
        si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorInverse(), null, null, 0, false, 0, localThemeScope.getAdsTypography().getHeadings().getSeven(), null, 381, null), str, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3) | ((i10 << 6) & 896), 4);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(LocalThemeScope localThemeScope, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        g(localThemeScope, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void j(final Ki.LocalThemeScope r33, androidx.compose.ui.Modifier r34, final jq.h.CheckoutState r35, final kotlin.jvm.functions.Function1<? super jq.h.b, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jq.g.j(Ki.M, androidx.compose.ui.Modifier, jq.h$f, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(LocalThemeScope localThemeScope, Modifier modifier, h.CheckoutState checkoutState, Function1 function1, int i10, int i11, Composer composer, int i12) {
        j(localThemeScope, modifier, checkoutState, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final Ki.LocalThemeScope r18, final jq.h.CheckoutState r19, androidx.compose.ui.Modifier r20, final kotlin.jvm.functions.Function1<? super jq.h.b, kotlin.Unit> r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jq.g.l(Ki.M, jq.h$f, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void m(LocalThemeScope localThemeScope, Modifier modifier, String str, AbstractC6392a abstractC6392a, boolean z10, boolean z11, Composer composer, int i10, int i11) {
        Modifier modifierM;
        composer.startReplaceGroup(340906084);
        Modifier modifier2 = (i11 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.M()) {
            ComposerKt.U(340906084, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.checkout.CheckoutContentComponent.CheckoutAmount (ShopAndScanCheckoutScreen.kt:230)");
        }
        I seven = z10 ? localThemeScope.getAdsTypography().getHeadings().getSeven() : z11 ? localThemeScope.getAdsTypography().getValues().getThree() : localThemeScope.getAdsTypography().getBodyCompact().getOne();
        if (z10) {
            modifierM = D.k(Modifier.INSTANCE, 0.0f, H1.h.p(0), 1, null);
        } else if (z11) {
            float f10 = 8;
            modifierM = D.m(Modifier.INSTANCE, 0.0f, H1.h.p(f10), 0.0f, H1.h.p(f10), 5, null);
        } else {
            modifierM = D.m(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, H1.h.p(4), 7, null);
        }
        Modifier modifier3 = modifierM;
        T adsColorText01 = (z10 || z11) ? localThemeScope.getAdsColors().getAdsColorText01() : localThemeScope.getAdsColors().getAdsColorText02();
        T t10 = adsColorText01;
        MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
        int iA = C5859f.a(composer, 0);
        InterfaceC5884s interfaceC5884sR = composer.r();
        Modifier modifierE = androidx.compose.ui.b.e(composer, modifier2);
        InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
        Function0<InterfaceC5953g> function0A = companion.a();
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
        D1.c(composerA, measurePolicyB, companion.e());
        D1.c(composerA, interfaceC5884sR, companion.g());
        Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
            composerA.t(Integer.valueOf(iA));
            composerA.n(Integer.valueOf(iA), function2B);
        }
        D1.c(composerA, modifierE, companion.f());
        C14889J c14889j = C14889J.f139620a;
        j.Companion companion2 = F1.j.INSTANCE;
        q1.Label label = new q1.Label(modifier3, t10, null, F1.j.h(companion2.a()), 0, false, 0, seven, null, 372, null);
        int i12 = LocalThemeScope.f17314g;
        int i13 = q1.Label.f142335j;
        si.j.h(localThemeScope, label, str, null, composer, i12 | (i13 << 3) | ((i10 << 3) & 896), 4);
        C14890K.a(InterfaceC14888I.b(c14889j, Modifier.INSTANCE, 1.0f, false, 2, null), composer, 0);
        si.j.h(localThemeScope, new q1.Label(modifier3, t10, null, F1.j.h(companion2.a()), 0, false, 0, seven, null, 372, null), C13698b.a(abstractC6392a, composer, AbstractC6392a.f60445b | ((i10 >> 6) & 14)), null, composer, i12 | (i13 << 3), 4);
        composer.v();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    private static final void o(LocalThemeScope localThemeScope, Modifier modifier, ShopAndScanCheckoutSummaryDecorator shopAndScanCheckoutSummaryDecorator, Composer composer, int i10, int i11) {
        composer.startReplaceGroup(-238353697);
        Modifier modifier2 = (i11 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.M()) {
            ComposerKt.U(-238353697, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.checkout.CheckoutContentComponent.CheckoutReceipt (ShopAndScanCheckoutScreen.kt:276)");
        }
        Modifier modifierK = D.k(J.h(modifier2, 0.0f, 1, null), H1.h.p(16), 0.0f, 2, null);
        e.Companion companion = P0.e.INSTANCE;
        MeasurePolicy measurePolicyG = C5804h.g(companion.m(), false);
        int iA = C5859f.a(composer, 0);
        InterfaceC5884s interfaceC5884sR = composer.r();
        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierK);
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
        D1.c(composerA, measurePolicyG, companion2.e());
        D1.c(composerA, interfaceC5884sR, companion2.g());
        Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
        if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
            composerA.t(Integer.valueOf(iA));
            composerA.n(Integer.valueOf(iA), function2B);
        }
        D1.c(composerA, modifierE, companion2.f());
        C5806j c5806j = C5806j.f48836a;
        Modifier modifierF = J.f(D.k(modifier2, H1.h.p(14), 0.0f, 2, null), 0.0f, 1, null);
        MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), companion.g(), composer, 48);
        int iA2 = C5859f.a(composer, 0);
        InterfaceC5884s interfaceC5884sR2 = composer.r();
        Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierF);
        Function0<InterfaceC5953g> function0A2 = companion2.a();
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
        D1.c(composerA2, measurePolicyA, companion2.e());
        D1.c(composerA2, interfaceC5884sR2, companion2.g());
        Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
        if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
            composerA2.t(Integer.valueOf(iA2));
            composerA2.n(Integer.valueOf(iA2), function2B2);
        }
        D1.c(composerA2, modifierE2, companion2.f());
        C14903g c14903g = C14903g.f139698a;
        String strC = C16338g.c(com.meijer.mobile.shopandscan.e.f117843C, composer, 0);
        AbstractC6392a itemTotal = shopAndScanCheckoutSummaryDecorator.getItemTotal();
        int i12 = AbstractC6392a.f60445b;
        m(localThemeScope, null, strC, itemTotal, false, false, composer, (i12 << 6) | 27648, 1);
        m(localThemeScope, null, C16338g.c(com.meijer.mobile.shopandscan.e.f117974z, composer, 0), shopAndScanCheckoutSummaryDecorator.getEstimatedTaxes(), false, false, composer, (i12 << 6) | 27648, 1);
        m(localThemeScope, null, C16338g.c(com.meijer.mobile.shopandscan.e.f117846D, composer, 0), shopAndScanCheckoutSummaryDecorator.getSubtotal(), true, false, composer, (i12 << 6) | 27648, 1);
        Modifier.Companion companion3 = Modifier.INSTANCE;
        float f10 = 12;
        C14890K.a(J.i(companion3, H1.h.p(f10)), composer, 6);
        m(localThemeScope, null, C16338g.c(com.meijer.mobile.shopandscan.e.f117849E, composer, 0), shopAndScanCheckoutSummaryDecorator.getTotalSavings(), true, false, composer, (i12 << 6) | 27648, 1);
        C14890K.a(J.i(companion3, H1.h.p(f10)), composer, 6);
        C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIBorder02().getColor(), 0.0f, 0.0f, composer, 0, 13);
        m(localThemeScope, null, C16338g.c(com.meijer.mobile.shopandscan.e.f117837A, composer, 0), shopAndScanCheckoutSummaryDecorator.getEstimatedTotal(), false, true, composer, (i12 << 6) | 27648, 1);
        C17983Z.a(null, localThemeScope.getAdsColors().getAdsColorUIBorder02().getColor(), 0.0f, 0.0f, composer, 0, 13);
        C14890K.a(J.i(companion3, H1.h.p(f10)), composer, 6);
        si.j.h(localThemeScope, new q1.Label(null, localThemeScope.getAdsColors().getAdsColorText02(), null, F1.j.h(F1.j.INSTANCE.f()), 0, false, 0, localThemeScope.getAdsTypography().getDetail().getOne(), null, 373, null), C16338g.c(com.meijer.mobile.shopandscan.e.f117840B, composer, 0), null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
        composer.v();
        composer.v();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    private static final void p(LocalThemeScope localThemeScope, Modifier modifier, String str, String str2, Z0.c cVar, Composer composer, int i10, int i11) {
        composer.startReplaceGroup(-1444483938);
        Modifier modifier2 = (i11 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if (ComposerKt.M()) {
            ComposerKt.U(-1444483938, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.checkout.CheckoutContentComponent.SimpleCheckoutImage (ShopAndScanCheckoutScreen.kt:171)");
        }
        float f10 = 30;
        Modifier modifierM = D.m(modifier2, H1.h.p(f10), 0.0f, H1.h.p(f10), 0.0f, 10, null);
        C5800d c5800d = C5800d.f48779a;
        float fP = H1.h.p(16);
        e.Companion companion = P0.e.INSTANCE;
        MeasurePolicy measurePolicyA = C5807k.a(c5800d.q(fP, companion.l()), companion.g(), composer, 54);
        int iA = C5859f.a(composer, 0);
        InterfaceC5884s interfaceC5884sR = composer.r();
        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierM);
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
        C13590y.a(cVar, null, null, null, null, 0.0f, null, composer, ((i10 >> 9) & 14) | 48, 124);
        C5800d.m mVarQ = c5800d.q(H1.h.p(8), companion.l());
        e.b bVarG = companion.g();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        MeasurePolicy measurePolicyA2 = C5807k.a(mVarQ, bVarG, composer, 54);
        int iA2 = C5859f.a(composer, 0);
        InterfaceC5884s interfaceC5884sR2 = composer.r();
        Modifier modifierE2 = androidx.compose.ui.b.e(composer, companion3);
        Function0<InterfaceC5953g> function0A2 = companion2.a();
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
        D1.c(composerA2, measurePolicyA2, companion2.e());
        D1.c(composerA2, interfaceC5884sR2, companion2.g());
        Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion2.b();
        if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
            composerA2.t(Integer.valueOf(iA2));
            composerA2.n(Integer.valueOf(iA2), function2B2);
        }
        D1.c(composerA2, modifierE2, companion2.f());
        I six = localThemeScope.getAdsTypography().getHeadings().getSix();
        T adsColorText01 = localThemeScope.getAdsColors().getAdsColorText01();
        j.Companion companion4 = F1.j.INSTANCE;
        q1.Label label = new q1.Label(null, adsColorText01, null, F1.j.h(companion4.a()), 0, false, 0, six, null, 373, null);
        int i12 = LocalThemeScope.f17314g;
        int i13 = q1.Label.f142335j;
        si.j.h(localThemeScope, label, str, null, composer, (i13 << 3) | i12 | ((i10 << 3) & 896), 4);
        float f11 = 13;
        si.j.h(localThemeScope, new q1.Label(D.m(companion3, H1.h.p(f11), 0.0f, H1.h.p(f11), 0.0f, 10, null), localThemeScope.getAdsColors().getAdsColorText02(), null, F1.j.h(companion4.a()), 0, false, 0, localThemeScope.getAdsTypography().getBodyCompact().getOne(), null, 372, null), str2, null, composer, (i13 << 3) | i12 | (i10 & 896), 4);
        composer.v();
        composer.v();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(LocalThemeScope localThemeScope, h.CheckoutState checkoutState, Modifier modifier, Function1 function1, int i10, int i11, Composer composer, int i12) {
        l(localThemeScope, checkoutState, modifier, function1, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    public static final void r(final LocalThemeScope localThemeScope, final h viewModel, Modifier modifier, Composer composer, final int i10, final int i11) {
        int i12;
        final Modifier modifier2;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(1373484187);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(viewModel) ? 32 : 16;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier2 = modifier;
        } else {
            if (i13 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.M()) {
                ComposerKt.U(1373484187, i12, -1, "com.meijer.mobile.shopandscan.presentation.view.checkout.CheckoutScreen (ShopAndScanCheckoutScreen.kt:71)");
            }
            Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            final Activity activity = context instanceof Activity ? (Activity) context : null;
            h.CheckoutState checkoutStateS = s(o1.b(viewModel.getCheckoutModelStore().b(), null, composerStartRestartGroup, 0, 1));
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD = composerStartRestartGroup.D(viewModel);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new Function1() { // from class: jq.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g.t(viewModel, (h.b) obj);
                    }
                };
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.P();
            j(localThemeScope, modifier3, checkoutStateS, (Function1) objB, composerStartRestartGroup, ((i12 >> 3) & 112) | LocalThemeScope.f17314g | (i12 & 14) | (AbstractC6392a.f60445b << 6), 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zD2 = composerStartRestartGroup.D(activity);
            Object objB2 = composerStartRestartGroup.B();
            if (zD2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new Function0() { // from class: jq.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g.u(activity);
                    }
                };
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.P();
            C13736d.a(false, (Function0) objB2, composerStartRestartGroup, 0, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier2 = modifier3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: jq.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.v(localThemeScope, viewModel, modifier2, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(h hVar, h.b event) {
        Intrinsics.j(event, "event");
        hVar.u(event);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Activity activity) {
        if (activity != null) {
            activity.finish();
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(LocalThemeScope localThemeScope, h hVar, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        r(localThemeScope, hVar, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(final LocalThemeScope localThemeScope, Modifier modifier, final Function1<? super h.b, Unit> function1, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        Modifier modifier2;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1658811798);
        if ((i11 & Integer.MIN_VALUE) != 0) {
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
            i12 = i10 | i13;
        } else {
            i12 = i10;
        }
        if ((i12 & 3) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            modifier3 = modifier;
        } else {
            if ((i11 & 1) != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1658811798, i12, -1, "com.meijer.mobile.shopandscan.presentation.view.checkout.CheckoutAppBar (ShopAndScanCheckoutScreen.kt:109)");
            }
            C18009i.d(ComposableLambdaKt.c(-683779502, true, new a(localThemeScope), composerStartRestartGroup, 54), Modifier.INSTANCE, null, null, 0L, 0L, 0.0f, composerStartRestartGroup, 54, 124);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier3 = modifier2;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: jq.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.i(localThemeScope, modifier3, function1, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void n(LocalThemeScope localThemeScope, Modifier modifier, List<CheckoutHeaderData> list, Composer composer, int i10, int i11) {
        composer.startReplaceGroup(1235338101);
        if ((i11 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        Modifier modifier2 = modifier;
        if (ComposerKt.M()) {
            ComposerKt.U(1235338101, i10, -1, "com.meijer.mobile.shopandscan.presentation.view.checkout.CheckoutContentComponent.CheckoutImage (ShopAndScanCheckoutScreen.kt:209)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
        int iA = C5859f.a(composer, 0);
        InterfaceC5884s interfaceC5884sR = composer.r();
        Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
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
        p(localThemeScope, modifier2, C16338g.c(com.meijer.mobile.shopandscan.e.f117873N, composer, 0), C16338g.c(list.get(1).getDescription(), composer, 0), C16335d.c(list.get(1).getImage(), composer, 0), composer, i10 & 14, 0);
        composer.v();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
    }

    private static final h.CheckoutState s(z1<h.CheckoutState> z1Var) {
        return z1Var.getValue();
    }
}
