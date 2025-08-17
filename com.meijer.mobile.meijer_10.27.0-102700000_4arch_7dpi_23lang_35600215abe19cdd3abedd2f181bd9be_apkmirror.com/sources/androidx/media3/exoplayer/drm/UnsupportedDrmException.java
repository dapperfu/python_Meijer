package androidx.media3.exoplayer.drm;

/* loaded from: classes.dex */
public final class UnsupportedDrmException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f56100a;

    public UnsupportedDrmException(int i10) {
        this.f56100a = i10;
    }

    public UnsupportedDrmException(int i10, Exception exc) {
        super(exc);
        this.f56100a = i10;
    }
}
