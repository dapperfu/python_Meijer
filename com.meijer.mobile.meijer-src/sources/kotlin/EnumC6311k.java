package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lb0/k;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6311k {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6311k f59822a = new EnumC6311k("PreEnter", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6311k f59823b = new EnumC6311k("Visible", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6311k f59824c = new EnumC6311k("PostExit", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC6311k[] f59825d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f59826e;

    static {
        EnumC6311k[] enumC6311kArrA = a();
        f59825d = enumC6311kArrA;
        f59826e = EnumEntriesKt.a(enumC6311kArrA);
    }

    private static final /* synthetic */ EnumC6311k[] a() {
        return new EnumC6311k[]{f59822a, f59823b, f59824c};
    }

    public static EnumC6311k valueOf(String str) {
        return (EnumC6311k) Enum.valueOf(EnumC6311k.class, str);
    }

    public static EnumC6311k[] values() {
        return (EnumC6311k[]) f59825d.clone();
    }

    private EnumC6311k(String str, int i10) {
    }
}
