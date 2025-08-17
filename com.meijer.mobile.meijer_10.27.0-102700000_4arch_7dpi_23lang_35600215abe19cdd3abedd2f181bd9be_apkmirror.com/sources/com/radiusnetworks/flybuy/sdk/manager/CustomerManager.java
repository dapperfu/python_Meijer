package com.radiusnetworks.flybuy.sdk.manager;

import android.content.Context;
import androidx.view.AbstractC5985A;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.common.SdkError;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomerInfo;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomersDataStore;
import com.radiusnetworks.flybuy.sdk.data.customer.LoginInfo;
import com.radiusnetworks.flybuy.sdk.data.customer.NewPasswordInfo;
import com.radiusnetworks.flybuy.sdk.data.operations.CustomerOperation;
import com.radiusnetworks.flybuy.sdk.data.room.dao.CustomerDao;
import com.radiusnetworks.flybuy.sdk.data.room.database.AppDatabase;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Customer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0007\u0010\bJ_\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0018J?\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ?\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012¢\u0006\u0004\b\u001b\u0010\u001aJ7\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000f2 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ7\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012¢\u0006\u0004\b\u001f\u0010 J'\u0010\"\u001a\u00020\u00152\u0018\b\u0002\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010!¢\u0006\u0004\b\"\u0010#J7\u0010$\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000f2 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012¢\u0006\u0004\b$\u0010\u001eJ7\u0010'\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%2 \b\u0002\u0010\u0016\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012¢\u0006\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130,0+8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u00102\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/CustomerManager;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/radiusnetworks/flybuy/sdk/data/operations/CustomerOperation;", "getCustomerOperation$core_defaultRelease", "()Lcom/radiusnetworks/flybuy/sdk/data/operations/CustomerOperation;", "getCustomerOperation", "Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;", "customerInfo", "", "termsOfService", "ageVerification", "", "email", "password", "Lkotlin/Function2;", "Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Customer;", "Lcom/radiusnetworks/flybuy/sdk/data/common/SdkError;", "", "callback", "create", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;ZZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "signUp", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "login", "token", "loginWithToken", "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "update", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerInfo;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function1;", "logout", "(Lkotlin/jvm/functions/Function1;)V", "requestNewPassword", "Lcom/radiusnetworks/flybuy/sdk/data/customer/NewPasswordInfo;", "newPasswordInfo", "setNewPassword", "(Lcom/radiusnetworks/flybuy/sdk/data/customer/NewPasswordInfo;Lkotlin/jvm/functions/Function2;)V", "applicationContext", "Landroid/content/Context;", "Landroidx/lifecycle/A;", "", "getCustomers", "()Landroidx/lifecycle/A;", "customers", "getCurrent", "()Lcom/radiusnetworks/flybuy/sdk/data/room/domain/Customer;", "current", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class CustomerManager {
    private final Context applicationContext;

    public CustomerManager(Context context) {
        Intrinsics.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        this.applicationContext = applicationContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void create$default(CustomerManager customerManager, CustomerInfo customerInfo, boolean z10, boolean z11, String str, String str2, Function2 function2, int i10, Object obj) throws Exception {
        if ((i10 & 8) != 0) {
            str = null;
        }
        if ((i10 & 16) != 0) {
            str2 = null;
        }
        if ((i10 & 32) != 0) {
            function2 = null;
        }
        customerManager.create(customerInfo, z10, z11, str, str2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void login$default(CustomerManager customerManager, String str, String str2, Function2 function2, int i10, Object obj) throws Exception {
        if ((i10 & 4) != 0) {
            function2 = null;
        }
        customerManager.login(str, str2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loginWithToken$default(CustomerManager customerManager, String str, Function2 function2, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        customerManager.loginWithToken(str, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logout$default(CustomerManager customerManager, Function1 function1, int i10, Object obj) throws Exception {
        if ((i10 & 1) != 0) {
            function1 = null;
        }
        customerManager.logout(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requestNewPassword$default(CustomerManager customerManager, String str, Function2 function2, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        customerManager.requestNewPassword(str, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setNewPassword$default(CustomerManager customerManager, NewPasswordInfo newPasswordInfo, Function2 function2, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        customerManager.setNewPassword(newPasswordInfo, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void signUp$default(CustomerManager customerManager, String str, String str2, Function2 function2, int i10, Object obj) throws Exception {
        if ((i10 & 4) != 0) {
            function2 = null;
        }
        customerManager.signUp(str, str2, function2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void update$default(CustomerManager customerManager, CustomerInfo customerInfo, Function2 function2, int i10, Object obj) throws Exception {
        if ((i10 & 2) != 0) {
            function2 = null;
        }
        customerManager.update(customerInfo, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0012 A[Catch: Exception -> 0x000e, TryCatch #0 {Exception -> 0x000e, blocks: (B:4:0x0007, B:13:0x0019, B:10:0x0012, B:15:0x0031), top: B:19:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void create(com.radiusnetworks.flybuy.sdk.data.customer.CustomerInfo r3, boolean r4, boolean r5, java.lang.String r6, java.lang.String r7, kotlin.jvm.functions.Function2<? super com.radiusnetworks.flybuy.sdk.data.room.domain.Customer, ? super com.radiusnetworks.flybuy.sdk.data.common.SdkError, kotlin.Unit> r8) throws java.lang.Exception {
        /*
            r2 = this;
            java.lang.String r0 = "customerInfo"
            kotlin.jvm.internal.Intrinsics.j(r3, r0)
            if (r6 == 0) goto L10
            boolean r0 = kotlin.text.StringsKt.r0(r6)     // Catch: java.lang.Exception -> Le
            if (r0 == 0) goto L19
            goto L10
        Le:
            r3 = move-exception
            goto L3e
        L10:
            if (r7 == 0) goto L31
            boolean r0 = kotlin.text.StringsKt.r0(r7)     // Catch: java.lang.Exception -> Le
            if (r0 == 0) goto L19
            goto L31
        L19:
            com.radiusnetworks.flybuy.sdk.data.operations.CustomerOperation r0 = r2.getCustomerOperation$core_defaultRelease()     // Catch: java.lang.Exception -> Le
            com.radiusnetworks.flybuy.sdk.data.customer.LoginInfo r1 = new com.radiusnetworks.flybuy.sdk.data.customer.LoginInfo     // Catch: java.lang.Exception -> Le
            kotlin.jvm.internal.Intrinsics.g(r6)     // Catch: java.lang.Exception -> Le
            kotlin.jvm.internal.Intrinsics.g(r7)     // Catch: java.lang.Exception -> Le
            r1.<init>(r6, r7)     // Catch: java.lang.Exception -> Le
            com.radiusnetworks.flybuy.sdk.data.customer.CustomerConsent r6 = new com.radiusnetworks.flybuy.sdk.data.customer.CustomerConsent     // Catch: java.lang.Exception -> Le
            r6.<init>(r4, r5)     // Catch: java.lang.Exception -> Le
            r0.signUp(r3, r1, r6, r8)     // Catch: java.lang.Exception -> Le
            return
        L31:
            com.radiusnetworks.flybuy.sdk.data.operations.CustomerOperation r6 = r2.getCustomerOperation$core_defaultRelease()     // Catch: java.lang.Exception -> Le
            com.radiusnetworks.flybuy.sdk.data.customer.CustomerConsent r7 = new com.radiusnetworks.flybuy.sdk.data.customer.CustomerConsent     // Catch: java.lang.Exception -> Le
            r7.<init>(r4, r5)     // Catch: java.lang.Exception -> Le
            r6.create(r3, r7, r8)     // Catch: java.lang.Exception -> Le
            return
        L3e:
            com.radiusnetworks.flybuy.sdk.FlyBuyCore r4 = com.radiusnetworks.flybuy.sdk.FlyBuyCore.INSTANCE
            com.radiusnetworks.flybuy.sdk.manager.CrashManager r4 = r4.getCrashManager()
            r4.reportCrash(r3)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.radiusnetworks.flybuy.sdk.manager.CustomerManager.create(com.radiusnetworks.flybuy.sdk.data.customer.CustomerInfo, boolean, boolean, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2):void");
    }

    public final CustomerOperation getCustomerOperation$core_defaultRelease() {
        Context context = this.applicationContext;
        Intrinsics.j(context, "context");
        AppDatabase.Companion companion = AppDatabase.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        CustomerDao customerDaoCustomerDao$core_defaultRelease = companion.getInstance(applicationContext).customerDao$core_defaultRelease();
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.i(applicationContext2, "getApplicationContext(...)");
        return new CustomerOperation(new CustomersDataStore(customerDaoCustomerDao$core_defaultRelease, applicationContext2));
    }

    public final void login(String email, String password, Function2<? super Customer, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(email, "email");
        Intrinsics.j(password, "password");
        try {
            getCustomerOperation$core_defaultRelease().login(new LoginInfo(email, password), callback);
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void loginWithToken(String token, Function2<? super Customer, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(token, "token");
        try {
            getCustomerOperation$core_defaultRelease().loginWithToken(token, callback);
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void logout(Function1<? super SdkError, Unit> callback) throws Exception {
        try {
            FlyBuyCore flyBuyCore = FlyBuyCore.INSTANCE;
            flyBuyCore.getAppInstanceManager$core_defaultRelease().rotateAppInstanceID();
            flyBuyCore.getConfig().rotateAppInstanceId$core_defaultRelease();
            getCustomerOperation$core_defaultRelease().logout(callback);
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void requestNewPassword(String email, Function2<? super Unit, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(email, "email");
        try {
            getCustomerOperation$core_defaultRelease().requestNewPassword(email, callback);
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void setNewPassword(NewPasswordInfo newPasswordInfo, Function2<? super Customer, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(newPasswordInfo, "newPasswordInfo");
        try {
            getCustomerOperation$core_defaultRelease().setNewPassword(newPasswordInfo, callback);
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void signUp(String email, String password, Function2<? super Customer, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(email, "email");
        Intrinsics.j(password, "password");
        try {
            getCustomerOperation$core_defaultRelease().upgrade(new LoginInfo(email, password), callback);
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final void update(CustomerInfo customerInfo, Function2<? super Customer, ? super SdkError, Unit> callback) throws Exception {
        Intrinsics.j(customerInfo, "customerInfo");
        try {
            getCustomerOperation$core_defaultRelease().update(customerInfo, callback);
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final Customer getCurrent() throws Exception {
        try {
            return getCustomerOperation$core_defaultRelease().currentUser();
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final AbstractC5985A<List<Customer>> getCustomers() throws Exception {
        try {
            return getCustomerOperation$core_defaultRelease().getCustomers();
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }
}
