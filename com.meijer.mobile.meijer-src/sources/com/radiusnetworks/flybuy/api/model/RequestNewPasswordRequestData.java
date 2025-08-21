package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/RequestNewPasswordRequestData;", "", "email", "", "(Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RequestNewPasswordRequestData {
    private final String email;

    public static /* synthetic */ RequestNewPasswordRequestData copy$default(RequestNewPasswordRequestData requestNewPasswordRequestData, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = requestNewPasswordRequestData.email;
        }
        return requestNewPasswordRequestData.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final RequestNewPasswordRequestData copy(String email) {
        Intrinsics.j(email, "email");
        return new RequestNewPasswordRequestData(email);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RequestNewPasswordRequestData) && Intrinsics.e(this.email, ((RequestNewPasswordRequestData) other).email);
    }

    public int hashCode() {
        return this.email.hashCode();
    }

    public String toString() {
        return "RequestNewPasswordRequestData(email=" + this.email + ')';
    }

    public RequestNewPasswordRequestData(String email) {
        Intrinsics.j(email, "email");
        this.email = email;
    }

    public final String getEmail() {
        return this.email;
    }
}
