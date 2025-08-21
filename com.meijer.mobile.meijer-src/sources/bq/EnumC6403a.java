package bq;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lbq/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bq.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class EnumC6403a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6403a f60484a = new EnumC6403a("SHOW_RATIONALE", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6403a f60485b = new EnumC6403a("SHOW_SETTINGS_RATIONALE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6403a f60486c = new EnumC6403a("NO_ACTION", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC6403a[] f60487d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f60488e;

    static {
        EnumC6403a[] enumC6403aArrA = a();
        f60487d = enumC6403aArrA;
        f60488e = EnumEntriesKt.a(enumC6403aArrA);
    }

    private static final /* synthetic */ EnumC6403a[] a() {
        return new EnumC6403a[]{f60484a, f60485b, f60486c};
    }

    public static EnumC6403a valueOf(String str) {
        return (EnumC6403a) Enum.valueOf(EnumC6403a.class, str);
    }

    public static EnumC6403a[] values() {
        return (EnumC6403a[]) f60487d.clone();
    }

    private EnumC6403a(String str, int i10) {
    }
}
