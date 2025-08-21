package V0;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0014\u001a\u00020\u00138VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"LV0/J;", "LV0/f1;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "", "a", "()V", "b", "Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "", "getWidth", "()I", "width", "getHeight", "height", "LV0/g1;", "config", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class J implements InterfaceC5459f1 {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bitmap bitmap;

    @Override // V0.InterfaceC5459f1
    public void a() {
        this.bitmap.prepareToDraw();
    }

    @Override // V0.InterfaceC5459f1
    public int b() {
        Bitmap.Config config = this.bitmap.getConfig();
        Intrinsics.g(config);
        return M.e(config);
    }

    /* renamed from: c, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // V0.InterfaceC5459f1
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // V0.InterfaceC5459f1
    public int getWidth() {
        return this.bitmap.getWidth();
    }

    public J(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
