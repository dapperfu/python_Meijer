package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lx0/q1;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC18035q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC18035q1 f169724a = new EnumC18035q1("Dismissed", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC18035q1 f169725b = new EnumC18035q1("ActionPerformed", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC18035q1[] f169726c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f169727d;

    static {
        EnumC18035q1[] enumC18035q1ArrA = a();
        f169726c = enumC18035q1ArrA;
        f169727d = EnumEntriesKt.a(enumC18035q1ArrA);
    }

    private static final /* synthetic */ EnumC18035q1[] a() {
        return new EnumC18035q1[]{f169724a, f169725b};
    }

    public static EnumC18035q1 valueOf(String str) {
        return (EnumC18035q1) Enum.valueOf(EnumC18035q1.class, str);
    }

    public static EnumC18035q1[] values() {
        return (EnumC18035q1[]) f169726c.clone();
    }

    private EnumC18035q1(String str, int i10) {
    }
}
