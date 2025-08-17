package il;

import com.meijer.mobile.digitalshopping.api.orders.model.orderhistory.DeliveryModeEnum;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lil/a;", "", "", "hasAlcohol", "hasAgeRestricted", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "deliveryModeEnum", "<init>", "(ZZLcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "c", "Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "getDeliveryModeEnum", "()Lcom/meijer/mobile/digitalshopping/api/orders/model/orderhistory/DeliveryModeEnum;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: il.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class AgeRestrictedItemResult {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasAlcohol;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hasAgeRestricted;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final DeliveryModeEnum deliveryModeEnum;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgeRestrictedItemResult)) {
            return false;
        }
        AgeRestrictedItemResult ageRestrictedItemResult = (AgeRestrictedItemResult) other;
        return this.hasAlcohol == ageRestrictedItemResult.hasAlcohol && this.hasAgeRestricted == ageRestrictedItemResult.hasAgeRestricted && this.deliveryModeEnum == ageRestrictedItemResult.deliveryModeEnum;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getHasAgeRestricted() {
        return this.hasAgeRestricted;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getHasAlcohol() {
        return this.hasAlcohol;
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.hasAlcohol) * 31) + Boolean.hashCode(this.hasAgeRestricted)) * 31;
        DeliveryModeEnum deliveryModeEnum = this.deliveryModeEnum;
        return iHashCode + (deliveryModeEnum == null ? 0 : deliveryModeEnum.hashCode());
    }

    public String toString() {
        return "AgeRestrictedItemResult(hasAlcohol=" + this.hasAlcohol + ", hasAgeRestricted=" + this.hasAgeRestricted + ", deliveryModeEnum=" + this.deliveryModeEnum + ')';
    }

    public AgeRestrictedItemResult(boolean z10, boolean z11, DeliveryModeEnum deliveryModeEnum) {
        this.hasAlcohol = z10;
        this.hasAgeRestricted = z11;
        this.deliveryModeEnum = deliveryModeEnum;
    }
}
