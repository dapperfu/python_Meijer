package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class F implements j {
    public static final F BE;
    public static final F BEFORE_BE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ F[] f139331a;

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f139331a.clone();
    }

    static {
        F f10 = new F("BEFORE_BE", 0);
        BEFORE_BE = f10;
        F f11 = new F("BE", 1);
        BE = f11;
        f139331a = new F[]{f10, f11};
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return ordinal();
    }
}
