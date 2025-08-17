package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lf0/z;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC13827z {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC13827z f130585a = new EnumC13827z("Vertical", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13827z f130586b = new EnumC13827z("Horizontal", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC13827z[] f130587c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f130588d;

    static {
        EnumC13827z[] enumC13827zArrA = a();
        f130587c = enumC13827zArrA;
        f130588d = EnumEntriesKt.a(enumC13827zArrA);
    }

    private static final /* synthetic */ EnumC13827z[] a() {
        return new EnumC13827z[]{f130585a, f130586b};
    }

    public static EnumC13827z valueOf(String str) {
        return (EnumC13827z) Enum.valueOf(EnumC13827z.class, str);
    }

    public static EnumC13827z[] values() {
        return (EnumC13827z[]) f130587c.clone();
    }

    private EnumC13827z(String str, int i10) {
    }
}
