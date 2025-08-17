package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;

/* loaded from: classes13.dex */
public final class ClassData {

    /* renamed from: a, reason: collision with root package name */
    private final NameResolver f146358a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Class f146359b;

    /* renamed from: c, reason: collision with root package name */
    private final BinaryVersion f146360c;

    /* renamed from: d, reason: collision with root package name */
    private final SourceElement f146361d;

    public final NameResolver a() {
        return this.f146358a;
    }

    public final ProtoBuf.Class b() {
        return this.f146359b;
    }

    public final BinaryVersion c() {
        return this.f146360c;
    }

    public final SourceElement d() {
        return this.f146361d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassData)) {
            return false;
        }
        ClassData classData = (ClassData) obj;
        return Intrinsics.e(this.f146358a, classData.f146358a) && Intrinsics.e(this.f146359b, classData.f146359b) && Intrinsics.e(this.f146360c, classData.f146360c) && Intrinsics.e(this.f146361d, classData.f146361d);
    }

    public int hashCode() {
        return (((((this.f146358a.hashCode() * 31) + this.f146359b.hashCode()) * 31) + this.f146360c.hashCode()) * 31) + this.f146361d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f146358a + ", classProto=" + this.f146359b + ", metadataVersion=" + this.f146360c + ", sourceElement=" + this.f146361d + ')';
    }

    public ClassData(NameResolver nameResolver, ProtoBuf.Class classProto, BinaryVersion metadataVersion, SourceElement sourceElement) {
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(classProto, "classProto");
        Intrinsics.j(metadataVersion, "metadataVersion");
        Intrinsics.j(sourceElement, "sourceElement");
        this.f146358a = nameResolver;
        this.f146359b = classProto;
        this.f146360c = metadataVersion;
        this.f146361d = sourceElement;
    }
}
