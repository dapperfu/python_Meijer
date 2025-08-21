package Hq;

import com.meijer.mobile.shoppinglist.service.models.FavoriteListItemWireModel;
import com.meijer.mobile.shoppinglist.service.models.ShoppingListItemWireModel;
import com.meijer.mobile.shoppinglist.service.requests.ShoppingListItemReorderRequest;
import com.meijer.mobile.shoppinglist.service.responses.ShoppingListAddItemResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import retrofit2.Response;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H¦@¢\u0006\u0004\b\b\u0010\u0005J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H¦@¢\u0006\u0004\b\t\u0010\u0005J\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H¦@¢\u0006\u0004\b\r\u0010\fJ\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u000e\u0010\fJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u000f\u0010\fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u0011\u0010\fJ\u001e\u0010\u0013\u001a\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0016\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0017\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\u00102\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0002H¦@¢\u0006\u0004\b\u001b\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"LHq/c;", "", "", "Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;", "k", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lretrofit2/Response;", "", "j", "h", "shoppingListItem", "d", "(Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "b", "g", "Lcom/meijer/mobile/shoppinglist/service/responses/ShoppingListAddItemResponse;", "e", "shoppingListItems", "i", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/shoppinglist/service/requests/ShoppingListItemReorderRequest;", "request", "c", "(Lcom/meijer/mobile/shoppinglist/service/requests/ShoppingListItemReorderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;", "favoriteListItems", "a", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface c {
    Object a(List<FavoriteListItemWireModel> list, Continuation<? super ShoppingListAddItemResponse> continuation);

    Object b(ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super Response<Unit>> continuation);

    Object c(ShoppingListItemReorderRequest shoppingListItemReorderRequest, Continuation<? super Response<Unit>> continuation);

    Object d(ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super Response<Unit>> continuation);

    Object e(ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super ShoppingListAddItemResponse> continuation);

    Object f(ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super ShoppingListItemWireModel> continuation);

    Object g(ShoppingListItemWireModel shoppingListItemWireModel, Continuation<? super Response<Unit>> continuation);

    Object h(Continuation<? super Response<Unit>> continuation);

    Object i(List<ShoppingListItemWireModel> list, Continuation<? super ShoppingListAddItemResponse> continuation);

    Object j(Continuation<? super Response<Unit>> continuation);

    Object k(Continuation<? super List<ShoppingListItemWireModel>> continuation);
}
