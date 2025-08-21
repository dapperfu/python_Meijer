package w5;

import com.adobe.marketing.mobile.assurance.internal.EnumC6550g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lw5/c;", "", "<init>", "()V", "a", "b", "c", "Lw5/c$a;", "Lw5/c$b;", "Lw5/c$c;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: w5.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17844c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw5/c$a;", "Lw5/c;", "<init>", "()V", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: w5.c$a */
    public static final class a extends AbstractC17844c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f166941a = new a();

        private a() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw5/c$b;", "Lw5/c;", "<init>", "()V", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: w5.c$b */
    public static final class b extends AbstractC17844c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f166942a = new b();

        private b() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lw5/c$c;", "Lw5/c;", "Lcom/adobe/marketing/mobile/assurance/internal/g;", "error", "<init>", "(Lcom/adobe/marketing/mobile/assurance/internal/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/adobe/marketing/mobile/assurance/internal/g;", "()Lcom/adobe/marketing/mobile/assurance/internal/g;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: w5.c$c, reason: collision with other inner class name and from toString */
    public static final /* data */ class Disconnected extends AbstractC17844c {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final EnumC6550g error;

        public Disconnected(EnumC6550g enumC6550g) {
            super(null);
            this.error = enumC6550g;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Disconnected) && this.error == ((Disconnected) other).error;
        }

        /* renamed from: a, reason: from getter */
        public final EnumC6550g getError() {
            return this.error;
        }

        public int hashCode() {
            EnumC6550g enumC6550g = this.error;
            if (enumC6550g == null) {
                return 0;
            }
            return enumC6550g.hashCode();
        }

        public String toString() {
            return "Disconnected(error=" + this.error + ')';
        }
    }

    public /* synthetic */ AbstractC17844c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC17844c() {
    }
}
