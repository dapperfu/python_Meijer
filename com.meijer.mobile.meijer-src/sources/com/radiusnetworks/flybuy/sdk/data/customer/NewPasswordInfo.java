package com.radiusnetworks.flybuy.sdk.data.customer;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/data/customer/NewPasswordInfo;", "", "resetPasswordToken", "", "password", "confirmPassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConfirmPassword", "()Ljava/lang/String;", "setConfirmPassword", "(Ljava/lang/String;)V", "getPassword", "setPassword", "getResetPasswordToken", "setResetPasswordToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class NewPasswordInfo {
    private String confirmPassword;
    private String password;
    private String resetPasswordToken;

    public NewPasswordInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ NewPasswordInfo copy$default(NewPasswordInfo newPasswordInfo, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = newPasswordInfo.resetPasswordToken;
        }
        if ((i10 & 2) != 0) {
            str2 = newPasswordInfo.password;
        }
        if ((i10 & 4) != 0) {
            str3 = newPasswordInfo.confirmPassword;
        }
        return newPasswordInfo.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getResetPasswordToken() {
        return this.resetPasswordToken;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: component3, reason: from getter */
    public final String getConfirmPassword() {
        return this.confirmPassword;
    }

    public final NewPasswordInfo copy(String resetPasswordToken, String password, String confirmPassword) {
        Intrinsics.j(resetPasswordToken, "resetPasswordToken");
        Intrinsics.j(password, "password");
        Intrinsics.j(confirmPassword, "confirmPassword");
        return new NewPasswordInfo(resetPasswordToken, password, confirmPassword);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewPasswordInfo)) {
            return false;
        }
        NewPasswordInfo newPasswordInfo = (NewPasswordInfo) other;
        return Intrinsics.e(this.resetPasswordToken, newPasswordInfo.resetPasswordToken) && Intrinsics.e(this.password, newPasswordInfo.password) && Intrinsics.e(this.confirmPassword, newPasswordInfo.confirmPassword);
    }

    public int hashCode() {
        return this.confirmPassword.hashCode() + ((this.password.hashCode() + (this.resetPasswordToken.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "NewPasswordInfo(resetPasswordToken=" + this.resetPasswordToken + ", password=" + this.password + ", confirmPassword=" + this.confirmPassword + ')';
    }

    public NewPasswordInfo(String resetPasswordToken, String password, String confirmPassword) {
        Intrinsics.j(resetPasswordToken, "resetPasswordToken");
        Intrinsics.j(password, "password");
        Intrinsics.j(confirmPassword, "confirmPassword");
        this.resetPasswordToken = resetPasswordToken;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public final String getConfirmPassword() {
        return this.confirmPassword;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getResetPasswordToken() {
        return this.resetPasswordToken;
    }

    public final void setConfirmPassword(String str) {
        Intrinsics.j(str, "<set-?>");
        this.confirmPassword = str;
    }

    public final void setPassword(String str) {
        Intrinsics.j(str, "<set-?>");
        this.password = str;
    }

    public final void setResetPasswordToken(String str) {
        Intrinsics.j(str, "<set-?>");
        this.resetPasswordToken = str;
    }

    public /* synthetic */ NewPasswordInfo(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3);
    }
}
