package As;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\t¨\u0006\u0014"}, d2 = {"LAs/t;", "", "", "quantityRequested", "", "itemName", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "supplylists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: As.t, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class UnavailableItem {

    /* renamed from: c, reason: collision with root package name */
    public static final int f2103c = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int quantityRequested;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String itemName;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UnavailableItem)) {
            return false;
        }
        UnavailableItem unavailableItem = (UnavailableItem) other;
        return this.quantityRequested == unavailableItem.quantityRequested && Intrinsics.e(this.itemName, unavailableItem.itemName);
    }

    public UnavailableItem(int i10, String itemName) {
        Intrinsics.j(itemName, "itemName");
        this.quantityRequested = i10;
        this.itemName = itemName;
    }

    /* renamed from: a, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    /* renamed from: b, reason: from getter */
    public final int getQuantityRequested() {
        return this.quantityRequested;
    }

    public int hashCode() {
        return (Integer.hashCode(this.quantityRequested) * 31) + this.itemName.hashCode();
    }

    public String toString() {
        return "UnavailableItem(quantityRequested=" + this.quantityRequested + ", itemName=" + this.itemName + ')';
    }
}
