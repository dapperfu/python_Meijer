package D6;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LD6/g;", "", "value", "", "a", "(LD6/g;Ljava/lang/Object;)V", "apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b {
    public static final void a(g gVar, Object obj) throws IOException {
        Intrinsics.j(gVar, "<this>");
        if (obj == null) {
            gVar.C3();
            return;
        }
        if (obj instanceof Map) {
            gVar.s();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                gVar.v1(String.valueOf(key));
                a(gVar, value);
            }
            gVar.F();
            Unit unit = Unit.f143329a;
            return;
        }
        if (obj instanceof List) {
            gVar.y();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                a(gVar, it.next());
            }
            gVar.x();
            Unit unit2 = Unit.f143329a;
            return;
        }
        if (obj instanceof Boolean) {
            gVar.C0(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Integer) {
            gVar.W(((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            gVar.U(((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            gVar.c0(((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof e) {
            gVar.O0((e) obj);
            return;
        }
        if (obj instanceof String) {
            gVar.e2((String) obj);
            return;
        }
        throw new IllegalStateException(("Cannot write " + obj + " of class '" + Reflection.b(obj.getClass()) + "' to Json").toString());
    }
}
