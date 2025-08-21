package ia;

import ja.TriggeringEmarsysGeofence;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lia/n;", "", "LX8/a;", "completionListener", "", "a", "(LX8/a;)V", "", "isEnabled", "()Z", "", "Lja/c;", "triggeringEmarsysGeofences", "b", "(Ljava/util/List;)V", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface n {
    void a(X8.a completionListener);

    void b(List<TriggeringEmarsysGeofence> triggeringEmarsysGeofences);

    boolean isEnabled();
}
