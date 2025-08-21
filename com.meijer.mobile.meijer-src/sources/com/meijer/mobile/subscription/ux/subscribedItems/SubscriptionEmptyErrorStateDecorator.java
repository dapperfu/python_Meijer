package com.meijer.mobile.subscription.ux.subscribedItems;

import bk.AbstractC6392a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscribedItems/r;", "", "Lbk/a;", "title", "description", "", "image", "<init>", "(Lbk/a;Lbk/a;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "c", "()Lbk/a;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.subscription.ux.subscribedItems.r, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class SubscriptionEmptyErrorStateDecorator {

    /* renamed from: d, reason: collision with root package name */
    public static final int f119812d = AbstractC6392a.f60445b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer image;

    public SubscriptionEmptyErrorStateDecorator() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionEmptyErrorStateDecorator)) {
            return false;
        }
        SubscriptionEmptyErrorStateDecorator subscriptionEmptyErrorStateDecorator = (SubscriptionEmptyErrorStateDecorator) other;
        return Intrinsics.e(this.title, subscriptionEmptyErrorStateDecorator.title) && Intrinsics.e(this.description, subscriptionEmptyErrorStateDecorator.description) && Intrinsics.e(this.image, subscriptionEmptyErrorStateDecorator.image);
    }

    public int hashCode() {
        AbstractC6392a abstractC6392a = this.title;
        int iHashCode = (abstractC6392a == null ? 0 : abstractC6392a.hashCode()) * 31;
        AbstractC6392a abstractC6392a2 = this.description;
        int iHashCode2 = (iHashCode + (abstractC6392a2 == null ? 0 : abstractC6392a2.hashCode())) * 31;
        Integer num = this.image;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionEmptyErrorStateDecorator(title=" + this.title + ", description=" + this.description + ", image=" + this.image + ')';
    }

    public SubscriptionEmptyErrorStateDecorator(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, Integer num) {
        this.title = abstractC6392a;
        this.description = abstractC6392a2;
        this.image = num;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getImage() {
        return this.image;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC6392a getTitle() {
        return this.title;
    }

    public /* synthetic */ SubscriptionEmptyErrorStateDecorator(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC6392a, (i10 & 2) != 0 ? null : abstractC6392a2, (i10 & 4) != 0 ? null : num);
    }
}
