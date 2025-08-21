package Yh;

import Ik.Validation;
import ai.AbstractC5692b;
import bk.AbstractC6392a;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B}\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u00002\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u0019J\u0086\u0001\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00112\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0018\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b,\u0010=R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b9\u0010;\u001a\u0004\b?\u0010=R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b*\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\bC\u0010;\u001a\u0004\bD\u0010=R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b<\u0010E\u001a\u0004\bC\u0010!R\u001f\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0F8\u0006¢\u0006\f\n\u0004\b.\u0010G\u001a\u0004\bH\u0010IR$\u0010L\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010K0F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010I¨\u0006M"}, d2 = {"LYh/b;", "", "Lai/b;", "Lai/b$b;", "firstName", "Lai/b$c;", "lastName", "Lai/b$d;", "phoneNumber", "Lai/b$e;", "zipCode", "Lai/b$a;", "birthDate", "Lbk/a;", "joinedYear", "errorMessage", "phoneConflictError", "", "isLoading", "loadingErrorMessage", "", "fullName", "<init>", "(Lai/b$b;Lai/b$c;Lai/b$d;Lai/b$e;Lai/b$a;Lbk/a;Lbk/a;Lbk/a;ZLbk/a;Ljava/lang/String;)V", "e", "()LYh/b;", "field", "r", "(Lai/b;)LYh/b;", "s", "f", "(Lai/b$b;Lai/b$c;Lai/b$d;Lai/b$e;Lai/b$a;Lbk/a;Lbk/a;Lbk/a;ZLbk/a;Ljava/lang/String;)LYh/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lai/b$b;", "i", "()Lai/b$b;", "b", "Lai/b$c;", "l", "()Lai/b$c;", "c", "Lai/b$d;", "o", "()Lai/b$d;", "d", "Lai/b$e;", "p", "()Lai/b$e;", "Lai/b$a;", "h", "()Lai/b$a;", "Lbk/a;", "k", "()Lbk/a;", "g", "n", "Z", "q", "()Z", "j", "m", "Ljava/lang/String;", "", "Ljava/util/List;", "getFieldErrors", "()Ljava/util/List;", "fieldErrors", "LIk/b;", "validations", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Yh.b, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class BasicInformationDecorator implements Ik.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5692b.FirstName firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5692b.LastName lastName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5692b.PhoneNumber phoneNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5692b.ZipCode zipCode;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5692b.BirthDate birthDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a joinedYear;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a errorMessage;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a phoneConflictError;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a loadingErrorMessage;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fullName;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<AbstractC6392a> fieldErrors;

    public BasicInformationDecorator() {
        this(null, null, null, null, null, null, null, null, false, null, null, 2047, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BasicInformationDecorator)) {
            return false;
        }
        BasicInformationDecorator basicInformationDecorator = (BasicInformationDecorator) other;
        return Intrinsics.e(this.firstName, basicInformationDecorator.firstName) && Intrinsics.e(this.lastName, basicInformationDecorator.lastName) && Intrinsics.e(this.phoneNumber, basicInformationDecorator.phoneNumber) && Intrinsics.e(this.zipCode, basicInformationDecorator.zipCode) && Intrinsics.e(this.birthDate, basicInformationDecorator.birthDate) && Intrinsics.e(this.joinedYear, basicInformationDecorator.joinedYear) && Intrinsics.e(this.errorMessage, basicInformationDecorator.errorMessage) && Intrinsics.e(this.phoneConflictError, basicInformationDecorator.phoneConflictError) && this.isLoading == basicInformationDecorator.isLoading && Intrinsics.e(this.loadingErrorMessage, basicInformationDecorator.loadingErrorMessage) && Intrinsics.e(this.fullName, basicInformationDecorator.fullName);
    }

    public BasicInformationDecorator(AbstractC5692b.FirstName firstName, AbstractC5692b.LastName lastName, AbstractC5692b.PhoneNumber phoneNumber, AbstractC5692b.ZipCode zipCode, AbstractC5692b.BirthDate birthDate, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, boolean z10, AbstractC6392a abstractC6392a4, String fullName) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(zipCode, "zipCode");
        Intrinsics.j(birthDate, "birthDate");
        Intrinsics.j(fullName, "fullName");
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.birthDate = birthDate;
        this.joinedYear = abstractC6392a;
        this.errorMessage = abstractC6392a2;
        this.phoneConflictError = abstractC6392a3;
        this.isLoading = z10;
        this.loadingErrorMessage = abstractC6392a4;
        this.fullName = fullName;
        this.fieldErrors = CollectionsKt.p(firstName.b(), lastName.b(), zipCode.b(), phoneNumber.b());
    }

    public static /* synthetic */ BasicInformationDecorator g(BasicInformationDecorator basicInformationDecorator, AbstractC5692b.FirstName c0952b, AbstractC5692b.LastName cVar, AbstractC5692b.PhoneNumber dVar, AbstractC5692b.ZipCode eVar, AbstractC5692b.BirthDate aVar, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, boolean z10, AbstractC6392a abstractC6392a4, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c0952b = basicInformationDecorator.firstName;
        }
        if ((i10 & 2) != 0) {
            cVar = basicInformationDecorator.lastName;
        }
        if ((i10 & 4) != 0) {
            dVar = basicInformationDecorator.phoneNumber;
        }
        if ((i10 & 8) != 0) {
            eVar = basicInformationDecorator.zipCode;
        }
        if ((i10 & 16) != 0) {
            aVar = basicInformationDecorator.birthDate;
        }
        if ((i10 & 32) != 0) {
            abstractC6392a = basicInformationDecorator.joinedYear;
        }
        if ((i10 & 64) != 0) {
            abstractC6392a2 = basicInformationDecorator.errorMessage;
        }
        if ((i10 & 128) != 0) {
            abstractC6392a3 = basicInformationDecorator.phoneConflictError;
        }
        if ((i10 & 256) != 0) {
            z10 = basicInformationDecorator.isLoading;
        }
        if ((i10 & 512) != 0) {
            abstractC6392a4 = basicInformationDecorator.loadingErrorMessage;
        }
        if ((i10 & 1024) != 0) {
            str = basicInformationDecorator.fullName;
        }
        AbstractC6392a abstractC6392a5 = abstractC6392a4;
        String str2 = str;
        AbstractC6392a abstractC6392a6 = abstractC6392a3;
        boolean z11 = z10;
        AbstractC6392a abstractC6392a7 = abstractC6392a;
        AbstractC6392a abstractC6392a8 = abstractC6392a2;
        AbstractC5692b.BirthDate aVar2 = aVar;
        AbstractC5692b.PhoneNumber dVar2 = dVar;
        return basicInformationDecorator.f(c0952b, cVar, dVar2, eVar, aVar2, abstractC6392a7, abstractC6392a8, abstractC6392a6, z11, abstractC6392a5, str2);
    }

    @Override // Ik.a
    public List<Validation<? extends Object>> a() {
        return CollectionsKt.p(this.firstName.c(), this.lastName.c(), this.phoneNumber.c(), this.zipCode.c(), this.birthDate.c());
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getErrorMessage() {
        return this.errorMessage;
    }

    public final BasicInformationDecorator e() {
        return g(this, null, null, null, null, null, null, null, null, false, null, c.c(this.firstName.c().e(), this.lastName.c().e()), 1023, null);
    }

    public final BasicInformationDecorator f(AbstractC5692b.FirstName firstName, AbstractC5692b.LastName lastName, AbstractC5692b.PhoneNumber phoneNumber, AbstractC5692b.ZipCode zipCode, AbstractC5692b.BirthDate birthDate, AbstractC6392a joinedYear, AbstractC6392a errorMessage, AbstractC6392a phoneConflictError, boolean isLoading, AbstractC6392a loadingErrorMessage, String fullName) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(zipCode, "zipCode");
        Intrinsics.j(birthDate, "birthDate");
        Intrinsics.j(fullName, "fullName");
        return new BasicInformationDecorator(firstName, lastName, phoneNumber, zipCode, birthDate, joinedYear, errorMessage, phoneConflictError, isLoading, loadingErrorMessage, fullName);
    }

    /* renamed from: h, reason: from getter */
    public final AbstractC5692b.BirthDate getBirthDate() {
        return this.birthDate;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.zipCode.hashCode()) * 31) + this.birthDate.hashCode()) * 31;
        AbstractC6392a abstractC6392a = this.joinedYear;
        int iHashCode2 = (iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
        AbstractC6392a abstractC6392a2 = this.errorMessage;
        int iHashCode3 = (iHashCode2 + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
        AbstractC6392a abstractC6392a3 = this.phoneConflictError;
        int iHashCode4 = (((iHashCode3 + (abstractC6392a3 == null ? 0 : abstractC6392a3.hashCode())) * 31) + Boolean.hashCode(this.isLoading)) * 31;
        AbstractC6392a abstractC6392a4 = this.loadingErrorMessage;
        return ((iHashCode4 + (abstractC6392a4 != null ? abstractC6392a4.hashCode() : 0)) * 31) + this.fullName.hashCode();
    }

    /* renamed from: i, reason: from getter */
    public final AbstractC5692b.FirstName getFirstName() {
        return this.firstName;
    }

    /* renamed from: j, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    /* renamed from: k, reason: from getter */
    public final AbstractC6392a getJoinedYear() {
        return this.joinedYear;
    }

    /* renamed from: l, reason: from getter */
    public final AbstractC5692b.LastName getLastName() {
        return this.lastName;
    }

    /* renamed from: m, reason: from getter */
    public final AbstractC6392a getLoadingErrorMessage() {
        return this.loadingErrorMessage;
    }

    /* renamed from: n, reason: from getter */
    public final AbstractC6392a getPhoneConflictError() {
        return this.phoneConflictError;
    }

    /* renamed from: o, reason: from getter */
    public final AbstractC5692b.PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: p, reason: from getter */
    public final AbstractC5692b.ZipCode getZipCode() {
        return this.zipCode;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public BasicInformationDecorator r(AbstractC5692b<?> field) {
        Intrinsics.j(field, "field");
        if (field instanceof AbstractC5692b.FirstName) {
            return g(this, ((AbstractC5692b.FirstName) field).f(), null, null, null, null, null, null, null, false, null, null, 2046, null).e();
        }
        if (field instanceof AbstractC5692b.LastName) {
            return g(this, null, ((AbstractC5692b.LastName) field).f(), null, null, null, null, null, null, false, null, null, 2045, null).e();
        }
        if (field instanceof AbstractC5692b.ZipCode) {
            AbstractC5692b.ZipCode eVar = (AbstractC5692b.ZipCode) field;
            return eVar.c().e().length() <= 5 ? g(this, null, null, null, eVar.f(), null, null, null, null, false, null, null, 2039, null).e() : s();
        }
        if (field instanceof AbstractC5692b.PhoneNumber) {
            AbstractC5692b.PhoneNumber dVar = (AbstractC5692b.PhoneNumber) field;
            return dVar.c().e().length() <= 10 ? g(this, null, null, dVar.f(), null, null, null, null, null, false, null, null, 2043, null).e() : s();
        }
        if (field instanceof AbstractC5692b.BirthDate) {
            return g(this, null, null, null, null, ((AbstractC5692b.BirthDate) field).f(), null, null, null, false, null, null, 2031, null).e();
        }
        throw new NoWhenBranchMatchedException();
    }

    public BasicInformationDecorator s() {
        return g(this, this.firstName.f(), this.lastName.f(), this.phoneNumber.f(), this.zipCode.f(), this.birthDate.f(), null, null, null, false, null, null, 2016, null);
    }

    public String toString() {
        return "BasicInformationDecorator(firstName=" + this.firstName + ", lastName=" + this.lastName + ", phoneNumber=" + this.phoneNumber + ", zipCode=" + this.zipCode + ", birthDate=" + this.birthDate + ", joinedYear=" + this.joinedYear + ", errorMessage=" + this.errorMessage + ", phoneConflictError=" + this.phoneConflictError + ", isLoading=" + this.isLoading + ", loadingErrorMessage=" + this.loadingErrorMessage + ", fullName=" + this.fullName + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ BasicInformationDecorator(AbstractC5692b.FirstName c0952b, AbstractC5692b.LastName cVar, AbstractC5692b.PhoneNumber dVar, AbstractC5692b.ZipCode eVar, AbstractC5692b.BirthDate aVar, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, AbstractC6392a abstractC6392a3, boolean z10, AbstractC6392a abstractC6392a4, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        int i11 = 1;
        c0952b = (i10 & 1) != 0 ? new AbstractC5692b.FirstName(null, i11, 0 == true ? 1 : 0) : c0952b;
        cVar = (i10 & 2) != 0 ? new AbstractC5692b.LastName(objArr8 == true ? 1 : 0, i11, objArr7 == true ? 1 : 0) : cVar;
        this(c0952b, cVar, (i10 & 4) != 0 ? new AbstractC5692b.PhoneNumber(objArr6 == true ? 1 : 0, i11, objArr5 == true ? 1 : 0) : dVar, (i10 & 8) != 0 ? new AbstractC5692b.ZipCode(objArr4 == true ? 1 : 0, i11, objArr3 == true ? 1 : 0) : eVar, (i10 & 16) != 0 ? new AbstractC5692b.BirthDate(objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0) : aVar, (i10 & 32) != 0 ? null : abstractC6392a, (i10 & 64) != 0 ? null : abstractC6392a2, (i10 & 128) != 0 ? null : abstractC6392a3, (i10 & 256) != 0 ? false : z10, (i10 & 512) != 0 ? null : abstractC6392a4, (i10 & 1024) != 0 ? c.c(c0952b.c().e(), cVar.c().e()) : str);
    }
}
