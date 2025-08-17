package Od;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
public final /* synthetic */ class D {
    public static /* synthetic */ Map.Entry a(Object obj, Object obj2) {
        Objects.requireNonNull(obj);
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
