package Jv;

import Fv.m;
import Fv.n;
import Hv.AbstractC3687b;
import Iv.AbstractC3761b;
import Iv.C3762c;
import Iv.JsonConfiguration;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializationException;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u00012\u00020\u0002B%\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0013J#\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0007H$¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u0002032\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u0002062\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u0002092\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020<2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020?2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020B2\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0014¢\u0006\u0004\bE\u0010\u0016J\u001f\u0010H\u001a\u00020G2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010F\u001a\u00020!H\u0014¢\u0006\u0004\bH\u0010IJ\u0017\u0010J\u001a\u00020G2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\bJ\u0010KR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010O\u001a\u0004\bP\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020U8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\bJ\u0010VR\u0014\u0010[\u001a\u00020X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z\u0082\u0001\u0003\\]^¨\u0006_"}, d2 = {"LJv/c;", "LHv/O;", "LIv/h;", "LIv/b;", "json", "LIv/i;", "value", "", "polymorphicDiscriminator", "<init>", "(LIv/b;LIv/i;Ljava/lang/String;)V", "LIv/E;", "literal", "primitive", "tag", "", "y0", "(LIv/E;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Void;", "k0", "()LIv/i;", "currentTag", "x0", "(Ljava/lang/String;)Ljava/lang/String;", "g", "T", "LDv/a;", "deserializer", "G", "(LDv/a;)Ljava/lang/Object;", "parentName", "childName", "c0", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "LFv/f;", "descriptor", "LGv/c;", "c", "(LFv/f;)LGv/c;", "", "a", "(LFv/f;)V", "", "B", "()Z", "j0", "(Ljava/lang/String;)LIv/i;", "l0", "(Ljava/lang/String;)Z", "", "m0", "(Ljava/lang/String;)B", "", "t0", "(Ljava/lang/String;)S", "", "r0", "(Ljava/lang/String;)I", "", "s0", "(Ljava/lang/String;)J", "", "p0", "(Ljava/lang/String;)F", "", "o0", "(Ljava/lang/String;)D", "", "n0", "(Ljava/lang/String;)C", "u0", "inlineDescriptor", "LGv/e;", "q0", "(Ljava/lang/String;LFv/f;)LGv/e;", "f", "(LFv/f;)LGv/e;", "LIv/b;", "d", "()LIv/b;", "LIv/i;", "w0", "e", "Ljava/lang/String;", "v0", "()Ljava/lang/String;", "LIv/g;", "LIv/g;", "configuration", "LMv/c;", "b", "()LMv/c;", "serializersModule", "LJv/E;", "LJv/H;", "LJv/I;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Jv.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
abstract class AbstractC3920c extends Hv.O implements Iv.h {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC3761b json;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Iv.i value;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String polymorphicDiscriminator;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @JvmField
    protected final JsonConfiguration configuration;

