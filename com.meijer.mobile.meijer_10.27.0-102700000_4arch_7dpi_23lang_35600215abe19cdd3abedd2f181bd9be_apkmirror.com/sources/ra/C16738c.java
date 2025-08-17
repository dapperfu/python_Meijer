package ra;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lra/c;", "Landroid/webkit/WebViewClient;", "Lra/f;", "listener", "Ll9/b;", "concurrentHandlerHolder", "<init>", "(Lra/f;Ll9/b;)V", "Landroid/webkit/WebView;", "view", "", "url", "", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "a", "Lra/f;", "b", "Ll9/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ra.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16738c extends WebViewClient {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16741f listener;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l9.b concurrentHandlerHolder;

    public C16738c(InterfaceC16741f listener, l9.b concurrentHandlerHolder) {
        Intrinsics.j(listener, "listener");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        this.listener = listener;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C16738c c16738c) {
        c16738c.listener.a();
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView view, String url) {
        Intrinsics.j(view, "view");
        Intrinsics.j(url, "url");
        super.onPageFinished(view, url);
        this.concurrentHandlerHolder.h(new Runnable() { // from class: ra.b
            @Override // java.lang.Runnable
            public final void run() {
                C16738c.b(this.f157879a);
            }
        });
    }
}
