package ul;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\f\u001a\u00020\u00002\f\b\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lul/d;", "", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "Lul/c;", "fulfillmentDays", "", "partnerCustomerId", "<init>", "(ILjava/util/List;Ljava/lang/String;)V", "a", "(ILjava/util/List;Ljava/lang/String;)Lul/d;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "d", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/String;", "getPartnerCustomerId", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ul.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class FulfillmentSchedule {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<FulfillmentDay> fulfillmentDays;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String partnerCustomerId;

    public FulfillmentSchedule(int i10, List<FulfillmentDay> fulfillmentDays, String str) {
        Intrinsics.j(fulfillmentDays, "fulfillmentDays");
        this.storeId = i10;
        this.fulfillmentDays = fulfillmentDays;
        this.partnerCustomerId = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfillmentSchedule)) {
            return false;
        }
        FulfillmentSchedule fulfillmentSchedule = (FulfillmentSchedule) other;
        return this.storeId == fulfillmentSchedule.storeId && Intrinsics.e(this.fulfillmentDays, fulfillmentSchedule.fulfillmentDays) && Intrinsics.e(this.partnerCustomerId, fulfillmentSchedule.partnerCustomerId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FulfillmentSchedule b(FulfillmentSchedule fulfillmentSchedule, int i10, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = fulfillmentSchedule.storeId;
        }
        if ((i11 & 2) != 0) {
            list = fulfillmentSchedule.fulfillmentDays;
        }
        if ((i11 & 4) != 0) {
            str = fulfillmentSchedule.partnerCustomerId;
        }
        return fulfillmentSchedule.a(i10, list, str);
    }

    public final FulfillmentSchedule a(int storeId, List<FulfillmentDay> fulfillmentDays, String partnerCustomerId) {
        Intrinsics.j(fulfillmentDays, "fulfillmentDays");
        return new FulfillmentSchedule(storeId, fulfillmentDays, partnerCustomerId);
    }

    public final List<FulfillmentDay> c() {
        return this.fulfillmentDays;
    }

    /* renamed from: d, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.storeId) * 31) + this.fulfillmentDays.hashCode()) * 31;
        String str = this.partnerCustomerId;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FulfillmentSchedule(storeId=" + this.storeId + ", fulfillmentDays=" + this.fulfillmentDays + ", partnerCustomerId=" + this.partnerCustomerId + ')';
    }

    public /* synthetic */ FulfillmentSchedule(int i10, List list, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? CollectionsKt.m() : list, (i11 & 4) != 0 ? null : str);
    }
}
