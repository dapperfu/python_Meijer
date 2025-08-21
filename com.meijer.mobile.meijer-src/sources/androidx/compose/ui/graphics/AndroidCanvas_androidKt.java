package androidx.compose.ui.graphics;

import V0.InterfaceC5459f1;
import V0.M;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t\"\u0019\u0010\u000e\u001a\u00060\u0005j\u0002`\u000b*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\r*\n\u0010\u000f\"\u00020\u00052\u00020\u0005¨\u0006\u0010"}, d2 = {"LV0/f1;", "image", "Landroidx/compose/ui/graphics/Canvas;", "a", "(LV0/f1;)Landroidx/compose/ui/graphics/Canvas;", "Landroid/graphics/Canvas;", "c", "Canvas", "(Landroid/graphics/Canvas;)Landroidx/compose/ui/graphics/Canvas;", "Landroid/graphics/Canvas;", "EmptyCanvas", "Landroidx/compose/ui/graphics/NativeCanvas;", "getNativeCanvas", "(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;", "nativeCanvas", "NativeCanvas", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidCanvas_androidKt {

    /* renamed from: a, reason: collision with root package name */
    private static final android.graphics.Canvas f50925a = new android.graphics.Canvas();

    public static final Canvas Canvas(android.graphics.Canvas canvas) {
        a aVar = new a();
        aVar.A(canvas);
        return aVar;
    }

    public static final Canvas a(InterfaceC5459f1 interfaceC5459f1) {
        a aVar = new a();
        aVar.A(new android.graphics.Canvas(M.b(interfaceC5459f1)));
        return aVar;
    }

    public static final android.graphics.Canvas getNativeCanvas(Canvas canvas) {
        Intrinsics.h(canvas, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidCanvas");
        return ((a) canvas).z();
    }
}
