package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lx0/N0;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.N0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17961N0 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17961N0 f168314a = new EnumC17961N0("Hidden", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17961N0 f168315b = new EnumC17961N0("Expanded", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17961N0 f168316c = new EnumC17961N0("HalfExpanded", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC17961N0[] f168317d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f168318e;

    static {
        EnumC17961N0[] enumC17961N0ArrA = a();
        f168317d = enumC17961N0ArrA;
        f168318e = EnumEntriesKt.a(enumC17961N0ArrA);
    }

    private static final /* synthetic */ EnumC17961N0[] a() {
        return new EnumC17961N0[]{f168314a, f168315b, f168316c};
    }

    public static EnumC17961N0 valueOf(String str) {
        return (EnumC17961N0) Enum.valueOf(EnumC17961N0.class, str);
    }

    public static EnumC17961N0[] values() {
        return (EnumC17961N0[]) f168317d.clone();
    }

    private EnumC17961N0(String str, int i10) {
    }
}
