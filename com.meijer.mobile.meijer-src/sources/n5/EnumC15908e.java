package n5;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ln5/e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: n5.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC15908e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC15908e f152051a = new EnumC15908e("EXACT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC15908e f152052b = new EnumC15908e("INEXACT", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC15908e f152053c = new EnumC15908e("AUTOMATIC", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC15908e[] f152054d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f152055e;

    static {
        EnumC15908e[] enumC15908eArrA = a();
        f152054d = enumC15908eArrA;
        f152055e = EnumEntriesKt.a(enumC15908eArrA);
    }

    private static final /* synthetic */ EnumC15908e[] a() {
        return new EnumC15908e[]{f152051a, f152052b, f152053c};
    }

    public static EnumC15908e valueOf(String str) {
        return (EnumC15908e) Enum.valueOf(EnumC15908e.class, str);
    }

    public static EnumC15908e[] values() {
        return (EnumC15908e[]) f152054d.clone();
    }

    private EnumC15908e(String str, int i10) {
    }
}
