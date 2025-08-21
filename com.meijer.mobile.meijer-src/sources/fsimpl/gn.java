package fsimpl;

import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public abstract class gn {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f133600a = true;

    /* renamed from: b, reason: collision with root package name */
    private static gn f133601b;

    public static gn a() {
        if (f133601b == null) {
            f133601b = new gp();
        }
        return f133601b;
    }

    public abstract int a(CharSequence charSequence);

    public abstract String a(ByteBuffer byteBuffer, int i10, int i11);

    public abstract void a(CharSequence charSequence, ByteBuffer byteBuffer);
}
