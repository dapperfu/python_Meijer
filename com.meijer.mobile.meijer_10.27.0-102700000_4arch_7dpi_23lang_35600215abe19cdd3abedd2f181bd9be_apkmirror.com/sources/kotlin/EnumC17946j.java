package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lx0/j;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class EnumC17946j {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17946j f167996a = new EnumC17946j("Back", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17946j f167997b = new EnumC17946j("Front", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC17946j[] f167998c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f167999d;

    static {
        EnumC17946j[] enumC17946jArrA = a();
        f167998c = enumC17946jArrA;
        f167999d = EnumEntriesKt.a(enumC17946jArrA);
    }

    private static final /* synthetic */ EnumC17946j[] a() {
        return new EnumC17946j[]{f167996a, f167997b};
    }

    public static EnumC17946j valueOf(String str) {
        return (EnumC17946j) Enum.valueOf(EnumC17946j.class, str);
    }

    public static EnumC17946j[] values() {
        return (EnumC17946j[]) f167998c.clone();
    }

    private EnumC17946j(String str, int i10) {
    }
}
