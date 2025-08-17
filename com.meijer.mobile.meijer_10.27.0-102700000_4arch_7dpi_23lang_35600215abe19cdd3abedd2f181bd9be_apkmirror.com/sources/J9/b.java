package J9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0015¨\u0006\u0017"}, d2 = {"LJ9/b;", "LJ9/e;", "", "throwable", "", "additionalInformation", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "", "b", "(Ljava/lang/Throwable;)Ljava/util/List;", "a", "Ljava/lang/Throwable;", "c", "()Ljava/lang/Throwable;", "", "", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "data", "()Ljava/lang/String;", "topic", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Throwable throwable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> data;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    public b(Throwable th2, String str) {
        ?? K10;
        this.throwable = th2;
        if (th2 != null) {
            Map mapO = MapsKt.o(TuplesKt.a("exception", th2.getClass().getName()), TuplesKt.a("reason", th2.getMessage()), TuplesKt.a("additionalInformation", str), TuplesKt.a("stackTrace", b(th2)));
            K10 = new LinkedHashMap();
            for (Map.Entry entry : mapO.entrySet()) {
                if (entry.getValue() != null) {
                    K10.put(entry.getKey(), entry.getValue());
                }
            }
        } else {
            K10 = MapsKt.k();
        }
        this.data = K10;
    }

    @Override // J9.e
    public String a() {
        return "log_crash";
    }

    /* renamed from: c, reason: from getter */
    public final Throwable getThrowable() {
        return this.throwable;
    }

    @Override // J9.e
    public Map<String, Object> getData() {
        return this.data;
    }

    private final List<String> b(Throwable throwable) {
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        ArrayList arrayList = new ArrayList(stackTrace.length);
        Iterator itA = ArrayIteratorKt.a(stackTrace);
        while (itA.hasNext()) {
            String string = ((StackTraceElement) itA.next()).toString();
            Intrinsics.i(string, "toString(...)");
            arrayList.add(string);
        }
        return arrayList;
    }

    public /* synthetic */ b(Throwable th2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(th2, (i10 & 2) != 0 ? null : str);
    }
}
