package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lx0/b1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class EnumC17990b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17990b1 f168799a = new EnumC17990b1("TopBar", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17990b1 f168800b = new EnumC17990b1("MainContent", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17990b1 f168801c = new EnumC17990b1("Snackbar", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC17990b1 f168802d = new EnumC17990b1("Fab", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC17990b1 f168803e = new EnumC17990b1("BottomBar", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC17990b1[] f168804f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f168805g;

    static {
        EnumC17990b1[] enumC17990b1ArrA = a();
        f168804f = enumC17990b1ArrA;
        f168805g = EnumEntriesKt.a(enumC17990b1ArrA);
    }

    private static final /* synthetic */ EnumC17990b1[] a() {
        return new EnumC17990b1[]{f168799a, f168800b, f168801c, f168802d, f168803e};
    }

    public static EnumC17990b1 valueOf(String str) {
        return (EnumC17990b1) Enum.valueOf(EnumC17990b1.class, str);
    }

    public static EnumC17990b1[] values() {
        return (EnumC17990b1[]) f168804f.clone();
    }

    private EnumC17990b1(String str, int i10) {
    }
}
