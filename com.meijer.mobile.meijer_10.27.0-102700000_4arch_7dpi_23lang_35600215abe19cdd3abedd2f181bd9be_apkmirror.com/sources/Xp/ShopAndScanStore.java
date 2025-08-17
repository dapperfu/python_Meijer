package Xp;

import com.google.android.libraries.places.api.model.PlaceTypes;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0001\u0016BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001c\u0010\u0010R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u000b\u0010 R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006#"}, d2 = {"LXp/e;", "", "", PreferencesHelper.PREF_ID, "", "name", PlaceTypes.ADDRESS, "city", "state", "zip", "", "isLabStore", "isGreenville", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Ljava/lang/String;", "d", "e", "f", "g", "Z", "()Z", "h", "i", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xp.e, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class ShopAndScanStore {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String address;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String city;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLabStore;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGreenville;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LXp/e$a;", "", "<init>", "()V", "LXp/e;", "a", "()LXp/e;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xp.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ShopAndScanStore a() {
            return new ShopAndScanStore(771, "LAB Store 771", "2929 Walker Ave. NW", "Grand Rapids", "MI", "49544", true, true);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanStore)) {
            return false;
        }
        ShopAndScanStore shopAndScanStore = (ShopAndScanStore) other;
        return this.id == shopAndScanStore.id && Intrinsics.e(this.name, shopAndScanStore.name) && Intrinsics.e(this.address, shopAndScanStore.address) && Intrinsics.e(this.city, shopAndScanStore.city) && Intrinsics.e(this.state, shopAndScanStore.state) && Intrinsics.e(this.zip, shopAndScanStore.zip) && this.isLabStore == shopAndScanStore.isLabStore && this.isGreenville == shopAndScanStore.isGreenville;
    }

    public ShopAndScanStore(int i10, String name, String address, String city, String state, String zip, boolean z10, boolean z11) {
        Intrinsics.j(name, "name");
        Intrinsics.j(address, "address");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zip, "zip");
        this.id = i10;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.isLabStore = z10;
        this.isGreenville = z11;
    }

    /* renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: b, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    /* renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: e, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: f, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsGreenville() {
        return this.isGreenville;
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.address.hashCode()) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zip.hashCode()) * 31) + Boolean.hashCode(this.isLabStore)) * 31) + Boolean.hashCode(this.isGreenville);
    }

    public String toString() {
        return "ShopAndScanStore(id=" + this.id + ", name=" + this.name + ", address=" + this.address + ", city=" + this.city + ", state=" + this.state + ", zip=" + this.zip + ", isLabStore=" + this.isLabStore + ", isGreenville=" + this.isGreenville + ')';
    }
}
