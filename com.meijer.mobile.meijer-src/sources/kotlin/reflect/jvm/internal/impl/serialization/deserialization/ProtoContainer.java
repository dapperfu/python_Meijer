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

/* loaded from: classes14.dex */
public abstract class ProtoContainer {

    /* renamed from: a, reason: collision with root package name */
    private final NameResolver f147334a;

    /* renamed from: b, reason: collision with root package name */
    private final TypeTable f147335b;

    /* renamed from: c, reason: collision with root package name */
    private final SourceElement f147336c;

    public static final class Class extends ProtoContainer {

        /* renamed from: d, reason: collision with root package name */
        private final ProtoBuf.Class f147337d;

        /* renamed from: e, reason: collision with root package name */
        private final Class f147338e;

        /* renamed from: f, reason: collision with root package name */
        private final ClassId f147339f;

        /* renamed from: g, reason: collision with root package name */
        private final ProtoBuf.Class.Kind f147340g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f147341h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f147342i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Class(ProtoBuf.Class classProto, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, Class r62) {
            super(nameResolver, typeTable, sourceElement, null);
            Intrinsics.j(classProto, "classProto");
            Intrinsics.j(nameResolver, "nameResolver");
            Intrinsics.j(typeTable, "typeTable");
            this.f147337d = classProto;
            this.f147338e = r62;
            this.f147339f = NameResolverUtilKt.a(nameResolver, classProto.K0());
            ProtoBuf.Class.Kind kindD = Flags.f146425f.d(classProto.J0());
            this.f147340g = kindD == null ? ProtoBuf.Class.Kind.CLASS : kindD;
            Boolean boolD = Flags.f146426g.d(classProto.J0());
            Intrinsics.i(boolD, "get(...)");
            this.f147341h = boolD.booleanValue();
            Boolean boolD2 = Flags.f146427h.d(classProto.J0());
            Intrinsics.i(boolD2, "get(...)");
            this.f147342i = boolD2.booleanValue();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public FqName a() {
            return this.f147339f.a();
        }

        public final ClassId e() {
            return this.f147339f;
        }

        public final ProtoBuf.Class f() {
            return this.f147337d;
        }

        public final ProtoBuf.Class.Kind g() {
            return this.f147340g;
        }

        public final Class h() {
            return this.f147338e;
        }

        public final boolean i() {
            return this.f147341h;
        }
    }

    public static final class Package extends ProtoContainer {

        /* renamed from: d, reason: collision with root package name */
        private final FqName f147343d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Package(FqName fqName, NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
            super(nameResolver, typeTable, sourceElement, null);
            Intrinsics.j(fqName, "fqName");
            Intrinsics.j(nameResolver, "nameResolver");
            Intrinsics.j(typeTable, "typeTable");
            this.f147343d = fqName;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer
        public FqName a() {
            return this.f147343d;
        }
    }

    public /* synthetic */ ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement, DefaultConstructorMarker defaultConstructorMarker) {
        this(nameResolver, typeTable, sourceElement);
    }

    public abstract FqName a();

    private ProtoContainer(NameResolver nameResolver, TypeTable typeTable, SourceElement sourceElement) {
        this.f147334a = nameResolver;
        this.f147335b = typeTable;
        this.f147336c = sourceElement;
    }

    public final NameResolver b() {
        return this.f147334a;
    }

    public final SourceElement c() {
        return this.f147336c;
    }

    public final TypeTable d() {
        return this.f147335b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
