package Wl;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wk.C17898a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001bJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001e\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\"\u0010\u0007\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010+R$\u0010\b\u001a\u0004\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010(\u001a\u0004\b#\u0010\u001d\"\u0004\b-\u0010+R\u001a\u0010\t\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010\u001dR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b'\u00102R\"\u0010\f\u001a\u00020\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010(\u001a\u0004\b,\u0010\u001d\"\u0004\b3\u0010+R\u001d\u00107\u001a\u00020\u00038\u0006¢\u0006\u0012\n\u0004\b4\u0010$\u0012\u0004\b5\u00106\u001a\u0004\b.\u0010&R\u0011\u00108\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b0\u0010\u001d¨\u00069"}, d2 = {"LWl/c;", "Landroid/os/Parcelable;", "LWl/f;", "", "Lcom/meijer/mobile/core/models/mperks/MperksCouponId;", "couponId", "", "description", "imageUrl", "name", "j$/time/ZonedDateTime", "expirationDate", "termsAndConditions", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/ZonedDateTime;Ljava/lang/String;)V", "now", "", "f", "(Lj$/time/ZonedDateTime;)Z", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "H", "()J", "b", "Ljava/lang/String;", "getDescription", "setDescription", "(Ljava/lang/String;)V", "c", "setImageUrl", "d", "getName", "e", "Lj$/time/ZonedDateTime;", "()Lj$/time/ZonedDateTime;", "setTermsAndConditions", "g", "getDaysLeft$annotations", "()V", "daysLeft", "formattedExpirationDate", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Wl.c, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class HomeMperksClippedReward implements Parcelable, f {
    public static final Parcelable.Creator<HomeMperksClippedReward> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long couponId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String imageUrl;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final ZonedDateTime expirationDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String termsAndConditions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long daysLeft;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Wl.c$a */
    public static final class a implements Parcelable.Creator<HomeMperksClippedReward> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HomeMperksClippedReward createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new HomeMperksClippedReward(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), (ZonedDateTime) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final HomeMperksClippedReward[] newArray(int i10) {
            return new HomeMperksClippedReward[i10];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomeMperksClippedReward)) {
            return false;
        }
        HomeMperksClippedReward homeMperksClippedReward = (HomeMperksClippedReward) other;
        return this.couponId == homeMperksClippedReward.couponId && Intrinsics.e(this.description, homeMperksClippedReward.description) && Intrinsics.e(this.imageUrl, homeMperksClippedReward.imageUrl) && Intrinsics.e(this.name, homeMperksClippedReward.name) && Intrinsics.e(this.expirationDate, homeMperksClippedReward.expirationDate) && Intrinsics.e(this.termsAndConditions, homeMperksClippedReward.termsAndConditions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeLong(this.couponId);
        dest.writeString(this.description);
        dest.writeString(this.imageUrl);
        dest.writeString(this.name);
        dest.writeSerializable(this.expirationDate);
        dest.writeString(this.termsAndConditions);
    }

    public HomeMperksClippedReward(long j10, String description, String str, String name, ZonedDateTime zonedDateTime, String termsAndConditions) {
        Intrinsics.j(description, "description");
        Intrinsics.j(name, "name");
        Intrinsics.j(termsAndConditions, "termsAndConditions");
        this.couponId = j10;
        this.description = description;
        this.imageUrl = str;
        this.name = name;
        this.expirationDate = zonedDateTime;
        this.termsAndConditions = termsAndConditions;
        this.daysLeft = ChronoUnit.DAYS.between(ZonedDateTime.now(), getExpirationDate());
    }

    public static /* synthetic */ boolean g(HomeMperksClippedReward homeMperksClippedReward, ZonedDateTime zonedDateTime, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            zonedDateTime = ZonedDateTime.now();
        }
        return homeMperksClippedReward.f(zonedDateTime);
    }

    @Override // Wl.f
    /* renamed from: H, reason: from getter */
    public long getCouponId() {
        return this.couponId;
    }

    @Override // Wl.f
    /* renamed from: a, reason: from getter */
    public String getImageUrl() {
        return this.imageUrl;
    }

    @Override // Wl.f
    /* renamed from: b, reason: from getter */
    public ZonedDateTime getExpirationDate() {
        return this.expirationDate;
    }

    @Override // Wl.f
    /* renamed from: c, reason: from getter */
    public String getTermsAndConditions() {
        return this.termsAndConditions;
    }

    /* renamed from: d, reason: from getter */
    public final long getDaysLeft() {
        return this.daysLeft;
    }

    public final boolean f(ZonedDateTime now) {
        Intrinsics.j(now, "now");
        ZonedDateTime expirationDate = getExpirationDate();
        return expirationDate != null && now.isAfter(expirationDate);
    }

    @Override // Wl.f
    public String getDescription() {
        return this.description;
    }

    @Override // Wl.f
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.couponId) * 31) + this.description.hashCode()) * 31;
        String str = this.imageUrl;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.name.hashCode()) * 31;
        ZonedDateTime zonedDateTime = this.expirationDate;
        return ((iHashCode2 + (zonedDateTime != null ? zonedDateTime.hashCode() : 0)) * 31) + this.termsAndConditions.hashCode();
    }

    public String toString() {
        return "HomeMperksClippedReward(couponId=" + this.couponId + ", description=" + this.description + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", expirationDate=" + this.expirationDate + ", termsAndConditions=" + this.termsAndConditions + ')';
    }

    public final String e() {
        String str;
        ZonedDateTime expirationDate = getExpirationDate();
        if (expirationDate != null) {
            str = expirationDate.format(C17898a.DATE_SLASHES_SHORT);
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }
}
