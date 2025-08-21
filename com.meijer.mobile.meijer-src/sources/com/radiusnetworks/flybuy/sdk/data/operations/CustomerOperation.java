package com.radiusnetworks.flybuy.sdk.data.operations;

import androidx.view.AbstractC6127A;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomerConsent;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomerInfo;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomersRepository;
import com.radiusnetworks.flybuy.sdk.data.customer.LoginInfo;
import com.radiusnetworks.flybuy.sdk.data.customer.NewPasswordInfo;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Customer;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import mv.C0;
import mv.C15784P;
import mv.C15800f0;
import mv.C15807j;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u001e\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2\u001e\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u001e\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u001e\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u0018J5\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u001e\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u001c\u0010\u001dJ5\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u001e\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010!\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010 ¢\u0006\u0004\b!\u0010\"J5\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u001a2\u001e\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b$\u0010\u001dJ5\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%2\u001e\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u001d\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060+0*8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/operations/CustomerOperation;", "", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomersRepository;", "customersRepository", "<init>", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomersRepository;)V", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Customer;", "currentUser", "()Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Customer;", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "customerInfo", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerConsent;", "customerConsent", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "", "callback", "create", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerConsent;Lkotlin/jvm/functions/Function2;)V", "Lcom/radiusnetworks/flybuy/sdk/data/customer/LoginInfo;", "loginInfo", "signUp", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;Lcom/radiusnetworks/flybuy/sdk/data/customer/LoginInfo;Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerConsent;Lkotlin/jvm/functions/Function2;)V", "upgrade", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/LoginInfo;Lkotlin/jvm/functions/Function2;)V", "login", "", "token", "loginWithToken", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "update", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "logout", "(Lkotlin/jvm/functions/Function1;)V", "email", "requestNewPassword", "Lcom/radiusnetworks/flybuy/sdk/data/customer/NewPasswordInfo;", "newPasswordInfo", "setNewPassword", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/NewPasswordInfo;Lkotlin/jvm/functions/Function2;)V", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomersRepository;", "Landroidx/lifecycle/A;", "", "getCustomers", "()Landroidx/lifecycle/A;", "customers", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CustomerOperation {
    private final CustomersRepository customersRepository;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.operations.CustomerOperation$currentUser$1", f = "CustomerOperation.kt", l = {35}, m = "invokeSuspend")
    /* renamed from: com.radiusnetworks.flybuy.sdk.data.operations.CustomerOperation$currentUser$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<Customer> $user;
        int label;
        final /* synthetic */ CustomerOperation this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.radiusnetworks.flybuy.sdk.data.operations.CustomerOperation$currentUser$1$1", f = "CustomerOperation.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.radiusnetworks.flybuy.sdk.data.operations.CustomerOperation$currentUser$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C19871 extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.ObjectRef<Customer> $user;
            int label;
            final /* synthetic */ CustomerOperation this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19871(Ref.ObjectRef<Customer> objectRef, CustomerOperation customerOperation, Continuation<? super C19871> continuation) {
                super(2, continuation);
                this.$user = objectRef;
                this.this$0 = customerOperation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C19871(this.$user, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C19871) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                T t10;
                IntrinsicsKt.f();
                if (this.label == 0) {
                    ResultKt.b(obj);
                    Ref.ObjectRef<Customer> objectRef = this.$user;
                    try {
                        t10 = (Customer) CollectionsKt.s0(this.this$0.customersRepository.currentUser());
                    } catch (Exception unused) {
                        t10 = 0;
                    }
                    objectRef.f143742a = t10;
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<Customer> objectRef, CustomerOperation customerOperation, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$user = objectRef;
            this.this$0 = customerOperation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$user, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
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
                C0 c0D = C15809k.d(C15784P.a(C15800f0.b()), null, null, new C19871(this.$user, this.this$0, null), 3, null);
                this.label = 1;
                if (c0D.o0(this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public CustomerOperation(CustomersRepository customersRepository) {
        Intrinsics.j(customersRepository, "customersRepository");
        this.customersRepository = customersRepository;
    }

    public final void create(CustomerInfo customerInfo, CustomerConsent customerConsent, Function2<? super Customer, ? super SdkError, Unit> callback) {
        Intrinsics.j(customerInfo, "customerInfo");
        Intrinsics.j(customerConsent, "customerConsent");
        this.customersRepository.create(customerInfo, customerConsent, callback);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Customer currentUser() throws InterruptedException {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        C15807j.b(null, new AnonymousClass1(objectRef, this, null), 1, null);
        return (Customer) objectRef.f143742a;
    }

    public final AbstractC6127A<List<Customer>> getCustomers() {
        return this.customersRepository.getCustomers();
    }

    public final void login(LoginInfo loginInfo, Function2<? super Customer, ? super SdkError, Unit> callback) {
        Intrinsics.j(loginInfo, "loginInfo");
        this.customersRepository.login(loginInfo, callback);
    }

    public final void loginWithToken(String token, Function2<? super Customer, ? super SdkError, Unit> callback) {
        Intrinsics.j(token, "token");
        this.customersRepository.loginWithToken(token, callback);
    }

    public final void logout(Function1<? super SdkError, Unit> callback) {
        this.customersRepository.logout(callback);
    }

    public final void requestNewPassword(String email, Function2<? super Unit, ? super SdkError, Unit> callback) {
        Intrinsics.j(email, "email");
        this.customersRepository.requestNewPassword(email, callback);
    }

    public final void setNewPassword(NewPasswordInfo newPasswordInfo, Function2<? super Customer, ? super SdkError, Unit> callback) {
        Intrinsics.j(newPasswordInfo, "newPasswordInfo");
        this.customersRepository.setNewPassword(newPasswordInfo, callback);
    }

    public final void signUp(CustomerInfo customerInfo, LoginInfo loginInfo, CustomerConsent customerConsent, Function2<? super Customer, ? super SdkError, Unit> callback) {
        Intrinsics.j(customerInfo, "customerInfo");
        Intrinsics.j(loginInfo, "loginInfo");
        Intrinsics.j(customerConsent, "customerConsent");
        this.customersRepository.signUp(customerInfo, loginInfo, customerConsent, callback);
    }

    public final void update(CustomerInfo customerInfo, Function2<? super Customer, ? super SdkError, Unit> callback) {
        Intrinsics.j(customerInfo, "customerInfo");
        this.customersRepository.updateCustomer(customerInfo, callback);
    }

    public final void upgrade(LoginInfo loginInfo, Function2<? super Customer, ? super SdkError, Unit> callback) {
        Intrinsics.j(loginInfo, "loginInfo");
        this.customersRepository.upgrade(loginInfo, callback);
    }
}
