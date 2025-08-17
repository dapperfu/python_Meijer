package xo;

import ak.AbstractC5607a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import wo.C17843b;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, d2 = {"Lxo/c;", "Lxo/b;", "Lak/a;", "header", "<init>", "(Lak/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lak/a;", "()Lak/a;", "c", "a", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xo.c, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class OrderHistoryHeaderDecorator extends AbstractC18074b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a header;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lxo/c$a;", "", "<init>", "()V", "", "inProgress", "Lxo/c;", "a", "(Ljava/lang/String;)Lxo/c;", "IN_PROGRESS_ORDER", "Ljava/lang/String;", "PAST_ORDER", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: xo.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OrderHistoryHeaderDecorator a(String inProgress) {
            Intrinsics.j(inProgress, "inProgress");
            AbstractC5607a.Companion companion = AbstractC5607a.INSTANCE;
            AbstractC5607a abstractC5607aD = companion.d(C17843b.f166247f, new Object[0]);
            if (!Intrinsics.e(inProgress, "in_progress_order")) {
                abstractC5607aD = null;
            }
            if (abstractC5607aD == null) {
                abstractC5607aD = companion.d(C17843b.f166262u, new Object[0]);
            }
            return new OrderHistoryHeaderDecorator(abstractC5607aD);
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OrderHistoryHeaderDecorator) && Intrinsics.e(this.header, ((OrderHistoryHeaderDecorator) other).header);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderHistoryHeaderDecorator(AbstractC5607a header) {
        super(header.toString());
        Intrinsics.j(header, "header");
        this.header = header;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getHeader() {
        return this.header;
    }

    public int hashCode() {
        return this.header.hashCode();
    }

    public String toString() {
        return "OrderHistoryHeaderDecorator(header=" + this.header + ')';
    }
}
