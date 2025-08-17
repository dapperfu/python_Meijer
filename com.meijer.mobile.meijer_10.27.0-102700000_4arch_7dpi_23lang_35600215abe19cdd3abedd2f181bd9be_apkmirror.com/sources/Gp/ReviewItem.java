package Gp;

import android.os.Parcel;
import android.os.Parcelable;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u001a\u0010 \u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b%\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b-\u00100R\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b1\u0010\u001aR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b.\u0010\u001aR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b&\u00104¨\u00065"}, d2 = {"LGp/e;", "Landroid/os/Parcelable;", "", PreferencesHelper.PREF_ID, "title", "reviewText", "", "maxLines", "", "isRecommended", "date", "", "starsRating", "thumbsUpCount", "thumbsDownCount", "", "imageList", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;DIILjava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getTitle", "c", "e", "d", "I", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "f", "g", "D", "()D", "h", "j", "Ljava/util/List;", "()Ljava/util/List;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Gp.e, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ReviewItem implements Parcelable {
    public static final Parcelable.Creator<ReviewItem> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reviewText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxLines;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isRecommended;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String date;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final double starsRating;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int thumbsUpCount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int thumbsDownCount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> imageList;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Gp.e$a */
    public static final class a implements Parcelable.Creator<ReviewItem> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReviewItem createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.j(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i10 = parcel.readInt();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ReviewItem(string, string2, string3, i10, boolValueOf, parcel.readString(), parcel.readDouble(), parcel.readInt(), parcel.readInt(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ReviewItem[] newArray(int i10) {
            return new ReviewItem[i10];
        }
    }

    public ReviewItem() {
        this(null, null, null, 0, null, null, 0.0d, 0, 0, null, 1023, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewItem)) {
            return false;
        }
        ReviewItem reviewItem = (ReviewItem) other;
        return Intrinsics.e(this.id, reviewItem.id) && Intrinsics.e(this.title, reviewItem.title) && Intrinsics.e(this.reviewText, reviewItem.reviewText) && this.maxLines == reviewItem.maxLines && Intrinsics.e(this.isRecommended, reviewItem.isRecommended) && Intrinsics.e(this.date, reviewItem.date) && Double.compare(this.starsRating, reviewItem.starsRating) == 0 && this.thumbsUpCount == reviewItem.thumbsUpCount && this.thumbsDownCount == reviewItem.thumbsDownCount && Intrinsics.e(this.imageList, reviewItem.imageList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iBooleanValue;
        Intrinsics.j(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.title);
        dest.writeString(this.reviewText);
        dest.writeInt(this.maxLines);
        Boolean bool = this.isRecommended;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            dest.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        dest.writeInt(iBooleanValue);
        dest.writeString(this.date);
        dest.writeDouble(this.starsRating);
        dest.writeInt(this.thumbsUpCount);
        dest.writeInt(this.thumbsDownCount);
        dest.writeStringList(this.imageList);
    }

    public ReviewItem(String id2, String title, String reviewText, int i10, Boolean bool, String date, double d10, int i11, int i12, List<String> imageList) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(title, "title");
        Intrinsics.j(reviewText, "reviewText");
        Intrinsics.j(date, "date");
        Intrinsics.j(imageList, "imageList");
        this.id = id2;
        this.title = title;
        this.reviewText = reviewText;
        this.maxLines = i10;
        this.isRecommended = bool;
        this.date = date;
        this.starsRating = d10;
        this.thumbsUpCount = i11;
        this.thumbsDownCount = i12;
        this.imageList = imageList;
    }

    /* renamed from: a, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> c() {
        return this.imageList;
    }

    /* renamed from: d, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: e, reason: from getter */
    public final String getReviewText() {
        return this.reviewText;
    }

    /* renamed from: f, reason: from getter */
    public final double getStarsRating() {
        return this.starsRating;
    }

    /* renamed from: g, reason: from getter */
    public final int getThumbsDownCount() {
        return this.thumbsDownCount;
    }

    public final String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public final int getThumbsUpCount() {
        return this.thumbsUpCount;
    }

    public int hashCode() {
        int iHashCode = ((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.reviewText.hashCode()) * 31) + Integer.hashCode(this.maxLines)) * 31;
        Boolean bool = this.isRecommended;
        return ((((((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.date.hashCode()) * 31) + Double.hashCode(this.starsRating)) * 31) + Integer.hashCode(this.thumbsUpCount)) * 31) + Integer.hashCode(this.thumbsDownCount)) * 31) + this.imageList.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final Boolean getIsRecommended() {
        return this.isRecommended;
    }

    public String toString() {
        return "ReviewItem(id=" + this.id + ", title=" + this.title + ", reviewText=" + this.reviewText + ", maxLines=" + this.maxLines + ", isRecommended=" + this.isRecommended + ", date=" + this.date + ", starsRating=" + this.starsRating + ", thumbsUpCount=" + this.thumbsUpCount + ", thumbsDownCount=" + this.thumbsDownCount + ", imageList=" + this.imageList + ')';
    }

    public /* synthetic */ ReviewItem(String str, String str2, String str3, int i10, Boolean bool, String str4, double d10, int i11, int i12, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? 4 : i10, (i13 & 16) != 0 ? Boolean.FALSE : bool, (i13 & 32) != 0 ? "" : str4, (i13 & 64) != 0 ? 0.0d : d10, (i13 & 128) != 0 ? 0 : i11, (i13 & 256) != 0 ? 0 : i12, (i13 & 512) != 0 ? CollectionsKt.m() : list);
    }
}
