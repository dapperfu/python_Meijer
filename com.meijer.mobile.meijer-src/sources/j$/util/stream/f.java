package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.stream.Collector;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f139606a = Collections.EMPTY_SET;

    static {
        Collections.unmodifiableSet(EnumSet.of(Collector.Characteristics.UNORDERED));
    }
}
