package Ib;

import java.util.Map;

/* loaded from: classes4.dex */
public interface h {
    void a(String str);

    void a(String str, Object obj);

    <T> T b(String str, Class<T> cls);

    <T> T c(String str, Object obj, Class<T> cls);

    <T> T d(String str, Class<T> cls, Map<String, String> map);
}
