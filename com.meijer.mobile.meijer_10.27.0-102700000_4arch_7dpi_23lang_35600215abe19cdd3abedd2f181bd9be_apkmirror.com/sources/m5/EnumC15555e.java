package m5;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lm5/e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: m5.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC15555e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC15555e f149839a = new EnumC15555e("EXACT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC15555e f149840b = new EnumC15555e("INEXACT", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC15555e f149841c = new EnumC15555e("AUTOMATIC", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC15555e[] f149842d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f149843e;

    static {
        EnumC15555e[] enumC15555eArrA = a();
        f149842d = enumC15555eArrA;
        f149843e = EnumEntriesKt.a(enumC15555eArrA);
    }

    private static final /* synthetic */ EnumC15555e[] a() {
        return new EnumC15555e[]{f149839a, f149840b, f149841c};
    }

    public static EnumC15555e valueOf(String str) {
        return (EnumC15555e) Enum.valueOf(EnumC15555e.class, str);
    }

    public static EnumC15555e[] values() {
        return (EnumC15555e[]) f149842d.clone();
    }

    private EnumC15555e(String str, int i10) {
    }
}
