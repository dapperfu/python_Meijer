package com.radiusnetworks.flybuy.api.model;

import com.radiusnetworks.flybuy.api.mapbox.model.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/SignUpRequestData;", "", "email", "", "password", "passwordConfirmation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getPassword", "getPasswordConfirmation", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SignUpRequestData {
    private final String email;
    private final String password;

    @InterfaceC15617c("password_confirmation")
    private final String passwordConfirmation;

    public SignUpRequestData(String email, String password, String passwordConfirmation) {
        Intrinsics.j(email, "email");
        Intrinsics.j(password, "password");
        Intrinsics.j(passwordConfirmation, "passwordConfirmation");
        this.email = email;
        this.password = password;
        this.passwordConfirmation = passwordConfirmation;
    }

    public static /* synthetic */ SignUpRequestData copy$default(SignUpRequestData signUpRequestData, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = signUpRequestData.email;
        }
        if ((i10 & 2) != 0) {
            str2 = signUpRequestData.password;
        }
        if ((i10 & 4) != 0) {
            str3 = signUpRequestData.passwordConfirmation;
        }
        return signUpRequestData.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPasswordConfirmation() {
        return this.passwordConfirmation;
    }

    public final SignUpRequestData copy(String email, String password, String passwordConfirmation) {
        Intrinsics.j(email, "email");
        Intrinsics.j(password, "password");
        Intrinsics.j(passwordConfirmation, "passwordConfirmation");
        return new SignUpRequestData(email, password, passwordConfirmation);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignUpRequestData)) {
            return false;
        }
        SignUpRequestData signUpRequestData = (SignUpRequestData) other;
        return Intrinsics.e(this.email, signUpRequestData.email) && Intrinsics.e(this.password, signUpRequestData.password) && Intrinsics.e(this.passwordConfirmation, signUpRequestData.passwordConfirmation);
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getPasswordConfirmation() {
        return this.passwordConfirmation;
    }

    public String toString() {
        return "SignUpRequestData(email=" + this.email + ", password=" + this.password + ", passwordConfirmation=" + this.passwordConfirmation + ')';
    }

    public int hashCode() {
        return this.passwordConfirmation.hashCode() + a.a(this.password, this.email.hashCode() * 31, 31);
    }
}
