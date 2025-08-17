package com.radiusnetworks.flybuy.api;

import androidx.annotation.Keep;
import com.radiusnetworks.flybuy.api.model.AppResponse;
import com.radiusnetworks.flybuy.api.model.ClaimOrderRequestData;
import com.radiusnetworks.flybuy.api.model.CreateCustomerRequest;
import com.radiusnetworks.flybuy.api.model.CreateOrderRequestData;
import com.radiusnetworks.flybuy.api.model.CustomerData;
import com.radiusnetworks.flybuy.api.model.CustomerResponse;
import com.radiusnetworks.flybuy.api.model.GetNotifyNotificationsResponse;
import com.radiusnetworks.flybuy.api.model.GetOrdersResponse;
import com.radiusnetworks.flybuy.api.model.GetSitesResponse;
import com.radiusnetworks.flybuy.api.model.LoginRequest;
import com.radiusnetworks.flybuy.api.model.LoginRequestData;
import com.radiusnetworks.flybuy.api.model.NotifyEventData;
import com.radiusnetworks.flybuy.api.model.OrderEventRequestData;
import com.radiusnetworks.flybuy.api.model.OrderResponse;
import com.radiusnetworks.flybuy.api.model.PatchAppInstanceData;
import com.radiusnetworks.flybuy.api.model.PatchAppInstanceRequest;
import com.radiusnetworks.flybuy.api.model.RequestNewPasswordRequest;
import com.radiusnetworks.flybuy.api.model.RequestNewPasswordRequestData;
import com.radiusnetworks.flybuy.api.model.SetNewPasswordRequest;
import com.radiusnetworks.flybuy.api.model.SetNewPasswordRequestData;
import com.radiusnetworks.flybuy.api.model.SignUpCustomerRequest;
import com.radiusnetworks.flybuy.api.model.SignUpRequestData;
import com.radiusnetworks.flybuy.api.model.UpdateCustomerRequest;
import com.radiusnetworks.flybuy.api.model.UpdateCustomerRequestData;
import com.radiusnetworks.flybuy.api.model.UpdateOrderRequestData;
import com.radiusnetworks.flybuy.api.network.b;
import com.radiusnetworks.flybuy.api.network.c;
import com.radiusnetworks.flybuy.api.network.common.ApiErrorResponse;
import com.radiusnetworks.flybuy.api.network.common.ApiResponse;
import com.radiusnetworks.flybuy.api.network.common.a;
import com.radiusnetworks.flybuy.api.network.d;
import com.radiusnetworks.flybuy.api.network.e;
import com.radiusnetworks.flybuy.api.network.f;
import com.radiusnetworks.flybuy.api.network.g;
import com.radiusnetworks.flybuy.api.network.h;
import com.radiusnetworks.flybuy.api.network.i;
import com.radiusnetworks.flybuy.api.network.j;
import com.radiusnetworks.flybuy.api.network.k;
import com.radiusnetworks.flybuy.api.network.l;
import com.radiusnetworks.flybuy.api.network.m;
import com.radiusnetworks.flybuy.api.network.n;
import com.radiusnetworks.flybuy.api.network.o;
import com.radiusnetworks.flybuy.api.network.p;
import com.radiusnetworks.flybuy.api.network.q;
import com.radiusnetworks.flybuy.api.network.r;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.radiusnetworks.flybuy.api.network.s;
import com.radiusnetworks.flybuy.api.network.t;
import com.radiusnetworks.flybuy.api.network.u;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import retrofit2.Call;
import retrofit2.Response;

