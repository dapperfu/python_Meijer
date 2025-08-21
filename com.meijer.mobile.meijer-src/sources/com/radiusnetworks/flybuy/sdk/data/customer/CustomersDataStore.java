package com.radiusnetworks.flybuy.sdk.data.customer;

import android.content.Context;
import androidx.view.AbstractC6127A;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.radiusnetworks.flybuy.api.FlyBuyApi;
import com.radiusnetworks.flybuy.api.model.CustomerResponse;
import com.radiusnetworks.flybuy.api.model.RequestNewPasswordRequestData;
import com.radiusnetworks.flybuy.api.network.common.ApiResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiSuccessResponse;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.common.ApiExtensionsKt;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.error.CustomerError;
import com.radiusnetworks.flybuy.sdk.data.error.CustomerErrorType;
import com.radiusnetworks.flybuy.sdk.data.room.dao.CustomerDao;
import com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Customer;
import java.util.List;
import kotlin.Metadata;
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
import mv.C15784P;
import mv.C15800f0;
import mv.C15805i;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00120\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u001e\u0010\u001c\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010!\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\u001e\u0010\u001c\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001bH\u0016¢\u0006\u0004\b!\u0010\"J7\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u001e\u0010\u001c\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001bH\u0016¢\u0006\u0004\b#\u0010$J7\u0010%\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u001e\u0010\u001c\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001bH\u0016¢\u0006\u0004\b%\u0010$J7\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&2\u001e\u0010\u001c\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001bH\u0016¢\u0006\u0004\b(\u0010)J'\u0010+\u001a\u00020\u000b2\u0016\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,J7\u0010-\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u001e\u0010\u001c\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001bH\u0016¢\u0006\u0004\b-\u0010.J7\u00100\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020&2\u001e\u0010\u001c\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001bH\u0016¢\u0006\u0004\b0\u0010)J7\u00103\u001a\u00020\u000b2\u0006\u00102\u001a\u0002012\u001e\u0010\u001c\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001bH\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106¨\u00067"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomersDataStore;", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomersRepository;", "Lcom/radiusnetworks/flybuy/sdk/data/room/dao/CustomerDao;", "customerDao", "Landroid/content/Context;", "applicationContext", "<init>", "(Lcom/radiusnetworks/flybuy/sdk/data/room/dao/CustomerDao;Landroid/content/Context;)V", "Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Customer;", "response", "", "handleLoginResponse", "(Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;)V", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "invokeLogout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/A;", "", "getCustomers", "()Landroidx/lifecycle/A;", "currentUser", "()Ljava/util/List;", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "customerInfo", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerConsent;", "customerConsent", "Lkotlin/Function2;", "callback", "create", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerConsent;Lkotlin/jvm/functions/Function2;)V", "Lcom/radiusnetworks/flybuy/sdk/data/customer/LoginInfo;", "loginInfo", "signUp", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;Lcom/radiusnetworks/flybuy/sdk/data/customer/LoginInfo;Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerConsent;Lkotlin/jvm/functions/Function2;)V", "upgrade", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/LoginInfo;Lkotlin/jvm/functions/Function2;)V", "login", "", "token", "loginWithToken", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "logout", "(Lkotlin/jvm/functions/Function1;)V", "updateCustomer", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;Lkotlin/jvm/functions/Function2;)V", "email", "requestNewPassword", "Lcom/radiusnetworks/flybuy/sdk/data/customer/NewPasswordInfo;", "newPasswordInfo", "setNewPassword", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/NewPasswordInfo;Lkotlin/jvm/functions/Function2;)V", "Lcom/radiusnetworks/flybuy/sdk/data/room/dao/CustomerDao;", "Landroid/content/Context;", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CustomersDataStore implements CustomersRepository {
    private final Context applicationContext;
    private final CustomerDao customerDao;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/radiusnetworks/flybuy/sdk/data/error/CustomerError;", "<anonymous>", "(Lmv/O;)Lcom/radiusnetworks/flybuy/sdk/data/error/CustomerError;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore$invokeLogout$2", f = "CustomersDataStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore$invokeLogout$2, reason: invalid class name and case insensitive filesystem */
    public static final class C131222 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super CustomerError>, Object> {
        int label;

        public C131222(Continuation<? super C131222> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CustomersDataStore.this.new C131222(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super CustomerError> continuation) {
            return ((C131222) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.label == 0) {
                ResultKt.b(obj);
                try {
                    AppDatabase companion = AppDatabase.INSTANCE.getInstance(CustomersDataStore.this.applicationContext);
                    companion.customerDao$core_defaultRelease().deleteAll();
                    companion.orderDao$core_defaultRelease().deleteAll();
                    FlyBuyApi.INSTANCE.setCustomerApiToken("");
                    FlyBuyCore.INSTANCE.getCrashManager().setUser(null);
                    return null;
                } catch (Exception unused) {
                    return new CustomerError(CustomerErrorType.FAILED_TO_SIGN_OUT);
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore$logout$1", f = "CustomersDataStore.kt", l = {154}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore$logout$1, reason: invalid class name and case insensitive filesystem */
    public static final class C131271 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<SdkError, Unit> $callback;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore$logout$1$1", f = "CustomersDataStore.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
        /* renamed from: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore$logout$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C19841 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<SdkError, Unit> $callback;
            int label;
            final /* synthetic */ CustomersDataStore this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C19841(CustomersDataStore customersDataStore, Function1<? super SdkError, Unit> function1, Continuation<? super C19841> continuation) {
                super(2, continuation);
                this.this$0 = customersDataStore;
                this.$callback = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C19841(this.this$0, this.$callback, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C19841) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                    CustomersDataStore customersDataStore = this.this$0;
                    this.label = 1;
                    obj = customersDataStore.invokeLogout(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                SdkError sdkError = (SdkError) obj;
                Function1<SdkError, Unit> function1 = this.$callback;
                if (function1 != null) {
                    function1.invoke(sdkError);
                }
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C131271(Function1<? super SdkError, Unit> function1, Continuation<? super C131271> continuation) {
            super(2, continuation);
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C131271 c131271 = CustomersDataStore.this.new C131271(this.$callback, continuation);
            c131271.L$0 = obj;
            return c131271;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((C131271) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                CoroutineContext coroutineContext = ((InterfaceC15783O) this.L$0).getCoroutineContext();
                C19841 c19841 = new C19841(CustomersDataStore.this, this.$callback, null);
                this.label = 1;
                if (C15805i.g(coroutineContext, c19841, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public CustomersDataStore(CustomerDao customerDao, Context applicationContext) {
        Intrinsics.j(customerDao, "customerDao");
        Intrinsics.j(applicationContext, "applicationContext");
        this.customerDao = customerDao;
        this.applicationContext = applicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleLoginResponse(ApiResponse<Customer> response) throws Exception {
        if (response instanceof ApiSuccessResponse) {
            ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) response;
            FlyBuyCore.INSTANCE.getCrashManager().setUser(String.valueOf(((Customer) apiSuccessResponse.getBody()).getId()));
            AppDatabase companion = AppDatabase.INSTANCE.getInstance(this.applicationContext);
            companion.customerDao$core_defaultRelease().deleteAll();
            companion.customerDao$core_defaultRelease().insert((Customer) apiSuccessResponse.getBody());
            FlyBuyApi.INSTANCE.setCustomerApiToken(((Customer) apiSuccessResponse.getBody()).getApiToken());
            FlyBuyCore.getOrders().fetch(null);
        }
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.customer.CustomersRepository
    public void create(final CustomerInfo customerInfo, final CustomerConsent customerConsent, Function2<? super Customer, ? super SdkError, Unit> callback) {
        Intrinsics.j(customerInfo, "customerInfo");
        Intrinsics.j(customerConsent, "customerConsent");
        ApiExtensionsKt.executeApi(this.applicationContext, new Function0<ApiResponse<CustomerResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.create.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiResponse<CustomerResponse> invoke() {
                return FlyBuyApi.createCustomer(CustomerInfoKt.toApiCreateCustomer(customerInfo, customerConsent));
            }
        }, new Function1<CustomerResponse, Customer>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.create.2
            @Override // kotlin.jvm.functions.Function1
            public final Customer invoke(CustomerResponse it) {
                Intrinsics.j(it, "it");
                com.radiusnetworks.flybuy.api.model.Customer data = it.getData();
                Intrinsics.g(data);
                return new Customer(data);
            }
        }, new Function1<ApiResponse<Customer>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.create.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<Customer> apiResponse) {
                invoke2(apiResponse);
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiResponse<Customer> it) {
                Intrinsics.j(it, "it");
                if (it instanceof ApiSuccessResponse) {
                    AppDatabase companion = AppDatabase.INSTANCE.getInstance(CustomersDataStore.this.applicationContext);
                    companion.customerDao$core_defaultRelease().deleteAll();
                    ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) it;
                    companion.customerDao$core_defaultRelease().insert((Customer) apiSuccessResponse.getBody());
                    FlyBuyApi.INSTANCE.setCustomerApiToken(((Customer) apiSuccessResponse.getBody()).getApiToken());
                }
            }
        }, callback);
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.customer.CustomersRepository
    public List<Customer> currentUser() {
        return this.customerDao.currentUser();
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.customer.CustomersRepository
    public AbstractC6127A<List<Customer>> getCustomers() {
        return this.customerDao.getAll();
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.customer.CustomersRepository
    public void login(final LoginInfo loginInfo, Function2<? super Customer, ? super SdkError, Unit> callback) {
        Intrinsics.j(loginInfo, "loginInfo");
        ApiExtensionsKt.executeApi(this.applicationContext, new Function0<ApiResponse<CustomerResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.login.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiResponse<CustomerResponse> invoke() {
                return FlyBuyApi.login(LoginInfoKt.toApiLogin(loginInfo));
            }
        }, new Function1<CustomerResponse, Customer>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.login.2
            @Override // kotlin.jvm.functions.Function1
            public final Customer invoke(CustomerResponse it) {
                Intrinsics.j(it, "it");
                com.radiusnetworks.flybuy.api.model.Customer data = it.getData();
                Intrinsics.g(data);
                return new Customer(data);
            }
        }, new Function1<ApiResponse<Customer>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.login.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<Customer> apiResponse) throws Exception {
                invoke2(apiResponse);
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiResponse<Customer> it) throws Exception {
                Intrinsics.j(it, "it");
                CustomersDataStore.this.handleLoginResponse(it);
            }
        }, callback);
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.customer.CustomersRepository
    public void loginWithToken(final String token, final Function2<? super Customer, ? super SdkError, Unit> callback) {
        Intrinsics.j(token, "token");
        logout(new Function1<SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.loginWithToken.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SdkError sdkError) {
                invoke2(sdkError);
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SdkError sdkError) {
                Function2<Customer, SdkError, Unit> function2;
                Unit unit = null;
                if (sdkError != null && (function2 = callback) != null) {
                    function2.invoke(null, sdkError);
                    unit = Unit.f143329a;
                }
                if (unit == null) {
                    final CustomersDataStore customersDataStore = CustomersDataStore.this;
                    String str = token;
                    Function2<Customer, SdkError, Unit> function22 = callback;
                    FlyBuyApi.INSTANCE.setCustomerApiToken(str);
                    ApiExtensionsKt.executeApi(customersDataStore.applicationContext, new Function0<ApiResponse<CustomerResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore$loginWithToken$1$2$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final ApiResponse<CustomerResponse> invoke() {
                            return FlyBuyApi.getCustomer();
                        }
                    }, new Function1<CustomerResponse, Customer>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore$loginWithToken$1$2$2
                        @Override // kotlin.jvm.functions.Function1
                        public final Customer invoke(CustomerResponse it) {
                            Intrinsics.j(it, "it");
                            com.radiusnetworks.flybuy.api.model.Customer data = it.getData();
                            Intrinsics.g(data);
                            return new Customer(data);
                        }
                    }, new Function1<ApiResponse<Customer>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore$loginWithToken$1$2$3
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<Customer> apiResponse) throws Exception {
                            invoke2(apiResponse);
                            return Unit.f143329a;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(ApiResponse<Customer> it) throws Exception {
                            Intrinsics.j(it, "it");
                            customersDataStore.handleLoginResponse(it);
                        }
                    }, function22);
                }
            }
        });
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.customer.CustomersRepository
    public void requestNewPassword(final String email, Function2<? super Unit, ? super SdkError, Unit> callback) {
        Intrinsics.j(email, "email");
        ApiExtensionsKt.executeApi(this.applicationContext, new Function0<ApiResponse<Void>>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.requestNewPassword.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiResponse<Void> invoke() {
                return FlyBuyApi.requestNewPassword(new RequestNewPasswordRequestData(email));
            }
        }, new Function1<Void, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.requestNewPassword.2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Void it) {
                Intrinsics.j(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Void r12) {
                invoke2(r12);
                return Unit.f143329a;
            }
        }, new Function1<ApiResponse<Unit>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.requestNewPassword.3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiResponse<Unit> it) {
                Intrinsics.j(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<Unit> apiResponse) {
                invoke2(apiResponse);
                return Unit.f143329a;
            }
        }, callback);
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.customer.CustomersRepository
    public void setNewPassword(final NewPasswordInfo newPasswordInfo, Function2<? super Customer, ? super SdkError, Unit> callback) {
        Intrinsics.j(newPasswordInfo, "newPasswordInfo");
        ApiExtensionsKt.executeApi(this.applicationContext, new Function0<ApiResponse<CustomerResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.setNewPassword.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiResponse<CustomerResponse> invoke() {
                return FlyBuyApi.setNewPassword(NewPasswordInfoKt.toApiNewPassword(newPasswordInfo));
            }
        }, new Function1<CustomerResponse, Customer>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.setNewPassword.2
            @Override // kotlin.jvm.functions.Function1
            public final Customer invoke(CustomerResponse it) {
                Intrinsics.j(it, "it");
                com.radiusnetworks.flybuy.api.model.Customer data = it.getData();
                Intrinsics.g(data);
                return new Customer(data);
            }
        }, new Function1<ApiResponse<Customer>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.setNewPassword.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<Customer> apiResponse) throws Exception {
                invoke2(apiResponse);
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiResponse<Customer> it) throws Exception {
                Intrinsics.j(it, "it");
                CustomersDataStore.this.handleLoginResponse(it);
            }
        }, callback);
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.customer.CustomersRepository
    public void signUp(CustomerInfo customerInfo, final LoginInfo loginInfo, CustomerConsent customerConsent, final Function2<? super Customer, ? super SdkError, Unit> callback) {
        Intrinsics.j(customerInfo, "customerInfo");
        Intrinsics.j(loginInfo, "loginInfo");
        Intrinsics.j(customerConsent, "customerConsent");
        create(customerInfo, customerConsent, new Function2<Customer, SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.signUp.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Customer customer, SdkError sdkError) {
                invoke2(customer, sdkError);
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Customer customer, SdkError sdkError) {
                if (sdkError != null) {
                    Function2<Customer, SdkError, Unit> function2 = callback;
                    if (function2 != null) {
                        function2.invoke(customer, sdkError);
                        return;
                    }
                    return;
                }
                Context context = CustomersDataStore.this.applicationContext;
                final LoginInfo loginInfo2 = loginInfo;
                Function0<ApiResponse<CustomerResponse>> function0 = new Function0<ApiResponse<CustomerResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.signUp.1.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final ApiResponse<CustomerResponse> invoke() {
                        return FlyBuyApi.signUpCustomer(LoginInfoKt.toApiSignUp(loginInfo2));
                    }
                };
                AnonymousClass2 anonymousClass2 = new Function1<CustomerResponse, Customer>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.signUp.1.2
                    @Override // kotlin.jvm.functions.Function1
                    public final Customer invoke(CustomerResponse it) {
                        Intrinsics.j(it, "it");
                        com.radiusnetworks.flybuy.api.model.Customer data = it.getData();
                        Intrinsics.g(data);
                        return new Customer(data);
                    }
                };
                final CustomersDataStore customersDataStore = CustomersDataStore.this;
                Function1<ApiResponse<Customer>, Unit> function1 = new Function1<ApiResponse<Customer>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.signUp.1.3
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<Customer> apiResponse) {
                        invoke2(apiResponse);
                        return Unit.f143329a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(ApiResponse<Customer> it) {
                        Intrinsics.j(it, "it");
                        if (it instanceof ApiSuccessResponse) {
                            AppDatabase companion = AppDatabase.INSTANCE.getInstance(customersDataStore.applicationContext);
                            companion.customerDao$core_defaultRelease().deleteAll();
                            ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) it;
                            companion.customerDao$core_defaultRelease().insert((Customer) apiSuccessResponse.getBody());
                            FlyBuyApi.INSTANCE.setCustomerApiToken(((Customer) apiSuccessResponse.getBody()).getApiToken());
                        }
                    }
                };
                final Function2<Customer, SdkError, Unit> function22 = callback;
                final CustomersDataStore customersDataStore2 = CustomersDataStore.this;
                ApiExtensionsKt.executeApi(context, function0, anonymousClass2, function1, new Function2<Customer, SdkError, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.signUp.1.4

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
                    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore$signUp$1$4$1", f = "CustomersDataStore.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore$signUp$1$4$1, reason: invalid class name and collision with other inner class name */
                    public static final class C19861 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
                        int label;
                        final /* synthetic */ CustomersDataStore this$0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C19861(CustomersDataStore customersDataStore, Continuation<? super C19861> continuation) {
                            super(2, continuation);
                            this.this$0 = customersDataStore;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C19861(this.this$0, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                            return ((C19861) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.f();
                            if (this.label == 0) {
                                ResultKt.b(obj);
                                AppDatabase.INSTANCE.getInstance(this.this$0.applicationContext).customerDao$core_defaultRelease().deleteAll();
                                FlyBuyApi.INSTANCE.setCustomerApiToken("");
                                return Unit.f143329a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Customer customer2, SdkError sdkError2) {
                        invoke2(customer2, sdkError2);
                        return Unit.f143329a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Customer customer2, SdkError sdkError2) {
                        if (sdkError2 != null) {
                            C15809k.d(C15784P.a(C15800f0.b()), null, null, new C19861(customersDataStore2, null), 3, null);
                        }
                        Function2<Customer, SdkError, Unit> function23 = function22;
                        if (function23 != null) {
                            function23.invoke(customer2, sdkError2);
                        }
                    }
                });
            }
        });
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.customer.CustomersRepository
    public void updateCustomer(final CustomerInfo customerInfo, Function2<? super Customer, ? super SdkError, Unit> callback) {
        Intrinsics.j(customerInfo, "customerInfo");
        ApiExtensionsKt.executeApi(this.applicationContext, new Function0<ApiResponse<CustomerResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.updateCustomer.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiResponse<CustomerResponse> invoke() {
                return FlyBuyApi.updateCustomer(CustomerInfoKt.toApiUpdateCustomer(customerInfo));
            }
        }, new Function1<CustomerResponse, Customer>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.updateCustomer.2
            @Override // kotlin.jvm.functions.Function1
            public final Customer invoke(CustomerResponse it) {
                Intrinsics.j(it, "it");
                com.radiusnetworks.flybuy.api.model.Customer data = it.getData();
                Intrinsics.g(data);
                return new Customer(data);
            }
        }, new Function1<ApiResponse<Customer>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.updateCustomer.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<Customer> apiResponse) {
                invoke2(apiResponse);
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiResponse<Customer> it) {
                Intrinsics.j(it, "it");
                if (it instanceof ApiSuccessResponse) {
                    AppDatabase companion = AppDatabase.INSTANCE.getInstance(CustomersDataStore.this.applicationContext);
                    companion.customerDao$core_defaultRelease().deleteAll();
                    companion.customerDao$core_defaultRelease().insert((Customer) ((ApiSuccessResponse) it).getBody());
                }
            }
        }, callback);
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.customer.CustomersRepository
    public void upgrade(final LoginInfo loginInfo, Function2<? super Customer, ? super SdkError, Unit> callback) {
        Intrinsics.j(loginInfo, "loginInfo");
        ApiExtensionsKt.executeApi(this.applicationContext, new Function0<ApiResponse<CustomerResponse>>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.upgrade.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ApiResponse<CustomerResponse> invoke() {
                return FlyBuyApi.signUpCustomer(LoginInfoKt.toApiSignUp(loginInfo));
            }
        }, new Function1<CustomerResponse, Customer>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.upgrade.2
            @Override // kotlin.jvm.functions.Function1
            public final Customer invoke(CustomerResponse it) {
                Intrinsics.j(it, "it");
                com.radiusnetworks.flybuy.api.model.Customer data = it.getData();
                Intrinsics.g(data);
                return new Customer(data);
            }
        }, new Function1<ApiResponse<Customer>, Unit>() { // from class: com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore.upgrade.3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ApiResponse<Customer> apiResponse) {
                invoke2(apiResponse);
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ApiResponse<Customer> it) {
                Intrinsics.j(it, "it");
                if (it instanceof ApiSuccessResponse) {
                    AppDatabase companion = AppDatabase.INSTANCE.getInstance(CustomersDataStore.this.applicationContext);
                    companion.customerDao$core_defaultRelease().deleteAll();
                    ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) it;
                    companion.customerDao$core_defaultRelease().insert((Customer) apiSuccessResponse.getBody());
                    FlyBuyApi.INSTANCE.setCustomerApiToken(((Customer) apiSuccessResponse.getBody()).getApiToken());
                }
            }
        }, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object invokeLogout(Continuation<? super SdkError> continuation) {
        return C15805i.g(C15800f0.b(), new C131222(null), continuation);
    }

    @Override // com.radiusnetworks.flybuy.sdk.data.customer.CustomersRepository
    public void logout(Function1<? super SdkError, Unit> callback) {
        C15809k.d(C15784P.a(C15800f0.a()), null, null, new C131271(callback, null), 3, null);
    }
}
