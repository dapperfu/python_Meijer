package Fr;

import android.webkit.WebView;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import com.fullstory.FS;
import java.util.Arrays;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;
import tv.C17146H;
import tv.InterfaceC17139A;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0080@¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR+\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, d2 = {"LFr/s;", "", "Lqv/O;", "coroutineScope", "<init>", "(Lqv/O;)V", "Landroid/webkit/WebView;", "", "c", "(Landroid/webkit/WebView;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lqv/O;", "Ltv/A;", "LFr/s$a;", "b", "Ltv/A;", "navigationEvents", "", "<set-?>", "Landroidx/compose/runtime/l0;", "()Z", "d", "(Z)V", "canGoBack", "getCanGoForward", "e", "canGoForward", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17139A<a> navigationEvents;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 canGoBack;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 canGoForward;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"LFr/s$a;", "", "b", "a", "c", "LFr/s$a$a;", "LFr/s$a$b;", "LFr/s$a$c;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private interface a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u0004R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0004R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0004R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0013\u0010\u0004¨\u0006\u0018"}, d2 = {"LFr/s$a$a;", "LFr/s$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "html", "b", "baseUrl", "c", "e", "mimeType", "encoding", "historyUrl", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fr.s$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class LoadHtml implements a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String html;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final String baseUrl;

            /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final String mimeType;

            /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final String encoding;

            /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final String historyUrl;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadHtml)) {
                    return false;
                }
                LoadHtml loadHtml = (LoadHtml) other;
                return Intrinsics.e(this.html, loadHtml.html) && Intrinsics.e(this.baseUrl, loadHtml.baseUrl) && Intrinsics.e(this.mimeType, loadHtml.mimeType) && Intrinsics.e(this.encoding, loadHtml.encoding) && Intrinsics.e(this.historyUrl, loadHtml.historyUrl);
            }

            /* renamed from: a, reason: from getter */
            public final String getBaseUrl() {
                return this.baseUrl;
            }

            /* renamed from: b, reason: from getter */
            public final String getEncoding() {
                return this.encoding;
            }

            /* renamed from: c, reason: from getter */
            public final String getHistoryUrl() {
                return this.historyUrl;
            }

            /* renamed from: d, reason: from getter */
            public final String getHtml() {
                return this.html;
            }

            /* renamed from: e, reason: from getter */
            public final String getMimeType() {
                return this.mimeType;
            }

            public int hashCode() {
                int iHashCode = this.html.hashCode() * 31;
                String str = this.baseUrl;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.mimeType;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.encoding;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.historyUrl;
                return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
            }

            public String toString() {
                return "LoadHtml(html=" + this.html + ", baseUrl=" + this.baseUrl + ", mimeType=" + this.mimeType + ", encoding=" + this.encoding + ", historyUrl=" + this.historyUrl + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"LFr/s$a$b;", "LFr/s$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "url", "", "Ljava/util/Map;", "()Ljava/util/Map;", "additionalHttpHeaders", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fr.s$a$b, reason: from toString */
        public static final /* data */ class LoadUrl implements a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String url;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Map<String, String> additionalHttpHeaders;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LoadUrl)) {
                    return false;
                }
                LoadUrl loadUrl = (LoadUrl) other;
                return Intrinsics.e(this.url, loadUrl.url) && Intrinsics.e(this.additionalHttpHeaders, loadUrl.additionalHttpHeaders);
            }

            public final Map<String, String> a() {
                return this.additionalHttpHeaders;
            }

            /* renamed from: b, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return (this.url.hashCode() * 31) + this.additionalHttpHeaders.hashCode();
            }

            public String toString() {
                return "LoadUrl(url=" + this.url + ", additionalHttpHeaders=" + this.additionalHttpHeaders + ')';
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\r\u0010\u0013¨\u0006\u0015"}, d2 = {"LFr/s$a$c;", "LFr/s$a;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "url", "", "[B", "()[B", "postData", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fr.s$a$c, reason: from toString */
        public static final /* data */ class PostUrl implements a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String url;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final byte[] postData;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!Intrinsics.e(PostUrl.class, other != null ? other.getClass() : null)) {
                    return false;
                }
                Intrinsics.h(other, "null cannot be cast to non-null type com.meijer.mobile.ui.common.compose.webview.WebViewNavigator.NavigationEvent.PostUrl");
                PostUrl postUrl = (PostUrl) other;
                return Intrinsics.e(this.url, postUrl.url) && Arrays.equals(this.postData, postUrl.postData);
            }

            /* renamed from: a, reason: from getter */
            public final byte[] getPostData() {
                return this.postData;
            }

            /* renamed from: b, reason: from getter */
            public final String getUrl() {
                return this.url;
            }

            public int hashCode() {
                return (this.url.hashCode() * 31) + Arrays.hashCode(this.postData);
            }

            public String toString() {
                return "PostUrl(url=" + this.url + ", postData=" + Arrays.toString(this.postData) + ')';
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.ui.common.compose.webview.WebViewNavigator", f = "WebView.kt", l = {521}, m = "handleNavigationEvents$common_release")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f11057a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f11058b;

        /* renamed from: d, reason: collision with root package name */
        int f11060d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f11058b = obj;
            this.f11060d |= Integer.MIN_VALUE;
            return s.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)Ljava/lang/Void;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.common.compose.webview.WebViewNavigator$handleNavigationEvents$2", f = "WebView.kt", l = {522}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<?>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f11061a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f11063c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WebView f11064a;

            a(WebView webView) {
                this.f11064a = webView;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(a aVar, Continuation<? super Unit> continuation) {
                if (aVar instanceof a.LoadHtml) {
                    WebView webView = this.f11064a;
                    a.LoadHtml loadHtml = (a.LoadHtml) aVar;
                    String baseUrl = loadHtml.getBaseUrl();
                    String html = loadHtml.getHtml();
                    String mimeType = loadHtml.getMimeType();
                    String encoding = loadHtml.getEncoding();
                    String historyUrl = loadHtml.getHistoryUrl();
                    FS.trackWebView(webView);
                    webView.loadDataWithBaseURL(baseUrl, html, mimeType, encoding, historyUrl);
                } else if (aVar instanceof a.LoadUrl) {
                    WebView webView2 = this.f11064a;
                    a.LoadUrl loadUrl = (a.LoadUrl) aVar;
                    String url = loadUrl.getUrl();
                    Map<String, String> mapA = loadUrl.a();
                    FS.trackWebView(webView2);
                    webView2.loadUrl(url, mapA);
                } else {
                    if (!(aVar instanceof a.PostUrl)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    WebView webView3 = this.f11064a;
                    a.PostUrl postUrl = (a.PostUrl) aVar;
                    String url2 = postUrl.getUrl();
                    byte[] postData = postUrl.getPostData();
                    FS.trackWebView(webView3);
                    webView3.postUrl(url2, postData);
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(WebView webView, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f11063c = webView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return s.this.new c(this.f11063c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<?> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f11061a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC17139A interfaceC17139A = s.this.navigationEvents;
                a aVar = new a(this.f11063c);
                this.f11061a = 1;
                if (interfaceC17139A.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    public s(InterfaceC16622O coroutineScope) {
        Intrinsics.j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.navigationEvents = C17146H.b(1, 0, null, 6, null);
        Boolean bool = Boolean.FALSE;
        this.canGoBack = t1.e(bool, null, 2, null);
        this.canGoForward = t1.e(bool, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.canGoBack.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.webkit.WebView r6, kotlin.coroutines.Continuation<?> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Fr.s.b
            if (r0 == 0) goto L13
            r0 = r7
            Fr.s$b r0 = (Fr.s.b) r0
            int r1 = r0.f11060d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11060d = r1
            goto L18
        L13:
            Fr.s$b r0 = new Fr.s$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f11058b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f11060d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            java.lang.Object r6 = r0.f11057a
            android.webkit.WebView r6 = (android.webkit.WebView) r6
            kotlin.ResultKt.b(r7)
            goto L4d
        L35:
            kotlin.ResultKt.b(r7)
            qv.L0 r7 = qv.C16639f0.c()
            Fr.s$c r2 = new Fr.s$c
            r4 = 0
            r2.<init>(r6, r4)
            r0.f11057a = r6
            r0.f11060d = r3
            java.lang.Object r6 = qv.C16644i.g(r7, r2, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            kotlin.KotlinNothingValueException r6 = new kotlin.KotlinNothingValueException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Fr.s.c(android.webkit.WebView, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(boolean z10) {
        this.canGoBack.setValue(Boolean.valueOf(z10));
    }

    public final void e(boolean z10) {
        this.canGoForward.setValue(Boolean.valueOf(z10));
    }
}
