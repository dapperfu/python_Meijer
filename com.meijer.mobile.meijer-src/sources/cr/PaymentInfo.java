package cr;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u0012¨\u0006 "}, d2 = {"Lcr/g;", "Landroid/os/Parcelable;", "", "cardLastFour", "cardType", "paymentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCardLastFour", "b", "getCardType", "c", "getPaymentId", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cr.g, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class PaymentInfo implements Parcelable {
    public static final Parcelable.Creator<PaymentInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardLastFour;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String paymentId;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cr.g$a */
    public static final class a implements Parcelable.Creator<PaymentInfo> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PaymentInfo createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new PaymentInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final PaymentInfo[] newArray(int i10) {
            return new PaymentInfo[i10];
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
        if (!(other instanceof PaymentInfo)) {
            return false;
        }
        PaymentInfo paymentInfo = (PaymentInfo) other;
        return Intrinsics.e(this.cardLastFour, paymentInfo.cardLastFour) && Intrinsics.e(this.cardType, paymentInfo.cardType) && Intrinsics.e(this.paymentId, paymentInfo.paymentId);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.cardLastFour);
        dest.writeString(this.cardType);
        dest.writeString(this.paymentId);
    }

    public PaymentInfo(String str, String str2, String paymentId) {
        Intrinsics.j(paymentId, "paymentId");
        this.cardLastFour = str;
        this.cardType = str2;
        this.paymentId = paymentId;
    }

    public int hashCode() {
        String str = this.cardLastFour;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.cardType;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.paymentId.hashCode();
    }

    public String toString() {
        return "PaymentInfo(cardLastFour=" + this.cardLastFour + ", cardType=" + this.cardType + ", paymentId=" + this.paymentId + ')';
    }
}
