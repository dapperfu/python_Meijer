package K7;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a+\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\t\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"", "LK7/g;", "", "key", "", "value", "", "a", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Object;)V", "b", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {
    public static final void a(List<EnrichmentAttribute> list, String key, Object obj) {
        Intrinsics.j(list, "<this>");
        Intrinsics.j(key, "key");
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        Intrinsics.g(obj);
        list.add(new EnrichmentAttribute(key, obj));
    }

    public static final void b(List<EnrichmentAttribute> list, String key, Object obj) {
        Intrinsics.j(list, "<this>");
        Intrinsics.j(key, "key");
        if (obj != null) {
            a(list, key, obj);
        }
    }
}
