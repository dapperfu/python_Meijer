package com.meijer.mobile.accounts.ux.profile;

import Al.s;
import Fh.a;
import Ji.K;
import Ji.LocalThemeScope;
import Ph.F;
import Rh.ContactUsDecorator;
import V2.CreationExtras;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.view.InterfaceC6020j;
import androidx.view.c0;
import androidx.view.f0;
import androidx.view.h0;
import com.meijer.mobile.accounts.ux.profile.ProfileScreenActivity;
import com.meijer.mobile.accounts.ux.profile.a;
import com.meijer.mobile.accounts.ux.profile.l;
import com.meijer.mobile.accounts.ux.profile.p;
import e.C13589e;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import je.C14886b;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import yr.C18299z;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u00100\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b)\u0010*\u0012\u0004\b/\u0010\u0003\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00108\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006;²\u0006\f\u0010:\u001a\u0002098\nX\u008a\u0084\u0002"}, d2 = {"Lcom/meijer/mobile/accounts/ux/profile/ProfileScreenActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "s1", "LFh/a;", "accountNavigationRequest", "B1", "(LFh/a;)V", "y1", "v1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lyo/k;", "v", "Lyo/k;", "getUserManager", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "userManager", "LCl/e;", "w", "LCl/e;", "t1", "()LCl/e;", "setMeijerDeepLinkParser", "(LCl/e;)V", "meijerDeepLinkParser", "LAl/g;", "x", "LAl/g;", "getFeatureEntryPoint", "()LAl/g;", "setFeatureEntryPoint", "(LAl/g;)V", "featureEntryPoint", "", "y", "Ljava/lang/String;", "u1", "()Ljava/lang/String;", "setVersionName", "(Ljava/lang/String;)V", "getVersionName$annotations", "versionName", "Lgi/a;", "z", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "analyticsEngine", "Lcom/meijer/mobile/accounts/ux/profile/l$e;", "viewState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileScreenActivity extends Hilt_ProfileScreenActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public yo.k userManager;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerDeepLinkParser;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public Al.g featureEntryPoint;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public String versionName;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.accounts.ux.profile.ProfileScreenActivity$a$a, reason: collision with other inner class name */
        static final class C1341a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ProfileScreenActivity f94713a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.accounts.ux.profile.ProfileScreenActivity$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1342a extends FunctionReferenceImpl implements Function1<Fh.a, Unit> {
                C1342a(Object obj) {
                    super(1, obj, ProfileScreenActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/accounts/ux/AccountNavigationRequest;)V", 0);
                }

                public final void a(Fh.a p02) {
                    Intrinsics.j(p02, "p0");
                    ((ProfileScreenActivity) this.receiver).B1(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Fh.a aVar) {
                    a(aVar);
                    return Unit.f142422a;
                }
            }

            C1341a(ProfileScreenActivity profileScreenActivity) {
                this.f94713a = profileScreenActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(ProfileScreenActivity profileScreenActivity, l lVar, com.meijer.mobile.accounts.ux.profile.a action) {
                String str;
                Intrinsics.j(action, "action");
                if (Intrinsics.e(action, a.l.f94728a)) {
                    profileScreenActivity.getAnalyticsEngine().h(C14476c.a("account: profile: mperks id button"), new Function1() { // from class: com.meijer.mobile.accounts.ux.profile.h
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ProfileScreenActivity.a.C1341a.g((TrackingData) obj);
                        }
                    });
                    profileScreenActivity.startActivity(profileScreenActivity.getFeatureEntryPoint().r());
                } else if (Intrinsics.e(action, a.C1343a.f94714a)) {
                    lVar.R(l.c.a.f94750a);
                } else if (action instanceof a.DismissErrorNotification) {
                    a.DismissErrorNotification dismissErrorNotification = (a.DismissErrorNotification) action;
                    lVar.R(new l.c.DismissErrorNotification(dismissErrorNotification.getIsPhoneConflictError(), dismissErrorNotification.getIsMperksPinUpdateError()));
                } else if (Intrinsics.e(action, a.b.f94715a)) {
                    lVar.R(l.c.b.f94751a);
                } else if (action instanceof a.OnFormFieldChange) {
                    lVar.R(new l.c.OnFormFieldChange(((a.OnFormFieldChange) action).a()));
                } else if (action instanceof a.OnQuickIDToggleChange) {
                    lVar.R(new l.c.OnQuickIDChange(((a.OnQuickIDToggleChange) action).getIsEnabled()));
                } else if (action instanceof a.SendEmail) {
                    lVar.R(new l.c.SendEmail(((a.SendEmail) action).getEmail()));
                } else if (action instanceof a.ResendEmail) {
                    lVar.R(new l.c.ResendEmail(((a.ResendEmail) action).getEmail()));
                } else if (action instanceof a.TryAgain) {
                    lVar.R(new l.c.ResendEmail(((a.TryAgain) action).getEmail()));
                } else if (action instanceof a.UpdateAccountInfo) {
                    a.UpdateAccountInfo updateAccountInfo = (a.UpdateAccountInfo) action;
                    lVar.R(new l.c.UpdateAccountInfo(updateAccountInfo.getCurrentPassword(), updateAccountInfo.getNewPassword()));
                } else if (Intrinsics.e(action, a.o.f94732a)) {
                    lVar.R(l.c.C1345l.f94763a);
                } else if (Intrinsics.e(action, a.p.f94733a)) {
                    lVar.R(l.c.n.f94767a);
                } else if (action instanceof a.OnEditClick) {
                    a.OnEditClick onEditClick = (a.OnEditClick) action;
                    p screen = onEditClick.getScreen();
                    if (Intrinsics.e(screen, p.b.f94982a)) {
                        str = "account: profile: edit basic information";
                    } else if (Intrinsics.e(screen, p.a.f94981a)) {
                        str = "account: profile: edit account information";
                    } else if (Intrinsics.e(screen, p.c.f94983a)) {
                        str = "account: profile: edit mPerks information";
                    } else {
                        if (!Intrinsics.e(screen, p.d.f94984a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = "account: profile: edit order preferences";
                    }
                    profileScreenActivity.getAnalyticsEngine().h(C14476c.a(str), new Function1() { // from class: com.meijer.mobile.accounts.ux.profile.i
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ProfileScreenActivity.a.C1341a.k((TrackingData) obj);
                        }
                    });
                    lVar.R(new l.c.OnEditClick(onEditClick.getScreen()));
                } else if (Intrinsics.e(action, a.e.f94719a)) {
                    lVar.R(l.c.e.f94755a);
                } else if (Intrinsics.e(action, a.f.f94720a)) {
                    lVar.R(l.c.f.f94756a);
                } else if (action instanceof a.ValidateConfirmPassword) {
                    a.ValidateConfirmPassword validateConfirmPassword = (a.ValidateConfirmPassword) action;
                    lVar.R(new l.c.ValidateConfirmPassword(validateConfirmPassword.getNewPassword(), validateConfirmPassword.getConfirmPassword(), validateConfirmPassword.getIsFocused()));
                } else {
                    if (!(action instanceof a.OnSaveMperksInfo)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a.OnSaveMperksInfo onSaveMperksInfo = (a.OnSaveMperksInfo) action;
                    lVar.R(new l.c.UpdateMperksInfo(onSaveMperksInfo.getIsEnabled(), onSaveMperksInfo.getNewPin(), onSaveMperksInfo.getCurrentPin()));
                }
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(TrackingData track) {
                Intrinsics.j(track, "$this$track");
                track.v("account:new experience");
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(TrackingData track) {
                Intrinsics.j(track, "$this$track");
                track.v("account:new experience");
                return Unit.f142422a;
            }

            public final void d(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(588571410, i10, -1, "com.meijer.mobile.accounts.ux.profile.ProfileScreenActivity.onCreate.<anonymous>.<anonymous> (ProfileScreenActivity.kt:69)");
                }
                composer.startReplaceableGroup(1890788296);
                h0 h0VarC = W2.b.f38408a.c(composer, W2.b.f38410c);
                if (h0VarC == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                f0.c cVarA = O2.a.a(h0VarC, composer, 0);
                composer.startReplaceableGroup(1729797275);
                c0 c0VarB = W2.d.b(l.class, h0VarC, null, cVarA, h0VarC instanceof InterfaceC6020j ? ((InterfaceC6020j) h0VarC).getDefaultViewModelCreationExtras() : CreationExtras.b.f36770c, composer, 36936, 0);
                composer.U();
                composer.U();
                final l lVar = (l) c0VarB;
                z1 z1VarB = o1.b(lVar.M(), null, composer, 0, 1);
                lVar.Z(this.f94713a.getIntent().getBooleanExtra("EXTRA_FROM_PAYMENTS_PAGE", false), this.f94713a.getIntent().getBooleanExtra("EXTRA_IS_EDIT_BASIC_INFO", false));
                l.ProfileScreenViewState profileScreenViewStateE = e(z1VarB);
                ContactUsDecorator contactUsDecorator = new ContactUsDecorator(this.f94713a.getUserManager().D().getExternalShopperId(), this.f94713a.u1());
                Modifier modifierC = C18299z.c(J.f(Modifier.INSTANCE, 0.0f, 1, null), false, 1, null);
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(this.f94713a) | composer.D(lVar);
                final ProfileScreenActivity profileScreenActivity = this.f94713a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.accounts.ux.profile.g
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ProfileScreenActivity.a.C1341a.f(profileScreenActivity, lVar, (a) obj);
                        }
                    };
                    composer.t(objB);
                }
                Function1 function1 = (Function1) objB;
                composer.P();
                Object obj = this.f94713a;
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(obj);
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new C1342a(obj);
                    composer.t(objB2);
                }
                composer.P();
                F.b(AdsTheme, profileScreenViewStateE, contactUsDecorator, modifierC, function1, (Function1) ((KFunction) objB2), composer, LocalThemeScope.f15770g | (i10 & 14), 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            private static final l.ProfileScreenViewState e(z1<l.ProfileScreenViewState> z1Var) {
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
                ComposerKt.U(-1675811135, i10, -1, "com.meijer.mobile.accounts.ux.profile.ProfileScreenActivity.onCreate.<anonymous> (ProfileScreenActivity.kt:68)");
            }
            K.b(null, ComposableLambdaKt.c(588571410, true, new C1341a(ProfileScreenActivity.this), composer, 54), composer, 48, 1);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void B1(Fh.a accountNavigationRequest) {
        if (Intrinsics.e(accountNavigationRequest, a.k.f10423a)) {
            s1();
            return;
        }
        if (Intrinsics.e(accountNavigationRequest, a.b.f10413a)) {
            v1();
            return;
        }
        if (Intrinsics.e(accountNavigationRequest, a.f.f10417a)) {
            y1();
        } else if (accountNavigationRequest instanceof a.EditHomeStoreLocation) {
            getAnalyticsEngine().h(C14476c.a("account: profile: your meijer store"), new Function1() { // from class: com.meijer.mobile.accounts.ux.profile.b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProfileScreenActivity.C1((TrackingData) obj);
                }
            });
            startActivity(s.f(this, ok.i.f153984b, null, false, true, 0, null, false, 228, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z1(TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("account:new experience");
        return Unit.f142422a;
    }

    public final InterfaceC14261a getAnalyticsEngine() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final Al.g getFeatureEntryPoint() {
        Al.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.y("featureEntryPoint");
        return null;
    }

    public final yo.k getUserManager() {
        yo.k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("userManager");
        return null;
    }

    public final Cl.e t1() {
        Cl.e eVar = this.meijerDeepLinkParser;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerDeepLinkParser");
        return null;
    }

    public final String u1() {
        String str = this.versionName;
        if (str != null) {
            return str;
        }
        Intrinsics.y("versionName");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A1(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    private final void s1() {
        finish();
        bk.c.b(this, 1, Bj.d.f2592a, Bj.d.f2595d, 0, 8, null);
    }

    private final void v1() {
        try {
            getAnalyticsEngine().h(C14476c.a("account: profile: customer care phone link"), new Function1() { // from class: com.meijer.mobile.accounts.ux.profile.c
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProfileScreenActivity.w1((TrackingData) obj);
                }
            });
            Cl.e eVarT1 = t1();
            String string = getString(Fh.h.f10569N4);
            Intrinsics.i(string, "getString(...)");
            startActivity(eVarT1.N(string));
        } catch (ActivityNotFoundException unused) {
            new C14886b(this, Bj.p.f3057a).setCancelable(false).setMessage(Fh.h.f10720j1).setPositiveButton(getString(Fh.h.f10826y2), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.accounts.ux.profile.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ProfileScreenActivity.x1(dialogInterface, i10);
                }
            }).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x1(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
    }

    private final void y1() {
        try {
            getAnalyticsEngine().h(C14476c.a("account: profile: customer care email link"), new Function1() { // from class: com.meijer.mobile.accounts.ux.profile.e
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProfileScreenActivity.z1((TrackingData) obj);
                }
            });
            startActivity(t1().J(this));
        } catch (ActivityNotFoundException unused) {
            new C14886b(this, Bj.p.f3057a).setCancelable(false).setMessage(Fh.h.f10713i1).setPositiveButton(getString(Fh.h.f10826y2), new DialogInterface.OnClickListener() { // from class: com.meijer.mobile.accounts.ux.profile.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ProfileScreenActivity.A1(dialogInterface, i10);
                }
            }).show();
        }
    }

    @Override // com.meijer.mobile.accounts.ux.profile.Hilt_ProfileScreenActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1675811135, true, new a()), 1, null);
    }
}
