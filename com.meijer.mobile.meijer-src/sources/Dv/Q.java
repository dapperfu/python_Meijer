package Dv;

import Bv.f;
import Bv.n;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010)\u001a\u00020\t8\u0016X\u0096D¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0019R\u0014\u0010+\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001f¨\u0006,"}, d2 = {"LDv/Q;", "LBv/f;", "<init>", "()V", "", "a", "()Ljava/lang/Void;", "", "index", "", "j", "(I)Ljava/lang/String;", "name", "h", "(Ljava/lang/String;)I", "", "n", "(I)Z", "l", "(I)LBv/f;", "", "", "k", "(I)Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "LBv/m;", "b", "LBv/m;", "f", "()LBv/m;", "kind", "c", "Ljava/lang/String;", "m", "serialName", "i", "elementsCount", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class Q implements Bv.f {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f6718a = new Q();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Bv.m kind = n.d.f3731a;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final String serialName = "kotlin.Nothing";

    @Override // Bv.f
    /* renamed from: i */
    public int getElementsCount() {
        return 0;
    }

    private final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public boolean equals(Object other) {
        return this == other;
    }

    @Override // Bv.f
    public Bv.m f() {
        return kind;
    }

    @Override // Bv.f
    public int h(String name) {
        Intrinsics.j(name, "name");
        a();
        throw new KotlinNothingValueException();
    }

    @Override // Bv.f
    /* renamed from: m */
    public String getSerialName() {
        return serialName;
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }

    private Q() {
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
