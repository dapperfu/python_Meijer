package com.meijer.mobile.mperks.ux.learnToEarn;

import Bl.f;
import Bl.k;
import Ki.K;
import Ki.LocalThemeScope;
import android.os.Bundle;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import co.AbstractC6536h;
import co.EnumC6538j;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.mperks.ux.MperksFeatureActivity;
import com.meijer.mobile.mperks.ux.f0;
import com.meijer.mobile.mperks.ux.learnToEarn.LearnToEarnActivity;
import e.C13737e;
import j0.InterfaceC14882C;
import kotlin.C17987a1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import po.u;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/mperks/ux/learnToEarn/LearnToEarnActivity;", "Lcom/meijer/mobile/mperks/ux/MperksFeatureActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class LearnToEarnActivity extends MperksFeatureActivity {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.mperks.ux.learnToEarn.LearnToEarnActivity$a$a, reason: collision with other inner class name */
        static final class C1815a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LearnToEarnActivity f115230a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.mperks.ux.learnToEarn.LearnToEarnActivity$a$a$a, reason: collision with other inner class name */
            static final class C1816a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f115231a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LearnToEarnActivity f115232b;

                C1816a(LocalThemeScope localThemeScope, LearnToEarnActivity learnToEarnActivity) {
                    this.f115231a = localThemeScope;
                    this.f115232b = learnToEarnActivity;
                }

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(277737033, i10, -1, "com.meijer.mobile.mperks.ux.learnToEarn.LearnToEarnActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (LearnToEarnActivity.kt:37)");
                    }
                    LocalThemeScope localThemeScope = this.f115231a;
                    Modifier modifierH = J.h(Modifier.INSTANCE, 0.0f, 1, null);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f115232b);
                    final LearnToEarnActivity learnToEarnActivity = this.f115232b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.mperks.ux.learnToEarn.a
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return LearnToEarnActivity.a.C1815a.C1816a.c(learnToEarnActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    u.L(localThemeScope, modifierH, (Function0) objB, composer, LocalThemeScope.f17314g | 48, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(LearnToEarnActivity learnToEarnActivity) {
                    learnToEarnActivity.finish();
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.mperks.ux.learnToEarn.LearnToEarnActivity$a$a$b */
            static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LearnToEarnActivity f115233a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f115234b;

                b(LearnToEarnActivity learnToEarnActivity, LocalThemeScope localThemeScope) {
                    this.f115233a = learnToEarnActivity;
                    this.f115234b = localThemeScope;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit e(LearnToEarnActivity learnToEarnActivity, EnumC6538j navigateToTab) {
                    Intrinsics.j(navigateToTab, "navigateToTab");
                    learnToEarnActivity.startActivity(f0.f114968a.b(learnToEarnActivity, navigateToTab));
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit f(LearnToEarnActivity learnToEarnActivity, AbstractC6536h navigationRequest) {
                    Intrinsics.j(navigationRequest, "navigationRequest");
                    if (Intrinsics.e(navigationRequest, AbstractC6536h.g.f62747a)) {
                        learnToEarnActivity.startActivity(learnToEarnActivity.t1().r("https://www.meijer.com/mperks/new-mperks.html"));
                    } else if (Intrinsics.e(navigationRequest, AbstractC6536h.k.f62751a)) {
                        learnToEarnActivity.startActivity(k.b(learnToEarnActivity, false, null, null, null, null, null, 126, null));
                    } else if (Intrinsics.e(navigationRequest, AbstractC6536h.f.f62746a)) {
                        learnToEarnActivity.startActivity(f.f3124a.a(learnToEarnActivity, learnToEarnActivity.s1().e(AbstractC18503f.h0.f172881h)));
                    }
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit g(LearnToEarnActivity learnToEarnActivity, EnumC6538j navigateToTab) {
                    Intrinsics.j(navigateToTab, "navigateToTab");
                    learnToEarnActivity.startActivity(f0.f114968a.b(learnToEarnActivity, navigateToTab));
                    return Unit.f143329a;
                }

                public final void d(InterfaceC14882C paddingValues, Composer composer, int i10) {
                    int i11;
                    Intrinsics.j(paddingValues, "paddingValues");
                    if ((i10 & 6) == 0) {
                        i11 = (composer.V(paddingValues) ? 4 : 2) | i10;
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-756628176, i11, -1, "com.meijer.mobile.mperks.ux.learnToEarn.LearnToEarnActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (LearnToEarnActivity.kt:39)");
                    }
                    if (this.f115233a.u1().b()) {
                        composer.startReplaceGroup(-721528155);
                        LocalThemeScope localThemeScope = this.f115234b;
                        Modifier modifierH = D.h(J.f(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                        composer.startReplaceGroup(5004770);
                        boolean zD = composer.D(this.f115233a);
                        final LearnToEarnActivity learnToEarnActivity = this.f115233a;
                        Object objB = composer.B();
                        if (zD || objB == Composer.INSTANCE.a()) {
                            objB = new Function1() { // from class: com.meijer.mobile.mperks.ux.learnToEarn.b
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LearnToEarnActivity.a.C1815a.b.e(learnToEarnActivity, (EnumC6538j) obj);
                                }
                            };
                            composer.t(objB);
                        }
                        composer.P();
                        u.J(localThemeScope, modifierH, (Function1) objB, composer, LocalThemeScope.f17314g, 0);
                        composer.P();
                    } else {
                        composer.startReplaceGroup(-720729316);
                        LocalThemeScope localThemeScope2 = this.f115234b;
                        Modifier modifierF = J.f(Modifier.INSTANCE, 0.0f, 1, null);
                        composer.startReplaceGroup(5004770);
                        boolean zD2 = composer.D(this.f115233a);
                        final LearnToEarnActivity learnToEarnActivity2 = this.f115233a;
                        Object objB2 = composer.B();
                        if (zD2 || objB2 == Composer.INSTANCE.a()) {
                            objB2 = new Function1() { // from class: com.meijer.mobile.mperks.ux.learnToEarn.c
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LearnToEarnActivity.a.C1815a.b.f(learnToEarnActivity2, (AbstractC6536h) obj);
                                }
                            };
                            composer.t(objB2);
                        }
                        Function1 function1 = (Function1) objB2;
                        composer.P();
                        composer.startReplaceGroup(5004770);
                        boolean zD3 = composer.D(this.f115233a);
                        final LearnToEarnActivity learnToEarnActivity3 = this.f115233a;
                        Object objB3 = composer.B();
                        if (zD3 || objB3 == Composer.INSTANCE.a()) {
                            objB3 = new Function1() { // from class: com.meijer.mobile.mperks.ux.learnToEarn.d
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LearnToEarnActivity.a.C1815a.b.g(learnToEarnActivity3, (EnumC6538j) obj);
                                }
                            };
                            composer.t(objB3);
                        }
                        composer.P();
                        u.N(localThemeScope2, modifierF, function1, (Function1) objB3, composer, LocalThemeScope.f17314g | 48, 0);
                        composer.P();
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    d(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            C1815a(LearnToEarnActivity learnToEarnActivity) {
                this.f115230a = learnToEarnActivity;
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
                    ComposerKt.U(1714848174, i11, -1, "com.meijer.mobile.mperks.ux.learnToEarn.LearnToEarnActivity.onCreate.<anonymous>.<anonymous> (LearnToEarnActivity.kt:35)");
                }
                C17987a1.a(FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE), null, ComposableLambdaKt.c(277737033, true, new C1816a(AdsTheme, this.f115230a), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(-756628176, true, new b(this.f115230a, AdsTheme), composer, 54), composer, 384, 12582912, 131066);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                a(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
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
                ComposerKt.U(-1500912355, i10, -1, "com.meijer.mobile.mperks.ux.learnToEarn.LearnToEarnActivity.onCreate.<anonymous> (LearnToEarnActivity.kt:34)");
            }
            K.b(null, ComposableLambdaKt.c(1714848174, true, new C1815a(LearnToEarnActivity.this), composer, 54), composer, 48, 1);
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

    @Override // com.meijer.mobile.mperks.ux.Hilt_MperksFeatureActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1500912355, true, new a()), 1, null);
    }
}
