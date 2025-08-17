package M7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LM7/c;", "", "LM7/b;", "sanitizers", "a", "(LM7/c;[LM7/b;)LM7/c;", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class d {
    public static final JsonAttribute a(JsonAttribute jsonAttribute, b[] sanitizers) {
        Intrinsics.j(jsonAttribute, "<this>");
        Intrinsics.j(sanitizers, "sanitizers");
        for (b bVar : sanitizers) {
            jsonAttribute = bVar.a(jsonAttribute);
            if (jsonAttribute == null) {
                return null;
            }
        }
        return jsonAttribute;
    }
}
