package pr;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lpr/b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pr.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC16365b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC16365b f156293a = new EnumC16365b("PRODUCT_DETAILS", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC16365b f156294b = new EnumC16365b("ADD_SUBSCRIPTION", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC16365b f156295c = new EnumC16365b("EXISTING_SUBSCRIPTION", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC16365b f156296d = new EnumC16365b("UNKNOWN", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC16365b[] f156297e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f156298f;

    static {
        EnumC16365b[] enumC16365bArrA = a();
        f156297e = enumC16365bArrA;
        f156298f = EnumEntriesKt.a(enumC16365bArrA);
    }

    private static final /* synthetic */ EnumC16365b[] a() {
        return new EnumC16365b[]{f156293a, f156294b, f156295c, f156296d};
    }

    public static EnumC16365b valueOf(String str) {
        return (EnumC16365b) Enum.valueOf(EnumC16365b.class, str);
    }

    public static EnumC16365b[] values() {
        return (EnumC16365b[]) f156297e.clone();
    }

    private EnumC16365b(String str, int i10) {
    }
}
