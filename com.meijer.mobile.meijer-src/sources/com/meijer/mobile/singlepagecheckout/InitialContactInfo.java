package com.meijer.mobile.singlepagecheckout;

import Ik.Validation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/singlepagecheckout/m0;", "", "LIk/b;", "", "emailAddress", "phoneNumber", "<init>", "(LIk/b;LIk/b;)V", "a", "(LIk/b;LIk/b;)Lcom/meijer/mobile/singlepagecheckout/m0;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LIk/b;", "b", "()LIk/b;", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.m0, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class InitialContactInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> emailAddress;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Validation<String> phoneNumber;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitialContactInfo)) {
            return false;
        }
        InitialContactInfo initialContactInfo = (InitialContactInfo) other;
        return Intrinsics.e(this.emailAddress, initialContactInfo.emailAddress) && Intrinsics.e(this.phoneNumber, initialContactInfo.phoneNumber);
    }

    public int hashCode() {
        return (this.emailAddress.hashCode() * 31) + this.phoneNumber.hashCode();
    }

    public String toString() {
        return "InitialContactInfo(emailAddress=" + this.emailAddress + ", phoneNumber=" + this.phoneNumber + ')';
    }

    public InitialContactInfo(Validation<String> emailAddress, Validation<String> phoneNumber) {
        Intrinsics.j(emailAddress, "emailAddress");
        Intrinsics.j(phoneNumber, "phoneNumber");
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }

    public final InitialContactInfo a(Validation<String> emailAddress, Validation<String> phoneNumber) {
        Intrinsics.j(emailAddress, "emailAddress");
        Intrinsics.j(phoneNumber, "phoneNumber");
        return new InitialContactInfo(emailAddress, phoneNumber);
    }

    public final Validation<String> b() {
        return this.emailAddress;
    }

    public final Validation<String> c() {
        return this.phoneNumber;
    }
}
