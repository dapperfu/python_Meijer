package cj;

import Vs.b;
import Vs.p;
import Zi.i;
import aj.C5696a;
import bj.UserTokenResponse;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.meijer.mobile.authentication.core.model.BearerToken;
import com.okta.authfoundation.client.IdTokenValidator;
import com.okta.webauthenticationui.WebAuthentication;
import hi.InterfaceC14523a;
import io.reactivex.l;
import kotlin.Metadata;
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
import mv.AbstractC15779K;
import mv.C15805i;
import mv.InterfaceC15783O;
import tv.n;
import wv.InterfaceC17929a;
import yo.k;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0001*B3\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010!\u001a\u00020\u00192\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b!\u0010\"J\"\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020$H\u0086@¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190)H\u0016¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0004\b,\u0010\u0011J\u0010\u0010-\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b-\u0010\u0011J\u0010\u0010.\u001a\u00020&H\u0096@¢\u0006\u0004\b.\u0010\u0011J\u0019\u0010/\u001a\u00020$2\n\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d¢\u0006\u0004\b/\u00100R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00101R\u001a\u0010\u0006\u001a\u00020\u00058\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u00102\u001a\u0004\b3\u00104R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010\n\u001a\u00020\t8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b3\u00107\u001a\u0004\b8\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010:R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lcj/e;", "LYi/c;", "LYi/a;", "LVs/b$b;", "credentialProvider", "Lyo/k;", "userManager", "Lzl/k;", "featureManager", "Lhi/a;", "analyticsEngine", "Lmv/K;", "ioDispatcher", "<init>", "(LVs/b$b;Lyo/k;Lzl/k;Lhi/a;Lmv/K;)V", "LVs/b;", "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVs/p;", "Lbj/a;", "x", "(LVs/p;)Lbj/a;", "credential", "", "retryCount", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "t", "(LVs/b;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "", "retryDelay", "r", "(Ljava/lang/Exception;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "token", "", "isRefresh", "", "v", "(LVs/p;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/l;", "a", "()Lio/reactivex/l;", "b", "c", "f", "q", "(Ljava/lang/Exception;)Z", "LVs/b$b;", "Lyo/k;", "e", "()Lyo/k;", "d", "Lzl/k;", "Lhi/a;", "p", "()Lhi/a;", "Lmv/K;", "Lwv/a;", "g", "Lwv/a;", "tokenMutex", "h", "okta_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: cj.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6518e extends Yi.c implements Yi.a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b.Companion credentialProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17929a tokenMutex;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/authentication/core/model/BearerToken;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.OktaUserAuthenticator$fetchToken$1", f = "OktaUserAuthenticator.kt", l = {138}, m = "invokeSuspend")
    /* renamed from: cj.e$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super BearerToken>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f62520a;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C6518e.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super BearerToken> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f62520a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            C6518e c6518e = C6518e.this;
            this.f62520a = 1;
            Object objC = c6518e.c(this);
            if (objC == objF) {
                return objF;
            }
            return objC;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/authentication/core/model/BearerToken;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.OktaUserAuthenticator$getToken$2", f = "OktaUserAuthenticator.kt", l = {350, 165, 170, 170}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: cj.e$c */
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super BearerToken>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f62522a;

        /* renamed from: b, reason: collision with root package name */
        Object f62523b;

        /* renamed from: c, reason: collision with root package name */
        Object f62524c;

        /* renamed from: d, reason: collision with root package name */
        Object f62525d;

        /* renamed from: e, reason: collision with root package name */
        Object f62526e;

        /* renamed from: f, reason: collision with root package name */
        Object f62527f;

        /* renamed from: g, reason: collision with root package name */
        Object f62528g;

        /* renamed from: h, reason: collision with root package name */
        Object f62529h;

        /* renamed from: i, reason: collision with root package name */
        int f62530i;

        /* renamed from: j, reason: collision with root package name */
        int f62531j;

        /* renamed from: k, reason: collision with root package name */
        int f62532k;

        /* renamed from: l, reason: collision with root package name */
        int f62533l;

        /* renamed from: m, reason: collision with root package name */
        int f62534m;

        /* renamed from: n, reason: collision with root package name */
        int f62535n;

        /* renamed from: o, reason: collision with root package name */
        int f62536o;

        /* renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f62537p;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = C6518e.this.new c(continuation);
            cVar.f62537p = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super BearerToken> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01b9 A[Catch: all -> 0x0040, TryCatch #1 {all -> 0x0040, blocks: (B:9:0x0039, B:56:0x0197, B:63:0x01b3, B:65:0x01b9, B:67:0x01bd, B:68:0x01c4, B:62:0x01a2), top: B:77:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01ce A[Catch: all -> 0x00b6, TRY_ENTER, TryCatch #3 {all -> 0x00b6, blocks: (B:25:0x00ad, B:39:0x0107, B:41:0x010b, B:43:0x0111, B:46:0x011b, B:48:0x0125, B:71:0x01ce, B:72:0x01d5, B:35:0x00f0), top: B:77:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0125 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v15, types: [wv.a] */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v22 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v3, types: [wv.a] */
        /* JADX WARN: Type inference failed for: r2v7 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 474
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: cj.C6518e.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/authentication/core/model/BearerToken;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.OktaUserAuthenticator$getTokenOrNull$2", f = "OktaUserAuthenticator.kt", l = {350, 149, 154, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: cj.e$d */
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super BearerToken>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f62539a;

        /* renamed from: b, reason: collision with root package name */
        Object f62540b;

        /* renamed from: c, reason: collision with root package name */
        Object f62541c;

        /* renamed from: d, reason: collision with root package name */
        Object f62542d;

        /* renamed from: e, reason: collision with root package name */
        Object f62543e;

        /* renamed from: f, reason: collision with root package name */
        Object f62544f;

        /* renamed from: g, reason: collision with root package name */
        Object f62545g;

        /* renamed from: h, reason: collision with root package name */
        int f62546h;

        /* renamed from: i, reason: collision with root package name */
        int f62547i;

        /* renamed from: j, reason: collision with root package name */
        int f62548j;

        /* renamed from: k, reason: collision with root package name */
        int f62549k;

        /* renamed from: l, reason: collision with root package name */
        int f62550l;

        /* renamed from: m, reason: collision with root package name */
        int f62551m;

        /* renamed from: n, reason: collision with root package name */
        int f62552n;

        /* renamed from: o, reason: collision with root package name */
        int f62553o;

        /* renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f62554p;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = C6518e.this.new d(continuation);
            dVar.f62554p = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super BearerToken> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Not initialized variable reg: 9, insn: 0x0081: MOVE (r1 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:130), block:B:26:0x0081 */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00f4 A[Catch: all -> 0x0080, TRY_ENTER, TryCatch #0 {all -> 0x0080, blocks: (B:51:0x0108, B:53:0x010c, B:23:0x0078, B:36:0x00d3, B:38:0x00d7, B:40:0x00dd, B:43:0x00e6, B:47:0x00f4, B:32:0x00bb), top: B:75:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x015a A[Catch: all -> 0x003d, TryCatch #3 {all -> 0x003d, blocks: (B:9:0x0037, B:57:0x013c, B:62:0x0154, B:64:0x015a, B:65:0x0163, B:68:0x016a, B:61:0x0143), top: B:76:0x0037 }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0169  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x016e  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 375
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: cj.C6518e.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.OktaUserAuthenticator", f = "OktaUserAuthenticator.kt", l = {275, 276, 276}, m = "handleRefreshTokenException")
    /* renamed from: cj.e$e, reason: collision with other inner class name */
    static final class C1230e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f62556a;

        /* renamed from: b, reason: collision with root package name */
        Object f62557b;

        /* renamed from: c, reason: collision with root package name */
        int f62558c;

        /* renamed from: d, reason: collision with root package name */
        long f62559d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f62560e;

        /* renamed from: g, reason: collision with root package name */
        int f62562g;

        C1230e(Continuation<? super C1230e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f62560e = obj;
            this.f62562g |= Integer.MIN_VALUE;
            return C6518e.this.r(null, 0, 0L, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/authentication/core/model/BearerToken;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.OktaUserAuthenticator$refreshCredential$2", f = "OktaUserAuthenticator.kt", l = {217, 219, 227}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: cj.e$f */
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super BearerToken>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f62563a;

        /* renamed from: b, reason: collision with root package name */
        int f62564b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Vs.b f62565c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C6518e f62566d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f62567e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Vs.b bVar, C6518e c6518e, int i10, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f62565c = bVar;
            this.f62566d = c6518e;
            this.f62567e = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new f(this.f62565c, this.f62566d, this.f62567e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super BearerToken> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x007d, code lost:
        
            if (r1.v(r2, true, r11) == r0) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
        
            if (r12 == r0) goto L38;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r11.f62564b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2e
                if (r1 == r4) goto L2a
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r11.f62563a
                com.okta.authfoundation.client.OAuth2ClientResult r0 = (com.okta.authfoundation.client.OAuth2ClientResult) r0
                kotlin.ResultKt.b(r12)
                goto Lb5
            L1a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L22:
                java.lang.Object r0 = r11.f62563a
                com.okta.authfoundation.client.OAuth2ClientResult r0 = (com.okta.authfoundation.client.OAuth2ClientResult) r0
                kotlin.ResultKt.b(r12)
                goto L80
            L2a:
                kotlin.ResultKt.b(r12)
                goto L64
            L2e:
                kotlin.ResultKt.b(r12)
                Vs.b r12 = r11.f62565c
                if (r12 != 0) goto L5b
                cj.e r12 = r11.f62566d
                yo.k r12 = r12.getUserManager()
                boolean r12 = r12.b()
                if (r12 == 0) goto L44
                java.lang.String r12 = "No default credential found while attempting to refresh."
                goto L46
            L44:
                java.lang.String r12 = "Authenticated call attempted while not logged in."
            L46:
                cj.e r0 = r11.f62566d
                hi.a r0 = r0.getAnalyticsEngine()
                Zi.r r1 = Zi.r.f43847a
                ii.f r1 = r1.f(r12)
                r0.k(r1)
                android.security.keystore.UserNotAuthenticatedException r0 = new android.security.keystore.UserNotAuthenticatedException
                r0.<init>(r12)
                throw r0
            L5b:
                r11.f62564b = r4
                java.lang.Object r12 = r12.l(r11)
                if (r12 != r0) goto L64
                goto Lb4
            L64:
                com.okta.authfoundation.client.OAuth2ClientResult r12 = (com.okta.authfoundation.client.OAuth2ClientResult) r12
                boolean r1 = r12 instanceof com.okta.authfoundation.client.OAuth2ClientResult.a
                if (r1 == 0) goto L96
                cj.e r1 = r11.f62566d
                r2 = r12
                com.okta.authfoundation.client.OAuth2ClientResult$a r2 = (com.okta.authfoundation.client.OAuth2ClientResult.a) r2
                java.lang.Object r2 = r2.a()
                Vs.p r2 = (Vs.p) r2
                r11.f62563a = r12
                r11.f62564b = r3
                java.lang.Object r12 = r1.v(r2, r4, r11)
                if (r12 != r0) goto L80
                goto Lb4
            L80:
                Vs.b r12 = r11.f62565c
                java.lang.String r12 = r12.e()
                if (r12 == 0) goto L8e
                com.meijer.mobile.authentication.core.model.BearerToken r0 = new com.meijer.mobile.authentication.core.model.BearerToken
                r0.<init>(r12)
                return r0
            L8e:
                android.security.keystore.UserNotAuthenticatedException r12 = new android.security.keystore.UserNotAuthenticatedException
                java.lang.String r0 = "Valid token not available after successful refresh (unusual result)."
                r12.<init>(r0)
                throw r12
            L96:
                boolean r1 = r12 instanceof com.okta.authfoundation.client.OAuth2ClientResult.Error
                if (r1 == 0) goto Lb8
                cj.e r3 = r11.f62566d
                r1 = r12
                com.okta.authfoundation.client.OAuth2ClientResult$Error r1 = (com.okta.authfoundation.client.OAuth2ClientResult.Error) r1
                java.lang.Exception r4 = r1.getException()
                int r5 = r11.f62567e
                r11.f62563a = r12
                r11.f62564b = r2
                r6 = 0
                r9 = 4
                r10 = 0
                r8 = r11
                java.lang.Object r12 = cj.C6518e.s(r3, r4, r5, r6, r8, r9, r10)
                if (r12 != r0) goto Lb5
            Lb4:
                return r0
            Lb5:
                com.meijer.mobile.authentication.core.model.BearerToken r12 = (com.meijer.mobile.authentication.core.model.BearerToken) r12
                return r12
            Lb8:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: cj.C6518e.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.OktaUserAuthenticator", f = "OktaUserAuthenticator.kt", l = {350, 178, 180}, m = "revokeAuthentication")
    /* renamed from: cj.e$g */
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f62568a;

        /* renamed from: b, reason: collision with root package name */
        Object f62569b;

        /* renamed from: c, reason: collision with root package name */
        Object f62570c;

        /* renamed from: d, reason: collision with root package name */
        Object f62571d;

        /* renamed from: e, reason: collision with root package name */
        Object f62572e;

        /* renamed from: f, reason: collision with root package name */
        Object f62573f;

        /* renamed from: g, reason: collision with root package name */
        Object f62574g;

        /* renamed from: h, reason: collision with root package name */
        Object f62575h;

        /* renamed from: i, reason: collision with root package name */
        int f62576i;

        /* renamed from: j, reason: collision with root package name */
        int f62577j;

        /* renamed from: k, reason: collision with root package name */
        int f62578k;

        /* renamed from: l, reason: collision with root package name */
        int f62579l;

        /* renamed from: m, reason: collision with root package name */
        int f62580m;

        /* renamed from: n, reason: collision with root package name */
        int f62581n;

        /* renamed from: o, reason: collision with root package name */
        int f62582o;

        /* renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f62583p;

        /* renamed from: r, reason: collision with root package name */
        int f62585r;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f62583p = obj;
            this.f62585r |= Integer.MIN_VALUE;
            return C6518e.this.f(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.authentication.okta.OktaUserAuthenticator$storeToken$2", f = "OktaUserAuthenticator.kt", l = {103, 117}, m = "invokeSuspend")
    /* renamed from: cj.e$h */
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f62586a;

        /* renamed from: b, reason: collision with root package name */
        Object f62587b;

        /* renamed from: c, reason: collision with root package name */
        int f62588c;

        /* renamed from: d, reason: collision with root package name */
        int f62589d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f62591f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ p f62592g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z10, p pVar, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f62591f = z10;
            this.f62592g = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C6518e.this.new h(this.f62591f, this.f62592g, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x008b, code lost:
        
            if (r3.f(r1, r11) != r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r11.f62589d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L24
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r11.f62587b
                Vs.b r0 = (Vs.b) r0
                kotlin.ResultKt.b(r12)
                goto L8e
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                kotlin.ResultKt.b(r12)
                r8 = r11
                goto L79
            L24:
                kotlin.ResultKt.b(r12)
                cj.e r12 = cj.C6518e.this
                yo.k r12 = r12.getUserManager()
                r12.T(r3)
                boolean r12 = r11.f62591f
                if (r12 != 0) goto L8e
                cj.e r12 = cj.C6518e.this
                Vs.b$b r4 = cj.C6518e.j(r12)
                cj.e r12 = cj.C6518e.this
                zl.k r12 = cj.C6518e.k(r12)
                zl.f$e0 r1 = zl.AbstractC18503f.e0.f172875h
                boolean r12 = r12.e(r1)
                if (r12 == 0) goto L68
                Vs.p r12 = r11.f62592g
                cj.e r1 = cj.C6518e.this
                zl.k r1 = cj.C6518e.k(r1)
                zl.f$F r5 = zl.AbstractC18503f.F.f172846h
                boolean r1 = r1.e(r5)
                if (r1 == 0) goto L5a
                r1 = 0
                goto L60
            L5a:
                Vs.p r1 = r11.f62592g
                java.lang.String r1 = r1.getRefreshToken()
            L60:
                r5 = 120(0x78, float:1.68E-43)
                Vs.p r12 = cj.C6519f.a(r12, r5, r1)
            L66:
                r5 = r12
                goto L6b
            L68:
                Vs.p r12 = r11.f62592g
                goto L66
            L6b:
                r11.f62589d = r3
                r6 = 0
                r7 = 0
                r9 = 6
                r10 = 0
                r8 = r11
                java.lang.Object r12 = Vs.b.Companion.h(r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L79
                goto L8d
            L79:
                r1 = r12
                Vs.b r1 = (Vs.b) r1
                Vs.b$b r3 = Vs.b.INSTANCE
                r8.f62586a = r12
                r8.f62587b = r1
                r12 = 0
                r8.f62588c = r12
                r8.f62589d = r2
                java.lang.Object r12 = r3.f(r1, r11)
                if (r12 != r0) goto L8f
            L8d:
                return r0
            L8e:
                r8 = r11
            L8f:
                cj.e r12 = cj.C6518e.this
                Vs.p r0 = r8.f62592g
                bj.a r0 = cj.C6518e.n(r12, r0)
                r12.h(r0)
                kotlin.Unit r12 = kotlin.Unit.f143329a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: cj.C6518e.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C6518e(b.Companion credentialProvider, k userManager, zl.k featureManager, InterfaceC14523a analyticsEngine, AbstractC15779K ioDispatcher) {
        Intrinsics.j(credentialProvider, "credentialProvider");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.credentialProvider = credentialProvider;
        this.userManager = userManager;
        this.featureManager = featureManager;
        this.analyticsEngine = analyticsEngine;
        this.ioDispatcher = ioDispatcher;
        this.tokenMutex = wv.g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(Continuation<? super Vs.b> continuation) {
        return this.credentialProvider.d(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.Exception r10, int r11, long r12, kotlin.coroutines.Continuation<? super com.meijer.mobile.authentication.core.model.BearerToken> r14) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.C6518e.r(java.lang.Exception, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ Object s(C6518e c6518e, Exception exc, int i10, long j10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            j10 = 1000;
        }
        return c6518e.r(exc, i12, j10, continuation);
    }

    private final Object t(Vs.b bVar, int i10, Continuation<? super BearerToken> continuation) {
        return C15805i.g(this.ioDispatcher, new f(bVar, this, i10, null), continuation);
    }

    static /* synthetic */ Object u(C6518e c6518e, Vs.b bVar, int i10, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return c6518e.t(bVar, i10, continuation);
    }

    public static /* synthetic */ Object w(C6518e c6518e, p pVar, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c6518e.v(pVar, z10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserTokenResponse x(p pVar) {
        return new UserTokenResponse(pVar.getTokenType(), pVar.getExpiresIn(), pVar.getRefreshToken(), d(pVar.getAccessToken()), null, null);
    }

    @Override // Yi.a
    public l<BearerToken> a() {
        l<BearerToken> lVarR = n.b(this.ioDispatcher, new b(null)).r();
        Intrinsics.i(lVarR, "toObservable(...)");
        return lVarR;
    }

    @Override // Yi.a
    public Object b(Continuation<? super BearerToken> continuation) {
        return C15805i.g(this.ioDispatcher, new d(null), continuation);
    }

    @Override // Yi.a
    public Object c(Continuation<? super BearerToken> continuation) {
        return C15805i.g(this.ioDispatcher, new c(null), continuation);
    }

    @Override // Yi.c
    /* renamed from: e, reason: from getter */
    protected k getUserManager() {
        return this.userManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:14:0x004d, B:42:0x00d5, B:47:0x00ed, B:49:0x00f3, B:50:0x00fc, B:46:0x00dc, B:36:0x00a3, B:38:0x00ab, B:32:0x0092), top: B:55:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [wv.a] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r9v0, types: [Yi.c, cj.e, java.lang.Object] */
    @Override // Yi.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(kotlin.coroutines.Continuation<? super kotlin.Unit> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.C6518e.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: p, reason: from getter */
    protected InterfaceC14523a getAnalyticsEngine() {
        return this.analyticsEngine;
    }

    public final boolean q(Exception exception) {
        Intrinsics.j(exception, "exception");
        if (exception instanceof IdTokenValidator.Error) {
            getAnalyticsEngine().k(Zi.d.f43839a.f(exception.getMessage()));
            throw new C5696a("Invalid ID Token", exception);
        }
        if (exception instanceof WebAuthentication.FlowCancelledException) {
            getAnalyticsEngine().k(i.f43841a.g());
            return true;
        }
        getAnalyticsEngine().k(Zi.d.f43839a.d(exception.getMessage()));
        getAnalyticsEngine().k(i.f43841a.i(exception.getMessage()));
        return false;
    }

    public final Object v(p pVar, boolean z10, Continuation<? super Unit> continuation) {
        Object objG = C15805i.g(this.ioDispatcher, new h(z10, pVar, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }
}
