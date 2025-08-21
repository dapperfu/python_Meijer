package com.radiusnetworks.flybuy.sdk.data.customer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/customer/CustomerConsent;", "", "termsOfService", "", "ageVerification", "(ZZ)V", "getAgeVerification", "()Z", "setAgeVerification", "(Z)V", "getTermsOfService", "setTermsOfService", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CustomerConsent {
    private boolean ageVerification;
    private boolean termsOfService;

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomerConsent() {
        boolean z10 = false;
        this(z10, z10, 3, null);
    }

    public static /* synthetic */ CustomerConsent copy$default(CustomerConsent customerConsent, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = customerConsent.termsOfService;
        }
        if ((i10 & 2) != 0) {
            z11 = customerConsent.ageVerification;
        }
        return customerConsent.copy(z10, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getTermsOfService() {
        return this.termsOfService;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getAgeVerification() {
        return this.ageVerification;
    }

    public final CustomerConsent copy(boolean termsOfService, boolean ageVerification) {
        return new CustomerConsent(termsOfService, ageVerification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerConsent)) {
            return false;
        }
        CustomerConsent customerConsent = (CustomerConsent) other;
        return this.termsOfService == customerConsent.termsOfService && this.ageVerification == customerConsent.ageVerification;
    }

    public int hashCode() {
        return Boolean.hashCode(this.ageVerification) + (Boolean.hashCode(this.termsOfService) * 31);
    }

    public String toString() {
        return "CustomerConsent(termsOfService=" + this.termsOfService + ", ageVerification=" + this.ageVerification + ')';
    }

    public CustomerConsent(boolean z10, boolean z11) {
        this.termsOfService = z10;
        this.ageVerification = z11;
    }

    public final boolean getAgeVerification() {
        return this.ageVerification;
    }

    public final boolean getTermsOfService() {
        return this.termsOfService;
    }

    public final void setAgeVerification(boolean z10) {
        this.ageVerification = z10;
    }

    public final void setTermsOfService(boolean z10) {
        this.termsOfService = z10;
    }

    public /* synthetic */ CustomerConsent(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }
}
