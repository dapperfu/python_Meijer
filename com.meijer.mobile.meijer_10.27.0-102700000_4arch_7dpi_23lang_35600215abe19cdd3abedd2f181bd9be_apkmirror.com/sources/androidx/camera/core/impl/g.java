package androidx.camera.core.impl;

import C.a0;
import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator;

/* loaded from: classes.dex */
public final class g implements a0.b {

    /* renamed from: a, reason: collision with root package name */
    private final int f47392a;

    /* renamed from: b, reason: collision with root package name */
    private final int f47393b;

    /* renamed from: c, reason: collision with root package name */
    private final long f47394c;

    /* renamed from: d, reason: collision with root package name */
    private final Throwable f47395d;

    @Override // C.a0.b
    public int a() {
        return this.f47392a;
    }

    @Override // C.a0.b
    public Throwable b() {
        return this.f47395d;
    }

    @Override // C.a0.b
    public long c() {
        return this.f47394c;
    }

    public g(long j10, int i10, Throwable th2) {
        this.f47394c = SystemClock.elapsedRealtime() - j10;
        this.f47393b = i10;
        if (th2 instanceof CameraValidator.CameraIdListIncorrectException) {
            this.f47392a = 2;
            this.f47395d = th2;
            return;
        }
        if (th2 instanceof InitializationException) {
            Throwable cause = th2.getCause();
            th2 = cause != null ? cause : th2;
            this.f47395d = th2;
            if (th2 instanceof CameraUnavailableException) {
                this.f47392a = 2;
                return;
            } else if (th2 instanceof IllegalArgumentException) {
                this.f47392a = 1;
                return;
            } else {
                this.f47392a = 0;
                return;
            }
        }
        this.f47392a = 0;
        this.f47395d = th2;
    }
}
