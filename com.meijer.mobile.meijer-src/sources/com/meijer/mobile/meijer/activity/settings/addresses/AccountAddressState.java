package com.meijer.mobile.meijer.activity.settings.addresses;

import En.q;
import Ik.Validation;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\b\u0004\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BÃ\u0001\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015JÌ\u0001\u0010\u0016\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$R\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\"\u001a\u0004\b+\u0010$R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\"\u001a\u0004\b.\u0010$R\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\"\u001a\u0004\b/\u0010$R\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\b0\u00106R(\u0010:\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00108\u001a\u0004\b!\u00109¨\u0006;"}, d2 = {"Lcom/meijer/mobile/meijer/activity/settings/addresses/a;", "LIk/a;", "LIk/b;", "", "nickName", "firstName", "lastName", "phoneNumber", "addressLineOne", "addressLineTwo", "city", "state", "zipCode", "", "LEn/q$a;", "hideErrorsFor", "", "allRequiredFieldsContainData", "<init>", "(LIk/b;LIk/b;LIk/b;LIk/b;LIk/b;LIk/b;LIk/b;LIk/b;LIk/b;Ljava/util/Set;Z)V", "r", "()Lcom/meijer/mobile/meijer/activity/settings/addresses/a;", "e", "(LIk/b;LIk/b;LIk/b;LIk/b;LIk/b;LIk/b;LIk/b;LIk/b;LIk/b;Ljava/util/Set;Z)Lcom/meijer/mobile/meijer/activity/settings/addresses/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LIk/b;", "n", "()LIk/b;", "b", "k", "c", "m", "d", "o", "g", "f", "h", "j", "p", "i", "q", "Ljava/util/Set;", "l", "()Ljava/util/Set;", "Z", "()Z", "", "Ljava/util/List;", "()Ljava/util/List;", "validations", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.settings.addresses.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class AccountAddressState implements Ik.a<AccountAddressState> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> nickName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> firstName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> lastName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> phoneNumber;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> addressLineOne;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> addressLineTwo;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> city;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> state;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> zipCode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<q.a> hideErrorsFor;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean allRequiredFieldsContainData;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<Validation<String>> validations;

    public AccountAddressState() {
        this(null, null, null, null, null, null, null, null, null, null, false, 2047, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountAddressState)) {
            return false;
        }
        AccountAddressState accountAddressState = (AccountAddressState) other;
        return Intrinsics.e(this.nickName, accountAddressState.nickName) && Intrinsics.e(this.firstName, accountAddressState.firstName) && Intrinsics.e(this.lastName, accountAddressState.lastName) && Intrinsics.e(this.phoneNumber, accountAddressState.phoneNumber) && Intrinsics.e(this.addressLineOne, accountAddressState.addressLineOne) && Intrinsics.e(this.addressLineTwo, accountAddressState.addressLineTwo) && Intrinsics.e(this.city, accountAddressState.city) && Intrinsics.e(this.state, accountAddressState.state) && Intrinsics.e(this.zipCode, accountAddressState.zipCode) && Intrinsics.e(this.hideErrorsFor, accountAddressState.hideErrorsFor) && this.allRequiredFieldsContainData == accountAddressState.allRequiredFieldsContainData;
    }

    public int hashCode() {
        return (((((((((((((((((((this.nickName.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.addressLineOne.hashCode()) * 31) + this.addressLineTwo.hashCode()) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.zipCode.hashCode()) * 31) + this.hideErrorsFor.hashCode()) * 31) + Boolean.hashCode(this.allRequiredFieldsContainData);
    }

    public String toString() {
        return "AccountAddressState(nickName=" + this.nickName + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", phoneNumber=" + this.phoneNumber + ", addressLineOne=" + this.addressLineOne + ", addressLineTwo=" + this.addressLineTwo + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", hideErrorsFor=" + this.hideErrorsFor + ", allRequiredFieldsContainData=" + this.allRequiredFieldsContainData + ')';
    }

    public AccountAddressState(Validation<String> nickName, Validation<String> firstName, Validation<String> lastName, Validation<String> phoneNumber, Validation<String> addressLineOne, Validation<String> addressLineTwo, Validation<String> city, Validation<String> state, Validation<String> zipCode, Set<q.a> hideErrorsFor, boolean z10) {
        Intrinsics.j(nickName, "nickName");
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(addressLineOne, "addressLineOne");
        Intrinsics.j(addressLineTwo, "addressLineTwo");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zipCode, "zipCode");
        Intrinsics.j(hideErrorsFor, "hideErrorsFor");
        this.nickName = nickName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.addressLineOne = addressLineOne;
        this.addressLineTwo = addressLineTwo;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.hideErrorsFor = hideErrorsFor;
        this.allRequiredFieldsContainData = z10;
        this.validations = CollectionsKt.p(nickName, firstName, lastName, phoneNumber, addressLineOne, addressLineTwo, city, state, zipCode);
    }

    public static /* synthetic */ AccountAddressState f(AccountAddressState accountAddressState, Validation validation, Validation validation2, Validation validation3, Validation validation4, Validation validation5, Validation validation6, Validation validation7, Validation validation8, Validation validation9, Set set, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            validation = accountAddressState.nickName;
        }
        if ((i10 & 2) != 0) {
            validation2 = accountAddressState.firstName;
        }
        if ((i10 & 4) != 0) {
            validation3 = accountAddressState.lastName;
        }
        if ((i10 & 8) != 0) {
            validation4 = accountAddressState.phoneNumber;
        }
        if ((i10 & 16) != 0) {
            validation5 = accountAddressState.addressLineOne;
        }
        if ((i10 & 32) != 0) {
            validation6 = accountAddressState.addressLineTwo;
        }
        if ((i10 & 64) != 0) {
            validation7 = accountAddressState.city;
        }
        if ((i10 & 128) != 0) {
            validation8 = accountAddressState.state;
        }
        if ((i10 & 256) != 0) {
            validation9 = accountAddressState.zipCode;
        }
        if ((i10 & 512) != 0) {
            set = accountAddressState.hideErrorsFor;
        }
        if ((i10 & 1024) != 0) {
            z10 = accountAddressState.allRequiredFieldsContainData;
        }
        Set set2 = set;
        boolean z11 = z10;
        Validation validation10 = validation8;
        Validation validation11 = validation9;
        Validation validation12 = validation6;
        Validation validation13 = validation7;
        Validation validation14 = validation5;
        Validation validation15 = validation3;
        return accountAddressState.e(validation, validation2, validation15, validation4, validation14, validation12, validation13, validation10, validation11, set2, z11);
    }

    @Override // Ik.a
    public List<Validation<String>> a() {
        return this.validations;
    }

    public final AccountAddressState e(Validation<String> nickName, Validation<String> firstName, Validation<String> lastName, Validation<String> phoneNumber, Validation<String> addressLineOne, Validation<String> addressLineTwo, Validation<String> city, Validation<String> state, Validation<String> zipCode, Set<q.a> hideErrorsFor, boolean allRequiredFieldsContainData) {
        Intrinsics.j(nickName, "nickName");
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(addressLineOne, "addressLineOne");
        Intrinsics.j(addressLineTwo, "addressLineTwo");
        Intrinsics.j(city, "city");
        Intrinsics.j(state, "state");
        Intrinsics.j(zipCode, "zipCode");
        Intrinsics.j(hideErrorsFor, "hideErrorsFor");
        return new AccountAddressState(nickName, firstName, lastName, phoneNumber, addressLineOne, addressLineTwo, city, state, zipCode, hideErrorsFor, allRequiredFieldsContainData);
    }

    public final Validation<String> g() {
        return this.addressLineOne;
    }

    public final Validation<String> h() {
        return this.addressLineTwo;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getAllRequiredFieldsContainData() {
        return this.allRequiredFieldsContainData;
    }

    public final Validation<String> j() {
        return this.city;
    }

    public final Validation<String> k() {
        return this.firstName;
    }

    public final Set<q.a> l() {
        return this.hideErrorsFor;
    }

    public final Validation<String> m() {
        return this.lastName;
    }

    public final Validation<String> n() {
        return this.nickName;
    }

    public final Validation<String> o() {
        return this.phoneNumber;
    }

    public final Validation<String> p() {
        return this.state;
    }

    public final Validation<String> q() {
        return this.zipCode;
    }

    public AccountAddressState r() {
        return f(this, this.nickName.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.settings.addresses.a.b
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((AccountAddressState) this.receiver).n();
            }
        }, null, 2, null)), this.firstName.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.settings.addresses.a.c
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((AccountAddressState) this.receiver).k();
            }
        }, null, 2, null)), this.lastName.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.settings.addresses.a.d
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((AccountAddressState) this.receiver).m();
            }
        }, null, 2, null)), this.phoneNumber.j(new Jk.g(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.settings.addresses.a.e
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((AccountAddressState) this.receiver).o();
            }
        }, null, 2, null)), this.addressLineOne.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.settings.addresses.a.f
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((AccountAddressState) this.receiver).g();
            }
        }, null, 2, null)), this.addressLineTwo.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.settings.addresses.a.g
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((AccountAddressState) this.receiver).h();
            }
        }, null, 2, null)), this.city.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.settings.addresses.a.h
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((AccountAddressState) this.receiver).j();
            }
        }, null, 2, null)), this.state.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.settings.addresses.a.i
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((AccountAddressState) this.receiver).p();
            }
        }, null, 2, null)), this.zipCode.j(new Jk.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.settings.addresses.a.j
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((AccountAddressState) this.receiver).q();
            }
        }, null, 2, null), new Jk.m(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.settings.addresses.a.a
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((AccountAddressState) this.receiver).q();
            }
        }, null, 2, null)), null, false, 1536, null);
    }

    public /* synthetic */ AccountAddressState(Validation validation, Validation validation2, Validation validation3, Validation validation4, Validation validation5, Validation validation6, Validation validation7, Validation validation8, Validation validation9, Set set, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Validation(null, null, 2, null) : validation, (i10 & 2) != 0 ? new Validation(null, null, 2, null) : validation2, (i10 & 4) != 0 ? new Validation(null, null, 2, null) : validation3, (i10 & 8) != 0 ? new Validation(null, null, 2, null) : validation4, (i10 & 16) != 0 ? new Validation(null, null, 2, null) : validation5, (i10 & 32) != 0 ? new Validation(null, null, 2, null) : validation6, (i10 & 64) != 0 ? new Validation(null, null, 2, null) : validation7, (i10 & 128) != 0 ? new Validation(null, null, 2, null) : validation8, (i10 & 256) != 0 ? new Validation(null, null, 2, null) : validation9, (i10 & 512) != 0 ? CollectionsKt.n1(q.a.b()) : set, (i10 & 1024) != 0 ? false : z10);
    }
}
