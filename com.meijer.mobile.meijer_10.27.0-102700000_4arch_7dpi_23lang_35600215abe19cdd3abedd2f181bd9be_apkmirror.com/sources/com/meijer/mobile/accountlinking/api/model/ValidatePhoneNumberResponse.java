package com.meijer.mobile.accountlinking.api.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJF\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/accountlinking/api/model/ValidatePhoneNumberResponse;", "", "", "isValid", "isTextable", "deviceType", "description", "errorMsg", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/accountlinking/api/model/ValidatePhoneNumberResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "d", "c", "accountlinking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ValidatePhoneNumberResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isValid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String isTextable;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deviceType;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMsg;

    public ValidatePhoneNumberResponse(@g(name = "isValid") String isValid, @g(name = "isTextable") String isTextable, @g(name = "deviceType") String deviceType, @g(name = "description") String str, @g(name = "errorMsg") String str2) {
        Intrinsics.j(isValid, "isValid");
        Intrinsics.j(isTextable, "isTextable");
        Intrinsics.j(deviceType, "deviceType");
        this.isValid = isValid;
        this.isTextable = isTextable;
        this.deviceType = deviceType;
        this.description = str;
        this.errorMsg = str2;
    }

    public final ValidatePhoneNumberResponse copy(@g(name = "isValid") String isValid, @g(name = "isTextable") String isTextable, @g(name = "deviceType") String deviceType, @g(name = "description") String description, @g(name = "errorMsg") String errorMsg) {
        Intrinsics.j(isValid, "isValid");
        Intrinsics.j(isTextable, "isTextable");
        Intrinsics.j(deviceType, "deviceType");
        return new ValidatePhoneNumberResponse(isValid, isTextable, deviceType, description, errorMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ValidatePhoneNumberResponse)) {
            return false;
        }
        ValidatePhoneNumberResponse validatePhoneNumberResponse = (ValidatePhoneNumberResponse) other;
        return Intrinsics.e(this.isValid, validatePhoneNumberResponse.isValid) && Intrinsics.e(this.isTextable, validatePhoneNumberResponse.isTextable) && Intrinsics.e(this.deviceType, validatePhoneNumberResponse.deviceType) && Intrinsics.e(this.description, validatePhoneNumberResponse.description) && Intrinsics.e(this.errorMsg, validatePhoneNumberResponse.errorMsg);
    }

    public int hashCode() {
        int iHashCode = ((((this.isValid.hashCode() * 31) + this.isTextable.hashCode()) * 31) + this.deviceType.hashCode()) * 31;
        String str = this.description;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.errorMsg;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ValidatePhoneNumberResponse(isValid=" + this.isValid + ", isTextable=" + this.isTextable + ", deviceType=" + this.deviceType + ", description=" + this.description + ", errorMsg=" + this.errorMsg + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final String getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: c, reason: from getter */
    public final String getErrorMsg() {
        return this.errorMsg;
    }

    /* renamed from: d, reason: from getter */
    public final String getIsTextable() {
        return this.isTextable;
    }

    /* renamed from: e, reason: from getter */
    public final String getIsValid() {
        return this.isValid;
    }

    public /* synthetic */ ValidatePhoneNumberResponse(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}
