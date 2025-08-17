package com.meijer.mobile.meijer.activity.enrollment;

import Hk.Validation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/w;", "LDk/b;", "Lcom/meijer/mobile/meijer/activity/enrollment/v;", "", "phoneNumber", "pinNumber", "", "weeklyAdCheckbox", "textAdCheckbox", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "oldState", "d", "(Lcom/meijer/mobile/meijer/activity/enrollment/v;)Lcom/meijer/mobile/meijer/activity/enrollment/v;", "b", "Ljava/lang/String;", "c", "Z", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class w extends Dk.b<PhoneEnrollmentViewState> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String phoneNumber;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String pinNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean weeklyAdCheckbox;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean textAdCheckbox;

    @Override // Dk.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public PhoneEnrollmentViewState b(PhoneEnrollmentViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return oldState.g(new Validation<>(this.phoneNumber, null, 2, null), new Validation<>(this.pinNumber, null, 2, null), true, false, true).r();
    }

    public w(String str, String str2, boolean z10, boolean z11) {
        this.phoneNumber = str;
        this.pinNumber = str2;
        this.weeklyAdCheckbox = z10;
        this.textAdCheckbox = z11;
    }
}
