package av;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes10.dex */
public enum b implements Callable<List<Object>>, Lu.o<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> b() {
        return INSTANCE;
    }

    public static <T, O> Lu.o<O, List<T>> e() {
        return INSTANCE;
    }

    @Override // Lu.o
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
