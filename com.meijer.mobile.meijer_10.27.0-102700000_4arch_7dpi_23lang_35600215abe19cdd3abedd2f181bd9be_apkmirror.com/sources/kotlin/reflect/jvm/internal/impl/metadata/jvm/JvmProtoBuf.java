package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* loaded from: classes13.dex */
public final class JvmProtoBuf {

    /* renamed from: a, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmMethodSignature> f145553a;

    /* renamed from: b, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmMethodSignature> f145554b;

    /* renamed from: c, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, Integer> f145555c;

    /* renamed from: d, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmPropertySignature> f145556d;

    /* renamed from: e, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, Integer> f145557e;

    /* renamed from: f, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> f145558f;

    /* renamed from: g, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, Boolean> f145559g;

    /* renamed from: h, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f145560h;

    /* renamed from: i, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> f145561i;

    /* renamed from: j, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> f145562j;

    /* renamed from: k, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> f145563k;

    /* renamed from: l, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> f145564l;

    /* renamed from: m, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> f145565m;

    /* renamed from: n, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> f145566n;

    public static final class JvmFieldSignature extends GeneratedMessageLite implements JvmFieldSignatureOrBuilder {

        /* renamed from: h, reason: collision with root package name */
        private static final JvmFieldSignature f145567h;

        /* renamed from: i, reason: collision with root package name */
        public static Parser<JvmFieldSignature> f145568i = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145569b;

        /* renamed from: c, reason: collision with root package name */
        private int f145570c;

        /* renamed from: d, reason: collision with root package name */
        private int f145571d;

        /* renamed from: e, reason: collision with root package name */
        private int f145572e;

        /* renamed from: f, reason: collision with root package name */
        private byte f145573f;

        /* renamed from: g, reason: collision with root package name */
        private int f145574g;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmFieldSignature, Builder> implements JvmFieldSignatureOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145575b;

            /* renamed from: c, reason: collision with root package name */
            private int f145576c;

            /* renamed from: d, reason: collision with root package name */
            private int f145577d;

