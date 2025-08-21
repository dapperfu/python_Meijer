package com.meijer.mobile.subscription.ux.subscription;

import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/C;", "", "", PlaceTypes.ROUTE, "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "b", "c", "Lcom/meijer/mobile/subscription/ux/subscription/C$a;", "Lcom/meijer/mobile/subscription/ux/subscription/C$b;", "Lcom/meijer/mobile/subscription/ux/subscription/C$c;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String route;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/C$a;", "Lcom/meijer/mobile/subscription/ux/subscription/C;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a extends C {

        /* renamed from: b, reason: collision with root package name */
        public static final a f119846b = new a();

        public boolean equals(Object other) {
            return this == other || (other instanceof a);
        }

        public int hashCode() {
            return 261283459;
        }

        public String toString() {
            return "ExitSubscription";
        }

        private a() {
            super("exit_subscription", null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/C$b;", "Lcom/meijer/mobile/subscription/ux/subscription/C;", "", "resultCode", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "a", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.subscription.ux.subscription.C$b, reason: from toString */
    public static final /* data */ class ExitSubscriptionWithResult extends C {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int resultCode;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExitSubscriptionWithResult) && this.resultCode == ((ExitSubscriptionWithResult) other).resultCode;
        }

        public int hashCode() {
            return Integer.hashCode(this.resultCode);
        }

        public String toString() {
            return "ExitSubscriptionWithResult(resultCode=" + this.resultCode + ')';
        }

        public ExitSubscriptionWithResult(int i10) {
            super("exit_subscription_with_message", null);
            this.resultCode = i10;
        }

        /* renamed from: a, reason: from getter */
        public final int getResultCode() {
            return this.resultCode;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\b\u0006\n\u000bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/C$c;", "Lcom/meijer/mobile/subscription/ux/subscription/C;", "", PlaceTypes.ROUTE, "<init>", "(Ljava/lang/String;)V", "b", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "d", "Lcom/meijer/mobile/subscription/ux/subscription/C$c$a;", "Lcom/meijer/mobile/subscription/ux/subscription/C$c$b;", "Lcom/meijer/mobile/subscription/ux/subscription/C$c$c;", "Lcom/meijer/mobile/subscription/ux/subscription/C$c$d;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c extends C {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String route;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/C$c$a;", "Lcom/meijer/mobile/subscription/ux/subscription/C$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends c {

            /* renamed from: c, reason: collision with root package name */
            public static final a f119849c = new a();

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return -389203423;
            }

            public String toString() {
                return "AddOrManageSubscription";
            }

            private a() {
                super("add_or_manage_subscription", null);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/C$c$b;", "Lcom/meijer/mobile/subscription/ux/subscription/C$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends c {

            /* renamed from: c, reason: collision with root package name */
            public static final b f119850c = new b();

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 972201564;
            }

            public String toString() {
                return "CancelSubscription";
            }

            private b() {
                super("cancel_subscription", null);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/C$c$c;", "Lcom/meijer/mobile/subscription/ux/subscription/C$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.subscription.ux.subscription.C$c$c, reason: collision with other inner class name */
        public static final /* data */ class C1935c extends c {

            /* renamed from: c, reason: collision with root package name */
            public static final C1935c f119851c = new C1935c();

            public boolean equals(Object other) {
                return this == other || (other instanceof C1935c);
            }

            public int hashCode() {
                return 489865161;
            }

            public String toString() {
                return "DeliveryAddresses";
            }

            private C1935c() {
                super("delivery_addresses", null);
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscription/C$c$d;", "Lcom/meijer/mobile/subscription/ux/subscription/C$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends c {

            /* renamed from: c, reason: collision with root package name */
            public static final d f119852c = new d();

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 1059374115;
            }

            public String toString() {
                return "TimeSlots";
            }

            private d() {
                super("time_slots", null);
            }
        }

        public /* synthetic */ c(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        private c(String str) {
            super(str, null);
            this.route = str;
        }

        /* renamed from: a, reason: from getter */
        public String getRoute() {
            return this.route;
        }
    }

    public /* synthetic */ C(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private C(String str) {
        this.route = str;
    }
}
