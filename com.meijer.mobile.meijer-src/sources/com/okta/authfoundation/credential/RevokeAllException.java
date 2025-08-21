package com.okta.authfoundation.credential;

import Vs.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B!\b\u0000\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R'\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u00060\u0001j\u0002`\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/okta/authfoundation/credential/RevokeAllException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "LVs/i;", "failures", "<init>", "(Ljava/util/Map;)V", "a", "Ljava/util/Map;", "getFailures", "()Ljava/util/Map;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RevokeAllException extends Exception {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<i, Exception> failures;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RevokeAllException(Map<i, ? extends Exception> failures) {
        super("Failed to revoke all tokens.");
        Intrinsics.j(failures, "failures");
        this.failures = failures;
    }
}
