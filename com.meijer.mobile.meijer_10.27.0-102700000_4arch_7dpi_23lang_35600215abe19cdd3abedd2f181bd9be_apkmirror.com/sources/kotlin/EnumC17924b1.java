package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lx0/b1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.b1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class EnumC17924b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17924b1 f167711a = new EnumC17924b1("TopBar", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17924b1 f167712b = new EnumC17924b1("MainContent", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17924b1 f167713c = new EnumC17924b1("Snackbar", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC17924b1 f167714d = new EnumC17924b1("Fab", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC17924b1 f167715e = new EnumC17924b1("BottomBar", 4);

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC17924b1[] f167716f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f167717g;

    static {
        EnumC17924b1[] enumC17924b1ArrA = a();
        f167716f = enumC17924b1ArrA;
        f167717g = EnumEntriesKt.a(enumC17924b1ArrA);
    }

    private static final /* synthetic */ EnumC17924b1[] a() {
        return new EnumC17924b1[]{f167711a, f167712b, f167713c, f167714d, f167715e};
    }

    public static EnumC17924b1 valueOf(String str) {
        return (EnumC17924b1) Enum.valueOf(EnumC17924b1.class, str);
    }

    public static EnumC17924b1[] values() {
        return (EnumC17924b1[]) f167716f.clone();
    }

    private EnumC17924b1(String str, int i10) {
    }
}
