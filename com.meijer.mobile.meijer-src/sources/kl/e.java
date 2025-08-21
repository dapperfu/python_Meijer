package kl;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\n\b\u000e\u000f\u0010B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r\u0082\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lkl/e;", "", "", "stepLabel", "", "completed", "<init>", "(Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Z", "()Z", "d", "c", "e", "Lkl/e$a;", "Lkl/e$b;", "Lkl/e$c;", "Lkl/e$d;", "Lkl/e$e;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String stepLabel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean completed;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkl/e$a;", "Lkl/e;", "", "stepLabel", "", "completed", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "b", "d", "Z", "a", "()Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kl.e$a, reason: from toString */
    public static final /* data */ class ContactInfo extends e {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stepLabel;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean completed;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContactInfo)) {
                return false;
            }
            ContactInfo contactInfo = (ContactInfo) other;
            return Intrinsics.e(this.stepLabel, contactInfo.stepLabel) && this.completed == contactInfo.completed;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContactInfo(String stepLabel, boolean z10) {
            super(stepLabel, z10, null);
            Intrinsics.j(stepLabel, "stepLabel");
            this.stepLabel = stepLabel;
            this.completed = z10;
        }

        @Override // kl.e
        /* renamed from: a, reason: from getter */
        public boolean getCompleted() {
            return this.completed;
        }

        @Override // kl.e
        /* renamed from: b, reason: from getter */
        public String getStepLabel() {
            return this.stepLabel;
        }

        public int hashCode() {
            return (this.stepLabel.hashCode() * 31) + Boolean.hashCode(this.completed);
        }

        public String toString() {
            return "ContactInfo(stepLabel=" + this.stepLabel + ", completed=" + this.completed + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkl/e$b;", "Lkl/e;", "", "stepLabel", "", "completed", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "b", "d", "Z", "a", "()Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kl.e$b, reason: from toString */
    public static final /* data */ class DayAndTime extends e {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stepLabel;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean completed;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DayAndTime)) {
                return false;
            }
            DayAndTime dayAndTime = (DayAndTime) other;
            return Intrinsics.e(this.stepLabel, dayAndTime.stepLabel) && this.completed == dayAndTime.completed;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DayAndTime(String stepLabel, boolean z10) {
            super(stepLabel, z10, null);
            Intrinsics.j(stepLabel, "stepLabel");
            this.stepLabel = stepLabel;
            this.completed = z10;
        }

        @Override // kl.e
        /* renamed from: a, reason: from getter */
        public boolean getCompleted() {
            return this.completed;
        }

        @Override // kl.e
        /* renamed from: b, reason: from getter */
        public String getStepLabel() {
            return this.stepLabel;
        }

        public int hashCode() {
            return (this.stepLabel.hashCode() * 31) + Boolean.hashCode(this.completed);
        }

        public String toString() {
            return "DayAndTime(stepLabel=" + this.stepLabel + ", completed=" + this.completed + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkl/e$c;", "Lkl/e;", "", "stepLabel", "", "completed", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "b", "d", "Z", "a", "()Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kl.e$c, reason: from toString */
    public static final /* data */ class Payment extends e {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stepLabel;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean completed;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) other;
            return Intrinsics.e(this.stepLabel, payment.stepLabel) && this.completed == payment.completed;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Payment(String stepLabel, boolean z10) {
            super(stepLabel, z10, null);
            Intrinsics.j(stepLabel, "stepLabel");
            this.stepLabel = stepLabel;
            this.completed = z10;
        }

        @Override // kl.e
        /* renamed from: a, reason: from getter */
        public boolean getCompleted() {
            return this.completed;
        }

        @Override // kl.e
        /* renamed from: b, reason: from getter */
        public String getStepLabel() {
            return this.stepLabel;
        }

        public int hashCode() {
            return (this.stepLabel.hashCode() * 31) + Boolean.hashCode(this.completed);
        }

        public String toString() {
            return "Payment(stepLabel=" + this.stepLabel + ", completed=" + this.completed + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkl/e$d;", "Lkl/e;", "", "stepLabel", "", "completed", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "b", "d", "Z", "a", "()Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kl.e$d, reason: from toString */
    public static final /* data */ class PickupPerson extends e {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stepLabel;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean completed;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PickupPerson)) {
                return false;
            }
            PickupPerson pickupPerson = (PickupPerson) other;
            return Intrinsics.e(this.stepLabel, pickupPerson.stepLabel) && this.completed == pickupPerson.completed;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PickupPerson(String stepLabel, boolean z10) {
            super(stepLabel, z10, null);
            Intrinsics.j(stepLabel, "stepLabel");
            this.stepLabel = stepLabel;
            this.completed = z10;
        }

        @Override // kl.e
        /* renamed from: a, reason: from getter */
        public boolean getCompleted() {
            return this.completed;
        }

        @Override // kl.e
        /* renamed from: b, reason: from getter */
        public String getStepLabel() {
            return this.stepLabel;
        }

        public int hashCode() {
            return (this.stepLabel.hashCode() * 31) + Boolean.hashCode(this.completed);
        }

        public String toString() {
            return "PickupPerson(stepLabel=" + this.stepLabel + ", completed=" + this.completed + ')';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkl/e$e;", "Lkl/e;", "", "stepLabel", "", "completed", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "b", "d", "Z", "a", "()Z", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kl.e$e, reason: collision with other inner class name and from toString */
    public static final /* data */ class ReviewOrder extends e {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stepLabel;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean completed;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewOrder)) {
                return false;
            }
            ReviewOrder reviewOrder = (ReviewOrder) other;
            return Intrinsics.e(this.stepLabel, reviewOrder.stepLabel) && this.completed == reviewOrder.completed;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReviewOrder(String stepLabel, boolean z10) {
            super(stepLabel, z10, null);
            Intrinsics.j(stepLabel, "stepLabel");
            this.stepLabel = stepLabel;
            this.completed = z10;
        }

        @Override // kl.e
        /* renamed from: a, reason: from getter */
        public boolean getCompleted() {
            return this.completed;
        }

        @Override // kl.e
        /* renamed from: b, reason: from getter */
        public String getStepLabel() {
            return this.stepLabel;
        }

        public int hashCode() {
            return (this.stepLabel.hashCode() * 31) + Boolean.hashCode(this.completed);
        }

        public String toString() {
            return "ReviewOrder(stepLabel=" + this.stepLabel + ", completed=" + this.completed + ')';
        }
    }

    public /* synthetic */ e(String str, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10);
    }

    private e(String str, boolean z10) {
        this.stepLabel = str;
        this.completed = z10;
    }

    /* renamed from: a, reason: from getter */
    public boolean getCompleted() {
        return this.completed;
    }

    /* renamed from: b, reason: from getter */
    public String getStepLabel() {
        return this.stepLabel;
    }
}
