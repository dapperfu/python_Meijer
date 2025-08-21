package com.radiusnetworks.flybuy.api.network;

import com.radiusnetworks.flybuy.api.model.AnalyticsEventsRequest;
import com.radiusnetworks.flybuy.api.model.AppInstanceResponse;
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

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002H'¢\u0006\u0004\b\f\u0010\u0005J\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H'¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u0019H'¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u001e\u001a\u00020\u001dH'¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\"\u001a\u00020!H'¢\u0006\u0004\b#\u0010$J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020%0\u0002H'¢\u0006\u0004\b\u0017\u0010\u0005J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020(0\u00022\b\b\u0001\u0010'\u001a\u00020&H'¢\u0006\u0004\b\f\u0010)J\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020(0\u00022\b\b\u0001\u0010+\u001a\u00020*H'¢\u0006\u0004\b\u0004\u0010,J)\u0010/\u001a\b\u0012\u0004\u0012\u00020(0\u00022\b\b\u0001\u0010+\u001a\u00020*2\b\b\u0001\u0010.\u001a\u00020-H'¢\u0006\u0004\b/\u00100J)\u00104\u001a\b\u0012\u0004\u0012\u00020(0\u00022\b\b\u0001\u00101\u001a\u00020*2\b\b\u0001\u00103\u001a\u000202H'¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u001e\u001a\u000206H'¢\u0006\u0004\b7\u00108JQ\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\u00022\n\b\u0001\u00109\u001a\u0004\u0018\u00010*2\n\b\u0001\u0010;\u001a\u0004\u0018\u00010:2\n\b\u0001\u0010<\u001a\u0004\u0018\u00010:2\n\b\u0001\u0010=\u001a\u0004\u0018\u00010*2\n\b\u0001\u0010?\u001a\u0004\u0018\u00010>H'¢\u0006\u0004\bA\u0010BJW\u0010G\u001a\b\u0012\u0004\u0012\u00020@0\u00022\b\b\u0001\u0010C\u001a\u00020*2\b\b\u0001\u0010D\u001a\u00020*2\b\b\u0001\u0010F\u001a\u00020E2\n\b\u0001\u0010;\u001a\u0004\u0018\u00010:2\n\b\u0001\u0010<\u001a\u0004\u0018\u00010:2\n\b\u0001\u0010=\u001a\u0004\u0018\u00010*H'¢\u0006\u0004\bG\u0010HJ3\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u00022\b\b\u0001\u0010C\u001a\u00020*2\b\b\u0001\u0010D\u001a\u00020*2\b\b\u0001\u0010F\u001a\u00020EH'¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010M\u001a\u00020LH'¢\u0006\u0004\bN\u0010OJ\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010Q\u001a\u00020PH'¢\u0006\u0004\b\u0004\u0010R¨\u0006S"}, d2 = {"Lcom/radiusnetworks/flybuy/api/network/w;", "", "Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/AppInstanceResponse;", "a", "()Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/PatchAppInstanceRequest;", "patchAppRequest", "Ljava/lang/Void;", "p", "(Lcom/radiusnetworks/flybuy/api/model/PatchAppInstanceRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/CustomerResponse;", "b", "Lcom/radiusnetworks/flybuy/api/model/CreateCustomerRequest;", "createCustomerRequest", "m", "(Lcom/radiusnetworks/flybuy/api/model/CreateCustomerRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/SignUpCustomerRequest;", "signUpCustomerRequest", "h", "(Lcom/radiusnetworks/flybuy/api/model/SignUpCustomerRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/LoginRequest;", "loginRequest", "c", "(Lcom/radiusnetworks/flybuy/api/model/LoginRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/UpdateCustomerRequest;", "updateCustomerRequest", "k", "(Lcom/radiusnetworks/flybuy/api/model/UpdateCustomerRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/RequestNewPasswordRequest;", "orderEventRequest", "f", "(Lcom/radiusnetworks/flybuy/api/model/RequestNewPasswordRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/SetNewPasswordRequest;", "setNewPasswordRequest", "j", "(Lcom/radiusnetworks/flybuy/api/model/SetNewPasswordRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/GetOrdersResponse;", "Lcom/radiusnetworks/flybuy/api/model/CreateOrderRequest;", "createOrderRequest", "Lcom/radiusnetworks/flybuy/api/model/OrderResponse;", "(Lcom/radiusnetworks/flybuy/api/model/CreateOrderRequest;)Lretrofit2/Call;", "", "code", "(Ljava/lang/String;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/ClaimOrderRequest;", "claimOrderRequest", "d", "(Ljava/lang/String;Lcom/radiusnetworks/flybuy/api/model/ClaimOrderRequest;)Lretrofit2/Call;", "orderId", "Lcom/radiusnetworks/flybuy/api/model/UpdateOrderRequest;", "updateOrderRequest", "g", "(Ljava/lang/String;Lcom/radiusnetworks/flybuy/api/model/UpdateOrderRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/OrderEventRequest;", "i", "(Lcom/radiusnetworks/flybuy/api/model/OrderEventRequest;)Lretrofit2/Call;", "query", "", "page", "per", "operationalStatus", "", "matchPartnerIdentifier", "Lcom/radiusnetworks/flybuy/api/model/GetSitesResponse;", "l", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;)Lretrofit2/Call;", "lat", "long", "", "radius", "e", "(Ljava/lang/String;Ljava/lang/String;FLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/GetNotifyNotificationsResponse;", "n", "(Ljava/lang/String;Ljava/lang/String;F)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/NotifyEventRequest;", "notifyEvent", "o", "(Lcom/radiusnetworks/flybuy/api/model/NotifyEventRequest;)Lretrofit2/Call;", "Lcom/radiusnetworks/flybuy/api/model/AnalyticsEventsRequest;", "analyticsEventsRequest", "(Lcom/radiusnetworks/flybuy/api/model/AnalyticsEventsRequest;)Lretrofit2/Call;", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface w {
    @GET("/m/v1/app/instance")
    Call<AppInstanceResponse> a();

    @POST("/m/v1/analytics/events")
    Call<Void> a(@Body AnalyticsEventsRequest analyticsEventsRequest);

    @GET("/m/v1/orders/{code}/edit")
    Call<OrderResponse> a(@Path("code") String code);

    @GET("/m/v1/customer")
    Call<CustomerResponse> b();

    @POST("/m/v1/orders")
    Call<OrderResponse> b(@Body CreateOrderRequest createOrderRequest);

    @GET("/m/v1/orders")
    Call<GetOrdersResponse> c();

    @POST("/m/v1/customer/sign_in")
    Call<CustomerResponse> c(@Body LoginRequest loginRequest);

    @PATCH("/m/v1/orders/{code}")
    Call<OrderResponse> d(@Path("code") String code, @Body ClaimOrderRequest claimOrderRequest);

    @GET("/m/v1/sites/nearby")
    Call<GetSitesResponse> e(@Query("latitude") String lat, @Query("longitude") String str, @Query("radius") float radius, @Query("page") Integer page, @Query("per") Integer per, @Query("operational_status") String operationalStatus);

    @POST("/m/v1/customer/password")
    Call<Void> f(@Body RequestNewPasswordRequest orderEventRequest);

    @PUT("/m/v1/orders/{code}")
    Call<OrderResponse> g(@Path("code") String orderId, @Body UpdateOrderRequest updateOrderRequest);

    @PATCH("/m/v1/customer/sign_up")
    Call<CustomerResponse> h(@Body SignUpCustomerRequest signUpCustomerRequest);

    @POST("/m/v1/events")
    Call<Void> i(@Body OrderEventRequest orderEventRequest);

    @PATCH("/m/v1/customer/password")
    Call<CustomerResponse> j(@Body SetNewPasswordRequest setNewPasswordRequest);

    @PATCH("/m/v1/customer")
    Call<CustomerResponse> k(@Body UpdateCustomerRequest updateCustomerRequest);

    @GET("/m/v1/sites")
    Call<GetSitesResponse> l(@Query("q") String query, @Query("page") Integer page, @Query("per") Integer per, @Query("operational_status") String operationalStatus, @Query("match_partner_identifier") Boolean matchPartnerIdentifier);

    @POST("/m/v1/customer")
    Call<CustomerResponse> m(@Body CreateCustomerRequest createCustomerRequest);

    @GET("/m/v1/notify/notifications")
    Call<GetNotifyNotificationsResponse> n(@Query("latitude") String lat, @Query("longitude") String str, @Query("radius") float radius);

    @POST("/m/v1/notify/campaign_events")
    Call<Void> o(@Body NotifyEventRequest notifyEvent);

    @PATCH("/m/v1/app/instance")
    Call<Void> p(@Body PatchAppInstanceRequest patchAppRequest);
}
