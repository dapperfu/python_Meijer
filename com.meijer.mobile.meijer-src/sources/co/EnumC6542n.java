package co;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lco/n;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: co.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC6542n {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6542n f62805a = new EnumC6542n("CURRENCY", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6542n f62806b = new EnumC6542n("STEP", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC6542n[] f62807c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f62808d;

    static {
        EnumC6542n[] enumC6542nArrA = a();
        f62807c = enumC6542nArrA;
        f62808d = EnumEntriesKt.a(enumC6542nArrA);
    }

    private static final /* synthetic */ EnumC6542n[] a() {
        return new EnumC6542n[]{f62805a, f62806b};
    }

    public static EnumC6542n valueOf(String str) {
        return (EnumC6542n) Enum.valueOf(EnumC6542n.class, str);
    }

    public static EnumC6542n[] values() {
        return (EnumC6542n[]) f62807c.clone();
    }

    private EnumC6542n(String str, int i10) {
    }
}
