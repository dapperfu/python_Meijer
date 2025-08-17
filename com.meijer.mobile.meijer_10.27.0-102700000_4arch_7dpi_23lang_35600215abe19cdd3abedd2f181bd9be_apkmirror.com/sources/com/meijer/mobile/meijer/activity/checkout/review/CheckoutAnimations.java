package com.meijer.mobile.meijer.activity.checkout.review;

import com.meijer.mobile.meijer.activity.checkout.review.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001f\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b \u0010%R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001f¨\u0006&"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/d0;", "", "", "compositionSpec", "buttonText", "", "isTimeSlotError", "isErrorEvent", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "information", "displayEbtPinPad", "<init>", "(ILjava/lang/Integer;ZZLjava/lang/String;Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "c", "Z", "g", "()Z", "d", "f", "e", "Ljava/lang/String;", "Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "()Lcom/meijer/mobile/meijer/activity/checkout/review/z1$k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.d0, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class CheckoutAnimations {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int compositionSpec;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer buttonText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isTimeSlotError;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isErrorEvent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String orderId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final z1.OrderConfirmationInfo information;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean displayEbtPinPad;

    public CheckoutAnimations(int i10, Integer num, boolean z10, boolean z11, String str, z1.OrderConfirmationInfo orderConfirmationInfo, boolean z12) {
        this.compositionSpec = i10;
        this.buttonText = num;
        this.isTimeSlotError = z10;
        this.isErrorEvent = z11;
        this.orderId = str;
        this.information = orderConfirmationInfo;
        this.displayEbtPinPad = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutAnimations)) {
            return false;
        }
        CheckoutAnimations checkoutAnimations = (CheckoutAnimations) other;
        return this.compositionSpec == checkoutAnimations.compositionSpec && Intrinsics.e(this.buttonText, checkoutAnimations.buttonText) && this.isTimeSlotError == checkoutAnimations.isTimeSlotError && this.isErrorEvent == checkoutAnimations.isErrorEvent && Intrinsics.e(this.orderId, checkoutAnimations.orderId) && Intrinsics.e(this.information, checkoutAnimations.information) && this.displayEbtPinPad == checkoutAnimations.displayEbtPinPad;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.compositionSpec) * 31;
        Integer num = this.buttonText;
        int iHashCode2 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.isTimeSlotError)) * 31) + Boolean.hashCode(this.isErrorEvent)) * 31;
        String str = this.orderId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        z1.OrderConfirmationInfo orderConfirmationInfo = this.information;
        return ((iHashCode3 + (orderConfirmationInfo != null ? orderConfirmationInfo.hashCode() : 0)) * 31) + Boolean.hashCode(this.displayEbtPinPad);
    }

    public String toString() {
        return "CheckoutAnimations(compositionSpec=" + this.compositionSpec + ", buttonText=" + this.buttonText + ", isTimeSlotError=" + this.isTimeSlotError + ", isErrorEvent=" + this.isErrorEvent + ", orderId=" + this.orderId + ", information=" + this.information + ", displayEbtPinPad=" + this.displayEbtPinPad + ')';
    }

    /* renamed from: a, reason: from getter */
    public final Integer getButtonText() {
        return this.buttonText;
    }

    /* renamed from: b, reason: from getter */
    public final int getCompositionSpec() {
        return this.compositionSpec;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getDisplayEbtPinPad() {
        return this.displayEbtPinPad;
    }

    /* renamed from: d, reason: from getter */
    public final z1.OrderConfirmationInfo getInformation() {
        return this.information;
    }

    /* renamed from: e, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsErrorEvent() {
        return this.isErrorEvent;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsTimeSlotError() {
        return this.isTimeSlotError;
    }

    public /* synthetic */ CheckoutAnimations(int i10, Integer num, boolean z10, boolean z11, String str, z1.OrderConfirmationInfo orderConfirmationInfo, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? false : z11, (i11 & 16) != 0 ? null : str, (i11 & 32) != 0 ? null : orderConfirmationInfo, (i11 & 64) != 0 ? false : z12);
    }
}
