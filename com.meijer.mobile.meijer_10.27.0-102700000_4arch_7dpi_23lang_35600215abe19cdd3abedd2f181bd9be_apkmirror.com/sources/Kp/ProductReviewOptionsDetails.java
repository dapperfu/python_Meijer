package Kp;

import Jp.Filter;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b%\u0010*R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010&\u001a\u0004\b(\u0010\u0019R.\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"LKp/d;", "", "Landroid/os/Parcelable;", "", "averageRating", "", "totalReviewCount", "LKp/f;", "ratingsDistribution", "totalRecommendedCount", "Ljava/util/ArrayList;", "LJp/a;", "Lkotlin/collections/ArrayList;", "filterArray", "LJp/b;", "sortBy", "<init>", "(DILKp/f;ILjava/util/ArrayList;LJp/b;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "I", "d", "c", "LKp/f;", "()LKp/f;", "e", "Ljava/util/ArrayList;", "getFilterArray", "()Ljava/util/ArrayList;", "f", "LJp/b;", "getSortBy", "()LJp/b;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kp.d, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ProductReviewOptionsDetails implements Parcelable {
    public static final Parcelable.Creator<ProductReviewOptionsDetails> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double averageRating;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalReviewCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final RatingsDistribution ratingsDistribution;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalRecommendedCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ArrayList<Filter> filterArray;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Jp.b sortBy;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Kp.d$a */
    public static final class a implements Parcelable.Creator<ProductReviewOptionsDetails> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProductReviewOptionsDetails createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.j(parcel, "parcel");
            double d10 = parcel.readDouble();
            int i10 = parcel.readInt();
            RatingsDistribution ratingsDistributionCreateFromParcel = RatingsDistribution.CREATOR.createFromParcel(parcel);
            int i11 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    arrayList.add(Filter.CREATOR.createFromParcel(parcel));
                }
            }
            return new ProductReviewOptionsDetails(d10, i10, ratingsDistributionCreateFromParcel, i11, arrayList, parcel.readInt() != 0 ? Jp.b.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProductReviewOptionsDetails[] newArray(int i10) {
            return new ProductReviewOptionsDetails[i10];
        }
    }

    public ProductReviewOptionsDetails() {
        this(0.0d, 0, null, 0, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductReviewOptionsDetails)) {
            return false;
        }
        ProductReviewOptionsDetails productReviewOptionsDetails = (ProductReviewOptionsDetails) other;
        return Double.compare(this.averageRating, productReviewOptionsDetails.averageRating) == 0 && this.totalReviewCount == productReviewOptionsDetails.totalReviewCount && Intrinsics.e(this.ratingsDistribution, productReviewOptionsDetails.ratingsDistribution) && this.totalRecommendedCount == productReviewOptionsDetails.totalRecommendedCount && Intrinsics.e(this.filterArray, productReviewOptionsDetails.filterArray) && this.sortBy == productReviewOptionsDetails.sortBy;
    }

    public ProductReviewOptionsDetails(double d10, int i10, RatingsDistribution ratingsDistribution, int i11, ArrayList<Filter> arrayList, Jp.b bVar) {
        Intrinsics.j(ratingsDistribution, "ratingsDistribution");
        this.averageRating = d10;
        this.totalReviewCount = i10;
        this.ratingsDistribution = ratingsDistribution;
        this.totalRecommendedCount = i11;
        this.filterArray = arrayList;
        this.sortBy = bVar;
    }

    /* renamed from: a, reason: from getter */
    public double getAverageRating() {
        return this.averageRating;
    }

    /* renamed from: b, reason: from getter */
    public RatingsDistribution getRatingsDistribution() {
        return this.ratingsDistribution;
    }

    /* renamed from: c, reason: from getter */
    public int getTotalRecommendedCount() {
        return this.totalRecommendedCount;
    }

    /* renamed from: d, reason: from getter */
    public int getTotalReviewCount() {
        return this.totalReviewCount;
    }

    public int hashCode() {
        int iHashCode = ((((((Double.hashCode(this.averageRating) * 31) + Integer.hashCode(this.totalReviewCount)) * 31) + this.ratingsDistribution.hashCode()) * 31) + Integer.hashCode(this.totalRecommendedCount)) * 31;
        ArrayList<Filter> arrayList = this.filterArray;
        int iHashCode2 = (iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Jp.b bVar = this.sortBy;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ProductReviewOptionsDetails(averageRating=" + this.averageRating + ", totalReviewCount=" + this.totalReviewCount + ", ratingsDistribution=" + this.ratingsDistribution + ", totalRecommendedCount=" + this.totalRecommendedCount + ", filterArray=" + this.filterArray + ", sortBy=" + this.sortBy + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeDouble(this.averageRating);
        dest.writeInt(this.totalReviewCount);
        this.ratingsDistribution.writeToParcel(dest, flags);
        dest.writeInt(this.totalRecommendedCount);
        ArrayList<Filter> arrayList = this.filterArray;
        if (arrayList == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(arrayList.size());
            Iterator<Filter> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        Jp.b bVar = this.sortBy;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
    }

    public /* synthetic */ ProductReviewOptionsDetails(double d10, int i10, RatingsDistribution ratingsDistribution, int i11, ArrayList arrayList, Jp.b bVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0.0d : d10, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? new RatingsDistribution(0, 0, 0, 0, 0, 31, null) : ratingsDistribution, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? null : arrayList, (i12 & 32) != 0 ? null : bVar);
    }
}
