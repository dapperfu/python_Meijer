package com.meijer.mobile.cart.model.hybris;

import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import com.meijer.mobile.product.model.hybris.api.models.HybrisProduct;
import com.meijer.mobile.product.model.hybris.api.models.pricing.HybrisPrice;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b4\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0006\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\t\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0003\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0003\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0003\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0003\u0010\u0013\u001a\u00020\f\u0012\b\b\u0003\u0010\u0014\u001a\u00020\t\u0012\b\b\u0003\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0017\u0012\u000e\b\u0003\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005\u0012\b\b\u0003\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\f\u0012\b\b\u0003\u0010\u001e\u001a\u00020\u0017¢\u0006\u0004\b\u001f\u0010 JÜ\u0001\u0010!\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0003\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\t2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\u000e2\b\b\u0003\u0010\u0011\u001a\u00020\u000e2\b\b\u0003\u0010\u0012\u001a\u00020\u000e2\b\b\u0003\u0010\u0013\u001a\u00020\f2\b\b\u0003\u0010\u0014\u001a\u00020\t2\b\b\u0003\u0010\u0016\u001a\u00020\u00152\b\b\u0003\u0010\u0018\u001a\u00020\u00172\u000e\b\u0003\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00052\b\b\u0003\u0010\u001c\u001a\u00020\u001b2\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\u001e\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00172\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010&R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b5\u00107R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b-\u00107R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010<\u001a\u0004\b8\u0010=R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b9\u0010=R\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b?\u0010<\u001a\u0004\b?\u0010=R\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b3\u0010<\u001a\u0004\b@\u0010=R\u0017\u0010\u0013\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bB\u0010$R\u001a\u0010\u0014\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u00106\u001a\u0004\bC\u00107R\u0017\u0010\u0016\u001a\u00020\u00158G¢\u0006\f\n\u0004\b/\u0010D\u001a\u0004\bA\u0010ER\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b;\u0010F\u001a\u0004\bG\u0010HR&\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bI\u0010.\u0012\u0004\bJ\u0010K\u001a\u0004\b>\u00100R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b@\u0010L\u001a\u0004\b1\u0010MR\u0019\u0010\u001d\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\bI\u0010$R\u0017\u0010\u001e\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bG\u0010F\u001a\u0004\bN\u0010H¨\u0006O"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/EntryJson;", "", "", "Lcom/meijer/mobile/cart/model/common/EntryNumber;", "entryNumber", "", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;", "substituteItems", "product", "", "avgPoundsEach", "actualQuantity", "", "substitutionNotes", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "basePrice", "depositPrice", "pricePerUnit", "totalPrice", "unit", "quantityValue", "", "quantity", "", "updateable", "Lcom/meijer/mobile/cart/model/hybris/HybrisLightningCartReward;", "lightningCartReward", "Lcom/meijer/mobile/cart/model/hybris/HybrisAllDiscountDetails;", "allDiscountDetails", "substitutionStatus", "isDoNotSubstitute", "<init>", "(ILjava/util/List;Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;DDLjava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;DJZLjava/util/List;Lcom/meijer/mobile/cart/model/hybris/HybrisAllDiscountDetails;Ljava/lang/String;Z)V", "copy", "(ILjava/util/List;Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;DDLjava/lang/String;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;Ljava/lang/String;DJZLjava/util/List;Lcom/meijer/mobile/cart/model/hybris/HybrisAllDiscountDetails;Ljava/lang/String;Z)Lcom/meijer/mobile/cart/model/hybris/EntryJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "g", "b", "Ljava/util/List;", "m", "()Ljava/util/List;", "c", "Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;", "j", "()Lcom/meijer/mobile/product/model/hybris/api/models/HybrisProduct;", "d", "D", "()D", "e", "f", "Ljava/lang/String;", "n", "Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "()Lcom/meijer/mobile/product/model/hybris/api/models/pricing/HybrisPrice;", "h", "i", "p", "k", "q", "l", "J", "()J", "Z", "r", "()Z", "o", "getLightningCartReward$annotations", "()V", "Lcom/meijer/mobile/cart/model/hybris/HybrisAllDiscountDetails;", "()Lcom/meijer/mobile/cart/model/hybris/HybrisAllDiscountDetails;", "s", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class EntryJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int entryNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisProduct> substituteItems;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisProduct product;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final double avgPoundsEach;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final double actualQuantity;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String substitutionNotes;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice basePrice;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice depositPrice;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice pricePerUnit;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisPrice totalPrice;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String unit;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final double quantityValue;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final long quantity;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean updateable;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<HybrisLightningCartReward> lightningCartReward;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisAllDiscountDetails allDiscountDetails;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String substitutionStatus;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDoNotSubstitute;

    public EntryJson(@g(name = "entryNumber") int i10, @g(name = "preferredProducts") List<HybrisProduct> list, @g(name = "product") HybrisProduct product, @g(name = "avgPoundsEach") double d10, @g(name = "actualQuantity") double d11, @g(name = "substitutionNotes") String str, @g(name = "basePrice") HybrisPrice hybrisPrice, @g(name = "depositPrice") HybrisPrice depositPrice, @g(name = "pricePerUnit") HybrisPrice pricePerUnit, @g(name = "totalPrice") HybrisPrice totalPrice, @g(name = "unit") String unit, @g(name = "quantityValue") double d12, @g(name = "quantity") long j10, @g(name = "updateable") boolean z10, @g(name = "lightningCartReward") List<HybrisLightningCartReward> lightningCartReward, @g(name = "allDiscountDetails") HybrisAllDiscountDetails allDiscountDetails, @g(name = "substitutionStatus") String str2, @g(name = "doNotSubstitute") boolean z11) {
        Intrinsics.j(product, "product");
        Intrinsics.j(depositPrice, "depositPrice");
        Intrinsics.j(pricePerUnit, "pricePerUnit");
        Intrinsics.j(totalPrice, "totalPrice");
        Intrinsics.j(unit, "unit");
        Intrinsics.j(lightningCartReward, "lightningCartReward");
        Intrinsics.j(allDiscountDetails, "allDiscountDetails");
        this.entryNumber = i10;
        this.substituteItems = list;
        this.product = product;
        this.avgPoundsEach = d10;
        this.actualQuantity = d11;
        this.substitutionNotes = str;
        this.basePrice = hybrisPrice;
        this.depositPrice = depositPrice;
        this.pricePerUnit = pricePerUnit;
        this.totalPrice = totalPrice;
        this.unit = unit;
        this.quantityValue = d12;
        this.quantity = j10;
        this.updateable = z10;
        this.lightningCartReward = lightningCartReward;
        this.allDiscountDetails = allDiscountDetails;
        this.substitutionStatus = str2;
        this.isDoNotSubstitute = z11;
    }

    public static /* synthetic */ EntryJson a(EntryJson entryJson, int i10, List list, HybrisProduct hybrisProduct, double d10, double d11, String str, HybrisPrice hybrisPrice, HybrisPrice hybrisPrice2, HybrisPrice hybrisPrice3, HybrisPrice hybrisPrice4, String str2, double d12, long j10, boolean z10, List list2, HybrisAllDiscountDetails hybrisAllDiscountDetails, String str3, boolean z11, int i11, Object obj) {
        boolean z12;
        String str4;
        int i12 = (i11 & 1) != 0 ? entryJson.entryNumber : i10;
        List list3 = (i11 & 2) != 0 ? entryJson.substituteItems : list;
        HybrisProduct hybrisProduct2 = (i11 & 4) != 0 ? entryJson.product : hybrisProduct;
        double d13 = (i11 & 8) != 0 ? entryJson.avgPoundsEach : d10;
        double d14 = (i11 & 16) != 0 ? entryJson.actualQuantity : d11;
        String str5 = (i11 & 32) != 0 ? entryJson.substitutionNotes : str;
        HybrisPrice hybrisPrice5 = (i11 & 64) != 0 ? entryJson.basePrice : hybrisPrice;
        HybrisPrice hybrisPrice6 = (i11 & 128) != 0 ? entryJson.depositPrice : hybrisPrice2;
        HybrisPrice hybrisPrice7 = (i11 & 256) != 0 ? entryJson.pricePerUnit : hybrisPrice3;
        HybrisPrice hybrisPrice8 = (i11 & 512) != 0 ? entryJson.totalPrice : hybrisPrice4;
        String str6 = (i11 & 1024) != 0 ? entryJson.unit : str2;
        int i13 = i12;
        List list4 = list3;
        double d15 = (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? entryJson.quantityValue : d12;
        long j11 = (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? entryJson.quantity : j10;
        boolean z13 = (i11 & 8192) != 0 ? entryJson.updateable : z10;
        long j12 = j11;
        List list5 = (i11 & 16384) != 0 ? entryJson.lightningCartReward : list2;
        HybrisAllDiscountDetails hybrisAllDiscountDetails2 = (32768 & i11) != 0 ? entryJson.allDiscountDetails : hybrisAllDiscountDetails;
        String str7 = (i11 & 65536) != 0 ? entryJson.substitutionStatus : str3;
        if ((i11 & 131072) != 0) {
            str4 = str7;
            z12 = entryJson.isDoNotSubstitute;
        } else {
            z12 = z11;
            str4 = str7;
        }
        return entryJson.copy(i13, list4, hybrisProduct2, d13, d14, str5, hybrisPrice5, hybrisPrice6, hybrisPrice7, hybrisPrice8, str6, d15, j12, z13, list5, hybrisAllDiscountDetails2, str4, z12);
    }

    public final EntryJson copy(@g(name = "entryNumber") int entryNumber, @g(name = "preferredProducts") List<HybrisProduct> substituteItems, @g(name = "product") HybrisProduct product, @g(name = "avgPoundsEach") double avgPoundsEach, @g(name = "actualQuantity") double actualQuantity, @g(name = "substitutionNotes") String substitutionNotes, @g(name = "basePrice") HybrisPrice basePrice, @g(name = "depositPrice") HybrisPrice depositPrice, @g(name = "pricePerUnit") HybrisPrice pricePerUnit, @g(name = "totalPrice") HybrisPrice totalPrice, @g(name = "unit") String unit, @g(name = "quantityValue") double quantityValue, @g(name = "quantity") long quantity, @g(name = "updateable") boolean updateable, @g(name = "lightningCartReward") List<HybrisLightningCartReward> lightningCartReward, @g(name = "allDiscountDetails") HybrisAllDiscountDetails allDiscountDetails, @g(name = "substitutionStatus") String substitutionStatus, @g(name = "doNotSubstitute") boolean isDoNotSubstitute) {
        Intrinsics.j(product, "product");
        Intrinsics.j(depositPrice, "depositPrice");
        Intrinsics.j(pricePerUnit, "pricePerUnit");
        Intrinsics.j(totalPrice, "totalPrice");
        Intrinsics.j(unit, "unit");
        Intrinsics.j(lightningCartReward, "lightningCartReward");
        Intrinsics.j(allDiscountDetails, "allDiscountDetails");
        return new EntryJson(entryNumber, substituteItems, product, avgPoundsEach, actualQuantity, substitutionNotes, basePrice, depositPrice, pricePerUnit, totalPrice, unit, quantityValue, quantity, updateable, lightningCartReward, allDiscountDetails, substitutionStatus, isDoNotSubstitute);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryJson)) {
            return false;
        }
        EntryJson entryJson = (EntryJson) other;
        return this.entryNumber == entryJson.entryNumber && Intrinsics.e(this.substituteItems, entryJson.substituteItems) && Intrinsics.e(this.product, entryJson.product) && Double.compare(this.avgPoundsEach, entryJson.avgPoundsEach) == 0 && Double.compare(this.actualQuantity, entryJson.actualQuantity) == 0 && Intrinsics.e(this.substitutionNotes, entryJson.substitutionNotes) && Intrinsics.e(this.basePrice, entryJson.basePrice) && Intrinsics.e(this.depositPrice, entryJson.depositPrice) && Intrinsics.e(this.pricePerUnit, entryJson.pricePerUnit) && Intrinsics.e(this.totalPrice, entryJson.totalPrice) && Intrinsics.e(this.unit, entryJson.unit) && Double.compare(this.quantityValue, entryJson.quantityValue) == 0 && this.quantity == entryJson.quantity && this.updateable == entryJson.updateable && Intrinsics.e(this.lightningCartReward, entryJson.lightningCartReward) && Intrinsics.e(this.allDiscountDetails, entryJson.allDiscountDetails) && Intrinsics.e(this.substitutionStatus, entryJson.substitutionStatus) && this.isDoNotSubstitute == entryJson.isDoNotSubstitute;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.entryNumber) * 31;
        List<HybrisProduct> list = this.substituteItems;
        int iHashCode2 = (((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.product.hashCode()) * 31) + Double.hashCode(this.avgPoundsEach)) * 31) + Double.hashCode(this.actualQuantity)) * 31;
        String str = this.substitutionNotes;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        HybrisPrice hybrisPrice = this.basePrice;
        int iHashCode4 = (((((((((((((((((((iHashCode3 + (hybrisPrice == null ? 0 : hybrisPrice.hashCode())) * 31) + this.depositPrice.hashCode()) * 31) + this.pricePerUnit.hashCode()) * 31) + this.totalPrice.hashCode()) * 31) + this.unit.hashCode()) * 31) + Double.hashCode(this.quantityValue)) * 31) + Long.hashCode(this.quantity)) * 31) + Boolean.hashCode(this.updateable)) * 31) + this.lightningCartReward.hashCode()) * 31) + this.allDiscountDetails.hashCode()) * 31;
        String str2 = this.substitutionStatus;
        return ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isDoNotSubstitute);
    }

    public String toString() {
        return "EntryJson(entryNumber=" + this.entryNumber + ", substituteItems=" + this.substituteItems + ", product=" + this.product + ", avgPoundsEach=" + this.avgPoundsEach + ", actualQuantity=" + this.actualQuantity + ", substitutionNotes=" + this.substitutionNotes + ", basePrice=" + this.basePrice + ", depositPrice=" + this.depositPrice + ", pricePerUnit=" + this.pricePerUnit + ", totalPrice=" + this.totalPrice + ", unit=" + this.unit + ", quantityValue=" + this.quantityValue + ", quantity=" + this.quantity + ", updateable=" + this.updateable + ", lightningCartReward=" + this.lightningCartReward + ", allDiscountDetails=" + this.allDiscountDetails + ", substitutionStatus=" + this.substitutionStatus + ", isDoNotSubstitute=" + this.isDoNotSubstitute + ')';
    }

    /* renamed from: b, reason: from getter */
    public final double getActualQuantity() {
        return this.actualQuantity;
    }

    /* renamed from: c, reason: from getter */
    public final HybrisAllDiscountDetails getAllDiscountDetails() {
        return this.allDiscountDetails;
    }

    /* renamed from: d, reason: from getter */
    public final double getAvgPoundsEach() {
        return this.avgPoundsEach;
    }

    /* renamed from: e, reason: from getter */
    public final HybrisPrice getBasePrice() {
        return this.basePrice;
    }

    /* renamed from: f, reason: from getter */
    public final HybrisPrice getDepositPrice() {
        return this.depositPrice;
    }

    /* renamed from: g, reason: from getter */
    public final int getEntryNumber() {
        return this.entryNumber;
    }

    public final List<HybrisLightningCartReward> h() {
        return this.lightningCartReward;
    }

    /* renamed from: i, reason: from getter */
    public final HybrisPrice getPricePerUnit() {
        return this.pricePerUnit;
    }

    /* renamed from: j, reason: from getter */
    public final HybrisProduct getProduct() {
        return this.product;
    }

    /* renamed from: k, reason: from getter */
    public final long getQuantity() {
        return this.quantity;
    }

    /* renamed from: l, reason: from getter */
    public final double getQuantityValue() {
        return this.quantityValue;
    }

    public final List<HybrisProduct> m() {
        return this.substituteItems;
    }

    /* renamed from: n, reason: from getter */
    public final String getSubstitutionNotes() {
        return this.substitutionNotes;
    }

    /* renamed from: o, reason: from getter */
    public final String getSubstitutionStatus() {
        return this.substitutionStatus;
    }

    /* renamed from: p, reason: from getter */
    public final HybrisPrice getTotalPrice() {
        return this.totalPrice;
    }

    /* renamed from: q, reason: from getter */
    public final String getUnit() {
        return this.unit;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getUpdateable() {
        return this.updateable;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsDoNotSubstitute() {
        return this.isDoNotSubstitute;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ EntryJson(int i10, List list, HybrisProduct hybrisProduct, double d10, double d11, String str, HybrisPrice hybrisPrice, HybrisPrice hybrisPrice2, HybrisPrice hybrisPrice3, HybrisPrice hybrisPrice4, String str2, double d12, long j10, boolean z10, List list2, HybrisAllDiscountDetails hybrisAllDiscountDetails, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        HybrisAllDiscountDetails hybrisAllDiscountDetails2;
        int i12 = (i11 & 1) != 0 ? -1 : i10;
        List list3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        List list4 = (i11 & 2) != 0 ? null : list;
        double d13 = (i11 & 8) != 0 ? 0.0d : d10;
        double d14 = (i11 & 16) == 0 ? d11 : 0.0d;
        String str4 = (i11 & 32) != 0 ? null : str;
        HybrisPrice hybrisPrice5 = (i11 & 64) != 0 ? null : hybrisPrice;
        HybrisPrice hybrisPrice6 = (i11 & 128) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice2;
        HybrisPrice hybrisPrice7 = (i11 & 256) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice3;
        HybrisPrice hybrisPrice8 = (i11 & 512) != 0 ? new HybrisPrice(null, null, null, null, 0.0d, null, null, l3.f93324d, null) : hybrisPrice4;
        String str5 = (i11 & 1024) != 0 ? "" : str2;
        double d15 = (i11 & RecyclerView.m.FLAG_MOVED) != 0 ? 1.0d : d12;
        long j11 = (i11 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 1L : j10;
        boolean z12 = (i11 & 8192) != 0 ? false : z10;
        List listM = (i11 & 16384) != 0 ? CollectionsKt.m() : list2;
        if ((32768 & i11) != 0) {
            hybrisAllDiscountDetails2 = new HybrisAllDiscountDetails(list3, objArr2 == true ? 1 : 0, 3, objArr == true ? 1 : 0);
        } else {
            hybrisAllDiscountDetails2 = hybrisAllDiscountDetails;
        }
        this(i12, list4, hybrisProduct, d13, d14, str4, hybrisPrice5, hybrisPrice6, hybrisPrice7, hybrisPrice8, str5, d15, j11, z12, listM, hybrisAllDiscountDetails2, (65536 & i11) != 0 ? null : str3, (i11 & 131072) != 0 ? false : z11);
    }
}
