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

/* loaded from: classes13.dex */
public final class ProtoBuf {

    public static final class Annotation extends GeneratedMessageLite implements AnnotationOrBuilder {

        /* renamed from: h, reason: collision with root package name */
        private static final Annotation f144896h;

        /* renamed from: i, reason: collision with root package name */
        public static Parser<Annotation> f144897i = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f144898b;

        /* renamed from: c, reason: collision with root package name */
        private int f144899c;

        /* renamed from: d, reason: collision with root package name */
        private int f144900d;

        /* renamed from: e, reason: collision with root package name */
        private List<Argument> f144901e;

        /* renamed from: f, reason: collision with root package name */
        private byte f144902f;

        /* renamed from: g, reason: collision with root package name */
        private int f144903g;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {

            /* renamed from: h, reason: collision with root package name */
            private static final Argument f144904h;

            /* renamed from: i, reason: collision with root package name */
            public static Parser<Argument> f144905i = new a();

            /* renamed from: b, reason: collision with root package name */
            private final ByteString f144906b;

            /* renamed from: c, reason: collision with root package name */
            private int f144907c;

            /* renamed from: d, reason: collision with root package name */
            private int f144908d;

            /* renamed from: e, reason: collision with root package name */
            private Value f144909e;

            /* renamed from: f, reason: collision with root package name */
            private byte f144910f;

            /* renamed from: g, reason: collision with root package name */
            private int f144911g;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* renamed from: b, reason: collision with root package name */
                private int f144912b;

                /* renamed from: c, reason: collision with root package name */
                private int f144913c;

                /* renamed from: d, reason: collision with root package name */
                private Value f144914d = Value.M();

                private void u() {
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.f144905i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    int i10 = this.f144912b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    argument.f144908d = this.f144913c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    argument.f144909e = this.f144914d;
                    argument.f144907c = i11;
                    return argument;
                }

                public Builder x(Value value) {
                    if ((this.f144912b & 2) != 2 || this.f144914d == Value.M()) {
                        this.f144914d = value;
                    } else {
                        this.f144914d = Value.g0(this.f144914d).n(value).r();
                    }
                    this.f144912b |= 2;
                    return this;
                }

                public Builder y(int i10) {
                    this.f144912b |= 1;
                    this.f144913c = i10;
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
                    o(m().e(argument.f144906b));
                    return this;
                }
            }

            public static final class Value extends GeneratedMessageLite implements ValueOrBuilder {

                /* renamed from: q, reason: collision with root package name */
                private static final Value f144915q;

                /* renamed from: r, reason: collision with root package name */
                public static Parser<Value> f144916r = new a();

                /* renamed from: b, reason: collision with root package name */
                private final ByteString f144917b;

                /* renamed from: c, reason: collision with root package name */
                private int f144918c;

                /* renamed from: d, reason: collision with root package name */
                private Type f144919d;

                /* renamed from: e, reason: collision with root package name */
                private long f144920e;

                /* renamed from: f, reason: collision with root package name */
                private float f144921f;

                /* renamed from: g, reason: collision with root package name */
                private double f144922g;

                /* renamed from: h, reason: collision with root package name */
                private int f144923h;

                /* renamed from: i, reason: collision with root package name */
                private int f144924i;

                /* renamed from: j, reason: collision with root package name */
                private int f144925j;

                /* renamed from: k, reason: collision with root package name */
                private Annotation f144926k;

                /* renamed from: l, reason: collision with root package name */
                private List<Value> f144927l;

                /* renamed from: m, reason: collision with root package name */
                private int f144928m;

                /* renamed from: n, reason: collision with root package name */
                private int f144929n;

                /* renamed from: o, reason: collision with root package name */
                private byte f144930o;

                /* renamed from: p, reason: collision with root package name */
                private int f144931p;

                public static final class Builder extends GeneratedMessageLite.Builder<Value, Builder> implements ValueOrBuilder {

                    /* renamed from: b, reason: collision with root package name */
                    private int f144932b;

                    /* renamed from: d, reason: collision with root package name */
                    private long f144934d;

                    /* renamed from: e, reason: collision with root package name */
                    private float f144935e;

                    /* renamed from: f, reason: collision with root package name */
                    private double f144936f;

                    /* renamed from: g, reason: collision with root package name */
                    private int f144937g;

                    /* renamed from: h, reason: collision with root package name */
                    private int f144938h;

                    /* renamed from: i, reason: collision with root package name */
                    private int f144939i;

                    /* renamed from: l, reason: collision with root package name */
                    private int f144942l;

                    /* renamed from: m, reason: collision with root package name */
                    private int f144943m;

                    /* renamed from: c, reason: collision with root package name */
                    private Type f144933c = Type.BYTE;

                    /* renamed from: j, reason: collision with root package name */
                    private Annotation f144940j = Annotation.A();

                    /* renamed from: k, reason: collision with root package name */
                    private List<Value> f144941k = Collections.EMPTY_LIST;

                    private void v() {
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                    /* renamed from: y, reason: merged with bridge method [inline-methods] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                        /*
                            r2 = this;
                            r0 = 0
                            kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.f144916r     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Argument.Value.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Builder");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static Builder t() {
                        return new Builder();
                    }

                    private void u() {
                        if ((this.f144932b & 256) != 256) {
                            this.f144941k = new ArrayList(this.f144941k);
                            this.f144932b |= 256;
                        }
                    }

                    public Builder A(int i10) {
                        this.f144932b |= 32;
                        this.f144938h = i10;
                        return this;
                    }

                    public Builder C(double d10) {
                        this.f144932b |= 8;
                        this.f144936f = d10;
                        return this;
                    }

                    public Builder D(int i10) {
                        this.f144932b |= 64;
                        this.f144939i = i10;
                        return this;
                    }

                    public Builder E(int i10) {
                        this.f144932b |= 1024;
                        this.f144943m = i10;
                        return this;
                    }

                    public Builder F(float f10) {
                        this.f144932b |= 4;
                        this.f144935e = f10;
                        return this;
                    }

                    public Builder G(long j10) {
                        this.f144932b |= 2;
                        this.f144934d = j10;
                        return this;
                    }

                    public Builder H(int i10) {
                        this.f144932b |= 16;
                        this.f144937g = i10;
                        return this;
                    }

                    public Value r() {
                        Value value = new Value(this);
                        int i10 = this.f144932b;
                        int i11 = (i10 & 1) != 1 ? 0 : 1;
                        value.f144919d = this.f144933c;
                        if ((i10 & 2) == 2) {
                            i11 |= 2;
                        }
                        value.f144920e = this.f144934d;
                        if ((i10 & 4) == 4) {
                            i11 |= 4;
                        }
                        value.f144921f = this.f144935e;
                        if ((i10 & 8) == 8) {
                            i11 |= 8;
                        }
                        value.f144922g = this.f144936f;
                        if ((i10 & 16) == 16) {
                            i11 |= 16;
                        }
                        value.f144923h = this.f144937g;
                        if ((i10 & 32) == 32) {
                            i11 |= 32;
                        }
                        value.f144924i = this.f144938h;
                        if ((i10 & 64) == 64) {
                            i11 |= 64;
                        }
                        value.f144925j = this.f144939i;
                        if ((i10 & 128) == 128) {
                            i11 |= 128;
                        }
                        value.f144926k = this.f144940j;
                        if ((this.f144932b & 256) == 256) {
                            this.f144941k = Collections.unmodifiableList(this.f144941k);
                            this.f144932b &= -257;
                        }
                        value.f144927l = this.f144941k;
                        if ((i10 & 512) == 512) {
                            i11 |= 256;
                        }
                        value.f144928m = this.f144942l;
                        if ((i10 & 1024) == 1024) {
                            i11 |= 512;
                        }
                        value.f144929n = this.f144943m;
                        value.f144918c = i11;
                        return value;
                    }

                    public Builder w(Annotation annotation) {
                        if ((this.f144932b & 128) != 128 || this.f144940j == Annotation.A()) {
                            this.f144940j = annotation;
                        } else {
                            this.f144940j = Annotation.F(this.f144940j).n(annotation).r();
                        }
                        this.f144932b |= 128;
                        return this;
                    }

                    public Builder z(int i10) {
                        this.f144932b |= 512;
                        this.f144942l = i10;
                        return this;
                    }

                    private Builder() {
                        v();
                    }

                    public Builder I(Type type) {
                        type.getClass();
                        this.f144932b |= 1;
                        this.f144933c = type;
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
                        if (!value.f144927l.isEmpty()) {
                            if (this.f144941k.isEmpty()) {
                                this.f144941k = value.f144927l;
                                this.f144932b &= -257;
                            } else {
                                u();
                                this.f144941k.addAll(value.f144927l);
                            }
                        }
                        if (value.V()) {
                            z(value.H());
                        }
                        if (value.Z()) {
                            E(value.P());
                        }
                        o(m().e(value.f144917b));
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
                    private static Internal.EnumLiteMap<Type> f144957o = new a();

                    /* renamed from: a, reason: collision with root package name */
                    private final int f144959a;

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
                        return this.f144959a;
                    }

                    Type(int i10, int i11) {
                        this.f144959a = i11;
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
                    f144915q = value;
                    value.e0();
                }

                public static Value M() {
                    return f144915q;
                }

                private void e0() {
                    this.f144919d = Type.BYTE;
                    this.f144920e = 0L;
                    this.f144921f = 0.0f;
                    this.f144922g = 0.0d;
                    this.f144923h = 0;
                    this.f144924i = 0;
                    this.f144925j = 0;
                    this.f144926k = Annotation.A();
                    this.f144927l = Collections.EMPTY_LIST;
                    this.f144928m = 0;
                    this.f144929n = 0;
                }

                public Annotation G() {
                    return this.f144926k;
                }

                public int H() {
                    return this.f144928m;
                }

                public Value I(int i10) {
                    return this.f144927l.get(i10);
                }

                public int J() {
                    return this.f144927l.size();
                }

                public List<Value> K() {
                    return this.f144927l;
                }

                public int L() {
                    return this.f144924i;
                }

                public double N() {
                    return this.f144922g;
                }

                public int O() {
                    return this.f144925j;
                }

                public int P() {
                    return this.f144929n;
                }

                public float Q() {
                    return this.f144921f;
                }

                public long R() {
                    return this.f144920e;
                }

                public int S() {
                    return this.f144923h;
                }

                public Type T() {
                    return this.f144919d;
                }

                public boolean U() {
                    return (this.f144918c & 128) == 128;
                }

                public boolean V() {
                    return (this.f144918c & 256) == 256;
                }

                public boolean W() {
                    return (this.f144918c & 32) == 32;
                }

                public boolean X() {
                    return (this.f144918c & 8) == 8;
                }

                public boolean Y() {
                    return (this.f144918c & 64) == 64;
                }

                public boolean Z() {
                    return (this.f144918c & 512) == 512;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
                public final boolean a() {
                    byte b10 = this.f144930o;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    if (U() && !G().a()) {
                        this.f144930o = (byte) 0;
                        return false;
                    }
                    for (int i10 = 0; i10 < J(); i10++) {
                        if (!I(i10).a()) {
                            this.f144930o = (byte) 0;
                            return false;
                        }
                    }
                    this.f144930o = (byte) 1;
                    return true;
                }

                public boolean a0() {
                    return (this.f144918c & 4) == 4;
                }

                public boolean b0() {
                    return (this.f144918c & 2) == 2;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public int c() {
                    int i10 = this.f144931p;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iH = (this.f144918c & 1) == 1 ? CodedOutputStream.h(1, this.f144919d.g()) : 0;
                    if ((this.f144918c & 2) == 2) {
                        iH += CodedOutputStream.A(2, this.f144920e);
                    }
                    if ((this.f144918c & 4) == 4) {
                        iH += CodedOutputStream.l(3, this.f144921f);
                    }
                    if ((this.f144918c & 8) == 8) {
                        iH += CodedOutputStream.f(4, this.f144922g);
                    }
                    if ((this.f144918c & 16) == 16) {
                        iH += CodedOutputStream.o(5, this.f144923h);
                    }
                    if ((this.f144918c & 32) == 32) {
                        iH += CodedOutputStream.o(6, this.f144924i);
                    }
                    if ((this.f144918c & 64) == 64) {
                        iH += CodedOutputStream.o(7, this.f144925j);
                    }
                    if ((this.f144918c & 128) == 128) {
                        iH += CodedOutputStream.s(8, this.f144926k);
                    }
                    for (int i11 = 0; i11 < this.f144927l.size(); i11++) {
                        iH += CodedOutputStream.s(9, this.f144927l.get(i11));
                    }
                    if ((this.f144918c & 512) == 512) {
                        iH += CodedOutputStream.o(10, this.f144929n);
                    }
                    if ((this.f144918c & 256) == 256) {
                        iH += CodedOutputStream.o(11, this.f144928m);
                    }
                    int size = iH + this.f144917b.size();
                    this.f144931p = size;
                    return size;
                }

                public boolean c0() {
                    return (this.f144918c & 16) == 16;
                }

                public boolean d0() {
                    return (this.f144918c & 1) == 1;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
                public Parser<Value> f() {
                    return f144916r;
                }

                private Value(GeneratedMessageLite.Builder builder) {
                    super(builder);
                    this.f144930o = (byte) -1;
                    this.f144931p = -1;
                    this.f144917b = builder.m();
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
                    if ((this.f144918c & 1) == 1) {
                        codedOutputStream.S(1, this.f144919d.g());
                    }
                    if ((this.f144918c & 2) == 2) {
                        codedOutputStream.t0(2, this.f144920e);
                    }
                    if ((this.f144918c & 4) == 4) {
                        codedOutputStream.W(3, this.f144921f);
                    }
                    if ((this.f144918c & 8) == 8) {
                        codedOutputStream.Q(4, this.f144922g);
                    }
                    if ((this.f144918c & 16) == 16) {
                        codedOutputStream.a0(5, this.f144923h);
                    }
                    if ((this.f144918c & 32) == 32) {
                        codedOutputStream.a0(6, this.f144924i);
                    }
                    if ((this.f144918c & 64) == 64) {
                        codedOutputStream.a0(7, this.f144925j);
                    }
                    if ((this.f144918c & 128) == 128) {
                        codedOutputStream.d0(8, this.f144926k);
                    }
                    for (int i10 = 0; i10 < this.f144927l.size(); i10++) {
                        codedOutputStream.d0(9, this.f144927l.get(i10));
                    }
                    if ((this.f144918c & 512) == 512) {
                        codedOutputStream.a0(10, this.f144929n);
                    }
                    if ((this.f144918c & 256) == 256) {
                        codedOutputStream.a0(11, this.f144928m);
                    }
                    codedOutputStream.i0(this.f144917b);
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
                    this.f144930o = (byte) -1;
                    this.f144931p = -1;
                    this.f144917b = ByteString.f145819a;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
                private Value(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    this.f144930o = (byte) -1;
                    this.f144931p = -1;
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
                                                this.f144918c |= 1;
                                                this.f144919d = typeA;
                                            }
                                        case 16:
                                            this.f144918c |= 2;
                                            this.f144920e = codedInputStream.H();
                                        case 29:
                                            this.f144918c |= 4;
                                            this.f144921f = codedInputStream.q();
                                        case 33:
                                            this.f144918c |= 8;
                                            this.f144922g = codedInputStream.m();
                                        case 40:
                                            this.f144918c |= 16;
                                            this.f144923h = codedInputStream.s();
                                        case 48:
                                            this.f144918c |= 32;
                                            this.f144924i = codedInputStream.s();
                                        case 56:
                                            this.f144918c |= 64;
                                            this.f144925j = codedInputStream.s();
                                        case 66:
                                            Builder builderB = (this.f144918c & 128) == 128 ? this.f144926k.b() : null;
                                            Annotation annotation = (Annotation) codedInputStream.u(Annotation.f144897i, extensionRegistryLite);
                                            this.f144926k = annotation;
                                            if (builderB != null) {
                                                builderB.n(annotation);
                                                this.f144926k = builderB.r();
                                            }
                                            this.f144918c |= 128;
                                        case 74:
                                            if ((c10 & 256) != 256) {
                                                this.f144927l = new ArrayList();
                                                c10 = 256;
                                            }
                                            this.f144927l.add(codedInputStream.u(f144916r, extensionRegistryLite));
                                        case BinsView.LABEL_WIDTH_DP /* 80 */:
                                            this.f144918c |= 512;
                                            this.f144929n = codedInputStream.s();
                                        case 88:
                                            this.f144918c |= 256;
                                            this.f144928m = codedInputStream.s();
                                        default:
                                            P10 = p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK);
                                            if (P10 == 0) {
                                                z10 = true;
                                            }
                                    }
                                } catch (Throwable th2) {
                                    if ((c10 & 256) == P10) {
                                        this.f144927l = Collections.unmodifiableList(this.f144927l);
                                    }
                                    try {
                                        codedOutputStreamJ.I();
                                    } catch (IOException unused) {
                                    } catch (Throwable th3) {
                                        this.f144917b = outputT.g();
                                        throw th3;
                                    }
                                    this.f144917b = outputT.g();
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
                                this.f144927l = Collections.unmodifiableList(this.f144927l);
                            }
                            try {
                                codedOutputStreamJ.I();
                            } catch (IOException unused2) {
                            } catch (Throwable th4) {
                                this.f144917b = outputT.g();
                                throw th4;
                            }
                            this.f144917b = outputT.g();
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
                this.f144908d = 0;
                this.f144909e = Value.M();
            }

            static {
                Argument argument = new Argument(true);
                f144904h = argument;
                argument.B();
            }

            public static Argument v() {
                return f144904h;
            }

            public boolean A() {
                return (this.f144907c & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean a() {
                byte b10 = this.f144910f;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (!z()) {
                    this.f144910f = (byte) 0;
                    return false;
                }
                if (!A()) {
                    this.f144910f = (byte) 0;
                    return false;
                }
                if (y().a()) {
                    this.f144910f = (byte) 1;
                    return true;
                }
                this.f144910f = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int c() {
                int i10 = this.f144911g;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f144907c & 1) == 1 ? CodedOutputStream.o(1, this.f144908d) : 0;
                if ((this.f144907c & 2) == 2) {
                    iO += CodedOutputStream.s(2, this.f144909e);
                }
                int size = iO + this.f144906b.size();
                this.f144911g = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> f() {
                return f144905i;
            }

            public int x() {
                return this.f144908d;
            }

            public Value y() {
                return this.f144909e;
            }

            public boolean z() {
                return (this.f144907c & 1) == 1;
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f144910f = (byte) -1;
                this.f144911g = -1;
                this.f144906b = builder.m();
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
                if ((this.f144907c & 1) == 1) {
                    codedOutputStream.a0(1, this.f144908d);
                }
                if ((this.f144907c & 2) == 2) {
                    codedOutputStream.d0(2, this.f144909e);
                }
                codedOutputStream.i0(this.f144906b);
            }

            private Argument(boolean z10) {
                this.f144910f = (byte) -1;
                this.f144911g = -1;
                this.f144906b = ByteString.f145819a;
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.f144910f = (byte) -1;
                this.f144911g = -1;
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
                                    this.f144907c |= 1;
                                    this.f144908d = codedInputStream.s();
                                } else if (iK != 18) {
                                    if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                    }
                                } else {
                                    Value.Builder builderB = (this.f144907c & 2) == 2 ? this.f144909e.b() : null;
                                    Value value = (Value) codedInputStream.u(Value.f144916r, extensionRegistryLite);
                                    this.f144909e = value;
                                    if (builderB != null) {
                                        builderB.n(value);
                                        this.f144909e = builderB.r();
                                    }
                                    this.f144907c |= 2;
                                }
                            }
                            z10 = true;
                        } catch (Throwable th2) {
                            try {
                                codedOutputStreamJ.I();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f144906b = outputT.g();
                                throw th3;
                            }
                            this.f144906b = outputT.g();
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
                    this.f144906b = outputT.g();
                    throw th4;
                }
                this.f144906b = outputT.g();
                m();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Annotation, Builder> implements AnnotationOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f144960b;

            /* renamed from: c, reason: collision with root package name */
            private int f144961c;

            /* renamed from: d, reason: collision with root package name */
            private List<Argument> f144962d = Collections.EMPTY_LIST;

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.f144897i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Annotation.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f144960b & 2) != 2) {
                    this.f144962d = new ArrayList(this.f144962d);
                    this.f144960b |= 2;
                }
            }

            public Annotation r() {
                Annotation annotation = new Annotation(this);
                int i10 = (this.f144960b & 1) != 1 ? 0 : 1;
                annotation.f144900d = this.f144961c;
                if ((this.f144960b & 2) == 2) {
                    this.f144962d = Collections.unmodifiableList(this.f144962d);
                    this.f144960b &= -3;
                }
                annotation.f144901e = this.f144962d;
                annotation.f144899c = i10;
                return annotation;
            }

            public Builder y(int i10) {
                this.f144960b |= 1;
                this.f144961c = i10;
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
                if (!annotation.f144901e.isEmpty()) {
                    if (this.f144962d.isEmpty()) {
                        this.f144962d = annotation.f144901e;
                        this.f144960b &= -3;
                    } else {
                        u();
                        this.f144962d.addAll(annotation.f144901e);
                    }
                }
                o(m().e(annotation.f144898b));
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
            this.f144900d = 0;
            this.f144901e = Collections.EMPTY_LIST;
        }

        static {
            Annotation annotation = new Annotation(true);
            f144896h = annotation;
            annotation.D();
        }

        public static Annotation A() {
            return f144896h;
        }

        public int B() {
            return this.f144900d;
        }

        public boolean C() {
            return (this.f144899c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f144902f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!C()) {
                this.f144902f = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < y(); i10++) {
                if (!x(i10).a()) {
                    this.f144902f = (byte) 0;
                    return false;
                }
            }
            this.f144902f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f144903g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f144899c & 1) == 1 ? CodedOutputStream.o(1, this.f144900d) : 0;
            for (int i11 = 0; i11 < this.f144901e.size(); i11++) {
                iO += CodedOutputStream.s(2, this.f144901e.get(i11));
            }
            int size = iO + this.f144898b.size();
            this.f144903g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Annotation> f() {
            return f144897i;
        }

        public Argument x(int i10) {
            return this.f144901e.get(i10);
        }

        public int y() {
            return this.f144901e.size();
        }

        public List<Argument> z() {
            return this.f144901e;
        }

        private Annotation(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f144902f = (byte) -1;
            this.f144903g = -1;
            this.f144898b = builder.m();
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
            if ((this.f144899c & 1) == 1) {
                codedOutputStream.a0(1, this.f144900d);
            }
            for (int i10 = 0; i10 < this.f144901e.size(); i10++) {
                codedOutputStream.d0(2, this.f144901e.get(i10));
            }
            codedOutputStream.i0(this.f144898b);
        }

        private Annotation(boolean z10) {
            this.f144902f = (byte) -1;
            this.f144903g = -1;
            this.f144898b = ByteString.f145819a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Annotation(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f144902f = (byte) -1;
            this.f144903g = -1;
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
                                this.f144899c |= 1;
                                this.f144900d = codedInputStream.s();
                            } else if (iK != 18) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                if ((c10 & 2) != 2) {
                                    this.f144901e = new ArrayList();
                                    c10 = 2;
                                }
                                this.f144901e.add(codedInputStream.u(Argument.f144905i, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((c10 & 2) == 2) {
                            this.f144901e = Collections.unmodifiableList(this.f144901e);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f144898b = outputT.g();
                            throw th3;
                        }
                        this.f144898b = outputT.g();
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
                this.f144901e = Collections.unmodifiableList(this.f144901e);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f144898b = outputT.g();
                throw th4;
            }
            this.f144898b = outputT.g();
            m();
        }
    }

    public interface AnnotationOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Class extends GeneratedMessageLite.ExtendableMessage<Class> implements ClassOrBuilder {

        /* renamed from: L, reason: collision with root package name */
        private static final Class f144963L;

        /* renamed from: M, reason: collision with root package name */
        public static Parser<Class> f144964M = new a();

        /* renamed from: A, reason: collision with root package name */
        private List<Integer> f144965A;

        /* renamed from: B, reason: collision with root package name */
        private int f144966B;

        /* renamed from: C, reason: collision with root package name */
        private List<Type> f144967C;

        /* renamed from: D, reason: collision with root package name */
        private List<Integer> f144968D;

        /* renamed from: E, reason: collision with root package name */
        private int f144969E;

        /* renamed from: F, reason: collision with root package name */
        private TypeTable f144970F;

        /* renamed from: G, reason: collision with root package name */
        private List<Integer> f144971G;

        /* renamed from: H, reason: collision with root package name */
        private VersionRequirementTable f144972H;

        /* renamed from: I, reason: collision with root package name */
        private List<CompilerPluginData> f144973I;

        /* renamed from: J, reason: collision with root package name */
        private byte f144974J;

        /* renamed from: K, reason: collision with root package name */
        private int f144975K;

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f144976c;

        /* renamed from: d, reason: collision with root package name */
        private int f144977d;

        /* renamed from: e, reason: collision with root package name */
        private int f144978e;

        /* renamed from: f, reason: collision with root package name */
        private int f144979f;

        /* renamed from: g, reason: collision with root package name */
        private int f144980g;

        /* renamed from: h, reason: collision with root package name */
        private List<TypeParameter> f144981h;

        /* renamed from: i, reason: collision with root package name */
        private List<Type> f144982i;

        /* renamed from: j, reason: collision with root package name */
        private List<Integer> f144983j;

        /* renamed from: k, reason: collision with root package name */
        private int f144984k;

        /* renamed from: l, reason: collision with root package name */
        private List<Integer> f144985l;

        /* renamed from: m, reason: collision with root package name */
        private int f144986m;

        /* renamed from: n, reason: collision with root package name */
        private List<Type> f144987n;

        /* renamed from: o, reason: collision with root package name */
        private List<Integer> f144988o;

        /* renamed from: p, reason: collision with root package name */
        private int f144989p;

        /* renamed from: q, reason: collision with root package name */
        private List<Constructor> f144990q;

        /* renamed from: r, reason: collision with root package name */
        private List<Function> f144991r;

        /* renamed from: s, reason: collision with root package name */
        private List<Property> f144992s;

        /* renamed from: t, reason: collision with root package name */
        private List<TypeAlias> f144993t;

        /* renamed from: u, reason: collision with root package name */
        private List<EnumEntry> f144994u;

        /* renamed from: v, reason: collision with root package name */
        private List<Integer> f144995v;

        /* renamed from: w, reason: collision with root package name */
        private int f144996w;

        /* renamed from: x, reason: collision with root package name */
        private int f144997x;

        /* renamed from: y, reason: collision with root package name */
        private Type f144998y;

        /* renamed from: z, reason: collision with root package name */
        private int f144999z;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Class, Builder> implements ClassOrBuilder {

            /* renamed from: A, reason: collision with root package name */
            private List<Integer> f145000A;

            /* renamed from: B, reason: collision with root package name */
            private VersionRequirementTable f145001B;

            /* renamed from: C, reason: collision with root package name */
            private List<CompilerPluginData> f145002C;

            /* renamed from: d, reason: collision with root package name */
            private int f145003d;

            /* renamed from: e, reason: collision with root package name */
            private int f145004e = 6;

            /* renamed from: f, reason: collision with root package name */
            private int f145005f;

            /* renamed from: g, reason: collision with root package name */
            private int f145006g;

            /* renamed from: h, reason: collision with root package name */
            private List<TypeParameter> f145007h;

            /* renamed from: i, reason: collision with root package name */
            private List<Type> f145008i;

            /* renamed from: j, reason: collision with root package name */
            private List<Integer> f145009j;

            /* renamed from: k, reason: collision with root package name */
            private List<Integer> f145010k;

            /* renamed from: l, reason: collision with root package name */
            private List<Type> f145011l;

            /* renamed from: m, reason: collision with root package name */
            private List<Integer> f145012m;

            /* renamed from: n, reason: collision with root package name */
            private List<Constructor> f145013n;

            /* renamed from: o, reason: collision with root package name */
            private List<Function> f145014o;

            /* renamed from: p, reason: collision with root package name */
            private List<Property> f145015p;

            /* renamed from: q, reason: collision with root package name */
            private List<TypeAlias> f145016q;

            /* renamed from: r, reason: collision with root package name */
            private List<EnumEntry> f145017r;

            /* renamed from: s, reason: collision with root package name */
            private List<Integer> f145018s;

            /* renamed from: t, reason: collision with root package name */
            private int f145019t;

            /* renamed from: u, reason: collision with root package name */
            private Type f145020u;

            /* renamed from: v, reason: collision with root package name */
            private int f145021v;

            /* renamed from: w, reason: collision with root package name */
            private List<Integer> f145022w;

            /* renamed from: x, reason: collision with root package name */
            private List<Type> f145023x;

            /* renamed from: y, reason: collision with root package name */
            private List<Integer> f145024y;

            /* renamed from: z, reason: collision with root package name */
            private TypeTable f145025z;

            private void R() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: U, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.f144964M     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Builder");
            }

            private void A() {
                if ((this.f145003d & 512) != 512) {
                    this.f145013n = new ArrayList(this.f145013n);
                    this.f145003d |= 512;
                }
            }

            private void C() {
                if ((this.f145003d & 256) != 256) {
                    this.f145012m = new ArrayList(this.f145012m);
                    this.f145003d |= 256;
                }
            }

            private void D() {
                if ((this.f145003d & 128) != 128) {
                    this.f145011l = new ArrayList(this.f145011l);
                    this.f145003d |= 128;
                }
            }

            private void E() {
                if ((this.f145003d & 8192) != 8192) {
                    this.f145017r = new ArrayList(this.f145017r);
                    this.f145003d |= 8192;
                }
            }

            private void F() {
                if ((this.f145003d & 1024) != 1024) {
                    this.f145014o = new ArrayList(this.f145014o);
                    this.f145003d |= 1024;
                }
            }

            private void G() {
                if ((this.f145003d & 262144) != 262144) {
                    this.f145022w = new ArrayList(this.f145022w);
                    this.f145003d |= 262144;
                }
            }

            private void H() {
                if ((this.f145003d & 1048576) != 1048576) {
                    this.f145024y = new ArrayList(this.f145024y);
                    this.f145003d |= 1048576;
                }
            }

            private void I() {
                if ((this.f145003d & 524288) != 524288) {
                    this.f145023x = new ArrayList(this.f145023x);
                    this.f145003d |= 524288;
                }
            }

            private void J() {
                if ((this.f145003d & 64) != 64) {
                    this.f145010k = new ArrayList(this.f145010k);
                    this.f145003d |= 64;
                }
            }

            private void K() {
                if ((this.f145003d & RecyclerView.m.FLAG_MOVED) != 2048) {
                    this.f145015p = new ArrayList(this.f145015p);
                    this.f145003d |= RecyclerView.m.FLAG_MOVED;
                }
            }

            private void L() {
                if ((this.f145003d & 16384) != 16384) {
                    this.f145018s = new ArrayList(this.f145018s);
                    this.f145003d |= 16384;
                }
            }

            private void M() {
                if ((this.f145003d & 32) != 32) {
                    this.f145009j = new ArrayList(this.f145009j);
                    this.f145003d |= 32;
                }
            }

            private void N() {
                if ((this.f145003d & 16) != 16) {
                    this.f145008i = new ArrayList(this.f145008i);
                    this.f145003d |= 16;
                }
            }

            private void O() {
                if ((this.f145003d & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                    this.f145016q = new ArrayList(this.f145016q);
                    this.f145003d |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                }
            }

            private void P() {
                if ((this.f145003d & 8) != 8) {
                    this.f145007h = new ArrayList(this.f145007h);
                    this.f145003d |= 8;
                }
            }

            private void Q() {
                if ((this.f145003d & 4194304) != 4194304) {
                    this.f145000A = new ArrayList(this.f145000A);
                    this.f145003d |= 4194304;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f145003d & 16777216) != 16777216) {
                    this.f145002C = new ArrayList(this.f145002C);
                    this.f145003d |= 16777216;
                }
            }

            public Builder V(Type type) {
                if ((this.f145003d & 65536) != 65536 || this.f145020u == Type.Y()) {
                    this.f145020u = type;
                } else {
                    this.f145020u = Type.A0(this.f145020u).n(type).w();
                }
                this.f145003d |= 65536;
                return this;
            }

