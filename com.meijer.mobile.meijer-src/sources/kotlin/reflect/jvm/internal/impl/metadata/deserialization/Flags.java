package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;

/* loaded from: classes14.dex */
public class Flags {

    /* renamed from: A, reason: collision with root package name */
    public static final BooleanFlagField f146404A;

    /* renamed from: B, reason: collision with root package name */
    public static final BooleanFlagField f146405B;

    /* renamed from: C, reason: collision with root package name */
    public static final BooleanFlagField f146406C;

    /* renamed from: D, reason: collision with root package name */
    public static final BooleanFlagField f146407D;

    /* renamed from: E, reason: collision with root package name */
    public static final BooleanFlagField f146408E;

    /* renamed from: F, reason: collision with root package name */
    public static final BooleanFlagField f146409F;

    /* renamed from: G, reason: collision with root package name */
    public static final BooleanFlagField f146410G;

    /* renamed from: H, reason: collision with root package name */
    public static final BooleanFlagField f146411H;

    /* renamed from: I, reason: collision with root package name */
    public static final BooleanFlagField f146412I;

    /* renamed from: J, reason: collision with root package name */
    public static final BooleanFlagField f146413J;

    /* renamed from: K, reason: collision with root package name */
    public static final BooleanFlagField f146414K;

    /* renamed from: L, reason: collision with root package name */
    public static final BooleanFlagField f146415L;

    /* renamed from: M, reason: collision with root package name */
    public static final BooleanFlagField f146416M;

    /* renamed from: N, reason: collision with root package name */
    public static final BooleanFlagField f146417N;

    /* renamed from: O, reason: collision with root package name */
    public static final BooleanFlagField f146418O;

    /* renamed from: P, reason: collision with root package name */
    public static final BooleanFlagField f146419P;

    /* renamed from: a, reason: collision with root package name */
    public static final BooleanFlagField f146420a;

    /* renamed from: b, reason: collision with root package name */
    public static final BooleanFlagField f146421b;

    /* renamed from: c, reason: collision with root package name */
    public static final BooleanFlagField f146422c;

    /* renamed from: d, reason: collision with root package name */
    public static final FlagField<ProtoBuf.Visibility> f146423d;

    /* renamed from: e, reason: collision with root package name */
    public static final FlagField<ProtoBuf.Modality> f146424e;

    /* renamed from: f, reason: collision with root package name */
    public static final FlagField<ProtoBuf.Class.Kind> f146425f;

    /* renamed from: g, reason: collision with root package name */
    public static final BooleanFlagField f146426g;

    /* renamed from: h, reason: collision with root package name */
    public static final BooleanFlagField f146427h;

    /* renamed from: i, reason: collision with root package name */
    public static final BooleanFlagField f146428i;

    /* renamed from: j, reason: collision with root package name */
    public static final BooleanFlagField f146429j;

    /* renamed from: k, reason: collision with root package name */
    public static final BooleanFlagField f146430k;

    /* renamed from: l, reason: collision with root package name */
    public static final BooleanFlagField f146431l;

    /* renamed from: m, reason: collision with root package name */
    public static final BooleanFlagField f146432m;

    /* renamed from: n, reason: collision with root package name */
    public static final BooleanFlagField f146433n;

    /* renamed from: o, reason: collision with root package name */
    public static final BooleanFlagField f146434o;

    /* renamed from: p, reason: collision with root package name */
    public static final FlagField<ProtoBuf.MemberKind> f146435p;

    /* renamed from: q, reason: collision with root package name */
    public static final BooleanFlagField f146436q;

    /* renamed from: r, reason: collision with root package name */
    public static final BooleanFlagField f146437r;

    /* renamed from: s, reason: collision with root package name */
    public static final BooleanFlagField f146438s;

    /* renamed from: t, reason: collision with root package name */
    public static final BooleanFlagField f146439t;

    /* renamed from: u, reason: collision with root package name */
    public static final BooleanFlagField f146440u;

    /* renamed from: v, reason: collision with root package name */
    public static final BooleanFlagField f146441v;

    /* renamed from: w, reason: collision with root package name */
    public static final BooleanFlagField f146442w;

    /* renamed from: x, reason: collision with root package name */
    public static final BooleanFlagField f146443x;

    /* renamed from: y, reason: collision with root package name */
    public static final BooleanFlagField f146444y;

    /* renamed from: z, reason: collision with root package name */
    public static final BooleanFlagField f146445z;

    public static class BooleanFlagField extends FlagField<Boolean> {
        public BooleanFlagField(int i10) {
            super(i10, 1);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Boolean d(int i10) {
            return Boolean.valueOf((i10 & (1 << this.f146446a)) != 0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f146446a;
            }
            return 0;
        }
    }

