package com.radiusnetworks.flybuy.sdk.data.common;

import android.content.Context;
import com.radiusnetworks.flybuy.api.FlyBuyApi;
import com.radiusnetworks.flybuy.api.network.common.ApiEmptyResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiErrorResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse;
import com.radiusnetworks.flybuy.sdk.data.error.ApiError;
import com.radiusnetworks.flybuy.sdk.data.error.CommonError;
import com.radiusnetworks.flybuy.sdk.data.error.CommonErrorType;
import com.radiusnetworks.flybuy.sdk.jobs.ResponseEventType;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.util.ContextExtensionsKt;
import com.radiusnetworks.flybuy.sdk.util.NetworkUtilsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.C16623P;
import qv.C16639f0;
import qv.C16644i;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001au\u0010\u0000\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0001\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00030\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u000b0\tH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a|\u0010\r\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0005\"\u0004\b\u0001\u0010\u0003*\u00020\u000e2\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0005\u0012\u0004\u0012\u0002H\u00030\t2\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0002\u0012\u0004\u0012\u00020\u000b0\t2 \b\u0002\u0010\u000f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u0001H\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010H\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"invokeApi", "Lkotlin/Pair;", "Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "R", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "T", "apiCall", "Lkotlin/Function0;", "dataConverter", "Lkotlin/Function1;", "onSuccess", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeApi", "Landroid/content/Context;", "callback", "Lkotlin/Function2;", "core_defaultRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ApiExtensionsKt {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.common.ApiExtensionsKt$executeApi$1", f = "ApiExtensions.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.common.ApiExtensionsKt$executeApi$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function0<ApiResponse<T>> $apiCall;
        final /* synthetic */ Function2<R, SdkError, Unit> $callback;
        final /* synthetic */ Function1<T, R> $dataConverter;
        final /* synthetic */ Function1<ApiResponse<R>, Unit> $onSuccess;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.common.ApiExtensionsKt$executeApi$1$1", f = "ApiExtensions.kt", l = {48}, m = "invokeSuspend")
        /* renamed from: com.radiusnetworks.flybuy.sdk.data.common.ApiExtensionsKt$executeApi$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C19741 extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function0<ApiResponse<T>> $apiCall;
            final /* synthetic */ Function2<R, SdkError, Unit> $callback;
            final /* synthetic */ Function1<T, R> $dataConverter;
            final /* synthetic */ Function1<ApiResponse<R>, Unit> $onSuccess;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C19741(Function0<? extends ApiResponse<T>> function0, Function1<? super T, ? extends R> function1, Function1<? super ApiResponse<R>, Unit> function12, Function2<? super R, ? super SdkError, Unit> function2, Continuation<? super C19741> continuation) {
                super(2, continuation);
                this.$apiCall = function0;
                this.$dataConverter = function1;
                this.$onSuccess = function12;
                this.$callback = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C19741(this.$apiCall, this.$dataConverter, this.$onSuccess, this.$callback, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C19741) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object body;
                Object objF = IntrinsicsKt.f();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    Function0<ApiResponse<T>> function0 = this.$apiCall;
                    Function1<T, R> function1 = this.$dataConverter;
                    Function1<ApiResponse<R>, Unit> function12 = this.$onSuccess;
                    this.label = 1;
                    obj = ApiExtensionsKt.invokeApi(function0, function1, function12, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                Pair pair = (Pair) obj;
                ApiResponse apiResponse = (ApiResponse) pair.c();
                if (apiResponse != null && (apiResponse instanceof ApiSuccessResponse)) {
                    body = ((ApiSuccessResponse) apiResponse).getBody();
                } else {
                    body = null;
                }
                Function2<R, SdkError, Unit> function2 = this.$callback;
                if (function2 != 0) {
                    function2.invoke(body, pair.d());
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function0<? extends ApiResponse<T>> function0, Function1<? super T, ? extends R> function1, Function1<? super ApiResponse<R>, Unit> function12, Function2<? super R, ? super SdkError, Unit> function2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$apiCall = function0;
            this.$dataConverter = function1;
            this.$onSuccess = function12;
            this.$callback = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$apiCall, this.$dataConverter, this.$onSuccess, this.$callback, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                CoroutineContext coroutineContext = ((InterfaceC16622O) this.L$0).getCoroutineContext();
                C19741 c19741 = new C19741(this.$apiCall, this.$dataConverter, this.$onSuccess, this.$callback, null);
                this.label = 1;
                if (C16644i.g(coroutineContext, c19741, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0018\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lqv/O;", "Lkotlin/Pair;", "Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "<anonymous>", "(Lqv/O;)Lkotlin/Pair;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.common.ApiExtensionsKt$invokeApi$2", f = "ApiExtensions.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.common.ApiExtensionsKt$invokeApi$2, reason: invalid class name */
    public static final class AnonymousClass2<R> extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Pair<? extends ApiResponse<R>, ? extends SdkError>>, Object> {
        final /* synthetic */ Function0<ApiResponse<T>> $apiCall;
        final /* synthetic */ Function1<T, R> $dataConverter;
        final /* synthetic */ Function1<ApiResponse<R>, Unit> $onSuccess;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function0<? extends ApiResponse<T>> function0, Function1<? super T, ? extends R> function1, Function1<? super ApiResponse<R>, Unit> function12, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$apiCall = function0;
            this.$dataConverter = function1;
            this.$onSuccess = function12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$apiCall, this.$dataConverter, this.$onSuccess, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Pair<? extends ApiResponse<R>, ? extends SdkError>> continuation) {
            return ((AnonymousClass2) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.label == 0) {
                ResultKt.b(obj);
                InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.L$0;
                try {
                    ApiResponse apiResponse = (ApiResponse) this.$apiCall.invoke();
                    if (apiResponse instanceof ApiSuccessResponse) {
                        ApiSuccessResponse apiSuccessResponse = new ApiSuccessResponse(apiResponse.getCode(), this.$dataConverter.invoke(((ApiSuccessResponse) apiResponse).getBody()), ((ApiSuccessResponse) apiResponse).getLinks());
                        this.$onSuccess.invoke(apiSuccessResponse);
                        return new Pair(apiSuccessResponse, null);
                    }
                    if (apiResponse instanceof ApiEmptyResponse) {
                        ApiEmptyResponse apiEmptyResponse = new ApiEmptyResponse(apiResponse.getCode());
                        this.$onSuccess.invoke(apiEmptyResponse);
                        return new Pair(apiEmptyResponse, null);
                    }
                    if (apiResponse instanceof ApiErrorResponse) {
                        return new Pair(null, new ApiError(apiResponse.getCode(), ((ApiErrorResponse) apiResponse).getErrorMessages()));
                    }
                    return new Pair(null, new CommonError(CommonErrorType.UNKNOWN_ERROR, null, 2, null));
                } catch (Exception e10) {
                    LogExtensionsKt.loge$default(interfaceC16622O, true, e10, null, new Object[0], 4, null);
                    return new Pair(null, CommonError.INSTANCE.exceptionWith(e10.getLocalizedMessage()));
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final <T, R> void executeApi(Context context, Function0<? extends ApiResponse<T>> apiCall, Function1<? super T, ? extends R> dataConverter, Function1<? super ApiResponse<R>, Unit> onSuccess, Function2<? super R, ? super SdkError, Unit> function2) {
        Intrinsics.j(context, "<this>");
        Intrinsics.j(apiCall, "apiCall");
        Intrinsics.j(dataConverter, "dataConverter");
        Intrinsics.j(onSuccess, "onSuccess");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        if (NetworkUtilsKt.isNetworkConnected(applicationContext)) {
            FlyBuyApi.INSTANCE.setSdkPermissions(ContextExtensionsKt.appPermissions(context));
            C16648k.d(C16623P.a(C16639f0.a()), null, null, new AnonymousClass1(apiCall, dataConverter, onSuccess, function2, null), 3, null);
        } else if (function2 != null) {
            function2.invoke(null, new CommonError(CommonErrorType.NO_CONNECTION, ResponseEventType.NO_CONNECTION));
        }
    }

    public static /* synthetic */ void executeApi$default(Context context, Function0 function0, Function1 function1, Function1 function12, Function2 function2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            function2 = null;
        }
        executeApi(context, function0, function1, function12, function2);
    }

    public static final <T, R> Object invokeApi(Function0<? extends ApiResponse<T>> function0, Function1<? super T, ? extends R> function1, Function1<? super ApiResponse<R>, Unit> function12, Continuation<? super Pair<? extends ApiResponse<R>, ? extends SdkError>> continuation) {
        return C16644i.g(C16639f0.b(), new AnonymousClass2(function0, function1, function12, null), continuation);
    }
}
