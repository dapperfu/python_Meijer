package Ho;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"LHo/b;", "", "", "sourceName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "fulldetails_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f13874b = new b("CONSTRUCTOR", 0, "Constructor");

    /* renamed from: c, reason: collision with root package name */
    public static final b f13875c = new b("CRITEO", 1, "Criteo");

    /* renamed from: d, reason: collision with root package name */
    public static final b f13876d = new b("PENTALEAP", 2, "Pentaleap");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ b[] f13877e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f13878f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String sourceName;

    static {
        b[] bVarArrA = a();
        f13877e = bVarArrA;
        f13878f = EnumEntriesKt.a(bVarArrA);
    }

    private static final /* synthetic */ b[] a() {
        return new b[]{f13874b, f13875c, f13876d};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f13877e.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getSourceName() {
        return this.sourceName;
    }

    private b(String str, int i10, String str2) {
        this.sourceName = str2;
    }
}
