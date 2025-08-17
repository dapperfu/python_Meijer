package zh;

import Dh.CustomerPropertiesResponse;
import Dh.Preference;
import Dh.RegisterNotificationDeviceResponse;
import Dh.p;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u00002\u00020\u0001BE\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0017H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b\u001e\u0010\u0019J\u0010\u0010 \u001a\u00020\u001fH\u0086@¢\u0006\u0004\b \u0010\u0019J \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b%\u0010&J(\u0010)\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020'H\u0086@¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00107¨\u00068"}, d2 = {"Lzh/j;", "", "Lyh/l;", "preferencesApi", "Lyh/j;", "legacyAccountsApi", "Lyh/k;", "legacyDigitalMperksApi", "LCs/b;", "userProvider", "Lzh/n;", "fcmTokenHelper", "LXi/a;", "authTokenProvider", "Lqv/K;", "ioDispatcher", "<init>", "(Lyh/l;Lyh/j;Lyh/k;LCs/b;Lzh/n;LXi/a;Lqv/K;)V", "LDh/p;", "preferenceKey", "LDh/o;", "g", "(LDh/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "preferenceList", "m", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "k", "LDh/l;", "i", "", "deviceType", "isDeviceNotificationEnabled", "LDh/w;", "j", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "registrationId", "l", "(IZJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Lyh/l;", "b", "Lyh/j;", "c", "Lyh/k;", "d", "LCs/b;", "e", "Lzh/n;", "f", "LXi/a;", "Lqv/K;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final yh.l preferencesApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yh.j legacyAccountsApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yh.k legacyDigitalMperksApi;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Cs.b userProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final n fcmTokenHelper;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Xi.a authTokenProvider;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LDh/o;", "<anonymous>", "(Lqv/O;)LDh/o;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.PreferencesDataSource$fetchPreference$2", f = "PreferencesDataSource.kt", l = {43, 42}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Preference>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f171977a;

        /* renamed from: b, reason: collision with root package name */
        int f171978b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ p f171980d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(p pVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f171980d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return j.this.new a(this.f171980d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Preference> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
        
            if (r7 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f171978b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r7)
                goto L5d
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f171977a
                yh.l r1 = (yh.l) r1
                kotlin.ResultKt.b(r7)
                goto L3c
            L22:
                kotlin.ResultKt.b(r7)
                zh.j r7 = zh.j.this
                yh.l r1 = zh.j.e(r7)
                zh.j r7 = zh.j.this
                Xi.a r7 = zh.j.a(r7)
                r6.f171977a = r1
                r6.f171978b = r3
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r0) goto L3c
                goto L5c
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r7 = (com.meijer.mobile.authentication.core.model.BearerToken) r7
                zh.j r3 = zh.j.this
                Cs.b r3 = zh.j.f(r3)
                java.lang.String r3 = r3.a()
                kotlin.jvm.internal.Intrinsics.g(r3)
                Dh.p r4 = r6.f171980d
                java.lang.String r4 = r4.getKey()
                r5 = 0
                r6.f171977a = r5
                r6.f171978b = r2
                java.lang.Object r7 = r1.b(r7, r3, r4, r6)
                if (r7 != r0) goto L5d
            L5c:
                return r0
            L5d:
                retrofit2.Response r7 = (retrofit2.Response) r7
                boolean r0 = r7.isSuccessful()
                if (r0 == 0) goto L73
                java.lang.Object r7 = r7.body()
                kotlin.jvm.internal.Intrinsics.g(r7)
                com.meijer.mobile.accounts.service.models.network.PreferenceResponseJson r7 = (com.meijer.mobile.accounts.service.models.network.PreferenceResponseJson) r7
                Dh.o r7 = Ch.b.p(r7)
                return r7
            L73:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LDh/o;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.PreferencesDataSource$fetchPreferences$2", f = "PreferencesDataSource.kt", l = {53, 52}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends Preference>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f171981a;

        /* renamed from: b, reason: collision with root package name */
        int f171982b;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends Preference>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<Preference>>) continuation);
        }

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return j.this.new b(continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<Preference>> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0054, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f171982b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r6)
                goto L57
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f171981a
                yh.l r1 = (yh.l) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                zh.j r6 = zh.j.this
                yh.l r1 = zh.j.e(r6)
                zh.j r6 = zh.j.this
                Xi.a r6 = zh.j.a(r6)
                r5.f171981a = r1
                r5.f171982b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L56
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                zh.j r3 = zh.j.this
                Cs.b r3 = zh.j.f(r3)
                java.lang.String r3 = r3.a()
                kotlin.jvm.internal.Intrinsics.g(r3)
                r4 = 0
                r5.f171981a = r4
                r5.f171982b = r2
                java.lang.Object r6 = r1.c(r6, r3, r5)
                if (r6 != r0) goto L57
            L56:
                return r0
            L57:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L8c
                java.lang.Object r6 = r6.body()
                kotlin.jvm.internal.Intrinsics.g(r6)
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.collections.CollectionsKt.x(r6, r1)
                r0.<init>(r1)
                java.util.Iterator r6 = r6.iterator()
            L77:
                boolean r1 = r6.hasNext()
                if (r1 == 0) goto L8b
                java.lang.Object r1 = r6.next()
                com.meijer.mobile.accounts.service.models.network.PreferenceResponseJson r1 = (com.meijer.mobile.accounts.service.models.network.PreferenceResponseJson) r1
                Dh.o r1 = Ch.b.p(r1)
                r0.add(r1)
                goto L77
            L8b:
                return r0
            L8c:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LDh/l;", "<anonymous>", "(Lqv/O;)LDh/l;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.PreferencesDataSource$getCustomerProperties$2", f = "PreferencesDataSource.kt", l = {85, 84}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super CustomerPropertiesResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f171984a;

        /* renamed from: b, reason: collision with root package name */
        int f171985b;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return j.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super CustomerPropertiesResponse> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r4.f171985b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r5)
                goto L4a
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                java.lang.Object r1 = r4.f171984a
                yh.k r1 = (yh.k) r1
                kotlin.ResultKt.b(r5)
                goto L3c
            L22:
                kotlin.ResultKt.b(r5)
                zh.j r5 = zh.j.this
                yh.k r1 = zh.j.d(r5)
                zh.j r5 = zh.j.this
                Xi.a r5 = zh.j.a(r5)
                r4.f171984a = r1
                r4.f171985b = r3
                java.lang.Object r5 = r5.c(r4)
                if (r5 != r0) goto L3c
                goto L49
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                r3 = 0
                r4.f171984a = r3
                r4.f171985b = r2
                java.lang.Object r5 = r1.a(r5, r4)
                if (r5 != r0) goto L4a
            L49:
                return r0
            L4a:
                retrofit2.Response r5 = (retrofit2.Response) r5
                boolean r0 = r5.isSuccessful()
                if (r0 == 0) goto L60
                java.lang.Object r5 = r5.body()
                kotlin.jvm.internal.Intrinsics.g(r5)
                com.meijer.mobile.accounts.service.models.network.CustomerPropertiesResponseJson r5 = (com.meijer.mobile.accounts.service.models.network.CustomerPropertiesResponseJson) r5
                Dh.l r5 = Ch.b.o(r5)
                return r5
            L60:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.j.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LDh/w;", "<anonymous>", "(Lqv/O;)LDh/w;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.PreferencesDataSource$registerNotificationDevice$2", f = "PreferencesDataSource.kt", l = {96, HttpResponseStatus.INFORMATIONAL_CONTINUE, 95}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super RegisterNotificationDeviceResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f171987a;

        /* renamed from: b, reason: collision with root package name */
        Object f171988b;

        /* renamed from: c, reason: collision with root package name */
        long f171989c;

        /* renamed from: d, reason: collision with root package name */
        int f171990d;

        /* renamed from: e, reason: collision with root package name */
        int f171991e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f171993g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f171994h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10, boolean z10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f171993g = i10;
            this.f171994h = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return j.this.new d(this.f171993g, this.f171994h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super RegisterNotificationDeviceResponse> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
        
            if (r14 != r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r13.f171991e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3b
                if (r1 == r4) goto L32
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.ResultKt.b(r14)
                goto L9d
            L16:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1e:
                int r1 = r13.f171990d
                long r3 = r13.f171989c
                java.lang.Object r5 = r13.f171988b
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                java.lang.Object r6 = r13.f171987a
                yh.j r6 = (yh.j) r6
                kotlin.ResultKt.b(r14)
                r12 = r6
                r6 = r1
                r1 = r5
                r4 = r3
                goto L81
            L32:
                java.lang.Object r1 = r13.f171987a
                yh.j r1 = (yh.j) r1
                kotlin.ResultKt.b(r14)
                r6 = r1
                goto L57
            L3b:
                kotlin.ResultKt.b(r14)
                zh.j r14 = zh.j.this
                yh.j r14 = zh.j.c(r14)
                zh.j r1 = zh.j.this
                Xi.a r1 = zh.j.a(r1)
                r13.f171987a = r14
                r13.f171991e = r4
                java.lang.Object r1 = r1.c(r13)
                if (r1 != r0) goto L55
                goto L9c
            L55:
                r6 = r14
                r14 = r1
            L57:
                r5 = r14
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                zh.j r14 = zh.j.this
                Cs.b r14 = zh.j.f(r14)
                long r7 = r14.c()
                int r1 = r13.f171993g
                zh.j r14 = zh.j.this
                zh.n r14 = zh.j.b(r14)
                r13.f171987a = r6
                r13.f171988b = r5
                r13.f171989c = r7
                r13.f171990d = r1
                r13.f171991e = r3
                java.lang.Object r14 = r14.a(r13)
                if (r14 != r0) goto L7d
                goto L9c
            L7d:
                r12 = r6
                r6 = r1
                r1 = r5
                r4 = r7
            L81:
                r7 = r14
                java.lang.String r7 = (java.lang.String) r7
                boolean r8 = r13.f171994h
                com.meijer.mobile.accounts.service.models.network.RegisterNotificationDeviceRequest r3 = new com.meijer.mobile.accounts.service.models.network.RegisterNotificationDeviceRequest
                r9 = 0
                r10 = 16
                r11 = 0
                r3.<init>(r4, r6, r7, r8, r9, r10, r11)
                r14 = 0
                r13.f171987a = r14
                r13.f171988b = r14
                r13.f171991e = r2
                java.lang.Object r14 = r12.c(r1, r3, r13)
                if (r14 != r0) goto L9d
            L9c:
                return r0
            L9d:
                retrofit2.Response r14 = (retrofit2.Response) r14
                boolean r0 = r14.isSuccessful()
                if (r0 == 0) goto Lb3
                java.lang.Object r14 = r14.body()
                kotlin.jvm.internal.Intrinsics.g(r14)
                com.meijer.mobile.accounts.service.models.network.RegisterNotificationDeviceResponseJson r14 = (com.meijer.mobile.accounts.service.models.network.RegisterNotificationDeviceResponseJson) r14
                Dh.w r14 = Ch.b.q(r14)
                return r14
            Lb3:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.j.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)Z"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.PreferencesDataSource$sendValidationEmail$2", f = "PreferencesDataSource.kt", l = {72, 71}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f171995a;

        /* renamed from: b, reason: collision with root package name */
        int f171996b;

        e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return j.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Boolean> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f171996b
                r2 = 1
                r3 = 0
                r4 = 2
                if (r1 == 0) goto L23
                if (r1 == r2) goto L1b
                if (r1 != r4) goto L13
                kotlin.ResultKt.b(r6)
                goto L4a
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                java.lang.Object r1 = r5.f171995a
                yh.j r1 = (yh.j) r1
                kotlin.ResultKt.b(r6)
                goto L3d
            L23:
                kotlin.ResultKt.b(r6)
                zh.j r6 = zh.j.this
                yh.j r1 = zh.j.c(r6)
                zh.j r6 = zh.j.this
                Xi.a r6 = zh.j.a(r6)
                r5.f171995a = r1
                r5.f171996b = r2
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3d
                goto L49
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                r5.f171995a = r3
                r5.f171996b = r4
                java.lang.Object r6 = r1.a(r6, r5)
                if (r6 != r0) goto L4a
            L49:
                return r0
            L4a:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L6f
                java.lang.Object r6 = r6.body()
                kotlin.jvm.internal.Intrinsics.g(r6)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L66
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.a(r6)
                return r6
            L66:
                com.meijer.mobile.core.networking.exceptions.RetrofitException$a r6 = com.meijer.mobile.core.networking.exceptions.RetrofitException.INSTANCE
                rk.c r0 = rk.c.f159049e
                com.meijer.mobile.core.networking.exceptions.RetrofitException r6 = com.meijer.mobile.core.networking.exceptions.RetrofitException.Companion.f(r6, r0, r3, r4, r3)
                throw r6
            L6f:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.j.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LDh/w;", "<anonymous>", "(Lqv/O;)LDh/w;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.PreferencesDataSource$updateNotificationDevice$2", f = "PreferencesDataSource.kt", l = {114, 118, 113}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super RegisterNotificationDeviceResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f171998a;

        /* renamed from: b, reason: collision with root package name */
        Object f171999b;

        /* renamed from: c, reason: collision with root package name */
        long f172000c;

        /* renamed from: d, reason: collision with root package name */
        int f172001d;

        /* renamed from: e, reason: collision with root package name */
        int f172002e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f172004g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f172005h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f172006i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(int i10, boolean z10, long j10, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f172004g = i10;
            this.f172005h = z10;
            this.f172006i = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return j.this.new f(this.f172004g, this.f172005h, this.f172006i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super RegisterNotificationDeviceResponse> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
        
            if (r14 != r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r13.f172002e
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L3b
                if (r1 == r4) goto L32
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                kotlin.ResultKt.b(r14)
                goto La3
            L16:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1e:
                int r1 = r13.f172001d
                long r3 = r13.f172000c
                java.lang.Object r5 = r13.f171999b
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                java.lang.Object r6 = r13.f171998a
                yh.j r6 = (yh.j) r6
                kotlin.ResultKt.b(r14)
                r12 = r6
                r6 = r1
                r1 = r5
                r4 = r3
                goto L81
            L32:
                java.lang.Object r1 = r13.f171998a
                yh.j r1 = (yh.j) r1
                kotlin.ResultKt.b(r14)
                r6 = r1
                goto L57
            L3b:
                kotlin.ResultKt.b(r14)
                zh.j r14 = zh.j.this
                yh.j r14 = zh.j.c(r14)
                zh.j r1 = zh.j.this
                Xi.a r1 = zh.j.a(r1)
                r13.f171998a = r14
                r13.f172002e = r4
                java.lang.Object r1 = r1.c(r13)
                if (r1 != r0) goto L55
                goto La2
            L55:
                r6 = r14
                r14 = r1
            L57:
                r5 = r14
                com.meijer.mobile.authentication.core.model.BearerToken r5 = (com.meijer.mobile.authentication.core.model.BearerToken) r5
                zh.j r14 = zh.j.this
                Cs.b r14 = zh.j.f(r14)
                long r7 = r14.c()
                int r1 = r13.f172004g
                zh.j r14 = zh.j.this
                zh.n r14 = zh.j.b(r14)
                r13.f171998a = r6
                r13.f171999b = r5
                r13.f172000c = r7
                r13.f172001d = r1
                r13.f172002e = r3
                java.lang.Object r14 = r14.a(r13)
                if (r14 != r0) goto L7d
                goto La2
            L7d:
                r12 = r6
                r6 = r1
                r1 = r5
                r4 = r7
            L81:
                r7 = r14
                java.lang.String r7 = (java.lang.String) r7
                boolean r8 = r13.f172005h
                com.meijer.mobile.accounts.service.models.network.RegisterNotificationDeviceRequest r3 = new com.meijer.mobile.accounts.service.models.network.RegisterNotificationDeviceRequest
                r9 = 0
                r10 = 16
                r11 = 0
                r3.<init>(r4, r6, r7, r8, r9, r10, r11)
                long r10 = r13.f172006i
                r14 = 0
                r13.f171998a = r14
                r13.f171999b = r14
                r13.f172002e = r2
                r8 = r1
                r9 = r3
                r7 = r12
                r12 = r13
                java.lang.Object r14 = r7.b(r8, r9, r10, r12)
                if (r14 != r0) goto La3
            La2:
                return r0
            La3:
                retrofit2.Response r14 = (retrofit2.Response) r14
                boolean r0 = r14.isSuccessful()
                if (r0 == 0) goto Lb9
                java.lang.Object r14 = r14.body()
                kotlin.jvm.internal.Intrinsics.g(r14)
                com.meijer.mobile.accounts.service.models.network.RegisterNotificationDeviceResponseJson r14 = (com.meijer.mobile.accounts.service.models.network.RegisterNotificationDeviceResponseJson) r14
                Dh.w r14 = Ch.b.q(r14)
                return r14
            Lb9:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.j.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LDh/o;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.accounts.service.datasource.PreferencesDataSource$updatePreferences$2", f = "PreferencesDataSource.kt", l = {62, 61}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends Preference>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f172007a;

        /* renamed from: b, reason: collision with root package name */
        int f172008b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<Preference> f172010d;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends Preference>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<Preference>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(List<Preference> list, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f172010d = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return j.this.new g(this.f172010d, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<Preference>> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
        
            if (r9 == r0) goto L19;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.f172008b
                r2 = 10
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L1c
                if (r1 != r3) goto L14
                kotlin.ResultKt.b(r9)
                goto L7e
            L14:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1c:
                java.lang.Object r1 = r8.f172007a
                yh.l r1 = (yh.l) r1
                kotlin.ResultKt.b(r9)
                goto L3e
            L24:
                kotlin.ResultKt.b(r9)
                zh.j r9 = zh.j.this
                yh.l r1 = zh.j.e(r9)
                zh.j r9 = zh.j.this
                Xi.a r9 = zh.j.a(r9)
                r8.f172007a = r1
                r8.f172008b = r4
                java.lang.Object r9 = r9.c(r8)
                if (r9 != r0) goto L3e
                goto L7d
            L3e:
                com.meijer.mobile.authentication.core.model.BearerToken r9 = (com.meijer.mobile.authentication.core.model.BearerToken) r9
                zh.j r4 = zh.j.this
                Cs.b r4 = zh.j.f(r4)
                java.lang.String r4 = r4.a()
                kotlin.jvm.internal.Intrinsics.g(r4)
                java.util.List<Dh.o> r5 = r8.f172010d
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r6 = new java.util.ArrayList
                int r7 = kotlin.collections.CollectionsKt.x(r5, r2)
                r6.<init>(r7)
                java.util.Iterator r5 = r5.iterator()
            L5e:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L72
                java.lang.Object r7 = r5.next()
                Dh.o r7 = (Dh.Preference) r7
                com.meijer.mobile.accounts.service.models.network.PreferenceRequestJson r7 = Ch.b.w(r7)
                r6.add(r7)
                goto L5e
            L72:
                r5 = 0
                r8.f172007a = r5
                r8.f172008b = r3
                java.lang.Object r9 = r1.a(r9, r4, r6, r8)
                if (r9 != r0) goto L7e
            L7d:
                return r0
            L7e:
                retrofit2.Response r9 = (retrofit2.Response) r9
                boolean r0 = r9.isSuccessful()
                if (r0 == 0) goto Lb1
                java.lang.Object r9 = r9.body()
                kotlin.jvm.internal.Intrinsics.g(r9)
                java.lang.Iterable r9 = (java.lang.Iterable) r9
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = kotlin.collections.CollectionsKt.x(r9, r2)
                r0.<init>(r1)
                java.util.Iterator r9 = r9.iterator()
            L9c:
                boolean r1 = r9.hasNext()
                if (r1 == 0) goto Lb0
                java.lang.Object r1 = r9.next()
                com.meijer.mobile.accounts.service.models.network.PreferenceResponseJson r1 = (com.meijer.mobile.accounts.service.models.network.PreferenceResponseJson) r1
                Dh.o r1 = Ch.b.p(r1)
                r0.add(r1)
                goto L9c
            Lb0:
                return r0
            Lb1:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: zh.j.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public j(yh.l preferencesApi, yh.j legacyAccountsApi, yh.k legacyDigitalMperksApi, Cs.b userProvider, n fcmTokenHelper, Xi.a authTokenProvider, AbstractC16618K ioDispatcher) {
        Intrinsics.j(preferencesApi, "preferencesApi");
        Intrinsics.j(legacyAccountsApi, "legacyAccountsApi");
        Intrinsics.j(legacyDigitalMperksApi, "legacyDigitalMperksApi");
        Intrinsics.j(userProvider, "userProvider");
        Intrinsics.j(fcmTokenHelper, "fcmTokenHelper");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.preferencesApi = preferencesApi;
        this.legacyAccountsApi = legacyAccountsApi;
        this.legacyDigitalMperksApi = legacyDigitalMperksApi;
        this.userProvider = userProvider;
        this.fcmTokenHelper = fcmTokenHelper;
        this.authTokenProvider = authTokenProvider;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object g(p pVar, Continuation<? super Preference> continuation) {
        return C16644i.g(this.ioDispatcher, new a(pVar, null), continuation);
    }

    public final Object h(Continuation<? super List<Preference>> continuation) {
        return C16644i.g(this.ioDispatcher, new b(null), continuation);
    }

    public final Object i(Continuation<? super CustomerPropertiesResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new c(null), continuation);
    }

    public final Object j(int i10, boolean z10, Continuation<? super RegisterNotificationDeviceResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new d(i10, z10, null), continuation);
    }

    public final Object k(Continuation<? super Boolean> continuation) {
        return C16644i.g(this.ioDispatcher, new e(null), continuation);
    }

    public final Object l(int i10, boolean z10, long j10, Continuation<? super RegisterNotificationDeviceResponse> continuation) {
        return C16644i.g(this.ioDispatcher, new f(i10, z10, j10, null), continuation);
    }

    public final Object m(List<Preference> list, Continuation<? super List<Preference>> continuation) {
        return C16644i.g(this.ioDispatcher, new g(list, null), continuation);
    }
}
