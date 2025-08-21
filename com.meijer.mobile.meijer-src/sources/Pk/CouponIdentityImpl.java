package Pk;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LPk/d;", "LPk/c;", "", "Lcom/meijer/mobile/coupon/model/common/OfferId;", "offerId", "<init>", "(J)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "Y0", "()J", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Pk.d, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class CouponIdentityImpl implements c {
    public static final Parcelable.Creator<CouponIdentityImpl> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long offerId;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pk.d$a */
    public static final class a implements Parcelable.Creator<CouponIdentityImpl> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CouponIdentityImpl createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new CouponIdentityImpl(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CouponIdentityImpl[] newArray(int i10) {
            return new CouponIdentityImpl[i10];
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
        return (other instanceof CouponIdentityImpl) && this.offerId == ((CouponIdentityImpl) other).offerId;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeLong(this.offerId);
    }

    @Override // Pk.c
    /* renamed from: Y0, reason: from getter */
    public long getOfferId() {
        return this.offerId;
    }

    public int hashCode() {
        return Long.hashCode(this.offerId);
    }

    public String toString() {
        return "CouponIdentityImpl(offerId=" + this.offerId + ')';
    }

    public CouponIdentityImpl(long j10) {
        this.offerId = j10;
    }
}
