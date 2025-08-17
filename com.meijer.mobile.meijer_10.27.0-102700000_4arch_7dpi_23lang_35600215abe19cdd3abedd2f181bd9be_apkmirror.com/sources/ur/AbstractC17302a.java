package ur;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mk.f;
import mk.i;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0007\n\u000b\fB\u0015\b\u0004\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lur/a;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "productCode", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "d", "c", "b", "Lur/a$a;", "Lur/a$b;", "Lur/a$c;", "Lur/a$d;", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ur.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC17302a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String productCode;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lur/a$a;", "Lur/a;", "", "quantityToAdd", "Lmk/f;", "product", "<init>", "(DLmk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "D", "c", "()D", "Lmk/f;", "()Lmk/f;", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ur.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class Add extends AbstractC17302a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final double quantityToAdd;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final f product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Add)) {
                return false;
            }
            Add add = (Add) other;
            return Double.compare(this.quantityToAdd, add.quantityToAdd) == 0 && Intrinsics.e(this.product, add.product);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Add(double d10, f product) {
            super(product.getCode(), null);
            Intrinsics.j(product, "product");
            this.quantityToAdd = d10;
            this.product = product;
        }

        /* renamed from: b, reason: from getter */
        public final f getProduct() {
            return this.product;
        }

        /* renamed from: c, reason: from getter */
        public final double getQuantityToAdd() {
            return this.quantityToAdd;
        }

        public int hashCode() {
            return (Double.hashCode(this.quantityToAdd) * 31) + this.product.hashCode();
        }

        public String toString() {
            return "Add(quantityToAdd=" + this.quantityToAdd + ", product=" + this.product + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lur/a$b;", "Lur/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ur.a$b */
    public static final /* data */ class b extends AbstractC17302a {

        /* renamed from: b, reason: collision with root package name */
        public static final b f163256b = new b();

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        private b() {
            super("-1", null);
        }

        public String toString() {
            return "NoOperation";
        }

        public int hashCode() {
            return 1315106152;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lur/a$c;", "Lur/a;", "Lmk/f;", "product", "", "isRemoveFromEllipsis", "<init>", "(Lmk/f;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lmk/f;", "()Lmk/f;", "c", "Z", "()Z", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ur.a$c, reason: from toString */
    public static final /* data */ class Remove extends AbstractC17302a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final f product;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRemoveFromEllipsis;

        public /* synthetic */ Remove(f fVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(fVar, (i10 & 2) != 0 ? false : z10);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Remove)) {
                return false;
            }
            Remove remove = (Remove) other;
            return Intrinsics.e(this.product, remove.product) && this.isRemoveFromEllipsis == remove.isRemoveFromEllipsis;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Remove(f product, boolean z10) {
            super(product.getCode(), null);
            Intrinsics.j(product, "product");
            this.product = product;
            this.isRemoveFromEllipsis = z10;
        }

        /* renamed from: b, reason: from getter */
        public final f getProduct() {
            return this.product;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsRemoveFromEllipsis() {
            return this.isRemoveFromEllipsis;
        }

        public int hashCode() {
            return (this.product.hashCode() * 31) + Boolean.hashCode(this.isRemoveFromEllipsis);
        }

        public String toString() {
            return "Remove(product=" + this.product + ", isRemoveFromEllipsis=" + this.isRemoveFromEllipsis + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lur/a$d;", "Lur/a;", "Lmk/i;", "productQuantity", "<init>", "(Lmk/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lmk/i;", "()Lmk/i;", "cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ur.a$d, reason: from toString */
    public static final /* data */ class Update extends AbstractC17302a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final i productQuantity;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Update) && Intrinsics.e(this.productQuantity, ((Update) other).productQuantity);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Update(i productQuantity) {
            super(productQuantity.h2(), null);
            Intrinsics.j(productQuantity, "productQuantity");
            this.productQuantity = productQuantity;
        }

        /* renamed from: b, reason: from getter */
        public final i getProductQuantity() {
            return this.productQuantity;
        }

        public int hashCode() {
            return this.productQuantity.hashCode();
        }

        public String toString() {
            return "Update(productQuantity=" + this.productQuantity + ')';
        }
    }

    public /* synthetic */ AbstractC17302a(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private AbstractC17302a(String str) {
        this.productCode = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getProductCode() {
        return this.productCode;
    }
}
