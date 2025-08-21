package Pk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001b"}, d2 = {"LPk/b;", "Landroid/os/Parcelable;", "", "segmentID", "segmentName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Pk.b, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class CouponCategory implements Parcelable {
    public static final Parcelable.Creator<CouponCategory> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String segmentID;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String segmentName;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pk.b$a */
    public static final class a implements Parcelable.Creator<CouponCategory> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CouponCategory createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new CouponCategory(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CouponCategory[] newArray(int i10) {
            return new CouponCategory[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CouponCategory() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CouponCategory)) {
            return false;
        }
        CouponCategory couponCategory = (CouponCategory) other;
        return Intrinsics.e(this.segmentID, couponCategory.segmentID) && Intrinsics.e(this.segmentName, couponCategory.segmentName);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.segmentID);
        dest.writeString(this.segmentName);
    }

    public CouponCategory(String str, String str2) {
        this.segmentID = str;
        this.segmentName = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getSegmentID() {
        return this.segmentID;
    }

    /* renamed from: b, reason: from getter */
    public final String getSegmentName() {
        return this.segmentName;
    }

    public int hashCode() {
        String str = this.segmentID;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.segmentName;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "CouponCategory(segmentID=" + this.segmentID + ", segmentName=" + this.segmentName + ')';
    }

    public /* synthetic */ CouponCategory(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
