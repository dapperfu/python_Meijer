package j$.adapter;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f138544a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f138545b;

    static {
        boolean z10;
        try {
            Class.forName("java.util.StringJoiner");
        } catch (ClassNotFoundException unused) {
        }
        boolean z11 = false;
        try {
            Class.forName("java.nio.file.FileSystems");
            z10 = true;
        } catch (ClassNotFoundException unused2) {
            z10 = false;
        }
        f138544a = z10;
        try {
            Class.forName("android.os.Build");
            z11 = true;
        } catch (ClassNotFoundException unused3) {
        }
        f138545b = z11;
    }
}
