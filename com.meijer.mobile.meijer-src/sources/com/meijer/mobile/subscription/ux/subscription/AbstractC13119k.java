package com.meijer.mobile.subscription.ux.subscription;

import com.google.android.libraries.places.api.model.PlaceTypes;
import cr.SubscriptionDetails;
import di.CustomerAddress;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mr.TimeSlotDayDecorator;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\r\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/k;", "", "<init>", "()V", "d", "a", "f", "m", "e", "g", "h", "b", "c", "l", "j", "i", "k", "Lcom/meijer/mobile/subscription/ux/subscription/k$a;", "Lcom/meijer/mobile/subscription/ux/subscription/k$b;", "Lcom/meijer/mobile/subscription/ux/subscription/k$c;", "Lcom/meijer/mobile/subscription/ux/subscription/k$d;", "Lcom/meijer/mobile/subscription/ux/subscription/k$e;", "Lcom/meijer/mobile/subscription/ux/subscription/k$f;", "Lcom/meijer/mobile/subscription/ux/subscription/k$g;", "Lcom/meijer/mobile/subscription/ux/subscription/k$h;", "Lcom/meijer/mobile/subscription/ux/subscription/k$i;", "Lcom/meijer/mobile/subscription/ux/subscription/k$j;", "Lcom/meijer/mobile/subscription/ux/subscription/k$k;", "Lcom/meijer/mobile/subscription/ux/subscription/k$l;", "Lcom/meijer/mobile/subscription/ux/subscription/k$m;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.subscription.ux.subscription.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC13119k {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/k$a;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "Lcr/j;", "subscriptionDetails", "<init>", "(Lcr/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcr/j;", "()Lcr/j;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.k$a, reason: from toString */
    public static final /* data */ class CancelAndNavigateToPDP extends AbstractC13119k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SubscriptionDetails subscriptionDetails;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CancelAndNavigateToPDP) && Intrinsics.e(this.subscriptionDetails, ((CancelAndNavigateToPDP) other).subscriptionDetails);
        }

        public int hashCode() {
            return this.subscriptionDetails.hashCode();
        }

        public String toString() {
            return "CancelAndNavigateToPDP(subscriptionDetails=" + this.subscriptionDetails + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CancelAndNavigateToPDP(SubscriptionDetails subscriptionDetails) {
            super(null);
            Intrinsics.j(subscriptionDetails, "subscriptionDetails");
            this.subscriptionDetails = subscriptionDetails;
        }

        /* renamed from: a, reason: from getter */
        public final SubscriptionDetails getSubscriptionDetails() {
            return this.subscriptionDetails;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/k$b;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "", "frequency", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.k$b, reason: from toString */
    public static final /* data */ class ChangeFrequency extends AbstractC13119k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int frequency;

        public ChangeFrequency(int i10) {
            super(null);
            this.frequency = i10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChangeFrequency) && this.frequency == ((ChangeFrequency) other).frequency;
        }

        public int hashCode() {
            return Integer.hashCode(this.frequency);
        }

        public String toString() {
            return "ChangeFrequency(frequency=" + this.frequency + ')';
        }

        /* renamed from: a, reason: from getter */
        public final int getFrequency() {
            return this.frequency;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/k$c;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "", "quantity", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.k$c, reason: from toString */
    public static final /* data */ class ChangeQuantity extends AbstractC13119k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int quantity;

        public ChangeQuantity(int i10) {
            super(null);
            this.quantity = i10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ChangeQuantity) && this.quantity == ((ChangeQuantity) other).quantity;
        }

        public int hashCode() {
            return Integer.hashCode(this.quantity);
        }

        public String toString() {
            return "ChangeQuantity(quantity=" + this.quantity + ')';
        }

        /* renamed from: a, reason: from getter */
        public final int getQuantity() {
            return this.quantity;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/k$d;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.k$d */
    public static final /* data */ class d extends AbstractC13119k {

        /* renamed from: a, reason: collision with root package name */
        public static final d f120021a = new d();

        private d() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return -305981578;
        }

        public String toString() {
            return "NavigateToCancel";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/k$e;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.k$e */
    public static final /* data */ class e extends AbstractC13119k {

        /* renamed from: a, reason: collision with root package name */
        public static final e f120022a = new e();

        private e() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return -343895150;
        }

        public String toString() {
            return "NavigateToDeliveryAddresses";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/k$f;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.k$f */
    public static final /* data */ class f extends AbstractC13119k {

        /* renamed from: a, reason: collision with root package name */
        public static final f f120023a = new f();

        private f() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof f);
        }

        public int hashCode() {
            return -19691935;
        }

        public String toString() {
            return "NavigateToManage";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/k$g;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.k$g */
    public static final /* data */ class g extends AbstractC13119k {

        /* renamed from: a, reason: collision with root package name */
        public static final g f120024a = new g();

        private g() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof g);
        }

        public int hashCode() {
            return -2027720468;
        }

        public String toString() {
            return "NavigateToTimeSlots";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/k$h;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "Lcom/meijer/mobile/subscription/ux/subscription/y;", "subscriptionDecorator", "<init>", "(Lcom/meijer/mobile/subscription/ux/subscription/y;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/subscription/ux/subscription/y;", "()Lcom/meijer/mobile/subscription/ux/subscription/y;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.k$h, reason: from toString */
    public static final /* data */ class SaveSubscription extends AbstractC13119k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SubscriptionDecorator subscriptionDecorator;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SaveSubscription) && Intrinsics.e(this.subscriptionDecorator, ((SaveSubscription) other).subscriptionDecorator);
        }

        public int hashCode() {
            return this.subscriptionDecorator.hashCode();
        }

        public String toString() {
            return "SaveSubscription(subscriptionDecorator=" + this.subscriptionDecorator + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SaveSubscription(SubscriptionDecorator subscriptionDecorator) {
            super(null);
            Intrinsics.j(subscriptionDecorator, "subscriptionDecorator");
            this.subscriptionDecorator = subscriptionDecorator;
        }

        /* renamed from: a, reason: from getter */
        public final SubscriptionDecorator getSubscriptionDecorator() {
            return this.subscriptionDecorator;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/k$i;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "Lmr/l;", "fulfillmentSlotDayDecorator", "<init>", "(Lmr/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmr/l;", "()Lmr/l;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.k$i, reason: from toString */
    public static final /* data */ class SetSelectedDay extends AbstractC13119k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TimeSlotDayDecorator fulfillmentSlotDayDecorator;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetSelectedDay) && Intrinsics.e(this.fulfillmentSlotDayDecorator, ((SetSelectedDay) other).fulfillmentSlotDayDecorator);
        }

        public int hashCode() {
            return this.fulfillmentSlotDayDecorator.hashCode();
        }

        public String toString() {
            return "SetSelectedDay(fulfillmentSlotDayDecorator=" + this.fulfillmentSlotDayDecorator + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetSelectedDay(TimeSlotDayDecorator fulfillmentSlotDayDecorator) {
            super(null);
            Intrinsics.j(fulfillmentSlotDayDecorator, "fulfillmentSlotDayDecorator");
            this.fulfillmentSlotDayDecorator = fulfillmentSlotDayDecorator;
        }

        /* renamed from: a, reason: from getter */
        public final TimeSlotDayDecorator getFulfillmentSlotDayDecorator() {
            return this.fulfillmentSlotDayDecorator;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/k$j;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "Ldi/c;", PlaceTypes.ADDRESS, "<init>", "(Ldi/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldi/c;", "()Ldi/c;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.k$j, reason: from toString */
    public static final /* data */ class SetSelectedDeliveryAddress extends AbstractC13119k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CustomerAddress address;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetSelectedDeliveryAddress) && Intrinsics.e(this.address, ((SetSelectedDeliveryAddress) other).address);
        }

        public int hashCode() {
            return this.address.hashCode();
        }

        public String toString() {
            return "SetSelectedDeliveryAddress(address=" + this.address + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetSelectedDeliveryAddress(CustomerAddress address) {
            super(null);
            Intrinsics.j(address, "address");
            this.address = address;
        }

        /* renamed from: a, reason: from getter */
        public final CustomerAddress getAddress() {
            return this.address;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/k$k;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "fulfillmentSlotId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.k$k, reason: collision with other inner class name and from toString */
    public static final /* data */ class SetSelectedTimeSlot extends AbstractC13119k {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fulfillmentSlotId;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetSelectedTimeSlot) && Intrinsics.e(this.fulfillmentSlotId, ((SetSelectedTimeSlot) other).fulfillmentSlotId);
        }

        public int hashCode() {
            return this.fulfillmentSlotId.hashCode();
        }

        public String toString() {
            return "SetSelectedTimeSlot(fulfillmentSlotId=" + this.fulfillmentSlotId + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetSelectedTimeSlot(String fulfillmentSlotId) {
            super(null);
            Intrinsics.j(fulfillmentSlotId, "fulfillmentSlotId");
            this.fulfillmentSlotId = fulfillmentSlotId;
        }

        /* renamed from: a, reason: from getter */
        public final String getFulfillmentSlotId() {
            return this.fulfillmentSlotId;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/k$l;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.k$l */
    public static final /* data */ class l extends AbstractC13119k {

        /* renamed from: a, reason: collision with root package name */
        public static final l f120029a = new l();

        private l() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof l);
        }

        public int hashCode() {
            return -2089911734;
        }

        public String toString() {
            return "ViewHowSubscriptionWorks";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/k$m;", "Lcom/meijer/mobile/subscription/ux/subscription/k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.k$m */
    public static final /* data */ class m extends AbstractC13119k {

        /* renamed from: a, reason: collision with root package name */
        public static final m f120030a = new m();

        private m() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof m);
        }

        public int hashCode() {
            return -1154089155;
        }

        public String toString() {
            return "ViewTermsAndConditions";
        }
    }

    public /* synthetic */ AbstractC13119k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC13119k() {
    }
}
