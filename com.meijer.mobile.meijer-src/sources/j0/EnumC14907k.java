package j0;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lj0/k;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC14907k {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC14907k f139711a = new EnumC14907k("Vertical", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC14907k f139712b = new EnumC14907k("Horizontal", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC14907k f139713c = new EnumC14907k("Both", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC14907k[] f139714d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f139715e;

    static {
        EnumC14907k[] enumC14907kArrA = a();
        f139714d = enumC14907kArrA;
        f139715e = EnumEntriesKt.a(enumC14907kArrA);
    }

    private static final /* synthetic */ EnumC14907k[] a() {
        return new EnumC14907k[]{f139711a, f139712b, f139713c};
    }

    public static EnumC14907k valueOf(String str) {
        return (EnumC14907k) Enum.valueOf(EnumC14907k.class, str);
    }

    public static EnumC14907k[] values() {
        return (EnumC14907k[]) f139714d.clone();
    }

    private EnumC14907k(String str, int i10) {
    }
}
