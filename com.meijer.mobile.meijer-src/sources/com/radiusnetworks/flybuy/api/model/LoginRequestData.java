package com.radiusnetworks.flybuy.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/LoginRequestData;", "", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPassword", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LoginRequestData {
    private final String email;
    private final String password;

    public static /* synthetic */ LoginRequestData copy$default(LoginRequestData loginRequestData, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = loginRequestData.email;
        }
        if ((i10 & 2) != 0) {
            str2 = loginRequestData.password;
        }
        return loginRequestData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public final LoginRequestData copy(String email, String password) {
        Intrinsics.j(email, "email");
        Intrinsics.j(password, "password");
        return new LoginRequestData(email, password);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginRequestData)) {
            return false;
        }
        LoginRequestData loginRequestData = (LoginRequestData) other;
        return Intrinsics.e(this.email, loginRequestData.email) && Intrinsics.e(this.password, loginRequestData.password);
    }

    public int hashCode() {
        return this.password.hashCode() + (this.email.hashCode() * 31);
    }

    public String toString() {
        return "LoginRequestData(email=" + this.email + ", password=" + this.password + ')';
    }

    public LoginRequestData(String email, String password) {
        Intrinsics.j(email, "email");
        Intrinsics.j(password, "password");
        this.email = email;
        this.password = password;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }
}
