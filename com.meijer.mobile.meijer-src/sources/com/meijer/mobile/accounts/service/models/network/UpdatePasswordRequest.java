package com.meijer.mobile.accounts.service.models.network;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001b\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/accounts/service/models/network/UpdatePasswordRequest;", "", "", "accountId", "", "password", "confirmPassword", "oldPassword", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/accounts/service/models/network/UpdatePasswordRequest;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "d", "c", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UpdatePasswordRequest {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long accountId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String password;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String confirmPassword;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String oldPassword;

    public UpdatePasswordRequest(@g(name = "accountId") long j10, @g(name = "password") String password, @g(name = "confirmPassword") String confirmPassword, @g(name = "oldPassword") String oldPassword) {
        Intrinsics.j(password, "password");
        Intrinsics.j(confirmPassword, "confirmPassword");
        Intrinsics.j(oldPassword, "oldPassword");
        this.accountId = j10;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.oldPassword = oldPassword;
    }

    public final UpdatePasswordRequest copy(@g(name = "accountId") long accountId, @g(name = "password") String password, @g(name = "confirmPassword") String confirmPassword, @g(name = "oldPassword") String oldPassword) {
        Intrinsics.j(password, "password");
        Intrinsics.j(confirmPassword, "confirmPassword");
        Intrinsics.j(oldPassword, "oldPassword");
        return new UpdatePasswordRequest(accountId, password, confirmPassword, oldPassword);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdatePasswordRequest)) {
            return false;
        }
        UpdatePasswordRequest updatePasswordRequest = (UpdatePasswordRequest) other;
        return this.accountId == updatePasswordRequest.accountId && Intrinsics.e(this.password, updatePasswordRequest.password) && Intrinsics.e(this.confirmPassword, updatePasswordRequest.confirmPassword) && Intrinsics.e(this.oldPassword, updatePasswordRequest.oldPassword);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.accountId) * 31) + this.password.hashCode()) * 31) + this.confirmPassword.hashCode()) * 31) + this.oldPassword.hashCode();
    }

    public String toString() {
        return "UpdatePasswordRequest(accountId=" + this.accountId + ", password=" + this.password + ", confirmPassword=" + this.confirmPassword + ", oldPassword=" + this.oldPassword + ')';
    }

    /* renamed from: a, reason: from getter */
    public final long getAccountId() {
        return this.accountId;
    }

    /* renamed from: b, reason: from getter */
    public final String getConfirmPassword() {
        return this.confirmPassword;
    }

    /* renamed from: c, reason: from getter */
    public final String getOldPassword() {
        return this.oldPassword;
    }

    /* renamed from: d, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public /* synthetic */ UpdatePasswordRequest(long j10, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, str, (i10 & 4) != 0 ? str : str2, str3);
    }
}
