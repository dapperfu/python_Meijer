package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0012B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/H1;", "", "Lak/a;", "mainHeader", "line1", "line2", "<init>", "(Lak/a;Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "d", "()Lak/a;", "b", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.H1, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class SpcFulfillmentHeader {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f102651e = AbstractC5607a.f45514b;

    /* renamed from: f, reason: collision with root package name */
    private static final SpcFulfillmentHeader f102652f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a mainHeader;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a line1;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a line2;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/H1$a;", "", "<init>", "()V", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/H1;", "empty", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/H1;", "a", "()Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/H1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.H1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SpcFulfillmentHeader a() {
            return SpcFulfillmentHeader.f102652f;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpcFulfillmentHeader)) {
            return false;
        }
        SpcFulfillmentHeader spcFulfillmentHeader = (SpcFulfillmentHeader) other;
        return Intrinsics.e(this.mainHeader, spcFulfillmentHeader.mainHeader) && Intrinsics.e(this.line1, spcFulfillmentHeader.line1) && Intrinsics.e(this.line2, spcFulfillmentHeader.line2);
    }

    public int hashCode() {
        int iHashCode = ((this.mainHeader.hashCode() * 31) + this.line1.hashCode()) * 31;
        AbstractC5607a abstractC5607a = this.line2;
        return iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode());
    }

    public String toString() {
        return "SpcFulfillmentHeader(mainHeader=" + this.mainHeader + ", line1=" + this.line1 + ", line2=" + this.line2 + ')';
    }

    static {
        AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
        f102652f = new SpcFulfillmentHeader(companion.a(), companion.a(), companion.a());
    }

    public SpcFulfillmentHeader(AbstractC5607a mainHeader, AbstractC5607a line1, AbstractC5607a abstractC5607a) {
        Intrinsics.j(mainHeader, "mainHeader");
        Intrinsics.j(line1, "line1");
        this.mainHeader = mainHeader;
        this.line1 = line1;
        this.line2 = abstractC5607a;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getLine1() {
        return this.line1;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getLine2() {
        return this.line2;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getMainHeader() {
        return this.mainHeader;
    }
}
