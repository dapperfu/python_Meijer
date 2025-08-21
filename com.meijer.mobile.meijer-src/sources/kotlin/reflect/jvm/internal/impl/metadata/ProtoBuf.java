package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
import com.medallia.digital.mobilesdk.l3;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringArrayList;
import kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.ProtocolStringList;

/* loaded from: classes14.dex */
public final class ProtoBuf {

    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {

        /* renamed from: h, reason: collision with root package name */
        private static final Annotation f145803h;

        /* renamed from: i, reason: collision with root package name */
        public static Parser<Annotation> f145804i = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145805b;

        /* renamed from: c, reason: collision with root package name */
        private int f145806c;

        /* renamed from: d, reason: collision with root package name */
        private int f145807d;

        /* renamed from: e, reason: collision with root package name */
        private List<Argument> f145808e;

        /* renamed from: f, reason: collision with root package name */
        private byte f145809f;

        /* renamed from: g, reason: collision with root package name */
        private int f145810g;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {

            /* renamed from: h, reason: collision with root package name */
            private static final Argument f145811h;

            /* renamed from: i, reason: collision with root package name */
            public static Parser<Argument> f145812i = new a();

            /* renamed from: b, reason: collision with root package name */
            private final ByteString f145813b;

            /* renamed from: c, reason: collision with root package name */
            private int f145814c;

            /* renamed from: d, reason: collision with root package name */
            private int f145815d;

            /* renamed from: e, reason: collision with root package name */
            private Value f145816e;

            /* renamed from: f, reason: collision with root package name */
            private byte f145817f;

            /* renamed from: g, reason: collision with root package name */
            private int f145818g;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* renamed from: b, reason: collision with root package name */
                private int f145819b;

                /* renamed from: c, reason: collision with root package name */
                private int f145820c;

                /* renamed from: d, reason: collision with root package name */
                private Value f145821d = Value.M();

                private void u() {
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.f145812i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.n(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1b
                    L11:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L19
                    L19:
                        r3 = move-exception
                        r0 = r4
                    L1b:
                        if (r0 == 0) goto L20
                        r2.n(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder.j(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Builder");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder t() {
                    return new Builder();
                }

                public Argument r() {
                    Argument argument = new Argument(this);
                    int i10 = this.f145819b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    argument.f145815d = this.f145820c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    argument.f145816e = this.f145821d;
                    argument.f145814c = i11;
                    return argument;
                }

                public Builder x(Value value) {
                    if ((this.f145819b & 2) != 2 || this.f145821d == Value.M()) {
                        this.f145821d = value;
                    } else {
                        this.f145821d = Value.g0(this.f145821d).n(value).r();
                    }
                    this.f145819b |= 2;
                    return this;
                }

                public Builder y(int i10) {
                    this.f145819b |= 1;
                    this.f145820c = i10;
                    return this;
                }

                private Builder() {
                    u();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public Argument build() {
                    Argument argumentR = r();
                    if (argumentR.a()) {
                        return argumentR;
                    }
                    throw AbstractMessageLite.Builder.k(argumentR);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public Builder r() {
                    return t().n(r());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public Builder n(Argument argument) {
                    if (argument == Argument.v()) {
                        return this;
                    }
                    if (argument.z()) {
                        y(argument.x());
                    }
                    if (argument.A()) {
                        x(argument.y());
                    }
                    o(m().e(argument.f145813b));
                    return this;
                }
            }

            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {

                /* renamed from: q, reason: collision with root package name */
                private static final Value f145822q;

                /* renamed from: r, reason: collision with root package name */
                public static Parser<Value> f145823r = new a();

                /* renamed from: b, reason: collision with root package name */
                private final ByteString f145824b;

                /* renamed from: c, reason: collision with root package name */
                private int f145825c;

                /* renamed from: d, reason: collision with root package name */
                private Type f145826d;

                /* renamed from: e, reason: collision with root package name */
                private long f145827e;

                /* renamed from: f, reason: collision with root package name */
                private float f145828f;

                /* renamed from: g, reason: collision with root package name */
                private double f145829g;

                /* renamed from: h, reason: collision with root package name */
                private int f145830h;

                /* renamed from: i, reason: collision with root package name */
                private int f145831i;

                /* renamed from: j, reason: collision with root package name */
                private int f145832j;

                /* renamed from: k, reason: collision with root package name */
                private Annotation f145833k;

                /* renamed from: l, reason: collision with root package name */
                private List<Value> f145834l;

                /* renamed from: m, reason: collision with root package name */
                private int f145835m;

                /* renamed from: n, reason: collision with root package name */
                private int f145836n;

                /* renamed from: o, reason: collision with root package name */
                private byte f145837o;

                /* renamed from: p, reason: collision with root package name */
                private int f145838p;

                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {

                    /* renamed from: b, reason: collision with root package name */
                    private int f145839b;

                    /* renamed from: d, reason: collision with root package name */
                    private long f145841d;

                    /* renamed from: e, reason: collision with root package name */
                    private float f145842e;

                    /* renamed from: f, reason: collision with root package name */
                    private double f145843f;

                    /* renamed from: g, reason: collision with root package name */
                    private int f145844g;

                    /* renamed from: h, reason: collision with root package name */
                    private int f145845h;

                    /* renamed from: i, reason: collision with root package name */
                    private int f145846i;

                    /* renamed from: l, reason: collision with root package name */
                    private int f145849l;

                    /* renamed from: m, reason: collision with root package name */
                    private int f145850m;

                    /* renamed from: c, reason: collision with root package name */
                    private Type f145840c = Type.BYTE;

                    /* renamed from: j, reason: collision with root package name */
                    private Annotation f145847j = Annotation.A();

                    /* renamed from: k, reason: collision with root package name */
                    private List<Value> f145848k = Collections.EMPTY_LIST;

                    private void v() {
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    /* renamed from: y, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.f145823r     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                            if (r3 == 0) goto Le
                            r2.n(r3)
                        Le:
                            return r2
                        Lf:
                            r3 = move-exception
                            goto L1b
                        L11:
                            r3 = move-exception
                            kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value) r4     // Catch: java.lang.Throwable -> Lf
                            throw r3     // Catch: java.lang.Throwable -> L19
                        L19:
                            r3 = move-exception
                            r0 = r4
                        L1b:
                            if (r0 == 0) goto L20
                            r2.n(r0)
                        L20:
                            throw r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static Builder t() {
                        return new Builder();
                    }

                    private void u() {
                        if ((this.f145839b & 256) != 256) {
                            this.f145848k = new ArrayList(this.f145848k);
                            this.f145839b |= 256;
                        }
                    }

                    public Builder A(int i10) {
                        this.f145839b |= 32;
                        this.f145845h = i10;
                        return this;
                    }

                    public Builder C(double d10) {
                        this.f145839b |= 8;
                        this.f145843f = d10;
                        return this;
                    }

                    public Builder D(int i10) {
                        this.f145839b |= 64;
                        this.f145846i = i10;
                        return this;
                    }

                    public Builder E(int i10) {
                        this.f145839b |= 1024;
                        this.f145850m = i10;
                        return this;
                    }

                    public Builder F(float f10) {
                        this.f145839b |= 4;
                        this.f145842e = f10;
                        return this;
                    }

                    public Builder G(long j10) {
                        this.f145839b |= 2;
                        this.f145841d = j10;
                        return this;
                    }

                    public Builder H(int i10) {
                        this.f145839b |= 16;
                        this.f145844g = i10;
                        return this;
                    }

                    public Value r() {
                        Value value = new Value(this);
                        int i10 = this.f145839b;
                        int i11 = (i10 & 1) != 1 ? 0 : 1;
                        value.f145826d = this.f145840c;
                        if ((i10 & 2) == 2) {
                            i11 |= 2;
                        }
                        value.f145827e = this.f145841d;
                        if ((i10 & 4) == 4) {
                            i11 |= 4;
                        }
                        value.f145828f = this.f145842e;
                        if ((i10 & 8) == 8) {
                            i11 |= 8;
                        }
                        value.f145829g = this.f145843f;
                        if ((i10 & 16) == 16) {
                            i11 |= 16;
                        }
                        value.f145830h = this.f145844g;
                        if ((i10 & 32) == 32) {
                            i11 |= 32;
                        }
                        value.f145831i = this.f145845h;
                        if ((i10 & 64) == 64) {
                            i11 |= 64;
                        }
                        value.f145832j = this.f145846i;
                        if ((i10 & 128) == 128) {
                            i11 |= 128;
                        }
                        value.f145833k = this.f145847j;
                        if ((this.f145839b & 256) == 256) {
                            this.f145848k = Collections.unmodifiableList(this.f145848k);
                            this.f145839b &= -257;
                        }
                        value.f145834l = this.f145848k;
                        if ((i10 & 512) == 512) {
                            i11 |= 256;
                        }
                        value.f145835m = this.f145849l;
                        if ((i10 & 1024) == 1024) {
                            i11 |= 512;
                        }
                        value.f145836n = this.f145850m;
                        value.f145825c = i11;
                        return value;
                    }

                    public Builder w(Annotation annotation) {
                        if ((this.f145839b & 128) != 128 || this.f145847j == Annotation.A()) {
                            this.f145847j = annotation;
                        } else {
                            this.f145847j = Annotation.F(this.f145847j).n(annotation).r();
                        }
                        this.f145839b |= 128;
                        return this;
                    }

                    public Builder z(int i10) {
                        this.f145839b |= 512;
                        this.f145849l = i10;
                        return this;
                    }

                    private Builder() {
                        v();
                    }

                    public Builder I(Type type) {
                        type.getClass();
                        this.f145839b |= 1;
                        this.f145840c = type;
                        return this;
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    /* renamed from: q, reason: merged with bridge method [inline-methods] */
                    public Value build() {
                        Value valueR = r();
                        if (valueR.a()) {
                            return valueR;
                        }
                        throw AbstractMessageLite.Builder.k(valueR);
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public Builder r() {
                        return t().n(r());
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public Builder n(Value value) {
                        if (value == Value.M()) {
                            return this;
                        }
                        if (value.d0()) {
                            I(value.T());
                        }
                        if (value.b0()) {
                            G(value.R());
                        }
                        if (value.a0()) {
                            F(value.Q());
                        }
                        if (value.X()) {
                            C(value.N());
                        }
                        if (value.c0()) {
                            H(value.S());
                        }
                        if (value.W()) {
                            A(value.L());
                        }
                        if (value.Y()) {
                            D(value.O());
                        }
                        if (value.U()) {
                            w(value.G());
                        }
                        if (!value.f145834l.isEmpty()) {
                            if (this.f145848k.isEmpty()) {
                                this.f145848k = value.f145834l;
                                this.f145839b &= -257;
                            } else {
                                u();
                                this.f145848k.addAll(value.f145834l);
                            }
                        }
                        if (value.V()) {
                            z(value.H());
                        }
                        if (value.Z()) {
                            E(value.P());
                        }
                        o(m().e(value.f145824b));
                        return this;
                    }
                }

                public enum Type implements Internal.EnumLite {
                    BYTE(0, 0),
                    CHAR(1, 1),
                    SHORT(2, 2),
                    INT(3, 3),
                    LONG(4, 4),
                    FLOAT(5, 5),
                    DOUBLE(6, 6),
                    BOOLEAN(7, 7),
                    STRING(8, 8),
                    CLASS(9, 9),
                    ENUM(10, 10),
                    ANNOTATION(11, 11),
                    ARRAY(12, 12);


                    /* renamed from: o, reason: collision with root package name */
                    private static Internal.EnumLiteMap<Type> f145864o = new a();

                    /* renamed from: a, reason: collision with root package name */
                    private final int f145866a;

                    static class a implements Internal.EnumLiteMap<Type> {
                        a() {
                        }

                        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public Type a(int i10) {
                            return Type.a(i10);
                        }
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                    public final int g() {
                        return this.f145866a;
                    }

                    Type(int i10, int i11) {
                        this.f145866a = i11;
                    }

                    public static Type a(int i10) {
                        switch (i10) {
                            case 0:
                                return BYTE;
                            case 1:
                                return CHAR;
                            case 2:
                                return SHORT;
                            case 3:
                                return INT;
                            case 4:
                                return LONG;
                            case 5:
                                return FLOAT;
                            case 6:
                                return DOUBLE;
                            case 7:
                                return BOOLEAN;
                            case 8:
                                return STRING;
                            case 9:
                                return CLASS;
                            case 10:
                                return ENUM;
                            case 11:
                                return ANNOTATION;
                            case 12:
                                return ARRAY;
                            default:
                                return null;
                        }
                    }
                }

                static class a extends AbstractParser<Value> {
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public Value c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        return new Value(codedInputStream, extensionRegistryLite);
                    }

                    a() {
                    }
                }

                static {
                    Value value = new Value(true);
                    f145822q = value;
                    value.e0();
                }

                public static Value M() {
                    return f145822q;
                }

                private void e0() {
                    this.f145826d = Type.BYTE;
                    this.f145827e = 0L;
                    this.f145828f = 0.0f;
                    this.f145829g = 0.0d;
                    this.f145830h = 0;
                    this.f145831i = 0;
                    this.f145832j = 0;
                    this.f145833k = Annotation.A();
                    this.f145834l = Collections.EMPTY_LIST;
                    this.f145835m = 0;
                    this.f145836n = 0;
                }

                public Annotation G() {
                    return this.f145833k;
                }

                public int H() {
                    return this.f145835m;
                }

                public Value I(int i10) {
                    return this.f145834l.get(i10);
                }

                public int J() {
                    return this.f145834l.size();
                }

                public List<Value> K() {
                    return this.f145834l;
                }

                public int L() {
                    return this.f145831i;
                }

                public double N() {
                    return this.f145829g;
                }

                public int O() {
                    return this.f145832j;
                }

                public int P() {
                    return this.f145836n;
                }

                public float Q() {
                    return this.f145828f;
                }

                public long R() {
                    return this.f145827e;
                }

                public int S() {
                    return this.f145830h;
                }

                public Type T() {
                    return this.f145826d;
                }

                public boolean U() {
                    return (this.f145825c & 128) == 128;
                }

                public boolean V() {
                    return (this.f145825c & 256) == 256;
                }

                public boolean W() {
                    return (this.f145825c & 32) == 32;
                }

                public boolean X() {
                    return (this.f145825c & 8) == 8;
                }

                public boolean Y() {
                    return (this.f145825c & 64) == 64;
                }

                public boolean Z() {
                    return (this.f145825c & 512) == 512;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean a() {
                    byte b10 = this.f145837o;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    if (U() && !G().a()) {
                        this.f145837o = (byte) 0;
                        return false;
                    }
                    for (int i10 = 0; i10 < J(); i10++) {
                        if (!I(i10).a()) {
                            this.f145837o = (byte) 0;
                            return false;
                        }
                    }
                    this.f145837o = (byte) 1;
                    return true;
                }

                public boolean a0() {
                    return (this.f145825c & 4) == 4;
                }

                public boolean b0() {
                    return (this.f145825c & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public int c() {
                    int i10 = this.f145838p;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iH = (this.f145825c & 1) == 1 ? CodedOutputStream.h(1, this.f145826d.g()) : 0;
                    if ((this.f145825c & 2) == 2) {
                        iH += CodedOutputStream.A(2, this.f145827e);
                    }
                    if ((this.f145825c & 4) == 4) {
                        iH += CodedOutputStream.l(3, this.f145828f);
                    }
                    if ((this.f145825c & 8) == 8) {
                        iH += CodedOutputStream.f(4, this.f145829g);
                    }
                    if ((this.f145825c & 16) == 16) {
                        iH += CodedOutputStream.o(5, this.f145830h);
                    }
                    if ((this.f145825c & 32) == 32) {
                        iH += CodedOutputStream.o(6, this.f145831i);
                    }
                    if ((this.f145825c & 64) == 64) {
                        iH += CodedOutputStream.o(7, this.f145832j);
                    }
                    if ((this.f145825c & 128) == 128) {
                        iH += CodedOutputStream.s(8, this.f145833k);
                    }
                    for (int i11 = 0; i11 < this.f145834l.size(); i11++) {
                        iH += CodedOutputStream.s(9, this.f145834l.get(i11));
                    }
                    if ((this.f145825c & 512) == 512) {
                        iH += CodedOutputStream.o(10, this.f145836n);
                    }
                    if ((this.f145825c & 256) == 256) {
                        iH += CodedOutputStream.o(11, this.f145835m);
                    }
                    int size = iH + this.f145824b.size();
                    this.f145838p = size;
                    return size;
                }

                public boolean c0() {
                    return (this.f145825c & 16) == 16;
                }

                public boolean d0() {
                    return (this.f145825c & 1) == 1;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Parser<Value> f() {
                    return f145823r;
                }

                private Value(GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.f145837o = (byte) -1;
                    this.f145838p = -1;
                    this.f145824b = builder.m();
                }

                public static Builder f0() {
                    return Builder.t();
                }

                public static Builder g0(Value value) {
                    return f0().n(value);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public void g(CodedOutputStream codedOutputStream) throws IOException {
                    c();
                    if ((this.f145825c & 1) == 1) {
                        codedOutputStream.S(1, this.f145826d.g());
                    }
                    if ((this.f145825c & 2) == 2) {
                        codedOutputStream.t0(2, this.f145827e);
                    }
                    if ((this.f145825c & 4) == 4) {
                        codedOutputStream.W(3, this.f145828f);
                    }
                    if ((this.f145825c & 8) == 8) {
                        codedOutputStream.Q(4, this.f145829g);
                    }
                    if ((this.f145825c & 16) == 16) {
                        codedOutputStream.a0(5, this.f145830h);
                    }
                    if ((this.f145825c & 32) == 32) {
                        codedOutputStream.a0(6, this.f145831i);
                    }
                    if ((this.f145825c & 64) == 64) {
                        codedOutputStream.a0(7, this.f145832j);
                    }
                    if ((this.f145825c & 128) == 128) {
                        codedOutputStream.d0(8, this.f145833k);
                    }
                    for (int i10 = 0; i10 < this.f145834l.size(); i10++) {
                        codedOutputStream.d0(9, this.f145834l.get(i10));
                    }
                    if ((this.f145825c & 512) == 512) {
                        codedOutputStream.a0(10, this.f145836n);
                    }
                    if ((this.f145825c & 256) == 256) {
                        codedOutputStream.a0(11, this.f145835m);
                    }
                    codedOutputStream.i0(this.f145824b);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                /* renamed from: h0, reason: merged with bridge method [inline-methods] */
                public Builder d() {
                    return f0();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                /* renamed from: i0, reason: merged with bridge method [inline-methods] */
                public Builder b() {
                    return g0(this);
                }

                private Value(boolean z10) {
                    this.f145837o = (byte) -1;
                    this.f145838p = -1;
                    this.f145824b = ByteString.f146726a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
                private Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    this.f145837o = (byte) -1;
                    this.f145838p = -1;
                    e0();
                    ByteString.Output outputT = ByteString.t();
                    CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
                    boolean z10 = false;
                    char c10 = 0;
                    while (true) {
                        ?? P10 = 256;
                        if (!z10) {
                            try {
                                try {
                                    int iK = codedInputStream.K();
                                    switch (iK) {
                                        case 0:
                                            z10 = true;
                                        case 8:
                                            int iN = codedInputStream.n();
                                            Type typeA = Type.a(iN);
                                            if (typeA == null) {
                                                codedOutputStreamJ.o0(iK);
                                                codedOutputStreamJ.o0(iN);
                                            } else {
                                                this.f145825c |= 1;
                                                this.f145826d = typeA;
                                            }
                                        case 16:
                                            this.f145825c |= 2;
                                            this.f145827e = codedInputStream.H();
                                        case 29:
                                            this.f145825c |= 4;
                                            this.f145828f = codedInputStream.q();
                                        case 33:
                                            this.f145825c |= 8;
                                            this.f145829g = codedInputStream.m();
                                        case 40:
                                            this.f145825c |= 16;
                                            this.f145830h = codedInputStream.s();
                                        case 48:
                                            this.f145825c |= 32;
                                            this.f145831i = codedInputStream.s();
                                        case 56:
                                            this.f145825c |= 64;
                                            this.f145832j = codedInputStream.s();
                                        case 66:
                                            Builder builderB = (this.f145825c & 128) == 128 ? this.f145833k.b() : null;
                                            Annotation annotation = (Annotation) codedInputStream.u(Annotation.f145804i, extensionRegistryLite);
                                            this.f145833k = annotation;
                                            if (builderB != null) {
                                                builderB.n(annotation);
                                                this.f145833k = builderB.r();
                                            }
                                            this.f145825c |= 128;
                                        case 74:
                                            if ((c10 & 256) != 256) {
                                                this.f145834l = new ArrayList();
                                                c10 = 256;
                                            }
                                            this.f145834l.add(codedInputStream.u(f145823r, extensionRegistryLite));
                                        case BinsView.LABEL_WIDTH_DP /* 80 */:
                                            this.f145825c |= 512;
                                            this.f145836n = codedInputStream.s();
                                        case 88:
                                            this.f145825c |= 256;
                                            this.f145835m = codedInputStream.s();
                                        default:
                                            P10 = p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK);
                                            if (P10 == 0) {
                                                z10 = true;
                                            }
                                    }
                                } catch (Throwable th2) {
                                    if ((c10 & 256) == P10) {
                                        this.f145834l = Collections.unmodifiableList(this.f145834l);
                                    }
                                    try {
                                        codedOutputStreamJ.I();
                                    } catch (IOException unused) {
                                    } catch (Throwable th3) {
                                        this.f145824b = outputT.g();
                                        throw th3;
                                    }
                                    this.f145824b = outputT.g();
                                    m();
                                    throw th2;
                                }
                            } catch (InvalidProtocolBufferException e10) {
                                throw e10.i(this);
                            } catch (IOException e11) {
                                throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                            }
                        } else {
                            if ((c10 & 256) == 256) {
                                this.f145834l = Collections.unmodifiableList(this.f145834l);
                            }
                            try {
                                codedOutputStreamJ.I();
                            } catch (IOException unused2) {
                            } catch (Throwable th4) {
                                this.f145824b = outputT.g();
                                throw th4;
                            }
                            this.f145824b = outputT.g();
                            m();
                            return;
                        }
                    }
                }
            }

            public interface ValueOrBuilder extends MessageLiteOrBuilder {
            }

            static class a extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public Argument c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }

                a() {
                }
            }

            private void B() {
                this.f145815d = 0;
                this.f145816e = Value.M();
            }

            static {
                Argument argument = new Argument(true);
                f145811h = argument;
                argument.B();
            }

            public static Argument v() {
                return f145811h;
            }

            public boolean A() {
                return (this.f145814c & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean a() {
                byte b10 = this.f145817f;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (!z()) {
                    this.f145817f = (byte) 0;
                    return false;
                }
                if (!A()) {
                    this.f145817f = (byte) 0;
                    return false;
                }
                if (y().a()) {
                    this.f145817f = (byte) 1;
                    return true;
                }
                this.f145817f = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int c() {
                int i10 = this.f145818g;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f145814c & 1) == 1 ? CodedOutputStream.o(1, this.f145815d) : 0;
                if ((this.f145814c & 2) == 2) {
                    iO += CodedOutputStream.s(2, this.f145816e);
                }
                int size = iO + this.f145813b.size();
                this.f145818g = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> f() {
                return f145812i;
            }

            public int x() {
                return this.f145815d;
            }

            public Value y() {
                return this.f145816e;
            }

            public boolean z() {
                return (this.f145814c & 1) == 1;
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f145817f = (byte) -1;
                this.f145818g = -1;
                this.f145813b = builder.m();
            }

            public static Builder C() {
                return Builder.t();
            }

            public static Builder D(Argument argument) {
                return C().n(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            public Builder d() {
                return C();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            public Builder b() {
                return D(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void g(CodedOutputStream codedOutputStream) throws IOException {
                c();
                if ((this.f145814c & 1) == 1) {
                    codedOutputStream.a0(1, this.f145815d);
                }
                if ((this.f145814c & 2) == 2) {
                    codedOutputStream.d0(2, this.f145816e);
                }
                codedOutputStream.i0(this.f145813b);
            }

            private Argument(boolean z10) {
                this.f145817f = (byte) -1;
                this.f145818g = -1;
                this.f145813b = ByteString.f146726a;
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.f145817f = (byte) -1;
                this.f145818g = -1;
                B();
                ByteString.Output outputT = ByteString.t();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = codedInputStream.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.f145814c |= 1;
                                    this.f145815d = codedInputStream.s();
                                } else if (iK != 18) {
                                    if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                    }
                                } else {
                                    Value.Builder builderB = (this.f145814c & 2) == 2 ? this.f145816e.b() : null;
                                    Value value = (Value) codedInputStream.u(Value.f145823r, extensionRegistryLite);
                                    this.f145816e = value;
                                    if (builderB != null) {
                                        builderB.n(value);
                                        this.f145816e = builderB.r();
                                    }
                                    this.f145814c |= 2;
                                }
                            }
                            z10 = true;
                        } catch (Throwable th2) {
                            try {
                                codedOutputStreamJ.I();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f145813b = outputT.g();
                                throw th3;
                            }
                            this.f145813b = outputT.g();
                            m();
                            throw th2;
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f145813b = outputT.g();
                    throw th4;
                }
                this.f145813b = outputT.g();
                m();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145867b;

            /* renamed from: c, reason: collision with root package name */
            private int f145868c;

            /* renamed from: d, reason: collision with root package name */
            private List<Argument> f145869d = Collections.EMPTY_LIST;

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.f145804i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f145867b & 2) != 2) {
                    this.f145869d = new ArrayList(this.f145869d);
                    this.f145867b |= 2;
                }
            }

            public Annotation r() {
                Annotation annotation = new Annotation(this);
                int i10 = (this.f145867b & 1) != 1 ? 0 : 1;
                annotation.f145807d = this.f145868c;
                if ((this.f145867b & 2) == 2) {
                    this.f145869d = Collections.unmodifiableList(this.f145869d);
                    this.f145867b &= -3;
                }
                annotation.f145808e = this.f145869d;
                annotation.f145806c = i10;
                return annotation;
            }

            public Builder y(int i10) {
                this.f145867b |= 1;
                this.f145868c = i10;
                return this;
            }

            private Builder() {
                v();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public Annotation build() {
                Annotation annotationR = r();
                if (annotationR.a()) {
                    return annotationR;
                }
                throw AbstractMessageLite.Builder.k(annotationR);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return t().n(r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public Builder n(Annotation annotation) {
                if (annotation == Annotation.A()) {
                    return this;
                }
                if (annotation.C()) {
                    y(annotation.B());
                }
                if (!annotation.f145808e.isEmpty()) {
                    if (this.f145869d.isEmpty()) {
                        this.f145869d = annotation.f145808e;
                        this.f145867b &= -3;
                    } else {
                        u();
                        this.f145869d.addAll(annotation.f145808e);
                    }
                }
                o(m().e(annotation.f145805b));
                return this;
            }
        }

        static class a extends AbstractParser<Annotation> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Annotation c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Annotation(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        private void D() {
            this.f145807d = 0;
            this.f145808e = Collections.EMPTY_LIST;
        }

        static {
            Annotation annotation = new Annotation(true);
            f145803h = annotation;
            annotation.D();
        }

        public static Annotation A() {
            return f145803h;
        }

        public int B() {
            return this.f145807d;
        }

        public boolean C() {
            return (this.f145806c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145809f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!C()) {
                this.f145809f = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < y(); i10++) {
                if (!x(i10).a()) {
                    this.f145809f = (byte) 0;
                    return false;
                }
            }
            this.f145809f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145810g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145806c & 1) == 1 ? CodedOutputStream.o(1, this.f145807d) : 0;
            for (int i11 = 0; i11 < this.f145808e.size(); i11++) {
                iO += CodedOutputStream.s(2, this.f145808e.get(i11));
            }
            int size = iO + this.f145805b.size();
            this.f145810g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Annotation> f() {
            return f145804i;
        }

        public Argument x(int i10) {
            return this.f145808e.get(i10);
        }

        public int y() {
            return this.f145808e.size();
        }

        public List<Argument> z() {
            return this.f145808e;
        }

        private Annotation(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145809f = (byte) -1;
            this.f145810g = -1;
            this.f145805b = builder.m();
        }

        public static Builder E() {
            return Builder.t();
        }

        public static Builder F(Annotation annotation) {
            return E().n(annotation);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return E();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return F(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            if ((this.f145806c & 1) == 1) {
                codedOutputStream.a0(1, this.f145807d);
            }
            for (int i10 = 0; i10 < this.f145808e.size(); i10++) {
                codedOutputStream.d0(2, this.f145808e.get(i10));
            }
            codedOutputStream.i0(this.f145805b);
        }

        private Annotation(boolean z10) {
            this.f145809f = (byte) -1;
            this.f145810g = -1;
            this.f145805b = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145809f = (byte) -1;
            this.f145810g = -1;
            D();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            char c10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = codedInputStream.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f145806c |= 1;
                                this.f145807d = codedInputStream.s();
                            } else if (iK != 18) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                if ((c10 & 2) != 2) {
                                    this.f145808e = new ArrayList();
                                    c10 = 2;
                                }
                                this.f145808e.add(codedInputStream.u(Argument.f145812i, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((c10 & 2) == 2) {
                            this.f145808e = Collections.unmodifiableList(this.f145808e);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145805b = outputT.g();
                            throw th3;
                        }
                        this.f145805b = outputT.g();
                        m();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            if ((c10 & 2) == 2) {
                this.f145808e = Collections.unmodifiableList(this.f145808e);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145805b = outputT.g();
                throw th4;
            }
            this.f145805b = outputT.g();
            m();
        }
    }

    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {

        /* renamed from: L, reason: collision with root package name */
        private static final Class f145870L;

        /* renamed from: M, reason: collision with root package name */
        public static Parser<Class> f145871M = new a();

        /* renamed from: A, reason: collision with root package name */
        private List<Integer> f145872A;

        /* renamed from: B, reason: collision with root package name */
        private int f145873B;

        /* renamed from: C, reason: collision with root package name */
        private List<Type> f145874C;

        /* renamed from: D, reason: collision with root package name */
        private List<Integer> f145875D;

        /* renamed from: E, reason: collision with root package name */
        private int f145876E;

        /* renamed from: F, reason: collision with root package name */
        private TypeTable f145877F;

        /* renamed from: G, reason: collision with root package name */
        private List<Integer> f145878G;

        /* renamed from: H, reason: collision with root package name */
        private VersionRequirementTable f145879H;

        /* renamed from: I, reason: collision with root package name */
        private List<CompilerPluginData> f145880I;

        /* renamed from: J, reason: collision with root package name */
        private byte f145881J;

        /* renamed from: K, reason: collision with root package name */
        private int f145882K;

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f145883c;

        /* renamed from: d, reason: collision with root package name */
        private int f145884d;

        /* renamed from: e, reason: collision with root package name */
        private int f145885e;

        /* renamed from: f, reason: collision with root package name */
        private int f145886f;

        /* renamed from: g, reason: collision with root package name */
        private int f145887g;

        /* renamed from: h, reason: collision with root package name */
        private List<TypeParameter> f145888h;

        /* renamed from: i, reason: collision with root package name */
        private List<Type> f145889i;

        /* renamed from: j, reason: collision with root package name */
        private List<Integer> f145890j;

        /* renamed from: k, reason: collision with root package name */
        private int f145891k;

        /* renamed from: l, reason: collision with root package name */
        private List<Integer> f145892l;

        /* renamed from: m, reason: collision with root package name */
        private int f145893m;

        /* renamed from: n, reason: collision with root package name */
        private List<Type> f145894n;

        /* renamed from: o, reason: collision with root package name */
        private List<Integer> f145895o;

        /* renamed from: p, reason: collision with root package name */
        private int f145896p;

        /* renamed from: q, reason: collision with root package name */
        private List<Constructor> f145897q;

        /* renamed from: r, reason: collision with root package name */
        private List<Function> f145898r;

        /* renamed from: s, reason: collision with root package name */
        private List<Property> f145899s;

        /* renamed from: t, reason: collision with root package name */
        private List<TypeAlias> f145900t;

        /* renamed from: u, reason: collision with root package name */
        private List<EnumEntry> f145901u;

        /* renamed from: v, reason: collision with root package name */
        private List<Integer> f145902v;

        /* renamed from: w, reason: collision with root package name */
        private int f145903w;

        /* renamed from: x, reason: collision with root package name */
        private int f145904x;

        /* renamed from: y, reason: collision with root package name */
        private Type f145905y;

        /* renamed from: z, reason: collision with root package name */
        private int f145906z;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {

            /* renamed from: A, reason: collision with root package name */
            private List<Integer> f145907A;

            /* renamed from: B, reason: collision with root package name */
            private VersionRequirementTable f145908B;

            /* renamed from: C, reason: collision with root package name */
            private List<CompilerPluginData> f145909C;

            /* renamed from: d, reason: collision with root package name */
            private int f145910d;

            /* renamed from: e, reason: collision with root package name */
            private int f145911e = 6;

            /* renamed from: f, reason: collision with root package name */
            private int f145912f;

            /* renamed from: g, reason: collision with root package name */
            private int f145913g;

            /* renamed from: h, reason: collision with root package name */
            private List<TypeParameter> f145914h;

            /* renamed from: i, reason: collision with root package name */
            private List<Type> f145915i;

            /* renamed from: j, reason: collision with root package name */
            private List<Integer> f145916j;

            /* renamed from: k, reason: collision with root package name */
            private List<Integer> f145917k;

            /* renamed from: l, reason: collision with root package name */
            private List<Type> f145918l;

            /* renamed from: m, reason: collision with root package name */
            private List<Integer> f145919m;

            /* renamed from: n, reason: collision with root package name */
            private List<Constructor> f145920n;

            /* renamed from: o, reason: collision with root package name */
            private List<Function> f145921o;

            /* renamed from: p, reason: collision with root package name */
            private List<Property> f145922p;

            /* renamed from: q, reason: collision with root package name */
            private List<TypeAlias> f145923q;

            /* renamed from: r, reason: collision with root package name */
            private List<EnumEntry> f145924r;

            /* renamed from: s, reason: collision with root package name */
            private List<Integer> f145925s;

            /* renamed from: t, reason: collision with root package name */
            private int f145926t;

            /* renamed from: u, reason: collision with root package name */
            private Type f145927u;

            /* renamed from: v, reason: collision with root package name */
            private int f145928v;

            /* renamed from: w, reason: collision with root package name */
            private List<Integer> f145929w;

            /* renamed from: x, reason: collision with root package name */
            private List<Type> f145930x;

            /* renamed from: y, reason: collision with root package name */
            private List<Integer> f145931y;

            /* renamed from: z, reason: collision with root package name */
            private TypeTable f145932z;

            private void R() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: U, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.f145871M     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Builder");
            }

            private void A() {
                if ((this.f145910d & 512) != 512) {
                    this.f145920n = new ArrayList(this.f145920n);
                    this.f145910d |= 512;
                }
            }

            private void C() {
                if ((this.f145910d & 256) != 256) {
                    this.f145919m = new ArrayList(this.f145919m);
                    this.f145910d |= 256;
                }
            }

            private void D() {
                if ((this.f145910d & 128) != 128) {
                    this.f145918l = new ArrayList(this.f145918l);
                    this.f145910d |= 128;
                }
            }

            private void E() {
                if ((this.f145910d & 8192) != 8192) {
                    this.f145924r = new ArrayList(this.f145924r);
                    this.f145910d |= 8192;
                }
            }

            private void F() {
                if ((this.f145910d & 1024) != 1024) {
                    this.f145921o = new ArrayList(this.f145921o);
                    this.f145910d |= 1024;
                }
            }

            private void G() {
                if ((this.f145910d & 262144) != 262144) {
                    this.f145929w = new ArrayList(this.f145929w);
                    this.f145910d |= 262144;
                }
            }

            private void H() {
                if ((this.f145910d & 1048576) != 1048576) {
                    this.f145931y = new ArrayList(this.f145931y);
                    this.f145910d |= 1048576;
                }
            }

            private void I() {
                if ((this.f145910d & 524288) != 524288) {
                    this.f145930x = new ArrayList(this.f145930x);
                    this.f145910d |= 524288;
                }
            }

            private void J() {
                if ((this.f145910d & 64) != 64) {
                    this.f145917k = new ArrayList(this.f145917k);
                    this.f145910d |= 64;
                }
            }

            private void K() {
                if ((this.f145910d & RecyclerView.m.FLAG_MOVED) != 2048) {
                    this.f145922p = new ArrayList(this.f145922p);
                    this.f145910d |= RecyclerView.m.FLAG_MOVED;
                }
            }

            private void L() {
                if ((this.f145910d & 16384) != 16384) {
                    this.f145925s = new ArrayList(this.f145925s);
                    this.f145910d |= 16384;
                }
            }

            private void M() {
                if ((this.f145910d & 32) != 32) {
                    this.f145916j = new ArrayList(this.f145916j);
                    this.f145910d |= 32;
                }
            }

            private void N() {
                if ((this.f145910d & 16) != 16) {
                    this.f145915i = new ArrayList(this.f145915i);
                    this.f145910d |= 16;
                }
            }

            private void O() {
                if ((this.f145910d & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                    this.f145923q = new ArrayList(this.f145923q);
                    this.f145910d |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                }
            }

            private void P() {
                if ((this.f145910d & 8) != 8) {
                    this.f145914h = new ArrayList(this.f145914h);
                    this.f145910d |= 8;
                }
            }

            private void Q() {
                if ((this.f145910d & 4194304) != 4194304) {
                    this.f145907A = new ArrayList(this.f145907A);
                    this.f145910d |= 4194304;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f145910d & 16777216) != 16777216) {
                    this.f145909C = new ArrayList(this.f145909C);
                    this.f145910d |= 16777216;
                }
            }

            public Builder V(Type type) {
                if ((this.f145910d & 65536) != 65536 || this.f145927u == Type.Y()) {
                    this.f145927u = type;
                } else {
                    this.f145927u = Type.A0(this.f145927u).n(type).w();
                }
                this.f145910d |= 65536;
                return this;
            }

            public Builder W(TypeTable typeTable) {
                if ((this.f145910d & 2097152) != 2097152 || this.f145932z == TypeTable.x()) {
                    this.f145932z = typeTable;
                } else {
                    this.f145932z = TypeTable.F(this.f145932z).n(typeTable).r();
                }
                this.f145910d |= 2097152;
                return this;
            }

            public Builder X(VersionRequirementTable versionRequirementTable) {
                if ((this.f145910d & 8388608) != 8388608 || this.f145908B == VersionRequirementTable.u()) {
                    this.f145908B = versionRequirementTable;
                } else {
                    this.f145908B = VersionRequirementTable.A(this.f145908B).n(versionRequirementTable).r();
                }
                this.f145910d |= 8388608;
                return this;
            }

            public Builder Y(int i10) {
                this.f145910d |= 4;
                this.f145913g = i10;
                return this;
            }

            public Builder Z(int i10) {
                this.f145910d |= 1;
                this.f145911e = i10;
                return this;
            }

            public Builder a0(int i10) {
                this.f145910d |= 2;
                this.f145912f = i10;
                return this;
            }

            public Builder c0(int i10) {
                this.f145910d |= 32768;
                this.f145926t = i10;
                return this;
            }

            public Builder d0(int i10) {
                this.f145910d |= 131072;
                this.f145928v = i10;
                return this;
            }

            public Class w() {
                Class r02 = new Class(this);
                int i10 = this.f145910d;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                r02.f145885e = this.f145911e;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                r02.f145886f = this.f145912f;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                r02.f145887g = this.f145913g;
                if ((this.f145910d & 8) == 8) {
                    this.f145914h = Collections.unmodifiableList(this.f145914h);
                    this.f145910d &= -9;
                }
                r02.f145888h = this.f145914h;
                if ((this.f145910d & 16) == 16) {
                    this.f145915i = Collections.unmodifiableList(this.f145915i);
                    this.f145910d &= -17;
                }
                r02.f145889i = this.f145915i;
                if ((this.f145910d & 32) == 32) {
                    this.f145916j = Collections.unmodifiableList(this.f145916j);
                    this.f145910d &= -33;
                }
                r02.f145890j = this.f145916j;
                if ((this.f145910d & 64) == 64) {
                    this.f145917k = Collections.unmodifiableList(this.f145917k);
                    this.f145910d &= -65;
                }
                r02.f145892l = this.f145917k;
                if ((this.f145910d & 128) == 128) {
                    this.f145918l = Collections.unmodifiableList(this.f145918l);
                    this.f145910d &= -129;
                }
                r02.f145894n = this.f145918l;
                if ((this.f145910d & 256) == 256) {
                    this.f145919m = Collections.unmodifiableList(this.f145919m);
                    this.f145910d &= -257;
                }
                r02.f145895o = this.f145919m;
                if ((this.f145910d & 512) == 512) {
                    this.f145920n = Collections.unmodifiableList(this.f145920n);
                    this.f145910d &= -513;
                }
                r02.f145897q = this.f145920n;
                if ((this.f145910d & 1024) == 1024) {
                    this.f145921o = Collections.unmodifiableList(this.f145921o);
                    this.f145910d &= -1025;
                }
                r02.f145898r = this.f145921o;
                if ((this.f145910d & RecyclerView.m.FLAG_MOVED) == 2048) {
                    this.f145922p = Collections.unmodifiableList(this.f145922p);
                    this.f145910d &= -2049;
                }
                r02.f145899s = this.f145922p;
                if ((this.f145910d & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    this.f145923q = Collections.unmodifiableList(this.f145923q);
                    this.f145910d &= -4097;
                }
                r02.f145900t = this.f145923q;
                if ((this.f145910d & 8192) == 8192) {
                    this.f145924r = Collections.unmodifiableList(this.f145924r);
                    this.f145910d &= -8193;
                }
                r02.f145901u = this.f145924r;
                if ((this.f145910d & 16384) == 16384) {
                    this.f145925s = Collections.unmodifiableList(this.f145925s);
                    this.f145910d &= -16385;
                }
                r02.f145902v = this.f145925s;
                if ((i10 & 32768) == 32768) {
                    i11 |= 8;
                }
                r02.f145904x = this.f145926t;
                if ((i10 & 65536) == 65536) {
                    i11 |= 16;
                }
                r02.f145905y = this.f145927u;
                if ((i10 & 131072) == 131072) {
                    i11 |= 32;
                }
                r02.f145906z = this.f145928v;
                if ((this.f145910d & 262144) == 262144) {
                    this.f145929w = Collections.unmodifiableList(this.f145929w);
                    this.f145910d &= -262145;
                }
                r02.f145872A = this.f145929w;
                if ((this.f145910d & 524288) == 524288) {
                    this.f145930x = Collections.unmodifiableList(this.f145930x);
                    this.f145910d &= -524289;
                }
                r02.f145874C = this.f145930x;
                if ((this.f145910d & 1048576) == 1048576) {
                    this.f145931y = Collections.unmodifiableList(this.f145931y);
                    this.f145910d &= -1048577;
                }
                r02.f145875D = this.f145931y;
                if ((i10 & 2097152) == 2097152) {
                    i11 |= 64;
                }
                r02.f145877F = this.f145932z;
                if ((this.f145910d & 4194304) == 4194304) {
                    this.f145907A = Collections.unmodifiableList(this.f145907A);
                    this.f145910d &= -4194305;
                }
                r02.f145878G = this.f145907A;
                if ((i10 & 8388608) == 8388608) {
                    i11 |= 128;
                }
                r02.f145879H = this.f145908B;
                if ((this.f145910d & 16777216) == 16777216) {
                    this.f145909C = Collections.unmodifiableList(this.f145909C);
                    this.f145910d &= -16777217;
                }
                r02.f145880I = this.f145909C;
                r02.f145884d = i11;
                return r02;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f145914h = list;
                this.f145915i = list;
                this.f145916j = list;
                this.f145917k = list;
                this.f145918l = list;
                this.f145919m = list;
                this.f145920n = list;
                this.f145921o = list;
                this.f145922p = list;
                this.f145923q = list;
                this.f145924r = list;
                this.f145925s = list;
                this.f145927u = Type.Y();
                this.f145929w = list;
                this.f145930x = list;
                this.f145931y = list;
                this.f145932z = TypeTable.x();
                this.f145907A = list;
                this.f145908B = VersionRequirementTable.u();
                this.f145909C = list;
                R();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: S, reason: merged with bridge method [inline-methods] */
            public Builder n(Class r32) {
                if (r32 == Class.E0()) {
                    return this;
                }
                if (r32.r1()) {
                    Z(r32.J0());
                }
                if (r32.s1()) {
                    a0(r32.K0());
                }
                if (r32.q1()) {
                    Y(r32.u0());
                }
                if (!r32.f145888h.isEmpty()) {
                    if (this.f145914h.isEmpty()) {
                        this.f145914h = r32.f145888h;
                        this.f145910d &= -9;
                    } else {
                        P();
                        this.f145914h.addAll(r32.f145888h);
                    }
                }
                if (!r32.f145889i.isEmpty()) {
                    if (this.f145915i.isEmpty()) {
                        this.f145915i = r32.f145889i;
                        this.f145910d &= -17;
                    } else {
                        N();
                        this.f145915i.addAll(r32.f145889i);
                    }
                }
                if (!r32.f145890j.isEmpty()) {
                    if (this.f145916j.isEmpty()) {
                        this.f145916j = r32.f145890j;
                        this.f145910d &= -33;
                    } else {
                        M();
                        this.f145916j.addAll(r32.f145890j);
                    }
                }
                if (!r32.f145892l.isEmpty()) {
                    if (this.f145917k.isEmpty()) {
                        this.f145917k = r32.f145892l;
                        this.f145910d &= -65;
                    } else {
                        J();
                        this.f145917k.addAll(r32.f145892l);
                    }
                }
                if (!r32.f145894n.isEmpty()) {
                    if (this.f145918l.isEmpty()) {
                        this.f145918l = r32.f145894n;
                        this.f145910d &= -129;
                    } else {
                        D();
                        this.f145918l.addAll(r32.f145894n);
                    }
                }
                if (!r32.f145895o.isEmpty()) {
                    if (this.f145919m.isEmpty()) {
                        this.f145919m = r32.f145895o;
                        this.f145910d &= -257;
                    } else {
                        C();
                        this.f145919m.addAll(r32.f145895o);
                    }
                }
                if (!r32.f145897q.isEmpty()) {
                    if (this.f145920n.isEmpty()) {
                        this.f145920n = r32.f145897q;
                        this.f145910d &= -513;
                    } else {
                        A();
                        this.f145920n.addAll(r32.f145897q);
                    }
                }
                if (!r32.f145898r.isEmpty()) {
                    if (this.f145921o.isEmpty()) {
                        this.f145921o = r32.f145898r;
                        this.f145910d &= -1025;
                    } else {
                        F();
                        this.f145921o.addAll(r32.f145898r);
                    }
                }
                if (!r32.f145899s.isEmpty()) {
                    if (this.f145922p.isEmpty()) {
                        this.f145922p = r32.f145899s;
                        this.f145910d &= -2049;
                    } else {
                        K();
                        this.f145922p.addAll(r32.f145899s);
                    }
                }
                if (!r32.f145900t.isEmpty()) {
                    if (this.f145923q.isEmpty()) {
                        this.f145923q = r32.f145900t;
                        this.f145910d &= -4097;
                    } else {
                        O();
                        this.f145923q.addAll(r32.f145900t);
                    }
                }
                if (!r32.f145901u.isEmpty()) {
                    if (this.f145924r.isEmpty()) {
                        this.f145924r = r32.f145901u;
                        this.f145910d &= -8193;
                    } else {
                        E();
                        this.f145924r.addAll(r32.f145901u);
                    }
                }
                if (!r32.f145902v.isEmpty()) {
                    if (this.f145925s.isEmpty()) {
                        this.f145925s = r32.f145902v;
                        this.f145910d &= -16385;
                    } else {
                        L();
                        this.f145925s.addAll(r32.f145902v);
                    }
                }
                if (r32.t1()) {
                    c0(r32.O0());
                }
                if (r32.u1()) {
                    V(r32.P0());
                }
                if (r32.v1()) {
                    d0(r32.Q0());
                }
                if (!r32.f145872A.isEmpty()) {
                    if (this.f145929w.isEmpty()) {
                        this.f145929w = r32.f145872A;
                        this.f145910d &= -262145;
                    } else {
                        G();
                        this.f145929w.addAll(r32.f145872A);
                    }
                }
                if (!r32.f145874C.isEmpty()) {
                    if (this.f145930x.isEmpty()) {
                        this.f145930x = r32.f145874C;
                        this.f145910d &= -524289;
                    } else {
                        I();
                        this.f145930x.addAll(r32.f145874C);
                    }
                }
                if (!r32.f145875D.isEmpty()) {
                    if (this.f145931y.isEmpty()) {
                        this.f145931y = r32.f145875D;
                        this.f145910d &= -1048577;
                    } else {
                        H();
                        this.f145931y.addAll(r32.f145875D);
                    }
                }
                if (r32.w1()) {
                    W(r32.n1());
                }
                if (!r32.f145878G.isEmpty()) {
                    if (this.f145907A.isEmpty()) {
                        this.f145907A = r32.f145878G;
                        this.f145910d &= -4194305;
                    } else {
                        Q();
                        this.f145907A.addAll(r32.f145878G);
                    }
                }
                if (r32.x1()) {
                    X(r32.p1());
                }
                if (!r32.f145880I.isEmpty()) {
                    if (this.f145909C.isEmpty()) {
                        this.f145909C = r32.f145880I;
                        this.f145910d &= -16777217;
                    } else {
                        z();
                        this.f145909C.addAll(r32.f145880I);
                    }
                }
                t(r32);
                o(m().e(r32.f145883c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public Class build() {
                Class classW = w();
                if (classW.a()) {
                    return classW;
                }
                throw AbstractMessageLite.Builder.k(classW);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder r() {
                return y().n(w());
            }
        }

        public enum Kind implements Internal.EnumLite {
            CLASS(0, 0),
            INTERFACE(1, 1),
            ENUM_CLASS(2, 2),
            ENUM_ENTRY(3, 3),
            ANNOTATION_CLASS(4, 4),
            OBJECT(5, 5),
            COMPANION_OBJECT(6, 6);


            /* renamed from: i, reason: collision with root package name */
            private static Internal.EnumLiteMap<Kind> f145940i = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f145942a;

            static class a implements Internal.EnumLiteMap<Kind> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public Kind a(int i10) {
                    return Kind.a(i10);
                }
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int g() {
                return this.f145942a;
            }

            Kind(int i10, int i11) {
                this.f145942a = i11;
            }

            public static Kind a(int i10) {
                switch (i10) {
                    case 0:
                        return CLASS;
                    case 1:
                        return INTERFACE;
                    case 2:
                        return ENUM_CLASS;
                    case 3:
                        return ENUM_ENTRY;
                    case 4:
                        return ANNOTATION_CLASS;
                    case 5:
                        return OBJECT;
                    case 6:
                        return COMPANION_OBJECT;
                    default:
                        return null;
                }
            }
        }

        static class a extends AbstractParser<Class> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Class c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Class(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        private void y1() {
            this.f145885e = 6;
            this.f145886f = 0;
            this.f145887g = 0;
            List list = Collections.EMPTY_LIST;
            this.f145888h = list;
            this.f145889i = list;
            this.f145890j = list;
            this.f145892l = list;
            this.f145894n = list;
            this.f145895o = list;
            this.f145897q = list;
            this.f145898r = list;
            this.f145899s = list;
            this.f145900t = list;
            this.f145901u = list;
            this.f145902v = list;
            this.f145904x = 0;
            this.f145905y = Type.Y();
            this.f145906z = 0;
            this.f145872A = list;
            this.f145874C = list;
            this.f145875D = list;
            this.f145877F = TypeTable.x();
            this.f145878G = list;
            this.f145879H = VersionRequirementTable.u();
            this.f145880I = list;
        }

        static {
            Class r02 = new Class(true);
            f145870L = r02;
            r02.y1();
        }

        public static Class C1(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return f145871M.a(inputStream, extensionRegistryLite);
        }

        public static Class E0() {
            return f145870L;
        }

        public Type A0(int i10) {
            return this.f145894n.get(i10);
        }

        public int B0() {
            return this.f145894n.size();
        }

        public List<Integer> C0() {
            return this.f145895o;
        }

        public List<Type> D0() {
            return this.f145894n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: F0, reason: merged with bridge method [inline-methods] */
        public Class e() {
            return f145870L;
        }

        public EnumEntry G0(int i10) {
            return this.f145901u.get(i10);
        }

        public int H0() {
            return this.f145901u.size();
        }

        public List<EnumEntry> I0() {
            return this.f145901u;
        }

        public int J0() {
            return this.f145885e;
        }

        public int K0() {
            return this.f145886f;
        }

        public Function L0(int i10) {
            return this.f145898r.get(i10);
        }

        public int M0() {
            return this.f145898r.size();
        }

        public List<Function> N0() {
            return this.f145898r;
        }

        public int O0() {
            return this.f145904x;
        }

        public Type P0() {
            return this.f145905y;
        }

        public int Q0() {
            return this.f145906z;
        }

        public int R0() {
            return this.f145872A.size();
        }

        public List<Integer> S0() {
            return this.f145872A;
        }

        public Type T0(int i10) {
            return this.f145874C.get(i10);
        }

        public int U0() {
            return this.f145874C.size();
        }

        public int V0() {
            return this.f145875D.size();
        }

        public List<Integer> W0() {
            return this.f145875D;
        }

        public List<Type> X0() {
            return this.f145874C;
        }

        public List<Integer> Y0() {
            return this.f145892l;
        }

        public Property Z0(int i10) {
            return this.f145899s.get(i10);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145881J;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!s1()) {
                this.f145881J = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < l1(); i10++) {
                if (!k1(i10).a()) {
                    this.f145881J = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < e1(); i11++) {
                if (!d1(i11).a()) {
                    this.f145881J = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < B0(); i12++) {
                if (!A0(i12).a()) {
                    this.f145881J = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < y0(); i13++) {
                if (!x0(i13).a()) {
                    this.f145881J = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < M0(); i14++) {
                if (!L0(i14).a()) {
                    this.f145881J = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < a1(); i15++) {
                if (!Z0(i15).a()) {
                    this.f145881J = (byte) 0;
                    return false;
                }
            }
            for (int i16 = 0; i16 < i1(); i16++) {
                if (!h1(i16).a()) {
                    this.f145881J = (byte) 0;
                    return false;
                }
            }
            for (int i17 = 0; i17 < H0(); i17++) {
                if (!G0(i17).a()) {
                    this.f145881J = (byte) 0;
                    return false;
                }
            }
            if (u1() && !P0().a()) {
                this.f145881J = (byte) 0;
                return false;
            }
            for (int i18 = 0; i18 < U0(); i18++) {
                if (!T0(i18).a()) {
                    this.f145881J = (byte) 0;
                    return false;
                }
            }
            if (w1() && !n1().a()) {
                this.f145881J = (byte) 0;
                return false;
            }
            for (int i19 = 0; i19 < w0(); i19++) {
                if (!v0(i19).a()) {
                    this.f145881J = (byte) 0;
                    return false;
                }
            }
            if (s()) {
                this.f145881J = (byte) 1;
                return true;
            }
            this.f145881J = (byte) 0;
            return false;
        }

        public int a1() {
            return this.f145899s.size();
        }

        public List<Property> b1() {
            return this.f145899s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145882K;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145884d & 1) == 1 ? CodedOutputStream.o(1, this.f145885e) : 0;
            int iP = 0;
            for (int i11 = 0; i11 < this.f145890j.size(); i11++) {
                iP += CodedOutputStream.p(this.f145890j.get(i11).intValue());
            }
            int iS = iO + iP;
            if (!f1().isEmpty()) {
                iS = iS + 1 + CodedOutputStream.p(iP);
            }
            this.f145891k = iP;
            if ((this.f145884d & 2) == 2) {
                iS += CodedOutputStream.o(3, this.f145886f);
            }
            if ((this.f145884d & 4) == 4) {
                iS += CodedOutputStream.o(4, this.f145887g);
            }
            for (int i12 = 0; i12 < this.f145888h.size(); i12++) {
                iS += CodedOutputStream.s(5, this.f145888h.get(i12));
            }
            for (int i13 = 0; i13 < this.f145889i.size(); i13++) {
                iS += CodedOutputStream.s(6, this.f145889i.get(i13));
            }
            int iP2 = 0;
            for (int i14 = 0; i14 < this.f145892l.size(); i14++) {
                iP2 += CodedOutputStream.p(this.f145892l.get(i14).intValue());
            }
            int iS2 = iS + iP2;
            if (!Y0().isEmpty()) {
                iS2 = iS2 + 1 + CodedOutputStream.p(iP2);
            }
            this.f145893m = iP2;
            for (int i15 = 0; i15 < this.f145897q.size(); i15++) {
                iS2 += CodedOutputStream.s(8, this.f145897q.get(i15));
            }
            for (int i16 = 0; i16 < this.f145898r.size(); i16++) {
                iS2 += CodedOutputStream.s(9, this.f145898r.get(i16));
            }
            for (int i17 = 0; i17 < this.f145899s.size(); i17++) {
                iS2 += CodedOutputStream.s(10, this.f145899s.get(i17));
            }
            for (int i18 = 0; i18 < this.f145900t.size(); i18++) {
                iS2 += CodedOutputStream.s(11, this.f145900t.get(i18));
            }
            for (int i19 = 0; i19 < this.f145901u.size(); i19++) {
                iS2 += CodedOutputStream.s(13, this.f145901u.get(i19));
            }
            int iP3 = 0;
            for (int i20 = 0; i20 < this.f145902v.size(); i20++) {
                iP3 += CodedOutputStream.p(this.f145902v.get(i20).intValue());
            }
            int iS3 = iS2 + iP3;
            if (!c1().isEmpty()) {
                iS3 = iS3 + 2 + CodedOutputStream.p(iP3);
            }
            this.f145903w = iP3;
            if ((this.f145884d & 8) == 8) {
                iS3 += CodedOutputStream.o(17, this.f145904x);
            }
            if ((this.f145884d & 16) == 16) {
                iS3 += CodedOutputStream.s(18, this.f145905y);
            }
            if ((this.f145884d & 32) == 32) {
                iS3 += CodedOutputStream.o(19, this.f145906z);
            }
            for (int i21 = 0; i21 < this.f145894n.size(); i21++) {
                iS3 += CodedOutputStream.s(20, this.f145894n.get(i21));
            }
            int iP4 = 0;
            for (int i22 = 0; i22 < this.f145895o.size(); i22++) {
                iP4 += CodedOutputStream.p(this.f145895o.get(i22).intValue());
            }
            int iP5 = iS3 + iP4;
            if (!C0().isEmpty()) {
                iP5 = iP5 + 2 + CodedOutputStream.p(iP4);
            }
            this.f145896p = iP4;
            int iP6 = 0;
            for (int i23 = 0; i23 < this.f145872A.size(); i23++) {
                iP6 += CodedOutputStream.p(this.f145872A.get(i23).intValue());
            }
            int iS4 = iP5 + iP6;
            if (!S0().isEmpty()) {
                iS4 = iS4 + 2 + CodedOutputStream.p(iP6);
            }
            this.f145873B = iP6;
            for (int i24 = 0; i24 < this.f145874C.size(); i24++) {
                iS4 += CodedOutputStream.s(23, this.f145874C.get(i24));
            }
            int iP7 = 0;
            for (int i25 = 0; i25 < this.f145875D.size(); i25++) {
                iP7 += CodedOutputStream.p(this.f145875D.get(i25).intValue());
            }
            int iS5 = iS4 + iP7;
            if (!W0().isEmpty()) {
                iS5 = iS5 + 2 + CodedOutputStream.p(iP7);
            }
            this.f145876E = iP7;
            if ((this.f145884d & 64) == 64) {
                iS5 += CodedOutputStream.s(30, this.f145877F);
            }
            int iP8 = 0;
            for (int i26 = 0; i26 < this.f145878G.size(); i26++) {
                iP8 += CodedOutputStream.p(this.f145878G.get(i26).intValue());
            }
            int size = iS5 + iP8 + (o1().size() * 2);
            if ((this.f145884d & 128) == 128) {
                size += CodedOutputStream.s(32, this.f145879H);
            }
            for (int i27 = 0; i27 < this.f145880I.size(); i27++) {
                size += CodedOutputStream.s(33, this.f145880I.get(i27));
            }
            int iT = size + t() + this.f145883c.size();
            this.f145882K = iT;
            return iT;
        }

        public List<Integer> c1() {
            return this.f145902v;
        }

        public Type d1(int i10) {
            return this.f145889i.get(i10);
        }

        public int e1() {
            return this.f145889i.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Class> f() {
            return f145871M;
        }

        public List<Integer> f1() {
            return this.f145890j;
        }

        public List<Type> g1() {
            return this.f145889i;
        }

        public TypeAlias h1(int i10) {
            return this.f145900t.get(i10);
        }

        public int i1() {
            return this.f145900t.size();
        }

        public List<TypeAlias> j1() {
            return this.f145900t;
        }

        public TypeParameter k1(int i10) {
            return this.f145888h.get(i10);
        }

        public int l1() {
            return this.f145888h.size();
        }

        public List<TypeParameter> m1() {
            return this.f145888h;
        }

        public TypeTable n1() {
            return this.f145877F;
        }

        public List<Integer> o1() {
            return this.f145878G;
        }

        public VersionRequirementTable p1() {
            return this.f145879H;
        }

        public boolean q1() {
            return (this.f145884d & 4) == 4;
        }

        public boolean r1() {
            return (this.f145884d & 1) == 1;
        }

        public boolean s1() {
            return (this.f145884d & 2) == 2;
        }

        public boolean t1() {
            return (this.f145884d & 8) == 8;
        }

        public int u0() {
            return this.f145887g;
        }

        public boolean u1() {
            return (this.f145884d & 16) == 16;
        }

        public CompilerPluginData v0(int i10) {
            return this.f145880I.get(i10);
        }

        public boolean v1() {
            return (this.f145884d & 32) == 32;
        }

        public int w0() {
            return this.f145880I.size();
        }

        public boolean w1() {
            return (this.f145884d & 64) == 64;
        }

        public Constructor x0(int i10) {
            return this.f145897q.get(i10);
        }

        public boolean x1() {
            return (this.f145884d & 128) == 128;
        }

        public int y0() {
            return this.f145897q.size();
        }

        public List<Constructor> z0() {
            return this.f145897q;
        }

        private Class(GeneratedMessageLite.ExtendableBuilder<Class, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f145891k = -1;
            this.f145893m = -1;
            this.f145896p = -1;
            this.f145903w = -1;
            this.f145873B = -1;
            this.f145876E = -1;
            this.f145881J = (byte) -1;
            this.f145882K = -1;
            this.f145883c = extendableBuilder.m();
        }

        public static Builder A1(Class r12) {
            return z1().n(r12);
        }

        public static Builder z1() {
            return Builder.y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: B1, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return z1();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: D1, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return A1(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterZ = z();
            if ((this.f145884d & 1) == 1) {
                codedOutputStream.a0(1, this.f145885e);
            }
            if (f1().size() > 0) {
                codedOutputStream.o0(18);
                codedOutputStream.o0(this.f145891k);
            }
            for (int i10 = 0; i10 < this.f145890j.size(); i10++) {
                codedOutputStream.b0(this.f145890j.get(i10).intValue());
            }
            if ((this.f145884d & 2) == 2) {
                codedOutputStream.a0(3, this.f145886f);
            }
            if ((this.f145884d & 4) == 4) {
                codedOutputStream.a0(4, this.f145887g);
            }
            for (int i11 = 0; i11 < this.f145888h.size(); i11++) {
                codedOutputStream.d0(5, this.f145888h.get(i11));
            }
            for (int i12 = 0; i12 < this.f145889i.size(); i12++) {
                codedOutputStream.d0(6, this.f145889i.get(i12));
            }
            if (Y0().size() > 0) {
                codedOutputStream.o0(58);
                codedOutputStream.o0(this.f145893m);
            }
            for (int i13 = 0; i13 < this.f145892l.size(); i13++) {
                codedOutputStream.b0(this.f145892l.get(i13).intValue());
            }
            for (int i14 = 0; i14 < this.f145897q.size(); i14++) {
                codedOutputStream.d0(8, this.f145897q.get(i14));
            }
            for (int i15 = 0; i15 < this.f145898r.size(); i15++) {
                codedOutputStream.d0(9, this.f145898r.get(i15));
            }
            for (int i16 = 0; i16 < this.f145899s.size(); i16++) {
                codedOutputStream.d0(10, this.f145899s.get(i16));
            }
            for (int i17 = 0; i17 < this.f145900t.size(); i17++) {
                codedOutputStream.d0(11, this.f145900t.get(i17));
            }
            for (int i18 = 0; i18 < this.f145901u.size(); i18++) {
                codedOutputStream.d0(13, this.f145901u.get(i18));
            }
            if (c1().size() > 0) {
                codedOutputStream.o0(130);
                codedOutputStream.o0(this.f145903w);
            }
            for (int i19 = 0; i19 < this.f145902v.size(); i19++) {
                codedOutputStream.b0(this.f145902v.get(i19).intValue());
            }
            if ((this.f145884d & 8) == 8) {
                codedOutputStream.a0(17, this.f145904x);
            }
            if ((this.f145884d & 16) == 16) {
                codedOutputStream.d0(18, this.f145905y);
            }
            if ((this.f145884d & 32) == 32) {
                codedOutputStream.a0(19, this.f145906z);
            }
            for (int i20 = 0; i20 < this.f145894n.size(); i20++) {
                codedOutputStream.d0(20, this.f145894n.get(i20));
            }
            if (C0().size() > 0) {
                codedOutputStream.o0(170);
                codedOutputStream.o0(this.f145896p);
            }
            for (int i21 = 0; i21 < this.f145895o.size(); i21++) {
                codedOutputStream.b0(this.f145895o.get(i21).intValue());
            }
            if (S0().size() > 0) {
                codedOutputStream.o0(178);
                codedOutputStream.o0(this.f145873B);
            }
            for (int i22 = 0; i22 < this.f145872A.size(); i22++) {
                codedOutputStream.b0(this.f145872A.get(i22).intValue());
            }
            for (int i23 = 0; i23 < this.f145874C.size(); i23++) {
                codedOutputStream.d0(23, this.f145874C.get(i23));
            }
            if (W0().size() > 0) {
                codedOutputStream.o0(194);
                codedOutputStream.o0(this.f145876E);
            }
            for (int i24 = 0; i24 < this.f145875D.size(); i24++) {
                codedOutputStream.b0(this.f145875D.get(i24).intValue());
            }
            if ((this.f145884d & 64) == 64) {
                codedOutputStream.d0(30, this.f145877F);
            }
            for (int i25 = 0; i25 < this.f145878G.size(); i25++) {
                codedOutputStream.a0(31, this.f145878G.get(i25).intValue());
            }
            if ((this.f145884d & 128) == 128) {
                codedOutputStream.d0(32, this.f145879H);
            }
            for (int i26 = 0; i26 < this.f145880I.size(); i26++) {
                codedOutputStream.d0(33, this.f145880I.get(i26));
            }
            extensionWriterZ.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f145883c);
        }

        private Class(boolean z10) {
            this.f145891k = -1;
            this.f145893m = -1;
            this.f145896p = -1;
            this.f145903w = -1;
            this.f145873B = -1;
            this.f145876E = -1;
            this.f145881J = (byte) -1;
            this.f145882K = -1;
            this.f145883c = ByteString.f146726a;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v8, types: [boolean] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v12 */
        /* JADX WARN: Type inference failed for: r7v14 */
        /* JADX WARN: Type inference failed for: r7v16 */
        /* JADX WARN: Type inference failed for: r7v18 */
        /* JADX WARN: Type inference failed for: r7v20 */
        /* JADX WARN: Type inference failed for: r7v22 */
        /* JADX WARN: Type inference failed for: r7v24 */
        /* JADX WARN: Type inference failed for: r7v26 */
        /* JADX WARN: Type inference failed for: r7v28 */
        /* JADX WARN: Type inference failed for: r7v30 */
        /* JADX WARN: Type inference failed for: r7v32 */
        /* JADX WARN: Type inference failed for: r7v34 */
        /* JADX WARN: Type inference failed for: r7v36 */
        /* JADX WARN: Type inference failed for: r7v38 */
        /* JADX WARN: Type inference failed for: r7v4 */
        /* JADX WARN: Type inference failed for: r7v40 */
        /* JADX WARN: Type inference failed for: r7v42 */
        /* JADX WARN: Type inference failed for: r7v44 */
        /* JADX WARN: Type inference failed for: r7v46 */
        /* JADX WARN: Type inference failed for: r7v48 */
        /* JADX WARN: Type inference failed for: r7v50 */
        /* JADX WARN: Type inference failed for: r7v6 */
        /* JADX WARN: Type inference failed for: r7v8 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private Class(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r23, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 1858
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.<init>(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):void");
        }
    }

    public interface ClassOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class CompilerPluginData extends GeneratedMessageLite implements CompilerPluginDataOrBuilder {

        /* renamed from: h, reason: collision with root package name */
        private static final CompilerPluginData f145943h;

        /* renamed from: i, reason: collision with root package name */
        public static Parser<CompilerPluginData> f145944i = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145945b;

        /* renamed from: c, reason: collision with root package name */
        private int f145946c;

        /* renamed from: d, reason: collision with root package name */
        private int f145947d;

        /* renamed from: e, reason: collision with root package name */
        private ByteString f145948e;

        /* renamed from: f, reason: collision with root package name */
        private byte f145949f;

        /* renamed from: g, reason: collision with root package name */
        private int f145950g;

        public static final class Builder extends GeneratedMessageLite.Builder<CompilerPluginData, Builder> implements CompilerPluginDataOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145951b;

            /* renamed from: c, reason: collision with root package name */
            private int f145952c;

            /* renamed from: d, reason: collision with root package name */
            private ByteString f145953d = ByteString.f146726a;

            private void u() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.f145944i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            public CompilerPluginData r() {
                CompilerPluginData compilerPluginData = new CompilerPluginData(this);
                int i10 = this.f145951b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                compilerPluginData.f145947d = this.f145952c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                compilerPluginData.f145948e = this.f145953d;
                compilerPluginData.f145946c = i11;
                return compilerPluginData;
            }

            public Builder y(int i10) {
                this.f145951b |= 1;
                this.f145952c = i10;
                return this;
            }

            private Builder() {
                u();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public CompilerPluginData build() {
                CompilerPluginData compilerPluginDataR = r();
                if (compilerPluginDataR.a()) {
                    return compilerPluginDataR;
                }
                throw AbstractMessageLite.Builder.k(compilerPluginDataR);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder r() {
                return t().n(r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public Builder n(CompilerPluginData compilerPluginData) {
                if (compilerPluginData == CompilerPluginData.x()) {
                    return this;
                }
                if (compilerPluginData.A()) {
                    y(compilerPluginData.y());
                }
                if (compilerPluginData.z()) {
                    x(compilerPluginData.v());
                }
                o(m().e(compilerPluginData.f145945b));
                return this;
            }

            public Builder x(ByteString byteString) {
                byteString.getClass();
                this.f145951b |= 2;
                this.f145953d = byteString;
                return this;
            }
        }

        static class a extends AbstractParser<CompilerPluginData> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public CompilerPluginData c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new CompilerPluginData(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        private void B() {
            this.f145947d = 0;
            this.f145948e = ByteString.f146726a;
        }

        static {
            CompilerPluginData compilerPluginData = new CompilerPluginData(true);
            f145943h = compilerPluginData;
            compilerPluginData.B();
        }

        public static CompilerPluginData x() {
            return f145943h;
        }

        public boolean A() {
            return (this.f145946c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145949f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!A()) {
                this.f145949f = (byte) 0;
                return false;
            }
            if (z()) {
                this.f145949f = (byte) 1;
                return true;
            }
            this.f145949f = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145950g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145946c & 1) == 1 ? CodedOutputStream.o(1, this.f145947d) : 0;
            if ((this.f145946c & 2) == 2) {
                iO += CodedOutputStream.d(2, this.f145948e);
            }
            int size = iO + this.f145945b.size();
            this.f145950g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<CompilerPluginData> f() {
            return f145944i;
        }

        public ByteString v() {
            return this.f145948e;
        }

        public int y() {
            return this.f145947d;
        }

        public boolean z() {
            return (this.f145946c & 2) == 2;
        }

        private CompilerPluginData(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145949f = (byte) -1;
            this.f145950g = -1;
            this.f145945b = builder.m();
        }

        public static Builder C() {
            return Builder.t();
        }

        public static Builder D(CompilerPluginData compilerPluginData) {
            return C().n(compilerPluginData);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return C();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return D(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            if ((this.f145946c & 1) == 1) {
                codedOutputStream.a0(1, this.f145947d);
            }
            if ((this.f145946c & 2) == 2) {
                codedOutputStream.O(2, this.f145948e);
            }
            codedOutputStream.i0(this.f145945b);
        }

        private CompilerPluginData(boolean z10) {
            this.f145949f = (byte) -1;
            this.f145950g = -1;
            this.f145945b = ByteString.f146726a;
        }

        private CompilerPluginData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145949f = (byte) -1;
            this.f145950g = -1;
            B();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = codedInputStream.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f145946c |= 1;
                                this.f145947d = codedInputStream.s();
                            } else if (iK != 18) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                this.f145946c |= 2;
                                this.f145948e = codedInputStream.l();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145945b = outputT.g();
                            throw th3;
                        }
                        this.f145945b = outputT.g();
                        m();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145945b = outputT.g();
                throw th4;
            }
            this.f145945b = outputT.g();
            m();
        }
    }

    public interface CompilerPluginDataOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {

        /* renamed from: k, reason: collision with root package name */
        private static final Constructor f145954k;

        /* renamed from: l, reason: collision with root package name */
        public static Parser<Constructor> f145955l = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f145956c;

        /* renamed from: d, reason: collision with root package name */
        private int f145957d;

        /* renamed from: e, reason: collision with root package name */
        private int f145958e;

        /* renamed from: f, reason: collision with root package name */
        private List<ValueParameter> f145959f;

        /* renamed from: g, reason: collision with root package name */
        private List<Integer> f145960g;

        /* renamed from: h, reason: collision with root package name */
        private List<CompilerPluginData> f145961h;

        /* renamed from: i, reason: collision with root package name */
        private byte f145962i;

        /* renamed from: j, reason: collision with root package name */
        private int f145963j;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f145964d;

            /* renamed from: e, reason: collision with root package name */
            private int f145965e = 6;

            /* renamed from: f, reason: collision with root package name */
            private List<ValueParameter> f145966f;

            /* renamed from: g, reason: collision with root package name */
            private List<Integer> f145967g;

            /* renamed from: h, reason: collision with root package name */
            private List<CompilerPluginData> f145968h;

            private void D() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.f145955l     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$Builder");
            }

            private void A() {
                if ((this.f145964d & 2) != 2) {
                    this.f145966f = new ArrayList(this.f145966f);
                    this.f145964d |= 2;
                }
            }

            private void C() {
                if ((this.f145964d & 4) != 4) {
                    this.f145967g = new ArrayList(this.f145967g);
                    this.f145964d |= 4;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f145964d & 8) != 8) {
                    this.f145968h = new ArrayList(this.f145968h);
                    this.f145964d |= 8;
                }
            }

            public Builder G(int i10) {
                this.f145964d |= 1;
                this.f145965e = i10;
                return this;
            }

            public Constructor w() {
                Constructor constructor = new Constructor(this);
                int i10 = (this.f145964d & 1) != 1 ? 0 : 1;
                constructor.f145958e = this.f145965e;
                if ((this.f145964d & 2) == 2) {
                    this.f145966f = Collections.unmodifiableList(this.f145966f);
                    this.f145964d &= -3;
                }
                constructor.f145959f = this.f145966f;
                if ((this.f145964d & 4) == 4) {
                    this.f145967g = Collections.unmodifiableList(this.f145967g);
                    this.f145964d &= -5;
                }
                constructor.f145960g = this.f145967g;
                if ((this.f145964d & 8) == 8) {
                    this.f145968h = Collections.unmodifiableList(this.f145968h);
                    this.f145964d &= -9;
                }
                constructor.f145961h = this.f145968h;
                constructor.f145957d = i10;
                return constructor;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f145966f = list;
                this.f145967g = list;
                this.f145968h = list;
                D();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            public Builder n(Constructor constructor) {
                if (constructor == Constructor.M()) {
                    return this;
                }
                if (constructor.T()) {
                    G(constructor.O());
                }
                if (!constructor.f145959f.isEmpty()) {
                    if (this.f145966f.isEmpty()) {
                        this.f145966f = constructor.f145959f;
                        this.f145964d &= -3;
                    } else {
                        A();
                        this.f145966f.addAll(constructor.f145959f);
                    }
                }
                if (!constructor.f145960g.isEmpty()) {
                    if (this.f145967g.isEmpty()) {
                        this.f145967g = constructor.f145960g;
                        this.f145964d &= -5;
                    } else {
                        C();
                        this.f145967g.addAll(constructor.f145960g);
                    }
                }
                if (!constructor.f145961h.isEmpty()) {
                    if (this.f145968h.isEmpty()) {
                        this.f145968h = constructor.f145961h;
                        this.f145964d &= -9;
                    } else {
                        z();
                        this.f145968h.addAll(constructor.f145961h);
                    }
                }
                t(constructor);
                o(m().e(constructor.f145956c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public Constructor build() {
                Constructor constructorW = w();
                if (constructorW.a()) {
                    return constructorW;
                }
                throw AbstractMessageLite.Builder.k(constructorW);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: x, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder r() {
                return y().n(w());
            }
        }

        static class a extends AbstractParser<Constructor> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Constructor c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Constructor(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        private void U() {
            this.f145958e = 6;
            List list = Collections.EMPTY_LIST;
            this.f145959f = list;
            this.f145960g = list;
            this.f145961h = list;
        }

        static {
            Constructor constructor = new Constructor(true);
            f145954k = constructor;
            constructor.U();
        }

        public static Constructor M() {
            return f145954k;
        }

        public CompilerPluginData K(int i10) {
            return this.f145961h.get(i10);
        }

        public int L() {
            return this.f145961h.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public Constructor e() {
            return f145954k;
        }

        public int O() {
            return this.f145958e;
        }

        public ValueParameter P(int i10) {
            return this.f145959f.get(i10);
        }

        public int Q() {
            return this.f145959f.size();
        }

        public List<ValueParameter> R() {
            return this.f145959f;
        }

        public List<Integer> S() {
            return this.f145960g;
        }

        public boolean T() {
            return (this.f145957d & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145962i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < Q(); i10++) {
                if (!P(i10).a()) {
                    this.f145962i = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < L(); i11++) {
                if (!K(i11).a()) {
                    this.f145962i = (byte) 0;
                    return false;
                }
            }
            if (s()) {
                this.f145962i = (byte) 1;
                return true;
            }
            this.f145962i = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145963j;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145957d & 1) == 1 ? CodedOutputStream.o(1, this.f145958e) : 0;
            for (int i11 = 0; i11 < this.f145959f.size(); i11++) {
                iO += CodedOutputStream.s(2, this.f145959f.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f145960g.size(); i12++) {
                iP += CodedOutputStream.p(this.f145960g.get(i12).intValue());
            }
            int size = iO + iP + (S().size() * 2);
            for (int i13 = 0; i13 < this.f145961h.size(); i13++) {
                size += CodedOutputStream.s(32, this.f145961h.get(i13));
            }
            int iT = size + t() + this.f145956c.size();
            this.f145963j = iT;
            return iT;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Constructor> f() {
            return f145955l;
        }

        private Constructor(GeneratedMessageLite.ExtendableBuilder<Constructor, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f145962i = (byte) -1;
            this.f145963j = -1;
            this.f145956c = extendableBuilder.m();
        }

        public static Builder V() {
            return Builder.y();
        }

        public static Builder W(Constructor constructor) {
            return V().n(constructor);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return V();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return W(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterZ = z();
            if ((this.f145957d & 1) == 1) {
                codedOutputStream.a0(1, this.f145958e);
            }
            for (int i10 = 0; i10 < this.f145959f.size(); i10++) {
                codedOutputStream.d0(2, this.f145959f.get(i10));
            }
            for (int i11 = 0; i11 < this.f145960g.size(); i11++) {
                codedOutputStream.a0(31, this.f145960g.get(i11).intValue());
            }
            for (int i12 = 0; i12 < this.f145961h.size(); i12++) {
                codedOutputStream.d0(32, this.f145961h.get(i12));
            }
            extensionWriterZ.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f145956c);
        }

        private Constructor(boolean z10) {
            this.f145962i = (byte) -1;
            this.f145963j = -1;
            this.f145956c = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145962i = (byte) -1;
            this.f145963j = -1;
            U();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = codedInputStream.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f145957d |= 1;
                                this.f145958e = codedInputStream.s();
                            } else if (iK == 18) {
                                if ((i10 & 2) != 2) {
                                    this.f145959f = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f145959f.add(codedInputStream.u(ValueParameter.f146317n, extensionRegistryLite));
                            } else if (iK == 248) {
                                if ((i10 & 4) != 4) {
                                    this.f145960g = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f145960g.add(Integer.valueOf(codedInputStream.s()));
                            } else if (iK == 250) {
                                int iJ = codedInputStream.j(codedInputStream.A());
                                if ((i10 & 4) != 4 && codedInputStream.e() > 0) {
                                    this.f145960g = new ArrayList();
                                    i10 |= 4;
                                }
                                while (codedInputStream.e() > 0) {
                                    this.f145960g.add(Integer.valueOf(codedInputStream.s()));
                                }
                                codedInputStream.i(iJ);
                            } else if (iK != 258) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                if ((i10 & 8) != 8) {
                                    this.f145961h = new ArrayList();
                                    i10 |= 8;
                                }
                                this.f145961h.add(codedInputStream.u(CompilerPluginData.f145944i, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 2) == 2) {
                            this.f145959f = Collections.unmodifiableList(this.f145959f);
                        }
                        if ((i10 & 4) == 4) {
                            this.f145960g = Collections.unmodifiableList(this.f145960g);
                        }
                        if ((i10 & 8) == 8) {
                            this.f145961h = Collections.unmodifiableList(this.f145961h);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145956c = outputT.g();
                            throw th3;
                        }
                        this.f145956c = outputT.g();
                        m();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            if ((i10 & 2) == 2) {
                this.f145959f = Collections.unmodifiableList(this.f145959f);
            }
            if ((i10 & 4) == 4) {
                this.f145960g = Collections.unmodifiableList(this.f145960g);
            }
            if ((i10 & 8) == 8) {
                this.f145961h = Collections.unmodifiableList(this.f145961h);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145956c = outputT.g();
                throw th4;
            }
            this.f145956c = outputT.g();
            m();
        }
    }

    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {

        /* renamed from: f, reason: collision with root package name */
        private static final Contract f145969f;

        /* renamed from: g, reason: collision with root package name */
        public static Parser<Contract> f145970g = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145971b;

        /* renamed from: c, reason: collision with root package name */
        private List<Effect> f145972c;

        /* renamed from: d, reason: collision with root package name */
        private byte f145973d;

        /* renamed from: e, reason: collision with root package name */
        private int f145974e;

        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145975b;

            /* renamed from: c, reason: collision with root package name */
            private List<Effect> f145976c = Collections.EMPTY_LIST;

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.f145970g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f145975b & 1) != 1) {
                    this.f145976c = new ArrayList(this.f145976c);
                    this.f145975b |= 1;
                }
            }

            public Contract r() {
                Contract contract = new Contract(this);
                if ((this.f145975b & 1) == 1) {
                    this.f145976c = Collections.unmodifiableList(this.f145976c);
                    this.f145975b &= -2;
                }
                contract.f145972c = this.f145976c;
                return contract;
            }

            private Builder() {
                v();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public Contract build() {
                Contract contractR = r();
                if (contractR.a()) {
                    return contractR;
                }
                throw AbstractMessageLite.Builder.k(contractR);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return t().n(r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public Builder n(Contract contract) {
                if (contract == Contract.u()) {
                    return this;
                }
                if (!contract.f145972c.isEmpty()) {
                    if (this.f145976c.isEmpty()) {
                        this.f145976c = contract.f145972c;
                        this.f145975b &= -2;
                    } else {
                        u();
                        this.f145976c.addAll(contract.f145972c);
                    }
                }
                o(m().e(contract.f145971b));
                return this;
            }
        }

        static class a extends AbstractParser<Contract> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Contract c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Contract(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        static {
            Contract contract = new Contract(true);
            f145969f = contract;
            contract.y();
        }

        public static Contract u() {
            return f145969f;
        }

        private void y() {
            this.f145972c = Collections.EMPTY_LIST;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145973d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < x(); i10++) {
                if (!v(i10).a()) {
                    this.f145973d = (byte) 0;
                    return false;
                }
            }
            this.f145973d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145974e;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f145972c.size(); i11++) {
                iS += CodedOutputStream.s(1, this.f145972c.get(i11));
            }
            int size = iS + this.f145971b.size();
            this.f145974e = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Contract> f() {
            return f145970g;
        }

        public Effect v(int i10) {
            return this.f145972c.get(i10);
        }

        public int x() {
            return this.f145972c.size();
        }

        private Contract(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145973d = (byte) -1;
            this.f145974e = -1;
            this.f145971b = builder.m();
        }

        public static Builder A(Contract contract) {
            return z().n(contract);
        }

        public static Builder z() {
            return Builder.t();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return z();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            for (int i10 = 0; i10 < this.f145972c.size(); i10++) {
                codedOutputStream.d0(1, this.f145972c.get(i10));
            }
            codedOutputStream.i0(this.f145971b);
        }

        private Contract(boolean z10) {
            this.f145973d = (byte) -1;
            this.f145974e = -1;
            this.f145971b = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145973d = (byte) -1;
            this.f145974e = -1;
            y();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = codedInputStream.K();
                            if (iK != 0) {
                                if (iK != 10) {
                                    if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                    }
                                } else {
                                    if (!z11) {
                                        this.f145972c = new ArrayList();
                                        z11 = true;
                                    }
                                    this.f145972c.add(codedInputStream.u(Effect.f145978k, extensionRegistryLite));
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.i(this);
                        }
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if (z11) {
                        this.f145972c = Collections.unmodifiableList(this.f145972c);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f145971b = outputT.g();
                        throw th3;
                    }
                    this.f145971b = outputT.g();
                    m();
                    throw th2;
                }
            }
            if (z11) {
                this.f145972c = Collections.unmodifiableList(this.f145972c);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145971b = outputT.g();
                throw th4;
            }
            this.f145971b = outputT.g();
            m();
        }
    }

    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {

        /* renamed from: j, reason: collision with root package name */
        private static final Effect f145977j;

        /* renamed from: k, reason: collision with root package name */
        public static Parser<Effect> f145978k = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145979b;

        /* renamed from: c, reason: collision with root package name */
        private int f145980c;

        /* renamed from: d, reason: collision with root package name */
        private EffectType f145981d;

        /* renamed from: e, reason: collision with root package name */
        private List<Expression> f145982e;

        /* renamed from: f, reason: collision with root package name */
        private Expression f145983f;

        /* renamed from: g, reason: collision with root package name */
        private InvocationKind f145984g;

        /* renamed from: h, reason: collision with root package name */
        private byte f145985h;

        /* renamed from: i, reason: collision with root package name */
        private int f145986i;

        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145987b;

            /* renamed from: c, reason: collision with root package name */
            private EffectType f145988c = EffectType.RETURNS_CONSTANT;

            /* renamed from: d, reason: collision with root package name */
            private List<Expression> f145989d = Collections.EMPTY_LIST;

            /* renamed from: e, reason: collision with root package name */
            private Expression f145990e = Expression.G();

            /* renamed from: f, reason: collision with root package name */
            private InvocationKind f145991f = InvocationKind.AT_MOST_ONCE;

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.f145978k     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f145987b & 2) != 2) {
                    this.f145989d = new ArrayList(this.f145989d);
                    this.f145987b |= 2;
                }
            }

            public Effect r() {
                Effect effect = new Effect(this);
                int i10 = this.f145987b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                effect.f145981d = this.f145988c;
                if ((this.f145987b & 2) == 2) {
                    this.f145989d = Collections.unmodifiableList(this.f145989d);
                    this.f145987b &= -3;
                }
                effect.f145982e = this.f145989d;
                if ((i10 & 4) == 4) {
                    i11 |= 2;
                }
                effect.f145983f = this.f145990e;
                if ((i10 & 8) == 8) {
                    i11 |= 4;
                }
                effect.f145984g = this.f145991f;
                effect.f145980c = i11;
                return effect;
            }

            public Builder w(Expression expression) {
                if ((this.f145987b & 4) != 4 || this.f145990e == Expression.G()) {
                    this.f145990e = expression;
                } else {
                    this.f145990e = Expression.U(this.f145990e).n(expression).r();
                }
                this.f145987b |= 4;
                return this;
            }

            private Builder() {
                v();
            }

            public Builder A(InvocationKind invocationKind) {
                invocationKind.getClass();
                this.f145987b |= 8;
                this.f145991f = invocationKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public Effect build() {
                Effect effectR = r();
                if (effectR.a()) {
                    return effectR;
                }
                throw AbstractMessageLite.Builder.k(effectR);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return t().n(r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder n(Effect effect) {
                if (effect == Effect.A()) {
                    return this;
                }
                if (effect.G()) {
                    z(effect.D());
                }
                if (!effect.f145982e.isEmpty()) {
                    if (this.f145989d.isEmpty()) {
                        this.f145989d = effect.f145982e;
                        this.f145987b &= -3;
                    } else {
                        u();
                        this.f145989d.addAll(effect.f145982e);
                    }
                }
                if (effect.F()) {
                    w(effect.z());
                }
                if (effect.H()) {
                    A(effect.E());
                }
                o(m().e(effect.f145979b));
                return this;
            }

            public Builder z(EffectType effectType) {
                effectType.getClass();
                this.f145987b |= 1;
                this.f145988c = effectType;
                return this;
            }
        }

        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0, 0),
            CALLS(1, 1),
            RETURNS_NOT_NULL(2, 2);


            /* renamed from: e, reason: collision with root package name */
            private static Internal.EnumLiteMap<EffectType> f145995e = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f145997a;

            static class a implements Internal.EnumLiteMap<EffectType> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public EffectType a(int i10) {
                    return EffectType.a(i10);
                }
            }

            public static EffectType a(int i10) {
                if (i10 == 0) {
                    return RETURNS_CONSTANT;
                }
                if (i10 == 1) {
                    return CALLS;
                }
                if (i10 != 2) {
                    return null;
                }
                return RETURNS_NOT_NULL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int g() {
                return this.f145997a;
            }

            EffectType(int i10, int i11) {
                this.f145997a = i11;
            }
        }

        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0, 0),
            EXACTLY_ONCE(1, 1),
            AT_LEAST_ONCE(2, 2);


            /* renamed from: e, reason: collision with root package name */
            private static Internal.EnumLiteMap<InvocationKind> f146001e = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f146003a;

            static class a implements Internal.EnumLiteMap<InvocationKind> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public InvocationKind a(int i10) {
                    return InvocationKind.a(i10);
                }
            }

            public static InvocationKind a(int i10) {
                if (i10 == 0) {
                    return AT_MOST_ONCE;
                }
                if (i10 == 1) {
                    return EXACTLY_ONCE;
                }
                if (i10 != 2) {
                    return null;
                }
                return AT_LEAST_ONCE;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int g() {
                return this.f146003a;
            }

            InvocationKind(int i10, int i11) {
                this.f146003a = i11;
            }
        }

        static class a extends AbstractParser<Effect> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Effect c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Effect(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        static {
            Effect effect = new Effect(true);
            f145977j = effect;
            effect.I();
        }

        public static Effect A() {
            return f145977j;
        }

        private void I() {
            this.f145981d = EffectType.RETURNS_CONSTANT;
            this.f145982e = Collections.EMPTY_LIST;
            this.f145983f = Expression.G();
            this.f145984g = InvocationKind.AT_MOST_ONCE;
        }

        public Expression B(int i10) {
            return this.f145982e.get(i10);
        }

        public int C() {
            return this.f145982e.size();
        }

        public EffectType D() {
            return this.f145981d;
        }

        public InvocationKind E() {
            return this.f145984g;
        }

        public boolean F() {
            return (this.f145980c & 2) == 2;
        }

        public boolean G() {
            return (this.f145980c & 1) == 1;
        }

        public boolean H() {
            return (this.f145980c & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145985h;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < C(); i10++) {
                if (!B(i10).a()) {
                    this.f145985h = (byte) 0;
                    return false;
                }
            }
            if (!F() || z().a()) {
                this.f145985h = (byte) 1;
                return true;
            }
            this.f145985h = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145986i;
            if (i10 != -1) {
                return i10;
            }
            int iH = (this.f145980c & 1) == 1 ? CodedOutputStream.h(1, this.f145981d.g()) : 0;
            for (int i11 = 0; i11 < this.f145982e.size(); i11++) {
                iH += CodedOutputStream.s(2, this.f145982e.get(i11));
            }
            if ((this.f145980c & 2) == 2) {
                iH += CodedOutputStream.s(3, this.f145983f);
            }
            if ((this.f145980c & 4) == 4) {
                iH += CodedOutputStream.h(4, this.f145984g.g());
            }
            int size = iH + this.f145979b.size();
            this.f145986i = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Effect> f() {
            return f145978k;
        }

        public Expression z() {
            return this.f145983f;
        }

        private Effect(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145985h = (byte) -1;
            this.f145986i = -1;
            this.f145979b = builder.m();
        }

        public static Builder J() {
            return Builder.t();
        }

        public static Builder K(Effect effect) {
            return J().n(effect);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return J();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return K(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            if ((this.f145980c & 1) == 1) {
                codedOutputStream.S(1, this.f145981d.g());
            }
            for (int i10 = 0; i10 < this.f145982e.size(); i10++) {
                codedOutputStream.d0(2, this.f145982e.get(i10));
            }
            if ((this.f145980c & 2) == 2) {
                codedOutputStream.d0(3, this.f145983f);
            }
            if ((this.f145980c & 4) == 4) {
                codedOutputStream.S(4, this.f145984g.g());
            }
            codedOutputStream.i0(this.f145979b);
        }

        private Effect(boolean z10) {
            this.f145985h = (byte) -1;
            this.f145986i = -1;
            this.f145979b = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145985h = (byte) -1;
            this.f145986i = -1;
            I();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            char c10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = codedInputStream.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                int iN = codedInputStream.n();
                                EffectType effectTypeA = EffectType.a(iN);
                                if (effectTypeA == null) {
                                    codedOutputStreamJ.o0(iK);
                                    codedOutputStreamJ.o0(iN);
                                } else {
                                    this.f145980c |= 1;
                                    this.f145981d = effectTypeA;
                                }
                            } else if (iK == 18) {
                                if ((c10 & 2) != 2) {
                                    this.f145982e = new ArrayList();
                                    c10 = 2;
                                }
                                this.f145982e.add(codedInputStream.u(Expression.f146014n, extensionRegistryLite));
                            } else if (iK == 26) {
                                Expression.Builder builderB = (this.f145980c & 2) == 2 ? this.f145983f.b() : null;
                                Expression expression = (Expression) codedInputStream.u(Expression.f146014n, extensionRegistryLite);
                                this.f145983f = expression;
                                if (builderB != null) {
                                    builderB.n(expression);
                                    this.f145983f = builderB.r();
                                }
                                this.f145980c |= 2;
                            } else if (iK != 32) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                int iN2 = codedInputStream.n();
                                InvocationKind invocationKindA = InvocationKind.a(iN2);
                                if (invocationKindA == null) {
                                    codedOutputStreamJ.o0(iK);
                                    codedOutputStreamJ.o0(iN2);
                                } else {
                                    this.f145980c |= 4;
                                    this.f145984g = invocationKindA;
                                }
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((c10 & 2) == 2) {
                            this.f145982e = Collections.unmodifiableList(this.f145982e);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145979b = outputT.g();
                            throw th3;
                        }
                        this.f145979b = outputT.g();
                        m();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            if ((c10 & 2) == 2) {
                this.f145982e = Collections.unmodifiableList(this.f145982e);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145979b = outputT.g();
                throw th4;
            }
            this.f145979b = outputT.g();
            m();
        }
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {

        /* renamed from: h, reason: collision with root package name */
        private static final EnumEntry f146004h;

        /* renamed from: i, reason: collision with root package name */
        public static Parser<EnumEntry> f146005i = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f146006c;

        /* renamed from: d, reason: collision with root package name */
        private int f146007d;

        /* renamed from: e, reason: collision with root package name */
        private int f146008e;

        /* renamed from: f, reason: collision with root package name */
        private byte f146009f;

        /* renamed from: g, reason: collision with root package name */
        private int f146010g;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f146011d;

            /* renamed from: e, reason: collision with root package name */
            private int f146012e;

            private void z() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.f146005i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            public Builder D(int i10) {
                this.f146011d |= 1;
                this.f146012e = i10;
                return this;
            }

            public EnumEntry w() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i10 = (this.f146011d & 1) != 1 ? 0 : 1;
                enumEntry.f146008e = this.f146012e;
                enumEntry.f146007d = i10;
                return enumEntry;
            }

            private Builder() {
                z();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public Builder n(EnumEntry enumEntry) {
                if (enumEntry == EnumEntry.E()) {
                    return this;
                }
                if (enumEntry.H()) {
                    D(enumEntry.G());
                }
                t(enumEntry);
                o(m().e(enumEntry.f146006c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public EnumEntry build() {
                EnumEntry enumEntryW = w();
                if (enumEntryW.a()) {
                    return enumEntryW;
                }
                throw AbstractMessageLite.Builder.k(enumEntryW);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return y().n(w());
            }
        }

        static class a extends AbstractParser<EnumEntry> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public EnumEntry c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new EnumEntry(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        private void I() {
            this.f146008e = 0;
        }

        static {
            EnumEntry enumEntry = new EnumEntry(true);
            f146004h = enumEntry;
            enumEntry.I();
        }

        public static EnumEntry E() {
            return f146004h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public EnumEntry e() {
            return f146004h;
        }

        public int G() {
            return this.f146008e;
        }

        public boolean H() {
            return (this.f146007d & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146009f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (s()) {
                this.f146009f = (byte) 1;
                return true;
            }
            this.f146009f = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146010g;
            if (i10 != -1) {
                return i10;
            }
            int iO = ((this.f146007d & 1) == 1 ? CodedOutputStream.o(1, this.f146008e) : 0) + t() + this.f146006c.size();
            this.f146010g = iO;
            return iO;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<EnumEntry> f() {
            return f146005i;
        }

        private EnumEntry(GeneratedMessageLite.ExtendableBuilder<EnumEntry, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f146009f = (byte) -1;
            this.f146010g = -1;
            this.f146006c = extendableBuilder.m();
        }

        public static Builder J() {
            return Builder.y();
        }

        public static Builder K(EnumEntry enumEntry) {
            return J().n(enumEntry);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return J();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return K(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterZ = z();
            if ((this.f146007d & 1) == 1) {
                codedOutputStream.a0(1, this.f146008e);
            }
            extensionWriterZ.a(HttpResponseStatus.SUCCESS_OK, codedOutputStream);
            codedOutputStream.i0(this.f146006c);
        }

        private EnumEntry(boolean z10) {
            this.f146009f = (byte) -1;
            this.f146010g = -1;
            this.f146006c = ByteString.f146726a;
        }

        private EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f146009f = (byte) -1;
            this.f146010g = -1;
            I();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = codedInputStream.K();
                            if (iK != 0) {
                                if (iK != 8) {
                                    if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                    }
                                } else {
                                    this.f146007d |= 1;
                                    this.f146008e = codedInputStream.s();
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.i(this);
                        }
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f146006c = outputT.g();
                        throw th3;
                    }
                    this.f146006c = outputT.g();
                    m();
                    throw th2;
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f146006c = outputT.g();
                throw th4;
            }
            this.f146006c = outputT.g();
            m();
        }
    }

    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {

        /* renamed from: m, reason: collision with root package name */
        private static final Expression f146013m;

        /* renamed from: n, reason: collision with root package name */
        public static Parser<Expression> f146014n = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f146015b;

        /* renamed from: c, reason: collision with root package name */
        private int f146016c;

        /* renamed from: d, reason: collision with root package name */
        private int f146017d;

        /* renamed from: e, reason: collision with root package name */
        private int f146018e;

        /* renamed from: f, reason: collision with root package name */
        private ConstantValue f146019f;

        /* renamed from: g, reason: collision with root package name */
        private Type f146020g;

        /* renamed from: h, reason: collision with root package name */
        private int f146021h;

        /* renamed from: i, reason: collision with root package name */
        private List<Expression> f146022i;

        /* renamed from: j, reason: collision with root package name */
        private List<Expression> f146023j;

        /* renamed from: k, reason: collision with root package name */
        private byte f146024k;

        /* renamed from: l, reason: collision with root package name */
        private int f146025l;

        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f146026b;

            /* renamed from: c, reason: collision with root package name */
            private int f146027c;

            /* renamed from: d, reason: collision with root package name */
            private int f146028d;

            /* renamed from: e, reason: collision with root package name */
            private ConstantValue f146029e = ConstantValue.TRUE;

            /* renamed from: f, reason: collision with root package name */
            private Type f146030f = Type.Y();

            /* renamed from: g, reason: collision with root package name */
            private int f146031g;

            /* renamed from: h, reason: collision with root package name */
            private List<Expression> f146032h;

            /* renamed from: i, reason: collision with root package name */
            private List<Expression> f146033i;

            private void w() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.f146014n     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f146026b & 32) != 32) {
                    this.f146032h = new ArrayList(this.f146032h);
                    this.f146026b |= 32;
                }
            }

            private void v() {
                if ((this.f146026b & 64) != 64) {
                    this.f146033i = new ArrayList(this.f146033i);
                    this.f146026b |= 64;
                }
            }

            public Builder C(int i10) {
                this.f146026b |= 1;
                this.f146027c = i10;
                return this;
            }

            public Builder D(int i10) {
                this.f146026b |= 16;
                this.f146031g = i10;
                return this;
            }

            public Builder E(int i10) {
                this.f146026b |= 2;
                this.f146028d = i10;
                return this;
            }

            public Expression r() {
                Expression expression = new Expression(this);
                int i10 = this.f146026b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                expression.f146017d = this.f146027c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                expression.f146018e = this.f146028d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                expression.f146019f = this.f146029e;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                expression.f146020g = this.f146030f;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                expression.f146021h = this.f146031g;
                if ((this.f146026b & 32) == 32) {
                    this.f146032h = Collections.unmodifiableList(this.f146032h);
                    this.f146026b &= -33;
                }
                expression.f146022i = this.f146032h;
                if ((this.f146026b & 64) == 64) {
                    this.f146033i = Collections.unmodifiableList(this.f146033i);
                    this.f146026b &= -65;
                }
                expression.f146023j = this.f146033i;
                expression.f146016c = i11;
                return expression;
            }

            public Builder z(Type type) {
                if ((this.f146026b & 8) != 8 || this.f146030f == Type.Y()) {
                    this.f146030f = type;
                } else {
                    this.f146030f = Type.A0(this.f146030f).n(type).w();
                }
                this.f146026b |= 8;
                return this;
            }

            private Builder() {
                List<Expression> list = Collections.EMPTY_LIST;
                this.f146032h = list;
                this.f146033i = list;
                w();
            }

            public Builder A(ConstantValue constantValue) {
                constantValue.getClass();
                this.f146026b |= 4;
                this.f146029e = constantValue;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public Expression build() {
                Expression expressionR = r();
                if (expressionR.a()) {
                    return expressionR;
                }
                throw AbstractMessageLite.Builder.k(expressionR);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return t().n(r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder n(Expression expression) {
                if (expression == Expression.G()) {
                    return this;
                }
                if (expression.O()) {
                    C(expression.H());
                }
                if (expression.R()) {
                    E(expression.M());
                }
                if (expression.N()) {
                    A(expression.F());
                }
                if (expression.P()) {
                    z(expression.I());
                }
                if (expression.Q()) {
                    D(expression.J());
                }
                if (!expression.f146022i.isEmpty()) {
                    if (this.f146032h.isEmpty()) {
                        this.f146032h = expression.f146022i;
                        this.f146026b &= -33;
                    } else {
                        u();
                        this.f146032h.addAll(expression.f146022i);
                    }
                }
                if (!expression.f146023j.isEmpty()) {
                    if (this.f146033i.isEmpty()) {
                        this.f146033i = expression.f146023j;
                        this.f146026b &= -65;
                    } else {
                        v();
                        this.f146033i.addAll(expression.f146023j);
                    }
                }
                o(m().e(expression.f146015b));
                return this;
            }
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);


            /* renamed from: e, reason: collision with root package name */
            private static Internal.EnumLiteMap<ConstantValue> f146037e = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f146039a;

            static class a implements Internal.EnumLiteMap<ConstantValue> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public ConstantValue a(int i10) {
                    return ConstantValue.a(i10);
                }
            }

            public static ConstantValue a(int i10) {
                if (i10 == 0) {
                    return TRUE;
                }
                if (i10 == 1) {
                    return FALSE;
                }
                if (i10 != 2) {
                    return null;
                }
                return NULL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int g() {
                return this.f146039a;
            }

            ConstantValue(int i10, int i11) {
                this.f146039a = i11;
            }
        }

        static class a extends AbstractParser<Expression> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Expression c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Expression(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        private void S() {
            this.f146017d = 0;
            this.f146018e = 0;
            this.f146019f = ConstantValue.TRUE;
            this.f146020g = Type.Y();
            this.f146021h = 0;
            List<Expression> list = Collections.EMPTY_LIST;
            this.f146022i = list;
            this.f146023j = list;
        }

        static {
            Expression expression = new Expression(true);
            f146013m = expression;
            expression.S();
        }

        public static Expression G() {
            return f146013m;
        }

        public Expression D(int i10) {
            return this.f146022i.get(i10);
        }

        public int E() {
            return this.f146022i.size();
        }

        public ConstantValue F() {
            return this.f146019f;
        }

        public int H() {
            return this.f146017d;
        }

        public Type I() {
            return this.f146020g;
        }

        public int J() {
            return this.f146021h;
        }

        public Expression K(int i10) {
            return this.f146023j.get(i10);
        }

        public int L() {
            return this.f146023j.size();
        }

        public int M() {
            return this.f146018e;
        }

        public boolean N() {
            return (this.f146016c & 4) == 4;
        }

        public boolean O() {
            return (this.f146016c & 1) == 1;
        }

        public boolean P() {
            return (this.f146016c & 8) == 8;
        }

        public boolean Q() {
            return (this.f146016c & 16) == 16;
        }

        public boolean R() {
            return (this.f146016c & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146024k;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (P() && !I().a()) {
                this.f146024k = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < E(); i10++) {
                if (!D(i10).a()) {
                    this.f146024k = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < L(); i11++) {
                if (!K(i11).a()) {
                    this.f146024k = (byte) 0;
                    return false;
                }
            }
            this.f146024k = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146025l;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f146016c & 1) == 1 ? CodedOutputStream.o(1, this.f146017d) : 0;
            if ((this.f146016c & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f146018e);
            }
            if ((this.f146016c & 4) == 4) {
                iO += CodedOutputStream.h(3, this.f146019f.g());
            }
            if ((this.f146016c & 8) == 8) {
                iO += CodedOutputStream.s(4, this.f146020g);
            }
            if ((this.f146016c & 16) == 16) {
                iO += CodedOutputStream.o(5, this.f146021h);
            }
            for (int i11 = 0; i11 < this.f146022i.size(); i11++) {
                iO += CodedOutputStream.s(6, this.f146022i.get(i11));
            }
            for (int i12 = 0; i12 < this.f146023j.size(); i12++) {
                iO += CodedOutputStream.s(7, this.f146023j.get(i12));
            }
            int size = iO + this.f146015b.size();
            this.f146025l = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Expression> f() {
            return f146014n;
        }

        private Expression(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f146024k = (byte) -1;
            this.f146025l = -1;
            this.f146015b = builder.m();
        }

        public static Builder T() {
            return Builder.t();
        }

        public static Builder U(Expression expression) {
            return T().n(expression);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return T();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return U(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            if ((this.f146016c & 1) == 1) {
                codedOutputStream.a0(1, this.f146017d);
            }
            if ((this.f146016c & 2) == 2) {
                codedOutputStream.a0(2, this.f146018e);
            }
            if ((this.f146016c & 4) == 4) {
                codedOutputStream.S(3, this.f146019f.g());
            }
            if ((this.f146016c & 8) == 8) {
                codedOutputStream.d0(4, this.f146020g);
            }
            if ((this.f146016c & 16) == 16) {
                codedOutputStream.a0(5, this.f146021h);
            }
            for (int i10 = 0; i10 < this.f146022i.size(); i10++) {
                codedOutputStream.d0(6, this.f146022i.get(i10));
            }
            for (int i11 = 0; i11 < this.f146023j.size(); i11++) {
                codedOutputStream.d0(7, this.f146023j.get(i11));
            }
            codedOutputStream.i0(this.f146015b);
        }

        private Expression(boolean z10) {
            this.f146024k = (byte) -1;
            this.f146025l = -1;
            this.f146015b = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f146024k = (byte) -1;
            this.f146025l = -1;
            S();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = codedInputStream.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f146016c |= 1;
                                this.f146017d = codedInputStream.s();
                            } else if (iK == 16) {
                                this.f146016c |= 2;
                                this.f146018e = codedInputStream.s();
                            } else if (iK == 24) {
                                int iN = codedInputStream.n();
                                ConstantValue constantValueA = ConstantValue.a(iN);
                                if (constantValueA == null) {
                                    codedOutputStreamJ.o0(iK);
                                    codedOutputStreamJ.o0(iN);
                                } else {
                                    this.f146016c |= 4;
                                    this.f146019f = constantValueA;
                                }
                            } else if (iK == 34) {
                                Type.Builder builderB = (this.f146016c & 8) == 8 ? this.f146020g.b() : null;
                                Type type = (Type) codedInputStream.u(Type.f146198v, extensionRegistryLite);
                                this.f146020g = type;
                                if (builderB != null) {
                                    builderB.n(type);
                                    this.f146020g = builderB.w();
                                }
                                this.f146016c |= 8;
                            } else if (iK == 40) {
                                this.f146016c |= 16;
                                this.f146021h = codedInputStream.s();
                            } else if (iK == 50) {
                                if ((i10 & 32) != 32) {
                                    this.f146022i = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f146022i.add(codedInputStream.u(f146014n, extensionRegistryLite));
                            } else if (iK != 58) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                if ((i10 & 64) != 64) {
                                    this.f146023j = new ArrayList();
                                    i10 |= 64;
                                }
                                this.f146023j.add(codedInputStream.u(f146014n, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 32) == 32) {
                            this.f146022i = Collections.unmodifiableList(this.f146022i);
                        }
                        if ((i10 & 64) == 64) {
                            this.f146023j = Collections.unmodifiableList(this.f146023j);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f146015b = outputT.g();
                            throw th3;
                        }
                        this.f146015b = outputT.g();
                        m();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            if ((i10 & 32) == 32) {
                this.f146022i = Collections.unmodifiableList(this.f146022i);
            }
            if ((i10 & 64) == 64) {
                this.f146023j = Collections.unmodifiableList(this.f146023j);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f146015b = outputT.g();
                throw th4;
            }
            this.f146015b = outputT.g();
            m();
        }
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {

        /* renamed from: w, reason: collision with root package name */
        private static final Function f146040w;

        /* renamed from: x, reason: collision with root package name */
        public static Parser<Function> f146041x = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f146042c;

        /* renamed from: d, reason: collision with root package name */
        private int f146043d;

        /* renamed from: e, reason: collision with root package name */
        private int f146044e;

        /* renamed from: f, reason: collision with root package name */
        private int f146045f;

        /* renamed from: g, reason: collision with root package name */
        private int f146046g;

        /* renamed from: h, reason: collision with root package name */
        private Type f146047h;

        /* renamed from: i, reason: collision with root package name */
        private int f146048i;

        /* renamed from: j, reason: collision with root package name */
        private List<TypeParameter> f146049j;

        /* renamed from: k, reason: collision with root package name */
        private Type f146050k;

        /* renamed from: l, reason: collision with root package name */
        private int f146051l;

        /* renamed from: m, reason: collision with root package name */
        private List<Type> f146052m;

        /* renamed from: n, reason: collision with root package name */
        private List<Integer> f146053n;

        /* renamed from: o, reason: collision with root package name */
        private int f146054o;

        /* renamed from: p, reason: collision with root package name */
        private List<ValueParameter> f146055p;

        /* renamed from: q, reason: collision with root package name */
        private TypeTable f146056q;

        /* renamed from: r, reason: collision with root package name */
        private List<Integer> f146057r;

        /* renamed from: s, reason: collision with root package name */
        private Contract f146058s;

        /* renamed from: t, reason: collision with root package name */
        private List<CompilerPluginData> f146059t;

        /* renamed from: u, reason: collision with root package name */
        private byte f146060u;

        /* renamed from: v, reason: collision with root package name */
        private int f146061v;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f146062d;

            /* renamed from: g, reason: collision with root package name */
            private int f146065g;

            /* renamed from: i, reason: collision with root package name */
            private int f146067i;

            /* renamed from: j, reason: collision with root package name */
            private List<TypeParameter> f146068j;

            /* renamed from: k, reason: collision with root package name */
            private Type f146069k;

            /* renamed from: l, reason: collision with root package name */
            private int f146070l;

            /* renamed from: m, reason: collision with root package name */
            private List<Type> f146071m;

            /* renamed from: n, reason: collision with root package name */
            private List<Integer> f146072n;

            /* renamed from: o, reason: collision with root package name */
            private List<ValueParameter> f146073o;

            /* renamed from: p, reason: collision with root package name */
            private TypeTable f146074p;

            /* renamed from: q, reason: collision with root package name */
            private List<Integer> f146075q;

            /* renamed from: r, reason: collision with root package name */
            private Contract f146076r;

            /* renamed from: s, reason: collision with root package name */
            private List<CompilerPluginData> f146077s;

            /* renamed from: e, reason: collision with root package name */
            private int f146063e = 6;

            /* renamed from: f, reason: collision with root package name */
            private int f146064f = 6;

            /* renamed from: h, reason: collision with root package name */
            private Type f146066h = Type.Y();

            private void G() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: J, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.f146041x     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$Builder");
            }

            private void A() {
                if ((this.f146062d & 512) != 512) {
                    this.f146072n = new ArrayList(this.f146072n);
                    this.f146062d |= 512;
                }
            }

            private void C() {
                if ((this.f146062d & 256) != 256) {
                    this.f146071m = new ArrayList(this.f146071m);
                    this.f146062d |= 256;
                }
            }

            private void D() {
                if ((this.f146062d & 32) != 32) {
                    this.f146068j = new ArrayList(this.f146068j);
                    this.f146062d |= 32;
                }
            }

            private void E() {
                if ((this.f146062d & 1024) != 1024) {
                    this.f146073o = new ArrayList(this.f146073o);
                    this.f146062d |= 1024;
                }
            }

            private void F() {
                if ((this.f146062d & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                    this.f146075q = new ArrayList(this.f146075q);
                    this.f146062d |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f146062d & 16384) != 16384) {
                    this.f146077s = new ArrayList(this.f146077s);
                    this.f146062d |= 16384;
                }
            }

            public Builder H(Contract contract) {
                if ((this.f146062d & 8192) != 8192 || this.f146076r == Contract.u()) {
                    this.f146076r = contract;
                } else {
                    this.f146076r = Contract.A(this.f146076r).n(contract).r();
                }
                this.f146062d |= 8192;
                return this;
            }

            public Builder K(Type type) {
                if ((this.f146062d & 64) != 64 || this.f146069k == Type.Y()) {
                    this.f146069k = type;
                } else {
                    this.f146069k = Type.A0(this.f146069k).n(type).w();
                }
                this.f146062d |= 64;
                return this;
            }

            public Builder L(Type type) {
                if ((this.f146062d & 8) != 8 || this.f146066h == Type.Y()) {
                    this.f146066h = type;
                } else {
                    this.f146066h = Type.A0(this.f146066h).n(type).w();
                }
                this.f146062d |= 8;
                return this;
            }

            public Builder M(TypeTable typeTable) {
                if ((this.f146062d & RecyclerView.m.FLAG_MOVED) != 2048 || this.f146074p == TypeTable.x()) {
                    this.f146074p = typeTable;
                } else {
                    this.f146074p = TypeTable.F(this.f146074p).n(typeTable).r();
                }
                this.f146062d |= RecyclerView.m.FLAG_MOVED;
                return this;
            }

            public Builder N(int i10) {
                this.f146062d |= 1;
                this.f146063e = i10;
                return this;
            }

            public Builder O(int i10) {
                this.f146062d |= 4;
                this.f146065g = i10;
                return this;
            }

            public Builder P(int i10) {
                this.f146062d |= 2;
                this.f146064f = i10;
                return this;
            }

            public Builder Q(int i10) {
                this.f146062d |= 128;
                this.f146070l = i10;
                return this;
            }

            public Builder R(int i10) {
                this.f146062d |= 16;
                this.f146067i = i10;
                return this;
            }

            public Function w() {
                Function function = new Function(this);
                int i10 = this.f146062d;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                function.f146044e = this.f146063e;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                function.f146045f = this.f146064f;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                function.f146046g = this.f146065g;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                function.f146047h = this.f146066h;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                function.f146048i = this.f146067i;
                if ((this.f146062d & 32) == 32) {
                    this.f146068j = Collections.unmodifiableList(this.f146068j);
                    this.f146062d &= -33;
                }
                function.f146049j = this.f146068j;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                function.f146050k = this.f146069k;
                if ((i10 & 128) == 128) {
                    i11 |= 64;
                }
                function.f146051l = this.f146070l;
                if ((this.f146062d & 256) == 256) {
                    this.f146071m = Collections.unmodifiableList(this.f146071m);
                    this.f146062d &= -257;
                }
                function.f146052m = this.f146071m;
                if ((this.f146062d & 512) == 512) {
                    this.f146072n = Collections.unmodifiableList(this.f146072n);
                    this.f146062d &= -513;
                }
                function.f146053n = this.f146072n;
                if ((this.f146062d & 1024) == 1024) {
                    this.f146073o = Collections.unmodifiableList(this.f146073o);
                    this.f146062d &= -1025;
                }
                function.f146055p = this.f146073o;
                if ((i10 & RecyclerView.m.FLAG_MOVED) == 2048) {
                    i11 |= 128;
                }
                function.f146056q = this.f146074p;
                if ((this.f146062d & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    this.f146075q = Collections.unmodifiableList(this.f146075q);
                    this.f146062d &= -4097;
                }
                function.f146057r = this.f146075q;
                if ((i10 & 8192) == 8192) {
                    i11 |= 256;
                }
                function.f146058s = this.f146076r;
                if ((this.f146062d & 16384) == 16384) {
                    this.f146077s = Collections.unmodifiableList(this.f146077s);
                    this.f146062d &= -16385;
                }
                function.f146059t = this.f146077s;
                function.f146043d = i11;
                return function;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f146068j = list;
                this.f146069k = Type.Y();
                this.f146071m = list;
                this.f146072n = list;
                this.f146073o = list;
                this.f146074p = TypeTable.x();
                this.f146075q = list;
                this.f146076r = Contract.u();
                this.f146077s = list;
                G();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: I, reason: merged with bridge method [inline-methods] */
            public Builder n(Function function) {
                if (function == Function.f0()) {
                    return this;
                }
                if (function.y0()) {
                    N(function.h0());
                }
                if (function.A0()) {
                    P(function.j0());
                }
                if (function.z0()) {
                    O(function.i0());
                }
                if (function.D0()) {
                    L(function.m0());
                }
                if (function.E0()) {
                    R(function.n0());
                }
                if (!function.f146049j.isEmpty()) {
                    if (this.f146068j.isEmpty()) {
                        this.f146068j = function.f146049j;
                        this.f146062d &= -33;
                    } else {
                        D();
                        this.f146068j.addAll(function.f146049j);
                    }
                }
                if (function.B0()) {
                    K(function.k0());
                }
                if (function.C0()) {
                    Q(function.l0());
                }
                if (!function.f146052m.isEmpty()) {
                    if (this.f146071m.isEmpty()) {
                        this.f146071m = function.f146052m;
                        this.f146062d &= -257;
                    } else {
                        C();
                        this.f146071m.addAll(function.f146052m);
                    }
                }
                if (!function.f146053n.isEmpty()) {
                    if (this.f146072n.isEmpty()) {
                        this.f146072n = function.f146053n;
                        this.f146062d &= -513;
                    } else {
                        A();
                        this.f146072n.addAll(function.f146053n);
                    }
                }
                if (!function.f146055p.isEmpty()) {
                    if (this.f146073o.isEmpty()) {
                        this.f146073o = function.f146055p;
                        this.f146062d &= -1025;
                    } else {
                        E();
                        this.f146073o.addAll(function.f146055p);
                    }
                }
                if (function.F0()) {
                    M(function.s0());
                }
                if (!function.f146057r.isEmpty()) {
                    if (this.f146075q.isEmpty()) {
                        this.f146075q = function.f146057r;
                        this.f146062d &= -4097;
                    } else {
                        F();
                        this.f146075q.addAll(function.f146057r);
                    }
                }
                if (function.x0()) {
                    H(function.e0());
                }
                if (!function.f146059t.isEmpty()) {
                    if (this.f146077s.isEmpty()) {
                        this.f146077s = function.f146059t;
                        this.f146062d &= -16385;
                    } else {
                        z();
                        this.f146077s.addAll(function.f146059t);
                    }
                }
                t(function);
                o(m().e(function.f146042c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public Function build() {
                Function functionW = w();
                if (functionW.a()) {
                    return functionW;
                }
                throw AbstractMessageLite.Builder.k(functionW);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return y().n(w());
            }
        }

        static class a extends AbstractParser<Function> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Function c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Function(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        private void G0() {
            this.f146044e = 6;
            this.f146045f = 6;
            this.f146046g = 0;
            this.f146047h = Type.Y();
            this.f146048i = 0;
            List list = Collections.EMPTY_LIST;
            this.f146049j = list;
            this.f146050k = Type.Y();
            this.f146051l = 0;
            this.f146052m = list;
            this.f146053n = list;
            this.f146055p = list;
            this.f146056q = TypeTable.x();
            this.f146057r = list;
            this.f146058s = Contract.u();
            this.f146059t = list;
        }

        static {
            Function function = new Function(true);
            f146040w = function;
            function.G0();
        }

        public static Function K0(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return f146041x.a(inputStream, extensionRegistryLite);
        }

        public static Function f0() {
            return f146040w;
        }

        public boolean A0() {
            return (this.f146043d & 2) == 2;
        }

        public boolean B0() {
            return (this.f146043d & 32) == 32;
        }

        public boolean C0() {
            return (this.f146043d & 64) == 64;
        }

        public boolean D0() {
            return (this.f146043d & 8) == 8;
        }

        public boolean E0() {
            return (this.f146043d & 16) == 16;
        }

        public boolean F0() {
            return (this.f146043d & 128) == 128;
        }

        public CompilerPluginData Y(int i10) {
            return this.f146059t.get(i10);
        }

        public int Z() {
            return this.f146059t.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146060u;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!z0()) {
                this.f146060u = (byte) 0;
                return false;
            }
            if (D0() && !m0().a()) {
                this.f146060u = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < p0(); i10++) {
                if (!o0(i10).a()) {
                    this.f146060u = (byte) 0;
                    return false;
                }
            }
            if (B0() && !k0().a()) {
                this.f146060u = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < b0(); i11++) {
                if (!a0(i11).a()) {
                    this.f146060u = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < u0(); i12++) {
                if (!t0(i12).a()) {
                    this.f146060u = (byte) 0;
                    return false;
                }
            }
            if (F0() && !s0().a()) {
                this.f146060u = (byte) 0;
                return false;
            }
            if (x0() && !e0().a()) {
                this.f146060u = (byte) 0;
                return false;
            }
            for (int i13 = 0; i13 < Z(); i13++) {
                if (!Y(i13).a()) {
                    this.f146060u = (byte) 0;
                    return false;
                }
            }
            if (s()) {
                this.f146060u = (byte) 1;
                return true;
            }
            this.f146060u = (byte) 0;
            return false;
        }

        public Type a0(int i10) {
            return this.f146052m.get(i10);
        }

        public int b0() {
            return this.f146052m.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146061v;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f146043d & 2) == 2 ? CodedOutputStream.o(1, this.f146045f) : 0;
            if ((this.f146043d & 4) == 4) {
                iO += CodedOutputStream.o(2, this.f146046g);
            }
            if ((this.f146043d & 8) == 8) {
                iO += CodedOutputStream.s(3, this.f146047h);
            }
            for (int i11 = 0; i11 < this.f146049j.size(); i11++) {
                iO += CodedOutputStream.s(4, this.f146049j.get(i11));
            }
            if ((this.f146043d & 32) == 32) {
                iO += CodedOutputStream.s(5, this.f146050k);
            }
            for (int i12 = 0; i12 < this.f146055p.size(); i12++) {
                iO += CodedOutputStream.s(6, this.f146055p.get(i12));
            }
            if ((this.f146043d & 16) == 16) {
                iO += CodedOutputStream.o(7, this.f146048i);
            }
            if ((this.f146043d & 64) == 64) {
                iO += CodedOutputStream.o(8, this.f146051l);
            }
            if ((this.f146043d & 1) == 1) {
                iO += CodedOutputStream.o(9, this.f146044e);
            }
            for (int i13 = 0; i13 < this.f146052m.size(); i13++) {
                iO += CodedOutputStream.s(10, this.f146052m.get(i13));
            }
            int iP = 0;
            for (int i14 = 0; i14 < this.f146053n.size(); i14++) {
                iP += CodedOutputStream.p(this.f146053n.get(i14).intValue());
            }
            int iS = iO + iP;
            if (!c0().isEmpty()) {
                iS = iS + 1 + CodedOutputStream.p(iP);
            }
            this.f146054o = iP;
            if ((this.f146043d & 128) == 128) {
                iS += CodedOutputStream.s(30, this.f146056q);
            }
            int iP2 = 0;
            for (int i15 = 0; i15 < this.f146057r.size(); i15++) {
                iP2 += CodedOutputStream.p(this.f146057r.get(i15).intValue());
            }
            int size = iS + iP2 + (w0().size() * 2);
            if ((this.f146043d & 256) == 256) {
                size += CodedOutputStream.s(32, this.f146058s);
            }
            for (int i16 = 0; i16 < this.f146059t.size(); i16++) {
                size += CodedOutputStream.s(33, this.f146059t.get(i16));
            }
            int iT = size + t() + this.f146042c.size();
            this.f146061v = iT;
            return iT;
        }

        public List<Integer> c0() {
            return this.f146053n;
        }

        public List<Type> d0() {
            return this.f146052m;
        }

        public Contract e0() {
            return this.f146058s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Function> f() {
            return f146041x;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public Function e() {
            return f146040w;
        }

        public int h0() {
            return this.f146044e;
        }

        public int i0() {
            return this.f146046g;
        }

        public int j0() {
            return this.f146045f;
        }

        public Type k0() {
            return this.f146050k;
        }

        public int l0() {
            return this.f146051l;
        }

        public Type m0() {
            return this.f146047h;
        }

        public int n0() {
            return this.f146048i;
        }

        public TypeParameter o0(int i10) {
            return this.f146049j.get(i10);
        }

        public int p0() {
            return this.f146049j.size();
        }

        public List<TypeParameter> q0() {
            return this.f146049j;
        }

        public TypeTable s0() {
            return this.f146056q;
        }

        public ValueParameter t0(int i10) {
            return this.f146055p.get(i10);
        }

        public int u0() {
            return this.f146055p.size();
        }

        public List<ValueParameter> v0() {
            return this.f146055p;
        }

        public List<Integer> w0() {
            return this.f146057r;
        }

        public boolean x0() {
            return (this.f146043d & 256) == 256;
        }

        public boolean y0() {
            return (this.f146043d & 1) == 1;
        }

        public boolean z0() {
            return (this.f146043d & 4) == 4;
        }

        private Function(GeneratedMessageLite.ExtendableBuilder<Function, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f146054o = -1;
            this.f146060u = (byte) -1;
            this.f146061v = -1;
            this.f146042c = extendableBuilder.m();
        }

        public static Builder H0() {
            return Builder.y();
        }

        public static Builder I0(Function function) {
            return H0().n(function);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: J0, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return H0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: L0, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return I0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterZ = z();
            if ((this.f146043d & 2) == 2) {
                codedOutputStream.a0(1, this.f146045f);
            }
            if ((this.f146043d & 4) == 4) {
                codedOutputStream.a0(2, this.f146046g);
            }
            if ((this.f146043d & 8) == 8) {
                codedOutputStream.d0(3, this.f146047h);
            }
            for (int i10 = 0; i10 < this.f146049j.size(); i10++) {
                codedOutputStream.d0(4, this.f146049j.get(i10));
            }
            if ((this.f146043d & 32) == 32) {
                codedOutputStream.d0(5, this.f146050k);
            }
            for (int i11 = 0; i11 < this.f146055p.size(); i11++) {
                codedOutputStream.d0(6, this.f146055p.get(i11));
            }
            if ((this.f146043d & 16) == 16) {
                codedOutputStream.a0(7, this.f146048i);
            }
            if ((this.f146043d & 64) == 64) {
                codedOutputStream.a0(8, this.f146051l);
            }
            if ((this.f146043d & 1) == 1) {
                codedOutputStream.a0(9, this.f146044e);
            }
            for (int i12 = 0; i12 < this.f146052m.size(); i12++) {
                codedOutputStream.d0(10, this.f146052m.get(i12));
            }
            if (c0().size() > 0) {
                codedOutputStream.o0(90);
                codedOutputStream.o0(this.f146054o);
            }
            for (int i13 = 0; i13 < this.f146053n.size(); i13++) {
                codedOutputStream.b0(this.f146053n.get(i13).intValue());
            }
            if ((this.f146043d & 128) == 128) {
                codedOutputStream.d0(30, this.f146056q);
            }
            for (int i14 = 0; i14 < this.f146057r.size(); i14++) {
                codedOutputStream.a0(31, this.f146057r.get(i14).intValue());
            }
            if ((this.f146043d & 256) == 256) {
                codedOutputStream.d0(32, this.f146058s);
            }
            for (int i15 = 0; i15 < this.f146059t.size(); i15++) {
                codedOutputStream.d0(33, this.f146059t.get(i15));
            }
            extensionWriterZ.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f146042c);
        }

        private Function(boolean z10) {
            this.f146054o = -1;
            this.f146060u = (byte) -1;
            this.f146061v = -1;
            this.f146042c = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r7v11 */
        /* JADX WARN: Type inference failed for: r7v13 */
        /* JADX WARN: Type inference failed for: r7v15 */
        /* JADX WARN: Type inference failed for: r7v17 */
        /* JADX WARN: Type inference failed for: r7v3 */
        /* JADX WARN: Type inference failed for: r7v5 */
        /* JADX WARN: Type inference failed for: r7v7 */
        /* JADX WARN: Type inference failed for: r7v9 */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v2, types: [boolean] */
        private Function(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            boolean z10;
            this.f146054o = -1;
            this.f146060u = (byte) -1;
            this.f146061v = -1;
            G0();
            ByteString.Output outputT = ByteString.t();
            boolean z11 = true;
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z12 = false;
            char c10 = 0;
            while (true) {
                ?? P10 = 1024;
                if (!z12) {
                    try {
                        try {
                            int iK = codedInputStream.K();
                            switch (iK) {
                                case 0:
                                    z10 = z11;
                                    z12 = z10;
                                    z11 = z10;
                                    c10 = c10;
                                case 8:
                                    z10 = z11;
                                    this.f146043d |= 2;
                                    this.f146045f = codedInputStream.s();
                                    z11 = z10;
                                    c10 = c10;
                                case 16:
                                    z10 = z11;
                                    this.f146043d |= 4;
                                    this.f146046g = codedInputStream.s();
                                    z11 = z10;
                                    c10 = c10;
                                case 26:
                                    z10 = z11;
                                    Type.Builder builderB = (this.f146043d & 8) == 8 ? this.f146047h.b() : null;
                                    Type type = (Type) codedInputStream.u(Type.f146198v, extensionRegistryLite);
                                    this.f146047h = type;
                                    if (builderB != null) {
                                        builderB.n(type);
                                        this.f146047h = builderB.w();
                                    }
                                    this.f146043d |= 8;
                                    z11 = z10;
                                    c10 = c10;
                                case 34:
                                    z10 = z11;
                                    int i10 = (c10 == true ? 1 : 0) & 32;
                                    c10 = c10;
                                    if (i10 != 32) {
                                        this.f146049j = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | ' ';
                                    }
                                    this.f146049j.add(codedInputStream.u(TypeParameter.f146280o, extensionRegistryLite));
                                    z11 = z10;
                                    c10 = c10;
                                case 42:
                                    z10 = z11;
                                    Type.Builder builderB2 = (this.f146043d & 32) == 32 ? this.f146050k.b() : null;
                                    Type type2 = (Type) codedInputStream.u(Type.f146198v, extensionRegistryLite);
                                    this.f146050k = type2;
                                    if (builderB2 != null) {
                                        builderB2.n(type2);
                                        this.f146050k = builderB2.w();
                                    }
                                    this.f146043d |= 32;
                                    z11 = z10;
                                    c10 = c10;
                                case 50:
                                    z10 = z11;
                                    int i11 = (c10 == true ? 1 : 0) & 1024;
                                    c10 = c10;
                                    if (i11 != 1024) {
                                        this.f146055p = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 1024;
                                    }
                                    this.f146055p.add(codedInputStream.u(ValueParameter.f146317n, extensionRegistryLite));
                                    z11 = z10;
                                    c10 = c10;
                                case 56:
                                    z10 = z11;
                                    this.f146043d |= 16;
                                    this.f146048i = codedInputStream.s();
                                    z11 = z10;
                                    c10 = c10;
                                case 64:
                                    z10 = z11;
                                    this.f146043d |= 64;
                                    this.f146051l = codedInputStream.s();
                                    z11 = z10;
                                    c10 = c10;
                                case 72:
                                    z10 = z11;
                                    this.f146043d |= 1;
                                    this.f146044e = codedInputStream.s();
                                    z11 = z10;
                                    c10 = c10;
                                case 82:
                                    z10 = z11;
                                    int i12 = (c10 == true ? 1 : 0) & 256;
                                    c10 = c10;
                                    if (i12 != 256) {
                                        this.f146052m = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 256;
                                    }
                                    this.f146052m.add(codedInputStream.u(Type.f146198v, extensionRegistryLite));
                                    z11 = z10;
                                    c10 = c10;
                                case 88:
                                    z10 = z11;
                                    int i13 = (c10 == true ? 1 : 0) & 512;
                                    c10 = c10;
                                    if (i13 != 512) {
                                        this.f146053n = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 512;
                                    }
                                    this.f146053n.add(Integer.valueOf(codedInputStream.s()));
                                    z11 = z10;
                                    c10 = c10;
                                case 90:
                                    z10 = z11;
                                    int iJ = codedInputStream.j(codedInputStream.A());
                                    int i14 = (c10 == true ? 1 : 0) & 512;
                                    c10 = c10;
                                    if (i14 != 512) {
                                        c10 = c10;
                                        if (codedInputStream.e() > 0) {
                                            this.f146053n = new ArrayList();
                                            c10 = (c10 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (codedInputStream.e() > 0) {
                                        this.f146053n.add(Integer.valueOf(codedInputStream.s()));
                                    }
                                    codedInputStream.i(iJ);
                                    z11 = z10;
                                    c10 = c10;
                                case 242:
                                    z10 = z11;
                                    TypeTable.Builder builderB3 = (this.f146043d & 128) == 128 ? this.f146056q.b() : null;
                                    TypeTable typeTable = (TypeTable) codedInputStream.u(TypeTable.f146306i, extensionRegistryLite);
                                    this.f146056q = typeTable;
                                    if (builderB3 != null) {
                                        builderB3.n(typeTable);
                                        this.f146056q = builderB3.r();
                                    }
                                    this.f146043d |= 128;
                                    z11 = z10;
                                    c10 = c10;
                                case 248:
                                    z10 = z11;
                                    int i15 = (c10 == true ? 1 : 0) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                                    c10 = c10;
                                    if (i15 != 4096) {
                                        this.f146057r = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 4096;
                                    }
                                    this.f146057r.add(Integer.valueOf(codedInputStream.s()));
                                    z11 = z10;
                                    c10 = c10;
                                case 250:
                                    int iJ2 = codedInputStream.j(codedInputStream.A());
                                    int i16 = (c10 == true ? 1 : 0) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                                    c10 = c10;
                                    if (i16 != 4096) {
                                        c10 = c10;
                                        if (codedInputStream.e() > 0) {
                                            this.f146057r = new ArrayList();
                                            c10 = (c10 == true ? 1 : 0) | 4096;
                                        }
                                    }
                                    while (codedInputStream.e() > 0) {
                                        this.f146057r.add(Integer.valueOf(codedInputStream.s()));
                                        z11 = z11;
                                    }
                                    z10 = z11;
                                    codedInputStream.i(iJ2);
                                    z11 = z10;
                                    c10 = c10;
                                case 258:
                                    Contract.Builder builderB4 = (this.f146043d & 256) == 256 ? this.f146058s.b() : null;
                                    Contract contract = (Contract) codedInputStream.u(Contract.f145970g, extensionRegistryLite);
                                    this.f146058s = contract;
                                    if (builderB4 != null) {
                                        builderB4.n(contract);
                                        this.f146058s = builderB4.r();
                                    }
                                    this.f146043d |= 256;
                                    c10 = c10;
                                    z10 = z11;
                                    z11 = z10;
                                    c10 = c10;
                                case 266:
                                    int i17 = (c10 == true ? 1 : 0) & 16384;
                                    char c11 = c10;
                                    if (i17 != 16384) {
                                        this.f146059t = new ArrayList();
                                        c11 = (c10 == true ? 1 : 0) | 16384;
                                    }
                                    this.f146059t.add(codedInputStream.u(CompilerPluginData.f145944i, extensionRegistryLite));
                                    c10 = c11;
                                    z10 = z11;
                                    z11 = z10;
                                    c10 = c10;
                                default:
                                    P10 = p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK);
                                    c10 = c10;
                                    if (P10 == 0) {
                                        z12 = z11;
                                        z10 = z12;
                                    } else {
                                        z10 = z11;
                                    }
                                    z11 = z10;
                                    c10 = c10;
                            }
                        } catch (Throwable th2) {
                            if (((c10 == true ? 1 : 0) & 32) == 32) {
                                this.f146049j = Collections.unmodifiableList(this.f146049j);
                            }
                            if (((c10 == true ? 1 : 0) & 1024) == P10) {
                                this.f146055p = Collections.unmodifiableList(this.f146055p);
                            }
                            if (((c10 == true ? 1 : 0) & 256) == 256) {
                                this.f146052m = Collections.unmodifiableList(this.f146052m);
                            }
                            if (((c10 == true ? 1 : 0) & 512) == 512) {
                                this.f146053n = Collections.unmodifiableList(this.f146053n);
                            }
                            if (((c10 == true ? 1 : 0) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                                this.f146057r = Collections.unmodifiableList(this.f146057r);
                            }
                            if (((c10 == true ? 1 : 0) & 16384) == 16384) {
                                this.f146059t = Collections.unmodifiableList(this.f146059t);
                            }
                            try {
                                codedOutputStreamJ.I();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f146042c = outputT.g();
                                throw th3;
                            }
                            this.f146042c = outputT.g();
                            m();
                            throw th2;
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } else {
                    if (((c10 == true ? 1 : 0) & 32) == 32) {
                        this.f146049j = Collections.unmodifiableList(this.f146049j);
                    }
                    if (((c10 == true ? 1 : 0) & 1024) == 1024) {
                        this.f146055p = Collections.unmodifiableList(this.f146055p);
                    }
                    if (((c10 == true ? 1 : 0) & 256) == 256) {
                        this.f146052m = Collections.unmodifiableList(this.f146052m);
                    }
                    if (((c10 == true ? 1 : 0) & 512) == 512) {
                        this.f146053n = Collections.unmodifiableList(this.f146053n);
                    }
                    if (((c10 == true ? 1 : 0) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                        this.f146057r = Collections.unmodifiableList(this.f146057r);
                    }
                    if (((c10 == true ? 1 : 0) & 16384) == 16384) {
                        this.f146059t = Collections.unmodifiableList(this.f146059t);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        this.f146042c = outputT.g();
                        throw th4;
                    }
                    this.f146042c = outputT.g();
                    m();
                    return;
                }
            }
        }
    }

    public interface FunctionOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public enum MemberKind implements Internal.EnumLite {
        DECLARATION(0, 0),
        FAKE_OVERRIDE(1, 1),
        DELEGATION(2, 2),
        SYNTHESIZED(3, 3);


        /* renamed from: f, reason: collision with root package name */
        private static Internal.EnumLiteMap<MemberKind> f146082f = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f146084a;

        static class a implements Internal.EnumLiteMap<MemberKind> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public MemberKind a(int i10) {
                return MemberKind.a(i10);
            }
        }

        public static MemberKind a(int i10) {
            if (i10 == 0) {
                return DECLARATION;
            }
            if (i10 == 1) {
                return FAKE_OVERRIDE;
            }
            if (i10 == 2) {
                return DELEGATION;
            }
            if (i10 != 3) {
                return null;
            }
            return SYNTHESIZED;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int g() {
            return this.f146084a;
        }

        MemberKind(int i10, int i11) {
            this.f146084a = i11;
        }
    }

    public enum Modality implements Internal.EnumLite {
        FINAL(0, 0),
        OPEN(1, 1),
        ABSTRACT(2, 2),
        SEALED(3, 3);


        /* renamed from: f, reason: collision with root package name */
        private static Internal.EnumLiteMap<Modality> f146089f = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f146091a;

        static class a implements Internal.EnumLiteMap<Modality> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Modality a(int i10) {
                return Modality.a(i10);
            }
        }

        public static Modality a(int i10) {
            if (i10 == 0) {
                return FINAL;
            }
            if (i10 == 1) {
                return OPEN;
            }
            if (i10 == 2) {
                return ABSTRACT;
            }
            if (i10 != 3) {
                return null;
            }
            return SEALED;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int g() {
            return this.f146091a;
        }

        Modality(int i10, int i11) {
            this.f146091a = i11;
        }
    }

    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {

        /* renamed from: l, reason: collision with root package name */
        private static final Package f146092l;

        /* renamed from: m, reason: collision with root package name */
        public static Parser<Package> f146093m = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f146094c;

        /* renamed from: d, reason: collision with root package name */
        private int f146095d;

        /* renamed from: e, reason: collision with root package name */
        private List<Function> f146096e;

        /* renamed from: f, reason: collision with root package name */
        private List<Property> f146097f;

        /* renamed from: g, reason: collision with root package name */
        private List<TypeAlias> f146098g;

        /* renamed from: h, reason: collision with root package name */
        private TypeTable f146099h;

        /* renamed from: i, reason: collision with root package name */
        private VersionRequirementTable f146100i;

        /* renamed from: j, reason: collision with root package name */
        private byte f146101j;

        /* renamed from: k, reason: collision with root package name */
        private int f146102k;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f146103d;

            /* renamed from: e, reason: collision with root package name */
            private List<Function> f146104e;

            /* renamed from: f, reason: collision with root package name */
            private List<Property> f146105f;

            /* renamed from: g, reason: collision with root package name */
            private List<TypeAlias> f146106g;

            /* renamed from: h, reason: collision with root package name */
            private TypeTable f146107h;

            /* renamed from: i, reason: collision with root package name */
            private VersionRequirementTable f146108i;

            private void D() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.f146093m     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$Builder");
            }

            private void A() {
                if ((this.f146103d & 2) != 2) {
                    this.f146105f = new ArrayList(this.f146105f);
                    this.f146103d |= 2;
                }
            }

            private void C() {
                if ((this.f146103d & 4) != 4) {
                    this.f146106g = new ArrayList(this.f146106g);
                    this.f146103d |= 4;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f146103d & 1) != 1) {
                    this.f146104e = new ArrayList(this.f146104e);
                    this.f146103d |= 1;
                }
            }

            public Builder G(TypeTable typeTable) {
                if ((this.f146103d & 8) != 8 || this.f146107h == TypeTable.x()) {
                    this.f146107h = typeTable;
                } else {
                    this.f146107h = TypeTable.F(this.f146107h).n(typeTable).r();
                }
                this.f146103d |= 8;
                return this;
            }

            public Builder H(VersionRequirementTable versionRequirementTable) {
                if ((this.f146103d & 16) != 16 || this.f146108i == VersionRequirementTable.u()) {
                    this.f146108i = versionRequirementTable;
                } else {
                    this.f146108i = VersionRequirementTable.A(this.f146108i).n(versionRequirementTable).r();
                }
                this.f146103d |= 16;
                return this;
            }

            public Package w() {
                Package r02 = new Package(this);
                int i10 = this.f146103d;
                if ((i10 & 1) == 1) {
                    this.f146104e = Collections.unmodifiableList(this.f146104e);
                    this.f146103d &= -2;
                }
                r02.f146096e = this.f146104e;
                if ((this.f146103d & 2) == 2) {
                    this.f146105f = Collections.unmodifiableList(this.f146105f);
                    this.f146103d &= -3;
                }
                r02.f146097f = this.f146105f;
                if ((this.f146103d & 4) == 4) {
                    this.f146106g = Collections.unmodifiableList(this.f146106g);
                    this.f146103d &= -5;
                }
                r02.f146098g = this.f146106g;
                int i11 = (i10 & 8) != 8 ? 0 : 1;
                r02.f146099h = this.f146107h;
                if ((i10 & 16) == 16) {
                    i11 |= 2;
                }
                r02.f146100i = this.f146108i;
                r02.f146095d = i11;
                return r02;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f146104e = list;
                this.f146105f = list;
                this.f146106g = list;
                this.f146107h = TypeTable.x();
                this.f146108i = VersionRequirementTable.u();
                D();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            public Builder n(Package r32) {
                if (r32 == Package.L()) {
                    return this;
                }
                if (!r32.f146096e.isEmpty()) {
                    if (this.f146104e.isEmpty()) {
                        this.f146104e = r32.f146096e;
                        this.f146103d &= -2;
                    } else {
                        z();
                        this.f146104e.addAll(r32.f146096e);
                    }
                }
                if (!r32.f146097f.isEmpty()) {
                    if (this.f146105f.isEmpty()) {
                        this.f146105f = r32.f146097f;
                        this.f146103d &= -3;
                    } else {
                        A();
                        this.f146105f.addAll(r32.f146097f);
                    }
                }
                if (!r32.f146098g.isEmpty()) {
                    if (this.f146106g.isEmpty()) {
                        this.f146106g = r32.f146098g;
                        this.f146103d &= -5;
                    } else {
                        C();
                        this.f146106g.addAll(r32.f146098g);
                    }
                }
                if (r32.Y()) {
                    G(r32.W());
                }
                if (r32.Z()) {
                    H(r32.X());
                }
                t(r32);
                o(m().e(r32.f146094c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public Package build() {
                Package packageW = w();
                if (packageW.a()) {
                    return packageW;
                }
                throw AbstractMessageLite.Builder.k(packageW);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return y().n(w());
            }
        }

        static class a extends AbstractParser<Package> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Package c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Package(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        static {
            Package r02 = new Package(true);
            f146092l = r02;
            r02.a0();
        }

        public static Package L() {
            return f146092l;
        }

        private void a0() {
            List list = Collections.EMPTY_LIST;
            this.f146096e = list;
            this.f146097f = list;
            this.f146098g = list;
            this.f146099h = TypeTable.x();
            this.f146100i = VersionRequirementTable.u();
        }

        public static Package e0(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return f146093m.a(inputStream, extensionRegistryLite);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public Package e() {
            return f146092l;
        }

        public Function N(int i10) {
            return this.f146096e.get(i10);
        }

        public int O() {
            return this.f146096e.size();
        }

        public List<Function> P() {
            return this.f146096e;
        }

        public Property Q(int i10) {
            return this.f146097f.get(i10);
        }

        public int R() {
            return this.f146097f.size();
        }

        public List<Property> S() {
            return this.f146097f;
        }

        public TypeAlias T(int i10) {
            return this.f146098g.get(i10);
        }

        public int U() {
            return this.f146098g.size();
        }

        public List<TypeAlias> V() {
            return this.f146098g;
        }

        public TypeTable W() {
            return this.f146099h;
        }

        public VersionRequirementTable X() {
            return this.f146100i;
        }

        public boolean Y() {
            return (this.f146095d & 1) == 1;
        }

        public boolean Z() {
            return (this.f146095d & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146101j;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < O(); i10++) {
                if (!N(i10).a()) {
                    this.f146101j = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < R(); i11++) {
                if (!Q(i11).a()) {
                    this.f146101j = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < U(); i12++) {
                if (!T(i12).a()) {
                    this.f146101j = (byte) 0;
                    return false;
                }
            }
            if (Y() && !W().a()) {
                this.f146101j = (byte) 0;
                return false;
            }
            if (s()) {
                this.f146101j = (byte) 1;
                return true;
            }
            this.f146101j = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146102k;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f146096e.size(); i11++) {
                iS += CodedOutputStream.s(3, this.f146096e.get(i11));
            }
            for (int i12 = 0; i12 < this.f146097f.size(); i12++) {
                iS += CodedOutputStream.s(4, this.f146097f.get(i12));
            }
            for (int i13 = 0; i13 < this.f146098g.size(); i13++) {
                iS += CodedOutputStream.s(5, this.f146098g.get(i13));
            }
            if ((this.f146095d & 1) == 1) {
                iS += CodedOutputStream.s(30, this.f146099h);
            }
            if ((this.f146095d & 2) == 2) {
                iS += CodedOutputStream.s(32, this.f146100i);
            }
            int iT = iS + t() + this.f146094c.size();
            this.f146102k = iT;
            return iT;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Package> f() {
            return f146093m;
        }

        private Package(GeneratedMessageLite.ExtendableBuilder<Package, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f146101j = (byte) -1;
            this.f146102k = -1;
            this.f146094c = extendableBuilder.m();
        }

        public static Builder b0() {
            return Builder.y();
        }

        public static Builder c0(Package r12) {
            return b0().n(r12);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: d0, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return b0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: f0, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return c0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterZ = z();
            for (int i10 = 0; i10 < this.f146096e.size(); i10++) {
                codedOutputStream.d0(3, this.f146096e.get(i10));
            }
            for (int i11 = 0; i11 < this.f146097f.size(); i11++) {
                codedOutputStream.d0(4, this.f146097f.get(i11));
            }
            for (int i12 = 0; i12 < this.f146098g.size(); i12++) {
                codedOutputStream.d0(5, this.f146098g.get(i12));
            }
            if ((this.f146095d & 1) == 1) {
                codedOutputStream.d0(30, this.f146099h);
            }
            if ((this.f146095d & 2) == 2) {
                codedOutputStream.d0(32, this.f146100i);
            }
            extensionWriterZ.a(HttpResponseStatus.SUCCESS_OK, codedOutputStream);
            codedOutputStream.i0(this.f146094c);
        }

        private Package(boolean z10) {
            this.f146101j = (byte) -1;
            this.f146102k = -1;
            this.f146094c = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v8 */
        private Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f146101j = (byte) -1;
            this.f146102k = -1;
            a0();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            char c10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = codedInputStream.K();
                        if (iK != 0) {
                            if (iK == 26) {
                                int i10 = (c10 == true ? 1 : 0) & 1;
                                c10 = c10;
                                if (i10 != 1) {
                                    this.f146096e = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 1;
                                }
                                this.f146096e.add(codedInputStream.u(Function.f146041x, extensionRegistryLite));
                            } else if (iK == 34) {
                                int i11 = (c10 == true ? 1 : 0) & 2;
                                c10 = c10;
                                if (i11 != 2) {
                                    this.f146097f = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 2;
                                }
                                this.f146097f.add(codedInputStream.u(Property.f146125x, extensionRegistryLite));
                            } else if (iK != 42) {
                                if (iK == 242) {
                                    TypeTable.Builder builderB = (this.f146095d & 1) == 1 ? this.f146099h.b() : null;
                                    TypeTable typeTable = (TypeTable) codedInputStream.u(TypeTable.f146306i, extensionRegistryLite);
                                    this.f146099h = typeTable;
                                    if (builderB != null) {
                                        builderB.n(typeTable);
                                        this.f146099h = builderB.r();
                                    }
                                    this.f146095d |= 1;
                                } else if (iK != 258) {
                                    if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                    }
                                } else {
                                    VersionRequirementTable.Builder builderB2 = (this.f146095d & 2) == 2 ? this.f146100i.b() : null;
                                    VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.u(VersionRequirementTable.f146367g, extensionRegistryLite);
                                    this.f146100i = versionRequirementTable;
                                    if (builderB2 != null) {
                                        builderB2.n(versionRequirementTable);
                                        this.f146100i = builderB2.r();
                                    }
                                    this.f146095d |= 2;
                                }
                            } else {
                                int i12 = (c10 == true ? 1 : 0) & 4;
                                c10 = c10;
                                if (i12 != 4) {
                                    this.f146098g = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 4;
                                }
                                this.f146098g.add(codedInputStream.u(TypeAlias.f146253r, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (((c10 == true ? 1 : 0) & 1) == 1) {
                            this.f146096e = Collections.unmodifiableList(this.f146096e);
                        }
                        if (((c10 == true ? 1 : 0) & 2) == 2) {
                            this.f146097f = Collections.unmodifiableList(this.f146097f);
                        }
                        if (((c10 == true ? 1 : 0) & 4) == 4) {
                            this.f146098g = Collections.unmodifiableList(this.f146098g);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f146094c = outputT.g();
                            throw th3;
                        }
                        this.f146094c = outputT.g();
                        m();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            if (((c10 == true ? 1 : 0) & 1) == 1) {
                this.f146096e = Collections.unmodifiableList(this.f146096e);
            }
            if (((c10 == true ? 1 : 0) & 2) == 2) {
                this.f146097f = Collections.unmodifiableList(this.f146097f);
            }
            if (((c10 == true ? 1 : 0) & 4) == 4) {
                this.f146098g = Collections.unmodifiableList(this.f146098g);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f146094c = outputT.g();
                throw th4;
            }
            this.f146094c = outputT.g();
            m();
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {

        /* renamed from: k, reason: collision with root package name */
        private static final PackageFragment f146109k;

        /* renamed from: l, reason: collision with root package name */
        public static Parser<PackageFragment> f146110l = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f146111c;

        /* renamed from: d, reason: collision with root package name */
        private int f146112d;

        /* renamed from: e, reason: collision with root package name */
        private StringTable f146113e;

        /* renamed from: f, reason: collision with root package name */
        private QualifiedNameTable f146114f;

        /* renamed from: g, reason: collision with root package name */
        private Package f146115g;

        /* renamed from: h, reason: collision with root package name */
        private List<Class> f146116h;

        /* renamed from: i, reason: collision with root package name */
        private byte f146117i;

        /* renamed from: j, reason: collision with root package name */
        private int f146118j;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f146119d;

            /* renamed from: e, reason: collision with root package name */
            private StringTable f146120e = StringTable.u();

            /* renamed from: f, reason: collision with root package name */
            private QualifiedNameTable f146121f = QualifiedNameTable.u();

            /* renamed from: g, reason: collision with root package name */
            private Package f146122g = Package.L();

            /* renamed from: h, reason: collision with root package name */
            private List<Class> f146123h = Collections.EMPTY_LIST;

            private void A() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.f146110l     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f146119d & 8) != 8) {
                    this.f146123h = new ArrayList(this.f146123h);
                    this.f146119d |= 8;
                }
            }

            public Builder E(Package r42) {
                if ((this.f146119d & 4) != 4 || this.f146122g == Package.L()) {
                    this.f146122g = r42;
                } else {
                    this.f146122g = Package.c0(this.f146122g).n(r42).w();
                }
                this.f146119d |= 4;
                return this;
            }

            public Builder F(QualifiedNameTable qualifiedNameTable) {
                if ((this.f146119d & 2) != 2 || this.f146121f == QualifiedNameTable.u()) {
                    this.f146121f = qualifiedNameTable;
                } else {
                    this.f146121f = QualifiedNameTable.A(this.f146121f).n(qualifiedNameTable).r();
                }
                this.f146119d |= 2;
                return this;
            }

            public Builder G(StringTable stringTable) {
                if ((this.f146119d & 1) != 1 || this.f146120e == StringTable.u()) {
                    this.f146120e = stringTable;
                } else {
                    this.f146120e = StringTable.A(this.f146120e).n(stringTable).r();
                }
                this.f146119d |= 1;
                return this;
            }

            public PackageFragment w() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i10 = this.f146119d;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                packageFragment.f146113e = this.f146120e;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                packageFragment.f146114f = this.f146121f;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                packageFragment.f146115g = this.f146122g;
                if ((this.f146119d & 8) == 8) {
                    this.f146123h = Collections.unmodifiableList(this.f146123h);
                    this.f146119d &= -9;
                }
                packageFragment.f146116h = this.f146123h;
                packageFragment.f146112d = i11;
                return packageFragment;
            }

            private Builder() {
                A();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public Builder n(PackageFragment packageFragment) {
                if (packageFragment == PackageFragment.L()) {
                    return this;
                }
                if (packageFragment.S()) {
                    G(packageFragment.P());
                }
                if (packageFragment.R()) {
                    F(packageFragment.O());
                }
                if (packageFragment.Q()) {
                    E(packageFragment.N());
                }
                if (!packageFragment.f146116h.isEmpty()) {
                    if (this.f146123h.isEmpty()) {
                        this.f146123h = packageFragment.f146116h;
                        this.f146119d &= -9;
                    } else {
                        z();
                        this.f146123h.addAll(packageFragment.f146116h);
                    }
                }
                t(packageFragment);
                o(m().e(packageFragment.f146111c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public PackageFragment build() {
                PackageFragment packageFragmentW = w();
                if (packageFragmentW.a()) {
                    return packageFragmentW;
                }
                throw AbstractMessageLite.Builder.k(packageFragmentW);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return y().n(w());
            }
        }

        static class a extends AbstractParser<PackageFragment> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public PackageFragment c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new PackageFragment(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        static {
            PackageFragment packageFragment = new PackageFragment(true);
            f146109k = packageFragment;
            packageFragment.T();
        }

        public static PackageFragment L() {
            return f146109k;
        }

        public static PackageFragment X(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return f146110l.a(inputStream, extensionRegistryLite);
        }

        public Class I(int i10) {
            return this.f146116h.get(i10);
        }

        public int J() {
            return this.f146116h.size();
        }

        public List<Class> K() {
            return this.f146116h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public PackageFragment e() {
            return f146109k;
        }

        public Package N() {
            return this.f146115g;
        }

        public QualifiedNameTable O() {
            return this.f146114f;
        }

        public StringTable P() {
            return this.f146113e;
        }

        public boolean Q() {
            return (this.f146112d & 4) == 4;
        }

        public boolean R() {
            return (this.f146112d & 2) == 2;
        }

        public boolean S() {
            return (this.f146112d & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146117i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (R() && !O().a()) {
                this.f146117i = (byte) 0;
                return false;
            }
            if (Q() && !N().a()) {
                this.f146117i = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < J(); i10++) {
                if (!I(i10).a()) {
                    this.f146117i = (byte) 0;
                    return false;
                }
            }
            if (s()) {
                this.f146117i = (byte) 1;
                return true;
            }
            this.f146117i = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146118j;
            if (i10 != -1) {
                return i10;
            }
            int iS = (this.f146112d & 1) == 1 ? CodedOutputStream.s(1, this.f146113e) : 0;
            if ((this.f146112d & 2) == 2) {
                iS += CodedOutputStream.s(2, this.f146114f);
            }
            if ((this.f146112d & 4) == 4) {
                iS += CodedOutputStream.s(3, this.f146115g);
            }
            for (int i11 = 0; i11 < this.f146116h.size(); i11++) {
                iS += CodedOutputStream.s(4, this.f146116h.get(i11));
            }
            int iT = iS + t() + this.f146111c.size();
            this.f146118j = iT;
            return iT;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<PackageFragment> f() {
            return f146110l;
        }

        private PackageFragment(GeneratedMessageLite.ExtendableBuilder<PackageFragment, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f146117i = (byte) -1;
            this.f146118j = -1;
            this.f146111c = extendableBuilder.m();
        }

        private void T() {
            this.f146113e = StringTable.u();
            this.f146114f = QualifiedNameTable.u();
            this.f146115g = Package.L();
            this.f146116h = Collections.EMPTY_LIST;
        }

        public static Builder U() {
            return Builder.y();
        }

        public static Builder V(PackageFragment packageFragment) {
            return U().n(packageFragment);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: W, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return U();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: Y, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return V(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterZ = z();
            if ((this.f146112d & 1) == 1) {
                codedOutputStream.d0(1, this.f146113e);
            }
            if ((this.f146112d & 2) == 2) {
                codedOutputStream.d0(2, this.f146114f);
            }
            if ((this.f146112d & 4) == 4) {
                codedOutputStream.d0(3, this.f146115g);
            }
            for (int i10 = 0; i10 < this.f146116h.size(); i10++) {
                codedOutputStream.d0(4, this.f146116h.get(i10));
            }
            extensionWriterZ.a(HttpResponseStatus.SUCCESS_OK, codedOutputStream);
            codedOutputStream.i0(this.f146111c);
        }

        private PackageFragment(boolean z10) {
            this.f146117i = (byte) -1;
            this.f146118j = -1;
            this.f146111c = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private PackageFragment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f146117i = (byte) -1;
            this.f146118j = -1;
            T();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            char c10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = codedInputStream.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                StringTable.Builder builderB = (this.f146112d & 1) == 1 ? this.f146113e.b() : null;
                                StringTable stringTable = (StringTable) codedInputStream.u(StringTable.f146190g, extensionRegistryLite);
                                this.f146113e = stringTable;
                                if (builderB != null) {
                                    builderB.n(stringTable);
                                    this.f146113e = builderB.r();
                                }
                                this.f146112d |= 1;
                            } else if (iK == 18) {
                                QualifiedNameTable.Builder builderB2 = (this.f146112d & 2) == 2 ? this.f146114f.b() : null;
                                QualifiedNameTable qualifiedNameTable = (QualifiedNameTable) codedInputStream.u(QualifiedNameTable.f146163g, extensionRegistryLite);
                                this.f146114f = qualifiedNameTable;
                                if (builderB2 != null) {
                                    builderB2.n(qualifiedNameTable);
                                    this.f146114f = builderB2.r();
                                }
                                this.f146112d |= 2;
                            } else if (iK == 26) {
                                Package.Builder builderB3 = (this.f146112d & 4) == 4 ? this.f146115g.b() : null;
                                Package r62 = (Package) codedInputStream.u(Package.f146093m, extensionRegistryLite);
                                this.f146115g = r62;
                                if (builderB3 != null) {
                                    builderB3.n(r62);
                                    this.f146115g = builderB3.w();
                                }
                                this.f146112d |= 4;
                            } else if (iK != 34) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                int i10 = (c10 == true ? 1 : 0) & '\b';
                                c10 = c10;
                                if (i10 != 8) {
                                    this.f146116h = new ArrayList();
                                    c10 = '\b';
                                }
                                this.f146116h.add(codedInputStream.u(Class.f145871M, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (((c10 == true ? 1 : 0) & '\b') == 8) {
                            this.f146116h = Collections.unmodifiableList(this.f146116h);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f146111c = outputT.g();
                            throw th3;
                        }
                        this.f146111c = outputT.g();
                        m();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            if (((c10 == true ? 1 : 0) & '\b') == 8) {
                this.f146116h = Collections.unmodifiableList(this.f146116h);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f146111c = outputT.g();
                throw th4;
            }
            this.f146111c = outputT.g();
            m();
        }
    }

    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {

        /* renamed from: w, reason: collision with root package name */
        private static final Property f146124w;

        /* renamed from: x, reason: collision with root package name */
        public static Parser<Property> f146125x = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f146126c;

        /* renamed from: d, reason: collision with root package name */
        private int f146127d;

        /* renamed from: e, reason: collision with root package name */
        private int f146128e;

        /* renamed from: f, reason: collision with root package name */
        private int f146129f;

        /* renamed from: g, reason: collision with root package name */
        private int f146130g;

        /* renamed from: h, reason: collision with root package name */
        private Type f146131h;

        /* renamed from: i, reason: collision with root package name */
        private int f146132i;

        /* renamed from: j, reason: collision with root package name */
        private List<TypeParameter> f146133j;

        /* renamed from: k, reason: collision with root package name */
        private Type f146134k;

        /* renamed from: l, reason: collision with root package name */
        private int f146135l;

        /* renamed from: m, reason: collision with root package name */
        private List<Type> f146136m;

        /* renamed from: n, reason: collision with root package name */
        private List<Integer> f146137n;

        /* renamed from: o, reason: collision with root package name */
        private int f146138o;

        /* renamed from: p, reason: collision with root package name */
        private ValueParameter f146139p;

        /* renamed from: q, reason: collision with root package name */
        private int f146140q;

        /* renamed from: r, reason: collision with root package name */
        private int f146141r;

        /* renamed from: s, reason: collision with root package name */
        private List<Integer> f146142s;

        /* renamed from: t, reason: collision with root package name */
        private List<CompilerPluginData> f146143t;

        /* renamed from: u, reason: collision with root package name */
        private byte f146144u;

        /* renamed from: v, reason: collision with root package name */
        private int f146145v;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f146146d;

            /* renamed from: g, reason: collision with root package name */
            private int f146149g;

            /* renamed from: i, reason: collision with root package name */
            private int f146151i;

            /* renamed from: j, reason: collision with root package name */
            private List<TypeParameter> f146152j;

            /* renamed from: k, reason: collision with root package name */
            private Type f146153k;

            /* renamed from: l, reason: collision with root package name */
            private int f146154l;

            /* renamed from: m, reason: collision with root package name */
            private List<Type> f146155m;

            /* renamed from: n, reason: collision with root package name */
            private List<Integer> f146156n;

            /* renamed from: o, reason: collision with root package name */
            private ValueParameter f146157o;

            /* renamed from: p, reason: collision with root package name */
            private int f146158p;

            /* renamed from: q, reason: collision with root package name */
            private int f146159q;

            /* renamed from: r, reason: collision with root package name */
            private List<Integer> f146160r;

            /* renamed from: s, reason: collision with root package name */
            private List<CompilerPluginData> f146161s;

            /* renamed from: e, reason: collision with root package name */
            private int f146147e = 518;

            /* renamed from: f, reason: collision with root package name */
            private int f146148f = 2054;

            /* renamed from: h, reason: collision with root package name */
            private Type f146150h = Type.Y();

            private void F() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: H, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.f146125x     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$Builder");
            }

            private void A() {
                if ((this.f146146d & 512) != 512) {
                    this.f146156n = new ArrayList(this.f146156n);
                    this.f146146d |= 512;
                }
            }

            private void C() {
                if ((this.f146146d & 256) != 256) {
                    this.f146155m = new ArrayList(this.f146155m);
                    this.f146146d |= 256;
                }
            }

            private void D() {
                if ((this.f146146d & 32) != 32) {
                    this.f146152j = new ArrayList(this.f146152j);
                    this.f146146d |= 32;
                }
            }

            private void E() {
                if ((this.f146146d & 8192) != 8192) {
                    this.f146160r = new ArrayList(this.f146160r);
                    this.f146146d |= 8192;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f146146d & 16384) != 16384) {
                    this.f146161s = new ArrayList(this.f146161s);
                    this.f146146d |= 16384;
                }
            }

            public Builder I(Type type) {
                if ((this.f146146d & 64) != 64 || this.f146153k == Type.Y()) {
                    this.f146153k = type;
                } else {
                    this.f146153k = Type.A0(this.f146153k).n(type).w();
                }
                this.f146146d |= 64;
                return this;
            }

            public Builder J(Type type) {
                if ((this.f146146d & 8) != 8 || this.f146150h == Type.Y()) {
                    this.f146150h = type;
                } else {
                    this.f146150h = Type.A0(this.f146150h).n(type).w();
                }
                this.f146146d |= 8;
                return this;
            }

            public Builder K(ValueParameter valueParameter) {
                if ((this.f146146d & 1024) != 1024 || this.f146157o == ValueParameter.J()) {
                    this.f146157o = valueParameter;
                } else {
                    this.f146157o = ValueParameter.Z(this.f146157o).n(valueParameter).w();
                }
                this.f146146d |= 1024;
                return this;
            }

            public Builder L(int i10) {
                this.f146146d |= 1;
                this.f146147e = i10;
                return this;
            }

            public Builder M(int i10) {
                this.f146146d |= RecyclerView.m.FLAG_MOVED;
                this.f146158p = i10;
                return this;
            }

            public Builder N(int i10) {
                this.f146146d |= 4;
                this.f146149g = i10;
                return this;
            }

            public Builder O(int i10) {
                this.f146146d |= 2;
                this.f146148f = i10;
                return this;
            }

            public Builder P(int i10) {
                this.f146146d |= 128;
                this.f146154l = i10;
                return this;
            }

            public Builder Q(int i10) {
                this.f146146d |= 16;
                this.f146151i = i10;
                return this;
            }

            public Builder R(int i10) {
                this.f146146d |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                this.f146159q = i10;
                return this;
            }

            public Property w() {
                Property property = new Property(this);
                int i10 = this.f146146d;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                property.f146128e = this.f146147e;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                property.f146129f = this.f146148f;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                property.f146130g = this.f146149g;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                property.f146131h = this.f146150h;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                property.f146132i = this.f146151i;
                if ((this.f146146d & 32) == 32) {
                    this.f146152j = Collections.unmodifiableList(this.f146152j);
                    this.f146146d &= -33;
                }
                property.f146133j = this.f146152j;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                property.f146134k = this.f146153k;
                if ((i10 & 128) == 128) {
                    i11 |= 64;
                }
                property.f146135l = this.f146154l;
                if ((this.f146146d & 256) == 256) {
                    this.f146155m = Collections.unmodifiableList(this.f146155m);
                    this.f146146d &= -257;
                }
                property.f146136m = this.f146155m;
                if ((this.f146146d & 512) == 512) {
                    this.f146156n = Collections.unmodifiableList(this.f146156n);
                    this.f146146d &= -513;
                }
                property.f146137n = this.f146156n;
                if ((i10 & 1024) == 1024) {
                    i11 |= 128;
                }
                property.f146139p = this.f146157o;
                if ((i10 & RecyclerView.m.FLAG_MOVED) == 2048) {
                    i11 |= 256;
                }
                property.f146140q = this.f146158p;
                if ((i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    i11 |= 512;
                }
                property.f146141r = this.f146159q;
                if ((this.f146146d & 8192) == 8192) {
                    this.f146160r = Collections.unmodifiableList(this.f146160r);
                    this.f146146d &= -8193;
                }
                property.f146142s = this.f146160r;
                if ((this.f146146d & 16384) == 16384) {
                    this.f146161s = Collections.unmodifiableList(this.f146161s);
                    this.f146146d &= -16385;
                }
                property.f146143t = this.f146161s;
                property.f146127d = i11;
                return property;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f146152j = list;
                this.f146153k = Type.Y();
                this.f146155m = list;
                this.f146156n = list;
                this.f146157o = ValueParameter.J();
                this.f146160r = list;
                this.f146161s = list;
                F();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public Builder n(Property property) {
                if (property == Property.d0()) {
                    return this;
                }
                if (property.u0()) {
                    L(property.f0());
                }
                if (property.x0()) {
                    O(property.i0());
                }
                if (property.w0()) {
                    N(property.h0());
                }
                if (property.A0()) {
                    J(property.l0());
                }
                if (property.B0()) {
                    Q(property.m0());
                }
                if (!property.f146133j.isEmpty()) {
                    if (this.f146152j.isEmpty()) {
                        this.f146152j = property.f146133j;
                        this.f146146d &= -33;
                    } else {
                        D();
                        this.f146152j.addAll(property.f146133j);
                    }
                }
                if (property.y0()) {
                    I(property.j0());
                }
                if (property.z0()) {
                    P(property.k0());
                }
                if (!property.f146136m.isEmpty()) {
                    if (this.f146155m.isEmpty()) {
                        this.f146155m = property.f146136m;
                        this.f146146d &= -257;
                    } else {
                        C();
                        this.f146155m.addAll(property.f146136m);
                    }
                }
                if (!property.f146137n.isEmpty()) {
                    if (this.f146156n.isEmpty()) {
                        this.f146156n = property.f146137n;
                        this.f146146d &= -513;
                    } else {
                        A();
                        this.f146156n.addAll(property.f146137n);
                    }
                }
                if (property.D0()) {
                    K(property.o0());
                }
                if (property.v0()) {
                    M(property.g0());
                }
                if (property.C0()) {
                    R(property.n0());
                }
                if (!property.f146142s.isEmpty()) {
                    if (this.f146160r.isEmpty()) {
                        this.f146160r = property.f146142s;
                        this.f146146d &= -8193;
                    } else {
                        E();
                        this.f146160r.addAll(property.f146142s);
                    }
                }
                if (!property.f146143t.isEmpty()) {
                    if (this.f146161s.isEmpty()) {
                        this.f146161s = property.f146143t;
                        this.f146146d &= -16385;
                    } else {
                        z();
                        this.f146161s.addAll(property.f146143t);
                    }
                }
                t(property);
                o(m().e(property.f146126c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public Property build() {
                Property propertyW = w();
                if (propertyW.a()) {
                    return propertyW;
                }
                throw AbstractMessageLite.Builder.k(propertyW);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return y().n(w());
            }
        }

        static class a extends AbstractParser<Property> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Property c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Property(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        static {
            Property property = new Property(true);
            f146124w = property;
            property.E0();
        }

        private void E0() {
            this.f146128e = 518;
            this.f146129f = 2054;
            this.f146130g = 0;
            this.f146131h = Type.Y();
            this.f146132i = 0;
            List list = Collections.EMPTY_LIST;
            this.f146133j = list;
            this.f146134k = Type.Y();
            this.f146135l = 0;
            this.f146136m = list;
            this.f146137n = list;
            this.f146139p = ValueParameter.J();
            this.f146140q = 0;
            this.f146141r = 0;
            this.f146142s = list;
            this.f146143t = list;
        }

        public static Property d0() {
            return f146124w;
        }

        public boolean A0() {
            return (this.f146127d & 8) == 8;
        }

        public boolean B0() {
            return (this.f146127d & 16) == 16;
        }

        public boolean C0() {
            return (this.f146127d & 512) == 512;
        }

        public boolean D0() {
            return (this.f146127d & 128) == 128;
        }

        public CompilerPluginData X(int i10) {
            return this.f146143t.get(i10);
        }

        public int Y() {
            return this.f146143t.size();
        }

        public Type Z(int i10) {
            return this.f146136m.get(i10);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146144u;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!w0()) {
                this.f146144u = (byte) 0;
                return false;
            }
            if (A0() && !l0().a()) {
                this.f146144u = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < q0(); i10++) {
                if (!p0(i10).a()) {
                    this.f146144u = (byte) 0;
                    return false;
                }
            }
            if (y0() && !j0().a()) {
                this.f146144u = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < a0(); i11++) {
                if (!Z(i11).a()) {
                    this.f146144u = (byte) 0;
                    return false;
                }
            }
            if (D0() && !o0().a()) {
                this.f146144u = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < Y(); i12++) {
                if (!X(i12).a()) {
                    this.f146144u = (byte) 0;
                    return false;
                }
            }
            if (s()) {
                this.f146144u = (byte) 1;
                return true;
            }
            this.f146144u = (byte) 0;
            return false;
        }

        public int a0() {
            return this.f146136m.size();
        }

        public List<Integer> b0() {
            return this.f146137n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146145v;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f146127d & 2) == 2 ? CodedOutputStream.o(1, this.f146129f) : 0;
            if ((this.f146127d & 4) == 4) {
                iO += CodedOutputStream.o(2, this.f146130g);
            }
            if ((this.f146127d & 8) == 8) {
                iO += CodedOutputStream.s(3, this.f146131h);
            }
            for (int i11 = 0; i11 < this.f146133j.size(); i11++) {
                iO += CodedOutputStream.s(4, this.f146133j.get(i11));
            }
            if ((this.f146127d & 32) == 32) {
                iO += CodedOutputStream.s(5, this.f146134k);
            }
            if ((this.f146127d & 128) == 128) {
                iO += CodedOutputStream.s(6, this.f146139p);
            }
            if ((this.f146127d & 256) == 256) {
                iO += CodedOutputStream.o(7, this.f146140q);
            }
            if ((this.f146127d & 512) == 512) {
                iO += CodedOutputStream.o(8, this.f146141r);
            }
            if ((this.f146127d & 16) == 16) {
                iO += CodedOutputStream.o(9, this.f146132i);
            }
            if ((this.f146127d & 64) == 64) {
                iO += CodedOutputStream.o(10, this.f146135l);
            }
            if ((this.f146127d & 1) == 1) {
                iO += CodedOutputStream.o(11, this.f146128e);
            }
            for (int i12 = 0; i12 < this.f146136m.size(); i12++) {
                iO += CodedOutputStream.s(12, this.f146136m.get(i12));
            }
            int iP = 0;
            for (int i13 = 0; i13 < this.f146137n.size(); i13++) {
                iP += CodedOutputStream.p(this.f146137n.get(i13).intValue());
            }
            int iP2 = iO + iP;
            if (!b0().isEmpty()) {
                iP2 = iP2 + 1 + CodedOutputStream.p(iP);
            }
            this.f146138o = iP;
            int iP3 = 0;
            for (int i14 = 0; i14 < this.f146142s.size(); i14++) {
                iP3 += CodedOutputStream.p(this.f146142s.get(i14).intValue());
            }
            int size = iP2 + iP3 + (t0().size() * 2);
            for (int i15 = 0; i15 < this.f146143t.size(); i15++) {
                size += CodedOutputStream.s(32, this.f146143t.get(i15));
            }
            int iT = size + t() + this.f146126c.size();
            this.f146145v = iT;
            return iT;
        }

        public List<Type> c0() {
            return this.f146136m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: e0, reason: merged with bridge method [inline-methods] */
        public Property e() {
            return f146124w;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Property> f() {
            return f146125x;
        }

        public int f0() {
            return this.f146128e;
        }

        public int g0() {
            return this.f146140q;
        }

        public int h0() {
            return this.f146130g;
        }

        public int i0() {
            return this.f146129f;
        }

        public Type j0() {
            return this.f146134k;
        }

        public int k0() {
            return this.f146135l;
        }

        public Type l0() {
            return this.f146131h;
        }

        public int m0() {
            return this.f146132i;
        }

        public int n0() {
            return this.f146141r;
        }

        public ValueParameter o0() {
            return this.f146139p;
        }

        public TypeParameter p0(int i10) {
            return this.f146133j.get(i10);
        }

        public int q0() {
            return this.f146133j.size();
        }

        public List<TypeParameter> s0() {
            return this.f146133j;
        }

        public List<Integer> t0() {
            return this.f146142s;
        }

        public boolean u0() {
            return (this.f146127d & 1) == 1;
        }

        public boolean v0() {
            return (this.f146127d & 256) == 256;
        }

        public boolean w0() {
            return (this.f146127d & 4) == 4;
        }

        public boolean x0() {
            return (this.f146127d & 2) == 2;
        }

        public boolean y0() {
            return (this.f146127d & 32) == 32;
        }

        public boolean z0() {
            return (this.f146127d & 64) == 64;
        }

        private Property(GeneratedMessageLite.ExtendableBuilder<Property, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f146138o = -1;
            this.f146144u = (byte) -1;
            this.f146145v = -1;
            this.f146126c = extendableBuilder.m();
        }

        public static Builder F0() {
            return Builder.y();
        }

        public static Builder G0(Property property) {
            return F0().n(property);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: H0, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return F0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: I0, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return G0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterZ = z();
            if ((this.f146127d & 2) == 2) {
                codedOutputStream.a0(1, this.f146129f);
            }
            if ((this.f146127d & 4) == 4) {
                codedOutputStream.a0(2, this.f146130g);
            }
            if ((this.f146127d & 8) == 8) {
                codedOutputStream.d0(3, this.f146131h);
            }
            for (int i10 = 0; i10 < this.f146133j.size(); i10++) {
                codedOutputStream.d0(4, this.f146133j.get(i10));
            }
            if ((this.f146127d & 32) == 32) {
                codedOutputStream.d0(5, this.f146134k);
            }
            if ((this.f146127d & 128) == 128) {
                codedOutputStream.d0(6, this.f146139p);
            }
            if ((this.f146127d & 256) == 256) {
                codedOutputStream.a0(7, this.f146140q);
            }
            if ((this.f146127d & 512) == 512) {
                codedOutputStream.a0(8, this.f146141r);
            }
            if ((this.f146127d & 16) == 16) {
                codedOutputStream.a0(9, this.f146132i);
            }
            if ((this.f146127d & 64) == 64) {
                codedOutputStream.a0(10, this.f146135l);
            }
            if ((this.f146127d & 1) == 1) {
                codedOutputStream.a0(11, this.f146128e);
            }
            for (int i11 = 0; i11 < this.f146136m.size(); i11++) {
                codedOutputStream.d0(12, this.f146136m.get(i11));
            }
            if (b0().size() > 0) {
                codedOutputStream.o0(106);
                codedOutputStream.o0(this.f146138o);
            }
            for (int i12 = 0; i12 < this.f146137n.size(); i12++) {
                codedOutputStream.b0(this.f146137n.get(i12).intValue());
            }
            for (int i13 = 0; i13 < this.f146142s.size(); i13++) {
                codedOutputStream.a0(31, this.f146142s.get(i13).intValue());
            }
            for (int i14 = 0; i14 < this.f146143t.size(); i14++) {
                codedOutputStream.d0(32, this.f146143t.get(i14));
            }
            extensionWriterZ.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f146126c);
        }

        private Property(boolean z10) {
            this.f146138o = -1;
            this.f146144u = (byte) -1;
            this.f146145v = -1;
            this.f146126c = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v11 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v15 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v5 */
        /* JADX WARN: Type inference failed for: r4v7 */
        /* JADX WARN: Type inference failed for: r4v9 */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private Property(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f146138o = -1;
            this.f146144u = (byte) -1;
            this.f146145v = -1;
            E0();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            char c10 = 0;
            while (true) {
                ?? P10 = 16384;
                if (!z10) {
                    try {
                        try {
                            int iK = codedInputStream.K();
                            switch (iK) {
                                case 0:
                                    z10 = true;
                                case 8:
                                    this.f146127d |= 2;
                                    this.f146129f = codedInputStream.s();
                                case 16:
                                    this.f146127d |= 4;
                                    this.f146130g = codedInputStream.s();
                                case 26:
                                    Type.Builder builderB = (this.f146127d & 8) == 8 ? this.f146131h.b() : null;
                                    Type type = (Type) codedInputStream.u(Type.f146198v, extensionRegistryLite);
                                    this.f146131h = type;
                                    if (builderB != null) {
                                        builderB.n(type);
                                        this.f146131h = builderB.w();
                                    }
                                    this.f146127d |= 8;
                                case 34:
                                    int i10 = (c10 == true ? 1 : 0) & 32;
                                    c10 = c10;
                                    if (i10 != 32) {
                                        this.f146133j = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | ' ';
                                    }
                                    this.f146133j.add(codedInputStream.u(TypeParameter.f146280o, extensionRegistryLite));
                                case 42:
                                    Type.Builder builderB2 = (this.f146127d & 32) == 32 ? this.f146134k.b() : null;
                                    Type type2 = (Type) codedInputStream.u(Type.f146198v, extensionRegistryLite);
                                    this.f146134k = type2;
                                    if (builderB2 != null) {
                                        builderB2.n(type2);
                                        this.f146134k = builderB2.w();
                                    }
                                    this.f146127d |= 32;
                                case 50:
                                    ValueParameter.Builder builderB3 = (this.f146127d & 128) == 128 ? this.f146139p.b() : null;
                                    ValueParameter valueParameter = (ValueParameter) codedInputStream.u(ValueParameter.f146317n, extensionRegistryLite);
                                    this.f146139p = valueParameter;
                                    if (builderB3 != null) {
                                        builderB3.n(valueParameter);
                                        this.f146139p = builderB3.w();
                                    }
                                    this.f146127d |= 128;
                                case 56:
                                    this.f146127d |= 256;
                                    this.f146140q = codedInputStream.s();
                                case 64:
                                    this.f146127d |= 512;
                                    this.f146141r = codedInputStream.s();
                                case 72:
                                    this.f146127d |= 16;
                                    this.f146132i = codedInputStream.s();
                                case BinsView.LABEL_WIDTH_DP /* 80 */:
                                    this.f146127d |= 64;
                                    this.f146135l = codedInputStream.s();
                                case 88:
                                    this.f146127d |= 1;
                                    this.f146128e = codedInputStream.s();
                                case 98:
                                    int i11 = (c10 == true ? 1 : 0) & 256;
                                    c10 = c10;
                                    if (i11 != 256) {
                                        this.f146136m = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 256;
                                    }
                                    this.f146136m.add(codedInputStream.u(Type.f146198v, extensionRegistryLite));
                                case 104:
                                    int i12 = (c10 == true ? 1 : 0) & 512;
                                    c10 = c10;
                                    if (i12 != 512) {
                                        this.f146137n = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 512;
                                    }
                                    this.f146137n.add(Integer.valueOf(codedInputStream.s()));
                                case 106:
                                    int iJ = codedInputStream.j(codedInputStream.A());
                                    int i13 = (c10 == true ? 1 : 0) & 512;
                                    c10 = c10;
                                    if (i13 != 512) {
                                        c10 = c10;
                                        if (codedInputStream.e() > 0) {
                                            this.f146137n = new ArrayList();
                                            c10 = (c10 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (codedInputStream.e() > 0) {
                                        this.f146137n.add(Integer.valueOf(codedInputStream.s()));
                                    }
                                    codedInputStream.i(iJ);
                                case 248:
                                    int i14 = (c10 == true ? 1 : 0) & 8192;
                                    c10 = c10;
                                    if (i14 != 8192) {
                                        this.f146142s = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 8192;
                                    }
                                    this.f146142s.add(Integer.valueOf(codedInputStream.s()));
                                case 250:
                                    int iJ2 = codedInputStream.j(codedInputStream.A());
                                    int i15 = (c10 == true ? 1 : 0) & 8192;
                                    c10 = c10;
                                    if (i15 != 8192) {
                                        c10 = c10;
                                        if (codedInputStream.e() > 0) {
                                            this.f146142s = new ArrayList();
                                            c10 = (c10 == true ? 1 : 0) | 8192;
                                        }
                                    }
                                    while (codedInputStream.e() > 0) {
                                        this.f146142s.add(Integer.valueOf(codedInputStream.s()));
                                    }
                                    codedInputStream.i(iJ2);
                                case 258:
                                    int i16 = (c10 == true ? 1 : 0) & 16384;
                                    c10 = c10;
                                    if (i16 != 16384) {
                                        this.f146143t = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 16384;
                                    }
                                    this.f146143t.add(codedInputStream.u(CompilerPluginData.f145944i, extensionRegistryLite));
                                default:
                                    P10 = p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK);
                                    if (P10 == 0) {
                                        z10 = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.i(this);
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                        }
                    } catch (Throwable th2) {
                        if (((c10 == true ? 1 : 0) & 32) == 32) {
                            this.f146133j = Collections.unmodifiableList(this.f146133j);
                        }
                        if (((c10 == true ? 1 : 0) & 256) == 256) {
                            this.f146136m = Collections.unmodifiableList(this.f146136m);
                        }
                        if (((c10 == true ? 1 : 0) & 512) == 512) {
                            this.f146137n = Collections.unmodifiableList(this.f146137n);
                        }
                        if (((c10 == true ? 1 : 0) & 8192) == 8192) {
                            this.f146142s = Collections.unmodifiableList(this.f146142s);
                        }
                        if (((c10 == true ? 1 : 0) & 16384) == P10) {
                            this.f146143t = Collections.unmodifiableList(this.f146143t);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f146126c = outputT.g();
                            throw th3;
                        }
                        this.f146126c = outputT.g();
                        m();
                        throw th2;
                    }
                } else {
                    if (((c10 == true ? 1 : 0) & 32) == 32) {
                        this.f146133j = Collections.unmodifiableList(this.f146133j);
                    }
                    if (((c10 == true ? 1 : 0) & 256) == 256) {
                        this.f146136m = Collections.unmodifiableList(this.f146136m);
                    }
                    if (((c10 == true ? 1 : 0) & 512) == 512) {
                        this.f146137n = Collections.unmodifiableList(this.f146137n);
                    }
                    if (((c10 == true ? 1 : 0) & 8192) == 8192) {
                        this.f146142s = Collections.unmodifiableList(this.f146142s);
                    }
                    if (((c10 == true ? 1 : 0) & 16384) == 16384) {
                        this.f146143t = Collections.unmodifiableList(this.f146143t);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        this.f146126c = outputT.g();
                        throw th4;
                    }
                    this.f146126c = outputT.g();
                    m();
                    return;
                }
            }
        }
    }

    public interface PropertyOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class QualifiedNameTable extends GeneratedMessageLite implements QualifiedNameTableOrBuilder {

        /* renamed from: f, reason: collision with root package name */
        private static final QualifiedNameTable f146162f;

        /* renamed from: g, reason: collision with root package name */
        public static Parser<QualifiedNameTable> f146163g = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f146164b;

        /* renamed from: c, reason: collision with root package name */
        private List<QualifiedName> f146165c;

        /* renamed from: d, reason: collision with root package name */
        private byte f146166d;

        /* renamed from: e, reason: collision with root package name */
        private int f146167e;

        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f146168b;

            /* renamed from: c, reason: collision with root package name */
            private List<QualifiedName> f146169c = Collections.EMPTY_LIST;

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.f146163g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f146168b & 1) != 1) {
                    this.f146169c = new ArrayList(this.f146169c);
                    this.f146168b |= 1;
                }
            }

            public QualifiedNameTable r() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.f146168b & 1) == 1) {
                    this.f146169c = Collections.unmodifiableList(this.f146169c);
                    this.f146168b &= -2;
                }
                qualifiedNameTable.f146165c = this.f146169c;
                return qualifiedNameTable;
            }

            private Builder() {
                v();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public QualifiedNameTable build() {
                QualifiedNameTable qualifiedNameTableR = r();
                if (qualifiedNameTableR.a()) {
                    return qualifiedNameTableR;
                }
                throw AbstractMessageLite.Builder.k(qualifiedNameTableR);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return t().n(r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public Builder n(QualifiedNameTable qualifiedNameTable) {
                if (qualifiedNameTable == QualifiedNameTable.u()) {
                    return this;
                }
                if (!qualifiedNameTable.f146165c.isEmpty()) {
                    if (this.f146169c.isEmpty()) {
                        this.f146169c = qualifiedNameTable.f146165c;
                        this.f146168b &= -2;
                    } else {
                        u();
                        this.f146169c.addAll(qualifiedNameTable.f146165c);
                    }
                }
                o(m().e(qualifiedNameTable.f146164b));
                return this;
            }
        }

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {

            /* renamed from: i, reason: collision with root package name */
            private static final QualifiedName f146170i;

            /* renamed from: j, reason: collision with root package name */
            public static Parser<QualifiedName> f146171j = new a();

            /* renamed from: b, reason: collision with root package name */
            private final ByteString f146172b;

            /* renamed from: c, reason: collision with root package name */
            private int f146173c;

            /* renamed from: d, reason: collision with root package name */
            private int f146174d;

            /* renamed from: e, reason: collision with root package name */
            private int f146175e;

            /* renamed from: f, reason: collision with root package name */
            private Kind f146176f;

            /* renamed from: g, reason: collision with root package name */
            private byte f146177g;

            /* renamed from: h, reason: collision with root package name */
            private int f146178h;

            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {

                /* renamed from: b, reason: collision with root package name */
                private int f146179b;

                /* renamed from: d, reason: collision with root package name */
                private int f146181d;

                /* renamed from: c, reason: collision with root package name */
                private int f146180c = -1;

                /* renamed from: e, reason: collision with root package name */
                private Kind f146182e = Kind.PACKAGE;

                private void u() {
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.f146171j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.n(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1b
                    L11:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L19
                    L19:
                        r3 = move-exception
                        r0 = r4
                    L1b:
                        if (r0 == 0) goto L20
                        r2.n(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Builder");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder t() {
                    return new Builder();
                }

                public QualifiedName r() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i10 = this.f146179b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    qualifiedName.f146174d = this.f146180c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    qualifiedName.f146175e = this.f146181d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    qualifiedName.f146176f = this.f146182e;
                    qualifiedName.f146173c = i11;
                    return qualifiedName;
                }

                public Builder y(int i10) {
                    this.f146179b |= 1;
                    this.f146180c = i10;
                    return this;
                }

                public Builder z(int i10) {
                    this.f146179b |= 2;
                    this.f146181d = i10;
                    return this;
                }

                private Builder() {
                    u();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public QualifiedName build() {
                    QualifiedName qualifiedNameR = r();
                    if (qualifiedNameR.a()) {
                        return qualifiedNameR;
                    }
                    throw AbstractMessageLite.Builder.k(qualifiedNameR);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public Builder r() {
                    return t().n(r());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public Builder n(QualifiedName qualifiedName) {
                    if (qualifiedName == QualifiedName.x()) {
                        return this;
                    }
                    if (qualifiedName.C()) {
                        y(qualifiedName.z());
                    }
                    if (qualifiedName.D()) {
                        z(qualifiedName.A());
                    }
                    if (qualifiedName.B()) {
                        x(qualifiedName.y());
                    }
                    o(m().e(qualifiedName.f146172b));
                    return this;
                }

                public Builder x(Kind kind) {
                    kind.getClass();
                    this.f146179b |= 4;
                    this.f146182e = kind;
                    return this;
                }
            }

            public enum Kind implements Internal.EnumLite {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);


                /* renamed from: e, reason: collision with root package name */
                private static Internal.EnumLiteMap<Kind> f146186e = new a();

                /* renamed from: a, reason: collision with root package name */
                private final int f146188a;

                static class a implements Internal.EnumLiteMap<Kind> {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public Kind a(int i10) {
                        return Kind.a(i10);
                    }
                }

                public static Kind a(int i10) {
                    if (i10 == 0) {
                        return CLASS;
                    }
                    if (i10 == 1) {
                        return PACKAGE;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return LOCAL;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int g() {
                    return this.f146188a;
                }

                Kind(int i10, int i11) {
                    this.f146188a = i11;
                }
            }

            static class a extends AbstractParser<QualifiedName> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public QualifiedName c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new QualifiedName(codedInputStream, extensionRegistryLite);
                }

                a() {
                }
            }

            private void E() {
                this.f146174d = -1;
                this.f146175e = 0;
                this.f146176f = Kind.PACKAGE;
            }

            static {
                QualifiedName qualifiedName = new QualifiedName(true);
                f146170i = qualifiedName;
                qualifiedName.E();
            }

            public static QualifiedName x() {
                return f146170i;
            }

            public int A() {
                return this.f146175e;
            }

            public boolean B() {
                return (this.f146173c & 4) == 4;
            }

            public boolean C() {
                return (this.f146173c & 1) == 1;
            }

            public boolean D() {
                return (this.f146173c & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean a() {
                byte b10 = this.f146177g;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (D()) {
                    this.f146177g = (byte) 1;
                    return true;
                }
                this.f146177g = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int c() {
                int i10 = this.f146178h;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f146173c & 1) == 1 ? CodedOutputStream.o(1, this.f146174d) : 0;
                if ((this.f146173c & 2) == 2) {
                    iO += CodedOutputStream.o(2, this.f146175e);
                }
                if ((this.f146173c & 4) == 4) {
                    iO += CodedOutputStream.h(3, this.f146176f.g());
                }
                int size = iO + this.f146172b.size();
                this.f146178h = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<QualifiedName> f() {
                return f146171j;
            }

            public Kind y() {
                return this.f146176f;
            }

            public int z() {
                return this.f146174d;
            }

            private QualifiedName(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f146177g = (byte) -1;
                this.f146178h = -1;
                this.f146172b = builder.m();
            }

            public static Builder F() {
                return Builder.t();
            }

            public static Builder G(QualifiedName qualifiedName) {
                return F().n(qualifiedName);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: H, reason: merged with bridge method [inline-methods] */
            public Builder d() {
                return F();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: I, reason: merged with bridge method [inline-methods] */
            public Builder b() {
                return G(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void g(CodedOutputStream codedOutputStream) throws IOException {
                c();
                if ((this.f146173c & 1) == 1) {
                    codedOutputStream.a0(1, this.f146174d);
                }
                if ((this.f146173c & 2) == 2) {
                    codedOutputStream.a0(2, this.f146175e);
                }
                if ((this.f146173c & 4) == 4) {
                    codedOutputStream.S(3, this.f146176f.g());
                }
                codedOutputStream.i0(this.f146172b);
            }

            private QualifiedName(boolean z10) {
                this.f146177g = (byte) -1;
                this.f146178h = -1;
                this.f146172b = ByteString.f146726a;
            }

            private QualifiedName(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.f146177g = (byte) -1;
                this.f146178h = -1;
                E();
                ByteString.Output outputT = ByteString.t();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            try {
                                int iK = codedInputStream.K();
                                if (iK != 0) {
                                    if (iK == 8) {
                                        this.f146173c |= 1;
                                        this.f146174d = codedInputStream.s();
                                    } else if (iK == 16) {
                                        this.f146173c |= 2;
                                        this.f146175e = codedInputStream.s();
                                    } else if (iK != 24) {
                                        if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                        }
                                    } else {
                                        int iN = codedInputStream.n();
                                        Kind kindA = Kind.a(iN);
                                        if (kindA == null) {
                                            codedOutputStreamJ.o0(iK);
                                            codedOutputStreamJ.o0(iN);
                                        } else {
                                            this.f146173c |= 4;
                                            this.f146176f = kindA;
                                        }
                                    }
                                }
                                z10 = true;
                            } catch (InvalidProtocolBufferException e10) {
                                throw e10.i(this);
                            }
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f146172b = outputT.g();
                            throw th3;
                        }
                        this.f146172b = outputT.g();
                        m();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f146172b = outputT.g();
                    throw th4;
                }
                this.f146172b = outputT.g();
                m();
            }
        }

        public interface QualifiedNameOrBuilder extends MessageLiteOrBuilder {
        }

        static class a extends AbstractParser<QualifiedNameTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public QualifiedNameTable c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new QualifiedNameTable(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        static {
            QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(true);
            f146162f = qualifiedNameTable;
            qualifiedNameTable.y();
        }

        public static QualifiedNameTable u() {
            return f146162f;
        }

        private void y() {
            this.f146165c = Collections.EMPTY_LIST;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146166d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < x(); i10++) {
                if (!v(i10).a()) {
                    this.f146166d = (byte) 0;
                    return false;
                }
            }
            this.f146166d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146167e;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f146165c.size(); i11++) {
                iS += CodedOutputStream.s(1, this.f146165c.get(i11));
            }
            int size = iS + this.f146164b.size();
            this.f146167e = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<QualifiedNameTable> f() {
            return f146163g;
        }

        public QualifiedName v(int i10) {
            return this.f146165c.get(i10);
        }

        public int x() {
            return this.f146165c.size();
        }

        private QualifiedNameTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f146166d = (byte) -1;
            this.f146167e = -1;
            this.f146164b = builder.m();
        }

        public static Builder A(QualifiedNameTable qualifiedNameTable) {
            return z().n(qualifiedNameTable);
        }

        public static Builder z() {
            return Builder.t();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return z();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            for (int i10 = 0; i10 < this.f146165c.size(); i10++) {
                codedOutputStream.d0(1, this.f146165c.get(i10));
            }
            codedOutputStream.i0(this.f146164b);
        }

        private QualifiedNameTable(boolean z10) {
            this.f146166d = (byte) -1;
            this.f146167e = -1;
            this.f146164b = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f146166d = (byte) -1;
            this.f146167e = -1;
            y();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = codedInputStream.K();
                            if (iK != 0) {
                                if (iK != 10) {
                                    if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                    }
                                } else {
                                    if (!z11) {
                                        this.f146165c = new ArrayList();
                                        z11 = true;
                                    }
                                    this.f146165c.add(codedInputStream.u(QualifiedName.f146171j, extensionRegistryLite));
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.i(this);
                        }
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if (z11) {
                        this.f146165c = Collections.unmodifiableList(this.f146165c);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f146164b = outputT.g();
                        throw th3;
                    }
                    this.f146164b = outputT.g();
                    m();
                    throw th2;
                }
            }
            if (z11) {
                this.f146165c = Collections.unmodifiableList(this.f146165c);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f146164b = outputT.g();
                throw th4;
            }
            this.f146164b = outputT.g();
            m();
        }
    }

    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {

        /* renamed from: f, reason: collision with root package name */
        private static final StringTable f146189f;

        /* renamed from: g, reason: collision with root package name */
        public static Parser<StringTable> f146190g = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f146191b;

        /* renamed from: c, reason: collision with root package name */
        private LazyStringList f146192c;

        /* renamed from: d, reason: collision with root package name */
        private byte f146193d;

        /* renamed from: e, reason: collision with root package name */
        private int f146194e;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f146195b;

            /* renamed from: c, reason: collision with root package name */
            private LazyStringList f146196c = LazyStringArrayList.f146791b;

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.f146190g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f146195b & 1) != 1) {
                    this.f146196c = new LazyStringArrayList(this.f146196c);
                    this.f146195b |= 1;
                }
            }

            public StringTable r() {
                StringTable stringTable = new StringTable(this);
                if ((this.f146195b & 1) == 1) {
                    this.f146196c = this.f146196c.J();
                    this.f146195b &= -2;
                }
                stringTable.f146192c = this.f146196c;
                return stringTable;
            }

            private Builder() {
                v();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public StringTable build() {
                StringTable stringTableR = r();
                if (stringTableR.a()) {
                    return stringTableR;
                }
                throw AbstractMessageLite.Builder.k(stringTableR);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return t().n(r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public Builder n(StringTable stringTable) {
                if (stringTable == StringTable.u()) {
                    return this;
                }
                if (!stringTable.f146192c.isEmpty()) {
                    if (this.f146196c.isEmpty()) {
                        this.f146196c = stringTable.f146192c;
                        this.f146195b &= -2;
                    } else {
                        u();
                        this.f146196c.addAll(stringTable.f146192c);
                    }
                }
                o(m().e(stringTable.f146191b));
                return this;
            }
        }

        static class a extends AbstractParser<StringTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public StringTable c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new StringTable(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        static {
            StringTable stringTable = new StringTable(true);
            f146189f = stringTable;
            stringTable.y();
        }

        public static StringTable u() {
            return f146189f;
        }

        private void y() {
            this.f146192c = LazyStringArrayList.f146791b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146193d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f146193d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146194e;
            if (i10 != -1) {
                return i10;
            }
            int iE = 0;
            for (int i11 = 0; i11 < this.f146192c.size(); i11++) {
                iE += CodedOutputStream.e(this.f146192c.k1(i11));
            }
            int size = iE + x().size() + this.f146191b.size();
            this.f146194e = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTable> f() {
            return f146190g;
        }

        public String v(int i10) {
            return this.f146192c.get(i10);
        }

        public ProtocolStringList x() {
            return this.f146192c;
        }

        private StringTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f146193d = (byte) -1;
            this.f146194e = -1;
            this.f146191b = builder.m();
        }

        public static Builder A(StringTable stringTable) {
            return z().n(stringTable);
        }

        public static Builder z() {
            return Builder.t();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return z();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            for (int i10 = 0; i10 < this.f146192c.size(); i10++) {
                codedOutputStream.O(1, this.f146192c.k1(i10));
            }
            codedOutputStream.i0(this.f146191b);
        }

        private StringTable(boolean z10) {
            this.f146193d = (byte) -1;
            this.f146194e = -1;
            this.f146191b = ByteString.f146726a;
        }

        private StringTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f146193d = (byte) -1;
            this.f146194e = -1;
            y();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = codedInputStream.K();
                            if (iK != 0) {
                                if (iK != 10) {
                                    if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                    }
                                } else {
                                    ByteString byteStringL = codedInputStream.l();
                                    if (!z11) {
                                        this.f146192c = new LazyStringArrayList();
                                        z11 = true;
                                    }
                                    this.f146192c.D1(byteStringL);
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.i(this);
                        }
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if (z11) {
                        this.f146192c = this.f146192c.J();
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f146191b = outputT.g();
                        throw th3;
                    }
                    this.f146191b = outputT.g();
                    m();
                    throw th2;
                }
            }
            if (z11) {
                this.f146192c = this.f146192c.J();
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f146191b = outputT.g();
                throw th4;
            }
            this.f146191b = outputT.g();
            m();
        }
    }

    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {

        /* renamed from: u, reason: collision with root package name */
        private static final Type f146197u;

        /* renamed from: v, reason: collision with root package name */
        public static Parser<Type> f146198v = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f146199c;

        /* renamed from: d, reason: collision with root package name */
        private int f146200d;

        /* renamed from: e, reason: collision with root package name */
        private List<Argument> f146201e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f146202f;

        /* renamed from: g, reason: collision with root package name */
        private int f146203g;

        /* renamed from: h, reason: collision with root package name */
        private Type f146204h;

        /* renamed from: i, reason: collision with root package name */
        private int f146205i;

        /* renamed from: j, reason: collision with root package name */
        private int f146206j;

        /* renamed from: k, reason: collision with root package name */
        private int f146207k;

        /* renamed from: l, reason: collision with root package name */
        private int f146208l;

        /* renamed from: m, reason: collision with root package name */
        private int f146209m;

        /* renamed from: n, reason: collision with root package name */
        private Type f146210n;

        /* renamed from: o, reason: collision with root package name */
        private int f146211o;

        /* renamed from: p, reason: collision with root package name */
        private Type f146212p;

        /* renamed from: q, reason: collision with root package name */
        private int f146213q;

        /* renamed from: r, reason: collision with root package name */
        private int f146214r;

        /* renamed from: s, reason: collision with root package name */
        private byte f146215s;

        /* renamed from: t, reason: collision with root package name */
        private int f146216t;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {

            /* renamed from: i, reason: collision with root package name */
            private static final Argument f146217i;

            /* renamed from: j, reason: collision with root package name */
            public static Parser<Argument> f146218j = new a();

            /* renamed from: b, reason: collision with root package name */
            private final ByteString f146219b;

            /* renamed from: c, reason: collision with root package name */
            private int f146220c;

            /* renamed from: d, reason: collision with root package name */
            private Projection f146221d;

            /* renamed from: e, reason: collision with root package name */
            private Type f146222e;

            /* renamed from: f, reason: collision with root package name */
            private int f146223f;

            /* renamed from: g, reason: collision with root package name */
            private byte f146224g;

            /* renamed from: h, reason: collision with root package name */
            private int f146225h;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* renamed from: b, reason: collision with root package name */
                private int f146226b;

                /* renamed from: c, reason: collision with root package name */
                private Projection f146227c = Projection.INV;

                /* renamed from: d, reason: collision with root package name */
                private Type f146228d = Type.Y();

                /* renamed from: e, reason: collision with root package name */
                private int f146229e;

                private void u() {
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.f146218j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        if (r3 == 0) goto Le
                        r2.n(r3)
                    Le:
                        return r2
                    Lf:
                        r3 = move-exception
                        goto L1b
                    L11:
                        r3 = move-exception
                        kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                        kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument) r4     // Catch: java.lang.Throwable -> Lf
                        throw r3     // Catch: java.lang.Throwable -> L19
                    L19:
                        r3 = move-exception
                        r0 = r4
                    L1b:
                        if (r0 == 0) goto L20
                        r2.n(r0)
                    L20:
                        throw r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Builder");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder t() {
                    return new Builder();
                }

                public Argument r() {
                    Argument argument = new Argument(this);
                    int i10 = this.f146226b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    argument.f146221d = this.f146227c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    argument.f146222e = this.f146228d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    argument.f146223f = this.f146229e;
                    argument.f146220c = i11;
                    return argument;
                }

                public Builder x(Type type) {
                    if ((this.f146226b & 2) != 2 || this.f146228d == Type.Y()) {
                        this.f146228d = type;
                    } else {
                        this.f146228d = Type.A0(this.f146228d).n(type).w();
                    }
                    this.f146226b |= 2;
                    return this;
                }

                public Builder z(int i10) {
                    this.f146226b |= 4;
                    this.f146229e = i10;
                    return this;
                }

                private Builder() {
                    u();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public Argument build() {
                    Argument argumentR = r();
                    if (argumentR.a()) {
                        return argumentR;
                    }
                    throw AbstractMessageLite.Builder.k(argumentR);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public Builder r() {
                    return t().n(r());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public Builder n(Argument argument) {
                    if (argument == Argument.x()) {
                        return this;
                    }
                    if (argument.B()) {
                        y(argument.y());
                    }
                    if (argument.C()) {
                        x(argument.z());
                    }
                    if (argument.D()) {
                        z(argument.A());
                    }
                    o(m().e(argument.f146219b));
                    return this;
                }

                public Builder y(Projection projection) {
                    projection.getClass();
                    this.f146226b |= 1;
                    this.f146227c = projection;
                    return this;
                }
            }

            public enum Projection implements Internal.EnumLite {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);


                /* renamed from: f, reason: collision with root package name */
                private static Internal.EnumLiteMap<Projection> f146234f = new a();

                /* renamed from: a, reason: collision with root package name */
                private final int f146236a;

                static class a implements Internal.EnumLiteMap<Projection> {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public Projection a(int i10) {
                        return Projection.a(i10);
                    }
                }

                public static Projection a(int i10) {
                    if (i10 == 0) {
                        return IN;
                    }
                    if (i10 == 1) {
                        return OUT;
                    }
                    if (i10 == 2) {
                        return INV;
                    }
                    if (i10 != 3) {
                        return null;
                    }
                    return STAR;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int g() {
                    return this.f146236a;
                }

                Projection(int i10, int i11) {
                    this.f146236a = i11;
                }
            }

            static class a extends AbstractParser<Argument> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public Argument c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Argument(codedInputStream, extensionRegistryLite);
                }

                a() {
                }
            }

            static {
                Argument argument = new Argument(true);
                f146217i = argument;
                argument.E();
            }

            private void E() {
                this.f146221d = Projection.INV;
                this.f146222e = Type.Y();
                this.f146223f = 0;
            }

            public static Argument x() {
                return f146217i;
            }

            public int A() {
                return this.f146223f;
            }

            public boolean B() {
                return (this.f146220c & 1) == 1;
            }

            public boolean C() {
                return (this.f146220c & 2) == 2;
            }

            public boolean D() {
                return (this.f146220c & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean a() {
                byte b10 = this.f146224g;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (!C() || z().a()) {
                    this.f146224g = (byte) 1;
                    return true;
                }
                this.f146224g = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int c() {
                int i10 = this.f146225h;
                if (i10 != -1) {
                    return i10;
                }
                int iH = (this.f146220c & 1) == 1 ? CodedOutputStream.h(1, this.f146221d.g()) : 0;
                if ((this.f146220c & 2) == 2) {
                    iH += CodedOutputStream.s(2, this.f146222e);
                }
                if ((this.f146220c & 4) == 4) {
                    iH += CodedOutputStream.o(3, this.f146223f);
                }
                int size = iH + this.f146219b.size();
                this.f146225h = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> f() {
                return f146218j;
            }

            public Projection y() {
                return this.f146221d;
            }

            public Type z() {
                return this.f146222e;
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f146224g = (byte) -1;
                this.f146225h = -1;
                this.f146219b = builder.m();
            }

            public static Builder F() {
                return Builder.t();
            }

            public static Builder G(Argument argument) {
                return F().n(argument);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: H, reason: merged with bridge method [inline-methods] */
            public Builder d() {
                return F();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: I, reason: merged with bridge method [inline-methods] */
            public Builder b() {
                return G(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void g(CodedOutputStream codedOutputStream) throws IOException {
                c();
                if ((this.f146220c & 1) == 1) {
                    codedOutputStream.S(1, this.f146221d.g());
                }
                if ((this.f146220c & 2) == 2) {
                    codedOutputStream.d0(2, this.f146222e);
                }
                if ((this.f146220c & 4) == 4) {
                    codedOutputStream.a0(3, this.f146223f);
                }
                codedOutputStream.i0(this.f146219b);
            }

            private Argument(boolean z10) {
                this.f146224g = (byte) -1;
                this.f146225h = -1;
                this.f146219b = ByteString.f146726a;
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.f146224g = (byte) -1;
                this.f146225h = -1;
                E();
                ByteString.Output outputT = ByteString.t();
                CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            try {
                                int iK = codedInputStream.K();
                                if (iK != 0) {
                                    if (iK == 8) {
                                        int iN = codedInputStream.n();
                                        Projection projectionA = Projection.a(iN);
                                        if (projectionA == null) {
                                            codedOutputStreamJ.o0(iK);
                                            codedOutputStreamJ.o0(iN);
                                        } else {
                                            this.f146220c |= 1;
                                            this.f146221d = projectionA;
                                        }
                                    } else if (iK == 18) {
                                        Builder builderB = (this.f146220c & 2) == 2 ? this.f146222e.b() : null;
                                        Type type = (Type) codedInputStream.u(Type.f146198v, extensionRegistryLite);
                                        this.f146222e = type;
                                        if (builderB != null) {
                                            builderB.n(type);
                                            this.f146222e = builderB.w();
                                        }
                                        this.f146220c |= 2;
                                    } else if (iK != 24) {
                                        if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                        }
                                    } else {
                                        this.f146220c |= 4;
                                        this.f146223f = codedInputStream.s();
                                    }
                                }
                                z10 = true;
                            } catch (InvalidProtocolBufferException e10) {
                                throw e10.i(this);
                            }
                        } catch (IOException e11) {
                            throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                        }
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f146219b = outputT.g();
                            throw th3;
                        }
                        this.f146219b = outputT.g();
                        m();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f146219b = outputT.g();
                    throw th4;
                }
                this.f146219b = outputT.g();
                m();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f146237d;

            /* renamed from: f, reason: collision with root package name */
            private boolean f146239f;

            /* renamed from: g, reason: collision with root package name */
            private int f146240g;

            /* renamed from: i, reason: collision with root package name */
            private int f146242i;

            /* renamed from: j, reason: collision with root package name */
            private int f146243j;

            /* renamed from: k, reason: collision with root package name */
            private int f146244k;

            /* renamed from: l, reason: collision with root package name */
            private int f146245l;

            /* renamed from: m, reason: collision with root package name */
            private int f146246m;

            /* renamed from: o, reason: collision with root package name */
            private int f146248o;

            /* renamed from: q, reason: collision with root package name */
            private int f146250q;

            /* renamed from: r, reason: collision with root package name */
            private int f146251r;

            /* renamed from: e, reason: collision with root package name */
            private List<Argument> f146238e = Collections.EMPTY_LIST;

            /* renamed from: h, reason: collision with root package name */
            private Type f146241h = Type.Y();

            /* renamed from: n, reason: collision with root package name */
            private Type f146247n = Type.Y();

            /* renamed from: p, reason: collision with root package name */
            private Type f146249p = Type.Y();

            private void A() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.f146198v     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f146237d & 1) != 1) {
                    this.f146238e = new ArrayList(this.f146238e);
                    this.f146237d |= 1;
                }
            }

            public Builder C(Type type) {
                if ((this.f146237d & RecyclerView.m.FLAG_MOVED) != 2048 || this.f146249p == Type.Y()) {
                    this.f146249p = type;
                } else {
                    this.f146249p = Type.A0(this.f146249p).n(type).w();
                }
                this.f146237d |= RecyclerView.m.FLAG_MOVED;
                return this;
            }

            public Builder D(Type type) {
                if ((this.f146237d & 8) != 8 || this.f146241h == Type.Y()) {
                    this.f146241h = type;
                } else {
                    this.f146241h = Type.A0(this.f146241h).n(type).w();
                }
                this.f146237d |= 8;
                return this;
            }

            public Builder G(Type type) {
                if ((this.f146237d & 512) != 512 || this.f146247n == Type.Y()) {
                    this.f146247n = type;
                } else {
                    this.f146247n = Type.A0(this.f146247n).n(type).w();
                }
                this.f146237d |= 512;
                return this;
            }

            public Builder H(int i10) {
                this.f146237d |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                this.f146250q = i10;
                return this;
            }

            public Builder I(int i10) {
                this.f146237d |= 32;
                this.f146243j = i10;
                return this;
            }

            public Builder J(int i10) {
                this.f146237d |= 8192;
                this.f146251r = i10;
                return this;
            }

            public Builder K(int i10) {
                this.f146237d |= 4;
                this.f146240g = i10;
                return this;
            }

            public Builder L(int i10) {
                this.f146237d |= 16;
                this.f146242i = i10;
                return this;
            }

            public Builder M(boolean z10) {
                this.f146237d |= 2;
                this.f146239f = z10;
                return this;
            }

            public Builder N(int i10) {
                this.f146237d |= 1024;
                this.f146248o = i10;
                return this;
            }

            public Builder O(int i10) {
                this.f146237d |= 256;
                this.f146246m = i10;
                return this;
            }

            public Builder P(int i10) {
                this.f146237d |= 64;
                this.f146244k = i10;
                return this;
            }

            public Builder Q(int i10) {
                this.f146237d |= 128;
                this.f146245l = i10;
                return this;
            }

            public Type w() {
                Type type = new Type(this);
                int i10 = this.f146237d;
                if ((i10 & 1) == 1) {
                    this.f146238e = Collections.unmodifiableList(this.f146238e);
                    this.f146237d &= -2;
                }
                type.f146201e = this.f146238e;
                int i11 = (i10 & 2) != 2 ? 0 : 1;
                type.f146202f = this.f146239f;
                if ((i10 & 4) == 4) {
                    i11 |= 2;
                }
                type.f146203g = this.f146240g;
                if ((i10 & 8) == 8) {
                    i11 |= 4;
                }
                type.f146204h = this.f146241h;
                if ((i10 & 16) == 16) {
                    i11 |= 8;
                }
                type.f146205i = this.f146242i;
                if ((i10 & 32) == 32) {
                    i11 |= 16;
                }
                type.f146206j = this.f146243j;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                type.f146207k = this.f146244k;
                if ((i10 & 128) == 128) {
                    i11 |= 64;
                }
                type.f146208l = this.f146245l;
                if ((i10 & 256) == 256) {
                    i11 |= 128;
                }
                type.f146209m = this.f146246m;
                if ((i10 & 512) == 512) {
                    i11 |= 256;
                }
                type.f146210n = this.f146247n;
                if ((i10 & 1024) == 1024) {
                    i11 |= 512;
                }
                type.f146211o = this.f146248o;
                if ((i10 & RecyclerView.m.FLAG_MOVED) == 2048) {
                    i11 |= 1024;
                }
                type.f146212p = this.f146249p;
                if ((i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    i11 |= RecyclerView.m.FLAG_MOVED;
                }
                type.f146213q = this.f146250q;
                if ((i10 & 8192) == 8192) {
                    i11 |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                }
                type.f146214r = this.f146251r;
                type.f146200d = i11;
                return type;
            }

            private Builder() {
                A();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            public Builder n(Type type) {
                if (type == Type.Y()) {
                    return this;
                }
                if (!type.f146201e.isEmpty()) {
                    if (this.f146238e.isEmpty()) {
                        this.f146238e = type.f146201e;
                        this.f146237d &= -2;
                    } else {
                        z();
                        this.f146238e.addAll(type.f146201e);
                    }
                }
                if (type.s0()) {
                    M(type.e0());
                }
                if (type.o0()) {
                    K(type.b0());
                }
                if (type.p0()) {
                    D(type.c0());
                }
                if (type.q0()) {
                    L(type.d0());
                }
                if (type.m0()) {
                    I(type.X());
                }
                if (type.w0()) {
                    P(type.i0());
                }
                if (type.x0()) {
                    Q(type.j0());
                }
                if (type.v0()) {
                    O(type.h0());
                }
                if (type.t0()) {
                    G(type.f0());
                }
                if (type.u0()) {
                    N(type.g0());
                }
                if (type.k0()) {
                    C(type.S());
                }
                if (type.l0()) {
                    H(type.T());
                }
                if (type.n0()) {
                    J(type.a0());
                }
                t(type);
                o(m().e(type.f146199c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public Type build() {
                Type typeW = w();
                if (typeW.a()) {
                    return typeW;
                }
                throw AbstractMessageLite.Builder.k(typeW);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return y().n(w());
            }
        }

        static class a extends AbstractParser<Type> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public Type c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new Type(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        static {
            Type type = new Type(true);
            f146197u = type;
            type.y0();
        }

        public static Type Y() {
            return f146197u;
        }

        private void y0() {
            this.f146201e = Collections.EMPTY_LIST;
            this.f146202f = false;
            this.f146203g = 0;
            this.f146204h = Y();
            this.f146205i = 0;
            this.f146206j = 0;
            this.f146207k = 0;
            this.f146208l = 0;
            this.f146209m = 0;
            this.f146210n = Y();
            this.f146211o = 0;
            this.f146212p = Y();
            this.f146213q = 0;
            this.f146214r = 0;
        }

        public Type S() {
            return this.f146212p;
        }

        public int T() {
            return this.f146213q;
        }

        public Argument U(int i10) {
            return this.f146201e.get(i10);
        }

        public int V() {
            return this.f146201e.size();
        }

        public List<Argument> W() {
            return this.f146201e;
        }

        public int X() {
            return this.f146206j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public Type e() {
            return f146197u;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146215s;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < V(); i10++) {
                if (!U(i10).a()) {
                    this.f146215s = (byte) 0;
                    return false;
                }
            }
            if (p0() && !c0().a()) {
                this.f146215s = (byte) 0;
                return false;
            }
            if (t0() && !f0().a()) {
                this.f146215s = (byte) 0;
                return false;
            }
            if (k0() && !S().a()) {
                this.f146215s = (byte) 0;
                return false;
            }
            if (s()) {
                this.f146215s = (byte) 1;
                return true;
            }
            this.f146215s = (byte) 0;
            return false;
        }

        public int a0() {
            return this.f146214r;
        }

        public int b0() {
            return this.f146203g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146216t;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f146200d & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096 ? CodedOutputStream.o(1, this.f146214r) : 0;
            for (int i11 = 0; i11 < this.f146201e.size(); i11++) {
                iO += CodedOutputStream.s(2, this.f146201e.get(i11));
            }
            if ((this.f146200d & 1) == 1) {
                iO += CodedOutputStream.a(3, this.f146202f);
            }
            if ((this.f146200d & 2) == 2) {
                iO += CodedOutputStream.o(4, this.f146203g);
            }
            if ((this.f146200d & 4) == 4) {
                iO += CodedOutputStream.s(5, this.f146204h);
            }
            if ((this.f146200d & 16) == 16) {
                iO += CodedOutputStream.o(6, this.f146206j);
            }
            if ((this.f146200d & 32) == 32) {
                iO += CodedOutputStream.o(7, this.f146207k);
            }
            if ((this.f146200d & 8) == 8) {
                iO += CodedOutputStream.o(8, this.f146205i);
            }
            if ((this.f146200d & 64) == 64) {
                iO += CodedOutputStream.o(9, this.f146208l);
            }
            if ((this.f146200d & 256) == 256) {
                iO += CodedOutputStream.s(10, this.f146210n);
            }
            if ((this.f146200d & 512) == 512) {
                iO += CodedOutputStream.o(11, this.f146211o);
            }
            if ((this.f146200d & 128) == 128) {
                iO += CodedOutputStream.o(12, this.f146209m);
            }
            if ((this.f146200d & 1024) == 1024) {
                iO += CodedOutputStream.s(13, this.f146212p);
            }
            if ((this.f146200d & RecyclerView.m.FLAG_MOVED) == 2048) {
                iO += CodedOutputStream.o(14, this.f146213q);
            }
            int iT = iO + t() + this.f146199c.size();
            this.f146216t = iT;
            return iT;
        }

        public Type c0() {
            return this.f146204h;
        }

        public int d0() {
            return this.f146205i;
        }

        public boolean e0() {
            return this.f146202f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Type> f() {
            return f146198v;
        }

        public Type f0() {
            return this.f146210n;
        }

        public int g0() {
            return this.f146211o;
        }

        public int h0() {
            return this.f146209m;
        }

        public int i0() {
            return this.f146207k;
        }

        public int j0() {
            return this.f146208l;
        }

        public boolean k0() {
            return (this.f146200d & 1024) == 1024;
        }

        public boolean l0() {
            return (this.f146200d & RecyclerView.m.FLAG_MOVED) == 2048;
        }

        public boolean m0() {
            return (this.f146200d & 16) == 16;
        }

        public boolean n0() {
            return (this.f146200d & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096;
        }

        public boolean o0() {
            return (this.f146200d & 2) == 2;
        }

        public boolean p0() {
            return (this.f146200d & 4) == 4;
        }

        public boolean q0() {
            return (this.f146200d & 8) == 8;
        }

        public boolean s0() {
            return (this.f146200d & 1) == 1;
        }

        public boolean t0() {
            return (this.f146200d & 256) == 256;
        }

        public boolean u0() {
            return (this.f146200d & 512) == 512;
        }

        public boolean v0() {
            return (this.f146200d & 128) == 128;
        }

        public boolean w0() {
            return (this.f146200d & 32) == 32;
        }

        public boolean x0() {
            return (this.f146200d & 64) == 64;
        }

        private Type(GeneratedMessageLite.ExtendableBuilder<Type, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f146215s = (byte) -1;
            this.f146216t = -1;
            this.f146199c = extendableBuilder.m();
        }

        public static Builder A0(Type type) {
            return z0().n(type);
        }

        public static Builder z0() {
            return Builder.y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: B0, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return z0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: C0, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return A0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterZ = z();
            if ((this.f146200d & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                codedOutputStream.a0(1, this.f146214r);
            }
            for (int i10 = 0; i10 < this.f146201e.size(); i10++) {
                codedOutputStream.d0(2, this.f146201e.get(i10));
            }
            if ((this.f146200d & 1) == 1) {
                codedOutputStream.L(3, this.f146202f);
            }
            if ((this.f146200d & 2) == 2) {
                codedOutputStream.a0(4, this.f146203g);
            }
            if ((this.f146200d & 4) == 4) {
                codedOutputStream.d0(5, this.f146204h);
            }
            if ((this.f146200d & 16) == 16) {
                codedOutputStream.a0(6, this.f146206j);
            }
            if ((this.f146200d & 32) == 32) {
                codedOutputStream.a0(7, this.f146207k);
            }
            if ((this.f146200d & 8) == 8) {
                codedOutputStream.a0(8, this.f146205i);
            }
            if ((this.f146200d & 64) == 64) {
                codedOutputStream.a0(9, this.f146208l);
            }
            if ((this.f146200d & 256) == 256) {
                codedOutputStream.d0(10, this.f146210n);
            }
            if ((this.f146200d & 512) == 512) {
                codedOutputStream.a0(11, this.f146211o);
            }
            if ((this.f146200d & 128) == 128) {
                codedOutputStream.a0(12, this.f146209m);
            }
            if ((this.f146200d & 1024) == 1024) {
                codedOutputStream.d0(13, this.f146212p);
            }
            if ((this.f146200d & RecyclerView.m.FLAG_MOVED) == 2048) {
                codedOutputStream.a0(14, this.f146213q);
            }
            extensionWriterZ.a(HttpResponseStatus.SUCCESS_OK, codedOutputStream);
            codedOutputStream.i0(this.f146199c);
        }

        private Type(boolean z10) {
            this.f146215s = (byte) -1;
            this.f146216t = -1;
            this.f146199c = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderB;
            this.f146215s = (byte) -1;
            this.f146216t = -1;
            y0();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = codedInputStream.K();
                            switch (iK) {
                                case 0:
                                    z10 = true;
                                case 8:
                                    this.f146200d |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                                    this.f146214r = codedInputStream.s();
                                case 18:
                                    if (!z11) {
                                        this.f146201e = new ArrayList();
                                        z11 = true;
                                    }
                                    this.f146201e.add(codedInputStream.u(Argument.f146218j, extensionRegistryLite));
                                case 24:
                                    this.f146200d |= 1;
                                    this.f146202f = codedInputStream.k();
                                case l3.f93325e /* 32 */:
                                    this.f146200d |= 2;
                                    this.f146203g = codedInputStream.s();
                                case 42:
                                    builderB = (this.f146200d & 4) == 4 ? this.f146204h.b() : null;
                                    Type type = (Type) codedInputStream.u(f146198v, extensionRegistryLite);
                                    this.f146204h = type;
                                    if (builderB != null) {
                                        builderB.n(type);
                                        this.f146204h = builderB.w();
                                    }
                                    this.f146200d |= 4;
                                case 48:
                                    this.f146200d |= 16;
                                    this.f146206j = codedInputStream.s();
                                case 56:
                                    this.f146200d |= 32;
                                    this.f146207k = codedInputStream.s();
                                case 64:
                                    this.f146200d |= 8;
                                    this.f146205i = codedInputStream.s();
                                case 72:
                                    this.f146200d |= 64;
                                    this.f146208l = codedInputStream.s();
                                case 82:
                                    builderB = (this.f146200d & 256) == 256 ? this.f146210n.b() : null;
                                    Type type2 = (Type) codedInputStream.u(f146198v, extensionRegistryLite);
                                    this.f146210n = type2;
                                    if (builderB != null) {
                                        builderB.n(type2);
                                        this.f146210n = builderB.w();
                                    }
                                    this.f146200d |= 256;
                                case 88:
                                    this.f146200d |= 512;
                                    this.f146211o = codedInputStream.s();
                                case 96:
                                    this.f146200d |= 128;
                                    this.f146209m = codedInputStream.s();
                                case 106:
                                    builderB = (this.f146200d & 1024) == 1024 ? this.f146212p.b() : null;
                                    Type type3 = (Type) codedInputStream.u(f146198v, extensionRegistryLite);
                                    this.f146212p = type3;
                                    if (builderB != null) {
                                        builderB.n(type3);
                                        this.f146212p = builderB.w();
                                    }
                                    this.f146200d |= 1024;
                                case 112:
                                    this.f146200d |= RecyclerView.m.FLAG_MOVED;
                                    this.f146213q = codedInputStream.s();
                                default:
                                    if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                        z10 = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.i(this);
                        }
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if (z11) {
                        this.f146201e = Collections.unmodifiableList(this.f146201e);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f146199c = outputT.g();
                        throw th3;
                    }
                    this.f146199c = outputT.g();
                    m();
                    throw th2;
                }
            }
            if (z11) {
                this.f146201e = Collections.unmodifiableList(this.f146201e);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f146199c = outputT.g();
                throw th4;
            }
            this.f146199c = outputT.g();
            m();
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {

        /* renamed from: q, reason: collision with root package name */
        private static final TypeAlias f146252q;

        /* renamed from: r, reason: collision with root package name */
        public static Parser<TypeAlias> f146253r = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f146254c;

        /* renamed from: d, reason: collision with root package name */
        private int f146255d;

        /* renamed from: e, reason: collision with root package name */
        private int f146256e;

        /* renamed from: f, reason: collision with root package name */
        private int f146257f;

        /* renamed from: g, reason: collision with root package name */
        private List<TypeParameter> f146258g;

        /* renamed from: h, reason: collision with root package name */
        private Type f146259h;

        /* renamed from: i, reason: collision with root package name */
        private int f146260i;

        /* renamed from: j, reason: collision with root package name */
        private Type f146261j;

        /* renamed from: k, reason: collision with root package name */
        private int f146262k;

        /* renamed from: l, reason: collision with root package name */
        private List<Annotation> f146263l;

        /* renamed from: m, reason: collision with root package name */
        private List<Integer> f146264m;

        /* renamed from: n, reason: collision with root package name */
        private List<CompilerPluginData> f146265n;

        /* renamed from: o, reason: collision with root package name */
        private byte f146266o;

        /* renamed from: p, reason: collision with root package name */
        private int f146267p;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f146268d;

            /* renamed from: e, reason: collision with root package name */
            private int f146269e = 6;

            /* renamed from: f, reason: collision with root package name */
            private int f146270f;

            /* renamed from: g, reason: collision with root package name */
            private List<TypeParameter> f146271g;

            /* renamed from: h, reason: collision with root package name */
            private Type f146272h;

            /* renamed from: i, reason: collision with root package name */
            private int f146273i;

            /* renamed from: j, reason: collision with root package name */
            private Type f146274j;

            /* renamed from: k, reason: collision with root package name */
            private int f146275k;

            /* renamed from: l, reason: collision with root package name */
            private List<Annotation> f146276l;

            /* renamed from: m, reason: collision with root package name */
            private List<Integer> f146277m;

            /* renamed from: n, reason: collision with root package name */
            private List<CompilerPluginData> f146278n;

            private void E() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: H, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.f146253r     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$Builder");
            }

            private void A() {
                if ((this.f146268d & 512) != 512) {
                    this.f146278n = new ArrayList(this.f146278n);
                    this.f146268d |= 512;
                }
            }

            private void C() {
                if ((this.f146268d & 4) != 4) {
                    this.f146271g = new ArrayList(this.f146271g);
                    this.f146268d |= 4;
                }
            }

            private void D() {
                if ((this.f146268d & 256) != 256) {
                    this.f146277m = new ArrayList(this.f146277m);
                    this.f146268d |= 256;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f146268d & 128) != 128) {
                    this.f146276l = new ArrayList(this.f146276l);
                    this.f146268d |= 128;
                }
            }

            public Builder F(Type type) {
                if ((this.f146268d & 32) != 32 || this.f146274j == Type.Y()) {
                    this.f146274j = type;
                } else {
                    this.f146274j = Type.A0(this.f146274j).n(type).w();
                }
                this.f146268d |= 32;
                return this;
            }

            public Builder I(Type type) {
                if ((this.f146268d & 8) != 8 || this.f146272h == Type.Y()) {
                    this.f146272h = type;
                } else {
                    this.f146272h = Type.A0(this.f146272h).n(type).w();
                }
                this.f146268d |= 8;
                return this;
            }

            public Builder J(int i10) {
                this.f146268d |= 64;
                this.f146275k = i10;
                return this;
            }

            public Builder K(int i10) {
                this.f146268d |= 1;
                this.f146269e = i10;
                return this;
            }

            public Builder L(int i10) {
                this.f146268d |= 2;
                this.f146270f = i10;
                return this;
            }

            public Builder M(int i10) {
                this.f146268d |= 16;
                this.f146273i = i10;
                return this;
            }

            public TypeAlias w() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i10 = this.f146268d;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                typeAlias.f146256e = this.f146269e;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                typeAlias.f146257f = this.f146270f;
                if ((this.f146268d & 4) == 4) {
                    this.f146271g = Collections.unmodifiableList(this.f146271g);
                    this.f146268d &= -5;
                }
                typeAlias.f146258g = this.f146271g;
                if ((i10 & 8) == 8) {
                    i11 |= 4;
                }
                typeAlias.f146259h = this.f146272h;
                if ((i10 & 16) == 16) {
                    i11 |= 8;
                }
                typeAlias.f146260i = this.f146273i;
                if ((i10 & 32) == 32) {
                    i11 |= 16;
                }
                typeAlias.f146261j = this.f146274j;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                typeAlias.f146262k = this.f146275k;
                if ((this.f146268d & 128) == 128) {
                    this.f146276l = Collections.unmodifiableList(this.f146276l);
                    this.f146268d &= -129;
                }
                typeAlias.f146263l = this.f146276l;
                if ((this.f146268d & 256) == 256) {
                    this.f146277m = Collections.unmodifiableList(this.f146277m);
                    this.f146268d &= -257;
                }
                typeAlias.f146264m = this.f146277m;
                if ((this.f146268d & 512) == 512) {
                    this.f146278n = Collections.unmodifiableList(this.f146278n);
                    this.f146268d &= -513;
                }
                typeAlias.f146265n = this.f146278n;
                typeAlias.f146255d = i11;
                return typeAlias;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f146271g = list;
                this.f146272h = Type.Y();
                this.f146274j = Type.Y();
                this.f146276l = list;
                this.f146277m = list;
                this.f146278n = list;
                E();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: G, reason: merged with bridge method [inline-methods] */
            public Builder n(TypeAlias typeAlias) {
                if (typeAlias == TypeAlias.W()) {
                    return this;
                }
                if (typeAlias.k0()) {
                    K(typeAlias.a0());
                }
                if (typeAlias.l0()) {
                    L(typeAlias.b0());
                }
                if (!typeAlias.f146258g.isEmpty()) {
                    if (this.f146271g.isEmpty()) {
                        this.f146271g = typeAlias.f146258g;
                        this.f146268d &= -5;
                    } else {
                        C();
                        this.f146271g.addAll(typeAlias.f146258g);
                    }
                }
                if (typeAlias.m0()) {
                    I(typeAlias.f0());
                }
                if (typeAlias.n0()) {
                    M(typeAlias.g0());
                }
                if (typeAlias.i0()) {
                    F(typeAlias.Y());
                }
                if (typeAlias.j0()) {
                    J(typeAlias.Z());
                }
                if (!typeAlias.f146263l.isEmpty()) {
                    if (this.f146276l.isEmpty()) {
                        this.f146276l = typeAlias.f146263l;
                        this.f146268d &= -129;
                    } else {
                        z();
                        this.f146276l.addAll(typeAlias.f146263l);
                    }
                }
                if (!typeAlias.f146264m.isEmpty()) {
                    if (this.f146277m.isEmpty()) {
                        this.f146277m = typeAlias.f146264m;
                        this.f146268d &= -257;
                    } else {
                        D();
                        this.f146277m.addAll(typeAlias.f146264m);
                    }
                }
                if (!typeAlias.f146265n.isEmpty()) {
                    if (this.f146278n.isEmpty()) {
                        this.f146278n = typeAlias.f146265n;
                        this.f146268d &= -513;
                    } else {
                        A();
                        this.f146278n.addAll(typeAlias.f146265n);
                    }
                }
                t(typeAlias);
                o(m().e(typeAlias.f146254c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public TypeAlias build() {
                TypeAlias typeAliasW = w();
                if (typeAliasW.a()) {
                    return typeAliasW;
                }
                throw AbstractMessageLite.Builder.k(typeAliasW);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return y().n(w());
            }
        }

        static class a extends AbstractParser<TypeAlias> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public TypeAlias c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeAlias(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        private void o0() {
            this.f146256e = 6;
            this.f146257f = 0;
            List list = Collections.EMPTY_LIST;
            this.f146258g = list;
            this.f146259h = Type.Y();
            this.f146260i = 0;
            this.f146261j = Type.Y();
            this.f146262k = 0;
            this.f146263l = list;
            this.f146264m = list;
            this.f146265n = list;
        }

        static {
            TypeAlias typeAlias = new TypeAlias(true);
            f146252q = typeAlias;
            typeAlias.o0();
        }

        public static TypeAlias W() {
            return f146252q;
        }

        public static TypeAlias t0(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return f146253r.d(inputStream, extensionRegistryLite);
        }

        public Annotation R(int i10) {
            return this.f146263l.get(i10);
        }

        public int S() {
            return this.f146263l.size();
        }

        public List<Annotation> T() {
            return this.f146263l;
        }

        public CompilerPluginData U(int i10) {
            return this.f146265n.get(i10);
        }

        public int V() {
            return this.f146265n.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public TypeAlias e() {
            return f146252q;
        }

        public Type Y() {
            return this.f146261j;
        }

        public int Z() {
            return this.f146262k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146266o;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!l0()) {
                this.f146266o = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < d0(); i10++) {
                if (!c0(i10).a()) {
                    this.f146266o = (byte) 0;
                    return false;
                }
            }
            if (m0() && !f0().a()) {
                this.f146266o = (byte) 0;
                return false;
            }
            if (i0() && !Y().a()) {
                this.f146266o = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < S(); i11++) {
                if (!R(i11).a()) {
                    this.f146266o = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < V(); i12++) {
                if (!U(i12).a()) {
                    this.f146266o = (byte) 0;
                    return false;
                }
            }
            if (s()) {
                this.f146266o = (byte) 1;
                return true;
            }
            this.f146266o = (byte) 0;
            return false;
        }

        public int a0() {
            return this.f146256e;
        }

        public int b0() {
            return this.f146257f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146267p;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f146255d & 1) == 1 ? CodedOutputStream.o(1, this.f146256e) : 0;
            if ((this.f146255d & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f146257f);
            }
            for (int i11 = 0; i11 < this.f146258g.size(); i11++) {
                iO += CodedOutputStream.s(3, this.f146258g.get(i11));
            }
            if ((this.f146255d & 4) == 4) {
                iO += CodedOutputStream.s(4, this.f146259h);
            }
            if ((this.f146255d & 8) == 8) {
                iO += CodedOutputStream.o(5, this.f146260i);
            }
            if ((this.f146255d & 16) == 16) {
                iO += CodedOutputStream.s(6, this.f146261j);
            }
            if ((this.f146255d & 32) == 32) {
                iO += CodedOutputStream.o(7, this.f146262k);
            }
            for (int i12 = 0; i12 < this.f146263l.size(); i12++) {
                iO += CodedOutputStream.s(8, this.f146263l.get(i12));
            }
            int iP = 0;
            for (int i13 = 0; i13 < this.f146264m.size(); i13++) {
                iP += CodedOutputStream.p(this.f146264m.get(i13).intValue());
            }
            int size = iO + iP + (h0().size() * 2);
            for (int i14 = 0; i14 < this.f146265n.size(); i14++) {
                size += CodedOutputStream.s(32, this.f146265n.get(i14));
            }
            int iT = size + t() + this.f146254c.size();
            this.f146267p = iT;
            return iT;
        }

        public TypeParameter c0(int i10) {
            return this.f146258g.get(i10);
        }

        public int d0() {
            return this.f146258g.size();
        }

        public List<TypeParameter> e0() {
            return this.f146258g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeAlias> f() {
            return f146253r;
        }

        public Type f0() {
            return this.f146259h;
        }

        public int g0() {
            return this.f146260i;
        }

        public List<Integer> h0() {
            return this.f146264m;
        }

        public boolean i0() {
            return (this.f146255d & 16) == 16;
        }

        public boolean j0() {
            return (this.f146255d & 32) == 32;
        }

        public boolean k0() {
            return (this.f146255d & 1) == 1;
        }

        public boolean l0() {
            return (this.f146255d & 2) == 2;
        }

        public boolean m0() {
            return (this.f146255d & 4) == 4;
        }

        public boolean n0() {
            return (this.f146255d & 8) == 8;
        }

        private TypeAlias(GeneratedMessageLite.ExtendableBuilder<TypeAlias, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f146266o = (byte) -1;
            this.f146267p = -1;
            this.f146254c = extendableBuilder.m();
        }

        public static Builder p0() {
            return Builder.y();
        }

        public static Builder q0(TypeAlias typeAlias) {
            return p0().n(typeAlias);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterZ = z();
            if ((this.f146255d & 1) == 1) {
                codedOutputStream.a0(1, this.f146256e);
            }
            if ((this.f146255d & 2) == 2) {
                codedOutputStream.a0(2, this.f146257f);
            }
            for (int i10 = 0; i10 < this.f146258g.size(); i10++) {
                codedOutputStream.d0(3, this.f146258g.get(i10));
            }
            if ((this.f146255d & 4) == 4) {
                codedOutputStream.d0(4, this.f146259h);
            }
            if ((this.f146255d & 8) == 8) {
                codedOutputStream.a0(5, this.f146260i);
            }
            if ((this.f146255d & 16) == 16) {
                codedOutputStream.d0(6, this.f146261j);
            }
            if ((this.f146255d & 32) == 32) {
                codedOutputStream.a0(7, this.f146262k);
            }
            for (int i11 = 0; i11 < this.f146263l.size(); i11++) {
                codedOutputStream.d0(8, this.f146263l.get(i11));
            }
            for (int i12 = 0; i12 < this.f146264m.size(); i12++) {
                codedOutputStream.a0(31, this.f146264m.get(i12).intValue());
            }
            for (int i13 = 0; i13 < this.f146265n.size(); i13++) {
                codedOutputStream.d0(32, this.f146265n.get(i13));
            }
            extensionWriterZ.a(HttpResponseStatus.SUCCESS_OK, codedOutputStream);
            codedOutputStream.i0(this.f146254c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: s0, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return p0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return q0(this);
        }

        private TypeAlias(boolean z10) {
            this.f146266o = (byte) -1;
            this.f146267p = -1;
            this.f146254c = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Type.Builder builderB;
            this.f146266o = (byte) -1;
            this.f146267p = -1;
            o0();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                ?? P10 = 128;
                if (!z10) {
                    try {
                        try {
                            int iK = codedInputStream.K();
                            switch (iK) {
                                case 0:
                                    z10 = true;
                                case 8:
                                    this.f146255d |= 1;
                                    this.f146256e = codedInputStream.s();
                                case 16:
                                    this.f146255d |= 2;
                                    this.f146257f = codedInputStream.s();
                                case 26:
                                    if ((i10 & 4) != 4) {
                                        this.f146258g = new ArrayList();
                                        i10 |= 4;
                                    }
                                    this.f146258g.add(codedInputStream.u(TypeParameter.f146280o, extensionRegistryLite));
                                case 34:
                                    builderB = (this.f146255d & 4) == 4 ? this.f146259h.b() : null;
                                    Type type = (Type) codedInputStream.u(Type.f146198v, extensionRegistryLite);
                                    this.f146259h = type;
                                    if (builderB != null) {
                                        builderB.n(type);
                                        this.f146259h = builderB.w();
                                    }
                                    this.f146255d |= 4;
                                case 40:
                                    this.f146255d |= 8;
                                    this.f146260i = codedInputStream.s();
                                case 50:
                                    builderB = (this.f146255d & 16) == 16 ? this.f146261j.b() : null;
                                    Type type2 = (Type) codedInputStream.u(Type.f146198v, extensionRegistryLite);
                                    this.f146261j = type2;
                                    if (builderB != null) {
                                        builderB.n(type2);
                                        this.f146261j = builderB.w();
                                    }
                                    this.f146255d |= 16;
                                case 56:
                                    this.f146255d |= 32;
                                    this.f146262k = codedInputStream.s();
                                case 66:
                                    if ((i10 & 128) != 128) {
                                        this.f146263l = new ArrayList();
                                        i10 |= 128;
                                    }
                                    this.f146263l.add(codedInputStream.u(Annotation.f145804i, extensionRegistryLite));
                                case 248:
                                    if ((i10 & 256) != 256) {
                                        this.f146264m = new ArrayList();
                                        i10 |= 256;
                                    }
                                    this.f146264m.add(Integer.valueOf(codedInputStream.s()));
                                case 250:
                                    int iJ = codedInputStream.j(codedInputStream.A());
                                    if ((i10 & 256) != 256 && codedInputStream.e() > 0) {
                                        this.f146264m = new ArrayList();
                                        i10 |= 256;
                                    }
                                    while (codedInputStream.e() > 0) {
                                        this.f146264m.add(Integer.valueOf(codedInputStream.s()));
                                    }
                                    codedInputStream.i(iJ);
                                    break;
                                case 258:
                                    if ((i10 & 512) != 512) {
                                        this.f146265n = new ArrayList();
                                        i10 |= 512;
                                    }
                                    this.f146265n.add(codedInputStream.u(CompilerPluginData.f145944i, extensionRegistryLite));
                                default:
                                    P10 = p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK);
                                    if (P10 == 0) {
                                        z10 = true;
                                    }
                            }
                        } catch (Throwable th2) {
                            if ((i10 & 4) == 4) {
                                this.f146258g = Collections.unmodifiableList(this.f146258g);
                            }
                            if ((i10 & 128) == P10) {
                                this.f146263l = Collections.unmodifiableList(this.f146263l);
                            }
                            if ((i10 & 256) == 256) {
                                this.f146264m = Collections.unmodifiableList(this.f146264m);
                            }
                            if ((i10 & 512) == 512) {
                                this.f146265n = Collections.unmodifiableList(this.f146265n);
                            }
                            try {
                                codedOutputStreamJ.I();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f146254c = outputT.g();
                                throw th3;
                            }
                            this.f146254c = outputT.g();
                            m();
                            throw th2;
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } else {
                    if ((i10 & 4) == 4) {
                        this.f146258g = Collections.unmodifiableList(this.f146258g);
                    }
                    if ((i10 & 128) == 128) {
                        this.f146263l = Collections.unmodifiableList(this.f146263l);
                    }
                    if ((i10 & 256) == 256) {
                        this.f146264m = Collections.unmodifiableList(this.f146264m);
                    }
                    if ((i10 & 512) == 512) {
                        this.f146265n = Collections.unmodifiableList(this.f146265n);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        this.f146254c = outputT.g();
                        throw th4;
                    }
                    this.f146254c = outputT.g();
                    m();
                    return;
                }
            }
        }
    }

    public interface TypeAliasOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface TypeOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class TypeParameter extends GeneratedMessageLite.ExtendableMessage<TypeParameter> implements TypeParameterOrBuilder {

        /* renamed from: n, reason: collision with root package name */
        private static final TypeParameter f146279n;

        /* renamed from: o, reason: collision with root package name */
        public static Parser<TypeParameter> f146280o = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f146281c;

        /* renamed from: d, reason: collision with root package name */
        private int f146282d;

        /* renamed from: e, reason: collision with root package name */
        private int f146283e;

        /* renamed from: f, reason: collision with root package name */
        private int f146284f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f146285g;

        /* renamed from: h, reason: collision with root package name */
        private Variance f146286h;

        /* renamed from: i, reason: collision with root package name */
        private List<Type> f146287i;

        /* renamed from: j, reason: collision with root package name */
        private List<Integer> f146288j;

        /* renamed from: k, reason: collision with root package name */
        private int f146289k;

        /* renamed from: l, reason: collision with root package name */
        private byte f146290l;

        /* renamed from: m, reason: collision with root package name */
        private int f146291m;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f146292d;

            /* renamed from: e, reason: collision with root package name */
            private int f146293e;

            /* renamed from: f, reason: collision with root package name */
            private int f146294f;

            /* renamed from: g, reason: collision with root package name */
            private boolean f146295g;

            /* renamed from: h, reason: collision with root package name */
            private Variance f146296h = Variance.INV;

            /* renamed from: i, reason: collision with root package name */
            private List<Type> f146297i;

            /* renamed from: j, reason: collision with root package name */
            private List<Integer> f146298j;

            private void C() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.f146280o     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Builder");
            }

            private void A() {
                if ((this.f146292d & 16) != 16) {
                    this.f146297i = new ArrayList(this.f146297i);
                    this.f146292d |= 16;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f146292d & 32) != 32) {
                    this.f146298j = new ArrayList(this.f146298j);
                    this.f146292d |= 32;
                }
            }

            public Builder F(int i10) {
                this.f146292d |= 1;
                this.f146293e = i10;
                return this;
            }

            public Builder G(int i10) {
                this.f146292d |= 2;
                this.f146294f = i10;
                return this;
            }

            public Builder H(boolean z10) {
                this.f146292d |= 4;
                this.f146295g = z10;
                return this;
            }

            public TypeParameter w() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i10 = this.f146292d;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                typeParameter.f146283e = this.f146293e;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                typeParameter.f146284f = this.f146294f;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                typeParameter.f146285g = this.f146295g;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                typeParameter.f146286h = this.f146296h;
                if ((this.f146292d & 16) == 16) {
                    this.f146297i = Collections.unmodifiableList(this.f146297i);
                    this.f146292d &= -17;
                }
                typeParameter.f146287i = this.f146297i;
                if ((this.f146292d & 32) == 32) {
                    this.f146298j = Collections.unmodifiableList(this.f146298j);
                    this.f146292d &= -33;
                }
                typeParameter.f146288j = this.f146298j;
                typeParameter.f146282d = i11;
                return typeParameter;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f146297i = list;
                this.f146298j = list;
                C();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public Builder n(TypeParameter typeParameter) {
                if (typeParameter == TypeParameter.L()) {
                    return this;
                }
                if (typeParameter.V()) {
                    F(typeParameter.N());
                }
                if (typeParameter.W()) {
                    G(typeParameter.O());
                }
                if (typeParameter.X()) {
                    H(typeParameter.P());
                }
                if (typeParameter.Y()) {
                    I(typeParameter.U());
                }
                if (!typeParameter.f146287i.isEmpty()) {
                    if (this.f146297i.isEmpty()) {
                        this.f146297i = typeParameter.f146287i;
                        this.f146292d &= -17;
                    } else {
                        A();
                        this.f146297i.addAll(typeParameter.f146287i);
                    }
                }
                if (!typeParameter.f146288j.isEmpty()) {
                    if (this.f146298j.isEmpty()) {
                        this.f146298j = typeParameter.f146288j;
                        this.f146292d &= -33;
                    } else {
                        z();
                        this.f146298j.addAll(typeParameter.f146288j);
                    }
                }
                t(typeParameter);
                o(m().e(typeParameter.f146281c));
                return this;
            }

            public Builder I(Variance variance) {
                variance.getClass();
                this.f146292d |= 8;
                this.f146296h = variance;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public TypeParameter build() {
                TypeParameter typeParameterW = w();
                if (typeParameterW.a()) {
                    return typeParameterW;
                }
                throw AbstractMessageLite.Builder.k(typeParameterW);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return y().n(w());
            }
        }

        public enum Variance implements Internal.EnumLite {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2);


            /* renamed from: e, reason: collision with root package name */
            private static Internal.EnumLiteMap<Variance> f146302e = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f146304a;

            static class a implements Internal.EnumLiteMap<Variance> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public Variance a(int i10) {
                    return Variance.a(i10);
                }
            }

            public static Variance a(int i10) {
                if (i10 == 0) {
                    return IN;
                }
                if (i10 == 1) {
                    return OUT;
                }
                if (i10 != 2) {
                    return null;
                }
                return INV;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int g() {
                return this.f146304a;
            }

            Variance(int i10, int i11) {
                this.f146304a = i11;
            }
        }

        static class a extends AbstractParser<TypeParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public TypeParameter c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeParameter(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        private void Z() {
            this.f146283e = 0;
            this.f146284f = 0;
            this.f146285g = false;
            this.f146286h = Variance.INV;
            List list = Collections.EMPTY_LIST;
            this.f146287i = list;
            this.f146288j = list;
        }

        static {
            TypeParameter typeParameter = new TypeParameter(true);
            f146279n = typeParameter;
            typeParameter.Z();
        }

        public static TypeParameter L() {
            return f146279n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public TypeParameter e() {
            return f146279n;
        }

        public int N() {
            return this.f146283e;
        }

        public int O() {
            return this.f146284f;
        }

        public boolean P() {
            return this.f146285g;
        }

        public Type Q(int i10) {
            return this.f146287i.get(i10);
        }

        public int R() {
            return this.f146287i.size();
        }

        public List<Integer> S() {
            return this.f146288j;
        }

        public List<Type> T() {
            return this.f146287i;
        }

        public Variance U() {
            return this.f146286h;
        }

        public boolean V() {
            return (this.f146282d & 1) == 1;
        }

        public boolean W() {
            return (this.f146282d & 2) == 2;
        }

        public boolean X() {
            return (this.f146282d & 4) == 4;
        }

        public boolean Y() {
            return (this.f146282d & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146290l;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!V()) {
                this.f146290l = (byte) 0;
                return false;
            }
            if (!W()) {
                this.f146290l = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < R(); i10++) {
                if (!Q(i10).a()) {
                    this.f146290l = (byte) 0;
                    return false;
                }
            }
            if (s()) {
                this.f146290l = (byte) 1;
                return true;
            }
            this.f146290l = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146291m;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f146282d & 1) == 1 ? CodedOutputStream.o(1, this.f146283e) : 0;
            if ((this.f146282d & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f146284f);
            }
            if ((this.f146282d & 4) == 4) {
                iO += CodedOutputStream.a(3, this.f146285g);
            }
            if ((this.f146282d & 8) == 8) {
                iO += CodedOutputStream.h(4, this.f146286h.g());
            }
            for (int i11 = 0; i11 < this.f146287i.size(); i11++) {
                iO += CodedOutputStream.s(5, this.f146287i.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f146288j.size(); i12++) {
                iP += CodedOutputStream.p(this.f146288j.get(i12).intValue());
            }
            int iP2 = iO + iP;
            if (!S().isEmpty()) {
                iP2 = iP2 + 1 + CodedOutputStream.p(iP);
            }
            this.f146289k = iP;
            int iT = iP2 + t() + this.f146281c.size();
            this.f146291m = iT;
            return iT;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeParameter> f() {
            return f146280o;
        }

        private TypeParameter(GeneratedMessageLite.ExtendableBuilder<TypeParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f146289k = -1;
            this.f146290l = (byte) -1;
            this.f146291m = -1;
            this.f146281c = extendableBuilder.m();
        }

        public static Builder a0() {
            return Builder.y();
        }

        public static Builder b0(TypeParameter typeParameter) {
            return a0().n(typeParameter);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: c0, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return a0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: d0, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return b0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterZ = z();
            if ((this.f146282d & 1) == 1) {
                codedOutputStream.a0(1, this.f146283e);
            }
            if ((this.f146282d & 2) == 2) {
                codedOutputStream.a0(2, this.f146284f);
            }
            if ((this.f146282d & 4) == 4) {
                codedOutputStream.L(3, this.f146285g);
            }
            if ((this.f146282d & 8) == 8) {
                codedOutputStream.S(4, this.f146286h.g());
            }
            for (int i10 = 0; i10 < this.f146287i.size(); i10++) {
                codedOutputStream.d0(5, this.f146287i.get(i10));
            }
            if (S().size() > 0) {
                codedOutputStream.o0(50);
                codedOutputStream.o0(this.f146289k);
            }
            for (int i11 = 0; i11 < this.f146288j.size(); i11++) {
                codedOutputStream.b0(this.f146288j.get(i11).intValue());
            }
            extensionWriterZ.a(1000, codedOutputStream);
            codedOutputStream.i0(this.f146281c);
        }

        private TypeParameter(boolean z10) {
            this.f146289k = -1;
            this.f146290l = (byte) -1;
            this.f146291m = -1;
            this.f146281c = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f146289k = -1;
            this.f146290l = (byte) -1;
            this.f146291m = -1;
            Z();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = codedInputStream.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f146282d |= 1;
                                this.f146283e = codedInputStream.s();
                            } else if (iK == 16) {
                                this.f146282d |= 2;
                                this.f146284f = codedInputStream.s();
                            } else if (iK == 24) {
                                this.f146282d |= 4;
                                this.f146285g = codedInputStream.k();
                            } else if (iK == 32) {
                                int iN = codedInputStream.n();
                                Variance varianceA = Variance.a(iN);
                                if (varianceA == null) {
                                    codedOutputStreamJ.o0(iK);
                                    codedOutputStreamJ.o0(iN);
                                } else {
                                    this.f146282d |= 8;
                                    this.f146286h = varianceA;
                                }
                            } else if (iK == 42) {
                                if ((i10 & 16) != 16) {
                                    this.f146287i = new ArrayList();
                                    i10 |= 16;
                                }
                                this.f146287i.add(codedInputStream.u(Type.f146198v, extensionRegistryLite));
                            } else if (iK == 48) {
                                if ((i10 & 32) != 32) {
                                    this.f146288j = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f146288j.add(Integer.valueOf(codedInputStream.s()));
                            } else if (iK != 50) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                int iJ = codedInputStream.j(codedInputStream.A());
                                if ((i10 & 32) != 32 && codedInputStream.e() > 0) {
                                    this.f146288j = new ArrayList();
                                    i10 |= 32;
                                }
                                while (codedInputStream.e() > 0) {
                                    this.f146288j.add(Integer.valueOf(codedInputStream.s()));
                                }
                                codedInputStream.i(iJ);
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if ((i10 & 16) == 16) {
                        this.f146287i = Collections.unmodifiableList(this.f146287i);
                    }
                    if ((i10 & 32) == 32) {
                        this.f146288j = Collections.unmodifiableList(this.f146288j);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f146281c = outputT.g();
                        throw th3;
                    }
                    this.f146281c = outputT.g();
                    m();
                    throw th2;
                }
            }
            if ((i10 & 16) == 16) {
                this.f146287i = Collections.unmodifiableList(this.f146287i);
            }
            if ((i10 & 32) == 32) {
                this.f146288j = Collections.unmodifiableList(this.f146288j);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f146281c = outputT.g();
                throw th4;
            }
            this.f146281c = outputT.g();
            m();
        }
    }

    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {

        /* renamed from: h, reason: collision with root package name */
        private static final TypeTable f146305h;

        /* renamed from: i, reason: collision with root package name */
        public static Parser<TypeTable> f146306i = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f146307b;

        /* renamed from: c, reason: collision with root package name */
        private int f146308c;

        /* renamed from: d, reason: collision with root package name */
        private List<Type> f146309d;

        /* renamed from: e, reason: collision with root package name */
        private int f146310e;

        /* renamed from: f, reason: collision with root package name */
        private byte f146311f;

        /* renamed from: g, reason: collision with root package name */
        private int f146312g;

        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f146313b;

            /* renamed from: c, reason: collision with root package name */
            private List<Type> f146314c = Collections.EMPTY_LIST;

            /* renamed from: d, reason: collision with root package name */
            private int f146315d = -1;

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.f146306i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f146313b & 1) != 1) {
                    this.f146314c = new ArrayList(this.f146314c);
                    this.f146313b |= 1;
                }
            }

            public TypeTable r() {
                TypeTable typeTable = new TypeTable(this);
                int i10 = this.f146313b;
                if ((i10 & 1) == 1) {
                    this.f146314c = Collections.unmodifiableList(this.f146314c);
                    this.f146313b &= -2;
                }
                typeTable.f146309d = this.f146314c;
                int i11 = (i10 & 2) != 2 ? 0 : 1;
                typeTable.f146310e = this.f146315d;
                typeTable.f146308c = i11;
                return typeTable;
            }

            public Builder y(int i10) {
                this.f146313b |= 2;
                this.f146315d = i10;
                return this;
            }

            private Builder() {
                v();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public TypeTable build() {
                TypeTable typeTableR = r();
                if (typeTableR.a()) {
                    return typeTableR;
                }
                throw AbstractMessageLite.Builder.k(typeTableR);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return t().n(r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public Builder n(TypeTable typeTable) {
                if (typeTable == TypeTable.x()) {
                    return this;
                }
                if (!typeTable.f146309d.isEmpty()) {
                    if (this.f146314c.isEmpty()) {
                        this.f146314c = typeTable.f146309d;
                        this.f146313b &= -2;
                    } else {
                        u();
                        this.f146314c.addAll(typeTable.f146309d);
                    }
                }
                if (typeTable.C()) {
                    y(typeTable.y());
                }
                o(m().e(typeTable.f146307b));
                return this;
            }
        }

        static class a extends AbstractParser<TypeTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public TypeTable c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new TypeTable(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        static {
            TypeTable typeTable = new TypeTable(true);
            f146305h = typeTable;
            typeTable.D();
        }

        private void D() {
            this.f146309d = Collections.EMPTY_LIST;
            this.f146310e = -1;
        }

        public static TypeTable x() {
            return f146305h;
        }

        public int A() {
            return this.f146309d.size();
        }

        public List<Type> B() {
            return this.f146309d;
        }

        public boolean C() {
            return (this.f146308c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146311f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < A(); i10++) {
                if (!z(i10).a()) {
                    this.f146311f = (byte) 0;
                    return false;
                }
            }
            this.f146311f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146312g;
            if (i10 != -1) {
                return i10;
            }
            int iO = 0;
            for (int i11 = 0; i11 < this.f146309d.size(); i11++) {
                iO += CodedOutputStream.s(1, this.f146309d.get(i11));
            }
            if ((this.f146308c & 1) == 1) {
                iO += CodedOutputStream.o(2, this.f146310e);
            }
            int size = iO + this.f146307b.size();
            this.f146312g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeTable> f() {
            return f146306i;
        }

        public int y() {
            return this.f146310e;
        }

        public Type z(int i10) {
            return this.f146309d.get(i10);
        }

        private TypeTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f146311f = (byte) -1;
            this.f146312g = -1;
            this.f146307b = builder.m();
        }

        public static Builder E() {
            return Builder.t();
        }

        public static Builder F(TypeTable typeTable) {
            return E().n(typeTable);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return E();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return F(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            for (int i10 = 0; i10 < this.f146309d.size(); i10++) {
                codedOutputStream.d0(1, this.f146309d.get(i10));
            }
            if ((this.f146308c & 1) == 1) {
                codedOutputStream.a0(2, this.f146310e);
            }
            codedOutputStream.i0(this.f146307b);
        }

        private TypeTable(boolean z10) {
            this.f146311f = (byte) -1;
            this.f146312g = -1;
            this.f146307b = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f146311f = (byte) -1;
            this.f146312g = -1;
            D();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int iK = codedInputStream.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                if (!z11) {
                                    this.f146309d = new ArrayList();
                                    z11 = true;
                                }
                                this.f146309d.add(codedInputStream.u(Type.f146198v, extensionRegistryLite));
                            } else if (iK != 16) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                this.f146308c |= 1;
                                this.f146310e = codedInputStream.s();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (z11) {
                            this.f146309d = Collections.unmodifiableList(this.f146309d);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f146307b = outputT.g();
                            throw th3;
                        }
                        this.f146307b = outputT.g();
                        m();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            if (z11) {
                this.f146309d = Collections.unmodifiableList(this.f146309d);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f146307b = outputT.g();
                throw th4;
            }
            this.f146307b = outputT.g();
            m();
        }
    }

    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {

        /* renamed from: m, reason: collision with root package name */
        private static final ValueParameter f146316m;

        /* renamed from: n, reason: collision with root package name */
        public static Parser<ValueParameter> f146317n = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f146318c;

        /* renamed from: d, reason: collision with root package name */
        private int f146319d;

        /* renamed from: e, reason: collision with root package name */
        private int f146320e;

        /* renamed from: f, reason: collision with root package name */
        private int f146321f;

        /* renamed from: g, reason: collision with root package name */
        private Type f146322g;

        /* renamed from: h, reason: collision with root package name */
        private int f146323h;

        /* renamed from: i, reason: collision with root package name */
        private Type f146324i;

        /* renamed from: j, reason: collision with root package name */
        private int f146325j;

        /* renamed from: k, reason: collision with root package name */
        private byte f146326k;

        /* renamed from: l, reason: collision with root package name */
        private int f146327l;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f146328d;

            /* renamed from: e, reason: collision with root package name */
            private int f146329e;

            /* renamed from: f, reason: collision with root package name */
            private int f146330f;

            /* renamed from: h, reason: collision with root package name */
            private int f146332h;

            /* renamed from: j, reason: collision with root package name */
            private int f146334j;

            /* renamed from: g, reason: collision with root package name */
            private Type f146331g = Type.Y();

            /* renamed from: i, reason: collision with root package name */
            private Type f146333i = Type.Y();

            private void z() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.f146317n     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            public Builder D(Type type) {
                if ((this.f146328d & 4) != 4 || this.f146331g == Type.Y()) {
                    this.f146331g = type;
                } else {
                    this.f146331g = Type.A0(this.f146331g).n(type).w();
                }
                this.f146328d |= 4;
                return this;
            }

            public Builder E(Type type) {
                if ((this.f146328d & 16) != 16 || this.f146333i == Type.Y()) {
                    this.f146333i = type;
                } else {
                    this.f146333i = Type.A0(this.f146333i).n(type).w();
                }
                this.f146328d |= 16;
                return this;
            }

            public Builder F(int i10) {
                this.f146328d |= 1;
                this.f146329e = i10;
                return this;
            }

            public Builder G(int i10) {
                this.f146328d |= 2;
                this.f146330f = i10;
                return this;
            }

            public Builder H(int i10) {
                this.f146328d |= 8;
                this.f146332h = i10;
                return this;
            }

            public Builder I(int i10) {
                this.f146328d |= 32;
                this.f146334j = i10;
                return this;
            }

            public ValueParameter w() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i10 = this.f146328d;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                valueParameter.f146320e = this.f146329e;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                valueParameter.f146321f = this.f146330f;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                valueParameter.f146322g = this.f146331g;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                valueParameter.f146323h = this.f146332h;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                valueParameter.f146324i = this.f146333i;
                if ((i10 & 32) == 32) {
                    i11 |= 32;
                }
                valueParameter.f146325j = this.f146334j;
                valueParameter.f146319d = i11;
                return valueParameter;
            }

            private Builder() {
                z();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public Builder n(ValueParameter valueParameter) {
                if (valueParameter == ValueParameter.J()) {
                    return this;
                }
                if (valueParameter.R()) {
                    F(valueParameter.L());
                }
                if (valueParameter.S()) {
                    G(valueParameter.M());
                }
                if (valueParameter.T()) {
                    D(valueParameter.N());
                }
                if (valueParameter.U()) {
                    H(valueParameter.O());
                }
                if (valueParameter.V()) {
                    E(valueParameter.P());
                }
                if (valueParameter.W()) {
                    I(valueParameter.Q());
                }
                t(valueParameter);
                o(m().e(valueParameter.f146318c));
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public ValueParameter build() {
                ValueParameter valueParameterW = w();
                if (valueParameterW.a()) {
                    return valueParameterW;
                }
                throw AbstractMessageLite.Builder.k(valueParameterW);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.ExtendableBuilder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return y().n(w());
            }
        }

        static class a extends AbstractParser<ValueParameter> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public ValueParameter c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new ValueParameter(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        private void X() {
            this.f146320e = 0;
            this.f146321f = 0;
            this.f146322g = Type.Y();
            this.f146323h = 0;
            this.f146324i = Type.Y();
            this.f146325j = 0;
        }

        static {
            ValueParameter valueParameter = new ValueParameter(true);
            f146316m = valueParameter;
            valueParameter.X();
        }

        public static ValueParameter J() {
            return f146316m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public ValueParameter e() {
            return f146316m;
        }

        public int L() {
            return this.f146320e;
        }

        public int M() {
            return this.f146321f;
        }

        public Type N() {
            return this.f146322g;
        }

        public int O() {
            return this.f146323h;
        }

        public Type P() {
            return this.f146324i;
        }

        public int Q() {
            return this.f146325j;
        }

        public boolean R() {
            return (this.f146319d & 1) == 1;
        }

        public boolean S() {
            return (this.f146319d & 2) == 2;
        }

        public boolean T() {
            return (this.f146319d & 4) == 4;
        }

        public boolean U() {
            return (this.f146319d & 8) == 8;
        }

        public boolean V() {
            return (this.f146319d & 16) == 16;
        }

        public boolean W() {
            return (this.f146319d & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146326k;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!S()) {
                this.f146326k = (byte) 0;
                return false;
            }
            if (T() && !N().a()) {
                this.f146326k = (byte) 0;
                return false;
            }
            if (V() && !P().a()) {
                this.f146326k = (byte) 0;
                return false;
            }
            if (s()) {
                this.f146326k = (byte) 1;
                return true;
            }
            this.f146326k = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146327l;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f146319d & 1) == 1 ? CodedOutputStream.o(1, this.f146320e) : 0;
            if ((this.f146319d & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f146321f);
            }
            if ((this.f146319d & 4) == 4) {
                iO += CodedOutputStream.s(3, this.f146322g);
            }
            if ((this.f146319d & 16) == 16) {
                iO += CodedOutputStream.s(4, this.f146324i);
            }
            if ((this.f146319d & 8) == 8) {
                iO += CodedOutputStream.o(5, this.f146323h);
            }
            if ((this.f146319d & 32) == 32) {
                iO += CodedOutputStream.o(6, this.f146325j);
            }
            int iT = iO + t() + this.f146318c.size();
            this.f146327l = iT;
            return iT;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<ValueParameter> f() {
            return f146317n;
        }

        private ValueParameter(GeneratedMessageLite.ExtendableBuilder<ValueParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f146326k = (byte) -1;
            this.f146327l = -1;
            this.f146318c = extendableBuilder.m();
        }

        public static Builder Y() {
            return Builder.y();
        }

        public static Builder Z(ValueParameter valueParameter) {
            return Y().n(valueParameter);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: a0, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return Y();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: b0, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return Z(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterZ = z();
            if ((this.f146319d & 1) == 1) {
                codedOutputStream.a0(1, this.f146320e);
            }
            if ((this.f146319d & 2) == 2) {
                codedOutputStream.a0(2, this.f146321f);
            }
            if ((this.f146319d & 4) == 4) {
                codedOutputStream.d0(3, this.f146322g);
            }
            if ((this.f146319d & 16) == 16) {
                codedOutputStream.d0(4, this.f146324i);
            }
            if ((this.f146319d & 8) == 8) {
                codedOutputStream.a0(5, this.f146323h);
            }
            if ((this.f146319d & 32) == 32) {
                codedOutputStream.a0(6, this.f146325j);
            }
            extensionWriterZ.a(HttpResponseStatus.SUCCESS_OK, codedOutputStream);
            codedOutputStream.i0(this.f146318c);
        }

        private ValueParameter(boolean z10) {
            this.f146326k = (byte) -1;
            this.f146327l = -1;
            this.f146318c = ByteString.f146726a;
        }

        private ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Type.Builder builderB;
            this.f146326k = (byte) -1;
            this.f146327l = -1;
            X();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = codedInputStream.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f146319d |= 1;
                                this.f146320e = codedInputStream.s();
                            } else if (iK != 16) {
                                if (iK == 26) {
                                    builderB = (this.f146319d & 4) == 4 ? this.f146322g.b() : null;
                                    Type type = (Type) codedInputStream.u(Type.f146198v, extensionRegistryLite);
                                    this.f146322g = type;
                                    if (builderB != null) {
                                        builderB.n(type);
                                        this.f146322g = builderB.w();
                                    }
                                    this.f146319d |= 4;
                                } else if (iK == 34) {
                                    builderB = (this.f146319d & 16) == 16 ? this.f146324i.b() : null;
                                    Type type2 = (Type) codedInputStream.u(Type.f146198v, extensionRegistryLite);
                                    this.f146324i = type2;
                                    if (builderB != null) {
                                        builderB.n(type2);
                                        this.f146324i = builderB.w();
                                    }
                                    this.f146319d |= 16;
                                } else if (iK == 40) {
                                    this.f146319d |= 8;
                                    this.f146323h = codedInputStream.s();
                                } else if (iK != 48) {
                                    if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                    }
                                } else {
                                    this.f146319d |= 32;
                                    this.f146325j = codedInputStream.s();
                                }
                            } else {
                                this.f146319d |= 2;
                                this.f146321f = codedInputStream.s();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f146318c = outputT.g();
                            throw th3;
                        }
                        this.f146318c = outputT.g();
                        m();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f146318c = outputT.g();
                throw th4;
            }
            this.f146318c = outputT.g();
            m();
        }
    }

    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {

        /* renamed from: l, reason: collision with root package name */
        private static final VersionRequirement f146335l;

        /* renamed from: m, reason: collision with root package name */
        public static Parser<VersionRequirement> f146336m = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f146337b;

        /* renamed from: c, reason: collision with root package name */
        private int f146338c;

        /* renamed from: d, reason: collision with root package name */
        private int f146339d;

        /* renamed from: e, reason: collision with root package name */
        private int f146340e;

        /* renamed from: f, reason: collision with root package name */
        private Level f146341f;

        /* renamed from: g, reason: collision with root package name */
        private int f146342g;

        /* renamed from: h, reason: collision with root package name */
        private int f146343h;

        /* renamed from: i, reason: collision with root package name */
        private VersionKind f146344i;

        /* renamed from: j, reason: collision with root package name */
        private byte f146345j;

        /* renamed from: k, reason: collision with root package name */
        private int f146346k;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f146347b;

            /* renamed from: c, reason: collision with root package name */
            private int f146348c;

            /* renamed from: d, reason: collision with root package name */
            private int f146349d;

            /* renamed from: f, reason: collision with root package name */
            private int f146351f;

            /* renamed from: g, reason: collision with root package name */
            private int f146352g;

            /* renamed from: e, reason: collision with root package name */
            private Level f146350e = Level.ERROR;

            /* renamed from: h, reason: collision with root package name */
            private VersionKind f146353h = VersionKind.LANGUAGE_VERSION;

            private void u() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.f146336m     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            public Builder A(int i10) {
                this.f146347b |= 1;
                this.f146348c = i10;
                return this;
            }

            public Builder C(int i10) {
                this.f146347b |= 2;
                this.f146349d = i10;
                return this;
            }

            public VersionRequirement r() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i10 = this.f146347b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                versionRequirement.f146339d = this.f146348c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                versionRequirement.f146340e = this.f146349d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                versionRequirement.f146341f = this.f146350e;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                versionRequirement.f146342g = this.f146351f;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                versionRequirement.f146343h = this.f146352g;
                if ((i10 & 32) == 32) {
                    i11 |= 32;
                }
                versionRequirement.f146344i = this.f146353h;
                versionRequirement.f146338c = i11;
                return versionRequirement;
            }

            public Builder x(int i10) {
                this.f146347b |= 8;
                this.f146351f = i10;
                return this;
            }

            public Builder z(int i10) {
                this.f146347b |= 16;
                this.f146352g = i10;
                return this;
            }

            private Builder() {
                u();
            }

            public Builder D(VersionKind versionKind) {
                versionKind.getClass();
                this.f146347b |= 32;
                this.f146353h = versionKind;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public VersionRequirement build() {
                VersionRequirement versionRequirementR = r();
                if (versionRequirementR.a()) {
                    return versionRequirementR;
                }
                throw AbstractMessageLite.Builder.k(versionRequirementR);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return t().n(r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public Builder n(VersionRequirement versionRequirement) {
                if (versionRequirement == VersionRequirement.A()) {
                    return this;
                }
                if (versionRequirement.K()) {
                    A(versionRequirement.E());
                }
                if (versionRequirement.L()) {
                    C(versionRequirement.F());
                }
                if (versionRequirement.I()) {
                    y(versionRequirement.C());
                }
                if (versionRequirement.H()) {
                    x(versionRequirement.B());
                }
                if (versionRequirement.J()) {
                    z(versionRequirement.D());
                }
                if (versionRequirement.M()) {
                    D(versionRequirement.G());
                }
                o(m().e(versionRequirement.f146337b));
                return this;
            }

            public Builder y(Level level) {
                level.getClass();
                this.f146347b |= 4;
                this.f146350e = level;
                return this;
            }
        }

        public enum Level implements Internal.EnumLite {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);


            /* renamed from: e, reason: collision with root package name */
            private static Internal.EnumLiteMap<Level> f146357e = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f146359a;

            static class a implements Internal.EnumLiteMap<Level> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public Level a(int i10) {
                    return Level.a(i10);
                }
            }

            public static Level a(int i10) {
                if (i10 == 0) {
                    return WARNING;
                }
                if (i10 == 1) {
                    return ERROR;
                }
                if (i10 != 2) {
                    return null;
                }
                return HIDDEN;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int g() {
                return this.f146359a;
            }

            Level(int i10, int i11) {
                this.f146359a = i11;
            }
        }

        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0, 0),
            COMPILER_VERSION(1, 1),
            API_VERSION(2, 2);


            /* renamed from: e, reason: collision with root package name */
            private static Internal.EnumLiteMap<VersionKind> f146363e = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f146365a;

            static class a implements Internal.EnumLiteMap<VersionKind> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public VersionKind a(int i10) {
                    return VersionKind.a(i10);
                }
            }

            public static VersionKind a(int i10) {
                if (i10 == 0) {
                    return LANGUAGE_VERSION;
                }
                if (i10 == 1) {
                    return COMPILER_VERSION;
                }
                if (i10 != 2) {
                    return null;
                }
                return API_VERSION;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
            public final int g() {
                return this.f146365a;
            }

            VersionKind(int i10, int i11) {
                this.f146365a = i11;
            }
        }

        static class a extends AbstractParser<VersionRequirement> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public VersionRequirement c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirement(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        private void N() {
            this.f146339d = 0;
            this.f146340e = 0;
            this.f146341f = Level.ERROR;
            this.f146342g = 0;
            this.f146343h = 0;
            this.f146344i = VersionKind.LANGUAGE_VERSION;
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement(true);
            f146335l = versionRequirement;
            versionRequirement.N();
        }

        public static VersionRequirement A() {
            return f146335l;
        }

        public int B() {
            return this.f146342g;
        }

        public Level C() {
            return this.f146341f;
        }

        public int D() {
            return this.f146343h;
        }

        public int E() {
            return this.f146339d;
        }

        public int F() {
            return this.f146340e;
        }

        public VersionKind G() {
            return this.f146344i;
        }

        public boolean H() {
            return (this.f146338c & 8) == 8;
        }

        public boolean I() {
            return (this.f146338c & 4) == 4;
        }

        public boolean J() {
            return (this.f146338c & 16) == 16;
        }

        public boolean K() {
            return (this.f146338c & 1) == 1;
        }

        public boolean L() {
            return (this.f146338c & 2) == 2;
        }

        public boolean M() {
            return (this.f146338c & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146345j;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f146345j = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146346k;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f146338c & 1) == 1 ? CodedOutputStream.o(1, this.f146339d) : 0;
            if ((this.f146338c & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f146340e);
            }
            if ((this.f146338c & 4) == 4) {
                iO += CodedOutputStream.h(3, this.f146341f.g());
            }
            if ((this.f146338c & 8) == 8) {
                iO += CodedOutputStream.o(4, this.f146342g);
            }
            if ((this.f146338c & 16) == 16) {
                iO += CodedOutputStream.o(5, this.f146343h);
            }
            if ((this.f146338c & 32) == 32) {
                iO += CodedOutputStream.h(6, this.f146344i.g());
            }
            int size = iO + this.f146337b.size();
            this.f146346k = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirement> f() {
            return f146336m;
        }

        private VersionRequirement(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f146345j = (byte) -1;
            this.f146346k = -1;
            this.f146337b = builder.m();
        }

        public static Builder O() {
            return Builder.t();
        }

        public static Builder P(VersionRequirement versionRequirement) {
            return O().n(versionRequirement);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return O();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return P(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            if ((this.f146338c & 1) == 1) {
                codedOutputStream.a0(1, this.f146339d);
            }
            if ((this.f146338c & 2) == 2) {
                codedOutputStream.a0(2, this.f146340e);
            }
            if ((this.f146338c & 4) == 4) {
                codedOutputStream.S(3, this.f146341f.g());
            }
            if ((this.f146338c & 8) == 8) {
                codedOutputStream.a0(4, this.f146342g);
            }
            if ((this.f146338c & 16) == 16) {
                codedOutputStream.a0(5, this.f146343h);
            }
            if ((this.f146338c & 32) == 32) {
                codedOutputStream.S(6, this.f146344i.g());
            }
            codedOutputStream.i0(this.f146337b);
        }

        private VersionRequirement(boolean z10) {
            this.f146345j = (byte) -1;
            this.f146346k = -1;
            this.f146337b = ByteString.f146726a;
        }

        private VersionRequirement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f146345j = (byte) -1;
            this.f146346k = -1;
            N();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = codedInputStream.K();
                        if (iK != 0) {
                            if (iK == 8) {
                                this.f146338c |= 1;
                                this.f146339d = codedInputStream.s();
                            } else if (iK == 16) {
                                this.f146338c |= 2;
                                this.f146340e = codedInputStream.s();
                            } else if (iK == 24) {
                                int iN = codedInputStream.n();
                                Level levelA = Level.a(iN);
                                if (levelA == null) {
                                    codedOutputStreamJ.o0(iK);
                                    codedOutputStreamJ.o0(iN);
                                } else {
                                    this.f146338c |= 4;
                                    this.f146341f = levelA;
                                }
                            } else if (iK == 32) {
                                this.f146338c |= 8;
                                this.f146342g = codedInputStream.s();
                            } else if (iK == 40) {
                                this.f146338c |= 16;
                                this.f146343h = codedInputStream.s();
                            } else if (iK != 48) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                int iN2 = codedInputStream.n();
                                VersionKind versionKindA = VersionKind.a(iN2);
                                if (versionKindA == null) {
                                    codedOutputStreamJ.o0(iK);
                                    codedOutputStreamJ.o0(iN2);
                                } else {
                                    this.f146338c |= 32;
                                    this.f146344i = versionKindA;
                                }
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f146337b = outputT.g();
                            throw th3;
                        }
                        this.f146337b = outputT.g();
                        m();
                        throw th2;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f146337b = outputT.g();
                throw th4;
            }
            this.f146337b = outputT.g();
            m();
        }
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {

        /* renamed from: f, reason: collision with root package name */
        private static final VersionRequirementTable f146366f;

        /* renamed from: g, reason: collision with root package name */
        public static Parser<VersionRequirementTable> f146367g = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f146368b;

        /* renamed from: c, reason: collision with root package name */
        private List<VersionRequirement> f146369c;

        /* renamed from: d, reason: collision with root package name */
        private byte f146370d;

        /* renamed from: e, reason: collision with root package name */
        private int f146371e;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f146372b;

            /* renamed from: c, reason: collision with root package name */
            private List<VersionRequirement> f146373c = Collections.EMPTY_LIST;

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.f146367g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r3 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    if (r3 == 0) goto Le
                    r2.n(r3)
                Le:
                    return r2
                Lf:
                    r3 = move-exception
                    goto L1b
                L11:
                    r3 = move-exception
                    kotlin.reflect.jvm.internal.impl.protobuf.MessageLite r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r4 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable) r4     // Catch: java.lang.Throwable -> Lf
                    throw r3     // Catch: java.lang.Throwable -> L19
                L19:
                    r3 = move-exception
                    r0 = r4
                L1b:
                    if (r0 == 0) goto L20
                    r2.n(r0)
                L20:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f146372b & 1) != 1) {
                    this.f146373c = new ArrayList(this.f146373c);
                    this.f146372b |= 1;
                }
            }

            public VersionRequirementTable r() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.f146372b & 1) == 1) {
                    this.f146373c = Collections.unmodifiableList(this.f146373c);
                    this.f146372b &= -2;
                }
                versionRequirementTable.f146369c = this.f146373c;
                return versionRequirementTable;
            }

            private Builder() {
                v();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public VersionRequirementTable build() {
                VersionRequirementTable versionRequirementTableR = r();
                if (versionRequirementTableR.a()) {
                    return versionRequirementTableR;
                }
                throw AbstractMessageLite.Builder.k(versionRequirementTableR);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return t().n(r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public Builder n(VersionRequirementTable versionRequirementTable) {
                if (versionRequirementTable == VersionRequirementTable.u()) {
                    return this;
                }
                if (!versionRequirementTable.f146369c.isEmpty()) {
                    if (this.f146373c.isEmpty()) {
                        this.f146373c = versionRequirementTable.f146369c;
                        this.f146372b &= -2;
                    } else {
                        u();
                        this.f146373c.addAll(versionRequirementTable.f146369c);
                    }
                }
                o(m().e(versionRequirementTable.f146368b));
                return this;
            }
        }

        static class a extends AbstractParser<VersionRequirementTable> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public VersionRequirementTable c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new VersionRequirementTable(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        static {
            VersionRequirementTable versionRequirementTable = new VersionRequirementTable(true);
            f146366f = versionRequirementTable;
            versionRequirementTable.y();
        }

        public static VersionRequirementTable u() {
            return f146366f;
        }

        private void y() {
            this.f146369c = Collections.EMPTY_LIST;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146370d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f146370d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146371e;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f146369c.size(); i11++) {
                iS += CodedOutputStream.s(1, this.f146369c.get(i11));
            }
            int size = iS + this.f146368b.size();
            this.f146371e = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirementTable> f() {
            return f146367g;
        }

        public int v() {
            return this.f146369c.size();
        }

        public List<VersionRequirement> x() {
            return this.f146369c;
        }

        private VersionRequirementTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f146370d = (byte) -1;
            this.f146371e = -1;
            this.f146368b = builder.m();
        }

        public static Builder A(VersionRequirementTable versionRequirementTable) {
            return z().n(versionRequirementTable);
        }

        public static Builder z() {
            return Builder.t();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return z();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return A(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            for (int i10 = 0; i10 < this.f146369c.size(); i10++) {
                codedOutputStream.d0(1, this.f146369c.get(i10));
            }
            codedOutputStream.i0(this.f146368b);
        }

        private VersionRequirementTable(boolean z10) {
            this.f146370d = (byte) -1;
            this.f146371e = -1;
            this.f146368b = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f146370d = (byte) -1;
            this.f146371e = -1;
            y();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        try {
                            int iK = codedInputStream.K();
                            if (iK != 0) {
                                if (iK != 10) {
                                    if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                    }
                                } else {
                                    if (!z11) {
                                        this.f146369c = new ArrayList();
                                        z11 = true;
                                    }
                                    this.f146369c.add(codedInputStream.u(VersionRequirement.f146336m, extensionRegistryLite));
                                }
                            }
                            z10 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.i(this);
                        }
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                } catch (Throwable th2) {
                    if (z11) {
                        this.f146369c = Collections.unmodifiableList(this.f146369c);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f146368b = outputT.g();
                        throw th3;
                    }
                    this.f146368b = outputT.g();
                    m();
                    throw th2;
                }
            }
            if (z11) {
                this.f146369c = Collections.unmodifiableList(this.f146369c);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f146368b = outputT.g();
                throw th4;
            }
            this.f146368b = outputT.g();
            m();
        }
    }

    public interface VersionRequirementTableOrBuilder extends MessageLiteOrBuilder {
    }

    public enum Visibility implements Internal.EnumLite {
        INTERNAL(0, 0),
        PRIVATE(1, 1),
        PROTECTED(2, 2),
        PUBLIC(3, 3),
        PRIVATE_TO_THIS(4, 4),
        LOCAL(5, 5);


        /* renamed from: h, reason: collision with root package name */
        private static Internal.EnumLiteMap<Visibility> f146380h = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f146382a;

        static class a implements Internal.EnumLiteMap<Visibility> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Visibility a(int i10) {
                return Visibility.a(i10);
            }
        }

        public static Visibility a(int i10) {
            if (i10 == 0) {
                return INTERNAL;
            }
            if (i10 == 1) {
                return PRIVATE;
            }
            if (i10 == 2) {
                return PROTECTED;
            }
            if (i10 == 3) {
                return PUBLIC;
            }
            if (i10 == 4) {
                return PRIVATE_TO_THIS;
            }
            if (i10 != 5) {
                return null;
            }
            return LOCAL;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
        public final int g() {
            return this.f146382a;
        }

        Visibility(int i10, int i11) {
            this.f146382a = i11;
        }
    }
}
