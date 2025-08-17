package Sh;

import Gh.a;
import Hk.Validation;
import ak.AbstractC5607a;
import androidx.recyclerview.widget.RecyclerView;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b/\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0095\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010 \u001a\u00020\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\"\u0010#J\u009e\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00152\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u00152\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010>\u001a\u0004\b?\u0010@R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\bC\u0010I\u001a\u0004\bJ\u0010KR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bG\u0010L\u001a\u0004\bM\u0010NR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b4\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bR\u0010'R\u0017\u0010\u0019\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b0\u0010S\u001a\u0004\bE\u0010'R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b8\u0010O\u001a\u0004\bT\u0010QR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b<\u0010U\u001a\u0004\bV\u0010WR\u001f\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0X8\u0006¢\u0006\f\n\u0004\bV\u0010Y\u001a\u0004\bZ\u0010[R$\u0010^\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010]0X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010[¨\u0006_"}, d2 = {"LSh/a;", "", "LGh/a;", "", PreferencesHelper.PREF_ID, "LGh/a$c;", "firstName", "LGh/a$d;", "lastName", "LGh/a$e;", "phoneNumber", "LGh/a$g;", "streetAddress", "LGh/a$a;", "apartment", "LGh/a$b;", "city", "LGh/a$f;", "state", "LGh/a$h;", "zipCode", "", "isPrimaryAddress", "", "fullName", "addressLine", "isLoading", "Lak/a;", "saveOrDeleteAddressErrorMessage", "<init>", "(JLGh/a$c;LGh/a$d;LGh/a$e;LGh/a$g;LGh/a$a;LGh/a$b;LGh/a$f;LGh/a$h;ZLjava/lang/String;Ljava/lang/String;ZLak/a;)V", "field", "u", "(LGh/a;)LSh/a;", "v", "()LSh/a;", "e", "(JLGh/a$c;LGh/a$d;LGh/a$e;LGh/a$g;LGh/a$a;LGh/a$b;LGh/a$f;LGh/a$h;ZLjava/lang/String;Ljava/lang/String;ZLak/a;)LSh/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "l", "()J", "b", "LGh/a$c;", "j", "()LGh/a$c;", "c", "LGh/a$d;", "m", "()LGh/a$d;", "d", "LGh/a$e;", "n", "()LGh/a$e;", "LGh/a$g;", "q", "()LGh/a$g;", "f", "LGh/a$a;", "h", "()LGh/a$a;", "g", "LGh/a$b;", "i", "()LGh/a$b;", "LGh/a$f;", "p", "()LGh/a$f;", "LGh/a$h;", "r", "()LGh/a$h;", "Z", "t", "()Z", "k", "Ljava/lang/String;", "s", "Lak/a;", "o", "()Lak/a;", "", "Ljava/util/List;", "getFieldErrors", "()Ljava/util/List;", "fieldErrors", "LHk/b;", "validations", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Sh.a, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class AddressDecorator implements Hk.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.FirstName firstName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.LastName lastName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.PhoneNumber phoneNumber;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.StreetAddress streetAddress;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.Apartment apartment;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.City city;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.State state;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.ZipCode zipCode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPrimaryAddress;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fullName;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a saveOrDeleteAddressErrorMessage;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final List<AbstractC5607a> fieldErrors;

    public AddressDecorator() {
        this(0L, null, null, null, null, null, null, null, null, false, null, null, false, null, 16383, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressDecorator)) {
            return false;
        }
        AddressDecorator addressDecorator = (AddressDecorator) other;
        return this.id == addressDecorator.id && Intrinsics.e(this.firstName, addressDecorator.firstName) && Intrinsics.e(this.lastName, addressDecorator.lastName) && Intrinsics.e(this.phoneNumber, addressDecorator.phoneNumber) && Intrinsics.e(this.streetAddress, addressDecorator.streetAddress) && Intrinsics.e(this.apartment, addressDecorator.apartment) && Intrinsics.e(this.city, addressDecorator.city) && Intrinsics.e(this.state, addressDecorator.state) && Intrinsics.e(this.zipCode, addressDecorator.zipCode) && this.isPrimaryAddress == addressDecorator.isPrimaryAddress && Intrinsics.e(this.fullName, addressDecorator.fullName) && Intrinsics.e(this.addressLine, addressDecorator.addressLine) && this.isLoading == addressDecorator.isLoading && Intrinsics.e(this.saveOrDeleteAddressErrorMessage, addressDecorator.saveOrDeleteAddressErrorMessage);
    }

    public AddressDecorator(long j10, a.FirstName firstName, a.LastName lastName, a.PhoneNumber phoneNumber, a.StreetAddress streetAddress, a.Apartment apartment, a.City city, a.State state, a.ZipCode zipCode, boolean z10, String fullName, String addressLine, boolean z11, AbstractC5607a abstractC5607a) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(streetAddress, "streetAddress");
        Intrinsics.j(apartment, "apartment");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zipCode, "zipCode");
        Intrinsics.j(fullName, "fullName");
        Intrinsics.j(addressLine, "addressLine");
        this.id = j10;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.streetAddress = streetAddress;
        this.apartment = apartment;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.isPrimaryAddress = z10;
        this.fullName = fullName;
        this.addressLine = addressLine;
        this.isLoading = z11;
        this.saveOrDeleteAddressErrorMessage = abstractC5607a;
        this.fieldErrors = CollectionsKt.p(firstName.b(), lastName.b(), phoneNumber.b(), streetAddress.b(), city.b(), state.b(), zipCode.b());
    }

    public static /* synthetic */ AddressDecorator f(AddressDecorator addressDecorator, long j10, a.FirstName cVar, a.LastName dVar, a.PhoneNumber eVar, a.StreetAddress gVar, a.Apartment c0163a, a.City bVar, a.State fVar, a.ZipCode hVar, boolean z10, String str, String str2, boolean z11, AbstractC5607a abstractC5607a, int i10, Object obj) {
        return addressDecorator.e((i10 & 1) != 0 ? addressDecorator.id : j10, (i10 & 2) != 0 ? addressDecorator.firstName : cVar, (i10 & 4) != 0 ? addressDecorator.lastName : dVar, (i10 & 8) != 0 ? addressDecorator.phoneNumber : eVar, (i10 & 16) != 0 ? addressDecorator.streetAddress : gVar, (i10 & 32) != 0 ? addressDecorator.apartment : c0163a, (i10 & 64) != 0 ? addressDecorator.city : bVar, (i10 & 128) != 0 ? addressDecorator.state : fVar, (i10 & 256) != 0 ? addressDecorator.zipCode : hVar, (i10 & 512) != 0 ? addressDecorator.isPrimaryAddress : z10, (i10 & 1024) != 0 ? addressDecorator.fullName : str, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? addressDecorator.addressLine : str2, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? addressDecorator.isLoading : z11, (i10 & 8192) != 0 ? addressDecorator.saveOrDeleteAddressErrorMessage : abstractC5607a);
    }

    @Override // Hk.a
    public List<Validation<? extends Object>> a() {
        return CollectionsKt.p(this.firstName.c(), this.lastName.c(), this.phoneNumber.c(), this.streetAddress.c(), this.city.c(), this.state.c(), this.zipCode.c());
    }

    public final AddressDecorator e(long id2, a.FirstName firstName, a.LastName lastName, a.PhoneNumber phoneNumber, a.StreetAddress streetAddress, a.Apartment apartment, a.City city, a.State state, a.ZipCode zipCode, boolean isPrimaryAddress, String fullName, String addressLine, boolean isLoading, AbstractC5607a saveOrDeleteAddressErrorMessage) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(streetAddress, "streetAddress");
        Intrinsics.j(apartment, "apartment");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zipCode, "zipCode");
        Intrinsics.j(fullName, "fullName");
        Intrinsics.j(addressLine, "addressLine");
        return new AddressDecorator(id2, firstName, lastName, phoneNumber, streetAddress, apartment, city, state, zipCode, isPrimaryAddress, fullName, addressLine, isLoading, saveOrDeleteAddressErrorMessage);
    }

    /* renamed from: g, reason: from getter */
    public final String getAddressLine() {
        return this.addressLine;
    }

    /* renamed from: h, reason: from getter */
    public final a.Apartment getApartment() {
        return this.apartment;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((Long.hashCode(this.id) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.streetAddress.hashCode()) * 31) + this.apartment.hashCode()) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zipCode.hashCode()) * 31) + Boolean.hashCode(this.isPrimaryAddress)) * 31) + this.fullName.hashCode()) * 31) + this.addressLine.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        AbstractC5607a abstractC5607a = this.saveOrDeleteAddressErrorMessage;
        return iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode());
    }

    /* renamed from: i, reason: from getter */
    public final a.City getCity() {
        return this.city;
    }

    /* renamed from: j, reason: from getter */
    public final a.FirstName getFirstName() {
        return this.firstName;
    }

    /* renamed from: k, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: l, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: m, reason: from getter */
    public final a.LastName getLastName() {
        return this.lastName;
    }

    /* renamed from: n, reason: from getter */
    public final a.PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: o, reason: from getter */
    public final AbstractC5607a getSaveOrDeleteAddressErrorMessage() {
        return this.saveOrDeleteAddressErrorMessage;
    }

    /* renamed from: p, reason: from getter */
    public final a.State getState() {
        return this.state;
    }

    /* renamed from: q, reason: from getter */
    public final a.StreetAddress getStreetAddress() {
        return this.streetAddress;
    }

    /* renamed from: r, reason: from getter */
    public final a.ZipCode getZipCode() {
        return this.zipCode;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsPrimaryAddress() {
        return this.isPrimaryAddress;
    }

    public String toString() {
        return "AddressDecorator(id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", phoneNumber=" + this.phoneNumber + ", streetAddress=" + this.streetAddress + ", apartment=" + this.apartment + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", isPrimaryAddress=" + this.isPrimaryAddress + ", fullName=" + this.fullName + ", addressLine=" + this.addressLine + ", isLoading=" + this.isLoading + ", saveOrDeleteAddressErrorMessage=" + this.saveOrDeleteAddressErrorMessage + ')';
    }

    public AddressDecorator u(Gh.a<?> field) {
        Intrinsics.j(field, "field");
        if (field instanceof a.FirstName) {
            return f(this, 0L, ((a.FirstName) field).f(), null, null, null, null, null, null, null, false, null, null, false, null, 16381, null);
        }
        if (field instanceof a.LastName) {
            return f(this, 0L, null, ((a.LastName) field).f(), null, null, null, null, null, null, false, null, null, false, null, 16379, null);
        }
        if (field instanceof a.PhoneNumber) {
            a.PhoneNumber eVar = (a.PhoneNumber) field;
            return eVar.c().e().length() <= 10 ? f(this, 0L, null, null, eVar.f(), null, null, null, null, null, false, null, null, false, null, 16375, null) : f(this, 0L, null, null, this.phoneNumber.f(), null, null, null, null, null, false, null, null, false, null, 16375, null);
        }
        if (field instanceof a.StreetAddress) {
            return f(this, 0L, null, null, null, ((a.StreetAddress) field).f(), null, null, null, null, false, null, null, false, null, 16367, null);
        }
        if (field instanceof a.Apartment) {
            return f(this, 0L, null, null, null, null, ((a.Apartment) field).f(), null, null, null, false, null, null, false, null, 16351, null);
        }
        if (field instanceof a.City) {
            return f(this, 0L, null, null, null, null, null, ((a.City) field).f(), null, null, false, null, null, false, null, 16319, null);
        }
        if (field instanceof a.State) {
            return f(this, 0L, null, null, null, null, null, null, ((a.State) field).f(), null, false, null, null, false, null, 16255, null);
        }
        if (!(field instanceof a.ZipCode)) {
            throw new NoWhenBranchMatchedException();
        }
        a.ZipCode hVar = (a.ZipCode) field;
        return hVar.c().e().length() <= 5 ? f(this, 0L, null, null, null, null, null, null, null, hVar.f(), false, null, null, false, null, 16127, null) : f(this, 0L, null, null, null, null, null, null, null, this.zipCode.f(), false, null, null, false, null, 16127, null);
    }

    public AddressDecorator v() {
        return f(this, 0L, this.firstName.f(), this.lastName.f(), this.phoneNumber.f(), this.streetAddress.f(), null, this.city.f(), this.state.f(), this.zipCode.f(), false, null, null, false, null, 15905, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AddressDecorator(long j10, a.FirstName cVar, a.LastName dVar, a.PhoneNumber eVar, a.StreetAddress gVar, a.Apartment c0163a, a.City bVar, a.State fVar, a.ZipCode hVar, boolean z10, String str, String str2, boolean z11, AbstractC5607a abstractC5607a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        a.FirstName cVar2;
        a.LastName dVar2;
        a.PhoneNumber eVar2;
        a.StreetAddress gVar2;
        a.Apartment c0163a2;
        a.City bVar2;
        a.State fVar2;
        a.ZipCode hVar2;
        long j11 = (i10 & 1) != 0 ? 0L : j10;
        Validation validation = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object[] objArr11 = 0;
        Object[] objArr12 = 0;
        Object[] objArr13 = 0;
        Object[] objArr14 = 0;
        Object[] objArr15 = 0;
        Object[] objArr16 = 0;
        int i11 = 1;
        if ((i10 & 2) != 0) {
            cVar2 = new a.FirstName(validation, i11, objArr16 == true ? 1 : 0);
        } else {
            cVar2 = cVar;
        }
        if ((i10 & 4) != 0) {
            dVar2 = new a.LastName(objArr15 == true ? 1 : 0, i11, objArr14 == true ? 1 : 0);
        } else {
            dVar2 = dVar;
        }
        if ((i10 & 8) != 0) {
            eVar2 = new a.PhoneNumber(objArr13 == true ? 1 : 0, i11, objArr12 == true ? 1 : 0);
        } else {
            eVar2 = eVar;
        }
        if ((i10 & 16) != 0) {
            gVar2 = new a.StreetAddress(objArr11 == true ? 1 : 0, i11, objArr10 == true ? 1 : 0);
        } else {
            gVar2 = gVar;
        }
        if ((i10 & 32) != 0) {
            c0163a2 = new a.Apartment(objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, 3, objArr7 == true ? 1 : 0);
        } else {
            c0163a2 = c0163a;
        }
        if ((i10 & 64) != 0) {
            bVar2 = new a.City(objArr6 == true ? 1 : 0, i11, objArr5 == true ? 1 : 0);
        } else {
            bVar2 = bVar;
        }
        if ((i10 & 128) != 0) {
            fVar2 = new a.State(objArr4 == true ? 1 : 0, i11, objArr3 == true ? 1 : 0);
        } else {
            fVar2 = fVar;
        }
        if ((i10 & 256) != 0) {
            hVar2 = new a.ZipCode(objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
        } else {
            hVar2 = hVar;
        }
        this(j11, cVar2, dVar2, eVar2, gVar2, c0163a2, bVar2, fVar2, hVar2, (i10 & 512) != 0 ? false : z10, (i10 & 1024) != 0 ? "" : str, (i10 & RecyclerView.m.FLAG_MOVED) == 0 ? str2 : "", (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? z11 : false, (i10 & 8192) != 0 ? null : abstractC5607a);
    }
}
