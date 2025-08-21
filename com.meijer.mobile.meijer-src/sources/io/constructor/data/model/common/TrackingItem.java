package io.constructor.data.model.common;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lio/constructor/data/model/common/TrackingItem;", "Ljava/io/Serializable;", "itemId", "", "variationId", "(Ljava/lang/String;Ljava/lang/String;)V", "getItemId", "()Ljava/lang/String;", "getVariationId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TrackingItem implements Serializable {
    private final String itemId;
    private final String variationId;

    public static /* synthetic */ TrackingItem copy$default(TrackingItem trackingItem, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = trackingItem.itemId;
        }
        if ((i10 & 2) != 0) {
            str2 = trackingItem.variationId;
        }
        return trackingItem.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getVariationId() {
        return this.variationId;
    }

    public final TrackingItem copy(@g(name = "item_id") String itemId, @g(name = "variation_id") String variationId) {
        return new TrackingItem(itemId, variationId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackingItem)) {
            return false;
        }
        TrackingItem trackingItem = (TrackingItem) other;
        return Intrinsics.e(this.itemId, trackingItem.itemId) && Intrinsics.e(this.variationId, trackingItem.variationId);
    }

    public int hashCode() {
        String str = this.itemId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.variationId;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TrackingItem(itemId=" + this.itemId + ", variationId=" + this.variationId + ")";
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getVariationId() {
        return this.variationId;
    }

    public TrackingItem(@g(name = "item_id") String str, @g(name = "variation_id") String str2) {
        this.itemId = str;
        this.variationId = str2;
    }
}
