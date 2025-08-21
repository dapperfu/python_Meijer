package r0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u001a\u001a\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\" \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u0012\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"LH1/h;", "size", "Lr0/b;", "b", "(F)Lr0/b;", "", "percent", "a", "(I)Lr0/b;", "Lr0/b;", "getZeroCornerSize", "()Lr0/b;", "getZeroCornerSize$annotations", "()V", "ZeroCornerSize", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16800c {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC16799b f159139a = new a();

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\"\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"r0/c$a", "Lr0/b;", "", "LU0/k;", "shapeSize", "LH1/d;", "density", "", "a", "(JLH1/d;)F", "", "toString", "()Ljava/lang/String;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: r0.c$a */
    public static final class a implements InterfaceC16799b {
        @Override // r0.InterfaceC16799b
        public float a(long shapeSize, H1.d density) {
            return 0.0f;
        }

        public String toString() {
            return "ZeroCornerSize";
        }

        a() {
        }
    }

    public static final InterfaceC16799b a(int i10) {
        return new CornerSize(i10);
    }

    public static final InterfaceC16799b b(float f10) {
        return new CornerSize(f10, null);
    }
}
