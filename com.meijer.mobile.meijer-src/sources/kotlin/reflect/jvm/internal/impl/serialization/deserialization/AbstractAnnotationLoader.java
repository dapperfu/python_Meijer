package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;

@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class AbstractAnnotationLoader<A> implements AnnotationLoader<A> {

    /* renamed from: a, reason: collision with root package name */
    private final SerializerExtensionProtocol f147251a;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            try {
                iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AbstractAnnotationLoader(SerializerExtensionProtocol protocol) {
        Intrinsics.j(protocol, "protocol");
        this.f147251a = protocol;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> a(ProtoContainer container, MessageLite callableProto, AnnotatedCallableKind kind, int i10, ProtoBuf.ValueParameter proto) {
        Intrinsics.j(container, "container");
        Intrinsics.j(callableProto, "callableProto");
        Intrinsics.j(kind, "kind");
        Intrinsics.j(proto, "proto");
        List listM = (List) proto.u(this.f147251a.h());
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> b(ProtoContainer.Class container) {
        Intrinsics.j(container, "container");
        List listM = (List) container.f().u(this.f147251a.a());
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> c(ProtoBuf.Type proto, NameResolver nameResolver) {
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        List listM = (List) proto.u(this.f147251a.o());
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> d(ProtoContainer container, ProtoBuf.EnumEntry proto) {
        Intrinsics.j(container, "container");
        Intrinsics.j(proto, "proto");
        List listM = (List) proto.u(this.f147251a.d());
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> e(ProtoContainer container, MessageLite proto, AnnotatedCallableKind kind) {
        List listM;
        Intrinsics.j(container, "container");
        Intrinsics.j(proto, "proto");
        Intrinsics.j(kind, "kind");
        if (proto instanceof ProtoBuf.Constructor) {
            listM = (List) ((ProtoBuf.Constructor) proto).u(this.f147251a.c());
        } else if (proto instanceof ProtoBuf.Function) {
            listM = (List) ((ProtoBuf.Function) proto).u(this.f147251a.f());
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i10 == 1) {
                listM = (List) ((ProtoBuf.Property) proto).u(this.f147251a.i());
            } else if (i10 == 2) {
                listM = (List) ((ProtoBuf.Property) proto).u(this.f147251a.m());
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("Unsupported callable kind with property proto");
                }
                listM = (List) ((ProtoBuf.Property) proto).u(this.f147251a.n());
            }
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> g(ProtoBuf.TypeParameter proto, NameResolver nameResolver) {
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        List listM = (List) proto.u(this.f147251a.p());
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i((ProtoBuf.Annotation) it.next(), nameResolver));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> j(ProtoContainer container, ProtoBuf.Property proto) {
        Intrinsics.j(container, "container");
        Intrinsics.j(proto, "proto");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtensionJ = this.f147251a.j();
        List listM = generatedExtensionJ != null ? (List) proto.u(generatedExtensionJ) : null;
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> k(ProtoContainer container, MessageLite proto, AnnotatedCallableKind kind) {
        Intrinsics.j(container, "container");
        Intrinsics.j(proto, "proto");
        Intrinsics.j(kind, "kind");
        List listM = null;
        if (proto instanceof ProtoBuf.Function) {
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, List<ProtoBuf.Annotation>> generatedExtensionG = this.f147251a.g();
            if (generatedExtensionG != null) {
                listM = (List) ((ProtoBuf.Function) proto).u(generatedExtensionG);
            }
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unknown message: " + proto).toString());
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i10 != 1 && i10 != 2 && i10 != 3) {
                throw new IllegalStateException(("Unsupported callable kind with property proto for receiver annotations: " + kind).toString());
            }
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtensionL = this.f147251a.l();
            if (generatedExtensionL != null) {
                listM = (List) ((ProtoBuf.Property) proto).u(generatedExtensionL);
            }
        }
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    public List<A> l(ProtoContainer container, ProtoBuf.Property proto) {
        Intrinsics.j(container, "container");
        Intrinsics.j(proto, "proto");
        GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, List<ProtoBuf.Annotation>> generatedExtensionK = this.f147251a.k();
        List listM = generatedExtensionK != null ? (List) proto.u(generatedExtensionK) : null;
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        List list = listM;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(i((ProtoBuf.Annotation) it.next(), container.b()));
        }
        return arrayList;
    }

    protected final SerializerExtensionProtocol m() {
        return this.f147251a;
    }
}
