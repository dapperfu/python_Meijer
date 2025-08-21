package lk;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nk.c;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Llk/a;", "", "<init>", "()V", "a", "c", "b", "Llk/a$a;", "Llk/a$b;", "Llk/a$c;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lk.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC15516a {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Llk/a$a;", "Llk/a;", "Lnk/c;", "product", "<init>", "(Lnk/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/c;", "()Lnk/c;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lk.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class Add extends AbstractC15516a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Add) && Intrinsics.e(this.product, ((Add) other).product);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Add(c product) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
        }

        /* renamed from: a, reason: from getter */
        public final c getProduct() {
            return this.product;
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        public String toString() {
            return "Add(product=" + this.product + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Llk/a$b;", "Llk/a;", "Lnk/c;", "product", "<init>", "(Lnk/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/c;", "()Lnk/c;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lk.a$b, reason: from toString */
    public static final /* data */ class Remove extends AbstractC15516a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Remove) && Intrinsics.e(this.product, ((Remove) other).product);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Remove(c product) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
        }

        /* renamed from: a, reason: from getter */
        public final c getProduct() {
            return this.product;
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        public String toString() {
            return "Remove(product=" + this.product + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Llk/a$c;", "Llk/a;", "Lnk/c;", "product", "<init>", "(Lnk/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lnk/c;", "()Lnk/c;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lk.a$c, reason: from toString */
    public static final /* data */ class View extends AbstractC15516a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final c product;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof View) && Intrinsics.e(this.product, ((View) other).product);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public View(c product) {
            super(null);
            Intrinsics.j(product, "product");
            this.product = product;
        }

        /* renamed from: a, reason: from getter */
        public final c getProduct() {
            return this.product;
        }

        public int hashCode() {
            return this.product.hashCode();
        }

        public String toString() {
            return "View(product=" + this.product + ')';
        }
    }

    public /* synthetic */ AbstractC15516a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC15516a() {
    }
}
