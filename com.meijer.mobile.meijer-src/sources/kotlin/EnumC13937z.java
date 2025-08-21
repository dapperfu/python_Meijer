package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lf0/z;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC13937z {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC13937z f131419a = new EnumC13937z("Vertical", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13937z f131420b = new EnumC13937z("Horizontal", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC13937z[] f131421c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f131422d;

    static {
        EnumC13937z[] enumC13937zArrA = a();
        f131421c = enumC13937zArrA;
        f131422d = EnumEntriesKt.a(enumC13937zArrA);
    }

    private static final /* synthetic */ EnumC13937z[] a() {
        return new EnumC13937z[]{f131419a, f131420b};
    }

    public static EnumC13937z valueOf(String str) {
        return (EnumC13937z) Enum.valueOf(EnumC13937z.class, str);
    }

    public static EnumC13937z[] values() {
        return (EnumC13937z[]) f131421c.clone();
    }

    private EnumC13937z(String str, int i10) {
    }
}
