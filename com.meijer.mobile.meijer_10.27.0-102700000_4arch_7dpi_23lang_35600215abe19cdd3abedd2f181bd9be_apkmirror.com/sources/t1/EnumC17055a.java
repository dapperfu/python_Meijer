package t1;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lt1/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17055a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17055a f161355a = new EnumC17055a("On", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17055a f161356b = new EnumC17055a("Off", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17055a f161357c = new EnumC17055a("Indeterminate", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC17055a[] f161358d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f161359e;

    static {
        EnumC17055a[] enumC17055aArrA = a();
        f161358d = enumC17055aArrA;
        f161359e = EnumEntriesKt.a(enumC17055aArrA);
    }

    private static final /* synthetic */ EnumC17055a[] a() {
        return new EnumC17055a[]{f161355a, f161356b, f161357c};
    }

    public static EnumC17055a valueOf(String str) {
        return (EnumC17055a) Enum.valueOf(EnumC17055a.class, str);
    }

    public static EnumC17055a[] values() {
        return (EnumC17055a[]) f161358d.clone();
    }

    private EnumC17055a(String str, int i10) {
    }
}
