package kotlin.reflect.jvm.internal.impl.types;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes13.dex */
public final class Variance {

    /* renamed from: e, reason: collision with root package name */
    public static final Variance f146796e = new Variance("INVARIANT", 0, "", true, true, 0);

    /* renamed from: f, reason: collision with root package name */
    public static final Variance f146797f = new Variance("IN_VARIANCE", 1, "in", true, false, -1);

    /* renamed from: g, reason: collision with root package name */
    public static final Variance f146798g = new Variance("OUT_VARIANCE", 2, "out", false, true, 1);

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ Variance[] f146799h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f146800i;

    /* renamed from: a, reason: collision with root package name */
    private final String f146801a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f146802b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f146803c;

    /* renamed from: d, reason: collision with root package name */
    private final int f146804d;

    private static final /* synthetic */ Variance[] a() {
        return new Variance[]{f146796e, f146797f, f146798g};
    }

    static {
        Variance[] varianceArrA = a();
        f146799h = varianceArrA;
        f146800i = EnumEntriesKt.a(varianceArrA);
    }

    public static Variance valueOf(String str) {
        return (Variance) Enum.valueOf(Variance.class, str);
    }

    public static Variance[] values() {
        return (Variance[]) f146799h.clone();
    }

    public final boolean b() {
        return this.f146803c;
    }

    public final String e() {
        return this.f146801a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f146801a;
    }

    private Variance(String str, int i10, String str2, boolean z10, boolean z11, int i11) {
        this.f146801a = str2;
        this.f146802b = z10;
        this.f146803c = z11;
        this.f146804d = i11;
    }
}
