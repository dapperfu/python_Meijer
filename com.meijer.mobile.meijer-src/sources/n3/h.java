package n3;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import d3.C13599a;
import java.util.HashSet;
import java.util.Iterator;
import n3.h;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final HashSet<MediaCodec> f152021a;

    /* renamed from: b, reason: collision with root package name */
    private final b f152022b;

    /* renamed from: c, reason: collision with root package name */
    private LoudnessCodecController f152023c;

    class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return h.this.f152022b.a(bundle);
        }
    }

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f152025a = new b() { // from class: n3.i
            @Override // n3.h.b
            public final Bundle a(Bundle bundle) {
                return h.b.b(bundle);
            }
        };

        static /* synthetic */ Bundle b(Bundle bundle) {
            return bundle;
        }

        Bundle a(Bundle bundle);
    }

    public h() {
        this(b.f152025a);
    }

    public h(b bVar) {
        this.f152021a = new HashSet<>();
        this.f152022b = bVar;
    }

    public void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f152023c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            C13599a.g(this.f152021a.add(mediaCodec));
        }
    }

    public void c() {
        this.f152021a.clear();
        LoudnessCodecController loudnessCodecController = this.f152023c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f152021a.remove(mediaCodec) || (loudnessCodecController = this.f152023c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void e(int i10) {
        LoudnessCodecController loudnessCodecController = this.f152023c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f152023c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, com.google.common.util.concurrent.u.a(), new a());
        this.f152023c = loudnessCodecControllerCreate;
        Iterator<MediaCodec> it = this.f152021a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }
}
