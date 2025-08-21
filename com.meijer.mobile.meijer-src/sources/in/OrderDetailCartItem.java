package in;

import com.meijer.mobile.meijer.activity.checkout.review.EntryDecorator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0014\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lin/c;", "", "", "Lcom/meijer/mobile/meijer/activity/checkout/review/P1;", "showItems", "totalCartItems", "", "extraItemCount", "", "error", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "getTotalCartItems", "c", "Ljava/lang/String;", "d", "Ljava/lang/Integer;", "getError", "()Ljava/lang/Integer;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: in.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrderDetailCartItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EntryDecorator> showItems;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EntryDecorator> totalCartItems;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String extraItemCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer error;

    public OrderDetailCartItem() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderDetailCartItem)) {
            return false;
        }
        OrderDetailCartItem orderDetailCartItem = (OrderDetailCartItem) other;
        return Intrinsics.e(this.showItems, orderDetailCartItem.showItems) && Intrinsics.e(this.totalCartItems, orderDetailCartItem.totalCartItems) && Intrinsics.e(this.extraItemCount, orderDetailCartItem.extraItemCount) && Intrinsics.e(this.error, orderDetailCartItem.error);
    }

    public OrderDetailCartItem(List<EntryDecorator> list, List<EntryDecorator> totalCartItems, String str, Integer num) {
        Intrinsics.j(totalCartItems, "totalCartItems");
        this.showItems = list;
        this.totalCartItems = totalCartItems;
        this.extraItemCount = str;
        this.error = num;
    }

    /* renamed from: a, reason: from getter */
    public final String getExtraItemCount() {
        return this.extraItemCount;
    }

    public final List<EntryDecorator> b() {
        return this.showItems;
    }

    public int hashCode() {
        List<EntryDecorator> list = this.showItems;
        int iHashCode = (((list == null ? 0 : list.hashCode()) * 31) + this.totalCartItems.hashCode()) * 31;
        String str = this.extraItemCount;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.error;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "OrderDetailCartItem(showItems=" + this.showItems + ", totalCartItems=" + this.totalCartItems + ", extraItemCount=" + this.extraItemCount + ", error=" + this.error + ')';
    }

    public /* synthetic */ OrderDetailCartItem(List list, List list2, String str, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt.m() : list, (i10 & 2) != 0 ? CollectionsKt.m() : list2, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : num);
    }
}
