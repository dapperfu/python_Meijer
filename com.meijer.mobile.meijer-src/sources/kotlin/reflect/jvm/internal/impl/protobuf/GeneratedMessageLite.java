package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* loaded from: classes14.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> {

        /* renamed from: a, reason: collision with root package name */
        private ByteString f146761a = ByteString.f146726a;

        public abstract BuilderType n(MessageType messagetype);

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        /* renamed from: l */
        public BuilderType r() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final ByteString m() {
            return this.f146761a;
        }

        public final BuilderType o(ByteString byteString) {
            this.f146761a = byteString;
            return this;
        }

        protected Builder() {
        }
    }

    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {

        /* renamed from: b, reason: collision with root package name */
        private FieldSet<b> f146762b = FieldSet.g();

        /* renamed from: c, reason: collision with root package name */
        private boolean f146763c;

        /* JADX INFO: Access modifiers changed from: private */
        public FieldSet<b> q() {
            this.f146762b.q();
            this.f146763c = false;
            return this.f146762b;
        }

        private void s() {
            if (this.f146763c) {
                return;
            }
            this.f146762b = this.f146762b.clone();
            this.f146763c = true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
        public BuilderType r() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        protected ExtendableBuilder() {
        }

        protected final void t(MessageType messagetype) {
            s();
            this.f146762b.r(((ExtendableMessage) messagetype).f146764b);
        }
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {

        /* renamed from: b, reason: collision with root package name */
        private final FieldSet<b> f146764b;

        /* JADX INFO: Access modifiers changed from: protected */
        public class ExtensionWriter {

            /* renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<b, Object>> f146765a;

            /* renamed from: b, reason: collision with root package name */
            private Map.Entry<b, Object> f146766b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f146767c;

            /* synthetic */ ExtensionWriter(ExtendableMessage extendableMessage, boolean z10, a aVar) {
                this(z10);
            }

            private ExtensionWriter(boolean z10) {
                Iterator<Map.Entry<b, Object>> itP = ExtendableMessage.this.f146764b.p();
                this.f146765a = itP;
                if (itP.hasNext()) {
                    this.f146766b = itP.next();
                }
                this.f146767c = z10;
            }

            public void a(int i10, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<b, Object> entry = this.f146766b;
                    if (entry == null || entry.getKey().g() >= i10) {
                        return;
                    }
                    b key = this.f146766b.getKey();
                    if (this.f146767c && key.j() == WireFormat.JavaType.MESSAGE && !key.h()) {
                        codedOutputStream.f0(key.g(), (MessageLite) this.f146766b.getValue());
                    } else {
                        FieldSet.z(key, this.f146766b.getValue(), codedOutputStream);
                    }
                    if (this.f146765a.hasNext()) {
                        this.f146766b = this.f146765a.next();
                    } else {
                        this.f146766b = null;
                    }
                }
            }
        }

        protected ExtendableMessage() {
            this.f146764b = FieldSet.t();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        protected void m() {
            this.f146764b.q();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        protected boolean p(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i10) throws IOException {
            return GeneratedMessageLite.q(this.f146764b, e(), codedInputStream, codedOutputStream, extensionRegistryLite, i10);
        }

        protected boolean s() {
            return this.f146764b.n();
        }

        protected int t() {
            return this.f146764b.k();
        }

        protected ExtendableMessage<MessageType>.ExtensionWriter z() {
            return new ExtensionWriter(this, false, null);
        }

        protected ExtendableMessage(ExtendableBuilder<MessageType, ?> extendableBuilder) {
            this.f146764b = extendableBuilder.q();
        }

        private void A(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.b() == e()) {
            } else {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type u(GeneratedExtension<MessageType, Type> generatedExtension) {
            A(generatedExtension);
            Object objH = this.f146764b.h(generatedExtension.f146772d);
            if (objH == null) {
                return generatedExtension.f146770b;
            }
            return (Type) generatedExtension.a(objH);
        }

        public final <Type> Type v(GeneratedExtension<MessageType, List<Type>> generatedExtension, int i10) {
            A(generatedExtension);
            return (Type) generatedExtension.e(this.f146764b.i(generatedExtension.f146772d, i10));
        }

        public final <Type> int x(GeneratedExtension<MessageType, List<Type>> generatedExtension) {
            A(generatedExtension);
            return this.f146764b.j(generatedExtension.f146772d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean y(GeneratedExtension<MessageType, Type> generatedExtension) {
            A(generatedExtension);
            return this.f146764b.m(generatedExtension.f146772d);
        }
    }

    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {

        /* renamed from: a, reason: collision with root package name */
        final ContainingType f146769a;

        /* renamed from: b, reason: collision with root package name */
        final Type f146770b;

        /* renamed from: c, reason: collision with root package name */
        final MessageLite f146771c;

        /* renamed from: d, reason: collision with root package name */
        final b f146772d;

        /* renamed from: e, reason: collision with root package name */
        final Class f146773e;

        /* renamed from: f, reason: collision with root package name */
        final Method f146774f;

        Object a(Object obj) {
            if (!this.f146772d.h()) {
                return e(obj);
            }
            if (this.f146772d.j() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public ContainingType b() {
            return this.f146769a;
        }

        public MessageLite c() {
            return this.f146771c;
        }

        public int d() {
            return this.f146772d.g();
        }

        Object e(Object obj) {
            return this.f146772d.j() == WireFormat.JavaType.ENUM ? GeneratedMessageLite.l(this.f146774f, null, (Integer) obj) : obj;
        }

        Object f(Object obj) {
            return this.f146772d.j() == WireFormat.JavaType.ENUM ? Integer.valueOf(((Internal.EnumLite) obj).g()) : obj;
        }

        GeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, b bVar, Class cls) {
            if (containingtype != null) {
                if (bVar.i() == WireFormat.FieldType.f146814m && messageLite == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.f146769a = containingtype;
                this.f146770b = type;
                this.f146771c = messageLite;
                this.f146772d = bVar;
                this.f146773e = cls;
                if (Internal.EnumLite.class.isAssignableFrom(cls)) {
                    this.f146774f = GeneratedMessageLite.k(cls, "valueOf", Integer.TYPE);
                    return;
                } else {
                    this.f146774f = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
    }

    static final class b implements FieldSet.FieldDescriptorLite<b> {

        /* renamed from: a, reason: collision with root package name */
        final Internal.EnumLiteMap<?> f146776a;

        /* renamed from: b, reason: collision with root package name */
        final int f146777b;

        /* renamed from: c, reason: collision with root package name */
        final WireFormat.FieldType f146778c;

        /* renamed from: d, reason: collision with root package name */
        final boolean f146779d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f146780e;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            return this.f146777b - bVar.f146777b;
        }

        public Internal.EnumLiteMap<?> b() {
            return this.f146776a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public int g() {
            return this.f146777b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean h() {
            return this.f146779d;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.FieldType i() {
            return this.f146778c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.JavaType j() {
            return this.f146778c.a();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean k() {
            return this.f146780e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public MessageLite.Builder x(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).n((GeneratedMessageLite) messageLite);
        }

        b(Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, boolean z10, boolean z11) {
            this.f146776a = enumLiteMap;
            this.f146777b = i10;
            this.f146778c = fieldType;
            this.f146779d = z10;
            this.f146780e = z11;
        }
    }

    protected GeneratedMessageLite() {
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> n(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, boolean z10, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.EMPTY_LIST, messageLite, new b(enumLiteMap, i10, fieldType, true, z10), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> o(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i10, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new b(enumLiteMap, i10, fieldType, false, false), cls);
    }

    protected void m() {
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f146775a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f146775a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f146775a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    protected GeneratedMessageLite(Builder builder) {
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public Parser<? extends MessageLite> f() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    static Method k(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(strValueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    static Object l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite> boolean q(kotlin.reflect.jvm.internal.impl.protobuf.FieldSet<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.b> r5, MessageType r6, kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.q(kotlin.reflect.jvm.internal.impl.protobuf.FieldSet, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite, int):boolean");
    }

    protected boolean p(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i10) throws IOException {
        return codedInputStream.P(i10, codedOutputStream);
    }
}
