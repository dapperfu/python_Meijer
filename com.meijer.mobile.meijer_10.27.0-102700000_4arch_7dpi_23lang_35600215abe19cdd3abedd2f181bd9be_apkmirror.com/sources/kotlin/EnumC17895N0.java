package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lx0/N0;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.N0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17895N0 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17895N0 f167226a = new EnumC17895N0("Hidden", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17895N0 f167227b = new EnumC17895N0("Expanded", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17895N0 f167228c = new EnumC17895N0("HalfExpanded", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC17895N0[] f167229d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f167230e;

    static {
        EnumC17895N0[] enumC17895N0ArrA = a();
        f167229d = enumC17895N0ArrA;
        f167230e = EnumEntriesKt.a(enumC17895N0ArrA);
    }

    private static final /* synthetic */ EnumC17895N0[] a() {
        return new EnumC17895N0[]{f167226a, f167227b, f167228c};
    }

    public static EnumC17895N0 valueOf(String str) {
        return (EnumC17895N0) Enum.valueOf(EnumC17895N0.class, str);
    }

    public static EnumC17895N0[] values() {
        return (EnumC17895N0[]) f167229d.clone();
    }

    private EnumC17895N0(String str, int i10) {
    }
}
