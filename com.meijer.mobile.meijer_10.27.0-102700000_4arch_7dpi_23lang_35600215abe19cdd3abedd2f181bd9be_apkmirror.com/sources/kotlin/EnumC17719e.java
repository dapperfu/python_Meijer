package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lw0/e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17719e {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC17719e f165511a = new EnumC17719e("CROSSED", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC17719e f165512b = new EnumC17719e("NOT_CROSSED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC17719e f165513c = new EnumC17719e("COLLAPSED", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC17719e[] f165514d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f165515e;

    static {
        EnumC17719e[] enumC17719eArrA = a();
        f165514d = enumC17719eArrA;
        f165515e = EnumEntriesKt.a(enumC17719eArrA);
    }

    private static final /* synthetic */ EnumC17719e[] a() {
        return new EnumC17719e[]{f165511a, f165512b, f165513c};
    }

    public static EnumC17719e valueOf(String str) {
        return (EnumC17719e) Enum.valueOf(EnumC17719e.class, str);
    }

    public static EnumC17719e[] values() {
        return (EnumC17719e[]) f165514d.clone();
    }

    private EnumC17719e(String str, int i10) {
    }
}
