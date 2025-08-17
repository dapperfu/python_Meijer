package yv;

import kotlin.Metadata;
import qv.AbstractC16618K;
import vv.C17656l;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lyv/c;", "Lyv/f;", "<init>", "()V", "", "parallelism", "", "name", "Lqv/K;", "U0", "(ILjava/lang/String;)Lqv/K;", "", "close", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yv.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C18308c extends C18311f {

    /* renamed from: i, reason: collision with root package name */
    public static final C18308c f171347i = new C18308c();

    private C18308c() {
        super(C18315j.f171359c, C18315j.f171360d, C18315j.f171361e, C18315j.f171357a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // qv.AbstractC16618K
    /* renamed from: toString */
    public String getName() {
        return "Dispatchers.Default";
    }

    @Override // qv.AbstractC16618K
    public AbstractC16618K U0(int parallelism, String name) {
        C17656l.a(parallelism);
        if (parallelism >= C18315j.f171359c) {
            return C17656l.b(this, name);
        }
        return super.U0(parallelism, name);
    }
}
