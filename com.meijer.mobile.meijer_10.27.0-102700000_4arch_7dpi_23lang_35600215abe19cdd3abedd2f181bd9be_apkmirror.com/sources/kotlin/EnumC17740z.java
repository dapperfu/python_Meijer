package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lw0/z;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17740z {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17740z f165632a = new EnumC17740z("Left", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17740z f165633b = new EnumC17740z("Middle", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17740z f165634c = new EnumC17740z("Right", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC17740z[] f165635d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f165636e;

    static {
        EnumC17740z[] enumC17740zArrA = a();
        f165635d = enumC17740zArrA;
        f165636e = EnumEntriesKt.a(enumC17740zArrA);
    }

    private static final /* synthetic */ EnumC17740z[] a() {
        return new EnumC17740z[]{f165632a, f165633b, f165634c};
    }

    public static EnumC17740z valueOf(String str) {
        return (EnumC17740z) Enum.valueOf(EnumC17740z.class, str);
    }

    public static EnumC17740z[] values() {
        return (EnumC17740z[]) f165635d.clone();
    }

    private EnumC17740z(String str, int i10) {
    }
}
