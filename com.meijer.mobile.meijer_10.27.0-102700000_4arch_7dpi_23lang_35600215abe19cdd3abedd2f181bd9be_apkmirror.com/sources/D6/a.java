package D6;

import C6.e;
import C6.g;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import y6.InterfaceC18172F;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0000H\u0016¢\u0006\u0004\b%\u0010\u000bJ\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010+R\u0014\u0010/\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"LD6/a;", "LC6/g;", "wrappedWriter", "<init>", "(LC6/g;)V", "", "", "Ly6/F;", "c", "()Ljava/util/Map;", "a", "()LD6/a;", "d", "b", "g", "name", "h", "(Ljava/lang/String;)LD6/a;", "value", "u", "", "z", "(Z)LD6/a;", "", "j", "(D)LD6/a;", "", "l", "(I)LD6/a;", "", "m", "(J)LD6/a;", "LC6/e;", "p", "(LC6/e;)LD6/a;", "w", "(Ly6/F;)LD6/a;", "i", "", "close", "()V", "LC6/g;", "", "Ljava/util/Map;", "uploads", "getPath", "()Ljava/lang/String;", "path", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g wrappedWriter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, InterfaceC18172F> uploads;

    public a(g wrappedWriter) {
        Intrinsics.j(wrappedWriter, "wrappedWriter");
        this.wrappedWriter = wrappedWriter;
        this.uploads = new LinkedHashMap();
    }

    @Override // C6.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a y() throws IOException {
        this.wrappedWriter.y();
        return this;
    }

    @Override // C6.g
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a s() throws IOException {
        this.wrappedWriter.s();
        return this;
    }

    public final Map<String, InterfaceC18172F> c() {
        return this.uploads;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.wrappedWriter.close();
    }

    @Override // C6.g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public a x() throws IOException {
        this.wrappedWriter.x();
        return this;
    }

    @Override // C6.g
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public a F() throws IOException {
        this.wrappedWriter.F();
        return this;
    }

    @Override // C6.g
    public String getPath() {
        return this.wrappedWriter.getPath();
    }

    @Override // C6.g
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public a x1(String name) throws IOException {
        Intrinsics.j(name, "name");
        this.wrappedWriter.x1(name);
        return this;
    }

    @Override // C6.g
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a D3() throws IOException {
        this.wrappedWriter.D3();
        return this;
    }

    @Override // C6.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a d0(double value) throws IOException {
        this.wrappedWriter.d0(value);
        return this;
    }

    @Override // C6.g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public a W(int value) throws IOException {
        this.wrappedWriter.W(value);
        return this;
    }

    @Override // C6.g
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a U(long value) throws IOException {
        this.wrappedWriter.U(value);
        return this;
    }

    @Override // C6.g
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public a L1(e value) throws IOException {
        Intrinsics.j(value, "value");
        this.wrappedWriter.L1(value);
        return this;
    }

    @Override // C6.g
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public a f2(String value) throws IOException {
        Intrinsics.j(value, "value");
        this.wrappedWriter.f2(value);
        return this;
    }

    @Override // C6.g
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public a I2(InterfaceC18172F value) throws IOException {
        Intrinsics.j(value, "value");
        this.uploads.put(this.wrappedWriter.getPath(), value);
        this.wrappedWriter.D3();
        return this;
    }

    @Override // C6.g
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public a E0(boolean value) throws IOException {
        this.wrappedWriter.E0(value);
        return this;
    }
}
