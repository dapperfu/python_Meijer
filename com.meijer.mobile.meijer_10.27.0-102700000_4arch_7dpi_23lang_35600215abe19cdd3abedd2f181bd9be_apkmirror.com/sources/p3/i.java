package p3;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicLong f155419h = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final long f155420a;

    /* renamed from: b, reason: collision with root package name */
    public final f3.g f155421b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f155422c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f155423d;

    /* renamed from: e, reason: collision with root package name */
    public final long f155424e;

    /* renamed from: f, reason: collision with root package name */
    public final long f155425f;

    /* renamed from: g, reason: collision with root package name */
    public final long f155426g;

    public i(long j10, f3.g gVar, long j11) {
        this(j10, gVar, gVar.f130638a, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public static long a() {
        return f155419h.getAndIncrement();
    }

    public i(long j10, f3.g gVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f155420a = j10;
        this.f155421b = gVar;
        this.f155422c = uri;
        this.f155423d = map;
        this.f155424e = j11;
        this.f155425f = j12;
        this.f155426g = j13;
    }
}
