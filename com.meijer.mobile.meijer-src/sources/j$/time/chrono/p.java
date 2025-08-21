package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class p implements j {
    public static final p BCE;
    public static final p CE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ p[] f139365a;

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f139365a.clone();
    }

    static {
        p pVar = new p("BCE", 0);
        BCE = pVar;
        p pVar2 = new p("CE", 1);
        CE = pVar2;
        f139365a = new p[]{pVar, pVar2};
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return ordinal();
    }
}
