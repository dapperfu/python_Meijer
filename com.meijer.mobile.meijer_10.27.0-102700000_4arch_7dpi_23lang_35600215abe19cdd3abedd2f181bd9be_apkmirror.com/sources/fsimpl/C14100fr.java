package fsimpl;

/* renamed from: fsimpl.fr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14100fr {

    /* renamed from: a, reason: collision with root package name */
    public static final long f132281a = a(5);

    public static long a(int i10) {
        return i10 * 1000 * 1000;
    }

    public static String a(String str) {
        return "(res-font)" + str;
    }

    public static String a(boolean z10, int i10) {
        String str = z10 ? "_i" : "";
        return i10 != 400 ? str + "_" + i10 : str;
    }
}
