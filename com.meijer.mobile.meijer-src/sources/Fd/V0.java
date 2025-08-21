package Fd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes6.dex */
public final class V0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f9580a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f9581b;

    /* renamed from: c, reason: collision with root package name */
    private final Df.c f9582c;

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new S0(byteArrayOutputStream, this.f9580a, this.f9581b, this.f9582c).k(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    V0(Map map, Map map2, Df.c cVar) {
        this.f9580a = map;
        this.f9581b = map2;
        this.f9582c = cVar;
    }
}
