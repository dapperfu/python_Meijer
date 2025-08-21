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

/* loaded from: classes14.dex */
public final class JvmProtoBuf {

    /* renamed from: a, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Constructor, JvmMethodSignature> f146460a;

    /* renamed from: b, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, JvmMethodSignature> f146461b;

    /* renamed from: c, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Function, Integer> f146462c;

    /* renamed from: d, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmPropertySignature> f146463d;

    /* renamed from: e, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, Integer> f146464e;

    /* renamed from: f, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, List<ProtoBuf.Annotation>> f146465f;

    /* renamed from: g, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Type, Boolean> f146466g;

    /* renamed from: h, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.TypeParameter, List<ProtoBuf.Annotation>> f146467h;

    /* renamed from: i, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> f146468i;

    /* renamed from: j, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> f146469j;

    /* renamed from: k, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> f146470k;

    /* renamed from: l, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> f146471l;

    /* renamed from: m, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, Integer> f146472m;

    /* renamed from: n, reason: collision with root package name */
    public static final GeneratedMessageLite.GeneratedExtension<ProtoBuf.Package, List<ProtoBuf.Property>> f146473n;

    public static final class JvmFieldSignature extends GeneratedMessageLite implements JvmFieldSignatureOrBuilder {

        /* renamed from: h, reason: collision with root package name */
        private static final JvmFieldSignature f146474h;

        /* renamed from: i, reason: collision with root package name */
        public static Parser<JvmFieldSignature> f146475i = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f146476b;

        /* renamed from: c, reason: collision with root package name */
        private int f146477c;

        /* renamed from: d, reason: collision with root package name */
        private int f146478d;

        /* renamed from: e, reason: collision with root package name */
        private int f146479e;

        /* renamed from: f, reason: collision with root package name */
        private byte f146480f;

        /* renamed from: g, reason: collision with root package name */
        private int f146481g;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmFieldSignature, Builder> implements JvmFieldSignatureOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f146482b;

            /* renamed from: c, reason: collision with root package name */
            private int f146483c;

            /* renamed from: d, reason: collision with root package name */
            private int f146484d;

            private void u() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.f146475i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            public JvmFieldSignature r() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(this);
                int i10 = this.f146482b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                jvmFieldSignature.f146478d = this.f146483c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmFieldSignature.f146479e = this.f146484d;
                jvmFieldSignature.f146477c = i11;
                return jvmFieldSignature;
            }

            public Builder x(int i10) {
                this.f146482b |= 2;
                this.f146484d = i10;
                return this;
            }

            public Builder y(int i10) {
                this.f146482b |= 1;
                this.f146483c = i10;
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
                o(m().e(jvmFieldSignature.f146476b));
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
            this.f146478d = 0;
            this.f146479e = 0;
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(true);
            f146474h = jvmFieldSignature;
            jvmFieldSignature.B();
        }

        public static JvmFieldSignature v() {
            return f146474h;
        }

        public boolean A() {
            return (this.f146477c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146480f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f146480f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146481g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f146477c & 1) == 1 ? CodedOutputStream.o(1, this.f146478d) : 0;
            if ((this.f146477c & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f146479e);
            }
            int size = iO + this.f146476b.size();
            this.f146481g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmFieldSignature> f() {
            return f146475i;
        }

        public int x() {
            return this.f146479e;
        }

        public int y() {
            return this.f146478d;
        }

        public boolean z() {
            return (this.f146477c & 2) == 2;
        }

        private JvmFieldSignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f146480f = (byte) -1;
            this.f146481g = -1;
            this.f146476b = builder.m();
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
            if ((this.f146477c & 1) == 1) {
                codedOutputStream.a0(1, this.f146478d);
            }
            if ((this.f146477c & 2) == 2) {
                codedOutputStream.a0(2, this.f146479e);
            }
            codedOutputStream.i0(this.f146476b);
        }

        private JvmFieldSignature(boolean z10) {
            this.f146480f = (byte) -1;
            this.f146481g = -1;
            this.f146476b = ByteString.f146726a;
        }

