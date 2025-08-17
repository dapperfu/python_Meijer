package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class z implements j {
    public static final z BEFORE_ROC;
    public static final z ROC;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ z[] f138792a;

    public static z valueOf(String str) {
        return (z) Enum.valueOf(z.class, str);
    }

    public static z[] values() {
        return (z[]) f138792a.clone();
    }

    static {
        z zVar = new z("BEFORE_ROC", 0);
        BEFORE_ROC = zVar;
        z zVar2 = new z("ROC", 1);
        ROC = zVar2;
        f138792a = new z[]{zVar, zVar2};
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return ordinal();
    }
}
