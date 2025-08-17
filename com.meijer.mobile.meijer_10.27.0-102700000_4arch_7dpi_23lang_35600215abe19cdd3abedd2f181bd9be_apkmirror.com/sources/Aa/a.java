package Aa;

import U9.l;
import java.util.Map;
import kotlin.Metadata;
import za.NotificationData;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J%\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LAa/a;", "", "", "", "remoteMessageData", "Lza/k;", "a", "(Ljava/util/Map;)Lza/k;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f135a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"LAa/a$a;", "", "<init>", "()V", "", "b", "I", "a", "()I", "DEFAULT_SMALL_NOTIFICATION_ICON", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Aa.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f135a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final int DEFAULT_SMALL_NOTIFICATION_ICON = l.f35854a;

        public final int a() {
            return DEFAULT_SMALL_NOTIFICATION_ICON;
        }

        private Companion() {
        }
    }

    NotificationData a(Map<String, String> remoteMessageData);
}
