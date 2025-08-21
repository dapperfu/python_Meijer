package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;

/* loaded from: classes14.dex */
public final class ClassData {

    /* renamed from: a, reason: collision with root package name */
    private final NameResolver f147265a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoBuf.Class f147266b;

    /* renamed from: c, reason: collision with root package name */
    private final BinaryVersion f147267c;

    /* renamed from: d, reason: collision with root package name */
    private final SourceElement f147268d;

    public final NameResolver a() {
        return this.f147265a;
    }

    public final ProtoBuf.Class b() {
        return this.f147266b;
    }

    public final BinaryVersion c() {
        return this.f147267c;
    }

    public final SourceElement d() {
        return this.f147268d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassData)) {
            return false;
        }
        ClassData classData = (ClassData) obj;
        return Intrinsics.e(this.f147265a, classData.f147265a) && Intrinsics.e(this.f147266b, classData.f147266b) && Intrinsics.e(this.f147267c, classData.f147267c) && Intrinsics.e(this.f147268d, classData.f147268d);
    }

    public int hashCode() {
        return (((((this.f147265a.hashCode() * 31) + this.f147266b.hashCode()) * 31) + this.f147267c.hashCode()) * 31) + this.f147268d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f147265a + ", classProto=" + this.f147266b + ", metadataVersion=" + this.f147267c + ", sourceElement=" + this.f147268d + ')';
    }

    public ClassData(NameResolver nameResolver, ProtoBuf.Class classProto, BinaryVersion metadataVersion, SourceElement sourceElement) {
        Intrinsics.j(nameResolver, "nameResolver");
        Intrinsics.j(classProto, "classProto");
        Intrinsics.j(metadataVersion, "metadataVersion");
        Intrinsics.j(sourceElement, "sourceElement");
        this.f147265a = nameResolver;
        this.f147266b = classProto;
        this.f147267c = metadataVersion;
        this.f147268d = sourceElement;
    }
}
