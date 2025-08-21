package com.okta.webauthenticationui;

import Us.i;
import android.content.Context;
import com.medallia.digital.mobilesdk.l3;
import com.okta.authfoundation.client.OAuth2ClientResult;
import com.okta.authfoundation.client.h;
import com.okta.authfoundation.client.j;
import com.okta.oauth2.AuthorizationCodeFlow;
import com.okta.oauth2.RedirectEndSessionFlow;
import com.okta.webauthenticationui.c;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import et.C13877a;
import et.C13886j;
import et.InterfaceC13885i;
import et.InterfaceC13887k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 22\u00020\u0001:\u0002\u00183B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\bJF\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J.\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010!\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u0018\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001a\u0010%\"\u0004\b&\u0010'R(\u00101\u001a\u00020)8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0016\u0010*\u0012\u0004\b/\u00100\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00064"}, d2 = {"Lcom/okta/webauthenticationui/WebAuthentication;", "", "Lcom/okta/authfoundation/client/h;", "client", "Let/k;", "webAuthenticationProvider", "<init>", "(Lcom/okta/authfoundation/client/h;Let/k;)V", "(Let/k;)V", "Landroid/content/Context;", "context", "", "redirectUrl", "", "extraRequestParameters", "scope", "Lcom/okta/authfoundation/client/OAuth2ClientResult;", "LVs/p;", "c", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "idToken", "", "e", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lcom/okta/authfoundation/client/h;", "b", "Let/k;", "Lcom/okta/oauth2/AuthorizationCodeFlow;", "Lcom/okta/oauth2/AuthorizationCodeFlow;", "()Lcom/okta/oauth2/AuthorizationCodeFlow;", "setAuthorizationCodeFlow", "(Lcom/okta/oauth2/AuthorizationCodeFlow;)V", "authorizationCodeFlow", "Lcom/okta/oauth2/RedirectEndSessionFlow;", "d", "Lcom/okta/oauth2/RedirectEndSessionFlow;", "()Lcom/okta/oauth2/RedirectEndSessionFlow;", "setRedirectEndSessionFlow", "(Lcom/okta/oauth2/RedirectEndSessionFlow;)V", "redirectEndSessionFlow", "Let/i;", "Let/i;", "getRedirectCoordinator$web_authentication_ui_release", "()Let/i;", "setRedirectCoordinator$web_authentication_ui_release", "(Let/i;)V", "getRedirectCoordinator$web_authentication_ui_release$annotations", "()V", "redirectCoordinator", "f", "FlowCancelledException", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WebAuthentication {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h client;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13887k webAuthenticationProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private AuthorizationCodeFlow authorizationCodeFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private RedirectEndSessionFlow redirectEndSessionFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private InterfaceC13885i redirectCoordinator;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/okta/webauthenticationui/WebAuthentication$FlowCancelledException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FlowCancelledException extends Exception {
        public FlowCancelledException() {
            super("Flow cancelled.");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.webauthenticationui.WebAuthentication", f = "WebAuthentication.kt", l = {107, l3.f93324d, 136}, m = "login")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f120823a;

        /* renamed from: b, reason: collision with root package name */
        Object f120824b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f120825c;

        /* renamed from: e, reason: collision with root package name */
        int f120827e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f120825c = obj;
            this.f120827e |= Integer.MIN_VALUE;
            return WebAuthentication.this.c(null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.webauthenticationui.WebAuthentication", f = "WebAuthentication.kt", l = {BinsView.TOTE_WIDTH_DP, 170}, m = "logoutOfBrowser")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f120833a;

        /* renamed from: b, reason: collision with root package name */
        Object f120834b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f120835c;

        /* renamed from: e, reason: collision with root package name */
        int f120837e;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f120835c = obj;
            this.f120837e |= Integer.MIN_VALUE;
            return WebAuthentication.this.e(null, null, null, this);
        }
    }

    public WebAuthentication(h client, InterfaceC13887k webAuthenticationProvider) {
        Intrinsics.j(client, "client");
        Intrinsics.j(webAuthenticationProvider, "webAuthenticationProvider");
        this.client = client;
        this.webAuthenticationProvider = webAuthenticationProvider;
        this.authorizationCodeFlow = new AuthorizationCodeFlow(client);
        this.redirectEndSessionFlow = new RedirectEndSessionFlow(client);
        this.redirectCoordinator = C13886j.f130897b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/okta/webauthenticationui/c;", "Lcom/okta/oauth2/AuthorizationCodeFlow$b;", "<anonymous>", "()Lcom/okta/webauthenticationui/c;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.webauthenticationui.WebAuthentication$login$initializationResult$1", f = "WebAuthentication.kt", l = {108}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function1<Continuation<? super com.okta.webauthenticationui.c<AuthorizationCodeFlow.b>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f120828a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f120830c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f120831d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f120832e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Map<String, String> map, String str2, Continuation<? super c> continuation) {
            super(1, continuation);
            this.f120830c = str;
            this.f120831d = map;
            this.f120832e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return WebAuthentication.this.new c(this.f120830c, this.f120831d, this.f120832e, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super com.okta.webauthenticationui.c<AuthorizationCodeFlow.b>> continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f120828a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AuthorizationCodeFlow authorizationCodeFlow = WebAuthentication.this.getAuthorizationCodeFlow();
                String str = this.f120830c;
                Map<String, String> map = this.f120831d;
                String str2 = this.f120832e;
                this.f120828a = 1;
                obj = AuthorizationCodeFlow.c(authorizationCodeFlow, str, map, str2, null, this, 8, null);
                if (obj == objF) {
                    return objF;
                }
            }
            OAuth2ClientResult oAuth2ClientResult = (OAuth2ClientResult) obj;
            if (oAuth2ClientResult instanceof OAuth2ClientResult.a) {
                OAuth2ClientResult.a aVar = (OAuth2ClientResult.a) oAuth2ClientResult;
                return new c.b(((AuthorizationCodeFlow.b) aVar.a()).getUrl(), aVar.a());
            }
            if (oAuth2ClientResult instanceof OAuth2ClientResult.Error) {
                return new c.a(((OAuth2ClientResult.Error) oAuth2ClientResult).getException());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/okta/webauthenticationui/c;", "Lcom/okta/oauth2/RedirectEndSessionFlow$b;", "<anonymous>", "()Lcom/okta/webauthenticationui/c;"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.webauthenticationui.WebAuthentication$logoutOfBrowser$initializationResult$1", f = "WebAuthentication.kt", l = {151}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function1<Continuation<? super com.okta.webauthenticationui.c<RedirectEndSessionFlow.b>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f120838a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f120840c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f120841d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, String str2, Continuation<? super e> continuation) {
            super(1, continuation);
            this.f120840c = str;
            this.f120841d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return WebAuthentication.this.new e(this.f120840c, this.f120841d, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation<? super com.okta.webauthenticationui.c<RedirectEndSessionFlow.b>> continuation) {
            return ((e) create(continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f120838a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                RedirectEndSessionFlow redirectEndSessionFlow = WebAuthentication.this.getRedirectEndSessionFlow();
                String str = this.f120840c;
                String str2 = this.f120841d;
                this.f120838a = 1;
                obj = redirectEndSessionFlow.b(str, str2, this);
                if (obj == objF) {
                    return objF;
                }
            }
            OAuth2ClientResult oAuth2ClientResult = (OAuth2ClientResult) obj;
            if (oAuth2ClientResult instanceof OAuth2ClientResult.a) {
                OAuth2ClientResult.a aVar = (OAuth2ClientResult.a) oAuth2ClientResult;
                return new c.b(((RedirectEndSessionFlow.b) aVar.a()).getUrl(), aVar.a());
            }
            if (oAuth2ClientResult instanceof OAuth2ClientResult.Error) {
                return new c.a(((OAuth2ClientResult.Error) oAuth2ClientResult).getException());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    static {
        i.f37724a.c("okta-web-authentication-ui-kotlin/2.0.3");
    }

    public static /* synthetic */ Object d(WebAuthentication webAuthentication, Context context, String str, Map map, String str2, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            map = MapsKt.k();
        }
        Map map2 = map;
        if ((i10 & 8) != 0) {
            str2 = webAuthentication.client.getConfiguration().getDefaultScope();
        }
        return webAuthentication.c(context, str, map2, str2, continuation);
    }

    /* renamed from: a, reason: from getter */
    public final AuthorizationCodeFlow getAuthorizationCodeFlow() {
        return this.authorizationCodeFlow;
    }

    /* renamed from: b, reason: from getter */
    public final RedirectEndSessionFlow getRedirectEndSessionFlow() {
        return this.redirectEndSessionFlow;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r14, java.lang.String r15, java.util.Map<java.lang.String, java.lang.String> r16, java.lang.String r17, kotlin.coroutines.Continuation<? super com.okta.authfoundation.client.OAuth2ClientResult<Vs.p>> r18) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okta.webauthenticationui.WebAuthentication.c(android.content.Context, java.lang.String, java.util.Map, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r11 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.content.Context r8, java.lang.String r9, java.lang.String r10, kotlin.coroutines.Continuation<? super com.okta.authfoundation.client.OAuth2ClientResult<kotlin.Unit>> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.okta.webauthenticationui.WebAuthentication.d
            if (r0 == 0) goto L13
            r0 = r11
            com.okta.webauthenticationui.WebAuthentication$d r0 = (com.okta.webauthenticationui.WebAuthentication.d) r0
            int r1 = r0.f120837e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f120837e = r1
            goto L18
        L13:
            com.okta.webauthenticationui.WebAuthentication$d r0 = new com.okta.webauthenticationui.WebAuthentication$d
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f120835c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f120837e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r8 = r0.f120834b
            com.okta.oauth2.RedirectEndSessionFlow$b r8 = (com.okta.oauth2.RedirectEndSessionFlow.b) r8
            java.lang.Object r9 = r0.f120833a
            com.okta.webauthenticationui.WebAuthentication r9 = (com.okta.webauthenticationui.WebAuthentication) r9
            kotlin.ResultKt.b(r11)
            goto L8b
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            java.lang.Object r8 = r0.f120833a
            com.okta.webauthenticationui.WebAuthentication r8 = (com.okta.webauthenticationui.WebAuthentication) r8
            kotlin.ResultKt.b(r11)
            r9 = r8
            goto L5e
        L45:
            kotlin.ResultKt.b(r11)
            et.i r11 = r7.redirectCoordinator
            et.k r2 = r7.webAuthenticationProvider
            com.okta.webauthenticationui.WebAuthentication$e r5 = new com.okta.webauthenticationui.WebAuthentication$e
            r6 = 0
            r5.<init>(r9, r10, r6)
            r0.f120833a = r7
            r0.f120837e = r4
            java.lang.Object r11 = r11.d(r2, r8, r5, r0)
            if (r11 != r1) goto L5d
            goto L8a
        L5d:
            r9 = r7
        L5e:
            com.okta.webauthenticationui.c r11 = (com.okta.webauthenticationui.c) r11
            boolean r8 = r11 instanceof com.okta.webauthenticationui.c.a
            if (r8 == 0) goto L70
            com.okta.authfoundation.client.OAuth2ClientResult$Error r8 = new com.okta.authfoundation.client.OAuth2ClientResult$Error
            com.okta.webauthenticationui.c$a r11 = (com.okta.webauthenticationui.c.a) r11
            java.lang.Exception r9 = r11.getException()
            r8.<init>(r9)
            return r8
        L70:
            boolean r8 = r11 instanceof com.okta.webauthenticationui.c.b
            if (r8 == 0) goto Lb4
            com.okta.webauthenticationui.c$b r11 = (com.okta.webauthenticationui.c.b) r11
            java.lang.Object r8 = r11.a()
            com.okta.oauth2.RedirectEndSessionFlow$b r8 = (com.okta.oauth2.RedirectEndSessionFlow.b) r8
            et.i r10 = r9.redirectCoordinator
            r0.f120833a = r9
            r0.f120834b = r8
            r0.f120837e = r3
            java.lang.Object r11 = r10.b(r0)
            if (r11 != r1) goto L8b
        L8a:
            return r1
        L8b:
            com.okta.webauthenticationui.d r11 = (com.okta.webauthenticationui.d) r11
            boolean r10 = r11 instanceof com.okta.webauthenticationui.d.a
            if (r10 == 0) goto L9d
            com.okta.authfoundation.client.OAuth2ClientResult$Error r8 = new com.okta.authfoundation.client.OAuth2ClientResult$Error
            com.okta.webauthenticationui.d$a r11 = (com.okta.webauthenticationui.d.a) r11
            java.lang.Exception r9 = r11.getException()
            r8.<init>(r9)
            return r8
        L9d:
            boolean r10 = r11 instanceof com.okta.webauthenticationui.d.b
            if (r10 == 0) goto Lae
            com.okta.webauthenticationui.d$b r11 = (com.okta.webauthenticationui.d.b) r11
            android.net.Uri r10 = r11.getUri()
            com.okta.oauth2.RedirectEndSessionFlow r9 = r9.redirectEndSessionFlow
            com.okta.authfoundation.client.OAuth2ClientResult r8 = r9.a(r10, r8)
            return r8
        Lae:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        Lb4:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okta.webauthenticationui.WebAuthentication.e(android.content.Context, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ WebAuthentication(InterfaceC13887k interfaceC13887k, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new C13877a(j.INSTANCE.d().getEventCoordinator()) : interfaceC13887k);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WebAuthentication(InterfaceC13887k webAuthenticationProvider) {
        this(h.INSTANCE.d(), webAuthenticationProvider);
        Intrinsics.j(webAuthenticationProvider, "webAuthenticationProvider");
    }
}
