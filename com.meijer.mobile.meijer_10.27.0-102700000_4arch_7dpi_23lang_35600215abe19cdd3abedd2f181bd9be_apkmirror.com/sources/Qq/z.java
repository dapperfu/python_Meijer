package Qq;

import com.meijer.mobile.meijer.activity.checkout.review.W1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xs.EnumC18092b;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LQq/z;", "", "<init>", "()V", "c", "a", "b", "LQq/z$a;", "LQq/z$b;", "LQq/z$c;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class z {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"LQq/z$a;", "LQq/z;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "D", "()D", "amount", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qq.z$a, reason: from toString */
    public static final /* data */ class SetCustomTipAmount extends z {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final double amount;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetCustomTipAmount) && Double.compare(this.amount, ((SetCustomTipAmount) other).amount) == 0;
        }

        /* renamed from: a, reason: from getter */
        public final double getAmount() {
            return this.amount;
        }

        public int hashCode() {
            return Double.hashCode(this.amount);
        }

        public String toString() {
            return "SetCustomTipAmount(amount=" + this.amount + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LQq/z$b;", "LQq/z;", "Lcom/meijer/mobile/meijer/activity/checkout/review/W1;", "status", "<init>", "(Lcom/meijer/mobile/meijer/activity/checkout/review/W1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/meijer/activity/checkout/review/W1;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/W1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qq.z$b, reason: from toString */
    public static final /* data */ class SetPreTipStatus extends z {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final W1 status;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetPreTipStatus) && this.status == ((SetPreTipStatus) other).status;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetPreTipStatus(W1 status) {
            super(null);
            Intrinsics.j(status, "status");
            this.status = status;
        }

        /* renamed from: a, reason: from getter */
        public final W1 getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return "SetPreTipStatus(status=" + this.status + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"LQq/z$c;", "LQq/z;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lxs/b;", "a", "Lxs/b;", "()Lxs/b;", "tip", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qq.z$c, reason: from toString */
    public static final /* data */ class SetSelectedTipOption extends z {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC18092b tip;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetSelectedTipOption) && this.tip == ((SetSelectedTipOption) other).tip;
        }

        /* renamed from: a, reason: from getter */
        public final EnumC18092b getTip() {
            return this.tip;
        }

        public int hashCode() {
            return this.tip.hashCode();
        }

        public String toString() {
            return "SetSelectedTipOption(tip=" + this.tip + ')';
        }
    }

    public /* synthetic */ z(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private z() {
    }
}
