package Gd;

/* renamed from: Gd.s3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC3745s3 implements InterfaceC3665h {
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
    private final int f12258a;

    @Override // Gd.InterfaceC3665h
    public final int zza() {
        return this.f12258a;
    }

    EnumC3745s3(int i10) {
        this.f12258a = i10;
    }
}
