package hq;

import Xp.ShopAndScanStore;
import bk.AbstractC6392a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import io.constructor.data.local.PreferencesHelper;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0081\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0014B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001f"}, d2 = {"Lhq/j;", "", "", PreferencesHelper.PREF_ID, "Lbk/a;", "name", PlaceTypes.ADDRESS, "cityStateZip", "", "isGreenville", "<init>", "(ILbk/a;Lbk/a;Lbk/a;Z)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Lbk/a;", "d", "()Lbk/a;", "e", "Z", "()Z", "f", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hq.j, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ShopAndScanStoreDecorator {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f136143g = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a address;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a cityStateZip;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isGreenville;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhq/j$a;", "", "<init>", "()V", "LXp/e;", "Lhq/j;", "a", "(LXp/e;)Lhq/j;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hq.j$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ShopAndScanStoreDecorator a(ShopAndScanStore shopAndScanStore) {
            Intrinsics.j(shopAndScanStore, "<this>");
            int id2 = shopAndScanStore.getId();
            AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
            AbstractC6392a abstractC6392aC = companion.c(shopAndScanStore.getName());
            AbstractC6392a abstractC6392aC2 = companion.c(shopAndScanStore.getAddress());
            StringCompanionObject stringCompanionObject = StringCompanionObject.f143748a;
            String str = String.format(Locale.US, "%s, %s %s", Arrays.copyOf(new Object[]{shopAndScanStore.getCity(), shopAndScanStore.getState(), shopAndScanStore.getZip()}, 3));
            Intrinsics.i(str, "format(...)");
            return new ShopAndScanStoreDecorator(id2, abstractC6392aC, abstractC6392aC2, companion.c(str), shopAndScanStore.getIsGreenville());
        }
    }

    public ShopAndScanStoreDecorator() {
        this(0, null, null, null, false, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopAndScanStoreDecorator)) {
            return false;
        }
        ShopAndScanStoreDecorator shopAndScanStoreDecorator = (ShopAndScanStoreDecorator) other;
        return this.id == shopAndScanStoreDecorator.id && Intrinsics.e(this.name, shopAndScanStoreDecorator.name) && Intrinsics.e(this.address, shopAndScanStoreDecorator.address) && Intrinsics.e(this.cityStateZip, shopAndScanStoreDecorator.cityStateZip) && this.isGreenville == shopAndScanStoreDecorator.isGreenville;
    }

    public ShopAndScanStoreDecorator(int i10, AbstractC6392a name, AbstractC6392a address, AbstractC6392a cityStateZip, boolean z10) {
        Intrinsics.j(name, "name");
        Intrinsics.j(address, "address");
        Intrinsics.j(cityStateZip, "cityStateZip");
        this.id = i10;
        this.name = name;
        this.address = address;
        this.cityStateZip = cityStateZip;
        this.isGreenville = z10;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getAddress() {
        return this.address;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getCityStateZip() {
        return this.cityStateZip;
    }

    /* renamed from: c, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC6392a getName() {
        return this.name;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsGreenville() {
        return this.isGreenville;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.address.hashCode()) * 31) + this.cityStateZip.hashCode()) * 31) + Boolean.hashCode(this.isGreenville);
    }

    public String toString() {
        return "ShopAndScanStoreDecorator(id=" + this.id + ", name=" + this.name + ", address=" + this.address + ", cityStateZip=" + this.cityStateZip + ", isGreenville=" + this.isGreenville + ')';
    }

    public /* synthetic */ ShopAndScanStoreDecorator(int i10, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? AbstractC6392a.INSTANCE.a() : abstractC6392a, (i11 & 4) != 0 ? AbstractC6392a.INSTANCE.a() : abstractC6392a2, (i11 & 8) != 0 ? AbstractC6392a.INSTANCE.a() : abstractC6392a3, (i11 & 16) != 0 ? false : z10);
    }
}
