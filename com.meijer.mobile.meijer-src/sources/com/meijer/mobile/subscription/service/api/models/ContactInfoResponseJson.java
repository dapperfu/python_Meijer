package com.meijer.mobile.subscription.service.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\t\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00032\u0010\b\u0003\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u001f\u0010\u0006\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/ContactInfoResponseJson;", "", "", "Lcom/meijer/mobile/core/model/common/EmailAddress;", "contactEmail", "Lcom/meijer/mobile/core/model/common/PhoneNumber;", "contactPhone", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/subscription/service/api/models/ContactInfoResponseJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ContactInfoResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String contactEmail;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String contactPhone;

    /* JADX WARN: Multi-variable type inference failed */
    public ContactInfoResponseJson() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final ContactInfoResponseJson copy(@g(name = "contactEmail") String contactEmail, @g(name = "contactPhone") String contactPhone) {
        return new ContactInfoResponseJson(contactEmail, contactPhone);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactInfoResponseJson)) {
            return false;
        }
        ContactInfoResponseJson contactInfoResponseJson = (ContactInfoResponseJson) other;
        return Intrinsics.e(this.contactEmail, contactInfoResponseJson.contactEmail) && Intrinsics.e(this.contactPhone, contactInfoResponseJson.contactPhone);
    }

    public int hashCode() {
        String str = this.contactEmail;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.contactPhone;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ContactInfoResponseJson(contactEmail=" + this.contactEmail + ", contactPhone=" + this.contactPhone + ')';
    }

    public ContactInfoResponseJson(@g(name = "contactEmail") String str, @g(name = "contactPhone") String str2) {
        this.contactEmail = str;
        this.contactPhone = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getContactEmail() {
        return this.contactEmail;
    }

    /* renamed from: b, reason: from getter */
    public final String getContactPhone() {
        return this.contactPhone;
    }

    public /* synthetic */ ContactInfoResponseJson(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2);
    }
}
