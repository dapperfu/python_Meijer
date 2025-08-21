package kotlin;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lc0/V;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c0.V, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6434V {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6434V f60758a = new EnumC6434V("Default", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6434V f60759b = new EnumC6434V("UserInput", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6434V f60760c = new EnumC6434V("PreventUserInput", 2);

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ EnumC6434V[] f60761d;

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f60762e;

    static {
        EnumC6434V[] enumC6434VArrA = a();
        f60761d = enumC6434VArrA;
        f60762e = EnumEntriesKt.a(enumC6434VArrA);
    }

    private static final /* synthetic */ EnumC6434V[] a() {
        return new EnumC6434V[]{f60758a, f60759b, f60760c};
    }

    public static EnumC6434V valueOf(String str) {
        return (EnumC6434V) Enum.valueOf(EnumC6434V.class, str);
    }

    public static EnumC6434V[] values() {
        return (EnumC6434V[]) f60761d.clone();
    }

    private EnumC6434V(String str, int i10) {
    }
}
