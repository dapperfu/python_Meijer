package di;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002Bí\u0001\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0014\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0080\u0002\u0010 \u001a\u00020\u00002\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\u0010\b\u0002\u0010\u0015\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00142\u0010\b\u0002\u0010\u0017\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u001c\u001a\u00020\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b(\u0010)R\u001f\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b-\u0010+\u001a\u0004\b.\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010#R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b2\u0010#R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010+\u001a\u0004\b5\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b7\u0010#R\u001a\u0010\f\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b1\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u0010+\u001a\u0004\b/\u0010#R\u001a\u0010\u000e\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b-\u0010#R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0011\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b*\u0010#R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010<\u001a\u0004\b3\u0010=R\"\u0010\u0015\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010+\u001a\u0004\b>\u0010#R\"\u0010\u0017\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b?\u0010+\u001a\u0004\b8\u0010#R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b0\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u001a\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b2\u0010@\u001a\u0004\bC\u0010BR\u001a\u0010\u001b\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\bE\u0010BR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\bA\u0010+\u001a\u0004\b?\u0010#¨\u0006F"}, d2 = {"Ldi/c;", "Ldi/a;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", PreferencesHelper.PREF_ID, "name", "title", "titleCode", "firstName", "lastName", "companyName", "line1", "line2", "town", "Ldi/f;", "region", "postalCode", "Ldi/b;", PlaceTypes.COUNTRY, "Lcom/meijer/mobile/core/model/common/PhoneNumber;", "phone", "Lcom/meijer/mobile/core/model/common/EmailAddress;", "email", "", "isShippingAddress", "isBillingAddress", "isDefault", "isVisibleInAddressBook", "state", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldi/f;Ljava/lang/String;Ldi/b;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)V", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldi/f;Ljava/lang/String;Ldi/b;Ljava/lang/String;Ljava/lang/String;ZZZZLjava/lang/String;)Ldi/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "k", "b", "m", "c", "p", "d", "q", "e", "j", "l", "g", "h", "i", "Ldi/f;", "getRegion", "()Ldi/f;", "Ldi/b;", "()Ldi/b;", "n", "o", "Z", "t", "()Z", "r", "s", "u", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: di.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class CustomerAddress implements InterfaceC13683a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String titleCode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String companyName;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String line1;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String line2;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String town;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final Region region;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final Country country;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phone;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShippingAddress;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isBillingAddress;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDefault;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVisibleInAddressBook;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String state;

    public CustomerAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String line1, String str8, String town, Region region, String postalCode, Country country, String str9, String str10, boolean z10, boolean z11, boolean z12, boolean z13, String str11) {
        Intrinsics.j(line1, "line1");
        Intrinsics.j(town, "town");
        Intrinsics.j(region, "region");
        Intrinsics.j(postalCode, "postalCode");
        Intrinsics.j(country, "country");
        this.id = str;
        this.name = str2;
        this.title = str3;
        this.titleCode = str4;
        this.firstName = str5;
        this.lastName = str6;
        this.companyName = str7;
        this.line1 = line1;
        this.line2 = str8;
        this.town = town;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = str9;
        this.email = str10;
        this.isShippingAddress = z10;
        this.isBillingAddress = z11;
        this.isDefault = z12;
        this.isVisibleInAddressBook = z13;
        this.state = str11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerAddress)) {
            return false;
        }
        CustomerAddress customerAddress = (CustomerAddress) other;
        return Intrinsics.e(this.id, customerAddress.id) && Intrinsics.e(this.name, customerAddress.name) && Intrinsics.e(this.title, customerAddress.title) && Intrinsics.e(this.titleCode, customerAddress.titleCode) && Intrinsics.e(this.firstName, customerAddress.firstName) && Intrinsics.e(this.lastName, customerAddress.lastName) && Intrinsics.e(this.companyName, customerAddress.companyName) && Intrinsics.e(this.line1, customerAddress.line1) && Intrinsics.e(this.line2, customerAddress.line2) && Intrinsics.e(this.town, customerAddress.town) && Intrinsics.e(this.region, customerAddress.region) && Intrinsics.e(this.postalCode, customerAddress.postalCode) && Intrinsics.e(this.country, customerAddress.country) && Intrinsics.e(this.phone, customerAddress.phone) && Intrinsics.e(this.email, customerAddress.email) && this.isShippingAddress == customerAddress.isShippingAddress && this.isBillingAddress == customerAddress.isBillingAddress && this.isDefault == customerAddress.isDefault && this.isVisibleInAddressBook == customerAddress.isVisibleInAddressBook && Intrinsics.e(this.state, customerAddress.state);
    }

    public static /* synthetic */ CustomerAddress g(CustomerAddress customerAddress, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Region region, String str11, Country country, String str12, String str13, boolean z10, boolean z11, boolean z12, boolean z13, String str14, int i10, Object obj) {
        String str15;
        boolean z14;
        String str16 = (i10 & 1) != 0 ? customerAddress.id : str;
        String str17 = (i10 & 2) != 0 ? customerAddress.name : str2;
        String str18 = (i10 & 4) != 0 ? customerAddress.title : str3;
        String str19 = (i10 & 8) != 0 ? customerAddress.titleCode : str4;
        String str20 = (i10 & 16) != 0 ? customerAddress.firstName : str5;
        String str21 = (i10 & 32) != 0 ? customerAddress.lastName : str6;
        String str22 = (i10 & 64) != 0 ? customerAddress.companyName : str7;
        String str23 = (i10 & 128) != 0 ? customerAddress.line1 : str8;
        String str24 = (i10 & 256) != 0 ? customerAddress.line2 : str9;
        String str25 = (i10 & 512) != 0 ? customerAddress.town : str10;
        Region region2 = (i10 & 1024) != 0 ? customerAddress.region : region;
        String str26 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? customerAddress.postalCode : str11;
        Country country2 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? customerAddress.country : country;
        String str27 = (i10 & 8192) != 0 ? customerAddress.phone : str12;
        String str28 = str16;
        String str29 = (i10 & 16384) != 0 ? customerAddress.email : str13;
        boolean z15 = (i10 & 32768) != 0 ? customerAddress.isShippingAddress : z10;
        boolean z16 = (i10 & 65536) != 0 ? customerAddress.isBillingAddress : z11;
        boolean z17 = (i10 & 131072) != 0 ? customerAddress.isDefault : z12;
        boolean z18 = (i10 & 262144) != 0 ? customerAddress.isVisibleInAddressBook : z13;
        if ((i10 & 524288) != 0) {
            z14 = z18;
            str15 = customerAddress.state;
        } else {
            str15 = str14;
            z14 = z18;
        }
        return customerAddress.f(str28, str17, str18, str19, str20, str21, str22, str23, str24, str25, region2, str26, country2, str27, str29, z15, z16, z17, z14, str15);
    }

    @Override // di.InterfaceC13683a
    /* renamed from: a, reason: from getter */
    public String getPostalCode() {
        return this.postalCode;
    }

    @Override // di.InterfaceC13683a
    /* renamed from: b, reason: from getter */
    public String getTown() {
        return this.town;
    }

    @Override // di.InterfaceC13683a
    /* renamed from: c, reason: from getter */
    public String getLine2() {
        return this.line2;
    }

    @Override // di.InterfaceC13683a
    /* renamed from: d, reason: from getter */
    public String getLine1() {
        return this.line1;
    }

    @Override // di.InterfaceC13683a
    /* renamed from: e, reason: from getter */
    public Country getCountry() {
        return this.country;
    }

    public final CustomerAddress f(String id2, String name, String title, String titleCode, String firstName, String lastName, String companyName, String line1, String line2, String town, Region region, String postalCode, Country country, String phone, String email, boolean isShippingAddress, boolean isBillingAddress, boolean isDefault, boolean isVisibleInAddressBook, String state) {
        Intrinsics.j(line1, "line1");
        Intrinsics.j(town, "town");
        Intrinsics.j(region, "region");
        Intrinsics.j(postalCode, "postalCode");
        Intrinsics.j(country, "country");
        return new CustomerAddress(id2, name, title, titleCode, firstName, lastName, companyName, line1, line2, town, region, postalCode, country, phone, email, isShippingAddress, isBillingAddress, isDefault, isVisibleInAddressBook, state);
    }

    @Override // di.InterfaceC13683a
    public Region getRegion() {
        return this.region;
    }

    /* renamed from: h, reason: from getter */
    public String getCompanyName() {
        return this.companyName;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.titleCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.firstName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.lastName;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.companyName;
        int iHashCode7 = (((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31) + this.line1.hashCode()) * 31;
        String str8 = this.line2;
        int iHashCode8 = (((((((((iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.town.hashCode()) * 31) + this.region.hashCode()) * 31) + this.postalCode.hashCode()) * 31) + this.country.hashCode()) * 31;
        String str9 = this.phone;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.email;
        int iHashCode10 = (((((((((iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31) + Boolean.hashCode(this.isShippingAddress)) * 31) + Boolean.hashCode(this.isBillingAddress)) * 31) + Boolean.hashCode(this.isDefault)) * 31) + Boolean.hashCode(this.isVisibleInAddressBook)) * 31;
        String str11 = this.state;
        return iHashCode10 + (str11 != null ? str11.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public String getEmail() {
        return this.email;
    }

    /* renamed from: j, reason: from getter */
    public String getFirstName() {
        return this.firstName;
    }

    /* renamed from: k, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: l, reason: from getter */
    public String getLastName() {
        return this.lastName;
    }

    /* renamed from: m, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: n, reason: from getter */
    public String getPhone() {
        return this.phone;
    }

    /* renamed from: o, reason: from getter */
    public String getState() {
        return this.state;
    }

    /* renamed from: p, reason: from getter */
    public String getTitle() {
        return this.title;
    }

    /* renamed from: q, reason: from getter */
    public String getTitleCode() {
        return this.titleCode;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsBillingAddress() {
        return this.isBillingAddress;
    }

    /* renamed from: s, reason: from getter */
    public boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsShippingAddress() {
        return this.isShippingAddress;
    }

    public String toString() {
        return "CustomerAddress(id=" + this.id + ", name=" + this.name + ", title=" + this.title + ", titleCode=" + this.titleCode + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", companyName=" + this.companyName + ", line1=" + this.line1 + ", line2=" + this.line2 + ", town=" + this.town + ", region=" + this.region + ", postalCode=" + this.postalCode + ", country=" + this.country + ", phone=" + this.phone + ", email=" + this.email + ", isShippingAddress=" + this.isShippingAddress + ", isBillingAddress=" + this.isBillingAddress + ", isDefault=" + this.isDefault + ", isVisibleInAddressBook=" + this.isVisibleInAddressBook + ", state=" + this.state + ')';
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsVisibleInAddressBook() {
        return this.isVisibleInAddressBook;
    }

    public /* synthetic */ CustomerAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Region region, String str11, Country country, String str12, String str13, boolean z10, boolean z11, boolean z12, boolean z13, String str14, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : str7, str8, (i10 & 256) != 0 ? null : str9, str10, region, str11, country, (i10 & 8192) != 0 ? null : str12, (i10 & 16384) != 0 ? null : str13, (32768 & i10) != 0 ? true : z10, (65536 & i10) != 0 ? false : z11, (131072 & i10) != 0 ? false : z12, (262144 & i10) != 0 ? false : z13, (i10 & 524288) != 0 ? null : str14);
    }
}
