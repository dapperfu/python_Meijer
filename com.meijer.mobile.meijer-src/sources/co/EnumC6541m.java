package co;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lco/m;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: co.m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class EnumC6541m {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6541m f62801a = new EnumC6541m("BOOSTER", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6541m f62802b = new EnumC6541m("OTHER", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC6541m[] f62803c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f62804d;

    static {
        EnumC6541m[] enumC6541mArrA = a();
        f62803c = enumC6541mArrA;
        f62804d = EnumEntriesKt.a(enumC6541mArrA);
    }

    private static final /* synthetic */ EnumC6541m[] a() {
        return new EnumC6541m[]{f62801a, f62802b};
    }

    public static EnumC6541m valueOf(String str) {
        return (EnumC6541m) Enum.valueOf(EnumC6541m.class, str);
    }

    public static EnumC6541m[] values() {
        return (EnumC6541m[]) f62803c.clone();
    }

    private EnumC6541m(String str, int i10) {
    }
}
