package hn;

import es.AbstractC13866b;
import hj.OrderDetail;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0081\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lhn/g;", "Les/b;", "", "isOrderEditable", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "a", "()Z", "c", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hn.g, reason: case insensitive filesystem and from toString */
/* loaded from: classes10.dex */
public final /* data */ class OrderDetailEditOrderDecorator extends AbstractC13866b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f135920d = AbstractC13866b.f130668a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isOrderEditable;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lhn/g$a;", "", "<init>", "()V", "Lhj/c;", "orderDetail", "Lhn/g;", "a", "(Lhj/c;)Lhn/g;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hn.g$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OrderDetailEditOrderDecorator a(OrderDetail orderDetail) {
            Intrinsics.j(orderDetail, "orderDetail");
            return new OrderDetailEditOrderDecorator(orderDetail.getEditable());
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderDetailEditOrderDecorator) && this.isOrderEditable == ((OrderDetailEditOrderDecorator) other).isOrderEditable;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getIsOrderEditable() {
        return this.isOrderEditable;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isOrderEditable);
    }

    public String toString() {
        return "OrderDetailEditOrderDecorator(isOrderEditable=" + this.isOrderEditable + ')';
    }

    public OrderDetailEditOrderDecorator(boolean z10) {
        this.isOrderEditable = z10;
    }
}