            public Builder W(TypeTable typeTable) {
                if ((this.f145003d & 2097152) != 2097152 || this.f145025z == TypeTable.x()) {
                    this.f145025z = typeTable;
                } else {
                    this.f145025z = TypeTable.F(this.f145025z).n(typeTable).r();
                }
                this.f145003d |= 2097152;
                return this;
            }

            public Builder X(VersionRequirementTable versionRequirementTable) {
                if ((this.f145003d & 8388608) != 8388608 || this.f145001B == VersionRequirementTable.u()) {
                    this.f145001B = versionRequirementTable;
                } else {
                    this.f145001B = VersionRequirementTable.A(this.f145001B).n(versionRequirementTable).r();
                }
                this.f145003d |= 8388608;
                return this;
            }

            public Builder Y(int i10) {
                this.f145003d |= 4;
                this.f145006g = i10;
                return this;
            }

            public Builder Z(int i10) {
                this.f145003d |= 1;
                this.f145004e = i10;
                return this;
            }

            public Builder a0(int i10) {
                this.f145003d |= 2;
                this.f145005f = i10;
                return this;
            }

            public Builder b0(int i10) {
                this.f145003d |= 32768;
                this.f145019t = i10;
                return this;
            }

            public Builder d0(int i10) {
                this.f145003d |= 131072;
                this.f145021v = i10;
                return this;
            }

            public Class w() {
                Class r02 = new Class(this);
                int i10 = this.f145003d;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                r02.f144978e = this.f145004e;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                r02.f144979f = this.f145005f;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                r02.f144980g = this.f145006g;
                if ((this.f145003d & 8) == 8) {
                    this.f145007h = Collections.unmodifiableList(this.f145007h);
                    this.f145003d &= -9;
                }
                r02.f144981h = this.f145007h;
                if ((this.f145003d & 16) == 16) {
                    this.f145008i = Collections.unmodifiableList(this.f145008i);
                    this.f145003d &= -17;
                }
                r02.f144982i = this.f145008i;
                if ((this.f145003d & 32) == 32) {
                    this.f145009j = Collections.unmodifiableList(this.f145009j);
                    this.f145003d &= -33;
                }
                r02.f144983j = this.f145009j;
                if ((this.f145003d & 64) == 64) {
                    this.f145010k = Collections.unmodifiableList(this.f145010k);
                    this.f145003d &= -65;
                }
                r02.f144985l = this.f145010k;
                if ((this.f145003d & 128) == 128) {
                    this.f145011l = Collections.unmodifiableList(this.f145011l);
                    this.f145003d &= -129;
                }
                r02.f144987n = this.f145011l;
                if ((this.f145003d & 256) == 256) {
                    this.f145012m = Collections.unmodifiableList(this.f145012m);
                    this.f145003d &= -257;
                }
                r02.f144988o = this.f145012m;
                if ((this.f145003d & 512) == 512) {
                    this.f145013n = Collections.unmodifiableList(this.f145013n);
                    this.f145003d &= -513;
                }
                r02.f144990q = this.f145013n;
                if ((this.f145003d & 1024) == 1024) {
                    this.f145014o = Collections.unmodifiableList(this.f145014o);
                    this.f145003d &= -1025;
                }
                r02.f144991r = this.f145014o;
                if ((this.f145003d & RecyclerView.m.FLAG_MOVED) == 2048) {
                    this.f145015p = Collections.unmodifiableList(this.f145015p);
                    this.f145003d &= -2049;
                }
                r02.f144992s = this.f145015p;
                if ((this.f145003d & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    this.f145016q = Collections.unmodifiableList(this.f145016q);
                    this.f145003d &= -4097;
                }
                r02.f144993t = this.f145016q;
                if ((this.f145003d & 8192) == 8192) {
                    this.f145017r = Collections.unmodifiableList(this.f145017r);
                    this.f145003d &= -8193;
                }
                r02.f144994u = this.f145017r;
                if ((this.f145003d & 16384) == 16384) {
                    this.f145018s = Collections.unmodifiableList(this.f145018s);
                    this.f145003d &= -16385;
                }
                r02.f144995v = this.f145018s;
                if ((i10 & 32768) == 32768) {
                    i11 |= 8;
                }
                r02.f144997x = this.f145019t;
                if ((i10 & 65536) == 65536) {
                    i11 |= 16;
                }
                r02.f144998y = this.f145020u;
                if ((i10 & 131072) == 131072) {
                    i11 |= 32;
                }
                r02.f144999z = this.f145021v;
                if ((this.f145003d & 262144) == 262144) {
                    this.f145022w = Collections.unmodifiableList(this.f145022w);
                    this.f145003d &= -262145;
                }
                r02.f144965A = this.f145022w;
                if ((this.f145003d & 524288) == 524288) {
                    this.f145023x = Collections.unmodifiableList(this.f145023x);
                    this.f145003d &= -524289;
                }
                r02.f144967C = this.f145023x;
                if ((this.f145003d & 1048576) == 1048576) {
                    this.f145024y = Collections.unmodifiableList(this.f145024y);
                    this.f145003d &= -1048577;
                }
                r02.f144968D = this.f145024y;
                if ((i10 & 2097152) == 2097152) {
                    i11 |= 64;
                }
                r02.f144970F = this.f145025z;
                if ((this.f145003d & 4194304) == 4194304) {
                    this.f145000A = Collections.unmodifiableList(this.f145000A);
                    this.f145003d &= -4194305;
                }
                r02.f144971G = this.f145000A;
                if ((i10 & 8388608) == 8388608) {
                    i11 |= 128;
                }
                r02.f144972H = this.f145001B;
                if ((this.f145003d & 16777216) == 16777216) {
                    this.f145002C = Collections.unmodifiableList(this.f145002C);
                    this.f145003d &= -16777217;
                }
                r02.f144973I = this.f145002C;
                r02.f144977d = i11;
                return r02;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f145007h = list;
                this.f145008i = list;
                this.f145009j = list;
                this.f145010k = list;
                this.f145011l = list;
                this.f145012m = list;
                this.f145013n = list;
                this.f145014o = list;
                this.f145015p = list;
                this.f145016q = list;
                this.f145017r = list;
                this.f145018s = list;
                this.f145020u = Type.Y();
                this.f145022w = list;
                this.f145023x = list;
                this.f145024y = list;
                this.f145025z = TypeTable.x();
                this.f145000A = list;
                this.f145001B = VersionRequirementTable.u();
                this.f145002C = list;
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
                if (!r32.f144981h.isEmpty()) {
                    if (this.f145007h.isEmpty()) {
                        this.f145007h = r32.f144981h;
                        this.f145003d &= -9;
                    } else {
                        P();
                        this.f145007h.addAll(r32.f144981h);
                    }
                }
                if (!r32.f144982i.isEmpty()) {
                    if (this.f145008i.isEmpty()) {
                        this.f145008i = r32.f144982i;
                        this.f145003d &= -17;
                    } else {
                        N();
                        this.f145008i.addAll(r32.f144982i);
                    }
                }
                if (!r32.f144983j.isEmpty()) {
                    if (this.f145009j.isEmpty()) {
                        this.f145009j = r32.f144983j;
                        this.f145003d &= -33;
                    } else {
                        M();
                        this.f145009j.addAll(r32.f144983j);
                    }
                }
                if (!r32.f144985l.isEmpty()) {
                    if (this.f145010k.isEmpty()) {
                        this.f145010k = r32.f144985l;
                        this.f145003d &= -65;
                    } else {
                        J();
                        this.f145010k.addAll(r32.f144985l);
                    }
                }
                if (!r32.f144987n.isEmpty()) {
                    if (this.f145011l.isEmpty()) {
                        this.f145011l = r32.f144987n;
                        this.f145003d &= -129;
                    } else {
                        D();
                        this.f145011l.addAll(r32.f144987n);
                    }
                }
                if (!r32.f144988o.isEmpty()) {
                    if (this.f145012m.isEmpty()) {
                        this.f145012m = r32.f144988o;
                        this.f145003d &= -257;
                    } else {
                        C();
                        this.f145012m.addAll(r32.f144988o);
                    }
                }
                if (!r32.f144990q.isEmpty()) {
                    if (this.f145013n.isEmpty()) {
                        this.f145013n = r32.f144990q;
                        this.f145003d &= -513;
                    } else {
                        A();
                        this.f145013n.addAll(r32.f144990q);
                    }
                }
                if (!r32.f144991r.isEmpty()) {
                    if (this.f145014o.isEmpty()) {
                        this.f145014o = r32.f144991r;
                        this.f145003d &= -1025;
                    } else {
                        F();
                        this.f145014o.addAll(r32.f144991r);
                    }
                }
                if (!r32.f144992s.isEmpty()) {
                    if (this.f145015p.isEmpty()) {
                        this.f145015p = r32.f144992s;
                        this.f145003d &= -2049;
                    } else {
                        K();
                        this.f145015p.addAll(r32.f144992s);
                    }
                }
                if (!r32.f144993t.isEmpty()) {
                    if (this.f145016q.isEmpty()) {
                        this.f145016q = r32.f144993t;
                        this.f145003d &= -4097;
                    } else {
                        O();
                        this.f145016q.addAll(r32.f144993t);
                    }
                }
                if (!r32.f144994u.isEmpty()) {
                    if (this.f145017r.isEmpty()) {
                        this.f145017r = r32.f144994u;
                        this.f145003d &= -8193;
                    } else {
                        E();
                        this.f145017r.addAll(r32.f144994u);
                    }
                }
                if (!r32.f144995v.isEmpty()) {
                    if (this.f145018s.isEmpty()) {
                        this.f145018s = r32.f144995v;
                        this.f145003d &= -16385;
                    } else {
                        L();
                        this.f145018s.addAll(r32.f144995v);
                    }
                }
                if (r32.t1()) {
                    b0(r32.O0());
                }
                if (r32.u1()) {
                    V(r32.P0());
                }
                if (r32.v1()) {
                    d0(r32.Q0());
                }
                if (!r32.f144965A.isEmpty()) {
                    if (this.f145022w.isEmpty()) {
                        this.f145022w = r32.f144965A;
                        this.f145003d &= -262145;
                    } else {
                        G();
                        this.f145022w.addAll(r32.f144965A);
                    }
                }
                if (!r32.f144967C.isEmpty()) {
                    if (this.f145023x.isEmpty()) {
                        this.f145023x = r32.f144967C;
                        this.f145003d &= -524289;
                    } else {
                        I();
                        this.f145023x.addAll(r32.f144967C);
                    }
                }
                if (!r32.f144968D.isEmpty()) {
                    if (this.f145024y.isEmpty()) {
                        this.f145024y = r32.f144968D;
                        this.f145003d &= -1048577;
                    } else {
                        H();
                        this.f145024y.addAll(r32.f144968D);
                    }
                }
                if (r32.w1()) {
                    W(r32.n1());
                }
                if (!r32.f144971G.isEmpty()) {
                    if (this.f145000A.isEmpty()) {
                        this.f145000A = r32.f144971G;
                        this.f145003d &= -4194305;
                    } else {
                        Q();
                        this.f145000A.addAll(r32.f144971G);
                    }
                }
                if (r32.x1()) {
                    X(r32.p1());
                }
                if (!r32.f144973I.isEmpty()) {
                    if (this.f145002C.isEmpty()) {
                        this.f145002C = r32.f144973I;
                        this.f145003d &= -16777217;
                    } else {
                        z();
                        this.f145002C.addAll(r32.f144973I);
                    }
                }
                t(r32);
                o(m().e(r32.f144976c));
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
            private static Internal.EnumLiteMap<Kind> f145033i = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f145035a;

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
                return this.f145035a;
            }

            Kind(int i10, int i11) {
                this.f145035a = i11;
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
            this.f144978e = 6;
            this.f144979f = 0;
            this.f144980g = 0;
            List list = Collections.EMPTY_LIST;
            this.f144981h = list;
            this.f144982i = list;
            this.f144983j = list;
            this.f144985l = list;
            this.f144987n = list;
            this.f144988o = list;
            this.f144990q = list;
            this.f144991r = list;
            this.f144992s = list;
            this.f144993t = list;
            this.f144994u = list;
            this.f144995v = list;
            this.f144997x = 0;
            this.f144998y = Type.Y();
            this.f144999z = 0;
            this.f144965A = list;
            this.f144967C = list;
            this.f144968D = list;
            this.f144970F = TypeTable.x();
            this.f144971G = list;
            this.f144972H = VersionRequirementTable.u();
            this.f144973I = list;
        }

        static {
            Class r02 = new Class(true);
            f144963L = r02;
            r02.y1();
        }

        public static Class C1(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return f144964M.a(inputStream, extensionRegistryLite);
        }

        public static Class E0() {
            return f144963L;
        }

        public Type A0(int i10) {
            return this.f144987n.get(i10);
        }

        public int B0() {
            return this.f144987n.size();
        }

        public List<Integer> C0() {
            return this.f144988o;
        }

        public List<Type> D0() {
            return this.f144987n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: F0, reason: merged with bridge method [inline-methods] */
        public Class e() {
            return f144963L;
        }

        public EnumEntry G0(int i10) {
            return this.f144994u.get(i10);
        }

        public int H0() {
            return this.f144994u.size();
        }

        public List<EnumEntry> I0() {
            return this.f144994u;
        }

        public int J0() {
            return this.f144978e;
        }

        public int K0() {
            return this.f144979f;
        }

        public Function L0(int i10) {
            return this.f144991r.get(i10);
        }

        public int M0() {
            return this.f144991r.size();
        }

        public List<Function> N0() {
            return this.f144991r;
        }

        public int O0() {
            return this.f144997x;
        }

        public Type P0() {
            return this.f144998y;
        }

        public int Q0() {
            return this.f144999z;
        }

        public int R0() {
            return this.f144965A.size();
        }

        public List<Integer> S0() {
            return this.f144965A;
        }

        public Type T0(int i10) {
            return this.f144967C.get(i10);
        }

        public int U0() {
            return this.f144967C.size();
        }

        public int V0() {
            return this.f144968D.size();
        }

        public List<Integer> W0() {
            return this.f144968D;
        }

        public List<Type> X0() {
            return this.f144967C;
        }

        public List<Integer> Y0() {
            return this.f144985l;
        }

        public Property Z0(int i10) {
            return this.f144992s.get(i10);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f144974J;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!s1()) {
                this.f144974J = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < l1(); i10++) {
                if (!k1(i10).a()) {
                    this.f144974J = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < e1(); i11++) {
                if (!d1(i11).a()) {
                    this.f144974J = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < B0(); i12++) {
                if (!A0(i12).a()) {
                    this.f144974J = (byte) 0;
                    return false;
                }
            }
            for (int i13 = 0; i13 < y0(); i13++) {
                if (!x0(i13).a()) {
                    this.f144974J = (byte) 0;
                    return false;
                }
            }
            for (int i14 = 0; i14 < M0(); i14++) {
                if (!L0(i14).a()) {
                    this.f144974J = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < a1(); i15++) {
                if (!Z0(i15).a()) {
                    this.f144974J = (byte) 0;
                    return false;
                }
            }
            for (int i16 = 0; i16 < i1(); i16++) {
                if (!h1(i16).a()) {
                    this.f144974J = (byte) 0;
                    return false;
                }
            }
            for (int i17 = 0; i17 < H0(); i17++) {
                if (!G0(i17).a()) {
                    this.f144974J = (byte) 0;
                    return false;
                }
            }
            if (u1() && !P0().a()) {
                this.f144974J = (byte) 0;
                return false;
            }
            for (int i18 = 0; i18 < U0(); i18++) {
                if (!T0(i18).a()) {
                    this.f144974J = (byte) 0;
                    return false;
                }
            }
            if (w1() && !n1().a()) {
                this.f144974J = (byte) 0;
                return false;
            }
            for (int i19 = 0; i19 < w0(); i19++) {
                if (!v0(i19).a()) {
                    this.f144974J = (byte) 0;
                    return false;
                }
            }
            if (s()) {
                this.f144974J = (byte) 1;
                return true;
            }
            this.f144974J = (byte) 0;
            return false;
        }

        public int a1() {
            return this.f144992s.size();
        }

        public List<Property> b1() {
            return this.f144992s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f144975K;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f144977d & 1) == 1 ? CodedOutputStream.o(1, this.f144978e) : 0;
            int iP = 0;
            for (int i11 = 0; i11 < this.f144983j.size(); i11++) {
                iP += CodedOutputStream.p(this.f144983j.get(i11).intValue());
            }
            int iS = iO + iP;
            if (!f1().isEmpty()) {
                iS = iS + 1 + CodedOutputStream.p(iP);
            }
            this.f144984k = iP;
            if ((this.f144977d & 2) == 2) {
                iS += CodedOutputStream.o(3, this.f144979f);
            }
            if ((this.f144977d & 4) == 4) {
                iS += CodedOutputStream.o(4, this.f144980g);
            }
            for (int i12 = 0; i12 < this.f144981h.size(); i12++) {
                iS += CodedOutputStream.s(5, this.f144981h.get(i12));
            }
            for (int i13 = 0; i13 < this.f144982i.size(); i13++) {
                iS += CodedOutputStream.s(6, this.f144982i.get(i13));
            }
            int iP2 = 0;
            for (int i14 = 0; i14 < this.f144985l.size(); i14++) {
                iP2 += CodedOutputStream.p(this.f144985l.get(i14).intValue());
            }
            int iS2 = iS + iP2;
            if (!Y0().isEmpty()) {
                iS2 = iS2 + 1 + CodedOutputStream.p(iP2);
            }
            this.f144986m = iP2;
            for (int i15 = 0; i15 < this.f144990q.size(); i15++) {
                iS2 += CodedOutputStream.s(8, this.f144990q.get(i15));
            }
            for (int i16 = 0; i16 < this.f144991r.size(); i16++) {
                iS2 += CodedOutputStream.s(9, this.f144991r.get(i16));
            }
            for (int i17 = 0; i17 < this.f144992s.size(); i17++) {
                iS2 += CodedOutputStream.s(10, this.f144992s.get(i17));
            }
            for (int i18 = 0; i18 < this.f144993t.size(); i18++) {
                iS2 += CodedOutputStream.s(11, this.f144993t.get(i18));
            }
            for (int i19 = 0; i19 < this.f144994u.size(); i19++) {
                iS2 += CodedOutputStream.s(13, this.f144994u.get(i19));
            }
            int iP3 = 0;
            for (int i20 = 0; i20 < this.f144995v.size(); i20++) {
                iP3 += CodedOutputStream.p(this.f144995v.get(i20).intValue());
            }
            int iS3 = iS2 + iP3;
            if (!c1().isEmpty()) {
                iS3 = iS3 + 2 + CodedOutputStream.p(iP3);
            }
            this.f144996w = iP3;
            if ((this.f144977d & 8) == 8) {
                iS3 += CodedOutputStream.o(17, this.f144997x);
            }
            if ((this.f144977d & 16) == 16) {
                iS3 += CodedOutputStream.s(18, this.f144998y);
            }
            if ((this.f144977d & 32) == 32) {
                iS3 += CodedOutputStream.o(19, this.f144999z);
            }
            for (int i21 = 0; i21 < this.f144987n.size(); i21++) {
                iS3 += CodedOutputStream.s(20, this.f144987n.get(i21));
            }
            int iP4 = 0;
            for (int i22 = 0; i22 < this.f144988o.size(); i22++) {
                iP4 += CodedOutputStream.p(this.f144988o.get(i22).intValue());
            }
            int iP5 = iS3 + iP4;
            if (!C0().isEmpty()) {
                iP5 = iP5 + 2 + CodedOutputStream.p(iP4);
            }
            this.f144989p = iP4;
            int iP6 = 0;
            for (int i23 = 0; i23 < this.f144965A.size(); i23++) {
                iP6 += CodedOutputStream.p(this.f144965A.get(i23).intValue());
            }
            int iS4 = iP5 + iP6;
            if (!S0().isEmpty()) {
                iS4 = iS4 + 2 + CodedOutputStream.p(iP6);
            }
            this.f144966B = iP6;
            for (int i24 = 0; i24 < this.f144967C.size(); i24++) {
                iS4 += CodedOutputStream.s(23, this.f144967C.get(i24));
            }
            int iP7 = 0;
            for (int i25 = 0; i25 < this.f144968D.size(); i25++) {
                iP7 += CodedOutputStream.p(this.f144968D.get(i25).intValue());
            }
            int iS5 = iS4 + iP7;
            if (!W0().isEmpty()) {
                iS5 = iS5 + 2 + CodedOutputStream.p(iP7);
            }
            this.f144969E = iP7;
            if ((this.f144977d & 64) == 64) {
                iS5 += CodedOutputStream.s(30, this.f144970F);
            }
            int iP8 = 0;
            for (int i26 = 0; i26 < this.f144971G.size(); i26++) {
                iP8 += CodedOutputStream.p(this.f144971G.get(i26).intValue());
            }
            int size = iS5 + iP8 + (o1().size() * 2);
            if ((this.f144977d & 128) == 128) {
                size += CodedOutputStream.s(32, this.f144972H);
            }
            for (int i27 = 0; i27 < this.f144973I.size(); i27++) {
                size += CodedOutputStream.s(33, this.f144973I.get(i27));
            }
            int iT = size + t() + this.f144976c.size();
            this.f144975K = iT;
            return iT;
        }

        public List<Integer> c1() {
            return this.f144995v;
        }

        public Type d1(int i10) {
            return this.f144982i.get(i10);
        }

        public int e1() {
            return this.f144982i.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Class> f() {
            return f144964M;
        }

        public List<Integer> f1() {
            return this.f144983j;
        }

        public List<Type> g1() {
            return this.f144982i;
        }

        public TypeAlias h1(int i10) {
            return this.f144993t.get(i10);
        }

        public int i1() {
            return this.f144993t.size();
        }

        public List<TypeAlias> j1() {
            return this.f144993t;
        }

        public TypeParameter k1(int i10) {
            return this.f144981h.get(i10);
        }

        public int l1() {
            return this.f144981h.size();
        }

        public List<TypeParameter> m1() {
            return this.f144981h;
        }

        public TypeTable n1() {
            return this.f144970F;
        }

        public List<Integer> o1() {
            return this.f144971G;
        }

        public VersionRequirementTable p1() {
            return this.f144972H;
        }

        public boolean q1() {
            return (this.f144977d & 4) == 4;
        }

        public boolean r1() {
            return (this.f144977d & 1) == 1;
        }

        public boolean s1() {
            return (this.f144977d & 2) == 2;
        }

        public boolean t1() {
            return (this.f144977d & 8) == 8;
        }

        public int u0() {
            return this.f144980g;
        }

        public boolean u1() {
            return (this.f144977d & 16) == 16;
        }

        public CompilerPluginData v0(int i10) {
            return this.f144973I.get(i10);
        }

        public boolean v1() {
            return (this.f144977d & 32) == 32;
        }

        public int w0() {
            return this.f144973I.size();
        }

        public boolean w1() {
            return (this.f144977d & 64) == 64;
        }

        public Constructor x0(int i10) {
            return this.f144990q.get(i10);
        }

        public boolean x1() {
            return (this.f144977d & 128) == 128;
        }

        public int y0() {
            return this.f144990q.size();
        }

        public List<Constructor> z0() {
            return this.f144990q;
        }

        private Class(GeneratedMessageLite.ExtendableBuilder<Class, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f144984k = -1;
            this.f144986m = -1;
            this.f144989p = -1;
            this.f144996w = -1;
            this.f144966B = -1;
            this.f144969E = -1;
            this.f144974J = (byte) -1;
            this.f144975K = -1;
            this.f144976c = extendableBuilder.m();
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
            if ((this.f144977d & 1) == 1) {
                codedOutputStream.a0(1, this.f144978e);
            }
            if (f1().size() > 0) {
                codedOutputStream.o0(18);
                codedOutputStream.o0(this.f144984k);
            }
            for (int i10 = 0; i10 < this.f144983j.size(); i10++) {
                codedOutputStream.b0(this.f144983j.get(i10).intValue());
            }
            if ((this.f144977d & 2) == 2) {
                codedOutputStream.a0(3, this.f144979f);
            }
            if ((this.f144977d & 4) == 4) {
                codedOutputStream.a0(4, this.f144980g);
            }
            for (int i11 = 0; i11 < this.f144981h.size(); i11++) {
                codedOutputStream.d0(5, this.f144981h.get(i11));
            }
            for (int i12 = 0; i12 < this.f144982i.size(); i12++) {
                codedOutputStream.d0(6, this.f144982i.get(i12));
            }
            if (Y0().size() > 0) {
                codedOutputStream.o0(58);
                codedOutputStream.o0(this.f144986m);
            }
            for (int i13 = 0; i13 < this.f144985l.size(); i13++) {
                codedOutputStream.b0(this.f144985l.get(i13).intValue());
            }
            for (int i14 = 0; i14 < this.f144990q.size(); i14++) {
                codedOutputStream.d0(8, this.f144990q.get(i14));
            }
            for (int i15 = 0; i15 < this.f144991r.size(); i15++) {
                codedOutputStream.d0(9, this.f144991r.get(i15));
            }
            for (int i16 = 0; i16 < this.f144992s.size(); i16++) {
                codedOutputStream.d0(10, this.f144992s.get(i16));
            }
            for (int i17 = 0; i17 < this.f144993t.size(); i17++) {
                codedOutputStream.d0(11, this.f144993t.get(i17));
            }
            for (int i18 = 0; i18 < this.f144994u.size(); i18++) {
                codedOutputStream.d0(13, this.f144994u.get(i18));
            }
            if (c1().size() > 0) {
                codedOutputStream.o0(130);
                codedOutputStream.o0(this.f144996w);
            }
            for (int i19 = 0; i19 < this.f144995v.size(); i19++) {
                codedOutputStream.b0(this.f144995v.get(i19).intValue());
            }
            if ((this.f144977d & 8) == 8) {
                codedOutputStream.a0(17, this.f144997x);
            }
            if ((this.f144977d & 16) == 16) {
                codedOutputStream.d0(18, this.f144998y);
            }
            if ((this.f144977d & 32) == 32) {
                codedOutputStream.a0(19, this.f144999z);
            }
            for (int i20 = 0; i20 < this.f144987n.size(); i20++) {
                codedOutputStream.d0(20, this.f144987n.get(i20));
            }
            if (C0().size() > 0) {
                codedOutputStream.o0(170);
                codedOutputStream.o0(this.f144989p);
            }
            for (int i21 = 0; i21 < this.f144988o.size(); i21++) {
                codedOutputStream.b0(this.f144988o.get(i21).intValue());
            }
            if (S0().size() > 0) {
                codedOutputStream.o0(178);
                codedOutputStream.o0(this.f144966B);
            }
            for (int i22 = 0; i22 < this.f144965A.size(); i22++) {
                codedOutputStream.b0(this.f144965A.get(i22).intValue());
            }
            for (int i23 = 0; i23 < this.f144967C.size(); i23++) {
                codedOutputStream.d0(23, this.f144967C.get(i23));
            }
            if (W0().size() > 0) {
                codedOutputStream.o0(194);
                codedOutputStream.o0(this.f144969E);
            }
            for (int i24 = 0; i24 < this.f144968D.size(); i24++) {
                codedOutputStream.b0(this.f144968D.get(i24).intValue());
            }
            if ((this.f144977d & 64) == 64) {
                codedOutputStream.d0(30, this.f144970F);
            }
            for (int i25 = 0; i25 < this.f144971G.size(); i25++) {
                codedOutputStream.a0(31, this.f144971G.get(i25).intValue());
            }
            if ((this.f144977d & 128) == 128) {
                codedOutputStream.d0(32, this.f144972H);
            }
            for (int i26 = 0; i26 < this.f144973I.size(); i26++) {
                codedOutputStream.d0(33, this.f144973I.get(i26));
            }
            extensionWriterZ.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f144976c);
        }

        private Class(boolean z10) {
            this.f144984k = -1;
            this.f144986m = -1;
            this.f144989p = -1;
            this.f144996w = -1;
            this.f144966B = -1;
            this.f144969E = -1;
            this.f144974J = (byte) -1;
            this.f144975K = -1;
            this.f144976c = ByteString.f145819a;
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
        private static final CompilerPluginData f145036h;

        /* renamed from: i, reason: collision with root package name */
        public static Parser<CompilerPluginData> f145037i = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145038b;

        /* renamed from: c, reason: collision with root package name */
        private int f145039c;

        /* renamed from: d, reason: collision with root package name */
        private int f145040d;

        /* renamed from: e, reason: collision with root package name */
        private ByteString f145041e;

        /* renamed from: f, reason: collision with root package name */
        private byte f145042f;

        /* renamed from: g, reason: collision with root package name */
        private int f145043g;

        public static final class Builder extends GeneratedMessageLite.Builder<CompilerPluginData, Builder> implements CompilerPluginDataOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145044b;

            /* renamed from: c, reason: collision with root package name */
            private int f145045c;

            /* renamed from: d, reason: collision with root package name */
            private ByteString f145046d = ByteString.f145819a;

            private void u() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.f145037i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.CompilerPluginData.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$CompilerPluginData$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            public CompilerPluginData r() {
                CompilerPluginData compilerPluginData = new CompilerPluginData(this);
                int i10 = this.f145044b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                compilerPluginData.f145040d = this.f145045c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                compilerPluginData.f145041e = this.f145046d;
                compilerPluginData.f145039c = i11;
                return compilerPluginData;
            }

            public Builder y(int i10) {
                this.f145044b |= 1;
                this.f145045c = i10;
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
                o(m().e(compilerPluginData.f145038b));
                return this;
            }

            public Builder x(ByteString byteString) {
                byteString.getClass();
                this.f145044b |= 2;
                this.f145046d = byteString;
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
            this.f145040d = 0;
            this.f145041e = ByteString.f145819a;
        }

        static {
            CompilerPluginData compilerPluginData = new CompilerPluginData(true);
            f145036h = compilerPluginData;
            compilerPluginData.B();
        }

        public static CompilerPluginData x() {
            return f145036h;
        }

        public boolean A() {
            return (this.f145039c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145042f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!A()) {
                this.f145042f = (byte) 0;
                return false;
            }
            if (z()) {
                this.f145042f = (byte) 1;
                return true;
            }
            this.f145042f = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145043g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145039c & 1) == 1 ? CodedOutputStream.o(1, this.f145040d) : 0;
            if ((this.f145039c & 2) == 2) {
                iO += CodedOutputStream.d(2, this.f145041e);
            }
            int size = iO + this.f145038b.size();
            this.f145043g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<CompilerPluginData> f() {
            return f145037i;
        }

        public ByteString v() {
            return this.f145041e;
        }

        public int y() {
            return this.f145040d;
        }

        public boolean z() {
            return (this.f145039c & 2) == 2;
        }

        private CompilerPluginData(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145042f = (byte) -1;
            this.f145043g = -1;
            this.f145038b = builder.m();
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
            if ((this.f145039c & 1) == 1) {
                codedOutputStream.a0(1, this.f145040d);
            }
            if ((this.f145039c & 2) == 2) {
                codedOutputStream.O(2, this.f145041e);
            }
            codedOutputStream.i0(this.f145038b);
        }

        private CompilerPluginData(boolean z10) {
            this.f145042f = (byte) -1;
            this.f145043g = -1;
            this.f145038b = ByteString.f145819a;
        }

        private CompilerPluginData(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145042f = (byte) -1;
            this.f145043g = -1;
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
                                this.f145039c |= 1;
                                this.f145040d = codedInputStream.s();
                            } else if (iK != 18) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                this.f145039c |= 2;
                                this.f145041e = codedInputStream.l();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145038b = outputT.g();
                            throw th3;
                        }
                        this.f145038b = outputT.g();
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
                this.f145038b = outputT.g();
                throw th4;
            }
            this.f145038b = outputT.g();
            m();
        }
    }

    public interface CompilerPluginDataOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Constructor extends GeneratedMessageLite.ExtendableMessage<Constructor> implements ConstructorOrBuilder {

        /* renamed from: k, reason: collision with root package name */
        private static final Constructor f145047k;

        /* renamed from: l, reason: collision with root package name */
        public static Parser<Constructor> f145048l = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f145049c;

        /* renamed from: d, reason: collision with root package name */
        private int f145050d;

        /* renamed from: e, reason: collision with root package name */
        private int f145051e;

