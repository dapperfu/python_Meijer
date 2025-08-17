package kn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rn.h0;
import xo.AbstractC18074b;
import xo.OrderHistoryHeaderDecorator;
import xo.OrdersItemDecorator;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0003*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ-\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkn/b;", "LDk/b;", "Lrn/h0$e;", "", "Lxo/e;", "fetchedItems", "", "rateAndTip", "<init>", "(Ljava/util/List;Z)V", "Lxo/b;", "g", "(Ljava/util/List;)Ljava/util/List;", "list", "f", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "d", "oldState", "e", "(Lrn/h0$e;)Lrn/h0$e;", "b", "Ljava/util/List;", "c", "Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: kn.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15196b extends Dk.b<h0.OrdersViewState> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<OrdersItemDecorator> fetchedItems;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean rateAndTip;

    public /* synthetic */ C15196b(List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? false : z10);
    }

    public C15196b(List<OrdersItemDecorator> fetchedItems, boolean z10) {
        Intrinsics.j(fetchedItems, "fetchedItems");
        this.fetchedItems = fetchedItems;
        this.rateAndTip = z10;
    }

    private final List<OrdersItemDecorator> d(List<OrdersItemDecorator> list, List<OrdersItemDecorator> list2) {
        List listM1 = CollectionsKt.m1(list);
        listM1.addAll(list2);
        return CollectionsKt.j1(listM1);
    }

    private final List<OrdersItemDecorator> f(List<OrdersItemDecorator> list, List<OrdersItemDecorator> list2) {
        List listM1 = CollectionsKt.m1(list);
        listM1.clear();
        listM1.addAll(list2);
        return CollectionsKt.j1(listM1);
    }

    private final List<AbstractC18074b> g(List<OrdersItemDecorator> list) {
        ArrayList arrayList = new ArrayList();
        OrdersItemDecorator.Companion companion = OrdersItemDecorator.INSTANCE;
        List<OrdersItemDecorator> listG = companion.g(list);
        List<OrdersItemDecorator> listI = companion.i(list);
        List<OrdersItemDecorator> list2 = listG;
        if (!list2.isEmpty()) {
            arrayList.add(OrderHistoryHeaderDecorator.INSTANCE.a("in_progress_order"));
            arrayList.addAll(list2);
        }
        List<OrdersItemDecorator> list3 = listI;
        if (!list3.isEmpty()) {
            arrayList.add(OrderHistoryHeaderDecorator.INSTANCE.a("past_order"));
            arrayList.addAll(list3);
        }
        if (list.isEmpty()) {
            arrayList = null;
        }
        return arrayList == null ? CollectionsKt.m() : arrayList;
    }

    @Override // Dk.b
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public h0.OrdersViewState b(h0.OrdersViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        List<OrdersItemDecorator> listD = !this.rateAndTip ? d(oldState.f(), this.fetchedItems) : f(oldState.f(), this.fetchedItems);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listD) {
            if (hashSet.add(((OrdersItemDecorator) obj).getOrderId())) {
                arrayList.add(obj);
            }
        }
        List<AbstractC18074b> listG = g(arrayList);
        boolean z10 = false;
        boolean z11 = (oldState.e().isEmpty() && this.fetchedItems.isEmpty()) ? false : true;
        if (oldState.e().isEmpty() && this.fetchedItems.isEmpty()) {
            z10 = true;
        }
        return h0.OrdersViewState.b(oldState, false, z10, z11, false, arrayList, listG, null, null, false, false, null, false, false, false, false, 32712, null);
    }
}
