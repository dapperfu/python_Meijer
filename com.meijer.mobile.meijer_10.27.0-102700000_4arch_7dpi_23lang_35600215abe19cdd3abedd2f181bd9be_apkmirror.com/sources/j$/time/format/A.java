package j$.time.format;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public static final A f138798a = new A();

    public final int hashCode() {
        return 182;
    }

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        ((A) obj).getClass();
        return true;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
