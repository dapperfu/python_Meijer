package p3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicLong f156093h = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final long f156094a;

    /* renamed from: b, reason: collision with root package name */
    public final f3.g f156095b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f156096c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f156097d;

    /* renamed from: e, reason: collision with root package name */
    public final long f156098e;

    /* renamed from: f, reason: collision with root package name */
    public final long f156099f;

    /* renamed from: g, reason: collision with root package name */
    public final long f156100g;

    public i(long j10, f3.g gVar, long j11) {
        this(j10, gVar, gVar.f131472a, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public static long a() {
        return f156093h.getAndIncrement();
    }

    public i(long j10, f3.g gVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f156094a = j10;
        this.f156095b = gVar;
        this.f156096c = uri;
        this.f156097d = map;
        this.f156098e = j11;
        this.f156099f = j12;
        this.f156100g = j13;
    }
}
