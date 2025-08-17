package com.meijer.mobile.meijer.activity.checkout.contactinformation;

import Hk.Validation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/P;", "LDk/b;", "Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "", "emailAddress", "phoneNumber", "", "agreedToTerms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "oldState", "d", "(Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;)Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/O;", "b", "Ljava/lang/String;", "c", "Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class P extends Dk.b<DeliveryContactInformationViewState> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String emailAddress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String phoneNumber;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean agreedToTerms;

    @Override // Dk.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public DeliveryContactInformationViewState b(DeliveryContactInformationViewState oldState) {
        Intrinsics.j(oldState, "oldState");
        return DeliveryContactInformationViewState.i(oldState, new Validation(this.emailAddress, null, 2, null), new Validation(this.phoneNumber, null, 2, null), new Validation(Boolean.valueOf(this.agreedToTerms), null, 2, null), null, null, null, false, false, false, null, false, false, false, null, 16248, null).y();
    }

    public P(String str, String str2, boolean z10) {
        this.emailAddress = str;
        this.phoneNumber = str2;
        this.agreedToTerms = z10;
    }
}
