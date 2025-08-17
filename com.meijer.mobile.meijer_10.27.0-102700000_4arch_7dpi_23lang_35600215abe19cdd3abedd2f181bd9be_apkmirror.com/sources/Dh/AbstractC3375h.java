package Dh;

import Cs.MeijerAccount;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LDh/h;", "", "<init>", "()V", "b", "a", "LDh/h$a;", "LDh/h$b;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dh.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3375h {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LDh/h$a;", "LDh/h;", "LXj/b;", "error", "<init>", "(LXj/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LXj/b;", "getError", "()LXj/b;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Dh.h$a, reason: from toString */
    public static final /* data */ class Conflict extends AbstractC3375h {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Xj.b error;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Conflict) && Intrinsics.e(this.error, ((Conflict) other).error);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Conflict(Xj.b error) {
            super(null);
            Intrinsics.j(error, "error");
            this.error = error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Conflict(error=" + this.error + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LDh/h$b;", "LDh/h;", "LCs/a;", "account", "<init>", "(LCs/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LCs/a;", "()LCs/a;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Dh.h$b, reason: from toString */
    public static final /* data */ class Success extends AbstractC3375h {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final MeijerAccount account;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.e(this.account, ((Success) other).account);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(MeijerAccount account) {
            super(null);
            Intrinsics.j(account, "account");
            this.account = account;
        }

        /* renamed from: a, reason: from getter */
        public final MeijerAccount getAccount() {
            return this.account;
        }

        public int hashCode() {
            return this.account.hashCode();
        }

        public String toString() {
            return "Success(account=" + this.account + ')';
        }
    }

    public /* synthetic */ AbstractC3375h(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC3375h() {
    }
}
