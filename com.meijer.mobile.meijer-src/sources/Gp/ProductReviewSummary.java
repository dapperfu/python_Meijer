package Gp;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0012J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"LGp/d;", "Landroid/os/Parcelable;", "", "totalReviews", "", "totalReviewsByStars", "totalRecommended", "", "totalRating", "<init>", "(ILjava/util/List;ID)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "getTotalRecommended", "d", "D", "getTotalRating", "()D", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Gp.d, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ProductReviewSummary implements Parcelable {
    public static final Parcelable.Creator<ProductReviewSummary> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalReviews;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Integer> totalReviewsByStars;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalRecommended;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double totalRating;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Gp.d$a */
    public static final class a implements Parcelable.Creator<ProductReviewSummary> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProductReviewSummary createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            int i12 = 0;
            while (true) {
                int i13 = parcel.readInt();
                if (i12 == i11) {
                    return new ProductReviewSummary(i10, arrayList, i13, parcel.readDouble());
                }
                arrayList.add(Integer.valueOf(i13));
                i12++;
            }
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProductReviewSummary[] newArray(int i10) {
            return new ProductReviewSummary[i10];
        }
    }

    public ProductReviewSummary() {
        this(0, null, 0, 0.0d, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductReviewSummary)) {
            return false;
        }
        ProductReviewSummary productReviewSummary = (ProductReviewSummary) other;
        return this.totalReviews == productReviewSummary.totalReviews && Intrinsics.e(this.totalReviewsByStars, productReviewSummary.totalReviewsByStars) && this.totalRecommended == productReviewSummary.totalRecommended && Double.compare(this.totalRating, productReviewSummary.totalRating) == 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.totalReviews);
        List<Integer> list = this.totalReviewsByStars;
        dest.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            dest.writeInt(it.next().intValue());
        }
        dest.writeInt(this.totalRecommended);
        dest.writeDouble(this.totalRating);
    }

    public ProductReviewSummary(int i10, List<Integer> totalReviewsByStars, int i11, double d10) {
        Intrinsics.j(totalReviewsByStars, "totalReviewsByStars");
        this.totalReviews = i10;
        this.totalReviewsByStars = totalReviewsByStars;
        this.totalRecommended = i11;
        this.totalRating = d10;
    }

    /* renamed from: a, reason: from getter */
    public final int getTotalReviews() {
        return this.totalReviews;
    }

    public final List<Integer> b() {
        return this.totalReviewsByStars;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.totalReviews) * 31) + this.totalReviewsByStars.hashCode()) * 31) + Integer.hashCode(this.totalRecommended)) * 31) + Double.hashCode(this.totalRating);
    }

    public String toString() {
        return "ProductReviewSummary(totalReviews=" + this.totalReviews + ", totalReviewsByStars=" + this.totalReviewsByStars + ", totalRecommended=" + this.totalRecommended + ", totalRating=" + this.totalRating + ')';
    }

    public /* synthetic */ ProductReviewSummary(int i10, List list, int i11, double d10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? CollectionsKt.m() : list, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? 0.0d : d10);
    }
}
