package bo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vk.C17590a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0002¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0019J\u001a\u0010&\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b+\u0010\"R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u0010\"R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b8\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b.\u0010;R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b1\u0010:\u001a\u0004\b6\u0010;R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b9\u0010\"R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b0\u0010>R\u001f\u0010B\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0012\n\u0004\b?\u0010,\u0012\u0004\b@\u0010A\u001a\u0004\b2\u0010\"R\u001d\u0010G\u001a\u00020\u00118\u0006¢\u0006\u0012\n\u0004\b4\u0010C\u0012\u0004\bF\u0010A\u001a\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lbo/j;", "Landroid/os/Parcelable;", "", "rewardId", "", "imageUrl", "name", "rewardsProgram", "description", "j$/time/ZonedDateTime", "validityDate", "termConditionsText", "productCategory", "", "earnRequirement", "progress", "rewardType", "", "hasUpc", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/ZonedDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Boolean;)V", "now", "q", "(Lj$/time/ZonedDateTime;)Z", "a", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "h", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "e", "c", "getName", "d", "j", "f", "Lj$/time/ZonedDateTime;", "n", "()Lj$/time/ZonedDateTime;", "g", "k", "getProductCategory", "i", "Ljava/lang/Double;", "()Ljava/lang/Double;", "l", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "m", "getMperksDateFormatted$annotations", "()V", "mperksDateFormatted", "Z", "o", "()Z", "isAlwaysOnReward$annotations", "isAlwaysOnReward", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: bo.j, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class RewardDetail implements Parcelable {
    public static final Parcelable.Creator<RewardDetail> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer rewardId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rewardsProgram;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZonedDateTime validityDate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String termConditionsText;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String productCategory;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double earnRequirement;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Double progress;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rewardType;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean hasUpc;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String mperksDateFormatted;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final boolean isAlwaysOnReward;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bo.j$a */
    public static final class a implements Parcelable.Creator<RewardDetail> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RewardDetail createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String string7 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new RewardDetail(numValueOf, string, string2, string3, string4, zonedDateTime, string5, string6, dValueOf, dValueOf2, string7, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final RewardDetail[] newArray(int i10) {
            return new RewardDetail[i10];
        }
    }

    public RewardDetail(Integer num, String str, String str2, String str3, String str4, ZonedDateTime zonedDateTime, String str5, String str6, Double d10, Double d11, String str7, Boolean bool) {
        ZonedDateTime zonedDateTimeN;
        this.rewardId = num;
        this.imageUrl = str;
        this.name = str2;
        this.rewardsProgram = str3;
        this.description = str4;
        this.validityDate = zonedDateTime;
        this.termConditionsText = str5;
        this.productCategory = str6;
        this.earnRequirement = d10;
        this.progress = d11;
        this.rewardType = str7;
        this.hasUpc = bool;
        this.mperksDateFormatted = (zonedDateTime == null || (zonedDateTimeN = zonedDateTime.n(vk.e.EASTERN)) == null) ? null : zonedDateTimeN.format(C17590a.DATE_SLASHES_SHORT);
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
        return Intrinsics.e(this.rewardId, rewardDetail.rewardId) && Intrinsics.e(this.imageUrl, rewardDetail.imageUrl) && Intrinsics.e(this.name, rewardDetail.name) && Intrinsics.e(this.rewardsProgram, rewardDetail.rewardsProgram) && Intrinsics.e(this.description, rewardDetail.description) && Intrinsics.e(this.validityDate, rewardDetail.validityDate) && Intrinsics.e(this.termConditionsText, rewardDetail.termConditionsText) && Intrinsics.e(this.productCategory, rewardDetail.productCategory) && Intrinsics.e(this.earnRequirement, rewardDetail.earnRequirement) && Intrinsics.e(this.progress, rewardDetail.progress) && Intrinsics.e(this.rewardType, rewardDetail.rewardType) && Intrinsics.e(this.hasUpc, rewardDetail.hasUpc);
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
    public final Double getEarnRequirement() {
        return this.earnRequirement;
    }

    /* renamed from: d, reason: from getter */
    public final Boolean getHasUpc() {
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
    public final Double getProgress() {
        return this.progress;
    }

    public final String getName() {
        return this.name;
    }

    /* renamed from: h, reason: from getter */
    public final Integer getRewardId() {
        return this.rewardId;
    }

    public int hashCode() {
        Integer num = this.rewardId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rewardsProgram;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.validityDate;
        int iHashCode6 = (iHashCode5 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        String str5 = this.termConditionsText;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.productCategory;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Double d10 = this.earnRequirement;
        int iHashCode9 = (iHashCode8 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.progress;
        int iHashCode10 = (iHashCode9 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str7 = this.rewardType;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.hasUpc;
        return iHashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getRewardType() {
        return this.rewardType;
    }

    /* renamed from: j, reason: from getter */
    public final String getRewardsProgram() {
        return this.rewardsProgram;
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
        return "RewardDetail(rewardId=" + this.rewardId + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", rewardsProgram=" + this.rewardsProgram + ", description=" + this.description + ", validityDate=" + this.validityDate + ", termConditionsText=" + this.termConditionsText + ", productCategory=" + this.productCategory + ", earnRequirement=" + this.earnRequirement + ", progress=" + this.progress + ", rewardType=" + this.rewardType + ", hasUpc=" + this.hasUpc + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        Integer num = this.rewardId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.imageUrl);
        dest.writeString(this.name);
        dest.writeString(this.rewardsProgram);
        dest.writeString(this.description);
        dest.writeSerializable(this.validityDate);
        dest.writeString(this.termConditionsText);
        dest.writeString(this.productCategory);
        Double d10 = this.earnRequirement;
        if (d10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d10.doubleValue());
        }
        Double d11 = this.progress;
        if (d11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d11.doubleValue());
        }
        dest.writeString(this.rewardType);
        Boolean bool = this.hasUpc;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RewardDetail(Integer num, String str, String str2, String str3, String str4, ZonedDateTime zonedDateTime, String str5, String str6, Double d10, Double d11, String str7, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Double dValueOf = Double.valueOf(0.0d);
        this((i10 & 1) != 0 ? null : num, str, str2, (i10 & 8) != 0 ? null : str3, str4, zonedDateTime, str5, (i10 & 128) != 0 ? null : str6, (i10 & 256) != 0 ? dValueOf : d10, (i10 & 512) != 0 ? dValueOf : d11, (i10 & 1024) != 0 ? null : str7, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : bool);
    }
}
