package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.nio.file.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC14766a {
    public static final EnumC14766a EXECUTE;
    public static final EnumC14766a READ;
    public static final EnumC14766a WRITE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ EnumC14766a[] f138616a;

    public static EnumC14766a valueOf(String str) {
        return (EnumC14766a) Enum.valueOf(EnumC14766a.class, str);
    }

    public static EnumC14766a[] values() {
        return (EnumC14766a[]) f138616a.clone();
    }

    static {
        EnumC14766a enumC14766a = new EnumC14766a("READ", 0);
        READ = enumC14766a;
        EnumC14766a enumC14766a2 = new EnumC14766a("WRITE", 1);
        WRITE = enumC14766a2;
        EnumC14766a enumC14766a3 = new EnumC14766a("EXECUTE", 2);
        EXECUTE = enumC14766a3;
        f138616a = new EnumC14766a[]{enumC14766a, enumC14766a2, enumC14766a3};
    }
}
