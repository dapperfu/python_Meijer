package fsimpl;

import com.fullstory.rust.RustInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fsimpl.fa, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14083fa {

    /* renamed from: b, reason: collision with root package name */
    private static final Set f132245b = new HashSet(Collections.singletonList(1));

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f132246a;

    public C14083fa(AtomicReference atomicReference) {
        this.f132246a = atomicReference;
    }

    private static String a(Map map, String str) {
        return (String) map.get(str);
    }

    private static int b(Map map, String str) {
        Object obj = map.get(str);
        if (obj == null) {
            return 0;
        }
        return ((Number) obj).intValue();
    }

    private static boolean b(Map map) {
        if (map == null || !map.containsKey("eventType") || !(map.get("eventType") instanceof Integer)) {
            return false;
        }
        return f132245b.contains(Integer.valueOf(b(map, "eventType")));
    }

    private static long c(Map map, String str) {
        Object obj = map.get(str);
        if (obj == null) {
            return 0L;
        }
        return ((Number) obj).longValue();
    }

    private static InterfaceC14090fh c(Map map) {
        int iB = b(map, "eventType");
        switch (iB) {
            case 1:
                return new C14093fk(a(map, "url"), a(map, "method"), c(map, "durationMS"), b(map, "statusCode"), c(map, "requestSize"), c(map, "responseSize"), b(map, "dataSource"));
            default:
                throw new IllegalArgumentException("Unknown event type: " + iB);
        }
    }

    private static ArrayList d(Map map, String str) {
        Object obj = map.get(str);
        return obj == null ? new ArrayList() : (ArrayList) obj;
    }

    public void a(Map map) {
        if (b(map)) {
            ((RustInterface) this.f132246a.get()).a(c(map));
            return;
        }
        int iB = b(map, "eventType");
        switch (iB) {
            case 2:
                ((RustInterface) this.f132246a.get()).a(a(map, "name"), (String[]) d(map, "frames").toArray(new String[0]));
                return;
            default:
                throw new IllegalArgumentException("Unknown event type: " + iB);
        }
    }
}
