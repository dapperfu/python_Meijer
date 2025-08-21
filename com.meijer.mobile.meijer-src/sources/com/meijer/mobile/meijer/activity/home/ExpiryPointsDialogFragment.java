package com.meijer.mobile.meijer.activity.home;

import Ki.LocalThemeScope;
import Nn.AbstractC4300v1;
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
import bk.AbstractC6392a;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.meijer.activity.home.ExpiryPointsDialogFragment;
import hi.InterfaceC14523a;
import ii.AbstractC14761h;
import ii.AbstractC14762i;
import ii.C14756c;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wk.C17898a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J)\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010*\u001a\u00020)8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00100\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u00103¨\u00064"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/ExpiryPointsDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "", "onRedeemPointsNowClick", "", "points", "", "fromCloseButton", "isClaimPointsNowButton", "trackExpiryPointsDrawerAction", "(IZZ)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "getTheme", "()I", "LNn/v1;", "binding", "LNn/v1;", "getBinding", "()LNn/v1;", "setBinding", "(LNn/v1;)V", "LBl/g;", "featureEntryPoint", "LBl/g;", "getFeatureEntryPoint", "()LBl/g;", "setFeatureEntryPoint", "(LBl/g;)V", "Lhi/a;", "analyticsEngine", "Lhi/a;", "getAnalyticsEngine", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "I", "getPoints", "setPoints", "(I)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class ExpiryPointsDialogFragment extends Hilt_ExpiryPointsDialogFragment {
    public static final int $stable = 8;
    public InterfaceC14523a analyticsEngine;
    public AbstractC4300v1 binding;
    public Bl.g featureEntryPoint;
    private int points;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f110025b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6392a f110026c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.home.ExpiryPointsDialogFragment$a$a, reason: collision with other inner class name */
        static final class C1666a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ExpiryPointsDialogFragment f110027a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f110028b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ AbstractC6392a f110029c;

            C1666a(ExpiryPointsDialogFragment expiryPointsDialogFragment, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2) {
                this.f110027a = expiryPointsDialogFragment;
                this.f110028b = abstractC6392a;
                this.f110029c = abstractC6392a2;
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
                int points = this.f110027a.getPoints();
                AbstractC6392a abstractC6392a = this.f110028b;
                int i12 = i11;
                AbstractC6392a abstractC6392a2 = this.f110029c;
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(androidx.compose.foundation.layout.J.b(Modifier.INSTANCE, H1.h.p(1), 0.0f, 2, null));
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f110027a);
                final ExpiryPointsDialogFragment expiryPointsDialogFragment = this.f110027a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.home.b
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ExpiryPointsDialogFragment.a.C1666a.d(expiryPointsDialogFragment);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(this.f110027a);
                final ExpiryPointsDialogFragment expiryPointsDialogFragment2 = this.f110027a;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.home.c
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ExpiryPointsDialogFragment.a.C1666a.e(expiryPointsDialogFragment2, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                int i13 = (i12 & 14) | LocalThemeScope.f17314g;
                int i14 = AbstractC6392a.f60445b;
                os.n0.g(AdsTheme, points, abstractC6392a, abstractC6392a2, modifierFsUnmask, null, function0, (Function1) objB2, composer, i13 | (i14 << 6) | (i14 << 9), 16);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                c(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit d(ExpiryPointsDialogFragment expiryPointsDialogFragment) {
                expiryPointsDialogFragment.onRedeemPointsNowClick();
                expiryPointsDialogFragment.trackExpiryPointsDrawerAction(expiryPointsDialogFragment.getPoints(), false, true);
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(ExpiryPointsDialogFragment expiryPointsDialogFragment, boolean z10) {
                expiryPointsDialogFragment.dismiss();
                ExpiryPointsDialogFragment.F0(expiryPointsDialogFragment, expiryPointsDialogFragment.getPoints(), z10, false, 4, null);
                return Unit.f143329a;
            }
        }

        a(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2) {
            this.f110025b = abstractC6392a;
            this.f110026c = abstractC6392a2;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-539708863, i10, -1, "com.meijer.mobile.meijer.activity.home.ExpiryPointsDialogFragment.onCreateView.<anonymous> (ExpiryPointsDialogFragment.kt:87)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(34474386, true, new C1666a(ExpiryPointsDialogFragment.this, this.f110025b, this.f110026c), composer, 54), composer, 48, 1);
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

    static /* synthetic */ void F0(ExpiryPointsDialogFragment expiryPointsDialogFragment, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        expiryPointsDialogFragment.trackExpiryPointsDrawerAction(i10, z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$2(ExpiryPointsDialogFragment expiryPointsDialogFragment, DialogInterface dialogInterface) {
        F0(expiryPointsDialogFragment, expiryPointsDialogFragment.points, true, false, 4, null);
    }

    public final InterfaceC14523a getAnalyticsEngine() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final AbstractC4300v1 getBinding() {
        AbstractC4300v1 abstractC4300v1 = this.binding;
        if (abstractC4300v1 != null) {
            return abstractC4300v1;
        }
        Intrinsics.x("binding");
        return null;
    }

    public final Bl.g getFeatureEntryPoint() {
        Bl.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.x("featureEntryPoint");
        return null;
    }

    public final int getPoints() {
        return this.points;
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return com.meijer.mobile.meijer.Z.f101329a;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Object serializable;
        Intrinsics.j(inflater, "inflater");
        setBinding(AbstractC4300v1.M0(inflater));
        this.points = requireArguments().getInt(HomeFragment.MPERKS4_EXPIRING_POINTS);
        Bundle bundleRequireArguments = requireArguments();
        Intrinsics.i(bundleRequireArguments, "requireArguments(...)");
        AbstractC6392a abstractC6392aD = null;
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
        AbstractC6392a abstractC6392aD2 = localDate != null ? AbstractC6392a.INSTANCE.d(ns.u.f153197r, localDate.format(C17898a.DATE_SLASHES_SHORT)) : null;
        if (localDate != null) {
            int iB = os.g0.b(localDate, null, 1, null);
            abstractC6392aD = iB == 0 ? AbstractC6392a.INSTANCE.d(ns.u.f153195q, new Object[0]) : AbstractC6392a.INSTANCE.b(ns.t.f153136a, iB, new Object[0]);
        }
        getBinding().f22375z.setContent(ComposableLambdaKt.composableLambdaInstance(-539708863, true, new a(abstractC6392aD2, abstractC6392aD)));
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
                    ExpiryPointsDialogFragment.onViewCreated$lambda$2(this.f110607a, dialogInterface);
                }
            });
        }
    }

    public final void setAnalyticsEngine(InterfaceC14523a interfaceC14523a) {
        Intrinsics.j(interfaceC14523a, "<set-?>");
        this.analyticsEngine = interfaceC14523a;
    }

    public final void setBinding(AbstractC4300v1 abstractC4300v1) {
        Intrinsics.j(abstractC4300v1, "<set-?>");
        this.binding = abstractC4300v1;
    }

    public final void setFeatureEntryPoint(Bl.g gVar) {
        Intrinsics.j(gVar, "<set-?>");
        this.featureEntryPoint = gVar;
    }

    public final void setPoints(int i10) {
        this.points = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRedeemPointsNowClick() {
        dismiss();
        Bl.p pVar = Bl.p.f3148a;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.i(fragmentActivityRequireActivity, "requireActivity(...)");
        startActivity(Bl.p.f(pVar, fragmentActivityRequireActivity, false, true, false, false, 26, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackExpiryPointsDrawerAction(int points, boolean fromCloseButton, boolean isClaimPointsNowButton) {
        AbstractC14762i.Extra extraB;
        InterfaceC14523a analyticsEngine = getAnalyticsEngine();
        AbstractC14761h.Action actionA = C14756c.a("mPerks points expiry drawer");
        AbstractC14762i.Page pageC = C14756c.c("Meijer:Home Page");
        AbstractC14762i.PageType pageTypeD = C14756c.d("index");
        AbstractC14762i.Section sectionG = C14756c.g("mPerks 4.0");
        AbstractC14762i.Extra extraB2 = C14756c.b("mperksPoints", String.valueOf(points));
        if (fromCloseButton) {
            extraB = C14756c.b("drawerClosed", "true");
        } else if (isClaimPointsNowButton) {
            extraB = C14756c.b("claimPointsNow", "true");
        } else {
            extraB = C14756c.b("claimPointsLater", "true");
        }
        analyticsEngine.h(actionA, pageC, pageTypeD, sectionG, extraB2, extraB);
    }
}
