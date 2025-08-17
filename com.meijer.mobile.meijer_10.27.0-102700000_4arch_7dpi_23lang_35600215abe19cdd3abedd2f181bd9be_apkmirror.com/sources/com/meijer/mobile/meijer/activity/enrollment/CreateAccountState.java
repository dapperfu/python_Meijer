package com.meijer.mobile.meijer.activity.enrollment;

import Cs.MeijerAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/enrollment/b;", "", "LCs/a;", "meijerAccount", "<init>", "(LCs/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCs/a;", "()LCs/a;", "setMeijerAccount", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.enrollment.b, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class CreateAccountState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private MeijerAccount meijerAccount;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateAccountState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreateAccountState) && Intrinsics.e(this.meijerAccount, ((CreateAccountState) other).meijerAccount);
    }

    public int hashCode() {
        return this.meijerAccount.hashCode();
    }

    public String toString() {
        return "CreateAccountState(meijerAccount=" + this.meijerAccount + ')';
    }

    public CreateAccountState(MeijerAccount meijerAccount) {
        Intrinsics.j(meijerAccount, "meijerAccount");
        this.meijerAccount = meijerAccount;
    }

    /* renamed from: a, reason: from getter */
    public final MeijerAccount getMeijerAccount() {
        return this.meijerAccount;
    }

    public /* synthetic */ CreateAccountState(MeijerAccount meijerAccount, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new MeijerAccount(0L, null, null, null, null, null, null, null, null, null, null, 0, null, 0L, 0L, null, 0, null, 0L, 0, null, null, null, null, null, null, 0L, 134217727, null) : meijerAccount);
    }
}
