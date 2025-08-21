package com.meijer.mobile.accounts.ux.basescreen;

import Eh.AccountChip;
import Eh.ProfileInfo;
import Gh.a;
import Ki.LocalThemeScope;
import Lh.X0;
import Sh.ContactUsDecorator;
import V2.CreationExtras;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.ComponentActivity;
import androidx.view.e0;
import androidx.view.f0;
import androidx.view.g0;
import com.fullstory.FS;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.accounts.ux.basescreen.H;
import e.C13737e;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import le.C15485b;
import yr.C18370z;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u0019\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0014¢\u0006\u0004\b \u0010\u0003R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00108\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001b\u0010>\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006A²\u0006\f\u0010@\u001a\u00020?8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/accounts/ux/basescreen/YourAccountActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "D1", "c2", "LGh/a;", "accountNavigationRequest", "O1", "(LGh/a;)V", "", "isChip", "V1", "(Z)V", "T1", "P1", "X1", "R1", "F1", "", "E1", "(Z)Ljava/lang/String;", "a2", "L1", "H1", "K1", "Z1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "Lzl/k;", "v", "Lzl/k;", "getFeatureManager", "()Lzl/k;", "setFeatureManager", "(Lzl/k;)V", "featureManager", "Lhi/a;", "w", "Lhi/a;", "getAnalyticsEngine", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "analyticsEngine", "LDl/e;", "x", "LDl/e;", "B1", "()LDl/e;", "setMeijerDeepLinkParser", "(LDl/e;)V", "meijerDeepLinkParser", "Lcom/meijer/mobile/accounts/ux/basescreen/H;", "y", "Lkotlin/Lazy;", "C1", "()Lcom/meijer/mobile/accounts/ux/basescreen/H;", "viewModel", "Lcom/meijer/mobile/accounts/ux/basescreen/H$a;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class YourAccountActivity extends Hilt_YourAccountActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerDeepLinkParser;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e0(Reflection.b(H.class), new c(this), new b(this), new d(null, this));

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.accounts.ux.basescreen.YourAccountActivity$a$a, reason: collision with other inner class name */
        static final class C1332a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ YourAccountActivity f95126a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.accounts.ux.basescreen.YourAccountActivity$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1333a extends FunctionReferenceImpl implements Function0<Unit> {
                C1333a(Object obj) {
                    super(0, obj, YourAccountActivity.class, "launchSettings", "launchSettings()V", 0);
                }

                public final void a() {
                    ((YourAccountActivity) this.receiver).D1();
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    a();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.accounts.ux.basescreen.YourAccountActivity$a$a$b */
            /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Gh.a, Unit> {
                b(Object obj) {
                    super(1, obj, YourAccountActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/accounts/ux/AccountNavigationRequest;)V", 0);
                }

                public final void a(Gh.a p02) {
                    Intrinsics.j(p02, "p0");
                    ((YourAccountActivity) this.receiver).O1(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Gh.a aVar) {
                    a(aVar);
                    return Unit.f143329a;
                }
            }

            C1332a(YourAccountActivity yourAccountActivity) {
                this.f95126a = yourAccountActivity;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                    ComposerKt.U(-2077033932, i11, -1, "com.meijer.mobile.accounts.ux.basescreen.YourAccountActivity.onCreate.<anonymous>.<anonymous> (YourAccountActivity.kt:91)");
                }
                z1 z1VarB = o1.b(this.f95126a.C1().s(), null, composer, 0, 1);
                Modifier modifierC = C18370z.c(FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.f(Modifier.INSTANCE, 0.0f, 1, null)), false, 1, null);
                List<AccountChip> listC = b(z1VarB).c();
                ProfileInfo profileInfo = b(z1VarB).getProfileInfo();
                ContactUsDecorator contactUsDecorator = b(z1VarB).getContactUsDecorator();
                boolean isLoggedIn = b(z1VarB).getIsLoggedIn();
                boolean isNotificationEnabled = b(z1VarB).getIsNotificationEnabled();
                YourAccountActivity yourAccountActivity = this.f95126a;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(yourAccountActivity);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1333a(yourAccountActivity);
                    composer.t(objB);
                }
                KFunction kFunction = (KFunction) objB;
                composer.P();
                YourAccountActivity yourAccountActivity2 = this.f95126a;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(yourAccountActivity2);
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new b(yourAccountActivity2);
                    composer.t(objB2);
                }
                composer.P();
                X0.b(AdsTheme, listC, profileInfo, contactUsDecorator, isLoggedIn, isNotificationEnabled, modifierC, (Function0) kFunction, (Function1) ((KFunction) objB2), composer, LocalThemeScope.f17314g | (i11 & 14), 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            private static final H.YourAccountsViewState b(z1<H.YourAccountsViewState> z1Var) {
                return z1Var.getValue();
            }
        }

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1313604773, i10, -1, "com.meijer.mobile.accounts.ux.basescreen.YourAccountActivity.onCreate.<anonymous> (YourAccountActivity.kt:90)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(-2077033932, true, new C1332a(YourAccountActivity.this), composer, 54), composer, 48, 1);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/f0$c;", "invoke", "()Landroidx/lifecycle/f0$c;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends Lambda implements Function0<f0.c> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95127f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.f95127f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final f0.c invoke() {
            return this.f95127f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "Landroidx/lifecycle/g0;", "invoke", "()Landroidx/lifecycle/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends Lambda implements Function0<g0> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95128f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.f95128f = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final g0 invoke() {
            return this.f95128f.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c0;", "VM", "LV2/a;", "invoke", "()LV2/a;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends Lambda implements Function0<CreationExtras> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0 f95129f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f95130g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f95129f = function0;
            this.f95130g = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f95129f;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f95130g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H C1() {
        return (H) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D1() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        intent.addCategory("android.intent.category.DEFAULT");
        intent.addFlags(268435456);
        intent.addFlags(1073741824);
        intent.addFlags(8388608);
        startActivity(intent);
    }

    private final String E1(boolean isChip) {
        return isChip ? "accounts:carousel" : "accounts:cards";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G1(YourAccountActivity yourAccountActivity, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.p(yourAccountActivity.E1(z10));
        track.m(TrackingData.a.b.f137705a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f143329a;
    }

    private final void K1() {
        startActivity(Bl.f.f3124a.a(this, getFeatureManager().e(AbstractC18503f.h0.f172881h)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O1(Gh.a accountNavigationRequest) {
        if (accountNavigationRequest instanceof a.Profile) {
            V1(((a.Profile) accountNavigationRequest).getIsChip());
            return;
        }
        if (accountNavigationRequest instanceof a.Preferences) {
            T1(((a.Preferences) accountNavigationRequest).getIsChip());
            return;
        }
        if (accountNavigationRequest instanceof a.Orders) {
            P1(((a.Orders) accountNavigationRequest).getIsChip());
            return;
        }
        if (accountNavigationRequest instanceof a.Savings) {
            X1(((a.Savings) accountNavigationRequest).getIsChip());
            return;
        }
        if (accountNavigationRequest instanceof a.Payments) {
            R1(((a.Payments) accountNavigationRequest).getIsChip());
            return;
        }
        if (accountNavigationRequest instanceof a.Addresses) {
            F1(((a.Addresses) accountNavigationRequest).getIsChip());
            return;
        }
        if (Intrinsics.e(accountNavigationRequest, a.t.f12624a)) {
            a2();
            return;
        }
        if (Intrinsics.e(accountNavigationRequest, a.b.f12604a)) {
            H1();
            return;
        }
        if (Intrinsics.e(accountNavigationRequest, a.f.f12608a)) {
            L1();
            return;
        }
        if (Intrinsics.e(accountNavigationRequest, a.k.f12614a)) {
            finish();
        } else if (Intrinsics.e(accountNavigationRequest, a.c.f12605a)) {
            K1();
        } else if (Intrinsics.e(accountNavigationRequest, a.s.f12623a)) {
            Z1();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q1(YourAccountActivity yourAccountActivity, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.o("Order History Page:Online");
        track.p(yourAccountActivity.E1(z10));
        track.m(TrackingData.a.b.f137705a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S1(YourAccountActivity yourAccountActivity, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.p(yourAccountActivity.E1(z10));
        track.m(TrackingData.a.b.f137705a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U1(YourAccountActivity yourAccountActivity, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("account");
        track.v("account:new experience");
        track.p(yourAccountActivity.E1(z10));
        track.m(TrackingData.a.b.f137705a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W1(YourAccountActivity yourAccountActivity, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("account");
        track.v("account:new experience");
        track.p(yourAccountActivity.E1(z10));
        track.m(TrackingData.a.b.f137705a);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y1(YourAccountActivity yourAccountActivity, boolean z10, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        track.p(yourAccountActivity.E1(z10));
        track.m(TrackingData.a.b.f137705a);
        return Unit.f143329a;
    }

    private final void Z1() {
        startActivity(Bl.k.b(this, false, null, null, null, null, null, 126, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d2(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("account");
        track.v("account:new experience");
        track.m(TrackingData.a.b.f137705a);
        return Unit.f143329a;
    }

    public final Dl.e B1() {
        Dl.e eVar = this.meijerDeepLinkParser;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerDeepLinkParser");
        return null;
    }

    public final InterfaceC14523a getAnalyticsEngine() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final zl.k getFeatureManager() {
        zl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    private final void F1(final boolean isChip) {
        getAnalyticsEngine().b(C14756c.h("account: addresses"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.A
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YourAccountActivity.G1(this.f95039a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Bl.a.f3119a.a(this));
        ck.c.b(this, 0, Gh.c.f12629a, Bl.m.f3132a, 0, 8, null);
    }

    private final void H1() {
        try {
            getAnalyticsEngine().b(C14756c.a("account: customer care phone link"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return YourAccountActivity.I1((TrackingData) obj);
                }
            });
            Dl.e eVarB1 = B1();
            String string = getString(Gh.h.f12760N4);
            Intrinsics.i(string, "getString(...)");
            startActivity(eVarB1.N(string));
        } catch (ActivityNotFoundException unused) {
            new C15485b(this, Cj.p.f5102a).setCancelable(false).setMessage(Gh.h.f12911j1).setPositiveButton(getString(Gh.h.f13017y2), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.accounts.ux.basescreen.z
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    YourAccountActivity.J1(dialogInterface, i10);
                }
            }).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J1(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    private final void L1() {
        try {
            getAnalyticsEngine().b(C14756c.a("account: customer care email link"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.B
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return YourAccountActivity.N1((TrackingData) obj);
                }
            });
            startActivity(B1().J(this));
        } catch (ActivityNotFoundException unused) {
            new C15485b(this, Cj.p.f5102a).setCancelable(false).setMessage(Gh.h.f12904i1).setPositiveButton(getString(Gh.h.f13017y2), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.accounts.ux.basescreen.C
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    YourAccountActivity.M1(dialogInterface, i10);
                }
            }).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M1(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    private final void P1(final boolean isChip) {
        getAnalyticsEngine().b(C14756c.h("Meijer:Order History Page"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YourAccountActivity.Q1(this.f95151a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Bl.l.f(Bl.l.f3131a, this, false, 2, null));
    }

    private final void R1(final boolean isChip) {
        getAnalyticsEngine().b(C14756c.h("account: payment"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YourAccountActivity.S1(this.f95147a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Bl.a.f3119a.b(this));
    }

    private final void T1(final boolean isChip) {
        getAnalyticsEngine().b(C14756c.h("account: preferences"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YourAccountActivity.U1(this.f95149a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Bl.a.f3119a.i(this));
        ck.c.b(this, 0, Gh.c.f12629a, Bl.m.f3132a, 0, 8, null);
    }

    private final void V1(final boolean isChip) {
        getAnalyticsEngine().b(C14756c.h("account: profile"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YourAccountActivity.W1(this.f95086a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Bl.a.e(Bl.a.f3119a, this, false, false, 6, null));
        ck.c.b(this, 0, Gh.c.f12629a, Bl.m.f3132a, 0, 8, null);
    }

    private final void X1(final boolean isChip) {
        getAnalyticsEngine().b(C14756c.h("savings"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.E
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YourAccountActivity.Y1(this.f95088a, isChip, (TrackingData) obj);
            }
        });
        startActivity(Bl.a.f3119a.f(this));
    }

    private final void a2() {
        getAnalyticsEngine().b(C14756c.a("account:sign out"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.x
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YourAccountActivity.b2((TrackingData) obj);
            }
        });
        startActivity(Bl.k.f(Bl.k.f3130a, this, false, 2, null));
    }

    private final void c2() {
        getAnalyticsEngine().b(C14756c.h("account"), new Function1() { // from class: com.meijer.mobile.accounts.ux.basescreen.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return YourAccountActivity.d2((TrackingData) obj);
            }
        });
    }

    @Override // com.meijer.mobile.accounts.ux.basescreen.Hilt_YourAccountActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        c2();
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1313604773, true, new a()), 1, null);
    }

    @Override // android.app.Activity
    protected void onResume() {
        boolean z10;
        super.onResume();
        FS.page("Accounts Home").start();
        H hC1 = C1();
        if (Z1.b.a(this, "android.permission.POST_NOTIFICATIONS") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        hC1.u(z10);
    }
}
