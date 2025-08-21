package yr;

import Ki.LocalThemeScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import j0.InterfaceC14888I;
import ki.C15132A;
import ki.j1;
import ki.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import oi.E0;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a)\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LKi/M;", "", "buttonText", "Lkotlin/Function0;", "", "onButtonClick", "b", "(LKi/M;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class e0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<j1, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f171902a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f171903b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f171904c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yr.e0$a$a, reason: collision with other inner class name */
        static final class C2773a implements Function3<InterfaceC14888I, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f171905a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ j1 f171906b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f171907c;

            C2773a(LocalThemeScope localThemeScope, j1 j1Var, String str) {
                this.f171905a = localThemeScope;
                this.f171906b = j1Var;
                this.f171907c = str;
            }

            public final void a(InterfaceC14888I AdsButton, Composer composer, int i10) {
                Intrinsics.j(AdsButton, "$this$AdsButton");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1919938064, i10, -1, "com.meijer.mobile.ui.common.SmallPassiveButton.<anonymous>.<anonymous> (SmallPassiveButton.kt:24)");
                }
                si.j.h(this.f171905a, this.f171906b.getLabels().getEnabledLabel(), this.f171907c, null, composer, LocalThemeScope.f17314g | (q1.Label.f142335j << 3), 4);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14888I interfaceC14888I, Composer composer, Integer num) {
                a(interfaceC14888I, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(LocalThemeScope localThemeScope, Function0<Unit> function0, String str) {
            this.f171902a = localThemeScope;
            this.f171903b = function0;
            this.f171904c = str;
        }

        public final void a(j1 Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-239306397, i10, -1, "com.meijer.mobile.ui.common.SmallPassiveButton.<anonymous> (SmallPassiveButton.kt:20)");
            }
            E0.b(this.f171902a, Assemble.getButtons().getEnabledButton(), this.f171903b, ComposableLambdaKt.c(1919938064, true, new C2773a(this.f171902a, Assemble, this.f171904c), composer, 54), composer, LocalThemeScope.f17314g | 3072 | (q1.d.StandardButton.f142229k << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(j1 j1Var, Composer composer, Integer num) {
            a(j1Var, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void b(final LocalThemeScope localThemeScope, final String buttonText, final Function0<Unit> onButtonClick, Composer composer, final int i10) {
        int i11;
        Intrinsics.j(localThemeScope, "<this>");
        Intrinsics.j(buttonText, "buttonText");
        Intrinsics.j(onButtonClick, "onButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-182349825);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope) : composerStartRestartGroup.D(localThemeScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(buttonText) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(onButtonClick) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-182349825, i11, -1, "com.meijer.mobile.ui.common.SmallPassiveButton (SmallPassiveButton.kt:18)");
            }
            Ki.Q.e(localThemeScope, C15132A.f141851a, ComposableLambdaKt.c(-239306397, true, new a(localThemeScope, onButtonClick, buttonText), composerStartRestartGroup, 54), composerStartRestartGroup, (i11 & 14) | LocalThemeScope.f17314g | 384 | (C15132A.f141852b << 3));
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: yr.d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e0.c(localThemeScope, buttonText, onButtonClick, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(LocalThemeScope localThemeScope, String str, Function0 function0, int i10, Composer composer, int i11) {
        b(localThemeScope, str, function0, composer, J0.a(i10 | 1));
        return Unit.f143329a;
    }
}
