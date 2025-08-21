package sr;

import gi.GoogleAdAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lsr/a;", "", "<init>", "()V", "a", "Lsr/a$a;", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sr.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC17144a {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsr/a$a;", "Lsr/a;", "Lgi/a;", "adAnalytics", "<init>", "(Lgi/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgi/a;", "()Lgi/a;", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sr.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class GoogleAdViewClicked extends AbstractC17144a {

        /* renamed from: b, reason: collision with root package name */
        public static final int f161638b = GoogleAdAnalytics.f134240f;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final GoogleAdAnalytics adAnalytics;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GoogleAdViewClicked) && Intrinsics.e(this.adAnalytics, ((GoogleAdViewClicked) other).adAnalytics);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GoogleAdViewClicked(GoogleAdAnalytics adAnalytics) {
            super(null);
            Intrinsics.j(adAnalytics, "adAnalytics");
            this.adAnalytics = adAnalytics;
        }

        /* renamed from: a, reason: from getter */
        public final GoogleAdAnalytics getAdAnalytics() {
            return this.adAnalytics;
        }

        public int hashCode() {
            return this.adAnalytics.hashCode();
        }

        public String toString() {
            return "GoogleAdViewClicked(adAnalytics=" + this.adAnalytics + ')';
        }
    }

    public /* synthetic */ AbstractC17144a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC17144a() {
    }
}
