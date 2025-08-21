package xl;

import android.os.Parcel;
import android.os.Parcelable;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u001f\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u0017R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010\u0017R\u001d\u0010/\u001a\u00020\u001b8\u0006¢\u0006\u0012\n\u0004\b*\u0010+\u0012\u0004\b-\u0010.\u001a\u0004\b\u001e\u0010,R\u001d\u00102\u001a\u00020\u001b8\u0006¢\u0006\u0012\n\u0004\b0\u0010+\u0012\u0004\b1\u0010.\u001a\u0004\b#\u0010,¨\u00063"}, d2 = {"Lxl/a;", "Landroid/os/Parcelable;", "", PreferencesHelper.PREF_ID, "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "fulfillmentPartner", "", "Lxl/a$b;", "lineItems", "substitutionPreference", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "getOrderId", "c", "getFulfillmentPartner", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "getSubstitutionPreference", "f", "Z", "()Z", "getHasUserConfirmedSubstitutionPreferences$annotations", "()V", "hasUserConfirmedSubstitutionPreferences", "g", "isAnyProductOutOfStock$annotations", "isAnyProductOutOfStock", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: xl.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrderSubstitutionsDetail implements Parcelable {
    public static final Parcelable.Creator<OrderSubstitutionsDetail> CREATOR = new C2742a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fulfillmentPartner;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<LineItem> lineItems;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String substitutionPreference;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean hasUserConfirmedSubstitutionPreferences;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean isAnyProductOutOfStock;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xl.a$a, reason: collision with other inner class name */
    public static final class C2742a implements Parcelable.Creator<OrderSubstitutionsDetail> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OrderSubstitutionsDetail createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.j(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    arrayList2.add(LineItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new OrderSubstitutionsDetail(string, string2, string3, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final OrderSubstitutionsDetail[] newArray(int i10) {
            return new OrderSubstitutionsDetail[i10];
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b/\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010,\u001a\u0004\b0\u0010\u001bR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010'\u001a\u0004\b1\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b\"\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b/\u0010'\u001a\u0004\b+\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b2\u0010'\u001a\u0004\b.\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b&\u0010\u001b¨\u00064"}, d2 = {"Lxl/a$b;", "Landroid/os/Parcelable;", "", "itemId", "", "productId", "productSubstitutedFor", "", "upc", "upcSubstitutedFor", "name", "quantity", "actualQuantityPicked", "price", "pricePerUnit", "customerSubstitutionPreference", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "b", "Ljava/lang/Double;", "getProductId", "()Ljava/lang/Double;", "f", "d", "Ljava/lang/String;", "h", "e", "i", "getName", "g", "j", "k", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xl.a$b, reason: from toString */
    public static final /* data */ class LineItem implements Parcelable {
        public static final Parcelable.Creator<LineItem> CREATOR = new C2743a();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer itemId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double productId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double productSubstitutedFor;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upc;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String upcSubstitutedFor;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double quantity;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double actualQuantityPicked;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double price;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double pricePerUnit;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String customerSubstitutionPreference;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xl.a$b$a, reason: collision with other inner class name */
        public static final class C2743a implements Parcelable.Creator<LineItem> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final LineItem createFromParcel(Parcel parcel) {
                Intrinsics.j(parcel, "parcel");
                return new LineItem(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final LineItem[] newArray(int i10) {
                return new LineItem[i10];
            }
        }

        public LineItem() {
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
            if (!(other instanceof LineItem)) {
                return false;
            }
            LineItem lineItem = (LineItem) other;
            return Intrinsics.e(this.itemId, lineItem.itemId) && Intrinsics.e(this.productId, lineItem.productId) && Intrinsics.e(this.productSubstitutedFor, lineItem.productSubstitutedFor) && Intrinsics.e(this.upc, lineItem.upc) && Intrinsics.e(this.upcSubstitutedFor, lineItem.upcSubstitutedFor) && Intrinsics.e(this.name, lineItem.name) && Intrinsics.e(this.quantity, lineItem.quantity) && Intrinsics.e(this.actualQuantityPicked, lineItem.actualQuantityPicked) && Intrinsics.e(this.price, lineItem.price) && Intrinsics.e(this.pricePerUnit, lineItem.pricePerUnit) && Intrinsics.e(this.customerSubstitutionPreference, lineItem.customerSubstitutionPreference);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.j(dest, "dest");
            Integer num = this.itemId;
            if (num == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(num.intValue());
            }
            Double d10 = this.productId;
            if (d10 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeDouble(d10.doubleValue());
            }
            Double d11 = this.productSubstitutedFor;
            if (d11 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeDouble(d11.doubleValue());
            }
            dest.writeString(this.upc);
            dest.writeString(this.upcSubstitutedFor);
            dest.writeString(this.name);
            Double d12 = this.quantity;
            if (d12 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeDouble(d12.doubleValue());
            }
            Double d13 = this.actualQuantityPicked;
            if (d13 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeDouble(d13.doubleValue());
            }
            Double d14 = this.price;
            if (d14 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeDouble(d14.doubleValue());
            }
            Double d15 = this.pricePerUnit;
            if (d15 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeDouble(d15.doubleValue());
            }
            dest.writeString(this.customerSubstitutionPreference);
        }

        public LineItem(Integer num, Double d10, Double d11, String str, String str2, String str3, Double d12, Double d13, Double d14, Double d15, String str4) {
            this.itemId = num;
            this.productId = d10;
            this.productSubstitutedFor = d11;
            this.upc = str;
            this.upcSubstitutedFor = str2;
            this.name = str3;
            this.quantity = d12;
            this.actualQuantityPicked = d13;
            this.price = d14;
            this.pricePerUnit = d15;
            this.customerSubstitutionPreference = str4;
        }

        /* renamed from: a, reason: from getter */
        public final Double getActualQuantityPicked() {
            return this.actualQuantityPicked;
        }

        /* renamed from: b, reason: from getter */
        public final String getCustomerSubstitutionPreference() {
            return this.customerSubstitutionPreference;
        }

        /* renamed from: c, reason: from getter */
        public final Integer getItemId() {
            return this.itemId;
        }

        /* renamed from: d, reason: from getter */
        public final Double getPrice() {
            return this.price;
        }

        /* renamed from: e, reason: from getter */
        public final Double getPricePerUnit() {
            return this.pricePerUnit;
        }

        /* renamed from: f, reason: from getter */
        public final Double getProductSubstitutedFor() {
            return this.productSubstitutedFor;
        }

        /* renamed from: g, reason: from getter */
        public final Double getQuantity() {
            return this.quantity;
        }

        public final String getName() {
            return this.name;
        }

        /* renamed from: h, reason: from getter */
        public final String getUpc() {
            return this.upc;
        }

        public int hashCode() {
            Integer num = this.itemId;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Double d10 = this.productId;
            int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
            Double d11 = this.productSubstitutedFor;
            int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
            String str = this.upc;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.upcSubstitutedFor;
            int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.name;
            int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Double d12 = this.quantity;
            int iHashCode7 = (iHashCode6 + (d12 == null ? 0 : d12.hashCode())) * 31;
            Double d13 = this.actualQuantityPicked;
            int iHashCode8 = (iHashCode7 + (d13 == null ? 0 : d13.hashCode())) * 31;
            Double d14 = this.price;
            int iHashCode9 = (iHashCode8 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.pricePerUnit;
            int iHashCode10 = (iHashCode9 + (d15 == null ? 0 : d15.hashCode())) * 31;
            String str4 = this.customerSubstitutionPreference;
            return iHashCode10 + (str4 != null ? str4.hashCode() : 0);
        }

        /* renamed from: i, reason: from getter */
        public final String getUpcSubstitutedFor() {
            return this.upcSubstitutedFor;
        }

        public String toString() {
            return "LineItem(itemId=" + this.itemId + ", productId=" + this.productId + ", productSubstitutedFor=" + this.productSubstitutedFor + ", upc=" + this.upc + ", upcSubstitutedFor=" + this.upcSubstitutedFor + ", name=" + this.name + ", quantity=" + this.quantity + ", actualQuantityPicked=" + this.actualQuantityPicked + ", price=" + this.price + ", pricePerUnit=" + this.pricePerUnit + ", customerSubstitutionPreference=" + this.customerSubstitutionPreference + ')';
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ LineItem(Integer num, Double d10, Double d11, String str, String str2, String str3, Double d12, Double d13, Double d14, Double d15, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            Double dValueOf = Double.valueOf(0.0d);
            this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : d11, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : d12, (i10 & 128) != 0 ? null : d13, (i10 & 256) != 0 ? dValueOf : d14, (i10 & 512) != 0 ? dValueOf : d15, (i10 & 1024) != 0 ? null : str4);
        }
    }

    public OrderSubstitutionsDetail() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderSubstitutionsDetail)) {
            return false;
        }
        OrderSubstitutionsDetail orderSubstitutionsDetail = (OrderSubstitutionsDetail) other;
        return Intrinsics.e(this.id, orderSubstitutionsDetail.id) && Intrinsics.e(this.orderId, orderSubstitutionsDetail.orderId) && Intrinsics.e(this.fulfillmentPartner, orderSubstitutionsDetail.fulfillmentPartner) && Intrinsics.e(this.lineItems, orderSubstitutionsDetail.lineItems) && Intrinsics.e(this.substitutionPreference, orderSubstitutionsDetail.substitutionPreference);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.orderId);
        dest.writeString(this.fulfillmentPartner);
        List<LineItem> list = this.lineItems;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<LineItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.substitutionPreference);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OrderSubstitutionsDetail(java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.List<xl.OrderSubstitutionsDetail.LineItem> r9, java.lang.String r10) {
        /*
            r5 = this;
            r5.<init>()
            r5.id = r6
            r5.orderId = r7
            r5.fulfillmentPartner = r8
            r5.lineItems = r9
            r5.substitutionPreference = r10
            r6 = 1
            r7 = 0
            r0 = 0
            if (r9 == 0) goto L53
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r9 = r9.iterator()
        L1e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L4b
            java.lang.Object r10 = r9.next()
            r2 = r10
            xl.a$b r2 = (xl.OrderSubstitutionsDetail.LineItem) r2
            java.lang.Double r3 = r2.getQuantity()
            if (r3 == 0) goto L36
            double r3 = r3.doubleValue()
            goto L37
        L36:
            r3 = r0
        L37:
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 > 0) goto L1e
            java.lang.String r3 = r2.getCustomerSubstitutionPreference()
            if (r3 != 0) goto L1e
            java.lang.Double r2 = r2.getProductSubstitutedFor()
            if (r2 == 0) goto L1e
            r8.add(r10)
            goto L1e
        L4b:
            boolean r8 = r8.isEmpty()
            if (r8 != r6) goto L53
            r8 = r6
            goto L54
        L53:
            r8 = r7
        L54:
            r5.hasUserConfirmedSubstitutionPreferences = r8
            java.util.List<xl.a$b> r8 = r5.lineItems
            if (r8 == 0) goto L91
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            boolean r9 = r8 instanceof java.util.Collection
            if (r9 == 0) goto L6a
            r9 = r8
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L6a
            goto L91
        L6a:
            java.util.Iterator r8 = r8.iterator()
        L6e:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L91
            java.lang.Object r9 = r8.next()
            xl.a$b r9 = (xl.OrderSubstitutionsDetail.LineItem) r9
            java.lang.Double r10 = r9.getQuantity()
            if (r10 == 0) goto L85
            double r2 = r10.doubleValue()
            goto L86
        L85:
            r2 = r0
        L86:
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 > 0) goto L6e
            java.lang.Double r9 = r9.getProductSubstitutedFor()
            if (r9 == 0) goto L6e
            goto L92
        L91:
            r6 = r7
        L92:
            r5.isAnyProductOutOfStock = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xl.OrderSubstitutionsDetail.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String):void");
    }

    /* renamed from: a, reason: from getter */
    public final boolean getHasUserConfirmedSubstitutionPreferences() {
        return this.hasUserConfirmedSubstitutionPreferences;
    }

    public final List<LineItem> b() {
        return this.lineItems;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsAnyProductOutOfStock() {
        return this.isAnyProductOutOfStock;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.orderId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fulfillmentPartner;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<LineItem> list = this.lineItems;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.substitutionPreference;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "OrderSubstitutionsDetail(id=" + this.id + ", orderId=" + this.orderId + ", fulfillmentPartner=" + this.fulfillmentPartner + ", lineItems=" + this.lineItems + ", substitutionPreference=" + this.substitutionPreference + ')';
    }

    public /* synthetic */ OrderSubstitutionsDetail(String str, String str2, String str3, List list, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? "-1" : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? CollectionsKt.m() : list, (i10 & 16) != 0 ? null : str4);
    }
}
