package xv;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007j\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lxv/a;", "", "", "s", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getS", "b", "c", "d", "e", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xv.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class EnumC18102a {

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC18102a f169967b = new EnumC18102a("FIRST", 0, "awaitFirst");

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC18102a f169968c = new EnumC18102a("FIRST_OR_DEFAULT", 1, "awaitFirstOrDefault");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC18102a f169969d = new EnumC18102a("LAST", 2, "awaitLast");

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC18102a f169970e = new EnumC18102a("SINGLE", 3, "awaitSingle");

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumC18102a[] f169971f;

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f169972g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String s;

    static {
        EnumC18102a[] enumC18102aArrA = a();
        f169971f = enumC18102aArrA;
        f169972g = EnumEntriesKt.a(enumC18102aArrA);
    }

    private static final /* synthetic */ EnumC18102a[] a() {
        return new EnumC18102a[]{f169967b, f169968c, f169969d, f169970e};
    }

    public static EnumC18102a valueOf(String str) {
        return (EnumC18102a) Enum.valueOf(EnumC18102a.class, str);
    }

    public static EnumC18102a[] values() {
        return (EnumC18102a[]) f169971f.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.s;
    }

    private EnumC18102a(String str, int i10, String str2) {
        this.s = str2;
    }
}
