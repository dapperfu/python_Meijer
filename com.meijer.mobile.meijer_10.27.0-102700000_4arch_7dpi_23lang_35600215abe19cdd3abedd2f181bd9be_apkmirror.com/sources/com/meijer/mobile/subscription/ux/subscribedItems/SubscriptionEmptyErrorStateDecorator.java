package com.meijer.mobile.subscription.ux.subscribedItems;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/subscription/ux/subscribedItems/r;", "", "Lak/a;", "title", "description", "", "image", "<init>", "(Lak/a;Lak/a;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "c", "()Lak/a;", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.subscription.ux.subscribedItems.r, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class SubscriptionEmptyErrorStateDecorator {

    /* renamed from: d, reason: collision with root package name */
    public static final int f118864d = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a description;

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
        AbstractC5607a abstractC5607a = this.title;
        int iHashCode = (abstractC5607a == null ? 0 : abstractC5607a.hashCode()) * 31;
        AbstractC5607a abstractC5607a2 = this.description;
        int iHashCode2 = (iHashCode + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
        Integer num = this.image;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionEmptyErrorStateDecorator(title=" + this.title + ", description=" + this.description + ", image=" + this.image + ')';
    }

    public SubscriptionEmptyErrorStateDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, Integer num) {
        this.title = abstractC5607a;
        this.description = abstractC5607a2;
        this.image = num;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getImage() {
        return this.image;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    public /* synthetic */ SubscriptionEmptyErrorStateDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC5607a, (i10 & 2) != 0 ? null : abstractC5607a2, (i10 & 4) != 0 ? null : num);
    }
}
