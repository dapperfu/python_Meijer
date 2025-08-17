package com.okta.webauthenticationui;

import Qs.p;
import android.content.Context;
import android.net.Uri;
import androidx.view.AbstractC6023l;
import androidx.view.ComponentActivity;
import com.okta.webauthenticationui.WebAuthentication;
import com.okta.webauthenticationui.c;
import com.okta.webauthenticationui.d;
import et.InterfaceC13776i;
import et.InterfaceC13778k;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import qv.C0;
import qv.C16648k;
import qv.C16658p;
import qv.E0;
import qv.InterfaceC16622O;
import qv.Z;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJP\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000eH\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0014\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0018\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010!\u001a\u00020\u00062\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00062\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010'R\"\u0010)\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010(R0\u00101\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010+\u0012\u0004\b0\u0010\b\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R2\u0010\u0012\u001a\u001e\b\u0001\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00102R\u001e\u00103\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010(R0\u00108\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010*8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u0010+\u0012\u0004\b7\u0010\b\u001a\u0004\b5\u0010-\"\u0004\b6\u0010/R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lcom/okta/webauthenticationui/a;", "Let/i;", "Lqv/O;", "coroutineScope", "<init>", "(Lqv/O;)V", "", "n", "()V", "T", "Let/k;", "webAuthenticationProvider", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lcom/okta/webauthenticationui/c;", "", "initializer", "d", "(Let/k;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/okta/webauthenticationui/d;", "b", "Lokhttp3/HttpUrl;", "url", "", "c", "(Landroid/content/Context;Lokhttp3/HttpUrl;)Z", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "k", "(Ljava/lang/Exception;)V", "Landroid/net/Uri;", "uri", "a", "(Landroid/net/Uri;)V", "Lqv/O;", "Lkotlin/coroutines/Continuation;", "initializationContinuation", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "l", "()Lkotlin/jvm/functions/Function0;", "setInitializerContinuationListeningCallback", "(Lkotlin/jvm/functions/Function0;)V", "getInitializerContinuationListeningCallback$annotations", "initializerContinuationListeningCallback", "Lkotlin/jvm/functions/Function1;", "redirectContinuation", "f", "m", "setRedirectContinuationListeningCallback", "getRedirectContinuationListeningCallback$annotations", "redirectContinuationListeningCallback", "g", "Let/k;", "Lqv/C0;", "h", "Lqv/C0;", "emitErrorJob", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class a implements InterfaceC13776i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16622O coroutineScope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private volatile Continuation<? super com.okta.webauthenticationui.c<?>> initializationContinuation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> initializerContinuationListeningCallback;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile Function1<? super Continuation<? super com.okta.webauthenticationui.c<?>>, ? extends Object> initializer;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private volatile Continuation<? super com.okta.webauthenticationui.d> redirectContinuation;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> redirectContinuationListeningCallback;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private volatile InterfaceC13778k webAuthenticationProvider;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private C0 emitErrorJob;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.okta.webauthenticationui.DefaultRedirectCoordinator$emit$1", f = "RedirectCoordinator.kt", l = {141}, m = "invokeSuspend")
    /* renamed from: com.okta.webauthenticationui.a$a, reason: collision with other inner class name */
    static final class C1969a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f119877a;

        C1969a(Continuation<? super C1969a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new C1969a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((C1969a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f119877a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                long jD = p.f31384a.D();
                this.f119877a = 1;
                if (Z.c(jD, this) == objF) {
                    return objF;
                }
            }
            WebAuthentication.FlowCancelledException flowCancelledException = new WebAuthentication.FlowCancelledException();
            Continuation continuation = a.this.initializationContinuation;
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.b(new c.a(flowCancelledException)));
            }
            Continuation continuation2 = a.this.redirectContinuation;
            a.this.n();
            if (continuation2 != null) {
                Result.Companion companion2 = Result.INSTANCE;
                continuation2.resumeWith(Result.b(new d.a(flowCancelledException)));
            }
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function1<Throwable, Unit> {
        b() {
        }

        public final void a(Throwable th2) {
            a.this.n();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements Function1<Throwable, Unit> {
        c() {
        }

        public final void a(Throwable th2) {
            a.this.n();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.okta.webauthenticationui.DefaultRedirectCoordinator", f = "RedirectCoordinator.kt", l = {85}, m = "runInitializationFunction")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f119881a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f119882b;

        /* renamed from: d, reason: collision with root package name */
        int f119884d;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f119882b = obj;
            this.f119884d |= Integer.MIN_VALUE;
            return a.this.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        this.initializationContinuation = null;
        this.initializerContinuationListeningCallback = null;
        this.initializer = null;
        this.redirectContinuation = null;
        this.redirectContinuationListeningCallback = null;
        this.webAuthenticationProvider = null;
    }

    public a(InterfaceC16622O coroutineScope) {
        Intrinsics.j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
    }

    @Override // et.InterfaceC13776i
    public void a(Uri uri) {
        C0 c02 = this.emitErrorJob;
        if (c02 != null) {
            C0.a.a(c02, null, 1, null);
        }
        this.emitErrorJob = null;
        if (uri == null) {
            this.emitErrorJob = C16648k.d(this.coroutineScope, null, null, new C1969a(null), 3, null);
            return;
        }
        Continuation<? super com.okta.webauthenticationui.d> continuation = this.redirectContinuation;
        n();
        if (continuation != null) {
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.b(new d.b(uri)));
        }
    }

    @Override // et.InterfaceC13776i
    public boolean c(Context context, HttpUrl url) {
        Intrinsics.j(context, "context");
        Intrinsics.j(url, "url");
        InterfaceC13778k interfaceC13778k = this.webAuthenticationProvider;
        this.webAuthenticationProvider = null;
        if (interfaceC13778k == null) {
            k(new IllegalStateException("RedirectListener has not been initialized."));
            return false;
        }
        Exception excA = interfaceC13778k.a(context, url);
        if (excA == null) {
            return true;
        }
        k(excA);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // et.InterfaceC13776i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(kotlin.coroutines.Continuation<? super com.okta.webauthenticationui.c<?>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.okta.webauthenticationui.a.d
            if (r0 == 0) goto L13
            r0 = r6
            com.okta.webauthenticationui.a$d r0 = (com.okta.webauthenticationui.a.d) r0
            int r1 = r0.f119884d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f119884d = r1
            goto L18
        L13:
            com.okta.webauthenticationui.a$d r0 = new com.okta.webauthenticationui.a$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f119882b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f119884d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r0 = r0.f119881a
            com.okta.webauthenticationui.a r0 = (com.okta.webauthenticationui.a) r0
            kotlin.ResultKt.b(r6)
            goto L58
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            kotlin.ResultKt.b(r6)
            kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super com.okta.webauthenticationui.c<?>>, ? extends java.lang.Object> r6 = r5.initializer
            if (r6 != 0) goto L4a
            com.okta.webauthenticationui.c$a r6 = new com.okta.webauthenticationui.c$a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No initializer"
            r0.<init>(r1)
            r6.<init>(r0)
            return r6
        L4a:
            r5.initializer = r3
            r0.f119881a = r5
            r0.f119884d = r4
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            r0 = r5
        L58:
            com.okta.webauthenticationui.c r6 = (com.okta.webauthenticationui.c) r6
            kotlin.coroutines.Continuation<? super com.okta.webauthenticationui.c<?>> r1 = r0.initializationContinuation
            r0.initializationContinuation = r3
            if (r1 == 0) goto L67
            java.lang.Object r0 = kotlin.Result.b(r6)
            r1.resumeWith(r0)
        L67:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.okta.webauthenticationui.a.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void k(Exception exception) {
        Intrinsics.j(exception, "exception");
        d.a aVar = new d.a(exception);
        Continuation<? super com.okta.webauthenticationui.d> continuation = this.redirectContinuation;
        n();
        if (continuation != null) {
            continuation.resumeWith(Result.b(aVar));
        }
    }

    public final Function0<Unit> l() {
        return this.initializerContinuationListeningCallback;
    }

    public final Function0<Unit> m() {
        return this.redirectContinuationListeningCallback;
    }

    @Override // et.InterfaceC13776i
    public Object b(Continuation<? super com.okta.webauthenticationui.d> continuation) {
        if (!E0.n(continuation.getContext())) {
            n();
        }
        E0.i(continuation.getContext());
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        c16658p.F(new c());
        this.redirectContinuation = c16658p;
        Function0<Unit> function0M = m();
        if (function0M != null) {
            function0M.invoke();
        }
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // et.InterfaceC13776i
    public <T> Object d(InterfaceC13778k interfaceC13778k, Context context, Function1<? super Continuation<? super com.okta.webauthenticationui.c<T>>, ? extends Object> function1, Continuation<? super com.okta.webauthenticationui.c<T>> continuation) {
        if (!E0.n(continuation.getContext())) {
            n();
        }
        E0.i(continuation.getContext());
        this.webAuthenticationProvider = interfaceC13778k;
        this.initializer = function1;
        if ((context instanceof ComponentActivity) && !((ComponentActivity) context).getLifecycle().getState().b(AbstractC6023l.b.f55278d)) {
            return new c.a(new IllegalStateException("Activity is not resumed."));
        }
        context.startActivity(ForegroundActivity.INSTANCE.a(context));
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        c16658p.F(new b());
        this.initializationContinuation = c16658p;
        Function0<Unit> function0L = l();
        if (function0L != null) {
            function0L.invoke();
        }
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }
}
