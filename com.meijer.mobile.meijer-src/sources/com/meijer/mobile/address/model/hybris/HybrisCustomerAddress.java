package com.meijer.mobile.address.model.hybris;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\n\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0002\u0012\u0010\b\u0003\u0010\u0011\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0010\u0012\u0010\b\u0003\u0010\u0013\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0003\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJè\u0001\u0010\u001d\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\n\u001a\u00020\u00022\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\b\b\u0003\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u000f\u001a\u00020\u00022\u0010\b\u0003\u0010\u0011\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00102\u0010\b\u0003\u0010\u0013\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00122\b\b\u0003\u0010\u0015\u001a\u00020\u00142\b\b\u0003\u0010\u0017\u001a\u00020\u00162\b\b\u0003\u0010\u0018\u001a\u00020\u00162\b\b\u0003\u0010\u0019\u001a\u00020\u00162\b\b\u0003\u0010\u001a\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00162\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010 R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b/\u0010(\u001a\u0004\b0\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010(\u001a\u0004\b*\u0010 R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b1\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b2\u0010 R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010(\u001a\u0004\b8\u0010 R\u001f\u0010\u0011\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00108\u0006¢\u0006\f\n\u0004\b6\u0010(\u001a\u0004\b4\u0010 R\u001f\u0010\u0013\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00128\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b.\u0010 R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b-\u00109\u001a\u0004\b,\u0010:R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b3\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0018\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b>\u0010=R\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b?\u0010;\u001a\u0004\b?\u0010=R\u0017\u0010\u001a\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b<\u0010;\u001a\u0004\b@\u0010=¨\u0006A"}, d2 = {"Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", PreferencesHelper.PREF_ID, "title", "titleCode", "firstName", "lastName", "companyName", "line1", "line2", "town", "Lcom/meijer/mobile/address/model/hybris/HybrisRegion;", "region", "postalCode", "Lcom/meijer/mobile/core/model/common/PhoneNumber;", "phone", "Lcom/meijer/mobile/core/model/common/EmailAddress;", "email", "Lcom/meijer/mobile/address/model/hybris/HybrisCountry;", PlaceTypes.COUNTRY, "", "isShippingAddress", "isBillingAddress", "isDefault", "isVisibleInAddressBook", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/address/model/hybris/HybrisRegion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/address/model/hybris/HybrisCountry;ZZZZ)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/address/model/hybris/HybrisRegion;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/meijer/mobile/address/model/hybris/HybrisCountry;ZZZZ)Lcom/meijer/mobile/address/model/hybris/HybrisCustomerAddress;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "m", "c", "n", "d", "e", "g", "h", "i", "o", "j", "Lcom/meijer/mobile/address/model/hybris/HybrisRegion;", "l", "()Lcom/meijer/mobile/address/model/hybris/HybrisRegion;", "k", "Lcom/meijer/mobile/address/model/hybris/HybrisCountry;", "()Lcom/meijer/mobile/address/model/hybris/HybrisCountry;", "Z", "r", "()Z", "p", "q", "s", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HybrisCustomerAddress {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String titleCode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String companyName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String line1;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String line2;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String town;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisRegion region;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final HybrisCountry country;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShippingAddress;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBillingAddress;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDefault;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVisibleInAddressBook;

    public HybrisCustomerAddress(@g(name = PreferencesHelper.PREF_ID) String str, @g(name = "title") String str2, @g(name = "titleCode") String str3, @g(name = "firstName") String str4, @g(name = "lastName") String str5, @g(name = "companyName") String str6, @g(name = "line1") String line1, @g(name = "line2") String str7, @g(name = "town") String town, @g(name = "region") HybrisRegion region, @g(name = "postalCode") String postalCode, @g(name = "phone") String str8, @g(name = "email") String str9, @g(name = PlaceTypes.COUNTRY) HybrisCountry country, @g(name = "shippingAddress") boolean z10, @g(name = "billingAddress") boolean z11, @g(name = "defaultAddress") boolean z12, @g(name = "visibleInAddressBook") boolean z13) {
        Intrinsics.j(line1, "line1");
        Intrinsics.j(town, "town");
        Intrinsics.j(region, "region");
        Intrinsics.j(postalCode, "postalCode");
        Intrinsics.j(country, "country");
        this.id = str;
        this.title = str2;
        this.titleCode = str3;
        this.firstName = str4;
        this.lastName = str5;
        this.companyName = str6;
        this.line1 = line1;
        this.line2 = str7;
        this.town = town;
        this.region = region;
        this.postalCode = postalCode;
        this.phone = str8;
        this.email = str9;
        this.country = country;
        this.isShippingAddress = z10;
        this.isBillingAddress = z11;
        this.isDefault = z12;
        this.isVisibleInAddressBook = z13;
    }

    public static /* synthetic */ HybrisCustomerAddress a(HybrisCustomerAddress hybrisCustomerAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, HybrisRegion hybrisRegion, String str10, String str11, String str12, HybrisCountry hybrisCountry, boolean z10, boolean z11, boolean z12, boolean z13, int i10, Object obj) {
        boolean z14;
        boolean z15;
        String str13 = (i10 & 1) != 0 ? hybrisCustomerAddress.id : str;
        String str14 = (i10 & 2) != 0 ? hybrisCustomerAddress.title : str2;
        String str15 = (i10 & 4) != 0 ? hybrisCustomerAddress.titleCode : str3;
        String str16 = (i10 & 8) != 0 ? hybrisCustomerAddress.firstName : str4;
        String str17 = (i10 & 16) != 0 ? hybrisCustomerAddress.lastName : str5;
        String str18 = (i10 & 32) != 0 ? hybrisCustomerAddress.companyName : str6;
        String str19 = (i10 & 64) != 0 ? hybrisCustomerAddress.line1 : str7;
        String str20 = (i10 & 128) != 0 ? hybrisCustomerAddress.line2 : str8;
        String str21 = (i10 & 256) != 0 ? hybrisCustomerAddress.town : str9;
        HybrisRegion hybrisRegion2 = (i10 & 512) != 0 ? hybrisCustomerAddress.region : hybrisRegion;
        String str22 = (i10 & 1024) != 0 ? hybrisCustomerAddress.postalCode : str10;
        String str23 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? hybrisCustomerAddress.phone : str11;
        String str24 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? hybrisCustomerAddress.email : str12;
        HybrisCountry hybrisCountry2 = (i10 & 8192) != 0 ? hybrisCustomerAddress.country : hybrisCountry;
        String str25 = str13;
        boolean z16 = (i10 & 16384) != 0 ? hybrisCustomerAddress.isShippingAddress : z10;
        boolean z17 = (i10 & 32768) != 0 ? hybrisCustomerAddress.isBillingAddress : z11;
        boolean z18 = (i10 & 65536) != 0 ? hybrisCustomerAddress.isDefault : z12;
        if ((i10 & 131072) != 0) {
            z15 = z18;
            z14 = hybrisCustomerAddress.isVisibleInAddressBook;
        } else {
            z14 = z13;
            z15 = z18;
        }
        return hybrisCustomerAddress.copy(str25, str14, str15, str16, str17, str18, str19, str20, str21, hybrisRegion2, str22, str23, str24, hybrisCountry2, z16, z17, z15, z14);
    }

    public final HybrisCustomerAddress copy(@g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "title") String title, @g(name = "titleCode") String titleCode, @g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "companyName") String companyName, @g(name = "line1") String line1, @g(name = "line2") String line2, @g(name = "town") String town, @g(name = "region") HybrisRegion region, @g(name = "postalCode") String postalCode, @g(name = "phone") String phone, @g(name = "email") String email, @g(name = PlaceTypes.COUNTRY) HybrisCountry country, @g(name = "shippingAddress") boolean isShippingAddress, @g(name = "billingAddress") boolean isBillingAddress, @g(name = "defaultAddress") boolean isDefault, @g(name = "visibleInAddressBook") boolean isVisibleInAddressBook) {
        Intrinsics.j(line1, "line1");
        Intrinsics.j(town, "town");
        Intrinsics.j(region, "region");
        Intrinsics.j(postalCode, "postalCode");
        Intrinsics.j(country, "country");
        return new HybrisCustomerAddress(id2, title, titleCode, firstName, lastName, companyName, line1, line2, town, region, postalCode, phone, email, country, isShippingAddress, isBillingAddress, isDefault, isVisibleInAddressBook);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisCustomerAddress)) {
            return false;
        }
        HybrisCustomerAddress hybrisCustomerAddress = (HybrisCustomerAddress) other;
        return Intrinsics.e(this.id, hybrisCustomerAddress.id) && Intrinsics.e(this.title, hybrisCustomerAddress.title) && Intrinsics.e(this.titleCode, hybrisCustomerAddress.titleCode) && Intrinsics.e(this.firstName, hybrisCustomerAddress.firstName) && Intrinsics.e(this.lastName, hybrisCustomerAddress.lastName) && Intrinsics.e(this.companyName, hybrisCustomerAddress.companyName) && Intrinsics.e(this.line1, hybrisCustomerAddress.line1) && Intrinsics.e(this.line2, hybrisCustomerAddress.line2) && Intrinsics.e(this.town, hybrisCustomerAddress.town) && Intrinsics.e(this.region, hybrisCustomerAddress.region) && Intrinsics.e(this.postalCode, hybrisCustomerAddress.postalCode) && Intrinsics.e(this.phone, hybrisCustomerAddress.phone) && Intrinsics.e(this.email, hybrisCustomerAddress.email) && Intrinsics.e(this.country, hybrisCustomerAddress.country) && this.isShippingAddress == hybrisCustomerAddress.isShippingAddress && this.isBillingAddress == hybrisCustomerAddress.isBillingAddress && this.isDefault == hybrisCustomerAddress.isDefault && this.isVisibleInAddressBook == hybrisCustomerAddress.isVisibleInAddressBook;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.titleCode;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.firstName;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.lastName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.companyName;
        int iHashCode6 = (((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.line1.hashCode()) * 31;
        String str7 = this.line2;
        int iHashCode7 = (((((((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.town.hashCode()) * 31) + this.region.hashCode()) * 31) + this.postalCode.hashCode()) * 31;
        String str8 = this.phone;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.email;
        return ((((((((((iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31) + this.country.hashCode()) * 31) + Boolean.hashCode(this.isShippingAddress)) * 31) + Boolean.hashCode(this.isBillingAddress)) * 31) + Boolean.hashCode(this.isDefault)) * 31) + Boolean.hashCode(this.isVisibleInAddressBook);
    }

    public String toString() {
        return "HybrisCustomerAddress(id=" + this.id + ", title=" + this.title + ", titleCode=" + this.titleCode + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", companyName=" + this.companyName + ", line1=" + this.line1 + ", line2=" + this.line2 + ", town=" + this.town + ", region=" + this.region + ", postalCode=" + this.postalCode + ", phone=" + this.phone + ", email=" + this.email + ", country=" + this.country + ", isShippingAddress=" + this.isShippingAddress + ", isBillingAddress=" + this.isBillingAddress + ", isDefault=" + this.isDefault + ", isVisibleInAddressBook=" + this.isVisibleInAddressBook + ')';
    }

    /* renamed from: b, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    /* renamed from: c, reason: from getter */
    public final HybrisCountry getCountry() {
        return this.country;
    }

    /* renamed from: d, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: e, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: g, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: h, reason: from getter */
    public final String getLine1() {
        return this.line1;
    }

    /* renamed from: i, reason: from getter */
    public final String getLine2() {
        return this.line2;
    }

    /* renamed from: j, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* renamed from: k, reason: from getter */
    public final String getPostalCode() {
        return this.postalCode;
    }

    /* renamed from: l, reason: from getter */
    public final HybrisRegion getRegion() {
        return this.region;
    }

    /* renamed from: m, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: n, reason: from getter */
    public final String getTitleCode() {
        return this.titleCode;
    }

    /* renamed from: o, reason: from getter */
    public final String getTown() {
        return this.town;
    }

    /* renamed from: p, reason: from getter */
    public final boolean getIsBillingAddress() {
        return this.isBillingAddress;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsShippingAddress() {
        return this.isShippingAddress;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsVisibleInAddressBook() {
        return this.isVisibleInAddressBook;
    }

    public /* synthetic */ HybrisCustomerAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, HybrisRegion hybrisRegion, String str10, String str11, String str12, HybrisCountry hybrisCountry, boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, str7, (i10 & 128) != 0 ? null : str8, str9, hybrisRegion, str10, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str11, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str12, hybrisCountry, (i10 & 16384) != 0 ? true : z10, (32768 & i10) != 0 ? false : z11, (65536 & i10) != 0 ? false : z12, (i10 & 131072) != 0 ? false : z13);
    }
}
