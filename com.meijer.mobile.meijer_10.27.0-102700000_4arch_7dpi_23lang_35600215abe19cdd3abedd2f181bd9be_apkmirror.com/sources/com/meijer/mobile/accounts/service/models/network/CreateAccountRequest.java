package com.meijer.mobile.accounts.service.models.network;

import Cs.MeijerAccount;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u000e\u001a\u00020\r\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019\"\u0004\b \u0010\u001bR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b)\u0010\u001bR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0017\u001a\u0004\b*\u0010\u0019\"\u0004\b+\u0010\u001bR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0017\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0017\u001a\u0004\b.\u0010\u0019\"\u0004\b/\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\b\u001f\u00101R$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u00102\u001a\u0004\b(\u00103\"\u0004\b4\u00105¨\u00066"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/CreateAccountRequest;", "", "", "firstName", "lastName", "birthDate", "zip", "", "storeId", "email", "password", "phoneNumber", "pin", "", "enrollInPharmacy", "", "mperksCardNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Long;)V", "LCs/a;", "account", "(LCs/a;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "setFirstName", "(Ljava/lang/String;)V", "b", "e", "setLastName", "c", "setBirthDate", "k", "setZip", "I", "j", "()I", "setStoreId", "(I)V", "f", "setEmail", "g", "setPassword", "h", "setPhoneNumber", "i", "setPin", "Z", "()Z", "Ljava/lang/Long;", "()Ljava/lang/Long;", "setMperksCardNumber", "(Ljava/lang/Long;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CreateAccountRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String lastName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String birthDate;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String zip;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int storeId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String email;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String password;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String phoneNumber;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String pin;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean enrollInPharmacy;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Long mperksCardNumber;

    public CreateAccountRequest(@g(name = "firstName") String str, @g(name = "lastName") String str2, @g(name = "birthDate") String str3, @g(name = "zip") String str4, @g(name = "storeId") int i10, @g(name = "email") String str5, @g(name = "password") String str6, @g(name = "phoneNumber") String str7, @g(name = "pin") String str8, @g(name = "enrollInPharmacy") boolean z10, @g(name = "LoyaltyCardNumber") Long l10) {
        this.firstName = str;
        this.lastName = str2;
        this.birthDate = str3;
        this.zip = str4;
        this.storeId = i10;
        this.email = str5;
        this.password = str6;
        this.phoneNumber = str7;
        this.pin = str8;
        this.enrollInPharmacy = z10;
        this.mperksCardNumber = l10;
    }

    /* renamed from: a, reason: from getter */
    public final String getBirthDate() {
        return this.birthDate;
    }

    /* renamed from: b, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getEnrollInPharmacy() {
        return this.enrollInPharmacy;
    }

    /* renamed from: d, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: e, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: f, reason: from getter */
    public final Long getMperksCardNumber() {
        return this.mperksCardNumber;
    }

    /* renamed from: g, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: h, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: i, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    /* renamed from: j, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: k, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    public /* synthetic */ CreateAccountRequest(String str, String str2, String str3, String str4, int i10, String str5, String str6, String str7, String str8, boolean z10, Long l10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, str4, i10, str5, str6, str7, str8, (i11 & 512) != 0 ? true : z10, l10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CreateAccountRequest(MeijerAccount account) {
        Intrinsics.j(account, "account");
        String firstName = account.getFirstName();
        String lastName = account.getLastName();
        String zip = account.getZip();
        int storeId = account.getStoreId();
        String email = account.getEmail();
        String password = account.getPassword();
        Long lValueOf = Long.valueOf(account.getMPerksPhone());
        lValueOf = lValueOf.longValue() == 0 ? null : lValueOf;
        String string = lValueOf != null ? lValueOf.toString() : null;
        String mPerksPin = account.getMPerksPin();
        Long lValueOf2 = Long.valueOf(account.getMperksCardNumber());
        this(firstName, lastName, null, zip, storeId, email, password, string, mPerksPin, false, lValueOf2.longValue() == 0 ? null : lValueOf2, 516, null);
    }
}
