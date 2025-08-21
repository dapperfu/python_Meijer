package com.meijer.mobile.meijer.activity.checkout.pickupperson;

import Ik.Validation;
import gj.PickupPerson;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BE\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/O;", "LEk/b;", "Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;", "", "firstName", "lastName", "emailAddress", "phoneNumber", "", "agreedToTerms", "Lgj/b;", "initialPickupPerson", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLgj/b;)V", "oldState", "d", "(Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;)Lcom/meijer/mobile/meijer/activity/checkout/pickupperson/N;", "b", "Ljava/lang/String;", "c", "e", "f", "Z", "g", "Lgj/b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class O extends Ek.b<PickupPersonViewState> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String firstName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String lastName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String emailAddress;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String phoneNumber;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean agreedToTerms;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final PickupPerson initialPickupPerson;

    public /* synthetic */ O(String str, String str2, String str3, String str4, boolean z10, PickupPerson pickupPerson, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? null : pickupPerson);
    }

    public O(String str, String str2, String str3, String str4, boolean z10, PickupPerson pickupPerson) {
        this.firstName = str;
        this.lastName = str2;
        this.emailAddress = str3;
        this.phoneNumber = str4;
        this.agreedToTerms = z10;
        this.initialPickupPerson = pickupPerson;
    }

    @Override // Ek.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public PickupPersonViewState b(PickupPersonViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        Validation validation = new Validation(this.firstName, null, 2, null);
        Validation validation2 = new Validation(this.lastName, null, 2, null);
        Validation validation3 = new Validation(this.emailAddress, null, 2, null);
        Validation validation4 = new Validation(this.phoneNumber, null, 2, null);
        Validation validation5 = new Validation(Boolean.valueOf(this.agreedToTerms), null, 2, null);
        PickupPerson initialPickupPerson = this.initialPickupPerson;
        if (initialPickupPerson == null) {
            initialPickupPerson = oldState.getInitialPickupPerson();
        }
        return PickupPersonViewState.f(oldState, validation, validation2, validation3, validation4, validation5, false, false, null, null, null, null, initialPickupPerson, false, false, false, false, false, null, 260032, null).A();
    }
}
