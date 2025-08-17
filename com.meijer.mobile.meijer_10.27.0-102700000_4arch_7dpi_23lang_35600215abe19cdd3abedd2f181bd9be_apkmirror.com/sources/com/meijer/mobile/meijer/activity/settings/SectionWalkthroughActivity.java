package com.meijer.mobile.meijer.activity.settings;

import Ji.I;
import Ji.K;
import Ji.LocalThemeScope;
import Ji.T;
import Mn.V;
import Qn.X;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.material.appbar.MaterialToolbar;
import com.meijer.mobile.core.design.widget.howTo.WalkThroughType;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.settings.SectionWalkthroughActivity;
import gi.InterfaceC14261a;
import hi.AbstractC14482i;
import hi.C14476c;
import hi.TrackingData;
import ji.q1;
import kotlin.C17917Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u0007*\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\u0004R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006/²\u0006\u000e\u0010.\u001a\u00020\u001e8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/SectionWalkthroughActivity;", "Lcom/meijer/mobile/meijer/activity/MeijerActivity;", "LAj/b;", "<init>", "()V", "Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;", "walkThroughType", "", "c2", "(Lcom/meijer/mobile/core/design/widget/howTo/WalkThroughType;)V", "Lhi/i$c;", "page", "Z1", "(Lhi/i$c;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "K1", "(LJi/M;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "", "stringRes", "Lkotlin/Function0;", "onClickAction", "S1", "(ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "onPause", "", "s", "Z", "isRewardsFirstTimeOpened", "LNu/b;", "t", "LNu/b;", "disposable", "LMn/V;", "u", "LMn/V;", "binding", "Landroidx/appcompat/widget/Toolbar;", "v", "()Landroidx/appcompat/widget/Toolbar;", "toolbar", "showWalkThru", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SectionWalkthroughActivity extends Hilt_SectionWalkthroughActivity implements Aj.b {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isRewardsFirstTimeOpened;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Nu.b disposable;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private V binding;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f111727b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Boolean> f111728c;

        a(LocalThemeScope localThemeScope, InterfaceC5730l0<Boolean> interfaceC5730l0) {
            this.f111727b = localThemeScope;
            this.f111728c = interfaceC5730l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(SectionWalkthroughActivity sectionWalkthroughActivity, TrackingData track) {
            Intrinsics.j(track, "$this$track");
            track.v("mPerks 4.0");
            track.o("mPerks: Walkthrough");
            if (sectionWalkthroughActivity.isRewardsFirstTimeOpened) {
                track.p(sectionWalkthroughActivity.getString(Y.f100156k8));
                sectionWalkthroughActivity.isRewardsFirstTimeOpened = false;
            }
            return Unit.f142422a;
        }

        public final void d(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(835168634, i10, -1, "com.meijer.mobile.meijer.activity.settings.SectionWalkthroughActivity.SectionWalkthroughView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SectionWalkthroughActivity.kt:86)");
            }
            if (SectionWalkthroughActivity.Q1(this.f111728c)) {
                V v10 = SectionWalkthroughActivity.this.binding;
                if (v10 == null) {
                    Intrinsics.y("binding");
                    v10 = null;
                }
                v10.f20361E.setImportantForAccessibility(4);
                LocalThemeScope localThemeScope = this.f111727b;
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(SectionWalkthroughActivity.this);
                final SectionWalkthroughActivity sectionWalkthroughActivity = SectionWalkthroughActivity.this;
                final InterfaceC5730l0<Boolean> interfaceC5730l0 = this.f111728c;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.t
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SectionWalkthroughActivity.a.e(sectionWalkthroughActivity, interfaceC5730l0);
                        }
                    };
                    composer.t(objB);
                }
                Function0 function0 = (Function0) objB;
                composer.P();
                composer.startReplaceGroup(5004770);
                boolean zD2 = composer.D(SectionWalkthroughActivity.this);
                final SectionWalkthroughActivity sectionWalkthroughActivity2 = SectionWalkthroughActivity.this;
                Object objB2 = composer.B();
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.u
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SectionWalkthroughActivity.a.f(sectionWalkthroughActivity2, ((Integer) obj).intValue());
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                ns.q.l(localThemeScope, null, function0, (Function1) objB2, composer, LocalThemeScope.f15770g, 1);
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            d(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(SectionWalkthroughActivity sectionWalkthroughActivity, InterfaceC5730l0 interfaceC5730l0) {
            V v10 = sectionWalkthroughActivity.binding;
            if (v10 == null) {
                Intrinsics.y("binding");
                v10 = null;
            }
            v10.f20361E.setImportantForAccessibility(1);
            SectionWalkthroughActivity.R1(interfaceC5730l0, false);
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit f(final SectionWalkthroughActivity sectionWalkthroughActivity, int i10) {
            InterfaceC14261a analyticsEngine = sectionWalkthroughActivity.getAnalyticsEngine();
            String string = sectionWalkthroughActivity.getString(i10);
            Intrinsics.i(string, "getString(...)");
            analyticsEngine.h(C14476c.h(string), new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.v
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SectionWalkthroughActivity.a.g(sectionWalkthroughActivity, (TrackingData) obj);
                }
            });
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function3<LocalThemeScope, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f111729a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f111730b;

        b(Function0<Unit> function0, int i10) {
            this.f111729a = function0;
            this.f111730b = i10;
        }

        public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                ComposerKt.U(1721868052, i11, -1, "com.meijer.mobile.meijer.activity.settings.SectionWalkthroughActivity.WalkThroughItem.<anonymous> (SectionWalkthroughActivity.kt:130)");
            }
            I seven = AdsTheme.getAdsTypography().getHeadings().getSeven();
            T adsColorText02 = AdsTheme.getAdsColors().getAdsColorText02();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierH = J.h(companion, 0.0f, 1, null);
            composer.startReplaceGroup(5004770);
            boolean zV = composer.V(this.f111729a);
            final Function0<Unit> function0 = this.f111729a;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SectionWalkthroughActivity.b.c(function0);
                    }
                };
                composer.t(objB);
            }
            composer.P();
            q1.Label label = new q1.Label(D.i(ClickableKt.d(modifierH, false, null, null, (Function0) objB, 7, null), H1.h.p(12)), adsColorText02, null, null, 0, false, 0, seven, null, 380, null);
            String string = ((Context) composer.o(AndroidCompositionLocals_androidKt.g())).getString(this.f111730b);
            Intrinsics.i(string, "getString(...)");
            ri.j.h(AdsTheme, label, string, null, composer, (i11 & 14) | LocalThemeScope.f15770g | (q1.Label.f140080j << 3), 4);
            C17917Z.a(J.i(J.h(companion, 0.0f, 1, null), H1.h.p(1)), AdsTheme.getAdsColors().getAdsColorUIDivider().getColor(), 0.0f, 0.0f, composer, 6, 12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
            b(localThemeScope, composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(Function0 function0) {
            function0.invoke();
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SectionWalkthroughActivity f111732a;

            a(SectionWalkthroughActivity sectionWalkthroughActivity) {
                this.f111732a = sectionWalkthroughActivity;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-997723099, i10, -1, "com.meijer.mobile.meijer.activity.settings.SectionWalkthroughActivity.onCreate.<anonymous>.<anonymous> (SectionWalkthroughActivity.kt:61)");
                }
                this.f111732a.K1(AdsTheme, null, composer, LocalThemeScope.f15770g | (i10 & 14), 1);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        c() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2051538070, i10, -1, "com.meijer.mobile.meijer.activity.settings.SectionWalkthroughActivity.onCreate.<anonymous> (SectionWalkthroughActivity.kt:60)");
            }
            K.b(null, ComposableLambdaKt.c(-997723099, true, new a(SectionWalkthroughActivity.this), composer, 54), composer, 48, 1);
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
    public static final Unit N1(SectionWalkthroughActivity sectionWalkthroughActivity, InterfaceC5730l0 interfaceC5730l0, LocalThemeScope localThemeScope) {
        R1(interfaceC5730l0, true);
        sectionWalkthroughActivity.isRewardsFirstTimeOpened = true;
        V v10 = sectionWalkthroughActivity.binding;
        if (v10 == null) {
            Intrinsics.y("binding");
            v10 = null;
        }
        v10.f20357A.setContent(ComposableLambdaKt.composableLambdaInstance(835168634, true, sectionWalkthroughActivity.new a(localThemeScope, interfaceC5730l0)));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T1(SectionWalkthroughActivity sectionWalkthroughActivity, int i10, Function0 function0, int i11, Composer composer, int i12) {
        sectionWalkthroughActivity.S1(i10, function0, composer, J0.a(i11 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L1(SectionWalkthroughActivity sectionWalkthroughActivity) {
        X.INSTANCE.a(WalkThroughType.SHOPPING_LIST, sectionWalkthroughActivity);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M1(SectionWalkthroughActivity sectionWalkthroughActivity) {
        sectionWalkthroughActivity.c2(WalkThroughType.MAIN_APP_FIRST_LAUNCH);
        sectionWalkthroughActivity.Z1(C14476c.c("rewards: help: pharmacy"));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O1(SectionWalkthroughActivity sectionWalkthroughActivity) {
        sectionWalkthroughActivity.c2(WalkThroughType.MCARD);
        sectionWalkthroughActivity.Z1(C14476c.c("rewards: help: mCard"));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P1(SectionWalkthroughActivity sectionWalkthroughActivity, LocalThemeScope localThemeScope, Modifier modifier, int i10, int i11, Composer composer, int i12) {
        sectionWalkthroughActivity.K1(localThemeScope, modifier, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a2(AbstractC14482i.Page page, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.v("rewards");
        track.c(page);
        return Unit.f142422a;
    }

    private final void c2(WalkThroughType walkThroughType) {
        new X.a(this, walkThroughType).l(true).b(true).a().b();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K1(final Ji.LocalThemeScope r18, androidx.compose.ui.Modifier r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.settings.SectionWalkthroughActivity.K1(Ji.M, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public final void S1(final int i10, final Function0<Unit> onClickAction, Composer composer, final int i11) {
        int i12;
        Intrinsics.j(onClickAction, "onClickAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1980126021);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(onClickAction) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1980126021, i12, -1, "com.meijer.mobile.meijer.activity.settings.SectionWalkthroughActivity.WalkThroughItem (SectionWalkthroughActivity.kt:128)");
            }
            K.b(null, ComposableLambdaKt.c(1721868052, true, new b(onClickAction, i10), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: com.meijer.mobile.meijer.activity.settings.r
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SectionWalkthroughActivity.T1(this.f112343a, i10, onClickAction, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Aj.b
    public Toolbar v() {
        V v10 = this.binding;
        if (v10 == null) {
            Intrinsics.y("binding");
            v10 = null;
        }
        MaterialToolbar appBar = v10.f20362z;
        Intrinsics.i(appBar, "appBar");
        return appBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Q1(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R1(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    private final void Z1(final AbstractC14482i.Page page) {
        getAnalyticsEngine().h(C14476c.a("event: walkthrough"), new Function1() { // from class: com.meijer.mobile.meijer.activity.settings.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SectionWalkthroughActivity.a2(page, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b2(SectionWalkthroughActivity sectionWalkthroughActivity) {
        if (!sectionWalkthroughActivity.onNavigateUp()) {
            sectionWalkthroughActivity.finish();
        }
        return Unit.f142422a;
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_MeijerActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        V vK0 = V.K0(getLayoutInflater());
        this.binding = vK0;
        V v10 = null;
        if (vK0 == null) {
            Intrinsics.y("binding");
            vK0 = null;
        }
        setContentView(Zr.a.j(vK0.getRoot(), false, 1, null));
        V v11 = this.binding;
        if (v11 == null) {
            Intrinsics.y("binding");
        } else {
            v10 = v11;
        }
        v10.f20360D.setContent(ComposableLambdaKt.composableLambdaInstance(2051538070, true, new c()));
        Aj.b.O0(this, 0, 0, new Function0() { // from class: com.meijer.mobile.meijer.activity.settings.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SectionWalkthroughActivity.b2(this.f112331a);
            }
        }, 3, null);
    }

    @Override // com.meijer.mobile.meijer.activity.MeijerActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        V v10 = this.binding;
        if (v10 == null) {
            Intrinsics.y("binding");
            v10 = null;
        }
        v10.f20359C.W(false);
        Nu.b bVar = this.disposable;
        if (bVar != null) {
            bVar.dispose();
        }
    }
}
