package ev;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes9.dex */
public enum b implements Callable<List<Object>>, Pu.o<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> b() {
        return INSTANCE;
    }

    public static <T, O> Pu.o<O, List<T>> e() {
        return INSTANCE;
    }

    @Override // Pu.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
