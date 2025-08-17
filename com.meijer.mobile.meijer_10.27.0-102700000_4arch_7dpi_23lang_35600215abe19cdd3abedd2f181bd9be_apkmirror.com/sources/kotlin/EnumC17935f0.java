package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lx0/f0;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17935f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17935f0 f167889a = new EnumC17935f0("Closed", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17935f0 f167890b = new EnumC17935f0("Open", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC17935f0[] f167891c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f167892d;

    static {
        EnumC17935f0[] enumC17935f0ArrA = a();
        f167891c = enumC17935f0ArrA;
        f167892d = EnumEntriesKt.a(enumC17935f0ArrA);
    }

    private static final /* synthetic */ EnumC17935f0[] a() {
        return new EnumC17935f0[]{f167889a, f167890b};
    }

    public static EnumC17935f0 valueOf(String str) {
        return (EnumC17935f0) Enum.valueOf(EnumC17935f0.class, str);
    }

    public static EnumC17935f0[] values() {
        return (EnumC17935f0[]) f167891c.clone();
    }

    private EnumC17935f0(String str, int i10) {
    }
}
