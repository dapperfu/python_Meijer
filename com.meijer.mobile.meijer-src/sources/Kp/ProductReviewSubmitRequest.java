package Kp;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.bazaarvoice.bvandroidsdk.BasicRequestFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u001a\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b\"\u0010'R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b(\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b)\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b%\u0010\u001cR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b/\u0010'R\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b+\u00102¨\u00063"}, d2 = {"LKp/e;", "Landroid/os/Parcelable;", "", BasicRequestFactory.kEMAIL_USER, "", "agreedToTermsAndCondition", "productId", "userName", "", "rating", "userLocationName", "title", "description", "isRecommended", "", "Landroid/net/Uri;", "reviewPhotos", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "Z", "()Z", "c", "d", "h", "e", "I", "g", "getTitle", "i", "j", "Ljava/util/List;", "()Ljava/util/List;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kp.e, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ProductReviewSubmitRequest implements Parcelable {
    public static final Parcelable.Creator<ProductReviewSubmitRequest> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String userEmail;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean agreedToTermsAndCondition;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String userName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int rating;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String userLocationName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isRecommended;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Uri> reviewPhotos;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Kp.e$a */
    public static final class a implements Parcelable.Creator<ProductReviewSubmitRequest> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProductReviewSubmitRequest createFromParcel(Parcel parcel) {
            boolean z10;
            Intrinsics.j(parcel, "parcel");
            String string = parcel.readString();
            boolean z11 = true;
            if (parcel.readInt() != 0) {
                z10 = true;
            } else {
                z10 = true;
                z11 = false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i10 = parcel.readInt();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z12 = parcel.readInt() != 0 ? z10 : false;
            int i11 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i11);
            for (int i12 = 0; i12 != i11; i12++) {
                arrayList.add(parcel.readParcelable(ProductReviewSubmitRequest.class.getClassLoader()));
            }
            return new ProductReviewSubmitRequest(string, z11, string2, string3, i10, string4, string5, string6, z12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProductReviewSubmitRequest[] newArray(int i10) {
            return new ProductReviewSubmitRequest[i10];
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
        if (!(other instanceof ProductReviewSubmitRequest)) {
            return false;
        }
        ProductReviewSubmitRequest productReviewSubmitRequest = (ProductReviewSubmitRequest) other;
        return Intrinsics.e(this.userEmail, productReviewSubmitRequest.userEmail) && this.agreedToTermsAndCondition == productReviewSubmitRequest.agreedToTermsAndCondition && Intrinsics.e(this.productId, productReviewSubmitRequest.productId) && Intrinsics.e(this.userName, productReviewSubmitRequest.userName) && this.rating == productReviewSubmitRequest.rating && Intrinsics.e(this.userLocationName, productReviewSubmitRequest.userLocationName) && Intrinsics.e(this.title, productReviewSubmitRequest.title) && Intrinsics.e(this.description, productReviewSubmitRequest.description) && this.isRecommended == productReviewSubmitRequest.isRecommended && Intrinsics.e(this.reviewPhotos, productReviewSubmitRequest.reviewPhotos);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.userEmail);
        dest.writeInt(this.agreedToTermsAndCondition ? 1 : 0);
        dest.writeString(this.productId);
        dest.writeString(this.userName);
        dest.writeInt(this.rating);
        dest.writeString(this.userLocationName);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeInt(this.isRecommended ? 1 : 0);
        List<Uri> list = this.reviewPhotos;
        dest.writeInt(list.size());
        Iterator<Uri> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductReviewSubmitRequest(String userEmail, boolean z10, String productId, String userName, int i10, String str, String title, String description, boolean z11, List<? extends Uri> reviewPhotos) {
        Intrinsics.j(userEmail, "userEmail");
        Intrinsics.j(productId, "productId");
        Intrinsics.j(userName, "userName");
        Intrinsics.j(title, "title");
        Intrinsics.j(description, "description");
        Intrinsics.j(reviewPhotos, "reviewPhotos");
        this.userEmail = userEmail;
        this.agreedToTermsAndCondition = z10;
        this.productId = productId;
        this.userName = userName;
        this.rating = i10;
        this.userLocationName = str;
        this.title = title;
        this.description = description;
        this.isRecommended = z11;
        this.reviewPhotos = reviewPhotos;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getAgreedToTermsAndCondition() {
        return this.agreedToTermsAndCondition;
    }

    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* renamed from: d, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    public final List<Uri> e() {
        return this.reviewPhotos;
    }

    /* renamed from: f, reason: from getter */
    public final String getUserEmail() {
        return this.userEmail;
    }

    /* renamed from: g, reason: from getter */
    public final String getUserLocationName() {
        return this.userLocationName;
    }

    public final String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.userEmail.hashCode() * 31) + Boolean.hashCode(this.agreedToTermsAndCondition)) * 31) + this.productId.hashCode()) * 31) + this.userName.hashCode()) * 31) + Integer.hashCode(this.rating)) * 31;
        String str = this.userLocationName;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + Boolean.hashCode(this.isRecommended)) * 31) + this.reviewPhotos.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final boolean getIsRecommended() {
        return this.isRecommended;
    }

    public String toString() {
        return "ProductReviewSubmitRequest(userEmail=" + this.userEmail + ", agreedToTermsAndCondition=" + this.agreedToTermsAndCondition + ", productId=" + this.productId + ", userName=" + this.userName + ", rating=" + this.rating + ", userLocationName=" + this.userLocationName + ", title=" + this.title + ", description=" + this.description + ", isRecommended=" + this.isRecommended + ", reviewPhotos=" + this.reviewPhotos + ')';
    }
}
