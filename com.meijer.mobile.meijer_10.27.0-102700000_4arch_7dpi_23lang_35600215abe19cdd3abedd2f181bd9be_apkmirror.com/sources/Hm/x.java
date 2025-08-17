package Hm;

import Ji.C;
import Ji.LocalThemeScope;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import com.fullstory.FS;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.checkout.payment.EbtPanData;
import j0.InterfaceC14810b;
import ji.InterfaceC14920X;
import ji.q1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import p1.C16193g;
import pi.C16307b;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u001aö\u0001\u0010\u001b\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102#\u0010\u0013\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000e0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072#\u0010\u0018\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000e0\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001e\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0081\u0001\u0010%\u001a\u00020\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010 \u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u000e0\tH\u0001¢\u0006\u0004\b%\u0010&¨\u0006(²\u0006\u000e\u0010'\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isLoading", "Lcom/meijer/mobile/meijer/activity/checkout/payment/p0;", "ebtPanData", "", "ebtCardInputError", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "Lkotlin/ParameterName;", "name", "ebtResponse", "", "successEbtResultPair", "Lkotlin/Function0;", "onGetBalanceClicked", "errorMessage", "onError", "onClose", "isShowPinPad", "acculynkPostBody", "results", "handleEbtBalanceResults", "isWebPageLoading", "updateWebPageLoading", "q", "(LJi/M;Landroidx/compose/ui/Modifier;ZLcom/meijer/mobile/meijer/activity/checkout/payment/p0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "message", "B", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "clearFocus", "onFocusCleared", "onSuccessEbtResponse", "error", "onShowError", "m", "(Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/payment/p0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "retrievePanData", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class x {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC14920X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f12900a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC14810b f12901b;

        a(LocalThemeScope localThemeScope, InterfaceC14810b interfaceC14810b) {
            this.f12900a = localThemeScope;
            this.f12901b = interfaceC14810b;
        }

        public final void a(InterfaceC14920X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-622073888, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.ebt.view.EbtPanField.<anonymous>.<anonymous> (EbtPanField.kt:98)");
            }
            Bi.m.e(this.f12900a, this.f12901b.g(Modifier.INSTANCE, P0.e.INSTANCE.e()), Assemble.getLoading().getLargeLoadingV2(), Bi.o.f2584a, null, null, null, composer, LocalThemeScope.f15770g | 3072 | (q1.k.LargeV2.f140096f << 6), 56);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14920X interfaceC14920X, Composer composer, Integer num) {
            a(interfaceC14920X, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f12902a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f12903b;

        b(LocalThemeScope localThemeScope, String str) {
            this.f12902a = localThemeScope;
            this.f12903b = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(427198440, i10, -1, "com.meijer.mobile.meijer.activity.checkout.payment.ebt.view.ErrorMessageBox.<anonymous>.<anonymous> (EbtPanField.kt:208)");
            }
            LocalThemeScope localThemeScope = this.f12902a;
            float f10 = 8;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.i.e.f15552d, C16193g.c(Y.f99466Ab, composer, 0), null, null, 0.0f, null, D.m(Modifier.INSTANCE, H1.h.p(f10), 0.0f, H1.h.p(f10), 0.0f, 10, null), 60, null);
            int i11 = LocalThemeScope.f15770g;
            C16307b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f140067h << 3), 6);
            LocalThemeScope localThemeScope2 = this.f12902a;
            ri.j.h(localThemeScope2, new q1.Label(null, this.f12902a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBodyCompact().getTwo(), null, 381, null), this.f12903b, null, composer, i11 | (q1.Label.f140080j << 3), 4);
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final Ji.LocalThemeScope r43, androidx.compose.ui.Modifier r44, boolean r45, com.meijer.mobile.meijer.activity.checkout.payment.EbtPanData r46, java.lang.String r47, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtPanResponse, kotlin.Unit> r48, final kotlin.jvm.functions.Function0<kotlin.Unit> r49, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r50, final kotlin.jvm.functions.Function0<kotlin.Unit> r51, boolean r52, java.lang.String r53, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r54, boolean r55, final kotlin.jvm.functions.Function0<kotlin.Unit> r56, androidx.compose.runtime.Composer r57, final int r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 1806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hm.x.q(Ji.M, androidx.compose.ui.Modifier, boolean, com.meijer.mobile.meijer.activity.checkout.payment.p0, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, java.lang.String, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(InterfaceC5730l0 interfaceC5730l0) {
        s(interfaceC5730l0, false);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, EbtPanData ebtPanData, String str, Function1 function1, Function0 function0, Function1 function12, Function0 function02, boolean z11, String str2, Function1 function13, boolean z12, Function0 function03, int i10, int i11, int i12, Composer composer, int i13) {
        q(localThemeScope, modifier, z10, ebtPanData, str, function1, function0, function12, function02, z11, str2, function13, z12, function03, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, int i11, Composer composer, int i12) {
        B(localThemeScope, modifier, str, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x014e  */
    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(androidx.compose.ui.Modifier r24, com.meijer.mobile.meijer.activity.checkout.payment.EbtPanData r25, final boolean r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtPanResponse, kotlin.Unit> r28, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Hm.x.m(androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.payment.p0, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView n(Function1 function1, Function1 function12, EbtPanData ebtPanData, Context context) {
        HttpUrl httpUrlB;
        Intrinsics.j(context, "context");
        WebView webView = new WebView(context);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        FS.setWebViewClient(webView, new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new k(function1, function12), "JAVASCRIPT_INTERFACE_FUNCTION");
        String url = (ebtPanData == null || (httpUrlB = ebtPanData.b()) == null) ? null : httpUrlB.getUrl();
        if (url == null) {
            url = "";
        }
        FS.trackWebView(webView);
        webView.loadUrl(url);
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(boolean z10, Function0 function0, WebView webview) {
        Intrinsics.j(webview, "webview");
        if (z10) {
            webview.clearFocus();
            function0.invoke();
        }
        webview.evaluateJavascript("window.addEventListener('message', function(event) {\n    JAVASCRIPT_INTERFACE_FUNCTION.callFromJs(JSON.stringify(event.data));\n});", null);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Modifier modifier, EbtPanData ebtPanData, boolean z10, Function0 function0, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        m(modifier, ebtPanData, z10, function0, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function1 function1, String error) {
        Intrinsics.j(error, "error");
        function1.invoke(error);
        return Unit.f142422a;
    }

    private static final void B(final LocalThemeScope localThemeScope, Modifier modifier, final String str, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1209663678);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                zD = composerStartRestartGroup.V(localThemeScope);
            } else {
                zD = composerStartRestartGroup.D(localThemeScope);
            }
            if (zD) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 2) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(str)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i16 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1209663678, i12, -1, "com.meijer.mobile.meijer.activity.checkout.payment.ebt.view.ErrorMessageBox (EbtPanField.kt:202)");
            }
            MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.h(), false);
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5664j c5664j = C5664j.f48612a;
            kotlin.g.e(null, 0.0f, ComposableLambdaKt.c(427198440, true, new b(localThemeScope, str), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Hm.n
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return x.C(localThemeScope, modifier2, str, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean r(InterfaceC5730l0<Boolean> interfaceC5730l0) {
        return interfaceC5730l0.getValue().booleanValue();
    }

    private static final void s(InterfaceC5730l0<Boolean> interfaceC5730l0, boolean z10) {
        interfaceC5730l0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(Function0 function0, InterfaceC5730l0 interfaceC5730l0) {
        function0.invoke();
        s(interfaceC5730l0, true);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(Function0 function0) {
        function0.invoke();
        return Unit.f142422a;
    }
}
