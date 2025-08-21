package Bq;

import Fq.ShoppingListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LBq/a;", "", "<init>", "()V", "e", "f", "g", "a", "d", "b", "c", "LBq/a$a;", "LBq/a$b;", "LBq/a$c;", "LBq/a$d;", "LBq/a$e;", "LBq/a$f;", "LBq/a$g;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class a {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LBq/a$a;", "LBq/a;", "LFq/c;", "item", "<init>", "(LFq/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LFq/c;", "()LFq/c;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bq.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class Add extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShoppingListItem item;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Add) && Intrinsics.e(this.item, ((Add) other).item);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Add(ShoppingListItem item) {
            super(null);
            Intrinsics.j(item, "item");
            this.item = item;
        }

        /* renamed from: a, reason: from getter */
        public final ShoppingListItem getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return "Add(item=" + this.item + ')';
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"LBq/a$b;", "LBq/a;", "", "LFq/c;", "items", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bq.a$b, reason: from toString */
    public static final /* data */ class AddItems extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ShoppingListItem> items;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddItems) && Intrinsics.e(this.items, ((AddItems) other).items);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddItems(List<ShoppingListItem> items) {
            super(null);
            Intrinsics.j(items, "items");
            this.items = items;
        }

        public final List<ShoppingListItem> a() {
            return this.items;
        }

        public int hashCode() {
            return this.items.hashCode();
        }

        public String toString() {
            return "AddItems(items=" + this.items + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"LBq/a$c;", "LBq/a;", "LFq/c;", "itemToMove", "itemOnBottom", "<init>", "(LFq/c;LFq/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LFq/c;", "b", "()LFq/c;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bq.a$c, reason: from toString */
    public static final /* data */ class MoveItem extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShoppingListItem itemToMove;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShoppingListItem itemOnBottom;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MoveItem)) {
                return false;
            }
            MoveItem moveItem = (MoveItem) other;
            return Intrinsics.e(this.itemToMove, moveItem.itemToMove) && Intrinsics.e(this.itemOnBottom, moveItem.itemOnBottom);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MoveItem(ShoppingListItem itemToMove, ShoppingListItem shoppingListItem) {
            super(null);
            Intrinsics.j(itemToMove, "itemToMove");
            this.itemToMove = itemToMove;
            this.itemOnBottom = shoppingListItem;
        }

        /* renamed from: a, reason: from getter */
        public final ShoppingListItem getItemOnBottom() {
            return this.itemOnBottom;
        }

        /* renamed from: b, reason: from getter */
        public final ShoppingListItem getItemToMove() {
            return this.itemToMove;
        }

        public int hashCode() {
            int iHashCode = this.itemToMove.hashCode() * 31;
            ShoppingListItem shoppingListItem = this.itemOnBottom;
            return iHashCode + (shoppingListItem == null ? 0 : shoppingListItem.hashCode());
        }

        public String toString() {
            return "MoveItem(itemToMove=" + this.itemToMove + ", itemOnBottom=" + this.itemOnBottom + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LBq/a$d;", "LBq/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f3627a = new d();

        private d() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public String toString() {
            return "ReloadList";
        }

        public int hashCode() {
            return -20187147;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LBq/a$e;", "LBq/a;", "LFq/c;", "item", "<init>", "(LFq/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LFq/c;", "()LFq/c;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bq.a$e, reason: from toString */
    public static final /* data */ class Remove extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShoppingListItem item;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Remove) && Intrinsics.e(this.item, ((Remove) other).item);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Remove(ShoppingListItem item) {
            super(null);
            Intrinsics.j(item, "item");
            this.item = item;
        }

        /* renamed from: a, reason: from getter */
        public final ShoppingListItem getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return "Remove(item=" + this.item + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LBq/a$f;", "LBq/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class f extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final f f3629a = new f();

        private f() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public String toString() {
            return "RemoveCompletedItems";
        }

        public int hashCode() {
            return 1443430007;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LBq/a$g;", "LBq/a;", "LFq/c;", "item", "<init>", "(LFq/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LFq/c;", "()LFq/c;", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bq.a$g, reason: from toString */
    public static final /* data */ class UpdateCompletion extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ShoppingListItem item;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UpdateCompletion) && Intrinsics.e(this.item, ((UpdateCompletion) other).item);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateCompletion(ShoppingListItem item) {
            super(null);
            Intrinsics.j(item, "item");
            this.item = item;
        }

        /* renamed from: a, reason: from getter */
        public final ShoppingListItem getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        public String toString() {
            return "UpdateCompletion(item=" + this.item + ')';
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
