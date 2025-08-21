package V7;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LV7/a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "e", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f39801b = new a("APPLICATION_CREATE", 0, "android.application.on_create");

    /* renamed from: c, reason: collision with root package name */
    public static final a f39802c = new a("ACTIVITY_CREATE", 1, "android.activity.on_create");

    /* renamed from: d, reason: collision with root package name */
    public static final a f39803d = new a("ACTIVITY_START", 2, "android.activity.on_start");

    /* renamed from: e, reason: collision with root package name */
    public static final a f39804e = new a("ACTIVITY_RESUMED", 3, null);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ a[] f39805f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f39806g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    static {
        a[] aVarArrA = a();
        f39805f = aVarArrA;
        f39806g = EnumEntriesKt.a(aVarArrA);
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f39801b, f39802c, f39803d, f39804e};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f39805f.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    private a(String str, int i10, String str2) {
        this.value = str2;
    }
}
