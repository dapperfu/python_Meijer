package com.meijer.mobile.core.models.store;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/core/models/store/BunchaItem;", "", "", "fee", "", PlaceTypes.STORE, "<init>", "(DLjava/lang/String;)V", "copy", "(DLjava/lang/String;)Lcom/meijer/mobile/core/models/store/BunchaItem;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Ljava/lang/String;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BunchaItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final double fee;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String store;

    public final BunchaItem copy(@g(name = "fee") double fee, @g(name = PlaceTypes.STORE) String store) {
        Intrinsics.j(store, "store");
        return new BunchaItem(fee, store);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BunchaItem)) {
            return false;
        }
        BunchaItem bunchaItem = (BunchaItem) other;
        return Double.compare(this.fee, bunchaItem.fee) == 0 && Intrinsics.e(this.store, bunchaItem.store);
    }

    public int hashCode() {
        return (Double.hashCode(this.fee) * 31) + this.store.hashCode();
    }

    public String toString() {
        return "BunchaItem(fee=" + this.fee + ", store=" + this.store + ')';
    }

    public BunchaItem(@g(name = "fee") double d10, @g(name = PlaceTypes.STORE) String store) {
        Intrinsics.j(store, "store");
        this.fee = d10;
        this.store = store;
    }

    /* renamed from: a, reason: from getter */
    public final double getFee() {
        return this.fee;
    }

    /* renamed from: b, reason: from getter */
    public final String getStore() {
        return this.store;
    }
}
