package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class FileVisitOption {
    public static final FileVisitOption FOLLOW_LINKS;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FileVisitOption[] f138602a;

    public static FileVisitOption valueOf(String str) {
        return (FileVisitOption) Enum.valueOf(FileVisitOption.class, str);
    }

    public static FileVisitOption[] values() {
        return (FileVisitOption[]) f138602a.clone();
    }

    static {
        FileVisitOption fileVisitOption = new FileVisitOption("FOLLOW_LINKS", 0);
        FOLLOW_LINKS = fileVisitOption;
        f138602a = new FileVisitOption[]{fileVisitOption};
    }
}