        /* renamed from: f, reason: collision with root package name */
        private List<ValueParameter> f145052f;

        /* renamed from: g, reason: collision with root package name */
        private List<Integer> f145053g;

        /* renamed from: h, reason: collision with root package name */
        private List<CompilerPluginData> f145054h;

        /* renamed from: i, reason: collision with root package name */
        private byte f145055i;

        /* renamed from: j, reason: collision with root package name */
        private int f145056j;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Constructor, Builder> implements ConstructorOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f145057d;

            /* renamed from: e, reason: collision with root package name */
            private int f145058e = 6;

            /* renamed from: f, reason: collision with root package name */
            private List<ValueParameter> f145059f;

            /* renamed from: g, reason: collision with root package name */
            private List<Integer> f145060g;

            /* renamed from: h, reason: collision with root package name */
            private List<CompilerPluginData> f145061h;

            private void D() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.f145048l     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$Builder");
            }

            private void A() {
                if ((this.f145057d & 2) != 2) {
                    this.f145059f = new ArrayList(this.f145059f);
                    this.f145057d |= 2;
                }
            }

            private void C() {
                if ((this.f145057d & 4) != 4) {
                    this.f145060g = new ArrayList(this.f145060g);
                    this.f145057d |= 4;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f145057d & 8) != 8) {
                    this.f145061h = new ArrayList(this.f145061h);
                    this.f145057d |= 8;
                }
            }

            public Builder G(int i10) {
                this.f145057d |= 1;
                this.f145058e = i10;
                return this;
            }

            public Constructor w() {
                Constructor constructor = new Constructor(this);
                int i10 = (this.f145057d & 1) != 1 ? 0 : 1;
                constructor.f145051e = this.f145058e;
                if ((this.f145057d & 2) == 2) {
                    this.f145059f = Collections.unmodifiableList(this.f145059f);
                    this.f145057d &= -3;
                }
                constructor.f145052f = this.f145059f;
                if ((this.f145057d & 4) == 4) {
                    this.f145060g = Collections.unmodifiableList(this.f145060g);
                    this.f145057d &= -5;
                }
                constructor.f145053g = this.f145060g;
                if ((this.f145057d & 8) == 8) {
                    this.f145061h = Collections.unmodifiableList(this.f145061h);
                    this.f145057d &= -9;
                }
                constructor.f145054h = this.f145061h;
                constructor.f145050d = i10;
                return constructor;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f145059f = list;
                this.f145060g = list;
                this.f145061h = list;
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
                if (!constructor.f145052f.isEmpty()) {
                    if (this.f145059f.isEmpty()) {
                        this.f145059f = constructor.f145052f;
                        this.f145057d &= -3;
                    } else {
                        A();
                        this.f145059f.addAll(constructor.f145052f);
                    }
                }
                if (!constructor.f145053g.isEmpty()) {
                    if (this.f145060g.isEmpty()) {
                        this.f145060g = constructor.f145053g;
                        this.f145057d &= -5;
                    } else {
                        C();
                        this.f145060g.addAll(constructor.f145053g);
                    }
                }
                if (!constructor.f145054h.isEmpty()) {
                    if (this.f145061h.isEmpty()) {
                        this.f145061h = constructor.f145054h;
                        this.f145057d &= -9;
                    } else {
                        z();
                        this.f145061h.addAll(constructor.f145054h);
                    }
                }
                t(constructor);
                o(m().e(constructor.f145049c));
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
            this.f145051e = 6;
            List list = Collections.EMPTY_LIST;
            this.f145052f = list;
            this.f145053g = list;
            this.f145054h = list;
        }

        static {
            Constructor constructor = new Constructor(true);
            f145047k = constructor;
            constructor.U();
        }

        public static Constructor M() {
            return f145047k;
        }

        public CompilerPluginData K(int i10) {
            return this.f145054h.get(i10);
        }

