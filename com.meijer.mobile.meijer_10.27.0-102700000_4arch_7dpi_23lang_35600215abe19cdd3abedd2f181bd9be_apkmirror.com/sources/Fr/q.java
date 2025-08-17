package Fr;

import Fr.d;
import Fr.q;
import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.o1;
import androidx.compose.ui.Modifier;
import com.fullstory.FS;
import j0.InterfaceC14812d;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.InterfaceC16622O;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u008d\u0001\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0095\u0001\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0019\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010!\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0\u001fH\u0007¢\u0006\u0004\b!\u0010\"\u001aE\u0010(\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u001d2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010%\u001a\u00020\u001d2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001dH\u0007¢\u0006\u0004\b(\u0010)\"#\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020+0*8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"LFr/t;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "captureBackPresses", "LFr/s;", "navigator", "Lkotlin/Function1;", "Landroid/webkit/WebView;", "", "onCreated", "onDispose", "LFr/b;", "client", "LFr/a;", "chromeClient", "Landroid/content/Context;", "factory", "o", "(LFr/t;Landroidx/compose/ui/Modifier;ZLFr/s;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LFr/b;LFr/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Landroid/widget/FrameLayout$LayoutParams;", "layoutParams", "n", "(LFr/t;Landroid/widget/FrameLayout$LayoutParams;Landroidx/compose/ui/Modifier;ZLFr/s;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LFr/b;LFr/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lqv/O;", "coroutineScope", "y", "(Lqv/O;Landroidx/compose/runtime/Composer;II)LFr/s;", "", "url", "", "additionalHttpHeaders", "z", "(Ljava/lang/String;Ljava/util/Map;Landroidx/compose/runtime/Composer;II)LFr/t;", "data", "baseUrl", "encoding", "mimeType", "historyUrl", "A", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)LFr/t;", "LL0/k;", "", "a", "LL0/k;", "getWebStateSaver", "()LL0/k;", "WebStateSaver", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private static final L0.k<t, Object> f11025a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.common.compose.webview.WebViewKt$WebView$12$1$1", f = "WebView.kt", l = {172}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f11026a;

        /* renamed from: b, reason: collision with root package name */
        int f11027b;

        /* renamed from: c, reason: collision with root package name */
        int f11028c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f11029d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ WebView f11030e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s sVar, WebView webView, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f11029d = sVar;
            this.f11030e = webView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f11029d, this.f11030e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f11028c;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                s sVar = this.f11029d;
                WebView webView = this.f11030e;
                this.f11026a = sVar;
                this.f11027b = 0;
                this.f11028c = 1;
                if (sVar.c(webView, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.ui.common.compose.webview.WebViewKt$WebView$12$2$1", f = "WebView.kt", l = {177}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f11031a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f11032b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WebView f11033c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WebView f11034a;

            a(WebView webView) {
                this.f11034a = webView;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(d dVar, Continuation<? super Unit> continuation) {
                if (dVar instanceof d.Url) {
                    WebView webView = this.f11034a;
                    d.Url url = (d.Url) dVar;
                    String url2 = url.getUrl();
                    Map<String, String> mapA = url.a();
                    FS.trackWebView(webView);
                    webView.loadUrl(url2, mapA);
                } else if (dVar instanceof d.Data) {
                    WebView webView2 = this.f11034a;
                    d.Data data = (d.Data) dVar;
                    String baseUrl = data.getBaseUrl();
                    String data2 = data.getData();
                    String mimeType = data.getMimeType();
                    String encoding = data.getEncoding();
                    String historyUrl = data.getHistoryUrl();
                    FS.trackWebView(webView2);
                    webView2.loadDataWithBaseURL(baseUrl, data2, mimeType, encoding, historyUrl);
                } else if (dVar instanceof d.Post) {
                    WebView webView3 = this.f11034a;
                    d.Post post = (d.Post) dVar;
                    String url3 = post.getUrl();
                    byte[] postData = post.getPostData();
                    FS.trackWebView(webView3);
                    webView3.postUrl(url3, postData);
                } else if (!(dVar instanceof d.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(t tVar, WebView webView, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f11032b = tVar;
            this.f11033c = webView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f11032b, this.f11033c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d g(t tVar) {
            return tVar.a();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f11031a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                final t tVar = this.f11032b;
                InterfaceC17152f interfaceC17152fQ = o1.q(new Function0() { // from class: Fr.r
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return q.b.g(tVar);
                    }
                });
                a aVar = new a(this.f11033c);
                this.f11031a = 1;
                if (interfaceC17152fQ.collect(aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function3<InterfaceC14812d, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f11035a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f11036b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ s f11037c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f11038d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f11039e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Fr.b f11040f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Fr.a f11041g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<Context, WebView> f11042h;

        /* JADX WARN: Multi-variable type inference failed */
        c(t tVar, boolean z10, s sVar, Function1<? super WebView, Unit> function1, Function1<? super WebView, Unit> function12, Fr.b bVar, Fr.a aVar, Function1<? super Context, ? extends WebView> function13) {
            this.f11035a = tVar;
            this.f11036b = z10;
            this.f11037c = sVar;
            this.f11038d = function1;
            this.f11039e = function12;
            this.f11040f = bVar;
            this.f11041g = aVar;
            this.f11042h = function13;
        }

        public final void a(InterfaceC14812d BoxWithConstraints, Composer composer, int i10) {
            int i11;
            Intrinsics.j(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(BoxWithConstraints) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1856678758, i11, -1, "com.meijer.mobile.ui.common.compose.webview.WebView.<anonymous> (WebView.kt:98)");
            }
            q.n(this.f11035a, new FrameLayout.LayoutParams(H1.b.j(BoxWithConstraints.getConstraints()) ? -1 : -2, H1.b.i(BoxWithConstraints.getConstraints()) ? -1 : -2), Modifier.INSTANCE, this.f11036b, this.f11037c, this.f11038d, this.f11039e, this.f11040f, this.f11041g, this.f11042h, composer, 384, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14812d interfaceC14812d, Composer composer, Integer num) {
            a(interfaceC14812d, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    static {
        final String str = "pagetitle";
        final String str2 = "lastloaded";
        final String str3 = "bundle";
        f11025a = L0.b.a(new Function2() { // from class: Fr.f
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return q.l(str, str2, str3, (L0.m) obj, (t) obj2);
            }
        }, new Function1() { // from class: Fr.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return q.m(str, str2, str3, (Map) obj);
            }
        });
    }

    public static final t A(String data, String str, String str2, String str3, String str4, Composer composer, int i10, int i11) {
        Intrinsics.j(data, "data");
        composer.startReplaceGroup(-1629174039);
        String str5 = (i11 & 2) != 0 ? null : str;
        if ((i11 & 4) != 0) {
            str2 = "utf-8";
        }
        String str6 = str2;
        String str7 = (i11 & 8) != 0 ? null : str3;
        String str8 = (i11 & 16) != 0 ? null : str4;
        if (ComposerKt.M()) {
            ComposerKt.U(-1629174039, i10, -1, "com.meijer.mobile.ui.common.compose.webview.rememberWebViewStateWithHTMLData (WebView.kt:697)");
        }
        composer.startReplaceGroup(1849434622);
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            objB = new t(new d.Data(data, str5, str6, str7, str8));
            composer.t(objB);
        }
        t tVar = (t) objB;
        composer.P();
        tVar.h(new d.Data(data, str5, str6, str7, str8));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return tVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map l(String str, String str2, String str3, L0.m mapSaver, t it) {
        Intrinsics.j(mapSaver, "$this$mapSaver");
        Intrinsics.j(it, "it");
        Bundle bundle = new Bundle();
        WebView webViewG = it.g();
        if (webViewG != null) {
            webViewG.saveState(bundle);
        }
        return MapsKt.o(TuplesKt.a(str, it.e()), TuplesKt.a(str2, it.c()), TuplesKt.a(str3, bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t m(String str, String str2, String str3, Map it) {
        Intrinsics.j(it, "it");
        t tVar = new t(d.b.f10981a);
        tVar.l((String) it.get(str));
        tVar.i((String) it.get(str2));
        tVar.m((Bundle) it.get(str3));
        return tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:246:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(final Fr.t r27, final android.widget.FrameLayout.LayoutParams r28, androidx.compose.ui.Modifier r29, boolean r30, Fr.s r31, kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit> r32, kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit> r33, Fr.b r34, Fr.a r35, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends android.webkit.WebView> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 1014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fr.q.n(Fr.t, android.widget.FrameLayout$LayoutParams, androidx.compose.ui.Modifier, boolean, Fr.s, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, Fr.b, Fr.a, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(final Fr.t r19, androidx.compose.ui.Modifier r20, boolean r21, Fr.s r22, kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit> r23, kotlin.jvm.functions.Function1<? super android.webkit.WebView, kotlin.Unit> r24, Fr.b r25, Fr.a r26, kotlin.jvm.functions.Function1<? super android.content.Context, ? extends android.webkit.WebView> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Fr.q.o(Fr.t, androidx.compose.ui.Modifier, boolean, Fr.s, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, Fr.b, Fr.a, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(WebView it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(WebView it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(WebView webView) {
        if (webView != null) {
            webView.goBack();
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebView s(Function1 function1, Function1 function12, FrameLayout.LayoutParams layoutParams, t tVar, Fr.a aVar, Fr.b bVar, Context context) {
        WebView webView;
        Intrinsics.j(context, "context");
        if (function1 == null || (webView = (WebView) function1.invoke(context)) == null) {
            webView = new WebView(context);
        }
        function12.invoke(webView);
        webView.setLayoutParams(layoutParams);
        Bundle viewState = tVar.getViewState();
        if (viewState != null) {
            webView.restoreState(viewState);
        }
        webView.getSettings().setDomStorageEnabled(true);
        webView.setWebChromeClient(aVar);
        FS.setWebViewClient(webView, bVar);
        tVar.n(webView);
        return webView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(Function1 function1, WebView it) {
        Intrinsics.j(it, "it");
        function1.invoke(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(t tVar, FrameLayout.LayoutParams layoutParams, Modifier modifier, boolean z10, s sVar, Function1 function1, Function1 function12, Fr.b bVar, Fr.a aVar, Function1 function13, int i10, int i11, Composer composer, int i12) {
        n(tVar, layoutParams, modifier, z10, sVar, function1, function12, bVar, aVar, function13, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(WebView it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(t tVar, Modifier modifier, boolean z10, s sVar, Function1 function1, Function1 function12, Fr.b bVar, Fr.a aVar, Function1 function13, int i10, int i11, Composer composer, int i12) {
        o(tVar, modifier, z10, sVar, function1, function12, bVar, aVar, function13, composer, J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(WebView it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    public static final t z(String url, Map<String, String> map, Composer composer, int i10, int i11) {
        Intrinsics.j(url, "url");
        composer.startReplaceGroup(-32700994);
        if ((i11 & 2) != 0) {
            map = MapsKt.k();
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-32700994, i10, -1, "com.meijer.mobile.ui.common.compose.webview.rememberWebViewState (WebView.kt:668)");
        }
        composer.startReplaceGroup(1849434622);
        Object objB = composer.B();
        if (objB == Composer.INSTANCE.a()) {
            objB = new t(new d.Url(url, map));
            composer.t(objB);
        }
        t tVar = (t) objB;
        composer.P();
        tVar.h(new d.Url(url, map));
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return tVar;
    }

    public static final s y(InterfaceC16622O interfaceC16622O, Composer composer, int i10, int i11) {
        composer.startReplaceGroup(-1788670481);
        if ((i11 & 1) != 0) {
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = J.k(EmptyCoroutineContext.f142646a, composer);
                composer.t(objB);
            }
            interfaceC16622O = (InterfaceC16622O) objB;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-1788670481, i10, -1, "com.meijer.mobile.ui.common.compose.webview.rememberWebViewNavigator (WebView.kt:633)");
        }
        composer.startReplaceGroup(5004770);
        boolean zV = composer.V(interfaceC16622O);
        Object objB2 = composer.B();
        if (zV || objB2 == Composer.INSTANCE.a()) {
            objB2 = new s(interfaceC16622O);
            composer.t(objB2);
        }
        s sVar = (s) objB2;
        composer.P();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return sVar;
    }
}
