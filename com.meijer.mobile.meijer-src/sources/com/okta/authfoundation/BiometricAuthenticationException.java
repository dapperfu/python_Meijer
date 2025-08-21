package com.okta.authfoundation;

import java.security.GeneralSecurityException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/okta/authfoundation/BiometricAuthenticationException;", "Ljava/security/GeneralSecurityException;", "", "message", "Lcom/okta/authfoundation/a;", "biometricExceptionDetails", "<init>", "(Ljava/lang/String;Lcom/okta/authfoundation/a;)V", "a", "Lcom/okta/authfoundation/a;", "getBiometricExceptionDetails", "()Lcom/okta/authfoundation/a;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BiometricAuthenticationException extends GeneralSecurityException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a biometricExceptionDetails;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiometricAuthenticationException(String message, a biometricExceptionDetails) {
        super(message);
        Intrinsics.j(message, "message");
        Intrinsics.j(biometricExceptionDetails, "biometricExceptionDetails");
        this.biometricExceptionDetails = biometricExceptionDetails;
    }
}
