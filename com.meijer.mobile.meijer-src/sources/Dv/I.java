package Dv;

import Bv.f;
import Bv.n;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001bR\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0001\u0002*+¨\u0006,"}, d2 = {"LDv/I;", "LBv/f;", "elementDescriptor", "<init>", "(LBv/f;)V", "", "index", "", "j", "(I)Ljava/lang/String;", "name", "h", "(Ljava/lang/String;)I", "", "n", "(I)Z", "", "", "k", "(I)Ljava/util/List;", "l", "(I)LBv/f;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "LBv/f;", "getElementDescriptor", "()LBv/f;", "b", "I", "i", "elementsCount", "LBv/m;", "f", "()LBv/m;", "kind", "LDv/d;", "LDv/i0;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class I implements Bv.f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Bv.f elementDescriptor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int elementsCount;

    public /* synthetic */ I(Bv.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof I)) {
            return false;
        }
        I i10 = (I) other;
        return Intrinsics.e(this.elementDescriptor, i10.elementDescriptor) && Intrinsics.e(getSerialName(), i10.getSerialName());
    }

    private I(Bv.f fVar) {
        this.elementDescriptor = fVar;
        this.elementsCount = 1;
    }

    @Override // Bv.f
    public Bv.m f() {
        return n.b.f3729a;
    }

    @Override // Bv.f
    public int h(String name) {
        Intrinsics.j(name, "name");
        Integer numV = StringsKt.v(name);
        if (numV != null) {
            return numV.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    public int hashCode() {
        return (this.elementDescriptor.hashCode() * 31) + getSerialName().hashCode();
    }

    @Override // Bv.f
    /* renamed from: i, reason: from getter */
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // Bv.f
    public List<Annotation> k(int index) {
        if (index >= 0) {
            return CollectionsKt.m();
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @Override // Bv.f
    public Bv.f l(int index) {
        if (index >= 0) {
            return this.elementDescriptor;
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @Override // Bv.f
    public boolean n(int index) {
        if (index >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return getSerialName() + '(' + this.elementDescriptor + ')';
    }

    @Override // Bv.f
    public boolean g() {
        return f.a.c(this);
    }

    @Override // Bv.f
    public List<Annotation> getAnnotations() {
        return f.a.a(this);
    }

    @Override // Bv.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // Bv.f
    public String j(int index) {
        return String.valueOf(index);
    }
}
