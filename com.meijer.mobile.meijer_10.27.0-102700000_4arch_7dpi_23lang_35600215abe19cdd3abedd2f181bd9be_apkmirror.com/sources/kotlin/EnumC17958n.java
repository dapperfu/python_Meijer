package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lx0/n;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17958n {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17958n f168347a = new EnumC17958n("Concealed", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17958n f168348b = new EnumC17958n("Revealed", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC17958n[] f168349c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f168350d;

    static {
        EnumC17958n[] enumC17958nArrA = a();
        f168349c = enumC17958nArrA;
        f168350d = EnumEntriesKt.a(enumC17958nArrA);
    }

    private static final /* synthetic */ EnumC17958n[] a() {
        return new EnumC17958n[]{f168347a, f168348b};
    }

    public static EnumC17958n valueOf(String str) {
        return (EnumC17958n) Enum.valueOf(EnumC17958n.class, str);
    }

    public static EnumC17958n[] values() {
        return (EnumC17958n[]) f168349c.clone();
    }

    private EnumC17958n(String str, int i10) {
    }
}
