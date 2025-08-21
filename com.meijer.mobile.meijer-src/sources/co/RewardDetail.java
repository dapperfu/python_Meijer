package co;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wk.C17898a;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b%\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010\u001bJ\u001a\u0010(\u001a\u00020\u00122\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010.\u001a\u0004\b-\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b;\u0010$R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b+\u0010<\u001a\u0004\b0\u0010=R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b4\u0010<\u001a\u0004\b:\u0010=R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b>\u0010@R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b;\u0010A\u001a\u0004\b2\u0010BR\u001f\u0010F\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0012\n\u0004\bC\u0010.\u0012\u0004\bD\u0010E\u001a\u0004\b6\u0010$R\u001d\u0010J\u001a\u00020\u00128\u0006¢\u0006\u0012\n\u0004\bG\u0010A\u0012\u0004\bI\u0010E\u001a\u0004\bH\u0010B¨\u0006K"}, d2 = {"Lco/k;", "Landroid/os/Parcelable;", "", "rewardId", "", "imageUrl", "name", "Lco/m;", "rewardProgram", "description", "j$/time/ZonedDateTime", "validityDate", "termConditionsText", "", "earnRequirement", "progress", "Lco/n;", "rewardType", "", "hasUpc", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lco/m;Ljava/lang/String;Lj$/time/ZonedDateTime;Ljava/lang/String;DDLco/n;Z)V", "now", "q", "(Lj$/time/ZonedDateTime;)Z", "", "a", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "h", "()J", "b", "Ljava/lang/String;", "e", "c", "getName", "d", "Lco/m;", "i", "()Lco/m;", "f", "Lj$/time/ZonedDateTime;", "n", "()Lj$/time/ZonedDateTime;", "g", "k", "D", "()D", "j", "Lco/n;", "()Lco/n;", "Z", "()Z", "l", "getMperksDateFormatted$annotations", "()V", "mperksDateFormatted", "m", "o", "isAlwaysOnReward$annotations", "isAlwaysOnReward", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: co.k, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class RewardDetail implements Parcelable {
    public static final Parcelable.Creator<RewardDetail> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long rewardId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC6541m rewardProgram;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZonedDateTime validityDate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termConditionsText;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final double earnRequirement;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final double progress;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC6542n rewardType;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasUpc;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String mperksDateFormatted;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final boolean isAlwaysOnReward;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.k$a */
    public static final class a implements Parcelable.Creator<RewardDetail> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RewardDetail createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new RewardDetail(parcel.readLong(), parcel.readString(), parcel.readString(), EnumC6541m.valueOf(parcel.readString()), parcel.readString(), (ZonedDateTime) parcel.readSerializable(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), EnumC6542n.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RewardDetail[] newArray(int i10) {
            return new RewardDetail[i10];
        }
    }

    public RewardDetail(long j10, String str, String name, EnumC6541m rewardProgram, String str2, ZonedDateTime zonedDateTime, String str3, double d10, double d11, EnumC6542n rewardType, boolean z10) {
        ZonedDateTime zonedDateTimeN;
        Intrinsics.j(name, "name");
        Intrinsics.j(rewardProgram, "rewardProgram");
        Intrinsics.j(rewardType, "rewardType");
        this.rewardId = j10;
        this.imageUrl = str;
        this.name = name;
        this.rewardProgram = rewardProgram;
        this.description = str2;
        this.validityDate = zonedDateTime;
        this.termConditionsText = str3;
        this.earnRequirement = d10;
        this.progress = d11;
        this.rewardType = rewardType;
        this.hasUpc = z10;
        this.mperksDateFormatted = (zonedDateTime == null || (zonedDateTimeN = zonedDateTime.n(wk.e.EASTERN)) == null) ? null : zonedDateTimeN.format(C17898a.DATE_SLASHES_SHORT);
        Integer numValueOf = zonedDateTime != null ? Integer.valueOf(zonedDateTime.getYear()) : null;
        Intrinsics.g(numValueOf);
        this.isAlwaysOnReward = numValueOf.intValue() >= 2099;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardDetail)) {
            return false;
        }
        RewardDetail rewardDetail = (RewardDetail) other;
        return this.rewardId == rewardDetail.rewardId && Intrinsics.e(this.imageUrl, rewardDetail.imageUrl) && Intrinsics.e(this.name, rewardDetail.name) && this.rewardProgram == rewardDetail.rewardProgram && Intrinsics.e(this.description, rewardDetail.description) && Intrinsics.e(this.validityDate, rewardDetail.validityDate) && Intrinsics.e(this.termConditionsText, rewardDetail.termConditionsText) && Double.compare(this.earnRequirement, rewardDetail.earnRequirement) == 0 && Double.compare(this.progress, rewardDetail.progress) == 0 && this.rewardType == rewardDetail.rewardType && this.hasUpc == rewardDetail.hasUpc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeLong(this.rewardId);
        dest.writeString(this.imageUrl);
        dest.writeString(this.name);
        dest.writeString(this.rewardProgram.name());
        dest.writeString(this.description);
        dest.writeSerializable(this.validityDate);
        dest.writeString(this.termConditionsText);
        dest.writeDouble(this.earnRequirement);
        dest.writeDouble(this.progress);
        dest.writeString(this.rewardType.name());
        dest.writeInt(this.hasUpc ? 1 : 0);
    }

    public static /* synthetic */ boolean r(RewardDetail rewardDetail, ZonedDateTime zonedDateTime, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            zonedDateTime = ZonedDateTime.now();
        }
        return rewardDetail.q(zonedDateTime);
    }

    public final int a() {
        return (int) ChronoUnit.DAYS.between(ZonedDateTime.now(), this.validityDate);
    }

    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final double getEarnRequirement() {
        return this.earnRequirement;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getHasUpc() {
        return this.hasUpc;
    }

    /* renamed from: e, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: f, reason: from getter */
    public final String getMperksDateFormatted() {
        return this.mperksDateFormatted;
    }

    /* renamed from: g, reason: from getter */
    public final double getProgress() {
        return this.progress;
    }

    public final String getName() {
        return this.name;
    }

    /* renamed from: h, reason: from getter */
    public final long getRewardId() {
        return this.rewardId;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.rewardId) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.name.hashCode()) * 31) + this.rewardProgram.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.validityDate;
        int iHashCode4 = (iHashCode3 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        String str3 = this.termConditionsText;
        return ((((((((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + Double.hashCode(this.earnRequirement)) * 31) + Double.hashCode(this.progress)) * 31) + this.rewardType.hashCode()) * 31) + Boolean.hashCode(this.hasUpc);
    }

    /* renamed from: i, reason: from getter */
    public final EnumC6541m getRewardProgram() {
        return this.rewardProgram;
    }

    /* renamed from: j, reason: from getter */
    public final EnumC6542n getRewardType() {
        return this.rewardType;
    }

    /* renamed from: k, reason: from getter */
    public final String getTermConditionsText() {
        return this.termConditionsText;
    }

    /* renamed from: n, reason: from getter */
    public final ZonedDateTime getValidityDate() {
        return this.validityDate;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getIsAlwaysOnReward() {
        return this.isAlwaysOnReward;
    }

    public final boolean q(ZonedDateTime now) {
        Intrinsics.j(now, "now");
        ZonedDateTime zonedDateTime = this.validityDate;
        return zonedDateTime != null && now.isAfter(zonedDateTime);
    }

    public String toString() {
        return "RewardDetail(rewardId=" + this.rewardId + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", rewardProgram=" + this.rewardProgram + ", description=" + this.description + ", validityDate=" + this.validityDate + ", termConditionsText=" + this.termConditionsText + ", earnRequirement=" + this.earnRequirement + ", progress=" + this.progress + ", rewardType=" + this.rewardType + ", hasUpc=" + this.hasUpc + ')';
    }

    public /* synthetic */ RewardDetail(long j10, String str, String str2, EnumC6541m enumC6541m, String str3, ZonedDateTime zonedDateTime, String str4, double d10, double d11, EnumC6542n enumC6542n, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? "" : str2, (i10 & 8) != 0 ? EnumC6541m.f62801a : enumC6541m, (i10 & 16) != 0 ? null : str3, zonedDateTime, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? 0.0d : d10, (i10 & 256) != 0 ? 0.0d : d11, (i10 & 512) != 0 ? EnumC6542n.f62806b : enumC6542n, (i10 & 1024) != 0 ? false : z10);
    }
}
