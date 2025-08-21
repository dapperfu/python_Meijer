package com.radiusnetworks.flybuy.api;

import androidx.annotation.Keep;
import com.fullstory.FS;
import com.radiusnetworks.flybuy.api.model.AnalyticsEventsData;
import com.radiusnetworks.flybuy.api.model.AppInstanceResponse;
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
import com.radiusnetworks.flybuy.api.network.interceptors.SdkInfoInterceptor;
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
import com.radiusnetworks.flybuy.api.network.v;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Keep
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u00102\u001a\b\u0012\u0004\u0012\u0002030!2\u0006\u00104\u001a\u000205H\u0007J\u001e\u00106\u001a\b\u0012\u0004\u0012\u0002070!2\u0006\u00108\u001a\u00020\u00042\u0006\u00109\u001a\u00020:H\u0007J\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020<0!2\u0006\u0010=\u001a\u00020>H\u0007J\u0016\u0010?\u001a\b\u0012\u0004\u0012\u0002070!2\u0006\u0010@\u001a\u00020AH\u0007J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u0002030!2\u0006\u0010C\u001a\u00020DH\u0007J\u0016\u0010E\u001a\b\u0012\u0004\u0012\u0002070!2\u0006\u00108\u001a\u00020\u0004H\u0007J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020G0!H\u0007J\u000e\u0010H\u001a\b\u0012\u0004\u0012\u00020<0!H\u0007J&\u0010I\u001a\b\u0012\u0004\u0012\u00020J0!2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020OH\u0007JM\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0!2\u0006\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020O2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u001b2\b\u0010T\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0002\u0010UJK\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0!2\n\b\u0002\u0010V\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u001b2\b\u0010T\u001a\u0004\u0018\u00010\u00042\b\u0010W\u001a\u0004\u0018\u00010XH\u0007¢\u0006\u0002\u0010YJ$\u0010Z\u001a\u00020[2\b\u0010\\\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020^H\u0007J\u0016\u0010_\u001a\b\u0012\u0004\u0012\u00020<0!2\u0006\u0010`\u001a\u00020aH\u0007J\u0016\u0010b\u001a\b\u0012\u0004\u0012\u0002030!2\u0006\u0010c\u001a\u00020dH\u0007J\u0016\u0010e\u001a\b\u0012\u0004\u0012\u0002030!2\u0006\u0010f\u001a\u00020gH\u0007J\u0016\u0010h\u001a\b\u0012\u0004\u0012\u00020<0!2\u0006\u0010i\u001a\u00020jH\u0007J\u0016\u0010k\u001a\b\u0012\u0004\u0012\u00020<0!2\u0006\u0010l\u001a\u00020mH\u0007J.\u0010n\u001a\b\u0012\u0004\u0012\u0002030!2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010o\u001a\u00020\u00042\u000e\u0010p\u001a\n\u0012\u0004\u0012\u00020q\u0018\u00010*H\u0007J\u0016\u0010r\u001a\b\u0012\u0004\u0012\u00020<0!2\u0006\u0010s\u001a\u00020tH\u0007J\u001e\u0010u\u001a\b\u0012\u0004\u0012\u0002070!2\u0006\u00108\u001a\u00020\u00042\u0006\u0010v\u001a\u00020wH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR$\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000bR$\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\t\"\u0004\b\u0018\u0010\u000bR\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u0002\u001a\u0004\b$\u0010%R(\u0010&\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00048G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010\t\"\u0004\b(\u0010\u000bR \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\t\"\u0004\b1\u0010\u000b¨\u0006x"}, d2 = {"Lcom/radiusnetworks/flybuy/api/FlyBuyApi;", "", "()V", "_appTokenKey", "", "_customerApiToken", "_pushToken", "appId", "getAppId", "()Ljava/lang/String;", "setAppId", "(Ljava/lang/String;)V", "appInstanceId", "getAppInstanceId", "setAppInstanceId", "value", "appTokenKey", "getAppTokenKey", "setAppTokenKey", "appVersion", "getAppVersion", "setAppVersion", "customerApiToken", "getCustomerApiToken", "setCustomerApiToken", "defaultBaseUrl", "logLevel", "", "getLogLevel$api_defaultRelease", "()I", "setLogLevel$api_defaultRelease", "(I)V", "orders", "Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "Lcom/radiusnetworks/flybuy/api/model/GetOrdersResponse;", "getOrders$annotations", "getOrders", "()Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "pushToken", "getPushToken", "setPushToken", "sdkPermissions", "", "getSdkPermissions", "()Ljava/util/List;", "setSdkPermissions", "(Ljava/util/List;)V", "sdkVersion", "getSdkVersion", "setSdkVersion", "analyticsEvents", "Ljava/lang/Void;", "analyticsEventsData", "Lcom/radiusnetworks/flybuy/api/model/AnalyticsEventsData;", "claimOrder", "Lcom/radiusnetworks/flybuy/api/model/OrderResponse;", "code", "claimOrderRequestData", "Lcom/radiusnetworks/flybuy/api/model/ClaimOrderRequestData;", "createCustomer", "Lcom/radiusnetworks/flybuy/api/model/CustomerResponse;", "customerData", "Lcom/radiusnetworks/flybuy/api/model/CustomerData;", "createOrder", "createOrderRequestData", "Lcom/radiusnetworks/flybuy/api/model/CreateOrderRequestData;", "event", "orderEventRequestData", "Lcom/radiusnetworks/flybuy/api/model/OrderEventRequestData;", "findOrder", "getAppData", "Lcom/radiusnetworks/flybuy/api/model/AppInstanceResponse;", "getCustomer", "getNotifyNotifications", "Lcom/radiusnetworks/flybuy/api/model/GetNotifyNotificationsResponse;", "latitude", "", "longitude", "radius", "", "getSites", "Lcom/radiusnetworks/flybuy/api/model/GetSitesResponse;", "page", "per", "operationalStatus", "(DDFLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "query", "matchPartnerIdentifier", "", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/radiusnetworks/flybuy/api/network/common/ApiResponse;", "initialize", "", "baseUrl", "cacheDir", "Ljava/io/File;", "login", "loginRequestData", "Lcom/radiusnetworks/flybuy/api/model/LoginRequestData;", "notifyEvent", "notifyEventData", "Lcom/radiusnetworks/flybuy/api/model/NotifyEventData;", "requestNewPassword", "requestNewPasswordRequestData", "Lcom/radiusnetworks/flybuy/api/model/RequestNewPasswordRequestData;", "setNewPassword", "setNewPasswordRequestData", "Lcom/radiusnetworks/flybuy/api/model/SetNewPasswordRequestData;", "signUpCustomer", "signUpRequestData", "Lcom/radiusnetworks/flybuy/api/model/SignUpRequestData;", "updateAppInstance", "timeZone", "subscribedPushTopicIds", "", "updateCustomer", "updateCustomerRequestData", "Lcom/radiusnetworks/flybuy/api/model/UpdateCustomerRequestData;", "updateOrder", "updateOrderRequestData", "Lcom/radiusnetworks/flybuy/api/model/UpdateOrderRequestData;", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
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

    @JvmStatic
    public static /* synthetic */ void getOrders$annotations() {
    }

    @JvmStatic
    public static final ApiResponse<GetSitesResponse> getSites(String query, Integer page, Integer per, String operationalStatus, Boolean matchPartnerIdentifier) {
        try {
            Response responseExecute = ((Call) new k(query, page, per, operationalStatus, matchPartnerIdentifier).invoke()).execute();
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
    public static final ApiResponse<Void> analyticsEvents(AnalyticsEventsData analyticsEventsData) {
        Intrinsics.j(analyticsEventsData, "analyticsEventsData");
        Intrinsics.j(analyticsEventsData, "analyticsEventsData");
        try {
            Response responseExecute = ((Call) new com.radiusnetworks.flybuy.api.network.a(analyticsEventsData).invoke()).execute();
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
    public static final ApiResponse<OrderResponse> claimOrder(String code, ClaimOrderRequestData claimOrderRequestData) {
        Intrinsics.j(code, "code");
        Intrinsics.j(claimOrderRequestData, "claimOrderRequestData");
        Intrinsics.j(code, "code");
        Intrinsics.j(claimOrderRequestData, "claimOrderData");
        b bVar = new b(code, claimOrderRequestData);
        if (StringsKt.s0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new f(bVar).invoke()).execute();
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
    public static final ApiResponse<CustomerResponse> createCustomer(CustomerData customerData) {
        Intrinsics.j(customerData, "customerData");
        CreateCustomerRequest createCustomerRequest = new CreateCustomerRequest(customerData);
        Intrinsics.j(createCustomerRequest, "createCustomerRequest");
        try {
            Response responseExecute = ((Call) new c(createCustomerRequest).invoke()).execute();
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
        d dVar = new d(createOrderRequestData);
        if (StringsKt.s0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new f(dVar).invoke()).execute();
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
        e eVar = new e(orderEventRequestData);
        if (StringsKt.s0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new f(eVar).invoke()).execute();
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
            Response responseExecute = ((Call) new g(code).invoke()).execute();
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
    public static final ApiResponse<AppInstanceResponse> getAppData() {
        try {
            Response responseExecute = ((Call) h.f120899f.invoke()).execute();
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
        i iVar = i.f120900f;
        if (StringsKt.s0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new f(iVar).invoke()).execute();
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
            Response responseExecute = ((Call) new j(latitude, longitude, radius).invoke()).execute();
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
        o oVar = o.f120917f;
        if (StringsKt.s0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new f(oVar).invoke()).execute();
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
            Intrinsics.j(baseUrl, "baseUrl");
            Intrinsics.j(cacheDir, "cacheDir");
            okhttp3.b bVar = new okhttp3.b(new File(cacheDir.getAbsolutePath(), "com.radiusnetworks.flybuy.sdk.api"), 10485760L);
            Retrofit.Builder builderAddConverterFactory = new Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create());
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            FS.okhttp_addInterceptors(builder);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            OkHttpClient.Builder builderB = builder.d(30000L, timeUnit).V(30000L, timeUnit).j(true).b(bVar);
            builderB.addNetworkInterceptor(new com.radiusnetworks.flybuy.api.network.interceptors.c()).addInterceptor(new com.radiusnetworks.flybuy.api.network.interceptors.a()).addInterceptor(new com.radiusnetworks.flybuy.api.network.interceptors.b()).addInterceptor(new SdkInfoInterceptor());
            Retrofit retrofitBuild = builderAddConverterFactory.client(builderB.a()).build();
            Intrinsics.i(retrofitBuild, "build(...)");
            v.f120925a = retrofitBuild;
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null) {
            Intrinsics.j(defaultBaseUrl, "baseUrl");
            Intrinsics.j(cacheDir, "cacheDir");
            okhttp3.b bVar2 = new okhttp3.b(new File(cacheDir.getAbsolutePath(), "com.radiusnetworks.flybuy.sdk.api"), 10485760L);
            Retrofit.Builder builderAddConverterFactory2 = new Retrofit.Builder().baseUrl(defaultBaseUrl).addConverterFactory(GsonConverterFactory.create());
            OkHttpClient.Builder builder2 = new OkHttpClient.Builder();
            FS.okhttp_addInterceptors(builder2);
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            OkHttpClient.Builder builderB2 = builder2.d(30000L, timeUnit2).V(30000L, timeUnit2).j(true).b(bVar2);
            builderB2.addNetworkInterceptor(new com.radiusnetworks.flybuy.api.network.interceptors.c()).addInterceptor(new com.radiusnetworks.flybuy.api.network.interceptors.a()).addInterceptor(new com.radiusnetworks.flybuy.api.network.interceptors.b()).addInterceptor(new SdkInfoInterceptor());
            Retrofit retrofitBuild2 = builderAddConverterFactory2.client(builderB2.a()).build();
            Intrinsics.i(retrofitBuild2, "build(...)");
            v.f120925a = retrofitBuild2;
        }
    }

    public static /* synthetic */ void initialize$default(String str, int i10, File file, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 8;
        }
        initialize(str, i10, file);
    }

    @JvmStatic
    public static final ApiResponse<CustomerResponse> login(LoginRequestData loginRequestData) {
        Intrinsics.j(loginRequestData, "loginRequestData");
        LoginRequest loginRequest = new LoginRequest(loginRequestData);
        Intrinsics.j(loginRequest, "loginRequest");
        try {
            Response responseExecute = ((Call) new m(loginRequest).invoke()).execute();
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
            Response responseExecute = ((Call) new n(notifyEventData).invoke()).execute();
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
            Response responseExecute = ((Call) new q(requestNewPasswordRequest).invoke()).execute();
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
        r rVar = new r(setNewPasswordRequest);
        if (StringsKt.s0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new f(rVar).invoke()).execute();
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
        s sVar = new s(signUpCustomerRequest);
        if (StringsKt.s0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new f(sVar).invoke()).execute();
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
    public static final ApiResponse<Void> updateAppInstance(String pushToken, String timeZone, List<Long> subscribedPushTopicIds) {
        Intrinsics.j(pushToken, "pushToken");
        Intrinsics.j(timeZone, "timeZone");
        PatchAppInstanceRequest patchAppRequest = new PatchAppInstanceRequest(new PatchAppInstanceData(pushToken, timeZone, subscribedPushTopicIds));
        Intrinsics.j(patchAppRequest, "patchAppRequest");
        try {
            Response responseExecute = ((Call) new p(patchAppRequest).invoke()).execute();
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
        t tVar = new t(updateCustomerRequest);
        if (StringsKt.s0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new f(tVar).invoke()).execute();
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
        u uVar = new u(code, updateOrderRequestData);
        if (StringsKt.s0(INSTANCE.getCustomerApiToken())) {
            return new ApiErrorResponse(HttpResponseStatus.ERROR_UNAUTHORIZED, null, null, 4, null);
        }
        try {
            Response responseExecute = ((Call) new f(uVar).invoke()).execute();
            a aVar = ApiResponse.Companion;
            Intrinsics.g(responseExecute);
            aVar.getClass();
            return a.b(responseExecute);
        } catch (IOException e10) {
            ApiResponse.Companion.getClass();
            return a.a(e10);
        }
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

    private FlyBuyApi() {
    }

    @JvmStatic
    public static final ApiResponse<GetSitesResponse> getSites(double latitude, double longitude, float radius, Integer page, Integer per, String operationalStatus) {
        try {
            Response responseExecute = ((Call) new l(latitude, longitude, radius, page, per, operationalStatus).invoke()).execute();
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
