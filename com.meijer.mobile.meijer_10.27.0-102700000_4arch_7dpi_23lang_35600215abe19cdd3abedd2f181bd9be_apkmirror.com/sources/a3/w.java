package a3;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f44151a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private static String f44152b = "media3.common";

    public static synchronized void a(String str) {
        if (f44151a.add(str)) {
            f44152b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f44152b;
    }
}
