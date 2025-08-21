package Fv;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b*\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b+\u0010,R*\u00100\u001a\u00020&2\u0006\u0010)\u001a\u00020&8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010-\u001a\u0004\b+\u0010.\"\u0004\b/\u0010(¨\u00061"}, d2 = {"LFv/j;", "", "LFv/x;", "writer", "<init>", "(LFv/x;)V", "", "b", "()V", "q", "c", "d", "p", "", "v", "f", "(C)V", "", "k", "(Ljava/lang/String;)V", "", "h", "(F)V", "", "g", "(D)V", "", "e", "(B)V", "", "l", "(S)V", "", "i", "(I)V", "", "j", "(J)V", "", "m", "(Z)V", "value", "n", "a", "LFv/x;", "Z", "()Z", "o", "writingFirst", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Fv.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C3600j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final InterfaceC3613x writer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean writingFirst;

    public void b() {
        this.writingFirst = true;
    }

    public void c() {
        this.writingFirst = false;
    }

    public void d() {
        this.writingFirst = false;
    }

    public void p() {
    }

    public void q() {
    }

    public C3600j(InterfaceC3613x writer) {
        Intrinsics.j(writer, "writer");
        this.writer = writer;
        this.writingFirst = true;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getWritingFirst() {
        return this.writingFirst;
    }

    public void e(byte v10) {
        this.writer.writeLong(v10);
    }

    public final void f(char v10) {
        this.writer.a(v10);
    }

    public void g(double v10) {
        this.writer.c(String.valueOf(v10));
    }

    public void h(float v10) {
        this.writer.c(String.valueOf(v10));
    }

    public void i(int v10) {
        this.writer.writeLong(v10);
    }

    public void j(long v10) {
        this.writer.writeLong(v10);
    }

    public final void k(String v10) {
        Intrinsics.j(v10, "v");
        this.writer.c(v10);
    }

    public void l(short v10) {
        this.writer.writeLong(v10);
    }

    public void m(boolean v10) {
        this.writer.c(String.valueOf(v10));
    }

    public void n(String value) {
        Intrinsics.j(value, "value");
        this.writer.b(value);
    }

    protected final void o(boolean z10) {
        this.writingFirst = z10;
    }
}
