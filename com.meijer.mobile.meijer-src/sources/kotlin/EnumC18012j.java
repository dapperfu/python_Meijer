package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lx0/j;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class EnumC18012j {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC18012j f169084a = new EnumC18012j("Back", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC18012j f169085b = new EnumC18012j("Front", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC18012j[] f169086c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f169087d;

    static {
        EnumC18012j[] enumC18012jArrA = a();
        f169086c = enumC18012jArrA;
        f169087d = EnumEntriesKt.a(enumC18012jArrA);
    }

    private static final /* synthetic */ EnumC18012j[] a() {
        return new EnumC18012j[]{f169084a, f169085b};
    }

    public static EnumC18012j valueOf(String str) {
        return (EnumC18012j) Enum.valueOf(EnumC18012j.class, str);
    }

    public static EnumC18012j[] values() {
        return (EnumC18012j[]) f169086c.clone();
    }

    private EnumC18012j(String str, int i10) {
    }
}
