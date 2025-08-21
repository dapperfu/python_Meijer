package a3;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final HashSet<String> f44969a = new HashSet<>();

    /* renamed from: b, reason: collision with root package name */
    private static String f44970b = "media3.common";

    public static synchronized void a(String str) {
        if (f44969a.add(str)) {
            f44970b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f44970b;
    }
}
