package Rl;

import Ol.PicklistItem;
import Ol.Transaction;
import com.meijer.mobile.greenville.model.request.item.add.AddItemRequest;
import com.meijer.mobile.greenville.model.request.item.remove.RemoveItemRequest;
import com.meijer.mobile.greenville.model.request.item.update.UpdateItemRequest;
import com.meijer.mobile.greenville.model.request.transferstatus.TransferStatusRequest;
import com.meijer.mobile.greenville.model.request.trip.cancel.CancelTripRequest;
import com.meijer.mobile.greenville.model.request.trip.start.StartTripRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H¦@¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"LRl/a;", "", "Lcom/meijer/mobile/greenville/model/request/transferstatus/TransferStatusRequest;", "request", "LOl/e;", "b", "(Lcom/meijer/mobile/greenville/model/request/transferstatus/TransferStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequest;", "a", "(Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/trip/cancel/CancelTripRequest;", "d", "(Lcom/meijer/mobile/greenville/model/request/trip/cancel/CancelTripRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;", "c", "(Lcom/meijer/mobile/greenville/model/request/item/add/AddItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;", "g", "(Lcom/meijer/mobile/greenville/model/request/item/update/UpdateItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;", "e", "(Lcom/meijer/mobile/greenville/model/request/item/remove/RemoveItemRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "LOl/d;", "f", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface a {
    Object a(StartTripRequest startTripRequest, Continuation<? super Transaction> continuation);

    Object b(TransferStatusRequest transferStatusRequest, Continuation<? super Transaction> continuation);

    Object c(AddItemRequest addItemRequest, Continuation<? super Transaction> continuation);

    Object d(CancelTripRequest cancelTripRequest, Continuation<? super Transaction> continuation);

    Object e(RemoveItemRequest removeItemRequest, Continuation<? super Transaction> continuation);

    Object f(int i10, Continuation<? super List<PicklistItem>> continuation);

    Object g(UpdateItemRequest updateItemRequest, Continuation<? super Transaction> continuation);
}
