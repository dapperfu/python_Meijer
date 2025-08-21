package Fd;

/* loaded from: classes6.dex */
public enum E6 implements O0 {
    UNKNOWN_FORMAT(0),
    NV16(1),
    NV21(2),
    YV12(3),
    YUV_420_888(7),
    JPEG(8),
    BITMAP(4),
    CM_SAMPLE_BUFFER_REF(5),
    UI_IMAGE(6),
    CV_PIXEL_BUFFER_REF(9);


    /* renamed from: a, reason: collision with root package name */
    private final int f9240a;

    @Override // Fd.O0
    public final int zza() {
        return this.f9240a;
    }

    E6(int i10) {
        this.f9240a = i10;
    }
}
