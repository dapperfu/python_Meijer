package F7;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"LF7/a;", "", "", "description", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f10298b = new a("UNCOMPRESSED", 0, "uncompressed");

    /* renamed from: c, reason: collision with root package name */
    public static final a f10299c = new a("GZIP", 1, "gzip");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f10300d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f10301e;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String description;

    static {
        a[] aVarArrA = a();
        f10300d = aVarArrA;
        f10301e = EnumEntriesKt.a(aVarArrA);
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f10298b, f10299c};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f10300d.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    private a(String str, int i10, String str2) {
        this.description = str2;
    }
}
