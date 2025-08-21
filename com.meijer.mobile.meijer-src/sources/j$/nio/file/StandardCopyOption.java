package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class StandardCopyOption implements CopyOption {
    public static final StandardCopyOption ATOMIC_MOVE;
    public static final StandardCopyOption COPY_ATTRIBUTES;
    public static final StandardCopyOption REPLACE_EXISTING;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ StandardCopyOption[] f139204a;

    public static StandardCopyOption valueOf(String str) {
        return (StandardCopyOption) Enum.valueOf(StandardCopyOption.class, str);
    }

    public static StandardCopyOption[] values() {
        return (StandardCopyOption[]) f139204a.clone();
    }

    static {
        StandardCopyOption standardCopyOption = new StandardCopyOption("REPLACE_EXISTING", 0);
        REPLACE_EXISTING = standardCopyOption;
        StandardCopyOption standardCopyOption2 = new StandardCopyOption("COPY_ATTRIBUTES", 1);
        COPY_ATTRIBUTES = standardCopyOption2;
        StandardCopyOption standardCopyOption3 = new StandardCopyOption("ATOMIC_MOVE", 2);
        ATOMIC_MOVE = standardCopyOption3;
        f139204a = new StandardCopyOption[]{standardCopyOption, standardCopyOption2, standardCopyOption3};
    }
}
