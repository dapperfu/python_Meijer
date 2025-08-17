package vk;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.TemporalQuery;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\b\u0010\u0007\u001a5\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"T", "", "j$/time/format/DateTimeFormatter", "formatter", "j$/time/temporal/TemporalQuery", "type", "a", "(Ljava/lang/String;Lj$/time/format/DateTimeFormatter;Lj$/time/temporal/TemporalQuery;)Ljava/lang/Object;", "b", "", "formats", "c", "(Ljava/lang/String;Ljava/util/List;Lj$/time/temporal/TemporalQuery;)Ljava/lang/Object;", "util_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class d {
    public static final <T> T a(String str, DateTimeFormatter formatter, TemporalQuery<T> type) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(formatter, "formatter");
        Intrinsics.j(type, "type");
        return (T) formatter.parse(str, type);
    }

    public static final <T> T b(String str, DateTimeFormatter formatter, TemporalQuery<T> type) {
        T t10;
        Intrinsics.j(str, "<this>");
        Intrinsics.j(formatter, "formatter");
        Intrinsics.j(type, "type");
        try {
            Result.Companion companion = Result.INSTANCE;
            t10 = (T) Result.b(a(str, formatter, type));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            t10 = (T) Result.b(ResultKt.a(th2));
        }
        Throwable thE = Result.e(t10);
        if (thE != null) {
            uw.a.INSTANCE.u(thE, "Error parsing " + str + " to " + type + " with formatter " + formatter, new Object[0]);
        }
        if (Result.g(t10)) {
            return null;
        }
        return t10;
    }

    public static final <T> T c(String str, List<DateTimeFormatter> formats, TemporalQuery<T> type) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(formats, "formats");
        Intrinsics.j(type, "type");
        Iterator<T> it = formats.iterator();
        while (it.hasNext()) {
            T t10 = (T) b(str, (DateTimeFormatter) it.next(), type);
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }
}
