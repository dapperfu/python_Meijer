package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lx0/A0;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.A0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class EnumC17869A0 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17869A0 f166645a = new EnumC17869A0("Focused", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17869A0 f166646b = new EnumC17869A0("UnfocusedEmpty", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17869A0 f166647c = new EnumC17869A0("UnfocusedNotEmpty", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC17869A0[] f166648d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f166649e;

    static {
        EnumC17869A0[] enumC17869A0ArrA = a();
        f166648d = enumC17869A0ArrA;
        f166649e = EnumEntriesKt.a(enumC17869A0ArrA);
    }

    private static final /* synthetic */ EnumC17869A0[] a() {
        return new EnumC17869A0[]{f166645a, f166646b, f166647c};
    }

    public static EnumC17869A0 valueOf(String str) {
        return (EnumC17869A0) Enum.valueOf(EnumC17869A0.class, str);
    }

    public static EnumC17869A0[] values() {
        return (EnumC17869A0[]) f166648d.clone();
    }

    private EnumC17869A0(String str, int i10) {
    }
}
