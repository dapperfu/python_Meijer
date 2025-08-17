package Vl;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bw\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\r¢\u0006\u0004\b\u001b\u0010\u001cJ\u0082\u0001\u0010\u001d\u001a\u00020\u00002\f\b\u0002\u0010\u0005\u001a\u00060\u0003j\u0002`\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b!\u0010\u001cJ\u001a\u0010#\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001e\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b&\u0010'R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010 \"\u0004\b+\u0010,R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b0\u0010/R$\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b0\u0010)\u001a\u0004\b1\u0010 \"\u0004\b2\u0010,R\u001a\u0010\f\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b3\u0010 R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u0010\u001cR$\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b6\u0010)\u001a\u0004\b6\u0010 \"\u0004\b7\u0010,R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b8\u0010:R\u001a\u0010\u0012\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b;\u0010:¨\u0006<"}, d2 = {"LVl/a;", "Landroid/os/Parcelable;", "", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "couponId", "", "description", "j$/time/ZonedDateTime", "displayEnd", "displayStart", "imageUrl", "name", "", "pointCost", "termsAndConditions", "", "isClaimed", "isLoading", "<init>", "(JLjava/lang/String;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZ)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(JLjava/lang/String;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZZ)LVl/a;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "H", "()J", "b", "Ljava/lang/String;", "c", "setDescription", "(Ljava/lang/String;)V", "Lj$/time/ZonedDateTime;", "d", "()Lj$/time/ZonedDateTime;", "e", "f", "setImageUrl", "getName", "g", "I", "h", "setTermsAndConditions", "i", "Z", "()Z", "j", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Vl.a, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class AvailableReward implements Parcelable {
    public static final Parcelable.Creator<AvailableReward> CREATOR = new C0811a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long couponId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZonedDateTime displayEnd;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZonedDateTime displayStart;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String imageUrl;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pointCost;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private String termsAndConditions;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isClaimed;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Vl.a$a, reason: collision with other inner class name */
    public static final class C0811a implements Parcelable.Creator<AvailableReward> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AvailableReward createFromParcel(Parcel parcel) {
            boolean z10;
            Intrinsics.j(parcel, "parcel");
            long j10 = parcel.readLong();
            String string = parcel.readString();
            ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
            ZonedDateTime zonedDateTime2 = (ZonedDateTime) parcel.readSerializable();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i10 = parcel.readInt();
            String string4 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
            return new AvailableReward(j10, string, zonedDateTime, zonedDateTime2, string2, string3, i10, string4, z11, parcel.readInt() == 0 ? z10 : true);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AvailableReward[] newArray(int i10) {
            return new AvailableReward[i10];
        }
    }

    public AvailableReward(long j10, String str, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str2, String name, int i10, String str3, boolean z10, boolean z11) {
        Intrinsics.j(name, "name");
        this.couponId = j10;
        this.description = str;
        this.displayEnd = zonedDateTime;
        this.displayStart = zonedDateTime2;
        this.imageUrl = str2;
        this.name = name;
        this.pointCost = i10;
        this.termsAndConditions = str3;
        this.isClaimed = z10;
        this.isLoading = z11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableReward)) {
            return false;
        }
        AvailableReward availableReward = (AvailableReward) other;
        return this.couponId == availableReward.couponId && Intrinsics.e(this.description, availableReward.description) && Intrinsics.e(this.displayEnd, availableReward.displayEnd) && Intrinsics.e(this.displayStart, availableReward.displayStart) && Intrinsics.e(this.imageUrl, availableReward.imageUrl) && Intrinsics.e(this.name, availableReward.name) && this.pointCost == availableReward.pointCost && Intrinsics.e(this.termsAndConditions, availableReward.termsAndConditions) && this.isClaimed == availableReward.isClaimed && this.isLoading == availableReward.isLoading;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeLong(this.couponId);
        dest.writeString(this.description);
        dest.writeSerializable(this.displayEnd);
        dest.writeSerializable(this.displayStart);
        dest.writeString(this.imageUrl);
        dest.writeString(this.name);
        dest.writeInt(this.pointCost);
        dest.writeString(this.termsAndConditions);
        dest.writeInt(this.isClaimed ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public static /* synthetic */ AvailableReward b(AvailableReward availableReward, long j10, String str, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str2, String str3, int i10, String str4, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = availableReward.couponId;
        }
        long j11 = j10;
        if ((i11 & 2) != 0) {
            str = availableReward.description;
        }
        return availableReward.a(j11, str, (i11 & 4) != 0 ? availableReward.displayEnd : zonedDateTime, (i11 & 8) != 0 ? availableReward.displayStart : zonedDateTime2, (i11 & 16) != 0 ? availableReward.imageUrl : str2, (i11 & 32) != 0 ? availableReward.name : str3, (i11 & 64) != 0 ? availableReward.pointCost : i10, (i11 & 128) != 0 ? availableReward.termsAndConditions : str4, (i11 & 256) != 0 ? availableReward.isClaimed : z10, (i11 & 512) != 0 ? availableReward.isLoading : z11);
    }

    /* renamed from: H, reason: from getter */
    public long getCouponId() {
        return this.couponId;
    }

    public final AvailableReward a(long couponId, String description, ZonedDateTime displayEnd, ZonedDateTime displayStart, String imageUrl, String name, int pointCost, String termsAndConditions, boolean isClaimed, boolean isLoading) {
        Intrinsics.j(name, "name");
        return new AvailableReward(couponId, description, displayEnd, displayStart, imageUrl, name, pointCost, termsAndConditions, isClaimed, isLoading);
    }

    /* renamed from: c, reason: from getter */
    public String getDescription() {
        return this.description;
    }

    /* renamed from: d, reason: from getter */
    public ZonedDateTime getDisplayEnd() {
        return this.displayEnd;
    }

    /* renamed from: e, reason: from getter */
    public final ZonedDateTime getDisplayStart() {
        return this.displayStart;
    }

    /* renamed from: f, reason: from getter */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: g, reason: from getter */
    public int getPointCost() {
        return this.pointCost;
    }

    public String getName() {
        return this.name;
    }

    /* renamed from: h, reason: from getter */
    public String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.couponId) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.displayEnd;
        int iHashCode3 = (iHashCode2 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.displayStart;
        int iHashCode4 = (iHashCode3 + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode5 = (((((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.pointCost)) * 31;
        String str3 = this.termsAndConditions;
        return ((((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.isClaimed)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* renamed from: i, reason: from getter */
    public boolean getIsClaimed() {
        return this.isClaimed;
    }

    /* renamed from: j, reason: from getter */
    public boolean getIsLoading() {
        return this.isLoading;
    }

    public String toString() {
        return "AvailableReward(couponId=" + this.couponId + ", description=" + this.description + ", displayEnd=" + this.displayEnd + ", displayStart=" + this.displayStart + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", pointCost=" + this.pointCost + ", termsAndConditions=" + this.termsAndConditions + ", isClaimed=" + this.isClaimed + ", isLoading=" + this.isLoading + ')';
    }

    public /* synthetic */ AvailableReward(long j10, String str, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str2, String str3, int i10, String str4, boolean z10, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : zonedDateTime, (i11 & 8) != 0 ? null : zonedDateTime2, (i11 & 16) != 0 ? null : str2, (i11 & 32) != 0 ? "" : str3, (i11 & 64) != 0 ? 0 : i10, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? false : z10, (i11 & 512) != 0 ? false : z11);
    }
}
