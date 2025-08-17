package com.radiusnetworks.flybuy.sdk.data.customer;

import androidx.view.AbstractC5985A;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Customer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&¢\u0006\u0004\b\u0007\u0010\bJA\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH&¢\u0006\u0004\b\u0011\u0010\u0012JI\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\u000b2 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH&¢\u0006\u0004\b\u0015\u0010\u0016J9\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH&¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00132 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH&¢\u0006\u0004\b\u0019\u0010\u0018J9\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH&¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u000f2\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001eH&¢\u0006\u0004\b\u001f\u0010 J9\u0010!\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH&¢\u0006\u0004\b!\u0010\"J9\u0010$\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u001a2 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH&¢\u0006\u0004\b$\u0010\u001dJ9\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%2 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rH&¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomersRepository;", "", "Landroidx/lifecycle/A;", "", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Customer;", "getCustomers", "()Landroidx/lifecycle/A;", "currentUser", "()Ljava/util/List;", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "customerInfo", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerConsent;", "customerConsent", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "", "callback", "create", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerConsent;Lkotlin/jvm/functions/Function2;)V", "Lcom/radiusnetworks/flybuy/sdk/data/customer/LoginInfo;", "loginInfo", "signUp", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;Lcom/radiusnetworks/flybuy/sdk/data/customer/LoginInfo;Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerConsent;Lkotlin/jvm/functions/Function2;)V", "upgrade", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/LoginInfo;Lkotlin/jvm/functions/Function2;)V", "login", "", "token", "loginWithToken", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "logout", "(Lkotlin/jvm/functions/Function1;)V", "updateCustomer", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;Lkotlin/jvm/functions/Function2;)V", "email", "requestNewPassword", "Lcom/radiusnetworks/flybuy/sdk/data/customer/NewPasswordInfo;", "newPasswordInfo", "setNewPassword", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/NewPasswordInfo;Lkotlin/jvm/functions/Function2;)V", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CustomersRepository {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void create$default(CustomersRepository customersRepository, CustomerInfo customerInfo, CustomerConsent customerConsent, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i10 & 4) != 0) {
                function2 = null;
            }
            customersRepository.create(customerInfo, customerConsent, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void login$default(CustomersRepository customersRepository, LoginInfo loginInfo, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
            }
            if ((i10 & 2) != 0) {
                function2 = null;
            }
            customersRepository.login(loginInfo, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void loginWithToken$default(CustomersRepository customersRepository, String str, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loginWithToken");
            }
            if ((i10 & 2) != 0) {
                function2 = null;
            }
            customersRepository.loginWithToken(str, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void logout$default(CustomersRepository customersRepository, Function1 function1, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logout");
            }
            if ((i10 & 1) != 0) {
                function1 = null;
            }
            customersRepository.logout(function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void requestNewPassword$default(CustomersRepository customersRepository, String str, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestNewPassword");
            }
            if ((i10 & 2) != 0) {
                function2 = null;
            }
            customersRepository.requestNewPassword(str, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void setNewPassword$default(CustomersRepository customersRepository, NewPasswordInfo newPasswordInfo, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setNewPassword");
            }
            if ((i10 & 2) != 0) {
                function2 = null;
            }
            customersRepository.setNewPassword(newPasswordInfo, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void signUp$default(CustomersRepository customersRepository, CustomerInfo customerInfo, LoginInfo loginInfo, CustomerConsent customerConsent, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signUp");
            }
            if ((i10 & 8) != 0) {
                function2 = null;
            }
            customersRepository.signUp(customerInfo, loginInfo, customerConsent, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void updateCustomer$default(CustomersRepository customersRepository, CustomerInfo customerInfo, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateCustomer");
            }
            if ((i10 & 2) != 0) {
                function2 = null;
            }
            customersRepository.updateCustomer(customerInfo, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void upgrade$default(CustomersRepository customersRepository, LoginInfo loginInfo, Function2 function2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: upgrade");
            }
            if ((i10 & 2) != 0) {
                function2 = null;
            }
            customersRepository.upgrade(loginInfo, function2);
        }
    }

    void create(CustomerInfo customerInfo, CustomerConsent customerConsent, Function2<? super Customer, ? super SdkError, Unit> callback);

    List<Customer> currentUser();

    AbstractC5985A<List<Customer>> getCustomers();

    void login(LoginInfo loginInfo, Function2<? super Customer, ? super SdkError, Unit> callback);

    void loginWithToken(String token, Function2<? super Customer, ? super SdkError, Unit> callback);

    void logout(Function1<? super SdkError, Unit> callback);

    void requestNewPassword(String email, Function2<? super Unit, ? super SdkError, Unit> callback);

    void setNewPassword(NewPasswordInfo newPasswordInfo, Function2<? super Customer, ? super SdkError, Unit> callback);

    void signUp(CustomerInfo customerInfo, LoginInfo loginInfo, CustomerConsent customerConsent, Function2<? super Customer, ? super SdkError, Unit> callback);

    void updateCustomer(CustomerInfo customerInfo, Function2<? super Customer, ? super SdkError, Unit> callback);

    void upgrade(LoginInfo loginInfo, Function2<? super Customer, ? super SdkError, Unit> callback);
}
