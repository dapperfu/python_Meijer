package com.radiusnetworks.flybuy.api.model;

import com.radiusnetworks.flybuy.api.mapbox.model.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import og.InterfaceC16127c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/SetNewPasswordRequestData;", "", "resetPasswordToken", "", "password", "confirmation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getConfirmation", "()Ljava/lang/String;", "getPassword", "getResetPasswordToken", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SetNewPasswordRequestData {
    private final String confirmation;
    private final String password;

    @InterfaceC16127c("reset_password_token")
    private final String resetPasswordToken;

    public static /* synthetic */ SetNewPasswordRequestData copy$default(SetNewPasswordRequestData setNewPasswordRequestData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = setNewPasswordRequestData.resetPasswordToken;
        }
        if ((i10 & 2) != 0) {
            str2 = setNewPasswordRequestData.password;
        }
        if ((i10 & 4) != 0) {
            str3 = setNewPasswordRequestData.confirmation;
        }
        return setNewPasswordRequestData.copy(str, str2, str3);
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
    public final String getConfirmation() {
        return this.confirmation;
    }

    public final SetNewPasswordRequestData copy(String resetPasswordToken, String password, String confirmation) {
        Intrinsics.j(resetPasswordToken, "resetPasswordToken");
        Intrinsics.j(password, "password");
        Intrinsics.j(confirmation, "confirmation");
        return new SetNewPasswordRequestData(resetPasswordToken, password, confirmation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetNewPasswordRequestData)) {
            return false;
        }
        SetNewPasswordRequestData setNewPasswordRequestData = (SetNewPasswordRequestData) other;
        return Intrinsics.e(this.resetPasswordToken, setNewPasswordRequestData.resetPasswordToken) && Intrinsics.e(this.password, setNewPasswordRequestData.password) && Intrinsics.e(this.confirmation, setNewPasswordRequestData.confirmation);
    }

    public String toString() {
        return "SetNewPasswordRequestData(resetPasswordToken=" + this.resetPasswordToken + ", password=" + this.password + ", confirmation=" + this.confirmation + ')';
    }

    public SetNewPasswordRequestData(String resetPasswordToken, String password, String confirmation) {
        Intrinsics.j(resetPasswordToken, "resetPasswordToken");
        Intrinsics.j(password, "password");
        Intrinsics.j(confirmation, "confirmation");
        this.resetPasswordToken = resetPasswordToken;
        this.password = password;
        this.confirmation = confirmation;
    }

    public final String getConfirmation() {
        return this.confirmation;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getResetPasswordToken() {
        return this.resetPasswordToken;
    }

    public int hashCode() {
        return this.confirmation.hashCode() + a.a(this.password, this.resetPasswordToken.hashCode() * 31, 31);
    }
}
