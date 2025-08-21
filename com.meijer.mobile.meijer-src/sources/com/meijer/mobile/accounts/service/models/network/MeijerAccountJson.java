package com.meijer.mobile.accounts.service.models.network;

import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bß\u0002\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0011\u001a\u00020\t\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u001b\u001a\u00020\t\u0012\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u001d\u001a\u00020\t\u0012\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b#\u0010$Jè\u0002\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u000f\u001a\u00020\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0011\u001a\u00020\t2\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0017\u001a\u00020\u00022\b\b\u0003\u0010\u0018\u001a\u00020\u00022\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u001a\u001a\u00020\u00022\b\b\u0003\u0010\u001b\u001a\u00020\t2\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u001d\u001a\u00020\t2\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u0010(R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b4\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b5\u0010(R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b6\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b7\u00109R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b:\u00103\u001a\u0004\b:\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b;\u00109R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b<\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b=\u00103\u001a\u0004\b=\u0010(R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u00100\u001a\u0004\b>\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b?\u00103\u001a\u0004\b?\u0010(R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b@\u0010*R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bB\u00103\u001a\u0004\bB\u0010(R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bC\u00103\u001a\u0004\bC\u0010(R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bD\u0010FR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bG\u00103\u001a\u0004\bG\u0010(R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bH\u00103\u001a\u0004\bH\u0010(R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u00100\u001a\u0004\bI\u00101R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u00100\u001a\u0004\bJ\u00101R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bK\u00103\u001a\u0004\bK\u0010(R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u00100\u001a\u0004\bL\u00101R\u0017\u0010\u001b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bM\u0010A\u001a\u0004\bM\u0010*R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bN\u00103\u001a\u0004\bN\u0010(R\u0017\u0010\u001d\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bO\u0010A\u001a\u0004\bO\u0010*R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bP\u00103\u001a\u0004\bP\u0010(R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bQ\u00103\u001a\u0004\bQ\u0010(R\u0019\u0010 \u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bR\u00103\u001a\u0004\bR\u0010(R\u0019\u0010!\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bS\u00103\u001a\u0004\bS\u0010(R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bT\u00103\u001a\u0004\bT\u0010(¨\u0006U"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/MeijerAccountJson;", "", "", "accountId", "", "accountStatus", "birthDate", "createdBy", "createdDate", "", "eGuestId", "eGuestStatus", "ePanelId", "ePanelStatus", "email", "employeeId", "employeeStatus", "employeeStoreId", "firstName", "lastName", "loyaltyCardNumber", "mPerkStatus", "mPerksExternalShopperId", "mPerksId", "mPerksPhone", "mPerksPin", "mPerksShopperId", "mPerksStoreId", "password", "storeId", "updatedBy", "updatedDate", "upgradeEmail", "vehicleInformation", "zip", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;JILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;JILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/MeijerAccountJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "c", "d", "e", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "g", "h", "i", "j", "k", "l", "m", "I", "n", "o", "p", "Ljava/lang/Long;", "()Ljava/lang/Long;", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MeijerAccountJson {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updatedDate;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final String upgradeEmail;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final String vehicleInformation;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final String zip;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long accountId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String accountStatus;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String birthDate;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String createdBy;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String createdDate;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer eGuestId;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String eGuestStatus;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer ePanelId;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String ePanelStatus;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final long employeeId;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String employeeStatus;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final int employeeStoreId;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final String firstName;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lastName;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long loyaltyCardNumber;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mPerkStatus;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mPerksExternalShopperId;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final long mPerksId;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final long mPerksPhone;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mPerksPin;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final long mPerksShopperId;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final int mPerksStoreId;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final String password;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final String updatedBy;

    public MeijerAccountJson() {
        this(0L, null, null, null, null, null, null, null, null, null, 0L, null, 0, null, null, null, null, null, 0L, 0L, null, 0L, 0, null, 0, null, null, null, null, null, 1073741823, null);
    }

    public final MeijerAccountJson copy(@g(name = "accountId") long accountId, @g(name = "accountStatus") String accountStatus, @g(name = "birthDate") String birthDate, @g(name = "createdBy") String createdBy, @g(name = "createdDate") String createdDate, @g(name = "eGuestId") Integer eGuestId, @g(name = "eGuestStatus") String eGuestStatus, @g(name = "ePanelId") Integer ePanelId, @g(name = "ePanelStatus") String ePanelStatus, @g(name = "email") String email, @g(name = "employeeId") long employeeId, @g(name = "employeeStatus") String employeeStatus, @g(name = "employeeStoreId") int employeeStoreId, @g(name = "firstName") String firstName, @g(name = "lastName") String lastName, @g(name = "loyaltyCardNumber") Long loyaltyCardNumber, @g(name = "mPerkStatus") String mPerkStatus, @g(name = "mPerksExternalShopperId") String mPerksExternalShopperId, @g(name = "mPerksId") long mPerksId, @g(name = "mPerksPhone") long mPerksPhone, @g(name = "mPerksPin") String mPerksPin, @g(name = "mPerksShopperId") long mPerksShopperId, @g(name = "mPerksStoreId") int mPerksStoreId, @g(name = "password") String password, @g(name = "storeId") int storeId, @g(name = "updatedBy") String updatedBy, @g(name = "updatedDate") String updatedDate, @g(name = "upgradeEmail") String upgradeEmail, @g(name = "vehicleInformation") String vehicleInformation, @g(name = "zip") String zip) {
        return new MeijerAccountJson(accountId, accountStatus, birthDate, createdBy, createdDate, eGuestId, eGuestStatus, ePanelId, ePanelStatus, email, employeeId, employeeStatus, employeeStoreId, firstName, lastName, loyaltyCardNumber, mPerkStatus, mPerksExternalShopperId, mPerksId, mPerksPhone, mPerksPin, mPerksShopperId, mPerksStoreId, password, storeId, updatedBy, updatedDate, upgradeEmail, vehicleInformation, zip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeijerAccountJson)) {
            return false;
        }
        MeijerAccountJson meijerAccountJson = (MeijerAccountJson) other;
        return this.accountId == meijerAccountJson.accountId && Intrinsics.e(this.accountStatus, meijerAccountJson.accountStatus) && Intrinsics.e(this.birthDate, meijerAccountJson.birthDate) && Intrinsics.e(this.createdBy, meijerAccountJson.createdBy) && Intrinsics.e(this.createdDate, meijerAccountJson.createdDate) && Intrinsics.e(this.eGuestId, meijerAccountJson.eGuestId) && Intrinsics.e(this.eGuestStatus, meijerAccountJson.eGuestStatus) && Intrinsics.e(this.ePanelId, meijerAccountJson.ePanelId) && Intrinsics.e(this.ePanelStatus, meijerAccountJson.ePanelStatus) && Intrinsics.e(this.email, meijerAccountJson.email) && this.employeeId == meijerAccountJson.employeeId && Intrinsics.e(this.employeeStatus, meijerAccountJson.employeeStatus) && this.employeeStoreId == meijerAccountJson.employeeStoreId && Intrinsics.e(this.firstName, meijerAccountJson.firstName) && Intrinsics.e(this.lastName, meijerAccountJson.lastName) && Intrinsics.e(this.loyaltyCardNumber, meijerAccountJson.loyaltyCardNumber) && Intrinsics.e(this.mPerkStatus, meijerAccountJson.mPerkStatus) && Intrinsics.e(this.mPerksExternalShopperId, meijerAccountJson.mPerksExternalShopperId) && this.mPerksId == meijerAccountJson.mPerksId && this.mPerksPhone == meijerAccountJson.mPerksPhone && Intrinsics.e(this.mPerksPin, meijerAccountJson.mPerksPin) && this.mPerksShopperId == meijerAccountJson.mPerksShopperId && this.mPerksStoreId == meijerAccountJson.mPerksStoreId && Intrinsics.e(this.password, meijerAccountJson.password) && this.storeId == meijerAccountJson.storeId && Intrinsics.e(this.updatedBy, meijerAccountJson.updatedBy) && Intrinsics.e(this.updatedDate, meijerAccountJson.updatedDate) && Intrinsics.e(this.upgradeEmail, meijerAccountJson.upgradeEmail) && Intrinsics.e(this.vehicleInformation, meijerAccountJson.vehicleInformation) && Intrinsics.e(this.zip, meijerAccountJson.zip);
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.accountId) * 31;
        String str = this.accountStatus;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.birthDate;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.createdBy;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.createdDate;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.eGuestId;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.eGuestStatus;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.ePanelId;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.ePanelStatus;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.email;
        int iHashCode10 = (((iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31) + Long.hashCode(this.employeeId)) * 31;
        String str8 = this.employeeStatus;
        int iHashCode11 = (((iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31) + Integer.hashCode(this.employeeStoreId)) * 31;
        String str9 = this.firstName;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.lastName;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l10 = this.loyaltyCardNumber;
        int iHashCode14 = (iHashCode13 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str11 = this.mPerkStatus;
        int iHashCode15 = (iHashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.mPerksExternalShopperId;
        int iHashCode16 = (((((iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31) + Long.hashCode(this.mPerksId)) * 31) + Long.hashCode(this.mPerksPhone)) * 31;
        String str13 = this.mPerksPin;
        int iHashCode17 = (((((iHashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31) + Long.hashCode(this.mPerksShopperId)) * 31) + Integer.hashCode(this.mPerksStoreId)) * 31;
        String str14 = this.password;
        int iHashCode18 = (((iHashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31) + Integer.hashCode(this.storeId)) * 31;
        String str15 = this.updatedBy;
        int iHashCode19 = (iHashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.updatedDate;
        int iHashCode20 = (iHashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.upgradeEmail;
        int iHashCode21 = (iHashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.vehicleInformation;
        int iHashCode22 = (iHashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.zip;
        return iHashCode22 + (str19 != null ? str19.hashCode() : 0);
    }

    public String toString() {
        return "MeijerAccountJson(accountId=" + this.accountId + ", accountStatus=" + this.accountStatus + ", birthDate=" + this.birthDate + ", createdBy=" + this.createdBy + ", createdDate=" + this.createdDate + ", eGuestId=" + this.eGuestId + ", eGuestStatus=" + this.eGuestStatus + ", ePanelId=" + this.ePanelId + ", ePanelStatus=" + this.ePanelStatus + ", email=" + this.email + ", employeeId=" + this.employeeId + ", employeeStatus=" + this.employeeStatus + ", employeeStoreId=" + this.employeeStoreId + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", loyaltyCardNumber=" + this.loyaltyCardNumber + ", mPerkStatus=" + this.mPerkStatus + ", mPerksExternalShopperId=" + this.mPerksExternalShopperId + ", mPerksId=" + this.mPerksId + ", mPerksPhone=" + this.mPerksPhone + ", mPerksPin=" + this.mPerksPin + ", mPerksShopperId=" + this.mPerksShopperId + ", mPerksStoreId=" + this.mPerksStoreId + ", password=" + this.password + ", storeId=" + this.storeId + ", updatedBy=" + this.updatedBy + ", updatedDate=" + this.updatedDate + ", upgradeEmail=" + this.upgradeEmail + ", vehicleInformation=" + this.vehicleInformation + ", zip=" + this.zip + ')';
    }

    public MeijerAccountJson(@g(name = "accountId") long j10, @g(name = "accountStatus") String str, @g(name = "birthDate") String str2, @g(name = "createdBy") String str3, @g(name = "createdDate") String str4, @g(name = "eGuestId") Integer num, @g(name = "eGuestStatus") String str5, @g(name = "ePanelId") Integer num2, @g(name = "ePanelStatus") String str6, @g(name = "email") String str7, @g(name = "employeeId") long j11, @g(name = "employeeStatus") String str8, @g(name = "employeeStoreId") int i10, @g(name = "firstName") String str9, @g(name = "lastName") String str10, @g(name = "loyaltyCardNumber") Long l10, @g(name = "mPerkStatus") String str11, @g(name = "mPerksExternalShopperId") String str12, @g(name = "mPerksId") long j12, @g(name = "mPerksPhone") long j13, @g(name = "mPerksPin") String str13, @g(name = "mPerksShopperId") long j14, @g(name = "mPerksStoreId") int i11, @g(name = "password") String str14, @g(name = "storeId") int i12, @g(name = "updatedBy") String str15, @g(name = "updatedDate") String str16, @g(name = "upgradeEmail") String str17, @g(name = "vehicleInformation") String str18, @g(name = "zip") String str19) {
        this.accountId = j10;
        this.accountStatus = str;
        this.birthDate = str2;
        this.createdBy = str3;
        this.createdDate = str4;
        this.eGuestId = num;
        this.eGuestStatus = str5;
        this.ePanelId = num2;
        this.ePanelStatus = str6;
        this.email = str7;
        this.employeeId = j11;
        this.employeeStatus = str8;
        this.employeeStoreId = i10;
        this.firstName = str9;
        this.lastName = str10;
        this.loyaltyCardNumber = l10;
        this.mPerkStatus = str11;
        this.mPerksExternalShopperId = str12;
        this.mPerksId = j12;
        this.mPerksPhone = j13;
        this.mPerksPin = str13;
        this.mPerksShopperId = j14;
        this.mPerksStoreId = i11;
        this.password = str14;
        this.storeId = i12;
        this.updatedBy = str15;
        this.updatedDate = str16;
        this.upgradeEmail = str17;
        this.vehicleInformation = str18;
        this.zip = str19;
    }

    /* renamed from: A, reason: from getter */
    public final String getUpdatedDate() {
        return this.updatedDate;
    }

    /* renamed from: B, reason: from getter */
    public final String getUpgradeEmail() {
        return this.upgradeEmail;
    }

    /* renamed from: C, reason: from getter */
    public final String getVehicleInformation() {
        return this.vehicleInformation;
    }

    /* renamed from: D, reason: from getter */
    public final String getZip() {
        return this.zip;
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
    public final String getCreatedBy() {
        return this.createdBy;
    }

    /* renamed from: e, reason: from getter */
    public final String getCreatedDate() {
        return this.createdDate;
    }

    /* renamed from: f, reason: from getter */
    public final Integer getEGuestId() {
        return this.eGuestId;
    }

    /* renamed from: g, reason: from getter */
    public final String getEGuestStatus() {
        return this.eGuestStatus;
    }

    /* renamed from: h, reason: from getter */
    public final Integer getEPanelId() {
        return this.ePanelId;
    }

    /* renamed from: i, reason: from getter */
    public final String getEPanelStatus() {
        return this.ePanelStatus;
    }

    /* renamed from: j, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: k, reason: from getter */
    public final long getEmployeeId() {
        return this.employeeId;
    }

    /* renamed from: l, reason: from getter */
    public final String getEmployeeStatus() {
        return this.employeeStatus;
    }

    /* renamed from: m, reason: from getter */
    public final int getEmployeeStoreId() {
        return this.employeeStoreId;
    }

    /* renamed from: n, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: o, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: p, reason: from getter */
    public final Long getLoyaltyCardNumber() {
        return this.loyaltyCardNumber;
    }

    /* renamed from: q, reason: from getter */
    public final String getMPerkStatus() {
        return this.mPerkStatus;
    }

    /* renamed from: r, reason: from getter */
    public final String getMPerksExternalShopperId() {
        return this.mPerksExternalShopperId;
    }

    /* renamed from: s, reason: from getter */
    public final long getMPerksId() {
        return this.mPerksId;
    }

    /* renamed from: t, reason: from getter */
    public final long getMPerksPhone() {
        return this.mPerksPhone;
    }

    /* renamed from: u, reason: from getter */
    public final String getMPerksPin() {
        return this.mPerksPin;
    }

    /* renamed from: v, reason: from getter */
    public final long getMPerksShopperId() {
        return this.mPerksShopperId;
    }

    /* renamed from: w, reason: from getter */
    public final int getMPerksStoreId() {
        return this.mPerksStoreId;
    }

    /* renamed from: x, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: y, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: z, reason: from getter */
    public final String getUpdatedBy() {
        return this.updatedBy;
    }

    public /* synthetic */ MeijerAccountJson(long j10, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, String str6, String str7, long j11, String str8, int i10, String str9, String str10, Long l10, String str11, String str12, long j12, long j13, String str13, long j14, int i11, String str14, int i12, String str15, String str16, String str17, String str18, String str19, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0L : j10, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? null : str5, (i13 & 128) != 0 ? null : num2, (i13 & 256) != 0 ? null : str6, (i13 & 512) != 0 ? null : str7, (i13 & 1024) != 0 ? 0L : j11, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str8, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? 0 : i10, (i13 & 8192) != 0 ? null : str9, (i13 & 16384) != 0 ? null : str10, (i13 & 32768) != 0 ? null : l10, (i13 & 65536) != 0 ? null : str11, (i13 & 131072) != 0 ? null : str12, (i13 & 262144) != 0 ? 0L : j12, (i13 & 524288) != 0 ? 0L : j13, (i13 & 1048576) != 0 ? null : str13, (i13 & 2097152) != 0 ? 0L : j14, (i13 & 4194304) != 0 ? 0 : i11, (i13 & 8388608) != 0 ? null : str14, (i13 & 16777216) == 0 ? i12 : 0, (i13 & 33554432) != 0 ? null : str15, (i13 & 67108864) != 0 ? null : str16, (i13 & 134217728) != 0 ? null : str17, (i13 & 268435456) != 0 ? null : str18, (i13 & 536870912) != 0 ? null : str19);
    }
}
