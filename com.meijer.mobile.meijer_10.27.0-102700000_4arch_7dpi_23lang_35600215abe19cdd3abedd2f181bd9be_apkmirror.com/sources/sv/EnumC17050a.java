package sv;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lsv/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sv.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class EnumC17050a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17050a f161240a = new EnumC17050a("SUSPEND", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17050a f161241b = new EnumC17050a("DROP_OLDEST", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17050a f161242c = new EnumC17050a("DROP_LATEST", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC17050a[] f161243d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f161244e;

    static {
        EnumC17050a[] enumC17050aArrA = a();
        f161243d = enumC17050aArrA;
        f161244e = EnumEntriesKt.a(enumC17050aArrA);
    }

    private static final /* synthetic */ EnumC17050a[] a() {
        return new EnumC17050a[]{f161240a, f161241b, f161242c};
    }

    public static EnumC17050a valueOf(String str) {
        return (EnumC17050a) Enum.valueOf(EnumC17050a.class, str);
    }

    public static EnumC17050a[] values() {
        return (EnumC17050a[]) f161243d.clone();
    }

    private EnumC17050a(String str, int i10) {
    }
}
