package qp;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J~\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\f\b\u0001\u0010\u0006\u001a\u00060\u0002j\u0002`\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\r\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lqp/c;", "", "", "adobeId", "storeId", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "digitalId", "itemIds", "quantities", "prices", "pageId", "eventType", "environment", "Lretrofit2/Response;", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sponsored_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qp.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC16595c {
    @GET("criteo/v1/order/confirm")
    Object a(@Query("retailer-visitor-id") String str, @Query("regionId") String str2, @Query("transaction-id") String str3, @Query("customer-id") String str4, @Query("item") String str5, @Query("quantity") String str6, @Query("price") String str7, @Query("page-id") String str8, @Query("event-type") String str9, @Query("environment") String str10, Continuation<? super Response<Unit>> continuation);

    static /* synthetic */ Object b(InterfaceC16595c interfaceC16595c, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Continuation continuation, int i10, Object obj) {
        if (obj == null) {
            return interfaceC16595c.a(str, str2, str3, str4, str5, str6, str7, (i10 & 128) != 0 ? "trackTransaction_API_app" : str8, (i10 & 256) != 0 ? "trackTransaction" : str9, (i10 & 512) != 0 ? "aa" : str10, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendOrderInfoToCriteo");
    }
}
