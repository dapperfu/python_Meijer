package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lx0/f0;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC18001f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC18001f0 f168977a = new EnumC18001f0("Closed", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC18001f0 f168978b = new EnumC18001f0("Open", 1);

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ EnumC18001f0[] f168979c;

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f168980d;

    static {
        EnumC18001f0[] enumC18001f0ArrA = a();
        f168979c = enumC18001f0ArrA;
        f168980d = EnumEntriesKt.a(enumC18001f0ArrA);
    }

    private static final /* synthetic */ EnumC18001f0[] a() {
        return new EnumC18001f0[]{f168977a, f168978b};
    }

    public static EnumC18001f0 valueOf(String str) {
        return (EnumC18001f0) Enum.valueOf(EnumC18001f0.class, str);
    }

    public static EnumC18001f0[] values() {
        return (EnumC18001f0[]) f168979c.clone();
    }

    private EnumC18001f0(String str, int i10) {
    }
}
