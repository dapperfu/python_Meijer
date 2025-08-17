package com.radiusnetworks.flybuy.sdk.data.customer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/customer/LoginInfo;", "", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getPassword", "setPassword", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LoginInfo {
    private String email;
    private String password;

    /* JADX WARN: Multi-variable type inference failed */
    public LoginInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LoginInfo copy$default(LoginInfo loginInfo, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = loginInfo.email;
        }
        if ((i10 & 2) != 0) {
            str2 = loginInfo.password;
        }
        return loginInfo.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public final LoginInfo copy(String email, String password) {
        Intrinsics.j(email, "email");
        Intrinsics.j(password, "password");
        return new LoginInfo(email, password);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginInfo)) {
            return false;
        }
        LoginInfo loginInfo = (LoginInfo) other;
        return Intrinsics.e(this.email, loginInfo.email) && Intrinsics.e(this.password, loginInfo.password);
    }

    public int hashCode() {
        return this.password.hashCode() + (this.email.hashCode() * 31);
    }

    public String toString() {
        return "LoginInfo(email=" + this.email + ", password=" + this.password + ')';
    }

    public LoginInfo(String email, String password) {
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

    public final void setEmail(String str) {
        Intrinsics.j(str, "<set-?>");
        this.email = str;
    }

    public final void setPassword(String str) {
        Intrinsics.j(str, "<set-?>");
        this.password = str;
    }

    public /* synthetic */ LoginInfo(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2);
    }
}
