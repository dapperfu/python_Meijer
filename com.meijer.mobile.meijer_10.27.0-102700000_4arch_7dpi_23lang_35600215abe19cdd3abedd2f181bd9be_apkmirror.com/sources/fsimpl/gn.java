package fsimpl;

import java.nio.ByteBuffer;

/* loaded from: classes14.dex */
public abstract class gn {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f132350a = true;

    /* renamed from: b, reason: collision with root package name */
    private static gn f132351b;

    public static gn a() {
        if (f132351b == null) {
            f132351b = new gp();
        }
        return f132351b;
    }

    public abstract int a(CharSequence charSequence);

    public abstract String a(ByteBuffer byteBuffer, int i10, int i11);

    public abstract void a(CharSequence charSequence, ByteBuffer byteBuffer);
}
