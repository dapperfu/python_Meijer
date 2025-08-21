package Fq;

import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import nk.f;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010(\u001a\u0004\b)\u0010\u001d¨\u0006*"}, d2 = {"LFq/e;", "", "", "LFq/c;", "items", "j$/time/Instant", "lastUpdatedAt", "", "expiryMinutes", "<init>", "(Ljava/util/List;Lj$/time/Instant;I)V", "now", "", "d", "(Lj$/time/Instant;)Z", "Lnk/f;", "product", "g", "(Lnk/f;)LFq/c;", "LPk/c;", "coupon", "f", "(LPk/c;)LFq/c;", "a", "(Ljava/util/List;Lj$/time/Instant;I)LFq/e;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lj$/time/Instant;", "getLastUpdatedAt", "()Lj$/time/Instant;", "I", "getExpiryMinutes", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Fq.e, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ShoppingListStore {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ShoppingListItem> items;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Instant lastUpdatedAt;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int expiryMinutes;

    public ShoppingListStore() {
        this(null, null, 0, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingListStore)) {
            return false;
        }
        ShoppingListStore shoppingListStore = (ShoppingListStore) other;
        return Intrinsics.e(this.items, shoppingListStore.items) && Intrinsics.e(this.lastUpdatedAt, shoppingListStore.lastUpdatedAt) && this.expiryMinutes == shoppingListStore.expiryMinutes;
    }

    public ShoppingListStore(List<ShoppingListItem> items, Instant lastUpdatedAt, int i10) {
        Intrinsics.j(items, "items");
        Intrinsics.j(lastUpdatedAt, "lastUpdatedAt");
        this.items = items;
        this.lastUpdatedAt = lastUpdatedAt;
        this.expiryMinutes = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingListStore b(ShoppingListStore shoppingListStore, List list, Instant instant, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = shoppingListStore.items;
        }
        if ((i11 & 2) != 0) {
            instant = shoppingListStore.lastUpdatedAt;
        }
        if ((i11 & 4) != 0) {
            i10 = shoppingListStore.expiryMinutes;
        }
        return shoppingListStore.a(list, instant, i10);
    }

    public static /* synthetic */ boolean e(ShoppingListStore shoppingListStore, Instant instant, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            instant = Instant.now();
        }
        return shoppingListStore.d(instant);
    }

    public final ShoppingListStore a(List<ShoppingListItem> items, Instant lastUpdatedAt, int expiryMinutes) {
        Intrinsics.j(items, "items");
        Intrinsics.j(lastUpdatedAt, "lastUpdatedAt");
        return new ShoppingListStore(items, lastUpdatedAt, expiryMinutes);
    }

    public final List<ShoppingListItem> c() {
        return this.items;
    }

    public final boolean d(Instant now) {
        Intrinsics.j(now, "now");
        return Duration.between(this.lastUpdatedAt, now).abs().toMinutes() > ((long) this.expiryMinutes);
    }

    public final ShoppingListItem f(Pk.c coupon) {
        Object next;
        Intrinsics.j(coupon, "coupon");
        Iterator<T> it = this.items.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (d.b((ShoppingListItem) next, coupon)) {
                break;
            }
        }
        return (ShoppingListItem) next;
    }

    public final ShoppingListItem g(f product) {
        Object next;
        Intrinsics.j(product, "product");
        Iterator<T> it = this.items.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (d.c((ShoppingListItem) next, product)) {
                break;
            }
        }
        return (ShoppingListItem) next;
    }

    public int hashCode() {
        return (((this.items.hashCode() * 31) + this.lastUpdatedAt.hashCode()) * 31) + Integer.hashCode(this.expiryMinutes);
    }

    public String toString() {
        return "ShoppingListStore(items=" + this.items + ", lastUpdatedAt=" + this.lastUpdatedAt + ", expiryMinutes=" + this.expiryMinutes + ')';
    }

    public /* synthetic */ ShoppingListStore(List list, Instant instant, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? CollectionsKt.m() : list, (i11 & 2) != 0 ? Instant.MIN : instant, (i11 & 4) != 0 ? 1 : i10);
    }
}
