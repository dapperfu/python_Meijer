package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* loaded from: classes13.dex */
public abstract class ProtoContainer {

    /* renamed from: a, reason: collision with root package name */
    private final NameResolver f146427a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeTable f146428b;

    /* renamed from: c, reason: collision with root package name */
    private final SourceElement f146429c;

    public static final class Class extends ProtoContainer {

        /* renamed from: d, reason: collision with root package name */
        private final ProtoBuf.Class f146430d;

        /* renamed from: e, reason: collision with root package name */
        private final Class f146431e;

        /* renamed from: f, reason: collision with root package name */
        private final ClassId f146432f;

        /* renamed from: g, reason: collision with root package name */
        private final ProtoBuf.Class.Kind f146433g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f146434h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f146435i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(ProtoBuf.Class classProto, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, Class r62) {
            super(nameResolver, typeTable, sourceElement, null);
            Intrinsics.j(classProto, "classProto");
            Intrinsics.j(nameResolver, "nameResolver");
            Intrinsics.j(typeTable, "typeTable");
            this.f146430d = classProto;
            this.f146431e = r62;
            this.f146432f = NameResolverUtilKt.a(nameResolver, classProto.K0());
            ProtoBuf.Class.Kind kindD = Flags.f145518f.d(classProto.J0());
            this.f146433g = kindD == null ? ProtoBuf.Class.Kind.CLASS : kindD;
            Boolean boolD = Flags.f145519g.d(classProto.J0());
            Intrinsics.i(boolD, "get(...)");
            this.f146434h = boolD.booleanValue();
            Boolean boolD2 = Flags.f145520h.d(classProto.J0());
            Intrinsics.i(boolD2, "get(...)");
            this.f146435i = boolD2.booleanValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public FqName a() {
            return this.f146432f.a();
        }

        public final ClassId e() {
            return this.f146432f;
        }

        public final ProtoBuf.Class f() {
            return this.f146430d;
        }

        public final ProtoBuf.Class.Kind g() {
            return this.f146433g;
        }

        public final Class h() {
            return this.f146431e;
        }

        public final boolean i() {
            return this.f146434h;
        }
    }

    public static final class Package extends ProtoContainer {

        /* renamed from: d, reason: collision with root package name */
        private final FqName f146436d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Package(FqName fqName, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, null);
            Intrinsics.j(fqName, "fqName");
            Intrinsics.j(nameResolver, "nameResolver");
            Intrinsics.j(typeTable, "typeTable");
            this.f146436d = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public FqName a() {
            return this.f146436d;
        }
    }

    public /* synthetic */ ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver, typeTable, sourceElement);
    }

    public abstract FqName a();

    private ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
        this.f146427a = nameResolver;
        this.f146428b = typeTable;
        this.f146429c = sourceElement;
    }

    public final NameResolver b() {
        return this.f146427a;
    }

    public final SourceElement c() {
        return this.f146429c;
    }

    public final TypeTable d() {
        return this.f146428b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
