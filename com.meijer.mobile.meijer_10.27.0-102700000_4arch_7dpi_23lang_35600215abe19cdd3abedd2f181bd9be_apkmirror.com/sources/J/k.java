package J;

import androidx.camera.core.impl.k;
import androidx.camera.core.impl.v;

/* loaded from: classes.dex */
public interface k<T> extends v {

    /* renamed from: b, reason: collision with root package name */
    public static final k.a<String> f14473b = k.a.a("camerax.core.target.name", String.class);

    /* renamed from: c, reason: collision with root package name */
    public static final k.a<Class<?>> f14474c = k.a.a("camerax.core.target.class", Class.class);

    default String Q() {
        return (String) a(f14473b);
    }

    default String u(String str) {
        return (String) h(f14473b, str);
    }
}
