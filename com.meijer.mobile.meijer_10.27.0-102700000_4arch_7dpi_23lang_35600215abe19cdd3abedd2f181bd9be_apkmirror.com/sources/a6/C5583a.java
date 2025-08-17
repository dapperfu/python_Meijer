package a6;

import Q5.t;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0002\r\u0010B%\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R4\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00122\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00128A@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"La6/a;", "La6/c;", "", "", "La6/a$b;", "scriptHandlers", "Lqv/O;", "mainScope", "<init>", "(Ljava/util/Map;Lqv/O;)V", "Landroid/webkit/WebView;", "webView", "", "a", "(Landroid/webkit/WebView;)V", "Ljava/util/Map;", "b", "Lqv/O;", "Ljava/lang/ref/WeakReference;", "<set-?>", "c", "Ljava/lang/ref/WeakReference;", "getWebView$core_phoneRelease", "()Ljava/lang/ref/WeakReference;", "d", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: a6.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5583a implements c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, b> scriptHandlers;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O mainScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private WeakReference<WebView> webView;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"La6/a$b;", "", "Lkotlin/Function1;", "", "", "callback", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "js", "run", "(Ljava/lang/String;)V", "a", "Lkotlin/jvm/functions/Function1;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: a6.a$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Function1<String, Unit> callback;

        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super String, Unit> callback) {
            Intrinsics.j(callback, "callback");
            this.callback = callback;
        }

        @JavascriptInterface
        public final void run(String js2) {
            Intrinsics.j(js2, "js");
            this.callback.invoke(js2);
        }
    }

    public final void a(WebView webView) {
        t.a("Services", "DefaultInAppMessageEventHandler", "Internal web view was reset.", new Object[0]);
        if (webView != null) {
            this.webView = new WeakReference<>(webView);
            for (Map.Entry<String, b> entry : this.scriptHandlers.entrySet()) {
                String key = entry.getKey();
                b value = entry.getValue();
                t.a("Services", "DefaultInAppMessageEventHandler", "Re-adding javascript interface for handler: " + key, new Object[0]);
                webView.addJavascriptInterface(value, key);
            }
        }
    }

    public C5583a(Map<String, b> scriptHandlers, InterfaceC16622O mainScope) {
        Intrinsics.j(scriptHandlers, "scriptHandlers");
        Intrinsics.j(mainScope, "mainScope");
        this.scriptHandlers = scriptHandlers;
        this.mainScope = mainScope;
        this.webView = new WeakReference<>(null);
    }
}
