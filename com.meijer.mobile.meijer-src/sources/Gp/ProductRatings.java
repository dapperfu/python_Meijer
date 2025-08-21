package Gp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u0013¨\u0006!"}, d2 = {"LGp/c;", "Landroid/os/Parcelable;", "", "averageRating", "", "totalReviewCount", "", "productId", "<init>", "(DILjava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "I", "c", "Ljava/lang/String;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Gp.c, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ProductRatings implements Parcelable {
    public static final Parcelable.Creator<ProductRatings> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double averageRating;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalReviewCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productId;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Gp.c$a */
    public static final class a implements Parcelable.Creator<ProductRatings> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProductRatings createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new ProductRatings(parcel.readDouble(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProductRatings[] newArray(int i10) {
            return new ProductRatings[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductRatings)) {
            return false;
        }
        ProductRatings productRatings = (ProductRatings) other;
        return Double.compare(this.averageRating, productRatings.averageRating) == 0 && this.totalReviewCount == productRatings.totalReviewCount && Intrinsics.e(this.productId, productRatings.productId);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeDouble(this.averageRating);
        dest.writeInt(this.totalReviewCount);
        dest.writeString(this.productId);
    }

    public ProductRatings(double d10, int i10, String productId) {
        Intrinsics.j(productId, "productId");
        this.averageRating = d10;
        this.totalReviewCount = i10;
        this.productId = productId;
    }

    /* renamed from: a, reason: from getter */
    public final double getAverageRating() {
        return this.averageRating;
    }

    /* renamed from: b, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: c, reason: from getter */
    public final int getTotalReviewCount() {
        return this.totalReviewCount;
    }

    public int hashCode() {
        return (((Double.hashCode(this.averageRating) * 31) + Integer.hashCode(this.totalReviewCount)) * 31) + this.productId.hashCode();
    }

    public String toString() {
        return "ProductRatings(averageRating=" + this.averageRating + ", totalReviewCount=" + this.totalReviewCount + ", productId=" + this.productId + ')';
    }
}
