package Gd;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: Gd.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3714o {

    /* renamed from: a, reason: collision with root package name */
    private final Map f12173a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f12174b;

    /* renamed from: c, reason: collision with root package name */
    private final Df.c f12175c;

    public final byte[] a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C3693l(byteArrayOutputStream, this.f12173a, this.f12174b, this.f12175c).k(obj);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    C3714o(Map map, Map map2, Df.c cVar) {
        this.f12173a = map;
        this.f12174b = map2;
        this.f12175c = cVar;
    }
}
