package co;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b<\b\u0087\b\u0018\u0000 g2\u00020\u0001:\u00010Bµ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0015¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\u0015¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b+\u0010(J\u001a\u0010.\u001a\u00020\u00192\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010*R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010*R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b8\u0010*R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bB\u0010?\u001a\u0004\b>\u0010AR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b:\u00109\u001a\u0004\bC\u0010*R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b2\u0010H\u001a\u0004\b;\u0010IR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b6\u0010H\u001a\u0004\bJ\u0010IR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010(R\u0017\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bM\u0010P\u001a\u0004\bR\u0010(R\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bS\u0010P\u001a\u0004\bT\u0010(R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR\u0017\u0010\u001b\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001f\u0010V\u001a\u0004\bB\u0010XR\u001d\u0010\\\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\bY\u00109\u0012\u0004\bZ\u0010[\u001a\u0004\b=\u0010*R\u001d\u0010_\u001a\u00020\u00158\u0006¢\u0006\u0012\n\u0004\b]\u0010P\u0012\u0004\b^\u0010[\u001a\u0004\b4\u0010(R\u001d\u0010b\u001a\u00020\u00198\u0006¢\u0006\u0012\n\u0004\b`\u0010V\u0012\u0004\ba\u0010[\u001a\u0004\bS\u0010XR\u001d\u0010e\u001a\u00020\u00068\u0006¢\u0006\u0012\n\u0004\bc\u00109\u0012\u0004\bd\u0010[\u001a\u0004\b0\u0010*R\u0011\u0010f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\bD\u0010I¨\u0006h"}, d2 = {"Lco/g;", "Landroid/os/Parcelable;", "", "rewardId", "Lco/m;", "rewardProgram", "", "imageUrl", "title", "description", "j$/time/ZonedDateTime", "startAt", "endAt", "terms", "Lco/l;", "earnKind", "", "earnRequirement", "progress", "Lco/n;", "rewardType", "", "maxDaysToEarn", "maxDaysToRedeem", "maxEarnCount", "", "allowCarryOver", "hasUpcs", "<init>", "(JLco/m;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/lang/String;Lco/l;DDLco/n;IIIZZ)V", "Lco/k;", "q", "()Lco/k;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "j", "()J", "b", "Lco/m;", "k", "()Lco/m;", "c", "Ljava/lang/String;", "h", "d", "getTitle", "e", "f", "Lj$/time/ZonedDateTime;", "getStartAt", "()Lj$/time/ZonedDateTime;", "g", "getTerms", "i", "Lco/l;", "getEarnKind", "()Lco/l;", "D", "()D", "getProgress", "l", "Lco/n;", "n", "()Lco/n;", "m", "I", "getMaxDaysToEarn", "getMaxDaysToRedeem", "o", "getMaxEarnCount", "p", "Z", "getAllowCarryOver", "()Z", "r", "getEarnThruDate$annotations", "()V", "earnThruDate", "s", "getDaysLeft$annotations", "daysLeft", "t", "getShouldShowDateUI$annotations", "shouldShowDateUI", "u", "getDateFormattedForAnalytics$annotations", "dateFormattedForAnalytics", "progressValueOfReward", "v", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: co.g, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class EarnReward implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long rewardId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC6541m rewardProgram;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZonedDateTime startAt;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZonedDateTime endAt;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String terms;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC6540l earnKind;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final double earnRequirement;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final double progress;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC6542n rewardType;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxDaysToEarn;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxDaysToRedeem;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxEarnCount;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allowCarryOver;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasUpcs;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final String earnThruDate;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final int daysLeft;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldShowDateUI;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final String dateFormattedForAnalytics;
    public static final Parcelable.Creator<EarnReward> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: co.g$b */
    public static final class b implements Parcelable.Creator<EarnReward> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarnReward createFromParcel(Parcel parcel) {
            boolean z10;
            Intrinsics.j(parcel, "parcel");
            long j10 = parcel.readLong();
            EnumC6541m enumC6541mValueOf = EnumC6541m.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
            ZonedDateTime zonedDateTime2 = (ZonedDateTime) parcel.readSerializable();
            String string4 = parcel.readString();
            EnumC6540l enumC6540lValueOf = EnumC6540l.valueOf(parcel.readString());
            double d10 = parcel.readDouble();
            double d11 = parcel.readDouble();
            EnumC6542n enumC6542nValueOf = EnumC6542n.valueOf(parcel.readString());
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            int i12 = parcel.readInt();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
            return new EarnReward(j10, enumC6541mValueOf, string, string2, string3, zonedDateTime, zonedDateTime2, string4, enumC6540lValueOf, d10, d11, enumC6542nValueOf, i10, i11, i12, z11, parcel.readInt() == 0 ? z10 : true);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EarnReward[] newArray(int i10) {
            return new EarnReward[i10];
        }
    }

    public EarnReward() {
        this(0L, null, null, null, null, null, null, null, null, 0.0d, 0.0d, null, 0, 0, 0, false, false, 131071, null);
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
        return this.rewardId == earnReward.rewardId && this.rewardProgram == earnReward.rewardProgram && Intrinsics.e(this.imageUrl, earnReward.imageUrl) && Intrinsics.e(this.title, earnReward.title) && Intrinsics.e(this.description, earnReward.description) && Intrinsics.e(this.startAt, earnReward.startAt) && Intrinsics.e(this.endAt, earnReward.endAt) && Intrinsics.e(this.terms, earnReward.terms) && this.earnKind == earnReward.earnKind && Double.compare(this.earnRequirement, earnReward.earnRequirement) == 0 && Double.compare(this.progress, earnReward.progress) == 0 && this.rewardType == earnReward.rewardType && this.maxDaysToEarn == earnReward.maxDaysToEarn && this.maxDaysToRedeem == earnReward.maxDaysToRedeem && this.maxEarnCount == earnReward.maxEarnCount && this.allowCarryOver == earnReward.allowCarryOver && this.hasUpcs == earnReward.hasUpcs;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeLong(this.rewardId);
        dest.writeString(this.rewardProgram.name());
        dest.writeString(this.imageUrl);
        dest.writeString(this.title);
        dest.writeString(this.description);
        dest.writeSerializable(this.startAt);
        dest.writeSerializable(this.endAt);
        dest.writeString(this.terms);
        dest.writeString(this.earnKind.name());
        dest.writeDouble(this.earnRequirement);
        dest.writeDouble(this.progress);
        dest.writeString(this.rewardType.name());
        dest.writeInt(this.maxDaysToEarn);
        dest.writeInt(this.maxDaysToRedeem);
        dest.writeInt(this.maxEarnCount);
        dest.writeInt(this.allowCarryOver ? 1 : 0);
        dest.writeInt(this.hasUpcs ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EarnReward(long r10, co.EnumC6541m r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, j$.time.ZonedDateTime r16, j$.time.ZonedDateTime r17, java.lang.String r18, co.EnumC6540l r19, double r20, double r22, co.EnumC6542n r24, int r25, int r26, int r27, boolean r28, boolean r29) {
        /*
            r9 = this;
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r24
            java.lang.String r8 = "rewardProgram"
            kotlin.jvm.internal.Intrinsics.j(r12, r8)
            java.lang.String r8 = "imageUrl"
            kotlin.jvm.internal.Intrinsics.j(r13, r8)
            java.lang.String r8 = "title"
            kotlin.jvm.internal.Intrinsics.j(r14, r8)
            java.lang.String r8 = "description"
            kotlin.jvm.internal.Intrinsics.j(r15, r8)
            java.lang.String r8 = "terms"
            kotlin.jvm.internal.Intrinsics.j(r3, r8)
            java.lang.String r8 = "earnKind"
            kotlin.jvm.internal.Intrinsics.j(r4, r8)
            java.lang.String r8 = "rewardType"
            kotlin.jvm.internal.Intrinsics.j(r7, r8)
            r9.<init>()
            r9.rewardId = r10
            r9.rewardProgram = r12
            r9.imageUrl = r13
            r9.title = r14
            r9.description = r15
            r10 = r16
            r9.startAt = r10
            r9.endAt = r2
            r9.terms = r3
            r9.earnKind = r4
            r9.earnRequirement = r5
            r10 = r22
            r9.progress = r10
            r9.rewardType = r7
            r10 = r25
            r9.maxDaysToEarn = r10
            r10 = r26
            r9.maxDaysToRedeem = r10
            r10 = r27
            r9.maxEarnCount = r10
            r10 = r28
            r9.allowCarryOver = r10
            r10 = r29
            r9.hasUpcs = r10
            r10 = 0
            if (r2 == 0) goto L72
            j$.time.ZoneId r11 = wk.e.EASTERN
            j$.time.ZonedDateTime r11 = r2.n(r11)
            if (r11 == 0) goto L72
            j$.time.format.DateTimeFormatter r12 = wk.C17898a.DATE_SLASHES_SHORT
            java.lang.String r11 = r11.format(r12)
            goto L73
        L72:
            r11 = r10
        L73:
            java.lang.String r12 = ""
            if (r11 != 0) goto L78
            r11 = r12
        L78:
            r9.earnThruDate = r11
            j$.time.temporal.ChronoUnit r11 = j$.time.temporal.ChronoUnit.DAYS
            j$.time.ZonedDateTime r13 = j$.time.ZonedDateTime.now()
            long r0 = r11.between(r13, r2)
            int r11 = (int) r0
            r9.daysLeft = r11
            r0 = 0
            int r11 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r11 != 0) goto L8e
            goto La7
        L8e:
            if (r2 == 0) goto L99
            int r11 = r2.getYear()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L9a
        L99:
            r11 = r10
        L9a:
            kotlin.jvm.internal.Intrinsics.g(r11)
            int r11 = r11.intValue()
            r13 = 2099(0x833, float:2.941E-42)
            if (r11 >= r13) goto La7
            r11 = 1
            goto La8
        La7:
            r11 = 0
        La8:
            r9.shouldShowDateUI = r11
            if (r2 == 0) goto Lba
            j$.time.ZoneId r11 = wk.e.EASTERN
            j$.time.ZonedDateTime r11 = r2.n(r11)
            if (r11 == 0) goto Lba
            j$.time.format.DateTimeFormatter r10 = wk.C17898a.DATE_FORMAT_MM_DD_YYYY
            java.lang.String r10 = r11.format(r10)
        Lba:
            if (r10 != 0) goto Lbd
            goto Lbe
        Lbd:
            r12 = r10
        Lbe:
            r9.dateFormattedForAnalytics = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: co.EarnReward.<init>(long, co.m, java.lang.String, java.lang.String, java.lang.String, j$.time.ZonedDateTime, j$.time.ZonedDateTime, java.lang.String, co.l, double, double, co.n, int, int, int, boolean, boolean):void");
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
        int iHashCode = ((((((((Long.hashCode(this.rewardId) * 31) + this.rewardProgram.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        ZonedDateTime zonedDateTime = this.startAt;
        int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.endAt;
        return ((((((((((((((((((((iHashCode2 + (zonedDateTime2 != null ? zonedDateTime2.hashCode() : 0)) * 31) + this.terms.hashCode()) * 31) + this.earnKind.hashCode()) * 31) + Double.hashCode(this.earnRequirement)) * 31) + Double.hashCode(this.progress)) * 31) + this.rewardType.hashCode()) * 31) + Integer.hashCode(this.maxDaysToEarn)) * 31) + Integer.hashCode(this.maxDaysToRedeem)) * 31) + Integer.hashCode(this.maxEarnCount)) * 31) + Boolean.hashCode(this.allowCarryOver)) * 31) + Boolean.hashCode(this.hasUpcs);
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
    public final long getRewardId() {
        return this.rewardId;
    }

    /* renamed from: k, reason: from getter */
    public final EnumC6541m getRewardProgram() {
        return this.rewardProgram;
    }

    /* renamed from: n, reason: from getter */
    public final EnumC6542n getRewardType() {
        return this.rewardType;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getShouldShowDateUI() {
        return this.shouldShowDateUI;
    }

    public final RewardDetail q() {
        long j10 = this.rewardId;
        String str = this.imageUrl;
        String str2 = this.title;
        String str3 = this.description;
        ZonedDateTime zonedDateTime = this.endAt;
        String str4 = this.terms;
        return new RewardDetail(j10, str, str2, this.rewardProgram, str3, zonedDateTime, str4, this.rewardProgram == EnumC6541m.f62801a ? 0.0d : this.earnRequirement, i(), this.rewardType, this.hasUpcs);
    }

    public String toString() {
        return "EarnReward(rewardId=" + this.rewardId + ", rewardProgram=" + this.rewardProgram + ", imageUrl=" + this.imageUrl + ", title=" + this.title + ", description=" + this.description + ", startAt=" + this.startAt + ", endAt=" + this.endAt + ", terms=" + this.terms + ", earnKind=" + this.earnKind + ", earnRequirement=" + this.earnRequirement + ", progress=" + this.progress + ", rewardType=" + this.rewardType + ", maxDaysToEarn=" + this.maxDaysToEarn + ", maxDaysToRedeem=" + this.maxDaysToRedeem + ", maxEarnCount=" + this.maxEarnCount + ", allowCarryOver=" + this.allowCarryOver + ", hasUpcs=" + this.hasUpcs + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EarnReward(long j10, EnumC6541m enumC6541m, String str, String str2, String str3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str4, EnumC6540l enumC6540l, double d10, double d11, EnumC6542n enumC6542n, int i10, int i11, int i12, boolean z10, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        long j11 = (i13 & 1) != 0 ? 0L : j10;
        this(j11, (i13 & 2) != 0 ? EnumC6541m.f62802b : enumC6541m, (i13 & 4) != 0 ? "" : str, (i13 & 8) != 0 ? "" : str2, (i13 & 16) != 0 ? "" : str3, (i13 & 32) != 0 ? null : zonedDateTime, (i13 & 64) == 0 ? zonedDateTime2 : null, (i13 & 128) == 0 ? str4 : "", (i13 & 256) != 0 ? EnumC6540l.f62796a : enumC6540l, (i13 & 512) != 0 ? 0.0d : d10, (i13 & 1024) == 0 ? d11 : 0.0d, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? EnumC6542n.f62806b : enumC6542n, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 365 : i10, (i13 & 8192) != 0 ? 365 : i11, (i13 & 16384) != 0 ? 0 : i12, (i13 & 32768) != 0 ? false : z10, (i13 & 65536) != 0 ? false : z11);
    }
}
