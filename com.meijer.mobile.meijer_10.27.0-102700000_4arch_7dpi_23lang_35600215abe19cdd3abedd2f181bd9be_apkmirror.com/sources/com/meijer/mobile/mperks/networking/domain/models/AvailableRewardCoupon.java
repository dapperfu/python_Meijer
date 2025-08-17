package com.meijer.mobile.mperks.networking.domain.models;

import com.meijer.mobile.mperks.networking.domain.models.AvailableRewardCoupon;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import th.j;
import vk.C17590a;
import vk.d;
import vk.e;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013Jv\u0010\u001c\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001aJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b)\u0010\u0013R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010&\u001a\u0004\b*\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b+\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b,\u0010\u0013R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b.\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010&\u001a\u0004\b/\u0010\u0013R\u001d\u00105\u001a\u0004\u0018\u0001008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001d\u00108\u001a\u0004\u0018\u0001008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b7\u00104¨\u00069"}, d2 = {"Lcom/meijer/mobile/mperks/networking/domain/models/AvailableRewardCoupon;", "", "", "couponId", "", "imageUrl", "name", "description", "displayStartString", "displayEndString", "termsAndConditions", "", "pointCost", "rewardCouponType", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "component8", "()I", "component9", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/meijer/mobile/mperks/networking/domain/models/AvailableRewardCoupon;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getCouponId", "Ljava/lang/String;", "getImageUrl", "getName", "getDescription", "getDisplayStartString", "getDisplayEndString", "getTermsAndConditions", "I", "getPointCost", "getRewardCouponType", "j$/time/ZonedDateTime", "displayStart$delegate", "Lkotlin/Lazy;", "getDisplayStart", "()Lj$/time/ZonedDateTime;", "displayStart", "displayEnd$delegate", "getDisplayEnd", "displayEnd", "networking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AvailableRewardCoupon {
    private final long couponId;
    private final String description;

    /* renamed from: displayEnd$delegate, reason: from kotlin metadata */
    private final Lazy displayEnd;
    private final String displayEndString;

    /* renamed from: displayStart$delegate, reason: from kotlin metadata */
    private final Lazy displayStart;
    private final String displayStartString;
    private final String imageUrl;
    private final String name;
    private final int pointCost;
    private final String rewardCouponType;
    private final String termsAndConditions;

    public AvailableRewardCoupon() {
        this(0L, null, null, null, null, null, null, 0, null, 511, null);
    }

    public static /* synthetic */ AvailableRewardCoupon copy$default(AvailableRewardCoupon availableRewardCoupon, long j10, String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j10 = availableRewardCoupon.couponId;
        }
        long j11 = j10;
        if ((i11 & 2) != 0) {
            str = availableRewardCoupon.imageUrl;
        }
        String str8 = str;
        if ((i11 & 4) != 0) {
            str2 = availableRewardCoupon.name;
        }
        return availableRewardCoupon.copy(j11, str8, str2, (i11 & 8) != 0 ? availableRewardCoupon.description : str3, (i11 & 16) != 0 ? availableRewardCoupon.displayStartString : str4, (i11 & 32) != 0 ? availableRewardCoupon.displayEndString : str5, (i11 & 64) != 0 ? availableRewardCoupon.termsAndConditions : str6, (i11 & 128) != 0 ? availableRewardCoupon.pointCost : i10, (i11 & 256) != 0 ? availableRewardCoupon.rewardCouponType : str7);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCouponId() {
        return this.couponId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDisplayStartString() {
        return this.displayStartString;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDisplayEndString() {
        return this.displayEndString;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    /* renamed from: component8, reason: from getter */
    public final int getPointCost() {
        return this.pointCost;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRewardCouponType() {
        return this.rewardCouponType;
    }

    public final AvailableRewardCoupon copy(@g(name = "couponId") long couponId, @g(name = "imageUrl") String imageUrl, @g(name = "name") String name, @g(name = "description") String description, @g(name = "displayStart") String displayStartString, @g(name = "displayEnd") String displayEndString, @g(name = "termsAndConditions") String termsAndConditions, @g(name = "pointCost") int pointCost, @g(name = "rewardCouponType") String rewardCouponType) {
        Intrinsics.j(name, "name");
        return new AvailableRewardCoupon(couponId, imageUrl, name, description, displayStartString, displayEndString, termsAndConditions, pointCost, rewardCouponType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvailableRewardCoupon)) {
            return false;
        }
        AvailableRewardCoupon availableRewardCoupon = (AvailableRewardCoupon) other;
        return this.couponId == availableRewardCoupon.couponId && Intrinsics.e(this.imageUrl, availableRewardCoupon.imageUrl) && Intrinsics.e(this.name, availableRewardCoupon.name) && Intrinsics.e(this.description, availableRewardCoupon.description) && Intrinsics.e(this.displayStartString, availableRewardCoupon.displayStartString) && Intrinsics.e(this.displayEndString, availableRewardCoupon.displayEndString) && Intrinsics.e(this.termsAndConditions, availableRewardCoupon.termsAndConditions) && this.pointCost == availableRewardCoupon.pointCost && Intrinsics.e(this.rewardCouponType, availableRewardCoupon.rewardCouponType);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.couponId) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.name.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.displayStartString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.displayEndString;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.termsAndConditions;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.pointCost)) * 31;
        String str6 = this.rewardCouponType;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "AvailableRewardCoupon(couponId=" + this.couponId + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", description=" + this.description + ", displayStartString=" + this.displayStartString + ", displayEndString=" + this.displayEndString + ", termsAndConditions=" + this.termsAndConditions + ", pointCost=" + this.pointCost + ", rewardCouponType=" + this.rewardCouponType + ')';
    }

    public AvailableRewardCoupon(@g(name = "couponId") long j10, @g(name = "imageUrl") String str, @g(name = "name") String name, @g(name = "description") String str2, @g(name = "displayStart") String str3, @g(name = "displayEnd") String str4, @g(name = "termsAndConditions") String str5, @g(name = "pointCost") int i10, @g(name = "rewardCouponType") String str6) {
        Intrinsics.j(name, "name");
        this.couponId = j10;
        this.imageUrl = str;
        this.name = name;
        this.description = str2;
        this.displayStartString = str3;
        this.displayEndString = str4;
        this.termsAndConditions = str5;
        this.pointCost = i10;
        this.rewardCouponType = str6;
        this.displayStart = LazyKt.b(new Function0() { // from class: jo.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AvailableRewardCoupon.displayStart_delegate$lambda$0(this.f140830a);
            }
        });
        this.displayEnd = LazyKt.b(new Function0() { // from class: jo.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AvailableRewardCoupon.displayEnd_delegate$lambda$1(this.f140831a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ZonedDateTime displayEnd_delegate$lambda$1(AvailableRewardCoupon availableRewardCoupon) {
        LocalDateTime localDateTime;
        ZonedDateTime zonedDateTimeN;
        String str = availableRewardCoupon.displayEndString;
        if (str == null || (localDateTime = (LocalDateTime) d.b(str, C17590a.f164803a.s(), new j())) == null || (zonedDateTimeN = localDateTime.N(e.EASTERN)) == null) {
            return null;
        }
        return zonedDateTimeN.n(ZoneId.systemDefault());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ZonedDateTime displayStart_delegate$lambda$0(AvailableRewardCoupon availableRewardCoupon) {
        LocalDateTime localDateTime;
        ZonedDateTime zonedDateTimeN;
        String str = availableRewardCoupon.displayStartString;
        if (str == null || (localDateTime = (LocalDateTime) d.b(str, C17590a.f164803a.s(), new j())) == null || (zonedDateTimeN = localDateTime.N(e.EASTERN)) == null) {
            return null;
        }
        return zonedDateTimeN.n(ZoneId.systemDefault());
    }

    public final long getCouponId() {
        return this.couponId;
    }

    public final String getDescription() {
        return this.description;
    }

    public final ZonedDateTime getDisplayEnd() {
        return (ZonedDateTime) this.displayEnd.getValue();
    }

    public final String getDisplayEndString() {
        return this.displayEndString;
    }

    public final ZonedDateTime getDisplayStart() {
        return (ZonedDateTime) this.displayStart.getValue();
    }

    public final String getDisplayStartString() {
        return this.displayStartString;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final int getPointCost() {
        return this.pointCost;
    }

    public final String getRewardCouponType() {
        return this.rewardCouponType;
    }

    public final String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    public /* synthetic */ AvailableRewardCoupon(long j10, String str, String str2, String str3, String str4, String str5, String str6, int i10, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? -1L : j10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : str5, (i11 & 64) != 0 ? null : str6, (i11 & 128) != 0 ? 0 : i10, (i11 & 256) != 0 ? null : str7);
    }
}
