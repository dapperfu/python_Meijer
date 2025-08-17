package com.meijer.mobile.subscription.ux.howItWorks;

import Ji.K;
import Ji.LocalThemeScope;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.view.ComponentActivity;
import com.meijer.mobile.subscription.ux.howItWorks.HowSubscriptionsWorksActivity;
import e.C13589e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nr.C15939h;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/subscription/ux/howItWorks/HowSubscriptionsWorksActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HowSubscriptionsWorksActivity extends ComponentActivity {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.subscription.ux.howItWorks.HowSubscriptionsWorksActivity$a$a, reason: collision with other inner class name */
        static final class C1923a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ HowSubscriptionsWorksActivity f118756a;

            C1923a(HowSubscriptionsWorksActivity howSubscriptionsWorksActivity) {
                this.f118756a = howSubscriptionsWorksActivity;
            }

            public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(569722961, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.HowSubscriptionsWorksActivity.onCreate.<anonymous>.<anonymous> (HowSubscriptionsWorksActivity.kt:18)");
                }
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(this.f118756a);
                final HowSubscriptionsWorksActivity howSubscriptionsWorksActivity = this.f118756a;
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: com.meijer.mobile.subscription.ux.howItWorks.a
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HowSubscriptionsWorksActivity.a.C1923a.c(howSubscriptionsWorksActivity);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C15939h.m(AdsTheme, null, (Function0) objB, composer, LocalThemeScope.f15770g | (i10 & 14), 1);
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
            public static final Unit c(HowSubscriptionsWorksActivity howSubscriptionsWorksActivity) {
                howSubscriptionsWorksActivity.finish();
                return Unit.f142422a;
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
                ComposerKt.U(-1386065982, i10, -1, "com.meijer.mobile.subscription.ux.howItWorks.HowSubscriptionsWorksActivity.onCreate.<anonymous> (HowSubscriptionsWorksActivity.kt:17)");
            }
            K.b(null, ComposableLambdaKt.c(569722961, true, new C1923a(HowSubscriptionsWorksActivity.this), composer, 54), composer, 48, 1);
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

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1386065982, true, new a()), 1, null);
    }
}
