package com.meijer.mobile.meijer.activity.home;

import Ji.LocalThemeScope;
import Mn.AbstractC4295v1;
import ak.AbstractC5607a;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.fragment.app.FragmentActivity;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.home.ExpiryPointsDialogFragment;
import gi.InterfaceC14261a;
import hi.AbstractC14481h;
import hi.AbstractC14482i;
import hi.C14476c;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vk.C17590a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J)\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/ExpiryPointsDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "", "onRedeemPointsNowClick", "", "points", "", "fromCloseButton", "isClaimPointsNowButton", "trackExpiryPointsDrawerAction", "(IZZ)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "getTheme", "()I", "LMn/v1;", "binding", "LMn/v1;", "getBinding", "()LMn/v1;", "setBinding", "(LMn/v1;)V", "LAl/g;", "featureEntryPoint", "LAl/g;", "getFeatureEntryPoint", "()LAl/g;", "setFeatureEntryPoint", "(LAl/g;)V", "Lgi/a;", "analyticsEngine", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "I", "getPoints", "setPoints", "(I)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ExpiryPointsDialogFragment extends Hilt_ExpiryPointsDialogFragment {
    public static final int $stable = 8;
    public InterfaceC14261a analyticsEngine;
    public AbstractC4295v1 binding;
    public Al.g featureEntryPoint;
    private int points;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f109164b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC5607a f109165c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.home.ExpiryPointsDialogFragment$a$a, reason: collision with other inner class name */
        static final class C1657a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ExpiryPointsDialogFragment f109166a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f109167b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC5607a f109168c;

            C1657a(ExpiryPointsDialogFragment expiryPointsDialogFragment, AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2) {
                this.f109166a = expiryPointsDialogFragment;
                this.f109167b = abstractC5607a;
                this.f109168c = abstractC5607a2;
            }

            public final void c(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(34474386, i11, -1, "com.meijer.mobile.meijer.activity.home.ExpiryPointsDialogFragment.onCreateView.<anonymous>.<anonymous> (ExpiryPointsDialogFragment.kt:88)");
                }
                int points = this.f109166a.getPoints();
                AbstractC5607a abstractC5607a = this.f109167b;
                int i12 = i11;
                AbstractC5607a abstractC5607a2 = this.f109168c;
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.b(Modifier.INSTANCE, H1.h.p(1), 0.0f, 2, null));
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f109166a);
                final ExpiryPointsDialogFragment expiryPointsDialogFragment = this.f109166a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ExpiryPointsDialogFragment.a.C1657a.d(expiryPointsDialogFragment);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f109166a);
                final ExpiryPointsDialogFragment expiryPointsDialogFragment2 = this.f109166a;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ExpiryPointsDialogFragment.a.C1657a.e(expiryPointsDialogFragment2, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                int i13 = (i12 & 14) | LocalThemeScope.f15770g;
                int i14 = AbstractC5607a.f45514b;
                os.n0.g(AdsTheme, points, abstractC5607a, abstractC5607a2, modifierFsUnmask, null, function0, (Function1) objB2, composer, i13 | (i14 << 6) | (i14 << 9), 16);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                c(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(ExpiryPointsDialogFragment expiryPointsDialogFragment) {
                expiryPointsDialogFragment.onRedeemPointsNowClick();
                expiryPointsDialogFragment.trackExpiryPointsDrawerAction(expiryPointsDialogFragment.getPoints(), false, true);
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(ExpiryPointsDialogFragment expiryPointsDialogFragment, boolean z10) {
                expiryPointsDialogFragment.dismiss();
                ExpiryPointsDialogFragment.E0(expiryPointsDialogFragment, expiryPointsDialogFragment.getPoints(), z10, false, 4, null);
                return Unit.f142422a;
            }
        }

        a(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2) {
            this.f109164b = abstractC5607a;
            this.f109165c = abstractC5607a2;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-539708863, i10, -1, "com.meijer.mobile.meijer.activity.home.ExpiryPointsDialogFragment.onCreateView.<anonymous> (ExpiryPointsDialogFragment.kt:87)");
            }
            Ji.K.b(null, ComposableLambdaKt.c(34474386, true, new C1657a(ExpiryPointsDialogFragment.this, this.f109164b, this.f109165c), composer, 54), composer, 48, 1);
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

    static /* synthetic */ void E0(ExpiryPointsDialogFragment expiryPointsDialogFragment, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        expiryPointsDialogFragment.trackExpiryPointsDrawerAction(i10, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(ExpiryPointsDialogFragment expiryPointsDialogFragment, DialogInterface dialogInterface) {
        E0(expiryPointsDialogFragment, expiryPointsDialogFragment.points, true, false, 4, null);
    }

    public final InterfaceC14261a getAnalyticsEngine() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final AbstractC4295v1 getBinding() {
        AbstractC4295v1 abstractC4295v1 = this.binding;
        if (abstractC4295v1 != null) {
            return abstractC4295v1;
        }
        Intrinsics.y("binding");
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

    public final int getPoints() {
        return this.points;
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return com.meijer.mobile.meijer.Z.f100467a;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Object serializable;
        Intrinsics.j(inflater, "inflater");
        setBinding(AbstractC4295v1.K0(inflater));
        this.points = requireArguments().getInt(HomeFragment.MPERKS4_EXPIRING_POINTS);
        Bundle bundleRequireArguments = requireArguments();
        Intrinsics.i(bundleRequireArguments, "requireArguments(...)");
        AbstractC5607a abstractC5607aD = null;
        if (Build.VERSION.SDK_INT >= 33) {
            serializable = bundleRequireArguments.getSerializable(HomeFragment.MPERKS4_POINTS_EXPIRING_DATE, LocalDate.class);
        } else {
            Object serializable2 = bundleRequireArguments.getSerializable(HomeFragment.MPERKS4_POINTS_EXPIRING_DATE);
            if (!(serializable2 instanceof LocalDate)) {
                serializable2 = null;
            }
            serializable = (LocalDate) serializable2;
        }
        LocalDate localDate = (LocalDate) serializable;
        AbstractC5607a abstractC5607aD2 = localDate != null ? AbstractC5607a.INSTANCE.d(ns.u.f152745r, localDate.format(C17590a.DATE_SLASHES_SHORT)) : null;
        if (localDate != null) {
            int iB = os.g0.b(localDate, null, 1, null);
            abstractC5607aD = iB == 0 ? AbstractC5607a.INSTANCE.d(ns.u.f152743q, new Object[0]) : AbstractC5607a.INSTANCE.b(ns.t.f152684a, iB, new Object[0]);
        }
        getBinding().f21043z.setContent(ComposableLambdaKt.composableLambdaInstance(-539708863, true, new a(abstractC5607aD2, abstractC5607aD)));
        View root = getBinding().getRoot();
        Intrinsics.i(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.j(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.meijer.mobile.meijer.activity.home.a
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    ExpiryPointsDialogFragment.onViewCreated$lambda$2(this.f109746a, dialogInterface);
                }
            });
        }
    }

    public final void setAnalyticsEngine(InterfaceC14261a interfaceC14261a) {
        Intrinsics.j(interfaceC14261a, "<set-?>");
        this.analyticsEngine = interfaceC14261a;
    }

    public final void setBinding(AbstractC4295v1 abstractC4295v1) {
        Intrinsics.j(abstractC4295v1, "<set-?>");
        this.binding = abstractC4295v1;
    }

    public final void setFeatureEntryPoint(Al.g gVar) {
        Intrinsics.j(gVar, "<set-?>");
        this.featureEntryPoint = gVar;
    }

    public final void setPoints(int i10) {
        this.points = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRedeemPointsNowClick() {
        dismiss();
        Al.p pVar = Al.p.f690a;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
        startActivity(Al.p.f(pVar, fragmentActivityRequireActivity, false, true, false, false, 26, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackExpiryPointsDrawerAction(int points, boolean fromCloseButton, boolean isClaimPointsNowButton) {
        AbstractC14482i.Extra extraB;
        InterfaceC14261a analyticsEngine = getAnalyticsEngine();
        AbstractC14481h.Action actionA = C14476c.a("mPerks points expiry drawer");
        AbstractC14482i.Page pageC = C14476c.c("Meijer:Home Page");
        AbstractC14482i.PageType pageTypeD = C14476c.d("index");
        AbstractC14482i.Section sectionG = C14476c.g("mPerks 4.0");
        AbstractC14482i.Extra extraB2 = C14476c.b("mperksPoints", String.valueOf(points));
        if (fromCloseButton) {
            extraB = C14476c.b("drawerClosed", "true");
        } else if (isClaimPointsNowButton) {
            extraB = C14476c.b("claimPointsNow", "true");
        } else {
            extraB = C14476c.b("claimPointsLater", "true");
        }
        analyticsEngine.b(actionA, pageC, pageTypeD, sectionG, extraB2, extraB);
    }
}
