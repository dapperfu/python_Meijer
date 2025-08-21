package com.meijer.mobile.chatbot.ux;

import Fr.q;
import Fr.s;
import Fr.t;
import Ki.C;
import Ki.K;
import Ki.LocalThemeScope;
import Kk.AppVersion;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import bk.AbstractC6392a;
import com.meijer.mobile.chatbot.ux.ChatBotActivity;
import e.C13737e;
import j0.InterfaceC14882C;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C17987a1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.C15807j;
import mv.InterfaceC15783O;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import p1.C16338g;
import qk.k;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010!\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b \u0010\u0003\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001e\u00106\u001a\u0004\u0018\u0001028\u0006@\u0006X\u0087\u000e¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u0010\u0003¨\u00067"}, d2 = {"Lcom/meijer/mobile/chatbot/ux/ChatBotActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "LDl/e;", "v", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "Luj/b;", "w", "Luj/b;", "m1", "()Luj/b;", "setChatBotRepository", "(Luj/b;)V", "chatBotRepository", "Lokhttp3/Headers;", "x", "Lokhttp3/Headers;", "n1", "()Lokhttp3/Headers;", "setGlobalHeaders", "(Lokhttp3/Headers;)V", "getGlobalHeaders$annotations", "globalHeaders", "LKk/a;", "y", "LKk/a;", "getAppVersion", "()LKk/a;", "setAppVersion", "(LKk/a;)V", "appVersion", "Lqk/k;", "z", "Lqk/k;", "o1", "()Lqk/k;", "setUserAgentInterceptor", "(Lqk/k;)V", "userAgentInterceptor", "", "A", "Ljava/lang/String;", "getFullstorySessionId$annotations", "fullstorySessionId", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ChatBotActivity extends Hilt_ChatBotActivity {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public String fullstorySessionId;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public uj.b chatBotRepository;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public Headers globalHeaders;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public AppVersion appVersion;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public k userAgentInterceptor;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.chatbot.ux.ChatBotActivity$a$a, reason: collision with other inner class name */
        static final class C1364a implements Function3<LocalThemeScope, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ChatBotActivity f96788a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.chatbot.ux.ChatBotActivity$a$a$a, reason: collision with other inner class name */
            static final class C1365a implements Function2<Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f96789a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ChatBotActivity f96790b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: com.meijer.mobile.chatbot.ux.ChatBotActivity$a$a$a$a, reason: collision with other inner class name */
                static final class C1366a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f96791a;

                    C1366a(LocalThemeScope localThemeScope) {
                        this.f96791a = localThemeScope;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(684930033, i10, -1, "com.meijer.mobile.chatbot.ux.ChatBotActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatBotActivity.kt:115)");
                        }
                        Dr.g.g(this.f96791a, C16338g.c(i.f96810a, composer, 0), null, false, null, 0, null, 0, composer, LocalThemeScope.f17314g, 126);
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

                public final void b(Composer composer, int i10) {
                    if ((i10 & 3) == 2 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1399340849, i10, -1, "com.meijer.mobile.chatbot.ux.ChatBotActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ChatBotActivity.kt:114)");
                    }
                    LocalThemeScope localThemeScope = this.f96789a;
                    ComposableLambda composableLambdaC = ComposableLambdaKt.c(684930033, true, new C1366a(localThemeScope), composer, 54);
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f96790b);
                    final ChatBotActivity chatBotActivity = this.f96790b;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: com.meijer.mobile.chatbot.ux.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ChatBotActivity.a.C1364a.C1365a.c(chatBotActivity);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    Dr.g.f(localThemeScope, null, null, null, composableLambdaC, (Function0) objB, C.f.d.f17051e, 0.0f, false, AbstractC6392a.INSTANCE.d(Aj.e.f1348a, new Object[0]), composer, LocalThemeScope.f17314g | 24576 | (C.f.d.f17052f << 18) | (AbstractC6392a.f60445b << 27), 199);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C1365a(LocalThemeScope localThemeScope, ChatBotActivity chatBotActivity) {
                    this.f96789a = localThemeScope;
                    this.f96790b = chatBotActivity;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    b(composer, num.intValue());
                    return Unit.f143329a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ChatBotActivity chatBotActivity) {
                    if (!chatBotActivity.onNavigateUp()) {
                        chatBotActivity.finish();
                    }
                    return Unit.f143329a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.chatbot.ux.ChatBotActivity$a$a$b */
            static final class b implements Function3<InterfaceC14882C, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ t f96792a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ s f96793b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ ChatBotActivity f96794c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ h f96795d;

                b(t tVar, s sVar, ChatBotActivity chatBotActivity, h hVar) {
                    this.f96792a = tVar;
                    this.f96793b = sVar;
                    this.f96794c = chatBotActivity;
                    this.f96795d = hVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(ChatBotActivity chatBotActivity, WebView it) {
                    Intrinsics.j(it, "it");
                    it.getSettings().setJavaScriptEnabled(true);
                    it.getSettings().setUserAgentString(chatBotActivity.o1().a());
                    return Unit.f143329a;
                }

                public final void b(InterfaceC14882C contentPadding, Composer composer, int i10) {
                    Intrinsics.j(contentPadding, "contentPadding");
                    if ((i10 & 6) == 0) {
                        i10 |= composer.V(contentPadding) ? 4 : 2;
                    }
                    if ((i10 & 19) == 18 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(1773419434, i10, -1, "com.meijer.mobile.chatbot.ux.ChatBotActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ChatBotActivity.kt:122)");
                    }
                    Modifier modifierH = D.h(J.f(Modifier.INSTANCE, 0.0f, 1, null), contentPadding);
                    t tVar = this.f96792a;
                    s sVar = this.f96793b;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(this.f96794c);
                    final ChatBotActivity chatBotActivity = this.f96794c;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: com.meijer.mobile.chatbot.ux.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ChatBotActivity.a.C1364a.b.c(chatBotActivity, (WebView) obj);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    q.o(tVar, modifierH, false, sVar, (Function1) objB, null, this.f96795d, null, null, composer, 0, 420);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14882C interfaceC14882C, Composer composer, Integer num) {
                    b(interfaceC14882C, composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lmv/O;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.chatbot.ux.ChatBotActivity$onCreate$1$1$client$1$2$1", f = "ChatBotActivity.kt", l = {102}, m = "invokeSuspend")
            /* renamed from: com.meijer.mobile.chatbot.ux.ChatBotActivity$a$a$c */
            static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super String>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f96796a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ ChatBotActivity f96797b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(ChatBotActivity chatBotActivity, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f96797b = chatBotActivity;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new c(this.f96797b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super String> continuation) {
                    return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f96796a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    uj.b bVarM1 = this.f96797b.m1();
                    this.f96796a = 1;
                    Object objD = bVarM1.d(this);
                    if (objD == objF) {
                        return objF;
                    }
                    return objD;
                }
            }

            C1364a(ChatBotActivity chatBotActivity) {
                this.f96788a = chatBotActivity;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(ChatBotActivity chatBotActivity, int i10, Uri url) {
                Intrinsics.j(url, "url");
                Intent intentN = chatBotActivity.getMeijerIntent().b0(i10) ? chatBotActivity.getMeijerIntent().n(chatBotActivity, url.toString()) : chatBotActivity.getMeijerIntent().L(chatBotActivity, i10, url);
                if (intentN != null) {
                    chatBotActivity.startActivity(intentN);
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(ChatBotActivity chatBotActivity, WebView webView, String str) {
                Intrinsics.j(webView, "webView");
                HttpUrl httpUrlE = str != null ? HttpUrl.INSTANCE.e(str) : null;
                qw.a.INSTANCE.a("Finished: HelpBot URL: " + str, new Object[0]);
                List<String> listN = httpUrlE != null ? httpUrlE.n() : null;
                if (listN == null) {
                    listN = CollectionsKt.m();
                }
                List<String> list = listN;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (StringsKt.b0((String) it.next(), "chatbot", true)) {
                            webView.evaluateJavascript((String) C15807j.b(null, new c(chatBotActivity, null), 1, null), new ValueCallback() { // from class: com.meijer.mobile.chatbot.ux.c
                                @Override // android.webkit.ValueCallback
                                public final void onReceiveValue(Object obj) {
                                    ChatBotActivity.a.C1364a.g((String) obj);
                                }
                            });
                            break;
                        }
                    }
                }
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void g(String str) {
                qw.a.INSTANCE.k("Loaded token for chatbot. Result: " + str, new Object[0]);
            }

            public final void d(LocalThemeScope AdsTheme, Composer composer, int i10) {
                int i11;
                Intrinsics.j(AdsTheme, "$this$AdsTheme");
                if ((i10 & 6) == 0) {
                    i11 = i10 | ((i10 & 8) == 0 ? composer.V(AdsTheme) : composer.D(AdsTheme) ? 4 : 2);
                } else {
                    i11 = i10;
                }
                if ((i11 & 19) == 18 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(478200812, i11, -1, "com.meijer.mobile.chatbot.ux.ChatBotActivity.onCreate.<anonymous>.<anonymous> (ChatBotActivity.kt:72)");
                }
                t tVarZ = q.z(this.f96788a.m1().b(String.valueOf(this.f96788a.fullstorySessionId)).getUrl(), MapsKt.y(this.f96788a.n1()), composer, 0, 0);
                composer.startReplaceGroup(1849434622);
                final ChatBotActivity chatBotActivity = this.f96788a;
                Object objB = composer.B();
                if (objB == Composer.INSTANCE.a()) {
                    objB = new h(chatBotActivity.getMeijerIntent(), new Function2() { // from class: com.meijer.mobile.chatbot.ux.a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChatBotActivity.a.C1364a.e(chatBotActivity, ((Integer) obj).intValue(), (Uri) obj2);
                        }
                    }, new Function2() { // from class: com.meijer.mobile.chatbot.ux.b
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChatBotActivity.a.C1364a.f(chatBotActivity, (WebView) obj, (String) obj2);
                        }
                    });
                    composer.t(objB);
                }
                composer.P();
                C17987a1.a(J.f(Modifier.INSTANCE, 0.0f, 1, null), null, ComposableLambdaKt.c(1399340849, true, new C1365a(AdsTheme, this.f96788a), composer, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.c(1773419434, true, new b(tVarZ, q.y(null, composer, 0, 1), this.f96788a, (h) objB), composer, 54), composer, 390, 12582912, 131066);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LocalThemeScope localThemeScope, Composer composer, Integer num) {
                d(localThemeScope, composer, num.intValue());
                return Unit.f143329a;
            }
        }

        a() {
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1908977885, i10, -1, "com.meijer.mobile.chatbot.ux.ChatBotActivity.onCreate.<anonymous> (ChatBotActivity.kt:71)");
            }
            K.b(null, ComposableLambdaKt.c(478200812, true, new C1364a(ChatBotActivity.this), composer, 54), composer, 48, 1);
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

    public final uj.b m1() {
        uj.b bVar = this.chatBotRepository;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.x("chatBotRepository");
        return null;
    }

    public final Headers n1() {
        Headers headers = this.globalHeaders;
        if (headers != null) {
            return headers;
        }
        Intrinsics.x("globalHeaders");
        return null;
    }

    public final k o1() {
        k kVar = this.userAgentInterceptor;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("userAgentInterceptor");
        return null;
    }

    @Override // com.meijer.mobile.chatbot.ux.Hilt_ChatBotActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C13737e.b(this, null, ComposableLambdaKt.composableLambdaInstance(1908977885, true, new a()), 1, null);
    }
}
