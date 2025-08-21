package Th;

import Hh.a;
import Ik.Validation;
import androidx.recyclerview.widget.RecyclerView;
import bk.AbstractC6392a;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b,\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u008b\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\u00002\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0000H\u0016¢\u0006\u0004\b \u0010!J\u0094\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00132\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b=\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bA\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b2\u0010M\u001a\u0004\bN\u0010%R\u0017\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\bN\u0010M\u001a\u0004\bC\u0010%R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b.\u0010J\u001a\u0004\bO\u0010LR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b6\u0010P\u001a\u0004\bQ\u0010RR\u001f\u0010W\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190S8\u0006¢\u0006\f\n\u0004\bQ\u0010T\u001a\u0004\bU\u0010VR$\u0010Y\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010X0S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010V¨\u0006Z"}, d2 = {"LTh/a;", "", "LHh/a;", "", PreferencesHelper.PREF_ID, "LHh/a$c;", "firstName", "LHh/a$d;", "lastName", "LHh/a$f;", "streetAddress", "LHh/a$a;", "apartment", "LHh/a$b;", "city", "LHh/a$e;", "state", "LHh/a$g;", "zipCode", "", "isPrimaryAddress", "", "fullName", "addressLine", "isLoading", "Lbk/a;", "saveOrDeleteAddressErrorMessage", "<init>", "(JLHh/a$c;LHh/a$d;LHh/a$f;LHh/a$a;LHh/a$b;LHh/a$e;LHh/a$g;ZLjava/lang/String;Ljava/lang/String;ZLbk/a;)V", "field", "t", "(LHh/a;)LTh/a;", "u", "()LTh/a;", "e", "(JLHh/a$c;LHh/a$d;LHh/a$f;LHh/a$a;LHh/a$b;LHh/a$e;LHh/a$g;ZLjava/lang/String;Ljava/lang/String;ZLbk/a;)LTh/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "J", "l", "()J", "b", "LHh/a$c;", "j", "()LHh/a$c;", "c", "LHh/a$d;", "m", "()LHh/a$d;", "d", "LHh/a$f;", "p", "()LHh/a$f;", "LHh/a$a;", "h", "()LHh/a$a;", "f", "LHh/a$b;", "i", "()LHh/a$b;", "g", "LHh/a$e;", "o", "()LHh/a$e;", "LHh/a$g;", "q", "()LHh/a$g;", "Z", "s", "()Z", "Ljava/lang/String;", "k", "r", "Lbk/a;", "n", "()Lbk/a;", "", "Ljava/util/List;", "getFieldErrors", "()Ljava/util/List;", "fieldErrors", "LIk/b;", "validations", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Th.a, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class AddressDecorator implements Ik.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.FirstName firstName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.LastName lastName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.StreetAddress streetAddress;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.Apartment apartment;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.City city;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.State state;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final a.ZipCode zipCode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPrimaryAddress;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fullName;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a saveOrDeleteAddressErrorMessage;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final List<AbstractC6392a> fieldErrors;

    public AddressDecorator() {
        this(0L, null, null, null, null, null, null, null, false, null, null, false, null, 8191, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressDecorator)) {
            return false;
        }
        AddressDecorator addressDecorator = (AddressDecorator) other;
        return this.id == addressDecorator.id && Intrinsics.e(this.firstName, addressDecorator.firstName) && Intrinsics.e(this.lastName, addressDecorator.lastName) && Intrinsics.e(this.streetAddress, addressDecorator.streetAddress) && Intrinsics.e(this.apartment, addressDecorator.apartment) && Intrinsics.e(this.city, addressDecorator.city) && Intrinsics.e(this.state, addressDecorator.state) && Intrinsics.e(this.zipCode, addressDecorator.zipCode) && this.isPrimaryAddress == addressDecorator.isPrimaryAddress && Intrinsics.e(this.fullName, addressDecorator.fullName) && Intrinsics.e(this.addressLine, addressDecorator.addressLine) && this.isLoading == addressDecorator.isLoading && Intrinsics.e(this.saveOrDeleteAddressErrorMessage, addressDecorator.saveOrDeleteAddressErrorMessage);
    }

    public AddressDecorator(long j10, a.FirstName firstName, a.LastName lastName, a.StreetAddress streetAddress, a.Apartment apartment, a.City city, a.State state, a.ZipCode zipCode, boolean z10, String fullName, String addressLine, boolean z11, AbstractC6392a abstractC6392a) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
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
        this.streetAddress = streetAddress;
        this.apartment = apartment;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.isPrimaryAddress = z10;
        this.fullName = fullName;
        this.addressLine = addressLine;
        this.isLoading = z11;
        this.saveOrDeleteAddressErrorMessage = abstractC6392a;
        this.fieldErrors = CollectionsKt.p(firstName.b(), lastName.b(), streetAddress.b(), city.b(), state.b(), zipCode.b());
    }

    public static /* synthetic */ AddressDecorator f(AddressDecorator addressDecorator, long j10, a.FirstName cVar, a.LastName dVar, a.StreetAddress fVar, a.Apartment c0203a, a.City bVar, a.State eVar, a.ZipCode gVar, boolean z10, String str, String str2, boolean z11, AbstractC6392a abstractC6392a, int i10, Object obj) {
        return addressDecorator.e((i10 & 1) != 0 ? addressDecorator.id : j10, (i10 & 2) != 0 ? addressDecorator.firstName : cVar, (i10 & 4) != 0 ? addressDecorator.lastName : dVar, (i10 & 8) != 0 ? addressDecorator.streetAddress : fVar, (i10 & 16) != 0 ? addressDecorator.apartment : c0203a, (i10 & 32) != 0 ? addressDecorator.city : bVar, (i10 & 64) != 0 ? addressDecorator.state : eVar, (i10 & 128) != 0 ? addressDecorator.zipCode : gVar, (i10 & 256) != 0 ? addressDecorator.isPrimaryAddress : z10, (i10 & 512) != 0 ? addressDecorator.fullName : str, (i10 & 1024) != 0 ? addressDecorator.addressLine : str2, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? addressDecorator.isLoading : z11, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? addressDecorator.saveOrDeleteAddressErrorMessage : abstractC6392a);
    }

    @Override // Ik.a
    public List<Validation<? extends Object>> a() {
        return CollectionsKt.p(this.firstName.c(), this.lastName.c(), this.streetAddress.c(), this.city.c(), this.state.c(), this.zipCode.c());
    }

    public final AddressDecorator e(long id2, a.FirstName firstName, a.LastName lastName, a.StreetAddress streetAddress, a.Apartment apartment, a.City city, a.State state, a.ZipCode zipCode, boolean isPrimaryAddress, String fullName, String addressLine, boolean isLoading, AbstractC6392a saveOrDeleteAddressErrorMessage) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(streetAddress, "streetAddress");
        Intrinsics.j(apartment, "apartment");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zipCode, "zipCode");
        Intrinsics.j(fullName, "fullName");
        Intrinsics.j(addressLine, "addressLine");
        return new AddressDecorator(id2, firstName, lastName, streetAddress, apartment, city, state, zipCode, isPrimaryAddress, fullName, addressLine, isLoading, saveOrDeleteAddressErrorMessage);
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
        int iHashCode = ((((((((((((((((((((((Long.hashCode(this.id) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.streetAddress.hashCode()) * 31) + this.apartment.hashCode()) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zipCode.hashCode()) * 31) + Boolean.hashCode(this.isPrimaryAddress)) * 31) + this.fullName.hashCode()) * 31) + this.addressLine.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        AbstractC6392a abstractC6392a = this.saveOrDeleteAddressErrorMessage;
        return iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode());
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
    public final AbstractC6392a getSaveOrDeleteAddressErrorMessage() {
        return this.saveOrDeleteAddressErrorMessage;
    }

    /* renamed from: o, reason: from getter */
    public final a.State getState() {
        return this.state;
    }

    /* renamed from: p, reason: from getter */
    public final a.StreetAddress getStreetAddress() {
        return this.streetAddress;
    }

    /* renamed from: q, reason: from getter */
    public final a.ZipCode getZipCode() {
        return this.zipCode;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsPrimaryAddress() {
        return this.isPrimaryAddress;
    }

    public AddressDecorator t(Hh.a<?> field) {
        Intrinsics.j(field, "field");
        if (field instanceof a.FirstName) {
            return f(this, 0L, ((a.FirstName) field).f(), null, null, null, null, null, null, false, null, null, false, null, 8189, null);
        }
        if (field instanceof a.LastName) {
            return f(this, 0L, null, ((a.LastName) field).f(), null, null, null, null, null, false, null, null, false, null, 8187, null);
        }
        if (field instanceof a.StreetAddress) {
            return f(this, 0L, null, null, ((a.StreetAddress) field).f(), null, null, null, null, false, null, null, false, null, 8183, null);
        }
        if (field instanceof a.Apartment) {
            return f(this, 0L, null, null, null, ((a.Apartment) field).f(), null, null, null, false, null, null, false, null, 8175, null);
        }
        if (field instanceof a.City) {
            return f(this, 0L, null, null, null, null, ((a.City) field).f(), null, null, false, null, null, false, null, 8159, null);
        }
        if (field instanceof a.State) {
            return f(this, 0L, null, null, null, null, null, ((a.State) field).f(), null, false, null, null, false, null, 8127, null);
        }
        if (!(field instanceof a.ZipCode)) {
            throw new NoWhenBranchMatchedException();
        }
        a.ZipCode gVar = (a.ZipCode) field;
        return gVar.c().e().length() <= 5 ? f(this, 0L, null, null, null, null, null, null, gVar.f(), false, null, null, false, null, 8063, null) : f(this, 0L, null, null, null, null, null, null, this.zipCode.f(), false, null, null, false, null, 8063, null);
    }

    public String toString() {
        return "AddressDecorator(id=" + this.id + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", streetAddress=" + this.streetAddress + ", apartment=" + this.apartment + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", isPrimaryAddress=" + this.isPrimaryAddress + ", fullName=" + this.fullName + ", addressLine=" + this.addressLine + ", isLoading=" + this.isLoading + ", saveOrDeleteAddressErrorMessage=" + this.saveOrDeleteAddressErrorMessage + ')';
    }

    public AddressDecorator u() {
        return f(this, 0L, this.firstName.f(), this.lastName.f(), this.streetAddress.f(), null, this.city.f(), this.state.f(), this.zipCode.f(), false, null, null, false, null, 7953, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AddressDecorator(long j10, a.FirstName cVar, a.LastName dVar, a.StreetAddress fVar, a.Apartment c0203a, a.City bVar, a.State eVar, a.ZipCode gVar, boolean z10, String str, String str2, boolean z11, AbstractC6392a abstractC6392a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        a.FirstName cVar2;
        a.LastName dVar2;
        a.StreetAddress fVar2;
        a.Apartment c0203a2;
        a.City bVar2;
        a.State eVar2;
        a.ZipCode gVar2;
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
        int i11 = 1;
        if ((i10 & 2) != 0) {
            cVar2 = new a.FirstName(validation, i11, objArr14 == true ? 1 : 0);
        } else {
            cVar2 = cVar;
        }
        if ((i10 & 4) != 0) {
            dVar2 = new a.LastName(objArr13 == true ? 1 : 0, i11, objArr12 == true ? 1 : 0);
        } else {
            dVar2 = dVar;
        }
        if ((i10 & 8) != 0) {
            fVar2 = new a.StreetAddress(objArr11 == true ? 1 : 0, i11, objArr10 == true ? 1 : 0);
        } else {
            fVar2 = fVar;
        }
        if ((i10 & 16) != 0) {
            c0203a2 = new a.Apartment(objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, 3, objArr7 == true ? 1 : 0);
        } else {
            c0203a2 = c0203a;
        }
        if ((i10 & 32) != 0) {
            bVar2 = new a.City(objArr6 == true ? 1 : 0, i11, objArr5 == true ? 1 : 0);
        } else {
            bVar2 = bVar;
        }
        if ((i10 & 64) != 0) {
            eVar2 = new a.State(objArr4 == true ? 1 : 0, i11, objArr3 == true ? 1 : 0);
        } else {
            eVar2 = eVar;
        }
        if ((i10 & 128) != 0) {
            gVar2 = new a.ZipCode(objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
        } else {
            gVar2 = gVar;
        }
        this(j11, cVar2, dVar2, fVar2, c0203a2, bVar2, eVar2, gVar2, (i10 & 256) != 0 ? false : z10, (i10 & 512) != 0 ? "" : str, (i10 & 1024) == 0 ? str2 : "", (i10 & RecyclerView.m.FLAG_MOVED) == 0 ? z11 : false, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : abstractC6392a);
    }
}
