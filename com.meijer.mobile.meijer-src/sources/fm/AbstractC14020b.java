package fm;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lfm/b;", "", "<init>", "()V", "a", "Lfm/b$a;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fm.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC14020b {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lfm/b$a;", "Lfm/b;", "", "deeplink", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "ux_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fm.b$a, reason: from toString */
    public static final /* data */ class NavigateToTeachersList extends AbstractC14020b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deeplink;

        public NavigateToTeachersList(String str) {
            super(null);
            this.deeplink = str;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToTeachersList) && Intrinsics.e(this.deeplink, ((NavigateToTeachersList) other).deeplink);
        }

        /* renamed from: a, reason: from getter */
        public final String getDeeplink() {
            return this.deeplink;
        }

        public int hashCode() {
            String str = this.deeplink;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "NavigateToTeachersList(deeplink=" + this.deeplink + ')';
        }
    }

    public /* synthetic */ AbstractC14020b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC14020b() {
    }
}
