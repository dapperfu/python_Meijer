package ss;

import Co.ProductFullDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ts.ProductCardDecorator;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lss/a;", "", "b", "e", "d", "c", "a", "Lss/a$a;", "Lss/a$b;", "Lss/a$c;", "Lss/a$d;", "Lss/a$e;", "productcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ss.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC17146a {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lss/a$a;", "Lss/a;", "LCo/h;", "product", "<init>", "(LCo/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "productcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ss.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class FindSimilarItems implements InterfaceC17146a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FindSimilarItems) && Intrinsics.e(this.product, ((FindSimilarItems) other).product);
        }

        public FindSimilarItems(ProductFullDetails product) {
            Intrinsics.j(product, "product");
            this.product = product;
        }

        /* renamed from: a, reason: from getter */
        public final ProductFullDetails getProduct() {
            return this.product;
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        public String toString() {
            return "FindSimilarItems(product=" + this.product + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, d2 = {"Lss/a$b;", "Lss/a;", "Lts/a;", "itemClicked", "", "position", "<init>", "(Lts/a;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lts/a;", "()Lts/a;", "b", "I", "productcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ss.a$b, reason: from toString */
    public static final /* data */ class ProductItemClicked implements InterfaceC17146a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductCardDecorator itemClicked;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int position;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductItemClicked)) {
                return false;
            }
            ProductItemClicked productItemClicked = (ProductItemClicked) other;
            return Intrinsics.e(this.itemClicked, productItemClicked.itemClicked) && this.position == productItemClicked.position;
        }

        public ProductItemClicked(ProductCardDecorator itemClicked, int i10) {
            Intrinsics.j(itemClicked, "itemClicked");
            this.itemClicked = itemClicked;
            this.position = i10;
        }

        /* renamed from: a, reason: from getter */
        public final ProductCardDecorator getItemClicked() {
            return this.itemClicked;
        }

        /* renamed from: b, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        public int hashCode() {
            return (this.itemClicked.hashCode() * 31) + Integer.hashCode(this.position);
        }

        public String toString() {
            return "ProductItemClicked(itemClicked=" + this.itemClicked + ", position=" + this.position + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u0004R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000e\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lss/a$c;", "Lss/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "beacon", "b", "formatLevelBeacon", "productcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ss.a$c, reason: from toString */
    public static final /* data */ class SendCriteoLoadBeacon implements InterfaceC17146a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String beacon;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String formatLevelBeacon;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendCriteoLoadBeacon)) {
                return false;
            }
            SendCriteoLoadBeacon sendCriteoLoadBeacon = (SendCriteoLoadBeacon) other;
            return Intrinsics.e(this.beacon, sendCriteoLoadBeacon.beacon) && Intrinsics.e(this.formatLevelBeacon, sendCriteoLoadBeacon.formatLevelBeacon);
        }

        /* renamed from: a, reason: from getter */
        public final String getBeacon() {
            return this.beacon;
        }

        /* renamed from: b, reason: from getter */
        public final String getFormatLevelBeacon() {
            return this.formatLevelBeacon;
        }

        public int hashCode() {
            return (this.beacon.hashCode() * 31) + this.formatLevelBeacon.hashCode();
        }

        public String toString() {
            return "SendCriteoLoadBeacon(beacon=" + this.beacon + ", formatLevelBeacon=" + this.formatLevelBeacon + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lss/a$d;", "Lss/a;", "", "", "beacon", "formatLevelBeacon", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "productcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ss.a$d, reason: from toString */
    public static final /* data */ class SendCriteoOnViewBeacon implements InterfaceC17146a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> beacon;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String formatLevelBeacon;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SendCriteoOnViewBeacon)) {
                return false;
            }
            SendCriteoOnViewBeacon sendCriteoOnViewBeacon = (SendCriteoOnViewBeacon) other;
            return Intrinsics.e(this.beacon, sendCriteoOnViewBeacon.beacon) && Intrinsics.e(this.formatLevelBeacon, sendCriteoOnViewBeacon.formatLevelBeacon);
        }

        public SendCriteoOnViewBeacon(List<String> beacon, String formatLevelBeacon) {
            Intrinsics.j(beacon, "beacon");
            Intrinsics.j(formatLevelBeacon, "formatLevelBeacon");
            this.beacon = beacon;
            this.formatLevelBeacon = formatLevelBeacon;
        }

        public final List<String> a() {
            return this.beacon;
        }

        /* renamed from: b, reason: from getter */
        public final String getFormatLevelBeacon() {
            return this.formatLevelBeacon;
        }

        public int hashCode() {
            return (this.beacon.hashCode() * 31) + this.formatLevelBeacon.hashCode();
        }

        public String toString() {
            return "SendCriteoOnViewBeacon(beacon=" + this.beacon + ", formatLevelBeacon=" + this.formatLevelBeacon + ')';
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lss/a$e;", "Lss/a;", "LCo/h;", "productToAdd", "", "quantity", "<init>", "(LCo/h;D)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/h;", "()LCo/h;", "b", "D", "()D", "productcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ss.a$e, reason: from toString */
    public static final /* data */ class UpdateEntry implements InterfaceC17146a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ProductFullDetails productToAdd;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double quantity;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateEntry)) {
                return false;
            }
            UpdateEntry updateEntry = (UpdateEntry) other;
            return Intrinsics.e(this.productToAdd, updateEntry.productToAdd) && Double.compare(this.quantity, updateEntry.quantity) == 0;
        }

        public UpdateEntry(ProductFullDetails productToAdd, double d10) {
            Intrinsics.j(productToAdd, "productToAdd");
            this.productToAdd = productToAdd;
            this.quantity = d10;
        }

        /* renamed from: a, reason: from getter */
        public final ProductFullDetails getProductToAdd() {
            return this.productToAdd;
        }

        /* renamed from: b, reason: from getter */
        public final double getQuantity() {
            return this.quantity;
        }

        public int hashCode() {
            return (this.productToAdd.hashCode() * 31) + Double.hashCode(this.quantity);
        }

        public String toString() {
            return "UpdateEntry(productToAdd=" + this.productToAdd + ", quantity=" + this.quantity + ')';
        }
    }
}
