package bq;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lbq/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bq.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class EnumC6277a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6277a f60610a = new EnumC6277a("SHOW_RATIONALE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6277a f60611b = new EnumC6277a("SHOW_SETTINGS_RATIONALE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6277a f60612c = new EnumC6277a("NO_ACTION", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC6277a[] f60613d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f60614e;

    static {
        EnumC6277a[] enumC6277aArrA = a();
        f60613d = enumC6277aArrA;
        f60614e = EnumEntriesKt.a(enumC6277aArrA);
    }

    private static final /* synthetic */ EnumC6277a[] a() {
        return new EnumC6277a[]{f60610a, f60611b, f60612c};
    }

    public static EnumC6277a valueOf(String str) {
        return (EnumC6277a) Enum.valueOf(EnumC6277a.class, str);
    }

    public static EnumC6277a[] values() {
        return (EnumC6277a[]) f60613d.clone();
    }

    private EnumC6277a(String str, int i10) {
    }
}
