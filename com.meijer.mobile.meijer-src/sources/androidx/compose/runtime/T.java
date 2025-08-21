package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/T;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public static final T f50376a = new T("IGNORED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final T f50377b = new T("SCHEDULED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final T f50378c = new T("DEFERRED", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final T f50379d = new T("IMMINENT", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ T[] f50380e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f50381f;

    private static final /* synthetic */ T[] a() {
        return new T[]{f50376a, f50377b, f50378c, f50379d};
    }

    public static T valueOf(String str) {
        return (T) Enum.valueOf(T.class, str);
    }

    public static T[] values() {
        return (T[]) f50380e.clone();
    }

    static {
        T[] tArrA = a();
        f50380e = tArrA;
        f50381f = EnumEntriesKt.a(tArrA);
    }

    private T(String str, int i10) {
    }
}
