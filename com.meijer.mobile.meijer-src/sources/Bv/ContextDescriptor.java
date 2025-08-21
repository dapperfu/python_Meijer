package Bv;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0097\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0012\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\fH\u0097\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010'\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0011R\u0014\u0010+\u001a\u00020(8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020\t8VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020\t8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u0010-R\u0014\u00101\u001a\u00020\f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b0\u0010\u000eR\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188VX\u0097\u0005¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"LBv/c;", "LBv/f;", "original", "Lkotlin/reflect/KClass;", "kClass", "<init>", "(LBv/f;Lkotlin/reflect/KClass;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "index", "j", "(I)Ljava/lang/String;", "name", "h", "(Ljava/lang/String;)I", "", "", "k", "(I)Ljava/util/List;", "l", "(I)LBv/f;", "n", "(I)Z", "a", "LBv/f;", "b", "Lkotlin/reflect/KClass;", "c", "Ljava/lang/String;", "m", "serialName", "LBv/m;", "f", "()LBv/m;", "kind", "g", "()Z", "isNullable", "isInline", "i", "elementsCount", "getAnnotations", "()Ljava/util/List;", "annotations", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: Bv.c, reason: from toString */
/* loaded from: classes14.dex */
final class ContextDescriptor implements f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f original;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @JvmField
    public final KClass<?> kClass;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String serialName;

    public ContextDescriptor(f original, KClass<?> kClass) {
        Intrinsics.j(original, "original");
        Intrinsics.j(kClass, "kClass");
        this.original = original;
        this.kClass = kClass;
        this.serialName = original.getSerialName() + '<' + kClass.u() + '>';
    }

    public boolean equals(Object other) {
        ContextDescriptor contextDescriptor = other instanceof ContextDescriptor ? (ContextDescriptor) other : null;
        return contextDescriptor != null && Intrinsics.e(this.original, contextDescriptor.original) && Intrinsics.e(contextDescriptor.kClass, this.kClass);
    }

    @Override // Bv.f
    public m f() {
        return this.original.f();
    }

    @Override // Bv.f
    public boolean g() {
        return this.original.g();
    }

    @Override // Bv.f
    public List<Annotation> getAnnotations() {
        return this.original.getAnnotations();
    }

    @Override // Bv.f
    public int h(String name) {
        Intrinsics.j(name, "name");
        return this.original.h(name);
    }

    public int hashCode() {
        return (this.kClass.hashCode() * 31) + getSerialName().hashCode();
    }

    @Override // Bv.f
    /* renamed from: i */
    public int getElementsCount() {
        return this.original.getElementsCount();
    }

    @Override // Bv.f
    public boolean isInline() {
        return this.original.isInline();
    }

    @Override // Bv.f
    public String j(int index) {
        return this.original.j(index);
    }

    @Override // Bv.f
    public List<Annotation> k(int index) {
        return this.original.k(index);
    }

    @Override // Bv.f
    public f l(int index) {
        return this.original.l(index);
    }

    @Override // Bv.f
    /* renamed from: m, reason: from getter */
    public String getSerialName() {
        return this.serialName;
    }

    @Override // Bv.f
    public boolean n(int index) {
        return this.original.n(index);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.kClass + ", original: " + this.original + ')';
    }
}
