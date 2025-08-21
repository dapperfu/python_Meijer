package com.meijer.mobile.meijer.activity.personalized.modals;

import Ki.LocalThemeScope;
import Nn.R1;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import gi.GoogleAdAnalytics;
import gi.GoogleAdData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import ku.AbstractC15424a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/personalized/modals/o0;", "Lku/a;", "LNn/R1;", "Lgi/d;", "adData", "Lkotlin/Function1;", "Lgi/a;", "", "onGoogleAdClicked", "<init>", "(Lgi/d;Lkotlin/jvm/functions/Function1;)V", "viewBinding", "", "position", "C", "(LNn/R1;I)V", "j", "()I", "", "i", "()J", "Landroid/view/View;", "view", "D", "(Landroid/view/View;)LNn/R1;", "e", "Lgi/d;", "f", "Lkotlin/jvm/functions/Function1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.o0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C12607o0 extends AbstractC15424a<R1> {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final GoogleAdData adData;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Function1<GoogleAdAnalytics, Unit> onGoogleAdClicked;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.o0$a */
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.personalized.modals.o0$a$a, reason: collision with other inner class name */
        static final class C1728a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12607o0 f112361a;

            C1728a(C12607o0 c12607o0) {
                this.f112361a = c12607o0;
            }

            public final void a(LocalThemeScope AdsTheme, Composer composer, int i10) {
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
                    ComposerKt.U(1310701425, i11, -1, "com.meijer.mobile.meijer.activity.personalized.modals.ProductListAdItem.bind.<anonymous>.<anonymous> (ProductListAdItem.kt:29)");
                }
                composer.startMovableGroup(1158652468, Long.valueOf(this.f112361a.i()));
                AdManagerAdView adManagerAdViewS = sr.p.S(this.f112361a.adData, this.f112361a.onGoogleAdClicked, null, composer, GoogleAdData.f134248f, 4);
                composer.startReplaceGroup(1158655519);
                if (adManagerAdViewS != null) {
                    sr.p.o(AdsTheme, null, adManagerAdViewS, composer, (i11 & 14) | LocalThemeScope.f17314g, 1);
                    Unit unit = Unit.f143329a;
                }
                composer.P();
                composer.T();
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
                ComposerKt.U(-1003090592, i10, -1, "com.meijer.mobile.meijer.activity.personalized.modals.ProductListAdItem.bind.<anonymous> (ProductListAdItem.kt:28)");
            }
            Ki.K.b(null, ComposableLambdaKt.c(1310701425, true, new C1728a(C12607o0.this), composer, 54), composer, 48, 1);
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

    /* JADX WARN: Multi-variable type inference failed */
    public C12607o0(GoogleAdData adData, Function1<? super GoogleAdAnalytics, Unit> onGoogleAdClicked) {
        Intrinsics.j(adData, "adData");
        Intrinsics.j(onGoogleAdClicked, "onGoogleAdClicked");
        this.adData = adData;
        this.onGoogleAdClicked = onGoogleAdClicked;
    }

    @Override // ku.AbstractC15424a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void u(R1 viewBinding, int position) {
        Intrinsics.j(viewBinding, "viewBinding");
        viewBinding.f21631z.setContent(ComposableLambdaKt.composableLambdaInstance(-1003090592, true, new a()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ku.AbstractC15424a
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public R1 z(View view) {
        Intrinsics.j(view, "view");
        R1 r1M0 = R1.M0(view);
        Intrinsics.i(r1M0, "bind(...)");
        return r1M0;
    }

    @Override // ju.h
    public long i() {
        return this.adData.getAdUnitId().hashCode();
    }

    @Override // ju.h
    /* renamed from: j */
    public int getLayoutId() {
        return com.meijer.mobile.meijer.V.f100289x0;
    }
}
