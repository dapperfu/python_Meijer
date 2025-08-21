package fj;

import com.google.android.libraries.places.api.model.PlaceTypes;
import di.CustomerAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\n\u0007B\u0019\b\u0004\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lfj/n;", "", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "<init>", "(Ljava/lang/Integer;)V", "a", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "b", "Lfj/n$a;", "Lfj/n$b;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Integer storeId;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001d¨\u0006\u001e"}, d2 = {"Lfj/n$a;", "Lfj/n;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Ldi/c;", PlaceTypes.ADDRESS, "", "isAlcoholAllowed", "<init>", "(Ljava/lang/Integer;Ldi/c;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "c", "Ldi/c;", "()Ldi/c;", "d", "Z", "()Z", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fj.n$a, reason: from toString */
    public static final /* data */ class Delivery extends n {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer storeId;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CustomerAddress address;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAlcoholAllowed;

        public /* synthetic */ Delivery(Integer num, CustomerAddress customerAddress, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : num, customerAddress, (i10 & 4) != 0 ? false : z10);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Delivery)) {
                return false;
            }
            Delivery delivery = (Delivery) other;
            return Intrinsics.e(this.storeId, delivery.storeId) && Intrinsics.e(this.address, delivery.address) && this.isAlcoholAllowed == delivery.isAlcoholAllowed;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Delivery(Integer num, CustomerAddress address, boolean z10) {
            super(num, null);
            Intrinsics.j(address, "address");
            this.storeId = num;
            this.address = address;
            this.isAlcoholAllowed = z10;
        }

        @Override // fj.n
        /* renamed from: a, reason: from getter */
        public Integer getStoreId() {
            return this.storeId;
        }

        /* renamed from: b, reason: from getter */
        public final CustomerAddress getAddress() {
            return this.address;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsAlcoholAllowed() {
            return this.isAlcoholAllowed;
        }

        public int hashCode() {
            Integer num = this.storeId;
            return ((((num == null ? 0 : num.hashCode()) * 31) + this.address.hashCode()) * 31) + Boolean.hashCode(this.isAlcoholAllowed);
        }

        public String toString() {
            return "Delivery(storeId=" + this.storeId + ", address=" + this.address + ", isAlcoholAllowed=" + this.isAlcoholAllowed + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lfj/n$b;", "Lfj/n;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "<init>", "(Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fj.n$b, reason: from toString */
    public static final /* data */ class Pickup extends n {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer storeId;

        /* JADX WARN: Multi-variable type inference failed */
        public Pickup() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Pickup) && Intrinsics.e(this.storeId, ((Pickup) other).storeId);
        }

        public Pickup(Integer num) {
            super(num, null);
            this.storeId = num;
        }

        @Override // fj.n
        /* renamed from: a, reason: from getter */
        public Integer getStoreId() {
            return this.storeId;
        }

        public int hashCode() {
            Integer num = this.storeId;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "Pickup(storeId=" + this.storeId + ')';
        }

        public /* synthetic */ Pickup(Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : num);
        }
    }

    public /* synthetic */ n(Integer num, DefaultConstructorMarker defaultConstructorMarker) {
        this(num);
    }

    private n(Integer num) {
        this.storeId = num;
    }

    /* renamed from: a, reason: from getter */
    public Integer getStoreId() {
        return this.storeId;
    }
}
