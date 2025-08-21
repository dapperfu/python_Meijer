package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lw0/e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17789e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17789e f166722a = new EnumC17789e("CROSSED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17789e f166723b = new EnumC17789e("NOT_CROSSED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17789e f166724c = new EnumC17789e("COLLAPSED", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC17789e[] f166725d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f166726e;

    static {
        EnumC17789e[] enumC17789eArrA = a();
        f166725d = enumC17789eArrA;
        f166726e = EnumEntriesKt.a(enumC17789eArrA);
    }

    private static final /* synthetic */ EnumC17789e[] a() {
        return new EnumC17789e[]{f166722a, f166723b, f166724c};
    }

    public static EnumC17789e valueOf(String str) {
        return (EnumC17789e) Enum.valueOf(EnumC17789e.class, str);
    }

    public static EnumC17789e[] values() {
        return (EnumC17789e[]) f166725d.clone();
    }

    private EnumC17789e(String str, int i10) {
    }
}
