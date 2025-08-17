package m5;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lm5/h;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: m5.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC15558h {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC15558h f149847a = new EnumC15558h("FILL", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC15558h f149848b = new EnumC15558h("FIT", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC15558h[] f149849c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f149850d;

    static {
        EnumC15558h[] enumC15558hArrA = a();
        f149849c = enumC15558hArrA;
        f149850d = EnumEntriesKt.a(enumC15558hArrA);
    }

    private static final /* synthetic */ EnumC15558h[] a() {
        return new EnumC15558h[]{f149847a, f149848b};
    }

    public static EnumC15558h valueOf(String str) {
        return (EnumC15558h) Enum.valueOf(EnumC15558h.class, str);
    }

    public static EnumC15558h[] values() {
        return (EnumC15558h[]) f149849c.clone();
    }

    private EnumC15558h(String str, int i10) {
    }
}
