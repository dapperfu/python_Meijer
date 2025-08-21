package es;

import as.C6293f;
import bk.AbstractC6392a;
import fj.DeliveryMode;
import hj.OrderDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Les/e;", "Les/b;", "Lbk/a;", "title", "subTitle", "<init>", "(Lbk/a;Lbk/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lbk/a;", "()Lbk/a;", "c", "a", "d", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: es.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes12.dex */
public final /* data */ class OrderHeaderDecorator extends AbstractC13866b {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f130702e = AbstractC6392a.f60445b;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC6392a subTitle;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Les/e$a;", "", "<init>", "()V", "Lhj/c;", "orderDetail", "Les/e;", "a", "(Lhj/c;)Les/e;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: es.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final OrderHeaderDecorator a(OrderDetail orderDetail) {
            Intrinsics.j(orderDetail, "orderDetail");
            boolean z10 = orderDetail.getDeliveryMode() != null;
            DeliveryMode deliveryMode = orderDetail.getDeliveryMode();
            int i10 = 2;
            AbstractC6392a abstractC6392a = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            if (deliveryMode != null && z10 == deliveryMode.c()) {
                return new OrderHeaderDecorator(AbstractC6392a.INSTANCE.d(C6293f.f59645a, new Object[0]), abstractC6392a, i10, objArr5 == true ? 1 : 0);
            }
            DeliveryMode deliveryMode2 = orderDetail.getDeliveryMode();
            return (deliveryMode2 == null || z10 != deliveryMode2.f()) ? new OrderHeaderDecorator(AbstractC6392a.INSTANCE.d(C6293f.f59651g, new Object[0]), objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0) : new OrderHeaderDecorator(AbstractC6392a.INSTANCE.d(C6293f.f59670z, new Object[0]), objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0);
        }
    }

    public /* synthetic */ OrderHeaderDecorator(AbstractC6392a abstractC6392a, AbstractC6392a abstractC6392a2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC6392a, (i10 & 2) != 0 ? null : abstractC6392a2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderHeaderDecorator)) {
            return false;
        }
        OrderHeaderDecorator orderHeaderDecorator = (OrderHeaderDecorator) other;
        return Intrinsics.e(this.title, orderHeaderDecorator.title) && Intrinsics.e(this.subTitle, orderHeaderDecorator.subTitle);
    }

    public OrderHeaderDecorator(AbstractC6392a title, AbstractC6392a abstractC6392a) {
        Intrinsics.j(title, "title");
        this.title = title;
        this.subTitle = abstractC6392a;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC6392a getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC6392a getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AbstractC6392a abstractC6392a = this.subTitle;
        return iHashCode + (abstractC6392a == null ? 0 : abstractC6392a.hashCode());
    }

    public String toString() {
        return "OrderHeaderDecorator(title=" + this.title + ", subTitle=" + this.subTitle + ')';
    }
}
