package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lc0/Y;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.Y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6437Y {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6437Y f60775a = new EnumC6437Y("Restart", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6437Y f60776b = new EnumC6437Y("Reverse", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC6437Y[] f60777c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f60778d;

    static {
        EnumC6437Y[] enumC6437YArrA = a();
        f60777c = enumC6437YArrA;
        f60778d = EnumEntriesKt.a(enumC6437YArrA);
    }

    private static final /* synthetic */ EnumC6437Y[] a() {
        return new EnumC6437Y[]{f60775a, f60776b};
    }

    public static EnumC6437Y valueOf(String str) {
        return (EnumC6437Y) Enum.valueOf(EnumC6437Y.class, str);
    }

    public static EnumC6437Y[] values() {
        return (EnumC6437Y[]) f60777c.clone();
    }

    private EnumC6437Y(String str, int i10) {
    }
}
