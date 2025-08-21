package Rc;

import android.graphics.Bitmap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    final Map f32335a = new ConcurrentHashMap();

    public final Bitmap a(Integer num) {
        return (Bitmap) this.f32335a.get(num);
    }

    public W() {
        new AtomicInteger(0);
    }
}
