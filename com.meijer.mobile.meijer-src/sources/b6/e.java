package b6;

import V5.j;
import V5.m;
import V5.n;
import V5.o;
import V5.r;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import b6.f;
import com.fullstory.FS;
import d6.C13631d;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.C6433U;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00018B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010#\u001a\u00020\u00182\u0010\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030!0 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020%2\u0006\u0010&\u001a\u00020%H\u0001¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00182\u0006\u0010*\u001a\u00020)H\u0001¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001e\u00107\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lb6/e;", "LY5/a;", "LV5/j;", "inAppMessage", "LV5/o;", "presentationDelegate", "LV5/r;", "presentationUtilityProvider", "LY5/b;", "appLifecycleProvider", "Lmv/O;", "mainScope", "<init>", "(LV5/j;LV5/o;LV5/r;LY5/b;Lmv/O;)V", "Lb6/g;", "D", "()Lb6/g;", "E", "()LV5/j;", "Landroid/content/Context;", "activityContext", "Landroidx/compose/ui/platform/ComposeView;", "s", "(Landroid/content/Context;)Landroidx/compose/ui/platform/ComposeView;", "", "r", "()Z", "Lkotlin/Function0;", "", "onAnimationComplete", "o", "(Lkotlin/jvm/functions/Function0;)V", "", "LV5/n;", "visiblePresentations", "v", "(Ljava/util/List;)Z", "Landroid/webkit/WebView;", "webView", "C", "(Landroid/webkit/WebView;)Landroid/webkit/WebView;", "", "uri", "F", "(Ljava/lang/String;)Z", "k", "LV5/j;", "l", "LV5/r;", "Lb6/a;", "m", "Lb6/a;", "inAppMessageEventHandler", "n", "Lkotlin/jvm/functions/Function0;", "animationCompleteCallback", "a", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class e extends Y5.a<j> {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final j inAppMessage;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final r presentationUtilityProvider;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final C6335a inAppMessageEventHandler;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> animationCompleteCallback;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "url", "", "a", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1})
    static final class b extends Lambda implements Function1<String, Boolean> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(String url) {
            Intrinsics.j(url, "url");
            return Boolean.valueOf(e.this.F(url));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 5, 1})
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        static final class a extends Lambda implements Function1<WebView, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ e f59998f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e eVar) {
                super(1);
                this.f59998f = eVar;
            }

            public final void a(WebView it) {
                Intrinsics.j(it, "it");
                this.f59998f.C(it);
                this.f59998f.inAppMessageEventHandler.a(it);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
                a(webView);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        static final class b extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ e f59999f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(e eVar) {
                super(0);
                this.f59999f = eVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.f59999f.getState() != m.a.DETACHED) {
                    return;
                }
                Function0 function0 = this.f59999f.animationCompleteCallback;
                if (function0 != null) {
                    function0.invoke();
                }
                this.f59999f.animationCompleteCallback = null;
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: b6.e$c$c, reason: collision with other inner class name */
        static final class C1190c extends Lambda implements Function0<Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ e f60000f;

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f143329a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1190c(e eVar) {
                super(0);
                this.f60000f = eVar;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f60000f.inAppMessage.getEventListener().d(this.f60000f);
                this.f60000f.dismiss();
            }
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        static final class d extends Lambda implements Function1<f.d, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ e f60001f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(e eVar) {
                super(1);
                this.f60001f = eVar;
            }

            public final void a(f.d gesture) {
                Intrinsics.j(gesture, "gesture");
                this.f60001f.dismiss();
                String str = this.f60001f.inAppMessage.getSettings().i().get(gesture);
                if (str != null) {
                    this.f60001f.F(str);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f.d dVar) {
                a(dVar);
                return Unit.f143329a;
            }
        }

        c() {
            super(2);
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2139146386, i10, -1, "com.adobe.marketing.mobile.services.ui.message.InAppMessagePresentable.getContent.<anonymous>.<anonymous> (InAppMessagePresentable.kt:85)");
            }
            C13631d.b(e.this.getPresentationStateManager(), e.this.inAppMessage.getSettings(), new a(e.this), new b(e.this), new C1190c(e.this), new d(e.this), composer, C6433U.f60755d | 64);
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

    @Override // Y5.a
    public boolean r() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j inAppMessage, o oVar, r presentationUtilityProvider, Y5.b appLifecycleProvider, InterfaceC15783O mainScope) {
        super(inAppMessage, presentationUtilityProvider, oVar, appLifecycleProvider, mainScope);
        Intrinsics.j(inAppMessage, "inAppMessage");
        Intrinsics.j(presentationUtilityProvider, "presentationUtilityProvider");
        Intrinsics.j(appLifecycleProvider, "appLifecycleProvider");
        Intrinsics.j(mainScope, "mainScope");
        this.inAppMessage = inAppMessage;
        this.presentationUtilityProvider = presentationUtilityProvider;
        C6335a c6335a = new C6335a(new LinkedHashMap(), mainScope);
        this.inAppMessageEventHandler = c6335a;
        inAppMessage.e(c6335a);
    }

    private final g D() {
        return new g(this.inAppMessage.getSettings(), this.presentationUtilityProvider, new b());
    }

    public final WebView C(WebView webView) {
        Intrinsics.j(webView, "webView");
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setDomStorageEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        settings.setDefaultTextEncodingName(StandardCharsets.UTF_8.name());
        settings.setMediaPlaybackRequiresUserGesture(false);
        webView.setVerticalScrollBarEnabled(this.inAppMessage.getSettings().i().isEmpty());
        webView.setHorizontalScrollBarEnabled(this.inAppMessage.getSettings().i().isEmpty());
        webView.setScrollbarFadingEnabled(true);
        webView.setScrollBarStyle(0);
        webView.setBackgroundColor(0);
        FS.setWebViewClient(webView, D());
        return webView;
    }

    @Override // V5.m
    /* renamed from: E, reason: from getter and merged with bridge method [inline-methods] */
    public j c() {
        return this.inAppMessage;
    }

    public final boolean F(String uri) {
        Intrinsics.j(uri, "uri");
        return this.inAppMessage.getEventListener().i(this, uri) || this.presentationUtilityProvider.a(uri);
    }

    @Override // Y5.a
    protected void o(Function0<Unit> onAnimationComplete) {
        Intrinsics.j(onAnimationComplete, "onAnimationComplete");
        this.animationCompleteCallback = onAnimationComplete;
    }

    @Override // Y5.a
    public ComposeView s(Context activityContext) {
        Intrinsics.j(activityContext, "activityContext");
        ComposeView composeView = new ComposeView(activityContext, null, 0, 6, null);
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        composeView.setContent(ComposableLambdaKt.composableLambdaInstance(-2139146386, true, new c()));
        return composeView;
    }

    @Override // Y5.a
    public boolean v(List<? extends n<?>> visiblePresentations) {
        Intrinsics.j(visiblePresentations, "visiblePresentations");
        List<? extends n<?>> list = visiblePresentations;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if ((nVar instanceof j) || (nVar instanceof V5.b)) {
                return true;
            }
        }
        return false;
    }
}
