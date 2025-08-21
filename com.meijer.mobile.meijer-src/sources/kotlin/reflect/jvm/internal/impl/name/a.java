package kotlin.reflect.jvm.internal.impl.name;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f146715a = new a("BEGINNING", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final a f146716b = new a("MIDDLE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final a f146717c = new a("AFTER_DOT", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ a[] f146718d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146719e;

    private static final /* synthetic */ a[] a() {
        return new a[]{f146715a, f146716b, f146717c};
    }

    static {
        a[] aVarArrA = a();
        f146718d = aVarArrA;
        f146719e = EnumEntriesKt.a(aVarArrA);
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f146718d.clone();
    }

    private a(String str, int i10) {
    }
}
