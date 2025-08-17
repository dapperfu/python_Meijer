package com.meijer.mobile.subscription.ux.subscribedItems;

import ak.AbstractC5607a;
import cr.SubscriptionDetails;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kr.C15305b;
import kr.C15307d;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscribedItems/q;", "", "<init>", "()V", "c", "d", "a", "b", "Lcom/meijer/mobile/subscription/ux/subscribedItems/q$a;", "Lcom/meijer/mobile/subscription/ux/subscribedItems/q$b;", "Lcom/meijer/mobile/subscription/ux/subscribedItems/q$c;", "Lcom/meijer/mobile/subscription/ux/subscribedItems/q$d;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class q {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscribedItems/q$a;", "Lcom/meijer/mobile/subscription/ux/subscribedItems/q;", "Lcom/meijer/mobile/subscription/ux/subscribedItems/r;", "decorator", "<init>", "(Lcom/meijer/mobile/subscription/ux/subscribedItems/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/subscription/ux/subscribedItems/r;", "()Lcom/meijer/mobile/subscription/ux/subscribedItems/r;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscribedItems.q$a, reason: from toString */
    public static final /* data */ class Empty extends q {

        /* renamed from: b, reason: collision with root package name */
        public static final int f118858b = AbstractC5607a.f45514b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SubscriptionEmptyErrorStateDecorator decorator;

        /* JADX WARN: Multi-variable type inference failed */
        public Empty() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Empty) && Intrinsics.e(this.decorator, ((Empty) other).decorator);
        }

        public int hashCode() {
            return this.decorator.hashCode();
        }

        public String toString() {
            return "Empty(decorator=" + this.decorator + ')';
        }

        public /* synthetic */ Empty(SubscriptionEmptyErrorStateDecorator subscriptionEmptyErrorStateDecorator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i10 & 1) != 0) {
                AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                subscriptionEmptyErrorStateDecorator = new SubscriptionEmptyErrorStateDecorator(companion.d(C15307d.f147863b0, new Object[0]), companion.d(C15307d.f147838G0, new Object[0]), Integer.valueOf(C15305b.f147817d));
            }
            this(subscriptionEmptyErrorStateDecorator);
        }

        /* renamed from: a, reason: from getter */
        public final SubscriptionEmptyErrorStateDecorator getDecorator() {
            return this.decorator;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Empty(SubscriptionEmptyErrorStateDecorator decorator) {
            super(null);
            Intrinsics.j(decorator, "decorator");
            this.decorator = decorator;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscribedItems/q$b;", "Lcom/meijer/mobile/subscription/ux/subscribedItems/q;", "Lcom/meijer/mobile/subscription/ux/subscribedItems/r;", "decorator", "<init>", "(Lcom/meijer/mobile/subscription/ux/subscribedItems/r;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/meijer/mobile/subscription/ux/subscribedItems/r;", "()Lcom/meijer/mobile/subscription/ux/subscribedItems/r;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscribedItems.q$b, reason: from toString */
    public static final /* data */ class Error extends q {

        /* renamed from: b, reason: collision with root package name */
        public static final int f118860b = AbstractC5607a.f45514b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SubscriptionEmptyErrorStateDecorator decorator;

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.e(this.decorator, ((Error) other).decorator);
        }

        public int hashCode() {
            return this.decorator.hashCode();
        }

        public String toString() {
            return "Error(decorator=" + this.decorator + ')';
        }

        public /* synthetic */ Error(SubscriptionEmptyErrorStateDecorator subscriptionEmptyErrorStateDecorator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            if ((i10 & 1) != 0) {
                AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
                subscriptionEmptyErrorStateDecorator = new SubscriptionEmptyErrorStateDecorator(companion.d(C15307d.f147826A0, new Object[0]), companion.d(C15307d.f147869e0, new Object[0]), Integer.valueOf(C15305b.f147818e));
            }
            this(subscriptionEmptyErrorStateDecorator);
        }

        /* renamed from: a, reason: from getter */
        public final SubscriptionEmptyErrorStateDecorator getDecorator() {
            return this.decorator;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(SubscriptionEmptyErrorStateDecorator decorator) {
            super(null);
            Intrinsics.j(decorator, "decorator");
            this.decorator = decorator;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscribedItems/q$c;", "Lcom/meijer/mobile/subscription/ux/subscribedItems/q;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class c extends q {

        /* renamed from: a, reason: collision with root package name */
        public static final c f118862a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 661297274;
        }

        public String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscribedItems/q$d;", "Lcom/meijer/mobile/subscription/ux/subscribedItems/q;", "", "Lcr/j;", "subscriptionDetailsList", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscribedItems.q$d, reason: from toString */
    public static final /* data */ class SubscriptionDetailsLoaded extends q {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<SubscriptionDetails> subscriptionDetailsList;

        /* JADX WARN: Multi-variable type inference failed */
        public SubscriptionDetailsLoaded() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SubscriptionDetailsLoaded) && Intrinsics.e(this.subscriptionDetailsList, ((SubscriptionDetailsLoaded) other).subscriptionDetailsList);
        }

        public int hashCode() {
            return this.subscriptionDetailsList.hashCode();
        }

        public String toString() {
            return "SubscriptionDetailsLoaded(subscriptionDetailsList=" + this.subscriptionDetailsList + ')';
        }

        public /* synthetic */ SubscriptionDetailsLoaded(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.m() : list);
        }

        public final List<SubscriptionDetails> a() {
            return this.subscriptionDetailsList;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SubscriptionDetailsLoaded(List<SubscriptionDetails> subscriptionDetailsList) {
            super(null);
            Intrinsics.j(subscriptionDetailsList, "subscriptionDetailsList");
            this.subscriptionDetailsList = subscriptionDetailsList;
        }
    }

    public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private q() {
    }
}
