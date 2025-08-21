package Wp;

import Vp.ActiveTripRequest;
import Vp.AddItemRequest;
import Vp.LookupItemRequest;
import Vp.ResumeTripRequest;
import Vp.StartTripRequest;
import Vp.UpdateItemRequest;
import Xp.ShopAndScanLookupItem;
import Xp.ShopAndScanTrip;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import pv.InterfaceC16553F;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H¦@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0013H¦@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001f\u001a\u00020\r2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH¦@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH¦@¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\rH¦@¢\u0006\u0004\b#\u0010\u000fJ\u0018\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H¦@¢\u0006\u0004\b&\u0010'R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006,À\u0006\u0001"}, d2 = {"LWp/a;", "", "LVp/a;", "request", "LXp/f;", "k", "(LVp/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVp/f;", "h", "(LVp/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVp/e;", "d", "(LVp/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "j", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVp/b;", "c", "(LVp/b;)V", "LVp/i;", "e", "(LVp/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LVp/d;", "LXp/d;", "i", "(LVp/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerId", "", "itemId", "g", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "l", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "", "isCheckoutInProgress", "b", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lpv/F;", "a", "()Lpv/F;", "tripStream", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {
    InterfaceC16553F<ShopAndScanTrip> a();

    Object b(boolean z10, Continuation<? super Unit> continuation);

    void c(AddItemRequest request);

    Object d(ResumeTripRequest resumeTripRequest, Continuation<? super ShopAndScanTrip> continuation);

    Object e(UpdateItemRequest updateItemRequest, Continuation<? super Unit> continuation);

    Object f(Continuation<? super Unit> continuation);

    Object g(long j10, String str, Continuation<? super Unit> continuation);

    Object h(StartTripRequest startTripRequest, Continuation<? super ShopAndScanTrip> continuation);

    Object i(LookupItemRequest lookupItemRequest, Continuation<? super ShopAndScanLookupItem> continuation);

    Object j(Continuation<? super Unit> continuation);

    Object k(ActiveTripRequest activeTripRequest, Continuation<? super ShopAndScanTrip> continuation);

    Object l(String str, Continuation<? super Unit> continuation);
}
