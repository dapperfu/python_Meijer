package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* loaded from: classes14.dex */
public final class ProtoEnumFlags {

    /* renamed from: a, reason: collision with root package name */
    public static final ProtoEnumFlags f147344a = new ProtoEnumFlags();

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;
        public static final /* synthetic */ int[] $EnumSwitchMapping$6;
        public static final /* synthetic */ int[] $EnumSwitchMapping$7;

        static {
            int[] iArr = new int[ProtoBuf.Modality.values().length];
            try {
                iArr[ProtoBuf.Modality.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.Modality.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.Modality.ABSTRACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProtoBuf.Modality.SEALED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Modality.values().length];
            try {
                iArr2[Modality.f144526b.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Modality.f144528d.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Modality.f144529e.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Modality.f144527c.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ProtoBuf.Visibility.values().length];
            try {
                iArr3[ProtoBuf.Visibility.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ProtoBuf.Visibility.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ProtoBuf.Visibility.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[ProtoBuf.Class.Kind.values().length];
            try {
                iArr4[ProtoBuf.Class.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.INTERFACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.ENUM_CLASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.ENUM_ENTRY.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.ANNOTATION_CLASS.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[ProtoBuf.Class.Kind.COMPANION_OBJECT.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ClassKind.values().length];
            try {
                iArr5[ClassKind.f144492b.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr5[ClassKind.f144493c.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[ClassKind.f144494d.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[ClassKind.f144495e.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[ClassKind.f144496f.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[ClassKind.f144497g.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[ProtoBuf.TypeParameter.Variance.values().length];
            try {
                iArr6[ProtoBuf.TypeParameter.Variance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr6[ProtoBuf.TypeParameter.Variance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr6[ProtoBuf.TypeParameter.Variance.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            $EnumSwitchMapping$5 = iArr6;
            int[] iArr7 = new int[ProtoBuf.Type.Argument.Projection.values().length];
            try {
                iArr7[ProtoBuf.Type.Argument.Projection.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr7[ProtoBuf.Type.Argument.Projection.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr7[ProtoBuf.Type.Argument.Projection.INV.ordinal()] = 3;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr7[ProtoBuf.Type.Argument.Projection.STAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused34) {
            }
            $EnumSwitchMapping$6 = iArr7;
            int[] iArr8 = new int[Variance.values().length];
            try {
                iArr8[Variance.f147704f.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr8[Variance.f147705g.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr8[Variance.f147703e.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            $EnumSwitchMapping$7 = iArr8;
        }
    }

    public final ClassKind a(ProtoBuf.Class.Kind kind) {
        switch (kind == null ? -1 : WhenMappings.$EnumSwitchMapping$3[kind.ordinal()]) {
            case 1:
                return ClassKind.f144492b;
            case 2:
                return ClassKind.f144493c;
            case 3:
                return ClassKind.f144494d;
            case 4:
                return ClassKind.f144495e;
            case 5:
                return ClassKind.f144496f;
            case 6:
            case 7:
                return ClassKind.f144497g;
            default:
                return ClassKind.f144492b;
        }
    }

    public final Modality b(ProtoBuf.Modality modality) {
        int i10 = modality == null ? -1 : WhenMappings.$EnumSwitchMapping$0[modality.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? Modality.f144526b : Modality.f144527c : Modality.f144529e : Modality.f144528d : Modality.f144526b;
    }

    public final Variance c(ProtoBuf.Type.Argument.Projection projection) {
        Intrinsics.j(projection, "projection");
        int i10 = WhenMappings.$EnumSwitchMapping$6[projection.ordinal()];
        if (i10 == 1) {
            return Variance.f147704f;
        }
        if (i10 == 2) {
            return Variance.f147705g;
        }
        if (i10 == 3) {
            return Variance.f147703e;
        }
        if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalArgumentException("Only IN, OUT and INV are supported. Actual argument: " + projection);
    }

    public final Variance d(ProtoBuf.TypeParameter.Variance variance) {
        Intrinsics.j(variance, "variance");
        int i10 = WhenMappings.$EnumSwitchMapping$5[variance.ordinal()];
        if (i10 == 1) {
            return Variance.f147704f;
        }
        if (i10 == 2) {
            return Variance.f147705g;
        }
        if (i10 == 3) {
            return Variance.f147703e;
        }
        throw new NoWhenBranchMatchedException();
    }

    private ProtoEnumFlags() {
    }
}
