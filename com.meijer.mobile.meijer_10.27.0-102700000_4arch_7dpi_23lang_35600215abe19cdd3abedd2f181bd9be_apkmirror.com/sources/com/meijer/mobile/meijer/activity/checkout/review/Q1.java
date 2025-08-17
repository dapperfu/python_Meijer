package com.meijer.mobile.meijer.activity.checkout.review;

import Hk.Validation;
import ak.AbstractC5607a;
import ej.DeliveryMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00132\u00020\u0001:\u0004\u0013\f\u000f\nB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\n\u0010\u0012\u0082\u0001\u0003\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/Q1;", "", "Lak/a;", "description", "", "fulfillmentSlotCardTitle", "", "deliveryMode", "<init>", "(Lak/a;ILjava/lang/String;)V", "a", "Lak/a;", "b", "()Lak/a;", "I", "c", "()I", "Ljava/lang/String;", "()Ljava/lang/String;", "d", "Lcom/meijer/mobile/meijer/activity/checkout/review/Q1$b;", "Lcom/meijer/mobile/meijer/activity/checkout/review/Q1$c;", "Lcom/meijer/mobile/meijer/activity/checkout/review/Q1$d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class Q1 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f104609e = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC5607a description;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int fulfillmentSlotCardTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String deliveryMode;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/Q1$a;", "", "<init>", "()V", "LHk/b;", "Lej/h;", "deliveryMode", "Lcom/meijer/mobile/meijer/activity/checkout/review/Q1;", "a", "(LHk/b;)Lcom/meijer/mobile/meijer/activity/checkout/review/Q1;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.checkout.review.Q1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Q1 a(Validation<DeliveryMode> deliveryMode) {
            Intrinsics.j(deliveryMode, "deliveryMode");
            DeliveryMode deliveryModeE = deliveryMode.e();
            String code = deliveryModeE != null ? deliveryModeE.getCode() : null;
            return Intrinsics.e(code, "pickup") ? d.f104617f : Intrinsics.e(code, "delivery") ? b.f104613f : c.f104615f;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/Q1$b;", "Lcom/meijer/mobile/meijer/activity/checkout/review/Q1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b extends Q1 {

        /* renamed from: f, reason: collision with root package name */
        public static final b f104613f = new b();

        /* renamed from: g, reason: collision with root package name */
        public static final int f104614g = AbstractC5607a.f45514b;

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -769235694;
        }

        public String toString() {
            return "Delivery";
        }

        private b() {
            super(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99892X0, new Object[0]), com.meijer.mobile.meijer.Y.f100020db, "delivery", null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/Q1$c;", "Lcom/meijer/mobile/meijer/activity/checkout/review/Q1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class c extends Q1 {

        /* renamed from: f, reason: collision with root package name */
        public static final c f104615f = new c();

        /* renamed from: g, reason: collision with root package name */
        public static final int f104616g = AbstractC5607a.f45514b;

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -91539280;
        }

        public String toString() {
            return "NotSelected";
        }

        private c() {
            super(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99911Y0, new Object[0]), com.meijer.mobile.meijer.Y.f99980bb, "", null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/Q1$d;", "Lcom/meijer/mobile/meijer/activity/checkout/review/Q1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends Q1 {

        /* renamed from: f, reason: collision with root package name */
        public static final d f104617f = new d();

        /* renamed from: g, reason: collision with root package name */
        public static final int f104618g = AbstractC5607a.f45514b;

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return -847117542;
        }

        public String toString() {
            return "Pickup";
        }

        private d() {
            super(AbstractC5607a.INSTANCE.d(com.meijer.mobile.meijer.Y.f99930Z0, new Object[0]), com.meijer.mobile.meijer.Y.f99980bb, "pickup", null);
        }
    }

    public /* synthetic */ Q1(AbstractC5607a abstractC5607a, int i10, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5607a, i10, str);
    }

    private Q1(AbstractC5607a abstractC5607a, int i10, String str) {
        this.description = abstractC5607a;
        this.fulfillmentSlotCardTitle = i10;
        this.deliveryMode = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getDeliveryMode() {
        return this.deliveryMode;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final int getFulfillmentSlotCardTitle() {
        return this.fulfillmentSlotCardTitle;
    }
}
