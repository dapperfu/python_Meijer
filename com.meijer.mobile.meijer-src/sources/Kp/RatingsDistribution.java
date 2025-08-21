package Kp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b \u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001b\u0010\u0011¨\u0006!"}, d2 = {"LKp/f;", "Landroid/os/Parcelable;", "", "oneStarCount", "twoStarCount", "threeStarCount", "fourStarCount", "fiveStarCount", "<init>", "(IIIII)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "e", "d", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Kp.f, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class RatingsDistribution implements Parcelable {
    public static final Parcelable.Creator<RatingsDistribution> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int oneStarCount;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int twoStarCount;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int threeStarCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fourStarCount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fiveStarCount;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Kp.f$a */
    public static final class a implements Parcelable.Creator<RatingsDistribution> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RatingsDistribution createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new RatingsDistribution(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RatingsDistribution[] newArray(int i10) {
            return new RatingsDistribution[i10];
        }
    }

    public RatingsDistribution() {
        this(0, 0, 0, 0, 0, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RatingsDistribution)) {
            return false;
        }
        RatingsDistribution ratingsDistribution = (RatingsDistribution) other;
        return this.oneStarCount == ratingsDistribution.oneStarCount && this.twoStarCount == ratingsDistribution.twoStarCount && this.threeStarCount == ratingsDistribution.threeStarCount && this.fourStarCount == ratingsDistribution.fourStarCount && this.fiveStarCount == ratingsDistribution.fiveStarCount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeInt(this.oneStarCount);
        dest.writeInt(this.twoStarCount);
        dest.writeInt(this.threeStarCount);
        dest.writeInt(this.fourStarCount);
        dest.writeInt(this.fiveStarCount);
    }

    public RatingsDistribution(int i10, int i11, int i12, int i13, int i14) {
        this.oneStarCount = i10;
        this.twoStarCount = i11;
        this.threeStarCount = i12;
        this.fourStarCount = i13;
        this.fiveStarCount = i14;
    }

    /* renamed from: a, reason: from getter */
    public final int getFiveStarCount() {
        return this.fiveStarCount;
    }

    /* renamed from: b, reason: from getter */
    public final int getFourStarCount() {
        return this.fourStarCount;
    }

    /* renamed from: c, reason: from getter */
    public final int getOneStarCount() {
        return this.oneStarCount;
    }

    /* renamed from: d, reason: from getter */
    public final int getThreeStarCount() {
        return this.threeStarCount;
    }

    /* renamed from: e, reason: from getter */
    public final int getTwoStarCount() {
        return this.twoStarCount;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.oneStarCount) * 31) + Integer.hashCode(this.twoStarCount)) * 31) + Integer.hashCode(this.threeStarCount)) * 31) + Integer.hashCode(this.fourStarCount)) * 31) + Integer.hashCode(this.fiveStarCount);
    }

    public String toString() {
        return "RatingsDistribution(oneStarCount=" + this.oneStarCount + ", twoStarCount=" + this.twoStarCount + ", threeStarCount=" + this.threeStarCount + ", fourStarCount=" + this.fourStarCount + ", fiveStarCount=" + this.fiveStarCount + ')';
    }

    public /* synthetic */ RatingsDistribution(int i10, int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i10, (i15 & 2) != 0 ? 0 : i11, (i15 & 4) != 0 ? 0 : i12, (i15 & 8) != 0 ? 0 : i13, (i15 & 16) != 0 ? 0 : i14);
    }
}
