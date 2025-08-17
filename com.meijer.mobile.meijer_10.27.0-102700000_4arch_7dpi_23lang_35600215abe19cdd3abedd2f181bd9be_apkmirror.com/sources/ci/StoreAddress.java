package ci;

import com.google.android.libraries.places.api.model.PlaceTypes;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\b\u0010\"R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001a\u001a\u0004\b#\u0010\u0011R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0019\u0010\u0011R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\r\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010\u001a\u001a\u0004\b\u001c\u0010\u0011¨\u0006)"}, d2 = {"Lci/g;", "Lci/a;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", PreferencesHelper.PREF_ID, "Lci/b;", PlaceTypes.COUNTRY, "", "isDefault", "line1", "postalCode", "Lci/f;", "region", "town", "<init>", "(Ljava/lang/String;Lci/b;ZLjava/lang/String;Ljava/lang/String;Lci/f;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "Lci/b;", "e", "()Lci/b;", "c", "Z", "()Z", "d", "f", "Lci/f;", "getRegion", "()Lci/f;", "g", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ci.g, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class StoreAddress implements InterfaceC6393a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Country country;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDefault;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String line1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Region region;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String town;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreAddress)) {
            return false;
        }
        StoreAddress storeAddress = (StoreAddress) other;
        return Intrinsics.e(this.id, storeAddress.id) && Intrinsics.e(this.country, storeAddress.country) && this.isDefault == storeAddress.isDefault && Intrinsics.e(this.line1, storeAddress.line1) && Intrinsics.e(this.postalCode, storeAddress.postalCode) && Intrinsics.e(this.region, storeAddress.region) && Intrinsics.e(this.town, storeAddress.town);
    }

    public StoreAddress(String id2, Country country, boolean z10, String line1, String postalCode, Region region, String town) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(country, "country");
        Intrinsics.j(line1, "line1");
        Intrinsics.j(postalCode, "postalCode");
        Intrinsics.j(region, "region");
        Intrinsics.j(town, "town");
        this.id = id2;
        this.country = country;
        this.isDefault = z10;
        this.line1 = line1;
        this.postalCode = postalCode;
        this.region = region;
        this.town = town;
    }

    @Override // ci.InterfaceC6393a
    /* renamed from: a, reason: from getter */
    public String getPostalCode() {
        return this.postalCode;
    }

    @Override // ci.InterfaceC6393a
    /* renamed from: b, reason: from getter */
    public String getTown() {
        return this.town;
    }

    @Override // ci.InterfaceC6393a
    /* renamed from: d, reason: from getter */
    public String getLine1() {
        return this.line1;
    }

    @Override // ci.InterfaceC6393a
    /* renamed from: e, reason: from getter */
    public Country getCountry() {
        return this.country;
    }

    @Override // ci.InterfaceC6393a
    public Region getRegion() {
        return this.region;
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.country.hashCode()) * 31) + Boolean.hashCode(this.isDefault)) * 31) + this.line1.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.region.hashCode()) * 31) + this.town.hashCode();
    }

    public String toString() {
        return "StoreAddress(id=" + this.id + ", country=" + this.country + ", isDefault=" + this.isDefault + ", line1=" + this.line1 + ", postalCode=" + this.postalCode + ", region=" + this.region + ", town=" + this.town + ')';
    }
}
