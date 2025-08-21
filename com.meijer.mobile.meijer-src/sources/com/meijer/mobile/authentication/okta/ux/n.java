package com.meijer.mobile.authentication.okta.ux;

import Ch.b;
import Eh.Preference;
import Vs.b;
import android.content.Context;
import androidx.view.InterfaceC6157f;
import androidx.view.InterfaceC6172s;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import cj.C6518e;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.authentication.okta.ux.n;
import hi.InterfaceC14523a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mk.PeriodicPollingStartEvent;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 D2\u00020\u00012\u00020\u0002:\u0002-+BA\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\"\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\u00162\b\u0010&\u001a\u0004\u0018\u00010 2\b\u0010'\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0016¢\u0006\u0004\b*\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020:0>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/meijer/mobile/authentication/okta/ux/n;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "LVs/b$b;", "credentialProvider", "Lcj/e;", "userAuthenticator", "LCh/b;", "accountRepository", "LCh/d;", "preferencesRepository", "Lyo/k;", "userManager", "LDk/b;", "baseBus", "Lhi/a;", "analyticsEngine", "<init>", "(LVs/b$b;Lcj/e;LCh/b;LCh/d;Lyo/k;LDk/b;Lhi/a;)V", "Lbt/b;", "w", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "y", "Landroidx/lifecycle/s;", "owner", "onCreate", "(Landroidx/lifecycle/s;)V", "Landroid/content/Context;", "context", "", "emailAddress", "", "autoLoggedOut", "x", "(Landroid/content/Context;Ljava/lang/String;Z)V", "u", "()V", "subscribeEmails", "subscribeTexts", "A", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "B", "a", "LVs/b$b;", "b", "Lcj/e;", "c", "LCh/b;", "d", "LCh/d;", "e", "Lyo/k;", "f", "LDk/b;", "g", "Lhi/a;", "Lpv/B;", "Lcom/meijer/mobile/authentication/okta/ux/n$b;", "h", "Lpv/B;", "_loginViewState", "Lpv/P;", "i", "Lpv/P;", "v", "()Lpv/P;", "loginViewState", "j", "okta-ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class n extends c0 implements InterfaceC6157f {

    /* renamed from: k, reason: collision with root package name */
    public static final int f96187k = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b.Companion credentialProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C6518e userAuthenticator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Ch.b accountRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ch.d preferencesRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Dk.b baseBus;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<LoginScreenLoginState> _loginViewState;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final P<LoginScreenLoginState> loginViewState;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJX\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b!\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b\u001f\u0010\u0011¨\u0006%"}, d2 = {"Lcom/meijer/mobile/authentication/okta/ux/n$b;", "", "Lbk/a;", "loadingMessage", "", "isLoggedIn", "isOktaError", "isAccountError", "isFlowCancelled", "isLogoutComplete", "", "errorMessage", "<init>", "(Lbk/a;ZZZZZLjava/lang/String;)V", "a", "(Lbk/a;ZZZZZLjava/lang/String;)Lcom/meijer/mobile/authentication/okta/ux/n$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lbk/a;", "d", "()Lbk/a;", "b", "Z", "g", "()Z", "c", "i", "e", "f", "h", "Ljava/lang/String;", "okta-ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.authentication.okta.ux.n$b, reason: from toString */
    public static final /* data */ class LoginScreenLoginState {

        /* renamed from: h, reason: collision with root package name */
        public static final int f96197h = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a loadingMessage;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLoggedIn;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isOktaError;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAccountError;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isFlowCancelled;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isLogoutComplete;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String errorMessage;

        public LoginScreenLoginState() {
            this(null, false, false, false, false, false, null, l3.f93324d, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoginScreenLoginState)) {
                return false;
            }
            LoginScreenLoginState loginScreenLoginState = (LoginScreenLoginState) other;
            return Intrinsics.e(this.loadingMessage, loginScreenLoginState.loadingMessage) && this.isLoggedIn == loginScreenLoginState.isLoggedIn && this.isOktaError == loginScreenLoginState.isOktaError && this.isAccountError == loginScreenLoginState.isAccountError && this.isFlowCancelled == loginScreenLoginState.isFlowCancelled && this.isLogoutComplete == loginScreenLoginState.isLogoutComplete && Intrinsics.e(this.errorMessage, loginScreenLoginState.errorMessage);
        }

        public int hashCode() {
            AbstractC6392a abstractC6392a = this.loadingMessage;
            return ((((((((((((abstractC6392a == null ? 0 : abstractC6392a.hashCode()) * 31) + Boolean.hashCode(this.isLoggedIn)) * 31) + Boolean.hashCode(this.isOktaError)) * 31) + Boolean.hashCode(this.isAccountError)) * 31) + Boolean.hashCode(this.isFlowCancelled)) * 31) + Boolean.hashCode(this.isLogoutComplete)) * 31) + this.errorMessage.hashCode();
        }

        public String toString() {
            return "LoginScreenLoginState(loadingMessage=" + this.loadingMessage + ", isLoggedIn=" + this.isLoggedIn + ", isOktaError=" + this.isOktaError + ", isAccountError=" + this.isAccountError + ", isFlowCancelled=" + this.isFlowCancelled + ", isLogoutComplete=" + this.isLogoutComplete + ", errorMessage=" + this.errorMessage + ')';
        }

        public LoginScreenLoginState(AbstractC6392a abstractC6392a, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String errorMessage) {
            Intrinsics.j(errorMessage, "errorMessage");
            this.loadingMessage = abstractC6392a;
            this.isLoggedIn = z10;
            this.isOktaError = z11;
            this.isAccountError = z12;
            this.isFlowCancelled = z13;
            this.isLogoutComplete = z14;
            this.errorMessage = errorMessage;
        }

        public static /* synthetic */ LoginScreenLoginState b(LoginScreenLoginState loginScreenLoginState, AbstractC6392a abstractC6392a, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                abstractC6392a = loginScreenLoginState.loadingMessage;
            }
            if ((i10 & 2) != 0) {
                z10 = loginScreenLoginState.isLoggedIn;
            }
            if ((i10 & 4) != 0) {
                z11 = loginScreenLoginState.isOktaError;
            }
            if ((i10 & 8) != 0) {
                z12 = loginScreenLoginState.isAccountError;
            }
            if ((i10 & 16) != 0) {
                z13 = loginScreenLoginState.isFlowCancelled;
            }
            if ((i10 & 32) != 0) {
                z14 = loginScreenLoginState.isLogoutComplete;
            }
            if ((i10 & 64) != 0) {
                str = loginScreenLoginState.errorMessage;
            }
            boolean z15 = z14;
            String str2 = str;
            boolean z16 = z13;
            boolean z17 = z11;
            return loginScreenLoginState.a(abstractC6392a, z10, z17, z12, z16, z15, str2);
        }

        public final LoginScreenLoginState a(AbstractC6392a loadingMessage, boolean isLoggedIn, boolean isOktaError, boolean isAccountError, boolean isFlowCancelled, boolean isLogoutComplete, String errorMessage) {
            Intrinsics.j(errorMessage, "errorMessage");
            return new LoginScreenLoginState(loadingMessage, isLoggedIn, isOktaError, isAccountError, isFlowCancelled, isLogoutComplete, errorMessage);
        }

        /* renamed from: c, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        /* renamed from: d, reason: from getter */
        public final AbstractC6392a getLoadingMessage() {
            return this.loadingMessage;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getIsAccountError() {
            return this.isAccountError;
        }

        /* renamed from: f, reason: from getter */
        public final boolean getIsFlowCancelled() {
            return this.isFlowCancelled;
        }

        /* renamed from: g, reason: from getter */
        public final boolean getIsLoggedIn() {
            return this.isLoggedIn;
        }

        /* renamed from: h, reason: from getter */
        public final boolean getIsLogoutComplete() {
            return this.isLogoutComplete;
        }

        /* renamed from: i, reason: from getter */
        public final boolean getIsOktaError() {
            return this.isOktaError;
        }

        public /* synthetic */ LoginScreenLoginState(AbstractC6392a abstractC6392a, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : abstractC6392a, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? false : z12, (i10 & 16) != 0 ? false : z13, (i10 & 32) != 0 ? false : z14, (i10 & 64) != 0 ? "" : str);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.ux.OktaLoginViewModel$fetchUserAccount$1", f = "OktaLoginViewModel.kt", l = {111}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f96205a;

        /* renamed from: b, reason: collision with root package name */
        int f96206b;

        /* renamed from: c, reason: collision with root package name */
        int f96207c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f96208d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[b.EnumC0088b.values().length];
                try {
                    iArr[b.EnumC0088b.f4323a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = n.this.new c(continuation);
            cVar.f96208d = obj;
            return cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(n nVar, b.EnumC0088b enumC0088b) {
            Object value;
            AbstractC6392a abstractC6392aD = (enumC0088b == null ? -1 : a.$EnumSwitchMapping$0[enumC0088b.ordinal()]) == 1 ? AbstractC6392a.INSTANCE.d(B.f96078a, new Object[0]) : AbstractC6392a.INSTANCE.d(B.f96092o, new Object[0]);
            InterfaceC16549B interfaceC16549B = nVar._loginViewState;
            do {
                value = interfaceC16549B.getValue();
            } while (!interfaceC16549B.e(value, LoginScreenLoginState.b((LoginScreenLoginState) value, abstractC6392aD, false, false, false, false, false, null, 112, null)));
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            Object value2;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96207c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f96208d;
                    final n nVar = n.this;
                    Result.Companion companion = Result.INSTANCE;
                    Ch.b bVar = nVar.accountRepository;
                    b.a aVar = new b.a() { // from class: com.meijer.mobile.authentication.okta.ux.o
                        @Override // Ch.b.a
                        public final void a(b.EnumC0088b enumC0088b) {
                            n.c.g(nVar, enumC0088b);
                        }
                    };
                    this.f96208d = interfaceC15783O;
                    this.f96205a = interfaceC15783O;
                    this.f96206b = 0;
                    this.f96207c = 1;
                    if (bVar.g(aVar, this) == objF) {
                        return objF;
                    }
                }
                objB = Result.b(Unit.f143329a);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            n nVar2 = n.this;
            if (Result.h(objB)) {
                nVar2.analyticsEngine.k(Zi.i.f43841a.k());
                InterfaceC16549B interfaceC16549B = nVar2._loginViewState;
                do {
                    value2 = interfaceC16549B.getValue();
                } while (!interfaceC16549B.e(value2, LoginScreenLoginState.b((LoginScreenLoginState) value2, AbstractC6392a.INSTANCE.d(B.f96081d, new Object[0]), true, false, false, false, false, null, 112, null)));
            }
            n nVar3 = n.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Failure fetching account data.", new Object[0]);
                InterfaceC16549B interfaceC16549B2 = nVar3._loginViewState;
                do {
                    value = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value, LoginScreenLoginState.b((LoginScreenLoginState) value, null, false, false, true, false, false, null, 118, null)));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.ux.OktaLoginViewModel", f = "OktaLoginViewModel.kt", l = {54}, m = "idToken")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f96210a;

        /* renamed from: c, reason: collision with root package name */
        int f96212c;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f96210a = obj;
            this.f96212c |= Integer.MIN_VALUE;
            return n.this.w(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.ux.OktaLoginViewModel$login$1", f = "OktaLoginViewModel.kt", l = {69, 74, 99}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f96213a;

        /* renamed from: b, reason: collision with root package name */
        int f96214b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f96216d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f96217e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f96218f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z10, Context context, String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f96216d = z10;
            this.f96217e = context;
            this.f96218f = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return n.this.new e(this.f96216d, this.f96217e, this.f96218f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x011b, code lost:
        
            if (cj.C6518e.w(r1, r2, false, r3, 2, null) == r8) goto L36;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 315
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.authentication.okta.ux.n.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.ux.OktaLoginViewModel$onCreate$1", f = "OktaLoginViewModel.kt", l = {59}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f96219a;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return n.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96219a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                n nVar = n.this;
                this.f96219a = 1;
                if (nVar.y(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.ux.OktaLoginViewModel", f = "OktaLoginViewModel.kt", l = {151}, m = "refreshCurrentLoginState")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f96221a;

        /* renamed from: b, reason: collision with root package name */
        Object f96222b;

        /* renamed from: c, reason: collision with root package name */
        Object f96223c;

        /* renamed from: d, reason: collision with root package name */
        Object f96224d;

        /* renamed from: e, reason: collision with root package name */
        int f96225e;

        /* renamed from: f, reason: collision with root package name */
        int f96226f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f96227g;

        /* renamed from: i, reason: collision with root package name */
        int f96229i;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f96227g = obj;
            this.f96229i |= Integer.MIN_VALUE;
            return n.this.y(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.ux.OktaLoginViewModel$setNewAccountSettings$1", f = "OktaLoginViewModel.kt", l = {176}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f96230a;

        /* renamed from: b, reason: collision with root package name */
        Object f96231b;

        /* renamed from: c, reason: collision with root package name */
        Object f96232c;

        /* renamed from: d, reason: collision with root package name */
        Object f96233d;

        /* renamed from: e, reason: collision with root package name */
        Object f96234e;

        /* renamed from: f, reason: collision with root package name */
        int f96235f;

        /* renamed from: g, reason: collision with root package name */
        int f96236g;

        /* renamed from: h, reason: collision with root package name */
        int f96237h;

        /* renamed from: i, reason: collision with root package name */
        int f96238i;

        /* renamed from: j, reason: collision with root package name */
        int f96239j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f96240k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Boolean f96241l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Boolean f96242m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ n f96243n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Boolean bool, Boolean bool2, n nVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f96241l = bool;
            this.f96242m = bool2;
            this.f96243n = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = new h(this.f96241l, this.f96242m, this.f96243n, continuation);
            hVar.f96240k = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f96239j;
            try {
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f96240k;
                ArrayList arrayList = new ArrayList();
                Boolean bool = this.f96241l;
                if (bool != null) {
                    arrayList.add(new Preference(Eh.p.f7584b, bool.booleanValue(), null, null, 12, null));
                }
                Boolean bool2 = this.f96242m;
                if (bool2 != null) {
                    arrayList.add(new Preference(Eh.p.f7586d, bool2.booleanValue(), null, null, 12, null));
                }
                if (!arrayList.isEmpty()) {
                    n nVar = this.f96243n;
                    Result.Companion companion2 = Result.INSTANCE;
                    Ch.d dVar = nVar.preferencesRepository;
                    this.f96240k = interfaceC15783O;
                    this.f96230a = arrayList;
                    this.f96231b = interfaceC15783O;
                    this.f96232c = this;
                    this.f96233d = this;
                    this.f96234e = interfaceC15783O;
                    this.f96235f = 0;
                    this.f96236g = 0;
                    this.f96237h = 0;
                    this.f96238i = 0;
                    this.f96239j = 1;
                    obj = dVar.e(arrayList, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
            objB = Result.b(obj);
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "Subscribing to Emails and Texts Failed", new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    public n(b.Companion credentialProvider, C6518e userAuthenticator, Ch.b accountRepository, Ch.d preferencesRepository, yo.k userManager, Dk.b baseBus, InterfaceC14523a analyticsEngine) {
        Intrinsics.j(credentialProvider, "credentialProvider");
        Intrinsics.j(userAuthenticator, "userAuthenticator");
        Intrinsics.j(accountRepository, "accountRepository");
        Intrinsics.j(preferencesRepository, "preferencesRepository");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(baseBus, "baseBus");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.credentialProvider = credentialProvider;
        this.userAuthenticator = userAuthenticator;
        this.accountRepository = accountRepository;
        this.preferencesRepository = preferencesRepository;
        this.userManager = userManager;
        this.baseBus = baseBus;
        this.analyticsEngine = analyticsEngine;
        InterfaceC16549B<LoginScreenLoginState> interfaceC16549BA = S.a(new LoginScreenLoginState(null, false, false, false, false, false, null, l3.f93324d, null));
        this._loginViewState = interfaceC16549BA;
        this.loginViewState = C16563h.c(interfaceC16549BA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(kotlin.coroutines.Continuation<? super bt.b> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.meijer.mobile.authentication.okta.ux.n.d
            if (r0 == 0) goto L13
            r0 = r5
            com.meijer.mobile.authentication.okta.ux.n$d r0 = (com.meijer.mobile.authentication.okta.ux.n.d) r0
            int r1 = r0.f96212c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f96212c = r1
            goto L18
        L13:
            com.meijer.mobile.authentication.okta.ux.n$d r0 = new com.meijer.mobile.authentication.okta.ux.n$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f96210a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f96212c
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
            Vs.b$b r5 = r4.credentialProvider
            r0.f96212c = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            Vs.b r5 = (Vs.b) r5
            if (r5 == 0) goto L48
            bt.b r5 = r5.i()
            return r5
        L48:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.authentication.okta.ux.n.w(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0066 -> B:18:0x0069). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(kotlin.coroutines.Continuation<? super kotlin.Unit> r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof com.meijer.mobile.authentication.okta.ux.n.g
            if (r2 == 0) goto L17
            r2 = r1
            com.meijer.mobile.authentication.okta.ux.n$g r2 = (com.meijer.mobile.authentication.okta.ux.n.g) r2
            int r3 = r2.f96229i
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f96229i = r3
            goto L1c
        L17:
            com.meijer.mobile.authentication.okta.ux.n$g r2 = new com.meijer.mobile.authentication.okta.ux.n$g
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f96227g
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r4 = r2.f96229i
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L46
            if (r4 != r6) goto L3e
            int r4 = r2.f96225e
            java.lang.Object r7 = r2.f96224d
            com.meijer.mobile.authentication.okta.ux.n$b r7 = (com.meijer.mobile.authentication.okta.ux.n.LoginScreenLoginState) r7
            java.lang.Object r8 = r2.f96223c
            com.meijer.mobile.authentication.okta.ux.n$b r8 = (com.meijer.mobile.authentication.okta.ux.n.LoginScreenLoginState) r8
            java.lang.Object r8 = r2.f96222b
            java.lang.Object r9 = r2.f96221a
            pv.B r9 = (pv.InterfaceC16549B) r9
            kotlin.ResultKt.b(r1)
            goto L69
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L46:
            kotlin.ResultKt.b(r1)
            pv.B<com.meijer.mobile.authentication.okta.ux.n$b> r1 = r0._loginViewState
            r4 = r5
        L4c:
            r9 = r1
            java.lang.Object r8 = r9.getValue()
            r7 = r8
            com.meijer.mobile.authentication.okta.ux.n$b r7 = (com.meijer.mobile.authentication.okta.ux.n.LoginScreenLoginState) r7
            r2.f96221a = r9
            r2.f96222b = r8
            r2.f96223c = r7
            r2.f96224d = r7
            r2.f96225e = r4
            r2.f96226f = r5
            r2.f96229i = r6
            java.lang.Object r1 = r0.w(r2)
            if (r1 != r3) goto L69
            return r3
        L69:
            if (r1 == 0) goto L6e
            r1 = r9
            r9 = r6
            goto L70
        L6e:
            r1 = r9
            r9 = r5
        L70:
            r15 = 125(0x7d, float:1.75E-43)
            r16 = 0
            r10 = r8
            r8 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r13 = r12
            r12 = 0
            r14 = r13
            r13 = 0
            r17 = r14
            r14 = 0
            r5 = r17
            com.meijer.mobile.authentication.okta.ux.n$b r7 = com.meijer.mobile.authentication.okta.ux.n.LoginScreenLoginState.b(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r5 = r1.e(r5, r7)
            if (r5 == 0) goto L90
            kotlin.Unit r1 = kotlin.Unit.f143329a
            return r1
        L90:
            r5 = 0
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.authentication.okta.ux.n.y(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void B() {
        this.baseBus.a(new PeriodicPollingStartEvent(this.userManager.e(), false));
    }

    @Override // androidx.view.InterfaceC6157f
    public void onCreate(InterfaceC6172s owner) {
        Intrinsics.j(owner, "owner");
        super.onCreate(owner);
        C15809k.d(d0.a(this), null, null, new f(null), 3, null);
    }

    public final P<LoginScreenLoginState> v() {
        return this.loginViewState;
    }

    public final void x(Context context, String emailAddress, boolean autoLoggedOut) {
        Intrinsics.j(context, "context");
        C15809k.d(d0.a(this), null, null, new e(autoLoggedOut, context, emailAddress, null), 3, null);
    }

    public final void A(Boolean subscribeEmails, Boolean subscribeTexts) {
        C15809k.d(d0.a(this), null, null, new h(subscribeEmails, subscribeTexts, this, null), 3, null);
    }

    public final void u() {
        C15809k.d(d0.a(this), null, null, new c(null), 3, null);
    }
}
