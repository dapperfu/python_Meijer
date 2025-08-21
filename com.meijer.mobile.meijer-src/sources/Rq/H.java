package Rq;

import Ki.C;
import Ki.LocalThemeScope;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.fullstory.FS;
import com.meijer.mobile.meijer.activity.checkout.payment.EbtPanData;
import ki.InterfaceC15154X;
import ki.q1;
import kotlin.C4107g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import p1.C16338g;
import qi.C16671b;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\u001aö\u0001\u0010\u001b\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102#\u0010\u0013\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u000e0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072#\u0010\u0018\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u000e0\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a%\u0010\u001e\u001a\u00020\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0081\u0001\u0010%\u001a\u00020\u000e2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010 \u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u000e0\t2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u000e0\tH\u0001¢\u0006\u0004\b%\u0010&¨\u0006(²\u0006\u000e\u0010'\u001a\u00020\u00038\n@\nX\u008a\u008e\u0002"}, d2 = {"LKi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "isLoading", "Lcom/meijer/mobile/meijer/activity/checkout/payment/p0;", "ebtPanData", "", "ebtCardInputError", "Lkotlin/Function1;", "Lcom/meijer/mobile/meijer/activity/checkout/payment/ebt/response/EbtPanResponse;", "Lkotlin/ParameterName;", "name", "ebtResponse", "", "successEbtResultPair", "Lkotlin/Function0;", "onGetBalanceClicked", "errorMessage", "onError", "onClose", "isShowPinPad", "acculynkPostBody", "results", "handleEbtBalanceResults", "isWebPageLoading", "updateWebPageLoading", "p", "(LKi/M;Landroidx/compose/ui/Modifier;ZLcom/meijer/mobile/meijer/activity/checkout/payment/p0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "message", "z", "(LKi/M;Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "clearFocus", "onFocusCleared", "onSuccessEbtResponse", "error", "onShowError", "l", "(Landroidx/compose/ui/Modifier;Lcom/meijer/mobile/meijer/activity/checkout/payment/p0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "retrievePanData", "Meijer_playstoreRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class H {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function3<InterfaceC15154X, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33702a;

        a(LocalThemeScope localThemeScope) {
            this.f33702a = localThemeScope;
        }

        public final void a(InterfaceC15154X Assemble, Composer composer, int i10) {
            Intrinsics.j(Assemble, "$this$Assemble");
            if (ComposerKt.M()) {
                ComposerKt.U(-831245740, i10, -1, "com.meijer.mobile.singlepagecheckout.payment.EbtPanField.<anonymous>.<anonymous> (EbtPanField.kt:98)");
            }
            Ci.m.e(this.f33702a, null, Assemble.getLoading().getLargeLoadingV2(), Ci.o.f4629a, null, null, null, composer, LocalThemeScope.f17314g | 3072 | (q1.k.LargeV2.f142351f << 6), 57);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15154X interfaceC15154X, Composer composer, Integer num) {
            a(interfaceC15154X, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f33703a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f33704b;

        b(LocalThemeScope localThemeScope, String str) {
            this.f33703a = localThemeScope;
            this.f33704b = str;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(458130252, i10, -1, "com.meijer.mobile.singlepagecheckout.payment.ErrorMessageBox.<anonymous>.<anonymous> (EbtPanField.kt:231)");
            }
            LocalThemeScope localThemeScope = this.f33703a;
            q1.h.DrawableIcon drawableIcon = new q1.h.DrawableIcon(C.i.e.f17096d, C16338g.c(com.meijer.mobile.meijer.Y.f100383Db, composer, 0), null, null, 0.0f, null, androidx.compose.foundation.layout.D.k(Modifier.INSTANCE, this.f33703a.getAdsSpacing().getThree().getDp(), 0.0f, 2, null), 60, null);
            int i11 = LocalThemeScope.f17314g;
            C16671b.b(localThemeScope, drawableIcon, null, null, composer, i11 | (q1.h.DrawableIcon.f142322h << 3), 6);
            LocalThemeScope localThemeScope2 = this.f33703a;
            si.j.h(localThemeScope2, new q1.Label(null, this.f33703a.getAdsColors().getAdsColorText01(), null, null, 0, false, 0, localThemeScope2.getAdsTypography().getBodyCompact().getTwo(), null, 381, null), this.f33704b, null, composer, i11 | (q1.Label.f142335j << 3), 4);
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0205  */
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
    /* JADX WARN: Removed duplicated region for block: B:184:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(final Ki.LocalThemeScope r41, androidx.compose.ui.Modifier r42, boolean r43, com.meijer.mobile.meijer.activity.checkout.payment.EbtPanData r44, java.lang.String r45, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtPanResponse, kotlin.Unit> r46, final kotlin.jvm.functions.Function0<kotlin.Unit> r47, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r48, final kotlin.jvm.functions.Function0<kotlin.Unit> r49, boolean r50, java.lang.String r51, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r52, boolean r53, final kotlin.jvm.functions.Function0<kotlin.Unit> r54, androidx.compose.runtime.Composer r55, final int r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 2010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rq.H.p(Ki.M, androidx.compose.ui.Modifier, boolean, com.meijer.mobile.meijer.activity.checkout.payment.p0, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, boolean, java.lang.String, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(InterfaceC5872l0 interfaceC5872l0) {
        x(interfaceC5872l0, false);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(InterfaceC5872l0 interfaceC5872l0) {
        x(interfaceC5872l0, false);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(LocalThemeScope localThemeScope, Modifier modifier, String str, int i10, int i11, Composer composer, int i12) {
        z(localThemeScope, modifier, str, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
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
    public static final void l(androidx.compose.ui.Modifier r24, com.meijer.mobile.meijer.activity.checkout.payment.EbtPanData r25, final boolean r26, final kotlin.jvm.functions.Function0<kotlin.Unit> r27, final kotlin.jvm.functions.Function1<? super com.meijer.mobile.meijer.activity.checkout.payment.ebt.response.EbtPanResponse, kotlin.Unit> r28, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Rq.H.l(androidx.compose.ui.Modifier, com.meijer.mobile.meijer.activity.checkout.payment.p0, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView m(Function1 function1, Function1 function12, EbtPanData ebtPanData, Context context) {
        HttpUrl httpUrlB;
        Intrinsics.j(context, "context");
        WebView webView = new WebView(context);
        webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        FS.setWebViewClient(webView, new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new C5318v(function1, function12), "JAVASCRIPT_INTERFACE_FUNCTION");
        String url = (ebtPanData == null || (httpUrlB = ebtPanData.b()) == null) ? null : httpUrlB.getUrl();
        if (url == null) {
            url = "";
        }
        FS.trackWebView(webView);
        webView.loadUrl(url);
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(boolean z10, Function0 function0, WebView webView) {
        Intrinsics.j(webView, "webView");
        if (z10) {
            webView.clearFocus();
            function0.invoke();
        }
        webView.evaluateJavascript("window.addEventListener('message', function(event) {\n    JAVASCRIPT_INTERFACE_FUNCTION.callFromJs(JSON.stringify(event.data));\n});", null);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(Modifier modifier, EbtPanData ebtPanData, boolean z10, Function0 function0, Function1 function1, Function1 function12, int i10, int i11, Composer composer, int i12) {
        l(modifier, ebtPanData, z10, function0, function1, function12, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function1 function1, String error) {
        Intrinsics.j(error, "error");
        function1.invoke(error);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function1 function1, String error) {
        Intrinsics.j(error, "error");
        function1.invoke(error);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(LocalThemeScope localThemeScope, Modifier modifier, boolean z10, EbtPanData ebtPanData, String str, Function1 function1, Function0 function0, Function1 function12, Function0 function02, boolean z11, String str2, Function1 function13, boolean z12, Function0 function03, int i10, int i11, int i12, Composer composer, int i13) {
        p(localThemeScope, modifier, z10, ebtPanData, str, function1, function0, function12, function02, z11, str2, function13, z12, function03, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f143329a;
    }

    private static final boolean q(InterfaceC5872l0<Boolean> interfaceC5872l0) {
        return interfaceC5872l0.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(Function0 function0, InterfaceC5872l0 interfaceC5872l0) {
        function0.invoke();
        x(interfaceC5872l0, true);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.f143329a;
    }

    private static final void x(InterfaceC5872l0<Boolean> interfaceC5872l0, boolean z10) {
        interfaceC5872l0.setValue(Boolean.valueOf(z10));
    }

    private static final void z(final LocalThemeScope localThemeScope, Modifier modifier, final String str, Composer composer, final int i10, final int i11) {
        int i12;
        boolean zD;
        int i13;
        int i14;
        int i15;
        Composer composerStartRestartGroup = composer.startRestartGroup(-66157774);
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
                ComposerKt.U(-66157774, i12, -1, "com.meijer.mobile.singlepagecheckout.payment.ErrorMessageBox (EbtPanField.kt:225)");
            }
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.h(), false);
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicyG, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C5806j c5806j = C5806j.f48836a;
            C4107g.e(null, 0.0f, ComposableLambdaKt.c(458130252, true, new b(localThemeScope, str), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 3);
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final Modifier modifier2 = modifier;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Rq.E
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return H.A(localThemeScope, modifier2, str, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
