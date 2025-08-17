package com.meijer.mobile.meijer.activity.enrollment.profile;

import Hk.Validation;
import Hk.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0019\u001dBY\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJb\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001f\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\t\u0010%R(\u0010-\u001a\b\u0012\u0004\u0012\u00020'0&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030&8\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*R\u0017\u00103\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010\u0014R\u001a\u00105\u001a\u00020\u00128\u0006X\u0086D¢\u0006\f\n\u0004\b \u00102\u001a\u0004\b4\u0010\u0014R(\u00106\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\b\u0019\u0010*¨\u00067"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "LHk/a;", "LHk/b;", "", "firstName", "lastName", "emailAddress", "password", "", "isLoading", "<init>", "(LHk/b;LHk/b;LHk/b;LHk/b;Z)V", "o", "()Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "f", "(LHk/b;LHk/b;LHk/b;LHk/b;Z)Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LHk/b;", "j", "()LHk/b;", "b", "l", "c", "i", "d", "m", "e", "Z", "()Z", "", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v$a;", "Ljava/util/List;", "getSteps", "()Ljava/util/List;", "setSteps", "(Ljava/util/List;)V", "steps", "g", "n", "stepLabels", "h", "I", "currentStep", "k", "horizontalPaddingInDp", "validations", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.v, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class ProfileEnrollmentViewState implements Hk.a<ProfileEnrollmentViewState> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> lastName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> emailAddress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> password;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<CreateAccountLabelFlowRequirement> steps;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<String> stepLabels;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int currentStep;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int horizontalPaddingInDp;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<Validation<String>> validations;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/v$a;", "", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v$b;", "labelFlowType", "", "stepLabel", "", "completed", "<init>", "(Lcom/meijer/mobile/meijer/activity/enrollment/profile/v$b;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v$b;", "getLabelFlowType", "()Lcom/meijer/mobile/meijer/activity/enrollment/profile/v$b;", "b", "Ljava/lang/String;", "c", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.v$a, reason: from toString */
    public static final /* data */ class CreateAccountLabelFlowRequirement {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b labelFlowType;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stepLabel;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean completed;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CreateAccountLabelFlowRequirement)) {
                return false;
            }
            CreateAccountLabelFlowRequirement createAccountLabelFlowRequirement = (CreateAccountLabelFlowRequirement) other;
            return this.labelFlowType == createAccountLabelFlowRequirement.labelFlowType && Intrinsics.e(this.stepLabel, createAccountLabelFlowRequirement.stepLabel) && this.completed == createAccountLabelFlowRequirement.completed;
        }

        public int hashCode() {
            return (((this.labelFlowType.hashCode() * 31) + this.stepLabel.hashCode()) * 31) + Boolean.hashCode(this.completed);
        }

        public String toString() {
            return "CreateAccountLabelFlowRequirement(labelFlowType=" + this.labelFlowType + ", stepLabel=" + this.stepLabel + ", completed=" + this.completed + ')';
        }

        public CreateAccountLabelFlowRequirement(b labelFlowType, String stepLabel, boolean z10) {
            Intrinsics.j(labelFlowType, "labelFlowType");
            Intrinsics.j(stepLabel, "stepLabel");
            this.labelFlowType = labelFlowType;
            this.stepLabel = stepLabel;
            this.completed = z10;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getCompleted() {
            return this.completed;
        }

        /* renamed from: b, reason: from getter */
        public final String getStepLabel() {
            return this.stepLabel;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/v$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.enrollment.profile.v$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f106182a = new b("PROFILE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f106183b = new b("MPERKS", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f106184c = new b("STORE", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f106185d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f106186e;

        private static final /* synthetic */ b[] a() {
            return new b[]{f106182a, f106183b, f106184c};
        }

        static {
            b[] bVarArrA = a();
            f106185d = bVarArrA;
            f106186e = EnumEntriesKt.a(bVarArrA);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f106185d.clone();
        }

        private b(String str, int i10) {
        }
    }

    public ProfileEnrollmentViewState() {
        this(null, null, null, null, false, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProfileEnrollmentViewState)) {
            return false;
        }
        ProfileEnrollmentViewState profileEnrollmentViewState = (ProfileEnrollmentViewState) other;
        return Intrinsics.e(this.firstName, profileEnrollmentViewState.firstName) && Intrinsics.e(this.lastName, profileEnrollmentViewState.lastName) && Intrinsics.e(this.emailAddress, profileEnrollmentViewState.emailAddress) && Intrinsics.e(this.password, profileEnrollmentViewState.password) && this.isLoading == profileEnrollmentViewState.isLoading;
    }

    public int hashCode() {
        return (((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.emailAddress.hashCode()) * 31) + this.password.hashCode()) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "ProfileEnrollmentViewState(firstName=" + this.firstName + ", lastName=" + this.lastName + ", emailAddress=" + this.emailAddress + ", password=" + this.password + ", isLoading=" + this.isLoading + ')';
    }

    public ProfileEnrollmentViewState(Validation<String> firstName, Validation<String> lastName, Validation<String> emailAddress, Validation<String> password, boolean z10) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(emailAddress, "emailAddress");
        Intrinsics.j(password, "password");
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.password = password;
        this.isLoading = z10;
        int i10 = 0;
        List<CreateAccountLabelFlowRequirement> listP = CollectionsKt.p(new CreateAccountLabelFlowRequirement(b.f106182a, "1. Profile", false), new CreateAccountLabelFlowRequirement(b.f106183b, "2. mPerks", false), new CreateAccountLabelFlowRequirement(b.f106184c, "3. Store", false));
        this.steps = listP;
        List<CreateAccountLabelFlowRequirement> list = listP;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((CreateAccountLabelFlowRequirement) it.next()).getStepLabel());
        }
        this.stepLabels = arrayList;
        List<CreateAccountLabelFlowRequirement> list2 = this.steps;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Boolean.valueOf(((CreateAccountLabelFlowRequirement) it2.next()).getCompleted()));
        }
        Iterator it3 = arrayList2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                i10 = -1;
                break;
            } else if (!((Boolean) it3.next()).booleanValue()) {
                break;
            } else {
                i10++;
            }
        }
        this.currentStep = i10;
        this.horizontalPaddingInDp = 40;
        this.validations = CollectionsKt.p(this.firstName, this.lastName, this.emailAddress, this.password);
    }

    public static /* synthetic */ ProfileEnrollmentViewState g(ProfileEnrollmentViewState profileEnrollmentViewState, Validation validation, Validation validation2, Validation validation3, Validation validation4, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            validation = profileEnrollmentViewState.firstName;
        }
        if ((i10 & 2) != 0) {
            validation2 = profileEnrollmentViewState.lastName;
        }
        if ((i10 & 4) != 0) {
            validation3 = profileEnrollmentViewState.emailAddress;
        }
        if ((i10 & 8) != 0) {
            validation4 = profileEnrollmentViewState.password;
        }
        if ((i10 & 16) != 0) {
            z10 = profileEnrollmentViewState.isLoading;
        }
        boolean z11 = z10;
        Validation validation5 = validation3;
        return profileEnrollmentViewState.f(validation, validation2, validation5, validation4, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List p(Ik.k validator) {
        List listE;
        Intrinsics.j(validator, "$this$validator");
        String str = (String) validator.i();
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                if (!Ds.h.f7341a.a(str)) {
                    str = null;
                }
                if (str == null || (listE = CollectionsKt.m()) == null) {
                    listE = CollectionsKt.e(new c.Invalid(validator.getFieldName(), null, null, 6, null));
                }
                if (listE != null) {
                    return listE;
                }
            }
        }
        return CollectionsKt.e(new c.Empty(validator.getFieldName(), null, 2, null));
    }

    @Override // Hk.a
    public List<Validation<String>> a() {
        return this.validations;
    }

    public final ProfileEnrollmentViewState f(Validation<String> firstName, Validation<String> lastName, Validation<String> emailAddress, Validation<String> password, boolean isLoading) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(emailAddress, "emailAddress");
        Intrinsics.j(password, "password");
        return new ProfileEnrollmentViewState(firstName, lastName, emailAddress, password, isLoading);
    }

    /* renamed from: h, reason: from getter */
    public final int getCurrentStep() {
        return this.currentStep;
    }

    public final Validation<String> i() {
        return this.emailAddress;
    }

    public final Validation<String> j() {
        return this.firstName;
    }

    /* renamed from: k, reason: from getter */
    public final int getHorizontalPaddingInDp() {
        return this.horizontalPaddingInDp;
    }

    public final Validation<String> l() {
        return this.lastName;
    }

    public final Validation<String> m() {
        return this.password;
    }

    public final List<String> n() {
        return this.stepLabels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileEnrollmentViewState o() {
        int i10 = 2;
        Validation<String> validationJ = this.firstName.j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.v.c
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((ProfileEnrollmentViewState) this.receiver).j();
            }
        }, null, i10, 0 == true ? 1 : 0));
        Validation<String> validationJ2 = this.lastName.j(new Ik.d(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.v.d
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((ProfileEnrollmentViewState) this.receiver).l();
            }
        }, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0));
        Validation<String> validationJ3 = this.emailAddress.j(Ik.l.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.v.e
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((ProfileEnrollmentViewState) this.receiver).i();
            }
        }, new Function1() { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEnrollmentViewState.p((Ik.k) obj);
            }
        }));
        Validation<String> validation = this.password;
        PropertyReference0Impl propertyReference0Impl = new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.v.f
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((ProfileEnrollmentViewState) this.receiver).m();
            }
        };
        String str = (String) ((Validation) new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.enrollment.profile.v.g
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((ProfileEnrollmentViewState) this.receiver).i();
            }
        }.get()).e();
        if (str == null) {
            str = "";
        }
        return g(this, validationJ, validationJ2, validationJ3, validation.j(new a(propertyReference0Impl, str)), false, 16, null);
    }

    public /* synthetic */ ProfileEnrollmentViewState(Validation validation, Validation validation2, Validation validation3, Validation validation4, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Validation(null, null, 2, null) : validation, (i10 & 2) != 0 ? new Validation(null, null, 2, null) : validation2, (i10 & 4) != 0 ? new Validation(null, null, 2, null) : validation3, (i10 & 8) != 0 ? new Validation(null, null, 2, null) : validation4, (i10 & 16) != 0 ? true : z10);
    }
}
