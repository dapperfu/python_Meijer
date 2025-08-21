package Fl;

import Hl.FlyBuyOrderDetail;
import com.meijer.mobile.fulfillment.flybuy.api.models.FlyBuyOrderData;
import com.meijer.mobile.fulfillment.flybuy.api.models.FlyBuyOrderResponse;
import com.meijer.mobile.fulfillment.flybuy.api.models.PagesResponse;
import com.radiusnetworks.flybuy.sdk.data.customer.CustomerState;
import com.radiusnetworks.flybuy.sdk.data.order.OrderState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyOrderResponse;", "LHl/b;", "c", "(Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyOrderResponse;)LHl/b;", "", "customerStatus", "LHl/b$a$a;", "a", "(Ljava/lang/String;)LHl/b$a$a;", "orderStatus", "LHl/b$a$b;", "b", "(Ljava/lang/String;)LHl/b$a$b;", "flybuy_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class c {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final FlyBuyOrderDetail.Companion.EnumC0213a a(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1402931637:
                    if (str.equals("completed")) {
                        return FlyBuyOrderDetail.Companion.EnumC0213a.f13661g;
                    }
                    break;
                case -1049482625:
                    if (str.equals(CustomerState.NEARBY)) {
                        return FlyBuyOrderDetail.Companion.EnumC0213a.f13657c;
                    }
                    break;
                case -734206867:
                    if (str.equals(CustomerState.ARRIVED)) {
                        return FlyBuyOrderDetail.Companion.EnumC0213a.f13658d;
                    }
                    break;
                case 930490259:
                    if (str.equals("departed")) {
                        return FlyBuyOrderDetail.Companion.EnumC0213a.f13660f;
                    }
                    break;
                case 1028554472:
                    if (str.equals("created")) {
                        return FlyBuyOrderDetail.Companion.EnumC0213a.f13655a;
                    }
                    break;
                case 1116313165:
                    if (str.equals(CustomerState.WAITING)) {
                        return FlyBuyOrderDetail.Companion.EnumC0213a.f13659e;
                    }
                    break;
                case 1599815475:
                    if (str.equals(CustomerState.EN_ROUTE)) {
                        return FlyBuyOrderDetail.Companion.EnumC0213a.f13656b;
                    }
                    break;
            }
        }
        return FlyBuyOrderDetail.Companion.EnumC0213a.f13662h;
    }

    public static final FlyBuyOrderDetail.Companion.EnumC0214b b(String str) {
        return Intrinsics.e(str, "created") ? FlyBuyOrderDetail.Companion.EnumC0214b.f13665a : Intrinsics.e(str, OrderState.READY) ? FlyBuyOrderDetail.Companion.EnumC0214b.f13666b : FlyBuyOrderDetail.Companion.EnumC0214b.f13667c;
    }

    public static final FlyBuyOrderDetail c(FlyBuyOrderResponse flyBuyOrderResponse) {
        Intrinsics.j(flyBuyOrderResponse, "<this>");
        List<FlyBuyOrderData> listA = flyBuyOrderResponse.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(b.a((FlyBuyOrderData) it.next()));
        }
        PagesResponse flyBuyOrderPages = flyBuyOrderResponse.getFlyBuyOrderPages();
        return new FlyBuyOrderDetail(arrayList, flyBuyOrderPages != null ? d.a(flyBuyOrderPages) : null);
    }
}
