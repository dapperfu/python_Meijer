package hj;

import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lhj/j;", "", "", "Lhj/h;", "consumedEntries", "", "description", "Lhj/g;", FlybuyPushData.MESSAGE_TYPE_PROMOTION, "<init>", "(Ljava/util/List;Ljava/lang/String;Lhj/g;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getConsumedEntries", "()Ljava/util/List;", "b", "Ljava/lang/String;", "getDescription", "c", "Lhj/g;", "getPromotion", "()Lhj/g;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hj.j, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class PromotionResult {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<PromotionOrderEntryConsumed> consumedEntries;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Promotion promotion;

    public PromotionResult() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionResult)) {
            return false;
        }
        PromotionResult promotionResult = (PromotionResult) other;
        return Intrinsics.e(this.consumedEntries, promotionResult.consumedEntries) && Intrinsics.e(this.description, promotionResult.description) && Intrinsics.e(this.promotion, promotionResult.promotion);
    }

    public PromotionResult(List<PromotionOrderEntryConsumed> list, String str, Promotion promotion) {
        this.consumedEntries = list;
        this.description = str;
        this.promotion = promotion;
    }

    public int hashCode() {
        List<PromotionOrderEntryConsumed> list = this.consumedEntries;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Promotion promotion = this.promotion;
        return iHashCode2 + (promotion != null ? promotion.hashCode() : 0);
    }

    public String toString() {
        return "PromotionResult(consumedEntries=" + this.consumedEntries + ", description=" + this.description + ", promotion=" + this.promotion + ')';
    }

    public /* synthetic */ PromotionResult(List list, String str, Promotion promotion, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : promotion);
    }
}
