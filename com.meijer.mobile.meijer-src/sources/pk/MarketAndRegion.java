package pk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0013¨\u0006%"}, d2 = {"Lpk/f;", "Landroid/os/Parcelable;", "", "marketId", "regionId", "", "marketDescription", "regionDescription", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getMarketId", "()Ljava/lang/Integer;", "b", "getRegionId", "c", "Ljava/lang/String;", "getMarketDescription", "d", "getRegionDescription", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pk.f, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class MarketAndRegion implements Parcelable {
    public static final Parcelable.Creator<MarketAndRegion> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer marketId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer regionId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String marketDescription;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String regionDescription;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.f$a */
    public static final class a implements Parcelable.Creator<MarketAndRegion> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MarketAndRegion createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new MarketAndRegion(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MarketAndRegion[] newArray(int i10) {
            return new MarketAndRegion[i10];
        }
    }

    public MarketAndRegion() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarketAndRegion)) {
            return false;
        }
        MarketAndRegion marketAndRegion = (MarketAndRegion) other;
        return Intrinsics.e(this.marketId, marketAndRegion.marketId) && Intrinsics.e(this.regionId, marketAndRegion.regionId) && Intrinsics.e(this.marketDescription, marketAndRegion.marketDescription) && Intrinsics.e(this.regionDescription, marketAndRegion.regionDescription);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        Integer num = this.marketId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        Integer num2 = this.regionId;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        dest.writeString(this.marketDescription);
        dest.writeString(this.regionDescription);
    }

    public MarketAndRegion(Integer num, Integer num2, String str, String str2) {
        this.marketId = num;
        this.regionId = num2;
        this.marketDescription = str;
        this.regionDescription = str2;
    }

    public int hashCode() {
        Integer num = this.marketId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.regionId;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.marketDescription;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.regionDescription;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "MarketAndRegion(marketId=" + this.marketId + ", regionId=" + this.regionId + ", marketDescription=" + this.marketDescription + ", regionDescription=" + this.regionDescription + ')';
    }

    public /* synthetic */ MarketAndRegion(Integer num, Integer num2, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? 0 : num2, (i10 & 4) != 0 ? "" : str, (i10 & 8) != 0 ? "" : str2);
    }
}
