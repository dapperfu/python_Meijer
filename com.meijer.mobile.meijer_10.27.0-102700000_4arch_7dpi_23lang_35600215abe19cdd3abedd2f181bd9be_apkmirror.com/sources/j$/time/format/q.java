package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class q implements e {
    public static final q INSENSITIVE;
    public static final q LENIENT;
    public static final q SENSITIVE;
    public static final q STRICT;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ q[] f138871a;

    @Override // j$.time.format.e
    public final boolean C(w wVar, StringBuilder sb2) {
        return true;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) f138871a.clone();
    }

    static {
        q qVar = new q("SENSITIVE", 0);
        SENSITIVE = qVar;
        q qVar2 = new q("INSENSITIVE", 1);
        INSENSITIVE = qVar2;
        q qVar3 = new q("STRICT", 2);
        STRICT = qVar3;
        q qVar4 = new q("LENIENT", 3);
        LENIENT = qVar4;
        f138871a = new q[]{qVar, qVar2, qVar3, qVar4};
    }

    @Override // j$.time.format.e
    public final int H(v vVar, CharSequence charSequence, int i10) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            vVar.f138888b = true;
            return i10;
        }
        if (iOrdinal == 1) {
            vVar.f138888b = false;
            return i10;
        }
        if (iOrdinal == 2) {
            vVar.f138889c = true;
            return i10;
        }
        if (iOrdinal != 3) {
            return i10;
        }
        vVar.f138889c = false;
        return i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
