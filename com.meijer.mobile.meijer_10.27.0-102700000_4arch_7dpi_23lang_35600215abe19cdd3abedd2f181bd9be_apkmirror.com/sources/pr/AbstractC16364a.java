package pr;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0001\t¨\u0006\n"}, d2 = {"Lpr/a;", "", "Lmk/f;", "product", "<init>", "(Lmk/f;)V", "a", "Lmk/f;", "()Lmk/f;", "Lpr/a$a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pr.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC16364a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mk.f product;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpr/a$a;", "Lpr/a;", "Lmk/f;", "product", "<init>", "(Lmk/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lmk/f;", "a", "()Lmk/f;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pr.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class CreateSubscription extends AbstractC16364a {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final mk.f product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CreateSubscription) && Intrinsics.e(this.product, ((CreateSubscription) other).product);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CreateSubscription(mk.f product) {
            super(product, null);
            Intrinsics.j(product, "product");
            this.product = product;
        }

        @Override // pr.AbstractC16364a
        /* renamed from: a, reason: from getter */
        public mk.f getProduct() {
            return this.product;
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        public String toString() {
            return "CreateSubscription(product=" + this.product + ')';
        }
    }

    public /* synthetic */ AbstractC16364a(mk.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    private AbstractC16364a(mk.f fVar) {
        this.product = fVar;
    }

    /* renamed from: a, reason: from getter */
    public mk.f getProduct() {
        return this.product;
    }
}
