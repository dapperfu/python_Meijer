package A7;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LA7/a;", "", "<init>", "()V", "b", "a", "LA7/a$a;", "LA7/a$b;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class a {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LA7/a$a;", "LA7/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: A7.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0006a extends a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0006a f178a = new C0006a();

        private C0006a() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof C0006a);
        }

        public String toString() {
            return "Disabled";
        }

        public int hashCode() {
            return 264509867;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LA7/a$b;", "LA7/a;", "", "onlyHighPriorityEvents", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: A7.a$b, reason: from toString */
    public static final /* data */ class Enabled extends a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean onlyHighPriorityEvents;

        public Enabled(boolean z10) {
            super(null);
            this.onlyHighPriorityEvents = z10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Enabled) && this.onlyHighPriorityEvents == ((Enabled) other).onlyHighPriorityEvents;
        }

        /* renamed from: a, reason: from getter */
        public final boolean getOnlyHighPriorityEvents() {
            return this.onlyHighPriorityEvents;
        }

        public int hashCode() {
            return Boolean.hashCode(this.onlyHighPriorityEvents);
        }

        public String toString() {
            return "Enabled(onlyHighPriorityEvents=" + this.onlyHighPriorityEvents + ')';
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
