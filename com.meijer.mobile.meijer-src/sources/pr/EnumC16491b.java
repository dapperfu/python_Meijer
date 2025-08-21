package pr;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lpr/b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pr.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC16491b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC16491b f157066a = new EnumC16491b("PRODUCT_DETAILS", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC16491b f157067b = new EnumC16491b("ADD_SUBSCRIPTION", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC16491b f157068c = new EnumC16491b("EXISTING_SUBSCRIPTION", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC16491b f157069d = new EnumC16491b("UNKNOWN", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC16491b[] f157070e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f157071f;

    static {
        EnumC16491b[] enumC16491bArrA = a();
        f157070e = enumC16491bArrA;
        f157071f = EnumEntriesKt.a(enumC16491bArrA);
    }

    private static final /* synthetic */ EnumC16491b[] a() {
        return new EnumC16491b[]{f157066a, f157067b, f157068c, f157069d};
    }

    public static EnumC16491b valueOf(String str) {
        return (EnumC16491b) Enum.valueOf(EnumC16491b.class, str);
    }

    public static EnumC16491b[] values() {
        return (EnumC16491b[]) f157070e.clone();
    }

    private EnumC16491b(String str, int i10) {
    }
}
