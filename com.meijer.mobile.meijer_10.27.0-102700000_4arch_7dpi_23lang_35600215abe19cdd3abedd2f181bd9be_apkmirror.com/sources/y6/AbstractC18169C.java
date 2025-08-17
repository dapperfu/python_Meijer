package y6;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0005*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0006\u0005\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Ly6/C;", "V", "", "<init>", "()V", "a", "c", "b", "Ly6/C$a;", "Ly6/C$c;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: y6.C, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC18169C<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ly6/C$a;", "Ly6/C;", "", "<init>", "()V", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.C$a */
    public static final class a extends AbstractC18169C {

        /* renamed from: b, reason: collision with root package name */
        public static final a f170219b = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\b\b\u0001\u0010\u0007*\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly6/C$b;", "", "<init>", "()V", "Ly6/C$a;", "a", "()Ly6/C$a;", "V", "value", "Ly6/C$c;", "b", "(Ljava/lang/Object;)Ly6/C$c;", "Ly6/C;", "c", "(Ljava/lang/Object;)Ly6/C;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.C$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final a a() {
            return a.f170219b;
        }

        @JvmStatic
        public final <V> Present<V> b(V value) {
            return new Present<>(value);
        }

        @JvmStatic
        public final <V> AbstractC18169C<V> c(V value) {
            return value == null ? a.f170219b : new Present(value);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ly6/C$c;", "V", "Ly6/C;", "value", "<init>", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: y6.C$c, reason: from toString */
    public static final /* data */ class Present<V> extends AbstractC18169C<V> {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final V value;

        public Present(V v10) {
            super(null);
            this.value = v10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Present) && Intrinsics.e(this.value, ((Present) other).value);
        }

        public final V a() {
            return this.value;
        }

        public int hashCode() {
            V v10 = this.value;
            if (v10 == null) {
                return 0;
            }
            return v10.hashCode();
        }

        public String toString() {
            return "Present(value=" + this.value + ')';
        }
    }

    public /* synthetic */ AbstractC18169C(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC18169C() {
    }
}
