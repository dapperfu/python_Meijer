package Ml;

import com.meijer.mobile.greenville.model.request.item.add.AddItemRequest;
import com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest;
import com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest;
import com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest;
import com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest;
import com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest;
import com.meijer.mobile.greenville.model.response.TransactionResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u001bH\u0086@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"¨\u0006#"}, d2 = {"LMl/a;", "", "LLl/a;", "greenvilleAPI", "LXi/a;", "authTokenProvider", "Lqv/K;", "ioDispatcher", "<init>", "(LLl/a;LXi/a;Lqv/K;)V", "Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequest;", "request", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "f", "(Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/trip/cancel/CancelTripRequest;", "d", "(Lcom/meijer/mobile/greenville/model/request/trip/cancel/CancelTripRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;", "c", "(Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;", "h", "(Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;", "e", "(Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/transferstatus/TransferStatusRequest;", "g", "(Lcom/meijer/mobile/greenville/model/request/transferstatus/TransferStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LLl/a;", "b", "LXi/a;", "Lqv/K;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ll.a greenvilleAPI;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Xi.a authTokenProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource", f = "GreenvilleDataSource.kt", l = {64}, m = "addItem")
    /* renamed from: Ml.a$a, reason: collision with other inner class name */
    static final class C0330a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f19681a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19682b;

        /* renamed from: d, reason: collision with root package name */
        int f19684d;

        C0330a(Continuation<? super C0330a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19682b = obj;
            this.f19684d |= Integer.MIN_VALUE;
            return a.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/greenville/model/response/TransactionResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource$addItem$2", f = "GreenvilleDataSource.kt", l = {66, 65}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super TransactionResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f19685a;

        /* renamed from: b, reason: collision with root package name */
        int f19686b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AddItemRequest f19688d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AddItemRequest addItemRequest, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f19688d = addItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(this.f19688d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super TransactionResponse> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r6 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) throws android.security.keystore.UserNotAuthenticatedException, java.io.IOException {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f19686b
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L23
                if (r1 == r4) goto L1b
                if (r1 != r3) goto L13
                kotlin.ResultKt.b(r6)
                goto L4c
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                java.lang.Object r1 = r5.f19685a
                Ll.a r1 = (Ll.a) r1
                kotlin.ResultKt.b(r6)
                goto L3d
            L23:
                kotlin.ResultKt.b(r6)
                Ml.a r6 = Ml.a.this
                Ll.a r1 = Ml.a.b(r6)
                Ml.a r6 = Ml.a.this
                Xi.a r6 = Ml.a.a(r6)
                r5.f19685a = r1
                r5.f19686b = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3d
                goto L4b
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                com.meijer.mobile.greenville.model.request.item.add.AddItemRequest r4 = r5.f19688d
                r5.f19685a = r2
                r5.f19686b = r3
                java.lang.Object r6 = r1.f(r6, r4, r5)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                retrofit2.Response r6 = (retrofit2.Response) r6
                int r0 = r6.code()
                r1 = 400(0x190, float:5.6E-43)
                if (r0 == r1) goto L8c
                r1 = 500(0x1f4, float:7.0E-43)
                if (r0 == r1) goto L7b
                r2 = 503(0x1f7, float:7.05E-43)
                if (r0 == r2) goto L7b
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L75
                java.lang.Object r6 = r6.body()
                com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
                if (r6 == 0) goto L6d
                return r6
            L6d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Response body was null."
                r6.<init>(r0)
                throw r6
            L75:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            L7b:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                okhttp3.ResponseBody r6 = r6.errorBody()
                kotlin.jvm.internal.Intrinsics.g(r6)
                retrofit2.Response r6 = retrofit2.Response.error(r1, r6)
                r0.<init>(r6)
                throw r0
            L8c:
                com.squareup.moshi.t$a r0 = new com.squareup.moshi.t$a
                r0.<init>()
                com.squareup.moshi.t r0 = r0.d()
                java.lang.Class<com.meijer.mobile.greenville.model.response.TransactionResponse> r1 = com.meijer.mobile.greenville.model.response.TransactionResponse.class
                com.squareup.moshi.h r0 = r0.c(r1)
                okhttp3.ResponseBody r6 = r6.errorBody()
                if (r6 == 0) goto La5
                java.lang.String r2 = r6.string()
            La5:
                if (r2 == 0) goto Lb0
                java.lang.Object r6 = r0.fromJson(r2)
                com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
                if (r6 == 0) goto Lb0
                return r6
            Lb0:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Error body was null."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: Ml.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource", f = "GreenvilleDataSource.kt", l = {53}, m = "cancelTrip")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f19689a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19690b;

        /* renamed from: d, reason: collision with root package name */
        int f19692d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19690b = obj;
            this.f19692d |= Integer.MIN_VALUE;
            return a.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/greenville/model/response/TransactionResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource$cancelTrip$2", f = "GreenvilleDataSource.kt", l = {55, 54}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super TransactionResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f19693a;

        /* renamed from: b, reason: collision with root package name */
        int f19694b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CancelTripRequest f19696d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CancelTripRequest cancelTripRequest, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f19696d = cancelTripRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new d(this.f19696d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super TransactionResponse> continuation) {
            return ((d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
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
                int r1 = r5.f19694b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r6)
                goto L4c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f19693a
                Ll.a r1 = (Ll.a) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                Ml.a r6 = Ml.a.this
                Ll.a r1 = Ml.a.b(r6)
                Ml.a r6 = Ml.a.this
                Xi.a r6 = Ml.a.a(r6)
                r5.f19693a = r1
                r5.f19694b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4b
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest r3 = r5.f19696d
                r4 = 0
                r5.f19693a = r4
                r5.f19694b = r2
                java.lang.Object r6 = r1.c(r6, r3, r5)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L65
                java.lang.Object r6 = r6.body()
                com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
                if (r6 == 0) goto L5d
                return r6
            L5d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Response body was null."
                r6.<init>(r0)
                throw r6
            L65:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ml.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource", f = "GreenvilleDataSource.kt", l = {105}, m = "removeItem")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f19697a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19698b;

        /* renamed from: d, reason: collision with root package name */
        int f19700d;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19698b = obj;
            this.f19700d |= Integer.MIN_VALUE;
            return a.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/greenville/model/response/TransactionResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource$removeItem$2", f = "GreenvilleDataSource.kt", l = {107, 106}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super TransactionResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f19701a;

        /* renamed from: b, reason: collision with root package name */
        int f19702b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ RemoveItemRequest f19704d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(RemoveItemRequest removeItemRequest, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f19704d = removeItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new f(this.f19704d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super TransactionResponse> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
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
                int r1 = r5.f19702b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r6)
                goto L4c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f19701a
                Ll.a r1 = (Ll.a) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                Ml.a r6 = Ml.a.this
                Ll.a r1 = Ml.a.b(r6)
                Ml.a r6 = Ml.a.this
                Xi.a r6 = Ml.a.a(r6)
                r5.f19701a = r1
                r5.f19702b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4b
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest r3 = r5.f19704d
                r4 = 0
                r5.f19701a = r4
                r5.f19702b = r2
                java.lang.Object r6 = r1.b(r6, r3, r5)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L65
                java.lang.Object r6 = r6.body()
                com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
                if (r6 == 0) goto L5d
                return r6
            L5d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Response body was null."
                r6.<init>(r0)
                throw r6
            L65:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ml.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource", f = "GreenvilleDataSource.kt", l = {42}, m = "startTrip")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f19705a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19706b;

        /* renamed from: d, reason: collision with root package name */
        int f19708d;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19706b = obj;
            this.f19708d |= Integer.MIN_VALUE;
            return a.this.f(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/greenville/model/response/TransactionResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource$startTrip$2", f = "GreenvilleDataSource.kt", l = {44, 43}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super TransactionResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f19709a;

        /* renamed from: b, reason: collision with root package name */
        int f19710b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ StartTripRequest f19712d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(StartTripRequest startTripRequest, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f19712d = startTripRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new h(this.f19712d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super TransactionResponse> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
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
                int r1 = r5.f19710b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r6)
                goto L4c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f19709a
                Ll.a r1 = (Ll.a) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                Ml.a r6 = Ml.a.this
                Ll.a r1 = Ml.a.b(r6)
                Ml.a r6 = Ml.a.this
                Xi.a r6 = Ml.a.a(r6)
                r5.f19709a = r1
                r5.f19710b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4b
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest r3 = r5.f19712d
                r4 = 0
                r5.f19709a = r4
                r5.f19710b = r2
                java.lang.Object r6 = r1.d(r6, r3, r5)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L65
                java.lang.Object r6 = r6.body()
                com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
                if (r6 == 0) goto L5d
                return r6
            L5d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Response body was null."
                r6.<init>(r0)
                throw r6
            L65:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ml.a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource", f = "GreenvilleDataSource.kt", l = {116}, m = "transferStatus")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f19713a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19714b;

        /* renamed from: d, reason: collision with root package name */
        int f19716d;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19714b = obj;
            this.f19716d |= Integer.MIN_VALUE;
            return a.this.g(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/greenville/model/response/TransactionResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource$transferStatus$2", f = "GreenvilleDataSource.kt", l = {118, 117}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class j extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super TransactionResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f19717a;

        /* renamed from: b, reason: collision with root package name */
        int f19718b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TransferStatusRequest f19720d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(TransferStatusRequest transferStatusRequest, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f19720d = transferStatusRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new j(this.f19720d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super TransactionResponse> continuation) {
            return ((j) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
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
                int r1 = r5.f19718b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r6)
                goto L4c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f19717a
                Ll.a r1 = (Ll.a) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                Ml.a r6 = Ml.a.this
                Ll.a r1 = Ml.a.b(r6)
                Ml.a r6 = Ml.a.this
                Xi.a r6 = Ml.a.a(r6)
                r5.f19717a = r1
                r5.f19718b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4b
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest r3 = r5.f19720d
                r4 = 0
                r5.f19717a = r4
                r5.f19718b = r2
                java.lang.Object r6 = r1.e(r6, r3, r5)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L65
                java.lang.Object r6 = r6.body()
                com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
                if (r6 == 0) goto L5d
                return r6
            L5d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Response body was null."
                r6.<init>(r0)
                throw r6
            L65:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ml.a.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource", f = "GreenvilleDataSource.kt", l = {94}, m = "updateItem")
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f19721a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f19722b;

        /* renamed from: d, reason: collision with root package name */
        int f19724d;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f19722b = obj;
            this.f19724d |= Integer.MIN_VALUE;
            return a.this.h(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "<anonymous>", "(Lqv/O;)Lcom/meijer/mobile/greenville/model/response/TransactionResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource$updateItem$2", f = "GreenvilleDataSource.kt", l = {96, 95}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class l extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super TransactionResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f19725a;

        /* renamed from: b, reason: collision with root package name */
        int f19726b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ UpdateItemRequest f19728d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(UpdateItemRequest updateItemRequest, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f19728d = updateItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new l(this.f19728d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super TransactionResponse> continuation) {
            return ((l) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
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
                int r1 = r5.f19726b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r6)
                goto L4c
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f19725a
                Ll.a r1 = (Ll.a) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                Ml.a r6 = Ml.a.this
                Ll.a r1 = Ml.a.b(r6)
                Ml.a r6 = Ml.a.this
                Xi.a r6 = Ml.a.a(r6)
                r5.f19725a = r1
                r5.f19726b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4b
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest r3 = r5.f19728d
                r4 = 0
                r5.f19725a = r4
                r5.f19726b = r2
                java.lang.Object r6 = r1.a(r6, r3, r5)
                if (r6 != r0) goto L4c
            L4b:
                return r0
            L4c:
                retrofit2.Response r6 = (retrofit2.Response) r6
                boolean r0 = r6.isSuccessful()
                if (r0 == 0) goto L65
                java.lang.Object r6 = r6.body()
                com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
                if (r6 == 0) goto L5d
                return r6
            L5d:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Response body was null."
                r6.<init>(r0)
                throw r6
            L65:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r6)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Ml.a.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(Ll.a greenvilleAPI, Xi.a authTokenProvider, AbstractC16618K ioDispatcher) {
        Intrinsics.j(greenvilleAPI, "greenvilleAPI");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.greenvilleAPI = greenvilleAPI;
        this.authTokenProvider = authTokenProvider;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.meijer.mobile.greenville.model.request.item.add.AddItemRequest r6, kotlin.coroutines.Continuation<? super com.meijer.mobile.greenville.model.response.TransactionResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Ml.a.C0330a
            if (r0 == 0) goto L13
            r0 = r7
            Ml.a$a r0 = (Ml.a.C0330a) r0
            int r1 = r0.f19684d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19684d = r1
            goto L18
        L13:
            Ml.a$a r0 = new Ml.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19682b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f19684d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f19681a
            com.meijer.mobile.greenville.model.request.item.add.AddItemRequest r6 = (com.meijer.mobile.greenville.model.request.item.add.AddItemRequest) r6
            kotlin.ResultKt.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            qv.K r7 = r5.ioDispatcher
            Ml.a$b r2 = new Ml.a$b
            r4 = 0
            r2.<init>(r6, r4)
            r0.f19681a = r6
            r0.f19684d = r3
            java.lang.Object r7 = qv.C16644i.g(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r6 = r7
            com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
            uw.a$a r0 = uw.a.INSTANCE
            java.lang.String r1 = "GreenvilleService"
            uw.a$b r0 = r0.x(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Add Item Response: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.a(r6, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ml.a.c(com.meijer.mobile.greenville.model.request.item.add.AddItemRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest r6, kotlin.coroutines.Continuation<? super com.meijer.mobile.greenville.model.response.TransactionResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Ml.a.c
            if (r0 == 0) goto L13
            r0 = r7
            Ml.a$c r0 = (Ml.a.c) r0
            int r1 = r0.f19692d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19692d = r1
            goto L18
        L13:
            Ml.a$c r0 = new Ml.a$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19690b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f19692d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f19689a
            com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest r6 = (com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest) r6
            kotlin.ResultKt.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            qv.K r7 = r5.ioDispatcher
            Ml.a$d r2 = new Ml.a$d
            r4 = 0
            r2.<init>(r6, r4)
            r0.f19689a = r6
            r0.f19692d = r3
            java.lang.Object r7 = qv.C16644i.g(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r6 = r7
            com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
            uw.a$a r0 = uw.a.INSTANCE
            java.lang.String r1 = "GreenvilleService"
            uw.a$b r0 = r0.x(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cancel Trip Response: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.a(r6, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ml.a.d(com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest r6, kotlin.coroutines.Continuation<? super com.meijer.mobile.greenville.model.response.TransactionResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Ml.a.e
            if (r0 == 0) goto L13
            r0 = r7
            Ml.a$e r0 = (Ml.a.e) r0
            int r1 = r0.f19700d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19700d = r1
            goto L18
        L13:
            Ml.a$e r0 = new Ml.a$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19698b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f19700d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f19697a
            com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest r6 = (com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest) r6
            kotlin.ResultKt.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            qv.K r7 = r5.ioDispatcher
            Ml.a$f r2 = new Ml.a$f
            r4 = 0
            r2.<init>(r6, r4)
            r0.f19697a = r6
            r0.f19700d = r3
            java.lang.Object r7 = qv.C16644i.g(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r6 = r7
            com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
            uw.a$a r0 = uw.a.INSTANCE
            java.lang.String r1 = "GreenvilleService"
            uw.a$b r0 = r0.x(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Remove Item Response: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.a(r6, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ml.a.e(com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest r6, kotlin.coroutines.Continuation<? super com.meijer.mobile.greenville.model.response.TransactionResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Ml.a.g
            if (r0 == 0) goto L13
            r0 = r7
            Ml.a$g r0 = (Ml.a.g) r0
            int r1 = r0.f19708d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19708d = r1
            goto L18
        L13:
            Ml.a$g r0 = new Ml.a$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19706b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f19708d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f19705a
            com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest r6 = (com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest) r6
            kotlin.ResultKt.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            qv.K r7 = r5.ioDispatcher
            Ml.a$h r2 = new Ml.a$h
            r4 = 0
            r2.<init>(r6, r4)
            r0.f19705a = r6
            r0.f19708d = r3
            java.lang.Object r7 = qv.C16644i.g(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r6 = r7
            com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
            uw.a$a r0 = uw.a.INSTANCE
            java.lang.String r1 = "GreenvilleService"
            uw.a$b r0 = r0.x(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Start Trip Response: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.a(r6, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ml.a.f(com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest r6, kotlin.coroutines.Continuation<? super com.meijer.mobile.greenville.model.response.TransactionResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Ml.a.i
            if (r0 == 0) goto L13
            r0 = r7
            Ml.a$i r0 = (Ml.a.i) r0
            int r1 = r0.f19716d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19716d = r1
            goto L18
        L13:
            Ml.a$i r0 = new Ml.a$i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19714b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f19716d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f19713a
            com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest r6 = (com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest) r6
            kotlin.ResultKt.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            qv.K r7 = r5.ioDispatcher
            Ml.a$j r2 = new Ml.a$j
            r4 = 0
            r2.<init>(r6, r4)
            r0.f19713a = r6
            r0.f19716d = r3
            java.lang.Object r7 = qv.C16644i.g(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r6 = r7
            com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
            uw.a$a r0 = uw.a.INSTANCE
            java.lang.String r1 = "GreenvilleService"
            uw.a$b r0 = r0.x(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Transfer Status Response: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.a(r6, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ml.a.g(com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest r6, kotlin.coroutines.Continuation<? super com.meijer.mobile.greenville.model.response.TransactionResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Ml.a.k
            if (r0 == 0) goto L13
            r0 = r7
            Ml.a$k r0 = (Ml.a.k) r0
            int r1 = r0.f19724d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19724d = r1
            goto L18
        L13:
            Ml.a$k r0 = new Ml.a$k
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f19722b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f19724d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f19721a
            com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest r6 = (com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest) r6
            kotlin.ResultKt.b(r7)
            goto L4b
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.ResultKt.b(r7)
            qv.K r7 = r5.ioDispatcher
            Ml.a$l r2 = new Ml.a$l
            r4 = 0
            r2.<init>(r6, r4)
            r0.f19721a = r6
            r0.f19724d = r3
            java.lang.Object r7 = qv.C16644i.g(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r6 = r7
            com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
            uw.a$a r0 = uw.a.INSTANCE
            java.lang.String r1 = "GreenvilleService"
            uw.a$b r0 = r0.x(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Update Item Response: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.a(r6, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ml.a.h(com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
