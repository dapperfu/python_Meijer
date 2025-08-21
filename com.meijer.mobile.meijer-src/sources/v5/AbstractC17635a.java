package v5;

import com.adobe.marketing.mobile.assurance.internal.C6544a;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import v5.AbstractC17637c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \t2\u00020\u0001:\u0006\u0006\t\n\u000b\f\rB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0005\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lv5/a;", "", "Lv5/c;", PlaceTypes.ROUTE, "<init>", "(Lv5/c;)V", "a", "Lv5/c;", "()Lv5/c;", "b", "c", "d", "e", "f", "Lv5/a$b;", "Lv5/a$c;", "Lv5/a$d;", "Lv5/a$e;", "Lv5/a$f;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC17635a {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AbstractC17637c route;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lv5/a$a;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/assurance/internal/a$b$a;", "authorizing", "Lv5/a;", "b", "(Lcom/adobe/marketing/mobile/assurance/internal/a$b$a;)Lv5/a;", "Lcom/adobe/marketing/mobile/assurance/internal/a$b$c;", "disconnected", "c", "(Lcom/adobe/marketing/mobile/assurance/internal/a$b$c;)Lv5/a;", "Lcom/adobe/marketing/mobile/assurance/internal/a$b;", "sessionPhase", "a", "(Lcom/adobe/marketing/mobile/assurance/internal/a$b;)Lv5/a;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: v5.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AbstractC17635a a(C6544a.b sessionPhase) {
            Intrinsics.j(sessionPhase, "sessionPhase");
            if (sessionPhase instanceof C6544a.b.Disconnected) {
                return c((C6544a.b.Disconnected) sessionPhase);
            }
            if (sessionPhase instanceof C6544a.b.Authorizing) {
                return b((C6544a.b.Authorizing) sessionPhase);
            }
            if (Intrinsics.e(sessionPhase, C6544a.b.C1242b.f63062a)) {
                return e.f165593c;
            }
            throw new NoWhenBranchMatchedException();
        }

        private final AbstractC17635a b(C6544a.b.Authorizing authorizing) {
            C6544a.AbstractC1239a assuranceAuthorization = authorizing.getAssuranceAuthorization();
            if (assuranceAuthorization instanceof C6544a.AbstractC1239a.PinConnect) {
                return new PinDestination(new C6544a.AbstractC1239a.PinConnect(((C6544a.AbstractC1239a.PinConnect) authorizing.getAssuranceAuthorization()).getSessionId(), ((C6544a.AbstractC1239a.PinConnect) authorizing.getAssuranceAuthorization()).getEnvironment()));
            }
            if (assuranceAuthorization instanceof C6544a.AbstractC1239a.QuickConnect) {
                return new QuickConnectDestination(new C6544a.AbstractC1239a.QuickConnect(((C6544a.AbstractC1239a.QuickConnect) authorizing.getAssuranceAuthorization()).getEnvironment()));
            }
            throw new NoWhenBranchMatchedException();
        }

        private final AbstractC17635a c(C6544a.b.Disconnected disconnected) {
            if (disconnected.getReconnecting()) {
                return e.f165593c;
            }
            if (disconnected.getError() != null) {
                return new ErrorDestination(disconnected);
            }
            return f.f165594c;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lv5/a$b;", "Lv5/a;", "Lcom/adobe/marketing/mobile/assurance/internal/a$b$c;", "disconnected", "<init>", "(Lcom/adobe/marketing/mobile/assurance/internal/a$b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lcom/adobe/marketing/mobile/assurance/internal/a$b$c;", "b", "()Lcom/adobe/marketing/mobile/assurance/internal/a$b$c;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: v5.a$b, reason: from toString */
    public static final /* data */ class ErrorDestination extends AbstractC17635a {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final C6544a.b.Disconnected disconnected;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ErrorDestination) && Intrinsics.e(this.disconnected, ((ErrorDestination) other).disconnected);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorDestination(C6544a.b.Disconnected disconnected) {
            super(AbstractC17637c.a.f165609b, null);
            Intrinsics.j(disconnected, "disconnected");
            this.disconnected = disconnected;
        }

        /* renamed from: b, reason: from getter */
        public final C6544a.b.Disconnected getDisconnected() {
            return this.disconnected;
        }

        public int hashCode() {
            return this.disconnected.hashCode();
        }

        public String toString() {
            return "ErrorDestination(disconnected=" + this.disconnected + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lv5/a$c;", "Lv5/a;", "Lcom/adobe/marketing/mobile/assurance/internal/a$a$a;", "pinConnect", "<init>", "(Lcom/adobe/marketing/mobile/assurance/internal/a$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lcom/adobe/marketing/mobile/assurance/internal/a$a$a;", "b", "()Lcom/adobe/marketing/mobile/assurance/internal/a$a$a;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: v5.a$c, reason: from toString */
    public static final /* data */ class PinDestination extends AbstractC17635a {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final C6544a.AbstractC1239a.PinConnect pinConnect;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PinDestination) && Intrinsics.e(this.pinConnect, ((PinDestination) other).pinConnect);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PinDestination(C6544a.AbstractC1239a.PinConnect pinConnect) {
            super(AbstractC17637c.b.f165610b, null);
            Intrinsics.j(pinConnect, "pinConnect");
            this.pinConnect = pinConnect;
        }

        /* renamed from: b, reason: from getter */
        public final C6544a.AbstractC1239a.PinConnect getPinConnect() {
            return this.pinConnect;
        }

        public int hashCode() {
            return this.pinConnect.hashCode();
        }

        public String toString() {
            return "PinDestination(pinConnect=" + this.pinConnect + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lv5/a$d;", "Lv5/a;", "Lcom/adobe/marketing/mobile/assurance/internal/a$a$b;", "quickConnect", "<init>", "(Lcom/adobe/marketing/mobile/assurance/internal/a$a$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lcom/adobe/marketing/mobile/assurance/internal/a$a$b;", "b", "()Lcom/adobe/marketing/mobile/assurance/internal/a$a$b;", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: v5.a$d, reason: from toString */
    public static final /* data */ class QuickConnectDestination extends AbstractC17635a {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final C6544a.AbstractC1239a.QuickConnect quickConnect;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof QuickConnectDestination) && Intrinsics.e(this.quickConnect, ((QuickConnectDestination) other).quickConnect);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuickConnectDestination(C6544a.AbstractC1239a.QuickConnect quickConnect) {
            super(AbstractC17637c.C2620c.f165611b, null);
            Intrinsics.j(quickConnect, "quickConnect");
            this.quickConnect = quickConnect;
        }

        /* renamed from: b, reason: from getter */
        public final C6544a.AbstractC1239a.QuickConnect getQuickConnect() {
            return this.quickConnect;
        }

        public int hashCode() {
            return this.quickConnect.hashCode();
        }

        public String toString() {
            return "QuickConnectDestination(quickConnect=" + this.quickConnect + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv5/a$e;", "Lv5/a;", "<init>", "()V", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: v5.a$e */
    public static final class e extends AbstractC17635a {

        /* renamed from: c, reason: collision with root package name */
        public static final e f165593c = new e();

        private e() {
            super(AbstractC17637c.d.f165612b, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv5/a$f;", "Lv5/a;", "<init>", "()V", "assurance_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: v5.a$f */
    public static final class f extends AbstractC17635a {

        /* renamed from: c, reason: collision with root package name */
        public static final f f165594c = new f();

        private f() {
            super(AbstractC17637c.e.f165613b, null);
        }
    }

    public /* synthetic */ AbstractC17635a(AbstractC17637c abstractC17637c, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC17637c);
    }

    private AbstractC17635a(AbstractC17637c abstractC17637c) {
        this.route = abstractC17637c;
    }

    /* renamed from: a, reason: from getter */
    public final AbstractC17637c getRoute() {
        return this.route;
    }
}
