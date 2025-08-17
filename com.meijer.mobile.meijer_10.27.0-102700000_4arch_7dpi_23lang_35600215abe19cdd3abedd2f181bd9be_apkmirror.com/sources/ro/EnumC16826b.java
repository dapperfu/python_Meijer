package ro;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lro/b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ro.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class EnumC16826b {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC16826b f159773a = new EnumC16826b("IN_PROGRESS", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC16826b f159774b = new EnumC16826b("AVAILABLE", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC16826b f159775c = new EnumC16826b("BOOSTER", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC16826b[] f159776d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f159777e;

    static {
        EnumC16826b[] enumC16826bArrA = a();
        f159776d = enumC16826bArrA;
        f159777e = EnumEntriesKt.a(enumC16826bArrA);
    }

    private static final /* synthetic */ EnumC16826b[] a() {
        return new EnumC16826b[]{f159773a, f159774b, f159775c};
    }

    public static EnumC16826b valueOf(String str) {
        return (EnumC16826b) Enum.valueOf(EnumC16826b.class, str);
    }

    public static EnumC16826b[] values() {
        return (EnumC16826b[]) f159776d.clone();
    }

    private EnumC16826b(String str, int i10) {
    }
}