@Keep
@Metadata(d1 = {"\u0000Ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u00102\u001a\b\u0012\u0004\u0012\u0002030!2\u0006\u00104\u001a\u00020\u00042\u0006\u00105\u001a\u000206H\u0007J\u0016\u00107\u001a\b\u0012\u0004\u0012\u0002080!2\u0006\u00109\u001a\u00020:H\u0007J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u0002030!2\u0006\u0010<\u001a\u00020=H\u0007J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020?0!2\u0006\u0010@\u001a\u00020AH\u0007J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u0002030!2\u0006\u00104\u001a\u00020\u0004H\u0007J\u000e\u0010C\u001a\b\u0012\u0004\u0012\u00020D0!H\u0007J\u000e\u0010E\u001a\b\u0012\u0004\u0012\u0002080!H\u0007J&\u0010F\u001a\b\u0012\u0004\u0012\u00020G0!2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020LH\u0007JM\u0010M\u001a\b\u0012\u0004\u0012\u00020N0!2\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020L2\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u001b2\b\u0010Q\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010RJK\u0010M\u001a\b\u0012\u0004\u0012\u00020N0!2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010P\u001a\u0004\u0018\u00010\u001b2\b\u0010Q\u001a\u0004\u0018\u00010\u00042\b\u0010T\u001a\u0004\u0018\u00010UH\u0007¢\u0006\u0002\u0010VJ$\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0006\u0010Z\u001a\u00020[H\u0007J\u0016\u0010\\\u001a\b\u0012\u0004\u0012\u0002080!2\u0006\u0010]\u001a\u00020^H\u0007J\u0016\u0010_\u001a\b\u0012\u0004\u0012\u00020?0!2\u0006\u0010`\u001a\u00020aH\u0007J\u0016\u0010b\u001a\b\u0012\u0004\u0012\u00020?0!2\u0006\u0010c\u001a\u00020dH\u0007J\u0016\u0010e\u001a\b\u0012\u0004\u0012\u0002080!2\u0006\u0010f\u001a\u00020gH\u0007J\u0016\u0010h\u001a\b\u0012\u0004\u0012\u0002080!2\u0006\u0010i\u001a\u00020jH\u0007J\u001e\u0010k\u001a\b\u0012\u0004\u0012\u00020?0!2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010l\u001a\u00020\u0004H\u0007J\u0016\u0010m\u001a\b\u0012\u0004\u0012\u0002080!2\u0006\u0010n\u001a\u00020oH\u0007J\u001e\u0010p\u001a\b\u0012\u0004\u0012\u0002030!2\u0006\u00104\u001a\u00020\u00042\u0006\u0010q\u001a\u00020rH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0002\u001a\u0004\b$\u0010%R(\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000bR \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\t\"\u0004\b1\u0010\u000b¨\u0006s"}, d2 = {"Lcom/radiusnetworks/flybuy/api/FlyBuyApi;", "", "()V", "_appTokenKey", "", "_customerApiToken", "_pushToken", "appId", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "appInstanceId", "getAppInstanceId", "setAppInstanceId", "value", "appTokenKey", "getAppTokenKey", "setAppTokenKey", "appVersion", "getAppVersion", "setAppVersion", "customerApiToken", "getCustomerApiToken", "setCustomerApiToken", "defaultBaseUrl", "logLevel", "", "getLogLevel$api_defaultRelease", "()I", "setLogLevel$api_defaultRelease", "(I)V", "orders", "Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "Lcom/radiusnetworks/flybuy/api/model/GetOrdersResponse;", "getOrders$annotations", "getOrders", "()Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "pushToken", "getPushToken", "setPushToken", "sdkPermissions", "", "getSdkPermissions", "()Ljava/util/List;", "setSdkPermissions", "(Ljava/util/List;)V", "sdkVersion", "getSdkVersion", "setSdkVersion", "claimOrder", "Lcom/radiusnetworks/flybuy/api/model/OrderResponse;", "code", "claimOrderRequestData", "Lcom/radiusnetworks/flybuy/api/model/ClaimOrderRequestData;", "createCustomer", "Lcom/radiusnetworks/flybuy/api/model/CustomerResponse;", "customerData", "Lcom/radiusnetworks/flybuy/api/model/CustomerData;", "createOrder", "createOrderRequestData", "Lcom/radiusnetworks/flybuy/api/model/CreateOrderRequestData;", "event", "Ljava/lang/Void;", "orderEventRequestData", "Lcom/radiusnetworks/flybuy/api/model/OrderEventRequestData;", "findOrder", "getAppData", "Lcom/radiusnetworks/flybuy/api/model/AppResponse;", "getCustomer", "getNotifyNotifications", "Lcom/radiusnetworks/flybuy/api/model/GetNotifyNotificationsResponse;", "latitude", "", "longitude", "radius", "", "getSites", "Lcom/radiusnetworks/flybuy/api/model/GetSitesResponse;", "page", "per", "operationalStatus", "(DDFLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "query", "matchPartnerIdentifier", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "initialize", "", "baseUrl", "cacheDir", "Ljava/io/File;", "login", "loginRequestData", "Lcom/radiusnetworks/flybuy/api/model/LoginRequestData;", "notifyEvent", "notifyEventData", "Lcom/radiusnetworks/flybuy/api/model/NotifyEventData;", "requestNewPassword", "requestNewPasswordRequestData", "Lcom/radiusnetworks/flybuy/api/model/RequestNewPasswordRequestData;", "setNewPassword", "setNewPasswordRequestData", "Lcom/radiusnetworks/flybuy/api/model/SetNewPasswordRequestData;", "signUpCustomer", "signUpRequestData", "Lcom/radiusnetworks/flybuy/api/model/SignUpRequestData;", "updateAppInstance", "timeZone", "updateCustomer", "updateCustomerRequestData", "Lcom/radiusnetworks/flybuy/api/model/UpdateCustomerRequestData;", "updateOrder", "updateOrderRequestData", "Lcom/radiusnetworks/flybuy/api/model/UpdateOrderRequestData;", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FlyBuyApi {
    private static String _pushToken = null;
    private static String appId = null;
    private static String appInstanceId = null;
    private static String appVersion = null;
    private static final String defaultBaseUrl = "https://flybuy.radiusnetworks.com/";
    private static String sdkVersion;
    public static final FlyBuyApi INSTANCE = new FlyBuyApi();
    private static List<String> sdkPermissions = CollectionsKt.m();
    private static int logLevel = 8;
    private static String _appTokenKey = "";
    private static String _customerApiToken = "";

    private FlyBuyApi() {
    }

    @JvmStatic
    public static /* synthetic */ void getOrders$annotations() {
    }

    @JvmStatic
    public static final ApiResponse<GetSitesResponse> getSites(double latitude, double longitude, float radius, Integer page, Integer per, String operationalStatus) {
        try {
            Response responseExecute = ((Call) new k(latitude, longitude, radius, page, per, operationalStatus).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    public static /* synthetic */ ApiResponse getSites$default(double d10, double d11, float f10, Integer num, Integer num2, String str, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            num = null;
        }
        if ((i10 & 16) != 0) {
            num2 = null;
        }
        return getSites(d10, d11, f10, num, num2, str);
    }

    @JvmStatic
    public static final void initialize(String baseUrl, int logLevel2, File cacheDir) {
        Unit unit;
        Intrinsics.j(cacheDir, "cacheDir");
        logLevel = logLevel2;
        if (baseUrl != null) {
            u.a(baseUrl, cacheDir);
            unit = Unit.f142422a;
        } else {
            unit = null;
        }
        if (unit == null) {
            u.a(defaultBaseUrl, cacheDir);
        }
    }

    public static /* synthetic */ void initialize$default(String str, int i10, File file, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8;
        }
        initialize(str, i10, file);
    }

    public final String getAppId() {
        return appId;
    }

    public final String getAppInstanceId() {
        return appInstanceId;
    }

    public final String getAppTokenKey() {
        return _appTokenKey;
    }

    public final String getAppVersion() {
        return appVersion;
    }

    public final String getCustomerApiToken() {
        return _customerApiToken;
    }

    public final int getLogLevel$api_defaultRelease() {
        return logLevel;
    }

    public final String getPushToken() {
        return _pushToken;
    }

    public final List<String> getSdkPermissions() {
        return sdkPermissions;
    }

    public final String getSdkVersion() {
        return sdkVersion;
    }

    public final void setAppId(String str) {
        appId = str;
    }

    public final void setAppInstanceId(String str) {
        appInstanceId = str;
    }

    public final void setAppTokenKey(String value) {
        Intrinsics.j(value, "value");
        _appTokenKey = value;
    }

    public final void setAppVersion(String str) {
        appVersion = str;
    }

    public final void setCustomerApiToken(String value) {
        Intrinsics.j(value, "value");
        _customerApiToken = value;
    }

    public final void setLogLevel$api_defaultRelease(int i10) {
        logLevel = i10;
    }

    public final void setPushToken(String str) {
        _pushToken = str;
    }

    public final void setSdkPermissions(List<String> list) {
        Intrinsics.j(list, "<set-?>");
        sdkPermissions = list;
    }

    public final void setSdkVersion(String str) {
        sdkVersion = str;
    }

    @JvmStatic
    public static final ApiResponse<OrderResponse> claimOrder(String code, ClaimOrderRequestData claimOrderRequestData) {
        Intrinsics.j(code, "code");
        Intrinsics.j(claimOrderRequestData, "claimOrderRequestData");
        Intrinsics.j(code, "code");
        Intrinsics.j(claimOrderRequestData, "claimOrderData");
        com.radiusnetworks.flybuy.api.network.a aVar = new com.radiusnetworks.flybuy.api.network.a(code, claimOrderRequestData);
        if (StringsKt.r0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new e(aVar).invoke()).execute();
            a aVar2 = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar2.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<CustomerResponse> createCustomer(CustomerData customerData) {
        Intrinsics.j(customerData, "customerData");
        CreateCustomerRequest createCustomerRequest = new CreateCustomerRequest(customerData);
        Intrinsics.j(createCustomerRequest, "createCustomerRequest");
        try {
            Response responseExecute = ((Call) new b(createCustomerRequest).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<OrderResponse> createOrder(CreateOrderRequestData createOrderRequestData) {
        Intrinsics.j(createOrderRequestData, "createOrderRequestData");
        Intrinsics.j(createOrderRequestData, "createOrderData");
        c cVar = new c(createOrderRequestData);
        if (StringsKt.r0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new e(cVar).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<Void> event(OrderEventRequestData orderEventRequestData) {
        Intrinsics.j(orderEventRequestData, "orderEventRequestData");
        Intrinsics.j(orderEventRequestData, "orderEventRequestData");
        d dVar = new d(orderEventRequestData);
        if (StringsKt.r0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new e(dVar).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<OrderResponse> findOrder(String code) {
        Intrinsics.j(code, "code");
        Intrinsics.j(code, "code");
        try {
            Response responseExecute = ((Call) new f(code).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<AppResponse> getAppData() {
        try {
            Response responseExecute = ((Call) g.f119926f.invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<CustomerResponse> getCustomer() {
        h hVar = h.f119927f;
        if (StringsKt.r0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new e(hVar).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<GetNotifyNotificationsResponse> getNotifyNotifications(double latitude, double longitude, float radius) {
        try {
            Response responseExecute = ((Call) new i(latitude, longitude, radius).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    public static final ApiResponse<GetOrdersResponse> getOrders() {
        n nVar = n.f119944f;
        if (StringsKt.r0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new e(nVar).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    public static /* synthetic */ ApiResponse getSites$default(String str, Integer num, Integer num2, String str2, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            num2 = null;
        }
        return getSites(str, num, num2, str2, bool);
    }

    @JvmStatic
    public static final ApiResponse<CustomerResponse> login(LoginRequestData loginRequestData) {
        Intrinsics.j(loginRequestData, "loginRequestData");
        LoginRequest loginRequest = new LoginRequest(loginRequestData);
        Intrinsics.j(loginRequest, "loginRequest");
        try {
            Response responseExecute = ((Call) new l(loginRequest).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<Void> notifyEvent(NotifyEventData notifyEventData) {
        Intrinsics.j(notifyEventData, "notifyEventData");
        Intrinsics.j(notifyEventData, "notifyEventData");
        try {
            Response responseExecute = ((Call) new m(notifyEventData).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<Void> requestNewPassword(RequestNewPasswordRequestData requestNewPasswordRequestData) {
        Intrinsics.j(requestNewPasswordRequestData, "requestNewPasswordRequestData");
        RequestNewPasswordRequest requestNewPasswordRequest = new RequestNewPasswordRequest(requestNewPasswordRequestData);
        Intrinsics.j(requestNewPasswordRequest, "requestNewPasswordRequest");
        try {
            Response responseExecute = ((Call) new p(requestNewPasswordRequest).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<CustomerResponse> setNewPassword(SetNewPasswordRequestData setNewPasswordRequestData) {
        Intrinsics.j(setNewPasswordRequestData, "setNewPasswordRequestData");
        SetNewPasswordRequest setNewPasswordRequest = new SetNewPasswordRequest(setNewPasswordRequestData);
        Intrinsics.j(setNewPasswordRequest, "setNewPasswordRequest");
        q qVar = new q(setNewPasswordRequest);
        if (StringsKt.r0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new e(qVar).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<CustomerResponse> signUpCustomer(SignUpRequestData signUpRequestData) {
        Intrinsics.j(signUpRequestData, "signUpRequestData");
        SignUpCustomerRequest signUpCustomerRequest = new SignUpCustomerRequest(signUpRequestData);
        Intrinsics.j(signUpCustomerRequest, "signUpCustomerRequest");
        r rVar = new r(signUpCustomerRequest);
        if (StringsKt.r0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new e(rVar).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<Void> updateAppInstance(String pushToken, String timeZone) {
        Intrinsics.j(pushToken, "pushToken");
        Intrinsics.j(timeZone, "timeZone");
        PatchAppInstanceRequest patchAppRequest = new PatchAppInstanceRequest(new PatchAppInstanceData(pushToken, timeZone));
        Intrinsics.j(patchAppRequest, "patchAppRequest");
        try {
            Response responseExecute = ((Call) new o(patchAppRequest).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<CustomerResponse> updateCustomer(UpdateCustomerRequestData updateCustomerRequestData) {
        Intrinsics.j(updateCustomerRequestData, "updateCustomerRequestData");
        UpdateCustomerRequest updateCustomerRequest = new UpdateCustomerRequest(updateCustomerRequestData);
        Intrinsics.j(updateCustomerRequest, "updateCustomerRequest");
        s sVar = new s(updateCustomerRequest);
        if (StringsKt.r0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new e(sVar).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<OrderResponse> updateOrder(String code, UpdateOrderRequestData updateOrderRequestData) {
        Intrinsics.j(code, "code");
        Intrinsics.j(updateOrderRequestData, "updateOrderRequestData");
        Intrinsics.j(code, "code");
        Intrinsics.j(updateOrderRequestData, "updateOrderRequestData");
        t tVar = new t(code, updateOrderRequestData);
        if (StringsKt.r0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new e(tVar).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }

    @JvmStatic
    public static final ApiResponse<GetSitesResponse> getSites(String query, Integer page, Integer per, String operationalStatus, Boolean matchPartnerIdentifier) {
        try {
            Response responseExecute = ((Call) new j(query, page, per, operationalStatus, matchPartnerIdentifier).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
    }
}
