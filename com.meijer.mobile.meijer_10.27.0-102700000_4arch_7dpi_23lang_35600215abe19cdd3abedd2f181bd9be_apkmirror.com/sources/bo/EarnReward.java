package bo;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import vk.C17590a;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\bH\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u0000 \u0085\u00012\u00020\u0001:\u0001-B×\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010%J\u001a\u0010+\u001a\u00020\u00162\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u0010'\"\u0004\b6\u00107R$\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00104\u001a\u0004\b9\u0010'\"\u0004\b:\u00107R$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00104\u001a\u0004\b<\u0010'\"\u0004\b=\u00107R$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00104\u001a\u0004\b8\u0010'\"\u0004\b?\u00107R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010A\u001a\u0004\b@\u0010C\"\u0004\bG\u0010ER$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\bH\u0010'\"\u0004\bI\u00107R$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u00104\u001a\u0004\bK\u0010'\"\u0004\bL\u00107R$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00104\u001a\u0004\bM\u0010'\"\u0004\bN\u00107R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\b;\u0010Q\"\u0004\bR\u0010SR\"\u0010\u0011\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010P\u001a\u0004\bU\u0010Q\"\u0004\bV\u0010SR$\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u00104\u001a\u0004\bX\u0010'\"\u0004\bY\u00107R$\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010.\u001a\u0004\b[\u00100\"\u0004\b\\\u00102R$\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010.\u001a\u0004\b^\u00100\"\u0004\b_\u00102R$\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010.\u001a\u0004\ba\u00100\"\u0004\bb\u00102R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010c\u001a\u0004\bF\u0010e\"\u0004\bi\u0010gR\u001d\u0010m\u001a\u00020\u00048\u0006¢\u0006\u0012\n\u0004\bj\u00104\u0012\u0004\bk\u0010l\u001a\u0004\b>\u0010'R\u001d\u0010q\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\bn\u0010o\u0012\u0004\bp\u0010l\u001a\u0004\b3\u0010%R\u001d\u0010w\u001a\u00020r8\u0006¢\u0006\u0012\n\u0004\bs\u0010t\u0012\u0004\bv\u0010l\u001a\u0004\bZ\u0010uR\u001d\u0010}\u001a\u00020x8\u0006¢\u0006\u0012\n\u0004\by\u0010z\u0012\u0004\b|\u0010l\u001a\u0004\bO\u0010{R\u001e\u0010\u0080\u0001\u001a\u00020\u00168\u0006¢\u0006\u0012\n\u0004\b~\u0010c\u0012\u0004\b\u007f\u0010l\u001a\u0004\b]\u0010eR \u0010\u0083\u0001\u001a\u00020\u00048\u0006¢\u0006\u0014\n\u0005\b\u0081\u0001\u00104\u0012\u0005\b\u0082\u0001\u0010l\u001a\u0004\b-\u0010'R\u0012\u0010\u0084\u0001\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bJ\u0010Q¨\u0006\u0086\u0001"}, d2 = {"Lbo/f;", "Landroid/os/Parcelable;", "", "rewardId", "", "rewardProgram", "imageUrl", "title", "description", "j$/time/ZonedDateTime", "startAt", "endAt", "terms", "productCategory", "earnKind", "", "earnRequirement", "progress", "earnMetric", "maxDaysToEarn", "maxDaysToRedeem", "maxEarnCount", "", "allowCarryOver", "hasUpcs", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZZ)V", "Lbo/j;", "q", "()Lbo/j;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "setRewardId", "(Ljava/lang/Integer;)V", "b", "Ljava/lang/String;", "getRewardProgram", "setRewardProgram", "(Ljava/lang/String;)V", "c", "h", "setImageUrl", "d", "getTitle", "setTitle", "e", "setDescription", "f", "Lj$/time/ZonedDateTime;", "getStartAt", "()Lj$/time/ZonedDateTime;", "setStartAt", "(Lj$/time/ZonedDateTime;)V", "g", "setEndAt", "getTerms", "setTerms", "i", "getProductCategory", "setProductCategory", "getEarnKind", "setEarnKind", "k", "D", "()D", "setEarnRequirement", "(D)V", "l", "getProgress", "setProgress", "m", "getEarnMetric", "setEarnMetric", "n", "getMaxDaysToEarn", "setMaxDaysToEarn", "o", "getMaxDaysToRedeem", "setMaxDaysToRedeem", "p", "getMaxEarnCount", "setMaxEarnCount", "Z", "getAllowCarryOver", "()Z", "setAllowCarryOver", "(Z)V", "r", "setHasUpcs", "s", "getEarnThruDate$annotations", "()V", "earnThruDate", "t", "I", "getDaysLeft$annotations", "daysLeft", "Lbo/l;", "u", "Lbo/l;", "()Lbo/l;", "getRewardType$annotations", "rewardType", "Lbo/k;", "v", "Lbo/k;", "()Lbo/k;", "getRewardProgramType$annotations", "rewardProgramType", "w", "getShouldShowDateUI$annotations", "shouldShowDateUI", "x", "getDateFormattedForAnalytics$annotations", "dateFormattedForAnalytics", "progressValueOfReward", "y", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bo.f, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class EarnReward implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer rewardId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String rewardProgram;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String imageUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private ZonedDateTime startAt;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private ZonedDateTime endAt;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private String terms;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private String productCategory;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private String earnKind;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private double earnRequirement;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private double progress;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private String earnMetric;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer maxDaysToEarn;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer maxDaysToRedeem;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer maxEarnCount;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean allowCarryOver;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean hasUpcs;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final String earnThruDate;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final int daysLeft;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final l rewardType;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final k rewardProgramType;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldShowDateUI;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final String dateFormattedForAnalytics;
    public static final Parcelable.Creator<EarnReward> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bo.f$b */
    public static final class b implements Parcelable.Creator<EarnReward> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarnReward createFromParcel(Parcel parcel) {
            boolean z10;
            Intrinsics.j(parcel, "parcel");
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
            ZonedDateTime zonedDateTime2 = (ZonedDateTime) parcel.readSerializable();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            double d10 = parcel.readDouble();
            double d11 = parcel.readDouble();
            String string8 = parcel.readString();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
            return new EarnReward(numValueOf, string, string2, string3, string4, zonedDateTime, zonedDateTime2, string5, string6, string7, d10, d11, string8, numValueOf2, numValueOf3, numValueOf4, z11, parcel.readInt() == 0 ? z10 : true);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EarnReward[] newArray(int i10) {
            return new EarnReward[i10];
        }
    }

    public EarnReward() {
        this(null, null, null, null, null, null, null, null, null, null, 0.0d, 0.0d, null, null, null, null, false, false, 262143, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EarnReward)) {
            return false;
        }
        EarnReward earnReward = (EarnReward) other;
        return Intrinsics.e(this.rewardId, earnReward.rewardId) && Intrinsics.e(this.rewardProgram, earnReward.rewardProgram) && Intrinsics.e(this.imageUrl, earnReward.imageUrl) && Intrinsics.e(this.title, earnReward.title) && Intrinsics.e(this.description, earnReward.description) && Intrinsics.e(this.startAt, earnReward.startAt) && Intrinsics.e(this.endAt, earnReward.endAt) && Intrinsics.e(this.terms, earnReward.terms) && Intrinsics.e(this.productCategory, earnReward.productCategory) && Intrinsics.e(this.earnKind, earnReward.earnKind) && Double.compare(this.earnRequirement, earnReward.earnRequirement) == 0 && Double.compare(this.progress, earnReward.progress) == 0 && Intrinsics.e(this.earnMetric, earnReward.earnMetric) && Intrinsics.e(this.maxDaysToEarn, earnReward.maxDaysToEarn) && Intrinsics.e(this.maxDaysToRedeem, earnReward.maxDaysToRedeem) && Intrinsics.e(this.maxEarnCount, earnReward.maxEarnCount) && this.allowCarryOver == earnReward.allowCarryOver && this.hasUpcs == earnReward.hasUpcs;
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
        dest.writeString(this.rewardProgram);
        dest.writeString(this.imageUrl);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeSerializable(this.startAt);
        dest.writeSerializable(this.endAt);
        dest.writeString(this.terms);
        dest.writeString(this.productCategory);
        dest.writeString(this.earnKind);
        dest.writeDouble(this.earnRequirement);
        dest.writeDouble(this.progress);
        dest.writeString(this.earnMetric);
        Integer num2 = this.maxDaysToEarn;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Integer num3 = this.maxDaysToRedeem;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num3.intValue());
        }
        Integer num4 = this.maxEarnCount;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num4.intValue());
        }
        dest.writeInt(this.allowCarryOver ? 1 : 0);
        dest.writeInt(this.hasUpcs ? 1 : 0);
    }

    public EarnReward(Integer num, String str, String str2, String str3, String str4, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str5, String str6, String str7, double d10, double d11, String str8, Integer num2, Integer num3, Integer num4, boolean z10, boolean z11) {
        ZonedDateTime zonedDateTimeN;
        ZonedDateTime zonedDateTimeN2;
        this.rewardId = num;
        this.rewardProgram = str;
        this.imageUrl = str2;
        this.title = str3;
        this.description = str4;
        this.startAt = zonedDateTime;
        this.endAt = zonedDateTime2;
        this.terms = str5;
        this.productCategory = str6;
        this.earnKind = str7;
        this.earnRequirement = d10;
        this.progress = d11;
        this.earnMetric = str8;
        this.maxDaysToEarn = num2;
        this.maxDaysToRedeem = num3;
        this.maxEarnCount = num4;
        this.allowCarryOver = z10;
        this.hasUpcs = z11;
        String str9 = null;
        String str10 = (zonedDateTime2 == null || (zonedDateTimeN2 = zonedDateTime2.n(vk.e.EASTERN)) == null) ? null : zonedDateTimeN2.format(C17590a.DATE_SLASHES_SHORT);
        this.earnThruDate = str10 == null ? "" : str10;
        this.daysLeft = (int) ChronoUnit.DAYS.between(ZonedDateTime.now(), this.endAt);
        boolean z12 = false;
        this.rewardType = StringsKt.I(this.earnMetric, "Dollar", false, 2, null) ? l.f60604a : l.f60605b;
        this.rewardProgramType = StringsKt.I(this.rewardProgram, "booster", false, 2, null) ? k.f60600a : k.f60601b;
        if (this.earnRequirement != 0.0d) {
            ZonedDateTime zonedDateTime3 = this.endAt;
            Integer numValueOf = zonedDateTime3 != null ? Integer.valueOf(zonedDateTime3.getYear()) : null;
            Intrinsics.g(numValueOf);
            if (numValueOf.intValue() < 2099) {
                z12 = true;
            }
        }
        this.shouldShowDateUI = z12;
        ZonedDateTime zonedDateTime4 = this.endAt;
        if (zonedDateTime4 != null && (zonedDateTimeN = zonedDateTime4.n(vk.e.EASTERN)) != null) {
            str9 = zonedDateTimeN.format(C17590a.DATE_FORMAT_MM_DD_YYYY);
        }
        this.dateFormattedForAnalytics = str9 != null ? str9 : "";
    }

    /* renamed from: a, reason: from getter */
    public final String getDateFormattedForAnalytics() {
        return this.dateFormattedForAnalytics;
    }

    /* renamed from: b, reason: from getter */
    public final int getDaysLeft() {
        return this.daysLeft;
    }

    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: d, reason: from getter */
    public final double getEarnRequirement() {
        return this.earnRequirement;
    }

    /* renamed from: e, reason: from getter */
    public final String getEarnThruDate() {
        return this.earnThruDate;
    }

    /* renamed from: f, reason: from getter */
    public final ZonedDateTime getEndAt() {
        return this.endAt;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getHasUpcs() {
        return this.hasUpcs;
    }

    public final String getTitle() {
        return this.title;
    }

    /* renamed from: h, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        Integer num = this.rewardId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.rewardProgram;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.startAt;
        int iHashCode6 = (iHashCode5 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.endAt;
        int iHashCode7 = (iHashCode6 + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        String str5 = this.terms;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.productCategory;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.earnKind;
        int iHashCode10 = (((((iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31) + Double.hashCode(this.earnRequirement)) * 31) + Double.hashCode(this.progress)) * 31;
        String str8 = this.earnMetric;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num2 = this.maxDaysToEarn;
        int iHashCode12 = (iHashCode11 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.maxDaysToRedeem;
        int iHashCode13 = (iHashCode12 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.maxEarnCount;
        return ((((iHashCode13 + (num4 != null ? num4.hashCode() : 0)) * 31) + Boolean.hashCode(this.allowCarryOver)) * 31) + Boolean.hashCode(this.hasUpcs);
    }

    public final double i() {
        double d10 = this.earnRequirement;
        if (d10 == 0.0d) {
            return 0.0d;
        }
        double d11 = this.progress;
        return d11 > d10 ? d11 % d10 : d11;
    }

    /* renamed from: j, reason: from getter */
    public final Integer getRewardId() {
        return this.rewardId;
    }

    /* renamed from: k, reason: from getter */
    public final k getRewardProgramType() {
        return this.rewardProgramType;
    }

    /* renamed from: n, reason: from getter */
    public final l getRewardType() {
        return this.rewardType;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getShouldShowDateUI() {
        return this.shouldShowDateUI;
    }

    public final RewardDetail q() {
        Integer num = this.rewardId;
        String str = this.imageUrl;
        String str2 = this.title;
        String str3 = this.description;
        ZonedDateTime zonedDateTime = this.endAt;
        String str4 = this.terms;
        return new RewardDetail(num, str, str2, this.rewardProgramType.name(), str3, zonedDateTime, str4, this.productCategory, this.rewardProgramType == k.f60600a ? null : Double.valueOf(this.earnRequirement), Double.valueOf(i()), this.rewardType.name(), Boolean.valueOf(this.hasUpcs));
    }

    public String toString() {
        return "EarnReward(rewardId=" + this.rewardId + ", rewardProgram=" + this.rewardProgram + ", imageUrl=" + this.imageUrl + ", title=" + this.title + ", description=" + this.description + ", startAt=" + this.startAt + ", endAt=" + this.endAt + ", terms=" + this.terms + ", productCategory=" + this.productCategory + ", earnKind=" + this.earnKind + ", earnRequirement=" + this.earnRequirement + ", progress=" + this.progress + ", earnMetric=" + this.earnMetric + ", maxDaysToEarn=" + this.maxDaysToEarn + ", maxDaysToRedeem=" + this.maxDaysToRedeem + ", maxEarnCount=" + this.maxEarnCount + ", allowCarryOver=" + this.allowCarryOver + ", hasUpcs=" + this.hasUpcs + ')';
    }

    public /* synthetic */ EarnReward(Integer num, String str, String str2, String str3, String str4, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str5, String str6, String str7, double d10, double d11, String str8, Integer num2, Integer num3, Integer num4, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : zonedDateTime, (i10 & 64) != 0 ? null : zonedDateTime2, (i10 & 128) != 0 ? null : str5, (i10 & 256) != 0 ? null : str6, (i10 & 512) != 0 ? null : str7, (i10 & 1024) != 0 ? 0.0d : d10, (i10 & RecyclerView.m.FLAG_MOVED) == 0 ? d11 : 0.0d, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str8, (i10 & 8192) != 0 ? null : num2, (i10 & 16384) != 0 ? null : num3, (i10 & 32768) != 0 ? null : num4, (i10 & 65536) != 0 ? false : z10, (i10 & 131072) != 0 ? false : z11);
    }
}
