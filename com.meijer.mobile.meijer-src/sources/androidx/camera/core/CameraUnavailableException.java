package androidx.camera.core;

/* loaded from: classes.dex */
public class CameraUnavailableException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f47462a;

    public CameraUnavailableException(int i10, String str) {
        super(str);
        this.f47462a = i10;
    }

    public CameraUnavailableException(int i10, Throwable th2) {
        super(th2);
        this.f47462a = i10;
    }
}
