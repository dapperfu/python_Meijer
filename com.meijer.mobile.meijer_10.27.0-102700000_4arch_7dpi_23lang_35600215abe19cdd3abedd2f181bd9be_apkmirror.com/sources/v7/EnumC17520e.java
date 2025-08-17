package v7;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lv7/e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: v7.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC17520e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17520e f164590a = new EnumC17520e("WIFI", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17520e f164591b = new EnumC17520e("CELLULAR", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17520e f164592c = new EnumC17520e("ETHERNET", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC17520e f164593d = new EnumC17520e("OTHER", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC17520e f164594e = new EnumC17520e("NONE", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC17520e[] f164595f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f164596g;

    public static EnumEntries<EnumC17520e> b() {
        return f164596g;
    }

    static {
        EnumC17520e[] enumC17520eArrA = a();
        f164595f = enumC17520eArrA;
        f164596g = EnumEntriesKt.a(enumC17520eArrA);
    }

    private static final /* synthetic */ EnumC17520e[] a() {
        return new EnumC17520e[]{f164590a, f164591b, f164592c, f164593d, f164594e};
    }

    public static EnumC17520e valueOf(String str) {
        return (EnumC17520e) Enum.valueOf(EnumC17520e.class, str);
    }

    public static EnumC17520e[] values() {
        return (EnumC17520e[]) f164595f.clone();
    }

    private EnumC17520e(String str, int i10) {
    }
}
