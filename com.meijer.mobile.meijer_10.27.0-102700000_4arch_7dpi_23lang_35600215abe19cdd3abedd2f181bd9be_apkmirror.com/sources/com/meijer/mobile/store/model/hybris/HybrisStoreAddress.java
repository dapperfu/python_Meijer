package com.meijer.mobile.store.model.hybris;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.meijer.mobile.address.model.hybris.HybrisCountry;
import com.meijer.mobile.address.model.hybris.HybrisRegion;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\f\b\u0001\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJZ\u0010\u0010\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u000b2\b\b\u0003\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001b\u001a\u0004\b\u001f\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001b\u001a\u0004\b#\u0010\u0013R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b$\u0010'R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b%\u0010\u0013¨\u0006("}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisStoreAddress;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", PreferencesHelper.PREF_ID, "Lcom/meijer/mobile/address/model/hybris/HybrisCountry;", PlaceTypes.COUNTRY, "", "isDefault", "line1", "postalCode", "Lcom/meijer/mobile/address/model/hybris/HybrisRegion;", "region", "town", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/address/model/hybris/HybrisCountry;ZLjava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/address/model/hybris/HybrisRegion;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Lcom/meijer/mobile/address/model/hybris/HybrisCountry;ZLjava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/address/model/hybris/HybrisRegion;Ljava/lang/String;)Lcom/meijer/mobile/store/model/hybris/HybrisStoreAddress;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/meijer/mobile/address/model/hybris/HybrisCountry;", "()Lcom/meijer/mobile/address/model/hybris/HybrisCountry;", "c", "Z", "g", "()Z", "d", "e", "f", "Lcom/meijer/mobile/address/model/hybris/HybrisRegion;", "()Lcom/meijer/mobile/address/model/hybris/HybrisRegion;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class HybrisStoreAddress {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisCountry country;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDefault;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String line1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisRegion region;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String town;

    public final HybrisStoreAddress copy(@g(name = PreferencesHelper.PREF_ID) String id2, @g(name = PlaceTypes.COUNTRY) HybrisCountry country, @g(name = "defaultAddress") boolean isDefault, @g(name = "line1") String line1, @g(name = "postalCode") String postalCode, @g(name = "region") HybrisRegion region, @g(name = "town") String town) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(country, "country");
        Intrinsics.j(line1, "line1");
        Intrinsics.j(postalCode, "postalCode");
        Intrinsics.j(region, "region");
        Intrinsics.j(town, "town");
        return new HybrisStoreAddress(id2, country, isDefault, line1, postalCode, region, town);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisStoreAddress)) {
            return false;
        }
        HybrisStoreAddress hybrisStoreAddress = (HybrisStoreAddress) other;
        return Intrinsics.e(this.id, hybrisStoreAddress.id) && Intrinsics.e(this.country, hybrisStoreAddress.country) && this.isDefault == hybrisStoreAddress.isDefault && Intrinsics.e(this.line1, hybrisStoreAddress.line1) && Intrinsics.e(this.postalCode, hybrisStoreAddress.postalCode) && Intrinsics.e(this.region, hybrisStoreAddress.region) && Intrinsics.e(this.town, hybrisStoreAddress.town);
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.country.hashCode()) * 31) + Boolean.hashCode(this.isDefault)) * 31) + this.line1.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.region.hashCode()) * 31) + this.town.hashCode();
    }

    public String toString() {
        return "HybrisStoreAddress(id=" + this.id + ", country=" + this.country + ", isDefault=" + this.isDefault + ", line1=" + this.line1 + ", postalCode=" + this.postalCode + ", region=" + this.region + ", town=" + this.town + ')';
    }

    public HybrisStoreAddress(@g(name = PreferencesHelper.PREF_ID) String id2, @g(name = PlaceTypes.COUNTRY) HybrisCountry country, @g(name = "defaultAddress") boolean z10, @g(name = "line1") String line1, @g(name = "postalCode") String postalCode, @g(name = "region") HybrisRegion region, @g(name = "town") String town) {
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

    /* renamed from: a, reason: from getter */
    public final HybrisCountry getCountry() {
        return this.country;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final String getLine1() {
        return this.line1;
    }

    /* renamed from: d, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: e, reason: from getter */
    public final HybrisRegion getRegion() {
        return this.region;
    }

    /* renamed from: f, reason: from getter */
    public final String getTown() {
        return this.town;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }
}
