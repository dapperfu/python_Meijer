package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.nio.file.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC14854a {
    public static final EnumC14854a EXECUTE;
    public static final EnumC14854a READ;
    public static final EnumC14854a WRITE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC14854a[] f139205a;

    public static EnumC14854a valueOf(String str) {
        return (EnumC14854a) Enum.valueOf(EnumC14854a.class, str);
    }

    public static EnumC14854a[] values() {
        return (EnumC14854a[]) f139205a.clone();
    }

    static {
        EnumC14854a enumC14854a = new EnumC14854a("READ", 0);
        READ = enumC14854a;
        EnumC14854a enumC14854a2 = new EnumC14854a("WRITE", 1);
        WRITE = enumC14854a2;
        EnumC14854a enumC14854a3 = new EnumC14854a("EXECUTE", 2);
        EXECUTE = enumC14854a3;
        f139205a = new EnumC14854a[]{enumC14854a, enumC14854a2, enumC14854a3};
    }
}
