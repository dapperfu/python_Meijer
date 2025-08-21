package fj;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010 ¨\u0006!"}, d2 = {"Lfj/A;", "Landroid/os/Parcelable;", "", "promoDesc", "promoNum", "", "rewardAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getPromoNum", "c", "D", "()D", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fj.A, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class PromoDiscount implements Parcelable {
    public static final Parcelable.Creator<PromoDiscount> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoDesc;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoNum;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double rewardAmount;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fj.A$a */
    public static final class a implements Parcelable.Creator<PromoDiscount> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PromoDiscount createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new PromoDiscount(parcel.readString(), parcel.readString(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PromoDiscount[] newArray(int i10) {
            return new PromoDiscount[i10];
        }
    }

    public PromoDiscount() {
        this(null, null, 0.0d, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoDiscount)) {
            return false;
        }
        PromoDiscount promoDiscount = (PromoDiscount) other;
        return Intrinsics.e(this.promoDesc, promoDiscount.promoDesc) && Intrinsics.e(this.promoNum, promoDiscount.promoNum) && Double.compare(this.rewardAmount, promoDiscount.rewardAmount) == 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.promoDesc);
        dest.writeString(this.promoNum);
        dest.writeDouble(this.rewardAmount);
    }

    public PromoDiscount(String str, String str2, double d10) {
        this.promoDesc = str;
        this.promoNum = str2;
        this.rewardAmount = d10;
    }

    /* renamed from: a, reason: from getter */
    public final String getPromoDesc() {
        return this.promoDesc;
    }

    /* renamed from: b, reason: from getter */
    public final double getRewardAmount() {
        return this.rewardAmount;
    }

    public int hashCode() {
        String str = this.promoDesc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.promoNum;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Double.hashCode(this.rewardAmount);
    }

    public String toString() {
        return "PromoDiscount(promoDesc=" + this.promoDesc + ", promoNum=" + this.promoNum + ", rewardAmount=" + this.rewardAmount + ')';
    }

    public /* synthetic */ PromoDiscount(String str, String str2, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? 0.0d : d10);
    }
}
