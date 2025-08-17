package com.meijer.mobile.wic.ux;

import Ji.K;
import Ji.LocalThemeScope;
import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.view.L;
import com.fullstory.compose.FullStoryAnnotationsKt;
import com.meijer.mobile.wic.ux.y;
import e.C13589e;
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

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/meijer/mobile/wic/ux/WicLoginActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Lcom/meijer/mobile/wic/ux/y;", "wicNavigationRequest", "", "o1", "(Lcom/meijer/mobile/wic/ux/y;)V", "n1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class WicLoginActivity extends Hilt_WicLoginActivity {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.wic.ux.WicLoginActivity$a$a, reason: collision with other inner class name */
        static final class C1959a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WicLoginActivity f119392a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.wic.ux.WicLoginActivity$a$a$a, reason: collision with other inner class name */
            /* synthetic */ class C1960a extends FunctionReferenceImpl implements Function1<y, Unit> {
                C1960a(Object obj) {
                    super(1, obj, WicLoginActivity.class, "onNavigationRequest", "onNavigationRequest(Lcom/meijer/mobile/wic/ux/WicNavigationRequest;)V", 0);
                }

                public final void a(y p02) {
                    Intrinsics.j(p02, "p0");
                    ((WicLoginActivity) this.receiver).o1(p02);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(y yVar) {
                    a(yVar);
                    return Unit.f142422a;
                }
            }

            C1959a(WicLoginActivity wicLoginActivity) {
                this.f119392a = wicLoginActivity;
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
                    ComposerKt.U(529513984, i10, -1, "com.meijer.mobile.wic.ux.WicLoginActivity.onCreate.<anonymous>.<anonymous> (WicLoginActivity.kt:33)");
                }
                Modifier modifierFsUnmask = FullStoryAnnotationsKt.fsUnmask(Modifier.INSTANCE);
                WicLoginActivity wicLoginActivity = this.f119392a;
                composer.startReplaceGroup(5004770);
                boolean zD = composer.D(wicLoginActivity);
                Object objB = composer.B();
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new C1960a(wicLoginActivity);
                    composer.t(objB);
                }
                composer.P();
                m.t(AdsTheme, modifierFsUnmask, (Function1) ((KFunction) objB), composer, LocalThemeScope.f15770g | (i10 & 14), 0);
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

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(387986225, i10, -1, "com.meijer.mobile.wic.ux.WicLoginActivity.onCreate.<anonymous> (WicLoginActivity.kt:31)");
            }
            K.b(null, ComposableLambdaKt.c(529513984, true, new C1959a(WicLoginActivity.this), composer, 54), composer, 48, 1);
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
    public final void o1(y wicNavigationRequest) {
        if (!Intrinsics.e(wicNavigationRequest, y.a.f119463a)) {
            throw new NoWhenBranchMatchedException();
        }
        n1();
    }

    private final void n1() {
        finish();
    }

    @Override // com.meijer.mobile.wic.ux.Hilt_WicLoginActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        androidx.view.r.b(this, L.INSTANCE.c(0), null, 2, null);
        C13589e.b(this, null, ComposableLambdaKt.composableLambdaInstance(387986225, true, new a()), 1, null);
    }
}
