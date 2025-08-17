package l7;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f148689a = new ArrayList();

    public synchronized void a(ImageHeaderParser imageHeaderParser) {
        this.f148689a.add(imageHeaderParser);
    }

    public synchronized List<ImageHeaderParser> b() {
        return this.f148689a;
    }
}
