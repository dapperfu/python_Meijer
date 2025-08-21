package Ul;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"LUl/e;", "", "", "message", "Lnk/c;", "product", "<init>", "(Ljava/lang/String;Lnk/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lnk/c;", "()Lnk/c;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ul.e, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class ToastMessageData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final nk.c product;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ToastMessageData)) {
            return false;
        }
        ToastMessageData toastMessageData = (ToastMessageData) other;
        return Intrinsics.e(this.message, toastMessageData.message) && Intrinsics.e(this.product, toastMessageData.product);
    }

    public ToastMessageData(String message, nk.c cVar) {
        Intrinsics.j(message, "message");
        this.message = message;
        this.product = cVar;
    }

    /* renamed from: a, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: b, reason: from getter */
    public final nk.c getProduct() {
        return this.product;
    }

    public int hashCode() {
        int iHashCode = this.message.hashCode() * 31;
        nk.c cVar = this.product;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        return "ToastMessageData(message=" + this.message + ", product=" + this.product + ')';
    }
}
