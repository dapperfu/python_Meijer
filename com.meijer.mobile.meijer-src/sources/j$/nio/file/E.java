package j$.nio.file;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class E implements t {
    public static final E APPEND;
    public static final E CREATE;
    public static final E CREATE_NEW;
    public static final E DELETE_ON_CLOSE;
    public static final E DSYNC;
    public static final E READ;
    public static final E SPARSE;
    public static final E SYNC;
    public static final E TRUNCATE_EXISTING;
    public static final E WRITE;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ E[] f139188a;

    public static E valueOf(String str) {
        return (E) Enum.valueOf(E.class, str);
    }

    public static E[] values() {
        return (E[]) f139188a.clone();
    }

    static {
        E e10 = new E("READ", 0);
        READ = e10;
        E e11 = new E("WRITE", 1);
        WRITE = e11;
        E e12 = new E("APPEND", 2);
        APPEND = e12;
        E e13 = new E("TRUNCATE_EXISTING", 3);
        TRUNCATE_EXISTING = e13;
        E e14 = new E("CREATE", 4);
        CREATE = e14;
        E e15 = new E("CREATE_NEW", 5);
        CREATE_NEW = e15;
        E e16 = new E("DELETE_ON_CLOSE", 6);
        DELETE_ON_CLOSE = e16;
        E e17 = new E("SPARSE", 7);
        SPARSE = e17;
        E e18 = new E("SYNC", 8);
        SYNC = e18;
        E e19 = new E("DSYNC", 9);
        DSYNC = e19;
        f139188a = new E[]{e10, e11, e12, e13, e14, e15, e16, e17, e18, e19};
    }
}
