package bo;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vk.C17590a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010\"J\u0090\u0001\u0010#\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010\"J\u001a\u0010*\u001a\u00020\u00102\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R&\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010&\"\u0004\b4\u00105R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00102\u001a\u0004\b7\u0010&\"\u0004\b8\u00105R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00102\u001a\u0004\b:\u0010&\"\u0004\b;\u00105R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bA\u0010>R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00102\u001a\u0004\bC\u0010&\"\u0004\bD\u00105R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010E\u001a\u0004\bF\u0010\"\"\u0004\bG\u0010HR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bF\u00102\u001a\u0004\bI\u0010&R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bC\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bK\u0010J\u001a\u0004\bM\u0010LR\u0013\u0010N\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bB\u0010&R\u0017\u0010Q\u001a\u00020\u00028F¢\u0006\f\u0012\u0004\bO\u0010P\u001a\u0004\b9\u0010.R\u0011\u0010T\u001a\u00020R8F¢\u0006\u0006\u001a\u0004\b6\u0010S¨\u0006U"}, d2 = {"Lbo/b;", "Landroid/os/Parcelable;", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "couponId", "", "imageUrl", "name", "description", "j$/time/ZonedDateTime", "displayStart", "displayEnd", "termsAndConditions", "", "pointCost", "rewardCouponType", "", "isClaimed", "isLoading", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/lang/String;ILjava/lang/String;ZZ)V", "now", "n", "(Lj$/time/ZonedDateTime;)Z", "Lbo/j;", "r", "()Lbo/j;", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/lang/String;ILjava/lang/String;ZZ)Lbo/b;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "H", "()J", "setCouponId", "(J)V", "b", "Ljava/lang/String;", "h", "setImageUrl", "(Ljava/lang/String;)V", "c", "getName", "setName", "d", "e", "setDescription", "Lj$/time/ZonedDateTime;", "getDisplayStart", "()Lj$/time/ZonedDateTime;", "setDisplayStart", "(Lj$/time/ZonedDateTime;)V", "f", "g", "j", "setTermsAndConditions", "I", "i", "setPointCost", "(I)V", "getRewardCouponType", "Z", "k", "()Z", "q", "formattedExpirationDate", "getDaysLeft$annotations", "()V", "daysLeft", "Lbo/c;", "()Lbo/c;", "claimPill", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: bo.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class ClaimReward implements Parcelable {
    public static final Parcelable.Creator<ClaimReward> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long couponId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String imageUrl;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String description;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private ZonedDateTime displayStart;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZonedDateTime displayEnd;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String termsAndConditions;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private int pointCost;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String rewardCouponType;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isClaimed;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bo.b$a */
    public static final class a implements Parcelable.Creator<ClaimReward> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ClaimReward createFromParcel(Parcel parcel) {
            boolean z10;
            Intrinsics.j(parcel, "parcel");
            long j10 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ZonedDateTime zonedDateTime = (ZonedDateTime) parcel.readSerializable();
            ZonedDateTime zonedDateTime2 = (ZonedDateTime) parcel.readSerializable();
            String string4 = parcel.readString();
            int i10 = parcel.readInt();
            String string5 = parcel.readString();
            boolean z11 = false;
            if (parcel.readInt() != 0) {
                z10 = false;
                z11 = true;
            } else {
                z10 = false;
            }
            return new ClaimReward(j10, string, string2, string3, zonedDateTime, zonedDateTime2, string4, i10, string5, z11, parcel.readInt() == 0 ? z10 : true);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ClaimReward[] newArray(int i10) {
            return new ClaimReward[i10];
        }
    }

    public ClaimReward(long j10, String str, String str2, String str3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str4, int i10, String str5, boolean z10, boolean z11) {
        this.couponId = j10;
        this.imageUrl = str;
        this.name = str2;
        this.description = str3;
        this.displayStart = zonedDateTime;
        this.displayEnd = zonedDateTime2;
        this.termsAndConditions = str4;
        this.pointCost = i10;
        this.rewardCouponType = str5;
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
        if (!(other instanceof ClaimReward)) {
            return false;
        }
        ClaimReward claimReward = (ClaimReward) other;
        return this.couponId == claimReward.couponId && Intrinsics.e(this.imageUrl, claimReward.imageUrl) && Intrinsics.e(this.name, claimReward.name) && Intrinsics.e(this.description, claimReward.description) && Intrinsics.e(this.displayStart, claimReward.displayStart) && Intrinsics.e(this.displayEnd, claimReward.displayEnd) && Intrinsics.e(this.termsAndConditions, claimReward.termsAndConditions) && this.pointCost == claimReward.pointCost && Intrinsics.e(this.rewardCouponType, claimReward.rewardCouponType) && this.isClaimed == claimReward.isClaimed && this.isLoading == claimReward.isLoading;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeLong(this.couponId);
        dest.writeString(this.imageUrl);
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeSerializable(this.displayStart);
        dest.writeSerializable(this.displayEnd);
        dest.writeString(this.termsAndConditions);
        dest.writeInt(this.pointCost);
        dest.writeString(this.rewardCouponType);
        dest.writeInt(this.isClaimed ? 1 : 0);
        dest.writeInt(this.isLoading ? 1 : 0);
    }

    public static /* synthetic */ ClaimReward b(ClaimReward claimReward, long j10, String str, String str2, String str3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, String str4, int i10, String str5, boolean z10, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = claimReward.couponId;
        }
        return claimReward.a(j10, (i11 & 2) != 0 ? claimReward.imageUrl : str, (i11 & 4) != 0 ? claimReward.name : str2, (i11 & 8) != 0 ? claimReward.description : str3, (i11 & 16) != 0 ? claimReward.displayStart : zonedDateTime, (i11 & 32) != 0 ? claimReward.displayEnd : zonedDateTime2, (i11 & 64) != 0 ? claimReward.termsAndConditions : str4, (i11 & 128) != 0 ? claimReward.pointCost : i10, (i11 & 256) != 0 ? claimReward.rewardCouponType : str5, (i11 & 512) != 0 ? claimReward.isClaimed : z10, (i11 & 1024) != 0 ? claimReward.isLoading : z11);
    }

    public static /* synthetic */ boolean o(ClaimReward claimReward, ZonedDateTime zonedDateTime, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            zonedDateTime = ZonedDateTime.now();
        }
        return claimReward.n(zonedDateTime);
    }

    /* renamed from: H, reason: from getter */
    public final long getCouponId() {
        return this.couponId;
    }

    public final ClaimReward a(long couponId, String imageUrl, String name, String description, ZonedDateTime displayStart, ZonedDateTime displayEnd, String termsAndConditions, int pointCost, String rewardCouponType, boolean isClaimed, boolean isLoading) {
        return new ClaimReward(couponId, imageUrl, name, description, displayStart, displayEnd, termsAndConditions, pointCost, rewardCouponType, isClaimed, isLoading);
    }

    public final EnumC6273c c() {
        String str = this.rewardCouponType;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -627305886) {
                if (iHashCode != 2198156) {
                    if (iHashCode == 2201046 && str.equals("Fuel")) {
                        return EnumC6273c.f60501c;
                    }
                } else if (str.equals("Free")) {
                    return EnumC6273c.f60500b;
                }
            } else if (str.equals("Total Basket")) {
                return EnumC6273c.f60502d;
            }
        }
        return EnumC6273c.f60499a;
    }

    public final long d() {
        return ChronoUnit.DAYS.between(ZonedDateTime.now(), this.displayEnd);
    }

    /* renamed from: e, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: f, reason: from getter */
    public final ZonedDateTime getDisplayEnd() {
        return this.displayEnd;
    }

    public final String g() {
        ZonedDateTime zonedDateTime = this.displayEnd;
        if (zonedDateTime != null) {
            return zonedDateTime.format(C17590a.DATE_FORMAT_MM_DD_YYYY);
        }
        return null;
    }

    public final String getName() {
        return this.name;
    }

    /* renamed from: h, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.couponId) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.displayStart;
        int iHashCode5 = (iHashCode4 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.displayEnd;
        int iHashCode6 = (iHashCode5 + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        String str4 = this.termsAndConditions;
        int iHashCode7 = (((iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.pointCost)) * 31;
        String str5 = this.rewardCouponType;
        return ((((iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.isClaimed)) * 31) + Boolean.hashCode(this.isLoading);
    }

    /* renamed from: i, reason: from getter */
    public final int getPointCost() {
        return this.pointCost;
    }

    /* renamed from: j, reason: from getter */
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    /* renamed from: k, reason: from getter */
    public final boolean getIsClaimed() {
        return this.isClaimed;
    }

    public final boolean n(ZonedDateTime now) {
        Intrinsics.j(now, "now");
        ZonedDateTime zonedDateTime = this.displayEnd;
        return zonedDateTime != null && now.isAfter(zonedDateTime);
    }

    /* renamed from: q, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final RewardDetail r() {
        return new RewardDetail(null, this.imageUrl, this.name, null, this.description, this.displayEnd, this.termsAndConditions, null, null, null, null, null, 3977, null);
    }

    public String toString() {
        return "ClaimReward(couponId=" + this.couponId + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", description=" + this.description + ", displayStart=" + this.displayStart + ", displayEnd=" + this.displayEnd + ", termsAndConditions=" + this.termsAndConditions + ", pointCost=" + this.pointCost + ", rewardCouponType=" + this.rewardCouponType + ", isClaimed=" + this.isClaimed + ", isLoading=" + this.isLoading + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ClaimReward(long r17, java.lang.String r19, java.lang.String r20, java.lang.String r21, j$.time.ZonedDateTime r22, j$.time.ZonedDateTime r23, java.lang.String r24, int r25, java.lang.String r26, boolean r27, boolean r28, int r29, kotlin.jvm.internal.DefaultConstructorMarker r30) {
        /*
            r16 = this;
            r0 = r29
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L9
            r6 = r2
            goto Lb
        L9:
            r6 = r19
        Lb:
            r1 = r0 & 4
            if (r1 == 0) goto L11
            r7 = r2
            goto L13
        L11:
            r7 = r20
        L13:
            r1 = r0 & 8
            if (r1 == 0) goto L19
            r8 = r2
            goto L1b
        L19:
            r8 = r21
        L1b:
            r1 = r0 & 16
            if (r1 == 0) goto L21
            r9 = r2
            goto L23
        L21:
            r9 = r22
        L23:
            r1 = r0 & 32
            if (r1 == 0) goto L29
            r10 = r2
            goto L2b
        L29:
            r10 = r23
        L2b:
            r1 = r0 & 64
            if (r1 == 0) goto L31
            r11 = r2
            goto L33
        L31:
            r11 = r24
        L33:
            r1 = r0 & 128(0x80, float:1.8E-43)
            r3 = 0
            if (r1 == 0) goto L3a
            r12 = r3
            goto L3c
        L3a:
            r12 = r25
        L3c:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L42
            r13 = r2
            goto L44
        L42:
            r13 = r26
        L44:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L4a
            r14 = r3
            goto L4c
        L4a:
            r14 = r27
        L4c:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L56
            r15 = r3
            r4 = r17
            r3 = r16
            goto L5c
        L56:
            r15 = r28
            r3 = r16
            r4 = r17
        L5c:
            r3.<init>(r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bo.ClaimReward.<init>(long, java.lang.String, java.lang.String, java.lang.String, j$.time.ZonedDateTime, j$.time.ZonedDateTime, java.lang.String, int, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
