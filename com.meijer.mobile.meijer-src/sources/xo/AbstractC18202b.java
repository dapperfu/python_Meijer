package xo;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Lxo/b;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "orderId", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xo.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC18202b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String orderId;

    public AbstractC18202b(String orderId) {
        Intrinsics.j(orderId, "orderId");
        this.orderId = orderId;
    }

    /* renamed from: a, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }
}
