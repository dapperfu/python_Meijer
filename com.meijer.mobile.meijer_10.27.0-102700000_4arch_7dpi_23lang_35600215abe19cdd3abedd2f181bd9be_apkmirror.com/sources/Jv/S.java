package Jv;

import Iv.AbstractC3761b;
import Iv.JsonConfiguration;
import com.google.maps.android.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB1\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t¢\u0006\u0004\b\u000b\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010!\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010(\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010\u001cJA\u0010*\u001a\u00020\u0013\"\b\b\u0000\u0010\u001d*\u00020)2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\b\u0010 \u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001aH\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00132\u0006\u0010 \u001a\u000203H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\u00132\u0006\u0010 \u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\u00132\u0006\u0010 \u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00132\u0006\u0010 \u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u00132\u0006\u0010 \u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u00132\u0006\u0010 \u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\bG\u0010HR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010IR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010NR\u001e\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010OR\u001a\u0010T\u001a\u00020P8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bJ\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010[R\u0018\u0010^\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010[¨\u0006_"}, d2 = {"LJv/S;", "LIv/s;", "LGv/b;", "LJv/j;", "composer", "LIv/b;", "json", "LJv/Z;", "mode", "", "modeReuseCache", "<init>", "(LJv/j;LIv/b;LJv/Z;[LIv/s;)V", "LJv/x;", "output", "(LJv/x;LIv/b;LJv/Z;[LIv/s;)V", "", "discriminator", "serialName", "", "H", "(Ljava/lang/String;Ljava/lang/String;)V", "LFv/f;", "descriptor", "", "index", "", "m", "(LFv/f;I)Z", "T", "LDv/h;", "serializer", "value", "p", "(LDv/h;Ljava/lang/Object;)V", "LGv/d;", "c", "(LFv/f;)LGv/d;", "a", "(LFv/f;)V", "F", "", "o", "(LFv/f;ILDv/h;Ljava/lang/Object;)V", "LGv/f;", "D", "(LFv/f;)LGv/f;", "r", "()V", "t", "(Z)V", "", "h", "(B)V", "", "s", "(S)V", "A", "(I)V", "", "q", "(J)V", "", "u", "(F)V", "", "g", "(D)V", "", "w", "(C)V", "E", "(Ljava/lang/String;)V", "LJv/j;", "b", "LIv/b;", "d", "()LIv/b;", "LJv/Z;", "[LIv/s;", "LMv/c;", "e", "LMv/c;", "()LMv/c;", "serializersModule", "LIv/g;", "f", "LIv/g;", "configuration", "Z", "forceQuoting", "Ljava/lang/String;", "polymorphicDiscriminator", "i", "polymorphicSerialName", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class S extends Gv.b implements Iv.s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C3927j composer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3761b json;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Z mode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Iv.s[] modeReuseCache;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Mv.c serializersModule;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final JsonConfiguration configuration;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean forceQuoting;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String polymorphicDiscriminator;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String polymorphicSerialName;

    public S(C3927j composer, AbstractC3761b json, Z mode, Iv.s[] sVarArr) {
        Intrinsics.j(composer, "composer");
        Intrinsics.j(json, "json");
        Intrinsics.j(mode, "mode");
        this.composer = composer;
        this.json = json;
        this.mode = mode;
        this.modeReuseCache = sVarArr;
        this.serializersModule = getJson().getSerializersModule();
        this.configuration = getJson().getConfiguration();
        int iOrdinal = mode.ordinal();
        if (sVarArr != null) {
            Iv.s sVar = sVarArr[iOrdinal];
            if (sVar == null && sVar == this) {
                return;
            }
            sVarArr[iOrdinal] = this;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Z.values().length];
            try {
                iArr[Z.f16226d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Z.f16227e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Z.f16228f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void H(String discriminator, String serialName) {
        this.composer.c();
        E(discriminator);
        this.composer.f(':');
        this.composer.p();
        E(serialName);
    }

    @Override // Gv.b, Gv.f
    public void A(int value) {
        if (this.forceQuoting) {
            E(String.valueOf(value));
        } else {
            this.composer.i(value);
        }
    }

    @Override // Gv.b, Gv.f
    public Gv.f D(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        if (T.b(descriptor)) {
            C3927j c3934q = this.composer;
            if (!(c3934q instanceof C3934q)) {
                c3934q = new C3934q(c3934q.writer, this.forceQuoting);
            }
            return new S(c3934q, getJson(), this.mode, (Iv.s[]) null);
        }
        if (T.a(descriptor)) {
            C3927j c3928k = this.composer;
            if (!(c3928k instanceof C3928k)) {
                c3928k = new C3928k(c3928k.writer, this.forceQuoting);
            }
            return new S(c3928k, getJson(), this.mode, (Iv.s[]) null);
        }
        if (this.polymorphicDiscriminator == null) {
            return super.D(descriptor);
        }
        this.polymorphicSerialName = descriptor.getSerialName();
        return this;
    }

    @Override // Gv.b, Gv.f
    public void E(String value) {
        Intrinsics.j(value, "value");
        this.composer.n(value);
    }

    @Override // Gv.b
    public boolean F(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        int i10 = a.$EnumSwitchMapping$0[this.mode.ordinal()];
        if (i10 != 1) {
            boolean z10 = false;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (!this.composer.getWritingFirst()) {
                        this.composer.f(',');
                    }
                    this.composer.c();
                    E(C.h(descriptor, getJson(), index));
                    this.composer.f(':');
                    this.composer.p();
                } else {
                    if (index == 0) {
                        this.forceQuoting = true;
                    }
                    if (index == 1) {
                        this.composer.f(',');
                        this.composer.p();
                        this.forceQuoting = false;
                    }
                }
            } else if (this.composer.getWritingFirst()) {
                this.forceQuoting = true;
                this.composer.c();
            } else {
                if (index % 2 == 0) {
                    this.composer.f(',');
                    this.composer.c();
                    z10 = true;
                } else {
                    this.composer.f(':');
                    this.composer.p();
                }
                this.forceQuoting = z10;
            }
        } else {
            if (!this.composer.getWritingFirst()) {
                this.composer.f(',');
            }
            this.composer.c();
        }
        return true;
    }

    @Override // Gv.b, Gv.d
    public void a(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        if (this.mode.end != 0) {
            this.composer.q();
            this.composer.d();
            this.composer.f(this.mode.end);
        }
    }

    @Override // Gv.f
    /* renamed from: b, reason: from getter */
    public Mv.c getSerializersModule() {
        return this.serializersModule;
    }

    @Override // Gv.b, Gv.f
    public Gv.d c(Fv.f descriptor) {
        Iv.s sVar;
        Intrinsics.j(descriptor, "descriptor");
        Z zB = a0.b(getJson(), descriptor);
        char c10 = zB.begin;
        if (c10 != 0) {
            this.composer.f(c10);
            this.composer.b();
        }
        String str = this.polymorphicDiscriminator;
        if (str != null) {
            String serialName = this.polymorphicSerialName;
            if (serialName == null) {
                serialName = descriptor.getSerialName();
            }
            H(str, serialName);
            this.polymorphicDiscriminator = null;
            this.polymorphicSerialName = null;
        }
        if (this.mode == zB) {
            return this;
        }
        Iv.s[] sVarArr = this.modeReuseCache;
        return (sVarArr == null || (sVar = sVarArr[zB.ordinal()]) == null) ? new S(this.composer, getJson(), zB, this.modeReuseCache) : sVar;
    }

    @Override // Iv.s
    /* renamed from: d, reason: from getter */
    public AbstractC3761b getJson() {
        return this.json;
    }

    @Override // Gv.b, Gv.f
    public void g(double value) {
        if (this.forceQuoting) {
            E(String.valueOf(value));
        } else {
            this.composer.g(value);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Double.isInfinite(value) || Double.isNaN(value)) {
            throw A.b(Double.valueOf(value), this.composer.writer.toString());
        }
    }

    @Override // Gv.b, Gv.f
    public void h(byte value) {
        if (this.forceQuoting) {
            E(String.valueOf((int) value));
        } else {
            this.composer.e(value);
        }
    }

    @Override // Gv.b, Gv.d
    public boolean m(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    @Override // Gv.b, Gv.d
    public <T> void o(Fv.f descriptor, int index, Dv.h<? super T> serializer, T value) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(serializer, "serializer");
        if (value != null || this.configuration.getExplicitNulls()) {
            super.o(descriptor, index, serializer, value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    @Override // Gv.b, Gv.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> void p(Dv.h<? super T> r4, T r5) {
        /*
            r3 = this;
            java.lang.String r0 = "serializer"
            kotlin.jvm.internal.Intrinsics.j(r4, r0)
            Iv.b r0 = r3.getJson()
            Iv.g r0 = r0.getConfiguration()
            boolean r0 = r0.getUseArrayPolymorphism()
            if (r0 == 0) goto L17
            r4.b(r3, r5)
            return
        L17:
            boolean r0 = r4 instanceof Hv.AbstractC3687b
            if (r0 == 0) goto L2c
            Iv.b r1 = r3.getJson()
            Iv.g r1 = r1.getConfiguration()
            Iv.a r1 = r1.getClassDiscriminatorMode()
            Iv.a r2 = Iv.EnumC3760a.f14392a
            if (r1 == r2) goto L74
            goto L61
        L2c:
            Iv.b r1 = r3.getJson()
            Iv.g r1 = r1.getConfiguration()
            Iv.a r1 = r1.getClassDiscriminatorMode()
            int[] r2 = Jv.L.a.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            if (r1 == r2) goto L74
            r2 = 2
            if (r1 == r2) goto L74
            r2 = 3
            if (r1 != r2) goto L6e
            Fv.f r1 = r4.getDescriptor()
            Fv.m r1 = r1.getKind()
            Fv.n$a r2 = Fv.n.a.f11133a
            boolean r2 = kotlin.jvm.internal.Intrinsics.e(r1, r2)
            if (r2 != 0) goto L61
            Fv.n$d r2 = Fv.n.d.f11136a
            boolean r1 = kotlin.jvm.internal.Intrinsics.e(r1, r2)
            if (r1 == 0) goto L74
        L61:
            Fv.f r1 = r4.getDescriptor()
            Iv.b r2 = r3.getJson()
            java.lang.String r1 = Jv.L.c(r1, r2)
            goto L75
        L6e:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L74:
            r1 = 0
        L75:
            if (r0 == 0) goto Lbb
            r0 = r4
            Hv.b r0 = (Hv.AbstractC3687b) r0
            if (r5 == 0) goto L97
            Dv.h r0 = Dv.f.b(r0, r3, r5)
            if (r1 == 0) goto L85
            Jv.L.a(r4, r0, r1)
        L85:
            Fv.f r4 = r0.getDescriptor()
            Fv.m r4 = r4.getKind()
            Jv.L.b(r4)
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.encodePolymorphically>"
            kotlin.jvm.internal.Intrinsics.h(r0, r4)
            r4 = r0
            goto Lbb
        L97:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Value for serializer "
            r4.append(r5)
            Fv.f r5 = r0.getDescriptor()
            r4.append(r5)
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
        Lbb:
            if (r1 == 0) goto Lc9
            Fv.f r0 = r4.getDescriptor()
            java.lang.String r0 = r0.getSerialName()
            r3.polymorphicDiscriminator = r1
            r3.polymorphicSerialName = r0
        Lc9:
            r4.b(r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Jv.S.p(Dv.h, java.lang.Object):void");
    }

    @Override // Gv.b, Gv.f
    public void q(long value) {
        if (this.forceQuoting) {
            E(String.valueOf(value));
        } else {
            this.composer.j(value);
        }
    }

    @Override // Gv.f
    public void r() {
        this.composer.k(BuildConfig.TRAVIS);
    }

    @Override // Gv.b, Gv.f
    public void s(short value) {
        if (this.forceQuoting) {
            E(String.valueOf((int) value));
        } else {
            this.composer.l(value);
        }
    }

    @Override // Gv.b, Gv.f
    public void t(boolean value) {
        if (this.forceQuoting) {
            E(String.valueOf(value));
        } else {
            this.composer.m(value);
        }
    }

    @Override // Gv.b, Gv.f
    public void u(float value) {
        if (this.forceQuoting) {
            E(String.valueOf(value));
        } else {
            this.composer.h(value);
        }
        if (this.configuration.getAllowSpecialFloatingPointValues()) {
            return;
        }
        if (Float.isInfinite(value) || Float.isNaN(value)) {
            throw A.b(Float.valueOf(value), this.composer.writer.toString());
        }
    }

    @Override // Gv.b, Gv.f
    public void w(char value) {
        E(String.valueOf(value));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public S(InterfaceC3940x output, AbstractC3761b json, Z mode, Iv.s[] modeReuseCache) {
        this(C3935s.a(output, json), json, mode, modeReuseCache);
        Intrinsics.j(output, "output");
        Intrinsics.j(json, "json");
        Intrinsics.j(mode, "mode");
        Intrinsics.j(modeReuseCache, "modeReuseCache");
    }
}
