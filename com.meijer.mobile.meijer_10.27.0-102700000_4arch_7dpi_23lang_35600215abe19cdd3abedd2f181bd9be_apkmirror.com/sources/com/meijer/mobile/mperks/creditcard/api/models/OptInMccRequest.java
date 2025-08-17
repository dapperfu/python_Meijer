package com.meijer.mobile.mperks.creditcard.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJB\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/mperks/creditcard/api/models/OptInMccRequest;", "", "", "firstName", "lastName", "lastFourOfCC", "", "termsId", "birthDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Lcom/meijer/mobile/mperks/creditcard/api/models/OptInMccRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "J", "e", "()J", "creditcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class OptInMccRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastFourOfCC;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long termsId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String birthDate;

    public final OptInMccRequest copy(@g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "lastFourOfCC") String lastFourOfCC, @g(name = "termsId") long termsId, @g(name = "birthDate") String birthDate) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(lastFourOfCC, "lastFourOfCC");
        Intrinsics.j(birthDate, "birthDate");
        return new OptInMccRequest(firstName, lastName, lastFourOfCC, termsId, birthDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptInMccRequest)) {
            return false;
        }
        OptInMccRequest optInMccRequest = (OptInMccRequest) other;
        return Intrinsics.e(this.firstName, optInMccRequest.firstName) && Intrinsics.e(this.lastName, optInMccRequest.lastName) && Intrinsics.e(this.lastFourOfCC, optInMccRequest.lastFourOfCC) && this.termsId == optInMccRequest.termsId && Intrinsics.e(this.birthDate, optInMccRequest.birthDate);
    }

    public int hashCode() {
        return (((((((this.firstName.hashCode() * 31) + this.lastName.hashCode()) * 31) + this.lastFourOfCC.hashCode()) * 31) + Long.hashCode(this.termsId)) * 31) + this.birthDate.hashCode();
    }

    public String toString() {
        return "OptInMccRequest(firstName=" + this.firstName + ", lastName=" + this.lastName + ", lastFourOfCC=" + this.lastFourOfCC + ", termsId=" + this.termsId + ", birthDate=" + this.birthDate + ')';
    }

    public OptInMccRequest(@g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "lastFourOfCC") String lastFourOfCC, @g(name = "termsId") long j10, @g(name = "birthDate") String birthDate) {
        Intrinsics.j(firstName, "firstName");
        Intrinsics.j(lastName, "lastName");
        Intrinsics.j(lastFourOfCC, "lastFourOfCC");
        Intrinsics.j(birthDate, "birthDate");
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastFourOfCC = lastFourOfCC;
        this.termsId = j10;
        this.birthDate = birthDate;
    }

    /* renamed from: a, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    /* renamed from: b, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: c, reason: from getter */
    public final String getLastFourOfCC() {
        return this.lastFourOfCC;
    }

    /* renamed from: d, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: e, reason: from getter */
    public final long getTermsId() {
        return this.termsId;
    }
}