    public /* synthetic */ AbstractC3920c(AbstractC3761b abstractC3761b, Iv.i iVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3761b, iVar, str);
    }

    private final Void y0(Iv.E literal, String primitive, String tag) {
        StringBuilder sb2;
        String str;
        if (StringsKt.W(primitive, "i", false, 2, null)) {
            sb2 = new StringBuilder();
            str = "an ";
        } else {
            sb2 = new StringBuilder();
            str = "a ";
        }
        sb2.append(str);
        sb2.append(primitive);
        throw A.e(-1, "Failed to parse literal '" + literal + "' as " + sb2.toString() + " value at element: " + x0(tag), k0().toString());
    }

    public void a(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
    }

    @Override // Hv.O
    protected String c0(String parentName, String childName) {
        Intrinsics.j(parentName, "parentName");
        Intrinsics.j(childName, "childName");
        return childName;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Iv.i j0(String tag);

    public abstract Iv.i w0();

    public /* synthetic */ AbstractC3920c(AbstractC3761b abstractC3761b, Iv.i iVar, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3761b, iVar, (i10 & 4) != 0 ? null : str, null);
    }

    @Override // Hv.u0, Gv.e
    public <T> T G(Dv.a<? extends T> deserializer) {
        Iv.E eH;
        Intrinsics.j(deserializer, "deserializer");
        if (!(deserializer instanceof AbstractC3687b) || getJson().getConfiguration().getUseArrayPolymorphism()) {
            return deserializer.d(this);
        }
        AbstractC3687b abstractC3687b = (AbstractC3687b) deserializer;
        String strC = L.c(abstractC3687b.getDescriptor(), getJson());
        Iv.i iVarG = g();
        String serialName = abstractC3687b.getDescriptor().getSerialName();
        if (iVarG instanceof Iv.C) {
            Iv.C c10 = (Iv.C) iVarG;
            Iv.i iVar = (Iv.i) c10.get(strC);
            try {
                Dv.a aVarA = Dv.f.a((AbstractC3687b) deserializer, this, (iVar == null || (eH = Iv.j.h(iVar)) == null) ? null : Iv.j.d(eH));
                Intrinsics.h(aVarA, "null cannot be cast to non-null type kotlinx.serialization.DeserializationStrategy<T of kotlinx.serialization.json.internal.PolymorphicKt.decodeSerializableValuePolymorphic>");
                return (T) Y.b(getJson(), strC, c10, aVarA);
            } catch (SerializationException e10) {
                String message = e10.getMessage();
                Intrinsics.g(message);
                throw A.e(-1, message, c10.toString());
            }
        }
        throw A.e(-1, "Expected " + Reflection.b(Iv.C.class).u() + ", but had " + Reflection.b(iVarG.getClass()).u() + " as the serialized body of " + serialName + " at element: " + g0(), iVarG.toString());
    }

    @Override // Gv.e
    public Gv.c c(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        Iv.i iVarK0 = k0();
        Fv.m kind = descriptor.getKind();
        if (Intrinsics.e(kind, n.b.f11134a) || (kind instanceof Fv.d)) {
            AbstractC3761b json = getJson();
            String serialName = descriptor.getSerialName();
            if (iVarK0 instanceof C3762c) {
                return new I(json, (C3762c) iVarK0);
            }
            throw A.e(-1, "Expected " + Reflection.b(C3762c.class).u() + ", but had " + Reflection.b(iVarK0.getClass()).u() + " as the serialized body of " + serialName + " at element: " + g0(), iVarK0.toString());
        }
        if (!Intrinsics.e(kind, n.c.f11135a)) {
            AbstractC3761b json2 = getJson();
            String serialName2 = descriptor.getSerialName();
            if (iVarK0 instanceof Iv.C) {
                return new H(json2, (Iv.C) iVarK0, this.polymorphicDiscriminator, null, 8, null);
            }
            throw A.e(-1, "Expected " + Reflection.b(Iv.C.class).u() + ", but had " + Reflection.b(iVarK0.getClass()).u() + " as the serialized body of " + serialName2 + " at element: " + g0(), iVarK0.toString());
        }
        AbstractC3761b json3 = getJson();
        Fv.f fVarA = a0.a(descriptor.l(0), json3.getSerializersModule());
        Fv.m kind2 = fVarA.getKind();
        if ((kind2 instanceof Fv.e) || Intrinsics.e(kind2, m.b.f11132a)) {
            AbstractC3761b json4 = getJson();
            String serialName3 = descriptor.getSerialName();
            if (iVarK0 instanceof Iv.C) {
                return new J(json4, (Iv.C) iVarK0);
            }
            throw A.e(-1, "Expected " + Reflection.b(Iv.C.class).u() + ", but had " + Reflection.b(iVarK0.getClass()).u() + " as the serialized body of " + serialName3 + " at element: " + g0(), iVarK0.toString());
        }
        if (!json3.getConfiguration().getAllowStructuredMapKeys()) {
            throw A.c(fVarA);
        }
        AbstractC3761b json5 = getJson();
        String serialName4 = descriptor.getSerialName();
        if (iVarK0 instanceof C3762c) {
            return new I(json5, (C3762c) iVarK0);
        }
        throw A.e(-1, "Expected " + Reflection.b(C3762c.class).u() + ", but had " + Reflection.b(iVarK0.getClass()).u() + " as the serialized body of " + serialName4 + " at element: " + g0(), iVarK0.toString());
    }

    @Override // Iv.h
    /* renamed from: d, reason: from getter */
    public AbstractC3761b getJson() {
        return this.json;
    }

    @Override // Hv.u0, Gv.e
    public Gv.e f(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return W() != null ? super.f(descriptor) : new E(getJson(), w0(), this.polymorphicDiscriminator).f(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.u0
    /* renamed from: l0, reason: merged with bridge method [inline-methods] */
    public boolean M(String tag) {
        Intrinsics.j(tag, "tag");
        Iv.i iVarJ0 = j0(tag);
        if (iVarJ0 instanceof Iv.E) {
            Iv.E e10 = (Iv.E) iVarJ0;
            try {
                Boolean boolC = Iv.j.c(e10);
                if (boolC != null) {
                    return boolC.booleanValue();
                }
                y0(e10, "boolean", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                y0(e10, "boolean", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw A.e(-1, "Expected " + Reflection.b(Iv.E.class).u() + ", but had " + Reflection.b(iVarJ0.getClass()).u() + " as the serialized body of boolean at element: " + x0(tag), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.u0
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public byte N(String tag) {
        Intrinsics.j(tag, "tag");
        Iv.i iVarJ0 = j0(tag);
        if (iVarJ0 instanceof Iv.E) {
            Iv.E e10 = (Iv.E) iVarJ0;
            try {
                int iG = Iv.j.g(e10);
                Byte bValueOf = (-128 > iG || iG > 127) ? null : Byte.valueOf((byte) iG);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                y0(e10, "byte", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                y0(e10, "byte", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw A.e(-1, "Expected " + Reflection.b(Iv.E.class).u() + ", but had " + Reflection.b(iVarJ0.getClass()).u() + " as the serialized body of byte at element: " + x0(tag), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.u0
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public char O(String tag) {
        Intrinsics.j(tag, "tag");
        Iv.i iVarJ0 = j0(tag);
        if (iVarJ0 instanceof Iv.E) {
            Iv.E e10 = (Iv.E) iVarJ0;
            try {
                return StringsKt.I1(e10.getContent());
            } catch (IllegalArgumentException unused) {
                y0(e10, "char", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw A.e(-1, "Expected " + Reflection.b(Iv.E.class).u() + ", but had " + Reflection.b(iVarJ0.getClass()).u() + " as the serialized body of char at element: " + x0(tag), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.u0
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public double P(String tag) {
        Intrinsics.j(tag, "tag");
        Iv.i iVarJ0 = j0(tag);
        if (iVarJ0 instanceof Iv.E) {
            Iv.E e10 = (Iv.E) iVarJ0;
            try {
                double dE = Iv.j.e(e10);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                    return dE;
                }
                if (Double.isInfinite(dE) || Double.isNaN(dE)) {
                    throw A.a(Double.valueOf(dE), tag, k0().toString());
                }
                return dE;
            } catch (IllegalArgumentException unused) {
                y0(e10, "double", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw A.e(-1, "Expected " + Reflection.b(Iv.E.class).u() + ", but had " + Reflection.b(iVarJ0.getClass()).u() + " as the serialized body of double at element: " + x0(tag), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.u0
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public float Q(String tag) {
        Intrinsics.j(tag, "tag");
        Iv.i iVarJ0 = j0(tag);
        if (iVarJ0 instanceof Iv.E) {
            Iv.E e10 = (Iv.E) iVarJ0;
            try {
                float f10 = Iv.j.f(e10);
                if (getJson().getConfiguration().getAllowSpecialFloatingPointValues()) {
                    return f10;
                }
                if (Float.isInfinite(f10) || Float.isNaN(f10)) {
                    throw A.a(Float.valueOf(f10), tag, k0().toString());
                }
                return f10;
            } catch (IllegalArgumentException unused) {
                y0(e10, "float", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw A.e(-1, "Expected " + Reflection.b(Iv.E.class).u() + ", but had " + Reflection.b(iVarJ0.getClass()).u() + " as the serialized body of float at element: " + x0(tag), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.u0
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public Gv.e R(String tag, Fv.f inlineDescriptor) {
        Intrinsics.j(tag, "tag");
        Intrinsics.j(inlineDescriptor, "inlineDescriptor");
        if (!T.b(inlineDescriptor)) {
            return super.R(tag, inlineDescriptor);
        }
        AbstractC3761b json = getJson();
        Iv.i iVarJ0 = j0(tag);
        String serialName = inlineDescriptor.getSerialName();
        if (iVarJ0 instanceof Iv.E) {
            return new C3941y(V.a(json, ((Iv.E) iVarJ0).getContent()), getJson());
        }
        throw A.e(-1, "Expected " + Reflection.b(Iv.E.class).u() + ", but had " + Reflection.b(iVarJ0.getClass()).u() + " as the serialized body of " + serialName + " at element: " + x0(tag), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.u0
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public int S(String tag) {
        Intrinsics.j(tag, "tag");
        Iv.i iVarJ0 = j0(tag);
        if (iVarJ0 instanceof Iv.E) {
            Iv.E e10 = (Iv.E) iVarJ0;
            try {
                return Iv.j.g(e10);
            } catch (IllegalArgumentException unused) {
                y0(e10, "int", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw A.e(-1, "Expected " + Reflection.b(Iv.E.class).u() + ", but had " + Reflection.b(iVarJ0.getClass()).u() + " as the serialized body of int at element: " + x0(tag), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.u0
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public long T(String tag) {
        Intrinsics.j(tag, "tag");
        Iv.i iVarJ0 = j0(tag);
        if (iVarJ0 instanceof Iv.E) {
            Iv.E e10 = (Iv.E) iVarJ0;
            try {
                return Iv.j.j(e10);
            } catch (IllegalArgumentException unused) {
                y0(e10, "long", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw A.e(-1, "Expected " + Reflection.b(Iv.E.class).u() + ", but had " + Reflection.b(iVarJ0.getClass()).u() + " as the serialized body of long at element: " + x0(tag), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.u0
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public short U(String tag) {
        Intrinsics.j(tag, "tag");
        Iv.i iVarJ0 = j0(tag);
        if (iVarJ0 instanceof Iv.E) {
            Iv.E e10 = (Iv.E) iVarJ0;
            try {
                int iG = Iv.j.g(e10);
                Short shValueOf = (-32768 > iG || iG > 32767) ? null : Short.valueOf((short) iG);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                y0(e10, "short", tag);
                throw new KotlinNothingValueException();
            } catch (IllegalArgumentException unused) {
                y0(e10, "short", tag);
                throw new KotlinNothingValueException();
            }
        }
        throw A.e(-1, "Expected " + Reflection.b(Iv.E.class).u() + ", but had " + Reflection.b(iVarJ0.getClass()).u() + " as the serialized body of short at element: " + x0(tag), iVarJ0.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Hv.u0
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public String V(String tag) {
        Intrinsics.j(tag, "tag");
        Iv.i iVarJ0 = j0(tag);
        if (!(iVarJ0 instanceof Iv.E)) {
            throw A.e(-1, "Expected " + Reflection.b(Iv.E.class).u() + ", but had " + Reflection.b(iVarJ0.getClass()).u() + " as the serialized body of string at element: " + x0(tag), iVarJ0.toString());
        }
        Iv.E e10 = (Iv.E) iVarJ0;
        if (!(e10 instanceof Iv.v)) {
            throw A.e(-1, "Expected string value for a non-null key '" + tag + "', got null literal instead at element: " + x0(tag), k0().toString());
        }
        Iv.v vVar = (Iv.v) e10;
        if (vVar.getIsString() || getJson().getConfiguration().getIsLenient()) {
            return vVar.getContent();
        }
        throw A.e(-1, "String literal for key '" + tag + "' should be quoted at element: " + x0(tag) + ".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", k0().toString());
    }

    /* renamed from: v0, reason: from getter */
    protected final String getPolymorphicDiscriminator() {
        return this.polymorphicDiscriminator;
    }

    public final String x0(String currentTag) {
        Intrinsics.j(currentTag, "currentTag");
        return g0() + '.' + currentTag;
    }

    private AbstractC3920c(AbstractC3761b abstractC3761b, Iv.i iVar, String str) {
        this.json = abstractC3761b;
        this.value = iVar;
        this.polymorphicDiscriminator = str;
        this.configuration = getJson().getConfiguration();
    }

    @Override // Gv.e
    public boolean B() {
        return !(k0() instanceof Iv.z);
    }

    @Override // Gv.c
    /* renamed from: b */
    public Mv.c getSerializersModule() {
        return getJson().getSerializersModule();
    }

    @Override // Iv.h
    public Iv.i g() {
        return k0();
    }

    protected final Iv.i k0() {
        Iv.i iVarJ0;
        String strW = W();
        if (strW != null && (iVarJ0 = j0(strW)) != null) {
            return iVarJ0;
        }
        return w0();
    }
}
