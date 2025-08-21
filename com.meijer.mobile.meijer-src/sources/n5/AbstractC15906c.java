package n5;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Ln5/c;", "", "<init>", "()V", "a", "b", "Ln5/c$a;", "Ln5/c$b;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: n5.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC15906c {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ln5/c$a;", "Ln5/c;", "", "px", "<init>", "(I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: n5.c$a */
    public static final class a extends AbstractC15906c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public final int px;

        public a(int i10) {
            super(null);
            this.px = i10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("px must be > 0.");
            }
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof a) && this.px == ((a) other).px;
        }

        /* renamed from: hashCode, reason: from getter */
        public int getPx() {
            return this.px;
        }

        public String toString() {
            return String.valueOf(this.px);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln5/c$b;", "Ln5/c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: n5.c$b */
    public static final class b extends AbstractC15906c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f152049a = new b();

        private b() {
            super(null);
        }

        public String toString() {
            return "Dimension.Undefined";
        }
    }

    public /* synthetic */ AbstractC15906c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC15906c() {
    }
}
