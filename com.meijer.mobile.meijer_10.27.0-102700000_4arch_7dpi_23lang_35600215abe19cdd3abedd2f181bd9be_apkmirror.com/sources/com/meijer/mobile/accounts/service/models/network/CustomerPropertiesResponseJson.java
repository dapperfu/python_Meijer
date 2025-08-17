package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/CustomerPropertiesResponseJson;", "", "", "hasEmailVerified", "isAdmin", "", "savingsSinceDate", "<init>", "(ZZLjava/lang/String;)V", "copy", "(ZZLjava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/CustomerPropertiesResponseJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "setHasEmailVerified", "(Z)V", "b", "c", "setAdmin", "Ljava/lang/String;", "setSavingsSinceDate$service_release", "(Ljava/lang/String;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CustomerPropertiesResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean hasEmailVerified;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isAdmin;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String savingsSinceDate;

    public CustomerPropertiesResponseJson() {
        this(false, false, null, 7, null);
    }

    public final CustomerPropertiesResponseJson copy(@g(name = "hasEmailVerified") boolean hasEmailVerified, @g(name = "isAdmin") boolean isAdmin, @g(name = "savingsSinceDate") String savingsSinceDate) {
        return new CustomerPropertiesResponseJson(hasEmailVerified, isAdmin, savingsSinceDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerPropertiesResponseJson)) {
            return false;
        }
        CustomerPropertiesResponseJson customerPropertiesResponseJson = (CustomerPropertiesResponseJson) other;
        return this.hasEmailVerified == customerPropertiesResponseJson.hasEmailVerified && this.isAdmin == customerPropertiesResponseJson.isAdmin && Intrinsics.e(this.savingsSinceDate, customerPropertiesResponseJson.savingsSinceDate);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.hasEmailVerified) * 31) + Boolean.hashCode(this.isAdmin)) * 31;
        String str = this.savingsSinceDate;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "CustomerPropertiesResponseJson(hasEmailVerified=" + this.hasEmailVerified + ", isAdmin=" + this.isAdmin + ", savingsSinceDate=" + this.savingsSinceDate + ')';
    }

    public CustomerPropertiesResponseJson(@g(name = "hasEmailVerified") boolean z10, @g(name = "isAdmin") boolean z11, @g(name = "savingsSinceDate") String str) {
        this.hasEmailVerified = z10;
        this.isAdmin = z11;
        this.savingsSinceDate = str;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getHasEmailVerified() {
        return this.hasEmailVerified;
    }

    /* renamed from: b, reason: from getter */
    public final String getSavingsSinceDate() {
        return this.savingsSinceDate;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsAdmin() {
        return this.isAdmin;
    }

    public /* synthetic */ CustomerPropertiesResponseJson(boolean z10, boolean z11, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? null : str);
    }
}
