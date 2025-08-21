package com.meijer.mobile.meijer.activity.cart;

import com.meijer.mobile.meijer.activity.cart.r1;
import hn.ReadOnlyProductListDecorator;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vs.CartProductListDecorator;
import wj.C17896a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/r1;", "Landroidx/lifecycle/c0;", "<init>", "()V", "", "Lvs/b;", "unavailableForDeliveryList", "", "o", "(Ljava/util/List;)V", "Lwj/a;", "Lcom/meijer/mobile/meijer/activity/cart/r1$a;", "", "a", "Lwj/a;", "flowStore", "Lpv/P;", "n", "()Lpv/P;", "viewState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class r1 extends androidx.view.c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C17896a<ViewState, Object> flowStore = new C17896a<>(new ViewState(null, 1, 0 == true ? 1 : 0));

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/meijer/mobile/meijer/activity/cart/r1$a;", "", "", "Lhn/r;", "unavailableForDeliveryList", "<init>", "(Ljava/util/List;)V", "a", "(Ljava/util/List;)Lcom/meijer/mobile/meijer/activity/cart/r1$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "b", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.cart.r1$a, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ReadOnlyProductListDecorator> unavailableForDeliveryList;

        /* JADX WARN: Multi-variable type inference failed */
        public ViewState() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final ViewState a(List<ReadOnlyProductListDecorator> unavailableForDeliveryList) {
            Intrinsics.j(unavailableForDeliveryList, "unavailableForDeliveryList");
            return new ViewState(unavailableForDeliveryList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ViewState) && Intrinsics.e(this.unavailableForDeliveryList, ((ViewState) other).unavailableForDeliveryList);
        }

        public int hashCode() {
            return this.unavailableForDeliveryList.hashCode();
        }

        public String toString() {
            return "ViewState(unavailableForDeliveryList=" + this.unavailableForDeliveryList + ')';
        }

        public ViewState(List<ReadOnlyProductListDecorator> unavailableForDeliveryList) {
            Intrinsics.j(unavailableForDeliveryList, "unavailableForDeliveryList");
            this.unavailableForDeliveryList = unavailableForDeliveryList;
        }

        public final List<ReadOnlyProductListDecorator> b() {
            return this.unavailableForDeliveryList;
        }

        public /* synthetic */ ViewState(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.m() : list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewState p(List list, ViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        List<CartProductListDecorator> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (CartProductListDecorator cartProductListDecorator : list2) {
            arrayList.add(new ReadOnlyProductListDecorator(cartProductListDecorator.getEntryNumber(), cartProductListDecorator.getTitle(), cartProductListDecorator.getNotes(), cartProductListDecorator.getProduct(), cartProductListDecorator.getThumbnail(), cartProductListDecorator.getIsOnSale(), cartProductListDecorator.getHasMperksOffers(), cartProductListDecorator.getQuantity(), cartProductListDecorator.getTotalPriceRawValue(), cartProductListDecorator.getStockInfo().e(), cartProductListDecorator.getSavingsAmount(), cartProductListDecorator.getProductSavings(), null, false));
        }
        return oldState.a(arrayList);
    }

    public final pv.P<ViewState> n() {
        return this.flowStore.b();
    }

    public final void o(final List<CartProductListDecorator> unavailableForDeliveryList) {
        Intrinsics.j(unavailableForDeliveryList, "unavailableForDeliveryList");
        this.flowStore.d(new Function1() { // from class: com.meijer.mobile.meijer.activity.cart.q1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r1.p(unavailableForDeliveryList, (r1.ViewState) obj);
            }
        });
    }
}
