package hq;

import Xp.ShopAndScanItem;
import Xp.ShopAndScanTrip;
import bk.AbstractC6392a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0011B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, d2 = {"Lhq/c;", "", "Lbk/a;", "subtotal", "itemCount", "<init>", "(Lbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "b", "()Lbk/a;", "c", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hq.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class ShopAndScanCartTotalsDecorator {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f136086d = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a subtotal;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a itemCount;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J+\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lhq/c$a;", "", "<init>", "()V", "", "LXp/c;", "items", "LXp/f$b;", "cart", "Lhq/c;", "d", "(Ljava/util/List;LXp/f$b;)Lhq/c;", "b", "(Ljava/util/List;)Lhq/c;", "Lbk/a;", "c", "(Ljava/util/List;)Lbk/a;", "e", "", "isGreenville", "a", "(ZLjava/util/List;LXp/f$b;)Lhq/c;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: hq.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final ShopAndScanCartTotalsDecorator b(List<ShopAndScanItem> items) {
            return new ShopAndScanCartTotalsDecorator(c(items), e(items));
        }

        private final AbstractC6392a c(List<ShopAndScanItem> list) {
            Double netPriceWithDeposit;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ShopAndScanItem) obj).getIsAddedToCart()) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                ShopAndScanItem.Price price = ((ShopAndScanItem) it.next()).getPrice();
                dDoubleValue += (price == null || (netPriceWithDeposit = price.getNetPriceWithDeposit()) == null) ? 0.0d : netPriceWithDeposit.doubleValue();
            }
            return AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117950r, Double.valueOf(dDoubleValue));
        }

        private final ShopAndScanCartTotalsDecorator d(List<ShopAndScanItem> items, ShopAndScanTrip.CartDetails cart) {
            return new ShopAndScanCartTotalsDecorator(AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117950r, Double.valueOf(cart.getNowTotal())), e(items));
        }

        private final AbstractC6392a e(List<ShopAndScanItem> list) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((ShopAndScanItem) obj).getIsAddedToCart()) {
                    arrayList.add(obj);
                }
            }
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            int i10 = com.meijer.mobile.shopandscan.c.f117720a;
            Iterator it = arrayList.iterator();
            int quantity = 0;
            while (it.hasNext()) {
                quantity += ((ShopAndScanItem) it.next()).getQuantity();
            }
            return companion.b(i10, quantity, new Object[0]);
        }

        public final ShopAndScanCartTotalsDecorator a(boolean isGreenville, List<ShopAndScanItem> items, ShopAndScanTrip.CartDetails cart) {
            Intrinsics.j(items, "items");
            Intrinsics.j(cart, "cart");
            return isGreenville ? d(items, cart) : b(items);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShopAndScanCartTotalsDecorator() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanCartTotalsDecorator)) {
            return false;
        }
        ShopAndScanCartTotalsDecorator shopAndScanCartTotalsDecorator = (ShopAndScanCartTotalsDecorator) other;
        return Intrinsics.e(this.subtotal, shopAndScanCartTotalsDecorator.subtotal) && Intrinsics.e(this.itemCount, shopAndScanCartTotalsDecorator.itemCount);
    }

    public ShopAndScanCartTotalsDecorator(AbstractC6392a subtotal, AbstractC6392a itemCount) {
        Intrinsics.j(subtotal, "subtotal");
        Intrinsics.j(itemCount, "itemCount");
        this.subtotal = subtotal;
        this.itemCount = itemCount;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getItemCount() {
        return this.itemCount;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getSubtotal() {
        return this.subtotal;
    }

    public int hashCode() {
        return (this.subtotal.hashCode() * 31) + this.itemCount.hashCode();
    }

    public String toString() {
        return "ShopAndScanCartTotalsDecorator(subtotal=" + this.subtotal + ", itemCount=" + this.itemCount + ')';
    }

    public /* synthetic */ ShopAndScanCartTotalsDecorator(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? AbstractC6392a.INSTANCE.d(com.meijer.mobile.shopandscan.e.f117950r, Double.valueOf(0.0d)) : abstractC6392a, (i10 & 2) != 0 ? AbstractC6392a.INSTANCE.b(com.meijer.mobile.shopandscan.c.f117720a, 0, new Object[0]) : abstractC6392a2);
    }
}
