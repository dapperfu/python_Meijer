package es;

import ak.AbstractC5607a;
import as.C6152f;
import ej.DeliveryMode;
import gj.OrderDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0016B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0018"}, d2 = {"Les/e;", "Les/b;", "Lak/a;", "title", "subTitle", "<init>", "(Lak/a;Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lak/a;", "()Lak/a;", "c", "a", "d", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: es.e, reason: case insensitive filesystem and from toString */
/* loaded from: classes11.dex */
public final /* data */ class OrderHeaderDecorator extends AbstractC13757b {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f129861e = AbstractC5607a.f45514b;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a subTitle;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Les/e$a;", "", "<init>", "()V", "Lgj/c;", "orderDetail", "Les/e;", "a", "(Lgj/c;)Les/e;", "homescreen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
            AbstractC5607a abstractC5607a = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            if (deliveryMode != null && z10 == deliveryMode.c()) {
                return new OrderHeaderDecorator(AbstractC5607a.INSTANCE.d(C6152f.f59445a, new Object[0]), abstractC5607a, i10, objArr5 == true ? 1 : 0);
            }
            DeliveryMode deliveryMode2 = orderDetail.getDeliveryMode();
            return (deliveryMode2 == null || z10 != deliveryMode2.f()) ? new OrderHeaderDecorator(AbstractC5607a.INSTANCE.d(C6152f.f59451g, new Object[0]), objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0) : new OrderHeaderDecorator(AbstractC5607a.INSTANCE.d(C6152f.f59470z, new Object[0]), objArr4 == true ? 1 : 0, i10, objArr3 == true ? 1 : 0);
        }
    }

    public /* synthetic */ OrderHeaderDecorator(AbstractC5607a abstractC5607a, AbstractC5607a abstractC5607a2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC5607a, (i10 & 2) != 0 ? null : abstractC5607a2);
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

    public OrderHeaderDecorator(AbstractC5607a title, AbstractC5607a abstractC5607a) {
        Intrinsics.j(title, "title");
        this.title = title;
        this.subTitle = abstractC5607a;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC5607a getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AbstractC5607a abstractC5607a = this.subTitle;
        return iHashCode + (abstractC5607a == null ? 0 : abstractC5607a.hashCode());
    }

    public String toString() {
        return "OrderHeaderDecorator(title=" + this.title + ", subTitle=" + this.subTitle + ')';
    }
}
