package pl;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0001!BW\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001aR\u001b\u0010\u0006\u001a\u00060\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b!\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010\u001aR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b,\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b'\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b%\u0010\u001a¨\u00060"}, d2 = {"Lpl/a;", "Landroid/os/Parcelable;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "modalState", "tipAmount", "displayCounter", "finalOrderAmount", "finalOrderDate", "shopperName", "shopperImageURL", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "getTipAmount", "e", "getDisplayCounter", "f", "getFinalOrderAmount", "g", "getFinalOrderDate", "h", "i", "j", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pl.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class TipData implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String externalShopperId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String modalState;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tipAmount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String displayCounter;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String finalOrderAmount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String finalOrderDate;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shopperName;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String shopperImageURL;
    public static final Parcelable.Creator<TipData> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pl.a$b */
    public static final class b implements Parcelable.Creator<TipData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TipData createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new TipData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final TipData[] newArray(int i10) {
            return new TipData[i10];
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
        if (!(other instanceof TipData)) {
            return false;
        }
        TipData tipData = (TipData) other;
        return Intrinsics.e(this.orderId, tipData.orderId) && Intrinsics.e(this.externalShopperId, tipData.externalShopperId) && Intrinsics.e(this.modalState, tipData.modalState) && Intrinsics.e(this.tipAmount, tipData.tipAmount) && Intrinsics.e(this.displayCounter, tipData.displayCounter) && Intrinsics.e(this.finalOrderAmount, tipData.finalOrderAmount) && Intrinsics.e(this.finalOrderDate, tipData.finalOrderDate) && Intrinsics.e(this.shopperName, tipData.shopperName) && Intrinsics.e(this.shopperImageURL, tipData.shopperImageURL);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.orderId);
        dest.writeString(this.externalShopperId);
        dest.writeString(this.modalState);
        dest.writeString(this.tipAmount);
        dest.writeString(this.displayCounter);
        dest.writeString(this.finalOrderAmount);
        dest.writeString(this.finalOrderDate);
        dest.writeString(this.shopperName);
        dest.writeString(this.shopperImageURL);
    }

    public TipData(String orderId, String externalShopperId, String modalState, String tipAmount, String displayCounter, String finalOrderAmount, String finalOrderDate, String shopperName, String shopperImageURL) {
        Intrinsics.j(orderId, "orderId");
        Intrinsics.j(externalShopperId, "externalShopperId");
        Intrinsics.j(modalState, "modalState");
        Intrinsics.j(tipAmount, "tipAmount");
        Intrinsics.j(displayCounter, "displayCounter");
        Intrinsics.j(finalOrderAmount, "finalOrderAmount");
        Intrinsics.j(finalOrderDate, "finalOrderDate");
        Intrinsics.j(shopperName, "shopperName");
        Intrinsics.j(shopperImageURL, "shopperImageURL");
        this.orderId = orderId;
        this.externalShopperId = externalShopperId;
        this.modalState = modalState;
        this.tipAmount = tipAmount;
        this.displayCounter = displayCounter;
        this.finalOrderAmount = finalOrderAmount;
        this.finalOrderDate = finalOrderDate;
        this.shopperName = shopperName;
        this.shopperImageURL = shopperImageURL;
    }

    /* renamed from: a, reason: from getter */
    public final String getExternalShopperId() {
        return this.externalShopperId;
    }

    /* renamed from: b, reason: from getter */
    public final String getModalState() {
        return this.modalState;
    }

    /* renamed from: c, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: d, reason: from getter */
    public final String getShopperImageURL() {
        return this.shopperImageURL;
    }

    /* renamed from: e, reason: from getter */
    public final String getShopperName() {
        return this.shopperName;
    }

    public int hashCode() {
        return (((((((((((((((this.orderId.hashCode() * 31) + this.externalShopperId.hashCode()) * 31) + this.modalState.hashCode()) * 31) + this.tipAmount.hashCode()) * 31) + this.displayCounter.hashCode()) * 31) + this.finalOrderAmount.hashCode()) * 31) + this.finalOrderDate.hashCode()) * 31) + this.shopperName.hashCode()) * 31) + this.shopperImageURL.hashCode();
    }

    public String toString() {
        return "TipData(orderId=" + this.orderId + ", externalShopperId=" + this.externalShopperId + ", modalState=" + this.modalState + ", tipAmount=" + this.tipAmount + ", displayCounter=" + this.displayCounter + ", finalOrderAmount=" + this.finalOrderAmount + ", finalOrderDate=" + this.finalOrderDate + ", shopperName=" + this.shopperName + ", shopperImageURL=" + this.shopperImageURL + ')';
    }
}
