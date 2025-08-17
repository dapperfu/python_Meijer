package Y5;

import U0.f;
import V0.InterfaceC5316f1;
import V0.M;
import android.graphics.Bitmap;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R+\u0010 \u001a\u00020\u000b8\u0000@\u0000X\u0080\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010\"\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b!\u0010\u001f\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006#"}, d2 = {"LY5/e;", "", "LY5/d;", "settings", "<init>", "(LY5/d;)V", "Landroid/graphics/Bitmap;", "graphic", "", "d", "(Landroid/graphics/Bitmap;)V", "LU0/f;", "offset", "", "orientation", "e", "(JI)V", "Landroidx/compose/runtime/l0;", "LV0/f1;", "a", "Landroidx/compose/runtime/l0;", "_currentGraphic", "Landroidx/compose/runtime/z1;", "b", "Landroidx/compose/runtime/z1;", "()Landroidx/compose/runtime/z1;", "currentGraphic", "c", "J", "()J", "setLandscapeOffSet-k-4lQ0M$core_phoneRelease", "(J)V", "landscapeOffSet", "setPortraitOffSet-k-4lQ0M$core_phoneRelease", "portraitOffSet", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0<InterfaceC5316f1> _currentGraphic;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z1<InterfaceC5316f1> currentGraphic;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long landscapeOffSet;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long portraitOffSet;

    public e(d settings) {
        Intrinsics.j(settings, "settings");
        InterfaceC5730l0<InterfaceC5316f1> interfaceC5730l0E = t1.e(M.c(settings.getInitialGraphic()), null, 2, null);
        this._currentGraphic = interfaceC5730l0E;
        this.currentGraphic = interfaceC5730l0E;
        f.Companion companion = f.INSTANCE;
        this.landscapeOffSet = companion.b();
        this.portraitOffSet = companion.b();
    }

    public final z1<InterfaceC5316f1> a() {
        return this.currentGraphic;
    }

    /* renamed from: b, reason: from getter */
    public final long getLandscapeOffSet() {
        return this.landscapeOffSet;
    }

    /* renamed from: c, reason: from getter */
    public final long getPortraitOffSet() {
        return this.portraitOffSet;
    }

    public final void d(Bitmap graphic) {
        Intrinsics.j(graphic, "graphic");
        this._currentGraphic.setValue(M.c(graphic));
    }

    public final void e(long offset, int orientation) {
        if (f.m(offset) >= 0.0f && f.n(offset) >= 0.0f) {
            if (orientation == 2) {
                this.landscapeOffSet = offset;
            } else {
                this.portraitOffSet = offset;
            }
        }
    }
}
