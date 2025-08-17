package y6;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0006\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0006\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Ly6/l;", "", "T", "<init>", "()V", "f", "c", "d", "e", "a", "b", "Ly6/l$a;", "Ly6/l$b;", "Ly6/l$c;", "Ly6/l$d;", "Ly6/l$e;", "Ly6/l$f;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: y6.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC18184l<T> {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Ly6/l$a;", "", "T", "Ly6/l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "operands", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: y6.l$a, reason: from toString */
    public static final /* data */ class And<T> extends AbstractC18184l<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<AbstractC18184l<T>> operands;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof And) && Intrinsics.e(this.operands, ((And) other).operands);
        }

        public final Set<AbstractC18184l<T>> a() {
            return this.operands;
        }

        public int hashCode() {
            return this.operands.hashCode();
        }

        public String toString() {
            return "And(operands=" + this.operands + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly6/l$b;", "", "T", "Ly6/l;", "value", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.l$b, reason: from toString */
    public static final /* data */ class Element<T> extends AbstractC18184l<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final T value;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Element) && Intrinsics.e(this.value, ((Element) other).value);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Element(T value) {
            super(null);
            Intrinsics.j(value, "value");
            this.value = value;
        }

        public final T a() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Element(value=" + this.value + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ly6/l$c;", "Ly6/l;", "", "<init>", "()V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.l$c */
    public static final class c extends AbstractC18184l {

        /* renamed from: a, reason: collision with root package name */
        public static final c f170288a = new c();

        private c() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\n\b\u0001\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"Ly6/l$d;", "", "T", "Ly6/l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly6/l;", "()Ly6/l;", "operand", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.l$d, reason: from toString */
    public static final /* data */ class Not<T> extends AbstractC18184l<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC18184l<T> operand;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Not) && Intrinsics.e(this.operand, ((Not) other).operand);
        }

        public final AbstractC18184l<T> a() {
            return this.operand;
        }

        public int hashCode() {
            return this.operand.hashCode();
        }

        public String toString() {
            return "Not(operand=" + this.operand + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Ly6/l$e;", "", "T", "Ly6/l;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "operands", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: y6.l$e */
    public static final /* data */ class e<T> extends AbstractC18184l<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Set<AbstractC18184l<T>> operands;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof e) && Intrinsics.e(this.operands, ((e) other).operands);
        }

        public final Set<AbstractC18184l<T>> a() {
            return this.operands;
        }

        public int hashCode() {
            return this.operands.hashCode();
        }

        public String toString() {
            return CollectionsKt.B0(this.operands, " | ", null, null, 0, null, null, 62, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ly6/l$f;", "Ly6/l;", "", "<init>", "()V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.l$f */
    public static final class f extends AbstractC18184l {

        /* renamed from: a, reason: collision with root package name */
        public static final f f170291a = new f();

        private f() {
            super(null);
        }
    }

    public /* synthetic */ AbstractC18184l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC18184l() {
    }
}
