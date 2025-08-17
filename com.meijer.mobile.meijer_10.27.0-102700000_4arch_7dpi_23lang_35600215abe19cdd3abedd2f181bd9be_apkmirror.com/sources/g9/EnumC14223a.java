package g9;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lg9/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: g9.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC14223a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC14223a f133200a = new EnumC14223a("INSERT", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC14223a f133201b = new EnumC14223a("DELETE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC14223a f133202c = new EnumC14223a("UPDATE", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC14223a[] f133203d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f133204e;

    static {
        EnumC14223a[] enumC14223aArrA = a();
        f133203d = enumC14223aArrA;
        f133204e = EnumEntriesKt.a(enumC14223aArrA);
    }

    private static final /* synthetic */ EnumC14223a[] a() {
        return new EnumC14223a[]{f133200a, f133201b, f133202c};
    }

    public static EnumC14223a valueOf(String str) {
        return (EnumC14223a) Enum.valueOf(EnumC14223a.class, str);
    }

    public static EnumC14223a[] values() {
        return (EnumC14223a[]) f133203d.clone();
    }

    private EnumC14223a(String str, int i10) {
    }
}
