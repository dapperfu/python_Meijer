package Iv;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LIv/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Iv.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class EnumC3760a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3760a f14392a = new EnumC3760a("NONE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3760a f14393b = new EnumC3760a("ALL_JSON_OBJECTS", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3760a f14394c = new EnumC3760a("POLYMORPHIC", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC3760a[] f14395d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f14396e;

    static {
        EnumC3760a[] enumC3760aArrA = a();
        f14395d = enumC3760aArrA;
        f14396e = EnumEntriesKt.a(enumC3760aArrA);
    }

    private static final /* synthetic */ EnumC3760a[] a() {
        return new EnumC3760a[]{f14392a, f14393b, f14394c};
    }

    public static EnumC3760a valueOf(String str) {
        return (EnumC3760a) Enum.valueOf(EnumC3760a.class, str);
    }

    public static EnumC3760a[] values() {
        return (EnumC3760a[]) f14395d.clone();
    }

    private EnumC3760a(String str, int i10) {
    }
}
