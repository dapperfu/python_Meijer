package Nl;

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
import mv.AbstractC15779K;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001c\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u001bH\u0086@¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"¨\u0006#"}, d2 = {"LNl/a;", "", "LMl/a;", "greenvilleAPI", "LYi/a;", "authTokenProvider", "Lmv/K;", "ioDispatcher", "<init>", "(LMl/a;LYi/a;Lmv/K;)V", "Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequest;", "request", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "f", "(Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/trip/cancel/CancelTripRequest;", "d", "(Lcom/meijer/mobile/greenville/model/request/trip/cancel/CancelTripRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;", "c", "(Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;", "h", "(Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;", "e", "(Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/transferstatus/TransferStatusRequest;", "g", "(Lcom/meijer/mobile/greenville/model/request/transferstatus/TransferStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LMl/a;", "b", "LYi/a;", "Lmv/K;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ml.a greenvilleAPI;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Yi.a authTokenProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource", f = "GreenvilleDataSource.kt", l = {64}, m = "addItem")
    /* renamed from: Nl.a$a, reason: collision with other inner class name */
    static final class C0369a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f21013a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f21014b;

        /* renamed from: d, reason: collision with root package name */
        int f21016d;

        C0369a(Continuation<? super C0369a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f21014b = obj;
            this.f21016d |= Integer.MIN_VALUE;
            return a.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/greenville/model/response/TransactionResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource$addItem$2", f = "GreenvilleDataSource.kt", l = {66, 65}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super TransactionResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f21017a;

        /* renamed from: b, reason: collision with root package name */
        int f21018b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AddItemRequest f21020d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AddItemRequest addItemRequest, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f21020d = addItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new b(this.f21020d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super TransactionResponse> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r5.f21018b
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
                java.lang.Object r1 = r5.f21017a
                Ml.a r1 = (Ml.a) r1
                kotlin.ResultKt.b(r6)
                goto L3d
            L23:
                kotlin.ResultKt.b(r6)
                Nl.a r6 = Nl.a.this
                Ml.a r1 = Nl.a.b(r6)
                Nl.a r6 = Nl.a.this
                Yi.a r6 = Nl.a.a(r6)
                r5.f21017a = r1
                r5.f21018b = r4
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3d
                goto L4b
            L3d:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                com.meijer.mobile.greenville.model.request.item.add.AddItemRequest r4 = r5.f21020d
                r5.f21017a = r2
                r5.f21018b = r3
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
            throw new UnsupportedOperationException("Method not decompiled: Nl.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource", f = "GreenvilleDataSource.kt", l = {53}, m = "cancelTrip")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f21021a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f21022b;

        /* renamed from: d, reason: collision with root package name */
        int f21024d;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f21022b = obj;
            this.f21024d |= Integer.MIN_VALUE;
            return a.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/greenville/model/response/TransactionResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource$cancelTrip$2", f = "GreenvilleDataSource.kt", l = {55, 54}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super TransactionResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f21025a;

        /* renamed from: b, reason: collision with root package name */
        int f21026b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CancelTripRequest f21028d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CancelTripRequest cancelTripRequest, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f21028d = cancelTripRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new d(this.f21028d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super TransactionResponse> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r5.f21026b
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
                java.lang.Object r1 = r5.f21025a
                Ml.a r1 = (Ml.a) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                Nl.a r6 = Nl.a.this
                Ml.a r1 = Nl.a.b(r6)
                Nl.a r6 = Nl.a.this
                Yi.a r6 = Nl.a.a(r6)
                r5.f21025a = r1
                r5.f21026b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4b
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest r3 = r5.f21028d
                r4 = 0
                r5.f21025a = r4
                r5.f21026b = r2
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
            throw new UnsupportedOperationException("Method not decompiled: Nl.a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource", f = "GreenvilleDataSource.kt", l = {105}, m = "removeItem")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f21029a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f21030b;

        /* renamed from: d, reason: collision with root package name */
        int f21032d;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f21030b = obj;
            this.f21032d |= Integer.MIN_VALUE;
            return a.this.e(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/greenville/model/response/TransactionResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource$removeItem$2", f = "GreenvilleDataSource.kt", l = {107, 106}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super TransactionResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f21033a;

        /* renamed from: b, reason: collision with root package name */
        int f21034b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ RemoveItemRequest f21036d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(RemoveItemRequest removeItemRequest, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f21036d = removeItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new f(this.f21036d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super TransactionResponse> continuation) {
            return ((f) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r5.f21034b
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
                java.lang.Object r1 = r5.f21033a
                Ml.a r1 = (Ml.a) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                Nl.a r6 = Nl.a.this
                Ml.a r1 = Nl.a.b(r6)
                Nl.a r6 = Nl.a.this
                Yi.a r6 = Nl.a.a(r6)
                r5.f21033a = r1
                r5.f21034b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4b
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest r3 = r5.f21036d
                r4 = 0
                r5.f21033a = r4
                r5.f21034b = r2
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
            throw new UnsupportedOperationException("Method not decompiled: Nl.a.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource", f = "GreenvilleDataSource.kt", l = {42}, m = "startTrip")
    static final class g extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f21037a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f21038b;

        /* renamed from: d, reason: collision with root package name */
        int f21040d;

        g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f21038b = obj;
            this.f21040d |= Integer.MIN_VALUE;
            return a.this.f(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/greenville/model/response/TransactionResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource$startTrip$2", f = "GreenvilleDataSource.kt", l = {44, 43}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super TransactionResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f21041a;

        /* renamed from: b, reason: collision with root package name */
        int f21042b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ StartTripRequest f21044d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(StartTripRequest startTripRequest, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f21044d = startTripRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new h(this.f21044d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super TransactionResponse> continuation) {
            return ((h) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r5.f21042b
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
                java.lang.Object r1 = r5.f21041a
                Ml.a r1 = (Ml.a) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                Nl.a r6 = Nl.a.this
                Ml.a r1 = Nl.a.b(r6)
                Nl.a r6 = Nl.a.this
                Yi.a r6 = Nl.a.a(r6)
                r5.f21041a = r1
                r5.f21042b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4b
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest r3 = r5.f21044d
                r4 = 0
                r5.f21041a = r4
                r5.f21042b = r2
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
            throw new UnsupportedOperationException("Method not decompiled: Nl.a.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource", f = "GreenvilleDataSource.kt", l = {116}, m = "transferStatus")
    static final class i extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f21045a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f21046b;

        /* renamed from: d, reason: collision with root package name */
        int f21048d;

        i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f21046b = obj;
            this.f21048d |= Integer.MIN_VALUE;
            return a.this.g(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/greenville/model/response/TransactionResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource$transferStatus$2", f = "GreenvilleDataSource.kt", l = {118, 117}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class j extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super TransactionResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f21049a;

        /* renamed from: b, reason: collision with root package name */
        int f21050b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TransferStatusRequest f21052d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(TransferStatusRequest transferStatusRequest, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f21052d = transferStatusRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new j(this.f21052d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super TransactionResponse> continuation) {
            return ((j) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r5.f21050b
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
                java.lang.Object r1 = r5.f21049a
                Ml.a r1 = (Ml.a) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                Nl.a r6 = Nl.a.this
                Ml.a r1 = Nl.a.b(r6)
                Nl.a r6 = Nl.a.this
                Yi.a r6 = Nl.a.a(r6)
                r5.f21049a = r1
                r5.f21050b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4b
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest r3 = r5.f21052d
                r4 = 0
                r5.f21049a = r4
                r5.f21050b = r2
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
            throw new UnsupportedOperationException("Method not decompiled: Nl.a.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource", f = "GreenvilleDataSource.kt", l = {94}, m = "updateItem")
    static final class k extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f21053a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f21054b;

        /* renamed from: d, reason: collision with root package name */
        int f21056d;

        k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f21054b = obj;
            this.f21056d |= Integer.MIN_VALUE;
            return a.this.h(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/greenville/model/response/TransactionResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/greenville/model/response/TransactionResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.greenville.datasource.GreenvilleDataSource$updateItem$2", f = "GreenvilleDataSource.kt", l = {96, 95}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class l extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super TransactionResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f21057a;

        /* renamed from: b, reason: collision with root package name */
        int f21058b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ UpdateItemRequest f21060d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(UpdateItemRequest updateItemRequest, Continuation<? super l> continuation) {
            super(2, continuation);
            this.f21060d = updateItemRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return a.this.new l(this.f21060d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super TransactionResponse> continuation) {
            return ((l) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                int r1 = r5.f21058b
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
                java.lang.Object r1 = r5.f21057a
                Ml.a r1 = (Ml.a) r1
                kotlin.ResultKt.b(r6)
                goto L3c
            L22:
                kotlin.ResultKt.b(r6)
                Nl.a r6 = Nl.a.this
                Ml.a r1 = Nl.a.b(r6)
                Nl.a r6 = Nl.a.this
                Yi.a r6 = Nl.a.a(r6)
                r5.f21057a = r1
                r5.f21058b = r3
                java.lang.Object r6 = r6.c(r5)
                if (r6 != r0) goto L3c
                goto L4b
            L3c:
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest r3 = r5.f21060d
                r4 = 0
                r5.f21057a = r4
                r5.f21058b = r2
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
            throw new UnsupportedOperationException("Method not decompiled: Nl.a.l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(Ml.a greenvilleAPI, Yi.a authTokenProvider, AbstractC15779K ioDispatcher) {
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
            boolean r0 = r7 instanceof Nl.a.C0369a
            if (r0 == 0) goto L13
            r0 = r7
            Nl.a$a r0 = (Nl.a.C0369a) r0
            int r1 = r0.f21016d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21016d = r1
            goto L18
        L13:
            Nl.a$a r0 = new Nl.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21014b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f21016d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f21013a
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
            mv.K r7 = r5.ioDispatcher
            Nl.a$b r2 = new Nl.a$b
            r4 = 0
            r2.<init>(r6, r4)
            r0.f21013a = r6
            r0.f21016d = r3
            java.lang.Object r7 = mv.C15805i.g(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r6 = r7
            com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
            qw.a$a r0 = qw.a.INSTANCE
            java.lang.String r1 = "GreenvilleService"
            qw.a$b r0 = r0.z(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: Nl.a.c(com.meijer.mobile.greenville.model.request.item.add.AddItemRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest r6, kotlin.coroutines.Continuation<? super com.meijer.mobile.greenville.model.response.TransactionResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Nl.a.c
            if (r0 == 0) goto L13
            r0 = r7
            Nl.a$c r0 = (Nl.a.c) r0
            int r1 = r0.f21024d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21024d = r1
            goto L18
        L13:
            Nl.a$c r0 = new Nl.a$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21022b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f21024d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f21021a
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
            mv.K r7 = r5.ioDispatcher
            Nl.a$d r2 = new Nl.a$d
            r4 = 0
            r2.<init>(r6, r4)
            r0.f21021a = r6
            r0.f21024d = r3
            java.lang.Object r7 = mv.C15805i.g(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r6 = r7
            com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
            qw.a$a r0 = qw.a.INSTANCE
            java.lang.String r1 = "GreenvilleService"
            qw.a$b r0 = r0.z(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: Nl.a.d(com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest r6, kotlin.coroutines.Continuation<? super com.meijer.mobile.greenville.model.response.TransactionResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Nl.a.e
            if (r0 == 0) goto L13
            r0 = r7
            Nl.a$e r0 = (Nl.a.e) r0
            int r1 = r0.f21032d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21032d = r1
            goto L18
        L13:
            Nl.a$e r0 = new Nl.a$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21030b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f21032d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f21029a
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
            mv.K r7 = r5.ioDispatcher
            Nl.a$f r2 = new Nl.a$f
            r4 = 0
            r2.<init>(r6, r4)
            r0.f21029a = r6
            r0.f21032d = r3
            java.lang.Object r7 = mv.C15805i.g(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r6 = r7
            com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
            qw.a$a r0 = qw.a.INSTANCE
            java.lang.String r1 = "GreenvilleService"
            qw.a$b r0 = r0.z(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: Nl.a.e(com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest r6, kotlin.coroutines.Continuation<? super com.meijer.mobile.greenville.model.response.TransactionResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Nl.a.g
            if (r0 == 0) goto L13
            r0 = r7
            Nl.a$g r0 = (Nl.a.g) r0
            int r1 = r0.f21040d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21040d = r1
            goto L18
        L13:
            Nl.a$g r0 = new Nl.a$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21038b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f21040d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f21037a
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
            mv.K r7 = r5.ioDispatcher
            Nl.a$h r2 = new Nl.a$h
            r4 = 0
            r2.<init>(r6, r4)
            r0.f21037a = r6
            r0.f21040d = r3
            java.lang.Object r7 = mv.C15805i.g(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r6 = r7
            com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
            qw.a$a r0 = qw.a.INSTANCE
            java.lang.String r1 = "GreenvilleService"
            qw.a$b r0 = r0.z(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: Nl.a.f(com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest r6, kotlin.coroutines.Continuation<? super com.meijer.mobile.greenville.model.response.TransactionResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Nl.a.i
            if (r0 == 0) goto L13
            r0 = r7
            Nl.a$i r0 = (Nl.a.i) r0
            int r1 = r0.f21048d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21048d = r1
            goto L18
        L13:
            Nl.a$i r0 = new Nl.a$i
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21046b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f21048d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f21045a
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
            mv.K r7 = r5.ioDispatcher
            Nl.a$j r2 = new Nl.a$j
            r4 = 0
            r2.<init>(r6, r4)
            r0.f21045a = r6
            r0.f21048d = r3
            java.lang.Object r7 = mv.C15805i.g(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r6 = r7
            com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
            qw.a$a r0 = qw.a.INSTANCE
            java.lang.String r1 = "GreenvilleService"
            qw.a$b r0 = r0.z(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: Nl.a.g(com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest r6, kotlin.coroutines.Continuation<? super com.meijer.mobile.greenville.model.response.TransactionResponse> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Nl.a.k
            if (r0 == 0) goto L13
            r0 = r7
            Nl.a$k r0 = (Nl.a.k) r0
            int r1 = r0.f21056d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21056d = r1
            goto L18
        L13:
            Nl.a$k r0 = new Nl.a$k
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f21054b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f21056d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r6 = r0.f21053a
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
            mv.K r7 = r5.ioDispatcher
            Nl.a$l r2 = new Nl.a$l
            r4 = 0
            r2.<init>(r6, r4)
            r0.f21053a = r6
            r0.f21056d = r3
            java.lang.Object r7 = mv.C15805i.g(r7, r2, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            r6 = r7
            com.meijer.mobile.greenville.model.response.TransactionResponse r6 = (com.meijer.mobile.greenville.model.response.TransactionResponse) r6
            qw.a$a r0 = qw.a.INSTANCE
            java.lang.String r1 = "GreenvilleService"
            qw.a$b r0 = r0.z(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: Nl.a.h(com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
