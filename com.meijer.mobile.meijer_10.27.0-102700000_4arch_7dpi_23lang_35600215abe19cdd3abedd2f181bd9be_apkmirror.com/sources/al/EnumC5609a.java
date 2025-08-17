package al;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lal/a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "c", "d", "coupons_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: al.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC5609a {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC5609a f45522b = new EnumC5609a("CLIPPED_ONLY", 0, "clippedonly");

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC5609a f45523c = new EnumC5609a("UNCLIPPED_ONLY", 1, "unclippedonly");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC5609a f45524d = new EnumC5609a("ALL", 2, "both");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC5609a[] f45525e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f45526f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String value;

    static {
        EnumC5609a[] enumC5609aArrA = a();
        f45525e = enumC5609aArrA;
        f45526f = EnumEntriesKt.a(enumC5609aArrA);
    }

    private static final /* synthetic */ EnumC5609a[] a() {
        return new EnumC5609a[]{f45522b, f45523c, f45524d};
    }

    public static EnumC5609a valueOf(String str) {
        return (EnumC5609a) Enum.valueOf(EnumC5609a.class, str);
    }

    public static EnumC5609a[] values() {
        return (EnumC5609a[]) f45525e.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    private EnumC5609a(String str, int i10, String str2) {
        this.value = str2;
    }
}
