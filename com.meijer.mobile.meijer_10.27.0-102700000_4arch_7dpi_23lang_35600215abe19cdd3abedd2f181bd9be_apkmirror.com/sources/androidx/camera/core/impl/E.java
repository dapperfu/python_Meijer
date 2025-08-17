package androidx.camera.core.impl;

import android.content.Context;
import androidx.camera.core.InitializationException;

/* loaded from: classes.dex */
public interface E {

    /* renamed from: a, reason: collision with root package name */
    public static final E f47345a = new a();

    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    public interface c {
        E a(Context context) throws InitializationException;
    }

    k a(b bVar, int i10);

    class a implements E {
        @Override // androidx.camera.core.impl.E
        public k a(b bVar, int i10) {
            return null;
        }

        a() {
        }
    }
}
