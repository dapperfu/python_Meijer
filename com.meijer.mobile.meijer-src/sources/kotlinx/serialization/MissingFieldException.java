package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001f\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "", "", "missingFields", "message", "", "cause", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Throwable;)V", "serialName", "(Ljava/util/List;Ljava/lang/String;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MissingFieldException extends SerializationException {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<String> missingFields;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List<String> missingFields, String str, Throwable th2) {
        super(str, th2);
        Intrinsics.j(missingFields, "missingFields");
        this.missingFields = missingFields;
    }

    public final List<String> a() {
        return this.missingFields;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MissingFieldException(List<String> missingFields, String serialName) {
        String str;
        Intrinsics.j(missingFields, "missingFields");
        Intrinsics.j(serialName, "serialName");
        if (missingFields.size() == 1) {
            str = "Field '" + missingFields.get(0) + "' is required for type with serial name '" + serialName + "', but it was missing";
        } else {
            str = "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing";
        }
        this(missingFields, str, null);
    }
}
