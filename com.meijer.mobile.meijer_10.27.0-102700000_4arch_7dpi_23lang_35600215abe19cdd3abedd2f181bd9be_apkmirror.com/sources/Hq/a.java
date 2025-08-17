package Hq;

import com.meijer.mobile.shoppinglist.service.models.FavoriteListItemWireModel;
import com.meijer.mobile.shoppinglist.service.requests.DeleteFavoritesListItemsRequest;
import com.meijer.mobile.shoppinglist.service.responses.FavoriteListAddItemResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H¦@¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"LHq/a;", "", "", "Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;", "b", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "favoriteListItem", "Lcom/meijer/mobile/shoppinglist/service/responses/FavoriteListAddItemResponse;", "d", "(Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/shoppinglist/service/requests/DeleteFavoritesListItemsRequest;", "request", "Lretrofit2/Response;", "", "c", "(Lcom/meijer/mobile/shoppinglist/service/requests/DeleteFavoritesListItemsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {
    Object a(List<FavoriteListItemWireModel> list, Continuation<? super FavoriteListAddItemResponse> continuation);

    Object b(Continuation<? super List<FavoriteListItemWireModel>> continuation);

    Object c(DeleteFavoritesListItemsRequest deleteFavoritesListItemsRequest, Continuation<? super Response<Unit>> continuation);

    Object d(FavoriteListItemWireModel favoriteListItemWireModel, Continuation<? super FavoriteListAddItemResponse> continuation);
}
