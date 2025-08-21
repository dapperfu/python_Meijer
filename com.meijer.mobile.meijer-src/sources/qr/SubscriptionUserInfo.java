package qr;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lqr/b;", "", "", "email", "", "isLoggedIn", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qr.b, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class SubscriptionUserInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoggedIn;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionUserInfo)) {
            return false;
        }
        SubscriptionUserInfo subscriptionUserInfo = (SubscriptionUserInfo) other;
        return Intrinsics.e(this.email, subscriptionUserInfo.email) && this.isLoggedIn == subscriptionUserInfo.isLoggedIn;
    }

    public SubscriptionUserInfo(String email, boolean z10) {
        Intrinsics.j(email, "email");
        this.email = email;
        this.isLoggedIn = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    public int hashCode() {
        return (this.email.hashCode() * 31) + Boolean.hashCode(this.isLoggedIn);
    }

    public String toString() {
        return "SubscriptionUserInfo(email=" + this.email + ", isLoggedIn=" + this.isLoggedIn + ')';
    }
}
