package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lx0/n;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC18024n {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC18024n f169435a = new EnumC18024n("Concealed", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC18024n f169436b = new EnumC18024n("Revealed", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC18024n[] f169437c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f169438d;

    static {
        EnumC18024n[] enumC18024nArrA = a();
        f169437c = enumC18024nArrA;
        f169438d = EnumEntriesKt.a(enumC18024nArrA);
    }

    private static final /* synthetic */ EnumC18024n[] a() {
        return new EnumC18024n[]{f169435a, f169436b};
    }

    public static EnumC18024n valueOf(String str) {
        return (EnumC18024n) Enum.valueOf(EnumC18024n.class, str);
    }

    public static EnumC18024n[] values() {
        return (EnumC18024n[]) f169437c.clone();
    }

    private EnumC18024n(String str, int i10) {
    }
}
