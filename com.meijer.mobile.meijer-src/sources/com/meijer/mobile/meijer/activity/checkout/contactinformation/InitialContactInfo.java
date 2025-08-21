package com.meijer.mobile.meijer.activity.checkout.contactinformation;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0014\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/contactinformation/Q;", "", "", "email", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "b", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEmail", "getPhoneNumber", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.contactinformation.Q, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class InitialContactInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* JADX WARN: Multi-variable type inference failed */
    public InitialContactInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: b, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitialContactInfo)) {
            return false;
        }
        InitialContactInfo initialContactInfo = (InitialContactInfo) other;
        return Intrinsics.e(this.email, initialContactInfo.email) && Intrinsics.e(this.phoneNumber, initialContactInfo.phoneNumber);
    }

    public int hashCode() {
        String str = this.email;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.phoneNumber;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InitialContactInfo(email=" + this.email + ", phoneNumber=" + this.phoneNumber + ')';
    }

    public InitialContactInfo(String str, String str2) {
        this.email = str;
        this.phoneNumber = str2;
    }

    public /* synthetic */ InitialContactInfo(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
