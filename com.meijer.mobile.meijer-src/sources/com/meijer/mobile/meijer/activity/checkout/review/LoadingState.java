package com.meijer.mobile.meijer.activity.checkout.review;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/review/S1;", "", "", "isLoading", "Lbk/a;", "loadingMessage", "loadingMessageBody", "spinnerVisible", "<init>", "(ZLbk/a;Lbk/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "Lbk/a;", "()Lbk/a;", "d", "getSpinnerVisible", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.review.S1, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class LoadingState {

    /* renamed from: e, reason: collision with root package name */
    public static final int f105495e = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isLoading;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a loadingMessage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a loadingMessageBody;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean spinnerVisible;

    public LoadingState() {
        this(false, null, null, false, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingState)) {
            return false;
        }
        LoadingState loadingState = (LoadingState) other;
        return this.isLoading == loadingState.isLoading && Intrinsics.e(this.loadingMessage, loadingState.loadingMessage) && Intrinsics.e(this.loadingMessageBody, loadingState.loadingMessageBody) && this.spinnerVisible == loadingState.spinnerVisible;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isLoading) * 31;
        AbstractC6392a abstractC6392a = this.loadingMessage;
        int iHashCode2 = (iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode())) * 31;
        AbstractC6392a abstractC6392a2 = this.loadingMessageBody;
        return ((iHashCode2 + (abstractC6392a2 != null ? abstractC6392a2.hashCode() : 0)) * 31) + Boolean.hashCode(this.spinnerVisible);
    }

    public String toString() {
        return "LoadingState(isLoading=" + this.isLoading + ", loadingMessage=" + this.loadingMessage + ", loadingMessageBody=" + this.loadingMessageBody + ", spinnerVisible=" + this.spinnerVisible + ')';
    }

    public LoadingState(boolean z10, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, boolean z11) {
        this.isLoading = z10;
        this.loadingMessage = abstractC6392a;
        this.loadingMessageBody = abstractC6392a2;
        this.spinnerVisible = z11;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getLoadingMessage() {
        return this.loadingMessage;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getLoadingMessageBody() {
        return this.loadingMessageBody;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public /* synthetic */ LoadingState(boolean z10, AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : abstractC6392a, (i10 & 4) != 0 ? null : abstractC6392a2, (i10 & 8) != 0 ? true : z11);
    }
}
