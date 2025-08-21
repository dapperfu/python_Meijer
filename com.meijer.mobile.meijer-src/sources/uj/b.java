package uj;

import Kk.AppVersion;
import Tq.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import yk.C18328d;
import yo.k;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0014B5\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Luj/b;", "", "LYi/a;", "authTokenProvider", "LTq/j;", "storeProvider", "Lyo/k;", "userManager", "Lokhttp3/HttpUrl;", "chatbotBaseUrl", "LKk/a;", "appVersion", "<init>", "(LYi/a;LTq/j;Lyo/k;Lokhttp3/HttpUrl;LKk/a;)V", "", "fsSessionId", "b", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LYi/a;", "LTq/j;", "c", "Lyo/k;", "Lokhttp3/HttpUrl;", "e", "LKk/a;", "", "f", "Ljava/util/List;", "availableEnv", "g", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: h, reason: collision with root package name */
    public static final int f164250h = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Yi.a authTokenProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j storeProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl chatbotBaseUrl;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AppVersion appVersion;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<String> availableEnv;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.chatbot.ux.repository.ChatBotRepository", f = "ChatBotRepository.kt", l = {49}, m = "loadTokenScript")
    /* renamed from: uj.b$b, reason: collision with other inner class name */
    static final class C2602b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f164257a;

        /* renamed from: c, reason: collision with root package name */
        int f164259c;

        C2602b(Continuation<? super C2602b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f164257a = obj;
            this.f164259c |= Integer.MIN_VALUE;
            return b.this.d(this);
        }
    }

    public b(Yi.a authTokenProvider, j storeProvider, k userManager, HttpUrl chatbotBaseUrl, AppVersion appVersion) {
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(chatbotBaseUrl, "chatbotBaseUrl");
        Intrinsics.j(appVersion, "appVersion");
        this.authTokenProvider = authTokenProvider;
        this.storeProvider = storeProvider;
        this.userManager = userManager;
        this.chatbotBaseUrl = chatbotBaseUrl;
        this.appVersion = appVersion;
        this.availableEnv = CollectionsKt.p("dev2", "stg");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c() {
        return 20;
    }

    public final HttpUrl b(String fsSessionId) {
        Intrinsics.j(fsSessionId, "fsSessionId");
        HttpUrl.a aVarK = this.chatbotBaseUrl.k();
        Integer numValueOf = Integer.valueOf(this.storeProvider.g());
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        aVarK.K("meijer-store", String.valueOf(C18328d.b(numValueOf, new Function0() { // from class: uj.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(b.c());
            }
        })));
        aVarK.K("signedIn", String.valueOf(this.userManager.b()));
        String strP = this.userManager.p();
        String str = StringsKt.s0(strP) ? null : strP;
        if (str != null) {
            aVarK.K("firstname", str);
        }
        aVarK.K("fsSessionId", fsSessionId);
        return aVarK.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof uj.b.C2602b
            if (r0 == 0) goto L13
            r0 = r5
            uj.b$b r0 = (uj.b.C2602b) r0
            int r1 = r0.f164259c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f164259c = r1
            goto L18
        L13:
            uj.b$b r0 = new uj.b$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f164257a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f164259c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            Yi.a r5 = r4.authTokenProvider
            r0.f164259c = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "window.loadToken('"
            r0.append(r1)
            if (r5 == 0) goto L52
            java.lang.String r5 = r5.getAccessToken()
            goto L53
        L52:
            r5 = 0
        L53:
            r0.append(r5)
            java.lang.String r5 = "');"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: uj.b.d(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
