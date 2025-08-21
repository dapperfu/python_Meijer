package tp;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00002\n\u0010\u0003\u001a\u00060\u0002j\u0002`\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00002\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0017J\u0015\u0010\u001d\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0017J\u0019\u0010\u001f\u001a\u00020\u00002\n\u0010\r\u001a\u00060\u0004j\u0002`\u001e¢\u0006\u0004\b\u001f\u0010\u0017J\u0015\u0010 \u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b \u0010\u0017J\u0015\u0010!\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b!\u0010\u001aJ\u0015\u0010\"\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\"\u0010\u0017J\u001d\u0010'\u001a\u00020&2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010*J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b1\u00102R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R*\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u00108\u001a\u0004\b9\u0010,\"\u0004\b:\u0010;R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u00103\u001a\u0004\b<\u00105\"\u0004\b=\u00107R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR$\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010>\u001a\u0004\bC\u0010@\"\u0004\bD\u0010BR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00108\u001a\u0004\bE\u0010,\"\u0004\bF\u0010;R$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u00108\u001a\u0004\bG\u0010,\"\u0004\bH\u0010;R$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u00108\u001a\u0004\bI\u0010,\"\u0004\bJ\u0010;R$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00108\u001a\u0004\bK\u0010,\"\u0004\bL\u0010;R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010>\u001a\u0004\bM\u0010@\"\u0004\bN\u0010BR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00108\u001a\u0004\bO\u0010,\"\u0004\bP\u0010;¨\u0006Q"}, d2 = {"Ltp/b;", "Landroid/os/Parcelable;", "", "storeId", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "rating", "", "tipAmount", "subtotal", "shopperName", "shopperImage", "cardNumber", "cardName", "totalPrice", "fulfillmentType", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;)V", "Lcom/meijer/mobile/core/model/common/StoreId;", "h", "(I)Ltp/b;", "d", "(Ljava/lang/String;)Ltp/b;", "e", "j", "(D)Ltp/b;", "i", "g", "f", "Lcom/meijer/mobile/core/model/common/CreditCardNumber;", "b", "a", "k", "c", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "w", "()Ljava/lang/Integer;", "setStoreId", "(Ljava/lang/Integer;)V", "Ljava/lang/String;", "r", "A", "(Ljava/lang/String;)V", "s", "setRating", "Ljava/lang/Double;", "x", "()Ljava/lang/Double;", "setTipAmount", "(Ljava/lang/Double;)V", "getSubtotal", "setSubtotal", "v", "C", "t", "B", "o", "setCardNumber", "n", "setCardName", "y", "setTotalPrice", "q", "setFulfillmentType", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: tp.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class Builder implements Parcelable {
    public static final Parcelable.Creator<Builder> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String orderId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private Integer rating;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private Double tipAmount;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private Double subtotal;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String shopperName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String shopperImage;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private String cardNumber;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private String cardName;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private Double totalPrice;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private String fulfillmentType;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tp.b$a */
    public static final class a implements Parcelable.Creator<Builder> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Builder createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new Builder(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Builder[] newArray(int i10) {
            return new Builder[i10];
        }
    }

    public Builder() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Builder)) {
            return false;
        }
        Builder builder = (Builder) other;
        return Intrinsics.e(this.storeId, builder.storeId) && Intrinsics.e(this.orderId, builder.orderId) && Intrinsics.e(this.rating, builder.rating) && Intrinsics.e(this.tipAmount, builder.tipAmount) && Intrinsics.e(this.subtotal, builder.subtotal) && Intrinsics.e(this.shopperName, builder.shopperName) && Intrinsics.e(this.shopperImage, builder.shopperImage) && Intrinsics.e(this.cardNumber, builder.cardNumber) && Intrinsics.e(this.cardName, builder.cardName) && Intrinsics.e(this.totalPrice, builder.totalPrice) && Intrinsics.e(this.fulfillmentType, builder.fulfillmentType);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        Integer num = this.storeId;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        dest.writeString(this.orderId);
        Integer num2 = this.rating;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num2.intValue());
        }
        Double d10 = this.tipAmount;
        if (d10 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d10.doubleValue());
        }
        Double d11 = this.subtotal;
        if (d11 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d11.doubleValue());
        }
        dest.writeString(this.shopperName);
        dest.writeString(this.shopperImage);
        dest.writeString(this.cardNumber);
        dest.writeString(this.cardName);
        Double d12 = this.totalPrice;
        if (d12 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeDouble(d12.doubleValue());
        }
        dest.writeString(this.fulfillmentType);
    }

    public Builder(Integer num, String str, Integer num2, Double d10, Double d11, String str2, String str3, String str4, String str5, Double d12, String str6) {
        this.storeId = num;
        this.orderId = str;
        this.rating = num2;
        this.tipAmount = d10;
        this.subtotal = d11;
        this.shopperName = str2;
        this.shopperImage = str3;
        this.cardNumber = str4;
        this.cardName = str5;
        this.totalPrice = d12;
        this.fulfillmentType = str6;
    }

    public final void A(String str) {
        this.orderId = str;
    }

    public final void B(String str) {
        this.shopperImage = str;
    }

    public final void C(String str) {
        this.shopperName = str;
    }

    public final Builder a(String cardName) {
        Intrinsics.j(cardName, "cardName");
        this.cardName = cardName;
        return this;
    }

    public final Builder b(String cardNumber) {
        Intrinsics.j(cardNumber, "cardNumber");
        this.cardNumber = cardNumber;
        return this;
    }

    public final Builder c(String fulfillmentType) {
        Intrinsics.j(fulfillmentType, "fulfillmentType");
        this.fulfillmentType = fulfillmentType;
        return this;
    }

    public final Builder d(String orderId) {
        Intrinsics.j(orderId, "orderId");
        this.orderId = orderId;
        return this;
    }

    public final Builder f(String shopperImage) {
        Intrinsics.j(shopperImage, "shopperImage");
        this.shopperImage = shopperImage;
        return this;
    }

    public final Builder g(String shopperName) {
        Intrinsics.j(shopperName, "shopperName");
        this.shopperName = shopperName;
        return this;
    }

    public int hashCode() {
        Integer num = this.storeId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.orderId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.rating;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d10 = this.tipAmount;
        int iHashCode4 = (iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.subtotal;
        int iHashCode5 = (iHashCode4 + (d11 == null ? 0 : d11.hashCode())) * 31;
        String str2 = this.shopperName;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.shopperImage;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.cardNumber;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.cardName;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Double d12 = this.totalPrice;
        int iHashCode10 = (iHashCode9 + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str6 = this.fulfillmentType;
        return iHashCode10 + (str6 != null ? str6.hashCode() : 0);
    }

    /* renamed from: n, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    /* renamed from: o, reason: from getter */
    public final String getCardNumber() {
        return this.cardNumber;
    }

    /* renamed from: q, reason: from getter */
    public final String getFulfillmentType() {
        return this.fulfillmentType;
    }

    /* renamed from: r, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: s, reason: from getter */
    public final Integer getRating() {
        return this.rating;
    }

    /* renamed from: t, reason: from getter */
    public final String getShopperImage() {
        return this.shopperImage;
    }

    public String toString() {
        return "Builder(storeId=" + this.storeId + ", orderId=" + this.orderId + ", rating=" + this.rating + ", tipAmount=" + this.tipAmount + ", subtotal=" + this.subtotal + ", shopperName=" + this.shopperName + ", shopperImage=" + this.shopperImage + ", cardNumber=" + this.cardNumber + ", cardName=" + this.cardName + ", totalPrice=" + this.totalPrice + ", fulfillmentType=" + this.fulfillmentType + ')';
    }

    /* renamed from: v, reason: from getter */
    public final String getShopperName() {
        return this.shopperName;
    }

    /* renamed from: w, reason: from getter */
    public final Integer getStoreId() {
        return this.storeId;
    }

    /* renamed from: x, reason: from getter */
    public final Double getTipAmount() {
        return this.tipAmount;
    }

    /* renamed from: y, reason: from getter */
    public final Double getTotalPrice() {
        return this.totalPrice;
    }

    public final Builder e(int rating) {
        this.rating = Integer.valueOf(rating);
        return this;
    }

    public final Builder h(int storeId) {
        this.storeId = Integer.valueOf(storeId);
        return this;
    }

    public final Builder i(double subtotal) {
        this.subtotal = Double.valueOf(subtotal);
        return this;
    }

    public final Builder j(double tipAmount) {
        this.tipAmount = Double.valueOf(tipAmount);
        return this;
    }

    public final Builder k(double totalPrice) {
        this.totalPrice = Double.valueOf(totalPrice);
        return this;
    }

    public /* synthetic */ Builder(Integer num, String str, Integer num2, Double d10, Double d11, String str2, String str3, String str4, String str5, Double d12, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : num2, (i10 & 8) != 0 ? null : d10, (i10 & 16) != 0 ? null : d11, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : str4, (i10 & 256) != 0 ? null : str5, (i10 & 512) != 0 ? null : d12, (i10 & 1024) != 0 ? null : str6);
    }
}
