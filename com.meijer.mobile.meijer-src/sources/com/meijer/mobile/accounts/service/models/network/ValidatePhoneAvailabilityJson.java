package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0014\u0010\u0015R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/ValidatePhoneAvailabilityJson;", "", "", "conflictType", "", "name", "<init>", "(ILjava/lang/String;)V", "copy", "(ILjava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/ValidatePhoneAvailabilityJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "setConflictType", "(I)V", "b", "Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ValidatePhoneAvailabilityJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private int conflictType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String name;

    public ValidatePhoneAvailabilityJson(@g(name = "conflictType") int i10, @g(name = "name") String str) {
        this.conflictType = i10;
        this.name = str;
    }

    public final ValidatePhoneAvailabilityJson copy(@g(name = "conflictType") int conflictType, @g(name = "name") String name) {
        return new ValidatePhoneAvailabilityJson(conflictType, name);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidatePhoneAvailabilityJson)) {
            return false;
        }
        ValidatePhoneAvailabilityJson validatePhoneAvailabilityJson = (ValidatePhoneAvailabilityJson) other;
        return this.conflictType == validatePhoneAvailabilityJson.conflictType && Intrinsics.e(this.name, validatePhoneAvailabilityJson.name);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.conflictType) * 31;
        String str = this.name;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ValidatePhoneAvailabilityJson(conflictType=" + this.conflictType + ", name=" + this.name + ')';
    }

    /* renamed from: a, reason: from getter */
    public final int getConflictType() {
        return this.conflictType;
    }

    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public /* synthetic */ ValidatePhoneAvailabilityJson(int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str);
    }
}