            private void u() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.f145568i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            public JvmFieldSignature r() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i10 = this.f145575b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                jvmFieldSignature.f145571d = this.f145576c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmFieldSignature.f145572e = this.f145577d;
                jvmFieldSignature.f145570c = i11;
                return jvmFieldSignature;
            }

            public Builder x(int i10) {
                this.f145575b |= 2;
                this.f145577d = i10;
                return this;
            }

            public Builder y(int i10) {
                this.f145575b |= 1;
                this.f145576c = i10;
                return this;
            }

            private Builder() {
                u();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public JvmFieldSignature build() {
                JvmFieldSignature jvmFieldSignatureR = r();
                if (jvmFieldSignatureR.a()) {
                    return jvmFieldSignatureR;
                }
                throw AbstractMessageLite.Builder.k(jvmFieldSignatureR);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return t().n(r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public Builder n(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.v()) {
                    return this;
                }
                if (jvmFieldSignature.A()) {
                    y(jvmFieldSignature.y());
                }
                if (jvmFieldSignature.z()) {
                    x(jvmFieldSignature.x());
                }
                o(m().e(jvmFieldSignature.f145569b));
                return this;
            }
        }

        static class a extends AbstractParser<JvmFieldSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public JvmFieldSignature c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmFieldSignature(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        private void B() {
            this.f145571d = 0;
            this.f145572e = 0;
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(true);
            f145567h = jvmFieldSignature;
            jvmFieldSignature.B();
        }

        public static JvmFieldSignature v() {
            return f145567h;
        }

        public boolean A() {
            return (this.f145570c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145573f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f145573f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145574g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145570c & 1) == 1 ? CodedOutputStream.o(1, this.f145571d) : 0;
            if ((this.f145570c & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f145572e);
            }
            int size = iO + this.f145569b.size();
            this.f145574g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmFieldSignature> f() {
            return f145568i;
        }

        public int x() {
            return this.f145572e;
        }

        public int y() {
            return this.f145571d;
        }

        public boolean z() {
            return (this.f145570c & 2) == 2;
        }

        private JvmFieldSignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145573f = (byte) -1;
            this.f145574g = -1;
            this.f145569b = builder.m();
        }

        public static Builder C() {
            return Builder.t();
        }

        public static Builder D(JvmFieldSignature jvmFieldSignature) {
            return C().n(jvmFieldSignature);
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
            if ((this.f145570c & 1) == 1) {
                codedOutputStream.a0(1, this.f145571d);
            }
            if ((this.f145570c & 2) == 2) {
                codedOutputStream.a0(2, this.f145572e);
            }
            codedOutputStream.i0(this.f145569b);
        }

        private JvmFieldSignature(boolean z10) {
            this.f145573f = (byte) -1;
            this.f145574g = -1;
            this.f145569b = ByteString.f145819a;
        }

        private JvmFieldSignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145573f = (byte) -1;
            this.f145574g = -1;
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
                                this.f145570c |= 1;
                                this.f145571d = codedInputStream.s();
                            } else if (iK != 16) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                this.f145570c |= 2;
                                this.f145572e = codedInputStream.s();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145569b = outputT.g();
                            throw th3;
                        }
                        this.f145569b = outputT.g();
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
                this.f145569b = outputT.g();
                throw th4;
            }
            this.f145569b = outputT.g();
            m();
        }
    }

    public interface JvmFieldSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements JvmMethodSignatureOrBuilder {

        /* renamed from: h, reason: collision with root package name */
        private static final JvmMethodSignature f145578h;

        /* renamed from: i, reason: collision with root package name */
        public static Parser<JvmMethodSignature> f145579i = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145580b;

        /* renamed from: c, reason: collision with root package name */
        private int f145581c;

        /* renamed from: d, reason: collision with root package name */
        private int f145582d;

        /* renamed from: e, reason: collision with root package name */
        private int f145583e;

        /* renamed from: f, reason: collision with root package name */
        private byte f145584f;

        /* renamed from: g, reason: collision with root package name */
        private int f145585g;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmMethodSignature, Builder> implements JvmMethodSignatureOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145586b;

            /* renamed from: c, reason: collision with root package name */
            private int f145587c;

            /* renamed from: d, reason: collision with root package name */
            private int f145588d;

            private void u() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.f145579i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            public JvmMethodSignature r() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i10 = this.f145586b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                jvmMethodSignature.f145582d = this.f145587c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmMethodSignature.f145583e = this.f145588d;
                jvmMethodSignature.f145581c = i11;
                return jvmMethodSignature;
            }

            public Builder x(int i10) {
                this.f145586b |= 2;
                this.f145588d = i10;
                return this;
            }

            public Builder y(int i10) {
                this.f145586b |= 1;
                this.f145587c = i10;
                return this;
            }

            private Builder() {
                u();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public JvmMethodSignature build() {
                JvmMethodSignature jvmMethodSignatureR = r();
                if (jvmMethodSignatureR.a()) {
                    return jvmMethodSignatureR;
                }
                throw AbstractMessageLite.Builder.k(jvmMethodSignatureR);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return t().n(r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public Builder n(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.v()) {
                    return this;
                }
                if (jvmMethodSignature.A()) {
                    y(jvmMethodSignature.y());
                }
                if (jvmMethodSignature.z()) {
                    x(jvmMethodSignature.x());
                }
                o(m().e(jvmMethodSignature.f145580b));
                return this;
            }
        }

        static class a extends AbstractParser<JvmMethodSignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public JvmMethodSignature c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmMethodSignature(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        private void B() {
            this.f145582d = 0;
            this.f145583e = 0;
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(true);
            f145578h = jvmMethodSignature;
            jvmMethodSignature.B();
        }

        public static JvmMethodSignature v() {
            return f145578h;
        }

        public boolean A() {
            return (this.f145581c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145584f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f145584f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145585g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f145581c & 1) == 1 ? CodedOutputStream.o(1, this.f145582d) : 0;
            if ((this.f145581c & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f145583e);
            }
            int size = iO + this.f145580b.size();
            this.f145585g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmMethodSignature> f() {
            return f145579i;
        }

        public int x() {
            return this.f145583e;
        }

        public int y() {
            return this.f145582d;
        }

        public boolean z() {
            return (this.f145581c & 2) == 2;
        }

        private JvmMethodSignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145584f = (byte) -1;
            this.f145585g = -1;
            this.f145580b = builder.m();
        }

        public static Builder C() {
            return Builder.t();
        }

        public static Builder D(JvmMethodSignature jvmMethodSignature) {
            return C().n(jvmMethodSignature);
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
            if ((this.f145581c & 1) == 1) {
                codedOutputStream.a0(1, this.f145582d);
            }
            if ((this.f145581c & 2) == 2) {
                codedOutputStream.a0(2, this.f145583e);
            }
            codedOutputStream.i0(this.f145580b);
        }

        private JvmMethodSignature(boolean z10) {
            this.f145584f = (byte) -1;
            this.f145585g = -1;
            this.f145580b = ByteString.f145819a;
        }

        private JvmMethodSignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145584f = (byte) -1;
            this.f145585g = -1;
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
                                this.f145581c |= 1;
                                this.f145582d = codedInputStream.s();
                            } else if (iK != 16) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                this.f145581c |= 2;
                                this.f145583e = codedInputStream.s();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145580b = outputT.g();
                            throw th3;
                        }
                        this.f145580b = outputT.g();
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
                this.f145580b = outputT.g();
                throw th4;
            }
            this.f145580b = outputT.g();
            m();
        }
    }

    public interface JvmMethodSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements JvmPropertySignatureOrBuilder {

        /* renamed from: k, reason: collision with root package name */
        private static final JvmPropertySignature f145589k;

        /* renamed from: l, reason: collision with root package name */
        public static Parser<JvmPropertySignature> f145590l = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145591b;

        /* renamed from: c, reason: collision with root package name */
        private int f145592c;

        /* renamed from: d, reason: collision with root package name */
        private JvmFieldSignature f145593d;

        /* renamed from: e, reason: collision with root package name */
        private JvmMethodSignature f145594e;

        /* renamed from: f, reason: collision with root package name */
        private JvmMethodSignature f145595f;

        /* renamed from: g, reason: collision with root package name */
        private JvmMethodSignature f145596g;

        /* renamed from: h, reason: collision with root package name */
        private JvmMethodSignature f145597h;

        /* renamed from: i, reason: collision with root package name */
        private byte f145598i;

        /* renamed from: j, reason: collision with root package name */
        private int f145599j;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmPropertySignature, Builder> implements JvmPropertySignatureOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145600b;

            /* renamed from: c, reason: collision with root package name */
            private JvmFieldSignature f145601c = JvmFieldSignature.v();

            /* renamed from: d, reason: collision with root package name */
            private JvmMethodSignature f145602d = JvmMethodSignature.v();

            /* renamed from: e, reason: collision with root package name */
            private JvmMethodSignature f145603e = JvmMethodSignature.v();

            /* renamed from: f, reason: collision with root package name */
            private JvmMethodSignature f145604f = JvmMethodSignature.v();

            /* renamed from: g, reason: collision with root package name */
            private JvmMethodSignature f145605g = JvmMethodSignature.v();

            private void u() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.f145590l     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            public Builder A(JvmMethodSignature jvmMethodSignature) {
                if ((this.f145600b & 8) != 8 || this.f145604f == JvmMethodSignature.v()) {
                    this.f145604f = jvmMethodSignature;
                } else {
                    this.f145604f = JvmMethodSignature.D(this.f145604f).n(jvmMethodSignature).r();
                }
                this.f145600b |= 8;
                return this;
            }

            public Builder C(JvmMethodSignature jvmMethodSignature) {
                if ((this.f145600b & 2) != 2 || this.f145602d == JvmMethodSignature.v()) {
                    this.f145602d = jvmMethodSignature;
                } else {
                    this.f145602d = JvmMethodSignature.D(this.f145602d).n(jvmMethodSignature).r();
                }
                this.f145600b |= 2;
                return this;
            }

            public JvmPropertySignature r() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i10 = this.f145600b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                jvmPropertySignature.f145593d = this.f145601c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmPropertySignature.f145594e = this.f145602d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                jvmPropertySignature.f145595f = this.f145603e;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                jvmPropertySignature.f145596g = this.f145604f;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                jvmPropertySignature.f145597h = this.f145605g;
                jvmPropertySignature.f145592c = i11;
                return jvmPropertySignature;
            }

            public Builder v(JvmMethodSignature jvmMethodSignature) {
                if ((this.f145600b & 16) != 16 || this.f145605g == JvmMethodSignature.v()) {
                    this.f145605g = jvmMethodSignature;
                } else {
                    this.f145605g = JvmMethodSignature.D(this.f145605g).n(jvmMethodSignature).r();
                }
                this.f145600b |= 16;
                return this;
            }

            public Builder w(JvmFieldSignature jvmFieldSignature) {
                if ((this.f145600b & 1) != 1 || this.f145601c == JvmFieldSignature.v()) {
                    this.f145601c = jvmFieldSignature;
                } else {
                    this.f145601c = JvmFieldSignature.D(this.f145601c).n(jvmFieldSignature).r();
                }
                this.f145600b |= 1;
                return this;
            }

            public Builder z(JvmMethodSignature jvmMethodSignature) {
                if ((this.f145600b & 4) != 4 || this.f145603e == JvmMethodSignature.v()) {
                    this.f145603e = jvmMethodSignature;
                } else {
                    this.f145603e = JvmMethodSignature.D(this.f145603e).n(jvmMethodSignature).r();
                }
                this.f145600b |= 4;
                return this;
            }

            private Builder() {
                u();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public JvmPropertySignature build() {
                JvmPropertySignature jvmPropertySignatureR = r();
                if (jvmPropertySignatureR.a()) {
                    return jvmPropertySignatureR;
                }
                throw AbstractMessageLite.Builder.k(jvmPropertySignatureR);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return t().n(r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder n(JvmPropertySignature jvmPropertySignature) {
                if (jvmPropertySignature == JvmPropertySignature.z()) {
                    return this;
                }
                if (jvmPropertySignature.G()) {
                    w(jvmPropertySignature.B());
                }
                if (jvmPropertySignature.J()) {
                    C(jvmPropertySignature.E());
                }
                if (jvmPropertySignature.H()) {
                    z(jvmPropertySignature.C());
                }
                if (jvmPropertySignature.I()) {
                    A(jvmPropertySignature.D());
                }
                if (jvmPropertySignature.F()) {
                    v(jvmPropertySignature.A());
                }
                o(m().e(jvmPropertySignature.f145591b));
                return this;
            }
        }

        static class a extends AbstractParser<JvmPropertySignature> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public JvmPropertySignature c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new JvmPropertySignature(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(true);
            f145589k = jvmPropertySignature;
            jvmPropertySignature.K();
        }

        public static JvmPropertySignature z() {
            return f145589k;
        }

        public JvmMethodSignature A() {
            return this.f145597h;
        }

        public JvmFieldSignature B() {
            return this.f145593d;
        }

        public JvmMethodSignature C() {
            return this.f145595f;
        }

        public JvmMethodSignature D() {
            return this.f145596g;
        }

        public JvmMethodSignature E() {
            return this.f145594e;
        }

        public boolean F() {
            return (this.f145592c & 16) == 16;
        }

        public boolean G() {
            return (this.f145592c & 1) == 1;
        }

        public boolean H() {
            return (this.f145592c & 4) == 4;
        }

        public boolean I() {
            return (this.f145592c & 8) == 8;
        }

        public boolean J() {
            return (this.f145592c & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145598i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f145598i = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145599j;
            if (i10 != -1) {
                return i10;
            }
            int iS = (this.f145592c & 1) == 1 ? CodedOutputStream.s(1, this.f145593d) : 0;
            if ((this.f145592c & 2) == 2) {
                iS += CodedOutputStream.s(2, this.f145594e);
            }
            if ((this.f145592c & 4) == 4) {
                iS += CodedOutputStream.s(3, this.f145595f);
            }
            if ((this.f145592c & 8) == 8) {
                iS += CodedOutputStream.s(4, this.f145596g);
            }
            if ((this.f145592c & 16) == 16) {
                iS += CodedOutputStream.s(5, this.f145597h);
            }
            int size = iS + this.f145591b.size();
            this.f145599j = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmPropertySignature> f() {
            return f145590l;
        }

        private JvmPropertySignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145598i = (byte) -1;
            this.f145599j = -1;
            this.f145591b = builder.m();
        }

        private void K() {
            this.f145593d = JvmFieldSignature.v();
            this.f145594e = JvmMethodSignature.v();
            this.f145595f = JvmMethodSignature.v();
            this.f145596g = JvmMethodSignature.v();
            this.f145597h = JvmMethodSignature.v();
        }

        public static Builder L() {
            return Builder.t();
        }

        public static Builder M(JvmPropertySignature jvmPropertySignature) {
            return L().n(jvmPropertySignature);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return L();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return M(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            if ((this.f145592c & 1) == 1) {
                codedOutputStream.d0(1, this.f145593d);
            }
            if ((this.f145592c & 2) == 2) {
                codedOutputStream.d0(2, this.f145594e);
            }
            if ((this.f145592c & 4) == 4) {
                codedOutputStream.d0(3, this.f145595f);
            }
            if ((this.f145592c & 8) == 8) {
                codedOutputStream.d0(4, this.f145596g);
            }
            if ((this.f145592c & 16) == 16) {
                codedOutputStream.d0(5, this.f145597h);
            }
            codedOutputStream.i0(this.f145591b);
        }

        private JvmPropertySignature(boolean z10) {
            this.f145598i = (byte) -1;
            this.f145599j = -1;
            this.f145591b = ByteString.f145819a;
        }

        private JvmPropertySignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145598i = (byte) -1;
            this.f145599j = -1;
            K();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int iK = codedInputStream.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                JvmFieldSignature.Builder builderB = (this.f145592c & 1) == 1 ? this.f145593d.b() : null;
                                JvmFieldSignature jvmFieldSignature = (JvmFieldSignature) codedInputStream.u(JvmFieldSignature.f145568i, extensionRegistryLite);
                                this.f145593d = jvmFieldSignature;
                                if (builderB != null) {
                                    builderB.n(jvmFieldSignature);
                                    this.f145593d = builderB.r();
                                }
                                this.f145592c |= 1;
                            } else if (iK == 18) {
                                JvmMethodSignature.Builder builderB2 = (this.f145592c & 2) == 2 ? this.f145594e.b() : null;
                                JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) codedInputStream.u(JvmMethodSignature.f145579i, extensionRegistryLite);
                                this.f145594e = jvmMethodSignature;
                                if (builderB2 != null) {
                                    builderB2.n(jvmMethodSignature);
                                    this.f145594e = builderB2.r();
                                }
                                this.f145592c |= 2;
                            } else if (iK == 26) {
                                JvmMethodSignature.Builder builderB3 = (this.f145592c & 4) == 4 ? this.f145595f.b() : null;
                                JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) codedInputStream.u(JvmMethodSignature.f145579i, extensionRegistryLite);
                                this.f145595f = jvmMethodSignature2;
                                if (builderB3 != null) {
                                    builderB3.n(jvmMethodSignature2);
                                    this.f145595f = builderB3.r();
                                }
                                this.f145592c |= 4;
                            } else if (iK == 34) {
                                JvmMethodSignature.Builder builderB4 = (this.f145592c & 8) == 8 ? this.f145596g.b() : null;
                                JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) codedInputStream.u(JvmMethodSignature.f145579i, extensionRegistryLite);
                                this.f145596g = jvmMethodSignature3;
                                if (builderB4 != null) {
                                    builderB4.n(jvmMethodSignature3);
                                    this.f145596g = builderB4.r();
                                }
                                this.f145592c |= 8;
                            } else if (iK != 42) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                JvmMethodSignature.Builder builderB5 = (this.f145592c & 16) == 16 ? this.f145597h.b() : null;
                                JvmMethodSignature jvmMethodSignature4 = (JvmMethodSignature) codedInputStream.u(JvmMethodSignature.f145579i, extensionRegistryLite);
                                this.f145597h = jvmMethodSignature4;
                                if (builderB5 != null) {
                                    builderB5.n(jvmMethodSignature4);
                                    this.f145597h = builderB5.r();
                                }
                                this.f145592c |= 16;
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f145591b = outputT.g();
                            throw th3;
                        }
                        this.f145591b = outputT.g();
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
                this.f145591b = outputT.g();
                throw th4;
            }
            this.f145591b = outputT.g();
            m();
        }
    }

    public interface JvmPropertySignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements StringTableTypesOrBuilder {

        /* renamed from: h, reason: collision with root package name */
        private static final StringTableTypes f145606h;

        /* renamed from: i, reason: collision with root package name */
        public static Parser<StringTableTypes> f145607i = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f145608b;

        /* renamed from: c, reason: collision with root package name */
        private List<Record> f145609c;

        /* renamed from: d, reason: collision with root package name */
        private List<Integer> f145610d;

        /* renamed from: e, reason: collision with root package name */
        private int f145611e;

        /* renamed from: f, reason: collision with root package name */
        private byte f145612f;

        /* renamed from: g, reason: collision with root package name */
        private int f145613g;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTableTypes, Builder> implements StringTableTypesOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f145614b;

            /* renamed from: c, reason: collision with root package name */
            private List<Record> f145615c;

            /* renamed from: d, reason: collision with root package name */
            private List<Integer> f145616d;

            private void w() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.f145607i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f145614b & 2) != 2) {
                    this.f145616d = new ArrayList(this.f145616d);
                    this.f145614b |= 2;
                }
            }

            private void v() {
                if ((this.f145614b & 1) != 1) {
                    this.f145615c = new ArrayList(this.f145615c);
                    this.f145614b |= 1;
                }
            }

            public StringTableTypes r() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f145614b & 1) == 1) {
                    this.f145615c = Collections.unmodifiableList(this.f145615c);
                    this.f145614b &= -2;
                }
                stringTableTypes.f145609c = this.f145615c;
                if ((this.f145614b & 2) == 2) {
                    this.f145616d = Collections.unmodifiableList(this.f145616d);
                    this.f145614b &= -3;
                }
                stringTableTypes.f145610d = this.f145616d;
                return stringTableTypes;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f145615c = list;
                this.f145616d = list;
                w();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public StringTableTypes build() {
                StringTableTypes stringTableTypesR = r();
                if (stringTableTypesR.a()) {
                    return stringTableTypesR;
                }
                throw AbstractMessageLite.Builder.k(stringTableTypesR);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public Builder r() {
                return t().n(r());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public Builder n(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.x()) {
                    return this;
                }
                if (!stringTableTypes.f145609c.isEmpty()) {
                    if (this.f145615c.isEmpty()) {
                        this.f145615c = stringTableTypes.f145609c;
                        this.f145614b &= -2;
                    } else {
                        v();
                        this.f145615c.addAll(stringTableTypes.f145609c);
                    }
                }
                if (!stringTableTypes.f145610d.isEmpty()) {
                    if (this.f145616d.isEmpty()) {
                        this.f145616d = stringTableTypes.f145610d;
                        this.f145614b &= -3;
                    } else {
                        u();
                        this.f145616d.addAll(stringTableTypes.f145610d);
                    }
                }
                o(m().e(stringTableTypes.f145608b));
                return this;
            }
        }

        public static final class Record extends GeneratedMessageLite implements RecordOrBuilder {

            /* renamed from: n, reason: collision with root package name */
            private static final Record f145617n;

            /* renamed from: o, reason: collision with root package name */
            public static Parser<Record> f145618o = new a();

            /* renamed from: b, reason: collision with root package name */
            private final ByteString f145619b;

            /* renamed from: c, reason: collision with root package name */
            private int f145620c;

            /* renamed from: d, reason: collision with root package name */
            private int f145621d;

            /* renamed from: e, reason: collision with root package name */
            private int f145622e;

            /* renamed from: f, reason: collision with root package name */
            private Object f145623f;

            /* renamed from: g, reason: collision with root package name */
            private Operation f145624g;

            /* renamed from: h, reason: collision with root package name */
            private List<Integer> f145625h;

            /* renamed from: i, reason: collision with root package name */
            private int f145626i;

            /* renamed from: j, reason: collision with root package name */
            private List<Integer> f145627j;

            /* renamed from: k, reason: collision with root package name */
            private int f145628k;

            /* renamed from: l, reason: collision with root package name */
            private byte f145629l;

            /* renamed from: m, reason: collision with root package name */
            private int f145630m;

            public static final class Builder extends GeneratedMessageLite.Builder<Record, Builder> implements RecordOrBuilder {

                /* renamed from: b, reason: collision with root package name */
                private int f145631b;

                /* renamed from: d, reason: collision with root package name */
                private int f145633d;

                /* renamed from: g, reason: collision with root package name */
                private List<Integer> f145636g;

                /* renamed from: h, reason: collision with root package name */
                private List<Integer> f145637h;

                /* renamed from: c, reason: collision with root package name */
                private int f145632c = 1;

                /* renamed from: e, reason: collision with root package name */
                private Object f145634e = "";

                /* renamed from: f, reason: collision with root package name */
                private Operation f145635f = Operation.NONE;

                private void w() {
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.f145618o     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r3 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder.q0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Builder");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder t() {
                    return new Builder();
                }

                private void u() {
                    if ((this.f145631b & 32) != 32) {
                        this.f145637h = new ArrayList(this.f145637h);
                        this.f145631b |= 32;
                    }
                }

                private void v() {
                    if ((this.f145631b & 16) != 16) {
                        this.f145636g = new ArrayList(this.f145636g);
                        this.f145631b |= 16;
                    }
                }

                public Builder A(int i10) {
                    this.f145631b |= 2;
                    this.f145633d = i10;
                    return this;
                }

                public Builder C(int i10) {
                    this.f145631b |= 1;
                    this.f145632c = i10;
                    return this;
                }

                public Record r() {
                    Record record = new Record(this);
                    int i10 = this.f145631b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    record.f145621d = this.f145632c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    record.f145622e = this.f145633d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    record.f145623f = this.f145634e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    record.f145624g = this.f145635f;
                    if ((this.f145631b & 16) == 16) {
                        this.f145636g = Collections.unmodifiableList(this.f145636g);
                        this.f145631b &= -17;
                    }
                    record.f145625h = this.f145636g;
                    if ((this.f145631b & 32) == 32) {
                        this.f145637h = Collections.unmodifiableList(this.f145637h);
                        this.f145631b &= -33;
                    }
                    record.f145627j = this.f145637h;
                    record.f145620c = i11;
                    return record;
                }

                private Builder() {
                    List<Integer> list = Collections.EMPTY_LIST;
                    this.f145636g = list;
                    this.f145637h = list;
                    w();
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public Record build() {
                    Record recordR = r();
                    if (recordR.a()) {
                        return recordR;
                    }
                    throw AbstractMessageLite.Builder.k(recordR);
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public Builder r() {
                    return t().n(r());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public Builder n(Record record) {
                    if (record == Record.D()) {
                        return this;
                    }
                    if (record.P()) {
                        C(record.G());
                    }
                    if (record.O()) {
                        A(record.F());
                    }
                    if (record.Q()) {
                        this.f145631b |= 4;
                        this.f145634e = record.f145623f;
                    }
                    if (record.N()) {
                        z(record.E());
                    }
                    if (!record.f145625h.isEmpty()) {
                        if (this.f145636g.isEmpty()) {
                            this.f145636g = record.f145625h;
                            this.f145631b &= -17;
                        } else {
                            v();
                            this.f145636g.addAll(record.f145625h);
                        }
                    }
                    if (!record.f145627j.isEmpty()) {
                        if (this.f145637h.isEmpty()) {
                            this.f145637h = record.f145627j;
                            this.f145631b &= -33;
                        } else {
                            u();
                            this.f145637h.addAll(record.f145627j);
                        }
                    }
                    o(m().e(record.f145619b));
                    return this;
                }

                public Builder z(Operation operation) {
                    operation.getClass();
                    this.f145631b |= 8;
                    this.f145635f = operation;
                    return this;
                }
            }

            public enum Operation implements Internal.EnumLite {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);


                /* renamed from: e, reason: collision with root package name */
                private static Internal.EnumLiteMap<Operation> f145641e = new a();

                /* renamed from: a, reason: collision with root package name */
                private final int f145643a;

                static class a implements Internal.EnumLiteMap<Operation> {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLiteMap
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public Operation a(int i10) {
                        return Operation.a(i10);
                    }
                }

                public static Operation a(int i10) {
                    if (i10 == 0) {
                        return NONE;
                    }
                    if (i10 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i10 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Internal.EnumLite
                public final int g() {
                    return this.f145643a;
                }

                Operation(int i10, int i11) {
                    this.f145643a = i11;
                }
            }

            static class a extends AbstractParser<Record> {
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public Record c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    return new Record(codedInputStream, extensionRegistryLite);
                }

                a() {
                }
            }

            private void R() {
                this.f145621d = 1;
                this.f145622e = 0;
                this.f145623f = "";
                this.f145624g = Operation.NONE;
                List<Integer> list = Collections.EMPTY_LIST;
                this.f145625h = list;
                this.f145627j = list;
            }

            static {
                Record record = new Record(true);
                f145617n = record;
                record.R();
            }

            public static Record D() {
                return f145617n;
            }

            public Operation E() {
                return this.f145624g;
            }

            public int F() {
                return this.f145622e;
            }

            public int G() {
                return this.f145621d;
            }

            public int H() {
                return this.f145627j.size();
            }

            public List<Integer> I() {
                return this.f145627j;
            }

            public String J() {
                Object obj = this.f145623f;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String strZ = byteString.z();
                if (byteString.q()) {
                    this.f145623f = strZ;
                }
                return strZ;
            }

            public ByteString K() {
                Object obj = this.f145623f;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringL = ByteString.l((String) obj);
                this.f145623f = byteStringL;
                return byteStringL;
            }

            public int L() {
                return this.f145625h.size();
            }

            public List<Integer> M() {
                return this.f145625h;
            }

            public boolean N() {
                return (this.f145620c & 8) == 8;
            }

            public boolean O() {
                return (this.f145620c & 2) == 2;
            }

            public boolean P() {
                return (this.f145620c & 1) == 1;
            }

            public boolean Q() {
                return (this.f145620c & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean a() {
                byte b10 = this.f145629l;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f145629l = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int c() {
                int i10 = this.f145630m;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f145620c & 1) == 1 ? CodedOutputStream.o(1, this.f145621d) : 0;
                if ((this.f145620c & 2) == 2) {
                    iO += CodedOutputStream.o(2, this.f145622e);
                }
                if ((this.f145620c & 8) == 8) {
                    iO += CodedOutputStream.h(3, this.f145624g.g());
                }
                int iP = 0;
                for (int i11 = 0; i11 < this.f145625h.size(); i11++) {
                    iP += CodedOutputStream.p(this.f145625h.get(i11).intValue());
                }
                int iP2 = iO + iP;
                if (!M().isEmpty()) {
                    iP2 = iP2 + 1 + CodedOutputStream.p(iP);
                }
                this.f145626i = iP;
                int iP3 = 0;
                for (int i12 = 0; i12 < this.f145627j.size(); i12++) {
                    iP3 += CodedOutputStream.p(this.f145627j.get(i12).intValue());
                }
                int iD = iP2 + iP3;
                if (!I().isEmpty()) {
                    iD = iD + 1 + CodedOutputStream.p(iP3);
                }
                this.f145628k = iP3;
                if ((this.f145620c & 4) == 4) {
                    iD += CodedOutputStream.d(6, K());
                }
                int size = iD + this.f145619b.size();
                this.f145630m = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Record> f() {
                return f145618o;
            }

            private Record(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f145626i = -1;
                this.f145628k = -1;
                this.f145629l = (byte) -1;
                this.f145630m = -1;
                this.f145619b = builder.m();
            }

            public static Builder S() {
                return Builder.t();
            }

            public static Builder T(Record record) {
                return S().n(record);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: U, reason: merged with bridge method [inline-methods] */
            public Builder d() {
                return S();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            /* renamed from: V, reason: merged with bridge method [inline-methods] */
            public Builder b() {
                return T(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public void g(CodedOutputStream codedOutputStream) throws IOException {
                c();
                if ((this.f145620c & 1) == 1) {
                    codedOutputStream.a0(1, this.f145621d);
                }
                if ((this.f145620c & 2) == 2) {
                    codedOutputStream.a0(2, this.f145622e);
                }
                if ((this.f145620c & 8) == 8) {
                    codedOutputStream.S(3, this.f145624g.g());
                }
                if (M().size() > 0) {
                    codedOutputStream.o0(34);
                    codedOutputStream.o0(this.f145626i);
                }
                for (int i10 = 0; i10 < this.f145625h.size(); i10++) {
                    codedOutputStream.b0(this.f145625h.get(i10).intValue());
                }
                if (I().size() > 0) {
                    codedOutputStream.o0(42);
                    codedOutputStream.o0(this.f145628k);
                }
                for (int i11 = 0; i11 < this.f145627j.size(); i11++) {
                    codedOutputStream.b0(this.f145627j.get(i11).intValue());
                }
                if ((this.f145620c & 4) == 4) {
                    codedOutputStream.O(6, K());
                }
                codedOutputStream.i0(this.f145619b);
            }

            private Record(boolean z10) {
                this.f145626i = -1;
                this.f145628k = -1;
                this.f145629l = (byte) -1;
                this.f145630m = -1;
                this.f145619b = ByteString.f145819a;
            }

            private Record(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.f145626i = -1;
                this.f145628k = -1;
                this.f145629l = (byte) -1;
                this.f145630m = -1;
                R();
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
                                    this.f145620c |= 1;
                                    this.f145621d = codedInputStream.s();
                                } else if (iK == 16) {
                                    this.f145620c |= 2;
                                    this.f145622e = codedInputStream.s();
                                } else if (iK == 24) {
                                    int iN = codedInputStream.n();
                                    Operation operationA = Operation.a(iN);
                                    if (operationA == null) {
                                        codedOutputStreamJ.o0(iK);
                                        codedOutputStreamJ.o0(iN);
                                    } else {
                                        this.f145620c |= 8;
                                        this.f145624g = operationA;
                                    }
                                } else if (iK == 32) {
                                    if ((i10 & 16) != 16) {
                                        this.f145625h = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.f145625h.add(Integer.valueOf(codedInputStream.s()));
                                } else if (iK == 34) {
                                    int iJ = codedInputStream.j(codedInputStream.A());
                                    if ((i10 & 16) != 16 && codedInputStream.e() > 0) {
                                        this.f145625h = new ArrayList();
                                        i10 |= 16;
                                    }
                                    while (codedInputStream.e() > 0) {
                                        this.f145625h.add(Integer.valueOf(codedInputStream.s()));
                                    }
                                    codedInputStream.i(iJ);
                                } else if (iK == 40) {
                                    if ((i10 & 32) != 32) {
                                        this.f145627j = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.f145627j.add(Integer.valueOf(codedInputStream.s()));
                                } else if (iK == 42) {
                                    int iJ2 = codedInputStream.j(codedInputStream.A());
                                    if ((i10 & 32) != 32 && codedInputStream.e() > 0) {
                                        this.f145627j = new ArrayList();
                                        i10 |= 32;
                                    }
                                    while (codedInputStream.e() > 0) {
                                        this.f145627j.add(Integer.valueOf(codedInputStream.s()));
                                    }
                                    codedInputStream.i(iJ2);
                                } else if (iK != 50) {
                                    if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                    }
                                } else {
                                    ByteString byteStringL = codedInputStream.l();
                                    this.f145620c |= 4;
                                    this.f145623f = byteStringL;
                                }
                            }
                            z10 = true;
                        } catch (Throwable th2) {
                            if ((i10 & 16) == 16) {
                                this.f145625h = Collections.unmodifiableList(this.f145625h);
                            }
                            if ((i10 & 32) == 32) {
                                this.f145627j = Collections.unmodifiableList(this.f145627j);
                            }
                            try {
                                codedOutputStreamJ.I();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f145619b = outputT.g();
                                throw th3;
                            }
                            this.f145619b = outputT.g();
                            m();
                            throw th2;
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                    }
                }
                if ((i10 & 16) == 16) {
                    this.f145625h = Collections.unmodifiableList(this.f145625h);
                }
                if ((i10 & 32) == 32) {
                    this.f145627j = Collections.unmodifiableList(this.f145627j);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f145619b = outputT.g();
                    throw th4;
                }
                this.f145619b = outputT.g();
                m();
            }
        }

        public interface RecordOrBuilder extends MessageLiteOrBuilder {
        }

        static class a extends AbstractParser<StringTableTypes> {
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public StringTableTypes c(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                return new StringTableTypes(codedInputStream, extensionRegistryLite);
            }

            a() {
            }
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes(true);
            f145606h = stringTableTypes;
            stringTableTypes.A();
        }

        private void A() {
            List list = Collections.EMPTY_LIST;
            this.f145609c = list;
            this.f145610d = list;
        }

        public static StringTableTypes E(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return f145607i.d(inputStream, extensionRegistryLite);
        }

        public static StringTableTypes x() {
            return f145606h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f145612f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f145612f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f145613g;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f145609c.size(); i11++) {
                iS += CodedOutputStream.s(1, this.f145609c.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f145610d.size(); i12++) {
                iP += CodedOutputStream.p(this.f145610d.get(i12).intValue());
            }
            int iP2 = iS + iP;
            if (!y().isEmpty()) {
                iP2 = iP2 + 1 + CodedOutputStream.p(iP);
            }
            this.f145611e = iP;
            int size = iP2 + this.f145608b.size();
            this.f145613g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTableTypes> f() {
            return f145607i;
        }

        public List<Integer> y() {
            return this.f145610d;
        }

        public List<Record> z() {
            return this.f145609c;
        }

        private StringTableTypes(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f145611e = -1;
            this.f145612f = (byte) -1;
            this.f145613g = -1;
            this.f145608b = builder.m();
        }

        public static Builder B() {
            return Builder.t();
        }

        public static Builder C(StringTableTypes stringTableTypes) {
            return B().n(stringTableTypes);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public Builder d() {
            return B();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public Builder b() {
            return C(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public void g(CodedOutputStream codedOutputStream) throws IOException {
            c();
            for (int i10 = 0; i10 < this.f145609c.size(); i10++) {
                codedOutputStream.d0(1, this.f145609c.get(i10));
            }
            if (y().size() > 0) {
                codedOutputStream.o0(42);
                codedOutputStream.o0(this.f145611e);
            }
            for (int i11 = 0; i11 < this.f145610d.size(); i11++) {
                codedOutputStream.b0(this.f145610d.get(i11).intValue());
            }
            codedOutputStream.i0(this.f145608b);
        }

        private StringTableTypes(boolean z10) {
            this.f145611e = -1;
            this.f145612f = (byte) -1;
            this.f145613g = -1;
            this.f145608b = ByteString.f145819a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private StringTableTypes(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f145611e = -1;
            this.f145612f = (byte) -1;
            this.f145613g = -1;
            A();
            ByteString.Output outputT = ByteString.t();
            CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(outputT, 1);
            boolean z10 = false;
            int i10 = 0;
            while (!z10) {
                try {
                    try {
                        int iK = codedInputStream.K();
                        if (iK != 0) {
                            if (iK == 10) {
                                if ((i10 & 1) != 1) {
                                    this.f145609c = new ArrayList();
                                    i10 |= 1;
                                }
                                this.f145609c.add(codedInputStream.u(Record.f145618o, extensionRegistryLite));
                            } else if (iK == 40) {
                                if ((i10 & 2) != 2) {
                                    this.f145610d = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f145610d.add(Integer.valueOf(codedInputStream.s()));
                            } else if (iK != 42) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                int iJ = codedInputStream.j(codedInputStream.A());
                                if ((i10 & 2) != 2 && codedInputStream.e() > 0) {
                                    this.f145610d = new ArrayList();
                                    i10 |= 2;
                                }
                                while (codedInputStream.e() > 0) {
                                    this.f145610d.add(Integer.valueOf(codedInputStream.s()));
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
                    if ((i10 & 1) == 1) {
                        this.f145609c = Collections.unmodifiableList(this.f145609c);
                    }
                    if ((i10 & 2) == 2) {
                        this.f145610d = Collections.unmodifiableList(this.f145610d);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f145608b = outputT.g();
                        throw th3;
                    }
                    this.f145608b = outputT.g();
                    m();
                    throw th2;
                }
            }
            if ((i10 & 1) == 1) {
                this.f145609c = Collections.unmodifiableList(this.f145609c);
            }
            if ((i10 & 2) == 2) {
                this.f145610d = Collections.unmodifiableList(this.f145610d);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f145608b = outputT.g();
                throw th4;
            }
            this.f145608b = outputT.g();
            m();
        }
    }

    public interface StringTableTypesOrBuilder extends MessageLiteOrBuilder {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.a(f145553a);
        extensionRegistryLite.a(f145554b);
        extensionRegistryLite.a(f145555c);
        extensionRegistryLite.a(f145556d);
        extensionRegistryLite.a(f145557e);
        extensionRegistryLite.a(f145558f);
        extensionRegistryLite.a(f145559g);
        extensionRegistryLite.a(f145560h);
        extensionRegistryLite.a(f145561i);
        extensionRegistryLite.a(f145562j);
        extensionRegistryLite.a(f145563k);
        extensionRegistryLite.a(f145564l);
        extensionRegistryLite.a(f145565m);
        extensionRegistryLite.a(f145566n);
    }

    static {
        ProtoBuf.Constructor constructorM = ProtoBuf.Constructor.M();
        JvmMethodSignature jvmMethodSignatureV = JvmMethodSignature.v();
        JvmMethodSignature jvmMethodSignatureV2 = JvmMethodSignature.v();
        WireFormat.FieldType fieldType = WireFormat.FieldType.f145907m;
        f145553a = GeneratedMessageLite.o(constructorM, jvmMethodSignatureV, jvmMethodSignatureV2, null, 100, fieldType, JvmMethodSignature.class);
        f145554b = GeneratedMessageLite.o(ProtoBuf.Function.f0(), JvmMethodSignature.v(), JvmMethodSignature.v(), null, 100, fieldType, JvmMethodSignature.class);
        ProtoBuf.Function functionF0 = ProtoBuf.Function.f0();
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.f145901g;
        f145555c = GeneratedMessageLite.o(functionF0, 0, null, null, 101, fieldType2, Integer.class);
        f145556d = GeneratedMessageLite.o(ProtoBuf.Property.d0(), JvmPropertySignature.z(), JvmPropertySignature.z(), null, 100, fieldType, JvmPropertySignature.class);
        f145557e = GeneratedMessageLite.o(ProtoBuf.Property.d0(), 0, null, null, 101, fieldType2, Integer.class);
        f145558f = GeneratedMessageLite.n(ProtoBuf.Type.Y(), ProtoBuf.Annotation.A(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        f145559g = GeneratedMessageLite.o(ProtoBuf.Type.Y(), Boolean.FALSE, null, null, 101, WireFormat.FieldType.f145904j, Boolean.class);
        f145560h = GeneratedMessageLite.n(ProtoBuf.TypeParameter.L(), ProtoBuf.Annotation.A(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        f145561i = GeneratedMessageLite.o(ProtoBuf.Class.E0(), 0, null, null, 101, fieldType2, Integer.class);
        f145562j = GeneratedMessageLite.n(ProtoBuf.Class.E0(), ProtoBuf.Property.d0(), null, 102, fieldType, false, ProtoBuf.Property.class);
        f145563k = GeneratedMessageLite.o(ProtoBuf.Class.E0(), 0, null, null, 103, fieldType2, Integer.class);
        f145564l = GeneratedMessageLite.o(ProtoBuf.Class.E0(), 0, null, null, 104, fieldType2, Integer.class);
        f145565m = GeneratedMessageLite.o(ProtoBuf.Package.L(), 0, null, null, 101, fieldType2, Integer.class);
        f145566n = GeneratedMessageLite.n(ProtoBuf.Package.L(), ProtoBuf.Property.d0(), null, 102, fieldType, false, ProtoBuf.Property.class);
    }
}
