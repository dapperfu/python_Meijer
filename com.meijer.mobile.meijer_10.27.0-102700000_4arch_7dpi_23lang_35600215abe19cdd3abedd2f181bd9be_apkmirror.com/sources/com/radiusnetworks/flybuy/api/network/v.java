package com.radiusnetworks.flybuy.api.network;

import com.radiusnetworks.flybuy.api.model.AppResponse;
import com.radiusnetworks.flybuy.api.model.ClaimOrderRequest;
import com.radiusnetworks.flybuy.api.model.CreateCustomerRequest;
import com.radiusnetworks.flybuy.api.model.CreateOrderRequest;
import com.radiusnetworks.flybuy.api.model.CustomerResponse;
import com.radiusnetworks.flybuy.api.model.GetNotifyNotificationsResponse;
import com.radiusnetworks.flybuy.api.model.GetOrdersResponse;
import com.radiusnetworks.flybuy.api.model.GetSitesResponse;
import com.radiusnetworks.flybuy.api.model.LoginRequest;
import com.radiusnetworks.flybuy.api.model.NotifyEventRequest;
import com.radiusnetworks.flybuy.api.model.OrderEventRequest;
import com.radiusnetworks.flybuy.api.model.OrderResponse;
import com.radiusnetworks.flybuy.api.model.PatchAppInstanceRequest;
import com.radiusnetworks.flybuy.api.model.RequestNewPasswordRequest;
import com.radiusnetworks.flybuy.api.model.SetNewPasswordRequest;
import com.radiusnetworks.flybuy.api.model.SignUpCustomerRequest;
import com.radiusnetworks.flybuy.api.model.UpdateCustomerRequest;
import com.radiusnetworks.flybuy.api.model.UpdateOrderRequest;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H'¢\u0006\u0004\b\f\u0010\u0005J\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\f\u0010\u0017J\u001f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0019\u001a\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u001cH'¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010!\u001a\u00020 H'¢\u0006\u0004\b\"\u0010#J\u0015\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0002H'¢\u0006\u0004\b%\u0010\u0005J\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020(0\u00022\b\b\u0001\u0010'\u001a\u00020&H'¢\u0006\u0004\b\u0004\u0010)J\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020(0\u00022\b\b\u0001\u0010+\u001a\u00020*H'¢\u0006\u0004\b\u0004\u0010,J)\u0010%\u001a\b\u0012\u0004\u0012\u00020(0\u00022\b\b\u0001\u0010+\u001a\u00020*2\b\b\u0001\u0010.\u001a\u00020-H'¢\u0006\u0004\b%\u0010/J)\u00103\u001a\b\u0012\u0004\u0012\u00020(0\u00022\b\b\u0001\u00100\u001a\u00020*2\b\b\u0001\u00102\u001a\u000201H'¢\u0006\u0004\b3\u00104J\u001f\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u001d\u001a\u000205H'¢\u0006\u0004\b6\u00107JQ\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00022\n\b\u0001\u00108\u001a\u0004\u0018\u00010*2\n\b\u0001\u0010:\u001a\u0004\u0018\u0001092\n\b\u0001\u0010;\u001a\u0004\u0018\u0001092\n\b\u0001\u0010<\u001a\u0004\u0018\u00010*2\n\b\u0001\u0010>\u001a\u0004\u0018\u00010=H'¢\u0006\u0004\b@\u0010AJW\u0010F\u001a\b\u0012\u0004\u0012\u00020?0\u00022\b\b\u0001\u0010B\u001a\u00020*2\b\b\u0001\u0010C\u001a\u00020*2\b\b\u0001\u0010E\u001a\u00020D2\n\b\u0001\u0010:\u001a\u0004\u0018\u0001092\n\b\u0001\u0010;\u001a\u0004\u0018\u0001092\n\b\u0001\u0010<\u001a\u0004\u0018\u00010*H'¢\u0006\u0004\bF\u0010GJ3\u0010I\u001a\b\u0012\u0004\u0012\u00020H0\u00022\b\b\u0001\u0010B\u001a\u00020*2\b\b\u0001\u0010C\u001a\u00020*2\b\b\u0001\u0010E\u001a\u00020DH'¢\u0006\u0004\bI\u0010JJ\u001f\u0010M\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010L\u001a\u00020KH'¢\u0006\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lcom/radiusnetworks/flybuy/api/network/v;", "", "Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/AppResponse;", "a", "()Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/PatchAppInstanceRequest;", "patchAppRequest", "Ljava/lang/Void;", "o", "(Lcom/radiusnetworks/flybuy/api/model/PatchAppInstanceRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/CustomerResponse;", "b", "Lcom/radiusnetworks/flybuy/api/model/CreateCustomerRequest;", "createCustomerRequest", "l", "(Lcom/radiusnetworks/flybuy/api/model/CreateCustomerRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/SignUpCustomerRequest;", "signUpCustomerRequest", "g", "(Lcom/radiusnetworks/flybuy/api/model/SignUpCustomerRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/LoginRequest;", "loginRequest", "(Lcom/radiusnetworks/flybuy/api/model/LoginRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/UpdateCustomerRequest;", "updateCustomerRequest", "j", "(Lcom/radiusnetworks/flybuy/api/model/UpdateCustomerRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/RequestNewPasswordRequest;", "orderEventRequest", "e", "(Lcom/radiusnetworks/flybuy/api/model/RequestNewPasswordRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/SetNewPasswordRequest;", "setNewPasswordRequest", "i", "(Lcom/radiusnetworks/flybuy/api/model/SetNewPasswordRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/GetOrdersResponse;", "c", "Lcom/radiusnetworks/flybuy/api/model/CreateOrderRequest;", "createOrderRequest", "Lcom/radiusnetworks/flybuy/api/model/OrderResponse;", "(Lcom/radiusnetworks/flybuy/api/model/CreateOrderRequest;)Lretrofit2/Call;", "", "code", "(Ljava/lang/String;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/ClaimOrderRequest;", "claimOrderRequest", "(Ljava/lang/String;Lcom/radiusnetworks/flybuy/api/model/ClaimOrderRequest;)Lretrofit2/Call;", "orderId", "Lcom/radiusnetworks/flybuy/api/model/UpdateOrderRequest;", "updateOrderRequest", "f", "(Ljava/lang/String;Lcom/radiusnetworks/flybuy/api/model/UpdateOrderRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/OrderEventRequest;", "h", "(Lcom/radiusnetworks/flybuy/api/model/OrderEventRequest;)Lretrofit2/Call;", "query", "", "page", "per", "operationalStatus", "", "matchPartnerIdentifier", "Lcom/radiusnetworks/flybuy/api/model/GetSitesResponse;", "k", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lretrofit2/Call;", "lat", "long", "", "radius", "d", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/GetNotifyNotificationsResponse;", "m", "(Ljava/lang/String;Ljava/lang/String;F)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/NotifyEventRequest;", "notifyEvent", "n", "(Lcom/radiusnetworks/flybuy/api/model/NotifyEventRequest;)Lretrofit2/Call;", "api_defaultRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public interface v {
    @GET("/m/v1/app")
    Call<AppResponse> a();

    @POST("/m/v1/orders")
    Call<OrderResponse> a(@Body CreateOrderRequest createOrderRequest);

    @GET("/m/v1/orders/{code}/edit")
    Call<OrderResponse> a(@Path("code") String code);

    @GET("/m/v1/customer")
    Call<CustomerResponse> b();

    @POST("/m/v1/customer/sign_in")
    Call<CustomerResponse> b(@Body LoginRequest loginRequest);

    @GET("/m/v1/orders")
    Call<GetOrdersResponse> c();

    @PATCH("/m/v1/orders/{code}")
    Call<OrderResponse> c(@Path("code") String code, @Body ClaimOrderRequest claimOrderRequest);

    @GET("/m/v1/sites/nearby")
    Call<GetSitesResponse> d(@Query("latitude") String lat, @Query("longitude") String str, @Query("radius") float radius, @Query("page") Integer page, @Query("per") Integer per, @Query("operational_status") String operationalStatus);

    @POST("/m/v1/customer/password")
    Call<Void> e(@Body RequestNewPasswordRequest orderEventRequest);

    @PUT("/m/v1/orders/{code}")
    Call<OrderResponse> f(@Path("code") String orderId, @Body UpdateOrderRequest updateOrderRequest);

    @PATCH("/m/v1/customer/sign_up")
    Call<CustomerResponse> g(@Body SignUpCustomerRequest signUpCustomerRequest);

    @POST("/m/v1/events")
    Call<Void> h(@Body OrderEventRequest orderEventRequest);

    @PATCH("/m/v1/customer/password")
    Call<CustomerResponse> i(@Body SetNewPasswordRequest setNewPasswordRequest);

    @PATCH("/m/v1/customer")
    Call<CustomerResponse> j(@Body UpdateCustomerRequest updateCustomerRequest);

    @GET("/m/v1/sites")
    Call<GetSitesResponse> k(@Query("q") String query, @Query("page") Integer page, @Query("per") Integer per, @Query("operational_status") String operationalStatus, @Query("match_partner_identifier") Boolean matchPartnerIdentifier);

    @POST("/m/v1/customer")
    Call<CustomerResponse> l(@Body CreateCustomerRequest createCustomerRequest);

    @GET("/m/v1/notify/notifications")
    Call<GetNotifyNotificationsResponse> m(@Query("latitude") String lat, @Query("longitude") String str, @Query("radius") float radius);

    @POST("/m/v1/notify/campaign_events")
    Call<Void> n(@Body NotifyEventRequest notifyEvent);

    @PATCH("/m/v1/app/instance")
    Call<Void> o(@Body PatchAppInstanceRequest patchAppRequest);
}
