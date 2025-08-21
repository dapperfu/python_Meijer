package com.meijer.mobile.meijer.activity.enrollment.profile;

import Ik.Validation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/profile/w;", "LEk/b;", "Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "", "firstName", "lastName", "emailAddress", "password", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "oldState", "d", "(Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;)Lcom/meijer/mobile/meijer/activity/enrollment/profile/v;", "b", "Ljava/lang/String;", "c", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class w extends Ek.b<ProfileEnrollmentViewState> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String firstName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String lastName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String emailAddress;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String password;

    @Override // Ek.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ProfileEnrollmentViewState b(ProfileEnrollmentViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return oldState.f(new Validation<>(this.firstName, null, 2, null), new Validation<>(this.lastName, null, 2, null), new Validation<>(this.emailAddress, null, 2, null), new Validation<>(this.password, null, 2, null), false).o();
    }

    public w(String str, String str2, String str3, String str4) {
        this.firstName = str;
        this.lastName = str2;
        this.emailAddress = str3;
        this.password = str4;
    }
}
