package Kp;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bk\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010+\u001a\u0004\b)\u0010\u001bR\u001a\u0010\n\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010#\u001a\u0004\b-\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b\"\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u000e\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b.\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b%\u0010\u001bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b,\u00104¨\u00065"}, d2 = {"LKp/b;", "", "Landroid/os/Parcelable;", "", "reviewId", "j$/time/Instant", "submissionDate", "userName", "", "rating", "title", "description", "", "isRecommended", "upVoteCount", "downVoteCount", "", "reviewPhotos", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;IILjava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lj$/time/Instant;", "f", "()Lj$/time/Instant;", "c", "h", "I", "e", "getTitle", "g", "Ljava/lang/Boolean;", "i", "()Ljava/lang/Boolean;", "j", "Ljava/util/List;", "()Ljava/util/List;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kp.b, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ProductReviewDetails implements Parcelable {
    public static final Parcelable.Creator<ProductReviewDetails> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String reviewId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Instant submissionDate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String userName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int rating;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean isRecommended;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int upVoteCount;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int downVoteCount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<String> reviewPhotos;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Kp.b$a */
    public static final class a implements Parcelable.Creator<ProductReviewDetails> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProductReviewDetails createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.j(parcel, "parcel");
            String string = parcel.readString();
            Instant instant = (Instant) parcel.readSerializable();
            String string2 = parcel.readString();
            int i10 = parcel.readInt();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ProductReviewDetails(string, instant, string2, i10, string3, string4, boolValueOf, parcel.readInt(), parcel.readInt(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProductReviewDetails[] newArray(int i10) {
            return new ProductReviewDetails[i10];
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
        if (!(other instanceof ProductReviewDetails)) {
            return false;
        }
        ProductReviewDetails productReviewDetails = (ProductReviewDetails) other;
        return Intrinsics.e(this.reviewId, productReviewDetails.reviewId) && Intrinsics.e(this.submissionDate, productReviewDetails.submissionDate) && Intrinsics.e(this.userName, productReviewDetails.userName) && this.rating == productReviewDetails.rating && Intrinsics.e(this.title, productReviewDetails.title) && Intrinsics.e(this.description, productReviewDetails.description) && Intrinsics.e(this.isRecommended, productReviewDetails.isRecommended) && this.upVoteCount == productReviewDetails.upVoteCount && this.downVoteCount == productReviewDetails.downVoteCount && Intrinsics.e(this.reviewPhotos, productReviewDetails.reviewPhotos);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        int iBooleanValue;
        Intrinsics.j(dest, "dest");
        dest.writeString(this.reviewId);
        dest.writeSerializable(this.submissionDate);
        dest.writeString(this.userName);
        dest.writeInt(this.rating);
        dest.writeString(this.title);
        dest.writeString(this.description);
        Boolean bool = this.isRecommended;
        if (bool == null) {
            iBooleanValue = 0;
        } else {
            dest.writeInt(1);
            iBooleanValue = bool.booleanValue();
        }
        dest.writeInt(iBooleanValue);
        dest.writeInt(this.upVoteCount);
        dest.writeInt(this.downVoteCount);
        dest.writeStringList(this.reviewPhotos);
    }

    public ProductReviewDetails(String reviewId, Instant submissionDate, String userName, int i10, String title, String description, Boolean bool, int i11, int i12, List<String> reviewPhotos) {
        Intrinsics.j(reviewId, "reviewId");
        Intrinsics.j(submissionDate, "submissionDate");
        Intrinsics.j(userName, "userName");
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(reviewPhotos, "reviewPhotos");
        this.reviewId = reviewId;
        this.submissionDate = submissionDate;
        this.userName = userName;
        this.rating = i10;
        this.title = title;
        this.description = description;
        this.isRecommended = bool;
        this.upVoteCount = i11;
        this.downVoteCount = i12;
        this.reviewPhotos = reviewPhotos;
    }

    /* renamed from: a, reason: from getter */
    public String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public int getDownVoteCount() {
        return this.downVoteCount;
    }

    /* renamed from: c, reason: from getter */
    public int getRating() {
        return this.rating;
    }

    /* renamed from: d, reason: from getter */
    public String getReviewId() {
        return this.reviewId;
    }

    public List<String> e() {
        return this.reviewPhotos;
    }

    /* renamed from: f, reason: from getter */
    public Instant getSubmissionDate() {
        return this.submissionDate;
    }

    /* renamed from: g, reason: from getter */
    public int getUpVoteCount() {
        return this.upVoteCount;
    }

    public String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.reviewId.hashCode() * 31) + this.submissionDate.hashCode()) * 31) + this.userName.hashCode()) * 31) + Integer.hashCode(this.rating)) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        Boolean bool = this.isRecommended;
        return ((((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Integer.hashCode(this.upVoteCount)) * 31) + Integer.hashCode(this.downVoteCount)) * 31) + this.reviewPhotos.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public Boolean getIsRecommended() {
        return this.isRecommended;
    }

    public String toString() {
        return "ProductReviewDetails(reviewId=" + this.reviewId + ", submissionDate=" + this.submissionDate + ", userName=" + this.userName + ", rating=" + this.rating + ", title=" + this.title + ", description=" + this.description + ", isRecommended=" + this.isRecommended + ", upVoteCount=" + this.upVoteCount + ", downVoteCount=" + this.downVoteCount + ", reviewPhotos=" + this.reviewPhotos + ')';
    }
}
