package Yh;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kr.C15307d;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LYh/a;", "", "Lak/a;", "title", "description", "buttonText", "", "image", "<init>", "(Lak/a;Lak/a;Lak/a;Ljava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "d", "()Lak/a;", "b", "c", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "e", "()Z", "isViewSubscriptionsState", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Yh.a, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class SubscriptionEmptyOrErrorStateDecorator {

    /* renamed from: e, reason: collision with root package name */
    public static final int f40264e = AbstractC5607a.f45514b;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a buttonText;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer image;

    public SubscriptionEmptyOrErrorStateDecorator() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubscriptionEmptyOrErrorStateDecorator)) {
            return false;
        }
        SubscriptionEmptyOrErrorStateDecorator subscriptionEmptyOrErrorStateDecorator = (SubscriptionEmptyOrErrorStateDecorator) other;
        return Intrinsics.e(this.title, subscriptionEmptyOrErrorStateDecorator.title) && Intrinsics.e(this.description, subscriptionEmptyOrErrorStateDecorator.description) && Intrinsics.e(this.buttonText, subscriptionEmptyOrErrorStateDecorator.buttonText) && Intrinsics.e(this.image, subscriptionEmptyOrErrorStateDecorator.image);
    }

    public SubscriptionEmptyOrErrorStateDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, Integer num) {
        this.title = abstractC5607a;
        this.description = abstractC5607a2;
        this.buttonText = abstractC5607a3;
        this.image = num;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getButtonText() {
        return this.buttonText;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getDescription() {
        return this.description;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getImage() {
        return this.image;
    }

    /* renamed from: d, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    public final boolean e() {
        return Intrinsics.e(this.buttonText, AbstractC5607a.INSTANCE.d(C15307d.f147911z0, new Object[0]));
    }

    public int hashCode() {
        AbstractC5607a abstractC5607a = this.title;
        int iHashCode = (abstractC5607a == null ? 0 : abstractC5607a.hashCode()) * 31;
        AbstractC5607a abstractC5607a2 = this.description;
        int iHashCode2 = (iHashCode + (abstractC5607a2 == null ? 0 : abstractC5607a2.hashCode())) * 31;
        AbstractC5607a abstractC5607a3 = this.buttonText;
        int iHashCode3 = (iHashCode2 + (abstractC5607a3 == null ? 0 : abstractC5607a3.hashCode())) * 31;
        Integer num = this.image;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "SubscriptionEmptyOrErrorStateDecorator(title=" + this.title + ", description=" + this.description + ", buttonText=" + this.buttonText + ", image=" + this.image + ')';
    }

    public /* synthetic */ SubscriptionEmptyOrErrorStateDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, AbstractC5607a abstractC5607a3, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC5607a, (i10 & 2) != 0 ? null : abstractC5607a2, (i10 & 4) != 0 ? null : abstractC5607a3, (i10 & 8) != 0 ? null : num);
    }
}
