package hg;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0010¨\u0006\u0011"}, d2 = {"Lhg/N;", "", "Lhg/X;", "timeProvider", "Lhg/Z;", "uuidGenerator", "<init>", "(Lhg/X;Lhg/Z;)V", "", "b", "()Ljava/lang/String;", "Lhg/H;", "currentSession", "a", "(Lhg/H;)Lhg/H;", "Lhg/X;", "Lhg/Z;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final X timeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Z uuidGenerator;

    public N(X timeProvider, Z uuidGenerator) {
        Intrinsics.j(timeProvider, "timeProvider");
        Intrinsics.j(uuidGenerator, "uuidGenerator");
        this.timeProvider = timeProvider;
        this.uuidGenerator = uuidGenerator;
    }

    private final String b() {
        String string = this.uuidGenerator.next().toString();
        Intrinsics.i(string, "toString(...)");
        String lowerCase = StringsKt.Q(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final SessionDetails a(SessionDetails currentSession) {
        String firstSessionId;
        int sessionIndex;
        String strB = b();
        if (currentSession == null || (firstSessionId = currentSession.getFirstSessionId()) == null) {
            firstSessionId = strB;
        }
        if (currentSession != null) {
            sessionIndex = currentSession.getSessionIndex() + 1;
        } else {
            sessionIndex = 0;
        }
        return new SessionDetails(strB, firstSessionId, sessionIndex, this.timeProvider.a().getUs());
    }
}
