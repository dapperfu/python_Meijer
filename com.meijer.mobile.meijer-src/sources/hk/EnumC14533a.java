package hk;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lhk/a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hk.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class EnumC14533a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC14533a f135773a = new EnumC14533a("OPT_IN_AS_PRIMARY", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC14533a f135774b = new EnumC14533a("OPT_IN_TO_SAVE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC14533a f135775c = new EnumC14533a("SAVE_AUTOMATICALLY", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC14533a f135776d = new EnumC14533a("DO_NOT_SAVE", 3);

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumC14533a[] f135777e;

    /* renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f135778f;

    static {
        EnumC14533a[] enumC14533aArrA = a();
        f135777e = enumC14533aArrA;
        f135778f = EnumEntriesKt.a(enumC14533aArrA);
    }

    private static final /* synthetic */ EnumC14533a[] a() {
        return new EnumC14533a[]{f135773a, f135774b, f135775c, f135776d};
    }

    public static EnumC14533a valueOf(String str) {
        return (EnumC14533a) Enum.valueOf(EnumC14533a.class, str);
    }

    public static EnumC14533a[] values() {
        return (EnumC14533a[]) f135777e.clone();
    }

    private EnumC14533a(String str, int i10) {
    }
}
