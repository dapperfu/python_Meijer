package uv;

import kotlin.Metadata;
import mv.AbstractC15779K;
import rv.C16975l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Luv/c;", "Luv/f;", "<init>", "()V", "", "parallelism", "", "name", "Lmv/K;", "S0", "(ILjava/lang/String;)Lmv/K;", "", "close", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uv.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C17487c extends C17490f {

    /* renamed from: i, reason: collision with root package name */
    public static final C17487c f164633i = new C17487c();

    private C17487c() {
        super(C17494j.f164645c, C17494j.f164646d, C17494j.f164647e, C17494j.f164643a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // mv.AbstractC15779K
    /* renamed from: toString */
    public String getName() {
        return "Dispatchers.Default";
    }

    @Override // mv.AbstractC15779K
    public AbstractC15779K S0(int parallelism, String name) {
        C16975l.a(parallelism);
        if (parallelism >= C17494j.f164645c) {
            return C16975l.b(this, name);
        }
        return super.S0(parallelism, name);
    }
}
