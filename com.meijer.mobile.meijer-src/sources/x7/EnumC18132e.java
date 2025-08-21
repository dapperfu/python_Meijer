package x7;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lx7/e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: x7.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC18132e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC18132e f170626a = new EnumC18132e("WIFI", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC18132e f170627b = new EnumC18132e("CELLULAR", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC18132e f170628c = new EnumC18132e("ETHERNET", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC18132e f170629d = new EnumC18132e("OTHER", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC18132e f170630e = new EnumC18132e("NONE", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC18132e[] f170631f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f170632g;

    public static EnumEntries<EnumC18132e> b() {
        return f170632g;
    }

    static {
        EnumC18132e[] enumC18132eArrA = a();
        f170631f = enumC18132eArrA;
        f170632g = EnumEntriesKt.a(enumC18132eArrA);
    }

    private static final /* synthetic */ EnumC18132e[] a() {
        return new EnumC18132e[]{f170626a, f170627b, f170628c, f170629d, f170630e};
    }

    public static EnumC18132e valueOf(String str) {
        return (EnumC18132e) Enum.valueOf(EnumC18132e.class, str);
    }

    public static EnumC18132e[] values() {
        return (EnumC18132e[]) f170631f.clone();
    }

    private EnumC18132e(String str, int i10) {
    }
}
