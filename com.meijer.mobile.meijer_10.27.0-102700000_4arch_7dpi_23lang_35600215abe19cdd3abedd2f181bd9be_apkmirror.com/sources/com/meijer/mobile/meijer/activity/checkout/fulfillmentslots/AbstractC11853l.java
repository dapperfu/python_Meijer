package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u000b\u0007B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n\u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/l;", "", "Lak/a;", "errorTitle", "errorDescription", "<init>", "(Lak/a;Lak/a;)V", "a", "Lak/a;", "getErrorTitle", "()Lak/a;", "b", "getErrorDescription", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/l$a;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/l$b;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC11853l {

    /* renamed from: c, reason: collision with root package name */
    public static final int f102987c = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a errorTitle;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a errorDescription;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/l$a;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/l;", "Lak/a;", "errorTitle", "errorDescription", "<init>", "(Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lak/a;", "b", "()Lak/a;", "e", "a", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.l$a, reason: from toString */
    public static final /* data */ class Error extends AbstractC11853l {

        /* renamed from: f, reason: collision with root package name */
        public static final int f102990f = AbstractC5607a.f45514b;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a errorTitle;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC5607a errorDescription;

        /* JADX WARN: Multi-variable type inference failed */
        public Error() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.e(this.errorTitle, error.errorTitle) && Intrinsics.e(this.errorDescription, error.errorDescription);
        }

        public int hashCode() {
            return (this.errorTitle.hashCode() * 31) + this.errorDescription.hashCode();
        }

        public String toString() {
            return "Error(errorTitle=" + this.errorTitle + ", errorDescription=" + this.errorDescription + ')';
        }

        public /* synthetic */ Error(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a, (i10 & 2) != 0 ? AbstractC5607a.INSTANCE.a() : abstractC5607a2);
        }

        /* renamed from: a, reason: from getter */
        public AbstractC5607a getErrorDescription() {
            return this.errorDescription;
        }

        /* renamed from: b, reason: from getter */
        public AbstractC5607a getErrorTitle() {
            return this.errorTitle;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(AbstractC5607a errorTitle, AbstractC5607a errorDescription) {
            super(errorTitle, errorDescription, null);
            Intrinsics.j(errorTitle, "errorTitle");
            Intrinsics.j(errorDescription, "errorDescription");
            this.errorTitle = errorTitle;
            this.errorDescription = errorDescription;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/l$b;", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/l;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.l$b */
    public static final /* data */ class b extends AbstractC11853l {

        /* renamed from: d, reason: collision with root package name */
        public static final b f102993d = new b();

        /* renamed from: e, reason: collision with root package name */
        public static final int f102994e = AbstractC5607a.f45514b;

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -1266476762;
        }

        public String toString() {
            return "None";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private b() {
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            super(companion.a(), companion.a(), null);
        }
    }

    public /* synthetic */ AbstractC11853l(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5607a, abstractC5607a2);
    }

    private AbstractC11853l(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2) {
        this.errorTitle = abstractC5607a;
        this.errorDescription = abstractC5607a2;
    }
}
