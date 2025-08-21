package d6;

import H1.h;
import R5.t;
import android.content.Context;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.F1;
import b6.C6335a;
import com.fullstory.FS;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import r0.C16806i;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lb6/f;", "inAppMessageSettings", "Lkotlin/Function1;", "", "", "onHeightReceived", "Landroid/webkit/WebView;", "onCreated", "a", "(Landroidx/compose/ui/Modifier;Lb6/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "core_phoneRelease"}, k = 2, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* renamed from: d6.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C13629b {

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: d6.b$a */
    static final class a extends Lambda implements Function1<Context, WebView> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f128093f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f128094g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ b6.f f128095h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super String, Unit> function1, Function1<? super WebView, Unit> function12, b6.f fVar) {
            super(1);
            this.f128093f = function1;
            this.f128094g = function12;
            this.f128095h = fVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebView invoke(Context it) {
            Intrinsics.j(it, "it");
            WebView webView = new WebView(it);
            Function1<String, Unit> function1 = this.f128093f;
            Function1<WebView, Unit> function12 = this.f128094g;
            b6.f fVar = this.f128095h;
            t.a("Services", "MessageContent", "Creating MessageContent", new Object[0]);
            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            webView.addJavascriptInterface(new C6335a.b(function1), "inAppContentHeightHandler");
            function12.invoke(webView);
            String content = fVar.getContent();
            String strName = StandardCharsets.UTF_8.name();
            FS.trackWebView(webView);
            webView.loadDataWithBaseURL("file:///android_asset/", content, "text/html", strName, null);
            return webView;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: d6.b$b, reason: collision with other inner class name */
    static final class C2008b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f128096f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b6.f f128097g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<String, Unit> f128098h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<WebView, Unit> f128099i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f128100j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2008b(Modifier modifier, b6.f fVar, Function1<? super String, Unit> function1, Function1<? super WebView, Unit> function12, int i10) {
            super(2);
            this.f128096f = modifier;
            this.f128097g = fVar;
            this.f128098h = function1;
            this.f128099i = function12;
            this.f128100j = i10;
        }

        public final void a(Composer composer, int i10) {
            C13629b.a(this.f128096f, this.f128097g, this.f128098h, this.f128099i, composer, J0.a(this.f128100j | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(Modifier modifier, b6.f inAppMessageSettings, Function1<? super String, Unit> onHeightReceived, Function1<? super WebView, Unit> onCreated, Composer composer, int i10) {
        Intrinsics.j(modifier, "modifier");
        Intrinsics.j(inAppMessageSettings, "inAppMessageSettings");
        Intrinsics.j(onHeightReceived, "onHeightReceived");
        Intrinsics.j(onCreated, "onCreated");
        Composer composerStartRestartGroup = composer.startRestartGroup(-581754426);
        if (ComposerKt.M()) {
            ComposerKt.U(-581754426, i10, -1, "com.adobe.marketing.mobile.services.ui.message.views.MessageContent (MessageContent.kt:36)");
        }
        androidx.compose.ui.viewinterop.e.a(new a(onHeightReceived, onCreated, inAppMessageSettings), F1.a(T0.e.a(modifier, C16806i.c(h.p(inAppMessageSettings.getCornerRadius()))), "messageContent"), null, composerStartRestartGroup, 0, 4);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new C2008b(modifier, inAppMessageSettings, onHeightReceived, onCreated, i10));
    }
}