        private JvmFieldSignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f146480f = (byte) -1;
            this.f146481g = -1;
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
                                this.f146477c |= 1;
                                this.f146478d = codedInputStream.s();
                            } else if (iK != 16) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                this.f146477c |= 2;
                                this.f146479e = codedInputStream.s();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f146476b = outputT.g();
                            throw th3;
                        }
                        this.f146476b = outputT.g();
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
                this.f146476b = outputT.g();
                throw th4;
            }
            this.f146476b = outputT.g();
            m();
        }
    }

    public interface JvmFieldSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class JvmMethodSignature extends GeneratedMessageLite implements JvmMethodSignatureOrBuilder {

        /* renamed from: h, reason: collision with root package name */
        private static final JvmMethodSignature f146485h;

        /* renamed from: i, reason: collision with root package name */
        public static Parser<JvmMethodSignature> f146486i = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f146487b;

        /* renamed from: c, reason: collision with root package name */
        private int f146488c;

        /* renamed from: d, reason: collision with root package name */
        private int f146489d;

        /* renamed from: e, reason: collision with root package name */
        private int f146490e;

        /* renamed from: f, reason: collision with root package name */
        private byte f146491f;

        /* renamed from: g, reason: collision with root package name */
        private int f146492g;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmMethodSignature, Builder> implements JvmMethodSignatureOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f146493b;

            /* renamed from: c, reason: collision with root package name */
            private int f146494c;

            /* renamed from: d, reason: collision with root package name */
            private int f146495d;

            private void u() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.f146486i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            public JvmMethodSignature r() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(this);
                int i10 = this.f146493b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                jvmMethodSignature.f146489d = this.f146494c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmMethodSignature.f146490e = this.f146495d;
                jvmMethodSignature.f146488c = i11;
                return jvmMethodSignature;
            }

            public Builder x(int i10) {
                this.f146493b |= 2;
                this.f146495d = i10;
                return this;
            }

            public Builder y(int i10) {
                this.f146493b |= 1;
                this.f146494c = i10;
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
                o(m().e(jvmMethodSignature.f146487b));
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
            this.f146489d = 0;
            this.f146490e = 0;
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(true);
            f146485h = jvmMethodSignature;
            jvmMethodSignature.B();
        }

        public static JvmMethodSignature v() {
            return f146485h;
        }

        public boolean A() {
            return (this.f146488c & 1) == 1;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146491f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f146491f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146492g;
            if (i10 != -1) {
                return i10;
            }
            int iO = (this.f146488c & 1) == 1 ? CodedOutputStream.o(1, this.f146489d) : 0;
            if ((this.f146488c & 2) == 2) {
                iO += CodedOutputStream.o(2, this.f146490e);
            }
            int size = iO + this.f146487b.size();
            this.f146492g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmMethodSignature> f() {
            return f146486i;
        }

        public int x() {
            return this.f146490e;
        }

        public int y() {
            return this.f146489d;
        }

        public boolean z() {
            return (this.f146488c & 2) == 2;
        }

        private JvmMethodSignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f146491f = (byte) -1;
            this.f146492g = -1;
            this.f146487b = builder.m();
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
            if ((this.f146488c & 1) == 1) {
                codedOutputStream.a0(1, this.f146489d);
            }
            if ((this.f146488c & 2) == 2) {
                codedOutputStream.a0(2, this.f146490e);
            }
            codedOutputStream.i0(this.f146487b);
        }

        private JvmMethodSignature(boolean z10) {
            this.f146491f = (byte) -1;
            this.f146492g = -1;
            this.f146487b = ByteString.f146726a;
        }

        private JvmMethodSignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f146491f = (byte) -1;
            this.f146492g = -1;
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
                                this.f146488c |= 1;
                                this.f146489d = codedInputStream.s();
                            } else if (iK != 16) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                this.f146488c |= 2;
                                this.f146490e = codedInputStream.s();
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f146487b = outputT.g();
                            throw th3;
                        }
                        this.f146487b = outputT.g();
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
                this.f146487b = outputT.g();
                throw th4;
            }
            this.f146487b = outputT.g();
            m();
        }
    }

    public interface JvmMethodSignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class JvmPropertySignature extends GeneratedMessageLite implements JvmPropertySignatureOrBuilder {

        /* renamed from: k, reason: collision with root package name */
        private static final JvmPropertySignature f146496k;

        /* renamed from: l, reason: collision with root package name */
        public static Parser<JvmPropertySignature> f146497l = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f146498b;

        /* renamed from: c, reason: collision with root package name */
        private int f146499c;

        /* renamed from: d, reason: collision with root package name */
        private JvmFieldSignature f146500d;

        /* renamed from: e, reason: collision with root package name */
        private JvmMethodSignature f146501e;

        /* renamed from: f, reason: collision with root package name */
        private JvmMethodSignature f146502f;

        /* renamed from: g, reason: collision with root package name */
        private JvmMethodSignature f146503g;

        /* renamed from: h, reason: collision with root package name */
        private JvmMethodSignature f146504h;

        /* renamed from: i, reason: collision with root package name */
        private byte f146505i;

        /* renamed from: j, reason: collision with root package name */
        private int f146506j;

        public static final class Builder extends GeneratedMessageLite.Builder<JvmPropertySignature, Builder> implements JvmPropertySignatureOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f146507b;

            /* renamed from: c, reason: collision with root package name */
            private JvmFieldSignature f146508c = JvmFieldSignature.v();

            /* renamed from: d, reason: collision with root package name */
            private JvmMethodSignature f146509d = JvmMethodSignature.v();

            /* renamed from: e, reason: collision with root package name */
            private JvmMethodSignature f146510e = JvmMethodSignature.v();

            /* renamed from: f, reason: collision with root package name */
            private JvmMethodSignature f146511f = JvmMethodSignature.v();

            /* renamed from: g, reason: collision with root package name */
            private JvmMethodSignature f146512g = JvmMethodSignature.v();

            private void u() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.f146497l     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            public Builder A(JvmMethodSignature jvmMethodSignature) {
                if ((this.f146507b & 8) != 8 || this.f146511f == JvmMethodSignature.v()) {
                    this.f146511f = jvmMethodSignature;
                } else {
                    this.f146511f = JvmMethodSignature.D(this.f146511f).n(jvmMethodSignature).r();
                }
                this.f146507b |= 8;
                return this;
            }

            public Builder C(JvmMethodSignature jvmMethodSignature) {
                if ((this.f146507b & 2) != 2 || this.f146509d == JvmMethodSignature.v()) {
                    this.f146509d = jvmMethodSignature;
                } else {
                    this.f146509d = JvmMethodSignature.D(this.f146509d).n(jvmMethodSignature).r();
                }
                this.f146507b |= 2;
                return this;
            }

            public JvmPropertySignature r() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(this);
                int i10 = this.f146507b;
                int i11 = (i10 & 1) != 1 ? 0 : 1;
                jvmPropertySignature.f146500d = this.f146508c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                jvmPropertySignature.f146501e = this.f146509d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                jvmPropertySignature.f146502f = this.f146510e;
                if ((i10 & 8) == 8) {
                    i11 |= 8;
                }
                jvmPropertySignature.f146503g = this.f146511f;
                if ((i10 & 16) == 16) {
                    i11 |= 16;
                }
                jvmPropertySignature.f146504h = this.f146512g;
                jvmPropertySignature.f146499c = i11;
                return jvmPropertySignature;
            }

            public Builder v(JvmMethodSignature jvmMethodSignature) {
                if ((this.f146507b & 16) != 16 || this.f146512g == JvmMethodSignature.v()) {
                    this.f146512g = jvmMethodSignature;
                } else {
                    this.f146512g = JvmMethodSignature.D(this.f146512g).n(jvmMethodSignature).r();
                }
                this.f146507b |= 16;
                return this;
            }

            public Builder w(JvmFieldSignature jvmFieldSignature) {
                if ((this.f146507b & 1) != 1 || this.f146508c == JvmFieldSignature.v()) {
                    this.f146508c = jvmFieldSignature;
                } else {
                    this.f146508c = JvmFieldSignature.D(this.f146508c).n(jvmFieldSignature).r();
                }
                this.f146507b |= 1;
                return this;
            }

            public Builder z(JvmMethodSignature jvmMethodSignature) {
                if ((this.f146507b & 4) != 4 || this.f146510e == JvmMethodSignature.v()) {
                    this.f146510e = jvmMethodSignature;
                } else {
                    this.f146510e = JvmMethodSignature.D(this.f146510e).n(jvmMethodSignature).r();
                }
                this.f146507b |= 4;
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
                o(m().e(jvmPropertySignature.f146498b));
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
            f146496k = jvmPropertySignature;
            jvmPropertySignature.K();
        }

        public static JvmPropertySignature z() {
            return f146496k;
        }

        public JvmMethodSignature A() {
            return this.f146504h;
        }

        public JvmFieldSignature B() {
            return this.f146500d;
        }

        public JvmMethodSignature C() {
            return this.f146502f;
        }

        public JvmMethodSignature D() {
            return this.f146503g;
        }

        public JvmMethodSignature E() {
            return this.f146501e;
        }

        public boolean F() {
            return (this.f146499c & 16) == 16;
        }

        public boolean G() {
            return (this.f146499c & 1) == 1;
        }

        public boolean H() {
            return (this.f146499c & 4) == 4;
        }

        public boolean I() {
            return (this.f146499c & 8) == 8;
        }

        public boolean J() {
            return (this.f146499c & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146505i;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f146505i = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146506j;
            if (i10 != -1) {
                return i10;
            }
            int iS = (this.f146499c & 1) == 1 ? CodedOutputStream.s(1, this.f146500d) : 0;
            if ((this.f146499c & 2) == 2) {
                iS += CodedOutputStream.s(2, this.f146501e);
            }
            if ((this.f146499c & 4) == 4) {
                iS += CodedOutputStream.s(3, this.f146502f);
            }
            if ((this.f146499c & 8) == 8) {
                iS += CodedOutputStream.s(4, this.f146503g);
            }
            if ((this.f146499c & 16) == 16) {
                iS += CodedOutputStream.s(5, this.f146504h);
            }
            int size = iS + this.f146498b.size();
            this.f146506j = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<JvmPropertySignature> f() {
            return f146497l;
        }

        private JvmPropertySignature(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f146505i = (byte) -1;
            this.f146506j = -1;
            this.f146498b = builder.m();
        }

        private void K() {
            this.f146500d = JvmFieldSignature.v();
            this.f146501e = JvmMethodSignature.v();
            this.f146502f = JvmMethodSignature.v();
            this.f146503g = JvmMethodSignature.v();
            this.f146504h = JvmMethodSignature.v();
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
            if ((this.f146499c & 1) == 1) {
                codedOutputStream.d0(1, this.f146500d);
            }
            if ((this.f146499c & 2) == 2) {
                codedOutputStream.d0(2, this.f146501e);
            }
            if ((this.f146499c & 4) == 4) {
                codedOutputStream.d0(3, this.f146502f);
            }
            if ((this.f146499c & 8) == 8) {
                codedOutputStream.d0(4, this.f146503g);
            }
            if ((this.f146499c & 16) == 16) {
                codedOutputStream.d0(5, this.f146504h);
            }
            codedOutputStream.i0(this.f146498b);
        }

        private JvmPropertySignature(boolean z10) {
            this.f146505i = (byte) -1;
            this.f146506j = -1;
            this.f146498b = ByteString.f146726a;
        }

        private JvmPropertySignature(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f146505i = (byte) -1;
            this.f146506j = -1;
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
                                JvmFieldSignature.Builder builderB = (this.f146499c & 1) == 1 ? this.f146500d.b() : null;
                                JvmFieldSignature jvmFieldSignature = (JvmFieldSignature) codedInputStream.u(JvmFieldSignature.f146475i, extensionRegistryLite);
                                this.f146500d = jvmFieldSignature;
                                if (builderB != null) {
                                    builderB.n(jvmFieldSignature);
                                    this.f146500d = builderB.r();
                                }
                                this.f146499c |= 1;
                            } else if (iK == 18) {
                                JvmMethodSignature.Builder builderB2 = (this.f146499c & 2) == 2 ? this.f146501e.b() : null;
                                JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) codedInputStream.u(JvmMethodSignature.f146486i, extensionRegistryLite);
                                this.f146501e = jvmMethodSignature;
                                if (builderB2 != null) {
                                    builderB2.n(jvmMethodSignature);
                                    this.f146501e = builderB2.r();
                                }
                                this.f146499c |= 2;
                            } else if (iK == 26) {
                                JvmMethodSignature.Builder builderB3 = (this.f146499c & 4) == 4 ? this.f146502f.b() : null;
                                JvmMethodSignature jvmMethodSignature2 = (JvmMethodSignature) codedInputStream.u(JvmMethodSignature.f146486i, extensionRegistryLite);
                                this.f146502f = jvmMethodSignature2;
                                if (builderB3 != null) {
                                    builderB3.n(jvmMethodSignature2);
                                    this.f146502f = builderB3.r();
                                }
                                this.f146499c |= 4;
                            } else if (iK == 34) {
                                JvmMethodSignature.Builder builderB4 = (this.f146499c & 8) == 8 ? this.f146503g.b() : null;
                                JvmMethodSignature jvmMethodSignature3 = (JvmMethodSignature) codedInputStream.u(JvmMethodSignature.f146486i, extensionRegistryLite);
                                this.f146503g = jvmMethodSignature3;
                                if (builderB4 != null) {
                                    builderB4.n(jvmMethodSignature3);
                                    this.f146503g = builderB4.r();
                                }
                                this.f146499c |= 8;
                            } else if (iK != 42) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                JvmMethodSignature.Builder builderB5 = (this.f146499c & 16) == 16 ? this.f146504h.b() : null;
                                JvmMethodSignature jvmMethodSignature4 = (JvmMethodSignature) codedInputStream.u(JvmMethodSignature.f146486i, extensionRegistryLite);
                                this.f146504h = jvmMethodSignature4;
                                if (builderB5 != null) {
                                    builderB5.n(jvmMethodSignature4);
                                    this.f146504h = builderB5.r();
                                }
                                this.f146499c |= 16;
                            }
                        }
                        z10 = true;
                    } catch (Throwable th2) {
                        try {
                            codedOutputStreamJ.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f146498b = outputT.g();
                            throw th3;
                        }
                        this.f146498b = outputT.g();
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
                this.f146498b = outputT.g();
                throw th4;
            }
            this.f146498b = outputT.g();
            m();
        }
    }

    public interface JvmPropertySignatureOrBuilder extends MessageLiteOrBuilder {
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements StringTableTypesOrBuilder {

        /* renamed from: h, reason: collision with root package name */
        private static final StringTableTypes f146513h;

        /* renamed from: i, reason: collision with root package name */
        public static Parser<StringTableTypes> f146514i = new a();

        /* renamed from: b, reason: collision with root package name */
        private final ByteString f146515b;

        /* renamed from: c, reason: collision with root package name */
        private List<Record> f146516c;

        /* renamed from: d, reason: collision with root package name */
        private List<Integer> f146517d;

        /* renamed from: e, reason: collision with root package name */
        private int f146518e;

        /* renamed from: f, reason: collision with root package name */
        private byte f146519f;

        /* renamed from: g, reason: collision with root package name */
        private int f146520g;

        public static final class Builder extends GeneratedMessageLite.Builder<StringTableTypes, Builder> implements StringTableTypesOrBuilder {

            /* renamed from: b, reason: collision with root package name */
            private int f146521b;

            /* renamed from: c, reason: collision with root package name */
            private List<Record> f146522c;

            /* renamed from: d, reason: collision with root package name */
            private List<Integer> f146523d;

            private void w() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.f146514i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Builder");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static Builder t() {
                return new Builder();
            }

            private void u() {
                if ((this.f146521b & 2) != 2) {
                    this.f146523d = new ArrayList(this.f146523d);
                    this.f146521b |= 2;
                }
            }

            private void v() {
                if ((this.f146521b & 1) != 1) {
                    this.f146522c = new ArrayList(this.f146522c);
                    this.f146521b |= 1;
                }
            }

            public StringTableTypes r() {
                StringTableTypes stringTableTypes = new StringTableTypes(this);
                if ((this.f146521b & 1) == 1) {
                    this.f146522c = Collections.unmodifiableList(this.f146522c);
                    this.f146521b &= -2;
                }
                stringTableTypes.f146516c = this.f146522c;
                if ((this.f146521b & 2) == 2) {
                    this.f146523d = Collections.unmodifiableList(this.f146523d);
                    this.f146521b &= -3;
                }
                stringTableTypes.f146517d = this.f146523d;
                return stringTableTypes;
            }

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.f146522c = list;
                this.f146523d = list;
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
                if (!stringTableTypes.f146516c.isEmpty()) {
                    if (this.f146522c.isEmpty()) {
                        this.f146522c = stringTableTypes.f146516c;
                        this.f146521b &= -2;
                    } else {
                        v();
                        this.f146522c.addAll(stringTableTypes.f146516c);
                    }
                }
                if (!stringTableTypes.f146517d.isEmpty()) {
                    if (this.f146523d.isEmpty()) {
                        this.f146523d = stringTableTypes.f146517d;
                        this.f146521b &= -3;
                    } else {
                        u();
                        this.f146523d.addAll(stringTableTypes.f146517d);
                    }
                }
                o(m().e(stringTableTypes.f146515b));
                return this;
            }
        }

        public static final class Record extends GeneratedMessageLite implements RecordOrBuilder {

            /* renamed from: n, reason: collision with root package name */
            private static final Record f146524n;

            /* renamed from: o, reason: collision with root package name */
            public static Parser<Record> f146525o = new a();

            /* renamed from: b, reason: collision with root package name */
            private final ByteString f146526b;

            /* renamed from: c, reason: collision with root package name */
            private int f146527c;

            /* renamed from: d, reason: collision with root package name */
            private int f146528d;

            /* renamed from: e, reason: collision with root package name */
            private int f146529e;

            /* renamed from: f, reason: collision with root package name */
            private Object f146530f;

            /* renamed from: g, reason: collision with root package name */
            private Operation f146531g;

            /* renamed from: h, reason: collision with root package name */
            private List<Integer> f146532h;

            /* renamed from: i, reason: collision with root package name */
            private int f146533i;

            /* renamed from: j, reason: collision with root package name */
            private List<Integer> f146534j;

            /* renamed from: k, reason: collision with root package name */
            private int f146535k;

            /* renamed from: l, reason: collision with root package name */
            private byte f146536l;

            /* renamed from: m, reason: collision with root package name */
            private int f146537m;

            public static final class Builder extends GeneratedMessageLite.Builder<Record, Builder> implements RecordOrBuilder {

                /* renamed from: b, reason: collision with root package name */
                private int f146538b;

                /* renamed from: d, reason: collision with root package name */
                private int f146540d;

                /* renamed from: g, reason: collision with root package name */
                private List<Integer> f146543g;

                /* renamed from: h, reason: collision with root package name */
                private List<Integer> f146544h;

                /* renamed from: c, reason: collision with root package name */
                private int f146539c = 1;

                /* renamed from: e, reason: collision with root package name */
                private Object f146541e = "";

                /* renamed from: f, reason: collision with root package name */
                private Operation f146542f = Operation.NONE;

                private void w() {
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite.Builder
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r3, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.Parser<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record> r1 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.f146525o     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.StringTableTypes.Record.Builder.r0(kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite):kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Builder");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static Builder t() {
                    return new Builder();
                }

                private void u() {
                    if ((this.f146538b & 32) != 32) {
                        this.f146544h = new ArrayList(this.f146544h);
                        this.f146538b |= 32;
                    }
                }

                private void v() {
                    if ((this.f146538b & 16) != 16) {
                        this.f146543g = new ArrayList(this.f146543g);
                        this.f146538b |= 16;
                    }
                }

                public Builder A(int i10) {
                    this.f146538b |= 2;
                    this.f146540d = i10;
                    return this;
                }

                public Builder C(int i10) {
                    this.f146538b |= 1;
                    this.f146539c = i10;
                    return this;
                }

                public Record r() {
                    Record record = new Record(this);
                    int i10 = this.f146538b;
                    int i11 = (i10 & 1) != 1 ? 0 : 1;
                    record.f146528d = this.f146539c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    record.f146529e = this.f146540d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    record.f146530f = this.f146541e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    record.f146531g = this.f146542f;
                    if ((this.f146538b & 16) == 16) {
                        this.f146543g = Collections.unmodifiableList(this.f146543g);
                        this.f146538b &= -17;
                    }
                    record.f146532h = this.f146543g;
                    if ((this.f146538b & 32) == 32) {
                        this.f146544h = Collections.unmodifiableList(this.f146544h);
                        this.f146538b &= -33;
                    }
                    record.f146534j = this.f146544h;
                    record.f146527c = i11;
                    return record;
                }

                private Builder() {
                    List<Integer> list = Collections.EMPTY_LIST;
                    this.f146543g = list;
                    this.f146544h = list;
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
                        this.f146538b |= 4;
                        this.f146541e = record.f146530f;
                    }
                    if (record.N()) {
                        z(record.E());
                    }
                    if (!record.f146532h.isEmpty()) {
                        if (this.f146543g.isEmpty()) {
                            this.f146543g = record.f146532h;
                            this.f146538b &= -17;
                        } else {
                            v();
                            this.f146543g.addAll(record.f146532h);
                        }
                    }
                    if (!record.f146534j.isEmpty()) {
                        if (this.f146544h.isEmpty()) {
                            this.f146544h = record.f146534j;
                            this.f146538b &= -33;
                        } else {
                            u();
                            this.f146544h.addAll(record.f146534j);
                        }
                    }
                    o(m().e(record.f146526b));
                    return this;
                }

                public Builder z(Operation operation) {
                    operation.getClass();
                    this.f146538b |= 8;
                    this.f146542f = operation;
                    return this;
                }
            }

            public enum Operation implements Internal.EnumLite {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);


                /* renamed from: e, reason: collision with root package name */
                private static Internal.EnumLiteMap<Operation> f146548e = new a();

                /* renamed from: a, reason: collision with root package name */
                private final int f146550a;

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
                    return this.f146550a;
                }

                Operation(int i10, int i11) {
                    this.f146550a = i11;
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
                this.f146528d = 1;
                this.f146529e = 0;
                this.f146530f = "";
                this.f146531g = Operation.NONE;
                List<Integer> list = Collections.EMPTY_LIST;
                this.f146532h = list;
                this.f146534j = list;
            }

            static {
                Record record = new Record(true);
                f146524n = record;
                record.R();
            }

            public static Record D() {
                return f146524n;
            }

            public Operation E() {
                return this.f146531g;
            }

            public int F() {
                return this.f146529e;
            }

            public int G() {
                return this.f146528d;
            }

            public int H() {
                return this.f146534j.size();
            }

            public List<Integer> I() {
                return this.f146534j;
            }

            public String J() {
                Object obj = this.f146530f;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String strZ = byteString.z();
                if (byteString.q()) {
                    this.f146530f = strZ;
                }
                return strZ;
            }

            public ByteString K() {
                Object obj = this.f146530f;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringL = ByteString.l((String) obj);
                this.f146530f = byteStringL;
                return byteStringL;
            }

            public int L() {
                return this.f146532h.size();
            }

            public List<Integer> M() {
                return this.f146532h;
            }

            public boolean N() {
                return (this.f146527c & 8) == 8;
            }

            public boolean O() {
                return (this.f146527c & 2) == 2;
            }

            public boolean P() {
                return (this.f146527c & 1) == 1;
            }

            public boolean Q() {
                return (this.f146527c & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
            public final boolean a() {
                byte b10 = this.f146536l;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f146536l = (byte) 1;
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public int c() {
                int i10 = this.f146537m;
                if (i10 != -1) {
                    return i10;
                }
                int iO = (this.f146527c & 1) == 1 ? CodedOutputStream.o(1, this.f146528d) : 0;
                if ((this.f146527c & 2) == 2) {
                    iO += CodedOutputStream.o(2, this.f146529e);
                }
                if ((this.f146527c & 8) == 8) {
                    iO += CodedOutputStream.h(3, this.f146531g.g());
                }
                int iP = 0;
                for (int i11 = 0; i11 < this.f146532h.size(); i11++) {
                    iP += CodedOutputStream.p(this.f146532h.get(i11).intValue());
                }
                int iP2 = iO + iP;
                if (!M().isEmpty()) {
                    iP2 = iP2 + 1 + CodedOutputStream.p(iP);
                }
                this.f146533i = iP;
                int iP3 = 0;
                for (int i12 = 0; i12 < this.f146534j.size(); i12++) {
                    iP3 += CodedOutputStream.p(this.f146534j.get(i12).intValue());
                }
                int iD = iP2 + iP3;
                if (!I().isEmpty()) {
                    iD = iD + 1 + CodedOutputStream.p(iP3);
                }
                this.f146535k = iP3;
                if ((this.f146527c & 4) == 4) {
                    iD += CodedOutputStream.d(6, K());
                }
                int size = iD + this.f146526b.size();
                this.f146537m = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
            public Parser<Record> f() {
                return f146525o;
            }

            private Record(GeneratedMessageLite.Builder builder) {
                super(builder);
                this.f146533i = -1;
                this.f146535k = -1;
                this.f146536l = (byte) -1;
                this.f146537m = -1;
                this.f146526b = builder.m();
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
                if ((this.f146527c & 1) == 1) {
                    codedOutputStream.a0(1, this.f146528d);
                }
                if ((this.f146527c & 2) == 2) {
                    codedOutputStream.a0(2, this.f146529e);
                }
                if ((this.f146527c & 8) == 8) {
                    codedOutputStream.S(3, this.f146531g.g());
                }
                if (M().size() > 0) {
                    codedOutputStream.o0(34);
                    codedOutputStream.o0(this.f146533i);
                }
                for (int i10 = 0; i10 < this.f146532h.size(); i10++) {
                    codedOutputStream.b0(this.f146532h.get(i10).intValue());
                }
                if (I().size() > 0) {
                    codedOutputStream.o0(42);
                    codedOutputStream.o0(this.f146535k);
                }
                for (int i11 = 0; i11 < this.f146534j.size(); i11++) {
                    codedOutputStream.b0(this.f146534j.get(i11).intValue());
                }
                if ((this.f146527c & 4) == 4) {
                    codedOutputStream.O(6, K());
                }
                codedOutputStream.i0(this.f146526b);
            }

            private Record(boolean z10) {
                this.f146533i = -1;
                this.f146535k = -1;
                this.f146536l = (byte) -1;
                this.f146537m = -1;
                this.f146526b = ByteString.f146726a;
            }

            private Record(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                this.f146533i = -1;
                this.f146535k = -1;
                this.f146536l = (byte) -1;
                this.f146537m = -1;
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
                                    this.f146527c |= 1;
                                    this.f146528d = codedInputStream.s();
                                } else if (iK == 16) {
                                    this.f146527c |= 2;
                                    this.f146529e = codedInputStream.s();
                                } else if (iK == 24) {
                                    int iN = codedInputStream.n();
                                    Operation operationA = Operation.a(iN);
                                    if (operationA == null) {
                                        codedOutputStreamJ.o0(iK);
                                        codedOutputStreamJ.o0(iN);
                                    } else {
                                        this.f146527c |= 8;
                                        this.f146531g = operationA;
                                    }
                                } else if (iK == 32) {
                                    if ((i10 & 16) != 16) {
                                        this.f146532h = new ArrayList();
                                        i10 |= 16;
                                    }
                                    this.f146532h.add(Integer.valueOf(codedInputStream.s()));
                                } else if (iK == 34) {
                                    int iJ = codedInputStream.j(codedInputStream.A());
                                    if ((i10 & 16) != 16 && codedInputStream.e() > 0) {
                                        this.f146532h = new ArrayList();
                                        i10 |= 16;
                                    }
                                    while (codedInputStream.e() > 0) {
                                        this.f146532h.add(Integer.valueOf(codedInputStream.s()));
                                    }
                                    codedInputStream.i(iJ);
                                } else if (iK == 40) {
                                    if ((i10 & 32) != 32) {
                                        this.f146534j = new ArrayList();
                                        i10 |= 32;
                                    }
                                    this.f146534j.add(Integer.valueOf(codedInputStream.s()));
                                } else if (iK == 42) {
                                    int iJ2 = codedInputStream.j(codedInputStream.A());
                                    if ((i10 & 32) != 32 && codedInputStream.e() > 0) {
                                        this.f146534j = new ArrayList();
                                        i10 |= 32;
                                    }
                                    while (codedInputStream.e() > 0) {
                                        this.f146534j.add(Integer.valueOf(codedInputStream.s()));
                                    }
                                    codedInputStream.i(iJ2);
                                } else if (iK != 50) {
                                    if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                    }
                                } else {
                                    ByteString byteStringL = codedInputStream.l();
                                    this.f146527c |= 4;
                                    this.f146530f = byteStringL;
                                }
                            }
                            z10 = true;
                        } catch (Throwable th2) {
                            if ((i10 & 16) == 16) {
                                this.f146532h = Collections.unmodifiableList(this.f146532h);
                            }
                            if ((i10 & 32) == 32) {
                                this.f146534j = Collections.unmodifiableList(this.f146534j);
                            }
                            try {
                                codedOutputStreamJ.I();
                            } catch (IOException unused) {
                            } catch (Throwable th3) {
                                this.f146526b = outputT.g();
                                throw th3;
                            }
                            this.f146526b = outputT.g();
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
                    this.f146532h = Collections.unmodifiableList(this.f146532h);
                }
                if ((i10 & 32) == 32) {
                    this.f146534j = Collections.unmodifiableList(this.f146534j);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f146526b = outputT.g();
                    throw th4;
                }
                this.f146526b = outputT.g();
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
            f146513h = stringTableTypes;
            stringTableTypes.A();
        }

        private void A() {
            List list = Collections.EMPTY_LIST;
            this.f146516c = list;
            this.f146517d = list;
        }

        public static StringTableTypes E(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return f146514i.d(inputStream, extensionRegistryLite);
        }

        public static StringTableTypes x() {
            return f146513h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public final boolean a() {
            byte b10 = this.f146519f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f146519f = (byte) 1;
            return true;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public int c() {
            int i10 = this.f146520g;
            if (i10 != -1) {
                return i10;
            }
            int iS = 0;
            for (int i11 = 0; i11 < this.f146516c.size(); i11++) {
                iS += CodedOutputStream.s(1, this.f146516c.get(i11));
            }
            int iP = 0;
            for (int i12 = 0; i12 < this.f146517d.size(); i12++) {
                iP += CodedOutputStream.p(this.f146517d.get(i12).intValue());
            }
            int iP2 = iS + iP;
            if (!y().isEmpty()) {
                iP2 = iP2 + 1 + CodedOutputStream.p(iP);
            }
            this.f146518e = iP;
            int size = iP2 + this.f146515b.size();
            this.f146520g = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
        public Parser<StringTableTypes> f() {
            return f146514i;
        }

        public List<Integer> y() {
            return this.f146517d;
        }

        public List<Record> z() {
            return this.f146516c;
        }

        private StringTableTypes(GeneratedMessageLite.Builder builder) {
            super(builder);
            this.f146518e = -1;
            this.f146519f = (byte) -1;
            this.f146520g = -1;
            this.f146515b = builder.m();
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
            for (int i10 = 0; i10 < this.f146516c.size(); i10++) {
                codedOutputStream.d0(1, this.f146516c.get(i10));
            }
            if (y().size() > 0) {
                codedOutputStream.o0(42);
                codedOutputStream.o0(this.f146518e);
            }
            for (int i11 = 0; i11 < this.f146517d.size(); i11++) {
                codedOutputStream.b0(this.f146517d.get(i11).intValue());
            }
            codedOutputStream.i0(this.f146515b);
        }

        private StringTableTypes(boolean z10) {
            this.f146518e = -1;
            this.f146519f = (byte) -1;
            this.f146520g = -1;
            this.f146515b = ByteString.f146726a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private StringTableTypes(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            this.f146518e = -1;
            this.f146519f = (byte) -1;
            this.f146520g = -1;
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
                                    this.f146516c = new ArrayList();
                                    i10 |= 1;
                                }
                                this.f146516c.add(codedInputStream.u(Record.f146525o, extensionRegistryLite));
                            } else if (iK == 40) {
                                if ((i10 & 2) != 2) {
                                    this.f146517d = new ArrayList();
                                    i10 |= 2;
                                }
                                this.f146517d.add(Integer.valueOf(codedInputStream.s()));
                            } else if (iK != 42) {
                                if (!p(codedInputStream, codedOutputStreamJ, extensionRegistryLite, iK)) {
                                }
                            } else {
                                int iJ = codedInputStream.j(codedInputStream.A());
                                if ((i10 & 2) != 2 && codedInputStream.e() > 0) {
                                    this.f146517d = new ArrayList();
                                    i10 |= 2;
                                }
                                while (codedInputStream.e() > 0) {
                                    this.f146517d.add(Integer.valueOf(codedInputStream.s()));
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
                        this.f146516c = Collections.unmodifiableList(this.f146516c);
                    }
                    if ((i10 & 2) == 2) {
                        this.f146517d = Collections.unmodifiableList(this.f146517d);
                    }
                    try {
                        codedOutputStreamJ.I();
                    } catch (IOException unused) {
                    } catch (Throwable th3) {
                        this.f146515b = outputT.g();
                        throw th3;
                    }
                    this.f146515b = outputT.g();
                    m();
                    throw th2;
                }
            }
            if ((i10 & 1) == 1) {
                this.f146516c = Collections.unmodifiableList(this.f146516c);
            }
            if ((i10 & 2) == 2) {
                this.f146517d = Collections.unmodifiableList(this.f146517d);
            }
            try {
                codedOutputStreamJ.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f146515b = outputT.g();
                throw th4;
            }
            this.f146515b = outputT.g();
            m();
        }
    }

    public interface StringTableTypesOrBuilder extends MessageLiteOrBuilder {
    }

    public static void a(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.a(f146460a);
        extensionRegistryLite.a(f146461b);
        extensionRegistryLite.a(f146462c);
        extensionRegistryLite.a(f146463d);
        extensionRegistryLite.a(f146464e);
        extensionRegistryLite.a(f146465f);
        extensionRegistryLite.a(f146466g);
        extensionRegistryLite.a(f146467h);
        extensionRegistryLite.a(f146468i);
        extensionRegistryLite.a(f146469j);
        extensionRegistryLite.a(f146470k);
        extensionRegistryLite.a(f146471l);
        extensionRegistryLite.a(f146472m);
        extensionRegistryLite.a(f146473n);
    }

    static {
        ProtoBuf.Constructor constructorM = ProtoBuf.Constructor.M();
        JvmMethodSignature jvmMethodSignatureV = JvmMethodSignature.v();
        JvmMethodSignature jvmMethodSignatureV2 = JvmMethodSignature.v();
        WireFormat.FieldType fieldType = WireFormat.FieldType.f146814m;
        f146460a = GeneratedMessageLite.o(constructorM, jvmMethodSignatureV, jvmMethodSignatureV2, null, 100, fieldType, JvmMethodSignature.class);
        f146461b = GeneratedMessageLite.o(ProtoBuf.Function.f0(), JvmMethodSignature.v(), JvmMethodSignature.v(), null, 100, fieldType, JvmMethodSignature.class);
        ProtoBuf.Function functionF0 = ProtoBuf.Function.f0();
        WireFormat.FieldType fieldType2 = WireFormat.FieldType.f146808g;
        f146462c = GeneratedMessageLite.o(functionF0, 0, null, null, 101, fieldType2, Integer.class);
        f146463d = GeneratedMessageLite.o(ProtoBuf.Property.d0(), JvmPropertySignature.z(), JvmPropertySignature.z(), null, 100, fieldType, JvmPropertySignature.class);
        f146464e = GeneratedMessageLite.o(ProtoBuf.Property.d0(), 0, null, null, 101, fieldType2, Integer.class);
        f146465f = GeneratedMessageLite.n(ProtoBuf.Type.Y(), ProtoBuf.Annotation.A(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        f146466g = GeneratedMessageLite.o(ProtoBuf.Type.Y(), Boolean.FALSE, null, null, 101, WireFormat.FieldType.f146811j, Boolean.class);
        f146467h = GeneratedMessageLite.n(ProtoBuf.TypeParameter.L(), ProtoBuf.Annotation.A(), null, 100, fieldType, false, ProtoBuf.Annotation.class);
        f146468i = GeneratedMessageLite.o(ProtoBuf.Class.E0(), 0, null, null, 101, fieldType2, Integer.class);
        f146469j = GeneratedMessageLite.n(ProtoBuf.Class.E0(), ProtoBuf.Property.d0(), null, 102, fieldType, false, ProtoBuf.Property.class);
        f146470k = GeneratedMessageLite.o(ProtoBuf.Class.E0(), 0, null, null, 103, fieldType2, Integer.class);
        f146471l = GeneratedMessageLite.o(ProtoBuf.Class.E0(), 0, null, null, 104, fieldType2, Integer.class);
        f146472m = GeneratedMessageLite.o(ProtoBuf.Package.L(), 0, null, null, 101, fieldType2, Integer.class);
        f146473n = GeneratedMessageLite.n(ProtoBuf.Package.L(), ProtoBuf.Property.d0(), null, 102, fieldType, false, ProtoBuf.Property.class);
    }
}
