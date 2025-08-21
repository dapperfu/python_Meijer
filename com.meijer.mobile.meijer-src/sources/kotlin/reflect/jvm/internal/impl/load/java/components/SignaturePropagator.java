package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaMethod;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
public interface SignaturePropagator {

    /* renamed from: a, reason: collision with root package name */
    public static final SignaturePropagator f145251a = new a();

    public static class PropagatedSignature {

        /* renamed from: a, reason: collision with root package name */
        private final KotlinType f145252a;

        /* renamed from: b, reason: collision with root package name */
        private final KotlinType f145253b;

        /* renamed from: c, reason: collision with root package name */
        private final List<ValueParameterDescriptor> f145254c;

        /* renamed from: d, reason: collision with root package name */
        private final List<TypeParameterDescriptor> f145255d;

        /* renamed from: e, reason: collision with root package name */
        private final List<String> f145256e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f145257f;

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
            switch (i10) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i10 == 4) {
                objArr[1] = "getReturnType";
            } else if (i10 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i10 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i10 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public PropagatedSignature(KotlinType kotlinType, KotlinType kotlinType2, List<ValueParameterDescriptor> list, List<TypeParameterDescriptor> list2, List<String> list3, boolean z10) {
            if (kotlinType == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f145252a = kotlinType;
            this.f145253b = kotlinType2;
            this.f145254c = list;
            this.f145255d = list2;
            this.f145256e = list3;
            this.f145257f = z10;
        }

        public List<String> b() {
            List<String> list = this.f145256e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        public KotlinType c() {
            return this.f145253b;
        }

        public KotlinType d() {
            KotlinType kotlinType = this.f145252a;
            if (kotlinType == null) {
                a(4);
            }
            return kotlinType;
        }

        public List<TypeParameterDescriptor> e() {
            List<TypeParameterDescriptor> list = this.f145255d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        public List<ValueParameterDescriptor> f() {
            List<ValueParameterDescriptor> list = this.f145254c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f145257f;
        }
    }

    static class a implements SignaturePropagator {
        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i10 == 5 || i10 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        public PropagatedSignature a(JavaMethod javaMethod, ClassDescriptor classDescriptor, KotlinType kotlinType, KotlinType kotlinType2, List<ValueParameterDescriptor> list, List<TypeParameterDescriptor> list2) {
            if (javaMethod == null) {
                c(0);
            }
            if (classDescriptor == null) {
                c(1);
            }
            if (kotlinType == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new PropagatedSignature(kotlinType, kotlinType2, list, list2, Collections.EMPTY_LIST, false);
        }

        @Override // kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator
        public void b(CallableMemberDescriptor callableMemberDescriptor, List<String> list) {
            if (callableMemberDescriptor == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        a() {
        }
    }

    PropagatedSignature a(JavaMethod javaMethod, ClassDescriptor classDescriptor, KotlinType kotlinType, KotlinType kotlinType2, List<ValueParameterDescriptor> list, List<TypeParameterDescriptor> list2);

    void b(CallableMemberDescriptor callableMemberDescriptor, List<String> list);
}
