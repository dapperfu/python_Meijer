package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lx0/t;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17975t {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17975t f168664a = new EnumC17975t("Collapsed", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17975t f168665b = new EnumC17975t("Expanded", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC17975t[] f168666c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f168667d;

    static {
        EnumC17975t[] enumC17975tArrA = a();
        f168666c = enumC17975tArrA;
        f168667d = EnumEntriesKt.a(enumC17975tArrA);
    }

    private static final /* synthetic */ EnumC17975t[] a() {
        return new EnumC17975t[]{f168664a, f168665b};
    }

    public static EnumC17975t valueOf(String str) {
        return (EnumC17975t) Enum.valueOf(EnumC17975t.class, str);
    }

    public static EnumC17975t[] values() {
        return (EnumC17975t[]) f168666c.clone();
    }

    private EnumC17975t(String str, int i10) {
    }
}
