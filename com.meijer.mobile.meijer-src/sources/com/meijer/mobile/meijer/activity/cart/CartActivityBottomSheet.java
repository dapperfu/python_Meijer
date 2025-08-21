package com.meijer.mobile.meijer.activity.cart;

import Bm.C2985b0;
import Ki.LocalThemeScope;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.ComposeView;
import bk.AbstractC6392a;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet;
import com.meijer.mobile.meijer.activity.checkout.review.AdjustEbtPaymentDecorator;
import com.meijer.mobile.meijer.activity.checkout.review.C12078f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16338g;
import r0.C16806i;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0001\u0018\u0000 F2\u00020\u0001:\u0002*.BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b\"\u0010#R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010/\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010/\u001a\u0004\b8\u00101\"\u0004\b9\u00103R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R$\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010;\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010/\u001a\u0004\bD\u00101\"\u0004\bE\u00103¨\u0006G"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/CartActivityBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lcom/meijer/mobile/meijer/activity/checkout/review/p;", "adjustEbtPaymentDecorator", "Lcom/meijer/mobile/meijer/activity/cart/CartActivityBottomSheet$b;", "listener", "", "isAdjustEbt", "isEZCDEnabled", "isDisplayPinPadScreen", "", "ebtTimerText", "acculynkPostBody", "isShowTimer", "<init>", "(Lcom/meijer/mobile/meijer/activity/checkout/review/p;Lcom/meijer/mobile/meijer/activity/cart/CartActivityBottomSheet$b;ZZZLjava/lang/String;Ljava/lang/String;Z)V", "", "F0", "(ZLandroidx/compose/runtime/Composer;I)V", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "", "getTheme", "()I", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "g1", "()V", "a", "Lcom/meijer/mobile/meijer/activity/checkout/review/p;", "L0", "()Lcom/meijer/mobile/meijer/activity/checkout/review/p;", "j1", "(Lcom/meijer/mobile/meijer/activity/checkout/review/p;)V", "b", "Lcom/meijer/mobile/meijer/activity/cart/CartActivityBottomSheet$b;", "N0", "()Lcom/meijer/mobile/meijer/activity/cart/CartActivityBottomSheet$b;", "c", "Z", "U0", "()Z", "i1", "(Z)V", "d", "Y0", "l1", "e", "V0", "k1", "f", "Ljava/lang/String;", "M0", "()Ljava/lang/String;", "m1", "(Ljava/lang/String;)V", "g", "K0", "h1", "h", "a1", "n1", "i", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CartActivityBottomSheet extends BottomSheetDialogFragment {

    /* renamed from: j, reason: collision with root package name */
    public static final int f101940j = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private AdjustEbtPaymentDecorator adjustEbtPaymentDecorator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b listener;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isAdjustEbt;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isEZCDEnabled;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isDisplayPinPadScreen;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String ebtTimerText;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String acculynkPostBody;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean isShowTimer;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f101950b;

        a(boolean z10) {
            this.f101950b = z10;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            k(localThemeScope, composer, num.intValue());
            return Unit.f143329a;
        }

        public final void k(LocalThemeScope AdsTheme, Composer composer, int i10) {
            int i11;
            Intrinsics.j(AdsTheme, "$this$AdsTheme");
            if ((i10 & 6) == 0) {
                i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2138033681, i11, -1, "com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.CartActivityBottomSheetContent.<anonymous> (CartActivityBottomSheet.kt:90)");
            }
            if (CartActivityBottomSheet.this.getIsDisplayPinPadScreen()) {
                composer.startReplaceGroup(-203542946);
                boolean isShowTimer = CartActivityBottomSheet.this.getIsShowTimer();
                String ebtTimerText = CartActivityBottomSheet.this.getEbtTimerText();
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(CartActivityBottomSheet.this);
                final CartActivityBottomSheet cartActivityBottomSheet = CartActivityBottomSheet.this;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.M
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CartActivityBottomSheet.a.l(cartActivityBottomSheet);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(CartActivityBottomSheet.this);
                final CartActivityBottomSheet cartActivityBottomSheet2 = CartActivityBottomSheet.this;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.N
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CartActivityBottomSheet.a.q(cartActivityBottomSheet2, (String) obj);
                        }
                    };
                    composer.t(objB2);
                }
                Function1 function1 = (Function1) objB2;
                composer.P();
                String acculynkPostBody = CartActivityBottomSheet.this.getAcculynkPostBody();
                Intrinsics.g(acculynkPostBody);
                composer.startReplaceGroup(5004770);
                boolean zD3 = composer.D(CartActivityBottomSheet.this);
                final CartActivityBottomSheet cartActivityBottomSheet3 = CartActivityBottomSheet.this;
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.O
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CartActivityBottomSheet.a.r(cartActivityBottomSheet3);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                Im.h.e(AdsTheme, null, isShowTimer, ebtTimerText, false, function0, function1, acculynkPostBody, (Function0) objB3, composer, LocalThemeScope.f17314g | 24576 | (i11 & 14), 1);
                composer.P();
            } else if (this.f101950b) {
                composer.startReplaceGroup(-202709015);
                float f10 = 10;
                Modifier modifierD = androidx.compose.foundation.b.d(T0.e.a(Modifier.INSTANCE, C16806i.e(H1.h.p(f10), H1.h.p(f10), 0.0f, 0.0f, 12, null)), AdsTheme.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
                AdjustEbtPaymentDecorator adjustEbtPaymentDecorator = CartActivityBottomSheet.this.getAdjustEbtPaymentDecorator();
                composer.startReplaceGroup(5004770);
                boolean zD4 = composer.D(CartActivityBottomSheet.this);
                final CartActivityBottomSheet cartActivityBottomSheet4 = CartActivityBottomSheet.this;
                Object objB4 = composer.B();
                if (zD4 || objB4 == Composer.INSTANCE.a()) {
                    objB4 = new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.P
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CartActivityBottomSheet.a.s(cartActivityBottomSheet4);
                        }
                    };
                    composer.t(objB4);
                }
                Function0 function02 = (Function0) objB4;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD5 = composer.D(CartActivityBottomSheet.this);
                final CartActivityBottomSheet cartActivityBottomSheet5 = CartActivityBottomSheet.this;
                Object objB5 = composer.B();
                if (zD5 || objB5 == Composer.INSTANCE.a()) {
                    objB5 = new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.Q
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CartActivityBottomSheet.a.t(cartActivityBottomSheet5);
                        }
                    };
                    composer.t(objB5);
                }
                Function0 function03 = (Function0) objB5;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD6 = composer.D(CartActivityBottomSheet.this);
                final CartActivityBottomSheet cartActivityBottomSheet6 = CartActivityBottomSheet.this;
                Object objB6 = composer.B();
                if (zD6 || objB6 == Composer.INSTANCE.a()) {
                    objB6 = new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.S
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CartActivityBottomSheet.a.o(cartActivityBottomSheet6, ((Double) obj).doubleValue());
                        }
                    };
                    composer.t(objB6);
                }
                composer.P();
                C12078f.c(AdsTheme, modifierD, adjustEbtPaymentDecorator, function02, function03, (Function1) objB6, composer, (i11 & 14) | LocalThemeScope.f17314g | (AbstractC6392a.f60445b << 6), 0);
                composer.P();
            } else if (CartActivityBottomSheet.this.getIsEZCDEnabled()) {
                composer.startReplaceGroup(-201920592);
                float f11 = 10;
                Modifier modifierD2 = androidx.compose.foundation.b.d(T0.e.a(Modifier.INSTANCE, C16806i.e(H1.h.p(f11), H1.h.p(f11), 0.0f, 0.0f, 12, null)), AdsTheme.getAdsColors().getAdsColorUIBackground01().getColor(), null, 2, null);
                String strC = C16338g.c(com.meijer.mobile.meijer.Y.f101255w5, composer, 0);
                String strC2 = C16338g.c(com.meijer.mobile.meijer.Y.f101235v5, composer, 0);
                composer.startReplaceGroup(5004770);
                boolean zD7 = composer.D(CartActivityBottomSheet.this);
                final CartActivityBottomSheet cartActivityBottomSheet7 = CartActivityBottomSheet.this;
                Object objB7 = composer.B();
                if (zD7 || objB7 == Composer.INSTANCE.a()) {
                    objB7 = new Function0() { // from class: com.meijer.mobile.meijer.activity.cart.T
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CartActivityBottomSheet.a.p(cartActivityBottomSheet7);
                        }
                    };
                    composer.t(objB7);
                }
                composer.P();
                C2985b0.g(AdsTheme, modifierD2, strC, strC2, null, (Function0) objB7, composer, LocalThemeScope.f17314g | (i11 & 14), 8);
                composer.P();
            } else {
                composer.startReplaceGroup(-201366095);
                composer.P();
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit l(CartActivityBottomSheet cartActivityBottomSheet) {
            cartActivityBottomSheet.getListener().B();
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit o(CartActivityBottomSheet cartActivityBottomSheet, double d10) {
            cartActivityBottomSheet.getListener().x0(d10);
            cartActivityBottomSheet.getListener().r0();
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit p(CartActivityBottomSheet cartActivityBottomSheet) {
            cartActivityBottomSheet.getListener().r0();
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit q(CartActivityBottomSheet cartActivityBottomSheet, String str) {
            cartActivityBottomSheet.getListener().g0(str);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit r(CartActivityBottomSheet cartActivityBottomSheet) {
            if (cartActivityBottomSheet.getIsShowTimer()) {
                cartActivityBottomSheet.getListener().M();
            } else {
                cartActivityBottomSheet.getListener().w();
            }
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(CartActivityBottomSheet cartActivityBottomSheet) {
            cartActivityBottomSheet.getListener().r0();
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit t(CartActivityBottomSheet cartActivityBottomSheet) {
            cartActivityBottomSheet.getListener().M0();
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0004J\u0019\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/CartActivityBottomSheet$b;", "", "", "M0", "()V", "", "amount", "x0", "(D)V", "r0", "w", "", "results", "g0", "(Ljava/lang/String;)V", "B", "M", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {
        void B();

        void M();

        void M0();

        void g0(String results);

        void r0();

        void w();

        void x0(double amount);
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements Function2<Composer, Integer, Unit> {
        d() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1099507488, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.onCreateView.<anonymous>.<anonymous> (CartActivityBottomSheet.kt:74)");
            }
            CartActivityBottomSheet cartActivityBottomSheet = CartActivityBottomSheet.this;
            cartActivityBottomSheet.F0(cartActivityBottomSheet.getIsAdjustEbt(), composer, 0);
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
    static final class e implements Function2<Composer, Integer, Unit> {
        e() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2129677487, i10, -1, "com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.refreshView.<anonymous> (CartActivityBottomSheet.kt:82)");
            }
            CartActivityBottomSheet cartActivityBottomSheet = CartActivityBottomSheet.this;
            cartActivityBottomSheet.F0(cartActivityBottomSheet.getIsAdjustEbt(), composer, 0);
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
    public static final Unit H0(CartActivityBottomSheet cartActivityBottomSheet, boolean z10, int i10, Composer composer, int i11) {
        cartActivityBottomSheet.F0(z10, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f143329a;
    }

    public CartActivityBottomSheet(AdjustEbtPaymentDecorator adjustEbtPaymentDecorator, b listener, boolean z10, boolean z11, boolean z12, String str, String str2, boolean z13) {
        Intrinsics.j(listener, "listener");
        this.adjustEbtPaymentDecorator = adjustEbtPaymentDecorator;
        this.listener = listener;
        this.isAdjustEbt = z10;
        this.isEZCDEnabled = z11;
        this.isDisplayPinPadScreen = z12;
        this.ebtTimerText = str;
        this.acculynkPostBody = str2;
        this.isShowTimer = z13;
    }

    /* renamed from: K0, reason: from getter */
    public final String getAcculynkPostBody() {
        return this.acculynkPostBody;
    }

    /* renamed from: L0, reason: from getter */
    public final AdjustEbtPaymentDecorator getAdjustEbtPaymentDecorator() {
        return this.adjustEbtPaymentDecorator;
    }

    /* renamed from: M0, reason: from getter */
    public final String getEbtTimerText() {
        return this.ebtTimerText;
    }

    /* renamed from: N0, reason: from getter */
    public final b getListener() {
        return this.listener;
    }

    /* renamed from: U0, reason: from getter */
    public final boolean getIsAdjustEbt() {
        return this.isAdjustEbt;
    }

    /* renamed from: V0, reason: from getter */
    public final boolean getIsDisplayPinPadScreen() {
        return this.isDisplayPinPadScreen;
    }

    /* renamed from: Y0, reason: from getter */
    public final boolean getIsEZCDEnabled() {
        return this.isEZCDEnabled;
    }

    /* renamed from: a1, reason: from getter */
    public final boolean getIsShowTimer() {
        return this.isShowTimer;
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return Cj.p.f5109h;
    }

    public final void h1(String str) {
        this.acculynkPostBody = str;
    }

    public final void i1(boolean z10) {
        this.isAdjustEbt = z10;
    }

    public final void j1(AdjustEbtPaymentDecorator adjustEbtPaymentDecorator) {
        this.adjustEbtPaymentDecorator = adjustEbtPaymentDecorator;
    }

    public final void k1(boolean z10) {
        this.isDisplayPinPadScreen = z10;
    }

    public final void l1(boolean z10) {
        this.isEZCDEnabled = z10;
    }

    public final void m1(String str) {
        this.ebtTimerText = str;
    }

    public final void n1(boolean z10) {
        this.isShowTimer = z10;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(requireContext(), getTheme());
        aVar.n().X0(3);
        aVar.n().W0(true);
        return aVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.j(inflater, "inflater");
        View viewInflate = inflater.inflate(com.meijer.mobile.meijer.V.f100181H, container, false);
        ((ComposeView) viewInflate.findViewById(com.meijer.mobile.meijer.T.f99627B)).setContent(ComposableLambdaKt.composableLambdaInstance(1099507488, true, new d()));
        return viewInflate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0(final boolean z10, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1317318720);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.a(z10)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(this)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1317318720, i11, -1, "com.meijer.mobile.meijer.activity.cart.CartActivityBottomSheet.CartActivityBottomSheetContent (CartActivityBottomSheet.kt:88)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(2138033681, true, new a(z10), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.cart.L
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CartActivityBottomSheet.H0(this.f102469a, z10, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final void g1() {
        ComposeView composeView;
        View view = getView();
        if (view != null && (composeView = (ComposeView) view.findViewById(com.meijer.mobile.meijer.T.f99627B)) != null) {
            composeView.setContent(ComposableLambdaKt.composableLambdaInstance(2129677487, true, new e()));
        }
    }
}
