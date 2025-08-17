package Hv;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\r\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000bH\u0097\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0011\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u000eH\u0097\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010\rR \u0010*\u001a\b\u0012\u0004\u0012\u00020\u000b0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001f\u0010)R\u0014\u0010-\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00102\u001a\u00020\b8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u0010,R\u0014\u00104\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b3\u0010\u0010R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"LHv/m0;", "LFv/f;", "LHv/l;", "original", "<init>", "(LFv/f;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "index", "j", "(I)Ljava/lang/String;", "name", "h", "(Ljava/lang/String;)I", "", "", "k", "(I)Ljava/util/List;", "l", "(I)LFv/f;", "n", "(I)Z", "a", "LFv/f;", "b", "()LFv/f;", "Ljava/lang/String;", "m", "serialName", "", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "serialNames", "g", "()Z", "isNullable", "LFv/m;", "f", "()LFv/m;", "kind", "isInline", "i", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class m0 implements Fv.f, InterfaceC3705l {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Fv.f original;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<String> serialNames;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof m0) && Intrinsics.e(this.original, ((m0) other).original);
    }

    @Override // Fv.f
    public boolean g() {
        return true;
    }

    public m0(Fv.f original) {
        Intrinsics.j(original, "original");
        this.original = original;
        this.serialName = original.getSerialName() + '?';
        this.serialNames = Y.a(original);
    }

    @Override // Hv.InterfaceC3705l
    public Set<String> a() {
        return this.serialNames;
    }

    /* renamed from: b, reason: from getter */
    public final Fv.f getOriginal() {
        return this.original;
    }

    @Override // Fv.f
    public Fv.m f() {
        return this.original.f();
    }

    @Override // Fv.f
    public List<Annotation> getAnnotations() {
        return this.original.getAnnotations();
    }

    @Override // Fv.f
    public int h(String name) {
        Intrinsics.j(name, "name");
        return this.original.h(name);
    }

    public int hashCode() {
        return this.original.hashCode() * 31;
    }

    @Override // Fv.f
    /* renamed from: i */
    public int getElementsCount() {
        return this.original.getElementsCount();
    }

    @Override // Fv.f
    public boolean isInline() {
        return this.original.isInline();
    }

    @Override // Fv.f
    public String j(int index) {
        return this.original.j(index);
    }

    @Override // Fv.f
    public List<Annotation> k(int index) {
        return this.original.k(index);
    }

    @Override // Fv.f
    public Fv.f l(int index) {
        return this.original.l(index);
    }

    @Override // Fv.f
    /* renamed from: m, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    @Override // Fv.f
    public boolean n(int index) {
        return this.original.n(index);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.original);
        sb2.append('?');
        return sb2.toString();
    }
}
