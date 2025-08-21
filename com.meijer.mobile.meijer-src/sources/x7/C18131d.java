package x7;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "Lx7/e;", "a", "(Ljava/lang/String;)Lx7/e;", "com.dynatrace.agent_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x7.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18131d {
    public static final EnumC18132e a(String str) {
        EnumC18132e next;
        Intrinsics.j(str, "<this>");
        Iterator<EnumC18132e> it = EnumC18132e.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.e(next.toString(), str)) {
                break;
            }
        }
        return next;
    }
}