    public static abstract class FlagField<E> {

        /* renamed from: a, reason: collision with root package name */
        public final int f146446a;

        /* renamed from: b, reason: collision with root package name */
        public final int f146447b;

        public abstract E d(int i10);

        public abstract int e(E e10);

        private FlagField(int i10, int i11) {
            this.f146446a = i10;
            this.f146447b = i11;
        }

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/Internal$EnumLite;>(Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField<*>;[TE;)Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField<TE;>; */
        public static FlagField a(FlagField flagField, Internal.EnumLite[] enumLiteArr) {
            return new b(flagField.f146446a + flagField.f146447b, enumLiteArr);
        }

        public static BooleanFlagField b(FlagField<?> flagField) {
            return new BooleanFlagField(flagField.f146446a + flagField.f146447b);
        }

        public static BooleanFlagField c() {
            return new BooleanFlagField(0);
        }
    }

    private static class b<E extends Internal.EnumLite> extends FlagField<E> {

        /* renamed from: c, reason: collision with root package name */
        private final E[] f146448c;

        private static /* synthetic */ void f(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        private static <E> int g(E[] eArr) {
            if (eArr == null) {
                f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i10 = 31; i10 >= 0; i10--) {
                if (((1 << i10) & length) != 0) {
                    return i10 + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public E d(int i10) {
            int i11 = (1 << this.f146447b) - 1;
            int i12 = this.f146446a;
            int i13 = (i10 & (i11 << i12)) >> i12;
            for (E e10 : this.f146448c) {
                if (e10.g() == i13) {
                    return e10;
                }
            }
            return null;
        }

        public b(int i10, E[] eArr) {
            super(i10, g(eArr));
            this.f146448c = eArr;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public int e(E e10) {
            return e10.g() << this.f146446a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r2 = 2
            r3 = 1
            if (r5 == r3) goto L2b
            if (r5 == r2) goto L26
            r4 = 5
            if (r5 == r4) goto L2b
            r4 = 6
            if (r5 == r4) goto L21
            r4 = 8
            if (r5 == r4) goto L2b
            r4 = 9
            if (r5 == r4) goto L21
            r4 = 11
            if (r5 == r4) goto L2b
            java.lang.String r4 = "visibility"
            r0[r1] = r4
            goto L2f
        L21:
            java.lang.String r4 = "memberKind"
            r0[r1] = r4
            goto L2f
        L26:
            java.lang.String r4 = "kind"
            r0[r1] = r4
            goto L2f
        L2b:
            java.lang.String r4 = "modality"
            r0[r1] = r4
        L2f:
            java.lang.String r1 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r3] = r1
            switch(r5) {
                case 3: goto L4a;
                case 4: goto L45;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L40;
                case 8: goto L40;
                case 9: goto L40;
                case 10: goto L3b;
                case 11: goto L3b;
                default: goto L36;
            }
        L36:
            java.lang.String r5 = "getClassFlags"
            r0[r2] = r5
            goto L4e
        L3b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r2] = r5
            goto L4e
        L40:
            java.lang.String r5 = "getPropertyFlags"
            r0[r2] = r5
            goto L4e
        L45:
            java.lang.String r5 = "getFunctionFlags"
            r0[r2] = r5
            goto L4e
        L4a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r2] = r5
        L4e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.a(int):void");
    }

    public static int b(boolean z10, ProtoBuf.Visibility visibility, ProtoBuf.Modality modality, boolean z11, boolean z12, boolean z13) {
        if (visibility == null) {
            a(10);
        }
        if (modality == null) {
            a(11);
        }
        return f146422c.e(Boolean.valueOf(z10)) | f146424e.e(modality) | f146423d.e(visibility) | f146414K.e(Boolean.valueOf(z11)) | f146415L.e(Boolean.valueOf(z12)) | f146416M.e(Boolean.valueOf(z13));
    }

    static {
        BooleanFlagField booleanFlagFieldC = FlagField.c();
        f146420a = booleanFlagFieldC;
        f146421b = FlagField.b(booleanFlagFieldC);
        BooleanFlagField booleanFlagFieldC2 = FlagField.c();
        f146422c = booleanFlagFieldC2;
        FlagField<ProtoBuf.Visibility> flagFieldA = FlagField.a(booleanFlagFieldC2, ProtoBuf.Visibility.values());
        f146423d = flagFieldA;
        FlagField<ProtoBuf.Modality> flagFieldA2 = FlagField.a(flagFieldA, ProtoBuf.Modality.values());
        f146424e = flagFieldA2;
        FlagField<ProtoBuf.Class.Kind> flagFieldA3 = FlagField.a(flagFieldA2, ProtoBuf.Class.Kind.values());
        f146425f = flagFieldA3;
        BooleanFlagField booleanFlagFieldB = FlagField.b(flagFieldA3);
        f146426g = booleanFlagFieldB;
        BooleanFlagField booleanFlagFieldB2 = FlagField.b(booleanFlagFieldB);
        f146427h = booleanFlagFieldB2;
        BooleanFlagField booleanFlagFieldB3 = FlagField.b(booleanFlagFieldB2);
        f146428i = booleanFlagFieldB3;
        BooleanFlagField booleanFlagFieldB4 = FlagField.b(booleanFlagFieldB3);
        f146429j = booleanFlagFieldB4;
        BooleanFlagField booleanFlagFieldB5 = FlagField.b(booleanFlagFieldB4);
        f146430k = booleanFlagFieldB5;
        BooleanFlagField booleanFlagFieldB6 = FlagField.b(booleanFlagFieldB5);
        f146431l = booleanFlagFieldB6;
        f146432m = FlagField.b(booleanFlagFieldB6);
        BooleanFlagField booleanFlagFieldB7 = FlagField.b(flagFieldA);
        f146433n = booleanFlagFieldB7;
        f146434o = FlagField.b(booleanFlagFieldB7);
        FlagField<ProtoBuf.MemberKind> flagFieldA4 = FlagField.a(flagFieldA2, ProtoBuf.MemberKind.values());
        f146435p = flagFieldA4;
        BooleanFlagField booleanFlagFieldB8 = FlagField.b(flagFieldA4);
        f146436q = booleanFlagFieldB8;
        BooleanFlagField booleanFlagFieldB9 = FlagField.b(booleanFlagFieldB8);
        f146437r = booleanFlagFieldB9;
        BooleanFlagField booleanFlagFieldB10 = FlagField.b(booleanFlagFieldB9);
        f146438s = booleanFlagFieldB10;
        BooleanFlagField booleanFlagFieldB11 = FlagField.b(booleanFlagFieldB10);
        f146439t = booleanFlagFieldB11;
        BooleanFlagField booleanFlagFieldB12 = FlagField.b(booleanFlagFieldB11);
        f146440u = booleanFlagFieldB12;
        BooleanFlagField booleanFlagFieldB13 = FlagField.b(booleanFlagFieldB12);
        f146441v = booleanFlagFieldB13;
        BooleanFlagField booleanFlagFieldB14 = FlagField.b(booleanFlagFieldB13);
        f146442w = booleanFlagFieldB14;
        f146443x = FlagField.b(booleanFlagFieldB14);
        BooleanFlagField booleanFlagFieldB15 = FlagField.b(flagFieldA4);
        f146444y = booleanFlagFieldB15;
        BooleanFlagField booleanFlagFieldB16 = FlagField.b(booleanFlagFieldB15);
        f146445z = booleanFlagFieldB16;
        BooleanFlagField booleanFlagFieldB17 = FlagField.b(booleanFlagFieldB16);
        f146404A = booleanFlagFieldB17;
        BooleanFlagField booleanFlagFieldB18 = FlagField.b(booleanFlagFieldB17);
        f146405B = booleanFlagFieldB18;
        BooleanFlagField booleanFlagFieldB19 = FlagField.b(booleanFlagFieldB18);
        f146406C = booleanFlagFieldB19;
        BooleanFlagField booleanFlagFieldB20 = FlagField.b(booleanFlagFieldB19);
        f146407D = booleanFlagFieldB20;
        BooleanFlagField booleanFlagFieldB21 = FlagField.b(booleanFlagFieldB20);
        f146408E = booleanFlagFieldB21;
        BooleanFlagField booleanFlagFieldB22 = FlagField.b(booleanFlagFieldB21);
        f146409F = booleanFlagFieldB22;
        f146410G = FlagField.b(booleanFlagFieldB22);
        BooleanFlagField booleanFlagFieldB23 = FlagField.b(booleanFlagFieldC2);
        f146411H = booleanFlagFieldB23;
        BooleanFlagField booleanFlagFieldB24 = FlagField.b(booleanFlagFieldB23);
        f146412I = booleanFlagFieldB24;
        f146413J = FlagField.b(booleanFlagFieldB24);
        BooleanFlagField booleanFlagFieldB25 = FlagField.b(flagFieldA2);
        f146414K = booleanFlagFieldB25;
        BooleanFlagField booleanFlagFieldB26 = FlagField.b(booleanFlagFieldB25);
        f146415L = booleanFlagFieldB26;
        f146416M = FlagField.b(booleanFlagFieldB26);
        BooleanFlagField booleanFlagFieldC3 = FlagField.c();
        f146417N = booleanFlagFieldC3;
        f146418O = FlagField.b(booleanFlagFieldC3);
        f146419P = FlagField.c();
    }
}
