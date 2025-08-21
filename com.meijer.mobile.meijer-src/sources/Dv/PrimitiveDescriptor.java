package Dv;

import Bv.f;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0014\u0010)\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\"¨\u0006*"}, d2 = {"LDv/k0;", "LBv/f;", "", "serialName", "LBv/e;", "kind", "<init>", "(Ljava/lang/String;LBv/e;)V", "", "a", "()Ljava/lang/Void;", "", "index", "j", "(I)Ljava/lang/String;", "name", "h", "(Ljava/lang/String;)I", "", "n", "(I)Z", "l", "(I)LBv/f;", "", "", "k", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "m", "b", "LBv/e;", "()LBv/e;", "i", "elementsCount", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Dv.k0, reason: from toString */
/* loaded from: classes14.dex */
public final class PrimitiveDescriptor implements Bv.f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bv.e kind;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrimitiveDescriptor)) {
            return false;
        }
        PrimitiveDescriptor primitiveDescriptor = (PrimitiveDescriptor) other;
        return Intrinsics.e(getSerialName(), primitiveDescriptor.getSerialName()) && Intrinsics.e(f(), primitiveDescriptor.f());
    }

    @Override // Bv.f
    /* renamed from: i */
    public int getElementsCount() {
        return 0;
    }

    public PrimitiveDescriptor(String serialName, Bv.e kind) {
        Intrinsics.j(serialName, "serialName");
        Intrinsics.j(kind, "kind");
        this.serialName = serialName;
        this.kind = kind;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // Bv.f
    /* renamed from: b, reason: from getter and merged with bridge method [inline-methods] */
    public Bv.e f() {
        return this.kind;
    }

    @Override // Bv.f
    public int h(String name) {
        Intrinsics.j(name, "name");
        a();
        throw new KotlinNothingValueException();
    }

    @Override // Bv.f
    /* renamed from: m, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + getSerialName() + ')';
    }

    @Override // Bv.f
    public boolean g() {
        return f.a.c(this);
    }

    @Override // Bv.f
    public List<Annotation> getAnnotations() {
        return f.a.a(this);
    }

    public int hashCode() {
        return getSerialName().hashCode() + (f().hashCode() * 31);
    }

    @Override // Bv.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // Bv.f
    public String j(int index) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // Bv.f
    public List<Annotation> k(int index) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // Bv.f
    public Bv.f l(int index) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // Bv.f
    public boolean n(int index) {
        a();
        throw new KotlinNothingValueException();
    }
}
