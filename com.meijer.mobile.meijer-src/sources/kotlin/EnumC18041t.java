package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lx0/t;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC18041t {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC18041t f169752a = new EnumC18041t("Collapsed", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC18041t f169753b = new EnumC18041t("Expanded", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC18041t[] f169754c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f169755d;

    static {
        EnumC18041t[] enumC18041tArrA = a();
        f169754c = enumC18041tArrA;
        f169755d = EnumEntriesKt.a(enumC18041tArrA);
    }

    private static final /* synthetic */ EnumC18041t[] a() {
        return new EnumC18041t[]{f169752a, f169753b};
    }

    public static EnumC18041t valueOf(String str) {
        return (EnumC18041t) Enum.valueOf(EnumC18041t.class, str);
    }

    public static EnumC18041t[] values() {
        return (EnumC18041t[]) f169754c.clone();
    }

    private EnumC18041t(String str, int i10) {
    }
}
