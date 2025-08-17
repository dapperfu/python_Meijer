package Dd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes6.dex */
public final class V0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f5547a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f5548b;

    /* renamed from: c, reason: collision with root package name */
    private final Bf.c f5549c;

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new S0(byteArrayOutputStream, this.f5547a, this.f5548b, this.f5549c).k(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    V0(Map map, Map map2, Bf.c cVar) {
        this.f5547a = map;
        this.f5548b = map2;
        this.f5549c = cVar;
    }
}
