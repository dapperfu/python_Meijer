package ra;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebView;
import com.emarsys.mobileengage.iam.webview.IamWebViewCreationFailedException;
import com.fullstory.FS;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import la.g;
import la.h;
import la.s;
import ma.InAppMetaData;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\"\u0010#\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lra/a;", "", "Ll9/b;", "concurrentHandlerHolder", "Lla/h;", "jsBridgeFactory", "Lla/s;", "commandFactory", "Landroid/content/Context;", "activity", "<init>", "(Ll9/b;Lla/h;Lla/s;Landroid/content/Context;)V", "", "html", "Lma/b;", "inAppMetaData", "Lra/f;", "messageLoadedListener", "", "b", "(Ljava/lang/String;Lma/b;Lra/f;)V", "Lorg/json/JSONObject;", "payload", "d", "(Lorg/json/JSONObject;)V", "c", "()V", "a", "Ll9/b;", "Lla/s;", "Landroid/webkit/WebView;", "Landroid/webkit/WebView;", "()Landroid/webkit/WebView;", "setWebView", "(Landroid/webkit/WebView;)V", "webView", "Lla/g;", "Lla/g;", "getJsBridge", "()Lla/g;", "setJsBridge", "(Lla/g;)V", "jsBridge", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"SetJavaScriptEnabled"})
/* renamed from: ra.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16736a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l9.b concurrentHandlerHolder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s commandFactory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private WebView webView;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private g jsBridge;

    public C16736a(l9.b concurrentHandlerHolder, h jsBridgeFactory, s commandFactory, Context context) throws IamWebViewCreationFailedException {
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(jsBridgeFactory, "jsBridgeFactory");
        Intrinsics.j(commandFactory, "commandFactory");
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.commandFactory = commandFactory;
        if (context == null) {
            throw new IamWebViewCreationFailedException(null, 1, null);
        }
        try {
            this.webView = new WebView(context);
            g gVarA = jsBridgeFactory.a(commandFactory);
            this.jsBridge = gVarA;
            gVarA.p(this);
            this.webView.getSettings().setJavaScriptEnabled(true);
            this.webView.addJavascriptInterface(this.jsBridge, "Android");
            this.webView.setBackgroundColor(0);
            C16740e.a(this.webView);
        } catch (Exception unused) {
            throw new IamWebViewCreationFailedException(null, 1, null);
        }
    }

    /* renamed from: a, reason: from getter */
    public final WebView getWebView() {
        return this.webView;
    }

    public void b(String html, InAppMetaData inAppMetaData, InterfaceC16741f messageLoadedListener) {
        Intrinsics.j(html, "html");
        Intrinsics.j(inAppMetaData, "inAppMetaData");
        Intrinsics.j(messageLoadedListener, "messageLoadedListener");
        FS.setWebViewClient(this.webView, new C16738c(messageLoadedListener, this.concurrentHandlerHolder));
        this.commandFactory.A(inAppMetaData);
        WebView webView = this.webView;
        FS.trackWebView(webView);
        webView.loadDataWithBaseURL(null, html, "text/html", "UTF-8", null);
    }

    public void c() {
        this.jsBridge.p(null);
        this.webView.removeJavascriptInterface("Android");
        this.webView.removeAllViews();
        this.webView.destroy();
    }

    public void d(JSONObject payload) {
        Intrinsics.j(payload, "payload");
        WebView webView = this.webView;
        StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
        String str = String.format("MEIAM.handleResponse(%s);", Arrays.copyOf(new Object[]{payload}, 1));
        Intrinsics.i(str, "format(...)");
        webView.evaluateJavascript(str, null);
    }
}
