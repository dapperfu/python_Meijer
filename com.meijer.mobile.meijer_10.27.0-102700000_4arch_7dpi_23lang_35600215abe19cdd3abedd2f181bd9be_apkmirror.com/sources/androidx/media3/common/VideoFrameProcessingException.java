package androidx.media3.common;

/* loaded from: classes.dex */
public final class VideoFrameProcessingException extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final long f55340a;

    public static VideoFrameProcessingException b(Exception exc, long j10) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(exc, j10);
    }

    public VideoFrameProcessingException(Throwable th2, long j10) {
        super(th2);
        this.f55340a = j10;
    }

    public static VideoFrameProcessingException a(Exception exc) {
        return b(exc, -9223372036854775807L);
    }
}
