package Hp;

import com.bazaarvoice.bvandroidsdk.BVAnalyticsEvent;
import com.bazaarvoice.bvandroidsdk.BVPixel;
import com.bazaarvoice.bvandroidsdk.BVTransaction;
import com.bazaarvoice.bvandroidsdk.BVTransactionEvent;
import com.bazaarvoice.bvandroidsdk.BVTransactionItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0014"}, d2 = {"LHp/c;", "", "Lcom/bazaarvoice/bvandroidsdk/BVPixel;", "bvPixel", "<init>", "(Lcom/bazaarvoice/bvandroidsdk/BVPixel;)V", "", "LHp/a;", "orderItems", "LHp/b;", "extras", "Lcom/bazaarvoice/bvandroidsdk/BVTransactionEvent;", "a", "(Ljava/util/List;LHp/b;)Lcom/bazaarvoice/bvandroidsdk/BVTransactionEvent;", "Lcom/bazaarvoice/bvandroidsdk/BVAnalyticsEvent;", "bvEvent", "", "b", "(Lcom/bazaarvoice/bvandroidsdk/BVAnalyticsEvent;)V", "Lcom/bazaarvoice/bvandroidsdk/BVPixel;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final BVPixel bvPixel;

    public c(BVPixel bvPixel) {
        Intrinsics.j(bvPixel, "bvPixel");
        this.bvPixel = bvPixel;
    }

    public final BVTransactionEvent a(List<BVOrderItem> orderItems, BVOrderTransactionExtras extras) {
        Intrinsics.j(orderItems, "orderItems");
        Intrinsics.j(extras, "extras");
        List<BVOrderItem> list = orderItems;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (BVOrderItem bVOrderItem : list) {
            arrayList.add(new BVTransactionItem.Builder(bVOrderItem.getUpc()).setName(bVOrderItem.getName()).setPrice(bVOrderItem.getPrice()).setQuantity(bVOrderItem.getQuantity()).build());
        }
        BVTransaction.Builder total = new BVTransaction.Builder().setItems(arrayList).setTax(extras.getTax()).setCurrency(extras.getCurrency()).setOrderId(extras.getOrderId()).setShipping(extras.getShipping()).setTotal(extras.getTotal());
        StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(extras.getDiscount())}, 1));
        Intrinsics.i(str, "format(...)");
        return new BVTransactionEvent(total.setOtherParams(MapsKt.o(TuplesKt.a("discount", str), TuplesKt.a("locale", "en-US"))).build());
    }

    public final void b(BVAnalyticsEvent bvEvent) {
        Intrinsics.j(bvEvent, "bvEvent");
        this.bvPixel.track(bvEvent);
    }
}
