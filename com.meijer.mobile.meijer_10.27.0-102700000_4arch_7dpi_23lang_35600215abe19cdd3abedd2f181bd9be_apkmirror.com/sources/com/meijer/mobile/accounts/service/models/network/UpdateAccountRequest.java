package com.meijer.mobile.accounts.service.models.network;

import Cs.MeijerAccount;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import j$.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vk.C17590a;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0013\u001a\u00020\n\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJÒ\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u000b\u001a\u00020\n2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0012\u001a\u00020\u00022\b\b\u0003\u0010\u0013\u001a\u00020\n2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0015\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b-\u0010\u001eR$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b+\u0010\u001e\"\u0004\b/\u00100R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010)\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b(\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u00106\u001a\u0004\b:\u00108R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b;\u0010\u001eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b:\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b9\u0010\u001eR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010&\u001a\u0004\b.\u0010'R\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b5\u00104\u001a\u0004\b3\u0010 R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b?\u0010)\u001a\u0004\b1\u0010\u001eR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b?\u0010\u001e¨\u0006@"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/UpdateAccountRequest;", "", "", "accountId", "", "firstName", "lastName", "email", "birthDate", "zip", "", "storeId", "accountStatus", "mPerksId", "mPerksPhone", "mPerksPin", "mPerksStoreId", "mPerkStatus", "employeeId", "employeeStoreId", "employeeStatus", "updatedBy", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;)V", "LCs/a;", "account", "(LCs/a;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JILjava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/UpdateAccountRequest;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "h", "c", "i", "d", "e", "setBirthDate", "(Ljava/lang/String;)V", "f", "q", "g", "I", "o", "Ljava/lang/Long;", "k", "()Ljava/lang/Long;", "j", "l", "m", "Ljava/lang/Integer;", "n", "()Ljava/lang/Integer;", "p", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class UpdateAccountRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long accountId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String birthDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountStatus;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long mPerksId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long mPerksPhone;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mPerksPin;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer mPerksStoreId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mPerkStatus;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final long employeeId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final int employeeStoreId;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final String employeeStatus;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updatedBy;

    public UpdateAccountRequest(@g(name = "accountId") long j10, @g(name = "firstName") String str, @g(name = "lastName") String str2, @g(name = "email") String str3, @g(name = "birthDate") String str4, @g(name = "zip") String str5, @g(name = "storeId") int i10, @g(name = "accountStatus") String str6, @g(name = "mPerksId") Long l10, @g(name = "mPerksPhone") Long l11, @g(name = "mPerksPin") String str7, @g(name = "mPerksStoreId") Integer num, @g(name = "mPerkStatus") String str8, @g(name = "employeeId") long j11, @g(name = "employeeStoreId") int i11, @g(name = "employeeStatus") String str9, @g(name = "updatedBy") String updatedBy) {
        Intrinsics.j(updatedBy, "updatedBy");
        this.accountId = j10;
        this.firstName = str;
        this.lastName = str2;
        this.email = str3;
        this.birthDate = str4;
        this.zip = str5;
        this.storeId = i10;
        this.accountStatus = str6;
        this.mPerksId = l10;
        this.mPerksPhone = l11;
        this.mPerksPin = str7;
        this.mPerksStoreId = num;
        this.mPerkStatus = str8;
        this.employeeId = j11;
        this.employeeStoreId = i11;
        this.employeeStatus = str9;
        this.updatedBy = updatedBy;
    }

    public final UpdateAccountRequest copy(@g(name = "accountId") long accountId, @g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "email") String email, @g(name = "birthDate") String birthDate, @g(name = "zip") String zip, @g(name = "storeId") int storeId, @g(name = "accountStatus") String accountStatus, @g(name = "mPerksId") Long mPerksId, @g(name = "mPerksPhone") Long mPerksPhone, @g(name = "mPerksPin") String mPerksPin, @g(name = "mPerksStoreId") Integer mPerksStoreId, @g(name = "mPerkStatus") String mPerkStatus, @g(name = "employeeId") long employeeId, @g(name = "employeeStoreId") int employeeStoreId, @g(name = "employeeStatus") String employeeStatus, @g(name = "updatedBy") String updatedBy) {
        Intrinsics.j(updatedBy, "updatedBy");
        return new UpdateAccountRequest(accountId, firstName, lastName, email, birthDate, zip, storeId, accountStatus, mPerksId, mPerksPhone, mPerksPin, mPerksStoreId, mPerkStatus, employeeId, employeeStoreId, employeeStatus, updatedBy);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateAccountRequest)) {
            return false;
        }
        UpdateAccountRequest updateAccountRequest = (UpdateAccountRequest) other;
        return this.accountId == updateAccountRequest.accountId && Intrinsics.e(this.firstName, updateAccountRequest.firstName) && Intrinsics.e(this.lastName, updateAccountRequest.lastName) && Intrinsics.e(this.email, updateAccountRequest.email) && Intrinsics.e(this.birthDate, updateAccountRequest.birthDate) && Intrinsics.e(this.zip, updateAccountRequest.zip) && this.storeId == updateAccountRequest.storeId && Intrinsics.e(this.accountStatus, updateAccountRequest.accountStatus) && Intrinsics.e(this.mPerksId, updateAccountRequest.mPerksId) && Intrinsics.e(this.mPerksPhone, updateAccountRequest.mPerksPhone) && Intrinsics.e(this.mPerksPin, updateAccountRequest.mPerksPin) && Intrinsics.e(this.mPerksStoreId, updateAccountRequest.mPerksStoreId) && Intrinsics.e(this.mPerkStatus, updateAccountRequest.mPerkStatus) && this.employeeId == updateAccountRequest.employeeId && this.employeeStoreId == updateAccountRequest.employeeStoreId && Intrinsics.e(this.employeeStatus, updateAccountRequest.employeeStatus) && Intrinsics.e(this.updatedBy, updateAccountRequest.updatedBy);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.accountId) * 31;
        String str = this.firstName;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.email;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.birthDate;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.zip;
        int iHashCode6 = (((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.storeId)) * 31;
        String str6 = this.accountStatus;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l10 = this.mPerksId;
        int iHashCode8 = (iHashCode7 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.mPerksPhone;
        int iHashCode9 = (iHashCode8 + (l11 == null ? 0 : l11.hashCode())) * 31;
        String str7 = this.mPerksPin;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.mPerksStoreId;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.mPerkStatus;
        int iHashCode12 = (((((iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31) + Long.hashCode(this.employeeId)) * 31) + Integer.hashCode(this.employeeStoreId)) * 31;
        String str9 = this.employeeStatus;
        return ((iHashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31) + this.updatedBy.hashCode();
    }

    public String toString() {
        return "UpdateAccountRequest(accountId=" + this.accountId + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", email=" + this.email + ", birthDate=" + this.birthDate + ", zip=" + this.zip + ", storeId=" + this.storeId + ", accountStatus=" + this.accountStatus + ", mPerksId=" + this.mPerksId + ", mPerksPhone=" + this.mPerksPhone + ", mPerksPin=" + this.mPerksPin + ", mPerksStoreId=" + this.mPerksStoreId + ", mPerkStatus=" + this.mPerkStatus + ", employeeId=" + this.employeeId + ", employeeStoreId=" + this.employeeStoreId + ", employeeStatus=" + this.employeeStatus + ", updatedBy=" + this.updatedBy + ')';
    }

    /* renamed from: a, reason: from getter */
    public final long getAccountId() {
        return this.accountId;
    }

    /* renamed from: b, reason: from getter */
    public final String getAccountStatus() {
        return this.accountStatus;
    }

    /* renamed from: c, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    /* renamed from: d, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: e, reason: from getter */
    public final long getEmployeeId() {
        return this.employeeId;
    }

    /* renamed from: f, reason: from getter */
    public final String getEmployeeStatus() {
        return this.employeeStatus;
    }

    /* renamed from: g, reason: from getter */
    public final int getEmployeeStoreId() {
        return this.employeeStoreId;
    }

    /* renamed from: h, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: i, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: j, reason: from getter */
    public final String getMPerkStatus() {
        return this.mPerkStatus;
    }

    /* renamed from: k, reason: from getter */
    public final Long getMPerksId() {
        return this.mPerksId;
    }

    /* renamed from: l, reason: from getter */
    public final Long getMPerksPhone() {
        return this.mPerksPhone;
    }

    /* renamed from: m, reason: from getter */
    public final String getMPerksPin() {
        return this.mPerksPin;
    }

    /* renamed from: n, reason: from getter */
    public final Integer getMPerksStoreId() {
        return this.mPerksStoreId;
    }

    /* renamed from: o, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: p, reason: from getter */
    public final String getUpdatedBy() {
        return this.updatedBy;
    }

    /* renamed from: q, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    public /* synthetic */ UpdateAccountRequest(long j10, String str, String str2, String str3, String str4, String str5, int i10, String str6, Long l10, Long l11, String str7, Integer num, String str8, long j11, int i11, String str9, String str10, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str, str2, str3, (i12 & 16) != 0 ? null : str4, str5, i10, str6, l10, l11, str7, num, str8, j11, i11, str9, str10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UpdateAccountRequest(MeijerAccount account) {
        Intrinsics.j(account, "account");
        long id2 = account.getId();
        String firstName = account.getFirstName();
        String lastName = account.getLastName();
        LocalDate birthDate = account.getBirthDate();
        String str = birthDate != null ? birthDate.format(C17590a.ISO_LOCAL_DATE) : null;
        String zip = account.getZip();
        int storeId = account.getStoreId();
        String email = account.getEmail();
        String accountStatus = account.getAccountStatus();
        Long lValueOf = Long.valueOf(account.getMPerksId());
        lValueOf = lValueOf.longValue() <= 0 ? null : lValueOf;
        Long lValueOf2 = Long.valueOf(account.getMPerksPhone());
        lValueOf2 = lValueOf2.longValue() <= 0 ? null : lValueOf2;
        Integer numValueOf = Integer.valueOf(account.getMPerksStoreId());
        this(id2, firstName, lastName, email, str, zip, storeId, accountStatus, lValueOf, lValueOf2, account.getMPerksPin(), numValueOf.intValue() <= 0 ? null : numValueOf, account.getMPerkStatus(), account.getEmployeeId(), account.getEmployeeStoreId(), account.getEmployeeStatus(), String.valueOf(account.getId()));
    }
}
