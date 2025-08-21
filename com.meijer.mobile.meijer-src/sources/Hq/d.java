package Hq;

import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.shoppinglist.service.models.ShoppingListItemWireModel;
import com.meijer.mobile.shoppinglist.service.requests.AddFavoriteItemsToShoppingListRequest;
import com.meijer.mobile.shoppinglist.service.requests.AddFavoritesItemsRequest;
import com.meijer.mobile.shoppinglist.service.requests.DeleteFavoritesListItemsRequest;
import com.meijer.mobile.shoppinglist.service.requests.ShoppingListAddItemRequest;
import com.meijer.mobile.shoppinglist.service.requests.ShoppingListItemReorderRequest;
import com.meijer.mobile.shoppinglist.service.responses.FavoriteListAddItemResponse;
import com.meijer.mobile.shoppinglist.service.responses.GetFavoritesListResponse;
import com.meijer.mobile.shoppinglist.service.responses.GetShoppingListResponse;
import com.meijer.mobile.shoppinglist.service.responses.ShoppingListAddItemResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\u000bJ6\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH§@¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001a\u001a\u00020\u00182\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0019\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u001c\u0010\u0017J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u001d\u0010\u0017J*\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u001f\u001a\u00020\u001eH§@¢\u0006\u0004\b \u0010!J$\u0010$\u001a\u00020\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010#\u001a\u00020\"H§@¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020&2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b'\u0010\u0006J$\u0010+\u001a\u00020*2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010)\u001a\u00020(H§@¢\u0006\u0004\b+\u0010,J*\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010.\u001a\u00020-H§@¢\u0006\u0004\b/\u00100ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00061À\u0006\u0001"}, d2 = {"LHq/d;", "", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "authorizationToken", "Lcom/meijer/mobile/shoppinglist/service/responses/GetShoppingListResponse;", "h", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/shoppinglist/service/requests/ShoppingListAddItemRequest;", "shoppingListAddItemRequest", "Lcom/meijer/mobile/shoppinglist/service/responses/ShoppingListAddItemResponse;", "b", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/shoppinglist/service/requests/ShoppingListAddItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "", "onlyCompleted", "Lretrofit2/Response;", "", "i", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "itemId", "d", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;", "item", "j", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;JLcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "k", "a", "Lcom/meijer/mobile/shoppinglist/service/requests/ShoppingListItemReorderRequest;", "request", "g", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/shoppinglist/service/requests/ShoppingListItemReorderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/shoppinglist/service/requests/AddFavoriteItemsToShoppingListRequest;", "listItems", "l", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/shoppinglist/service/requests/AddFavoriteItemsToShoppingListRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/shoppinglist/service/responses/GetFavoritesListResponse;", "f", "Lcom/meijer/mobile/shoppinglist/service/requests/AddFavoritesItemsRequest;", "addFavoritesItemsRequest", "Lcom/meijer/mobile/shoppinglist/service/responses/FavoriteListAddItemResponse;", "e", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/shoppinglist/service/requests/AddFavoritesItemsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/shoppinglist/service/requests/DeleteFavoritesListItemsRequest;", "itemIds", "c", "(Lcom/meijer/mobile/authentication/core/model/BearerToken;Lcom/meijer/mobile/shoppinglist/service/requests/DeleteFavoritesListItemsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface d {
    @Headers({"Accept: application/vnd.meijer.listManagement.listItem-v1.0+json"})
    @PUT("shoppinglist/MarkAsNotCompleted/{itemId}")
    Object a(@Header("Authorization") BearerToken bearerToken, @Path("itemId") long j10, Continuation<? super Response<Unit>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.listManagement.list-v1.0+json", "Accept: application/vnd.meijer.listManagement.list-v1.0+json"})
    @POST("shoppinglist/AddListItem")
    Object b(@Header("Authorization") BearerToken bearerToken, @Body ShoppingListAddItemRequest shoppingListAddItemRequest, Continuation<? super ShoppingListAddItemResponse> continuation);

    @Headers({"Content-Type: application/vnd.meijer.listManagement.favorites-v1.0+json", "Accept: application/vnd.meijer.listManagement.favorites-v1.0+json"})
    @POST("shoppinglist/DeleteBulkListItems")
    Object c(@Header("Authorization") BearerToken bearerToken, @Body DeleteFavoritesListItemsRequest deleteFavoritesListItemsRequest, Continuation<? super Response<Unit>> continuation);

    @DELETE("shoppinglist/DeleteListItem/{itemId}")
    Object d(@Header("Authorization") BearerToken bearerToken, @Path("itemId") long j10, Continuation<? super Response<Unit>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.listManagement.favorites-v1.0+json", "Accept: application/vnd.meijer.listManagement.favorites-v1.0+json"})
    @POST("shoppinglist/AddFavoritesListItem")
    Object e(@Header("Authorization") BearerToken bearerToken, @Body AddFavoritesItemsRequest addFavoritesItemsRequest, Continuation<? super FavoriteListAddItemResponse> continuation);

    @Headers({"Accept: application/vnd.meijer.favorites-v1.0+json"})
    @GET("shoppinglist/GetFavoritesList")
    Object f(@Header("Authorization") BearerToken bearerToken, Continuation<? super GetFavoritesListResponse> continuation);

    @Headers({"Content-Type: application/vnd.meijer.listManagement.listItem-v1.0+json"})
    @POST("shoppinglist/listItem/order")
    Object g(@Header("Authorization") BearerToken bearerToken, @Body ShoppingListItemReorderRequest shoppingListItemReorderRequest, Continuation<? super Response<Unit>> continuation);

    @Headers({"Accept: application/meijer.shoppingList.ShoppingList-v1.0+json"})
    @GET("shoppinglist/GetList")
    Object h(@Header("Authorization") BearerToken bearerToken, Continuation<? super GetShoppingListResponse> continuation);

    @DELETE("shoppinglist/DeleteAllListItems")
    @Headers({"Accept: application/vnd.meijer.listManagement.list-v1.0+json", "Content-Type: application/vnd.meijer.listManagement.list-v1.0+json"})
    Object i(@Header("Authorization") BearerToken bearerToken, @QueryMap Map<String, Boolean> map, Continuation<? super Response<Unit>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.listManagement.listItem-v1.0+json", "Accept: application/vnd.meijer.listManagement.listItem-v1.0+json"})
    @PUT("shoppinglist/UpdateListItem/{itemId}")
    Object j(@Header("Authorization") BearerToken bearerToken, @Path("itemId") long j10, @Body ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super ShoppingListItemWireModel> continuation);

    @Headers({"Accept: application/vnd.meijer.listManagement.listItem-v1.0+json"})
    @PUT("shoppinglist/MarkAsCompleted/{itemId}")
    Object k(@Header("Authorization") BearerToken bearerToken, @Path("itemId") long j10, Continuation<? super Response<Unit>> continuation);

    @Headers({"Content-Type: application/vnd.meijer.listManagement.list-v1.0+json", "Accept: application/vnd.meijer.listManagement.list-v1.0+json"})
    @POST("shoppinglist/AddListItem")
    Object l(@Header("Authorization") BearerToken bearerToken, @Body AddFavoriteItemsToShoppingListRequest addFavoriteItemsToShoppingListRequest, Continuation<? super ShoppingListAddItemResponse> continuation);
}
