package Ev;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LEv/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Ev.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class EnumC3259a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC3259a f8594a = new EnumC3259a("NONE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC3259a f8595b = new EnumC3259a("ALL_JSON_OBJECTS", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC3259a f8596c = new EnumC3259a("POLYMORPHIC", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC3259a[] f8597d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f8598e;

    static {
        EnumC3259a[] enumC3259aArrA = a();
        f8597d = enumC3259aArrA;
        f8598e = EnumEntriesKt.a(enumC3259aArrA);
    }

    private static final /* synthetic */ EnumC3259a[] a() {
        return new EnumC3259a[]{f8594a, f8595b, f8596c};
    }

    public static EnumC3259a valueOf(String str) {
        return (EnumC3259a) Enum.valueOf(EnumC3259a.class, str);
    }

    public static EnumC3259a[] values() {
        return (EnumC3259a[]) f8597d.clone();
    }

    private EnumC3259a(String str, int i10) {
    }
}
