package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lc0/V;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6308V {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6308V f60959a = new EnumC6308V("Default", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6308V f60960b = new EnumC6308V("UserInput", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6308V f60961c = new EnumC6308V("PreventUserInput", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC6308V[] f60962d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f60963e;

    static {
        EnumC6308V[] enumC6308VArrA = a();
        f60962d = enumC6308VArrA;
        f60963e = EnumEntriesKt.a(enumC6308VArrA);
    }

    private static final /* synthetic */ EnumC6308V[] a() {
        return new EnumC6308V[]{f60959a, f60960b, f60961c};
    }

    public static EnumC6308V valueOf(String str) {
        return (EnumC6308V) Enum.valueOf(EnumC6308V.class, str);
    }

    public static EnumC6308V[] values() {
        return (EnumC6308V[]) f60962d.clone();
    }

    private EnumC6308V(String str, int i10) {
    }
}
