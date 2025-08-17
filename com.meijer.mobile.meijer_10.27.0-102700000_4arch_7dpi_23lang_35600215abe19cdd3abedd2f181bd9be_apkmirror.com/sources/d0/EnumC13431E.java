package d0;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ld0/E;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d0.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC13431E {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC13431E f126845a = new EnumC13431E("Default", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC13431E f126846b = new EnumC13431E("UserInput", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC13431E f126847c = new EnumC13431E("PreventUserInput", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC13431E[] f126848d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f126849e;

    static {
        EnumC13431E[] enumC13431EArrA = a();
        f126848d = enumC13431EArrA;
        f126849e = EnumEntriesKt.a(enumC13431EArrA);
    }

    private static final /* synthetic */ EnumC13431E[] a() {
        return new EnumC13431E[]{f126845a, f126846b, f126847c};
    }

    public static EnumC13431E valueOf(String str) {
        return (EnumC13431E) Enum.valueOf(EnumC13431E.class, str);
    }

    public static EnumC13431E[] values() {
        return (EnumC13431E[]) f126848d.clone();
    }

    private EnumC13431E(String str, int i10) {
    }
}
