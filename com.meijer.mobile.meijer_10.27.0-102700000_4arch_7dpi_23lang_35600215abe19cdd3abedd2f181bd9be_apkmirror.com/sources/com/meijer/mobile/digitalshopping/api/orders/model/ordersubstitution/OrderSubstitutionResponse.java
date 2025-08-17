package com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import wl.OrderSubstitutionsDetail;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 BO\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJX\u0010\r\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u001f\u0010\u0005\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001f\u0010\u0010¨\u0006!"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionResponse;", "", "", PreferencesHelper.PREF_ID, "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "fulfillmentPartner", "", "Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionResponse$LineItem;", "lineItems", "substitutionPreference", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Ljava/util/List;", "()Ljava/util/List;", "e", "LineItem", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OrderSubstitutionResponse {

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

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0094\u0001\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b'\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b.\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b\u001f\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b#\u0010\u0018R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&¨\u0006/"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionResponse$LineItem;", "", "", "itemId", "", "productId", "productSubstitutedFor", "", "upc", "upcSubstitutedFor", "name", "quantity", "actualQuantityPicked", "customerSubstitutionPreference", "price", "pricePerUnit", "<init>", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", "Lwl/a$b;", "l", "()Lwl/a$b;", "copy", "(Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionResponse$LineItem;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "b", "Ljava/lang/Double;", "g", "()Ljava/lang/Double;", "h", "d", "Ljava/lang/String;", "j", "e", "k", "f", "i", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LineItem {

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
        private final String customerSubstitutionPreference;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double price;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final Double pricePerUnit;

        public LineItem() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public final LineItem copy(@g(name = "itemId") Integer itemId, @g(name = "productId") Double productId, @g(name = "productsubsitutedFor") Double productSubstitutedFor, @g(name = "upc") String upc, @g(name = "UPCSubstitutedFor") String upcSubstitutedFor, @g(name = "name") String name, @g(name = "quantity") Double quantity, @g(name = "ActualQuantityPicked") Double actualQuantityPicked, @g(name = "customerSubstitutionPreference") String customerSubstitutionPreference, @g(name = "price") Double price, @g(name = "pricePerUnit") Double pricePerUnit) {
            return new LineItem(itemId, productId, productSubstitutedFor, upc, upcSubstitutedFor, name, quantity, actualQuantityPicked, customerSubstitutionPreference, price, pricePerUnit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LineItem)) {
                return false;
            }
            LineItem lineItem = (LineItem) other;
            return Intrinsics.e(this.itemId, lineItem.itemId) && Intrinsics.e(this.productId, lineItem.productId) && Intrinsics.e(this.productSubstitutedFor, lineItem.productSubstitutedFor) && Intrinsics.e(this.upc, lineItem.upc) && Intrinsics.e(this.upcSubstitutedFor, lineItem.upcSubstitutedFor) && Intrinsics.e(this.name, lineItem.name) && Intrinsics.e(this.quantity, lineItem.quantity) && Intrinsics.e(this.actualQuantityPicked, lineItem.actualQuantityPicked) && Intrinsics.e(this.customerSubstitutionPreference, lineItem.customerSubstitutionPreference) && Intrinsics.e(this.price, lineItem.price) && Intrinsics.e(this.pricePerUnit, lineItem.pricePerUnit);
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
            String str4 = this.customerSubstitutionPreference;
            int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Double d14 = this.price;
            int iHashCode10 = (iHashCode9 + (d14 == null ? 0 : d14.hashCode())) * 31;
            Double d15 = this.pricePerUnit;
            return iHashCode10 + (d15 != null ? d15.hashCode() : 0);
        }

        public String toString() {
            return "LineItem(itemId=" + this.itemId + ", productId=" + this.productId + ", productSubstitutedFor=" + this.productSubstitutedFor + ", upc=" + this.upc + ", upcSubstitutedFor=" + this.upcSubstitutedFor + ", name=" + this.name + ", quantity=" + this.quantity + ", actualQuantityPicked=" + this.actualQuantityPicked + ", customerSubstitutionPreference=" + this.customerSubstitutionPreference + ", price=" + this.price + ", pricePerUnit=" + this.pricePerUnit + ')';
        }

        public LineItem(@g(name = "itemId") Integer num, @g(name = "productId") Double d10, @g(name = "productsubsitutedFor") Double d11, @g(name = "upc") String str, @g(name = "UPCSubstitutedFor") String str2, @g(name = "name") String str3, @g(name = "quantity") Double d12, @g(name = "ActualQuantityPicked") Double d13, @g(name = "customerSubstitutionPreference") String str4, @g(name = "price") Double d14, @g(name = "pricePerUnit") Double d15) {
            this.itemId = num;
            this.productId = d10;
            this.productSubstitutedFor = d11;
            this.upc = str;
            this.upcSubstitutedFor = str2;
            this.name = str3;
            this.quantity = d12;
            this.actualQuantityPicked = d13;
            this.customerSubstitutionPreference = str4;
            this.price = d14;
            this.pricePerUnit = d15;
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
        public final String getName() {
            return this.name;
        }

        /* renamed from: e, reason: from getter */
        public final Double getPrice() {
            return this.price;
        }

        /* renamed from: f, reason: from getter */
        public final Double getPricePerUnit() {
            return this.pricePerUnit;
        }

        /* renamed from: g, reason: from getter */
        public final Double getProductId() {
            return this.productId;
        }

        /* renamed from: h, reason: from getter */
        public final Double getProductSubstitutedFor() {
            return this.productSubstitutedFor;
        }

        /* renamed from: i, reason: from getter */
        public final Double getQuantity() {
            return this.quantity;
        }

        /* renamed from: j, reason: from getter */
        public final String getUpc() {
            return this.upc;
        }

        /* renamed from: k, reason: from getter */
        public final String getUpcSubstitutedFor() {
            return this.upcSubstitutedFor;
        }

        public final OrderSubstitutionsDetail.LineItem l() {
            Integer num = this.itemId;
            Double d10 = this.productId;
            Double d11 = this.productSubstitutedFor;
            String str = this.upc;
            String str2 = this.upcSubstitutedFor;
            String str3 = this.name;
            Double d12 = this.quantity;
            Double d13 = this.actualQuantityPicked;
            String str4 = this.customerSubstitutionPreference;
            return new OrderSubstitutionsDetail.LineItem(num, d10, d11, str, str2, str3, d12, d13, this.price, this.pricePerUnit, str4);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ LineItem(Integer num, Double d10, Double d11, String str, String str2, String str3, Double d12, Double d13, String str4, Double d14, Double d15, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            Double dValueOf = Double.valueOf(0.0d);
            this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : d11, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : d12, (i10 & 128) != 0 ? null : d13, (i10 & 256) != 0 ? null : str4, (i10 & 512) != 0 ? dValueOf : d14, (i10 & 1024) != 0 ? dValueOf : d15);
        }
    }

    public OrderSubstitutionResponse() {
        this(null, null, null, null, null, 31, null);
    }

    public final OrderSubstitutionResponse copy(@g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "orderId") String orderId, @g(name = "fulfillmentPartner") String fulfillmentPartner, @g(name = "lineItems") List<LineItem> lineItems, @g(name = "substitutionPreference") String substitutionPreference) {
        return new OrderSubstitutionResponse(id2, orderId, fulfillmentPartner, lineItems, substitutionPreference);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderSubstitutionResponse)) {
            return false;
        }
        OrderSubstitutionResponse orderSubstitutionResponse = (OrderSubstitutionResponse) other;
        return Intrinsics.e(this.id, orderSubstitutionResponse.id) && Intrinsics.e(this.orderId, orderSubstitutionResponse.orderId) && Intrinsics.e(this.fulfillmentPartner, orderSubstitutionResponse.fulfillmentPartner) && Intrinsics.e(this.lineItems, orderSubstitutionResponse.lineItems) && Intrinsics.e(this.substitutionPreference, orderSubstitutionResponse.substitutionPreference);
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
        return "OrderSubstitutionResponse(id=" + this.id + ", orderId=" + this.orderId + ", fulfillmentPartner=" + this.fulfillmentPartner + ", lineItems=" + this.lineItems + ", substitutionPreference=" + this.substitutionPreference + ')';
    }

    public OrderSubstitutionResponse(@g(name = PreferencesHelper.PREF_ID) String str, @g(name = "orderId") String str2, @g(name = "fulfillmentPartner") String str3, @g(name = "lineItems") List<LineItem> list, @g(name = "substitutionPreference") String str4) {
        this.id = str;
        this.orderId = str2;
        this.fulfillmentPartner = str3;
        this.lineItems = list;
        this.substitutionPreference = str4;
    }

    /* renamed from: a, reason: from getter */
    public final String getFulfillmentPartner() {
        return this.fulfillmentPartner;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<LineItem> c() {
        return this.lineItems;
    }

    /* renamed from: d, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: e, reason: from getter */
    public final String getSubstitutionPreference() {
        return this.substitutionPreference;
    }

    public /* synthetic */ OrderSubstitutionResponse(String str, String str2, String str3, List list, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? CollectionsKt.m() : list, (i10 & 16) != 0 ? null : str4);
    }
}
