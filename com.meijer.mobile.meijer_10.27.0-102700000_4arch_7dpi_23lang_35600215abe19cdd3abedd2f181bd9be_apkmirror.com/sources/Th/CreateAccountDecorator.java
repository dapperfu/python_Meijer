package Th;

import Hk.Validation;
import Ih.y;
import Th.b;
import Th.c;
import Zh.c;
import ak.AbstractC5607a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0099\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010!\u001a\u00020\u00002\n\u0010 \u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b!\u0010\"J¢\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001aHÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\u001a2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010>\u001a\u0004\b?\u0010@R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b8\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b0\u0010P\u001a\u0004\bI\u0010QR\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b4\u0010R\u001a\u0004\bE\u0010SR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bK\u0010T\u001a\u0004\bU\u0010VR\u0017\u0010\u001c\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b<\u0010T\u001a\u0004\bW\u0010VR\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bC\u0010T\u001a\u0004\bX\u0010VR\u001f\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010Y0\r8\u0006¢\u0006\f\n\u0004\b?\u0010B\u001a\u0004\bZ\u0010DR\u0017\u0010]\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\bG\u0010T\u001a\u0004\b\\\u0010VR$\u0010_\u001a\u0012\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010^0\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010D¨\u0006`"}, d2 = {"LTh/d;", "", "LZh/c;", "LZh/c$b;", "firstName", "LZh/c$c;", "lastName", "LZh/c$a;", "email", "LZh/c$e;", "password", "LIh/y$b;", "passwordStrength", "", "LIh/y$a;", "passwordRules", "LZh/c$f;", "phoneNumber", "LZh/c$d;", "mPerksPin", "LZh/c$g;", "zipCode", "LTh/c;", "bottomSheetDecorator", "LTh/b;", "bannerDecorator", "", "isWeeklyAdChecked", "isTextMarketingChecked", "isHomeStoreSet", "<init>", "(LZh/c$b;LZh/c$c;LZh/c$a;LZh/c$e;LIh/y$b;Ljava/util/List;LZh/c$f;LZh/c$d;LZh/c$g;LTh/c;LTh/b;ZZZ)V", "field", "v", "(LZh/c;)LTh/d;", "e", "(LZh/c$b;LZh/c$c;LZh/c$a;LZh/c$e;LIh/y$b;Ljava/util/List;LZh/c$f;LZh/c$d;LZh/c$g;LTh/c;LTh/b;ZZZ)LTh/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LZh/c$b;", "j", "()LZh/c$b;", "b", "LZh/c$c;", "k", "()LZh/c$c;", "c", "LZh/c$a;", "i", "()LZh/c$a;", "d", "LZh/c$e;", "m", "()LZh/c$e;", "LIh/y$b;", "o", "()LIh/y$b;", "f", "Ljava/util/List;", "n", "()Ljava/util/List;", "g", "LZh/c$f;", "p", "()LZh/c$f;", "h", "LZh/c$d;", "l", "()LZh/c$d;", "LZh/c$g;", "q", "()LZh/c$g;", "LTh/c;", "()LTh/c;", "LTh/b;", "()LTh/b;", "Z", "u", "()Z", "t", "r", "Lak/a;", "getFieldErrors", "fieldErrors", "s", "isSubmitButtonEnabled", "LHk/b;", "validations", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Th.d, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class CreateAccountDecorator implements Hk.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.FirstName firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.LastName lastName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.Email email;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.Password password;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final y.b passwordStrength;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<y.PasswordCriteria> passwordRules;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.PhoneNumber phoneNumber;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.MPerksPin mPerksPin;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final c.ZipCode zipCode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final c bottomSheetDecorator;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final b bannerDecorator;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isWeeklyAdChecked;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isTextMarketingChecked;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isHomeStoreSet;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final List<AbstractC5607a> fieldErrors;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final boolean isSubmitButtonEnabled;

    public CreateAccountDecorator() {
        this(null, null, null, null, null, null, null, null, null, null, null, false, false, false, 16383, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateAccountDecorator)) {
            return false;
        }
        CreateAccountDecorator createAccountDecorator = (CreateAccountDecorator) other;
        return Intrinsics.e(this.firstName, createAccountDecorator.firstName) && Intrinsics.e(this.lastName, createAccountDecorator.lastName) && Intrinsics.e(this.email, createAccountDecorator.email) && Intrinsics.e(this.password, createAccountDecorator.password) && Intrinsics.e(this.passwordStrength, createAccountDecorator.passwordStrength) && Intrinsics.e(this.passwordRules, createAccountDecorator.passwordRules) && Intrinsics.e(this.phoneNumber, createAccountDecorator.phoneNumber) && Intrinsics.e(this.mPerksPin, createAccountDecorator.mPerksPin) && Intrinsics.e(this.zipCode, createAccountDecorator.zipCode) && Intrinsics.e(this.bottomSheetDecorator, createAccountDecorator.bottomSheetDecorator) && Intrinsics.e(this.bannerDecorator, createAccountDecorator.bannerDecorator) && this.isWeeklyAdChecked == createAccountDecorator.isWeeklyAdChecked && this.isTextMarketingChecked == createAccountDecorator.isTextMarketingChecked && this.isHomeStoreSet == createAccountDecorator.isHomeStoreSet;
    }

    public CreateAccountDecorator(c.FirstName firstName, c.LastName lastName, c.Email email, c.Password password, y.b passwordStrength, List<y.PasswordCriteria> passwordRules, c.PhoneNumber phoneNumber, c.MPerksPin mPerksPin, c.ZipCode zipCode, c bottomSheetDecorator, b bannerDecorator, boolean z10, boolean z11, boolean z12) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(email, "email");
        Intrinsics.j(password, "password");
        Intrinsics.j(passwordStrength, "passwordStrength");
        Intrinsics.j(passwordRules, "passwordRules");
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(mPerksPin, "mPerksPin");
        Intrinsics.j(zipCode, "zipCode");
        Intrinsics.j(bottomSheetDecorator, "bottomSheetDecorator");
        Intrinsics.j(bannerDecorator, "bannerDecorator");
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.passwordStrength = passwordStrength;
        this.passwordRules = passwordRules;
        this.phoneNumber = phoneNumber;
        this.mPerksPin = mPerksPin;
        this.zipCode = zipCode;
        this.bottomSheetDecorator = bottomSheetDecorator;
        this.bannerDecorator = bannerDecorator;
        this.isWeeklyAdChecked = z10;
        this.isTextMarketingChecked = z11;
        this.isHomeStoreSet = z12;
        this.fieldErrors = CollectionsKt.p(firstName.b(), lastName.b(), phoneNumber.b(), email.b(), mPerksPin.b(), zipCode.b());
        boolean z13 = false;
        if ((zipCode.isValid() || z12) && (passwordStrength instanceof y.b.c)) {
            List listP = CollectionsKt.p(firstName, lastName, email, phoneNumber, mPerksPin);
            if ((listP instanceof Collection) && listP.isEmpty()) {
                z13 = true;
            } else {
                Iterator it = listP.iterator();
                while (it.hasNext()) {
                    if (!((Zh.c) it.next()).isValid()) {
                        break;
                    }
                }
                z13 = true;
            }
        }
        this.isSubmitButtonEnabled = z13;
    }

    public static /* synthetic */ CreateAccountDecorator f(CreateAccountDecorator createAccountDecorator, c.FirstName firstName, c.LastName lastName, c.Email email, c.Password password, y.b bVar, List list, c.PhoneNumber phoneNumber, c.MPerksPin mPerksPin, c.ZipCode zipCode, c cVar, b bVar2, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        return createAccountDecorator.e((i10 & 1) != 0 ? createAccountDecorator.firstName : firstName, (i10 & 2) != 0 ? createAccountDecorator.lastName : lastName, (i10 & 4) != 0 ? createAccountDecorator.email : email, (i10 & 8) != 0 ? createAccountDecorator.password : password, (i10 & 16) != 0 ? createAccountDecorator.passwordStrength : bVar, (i10 & 32) != 0 ? createAccountDecorator.passwordRules : list, (i10 & 64) != 0 ? createAccountDecorator.phoneNumber : phoneNumber, (i10 & 128) != 0 ? createAccountDecorator.mPerksPin : mPerksPin, (i10 & 256) != 0 ? createAccountDecorator.zipCode : zipCode, (i10 & 512) != 0 ? createAccountDecorator.bottomSheetDecorator : cVar, (i10 & 1024) != 0 ? createAccountDecorator.bannerDecorator : bVar2, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? createAccountDecorator.isWeeklyAdChecked : z10, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? createAccountDecorator.isTextMarketingChecked : z11, (i10 & 8192) != 0 ? createAccountDecorator.isHomeStoreSet : z12);
    }

    @Override // Hk.a
    public List<Validation<? extends Object>> a() {
        return CollectionsKt.p(this.firstName.c(), this.lastName.c(), this.phoneNumber.c(), this.email.c(), this.mPerksPin.c(), this.zipCode.c());
    }

    public final CreateAccountDecorator e(c.FirstName firstName, c.LastName lastName, c.Email email, c.Password password, y.b passwordStrength, List<y.PasswordCriteria> passwordRules, c.PhoneNumber phoneNumber, c.MPerksPin mPerksPin, c.ZipCode zipCode, c bottomSheetDecorator, b bannerDecorator, boolean isWeeklyAdChecked, boolean isTextMarketingChecked, boolean isHomeStoreSet) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(email, "email");
        Intrinsics.j(password, "password");
        Intrinsics.j(passwordStrength, "passwordStrength");
        Intrinsics.j(passwordRules, "passwordRules");
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(mPerksPin, "mPerksPin");
        Intrinsics.j(zipCode, "zipCode");
        Intrinsics.j(bottomSheetDecorator, "bottomSheetDecorator");
        Intrinsics.j(bannerDecorator, "bannerDecorator");
        return new CreateAccountDecorator(firstName, lastName, email, password, passwordStrength, passwordRules, phoneNumber, mPerksPin, zipCode, bottomSheetDecorator, bannerDecorator, isWeeklyAdChecked, isTextMarketingChecked, isHomeStoreSet);
    }

    /* renamed from: g, reason: from getter */
    public final b getBannerDecorator() {
        return this.bannerDecorator;
    }

    /* renamed from: h, reason: from getter */
    public final c getBottomSheetDecorator() {
        return this.bottomSheetDecorator;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.email.hashCode()) * 31) + this.password.hashCode()) * 31) + this.passwordStrength.hashCode()) * 31) + this.passwordRules.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.mPerksPin.hashCode()) * 31) + this.zipCode.hashCode()) * 31) + this.bottomSheetDecorator.hashCode()) * 31) + this.bannerDecorator.hashCode()) * 31) + Boolean.hashCode(this.isWeeklyAdChecked)) * 31) + Boolean.hashCode(this.isTextMarketingChecked)) * 31) + Boolean.hashCode(this.isHomeStoreSet);
    }

    /* renamed from: i, reason: from getter */
    public final c.Email getEmail() {
        return this.email;
    }

    /* renamed from: j, reason: from getter */
    public final c.FirstName getFirstName() {
        return this.firstName;
    }

    /* renamed from: k, reason: from getter */
    public final c.LastName getLastName() {
        return this.lastName;
    }

    /* renamed from: l, reason: from getter */
    public final c.MPerksPin getMPerksPin() {
        return this.mPerksPin;
    }

    /* renamed from: m, reason: from getter */
    public final c.Password getPassword() {
        return this.password;
    }

    public final List<y.PasswordCriteria> n() {
        return this.passwordRules;
    }

    /* renamed from: o, reason: from getter */
    public final y.b getPasswordStrength() {
        return this.passwordStrength;
    }

    /* renamed from: p, reason: from getter */
    public final c.PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: q, reason: from getter */
    public final c.ZipCode getZipCode() {
        return this.zipCode;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsHomeStoreSet() {
        return this.isHomeStoreSet;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsSubmitButtonEnabled() {
        return this.isSubmitButtonEnabled;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsTextMarketingChecked() {
        return this.isTextMarketingChecked;
    }

    public String toString() {
        return "CreateAccountDecorator(firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", password=" + this.password + ", passwordStrength=" + this.passwordStrength + ", passwordRules=" + this.passwordRules + ", phoneNumber=" + this.phoneNumber + ", mPerksPin=" + this.mPerksPin + ", zipCode=" + this.zipCode + ", bottomSheetDecorator=" + this.bottomSheetDecorator + ", bannerDecorator=" + this.bannerDecorator + ", isWeeklyAdChecked=" + this.isWeeklyAdChecked + ", isTextMarketingChecked=" + this.isTextMarketingChecked + ", isHomeStoreSet=" + this.isHomeStoreSet + ')';
    }

    /* renamed from: u, reason: from getter */
    public final boolean getIsWeeklyAdChecked() {
        return this.isWeeklyAdChecked;
    }

    public CreateAccountDecorator v(Zh.c<?> field) {
        Intrinsics.j(field, "field");
        if (field instanceof c.FirstName) {
            c.FirstName firstName = (c.FirstName) field;
            return firstName.c().e().length() <= 25 ? f(this, firstName.f(), null, null, null, null, null, null, null, null, null, null, false, false, false, 16382, null) : f(this, this.firstName.f(), null, null, null, null, null, null, null, null, null, null, false, false, false, 16382, null);
        }
        if (field instanceof c.LastName) {
            c.LastName lastName = (c.LastName) field;
            return lastName.c().e().length() <= 25 ? f(this, null, lastName.f(), null, null, null, null, null, null, null, null, null, false, false, false, 16381, null) : f(this, null, this.lastName.f(), null, null, null, null, null, null, null, null, null, false, false, false, 16381, null);
        }
        if (field instanceof c.PhoneNumber) {
            c.PhoneNumber phoneNumber = (c.PhoneNumber) field;
            return phoneNumber.c().e().length() <= 10 ? f(this, null, null, null, null, null, null, phoneNumber.f(), null, null, null, null, false, false, false, 16319, null) : f(this, null, null, null, null, null, null, this.phoneNumber.f(), null, null, null, null, false, false, false, 16319, null);
        }
        if (field instanceof c.Email) {
            return f(this, null, null, ((c.Email) field).f(), null, null, null, null, null, null, null, null, false, false, false, 16379, null);
        }
        if (field instanceof c.Password) {
            y yVar = y.f14042a;
            c.Password password = (c.Password) field;
            return f(this, null, null, null, password.f(), yVar.b(password.getPassword()), yVar.a(password.getPassword()), null, null, null, null, null, false, false, false, 16327, null);
        }
        if (field instanceof c.MPerksPin) {
            c.MPerksPin mPerksPin = (c.MPerksPin) field;
            return mPerksPin.c().e().length() <= 4 ? f(this, null, null, null, null, null, null, null, mPerksPin.f(), null, null, null, false, false, false, 16255, null) : f(this, null, null, null, null, null, null, null, this.mPerksPin.f(), null, null, null, false, false, false, 16255, null);
        }
        if (!(field instanceof c.ZipCode)) {
            throw new NoWhenBranchMatchedException();
        }
        c.ZipCode zipCode = (c.ZipCode) field;
        return zipCode.c().e().length() <= 5 ? f(this, null, null, null, null, null, null, null, null, zipCode.f(), null, null, false, false, false, 16127, null) : f(this, null, null, null, null, null, null, null, null, this.zipCode.f(), null, null, false, false, false, 16127, null);
    }

    public /* synthetic */ CreateAccountDecorator(c.FirstName firstName, c.LastName lastName, c.Email email, c.Password password, y.b bVar, List list, c.PhoneNumber phoneNumber, c.MPerksPin mPerksPin, c.ZipCode zipCode, c cVar, b bVar2, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new c.FirstName(null, 1, null) : firstName, (i10 & 2) != 0 ? new c.LastName(null, 1, null) : lastName, (i10 & 4) != 0 ? new c.Email(null, 1, null) : email, (i10 & 8) != 0 ? new c.Password(null, null, 3, null) : password, (i10 & 16) != 0 ? y.b.C0221b.f14053c : bVar, (i10 & 32) != 0 ? CollectionsKt.m() : list, (i10 & 64) != 0 ? new c.PhoneNumber(null, 1, null) : phoneNumber, (i10 & 128) != 0 ? new c.MPerksPin(null, 1, null) : mPerksPin, (i10 & 256) != 0 ? new c.ZipCode(null, 1, null) : zipCode, (i10 & 512) != 0 ? new c.Default(null, 1, null) : cVar, (i10 & 1024) != 0 ? b.c.f34993b : bVar2, (i10 & RecyclerView.m.FLAG_MOVED) == 0 ? z10 : true, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? false : z11, (i10 & 8192) != 0 ? false : z12);
    }
}
