package n5;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ln5/h;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: n5.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC15911h {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC15911h f152059a = new EnumC15911h("FILL", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC15911h f152060b = new EnumC15911h("FIT", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC15911h[] f152061c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f152062d;

    static {
        EnumC15911h[] enumC15911hArrA = a();
        f152061c = enumC15911hArrA;
        f152062d = EnumEntriesKt.a(enumC15911hArrA);
    }

    private static final /* synthetic */ EnumC15911h[] a() {
        return new EnumC15911h[]{f152059a, f152060b};
    }

    public static EnumC15911h valueOf(String str) {
        return (EnumC15911h) Enum.valueOf(EnumC15911h.class, str);
    }

    public static EnumC15911h[] values() {
        return (EnumC15911h[]) f152061c.clone();
    }

    private EnumC15911h(String str, int i10) {
    }
}
