package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class n {
    public static final n END_DIRECTORY;
    public static final n ENTRY;
    public static final n START_DIRECTORY;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ n[] f139251a;

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f139251a.clone();
    }

    static {
        n nVar = new n("START_DIRECTORY", 0);
        START_DIRECTORY = nVar;
        n nVar2 = new n("END_DIRECTORY", 1);
        END_DIRECTORY = nVar2;
        n nVar3 = new n("ENTRY", 2);
        ENTRY = nVar3;
        f139251a = new n[]{nVar, nVar2, nVar3};
    }
}
