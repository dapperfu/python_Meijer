package V0;

import V0.C5346q0;
import android.graphics.Shader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u0005\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0017"}, d2 = {"LV0/z1;", "LV0/i0;", "<init>", "()V", "LU0/k;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "LV0/o1;", "p", "", "alpha", "", "a", "(JLV0/o1;F)V", "c", "Landroid/graphics/Shader;", "internalShader", "d", "J", "createdSize", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class z1 extends AbstractC5324i0 {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Shader internalShader;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long createdSize;

    public z1() {
        super(null);
        this.createdSize = U0.k.INSTANCE.a();
    }

    public abstract Shader b(long size);

    @Override // V0.AbstractC5324i0
    public final void a(long size, o1 p10, float alpha) {
        Shader shaderB = this.internalShader;
        if (shaderB == null || !U0.k.f(this.createdSize, size)) {
            if (U0.k.k(size)) {
                shaderB = null;
                this.internalShader = null;
                this.createdSize = U0.k.INSTANCE.a();
            } else {
                shaderB = b(size);
                this.internalShader = shaderB;
                this.createdSize = size;
            }
        }
        long jB = p10.b();
        C5346q0.Companion companion = C5346q0.INSTANCE;
        if (!C5346q0.s(jB, companion.a())) {
            p10.x(companion.a());
        }
        if (!Intrinsics.e(p10.E(), shaderB)) {
            p10.D(shaderB);
        }
        if (p10.a() == alpha) {
            return;
        }
        p10.d(alpha);
    }
}
