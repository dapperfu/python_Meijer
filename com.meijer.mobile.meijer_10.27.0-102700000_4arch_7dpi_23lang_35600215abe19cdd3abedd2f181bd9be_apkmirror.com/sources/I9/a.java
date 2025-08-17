package I9;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"LI9/a;", "", "", "priority", "<init>", "(Ljava/lang/String;II)V", "a", "I", "b", "()I", "c", "d", "e", "f", "g", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f13730b = new a("TRACE", 0, 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f13731c = new a("DEBUG", 1, 2);

    /* renamed from: d, reason: collision with root package name */
    public static final a f13732d = new a("INFO", 2, 3);

    /* renamed from: e, reason: collision with root package name */
    public static final a f13733e = new a("WARN", 3, 4);

    /* renamed from: f, reason: collision with root package name */
    public static final a f13734f = new a("ERROR", 4, 5);

    /* renamed from: g, reason: collision with root package name */
    public static final a f13735g = new a("METRIC", 5, 6);

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ a[] f13736h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f13737i;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int priority;

    static {
        a[] aVarArrA = a();
        f13736h = aVarArrA;
        f13737i = EnumEntriesKt.a(aVarArrA);
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f13730b, f13731c, f13732d, f13733e, f13734f, f13735g};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f13736h.clone();
    }

    /* renamed from: b, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    private a(String str, int i10, int i11) {
        this.priority = i11;
    }
}
