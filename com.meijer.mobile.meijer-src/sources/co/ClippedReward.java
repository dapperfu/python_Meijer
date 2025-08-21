package co;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wk.C17898a;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b \u0010\u001dJ\u001a\u0010#\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b)\u0010\u001f\"\u0004\b+\u0010,R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010*\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010,R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010\u001f\"\u0004\b2\u0010,R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b.\u00103\u001a\u0004\b4\u00105R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010*\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u0010,R\u001f\u0010=\u001a\u0004\u0018\u0001088\u0006¢\u0006\u0012\n\u0004\b\u0010\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b-\u0010:R\u001d\u0010@\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b>\u0010&\u0012\u0004\b?\u0010<\u001a\u0004\b%\u0010(R\u0011\u0010A\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b0\u0010\u001f¨\u0006B"}, d2 = {"Lco/e;", "Landroid/os/Parcelable;", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "rewardId", "", "description", "imageUrl", "name", "j$/time/LocalDateTime", "expirationDate", "termsAndConditions", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDateTime;Ljava/lang/String;)V", "now", "", "g", "(Lj$/time/LocalDateTime;)Z", "Lco/k;", "i", "()Lco/k;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "f", "()J", "b", "Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "c", "e", "setImageUrl", "d", "getName", "setName", "Lj$/time/LocalDateTime;", "getExpirationDate", "()Lj$/time/LocalDateTime;", "getTermsAndConditions", "setTermsAndConditions", "j$/time/ZonedDateTime", "Lj$/time/ZonedDateTime;", "()Lj$/time/ZonedDateTime;", "getEndDate$annotations", "()V", "endDate", "h", "getDaysLeft$annotations", "daysLeft", "formattedExpirationDate", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: co.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class ClippedReward implements Parcelable {
    public static final Parcelable.Creator<ClippedReward> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long rewardId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String imageUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime expirationDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String termsAndConditions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ZonedDateTime endDate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long daysLeft;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.e$a */
    public static final class a implements Parcelable.Creator<ClippedReward> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClippedReward createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new ClippedReward(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), (LocalDateTime) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ClippedReward[] newArray(int i10) {
            return new ClippedReward[i10];
        }
    }

    public ClippedReward() {
        this(0L, null, null, null, null, null, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClippedReward)) {
            return false;
        }
        ClippedReward clippedReward = (ClippedReward) other;
        return this.rewardId == clippedReward.rewardId && Intrinsics.e(this.description, clippedReward.description) && Intrinsics.e(this.imageUrl, clippedReward.imageUrl) && Intrinsics.e(this.name, clippedReward.name) && Intrinsics.e(this.expirationDate, clippedReward.expirationDate) && Intrinsics.e(this.termsAndConditions, clippedReward.termsAndConditions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeLong(this.rewardId);
        dest.writeString(this.description);
        dest.writeString(this.imageUrl);
        dest.writeString(this.name);
        dest.writeSerializable(this.expirationDate);
        dest.writeString(this.termsAndConditions);
    }

    public ClippedReward(long j10, String str, String str2, String str3, LocalDateTime localDateTime, String str4) {
        this.rewardId = j10;
        this.description = str;
        this.imageUrl = str2;
        this.name = str3;
        this.expirationDate = localDateTime;
        this.termsAndConditions = str4;
        ZonedDateTime zonedDateTimeN = localDateTime != null ? localDateTime.N(ZoneId.systemDefault()) : null;
        this.endDate = zonedDateTimeN;
        this.daysLeft = ChronoUnit.DAYS.between(ZonedDateTime.now(), zonedDateTimeN);
    }

    public static /* synthetic */ boolean h(ClippedReward clippedReward, LocalDateTime localDateTime, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localDateTime = LocalDateTime.now();
        }
        return clippedReward.g(localDateTime);
    }

    /* renamed from: a, reason: from getter */
    public final long getDaysLeft() {
        return this.daysLeft;
    }

    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final ZonedDateTime getEndDate() {
        return this.endDate;
    }

    public final String d() {
        LocalDateTime localDateTime = this.expirationDate;
        String str = localDateTime != null ? localDateTime.format(C17898a.DATE_SLASHES_SHORT) : null;
        return str == null ? "" : str;
    }

    /* renamed from: e, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: f, reason: from getter */
    public final long getRewardId() {
        return this.rewardId;
    }

    public final boolean g(LocalDateTime now) {
        Intrinsics.j(now, "now");
        LocalDateTime localDateTime = this.expirationDate;
        return localDateTime != null && now.isAfter(localDateTime);
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.rewardId) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LocalDateTime localDateTime = this.expirationDate;
        int iHashCode5 = (iHashCode4 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        String str4 = this.termsAndConditions;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final RewardDetail i() {
        long j10 = this.rewardId;
        String str = this.imageUrl;
        String str2 = this.name;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.description;
        if (str3 == null) {
            str3 = "";
        }
        LocalDateTime localDateTime = this.expirationDate;
        ZonedDateTime zonedDateTimeN = localDateTime != null ? localDateTime.N(ZoneId.systemDefault()) : null;
        String str4 = this.termsAndConditions;
        if (str4 == null) {
            str4 = "";
        }
        return new RewardDetail(j10, str, str2, null, str3, zonedDateTimeN, str4, 0.0d, 0.0d, null, false, 1928, null);
    }

    public String toString() {
        return "ClippedReward(rewardId=" + this.rewardId + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", expirationDate=" + this.expirationDate + ", termsAndConditions=" + this.termsAndConditions + ')';
    }

    public /* synthetic */ ClippedReward(long j10, String str, String str2, String str3, LocalDateTime localDateTime, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : localDateTime, (i10 & 32) != 0 ? null : str4);
    }
}
