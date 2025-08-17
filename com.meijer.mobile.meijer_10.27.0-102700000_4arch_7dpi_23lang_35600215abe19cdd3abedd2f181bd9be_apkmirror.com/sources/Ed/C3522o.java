package Ed;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: Ed.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3522o {

    /* renamed from: a, reason: collision with root package name */
    private final Map f8621a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f8622b;

    /* renamed from: c, reason: collision with root package name */
    private final Bf.c f8623c;

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C3501l(byteArrayOutputStream, this.f8621a, this.f8622b, this.f8623c).k(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    C3522o(Map map, Map map2, Bf.c cVar) {
        this.f8621a = map;
        this.f8622b = map2;
        this.f8623c = cVar;
    }
}
