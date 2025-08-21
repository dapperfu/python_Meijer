package ov;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lov/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ov.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class EnumC16325a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC16325a f155824a = new EnumC16325a("SUSPEND", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC16325a f155825b = new EnumC16325a("DROP_OLDEST", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC16325a f155826c = new EnumC16325a("DROP_LATEST", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC16325a[] f155827d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f155828e;

    static {
        EnumC16325a[] enumC16325aArrA = a();
        f155827d = enumC16325aArrA;
        f155828e = EnumEntriesKt.a(enumC16325aArrA);
    }

    private static final /* synthetic */ EnumC16325a[] a() {
        return new EnumC16325a[]{f155824a, f155825b, f155826c};
    }

    public static EnumC16325a valueOf(String str) {
        return (EnumC16325a) Enum.valueOf(EnumC16325a.class, str);
    }

    public static EnumC16325a[] values() {
        return (EnumC16325a[]) f155827d.clone();
    }

    private EnumC16325a(String str, int i10) {
    }
}
