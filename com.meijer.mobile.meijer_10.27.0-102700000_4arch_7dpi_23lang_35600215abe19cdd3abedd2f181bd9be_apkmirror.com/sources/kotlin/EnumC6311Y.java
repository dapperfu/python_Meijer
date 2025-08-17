package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lc0/Y;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6311Y {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6311Y f60976a = new EnumC6311Y("Restart", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6311Y f60977b = new EnumC6311Y("Reverse", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC6311Y[] f60978c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f60979d;

    static {
        EnumC6311Y[] enumC6311YArrA = a();
        f60978c = enumC6311YArrA;
        f60979d = EnumEntriesKt.a(enumC6311YArrA);
    }

    private static final /* synthetic */ EnumC6311Y[] a() {
        return new EnumC6311Y[]{f60976a, f60977b};
    }

    public static EnumC6311Y valueOf(String str) {
        return (EnumC6311Y) Enum.valueOf(EnumC6311Y.class, str);
    }

    public static EnumC6311Y[] values() {
        return (EnumC6311Y[]) f60978c.clone();
    }

    private EnumC6311Y(String str, int i10) {
    }
}
