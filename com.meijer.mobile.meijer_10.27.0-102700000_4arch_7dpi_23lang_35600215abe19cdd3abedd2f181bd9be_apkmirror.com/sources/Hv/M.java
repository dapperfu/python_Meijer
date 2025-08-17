package Hv;

import Fv.f;
import Fv.n;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u001a\u0010,\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001dR\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0001\u00011¨\u00062"}, d2 = {"LHv/M;", "LFv/f;", "", "serialName", "keyDescriptor", "valueDescriptor", "<init>", "(Ljava/lang/String;LFv/f;LFv/f;)V", "", "index", "j", "(I)Ljava/lang/String;", "name", "h", "(Ljava/lang/String;)I", "", "n", "(I)Z", "", "", "k", "(I)Ljava/util/List;", "l", "(I)LFv/f;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "m", "b", "LFv/f;", "getKeyDescriptor", "()LFv/f;", "c", "getValueDescriptor", "d", "I", "i", "elementsCount", "LFv/m;", "f", "()LFv/m;", "kind", "LHv/G;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public abstract class M implements Fv.f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Fv.f keyDescriptor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Fv.f valueDescriptor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int elementsCount;

    public /* synthetic */ M(String str, Fv.f fVar, Fv.f fVar2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fVar, fVar2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof M)) {
            return false;
        }
        M m10 = (M) other;
        return Intrinsics.e(getSerialName(), m10.getSerialName()) && Intrinsics.e(this.keyDescriptor, m10.keyDescriptor) && Intrinsics.e(this.valueDescriptor, m10.valueDescriptor);
    }

    private M(String str, Fv.f fVar, Fv.f fVar2) {
        this.serialName = str;
        this.keyDescriptor = fVar;
        this.valueDescriptor = fVar2;
        this.elementsCount = 2;
    }

    @Override // Fv.f
    public Fv.m f() {
        return n.c.f11135a;
    }

    @Override // Fv.f
    public int h(String name) {
        Intrinsics.j(name, "name");
        Integer numV = StringsKt.v(name);
        if (numV != null) {
            return numV.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // Fv.f
    /* renamed from: i, reason: from getter */
    public int getElementsCount() {
        return this.elementsCount;
    }

    @Override // Fv.f
    public List<Annotation> k(int index) {
        if (index >= 0) {
            return CollectionsKt.m();
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @Override // Fv.f
    public Fv.f l(int index) {
        if (index >= 0) {
            int i10 = index % 2;
            if (i10 == 0) {
                return this.keyDescriptor;
            }
            if (i10 == 1) {
                return this.valueDescriptor;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    @Override // Fv.f
    /* renamed from: m, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    @Override // Fv.f
    public boolean n(int index) {
        if (index >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + index + ", " + getSerialName() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return getSerialName() + '(' + this.keyDescriptor + ", " + this.valueDescriptor + ')';
    }

    @Override // Fv.f
    public boolean g() {
        return f.a.c(this);
    }

    @Override // Fv.f
    public List<Annotation> getAnnotations() {
        return f.a.a(this);
    }

    public int hashCode() {
        return (((getSerialName().hashCode() * 31) + this.keyDescriptor.hashCode()) * 31) + this.valueDescriptor.hashCode();
    }

    @Override // Fv.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // Fv.f
    public String j(int index) {
        return String.valueOf(index);
    }
}