        public int L() {
            return this.f145054h.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public Constructor e() {
            return f145047k;
        }

        public int O() {
            return this.f145051e;
        }

        public ValueParameter P(int i10) {
            return this.f145052f.get(i10);
        }

        public int Q() {
            return this.f145052f.size();
        }

        public List<ValueParameter> R() {
            return this.f145052f;
        }

        public List<Integer> S() {
            return this.f145053g;
        }

        public boolean T() {
            return (this.f145050d & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145055i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < Q(); i10++) {
                if (!P(i10).a()) {
                    this.f145055i = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < L(); i11++) {
                if (!K(i11).a()) {
                    this.f145055i = (byte) 0;
                    return false;
                }
            }
            if (s()) {
                this.f145055i = (byte) 1;
                return true;
            }
            this.f145055i = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145056j;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145050d & 1) == 1 ? CodedOutputStream.o(1, this.f145051e) : 0;
            for (int i11 = 0; i11 < this.f145052f.size(); i11++) {
                iO += CodedOutputStream.s(2, this.f145052f.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f145053g.size(); i12++) {
                iP += CodedOutputStream.p(this.f145053g.get(i12).intValue());
            }
            int size = iO + iP + (S().size() * 2);
            for (int i13 = 0; i13 < this.f145054h.size(); i13++) {
                size += CodedOutputStream.s(32, this.f145054h.get(i13));
            }
            int iT = size + t() + this.f145049c.size();
            this.f145056j = iT;
            return iT;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Constructor> f() {
            return f145048l;
        }

        private Constructor(GeneratedMessageLite.ExtendableBuilder<Constructor, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f145055i = (byte) -1;
            this.f145056j = -1;
            this.f145049c = extendableBuilder.m();
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
            if ((this.f145050d & 1) == 1) {
                codedOutputStream.a0(1, this.f145051e);
            }
            for (int i10 = 0; i10 < this.f145052f.size(); i10++) {
                codedOutputStream.d0(2, this.f145052f.get(i10));
            }
            for (int i11 = 0; i11 < this.f145053g.size(); i11++) {
                codedOutputStream.a0(31, this.f145053g.get(i11).intValue());
            }
            for (int i12 = 0; i12 < this.f145054h.size(); i12++) {
                codedOutputStream.d0(32, this.f145054h.get(i12));
            }
            extensionWriterZ.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f145049c);
        }

        private Constructor(boolean z10) {
            this.f145055i = (byte) -1;
            this.f145056j = -1;
            this.f145049c = ByteString.f145819a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Constructor(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145055i = (byte) -1;
            this.f145056j = -1;
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
                                this.f145050d |= 1;
                                this.f145051e = codedInputStream.s();
                            } else if (iK == 18) {
                                if ((i10 & 2) != 2) {
                                    this.f145052f = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f145052f.add(codedInputStream.u(ValueParameter.f145410n, extensionRegistryLite));
                            } else if (iK == 248) {
                                if ((i10 & 4) != 4) {
                                    this.f145053g = new ArrayList();
                                    i10 |= 4;
                                }
                                this.f145053g.add(Integer.valueOf(codedInputStream.s()));
                            } else if (iK == 250) {
                                int iJ = codedInputStream.j(codedInputStream.A());
                                if ((i10 & 4) != 4 && codedInputStream.e() > 0) {
                                    this.f145053g = new ArrayList();
                                    i10 |= 4;
                                }
                                while (codedInputStream.e() > 0) {
                                    this.f145053g.add(Integer.valueOf(codedInputStream.s()));
                                }
                                codedInputStream.i(iJ);
                            } else if (iK != 258) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                if ((i10 & 8) != 8) {
                                    this.f145054h = new ArrayList();
                                    i10 |= 8;
                                }
                                this.f145054h.add(codedInputStream.u(CompilerPluginData.f145037i, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 2) == 2) {
                            this.f145052f = Collections.unmodifiableList(this.f145052f);
                        }
                        if ((i10 & 4) == 4) {
                            this.f145053g = Collections.unmodifiableList(this.f145053g);
                        }
                        if ((i10 & 8) == 8) {
                            this.f145054h = Collections.unmodifiableList(this.f145054h);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145049c = outputT.g();
                            throw th3;
                        }
                        this.f145049c = outputT.g();
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
                this.f145052f = Collections.unmodifiableList(this.f145052f);
            }
            if ((i10 & 4) == 4) {
                this.f145053g = Collections.unmodifiableList(this.f145053g);
            }
            if ((i10 & 8) == 8) {
                this.f145054h = Collections.unmodifiableList(this.f145054h);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145049c = outputT.g();
                throw th4;
            }
            this.f145049c = outputT.g();
            m();
        }
    }

    public interface ConstructorOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Contract extends GeneratedMessageLite implements ContractOrBuilder {

        /* renamed from: f, reason: collision with root package name */
        private static final Contract f145062f;

        /* renamed from: g, reason: collision with root package name */
        public static Parser<Contract> f145063g = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145064b;

        /* renamed from: c, reason: collision with root package name */
        private List<Effect> f145065c;

        /* renamed from: d, reason: collision with root package name */
        private byte f145066d;

        /* renamed from: e, reason: collision with root package name */
        private int f145067e;

        public static final class Builder extends GeneratedMessageLite.Builder<Contract, Builder> implements ContractOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145068b;

            /* renamed from: c, reason: collision with root package name */
            private List<Effect> f145069c = Collections.EMPTY_LIST;

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.f145063g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Contract.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f145068b & 1) != 1) {
                    this.f145069c = new ArrayList(this.f145069c);
                    this.f145068b |= 1;
                }
            }

            public Contract r() {
                Contract contract = new Contract(this);
                if ((this.f145068b & 1) == 1) {
                    this.f145069c = Collections.unmodifiableList(this.f145069c);
                    this.f145068b &= -2;
                }
                contract.f145065c = this.f145069c;
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
                if (!contract.f145065c.isEmpty()) {
                    if (this.f145069c.isEmpty()) {
                        this.f145069c = contract.f145065c;
                        this.f145068b &= -2;
                    } else {
                        u();
                        this.f145069c.addAll(contract.f145065c);
                    }
                }
                o(m().e(contract.f145064b));
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
            f145062f = contract;
            contract.y();
        }

        public static Contract u() {
            return f145062f;
        }

        private void y() {
            this.f145065c = Collections.EMPTY_LIST;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145066d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < x(); i10++) {
                if (!v(i10).a()) {
                    this.f145066d = (byte) 0;
                    return false;
                }
            }
            this.f145066d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145067e;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f145065c.size(); i11++) {
                iS += CodedOutputStream.s(1, this.f145065c.get(i11));
            }
            int size = iS + this.f145064b.size();
            this.f145067e = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Contract> f() {
            return f145063g;
        }

        public Effect v(int i10) {
            return this.f145065c.get(i10);
        }

        public int x() {
            return this.f145065c.size();
        }

        private Contract(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145066d = (byte) -1;
            this.f145067e = -1;
            this.f145064b = builder.m();
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
            for (int i10 = 0; i10 < this.f145065c.size(); i10++) {
                codedOutputStream.d0(1, this.f145065c.get(i10));
            }
            codedOutputStream.i0(this.f145064b);
        }

        private Contract(boolean z10) {
            this.f145066d = (byte) -1;
            this.f145067e = -1;
            this.f145064b = ByteString.f145819a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Contract(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145066d = (byte) -1;
            this.f145067e = -1;
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
                                        this.f145065c = new ArrayList();
                                        z11 = true;
                                    }
                                    this.f145065c.add(codedInputStream.u(Effect.f145071k, extensionRegistryLite));
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
                        this.f145065c = Collections.unmodifiableList(this.f145065c);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f145064b = outputT.g();
                        throw th3;
                    }
                    this.f145064b = outputT.g();
                    m();
                    throw th2;
                }
            }
            if (z11) {
                this.f145065c = Collections.unmodifiableList(this.f145065c);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145064b = outputT.g();
                throw th4;
            }
            this.f145064b = outputT.g();
            m();
        }
    }

    public interface ContractOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Effect extends GeneratedMessageLite implements EffectOrBuilder {

        /* renamed from: j, reason: collision with root package name */
        private static final Effect f145070j;

        /* renamed from: k, reason: collision with root package name */
        public static Parser<Effect> f145071k = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145072b;

        /* renamed from: c, reason: collision with root package name */
        private int f145073c;

        /* renamed from: d, reason: collision with root package name */
        private EffectType f145074d;

        /* renamed from: e, reason: collision with root package name */
        private List<Expression> f145075e;

        /* renamed from: f, reason: collision with root package name */
        private Expression f145076f;

        /* renamed from: g, reason: collision with root package name */
        private InvocationKind f145077g;

        /* renamed from: h, reason: collision with root package name */
        private byte f145078h;

        /* renamed from: i, reason: collision with root package name */
        private int f145079i;

        public static final class Builder extends GeneratedMessageLite.Builder<Effect, Builder> implements EffectOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145080b;

            /* renamed from: c, reason: collision with root package name */
            private EffectType f145081c = EffectType.RETURNS_CONSTANT;

            /* renamed from: d, reason: collision with root package name */
            private List<Expression> f145082d = Collections.EMPTY_LIST;

            /* renamed from: e, reason: collision with root package name */
            private Expression f145083e = Expression.G();

            /* renamed from: f, reason: collision with root package name */
            private InvocationKind f145084f = InvocationKind.AT_MOST_ONCE;

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.f145071k     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Effect.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f145080b & 2) != 2) {
                    this.f145082d = new ArrayList(this.f145082d);
                    this.f145080b |= 2;
                }
            }

            public Effect r() {
                Effect effect = new Effect(this);
                int i10 = this.f145080b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                effect.f145074d = this.f145081c;
                if ((this.f145080b & 2) == 2) {
                    this.f145082d = Collections.unmodifiableList(this.f145082d);
                    this.f145080b &= -3;
                }
                effect.f145075e = this.f145082d;
                if ((i10 & 4) == 4) {
                    i11 |= 2;
                }
                effect.f145076f = this.f145083e;
                if ((i10 & 8) == 8) {
                    i11 |= 4;
                }
                effect.f145077g = this.f145084f;
                effect.f145073c = i11;
                return effect;
            }

            public Builder w(Expression expression) {
                if ((this.f145080b & 4) != 4 || this.f145083e == Expression.G()) {
                    this.f145083e = expression;
                } else {
                    this.f145083e = Expression.U(this.f145083e).n(expression).r();
                }
                this.f145080b |= 4;
                return this;
            }

            private Builder() {
                v();
            }

            public Builder A(InvocationKind invocationKind) {
                invocationKind.getClass();
                this.f145080b |= 8;
                this.f145084f = invocationKind;
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
                if (!effect.f145075e.isEmpty()) {
                    if (this.f145082d.isEmpty()) {
                        this.f145082d = effect.f145075e;
                        this.f145080b &= -3;
                    } else {
                        u();
                        this.f145082d.addAll(effect.f145075e);
                    }
                }
                if (effect.F()) {
                    w(effect.z());
                }
                if (effect.H()) {
                    A(effect.E());
                }
                o(m().e(effect.f145072b));
                return this;
            }

            public Builder z(EffectType effectType) {
                effectType.getClass();
                this.f145080b |= 1;
                this.f145081c = effectType;
                return this;
            }
        }

        public enum EffectType implements Internal.EnumLite {
            RETURNS_CONSTANT(0, 0),
            CALLS(1, 1),
            RETURNS_NOT_NULL(2, 2);


            /* renamed from: e, reason: collision with root package name */
            private static Internal.EnumLiteMap<EffectType> f145088e = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f145090a;

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
                return this.f145090a;
            }

            EffectType(int i10, int i11) {
                this.f145090a = i11;
            }
        }

        public enum InvocationKind implements Internal.EnumLite {
            AT_MOST_ONCE(0, 0),
            EXACTLY_ONCE(1, 1),
            AT_LEAST_ONCE(2, 2);


            /* renamed from: e, reason: collision with root package name */
            private static Internal.EnumLiteMap<InvocationKind> f145094e = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f145096a;

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
                return this.f145096a;
            }

            InvocationKind(int i10, int i11) {
                this.f145096a = i11;
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
            f145070j = effect;
            effect.I();
        }

        public static Effect A() {
            return f145070j;
        }

        private void I() {
            this.f145074d = EffectType.RETURNS_CONSTANT;
            this.f145075e = Collections.EMPTY_LIST;
            this.f145076f = Expression.G();
            this.f145077g = InvocationKind.AT_MOST_ONCE;
        }

        public Expression B(int i10) {
            return this.f145075e.get(i10);
        }

        public int C() {
            return this.f145075e.size();
        }

        public EffectType D() {
            return this.f145074d;
        }

        public InvocationKind E() {
            return this.f145077g;
        }

        public boolean F() {
            return (this.f145073c & 2) == 2;
        }

        public boolean G() {
            return (this.f145073c & 1) == 1;
        }

        public boolean H() {
            return (this.f145073c & 4) == 4;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145078h;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < C(); i10++) {
                if (!B(i10).a()) {
                    this.f145078h = (byte) 0;
                    return false;
                }
            }
            if (!F() || z().a()) {
                this.f145078h = (byte) 1;
                return true;
            }
            this.f145078h = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145079i;
            if (i10 != -1) {
                return i10;
            }
            int iH = (this.f145073c & 1) == 1 ? CodedOutputStream.h(1, this.f145074d.g()) : 0;
            for (int i11 = 0; i11 < this.f145075e.size(); i11++) {
                iH += CodedOutputStream.s(2, this.f145075e.get(i11));
            }
            if ((this.f145073c & 2) == 2) {
                iH += CodedOutputStream.s(3, this.f145076f);
            }
            if ((this.f145073c & 4) == 4) {
                iH += CodedOutputStream.h(4, this.f145077g.g());
            }
            int size = iH + this.f145072b.size();
            this.f145079i = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Effect> f() {
            return f145071k;
        }

        public Expression z() {
            return this.f145076f;
        }

        private Effect(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145078h = (byte) -1;
            this.f145079i = -1;
            this.f145072b = builder.m();
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
            if ((this.f145073c & 1) == 1) {
                codedOutputStream.S(1, this.f145074d.g());
            }
            for (int i10 = 0; i10 < this.f145075e.size(); i10++) {
                codedOutputStream.d0(2, this.f145075e.get(i10));
            }
            if ((this.f145073c & 2) == 2) {
                codedOutputStream.d0(3, this.f145076f);
            }
            if ((this.f145073c & 4) == 4) {
                codedOutputStream.S(4, this.f145077g.g());
            }
            codedOutputStream.i0(this.f145072b);
        }

        private Effect(boolean z10) {
            this.f145078h = (byte) -1;
            this.f145079i = -1;
            this.f145072b = ByteString.f145819a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Effect(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145078h = (byte) -1;
            this.f145079i = -1;
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
                                    this.f145073c |= 1;
                                    this.f145074d = effectTypeA;
                                }
                            } else if (iK == 18) {
                                if ((c10 & 2) != 2) {
                                    this.f145075e = new ArrayList();
                                    c10 = 2;
                                }
                                this.f145075e.add(codedInputStream.u(Expression.f145107n, extensionRegistryLite));
                            } else if (iK == 26) {
                                Expression.Builder builderB = (this.f145073c & 2) == 2 ? this.f145076f.b() : null;
                                Expression expression = (Expression) codedInputStream.u(Expression.f145107n, extensionRegistryLite);
                                this.f145076f = expression;
                                if (builderB != null) {
                                    builderB.n(expression);
                                    this.f145076f = builderB.r();
                                }
                                this.f145073c |= 2;
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
                                    this.f145073c |= 4;
                                    this.f145077g = invocationKindA;
                                }
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((c10 & 2) == 2) {
                            this.f145075e = Collections.unmodifiableList(this.f145075e);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145072b = outputT.g();
                            throw th3;
                        }
                        this.f145072b = outputT.g();
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
                this.f145075e = Collections.unmodifiableList(this.f145075e);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145072b = outputT.g();
                throw th4;
            }
            this.f145072b = outputT.g();
            m();
        }
    }

    public interface EffectOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class EnumEntry extends GeneratedMessageLite.ExtendableMessage<EnumEntry> implements EnumEntryOrBuilder {

        /* renamed from: h, reason: collision with root package name */
        private static final EnumEntry f145097h;

        /* renamed from: i, reason: collision with root package name */
        public static Parser<EnumEntry> f145098i = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f145099c;

        /* renamed from: d, reason: collision with root package name */
        private int f145100d;

        /* renamed from: e, reason: collision with root package name */
        private int f145101e;

        /* renamed from: f, reason: collision with root package name */
        private byte f145102f;

        /* renamed from: g, reason: collision with root package name */
        private int f145103g;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<EnumEntry, Builder> implements EnumEntryOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f145104d;

            /* renamed from: e, reason: collision with root package name */
            private int f145105e;

            private void z() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.f145098i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.EnumEntry.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            public Builder D(int i10) {
                this.f145104d |= 1;
                this.f145105e = i10;
                return this;
            }

            public EnumEntry w() {
                EnumEntry enumEntry = new EnumEntry(this);
                int i10 = (this.f145104d & 1) != 1 ? 0 : 1;
                enumEntry.f145101e = this.f145105e;
                enumEntry.f145100d = i10;
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
                o(m().e(enumEntry.f145099c));
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
            this.f145101e = 0;
        }

        static {
            EnumEntry enumEntry = new EnumEntry(true);
            f145097h = enumEntry;
            enumEntry.I();
        }

        public static EnumEntry E() {
            return f145097h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public EnumEntry e() {
            return f145097h;
        }

        public int G() {
            return this.f145101e;
        }

        public boolean H() {
            return (this.f145100d & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145102f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (s()) {
                this.f145102f = (byte) 1;
                return true;
            }
            this.f145102f = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145103g;
            if (i10 != -1) {
                return i10;
            }
            int iO = ((this.f145100d & 1) == 1 ? CodedOutputStream.o(1, this.f145101e) : 0) + t() + this.f145099c.size();
            this.f145103g = iO;
            return iO;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<EnumEntry> f() {
            return f145098i;
        }

        private EnumEntry(GeneratedMessageLite.ExtendableBuilder<EnumEntry, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f145102f = (byte) -1;
            this.f145103g = -1;
            this.f145099c = extendableBuilder.m();
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
            if ((this.f145100d & 1) == 1) {
                codedOutputStream.a0(1, this.f145101e);
            }
            extensionWriterZ.a(HttpResponseStatus.SUCCESS_OK, codedOutputStream);
            codedOutputStream.i0(this.f145099c);
        }

        private EnumEntry(boolean z10) {
            this.f145102f = (byte) -1;
            this.f145103g = -1;
            this.f145099c = ByteString.f145819a;
        }

        private EnumEntry(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145102f = (byte) -1;
            this.f145103g = -1;
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
                                    this.f145100d |= 1;
                                    this.f145101e = codedInputStream.s();
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
                        this.f145099c = outputT.g();
                        throw th3;
                    }
                    this.f145099c = outputT.g();
                    m();
                    throw th2;
                }
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145099c = outputT.g();
                throw th4;
            }
            this.f145099c = outputT.g();
            m();
        }
    }

    public interface EnumEntryOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Expression extends GeneratedMessageLite implements ExpressionOrBuilder {

        /* renamed from: m, reason: collision with root package name */
        private static final Expression f145106m;

        /* renamed from: n, reason: collision with root package name */
        public static Parser<Expression> f145107n = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145108b;

        /* renamed from: c, reason: collision with root package name */
        private int f145109c;

        /* renamed from: d, reason: collision with root package name */
        private int f145110d;

        /* renamed from: e, reason: collision with root package name */
        private int f145111e;

        /* renamed from: f, reason: collision with root package name */
        private ConstantValue f145112f;

        /* renamed from: g, reason: collision with root package name */
        private Type f145113g;

        /* renamed from: h, reason: collision with root package name */
        private int f145114h;

        /* renamed from: i, reason: collision with root package name */
        private List<Expression> f145115i;

        /* renamed from: j, reason: collision with root package name */
        private List<Expression> f145116j;

        /* renamed from: k, reason: collision with root package name */
        private byte f145117k;

        /* renamed from: l, reason: collision with root package name */
        private int f145118l;

        public static final class Builder extends GeneratedMessageLite.Builder<Expression, Builder> implements ExpressionOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145119b;

            /* renamed from: c, reason: collision with root package name */
            private int f145120c;

            /* renamed from: d, reason: collision with root package name */
            private int f145121d;

            /* renamed from: e, reason: collision with root package name */
            private ConstantValue f145122e = ConstantValue.TRUE;

            /* renamed from: f, reason: collision with root package name */
            private Type f145123f = Type.Y();

            /* renamed from: g, reason: collision with root package name */
            private int f145124g;

            /* renamed from: h, reason: collision with root package name */
            private List<Expression> f145125h;

            /* renamed from: i, reason: collision with root package name */
            private List<Expression> f145126i;

            private void w() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.f145107n     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Expression.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f145119b & 32) != 32) {
                    this.f145125h = new ArrayList(this.f145125h);
                    this.f145119b |= 32;
                }
            }

            private void v() {
                if ((this.f145119b & 64) != 64) {
                    this.f145126i = new ArrayList(this.f145126i);
                    this.f145119b |= 64;
                }
            }

            public Builder C(int i10) {
                this.f145119b |= 1;
                this.f145120c = i10;
                return this;
            }

            public Builder D(int i10) {
                this.f145119b |= 16;
                this.f145124g = i10;
                return this;
            }

            public Builder E(int i10) {
                this.f145119b |= 2;
                this.f145121d = i10;
                return this;
            }

            public Expression r() {
                Expression expression = new Expression(this);
                int i10 = this.f145119b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                expression.f145110d = this.f145120c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                expression.f145111e = this.f145121d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                expression.f145112f = this.f145122e;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                expression.f145113g = this.f145123f;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                expression.f145114h = this.f145124g;
                if ((this.f145119b & 32) == 32) {
                    this.f145125h = Collections.unmodifiableList(this.f145125h);
                    this.f145119b &= -33;
                }
                expression.f145115i = this.f145125h;
                if ((this.f145119b & 64) == 64) {
                    this.f145126i = Collections.unmodifiableList(this.f145126i);
                    this.f145119b &= -65;
                }
                expression.f145116j = this.f145126i;
                expression.f145109c = i11;
                return expression;
            }

            public Builder z(Type type) {
                if ((this.f145119b & 8) != 8 || this.f145123f == Type.Y()) {
                    this.f145123f = type;
                } else {
                    this.f145123f = Type.A0(this.f145123f).n(type).w();
                }
                this.f145119b |= 8;
                return this;
            }

            private Builder() {
                List<Expression> list = Collections.EMPTY_LIST;
                this.f145125h = list;
                this.f145126i = list;
                w();
            }

            public Builder A(ConstantValue constantValue) {
                constantValue.getClass();
                this.f145119b |= 4;
                this.f145122e = constantValue;
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
                if (!expression.f145115i.isEmpty()) {
                    if (this.f145125h.isEmpty()) {
                        this.f145125h = expression.f145115i;
                        this.f145119b &= -33;
                    } else {
                        u();
                        this.f145125h.addAll(expression.f145115i);
                    }
                }
                if (!expression.f145116j.isEmpty()) {
                    if (this.f145126i.isEmpty()) {
                        this.f145126i = expression.f145116j;
                        this.f145119b &= -65;
                    } else {
                        v();
                        this.f145126i.addAll(expression.f145116j);
                    }
                }
                o(m().e(expression.f145108b));
                return this;
            }
        }

        public enum ConstantValue implements Internal.EnumLite {
            TRUE(0, 0),
            FALSE(1, 1),
            NULL(2, 2);


            /* renamed from: e, reason: collision with root package name */
            private static Internal.EnumLiteMap<ConstantValue> f145130e = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f145132a;

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
                return this.f145132a;
            }

            ConstantValue(int i10, int i11) {
                this.f145132a = i11;
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
            this.f145110d = 0;
            this.f145111e = 0;
            this.f145112f = ConstantValue.TRUE;
            this.f145113g = Type.Y();
            this.f145114h = 0;
            List<Expression> list = Collections.EMPTY_LIST;
            this.f145115i = list;
            this.f145116j = list;
        }

        static {
            Expression expression = new Expression(true);
            f145106m = expression;
            expression.S();
        }

        public static Expression G() {
            return f145106m;
        }

        public Expression D(int i10) {
            return this.f145115i.get(i10);
        }

        public int E() {
            return this.f145115i.size();
        }

        public ConstantValue F() {
            return this.f145112f;
        }

        public int H() {
            return this.f145110d;
        }

        public Type I() {
            return this.f145113g;
        }

        public int J() {
            return this.f145114h;
        }

        public Expression K(int i10) {
            return this.f145116j.get(i10);
        }

        public int L() {
            return this.f145116j.size();
        }

        public int M() {
            return this.f145111e;
        }

        public boolean N() {
            return (this.f145109c & 4) == 4;
        }

        public boolean O() {
            return (this.f145109c & 1) == 1;
        }

        public boolean P() {
            return (this.f145109c & 8) == 8;
        }

        public boolean Q() {
            return (this.f145109c & 16) == 16;
        }

        public boolean R() {
            return (this.f145109c & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145117k;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (P() && !I().a()) {
                this.f145117k = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < E(); i10++) {
                if (!D(i10).a()) {
                    this.f145117k = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < L(); i11++) {
                if (!K(i11).a()) {
                    this.f145117k = (byte) 0;
                    return false;
                }
            }
            this.f145117k = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145118l;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145109c & 1) == 1 ? CodedOutputStream.o(1, this.f145110d) : 0;
            if ((this.f145109c & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f145111e);
            }
            if ((this.f145109c & 4) == 4) {
                iO += CodedOutputStream.h(3, this.f145112f.g());
            }
            if ((this.f145109c & 8) == 8) {
                iO += CodedOutputStream.s(4, this.f145113g);
            }
            if ((this.f145109c & 16) == 16) {
                iO += CodedOutputStream.o(5, this.f145114h);
            }
            for (int i11 = 0; i11 < this.f145115i.size(); i11++) {
                iO += CodedOutputStream.s(6, this.f145115i.get(i11));
            }
            for (int i12 = 0; i12 < this.f145116j.size(); i12++) {
                iO += CodedOutputStream.s(7, this.f145116j.get(i12));
            }
            int size = iO + this.f145108b.size();
            this.f145118l = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Expression> f() {
            return f145107n;
        }

        private Expression(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145117k = (byte) -1;
            this.f145118l = -1;
            this.f145108b = builder.m();
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
            if ((this.f145109c & 1) == 1) {
                codedOutputStream.a0(1, this.f145110d);
            }
            if ((this.f145109c & 2) == 2) {
                codedOutputStream.a0(2, this.f145111e);
            }
            if ((this.f145109c & 4) == 4) {
                codedOutputStream.S(3, this.f145112f.g());
            }
            if ((this.f145109c & 8) == 8) {
                codedOutputStream.d0(4, this.f145113g);
            }
            if ((this.f145109c & 16) == 16) {
                codedOutputStream.a0(5, this.f145114h);
            }
            for (int i10 = 0; i10 < this.f145115i.size(); i10++) {
                codedOutputStream.d0(6, this.f145115i.get(i10));
            }
            for (int i11 = 0; i11 < this.f145116j.size(); i11++) {
                codedOutputStream.d0(7, this.f145116j.get(i11));
            }
            codedOutputStream.i0(this.f145108b);
        }

        private Expression(boolean z10) {
            this.f145117k = (byte) -1;
            this.f145118l = -1;
            this.f145108b = ByteString.f145819a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Expression(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145117k = (byte) -1;
            this.f145118l = -1;
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
                                this.f145109c |= 1;
                                this.f145110d = codedInputStream.s();
                            } else if (iK == 16) {
                                this.f145109c |= 2;
                                this.f145111e = codedInputStream.s();
                            } else if (iK == 24) {
                                int iN = codedInputStream.n();
                                ConstantValue constantValueA = ConstantValue.a(iN);
                                if (constantValueA == null) {
                                    codedOutputStreamJ.o0(iK);
                                    codedOutputStreamJ.o0(iN);
                                } else {
                                    this.f145109c |= 4;
                                    this.f145112f = constantValueA;
                                }
                            } else if (iK == 34) {
                                Type.Builder builderB = (this.f145109c & 8) == 8 ? this.f145113g.b() : null;
                                Type type = (Type) codedInputStream.u(Type.f145291v, extensionRegistryLite);
                                this.f145113g = type;
                                if (builderB != null) {
                                    builderB.n(type);
                                    this.f145113g = builderB.w();
                                }
                                this.f145109c |= 8;
                            } else if (iK == 40) {
                                this.f145109c |= 16;
                                this.f145114h = codedInputStream.s();
                            } else if (iK == 50) {
                                if ((i10 & 32) != 32) {
                                    this.f145115i = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f145115i.add(codedInputStream.u(f145107n, extensionRegistryLite));
                            } else if (iK != 58) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                if ((i10 & 64) != 64) {
                                    this.f145116j = new ArrayList();
                                    i10 |= 64;
                                }
                                this.f145116j.add(codedInputStream.u(f145107n, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if ((i10 & 32) == 32) {
                            this.f145115i = Collections.unmodifiableList(this.f145115i);
                        }
                        if ((i10 & 64) == 64) {
                            this.f145116j = Collections.unmodifiableList(this.f145116j);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145108b = outputT.g();
                            throw th3;
                        }
                        this.f145108b = outputT.g();
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
                this.f145115i = Collections.unmodifiableList(this.f145115i);
            }
            if ((i10 & 64) == 64) {
                this.f145116j = Collections.unmodifiableList(this.f145116j);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145108b = outputT.g();
                throw th4;
            }
            this.f145108b = outputT.g();
            m();
        }
    }

    public interface ExpressionOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Function extends GeneratedMessageLite.ExtendableMessage<Function> implements FunctionOrBuilder {

        /* renamed from: w, reason: collision with root package name */
        private static final Function f145133w;

        /* renamed from: x, reason: collision with root package name */
        public static Parser<Function> f145134x = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f145135c;

        /* renamed from: d, reason: collision with root package name */
        private int f145136d;

        /* renamed from: e, reason: collision with root package name */
        private int f145137e;

        /* renamed from: f, reason: collision with root package name */
        private int f145138f;

        /* renamed from: g, reason: collision with root package name */
        private int f145139g;

        /* renamed from: h, reason: collision with root package name */
        private Type f145140h;

        /* renamed from: i, reason: collision with root package name */
        private int f145141i;

        /* renamed from: j, reason: collision with root package name */
        private List<TypeParameter> f145142j;

        /* renamed from: k, reason: collision with root package name */
        private Type f145143k;

        /* renamed from: l, reason: collision with root package name */
        private int f145144l;

        /* renamed from: m, reason: collision with root package name */
        private List<Type> f145145m;

        /* renamed from: n, reason: collision with root package name */
        private List<Integer> f145146n;

        /* renamed from: o, reason: collision with root package name */
        private int f145147o;

        /* renamed from: p, reason: collision with root package name */
        private List<ValueParameter> f145148p;

        /* renamed from: q, reason: collision with root package name */
        private TypeTable f145149q;

        /* renamed from: r, reason: collision with root package name */
        private List<Integer> f145150r;

        /* renamed from: s, reason: collision with root package name */
        private Contract f145151s;

        /* renamed from: t, reason: collision with root package name */
        private List<CompilerPluginData> f145152t;

        /* renamed from: u, reason: collision with root package name */
        private byte f145153u;

        /* renamed from: v, reason: collision with root package name */
        private int f145154v;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Function, Builder> implements FunctionOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f145155d;

            /* renamed from: g, reason: collision with root package name */
            private int f145158g;

            /* renamed from: i, reason: collision with root package name */
            private int f145160i;

            /* renamed from: j, reason: collision with root package name */
            private List<TypeParameter> f145161j;

            /* renamed from: k, reason: collision with root package name */
            private Type f145162k;

            /* renamed from: l, reason: collision with root package name */
            private int f145163l;

            /* renamed from: m, reason: collision with root package name */
            private List<Type> f145164m;

            /* renamed from: n, reason: collision with root package name */
            private List<Integer> f145165n;

            /* renamed from: o, reason: collision with root package name */
            private List<ValueParameter> f145166o;

            /* renamed from: p, reason: collision with root package name */
            private TypeTable f145167p;

            /* renamed from: q, reason: collision with root package name */
            private List<Integer> f145168q;

            /* renamed from: r, reason: collision with root package name */
            private Contract f145169r;

            /* renamed from: s, reason: collision with root package name */
            private List<CompilerPluginData> f145170s;

            /* renamed from: e, reason: collision with root package name */
            private int f145156e = 6;

            /* renamed from: f, reason: collision with root package name */
            private int f145157f = 6;

            /* renamed from: h, reason: collision with root package name */
            private Type f145159h = Type.Y();

            private void G() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: J, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.f145134x     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$Builder");
            }

            private void A() {
                if ((this.f145155d & 512) != 512) {
                    this.f145165n = new ArrayList(this.f145165n);
                    this.f145155d |= 512;
                }
            }

            private void C() {
                if ((this.f145155d & 256) != 256) {
                    this.f145164m = new ArrayList(this.f145164m);
                    this.f145155d |= 256;
                }
            }

            private void D() {
                if ((this.f145155d & 32) != 32) {
                    this.f145161j = new ArrayList(this.f145161j);
                    this.f145155d |= 32;
                }
            }

            private void E() {
                if ((this.f145155d & 1024) != 1024) {
                    this.f145166o = new ArrayList(this.f145166o);
                    this.f145155d |= 1024;
                }
            }

            private void F() {
                if ((this.f145155d & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                    this.f145168q = new ArrayList(this.f145168q);
                    this.f145155d |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f145155d & 16384) != 16384) {
                    this.f145170s = new ArrayList(this.f145170s);
                    this.f145155d |= 16384;
                }
            }

            public Builder H(Contract contract) {
                if ((this.f145155d & 8192) != 8192 || this.f145169r == Contract.u()) {
                    this.f145169r = contract;
                } else {
                    this.f145169r = Contract.A(this.f145169r).n(contract).r();
                }
                this.f145155d |= 8192;
                return this;
            }

            public Builder K(Type type) {
                if ((this.f145155d & 64) != 64 || this.f145162k == Type.Y()) {
                    this.f145162k = type;
                } else {
                    this.f145162k = Type.A0(this.f145162k).n(type).w();
                }
                this.f145155d |= 64;
                return this;
            }

            public Builder L(Type type) {
                if ((this.f145155d & 8) != 8 || this.f145159h == Type.Y()) {
                    this.f145159h = type;
                } else {
                    this.f145159h = Type.A0(this.f145159h).n(type).w();
                }
                this.f145155d |= 8;
                return this;
            }

            public Builder M(TypeTable typeTable) {
                if ((this.f145155d & RecyclerView.m.FLAG_MOVED) != 2048 || this.f145167p == TypeTable.x()) {
                    this.f145167p = typeTable;
                } else {
                    this.f145167p = TypeTable.F(this.f145167p).n(typeTable).r();
                }
                this.f145155d |= RecyclerView.m.FLAG_MOVED;
                return this;
            }

            public Builder N(int i10) {
                this.f145155d |= 1;
                this.f145156e = i10;
                return this;
            }

            public Builder O(int i10) {
                this.f145155d |= 4;
                this.f145158g = i10;
                return this;
            }

            public Builder P(int i10) {
                this.f145155d |= 2;
                this.f145157f = i10;
                return this;
            }

            public Builder Q(int i10) {
                this.f145155d |= 128;
                this.f145163l = i10;
                return this;
            }

            public Builder R(int i10) {
                this.f145155d |= 16;
                this.f145160i = i10;
                return this;
            }

            public Function w() {
                Function function = new Function(this);
                int i10 = this.f145155d;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                function.f145137e = this.f145156e;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                function.f145138f = this.f145157f;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                function.f145139g = this.f145158g;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                function.f145140h = this.f145159h;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                function.f145141i = this.f145160i;
                if ((this.f145155d & 32) == 32) {
                    this.f145161j = Collections.unmodifiableList(this.f145161j);
                    this.f145155d &= -33;
                }
                function.f145142j = this.f145161j;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                function.f145143k = this.f145162k;
                if ((i10 & 128) == 128) {
                    i11 |= 64;
                }
                function.f145144l = this.f145163l;
                if ((this.f145155d & 256) == 256) {
                    this.f145164m = Collections.unmodifiableList(this.f145164m);
                    this.f145155d &= -257;
                }
                function.f145145m = this.f145164m;
                if ((this.f145155d & 512) == 512) {
                    this.f145165n = Collections.unmodifiableList(this.f145165n);
                    this.f145155d &= -513;
                }
                function.f145146n = this.f145165n;
                if ((this.f145155d & 1024) == 1024) {
                    this.f145166o = Collections.unmodifiableList(this.f145166o);
                    this.f145155d &= -1025;
                }
                function.f145148p = this.f145166o;
                if ((i10 & RecyclerView.m.FLAG_MOVED) == 2048) {
                    i11 |= 128;
                }
                function.f145149q = this.f145167p;
                if ((this.f145155d & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    this.f145168q = Collections.unmodifiableList(this.f145168q);
                    this.f145155d &= -4097;
                }
                function.f145150r = this.f145168q;
                if ((i10 & 8192) == 8192) {
                    i11 |= 256;
                }
                function.f145151s = this.f145169r;
                if ((this.f145155d & 16384) == 16384) {
                    this.f145170s = Collections.unmodifiableList(this.f145170s);
                    this.f145155d &= -16385;
                }
                function.f145152t = this.f145170s;
                function.f145136d = i11;
                return function;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f145161j = list;
                this.f145162k = Type.Y();
                this.f145164m = list;
                this.f145165n = list;
                this.f145166o = list;
                this.f145167p = TypeTable.x();
                this.f145168q = list;
                this.f145169r = Contract.u();
                this.f145170s = list;
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
                if (!function.f145142j.isEmpty()) {
                    if (this.f145161j.isEmpty()) {
                        this.f145161j = function.f145142j;
                        this.f145155d &= -33;
                    } else {
                        D();
                        this.f145161j.addAll(function.f145142j);
                    }
                }
                if (function.B0()) {
                    K(function.k0());
                }
                if (function.C0()) {
                    Q(function.l0());
                }
                if (!function.f145145m.isEmpty()) {
                    if (this.f145164m.isEmpty()) {
                        this.f145164m = function.f145145m;
                        this.f145155d &= -257;
                    } else {
                        C();
                        this.f145164m.addAll(function.f145145m);
                    }
                }
                if (!function.f145146n.isEmpty()) {
                    if (this.f145165n.isEmpty()) {
                        this.f145165n = function.f145146n;
                        this.f145155d &= -513;
                    } else {
                        A();
                        this.f145165n.addAll(function.f145146n);
                    }
                }
                if (!function.f145148p.isEmpty()) {
                    if (this.f145166o.isEmpty()) {
                        this.f145166o = function.f145148p;
                        this.f145155d &= -1025;
                    } else {
                        E();
                        this.f145166o.addAll(function.f145148p);
                    }
                }
                if (function.F0()) {
                    M(function.s0());
                }
                if (!function.f145150r.isEmpty()) {
                    if (this.f145168q.isEmpty()) {
                        this.f145168q = function.f145150r;
                        this.f145155d &= -4097;
                    } else {
                        F();
                        this.f145168q.addAll(function.f145150r);
                    }
                }
                if (function.x0()) {
                    H(function.e0());
                }
                if (!function.f145152t.isEmpty()) {
                    if (this.f145170s.isEmpty()) {
                        this.f145170s = function.f145152t;
                        this.f145155d &= -16385;
                    } else {
                        z();
                        this.f145170s.addAll(function.f145152t);
                    }
                }
                t(function);
                o(m().e(function.f145135c));
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
            this.f145137e = 6;
            this.f145138f = 6;
            this.f145139g = 0;
            this.f145140h = Type.Y();
            this.f145141i = 0;
            List list = Collections.EMPTY_LIST;
            this.f145142j = list;
            this.f145143k = Type.Y();
            this.f145144l = 0;
            this.f145145m = list;
            this.f145146n = list;
            this.f145148p = list;
            this.f145149q = TypeTable.x();
            this.f145150r = list;
            this.f145151s = Contract.u();
            this.f145152t = list;
        }

        static {
            Function function = new Function(true);
            f145133w = function;
            function.G0();
        }

        public static Function K0(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return f145134x.a(inputStream, extensionRegistryLite);
        }

        public static Function f0() {
            return f145133w;
        }

        public boolean A0() {
            return (this.f145136d & 2) == 2;
        }

        public boolean B0() {
            return (this.f145136d & 32) == 32;
        }

        public boolean C0() {
            return (this.f145136d & 64) == 64;
        }

        public boolean D0() {
            return (this.f145136d & 8) == 8;
        }

        public boolean E0() {
            return (this.f145136d & 16) == 16;
        }

        public boolean F0() {
            return (this.f145136d & 128) == 128;
        }

        public CompilerPluginData Y(int i10) {
            return this.f145152t.get(i10);
        }

        public int Z() {
            return this.f145152t.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145153u;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!z0()) {
                this.f145153u = (byte) 0;
                return false;
            }
            if (D0() && !m0().a()) {
                this.f145153u = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < p0(); i10++) {
                if (!o0(i10).a()) {
                    this.f145153u = (byte) 0;
                    return false;
                }
            }
            if (B0() && !k0().a()) {
                this.f145153u = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < b0(); i11++) {
                if (!a0(i11).a()) {
                    this.f145153u = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < u0(); i12++) {
                if (!t0(i12).a()) {
                    this.f145153u = (byte) 0;
                    return false;
                }
            }
            if (F0() && !s0().a()) {
                this.f145153u = (byte) 0;
                return false;
            }
            if (x0() && !e0().a()) {
                this.f145153u = (byte) 0;
                return false;
            }
            for (int i13 = 0; i13 < Z(); i13++) {
                if (!Y(i13).a()) {
                    this.f145153u = (byte) 0;
                    return false;
                }
            }
            if (s()) {
                this.f145153u = (byte) 1;
                return true;
            }
            this.f145153u = (byte) 0;
            return false;
        }

        public Type a0(int i10) {
            return this.f145145m.get(i10);
        }

        public int b0() {
            return this.f145145m.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145154v;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145136d & 2) == 2 ? CodedOutputStream.o(1, this.f145138f) : 0;
            if ((this.f145136d & 4) == 4) {
                iO += CodedOutputStream.o(2, this.f145139g);
            }
            if ((this.f145136d & 8) == 8) {
                iO += CodedOutputStream.s(3, this.f145140h);
            }
            for (int i11 = 0; i11 < this.f145142j.size(); i11++) {
                iO += CodedOutputStream.s(4, this.f145142j.get(i11));
            }
            if ((this.f145136d & 32) == 32) {
                iO += CodedOutputStream.s(5, this.f145143k);
            }
            for (int i12 = 0; i12 < this.f145148p.size(); i12++) {
                iO += CodedOutputStream.s(6, this.f145148p.get(i12));
            }
            if ((this.f145136d & 16) == 16) {
                iO += CodedOutputStream.o(7, this.f145141i);
            }
            if ((this.f145136d & 64) == 64) {
                iO += CodedOutputStream.o(8, this.f145144l);
            }
            if ((this.f145136d & 1) == 1) {
                iO += CodedOutputStream.o(9, this.f145137e);
            }
            for (int i13 = 0; i13 < this.f145145m.size(); i13++) {
                iO += CodedOutputStream.s(10, this.f145145m.get(i13));
            }
            int iP = 0;
            for (int i14 = 0; i14 < this.f145146n.size(); i14++) {
                iP += CodedOutputStream.p(this.f145146n.get(i14).intValue());
            }
            int iS = iO + iP;
            if (!c0().isEmpty()) {
                iS = iS + 1 + CodedOutputStream.p(iP);
            }
            this.f145147o = iP;
            if ((this.f145136d & 128) == 128) {
                iS += CodedOutputStream.s(30, this.f145149q);
            }
            int iP2 = 0;
            for (int i15 = 0; i15 < this.f145150r.size(); i15++) {
                iP2 += CodedOutputStream.p(this.f145150r.get(i15).intValue());
            }
            int size = iS + iP2 + (w0().size() * 2);
            if ((this.f145136d & 256) == 256) {
                size += CodedOutputStream.s(32, this.f145151s);
            }
            for (int i16 = 0; i16 < this.f145152t.size(); i16++) {
                size += CodedOutputStream.s(33, this.f145152t.get(i16));
            }
            int iT = size + t() + this.f145135c.size();
            this.f145154v = iT;
            return iT;
        }

        public List<Integer> c0() {
            return this.f145146n;
        }

        public List<Type> d0() {
            return this.f145145m;
        }

        public Contract e0() {
            return this.f145151s;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Function> f() {
            return f145134x;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: g0, reason: merged with bridge method [inline-methods] */
        public Function e() {
            return f145133w;
        }

        public int h0() {
            return this.f145137e;
        }

        public int i0() {
            return this.f145139g;
        }

        public int j0() {
            return this.f145138f;
        }

        public Type k0() {
            return this.f145143k;
        }

        public int l0() {
            return this.f145144l;
        }

        public Type m0() {
            return this.f145140h;
        }

        public int n0() {
            return this.f145141i;
        }

        public TypeParameter o0(int i10) {
            return this.f145142j.get(i10);
        }

        public int p0() {
            return this.f145142j.size();
        }

        public List<TypeParameter> r0() {
            return this.f145142j;
        }

        public TypeTable s0() {
            return this.f145149q;
        }

        public ValueParameter t0(int i10) {
            return this.f145148p.get(i10);
        }

        public int u0() {
            return this.f145148p.size();
        }

        public List<ValueParameter> v0() {
            return this.f145148p;
        }

        public List<Integer> w0() {
            return this.f145150r;
        }

        public boolean x0() {
            return (this.f145136d & 256) == 256;
        }

        public boolean y0() {
            return (this.f145136d & 1) == 1;
        }

        public boolean z0() {
            return (this.f145136d & 4) == 4;
        }

        private Function(GeneratedMessageLite.ExtendableBuilder<Function, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f145147o = -1;
            this.f145153u = (byte) -1;
            this.f145154v = -1;
            this.f145135c = extendableBuilder.m();
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
            if ((this.f145136d & 2) == 2) {
                codedOutputStream.a0(1, this.f145138f);
            }
            if ((this.f145136d & 4) == 4) {
                codedOutputStream.a0(2, this.f145139g);
            }
            if ((this.f145136d & 8) == 8) {
                codedOutputStream.d0(3, this.f145140h);
            }
            for (int i10 = 0; i10 < this.f145142j.size(); i10++) {
                codedOutputStream.d0(4, this.f145142j.get(i10));
            }
            if ((this.f145136d & 32) == 32) {
                codedOutputStream.d0(5, this.f145143k);
            }
            for (int i11 = 0; i11 < this.f145148p.size(); i11++) {
                codedOutputStream.d0(6, this.f145148p.get(i11));
            }
            if ((this.f145136d & 16) == 16) {
                codedOutputStream.a0(7, this.f145141i);
            }
            if ((this.f145136d & 64) == 64) {
                codedOutputStream.a0(8, this.f145144l);
            }
            if ((this.f145136d & 1) == 1) {
                codedOutputStream.a0(9, this.f145137e);
            }
            for (int i12 = 0; i12 < this.f145145m.size(); i12++) {
                codedOutputStream.d0(10, this.f145145m.get(i12));
            }
            if (c0().size() > 0) {
                codedOutputStream.o0(90);
                codedOutputStream.o0(this.f145147o);
            }
            for (int i13 = 0; i13 < this.f145146n.size(); i13++) {
                codedOutputStream.b0(this.f145146n.get(i13).intValue());
            }
            if ((this.f145136d & 128) == 128) {
                codedOutputStream.d0(30, this.f145149q);
            }
            for (int i14 = 0; i14 < this.f145150r.size(); i14++) {
                codedOutputStream.a0(31, this.f145150r.get(i14).intValue());
            }
            if ((this.f145136d & 256) == 256) {
                codedOutputStream.d0(32, this.f145151s);
            }
            for (int i15 = 0; i15 < this.f145152t.size(); i15++) {
                codedOutputStream.d0(33, this.f145152t.get(i15));
            }
            extensionWriterZ.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f145135c);
        }

        private Function(boolean z10) {
            this.f145147o = -1;
            this.f145153u = (byte) -1;
            this.f145154v = -1;
            this.f145135c = ByteString.f145819a;
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
            this.f145147o = -1;
            this.f145153u = (byte) -1;
            this.f145154v = -1;
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
                                    this.f145136d |= 2;
                                    this.f145138f = codedInputStream.s();
                                    z11 = z10;
                                    c10 = c10;
                                case 16:
                                    z10 = z11;
                                    this.f145136d |= 4;
                                    this.f145139g = codedInputStream.s();
                                    z11 = z10;
                                    c10 = c10;
                                case 26:
                                    z10 = z11;
                                    Type.Builder builderB = (this.f145136d & 8) == 8 ? this.f145140h.b() : null;
                                    Type type = (Type) codedInputStream.u(Type.f145291v, extensionRegistryLite);
                                    this.f145140h = type;
                                    if (builderB != null) {
                                        builderB.n(type);
                                        this.f145140h = builderB.w();
                                    }
                                    this.f145136d |= 8;
                                    z11 = z10;
                                    c10 = c10;
                                case 34:
                                    z10 = z11;
                                    int i10 = (c10 == true ? 1 : 0) & 32;
                                    c10 = c10;
                                    if (i10 != 32) {
                                        this.f145142j = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | ' ';
                                    }
                                    this.f145142j.add(codedInputStream.u(TypeParameter.f145373o, extensionRegistryLite));
                                    z11 = z10;
                                    c10 = c10;
                                case 42:
                                    z10 = z11;
                                    Type.Builder builderB2 = (this.f145136d & 32) == 32 ? this.f145143k.b() : null;
                                    Type type2 = (Type) codedInputStream.u(Type.f145291v, extensionRegistryLite);
                                    this.f145143k = type2;
                                    if (builderB2 != null) {
                                        builderB2.n(type2);
                                        this.f145143k = builderB2.w();
                                    }
                                    this.f145136d |= 32;
                                    z11 = z10;
                                    c10 = c10;
                                case 50:
                                    z10 = z11;
                                    int i11 = (c10 == true ? 1 : 0) & 1024;
                                    c10 = c10;
                                    if (i11 != 1024) {
                                        this.f145148p = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 1024;
                                    }
                                    this.f145148p.add(codedInputStream.u(ValueParameter.f145410n, extensionRegistryLite));
                                    z11 = z10;
                                    c10 = c10;
                                case 56:
                                    z10 = z11;
                                    this.f145136d |= 16;
                                    this.f145141i = codedInputStream.s();
                                    z11 = z10;
                                    c10 = c10;
                                case 64:
                                    z10 = z11;
                                    this.f145136d |= 64;
                                    this.f145144l = codedInputStream.s();
                                    z11 = z10;
                                    c10 = c10;
                                case 72:
                                    z10 = z11;
                                    this.f145136d |= 1;
                                    this.f145137e = codedInputStream.s();
                                    z11 = z10;
                                    c10 = c10;
                                case 82:
                                    z10 = z11;
                                    int i12 = (c10 == true ? 1 : 0) & 256;
                                    c10 = c10;
                                    if (i12 != 256) {
                                        this.f145145m = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 256;
                                    }
                                    this.f145145m.add(codedInputStream.u(Type.f145291v, extensionRegistryLite));
                                    z11 = z10;
                                    c10 = c10;
                                case 88:
                                    z10 = z11;
                                    int i13 = (c10 == true ? 1 : 0) & 512;
                                    c10 = c10;
                                    if (i13 != 512) {
                                        this.f145146n = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 512;
                                    }
                                    this.f145146n.add(Integer.valueOf(codedInputStream.s()));
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
                                            this.f145146n = new ArrayList();
                                            c10 = (c10 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (codedInputStream.e() > 0) {
                                        this.f145146n.add(Integer.valueOf(codedInputStream.s()));
                                    }
                                    codedInputStream.i(iJ);
                                    z11 = z10;
                                    c10 = c10;
                                case 242:
                                    z10 = z11;
                                    TypeTable.Builder builderB3 = (this.f145136d & 128) == 128 ? this.f145149q.b() : null;
                                    TypeTable typeTable = (TypeTable) codedInputStream.u(TypeTable.f145399i, extensionRegistryLite);
                                    this.f145149q = typeTable;
                                    if (builderB3 != null) {
                                        builderB3.n(typeTable);
                                        this.f145149q = builderB3.r();
                                    }
                                    this.f145136d |= 128;
                                    z11 = z10;
                                    c10 = c10;
                                case 248:
                                    z10 = z11;
                                    int i15 = (c10 == true ? 1 : 0) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                                    c10 = c10;
                                    if (i15 != 4096) {
                                        this.f145150r = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 4096;
                                    }
                                    this.f145150r.add(Integer.valueOf(codedInputStream.s()));
                                    z11 = z10;
                                    c10 = c10;
                                case 250:
                                    int iJ2 = codedInputStream.j(codedInputStream.A());
                                    int i16 = (c10 == true ? 1 : 0) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                                    c10 = c10;
                                    if (i16 != 4096) {
                                        c10 = c10;
                                        if (codedInputStream.e() > 0) {
                                            this.f145150r = new ArrayList();
                                            c10 = (c10 == true ? 1 : 0) | 4096;
                                        }
                                    }
                                    while (codedInputStream.e() > 0) {
                                        this.f145150r.add(Integer.valueOf(codedInputStream.s()));
                                        z11 = z11;
                                    }
                                    z10 = z11;
                                    codedInputStream.i(iJ2);
                                    z11 = z10;
                                    c10 = c10;
                                case 258:
                                    Contract.Builder builderB4 = (this.f145136d & 256) == 256 ? this.f145151s.b() : null;
                                    Contract contract = (Contract) codedInputStream.u(Contract.f145063g, extensionRegistryLite);
                                    this.f145151s = contract;
                                    if (builderB4 != null) {
                                        builderB4.n(contract);
                                        this.f145151s = builderB4.r();
                                    }
                                    this.f145136d |= 256;
                                    c10 = c10;
                                    z10 = z11;
                                    z11 = z10;
                                    c10 = c10;
                                case 266:
                                    int i17 = (c10 == true ? 1 : 0) & 16384;
                                    char c11 = c10;
                                    if (i17 != 16384) {
                                        this.f145152t = new ArrayList();
                                        c11 = (c10 == true ? 1 : 0) | 16384;
                                    }
                                    this.f145152t.add(codedInputStream.u(CompilerPluginData.f145037i, extensionRegistryLite));
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
                                this.f145142j = Collections.unmodifiableList(this.f145142j);
                            }
                            if (((c10 == true ? 1 : 0) & 1024) == P10) {
                                this.f145148p = Collections.unmodifiableList(this.f145148p);
                            }
                            if (((c10 == true ? 1 : 0) & 256) == 256) {
                                this.f145145m = Collections.unmodifiableList(this.f145145m);
                            }
                            if (((c10 == true ? 1 : 0) & 512) == 512) {
                                this.f145146n = Collections.unmodifiableList(this.f145146n);
                            }
                            if (((c10 == true ? 1 : 0) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                                this.f145150r = Collections.unmodifiableList(this.f145150r);
                            }
                            if (((c10 == true ? 1 : 0) & 16384) == 16384) {
                                this.f145152t = Collections.unmodifiableList(this.f145152t);
                            }
                            try {
                                codedOutputStreamJ.I();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f145135c = outputT.g();
                                throw th3;
                            }
                            this.f145135c = outputT.g();
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
                        this.f145142j = Collections.unmodifiableList(this.f145142j);
                    }
                    if (((c10 == true ? 1 : 0) & 1024) == 1024) {
                        this.f145148p = Collections.unmodifiableList(this.f145148p);
                    }
                    if (((c10 == true ? 1 : 0) & 256) == 256) {
                        this.f145145m = Collections.unmodifiableList(this.f145145m);
                    }
                    if (((c10 == true ? 1 : 0) & 512) == 512) {
                        this.f145146n = Collections.unmodifiableList(this.f145146n);
                    }
                    if (((c10 == true ? 1 : 0) & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                        this.f145150r = Collections.unmodifiableList(this.f145150r);
                    }
                    if (((c10 == true ? 1 : 0) & 16384) == 16384) {
                        this.f145152t = Collections.unmodifiableList(this.f145152t);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        this.f145135c = outputT.g();
                        throw th4;
                    }
                    this.f145135c = outputT.g();
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
        private static Internal.EnumLiteMap<MemberKind> f145175f = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f145177a;

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
            return this.f145177a;
        }

        MemberKind(int i10, int i11) {
            this.f145177a = i11;
        }
    }

    public enum Modality implements Internal.EnumLite {
        FINAL(0, 0),
        OPEN(1, 1),
        ABSTRACT(2, 2),
        SEALED(3, 3);


        /* renamed from: f, reason: collision with root package name */
        private static Internal.EnumLiteMap<Modality> f145182f = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f145184a;

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
            return this.f145184a;
        }

        Modality(int i10, int i11) {
            this.f145184a = i11;
        }
    }

    public static final class Package extends GeneratedMessageLite.ExtendableMessage<Package> implements PackageOrBuilder {

        /* renamed from: l, reason: collision with root package name */
        private static final Package f145185l;

        /* renamed from: m, reason: collision with root package name */
        public static Parser<Package> f145186m = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f145187c;

        /* renamed from: d, reason: collision with root package name */
        private int f145188d;

        /* renamed from: e, reason: collision with root package name */
        private List<Function> f145189e;

        /* renamed from: f, reason: collision with root package name */
        private List<Property> f145190f;

        /* renamed from: g, reason: collision with root package name */
        private List<TypeAlias> f145191g;

        /* renamed from: h, reason: collision with root package name */
        private TypeTable f145192h;

        /* renamed from: i, reason: collision with root package name */
        private VersionRequirementTable f145193i;

        /* renamed from: j, reason: collision with root package name */
        private byte f145194j;

        /* renamed from: k, reason: collision with root package name */
        private int f145195k;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Package, Builder> implements PackageOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f145196d;

            /* renamed from: e, reason: collision with root package name */
            private List<Function> f145197e;

            /* renamed from: f, reason: collision with root package name */
            private List<Property> f145198f;

            /* renamed from: g, reason: collision with root package name */
            private List<TypeAlias> f145199g;

            /* renamed from: h, reason: collision with root package name */
            private TypeTable f145200h;

            /* renamed from: i, reason: collision with root package name */
            private VersionRequirementTable f145201i;

            private void D() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.f145186m     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$Builder");
            }

            private void A() {
                if ((this.f145196d & 2) != 2) {
                    this.f145198f = new ArrayList(this.f145198f);
                    this.f145196d |= 2;
                }
            }

            private void C() {
                if ((this.f145196d & 4) != 4) {
                    this.f145199g = new ArrayList(this.f145199g);
                    this.f145196d |= 4;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f145196d & 1) != 1) {
                    this.f145197e = new ArrayList(this.f145197e);
                    this.f145196d |= 1;
                }
            }

            public Builder G(TypeTable typeTable) {
                if ((this.f145196d & 8) != 8 || this.f145200h == TypeTable.x()) {
                    this.f145200h = typeTable;
                } else {
                    this.f145200h = TypeTable.F(this.f145200h).n(typeTable).r();
                }
                this.f145196d |= 8;
                return this;
            }

            public Builder H(VersionRequirementTable versionRequirementTable) {
                if ((this.f145196d & 16) != 16 || this.f145201i == VersionRequirementTable.u()) {
                    this.f145201i = versionRequirementTable;
                } else {
                    this.f145201i = VersionRequirementTable.A(this.f145201i).n(versionRequirementTable).r();
                }
                this.f145196d |= 16;
                return this;
            }

            public Package w() {
                Package r02 = new Package(this);
                int i10 = this.f145196d;
                if ((i10 & 1) == 1) {
                    this.f145197e = Collections.unmodifiableList(this.f145197e);
                    this.f145196d &= -2;
                }
                r02.f145189e = this.f145197e;
                if ((this.f145196d & 2) == 2) {
                    this.f145198f = Collections.unmodifiableList(this.f145198f);
                    this.f145196d &= -3;
                }
                r02.f145190f = this.f145198f;
                if ((this.f145196d & 4) == 4) {
                    this.f145199g = Collections.unmodifiableList(this.f145199g);
                    this.f145196d &= -5;
                }
                r02.f145191g = this.f145199g;
                int i11 = (i10 & 8) != 8 ? 0 : 1;
                r02.f145192h = this.f145200h;
                if ((i10 & 16) == 16) {
                    i11 |= 2;
                }
                r02.f145193i = this.f145201i;
                r02.f145188d = i11;
                return r02;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f145197e = list;
                this.f145198f = list;
                this.f145199g = list;
                this.f145200h = TypeTable.x();
                this.f145201i = VersionRequirementTable.u();
                D();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            public Builder n(Package r32) {
                if (r32 == Package.L()) {
                    return this;
                }
                if (!r32.f145189e.isEmpty()) {
                    if (this.f145197e.isEmpty()) {
                        this.f145197e = r32.f145189e;
                        this.f145196d &= -2;
                    } else {
                        z();
                        this.f145197e.addAll(r32.f145189e);
                    }
                }
                if (!r32.f145190f.isEmpty()) {
                    if (this.f145198f.isEmpty()) {
                        this.f145198f = r32.f145190f;
                        this.f145196d &= -3;
                    } else {
                        A();
                        this.f145198f.addAll(r32.f145190f);
                    }
                }
                if (!r32.f145191g.isEmpty()) {
                    if (this.f145199g.isEmpty()) {
                        this.f145199g = r32.f145191g;
                        this.f145196d &= -5;
                    } else {
                        C();
                        this.f145199g.addAll(r32.f145191g);
                    }
                }
                if (r32.Y()) {
                    G(r32.W());
                }
                if (r32.Z()) {
                    H(r32.X());
                }
                t(r32);
                o(m().e(r32.f145187c));
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
            f145185l = r02;
            r02.a0();
        }

        public static Package L() {
            return f145185l;
        }

        private void a0() {
            List list = Collections.EMPTY_LIST;
            this.f145189e = list;
            this.f145190f = list;
            this.f145191g = list;
            this.f145192h = TypeTable.x();
            this.f145193i = VersionRequirementTable.u();
        }

        public static Package e0(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return f145186m.a(inputStream, extensionRegistryLite);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public Package e() {
            return f145185l;
        }

        public Function N(int i10) {
            return this.f145189e.get(i10);
        }

        public int O() {
            return this.f145189e.size();
        }

        public List<Function> P() {
            return this.f145189e;
        }

        public Property Q(int i10) {
            return this.f145190f.get(i10);
        }

        public int R() {
            return this.f145190f.size();
        }

        public List<Property> S() {
            return this.f145190f;
        }

        public TypeAlias T(int i10) {
            return this.f145191g.get(i10);
        }

        public int U() {
            return this.f145191g.size();
        }

        public List<TypeAlias> V() {
            return this.f145191g;
        }

        public TypeTable W() {
            return this.f145192h;
        }

        public VersionRequirementTable X() {
            return this.f145193i;
        }

        public boolean Y() {
            return (this.f145188d & 1) == 1;
        }

        public boolean Z() {
            return (this.f145188d & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145194j;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < O(); i10++) {
                if (!N(i10).a()) {
                    this.f145194j = (byte) 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < R(); i11++) {
                if (!Q(i11).a()) {
                    this.f145194j = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < U(); i12++) {
                if (!T(i12).a()) {
                    this.f145194j = (byte) 0;
                    return false;
                }
            }
            if (Y() && !W().a()) {
                this.f145194j = (byte) 0;
                return false;
            }
            if (s()) {
                this.f145194j = (byte) 1;
                return true;
            }
            this.f145194j = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145195k;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f145189e.size(); i11++) {
                iS += CodedOutputStream.s(3, this.f145189e.get(i11));
            }
            for (int i12 = 0; i12 < this.f145190f.size(); i12++) {
                iS += CodedOutputStream.s(4, this.f145190f.get(i12));
            }
            for (int i13 = 0; i13 < this.f145191g.size(); i13++) {
                iS += CodedOutputStream.s(5, this.f145191g.get(i13));
            }
            if ((this.f145188d & 1) == 1) {
                iS += CodedOutputStream.s(30, this.f145192h);
            }
            if ((this.f145188d & 2) == 2) {
                iS += CodedOutputStream.s(32, this.f145193i);
            }
            int iT = iS + t() + this.f145187c.size();
            this.f145195k = iT;
            return iT;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Package> f() {
            return f145186m;
        }

        private Package(GeneratedMessageLite.ExtendableBuilder<Package, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f145194j = (byte) -1;
            this.f145195k = -1;
            this.f145187c = extendableBuilder.m();
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
            for (int i10 = 0; i10 < this.f145189e.size(); i10++) {
                codedOutputStream.d0(3, this.f145189e.get(i10));
            }
            for (int i11 = 0; i11 < this.f145190f.size(); i11++) {
                codedOutputStream.d0(4, this.f145190f.get(i11));
            }
            for (int i12 = 0; i12 < this.f145191g.size(); i12++) {
                codedOutputStream.d0(5, this.f145191g.get(i12));
            }
            if ((this.f145188d & 1) == 1) {
                codedOutputStream.d0(30, this.f145192h);
            }
            if ((this.f145188d & 2) == 2) {
                codedOutputStream.d0(32, this.f145193i);
            }
            extensionWriterZ.a(HttpResponseStatus.SUCCESS_OK, codedOutputStream);
            codedOutputStream.i0(this.f145187c);
        }

        private Package(boolean z10) {
            this.f145194j = (byte) -1;
            this.f145195k = -1;
            this.f145187c = ByteString.f145819a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4 */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r4v8 */
        private Package(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145194j = (byte) -1;
            this.f145195k = -1;
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
                                    this.f145189e = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 1;
                                }
                                this.f145189e.add(codedInputStream.u(Function.f145134x, extensionRegistryLite));
                            } else if (iK == 34) {
                                int i11 = (c10 == true ? 1 : 0) & 2;
                                c10 = c10;
                                if (i11 != 2) {
                                    this.f145190f = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 2;
                                }
                                this.f145190f.add(codedInputStream.u(Property.f145218x, extensionRegistryLite));
                            } else if (iK != 42) {
                                if (iK == 242) {
                                    TypeTable.Builder builderB = (this.f145188d & 1) == 1 ? this.f145192h.b() : null;
                                    TypeTable typeTable = (TypeTable) codedInputStream.u(TypeTable.f145399i, extensionRegistryLite);
                                    this.f145192h = typeTable;
                                    if (builderB != null) {
                                        builderB.n(typeTable);
                                        this.f145192h = builderB.r();
                                    }
                                    this.f145188d |= 1;
                                } else if (iK != 258) {
                                    if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                    }
                                } else {
                                    VersionRequirementTable.Builder builderB2 = (this.f145188d & 2) == 2 ? this.f145193i.b() : null;
                                    VersionRequirementTable versionRequirementTable = (VersionRequirementTable) codedInputStream.u(VersionRequirementTable.f145460g, extensionRegistryLite);
                                    this.f145193i = versionRequirementTable;
                                    if (builderB2 != null) {
                                        builderB2.n(versionRequirementTable);
                                        this.f145193i = builderB2.r();
                                    }
                                    this.f145188d |= 2;
                                }
                            } else {
                                int i12 = (c10 == true ? 1 : 0) & 4;
                                c10 = c10;
                                if (i12 != 4) {
                                    this.f145191g = new ArrayList();
                                    c10 = (c10 == true ? 1 : 0) | 4;
                                }
                                this.f145191g.add(codedInputStream.u(TypeAlias.f145346r, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (((c10 == true ? 1 : 0) & 1) == 1) {
                            this.f145189e = Collections.unmodifiableList(this.f145189e);
                        }
                        if (((c10 == true ? 1 : 0) & 2) == 2) {
                            this.f145190f = Collections.unmodifiableList(this.f145190f);
                        }
                        if (((c10 == true ? 1 : 0) & 4) == 4) {
                            this.f145191g = Collections.unmodifiableList(this.f145191g);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145187c = outputT.g();
                            throw th3;
                        }
                        this.f145187c = outputT.g();
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
                this.f145189e = Collections.unmodifiableList(this.f145189e);
            }
            if (((c10 == true ? 1 : 0) & 2) == 2) {
                this.f145190f = Collections.unmodifiableList(this.f145190f);
            }
            if (((c10 == true ? 1 : 0) & 4) == 4) {
                this.f145191g = Collections.unmodifiableList(this.f145191g);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145187c = outputT.g();
                throw th4;
            }
            this.f145187c = outputT.g();
            m();
        }
    }

    public static final class PackageFragment extends GeneratedMessageLite.ExtendableMessage<PackageFragment> implements PackageFragmentOrBuilder {

        /* renamed from: k, reason: collision with root package name */
        private static final PackageFragment f145202k;

        /* renamed from: l, reason: collision with root package name */
        public static Parser<PackageFragment> f145203l = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f145204c;

        /* renamed from: d, reason: collision with root package name */
        private int f145205d;

        /* renamed from: e, reason: collision with root package name */
        private StringTable f145206e;

        /* renamed from: f, reason: collision with root package name */
        private QualifiedNameTable f145207f;

        /* renamed from: g, reason: collision with root package name */
        private Package f145208g;

        /* renamed from: h, reason: collision with root package name */
        private List<Class> f145209h;

        /* renamed from: i, reason: collision with root package name */
        private byte f145210i;

        /* renamed from: j, reason: collision with root package name */
        private int f145211j;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<PackageFragment, Builder> implements PackageFragmentOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f145212d;

            /* renamed from: e, reason: collision with root package name */
            private StringTable f145213e = StringTable.u();

            /* renamed from: f, reason: collision with root package name */
            private QualifiedNameTable f145214f = QualifiedNameTable.u();

            /* renamed from: g, reason: collision with root package name */
            private Package f145215g = Package.L();

            /* renamed from: h, reason: collision with root package name */
            private List<Class> f145216h = Collections.EMPTY_LIST;

            private void A() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.f145203l     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.PackageFragment.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f145212d & 8) != 8) {
                    this.f145216h = new ArrayList(this.f145216h);
                    this.f145212d |= 8;
                }
            }

            public Builder E(Package r42) {
                if ((this.f145212d & 4) != 4 || this.f145215g == Package.L()) {
                    this.f145215g = r42;
                } else {
                    this.f145215g = Package.c0(this.f145215g).n(r42).w();
                }
                this.f145212d |= 4;
                return this;
            }

            public Builder F(QualifiedNameTable qualifiedNameTable) {
                if ((this.f145212d & 2) != 2 || this.f145214f == QualifiedNameTable.u()) {
                    this.f145214f = qualifiedNameTable;
                } else {
                    this.f145214f = QualifiedNameTable.A(this.f145214f).n(qualifiedNameTable).r();
                }
                this.f145212d |= 2;
                return this;
            }

            public Builder G(StringTable stringTable) {
                if ((this.f145212d & 1) != 1 || this.f145213e == StringTable.u()) {
                    this.f145213e = stringTable;
                } else {
                    this.f145213e = StringTable.A(this.f145213e).n(stringTable).r();
                }
                this.f145212d |= 1;
                return this;
            }

            public PackageFragment w() {
                PackageFragment packageFragment = new PackageFragment(this);
                int i10 = this.f145212d;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                packageFragment.f145206e = this.f145213e;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                packageFragment.f145207f = this.f145214f;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                packageFragment.f145208g = this.f145215g;
                if ((this.f145212d & 8) == 8) {
                    this.f145216h = Collections.unmodifiableList(this.f145216h);
                    this.f145212d &= -9;
                }
                packageFragment.f145209h = this.f145216h;
                packageFragment.f145205d = i11;
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
                if (!packageFragment.f145209h.isEmpty()) {
                    if (this.f145216h.isEmpty()) {
                        this.f145216h = packageFragment.f145209h;
                        this.f145212d &= -9;
                    } else {
                        z();
                        this.f145216h.addAll(packageFragment.f145209h);
                    }
                }
                t(packageFragment);
                o(m().e(packageFragment.f145204c));
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
            f145202k = packageFragment;
            packageFragment.T();
        }

        public static PackageFragment L() {
            return f145202k;
        }

        public static PackageFragment X(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return f145203l.a(inputStream, extensionRegistryLite);
        }

        public Class I(int i10) {
            return this.f145209h.get(i10);
        }

        public int J() {
            return this.f145209h.size();
        }

        public List<Class> K() {
            return this.f145209h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public PackageFragment e() {
            return f145202k;
        }

        public Package N() {
            return this.f145208g;
        }

        public QualifiedNameTable O() {
            return this.f145207f;
        }

        public StringTable P() {
            return this.f145206e;
        }

        public boolean Q() {
            return (this.f145205d & 4) == 4;
        }

        public boolean R() {
            return (this.f145205d & 2) == 2;
        }

        public boolean S() {
            return (this.f145205d & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145210i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (R() && !O().a()) {
                this.f145210i = (byte) 0;
                return false;
            }
            if (Q() && !N().a()) {
                this.f145210i = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < J(); i10++) {
                if (!I(i10).a()) {
                    this.f145210i = (byte) 0;
                    return false;
                }
            }
            if (s()) {
                this.f145210i = (byte) 1;
                return true;
            }
            this.f145210i = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145211j;
            if (i10 != -1) {
                return i10;
            }
            int iS = (this.f145205d & 1) == 1 ? CodedOutputStream.s(1, this.f145206e) : 0;
            if ((this.f145205d & 2) == 2) {
                iS += CodedOutputStream.s(2, this.f145207f);
            }
            if ((this.f145205d & 4) == 4) {
                iS += CodedOutputStream.s(3, this.f145208g);
            }
            for (int i11 = 0; i11 < this.f145209h.size(); i11++) {
                iS += CodedOutputStream.s(4, this.f145209h.get(i11));
            }
            int iT = iS + t() + this.f145204c.size();
            this.f145211j = iT;
            return iT;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<PackageFragment> f() {
            return f145203l;
        }

        private PackageFragment(GeneratedMessageLite.ExtendableBuilder<PackageFragment, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f145210i = (byte) -1;
            this.f145211j = -1;
            this.f145204c = extendableBuilder.m();
        }

        private void T() {
            this.f145206e = StringTable.u();
            this.f145207f = QualifiedNameTable.u();
            this.f145208g = Package.L();
            this.f145209h = Collections.EMPTY_LIST;
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
            if ((this.f145205d & 1) == 1) {
                codedOutputStream.d0(1, this.f145206e);
            }
            if ((this.f145205d & 2) == 2) {
                codedOutputStream.d0(2, this.f145207f);
            }
            if ((this.f145205d & 4) == 4) {
                codedOutputStream.d0(3, this.f145208g);
            }
            for (int i10 = 0; i10 < this.f145209h.size(); i10++) {
                codedOutputStream.d0(4, this.f145209h.get(i10));
            }
            extensionWriterZ.a(HttpResponseStatus.SUCCESS_OK, codedOutputStream);
            codedOutputStream.i0(this.f145204c);
        }

        private PackageFragment(boolean z10) {
            this.f145210i = (byte) -1;
            this.f145211j = -1;
            this.f145204c = ByteString.f145819a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private PackageFragment(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145210i = (byte) -1;
            this.f145211j = -1;
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
                                StringTable.Builder builderB = (this.f145205d & 1) == 1 ? this.f145206e.b() : null;
                                StringTable stringTable = (StringTable) codedInputStream.u(StringTable.f145283g, extensionRegistryLite);
                                this.f145206e = stringTable;
                                if (builderB != null) {
                                    builderB.n(stringTable);
                                    this.f145206e = builderB.r();
                                }
                                this.f145205d |= 1;
                            } else if (iK == 18) {
                                QualifiedNameTable.Builder builderB2 = (this.f145205d & 2) == 2 ? this.f145207f.b() : null;
                                QualifiedNameTable qualifiedNameTable = (QualifiedNameTable) codedInputStream.u(QualifiedNameTable.f145256g, extensionRegistryLite);
                                this.f145207f = qualifiedNameTable;
                                if (builderB2 != null) {
                                    builderB2.n(qualifiedNameTable);
                                    this.f145207f = builderB2.r();
                                }
                                this.f145205d |= 2;
                            } else if (iK == 26) {
                                Package.Builder builderB3 = (this.f145205d & 4) == 4 ? this.f145208g.b() : null;
                                Package r62 = (Package) codedInputStream.u(Package.f145186m, extensionRegistryLite);
                                this.f145208g = r62;
                                if (builderB3 != null) {
                                    builderB3.n(r62);
                                    this.f145208g = builderB3.w();
                                }
                                this.f145205d |= 4;
                            } else if (iK != 34) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                int i10 = (c10 == true ? 1 : 0) & '\b';
                                c10 = c10;
                                if (i10 != 8) {
                                    this.f145209h = new ArrayList();
                                    c10 = '\b';
                                }
                                this.f145209h.add(codedInputStream.u(Class.f144964M, extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (((c10 == true ? 1 : 0) & '\b') == 8) {
                            this.f145209h = Collections.unmodifiableList(this.f145209h);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145204c = outputT.g();
                            throw th3;
                        }
                        this.f145204c = outputT.g();
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
                this.f145209h = Collections.unmodifiableList(this.f145209h);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145204c = outputT.g();
                throw th4;
            }
            this.f145204c = outputT.g();
            m();
        }
    }

    public interface PackageFragmentOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public interface PackageOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class Property extends GeneratedMessageLite.ExtendableMessage<Property> implements PropertyOrBuilder {

        /* renamed from: w, reason: collision with root package name */
        private static final Property f145217w;

        /* renamed from: x, reason: collision with root package name */
        public static Parser<Property> f145218x = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f145219c;

        /* renamed from: d, reason: collision with root package name */
        private int f145220d;

        /* renamed from: e, reason: collision with root package name */
        private int f145221e;

        /* renamed from: f, reason: collision with root package name */
        private int f145222f;

        /* renamed from: g, reason: collision with root package name */
        private int f145223g;

        /* renamed from: h, reason: collision with root package name */
        private Type f145224h;

        /* renamed from: i, reason: collision with root package name */
        private int f145225i;

        /* renamed from: j, reason: collision with root package name */
        private List<TypeParameter> f145226j;

        /* renamed from: k, reason: collision with root package name */
        private Type f145227k;

        /* renamed from: l, reason: collision with root package name */
        private int f145228l;

        /* renamed from: m, reason: collision with root package name */
        private List<Type> f145229m;

        /* renamed from: n, reason: collision with root package name */
        private List<Integer> f145230n;

        /* renamed from: o, reason: collision with root package name */
        private int f145231o;

        /* renamed from: p, reason: collision with root package name */
        private ValueParameter f145232p;

        /* renamed from: q, reason: collision with root package name */
        private int f145233q;

        /* renamed from: r, reason: collision with root package name */
        private int f145234r;

        /* renamed from: s, reason: collision with root package name */
        private List<Integer> f145235s;

        /* renamed from: t, reason: collision with root package name */
        private List<CompilerPluginData> f145236t;

        /* renamed from: u, reason: collision with root package name */
        private byte f145237u;

        /* renamed from: v, reason: collision with root package name */
        private int f145238v;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Property, Builder> implements PropertyOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f145239d;

            /* renamed from: g, reason: collision with root package name */
            private int f145242g;

            /* renamed from: i, reason: collision with root package name */
            private int f145244i;

            /* renamed from: j, reason: collision with root package name */
            private List<TypeParameter> f145245j;

            /* renamed from: k, reason: collision with root package name */
            private Type f145246k;

            /* renamed from: l, reason: collision with root package name */
            private int f145247l;

            /* renamed from: m, reason: collision with root package name */
            private List<Type> f145248m;

            /* renamed from: n, reason: collision with root package name */
            private List<Integer> f145249n;

            /* renamed from: o, reason: collision with root package name */
            private ValueParameter f145250o;

            /* renamed from: p, reason: collision with root package name */
            private int f145251p;

            /* renamed from: q, reason: collision with root package name */
            private int f145252q;

            /* renamed from: r, reason: collision with root package name */
            private List<Integer> f145253r;

            /* renamed from: s, reason: collision with root package name */
            private List<CompilerPluginData> f145254s;

            /* renamed from: e, reason: collision with root package name */
            private int f145240e = 518;

            /* renamed from: f, reason: collision with root package name */
            private int f145241f = 2054;

            /* renamed from: h, reason: collision with root package name */
            private Type f145243h = Type.Y();

            private void F() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: H, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.f145218x     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$Builder");
            }

            private void A() {
                if ((this.f145239d & 512) != 512) {
                    this.f145249n = new ArrayList(this.f145249n);
                    this.f145239d |= 512;
                }
            }

            private void C() {
                if ((this.f145239d & 256) != 256) {
                    this.f145248m = new ArrayList(this.f145248m);
                    this.f145239d |= 256;
                }
            }

            private void D() {
                if ((this.f145239d & 32) != 32) {
                    this.f145245j = new ArrayList(this.f145245j);
                    this.f145239d |= 32;
                }
            }

            private void E() {
                if ((this.f145239d & 8192) != 8192) {
                    this.f145253r = new ArrayList(this.f145253r);
                    this.f145239d |= 8192;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f145239d & 16384) != 16384) {
                    this.f145254s = new ArrayList(this.f145254s);
                    this.f145239d |= 16384;
                }
            }

            public Builder I(Type type) {
                if ((this.f145239d & 64) != 64 || this.f145246k == Type.Y()) {
                    this.f145246k = type;
                } else {
                    this.f145246k = Type.A0(this.f145246k).n(type).w();
                }
                this.f145239d |= 64;
                return this;
            }

            public Builder J(Type type) {
                if ((this.f145239d & 8) != 8 || this.f145243h == Type.Y()) {
                    this.f145243h = type;
                } else {
                    this.f145243h = Type.A0(this.f145243h).n(type).w();
                }
                this.f145239d |= 8;
                return this;
            }

            public Builder K(ValueParameter valueParameter) {
                if ((this.f145239d & 1024) != 1024 || this.f145250o == ValueParameter.J()) {
                    this.f145250o = valueParameter;
                } else {
                    this.f145250o = ValueParameter.Z(this.f145250o).n(valueParameter).w();
                }
                this.f145239d |= 1024;
                return this;
            }

            public Builder L(int i10) {
                this.f145239d |= 1;
                this.f145240e = i10;
                return this;
            }

            public Builder M(int i10) {
                this.f145239d |= RecyclerView.m.FLAG_MOVED;
                this.f145251p = i10;
                return this;
            }

            public Builder N(int i10) {
                this.f145239d |= 4;
                this.f145242g = i10;
                return this;
            }

            public Builder O(int i10) {
                this.f145239d |= 2;
                this.f145241f = i10;
                return this;
            }

            public Builder P(int i10) {
                this.f145239d |= 128;
                this.f145247l = i10;
                return this;
            }

            public Builder Q(int i10) {
                this.f145239d |= 16;
                this.f145244i = i10;
                return this;
            }

            public Builder R(int i10) {
                this.f145239d |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                this.f145252q = i10;
                return this;
            }

            public Property w() {
                Property property = new Property(this);
                int i10 = this.f145239d;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                property.f145221e = this.f145240e;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                property.f145222f = this.f145241f;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                property.f145223g = this.f145242g;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                property.f145224h = this.f145243h;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                property.f145225i = this.f145244i;
                if ((this.f145239d & 32) == 32) {
                    this.f145245j = Collections.unmodifiableList(this.f145245j);
                    this.f145239d &= -33;
                }
                property.f145226j = this.f145245j;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                property.f145227k = this.f145246k;
                if ((i10 & 128) == 128) {
                    i11 |= 64;
                }
                property.f145228l = this.f145247l;
                if ((this.f145239d & 256) == 256) {
                    this.f145248m = Collections.unmodifiableList(this.f145248m);
                    this.f145239d &= -257;
                }
                property.f145229m = this.f145248m;
                if ((this.f145239d & 512) == 512) {
                    this.f145249n = Collections.unmodifiableList(this.f145249n);
                    this.f145239d &= -513;
                }
                property.f145230n = this.f145249n;
                if ((i10 & 1024) == 1024) {
                    i11 |= 128;
                }
                property.f145232p = this.f145250o;
                if ((i10 & RecyclerView.m.FLAG_MOVED) == 2048) {
                    i11 |= 256;
                }
                property.f145233q = this.f145251p;
                if ((i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    i11 |= 512;
                }
                property.f145234r = this.f145252q;
                if ((this.f145239d & 8192) == 8192) {
                    this.f145253r = Collections.unmodifiableList(this.f145253r);
                    this.f145239d &= -8193;
                }
                property.f145235s = this.f145253r;
                if ((this.f145239d & 16384) == 16384) {
                    this.f145254s = Collections.unmodifiableList(this.f145254s);
                    this.f145239d &= -16385;
                }
                property.f145236t = this.f145254s;
                property.f145220d = i11;
                return property;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f145245j = list;
                this.f145246k = Type.Y();
                this.f145248m = list;
                this.f145249n = list;
                this.f145250o = ValueParameter.J();
                this.f145253r = list;
                this.f145254s = list;
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
                if (!property.f145226j.isEmpty()) {
                    if (this.f145245j.isEmpty()) {
                        this.f145245j = property.f145226j;
                        this.f145239d &= -33;
                    } else {
                        D();
                        this.f145245j.addAll(property.f145226j);
                    }
                }
                if (property.y0()) {
                    I(property.j0());
                }
                if (property.z0()) {
                    P(property.k0());
                }
                if (!property.f145229m.isEmpty()) {
                    if (this.f145248m.isEmpty()) {
                        this.f145248m = property.f145229m;
                        this.f145239d &= -257;
                    } else {
                        C();
                        this.f145248m.addAll(property.f145229m);
                    }
                }
                if (!property.f145230n.isEmpty()) {
                    if (this.f145249n.isEmpty()) {
                        this.f145249n = property.f145230n;
                        this.f145239d &= -513;
                    } else {
                        A();
                        this.f145249n.addAll(property.f145230n);
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
                if (!property.f145235s.isEmpty()) {
                    if (this.f145253r.isEmpty()) {
                        this.f145253r = property.f145235s;
                        this.f145239d &= -8193;
                    } else {
                        E();
                        this.f145253r.addAll(property.f145235s);
                    }
                }
                if (!property.f145236t.isEmpty()) {
                    if (this.f145254s.isEmpty()) {
                        this.f145254s = property.f145236t;
                        this.f145239d &= -16385;
                    } else {
                        z();
                        this.f145254s.addAll(property.f145236t);
                    }
                }
                t(property);
                o(m().e(property.f145219c));
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
            f145217w = property;
            property.E0();
        }

        private void E0() {
            this.f145221e = 518;
            this.f145222f = 2054;
            this.f145223g = 0;
            this.f145224h = Type.Y();
            this.f145225i = 0;
            List list = Collections.EMPTY_LIST;
            this.f145226j = list;
            this.f145227k = Type.Y();
            this.f145228l = 0;
            this.f145229m = list;
            this.f145230n = list;
            this.f145232p = ValueParameter.J();
            this.f145233q = 0;
            this.f145234r = 0;
            this.f145235s = list;
            this.f145236t = list;
        }

        public static Property d0() {
            return f145217w;
        }

        public boolean A0() {
            return (this.f145220d & 8) == 8;
        }

        public boolean B0() {
            return (this.f145220d & 16) == 16;
        }

        public boolean C0() {
            return (this.f145220d & 512) == 512;
        }

        public boolean D0() {
            return (this.f145220d & 128) == 128;
        }

        public CompilerPluginData X(int i10) {
            return this.f145236t.get(i10);
        }

        public int Y() {
            return this.f145236t.size();
        }

        public Type Z(int i10) {
            return this.f145229m.get(i10);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145237u;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!w0()) {
                this.f145237u = (byte) 0;
                return false;
            }
            if (A0() && !l0().a()) {
                this.f145237u = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < r0(); i10++) {
                if (!p0(i10).a()) {
                    this.f145237u = (byte) 0;
                    return false;
                }
            }
            if (y0() && !j0().a()) {
                this.f145237u = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < a0(); i11++) {
                if (!Z(i11).a()) {
                    this.f145237u = (byte) 0;
                    return false;
                }
            }
            if (D0() && !o0().a()) {
                this.f145237u = (byte) 0;
                return false;
            }
            for (int i12 = 0; i12 < Y(); i12++) {
                if (!X(i12).a()) {
                    this.f145237u = (byte) 0;
                    return false;
                }
            }
            if (s()) {
                this.f145237u = (byte) 1;
                return true;
            }
            this.f145237u = (byte) 0;
            return false;
        }

        public int a0() {
            return this.f145229m.size();
        }

        public List<Integer> b0() {
            return this.f145230n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145238v;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145220d & 2) == 2 ? CodedOutputStream.o(1, this.f145222f) : 0;
            if ((this.f145220d & 4) == 4) {
                iO += CodedOutputStream.o(2, this.f145223g);
            }
            if ((this.f145220d & 8) == 8) {
                iO += CodedOutputStream.s(3, this.f145224h);
            }
            for (int i11 = 0; i11 < this.f145226j.size(); i11++) {
                iO += CodedOutputStream.s(4, this.f145226j.get(i11));
            }
            if ((this.f145220d & 32) == 32) {
                iO += CodedOutputStream.s(5, this.f145227k);
            }
            if ((this.f145220d & 128) == 128) {
                iO += CodedOutputStream.s(6, this.f145232p);
            }
            if ((this.f145220d & 256) == 256) {
                iO += CodedOutputStream.o(7, this.f145233q);
            }
            if ((this.f145220d & 512) == 512) {
                iO += CodedOutputStream.o(8, this.f145234r);
            }
            if ((this.f145220d & 16) == 16) {
                iO += CodedOutputStream.o(9, this.f145225i);
            }
            if ((this.f145220d & 64) == 64) {
                iO += CodedOutputStream.o(10, this.f145228l);
            }
            if ((this.f145220d & 1) == 1) {
                iO += CodedOutputStream.o(11, this.f145221e);
            }
            for (int i12 = 0; i12 < this.f145229m.size(); i12++) {
                iO += CodedOutputStream.s(12, this.f145229m.get(i12));
            }
            int iP = 0;
            for (int i13 = 0; i13 < this.f145230n.size(); i13++) {
                iP += CodedOutputStream.p(this.f145230n.get(i13).intValue());
            }
            int iP2 = iO + iP;
            if (!b0().isEmpty()) {
                iP2 = iP2 + 1 + CodedOutputStream.p(iP);
            }
            this.f145231o = iP;
            int iP3 = 0;
            for (int i14 = 0; i14 < this.f145235s.size(); i14++) {
                iP3 += CodedOutputStream.p(this.f145235s.get(i14).intValue());
            }
            int size = iP2 + iP3 + (t0().size() * 2);
            for (int i15 = 0; i15 < this.f145236t.size(); i15++) {
                size += CodedOutputStream.s(32, this.f145236t.get(i15));
            }
            int iT = size + t() + this.f145219c.size();
            this.f145238v = iT;
            return iT;
        }

        public List<Type> c0() {
            return this.f145229m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: e0, reason: merged with bridge method [inline-methods] */
        public Property e() {
            return f145217w;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Property> f() {
            return f145218x;
        }

        public int f0() {
            return this.f145221e;
        }

        public int g0() {
            return this.f145233q;
        }

        public int h0() {
            return this.f145223g;
        }

        public int i0() {
            return this.f145222f;
        }

        public Type j0() {
            return this.f145227k;
        }

        public int k0() {
            return this.f145228l;
        }

        public Type l0() {
            return this.f145224h;
        }

        public int m0() {
            return this.f145225i;
        }

        public int n0() {
            return this.f145234r;
        }

        public ValueParameter o0() {
            return this.f145232p;
        }

        public TypeParameter p0(int i10) {
            return this.f145226j.get(i10);
        }

        public int r0() {
            return this.f145226j.size();
        }

        public List<TypeParameter> s0() {
            return this.f145226j;
        }

        public List<Integer> t0() {
            return this.f145235s;
        }

        public boolean u0() {
            return (this.f145220d & 1) == 1;
        }

        public boolean v0() {
            return (this.f145220d & 256) == 256;
        }

        public boolean w0() {
            return (this.f145220d & 4) == 4;
        }

        public boolean x0() {
            return (this.f145220d & 2) == 2;
        }

        public boolean y0() {
            return (this.f145220d & 32) == 32;
        }

        public boolean z0() {
            return (this.f145220d & 64) == 64;
        }

        private Property(GeneratedMessageLite.ExtendableBuilder<Property, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f145231o = -1;
            this.f145237u = (byte) -1;
            this.f145238v = -1;
            this.f145219c = extendableBuilder.m();
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
            if ((this.f145220d & 2) == 2) {
                codedOutputStream.a0(1, this.f145222f);
            }
            if ((this.f145220d & 4) == 4) {
                codedOutputStream.a0(2, this.f145223g);
            }
            if ((this.f145220d & 8) == 8) {
                codedOutputStream.d0(3, this.f145224h);
            }
            for (int i10 = 0; i10 < this.f145226j.size(); i10++) {
                codedOutputStream.d0(4, this.f145226j.get(i10));
            }
            if ((this.f145220d & 32) == 32) {
                codedOutputStream.d0(5, this.f145227k);
            }
            if ((this.f145220d & 128) == 128) {
                codedOutputStream.d0(6, this.f145232p);
            }
            if ((this.f145220d & 256) == 256) {
                codedOutputStream.a0(7, this.f145233q);
            }
            if ((this.f145220d & 512) == 512) {
                codedOutputStream.a0(8, this.f145234r);
            }
            if ((this.f145220d & 16) == 16) {
                codedOutputStream.a0(9, this.f145225i);
            }
            if ((this.f145220d & 64) == 64) {
                codedOutputStream.a0(10, this.f145228l);
            }
            if ((this.f145220d & 1) == 1) {
                codedOutputStream.a0(11, this.f145221e);
            }
            for (int i11 = 0; i11 < this.f145229m.size(); i11++) {
                codedOutputStream.d0(12, this.f145229m.get(i11));
            }
            if (b0().size() > 0) {
                codedOutputStream.o0(106);
                codedOutputStream.o0(this.f145231o);
            }
            for (int i12 = 0; i12 < this.f145230n.size(); i12++) {
                codedOutputStream.b0(this.f145230n.get(i12).intValue());
            }
            for (int i13 = 0; i13 < this.f145235s.size(); i13++) {
                codedOutputStream.a0(31, this.f145235s.get(i13).intValue());
            }
            for (int i14 = 0; i14 < this.f145236t.size(); i14++) {
                codedOutputStream.d0(32, this.f145236t.get(i14));
            }
            extensionWriterZ.a(19000, codedOutputStream);
            codedOutputStream.i0(this.f145219c);
        }

        private Property(boolean z10) {
            this.f145231o = -1;
            this.f145237u = (byte) -1;
            this.f145238v = -1;
            this.f145219c = ByteString.f145819a;
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
            this.f145231o = -1;
            this.f145237u = (byte) -1;
            this.f145238v = -1;
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
                                    this.f145220d |= 2;
                                    this.f145222f = codedInputStream.s();
                                case 16:
                                    this.f145220d |= 4;
                                    this.f145223g = codedInputStream.s();
                                case 26:
                                    Type.Builder builderB = (this.f145220d & 8) == 8 ? this.f145224h.b() : null;
                                    Type type = (Type) codedInputStream.u(Type.f145291v, extensionRegistryLite);
                                    this.f145224h = type;
                                    if (builderB != null) {
                                        builderB.n(type);
                                        this.f145224h = builderB.w();
                                    }
                                    this.f145220d |= 8;
                                case 34:
                                    int i10 = (c10 == true ? 1 : 0) & 32;
                                    c10 = c10;
                                    if (i10 != 32) {
                                        this.f145226j = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | ' ';
                                    }
                                    this.f145226j.add(codedInputStream.u(TypeParameter.f145373o, extensionRegistryLite));
                                case 42:
                                    Type.Builder builderB2 = (this.f145220d & 32) == 32 ? this.f145227k.b() : null;
                                    Type type2 = (Type) codedInputStream.u(Type.f145291v, extensionRegistryLite);
                                    this.f145227k = type2;
                                    if (builderB2 != null) {
                                        builderB2.n(type2);
                                        this.f145227k = builderB2.w();
                                    }
                                    this.f145220d |= 32;
                                case 50:
                                    ValueParameter.Builder builderB3 = (this.f145220d & 128) == 128 ? this.f145232p.b() : null;
                                    ValueParameter valueParameter = (ValueParameter) codedInputStream.u(ValueParameter.f145410n, extensionRegistryLite);
                                    this.f145232p = valueParameter;
                                    if (builderB3 != null) {
                                        builderB3.n(valueParameter);
                                        this.f145232p = builderB3.w();
                                    }
                                    this.f145220d |= 128;
                                case 56:
                                    this.f145220d |= 256;
                                    this.f145233q = codedInputStream.s();
                                case 64:
                                    this.f145220d |= 512;
                                    this.f145234r = codedInputStream.s();
                                case 72:
                                    this.f145220d |= 16;
                                    this.f145225i = codedInputStream.s();
                                case BinsView.LABEL_WIDTH_DP /* 80 */:
                                    this.f145220d |= 64;
                                    this.f145228l = codedInputStream.s();
                                case 88:
                                    this.f145220d |= 1;
                                    this.f145221e = codedInputStream.s();
                                case 98:
                                    int i11 = (c10 == true ? 1 : 0) & 256;
                                    c10 = c10;
                                    if (i11 != 256) {
                                        this.f145229m = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 256;
                                    }
                                    this.f145229m.add(codedInputStream.u(Type.f145291v, extensionRegistryLite));
                                case 104:
                                    int i12 = (c10 == true ? 1 : 0) & 512;
                                    c10 = c10;
                                    if (i12 != 512) {
                                        this.f145230n = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 512;
                                    }
                                    this.f145230n.add(Integer.valueOf(codedInputStream.s()));
                                case 106:
                                    int iJ = codedInputStream.j(codedInputStream.A());
                                    int i13 = (c10 == true ? 1 : 0) & 512;
                                    c10 = c10;
                                    if (i13 != 512) {
                                        c10 = c10;
                                        if (codedInputStream.e() > 0) {
                                            this.f145230n = new ArrayList();
                                            c10 = (c10 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (codedInputStream.e() > 0) {
                                        this.f145230n.add(Integer.valueOf(codedInputStream.s()));
                                    }
                                    codedInputStream.i(iJ);
                                case 248:
                                    int i14 = (c10 == true ? 1 : 0) & 8192;
                                    c10 = c10;
                                    if (i14 != 8192) {
                                        this.f145235s = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 8192;
                                    }
                                    this.f145235s.add(Integer.valueOf(codedInputStream.s()));
                                case 250:
                                    int iJ2 = codedInputStream.j(codedInputStream.A());
                                    int i15 = (c10 == true ? 1 : 0) & 8192;
                                    c10 = c10;
                                    if (i15 != 8192) {
                                        c10 = c10;
                                        if (codedInputStream.e() > 0) {
                                            this.f145235s = new ArrayList();
                                            c10 = (c10 == true ? 1 : 0) | 8192;
                                        }
                                    }
                                    while (codedInputStream.e() > 0) {
                                        this.f145235s.add(Integer.valueOf(codedInputStream.s()));
                                    }
                                    codedInputStream.i(iJ2);
                                case 258:
                                    int i16 = (c10 == true ? 1 : 0) & 16384;
                                    c10 = c10;
                                    if (i16 != 16384) {
                                        this.f145236t = new ArrayList();
                                        c10 = (c10 == true ? 1 : 0) | 16384;
                                    }
                                    this.f145236t.add(codedInputStream.u(CompilerPluginData.f145037i, extensionRegistryLite));
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
                            this.f145226j = Collections.unmodifiableList(this.f145226j);
                        }
                        if (((c10 == true ? 1 : 0) & 256) == 256) {
                            this.f145229m = Collections.unmodifiableList(this.f145229m);
                        }
                        if (((c10 == true ? 1 : 0) & 512) == 512) {
                            this.f145230n = Collections.unmodifiableList(this.f145230n);
                        }
                        if (((c10 == true ? 1 : 0) & 8192) == 8192) {
                            this.f145235s = Collections.unmodifiableList(this.f145235s);
                        }
                        if (((c10 == true ? 1 : 0) & 16384) == P10) {
                            this.f145236t = Collections.unmodifiableList(this.f145236t);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145219c = outputT.g();
                            throw th3;
                        }
                        this.f145219c = outputT.g();
                        m();
                        throw th2;
                    }
                } else {
                    if (((c10 == true ? 1 : 0) & 32) == 32) {
                        this.f145226j = Collections.unmodifiableList(this.f145226j);
                    }
                    if (((c10 == true ? 1 : 0) & 256) == 256) {
                        this.f145229m = Collections.unmodifiableList(this.f145229m);
                    }
                    if (((c10 == true ? 1 : 0) & 512) == 512) {
                        this.f145230n = Collections.unmodifiableList(this.f145230n);
                    }
                    if (((c10 == true ? 1 : 0) & 8192) == 8192) {
                        this.f145235s = Collections.unmodifiableList(this.f145235s);
                    }
                    if (((c10 == true ? 1 : 0) & 16384) == 16384) {
                        this.f145236t = Collections.unmodifiableList(this.f145236t);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        this.f145219c = outputT.g();
                        throw th4;
                    }
                    this.f145219c = outputT.g();
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
        private static final QualifiedNameTable f145255f;

        /* renamed from: g, reason: collision with root package name */
        public static Parser<QualifiedNameTable> f145256g = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145257b;

        /* renamed from: c, reason: collision with root package name */
        private List<QualifiedName> f145258c;

        /* renamed from: d, reason: collision with root package name */
        private byte f145259d;

        /* renamed from: e, reason: collision with root package name */
        private int f145260e;

        public static final class Builder extends GeneratedMessageLite.Builder<QualifiedNameTable, Builder> implements QualifiedNameTableOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145261b;

            /* renamed from: c, reason: collision with root package name */
            private List<QualifiedName> f145262c = Collections.EMPTY_LIST;

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.f145256g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f145261b & 1) != 1) {
                    this.f145262c = new ArrayList(this.f145262c);
                    this.f145261b |= 1;
                }
            }

            public QualifiedNameTable r() {
                QualifiedNameTable qualifiedNameTable = new QualifiedNameTable(this);
                if ((this.f145261b & 1) == 1) {
                    this.f145262c = Collections.unmodifiableList(this.f145262c);
                    this.f145261b &= -2;
                }
                qualifiedNameTable.f145258c = this.f145262c;
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
                if (!qualifiedNameTable.f145258c.isEmpty()) {
                    if (this.f145262c.isEmpty()) {
                        this.f145262c = qualifiedNameTable.f145258c;
                        this.f145261b &= -2;
                    } else {
                        u();
                        this.f145262c.addAll(qualifiedNameTable.f145258c);
                    }
                }
                o(m().e(qualifiedNameTable.f145257b));
                return this;
            }
        }

        public static final class QualifiedName extends GeneratedMessageLite implements QualifiedNameOrBuilder {

            /* renamed from: i, reason: collision with root package name */
            private static final QualifiedName f145263i;

            /* renamed from: j, reason: collision with root package name */
            public static Parser<QualifiedName> f145264j = new a();

            /* renamed from: b, reason: collision with root package name */
            private final ByteString f145265b;

            /* renamed from: c, reason: collision with root package name */
            private int f145266c;

            /* renamed from: d, reason: collision with root package name */
            private int f145267d;

            /* renamed from: e, reason: collision with root package name */
            private int f145268e;

            /* renamed from: f, reason: collision with root package name */
            private Kind f145269f;

            /* renamed from: g, reason: collision with root package name */
            private byte f145270g;

            /* renamed from: h, reason: collision with root package name */
            private int f145271h;

            public static final class Builder extends GeneratedMessageLite.Builder<QualifiedName, Builder> implements QualifiedNameOrBuilder {

                /* renamed from: b, reason: collision with root package name */
                private int f145272b;

                /* renamed from: d, reason: collision with root package name */
                private int f145274d;

                /* renamed from: c, reason: collision with root package name */
                private int f145273c = -1;

                /* renamed from: e, reason: collision with root package name */
                private Kind f145275e = Kind.PACKAGE;

                private void u() {
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.f145264j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Builder");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder t() {
                    return new Builder();
                }

                public QualifiedName r() {
                    QualifiedName qualifiedName = new QualifiedName(this);
                    int i10 = this.f145272b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    qualifiedName.f145267d = this.f145273c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    qualifiedName.f145268e = this.f145274d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    qualifiedName.f145269f = this.f145275e;
                    qualifiedName.f145266c = i11;
                    return qualifiedName;
                }

                public Builder y(int i10) {
                    this.f145272b |= 1;
                    this.f145273c = i10;
                    return this;
                }

                public Builder z(int i10) {
                    this.f145272b |= 2;
                    this.f145274d = i10;
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
                    o(m().e(qualifiedName.f145265b));
                    return this;
                }

                public Builder x(Kind kind) {
                    kind.getClass();
                    this.f145272b |= 4;
                    this.f145275e = kind;
                    return this;
                }
            }

            public enum Kind implements Internal.EnumLite {
                CLASS(0, 0),
                PACKAGE(1, 1),
                LOCAL(2, 2);


                /* renamed from: e, reason: collision with root package name */
                private static Internal.EnumLiteMap<Kind> f145279e = new a();

                /* renamed from: a, reason: collision with root package name */
                private final int f145281a;

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
                    return this.f145281a;
                }

                Kind(int i10, int i11) {
                    this.f145281a = i11;
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
                this.f145267d = -1;
                this.f145268e = 0;
                this.f145269f = Kind.PACKAGE;
            }

            static {
                QualifiedName qualifiedName = new QualifiedName(true);
                f145263i = qualifiedName;
                qualifiedName.E();
            }

            public static QualifiedName x() {
                return f145263i;
            }

            public int A() {
                return this.f145268e;
            }

            public boolean B() {
                return (this.f145266c & 4) == 4;
            }

            public boolean C() {
                return (this.f145266c & 1) == 1;
            }

            public boolean D() {
                return (this.f145266c & 2) == 2;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean a() {
                byte b10 = this.f145270g;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (D()) {
                    this.f145270g = (byte) 1;
                    return true;
                }
                this.f145270g = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int c() {
                int i10 = this.f145271h;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f145266c & 1) == 1 ? CodedOutputStream.o(1, this.f145267d) : 0;
                if ((this.f145266c & 2) == 2) {
                    iO += CodedOutputStream.o(2, this.f145268e);
                }
                if ((this.f145266c & 4) == 4) {
                    iO += CodedOutputStream.h(3, this.f145269f.g());
                }
                int size = iO + this.f145265b.size();
                this.f145271h = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<QualifiedName> f() {
                return f145264j;
            }

            public Kind y() {
                return this.f145269f;
            }

            public int z() {
                return this.f145267d;
            }

            private QualifiedName(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f145270g = (byte) -1;
                this.f145271h = -1;
                this.f145265b = builder.m();
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
                if ((this.f145266c & 1) == 1) {
                    codedOutputStream.a0(1, this.f145267d);
                }
                if ((this.f145266c & 2) == 2) {
                    codedOutputStream.a0(2, this.f145268e);
                }
                if ((this.f145266c & 4) == 4) {
                    codedOutputStream.S(3, this.f145269f.g());
                }
                codedOutputStream.i0(this.f145265b);
            }

            private QualifiedName(boolean z10) {
                this.f145270g = (byte) -1;
                this.f145271h = -1;
                this.f145265b = ByteString.f145819a;
            }

            private QualifiedName(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.f145270g = (byte) -1;
                this.f145271h = -1;
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
                                        this.f145266c |= 1;
                                        this.f145267d = codedInputStream.s();
                                    } else if (iK == 16) {
                                        this.f145266c |= 2;
                                        this.f145268e = codedInputStream.s();
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
                                            this.f145266c |= 4;
                                            this.f145269f = kindA;
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
                            this.f145265b = outputT.g();
                            throw th3;
                        }
                        this.f145265b = outputT.g();
                        m();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f145265b = outputT.g();
                    throw th4;
                }
                this.f145265b = outputT.g();
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
            f145255f = qualifiedNameTable;
            qualifiedNameTable.y();
        }

        public static QualifiedNameTable u() {
            return f145255f;
        }

        private void y() {
            this.f145258c = Collections.EMPTY_LIST;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145259d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < x(); i10++) {
                if (!v(i10).a()) {
                    this.f145259d = (byte) 0;
                    return false;
                }
            }
            this.f145259d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145260e;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f145258c.size(); i11++) {
                iS += CodedOutputStream.s(1, this.f145258c.get(i11));
            }
            int size = iS + this.f145257b.size();
            this.f145260e = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<QualifiedNameTable> f() {
            return f145256g;
        }

        public QualifiedName v(int i10) {
            return this.f145258c.get(i10);
        }

        public int x() {
            return this.f145258c.size();
        }

        private QualifiedNameTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145259d = (byte) -1;
            this.f145260e = -1;
            this.f145257b = builder.m();
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
            for (int i10 = 0; i10 < this.f145258c.size(); i10++) {
                codedOutputStream.d0(1, this.f145258c.get(i10));
            }
            codedOutputStream.i0(this.f145257b);
        }

        private QualifiedNameTable(boolean z10) {
            this.f145259d = (byte) -1;
            this.f145260e = -1;
            this.f145257b = ByteString.f145819a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private QualifiedNameTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145259d = (byte) -1;
            this.f145260e = -1;
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
                                        this.f145258c = new ArrayList();
                                        z11 = true;
                                    }
                                    this.f145258c.add(codedInputStream.u(QualifiedName.f145264j, extensionRegistryLite));
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
                        this.f145258c = Collections.unmodifiableList(this.f145258c);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f145257b = outputT.g();
                        throw th3;
                    }
                    this.f145257b = outputT.g();
                    m();
                    throw th2;
                }
            }
            if (z11) {
                this.f145258c = Collections.unmodifiableList(this.f145258c);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145257b = outputT.g();
                throw th4;
            }
            this.f145257b = outputT.g();
            m();
        }
    }

    public interface QualifiedNameTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringTable extends GeneratedMessageLite implements StringTableOrBuilder {

        /* renamed from: f, reason: collision with root package name */
        private static final StringTable f145282f;

        /* renamed from: g, reason: collision with root package name */
        public static Parser<StringTable> f145283g = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145284b;

        /* renamed from: c, reason: collision with root package name */
        private LazyStringList f145285c;

        /* renamed from: d, reason: collision with root package name */
        private byte f145286d;

        /* renamed from: e, reason: collision with root package name */
        private int f145287e;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTable, Builder> implements StringTableOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145288b;

            /* renamed from: c, reason: collision with root package name */
            private LazyStringList f145289c = LazyStringArrayList.f145884b;

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.f145283g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f145288b & 1) != 1) {
                    this.f145289c = new LazyStringArrayList(this.f145289c);
                    this.f145288b |= 1;
                }
            }

            public StringTable r() {
                StringTable stringTable = new StringTable(this);
                if ((this.f145288b & 1) == 1) {
                    this.f145289c = this.f145289c.J();
                    this.f145288b &= -2;
                }
                stringTable.f145285c = this.f145289c;
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
                if (!stringTable.f145285c.isEmpty()) {
                    if (this.f145289c.isEmpty()) {
                        this.f145289c = stringTable.f145285c;
                        this.f145288b &= -2;
                    } else {
                        u();
                        this.f145289c.addAll(stringTable.f145285c);
                    }
                }
                o(m().e(stringTable.f145284b));
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
            f145282f = stringTable;
            stringTable.y();
        }

        public static StringTable u() {
            return f145282f;
        }

        private void y() {
            this.f145285c = LazyStringArrayList.f145884b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145286d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f145286d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145287e;
            if (i10 != -1) {
                return i10;
            }
            int iE = 0;
            for (int i11 = 0; i11 < this.f145285c.size(); i11++) {
                iE += CodedOutputStream.e(this.f145285c.j1(i11));
            }
            int size = iE + x().size() + this.f145284b.size();
            this.f145287e = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTable> f() {
            return f145283g;
        }

        public String v(int i10) {
            return this.f145285c.get(i10);
        }

        public ProtocolStringList x() {
            return this.f145285c;
        }

        private StringTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145286d = (byte) -1;
            this.f145287e = -1;
            this.f145284b = builder.m();
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
            for (int i10 = 0; i10 < this.f145285c.size(); i10++) {
                codedOutputStream.O(1, this.f145285c.j1(i10));
            }
            codedOutputStream.i0(this.f145284b);
        }

        private StringTable(boolean z10) {
            this.f145286d = (byte) -1;
            this.f145287e = -1;
            this.f145284b = ByteString.f145819a;
        }

        private StringTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145286d = (byte) -1;
            this.f145287e = -1;
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
                                        this.f145285c = new LazyStringArrayList();
                                        z11 = true;
                                    }
                                    this.f145285c.C1(byteStringL);
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
                        this.f145285c = this.f145285c.J();
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f145284b = outputT.g();
                        throw th3;
                    }
                    this.f145284b = outputT.g();
                    m();
                    throw th2;
                }
            }
            if (z11) {
                this.f145285c = this.f145285c.J();
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145284b = outputT.g();
                throw th4;
            }
            this.f145284b = outputT.g();
            m();
        }
    }

    public interface StringTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class Type extends GeneratedMessageLite.ExtendableMessage<Type> implements TypeOrBuilder {

        /* renamed from: u, reason: collision with root package name */
        private static final Type f145290u;

        /* renamed from: v, reason: collision with root package name */
        public static Parser<Type> f145291v = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f145292c;

        /* renamed from: d, reason: collision with root package name */
        private int f145293d;

        /* renamed from: e, reason: collision with root package name */
        private List<Argument> f145294e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f145295f;

        /* renamed from: g, reason: collision with root package name */
        private int f145296g;

        /* renamed from: h, reason: collision with root package name */
        private Type f145297h;

        /* renamed from: i, reason: collision with root package name */
        private int f145298i;

        /* renamed from: j, reason: collision with root package name */
        private int f145299j;

        /* renamed from: k, reason: collision with root package name */
        private int f145300k;

        /* renamed from: l, reason: collision with root package name */
        private int f145301l;

        /* renamed from: m, reason: collision with root package name */
        private int f145302m;

        /* renamed from: n, reason: collision with root package name */
        private Type f145303n;

        /* renamed from: o, reason: collision with root package name */
        private int f145304o;

        /* renamed from: p, reason: collision with root package name */
        private Type f145305p;

        /* renamed from: q, reason: collision with root package name */
        private int f145306q;

        /* renamed from: r, reason: collision with root package name */
        private int f145307r;

        /* renamed from: s, reason: collision with root package name */
        private byte f145308s;

        /* renamed from: t, reason: collision with root package name */
        private int f145309t;

        public static final class Argument extends GeneratedMessageLite implements ArgumentOrBuilder {

            /* renamed from: i, reason: collision with root package name */
            private static final Argument f145310i;

            /* renamed from: j, reason: collision with root package name */
            public static Parser<Argument> f145311j = new a();

            /* renamed from: b, reason: collision with root package name */
            private final ByteString f145312b;

            /* renamed from: c, reason: collision with root package name */
            private int f145313c;

            /* renamed from: d, reason: collision with root package name */
            private Projection f145314d;

            /* renamed from: e, reason: collision with root package name */
            private Type f145315e;

            /* renamed from: f, reason: collision with root package name */
            private int f145316f;

            /* renamed from: g, reason: collision with root package name */
            private byte f145317g;

            /* renamed from: h, reason: collision with root package name */
            private int f145318h;

            public static final class Builder extends GeneratedMessageLite.Builder<Argument, Builder> implements ArgumentOrBuilder {

                /* renamed from: b, reason: collision with root package name */
                private int f145319b;

                /* renamed from: c, reason: collision with root package name */
                private Projection f145320c = Projection.INV;

                /* renamed from: d, reason: collision with root package name */
                private Type f145321d = Type.Y();

                /* renamed from: e, reason: collision with root package name */
                private int f145322e;

                private void u() {
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.f145311j     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Argument.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Builder");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder t() {
                    return new Builder();
                }

                public Argument r() {
                    Argument argument = new Argument(this);
                    int i10 = this.f145319b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    argument.f145314d = this.f145320c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    argument.f145315e = this.f145321d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    argument.f145316f = this.f145322e;
                    argument.f145313c = i11;
                    return argument;
                }

                public Builder x(Type type) {
                    if ((this.f145319b & 2) != 2 || this.f145321d == Type.Y()) {
                        this.f145321d = type;
                    } else {
                        this.f145321d = Type.A0(this.f145321d).n(type).w();
                    }
                    this.f145319b |= 2;
                    return this;
                }

                public Builder z(int i10) {
                    this.f145319b |= 4;
                    this.f145322e = i10;
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
                    o(m().e(argument.f145312b));
                    return this;
                }

                public Builder y(Projection projection) {
                    projection.getClass();
                    this.f145319b |= 1;
                    this.f145320c = projection;
                    return this;
                }
            }

            public enum Projection implements Internal.EnumLite {
                IN(0, 0),
                OUT(1, 1),
                INV(2, 2),
                STAR(3, 3);


                /* renamed from: f, reason: collision with root package name */
                private static Internal.EnumLiteMap<Projection> f145327f = new a();

                /* renamed from: a, reason: collision with root package name */
                private final int f145329a;

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
                    return this.f145329a;
                }

                Projection(int i10, int i11) {
                    this.f145329a = i11;
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
                f145310i = argument;
                argument.E();
            }

            private void E() {
                this.f145314d = Projection.INV;
                this.f145315e = Type.Y();
                this.f145316f = 0;
            }

            public static Argument x() {
                return f145310i;
            }

            public int A() {
                return this.f145316f;
            }

            public boolean B() {
                return (this.f145313c & 1) == 1;
            }

            public boolean C() {
                return (this.f145313c & 2) == 2;
            }

            public boolean D() {
                return (this.f145313c & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean a() {
                byte b10 = this.f145317g;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (!C() || z().a()) {
                    this.f145317g = (byte) 1;
                    return true;
                }
                this.f145317g = (byte) 0;
                return false;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int c() {
                int i10 = this.f145318h;
                if (i10 != -1) {
                    return i10;
                }
                int iH = (this.f145313c & 1) == 1 ? CodedOutputStream.h(1, this.f145314d.g()) : 0;
                if ((this.f145313c & 2) == 2) {
                    iH += CodedOutputStream.s(2, this.f145315e);
                }
                if ((this.f145313c & 4) == 4) {
                    iH += CodedOutputStream.o(3, this.f145316f);
                }
                int size = iH + this.f145312b.size();
                this.f145318h = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Argument> f() {
                return f145311j;
            }

            public Projection y() {
                return this.f145314d;
            }

            public Type z() {
                return this.f145315e;
            }

            private Argument(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f145317g = (byte) -1;
                this.f145318h = -1;
                this.f145312b = builder.m();
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
                if ((this.f145313c & 1) == 1) {
                    codedOutputStream.S(1, this.f145314d.g());
                }
                if ((this.f145313c & 2) == 2) {
                    codedOutputStream.d0(2, this.f145315e);
                }
                if ((this.f145313c & 4) == 4) {
                    codedOutputStream.a0(3, this.f145316f);
                }
                codedOutputStream.i0(this.f145312b);
            }

            private Argument(boolean z10) {
                this.f145317g = (byte) -1;
                this.f145318h = -1;
                this.f145312b = ByteString.f145819a;
            }

            private Argument(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.f145317g = (byte) -1;
                this.f145318h = -1;
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
                                            this.f145313c |= 1;
                                            this.f145314d = projectionA;
                                        }
                                    } else if (iK == 18) {
                                        Builder builderB = (this.f145313c & 2) == 2 ? this.f145315e.b() : null;
                                        Type type = (Type) codedInputStream.u(Type.f145291v, extensionRegistryLite);
                                        this.f145315e = type;
                                        if (builderB != null) {
                                            builderB.n(type);
                                            this.f145315e = builderB.w();
                                        }
                                        this.f145313c |= 2;
                                    } else if (iK != 24) {
                                        if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                        }
                                    } else {
                                        this.f145313c |= 4;
                                        this.f145316f = codedInputStream.s();
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
                            this.f145312b = outputT.g();
                            throw th3;
                        }
                        this.f145312b = outputT.g();
                        m();
                        throw th2;
                    }
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f145312b = outputT.g();
                    throw th4;
                }
                this.f145312b = outputT.g();
                m();
            }
        }

        public interface ArgumentOrBuilder extends MessageLiteOrBuilder {
        }

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<Type, Builder> implements TypeOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f145330d;

            /* renamed from: f, reason: collision with root package name */
            private boolean f145332f;

            /* renamed from: g, reason: collision with root package name */
            private int f145333g;

            /* renamed from: i, reason: collision with root package name */
            private int f145335i;

            /* renamed from: j, reason: collision with root package name */
            private int f145336j;

            /* renamed from: k, reason: collision with root package name */
            private int f145337k;

            /* renamed from: l, reason: collision with root package name */
            private int f145338l;

            /* renamed from: m, reason: collision with root package name */
            private int f145339m;

            /* renamed from: o, reason: collision with root package name */
            private int f145341o;

            /* renamed from: q, reason: collision with root package name */
            private int f145343q;

            /* renamed from: r, reason: collision with root package name */
            private int f145344r;

            /* renamed from: e, reason: collision with root package name */
            private List<Argument> f145331e = Collections.EMPTY_LIST;

            /* renamed from: h, reason: collision with root package name */
            private Type f145334h = Type.Y();

            /* renamed from: n, reason: collision with root package name */
            private Type f145340n = Type.Y();

            /* renamed from: p, reason: collision with root package name */
            private Type f145342p = Type.Y();

            private void A() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: F, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.f145291v     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Type.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f145330d & 1) != 1) {
                    this.f145331e = new ArrayList(this.f145331e);
                    this.f145330d |= 1;
                }
            }

            public Builder C(Type type) {
                if ((this.f145330d & RecyclerView.m.FLAG_MOVED) != 2048 || this.f145342p == Type.Y()) {
                    this.f145342p = type;
                } else {
                    this.f145342p = Type.A0(this.f145342p).n(type).w();
                }
                this.f145330d |= RecyclerView.m.FLAG_MOVED;
                return this;
            }

            public Builder D(Type type) {
                if ((this.f145330d & 8) != 8 || this.f145334h == Type.Y()) {
                    this.f145334h = type;
                } else {
                    this.f145334h = Type.A0(this.f145334h).n(type).w();
                }
                this.f145330d |= 8;
                return this;
            }

            public Builder G(Type type) {
                if ((this.f145330d & 512) != 512 || this.f145340n == Type.Y()) {
                    this.f145340n = type;
                } else {
                    this.f145340n = Type.A0(this.f145340n).n(type).w();
                }
                this.f145330d |= 512;
                return this;
            }

            public Builder H(int i10) {
                this.f145330d |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                this.f145343q = i10;
                return this;
            }

            public Builder I(int i10) {
                this.f145330d |= 32;
                this.f145336j = i10;
                return this;
            }

            public Builder J(int i10) {
                this.f145330d |= 8192;
                this.f145344r = i10;
                return this;
            }

            public Builder K(int i10) {
                this.f145330d |= 4;
                this.f145333g = i10;
                return this;
            }

            public Builder L(int i10) {
                this.f145330d |= 16;
                this.f145335i = i10;
                return this;
            }

            public Builder M(boolean z10) {
                this.f145330d |= 2;
                this.f145332f = z10;
                return this;
            }

            public Builder N(int i10) {
                this.f145330d |= 1024;
                this.f145341o = i10;
                return this;
            }

            public Builder O(int i10) {
                this.f145330d |= 256;
                this.f145339m = i10;
                return this;
            }

            public Builder P(int i10) {
                this.f145330d |= 64;
                this.f145337k = i10;
                return this;
            }

            public Builder Q(int i10) {
                this.f145330d |= 128;
                this.f145338l = i10;
                return this;
            }

            public Type w() {
                Type type = new Type(this);
                int i10 = this.f145330d;
                if ((i10 & 1) == 1) {
                    this.f145331e = Collections.unmodifiableList(this.f145331e);
                    this.f145330d &= -2;
                }
                type.f145294e = this.f145331e;
                int i11 = (i10 & 2) != 2 ? 0 : 1;
                type.f145295f = this.f145332f;
                if ((i10 & 4) == 4) {
                    i11 |= 2;
                }
                type.f145296g = this.f145333g;
                if ((i10 & 8) == 8) {
                    i11 |= 4;
                }
                type.f145297h = this.f145334h;
                if ((i10 & 16) == 16) {
                    i11 |= 8;
                }
                type.f145298i = this.f145335i;
                if ((i10 & 32) == 32) {
                    i11 |= 16;
                }
                type.f145299j = this.f145336j;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                type.f145300k = this.f145337k;
                if ((i10 & 128) == 128) {
                    i11 |= 64;
                }
                type.f145301l = this.f145338l;
                if ((i10 & 256) == 256) {
                    i11 |= 128;
                }
                type.f145302m = this.f145339m;
                if ((i10 & 512) == 512) {
                    i11 |= 256;
                }
                type.f145303n = this.f145340n;
                if ((i10 & 1024) == 1024) {
                    i11 |= 512;
                }
                type.f145304o = this.f145341o;
                if ((i10 & RecyclerView.m.FLAG_MOVED) == 2048) {
                    i11 |= 1024;
                }
                type.f145305p = this.f145342p;
                if ((i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                    i11 |= RecyclerView.m.FLAG_MOVED;
                }
                type.f145306q = this.f145343q;
                if ((i10 & 8192) == 8192) {
                    i11 |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                }
                type.f145307r = this.f145344r;
                type.f145293d = i11;
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
                if (!type.f145294e.isEmpty()) {
                    if (this.f145331e.isEmpty()) {
                        this.f145331e = type.f145294e;
                        this.f145330d &= -2;
                    } else {
                        z();
                        this.f145331e.addAll(type.f145294e);
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
                if (type.r0()) {
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
                o(m().e(type.f145292c));
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
            f145290u = type;
            type.y0();
        }

        public static Type Y() {
            return f145290u;
        }

        private void y0() {
            this.f145294e = Collections.EMPTY_LIST;
            this.f145295f = false;
            this.f145296g = 0;
            this.f145297h = Y();
            this.f145298i = 0;
            this.f145299j = 0;
            this.f145300k = 0;
            this.f145301l = 0;
            this.f145302m = 0;
            this.f145303n = Y();
            this.f145304o = 0;
            this.f145305p = Y();
            this.f145306q = 0;
            this.f145307r = 0;
        }

        public Type S() {
            return this.f145305p;
        }

        public int T() {
            return this.f145306q;
        }

        public Argument U(int i10) {
            return this.f145294e.get(i10);
        }

        public int V() {
            return this.f145294e.size();
        }

        public List<Argument> W() {
            return this.f145294e;
        }

        public int X() {
            return this.f145299j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: Z, reason: merged with bridge method [inline-methods] */
        public Type e() {
            return f145290u;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145308s;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < V(); i10++) {
                if (!U(i10).a()) {
                    this.f145308s = (byte) 0;
                    return false;
                }
            }
            if (p0() && !c0().a()) {
                this.f145308s = (byte) 0;
                return false;
            }
            if (t0() && !f0().a()) {
                this.f145308s = (byte) 0;
                return false;
            }
            if (k0() && !S().a()) {
                this.f145308s = (byte) 0;
                return false;
            }
            if (s()) {
                this.f145308s = (byte) 1;
                return true;
            }
            this.f145308s = (byte) 0;
            return false;
        }

        public int a0() {
            return this.f145307r;
        }

        public int b0() {
            return this.f145296g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145309t;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145293d & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096 ? CodedOutputStream.o(1, this.f145307r) : 0;
            for (int i11 = 0; i11 < this.f145294e.size(); i11++) {
                iO += CodedOutputStream.s(2, this.f145294e.get(i11));
            }
            if ((this.f145293d & 1) == 1) {
                iO += CodedOutputStream.a(3, this.f145295f);
            }
            if ((this.f145293d & 2) == 2) {
                iO += CodedOutputStream.o(4, this.f145296g);
            }
            if ((this.f145293d & 4) == 4) {
                iO += CodedOutputStream.s(5, this.f145297h);
            }
            if ((this.f145293d & 16) == 16) {
                iO += CodedOutputStream.o(6, this.f145299j);
            }
            if ((this.f145293d & 32) == 32) {
                iO += CodedOutputStream.o(7, this.f145300k);
            }
            if ((this.f145293d & 8) == 8) {
                iO += CodedOutputStream.o(8, this.f145298i);
            }
            if ((this.f145293d & 64) == 64) {
                iO += CodedOutputStream.o(9, this.f145301l);
            }
            if ((this.f145293d & 256) == 256) {
                iO += CodedOutputStream.s(10, this.f145303n);
            }
            if ((this.f145293d & 512) == 512) {
                iO += CodedOutputStream.o(11, this.f145304o);
            }
            if ((this.f145293d & 128) == 128) {
                iO += CodedOutputStream.o(12, this.f145302m);
            }
            if ((this.f145293d & 1024) == 1024) {
                iO += CodedOutputStream.s(13, this.f145305p);
            }
            if ((this.f145293d & RecyclerView.m.FLAG_MOVED) == 2048) {
                iO += CodedOutputStream.o(14, this.f145306q);
            }
            int iT = iO + t() + this.f145292c.size();
            this.f145309t = iT;
            return iT;
        }

        public Type c0() {
            return this.f145297h;
        }

        public int d0() {
            return this.f145298i;
        }

        public boolean e0() {
            return this.f145295f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<Type> f() {
            return f145291v;
        }

        public Type f0() {
            return this.f145303n;
        }

        public int g0() {
            return this.f145304o;
        }

        public int h0() {
            return this.f145302m;
        }

        public int i0() {
            return this.f145300k;
        }

        public int j0() {
            return this.f145301l;
        }

        public boolean k0() {
            return (this.f145293d & 1024) == 1024;
        }

        public boolean l0() {
            return (this.f145293d & RecyclerView.m.FLAG_MOVED) == 2048;
        }

        public boolean m0() {
            return (this.f145293d & 16) == 16;
        }

        public boolean n0() {
            return (this.f145293d & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096;
        }

        public boolean o0() {
            return (this.f145293d & 2) == 2;
        }

        public boolean p0() {
            return (this.f145293d & 4) == 4;
        }

        public boolean r0() {
            return (this.f145293d & 8) == 8;
        }

        public boolean s0() {
            return (this.f145293d & 1) == 1;
        }

        public boolean t0() {
            return (this.f145293d & 256) == 256;
        }

        public boolean u0() {
            return (this.f145293d & 512) == 512;
        }

        public boolean v0() {
            return (this.f145293d & 128) == 128;
        }

        public boolean w0() {
            return (this.f145293d & 32) == 32;
        }

        public boolean x0() {
            return (this.f145293d & 64) == 64;
        }

        private Type(GeneratedMessageLite.ExtendableBuilder<Type, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f145308s = (byte) -1;
            this.f145309t = -1;
            this.f145292c = extendableBuilder.m();
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
            if ((this.f145293d & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                codedOutputStream.a0(1, this.f145307r);
            }
            for (int i10 = 0; i10 < this.f145294e.size(); i10++) {
                codedOutputStream.d0(2, this.f145294e.get(i10));
            }
            if ((this.f145293d & 1) == 1) {
                codedOutputStream.L(3, this.f145295f);
            }
            if ((this.f145293d & 2) == 2) {
                codedOutputStream.a0(4, this.f145296g);
            }
            if ((this.f145293d & 4) == 4) {
                codedOutputStream.d0(5, this.f145297h);
            }
            if ((this.f145293d & 16) == 16) {
                codedOutputStream.a0(6, this.f145299j);
            }
            if ((this.f145293d & 32) == 32) {
                codedOutputStream.a0(7, this.f145300k);
            }
            if ((this.f145293d & 8) == 8) {
                codedOutputStream.a0(8, this.f145298i);
            }
            if ((this.f145293d & 64) == 64) {
                codedOutputStream.a0(9, this.f145301l);
            }
            if ((this.f145293d & 256) == 256) {
                codedOutputStream.d0(10, this.f145303n);
            }
            if ((this.f145293d & 512) == 512) {
                codedOutputStream.a0(11, this.f145304o);
            }
            if ((this.f145293d & 128) == 128) {
                codedOutputStream.a0(12, this.f145302m);
            }
            if ((this.f145293d & 1024) == 1024) {
                codedOutputStream.d0(13, this.f145305p);
            }
            if ((this.f145293d & RecyclerView.m.FLAG_MOVED) == 2048) {
                codedOutputStream.a0(14, this.f145306q);
            }
            extensionWriterZ.a(HttpResponseStatus.SUCCESS_OK, codedOutputStream);
            codedOutputStream.i0(this.f145292c);
        }

        private Type(boolean z10) {
            this.f145308s = (byte) -1;
            this.f145309t = -1;
            this.f145292c = ByteString.f145819a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Type(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Builder builderB;
            this.f145308s = (byte) -1;
            this.f145309t = -1;
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
                                    this.f145293d |= RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT;
                                    this.f145307r = codedInputStream.s();
                                case 18:
                                    if (!z11) {
                                        this.f145294e = new ArrayList();
                                        z11 = true;
                                    }
                                    this.f145294e.add(codedInputStream.u(Argument.f145311j, extensionRegistryLite));
                                case 24:
                                    this.f145293d |= 1;
                                    this.f145295f = codedInputStream.k();
                                case l3.f92486e /* 32 */:
                                    this.f145293d |= 2;
                                    this.f145296g = codedInputStream.s();
                                case 42:
                                    builderB = (this.f145293d & 4) == 4 ? this.f145297h.b() : null;
                                    Type type = (Type) codedInputStream.u(f145291v, extensionRegistryLite);
                                    this.f145297h = type;
                                    if (builderB != null) {
                                        builderB.n(type);
                                        this.f145297h = builderB.w();
                                    }
                                    this.f145293d |= 4;
                                case 48:
                                    this.f145293d |= 16;
                                    this.f145299j = codedInputStream.s();
                                case 56:
                                    this.f145293d |= 32;
                                    this.f145300k = codedInputStream.s();
                                case 64:
                                    this.f145293d |= 8;
                                    this.f145298i = codedInputStream.s();
                                case 72:
                                    this.f145293d |= 64;
                                    this.f145301l = codedInputStream.s();
                                case 82:
                                    builderB = (this.f145293d & 256) == 256 ? this.f145303n.b() : null;
                                    Type type2 = (Type) codedInputStream.u(f145291v, extensionRegistryLite);
                                    this.f145303n = type2;
                                    if (builderB != null) {
                                        builderB.n(type2);
                                        this.f145303n = builderB.w();
                                    }
                                    this.f145293d |= 256;
                                case 88:
                                    this.f145293d |= 512;
                                    this.f145304o = codedInputStream.s();
                                case 96:
                                    this.f145293d |= 128;
                                    this.f145302m = codedInputStream.s();
                                case 106:
                                    builderB = (this.f145293d & 1024) == 1024 ? this.f145305p.b() : null;
                                    Type type3 = (Type) codedInputStream.u(f145291v, extensionRegistryLite);
                                    this.f145305p = type3;
                                    if (builderB != null) {
                                        builderB.n(type3);
                                        this.f145305p = builderB.w();
                                    }
                                    this.f145293d |= 1024;
                                case 112:
                                    this.f145293d |= RecyclerView.m.FLAG_MOVED;
                                    this.f145306q = codedInputStream.s();
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
                        this.f145294e = Collections.unmodifiableList(this.f145294e);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f145292c = outputT.g();
                        throw th3;
                    }
                    this.f145292c = outputT.g();
                    m();
                    throw th2;
                }
            }
            if (z11) {
                this.f145294e = Collections.unmodifiableList(this.f145294e);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145292c = outputT.g();
                throw th4;
            }
            this.f145292c = outputT.g();
            m();
        }
    }

    public static final class TypeAlias extends GeneratedMessageLite.ExtendableMessage<TypeAlias> implements TypeAliasOrBuilder {

        /* renamed from: q, reason: collision with root package name */
        private static final TypeAlias f145345q;

        /* renamed from: r, reason: collision with root package name */
        public static Parser<TypeAlias> f145346r = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f145347c;

        /* renamed from: d, reason: collision with root package name */
        private int f145348d;

        /* renamed from: e, reason: collision with root package name */
        private int f145349e;

        /* renamed from: f, reason: collision with root package name */
        private int f145350f;

        /* renamed from: g, reason: collision with root package name */
        private List<TypeParameter> f145351g;

        /* renamed from: h, reason: collision with root package name */
        private Type f145352h;

        /* renamed from: i, reason: collision with root package name */
        private int f145353i;

        /* renamed from: j, reason: collision with root package name */
        private Type f145354j;

        /* renamed from: k, reason: collision with root package name */
        private int f145355k;

        /* renamed from: l, reason: collision with root package name */
        private List<Annotation> f145356l;

        /* renamed from: m, reason: collision with root package name */
        private List<Integer> f145357m;

        /* renamed from: n, reason: collision with root package name */
        private List<CompilerPluginData> f145358n;

        /* renamed from: o, reason: collision with root package name */
        private byte f145359o;

        /* renamed from: p, reason: collision with root package name */
        private int f145360p;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeAlias, Builder> implements TypeAliasOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f145361d;

            /* renamed from: e, reason: collision with root package name */
            private int f145362e = 6;

            /* renamed from: f, reason: collision with root package name */
            private int f145363f;

            /* renamed from: g, reason: collision with root package name */
            private List<TypeParameter> f145364g;

            /* renamed from: h, reason: collision with root package name */
            private Type f145365h;

            /* renamed from: i, reason: collision with root package name */
            private int f145366i;

            /* renamed from: j, reason: collision with root package name */
            private Type f145367j;

            /* renamed from: k, reason: collision with root package name */
            private int f145368k;

            /* renamed from: l, reason: collision with root package name */
            private List<Annotation> f145369l;

            /* renamed from: m, reason: collision with root package name */
            private List<Integer> f145370m;

            /* renamed from: n, reason: collision with root package name */
            private List<CompilerPluginData> f145371n;

            private void E() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: H, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.f145346r     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeAlias.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$Builder");
            }

            private void A() {
                if ((this.f145361d & 512) != 512) {
                    this.f145371n = new ArrayList(this.f145371n);
                    this.f145361d |= 512;
                }
            }

            private void C() {
                if ((this.f145361d & 4) != 4) {
                    this.f145364g = new ArrayList(this.f145364g);
                    this.f145361d |= 4;
                }
            }

            private void D() {
                if ((this.f145361d & 256) != 256) {
                    this.f145370m = new ArrayList(this.f145370m);
                    this.f145361d |= 256;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f145361d & 128) != 128) {
                    this.f145369l = new ArrayList(this.f145369l);
                    this.f145361d |= 128;
                }
            }

            public Builder F(Type type) {
                if ((this.f145361d & 32) != 32 || this.f145367j == Type.Y()) {
                    this.f145367j = type;
                } else {
                    this.f145367j = Type.A0(this.f145367j).n(type).w();
                }
                this.f145361d |= 32;
                return this;
            }

            public Builder I(Type type) {
                if ((this.f145361d & 8) != 8 || this.f145365h == Type.Y()) {
                    this.f145365h = type;
                } else {
                    this.f145365h = Type.A0(this.f145365h).n(type).w();
                }
                this.f145361d |= 8;
                return this;
            }

            public Builder J(int i10) {
                this.f145361d |= 64;
                this.f145368k = i10;
                return this;
            }

            public Builder K(int i10) {
                this.f145361d |= 1;
                this.f145362e = i10;
                return this;
            }

            public Builder L(int i10) {
                this.f145361d |= 2;
                this.f145363f = i10;
                return this;
            }

            public Builder M(int i10) {
                this.f145361d |= 16;
                this.f145366i = i10;
                return this;
            }

            public TypeAlias w() {
                TypeAlias typeAlias = new TypeAlias(this);
                int i10 = this.f145361d;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                typeAlias.f145349e = this.f145362e;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                typeAlias.f145350f = this.f145363f;
                if ((this.f145361d & 4) == 4) {
                    this.f145364g = Collections.unmodifiableList(this.f145364g);
                    this.f145361d &= -5;
                }
                typeAlias.f145351g = this.f145364g;
                if ((i10 & 8) == 8) {
                    i11 |= 4;
                }
                typeAlias.f145352h = this.f145365h;
                if ((i10 & 16) == 16) {
                    i11 |= 8;
                }
                typeAlias.f145353i = this.f145366i;
                if ((i10 & 32) == 32) {
                    i11 |= 16;
                }
                typeAlias.f145354j = this.f145367j;
                if ((i10 & 64) == 64) {
                    i11 |= 32;
                }
                typeAlias.f145355k = this.f145368k;
                if ((this.f145361d & 128) == 128) {
                    this.f145369l = Collections.unmodifiableList(this.f145369l);
                    this.f145361d &= -129;
                }
                typeAlias.f145356l = this.f145369l;
                if ((this.f145361d & 256) == 256) {
                    this.f145370m = Collections.unmodifiableList(this.f145370m);
                    this.f145361d &= -257;
                }
                typeAlias.f145357m = this.f145370m;
                if ((this.f145361d & 512) == 512) {
                    this.f145371n = Collections.unmodifiableList(this.f145371n);
                    this.f145361d &= -513;
                }
                typeAlias.f145358n = this.f145371n;
                typeAlias.f145348d = i11;
                return typeAlias;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f145364g = list;
                this.f145365h = Type.Y();
                this.f145367j = Type.Y();
                this.f145369l = list;
                this.f145370m = list;
                this.f145371n = list;
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
                if (!typeAlias.f145351g.isEmpty()) {
                    if (this.f145364g.isEmpty()) {
                        this.f145364g = typeAlias.f145351g;
                        this.f145361d &= -5;
                    } else {
                        C();
                        this.f145364g.addAll(typeAlias.f145351g);
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
                if (!typeAlias.f145356l.isEmpty()) {
                    if (this.f145369l.isEmpty()) {
                        this.f145369l = typeAlias.f145356l;
                        this.f145361d &= -129;
                    } else {
                        z();
                        this.f145369l.addAll(typeAlias.f145356l);
                    }
                }
                if (!typeAlias.f145357m.isEmpty()) {
                    if (this.f145370m.isEmpty()) {
                        this.f145370m = typeAlias.f145357m;
                        this.f145361d &= -257;
                    } else {
                        D();
                        this.f145370m.addAll(typeAlias.f145357m);
                    }
                }
                if (!typeAlias.f145358n.isEmpty()) {
                    if (this.f145371n.isEmpty()) {
                        this.f145371n = typeAlias.f145358n;
                        this.f145361d &= -513;
                    } else {
                        A();
                        this.f145371n.addAll(typeAlias.f145358n);
                    }
                }
                t(typeAlias);
                o(m().e(typeAlias.f145347c));
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
            this.f145349e = 6;
            this.f145350f = 0;
            List list = Collections.EMPTY_LIST;
            this.f145351g = list;
            this.f145352h = Type.Y();
            this.f145353i = 0;
            this.f145354j = Type.Y();
            this.f145355k = 0;
            this.f145356l = list;
            this.f145357m = list;
            this.f145358n = list;
        }

        static {
            TypeAlias typeAlias = new TypeAlias(true);
            f145345q = typeAlias;
            typeAlias.o0();
        }

        public static TypeAlias W() {
            return f145345q;
        }

        public static TypeAlias t0(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return f145346r.d(inputStream, extensionRegistryLite);
        }

        public Annotation R(int i10) {
            return this.f145356l.get(i10);
        }

        public int S() {
            return this.f145356l.size();
        }

        public List<Annotation> T() {
            return this.f145356l;
        }

        public CompilerPluginData U(int i10) {
            return this.f145358n.get(i10);
        }

        public int V() {
            return this.f145358n.size();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: X, reason: merged with bridge method [inline-methods] */
        public TypeAlias e() {
            return f145345q;
        }

        public Type Y() {
            return this.f145354j;
        }

        public int Z() {
            return this.f145355k;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145359o;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!l0()) {
                this.f145359o = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < d0(); i10++) {
                if (!c0(i10).a()) {
                    this.f145359o = (byte) 0;
                    return false;
                }
            }
            if (m0() && !f0().a()) {
                this.f145359o = (byte) 0;
                return false;
            }
            if (i0() && !Y().a()) {
                this.f145359o = (byte) 0;
                return false;
            }
            for (int i11 = 0; i11 < S(); i11++) {
                if (!R(i11).a()) {
                    this.f145359o = (byte) 0;
                    return false;
                }
            }
            for (int i12 = 0; i12 < V(); i12++) {
                if (!U(i12).a()) {
                    this.f145359o = (byte) 0;
                    return false;
                }
            }
            if (s()) {
                this.f145359o = (byte) 1;
                return true;
            }
            this.f145359o = (byte) 0;
            return false;
        }

        public int a0() {
            return this.f145349e;
        }

        public int b0() {
            return this.f145350f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145360p;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145348d & 1) == 1 ? CodedOutputStream.o(1, this.f145349e) : 0;
            if ((this.f145348d & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f145350f);
            }
            for (int i11 = 0; i11 < this.f145351g.size(); i11++) {
                iO += CodedOutputStream.s(3, this.f145351g.get(i11));
            }
            if ((this.f145348d & 4) == 4) {
                iO += CodedOutputStream.s(4, this.f145352h);
            }
            if ((this.f145348d & 8) == 8) {
                iO += CodedOutputStream.o(5, this.f145353i);
            }
            if ((this.f145348d & 16) == 16) {
                iO += CodedOutputStream.s(6, this.f145354j);
            }
            if ((this.f145348d & 32) == 32) {
                iO += CodedOutputStream.o(7, this.f145355k);
            }
            for (int i12 = 0; i12 < this.f145356l.size(); i12++) {
                iO += CodedOutputStream.s(8, this.f145356l.get(i12));
            }
            int iP = 0;
            for (int i13 = 0; i13 < this.f145357m.size(); i13++) {
                iP += CodedOutputStream.p(this.f145357m.get(i13).intValue());
            }
            int size = iO + iP + (h0().size() * 2);
            for (int i14 = 0; i14 < this.f145358n.size(); i14++) {
                size += CodedOutputStream.s(32, this.f145358n.get(i14));
            }
            int iT = size + t() + this.f145347c.size();
            this.f145360p = iT;
            return iT;
        }

        public TypeParameter c0(int i10) {
            return this.f145351g.get(i10);
        }

        public int d0() {
            return this.f145351g.size();
        }

        public List<TypeParameter> e0() {
            return this.f145351g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeAlias> f() {
            return f145346r;
        }

        public Type f0() {
            return this.f145352h;
        }

        public int g0() {
            return this.f145353i;
        }

        public List<Integer> h0() {
            return this.f145357m;
        }

        public boolean i0() {
            return (this.f145348d & 16) == 16;
        }

        public boolean j0() {
            return (this.f145348d & 32) == 32;
        }

        public boolean k0() {
            return (this.f145348d & 1) == 1;
        }

        public boolean l0() {
            return (this.f145348d & 2) == 2;
        }

        public boolean m0() {
            return (this.f145348d & 4) == 4;
        }

        public boolean n0() {
            return (this.f145348d & 8) == 8;
        }

        private TypeAlias(GeneratedMessageLite.ExtendableBuilder<TypeAlias, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f145359o = (byte) -1;
            this.f145360p = -1;
            this.f145347c = extendableBuilder.m();
        }

        public static Builder p0() {
            return Builder.y();
        }

        public static Builder r0(TypeAlias typeAlias) {
            return p0().n(typeAlias);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            GeneratedMessageLite.ExtendableMessage<MessageType>.ExtensionWriter extensionWriterZ = z();
            if ((this.f145348d & 1) == 1) {
                codedOutputStream.a0(1, this.f145349e);
            }
            if ((this.f145348d & 2) == 2) {
                codedOutputStream.a0(2, this.f145350f);
            }
            for (int i10 = 0; i10 < this.f145351g.size(); i10++) {
                codedOutputStream.d0(3, this.f145351g.get(i10));
            }
            if ((this.f145348d & 4) == 4) {
                codedOutputStream.d0(4, this.f145352h);
            }
            if ((this.f145348d & 8) == 8) {
                codedOutputStream.a0(5, this.f145353i);
            }
            if ((this.f145348d & 16) == 16) {
                codedOutputStream.d0(6, this.f145354j);
            }
            if ((this.f145348d & 32) == 32) {
                codedOutputStream.a0(7, this.f145355k);
            }
            for (int i11 = 0; i11 < this.f145356l.size(); i11++) {
                codedOutputStream.d0(8, this.f145356l.get(i11));
            }
            for (int i12 = 0; i12 < this.f145357m.size(); i12++) {
                codedOutputStream.a0(31, this.f145357m.get(i12).intValue());
            }
            for (int i13 = 0; i13 < this.f145358n.size(); i13++) {
                codedOutputStream.d0(32, this.f145358n.get(i13));
            }
            extensionWriterZ.a(HttpResponseStatus.SUCCESS_OK, codedOutputStream);
            codedOutputStream.i0(this.f145347c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: s0, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return p0();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: u0, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return r0(this);
        }

        private TypeAlias(boolean z10) {
            this.f145359o = (byte) -1;
            this.f145360p = -1;
            this.f145347c = ByteString.f145819a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1 */
        /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
        private TypeAlias(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Type.Builder builderB;
            this.f145359o = (byte) -1;
            this.f145360p = -1;
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
                                    this.f145348d |= 1;
                                    this.f145349e = codedInputStream.s();
                                case 16:
                                    this.f145348d |= 2;
                                    this.f145350f = codedInputStream.s();
                                case 26:
                                    if ((i10 & 4) != 4) {
                                        this.f145351g = new ArrayList();
                                        i10 |= 4;
                                    }
                                    this.f145351g.add(codedInputStream.u(TypeParameter.f145373o, extensionRegistryLite));
                                case 34:
                                    builderB = (this.f145348d & 4) == 4 ? this.f145352h.b() : null;
                                    Type type = (Type) codedInputStream.u(Type.f145291v, extensionRegistryLite);
                                    this.f145352h = type;
                                    if (builderB != null) {
                                        builderB.n(type);
                                        this.f145352h = builderB.w();
                                    }
                                    this.f145348d |= 4;
                                case 40:
                                    this.f145348d |= 8;
                                    this.f145353i = codedInputStream.s();
                                case 50:
                                    builderB = (this.f145348d & 16) == 16 ? this.f145354j.b() : null;
                                    Type type2 = (Type) codedInputStream.u(Type.f145291v, extensionRegistryLite);
                                    this.f145354j = type2;
                                    if (builderB != null) {
                                        builderB.n(type2);
                                        this.f145354j = builderB.w();
                                    }
                                    this.f145348d |= 16;
                                case 56:
                                    this.f145348d |= 32;
                                    this.f145355k = codedInputStream.s();
                                case 66:
                                    if ((i10 & 128) != 128) {
                                        this.f145356l = new ArrayList();
                                        i10 |= 128;
                                    }
                                    this.f145356l.add(codedInputStream.u(Annotation.f144897i, extensionRegistryLite));
                                case 248:
                                    if ((i10 & 256) != 256) {
                                        this.f145357m = new ArrayList();
                                        i10 |= 256;
                                    }
                                    this.f145357m.add(Integer.valueOf(codedInputStream.s()));
                                case 250:
                                    int iJ = codedInputStream.j(codedInputStream.A());
                                    if ((i10 & 256) != 256 && codedInputStream.e() > 0) {
                                        this.f145357m = new ArrayList();
                                        i10 |= 256;
                                    }
                                    while (codedInputStream.e() > 0) {
                                        this.f145357m.add(Integer.valueOf(codedInputStream.s()));
                                    }
                                    codedInputStream.i(iJ);
                                    break;
                                case 258:
                                    if ((i10 & 512) != 512) {
                                        this.f145358n = new ArrayList();
                                        i10 |= 512;
                                    }
                                    this.f145358n.add(codedInputStream.u(CompilerPluginData.f145037i, extensionRegistryLite));
                                default:
                                    P10 = p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK);
                                    if (P10 == 0) {
                                        z10 = true;
                                    }
                            }
                        } catch (Throwable th2) {
                            if ((i10 & 4) == 4) {
                                this.f145351g = Collections.unmodifiableList(this.f145351g);
                            }
                            if ((i10 & 128) == P10) {
                                this.f145356l = Collections.unmodifiableList(this.f145356l);
                            }
                            if ((i10 & 256) == 256) {
                                this.f145357m = Collections.unmodifiableList(this.f145357m);
                            }
                            if ((i10 & 512) == 512) {
                                this.f145358n = Collections.unmodifiableList(this.f145358n);
                            }
                            try {
                                codedOutputStreamJ.I();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f145347c = outputT.g();
                                throw th3;
                            }
                            this.f145347c = outputT.g();
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
                        this.f145351g = Collections.unmodifiableList(this.f145351g);
                    }
                    if ((i10 & 128) == 128) {
                        this.f145356l = Collections.unmodifiableList(this.f145356l);
                    }
                    if ((i10 & 256) == 256) {
                        this.f145357m = Collections.unmodifiableList(this.f145357m);
                    }
                    if ((i10 & 512) == 512) {
                        this.f145358n = Collections.unmodifiableList(this.f145358n);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused2) {
                    } catch (Throwable th4) {
                        this.f145347c = outputT.g();
                        throw th4;
                    }
                    this.f145347c = outputT.g();
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
        private static final TypeParameter f145372n;

        /* renamed from: o, reason: collision with root package name */
        public static Parser<TypeParameter> f145373o = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f145374c;

        /* renamed from: d, reason: collision with root package name */
        private int f145375d;

        /* renamed from: e, reason: collision with root package name */
        private int f145376e;

        /* renamed from: f, reason: collision with root package name */
        private int f145377f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f145378g;

        /* renamed from: h, reason: collision with root package name */
        private Variance f145379h;

        /* renamed from: i, reason: collision with root package name */
        private List<Type> f145380i;

        /* renamed from: j, reason: collision with root package name */
        private List<Integer> f145381j;

        /* renamed from: k, reason: collision with root package name */
        private int f145382k;

        /* renamed from: l, reason: collision with root package name */
        private byte f145383l;

        /* renamed from: m, reason: collision with root package name */
        private int f145384m;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<TypeParameter, Builder> implements TypeParameterOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f145385d;

            /* renamed from: e, reason: collision with root package name */
            private int f145386e;

            /* renamed from: f, reason: collision with root package name */
            private int f145387f;

            /* renamed from: g, reason: collision with root package name */
            private boolean f145388g;

            /* renamed from: h, reason: collision with root package name */
            private Variance f145389h = Variance.INV;

            /* renamed from: i, reason: collision with root package name */
            private List<Type> f145390i;

            /* renamed from: j, reason: collision with root package name */
            private List<Integer> f145391j;

            private void C() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.f145373o     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeParameter.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Builder");
            }

            private void A() {
                if ((this.f145385d & 16) != 16) {
                    this.f145390i = new ArrayList(this.f145390i);
                    this.f145385d |= 16;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            private void z() {
                if ((this.f145385d & 32) != 32) {
                    this.f145391j = new ArrayList(this.f145391j);
                    this.f145385d |= 32;
                }
            }

            public Builder F(int i10) {
                this.f145385d |= 1;
                this.f145386e = i10;
                return this;
            }

            public Builder G(int i10) {
                this.f145385d |= 2;
                this.f145387f = i10;
                return this;
            }

            public Builder H(boolean z10) {
                this.f145385d |= 4;
                this.f145388g = z10;
                return this;
            }

            public TypeParameter w() {
                TypeParameter typeParameter = new TypeParameter(this);
                int i10 = this.f145385d;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                typeParameter.f145376e = this.f145386e;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                typeParameter.f145377f = this.f145387f;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                typeParameter.f145378g = this.f145388g;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                typeParameter.f145379h = this.f145389h;
                if ((this.f145385d & 16) == 16) {
                    this.f145390i = Collections.unmodifiableList(this.f145390i);
                    this.f145385d &= -17;
                }
                typeParameter.f145380i = this.f145390i;
                if ((this.f145385d & 32) == 32) {
                    this.f145391j = Collections.unmodifiableList(this.f145391j);
                    this.f145385d &= -33;
                }
                typeParameter.f145381j = this.f145391j;
                typeParameter.f145375d = i11;
                return typeParameter;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f145390i = list;
                this.f145391j = list;
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
                if (!typeParameter.f145380i.isEmpty()) {
                    if (this.f145390i.isEmpty()) {
                        this.f145390i = typeParameter.f145380i;
                        this.f145385d &= -17;
                    } else {
                        A();
                        this.f145390i.addAll(typeParameter.f145380i);
                    }
                }
                if (!typeParameter.f145381j.isEmpty()) {
                    if (this.f145391j.isEmpty()) {
                        this.f145391j = typeParameter.f145381j;
                        this.f145385d &= -33;
                    } else {
                        z();
                        this.f145391j.addAll(typeParameter.f145381j);
                    }
                }
                t(typeParameter);
                o(m().e(typeParameter.f145374c));
                return this;
            }

            public Builder I(Variance variance) {
                variance.getClass();
                this.f145385d |= 8;
                this.f145389h = variance;
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
            private static Internal.EnumLiteMap<Variance> f145395e = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f145397a;

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
                return this.f145397a;
            }

            Variance(int i10, int i11) {
                this.f145397a = i11;
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
            this.f145376e = 0;
            this.f145377f = 0;
            this.f145378g = false;
            this.f145379h = Variance.INV;
            List list = Collections.EMPTY_LIST;
            this.f145380i = list;
            this.f145381j = list;
        }

        static {
            TypeParameter typeParameter = new TypeParameter(true);
            f145372n = typeParameter;
            typeParameter.Z();
        }

        public static TypeParameter L() {
            return f145372n;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public TypeParameter e() {
            return f145372n;
        }

        public int N() {
            return this.f145376e;
        }

        public int O() {
            return this.f145377f;
        }

        public boolean P() {
            return this.f145378g;
        }

        public Type Q(int i10) {
            return this.f145380i.get(i10);
        }

        public int R() {
            return this.f145380i.size();
        }

        public List<Integer> S() {
            return this.f145381j;
        }

        public List<Type> T() {
            return this.f145380i;
        }

        public Variance U() {
            return this.f145379h;
        }

        public boolean V() {
            return (this.f145375d & 1) == 1;
        }

        public boolean W() {
            return (this.f145375d & 2) == 2;
        }

        public boolean X() {
            return (this.f145375d & 4) == 4;
        }

        public boolean Y() {
            return (this.f145375d & 8) == 8;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145383l;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!V()) {
                this.f145383l = (byte) 0;
                return false;
            }
            if (!W()) {
                this.f145383l = (byte) 0;
                return false;
            }
            for (int i10 = 0; i10 < R(); i10++) {
                if (!Q(i10).a()) {
                    this.f145383l = (byte) 0;
                    return false;
                }
            }
            if (s()) {
                this.f145383l = (byte) 1;
                return true;
            }
            this.f145383l = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145384m;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145375d & 1) == 1 ? CodedOutputStream.o(1, this.f145376e) : 0;
            if ((this.f145375d & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f145377f);
            }
            if ((this.f145375d & 4) == 4) {
                iO += CodedOutputStream.a(3, this.f145378g);
            }
            if ((this.f145375d & 8) == 8) {
                iO += CodedOutputStream.h(4, this.f145379h.g());
            }
            for (int i11 = 0; i11 < this.f145380i.size(); i11++) {
                iO += CodedOutputStream.s(5, this.f145380i.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f145381j.size(); i12++) {
                iP += CodedOutputStream.p(this.f145381j.get(i12).intValue());
            }
            int iP2 = iO + iP;
            if (!S().isEmpty()) {
                iP2 = iP2 + 1 + CodedOutputStream.p(iP);
            }
            this.f145382k = iP;
            int iT = iP2 + t() + this.f145374c.size();
            this.f145384m = iT;
            return iT;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeParameter> f() {
            return f145373o;
        }

        private TypeParameter(GeneratedMessageLite.ExtendableBuilder<TypeParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f145382k = -1;
            this.f145383l = (byte) -1;
            this.f145384m = -1;
            this.f145374c = extendableBuilder.m();
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
            if ((this.f145375d & 1) == 1) {
                codedOutputStream.a0(1, this.f145376e);
            }
            if ((this.f145375d & 2) == 2) {
                codedOutputStream.a0(2, this.f145377f);
            }
            if ((this.f145375d & 4) == 4) {
                codedOutputStream.L(3, this.f145378g);
            }
            if ((this.f145375d & 8) == 8) {
                codedOutputStream.S(4, this.f145379h.g());
            }
            for (int i10 = 0; i10 < this.f145380i.size(); i10++) {
                codedOutputStream.d0(5, this.f145380i.get(i10));
            }
            if (S().size() > 0) {
                codedOutputStream.o0(50);
                codedOutputStream.o0(this.f145382k);
            }
            for (int i11 = 0; i11 < this.f145381j.size(); i11++) {
                codedOutputStream.b0(this.f145381j.get(i11).intValue());
            }
            extensionWriterZ.a(1000, codedOutputStream);
            codedOutputStream.i0(this.f145374c);
        }

        private TypeParameter(boolean z10) {
            this.f145382k = -1;
            this.f145383l = (byte) -1;
            this.f145384m = -1;
            this.f145374c = ByteString.f145819a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private TypeParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145382k = -1;
            this.f145383l = (byte) -1;
            this.f145384m = -1;
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
                                this.f145375d |= 1;
                                this.f145376e = codedInputStream.s();
                            } else if (iK == 16) {
                                this.f145375d |= 2;
                                this.f145377f = codedInputStream.s();
                            } else if (iK == 24) {
                                this.f145375d |= 4;
                                this.f145378g = codedInputStream.k();
                            } else if (iK == 32) {
                                int iN = codedInputStream.n();
                                Variance varianceA = Variance.a(iN);
                                if (varianceA == null) {
                                    codedOutputStreamJ.o0(iK);
                                    codedOutputStreamJ.o0(iN);
                                } else {
                                    this.f145375d |= 8;
                                    this.f145379h = varianceA;
                                }
                            } else if (iK == 42) {
                                if ((i10 & 16) != 16) {
                                    this.f145380i = new ArrayList();
                                    i10 |= 16;
                                }
                                this.f145380i.add(codedInputStream.u(Type.f145291v, extensionRegistryLite));
                            } else if (iK == 48) {
                                if ((i10 & 32) != 32) {
                                    this.f145381j = new ArrayList();
                                    i10 |= 32;
                                }
                                this.f145381j.add(Integer.valueOf(codedInputStream.s()));
                            } else if (iK != 50) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                int iJ = codedInputStream.j(codedInputStream.A());
                                if ((i10 & 32) != 32 && codedInputStream.e() > 0) {
                                    this.f145381j = new ArrayList();
                                    i10 |= 32;
                                }
                                while (codedInputStream.e() > 0) {
                                    this.f145381j.add(Integer.valueOf(codedInputStream.s()));
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
                        this.f145380i = Collections.unmodifiableList(this.f145380i);
                    }
                    if ((i10 & 32) == 32) {
                        this.f145381j = Collections.unmodifiableList(this.f145381j);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f145374c = outputT.g();
                        throw th3;
                    }
                    this.f145374c = outputT.g();
                    m();
                    throw th2;
                }
            }
            if ((i10 & 16) == 16) {
                this.f145380i = Collections.unmodifiableList(this.f145380i);
            }
            if ((i10 & 32) == 32) {
                this.f145381j = Collections.unmodifiableList(this.f145381j);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145374c = outputT.g();
                throw th4;
            }
            this.f145374c = outputT.g();
            m();
        }
    }

    public interface TypeParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class TypeTable extends GeneratedMessageLite implements TypeTableOrBuilder {

        /* renamed from: h, reason: collision with root package name */
        private static final TypeTable f145398h;

        /* renamed from: i, reason: collision with root package name */
        public static Parser<TypeTable> f145399i = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145400b;

        /* renamed from: c, reason: collision with root package name */
        private int f145401c;

        /* renamed from: d, reason: collision with root package name */
        private List<Type> f145402d;

        /* renamed from: e, reason: collision with root package name */
        private int f145403e;

        /* renamed from: f, reason: collision with root package name */
        private byte f145404f;

        /* renamed from: g, reason: collision with root package name */
        private int f145405g;

        public static final class Builder extends GeneratedMessageLite.Builder<TypeTable, Builder> implements TypeTableOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145406b;

            /* renamed from: c, reason: collision with root package name */
            private List<Type> f145407c = Collections.EMPTY_LIST;

            /* renamed from: d, reason: collision with root package name */
            private int f145408d = -1;

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.f145399i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f145406b & 1) != 1) {
                    this.f145407c = new ArrayList(this.f145407c);
                    this.f145406b |= 1;
                }
            }

            public TypeTable r() {
                TypeTable typeTable = new TypeTable(this);
                int i10 = this.f145406b;
                if ((i10 & 1) == 1) {
                    this.f145407c = Collections.unmodifiableList(this.f145407c);
                    this.f145406b &= -2;
                }
                typeTable.f145402d = this.f145407c;
                int i11 = (i10 & 2) != 2 ? 0 : 1;
                typeTable.f145403e = this.f145408d;
                typeTable.f145401c = i11;
                return typeTable;
            }

            public Builder y(int i10) {
                this.f145406b |= 2;
                this.f145408d = i10;
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
                if (!typeTable.f145402d.isEmpty()) {
                    if (this.f145407c.isEmpty()) {
                        this.f145407c = typeTable.f145402d;
                        this.f145406b &= -2;
                    } else {
                        u();
                        this.f145407c.addAll(typeTable.f145402d);
                    }
                }
                if (typeTable.C()) {
                    y(typeTable.y());
                }
                o(m().e(typeTable.f145400b));
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
            f145398h = typeTable;
            typeTable.D();
        }

        private void D() {
            this.f145402d = Collections.EMPTY_LIST;
            this.f145403e = -1;
        }

        public static TypeTable x() {
            return f145398h;
        }

        public int A() {
            return this.f145402d.size();
        }

        public List<Type> B() {
            return this.f145402d;
        }

        public boolean C() {
            return (this.f145401c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145404f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            for (int i10 = 0; i10 < A(); i10++) {
                if (!z(i10).a()) {
                    this.f145404f = (byte) 0;
                    return false;
                }
            }
            this.f145404f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145405g;
            if (i10 != -1) {
                return i10;
            }
            int iO = 0;
            for (int i11 = 0; i11 < this.f145402d.size(); i11++) {
                iO += CodedOutputStream.s(1, this.f145402d.get(i11));
            }
            if ((this.f145401c & 1) == 1) {
                iO += CodedOutputStream.o(2, this.f145403e);
            }
            int size = iO + this.f145400b.size();
            this.f145405g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<TypeTable> f() {
            return f145399i;
        }

        public int y() {
            return this.f145403e;
        }

        public Type z(int i10) {
            return this.f145402d.get(i10);
        }

        private TypeTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145404f = (byte) -1;
            this.f145405g = -1;
            this.f145400b = builder.m();
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
            for (int i10 = 0; i10 < this.f145402d.size(); i10++) {
                codedOutputStream.d0(1, this.f145402d.get(i10));
            }
            if ((this.f145401c & 1) == 1) {
                codedOutputStream.a0(2, this.f145403e);
            }
            codedOutputStream.i0(this.f145400b);
        }

        private TypeTable(boolean z10) {
            this.f145404f = (byte) -1;
            this.f145405g = -1;
            this.f145400b = ByteString.f145819a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private TypeTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145404f = (byte) -1;
            this.f145405g = -1;
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
                                    this.f145402d = new ArrayList();
                                    z11 = true;
                                }
                                this.f145402d.add(codedInputStream.u(Type.f145291v, extensionRegistryLite));
                            } else if (iK != 16) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                this.f145401c |= 1;
                                this.f145403e = codedInputStream.s();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        if (z11) {
                            this.f145402d = Collections.unmodifiableList(this.f145402d);
                        }
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145400b = outputT.g();
                            throw th3;
                        }
                        this.f145400b = outputT.g();
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
                this.f145402d = Collections.unmodifiableList(this.f145402d);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145400b = outputT.g();
                throw th4;
            }
            this.f145400b = outputT.g();
            m();
        }
    }

    public interface TypeTableOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class ValueParameter extends GeneratedMessageLite.ExtendableMessage<ValueParameter> implements ValueParameterOrBuilder {

        /* renamed from: m, reason: collision with root package name */
        private static final ValueParameter f145409m;

        /* renamed from: n, reason: collision with root package name */
        public static Parser<ValueParameter> f145410n = new a();

        /* renamed from: c, reason: collision with root package name */
        private final ByteString f145411c;

        /* renamed from: d, reason: collision with root package name */
        private int f145412d;

        /* renamed from: e, reason: collision with root package name */
        private int f145413e;

        /* renamed from: f, reason: collision with root package name */
        private int f145414f;

        /* renamed from: g, reason: collision with root package name */
        private Type f145415g;

        /* renamed from: h, reason: collision with root package name */
        private int f145416h;

        /* renamed from: i, reason: collision with root package name */
        private Type f145417i;

        /* renamed from: j, reason: collision with root package name */
        private int f145418j;

        /* renamed from: k, reason: collision with root package name */
        private byte f145419k;

        /* renamed from: l, reason: collision with root package name */
        private int f145420l;

        public static final class Builder extends GeneratedMessageLite.ExtendableBuilder<ValueParameter, Builder> implements ValueParameterOrBuilder {

            /* renamed from: d, reason: collision with root package name */
            private int f145421d;

            /* renamed from: e, reason: collision with root package name */
            private int f145422e;

            /* renamed from: f, reason: collision with root package name */
            private int f145423f;

            /* renamed from: h, reason: collision with root package name */
            private int f145425h;

            /* renamed from: j, reason: collision with root package name */
            private int f145427j;

            /* renamed from: g, reason: collision with root package name */
            private Type f145424g = Type.Y();

            /* renamed from: i, reason: collision with root package name */
            private Type f145426i = Type.Y();

            private void z() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.f145410n     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.ValueParameter.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder y() {
                return new Builder();
            }

            public Builder D(Type type) {
                if ((this.f145421d & 4) != 4 || this.f145424g == Type.Y()) {
                    this.f145424g = type;
                } else {
                    this.f145424g = Type.A0(this.f145424g).n(type).w();
                }
                this.f145421d |= 4;
                return this;
            }

            public Builder E(Type type) {
                if ((this.f145421d & 16) != 16 || this.f145426i == Type.Y()) {
                    this.f145426i = type;
                } else {
                    this.f145426i = Type.A0(this.f145426i).n(type).w();
                }
                this.f145421d |= 16;
                return this;
            }

            public Builder F(int i10) {
                this.f145421d |= 1;
                this.f145422e = i10;
                return this;
            }

            public Builder G(int i10) {
                this.f145421d |= 2;
                this.f145423f = i10;
                return this;
            }

            public Builder H(int i10) {
                this.f145421d |= 8;
                this.f145425h = i10;
                return this;
            }

            public Builder I(int i10) {
                this.f145421d |= 32;
                this.f145427j = i10;
                return this;
            }

            public ValueParameter w() {
                ValueParameter valueParameter = new ValueParameter(this);
                int i10 = this.f145421d;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                valueParameter.f145413e = this.f145422e;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                valueParameter.f145414f = this.f145423f;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                valueParameter.f145415g = this.f145424g;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                valueParameter.f145416h = this.f145425h;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                valueParameter.f145417i = this.f145426i;
                if ((i10 & 32) == 32) {
                    i11 |= 32;
                }
                valueParameter.f145418j = this.f145427j;
                valueParameter.f145412d = i11;
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
                o(m().e(valueParameter.f145411c));
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
            this.f145413e = 0;
            this.f145414f = 0;
            this.f145415g = Type.Y();
            this.f145416h = 0;
            this.f145417i = Type.Y();
            this.f145418j = 0;
        }

        static {
            ValueParameter valueParameter = new ValueParameter(true);
            f145409m = valueParameter;
            valueParameter.X();
        }

        public static ValueParameter J() {
            return f145409m;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public ValueParameter e() {
            return f145409m;
        }

        public int L() {
            return this.f145413e;
        }

        public int M() {
            return this.f145414f;
        }

        public Type N() {
            return this.f145415g;
        }

        public int O() {
            return this.f145416h;
        }

        public Type P() {
            return this.f145417i;
        }

        public int Q() {
            return this.f145418j;
        }

        public boolean R() {
            return (this.f145412d & 1) == 1;
        }

        public boolean S() {
            return (this.f145412d & 2) == 2;
        }

        public boolean T() {
            return (this.f145412d & 4) == 4;
        }

        public boolean U() {
            return (this.f145412d & 8) == 8;
        }

        public boolean V() {
            return (this.f145412d & 16) == 16;
        }

        public boolean W() {
            return (this.f145412d & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145419k;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!S()) {
                this.f145419k = (byte) 0;
                return false;
            }
            if (T() && !N().a()) {
                this.f145419k = (byte) 0;
                return false;
            }
            if (V() && !P().a()) {
                this.f145419k = (byte) 0;
                return false;
            }
            if (s()) {
                this.f145419k = (byte) 1;
                return true;
            }
            this.f145419k = (byte) 0;
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145420l;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145412d & 1) == 1 ? CodedOutputStream.o(1, this.f145413e) : 0;
            if ((this.f145412d & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f145414f);
            }
            if ((this.f145412d & 4) == 4) {
                iO += CodedOutputStream.s(3, this.f145415g);
            }
            if ((this.f145412d & 16) == 16) {
                iO += CodedOutputStream.s(4, this.f145417i);
            }
            if ((this.f145412d & 8) == 8) {
                iO += CodedOutputStream.o(5, this.f145416h);
            }
            if ((this.f145412d & 32) == 32) {
                iO += CodedOutputStream.o(6, this.f145418j);
            }
            int iT = iO + t() + this.f145411c.size();
            this.f145420l = iT;
            return iT;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<ValueParameter> f() {
            return f145410n;
        }

        private ValueParameter(GeneratedMessageLite.ExtendableBuilder<ValueParameter, ?> extendableBuilder) {
            super(extendableBuilder);
            this.f145419k = (byte) -1;
            this.f145420l = -1;
            this.f145411c = extendableBuilder.m();
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
            if ((this.f145412d & 1) == 1) {
                codedOutputStream.a0(1, this.f145413e);
            }
            if ((this.f145412d & 2) == 2) {
                codedOutputStream.a0(2, this.f145414f);
            }
            if ((this.f145412d & 4) == 4) {
                codedOutputStream.d0(3, this.f145415g);
            }
            if ((this.f145412d & 16) == 16) {
                codedOutputStream.d0(4, this.f145417i);
            }
            if ((this.f145412d & 8) == 8) {
                codedOutputStream.a0(5, this.f145416h);
            }
            if ((this.f145412d & 32) == 32) {
                codedOutputStream.a0(6, this.f145418j);
            }
            extensionWriterZ.a(HttpResponseStatus.SUCCESS_OK, codedOutputStream);
            codedOutputStream.i0(this.f145411c);
        }

        private ValueParameter(boolean z10) {
            this.f145419k = (byte) -1;
            this.f145420l = -1;
            this.f145411c = ByteString.f145819a;
        }

        private ValueParameter(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            Type.Builder builderB;
            this.f145419k = (byte) -1;
            this.f145420l = -1;
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
                                this.f145412d |= 1;
                                this.f145413e = codedInputStream.s();
                            } else if (iK != 16) {
                                if (iK == 26) {
                                    builderB = (this.f145412d & 4) == 4 ? this.f145415g.b() : null;
                                    Type type = (Type) codedInputStream.u(Type.f145291v, extensionRegistryLite);
                                    this.f145415g = type;
                                    if (builderB != null) {
                                        builderB.n(type);
                                        this.f145415g = builderB.w();
                                    }
                                    this.f145412d |= 4;
                                } else if (iK == 34) {
                                    builderB = (this.f145412d & 16) == 16 ? this.f145417i.b() : null;
                                    Type type2 = (Type) codedInputStream.u(Type.f145291v, extensionRegistryLite);
                                    this.f145417i = type2;
                                    if (builderB != null) {
                                        builderB.n(type2);
                                        this.f145417i = builderB.w();
                                    }
                                    this.f145412d |= 16;
                                } else if (iK == 40) {
                                    this.f145412d |= 8;
                                    this.f145416h = codedInputStream.s();
                                } else if (iK != 48) {
                                    if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                    }
                                } else {
                                    this.f145412d |= 32;
                                    this.f145418j = codedInputStream.s();
                                }
                            } else {
                                this.f145412d |= 2;
                                this.f145414f = codedInputStream.s();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145411c = outputT.g();
                            throw th3;
                        }
                        this.f145411c = outputT.g();
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
                this.f145411c = outputT.g();
                throw th4;
            }
            this.f145411c = outputT.g();
            m();
        }
    }

    public interface ValueParameterOrBuilder extends GeneratedMessageLite.ExtendableMessageOrBuilder {
    }

    public static final class VersionRequirement extends GeneratedMessageLite implements VersionRequirementOrBuilder {

        /* renamed from: l, reason: collision with root package name */
        private static final VersionRequirement f145428l;

        /* renamed from: m, reason: collision with root package name */
        public static Parser<VersionRequirement> f145429m = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145430b;

        /* renamed from: c, reason: collision with root package name */
        private int f145431c;

        /* renamed from: d, reason: collision with root package name */
        private int f145432d;

        /* renamed from: e, reason: collision with root package name */
        private int f145433e;

        /* renamed from: f, reason: collision with root package name */
        private Level f145434f;

        /* renamed from: g, reason: collision with root package name */
        private int f145435g;

        /* renamed from: h, reason: collision with root package name */
        private int f145436h;

        /* renamed from: i, reason: collision with root package name */
        private VersionKind f145437i;

        /* renamed from: j, reason: collision with root package name */
        private byte f145438j;

        /* renamed from: k, reason: collision with root package name */
        private int f145439k;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirement, Builder> implements VersionRequirementOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145440b;

            /* renamed from: c, reason: collision with root package name */
            private int f145441c;

            /* renamed from: d, reason: collision with root package name */
            private int f145442d;

            /* renamed from: f, reason: collision with root package name */
            private int f145444f;

            /* renamed from: g, reason: collision with root package name */
            private int f145445g;

            /* renamed from: e, reason: collision with root package name */
            private Level f145443e = Level.ERROR;

            /* renamed from: h, reason: collision with root package name */
            private VersionKind f145446h = VersionKind.LANGUAGE_VERSION;

            private void u() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.f145429m     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirement.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            public Builder A(int i10) {
                this.f145440b |= 1;
                this.f145441c = i10;
                return this;
            }

            public Builder C(int i10) {
                this.f145440b |= 2;
                this.f145442d = i10;
                return this;
            }

            public VersionRequirement r() {
                VersionRequirement versionRequirement = new VersionRequirement(this);
                int i10 = this.f145440b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                versionRequirement.f145432d = this.f145441c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                versionRequirement.f145433e = this.f145442d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                versionRequirement.f145434f = this.f145443e;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                versionRequirement.f145435g = this.f145444f;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                versionRequirement.f145436h = this.f145445g;
                if ((i10 & 32) == 32) {
                    i11 |= 32;
                }
                versionRequirement.f145437i = this.f145446h;
                versionRequirement.f145431c = i11;
                return versionRequirement;
            }

            public Builder x(int i10) {
                this.f145440b |= 8;
                this.f145444f = i10;
                return this;
            }

            public Builder z(int i10) {
                this.f145440b |= 16;
                this.f145445g = i10;
                return this;
            }

            private Builder() {
                u();
            }

            public Builder D(VersionKind versionKind) {
                versionKind.getClass();
                this.f145440b |= 32;
                this.f145446h = versionKind;
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
                o(m().e(versionRequirement.f145430b));
                return this;
            }

            public Builder y(Level level) {
                level.getClass();
                this.f145440b |= 4;
                this.f145443e = level;
                return this;
            }
        }

        public enum Level implements Internal.EnumLite {
            WARNING(0, 0),
            ERROR(1, 1),
            HIDDEN(2, 2);


            /* renamed from: e, reason: collision with root package name */
            private static Internal.EnumLiteMap<Level> f145450e = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f145452a;

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
                return this.f145452a;
            }

            Level(int i10, int i11) {
                this.f145452a = i11;
            }
        }

        public enum VersionKind implements Internal.EnumLite {
            LANGUAGE_VERSION(0, 0),
            COMPILER_VERSION(1, 1),
            API_VERSION(2, 2);


            /* renamed from: e, reason: collision with root package name */
            private static Internal.EnumLiteMap<VersionKind> f145456e = new a();

            /* renamed from: a, reason: collision with root package name */
            private final int f145458a;

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
                return this.f145458a;
            }

            VersionKind(int i10, int i11) {
                this.f145458a = i11;
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
            this.f145432d = 0;
            this.f145433e = 0;
            this.f145434f = Level.ERROR;
            this.f145435g = 0;
            this.f145436h = 0;
            this.f145437i = VersionKind.LANGUAGE_VERSION;
        }

        static {
            VersionRequirement versionRequirement = new VersionRequirement(true);
            f145428l = versionRequirement;
            versionRequirement.N();
        }

        public static VersionRequirement A() {
            return f145428l;
        }

        public int B() {
            return this.f145435g;
        }

        public Level C() {
            return this.f145434f;
        }

        public int D() {
            return this.f145436h;
        }

        public int E() {
            return this.f145432d;
        }

        public int F() {
            return this.f145433e;
        }

        public VersionKind G() {
            return this.f145437i;
        }

        public boolean H() {
            return (this.f145431c & 8) == 8;
        }

        public boolean I() {
            return (this.f145431c & 4) == 4;
        }

        public boolean J() {
            return (this.f145431c & 16) == 16;
        }

        public boolean K() {
            return (this.f145431c & 1) == 1;
        }

        public boolean L() {
            return (this.f145431c & 2) == 2;
        }

        public boolean M() {
            return (this.f145431c & 32) == 32;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145438j;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f145438j = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145439k;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145431c & 1) == 1 ? CodedOutputStream.o(1, this.f145432d) : 0;
            if ((this.f145431c & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f145433e);
            }
            if ((this.f145431c & 4) == 4) {
                iO += CodedOutputStream.h(3, this.f145434f.g());
            }
            if ((this.f145431c & 8) == 8) {
                iO += CodedOutputStream.o(4, this.f145435g);
            }
            if ((this.f145431c & 16) == 16) {
                iO += CodedOutputStream.o(5, this.f145436h);
            }
            if ((this.f145431c & 32) == 32) {
                iO += CodedOutputStream.h(6, this.f145437i.g());
            }
            int size = iO + this.f145430b.size();
            this.f145439k = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirement> f() {
            return f145429m;
        }

        private VersionRequirement(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145438j = (byte) -1;
            this.f145439k = -1;
            this.f145430b = builder.m();
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
            if ((this.f145431c & 1) == 1) {
                codedOutputStream.a0(1, this.f145432d);
            }
            if ((this.f145431c & 2) == 2) {
                codedOutputStream.a0(2, this.f145433e);
            }
            if ((this.f145431c & 4) == 4) {
                codedOutputStream.S(3, this.f145434f.g());
            }
            if ((this.f145431c & 8) == 8) {
                codedOutputStream.a0(4, this.f145435g);
            }
            if ((this.f145431c & 16) == 16) {
                codedOutputStream.a0(5, this.f145436h);
            }
            if ((this.f145431c & 32) == 32) {
                codedOutputStream.S(6, this.f145437i.g());
            }
            codedOutputStream.i0(this.f145430b);
        }

        private VersionRequirement(boolean z10) {
            this.f145438j = (byte) -1;
            this.f145439k = -1;
            this.f145430b = ByteString.f145819a;
        }

        private VersionRequirement(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145438j = (byte) -1;
            this.f145439k = -1;
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
                                this.f145431c |= 1;
                                this.f145432d = codedInputStream.s();
                            } else if (iK == 16) {
                                this.f145431c |= 2;
                                this.f145433e = codedInputStream.s();
                            } else if (iK == 24) {
                                int iN = codedInputStream.n();
                                Level levelA = Level.a(iN);
                                if (levelA == null) {
                                    codedOutputStreamJ.o0(iK);
                                    codedOutputStreamJ.o0(iN);
                                } else {
                                    this.f145431c |= 4;
                                    this.f145434f = levelA;
                                }
                            } else if (iK == 32) {
                                this.f145431c |= 8;
                                this.f145435g = codedInputStream.s();
                            } else if (iK == 40) {
                                this.f145431c |= 16;
                                this.f145436h = codedInputStream.s();
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
                                    this.f145431c |= 32;
                                    this.f145437i = versionKindA;
                                }
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145430b = outputT.g();
                            throw th3;
                        }
                        this.f145430b = outputT.g();
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
                this.f145430b = outputT.g();
                throw th4;
            }
            this.f145430b = outputT.g();
            m();
        }
    }

    public interface VersionRequirementOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class VersionRequirementTable extends GeneratedMessageLite implements VersionRequirementTableOrBuilder {

        /* renamed from: f, reason: collision with root package name */
        private static final VersionRequirementTable f145459f;

        /* renamed from: g, reason: collision with root package name */
        public static Parser<VersionRequirementTable> f145460g = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145461b;

        /* renamed from: c, reason: collision with root package name */
        private List<VersionRequirement> f145462c;

        /* renamed from: d, reason: collision with root package name */
        private byte f145463d;

        /* renamed from: e, reason: collision with root package name */
        private int f145464e;

        public static final class Builder extends GeneratedMessageLite.Builder<VersionRequirementTable, Builder> implements VersionRequirementTableOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145465b;

            /* renamed from: c, reason: collision with root package name */
            private List<VersionRequirement> f145466c = Collections.EMPTY_LIST;

            private void v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.f145460g     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.VersionRequirementTable.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f145465b & 1) != 1) {
                    this.f145466c = new ArrayList(this.f145466c);
                    this.f145465b |= 1;
                }
            }

            public VersionRequirementTable r() {
                VersionRequirementTable versionRequirementTable = new VersionRequirementTable(this);
                if ((this.f145465b & 1) == 1) {
                    this.f145466c = Collections.unmodifiableList(this.f145466c);
                    this.f145465b &= -2;
                }
                versionRequirementTable.f145462c = this.f145466c;
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
                if (!versionRequirementTable.f145462c.isEmpty()) {
                    if (this.f145466c.isEmpty()) {
                        this.f145466c = versionRequirementTable.f145462c;
                        this.f145465b &= -2;
                    } else {
                        u();
                        this.f145466c.addAll(versionRequirementTable.f145462c);
                    }
                }
                o(m().e(versionRequirementTable.f145461b));
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
            f145459f = versionRequirementTable;
            versionRequirementTable.y();
        }

        public static VersionRequirementTable u() {
            return f145459f;
        }

        private void y() {
            this.f145462c = Collections.EMPTY_LIST;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145463d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f145463d = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145464e;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f145462c.size(); i11++) {
                iS += CodedOutputStream.s(1, this.f145462c.get(i11));
            }
            int size = iS + this.f145461b.size();
            this.f145464e = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<VersionRequirementTable> f() {
            return f145460g;
        }

        public int v() {
            return this.f145462c.size();
        }

        public List<VersionRequirement> x() {
            return this.f145462c;
        }

        private VersionRequirementTable(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145463d = (byte) -1;
            this.f145464e = -1;
            this.f145461b = builder.m();
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
            for (int i10 = 0; i10 < this.f145462c.size(); i10++) {
                codedOutputStream.d0(1, this.f145462c.get(i10));
            }
            codedOutputStream.i0(this.f145461b);
        }

        private VersionRequirementTable(boolean z10) {
            this.f145463d = (byte) -1;
            this.f145464e = -1;
            this.f145461b = ByteString.f145819a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private VersionRequirementTable(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145463d = (byte) -1;
            this.f145464e = -1;
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
                                        this.f145462c = new ArrayList();
                                        z11 = true;
                                    }
                                    this.f145462c.add(codedInputStream.u(VersionRequirement.f145429m, extensionRegistryLite));
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
                        this.f145462c = Collections.unmodifiableList(this.f145462c);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f145461b = outputT.g();
                        throw th3;
                    }
                    this.f145461b = outputT.g();
                    m();
                    throw th2;
                }
            }
            if (z11) {
                this.f145462c = Collections.unmodifiableList(this.f145462c);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145461b = outputT.g();
                throw th4;
            }
            this.f145461b = outputT.g();
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
        private static Internal.EnumLiteMap<Visibility> f145473h = new a();

        /* renamed from: a, reason: collision with root package name */
        private final int f145475a;

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
            return this.f145475a;
        }

        Visibility(int i10, int i11) {
            this.f145475a = i11;
        }
    }
}
