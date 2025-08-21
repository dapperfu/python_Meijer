package com.meijer.mobile.meijer.activity.enrollment;

import Ik.Validation;
import Ik.c;
import com.meijer.mobile.meijer.activity.enrollment.profile.ProfileEnrollmentViewState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BI\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0010JR\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b\t\u0010%R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030)8\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b.\u0010/R\u0017\u00104\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0017R\u001a\u00106\u001a\u00020\u00158\u0006X\u0086D¢\u0006\f\n\u0004\b3\u00102\u001a\u0004\b5\u0010\u0017R(\u00107\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b\u001c\u0010/¨\u00068"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/v;", "LIk/a;", "LIk/b;", "", "phoneNumber", "pinNumber", "", "weeklyAdCheckbox", "textAdCheckbox", "isLoading", "<init>", "(LIk/b;LIk/b;ZZZ)V", "q", "(Ljava/lang/String;)Z", "p", "r", "()Lcom/meijer/mobile/meijer/activity/enrollment/v;", "g", "(LIk/b;LIk/b;ZZZ)Lcom/meijer/mobile/meijer/activity/enrollment/v;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LIk/b;", "k", "()LIk/b;", "b", "l", "c", "Z", "o", "()Z", "d", "n", "e", "", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v$a;", "f", "Ljava/util/List;", "steps", "m", "()Ljava/util/List;", "stepLabels", "h", "I", "i", "currentStep", "j", "horizontalPaddingInDp", "validations", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.enrollment.v, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class PhoneEnrollmentViewState implements Ik.a<PhoneEnrollmentViewState> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> phoneNumber;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> pinNumber;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean weeklyAdCheckbox;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean textAdCheckbox;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement> steps;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<String> stepLabels;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int currentStep;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int horizontalPaddingInDp;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<Validation<String>> validations;

    public PhoneEnrollmentViewState() {
        this(null, null, false, false, false, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneEnrollmentViewState)) {
            return false;
        }
        PhoneEnrollmentViewState phoneEnrollmentViewState = (PhoneEnrollmentViewState) other;
        return Intrinsics.e(this.phoneNumber, phoneEnrollmentViewState.phoneNumber) && Intrinsics.e(this.pinNumber, phoneEnrollmentViewState.pinNumber) && this.weeklyAdCheckbox == phoneEnrollmentViewState.weeklyAdCheckbox && this.textAdCheckbox == phoneEnrollmentViewState.textAdCheckbox && this.isLoading == phoneEnrollmentViewState.isLoading;
    }

    public int hashCode() {
        return (((((((this.phoneNumber.hashCode() * 31) + this.pinNumber.hashCode()) * 31) + Boolean.hashCode(this.weeklyAdCheckbox)) * 31) + Boolean.hashCode(this.textAdCheckbox)) * 31) + Boolean.hashCode(this.isLoading);
    }

    public String toString() {
        return "PhoneEnrollmentViewState(phoneNumber=" + this.phoneNumber + ", pinNumber=" + this.pinNumber + ", weeklyAdCheckbox=" + this.weeklyAdCheckbox + ", textAdCheckbox=" + this.textAdCheckbox + ", isLoading=" + this.isLoading + ')';
    }

    public PhoneEnrollmentViewState(Validation<String> phoneNumber, Validation<String> pinNumber, boolean z10, boolean z11, boolean z12) {
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(pinNumber, "pinNumber");
        this.phoneNumber = phoneNumber;
        this.pinNumber = pinNumber;
        this.weeklyAdCheckbox = z10;
        this.textAdCheckbox = z11;
        this.isLoading = z12;
        int i10 = 0;
        List<ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement> listP = CollectionsKt.p(new ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement(ProfileEnrollmentViewState.b.f107037a, "1. Profile", true), new ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement(ProfileEnrollmentViewState.b.f107038b, "2. mPerks", false), new ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement(ProfileEnrollmentViewState.b.f107039c, "3. Store", false));
        this.steps = listP;
        List<ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement> list = listP;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement) it.next()).getStepLabel());
        }
        this.stepLabels = arrayList;
        List<ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement> list2 = this.steps;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Boolean.valueOf(((ProfileEnrollmentViewState.CreateAccountLabelFlowRequirement) it2.next()).getCompleted()));
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
        this.validations = CollectionsKt.p(this.phoneNumber, this.pinNumber);
    }

    public static /* synthetic */ PhoneEnrollmentViewState h(PhoneEnrollmentViewState phoneEnrollmentViewState, Validation validation, Validation validation2, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            validation = phoneEnrollmentViewState.phoneNumber;
        }
        if ((i10 & 2) != 0) {
            validation2 = phoneEnrollmentViewState.pinNumber;
        }
        if ((i10 & 4) != 0) {
            z10 = phoneEnrollmentViewState.weeklyAdCheckbox;
        }
        if ((i10 & 8) != 0) {
            z11 = phoneEnrollmentViewState.textAdCheckbox;
        }
        if ((i10 & 16) != 0) {
            z12 = phoneEnrollmentViewState.isLoading;
        }
        boolean z13 = z12;
        boolean z14 = z10;
        return phoneEnrollmentViewState.g(validation, validation2, z14, z11, z13);
    }

    private final boolean p(String pinNumber) {
        return Intrinsics.e(pinNumber, "0000");
    }

    private final boolean q(String pinNumber) {
        return (pinNumber == null || pinNumber.length() != 4 || StringsKt.v(pinNumber) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List s(Jk.k validator) {
        List listE;
        Intrinsics.j(validator, "$this$validator");
        String str = (String) validator.i();
        if (str != null) {
            if (str.length() <= 0) {
                str = null;
            }
            if (str != null) {
                if (!Ds.g.e(str)) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final List t(PhoneEnrollmentViewState phoneEnrollmentViewState, Jk.k validator) {
        Intrinsics.j(validator, "$this$validator");
        CharSequence charSequence = (CharSequence) validator.i();
        return (charSequence == null || charSequence.length() == 0) ? CollectionsKt.e(new c.Empty(validator.getFieldName(), "Please enter a 4-digit PIN.")) : !phoneEnrollmentViewState.q((String) validator.i()) ? CollectionsKt.e(new c.Invalid(validator.getFieldName(), null, "Please enter a 4-digit PIN.", 2, null)) : phoneEnrollmentViewState.p((String) validator.i()) ? CollectionsKt.e(new c.Invalid(validator.getFieldName(), null, "Invalid PIN. Please enter a PIN other than \"0000\".", 2, null)) : CollectionsKt.m();
    }

    @Override // Ik.a
    public List<Validation<String>> a() {
        return this.validations;
    }

    public final PhoneEnrollmentViewState g(Validation<String> phoneNumber, Validation<String> pinNumber, boolean weeklyAdCheckbox, boolean textAdCheckbox, boolean isLoading) {
        Intrinsics.j(phoneNumber, "phoneNumber");
        Intrinsics.j(pinNumber, "pinNumber");
        return new PhoneEnrollmentViewState(phoneNumber, pinNumber, weeklyAdCheckbox, textAdCheckbox, isLoading);
    }

    /* renamed from: i, reason: from getter */
    public final int getCurrentStep() {
        return this.currentStep;
    }

    /* renamed from: j, reason: from getter */
    public final int getHorizontalPaddingInDp() {
        return this.horizontalPaddingInDp;
    }

    public final Validation<String> k() {
        return this.phoneNumber;
    }

    public final Validation<String> l() {
        return this.pinNumber;
    }

    public final List<String> m() {
        return this.stepLabels;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getTextAdCheckbox() {
        return this.textAdCheckbox;
    }

    /* renamed from: o, reason: from getter */
    public final boolean getWeeklyAdCheckbox() {
        return this.weeklyAdCheckbox;
    }

    public PhoneEnrollmentViewState r() {
        return h(this, this.phoneNumber.j(Jk.l.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.enrollment.v.a
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PhoneEnrollmentViewState) this.receiver).k();
            }
        }, new Function1() { // from class: com.meijer.mobile.meijer.activity.enrollment.t
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneEnrollmentViewState.s((Jk.k) obj);
            }
        })), this.pinNumber.j(Jk.l.b(new PropertyReference0Impl(this) { // from class: com.meijer.mobile.meijer.activity.enrollment.v.b
            @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty0
            public Object get() {
                return ((PhoneEnrollmentViewState) this.receiver).l();
            }
        }, new Function1() { // from class: com.meijer.mobile.meijer.activity.enrollment.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhoneEnrollmentViewState.t(this.f107164a, (Jk.k) obj);
            }
        })), false, false, false, 28, null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ PhoneEnrollmentViewState(Ik.Validation r3, Ik.Validation r4, boolean r5, boolean r6, boolean r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r2 = this;
            r9 = r8 & 1
            r0 = 2
            r1 = 0
            if (r9 == 0) goto Lb
            Ik.b r3 = new Ik.b
            r3.<init>(r1, r1, r0, r1)
        Lb:
            r9 = r8 & 2
            if (r9 == 0) goto L14
            Ik.b r4 = new Ik.b
            r4.<init>(r1, r1, r0, r1)
        L14:
            r9 = r8 & 4
            r0 = 1
            if (r9 == 0) goto L1a
            r5 = r0
        L1a:
            r9 = r8 & 8
            if (r9 == 0) goto L1f
            r6 = 0
        L1f:
            r8 = r8 & 16
            if (r8 == 0) goto L2a
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L30
        L2a:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L30:
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.enrollment.PhoneEnrollmentViewState.<init>(Ik.b, Ik.b, boolean, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
