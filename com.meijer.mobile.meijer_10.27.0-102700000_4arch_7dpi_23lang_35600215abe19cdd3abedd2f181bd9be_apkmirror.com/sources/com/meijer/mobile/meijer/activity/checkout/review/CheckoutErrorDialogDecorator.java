package com.meijer.mobile.meijer.activity.checkout.review;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\u000fR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/e0;", "", "", "title", "message", "buttonText", "Lkotlin/Function0;", "", "onButtonClick", "<init>", "(IIILkotlin/jvm/functions/Function0;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "c", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.e0, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class CheckoutErrorDialogDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int message;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int buttonText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Function0<Unit> onButtonClick;

    public CheckoutErrorDialogDecorator() {
        this(0, 0, 0, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutErrorDialogDecorator)) {
            return false;
        }
        CheckoutErrorDialogDecorator checkoutErrorDialogDecorator = (CheckoutErrorDialogDecorator) other;
        return this.title == checkoutErrorDialogDecorator.title && this.message == checkoutErrorDialogDecorator.message && this.buttonText == checkoutErrorDialogDecorator.buttonText && Intrinsics.e(this.onButtonClick, checkoutErrorDialogDecorator.onButtonClick);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.title) * 31) + Integer.hashCode(this.message)) * 31) + Integer.hashCode(this.buttonText)) * 31;
        Function0<Unit> function0 = this.onButtonClick;
        return iHashCode + (function0 == null ? 0 : function0.hashCode());
    }

    public String toString() {
        return "CheckoutErrorDialogDecorator(title=" + this.title + ", message=" + this.message + ", buttonText=" + this.buttonText + ", onButtonClick=" + this.onButtonClick + ')';
    }

    public CheckoutErrorDialogDecorator(int i10, int i11, int i12, Function0<Unit> function0) {
        this.title = i10;
        this.message = i11;
        this.buttonText = i12;
        this.onButtonClick = function0;
    }

    /* renamed from: a, reason: from getter */
    public final int getButtonText() {
        return this.buttonText;
    }

    /* renamed from: b, reason: from getter */
    public final int getMessage() {
        return this.message;
    }

    public final Function0<Unit> c() {
        return this.onButtonClick;
    }

    /* renamed from: d, reason: from getter */
    public final int getTitle() {
        return this.title;
    }

    public /* synthetic */ CheckoutErrorDialogDecorator(int i10, int i11, int i12, Function0 function0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? com.meijer.mobile.meijer.Y.f99907Xf : i10, (i13 & 2) != 0 ? com.meijer.mobile.meijer.Y.f99831Tf : i11, (i13 & 4) != 0 ? com.meijer.mobile.meijer.Y.f99926Yf : i12, (i13 & 8) != 0 ? null : function0);
    }
}
