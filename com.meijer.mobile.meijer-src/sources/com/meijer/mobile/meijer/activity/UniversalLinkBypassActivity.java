package com.meijer.mobile.meijer.activity;

import Ki.K;
import Ki.LocalThemeScope;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.fullstory.FS;
import com.meijer.mobile.meijer.activity.UniversalLinkBypassActivity;
import e.C13737e;
import j0.C14903g;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.Headers;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0019\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/meijer/activity/UniversalLinkBypassActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "LDl/e;", "v", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "Lokhttp3/Headers;", "w", "Lokhttp3/Headers;", "q1", "()Lokhttp3/Headers;", "setGlobalHeaders", "(Lokhttp3/Headers;)V", "getGlobalHeaders$annotations", "globalHeaders", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
/* loaded from: classes10.dex */
public final class UniversalLinkBypassActivity extends Hilt_UniversalLinkBypassActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Headers globalHeaders;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f101836a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UniversalLinkBypassActivity f101837b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.meijer.activity.UniversalLinkBypassActivity$a$a, reason: collision with other inner class name */
        static final class C1417a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f101838a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ UniversalLinkBypassActivity f101839b;

            C1417a(String str, UniversalLinkBypassActivity universalLinkBypassActivity) {
                this.f101838a = str;
                this.f101839b = universalLinkBypassActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final WebView c(String str, UniversalLinkBypassActivity universalLinkBypassActivity, Context context) {
                Intrinsics.j(context, "context");
                WebView webView = new WebView(context);
                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                Map<String, String> mapY = MapsKt.y(universalLinkBypassActivity.q1());
                FS.trackWebView(webView);
                webView.loadUrl(str, mapY);
                webView.getSettings().setJavaScriptEnabled(true);
                return webView;
            }

            public final void b(LocalThemeScope AdsTheme, Composer composer, int i10) {
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1408918268, i10, -1, "com.meijer.mobile.meijer.activity.UniversalLinkBypassActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (UniversalLinkBypassActivity.kt:43)");
                }
                final String str = this.f101838a;
                final UniversalLinkBypassActivity universalLinkBypassActivity = this.f101839b;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
                int iA = C5859f.a(composer, 0);
                InterfaceC5884s interfaceC5884sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
                InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
                Function0<InterfaceC5953g> function0A = companion2.a();
                if (composer.k() == null) {
                    C5859f.c();
                }
                composer.F();
                if (composer.h()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = D1.a(composer);
                D1.c(composerA, measurePolicyA, companion2.e());
                D1.c(composerA, interfaceC5884sR, companion2.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
                if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                D1.c(composerA, modifierE, companion2.f());
                C14903g c14903g = C14903g.f139698a;
                composer.startReplaceGroup(-1633490746);
                boolean zV = composer.V(str) | composer.D(universalLinkBypassActivity);
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: com.meijer.mobile.meijer.activity.u
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return UniversalLinkBypassActivity.a.C1417a.c(str, universalLinkBypassActivity, (Context) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                androidx.compose.ui.viewinterop.e.a((Function1) objB, companion, null, composer, 48, 4);
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                b(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a(String str, UniversalLinkBypassActivity universalLinkBypassActivity) {
            this.f101836a = str;
            this.f101837b = universalLinkBypassActivity;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1317637973, i10, -1, "com.meijer.mobile.meijer.activity.UniversalLinkBypassActivity.onCreate.<anonymous>.<anonymous> (UniversalLinkBypassActivity.kt:42)");
            }
            K.b(null, ComposableLambdaKt.c(1408918268, true, new C1417a(this.f101836a, this.f101837b), composer, 54), composer, 48, 1);
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

    public final Dl.e getMeijerIntent() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    public final Headers q1() {
        Headers headers = this.globalHeaders;
        if (headers != null) {
            return headers;
        }
        Intrinsics.x("globalHeaders");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_UniversalLinkBypassActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra("extra.bypass.universal.link.url");
        if (stringExtra != null) {
            C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(-1317637973, true, new a(stringExtra, this)), 1, null);
        } else {
            getMeijerIntent().p(this, false);
        }
    }
}
