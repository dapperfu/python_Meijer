package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FieldDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ContextReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.storage.NullableLazyValue;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;

/* loaded from: classes13.dex */
public class PropertyDescriptorImpl extends VariableDescriptorWithInitializerImpl implements PropertyDescriptor {

    /* renamed from: A, reason: collision with root package name */
    private FieldDescriptor f143956A;

    /* renamed from: B, reason: collision with root package name */
    private FieldDescriptor f143957B;

    /* renamed from: i, reason: collision with root package name */
    private final Modality f143958i;

    /* renamed from: j, reason: collision with root package name */
    private DescriptorVisibility f143959j;

    /* renamed from: k, reason: collision with root package name */
    private Collection<? extends PropertyDescriptor> f143960k;

    /* renamed from: l, reason: collision with root package name */
    private final PropertyDescriptor f143961l;

    /* renamed from: m, reason: collision with root package name */
    private final CallableMemberDescriptor.Kind f143962m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f143963n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f143964o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f143965p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f143966q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f143967r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f143968s;

    /* renamed from: t, reason: collision with root package name */
    private List<ReceiverParameterDescriptor> f143969t;

    /* renamed from: u, reason: collision with root package name */
    private ReceiverParameterDescriptor f143970u;

    /* renamed from: v, reason: collision with root package name */
    private ReceiverParameterDescriptor f143971v;

    /* renamed from: w, reason: collision with root package name */
    private List<TypeParameterDescriptor> f143972w;

    /* renamed from: x, reason: collision with root package name */
    private PropertyGetterDescriptorImpl f143973x;

    /* renamed from: y, reason: collision with root package name */
    private PropertySetterDescriptor f143974y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f143975z;

    public class CopyConfiguration {

        /* renamed from: a, reason: collision with root package name */
        private DeclarationDescriptor f143976a;

        /* renamed from: b, reason: collision with root package name */
        private Modality f143977b;

        /* renamed from: c, reason: collision with root package name */
        private DescriptorVisibility f143978c;

        /* renamed from: f, reason: collision with root package name */
        private CallableMemberDescriptor.Kind f143981f;

        /* renamed from: i, reason: collision with root package name */
        private ReceiverParameterDescriptor f143984i;

        /* renamed from: k, reason: collision with root package name */
        private Name f143986k;

        /* renamed from: l, reason: collision with root package name */
        private KotlinType f143987l;

        /* renamed from: d, reason: collision with root package name */
        private PropertyDescriptor f143979d = null;

        /* renamed from: e, reason: collision with root package name */
        private boolean f143980e = false;

        /* renamed from: g, reason: collision with root package name */
        private TypeSubstitution f143982g = TypeSubstitution.f146778b;

        /* renamed from: h, reason: collision with root package name */
        private boolean f143983h = true;

        /* renamed from: j, reason: collision with root package name */
        private List<TypeParameterDescriptor> f143985j = null;

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) ? 2 : 3];
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i10 == 1) {
                objArr[1] = "setOwner";
            } else if (i10 == 2) {
                objArr[1] = "setOriginal";
            } else if (i10 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i10 == 5) {
                objArr[1] = "setReturnType";
            } else if (i10 == 7) {
                objArr[1] = "setModality";
            } else if (i10 == 9) {
                objArr[1] = "setVisibility";
            } else if (i10 == 11) {
                objArr[1] = "setKind";
            } else if (i10 == 19) {
                objArr[1] = "setName";
            } else if (i10 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i10 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i10 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i10 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i10) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public CopyConfiguration() {
            this.f143976a = PropertyDescriptorImpl.this.b();
            this.f143977b = PropertyDescriptorImpl.this.q();
            this.f143978c = PropertyDescriptorImpl.this.getVisibility();
            this.f143981f = PropertyDescriptorImpl.this.f();
            this.f143984i = PropertyDescriptorImpl.this.f143970u;
            this.f143986k = PropertyDescriptorImpl.this.getName();
            this.f143987l = PropertyDescriptorImpl.this.getType();
        }

        public PropertyDescriptor n() {
            return PropertyDescriptorImpl.this.O0(this);
        }

        PropertyGetterDescriptor o() {
            PropertyDescriptor propertyDescriptor = this.f143979d;
            if (propertyDescriptor == null) {
                return null;
            }
            return propertyDescriptor.getGetter();
        }

        PropertySetterDescriptor p() {
            PropertyDescriptor propertyDescriptor = this.f143979d;
            if (propertyDescriptor == null) {
                return null;
            }
            return propertyDescriptor.getSetter();
        }

        public CopyConfiguration q(boolean z10) {
            this.f143983h = z10;
            return this;
        }

        public CopyConfiguration r(CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                a(10);
            }
            this.f143981f = kind;
            return this;
        }

        public CopyConfiguration s(Modality modality) {
            if (modality == null) {
                a(6);
            }
            this.f143977b = modality;
            return this;
        }

        public CopyConfiguration t(CallableMemberDescriptor callableMemberDescriptor) {
            this.f143979d = (PropertyDescriptor) callableMemberDescriptor;
            return this;
        }

        public CopyConfiguration u(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                a(0);
            }
            this.f143976a = declarationDescriptor;
            return this;
        }

        public CopyConfiguration v(TypeSubstitution typeSubstitution) {
            if (typeSubstitution == null) {
                a(15);
            }
            this.f143982g = typeSubstitution;
            return this;
        }

        public CopyConfiguration w(DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility == null) {
                a(8);
            }
            this.f143978c = descriptorVisibility;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected PropertyDescriptorImpl(DeclarationDescriptor declarationDescriptor, PropertyDescriptor propertyDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z10, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        super(declarationDescriptor, annotations, name, null, z10, sourceElement);
        if (declarationDescriptor == null) {
            e0(0);
        }
        if (annotations == null) {
            e0(1);
        }
        if (modality == null) {
            e0(2);
        }
        if (descriptorVisibility == null) {
            e0(3);
        }
        if (name == null) {
            e0(4);
        }
        if (kind == null) {
            e0(5);
        }
        if (sourceElement == null) {
            e0(6);
        }
        this.f143960k = null;
        this.f143969t = Collections.EMPTY_LIST;
        this.f143958i = modality;
        this.f143959j = descriptorVisibility;
        this.f143961l = propertyDescriptor == null ? this : propertyDescriptor;
        this.f143962m = kind;
        this.f143963n = z11;
        this.f143964o = z12;
        this.f143965p = z13;
        this.f143966q = z14;
        this.f143967r = z15;
        this.f143968s = z16;
    }

    public static PropertyDescriptorImpl M0(DeclarationDescriptor declarationDescriptor, Annotations annotations, Modality modality, DescriptorVisibility descriptorVisibility, boolean z10, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        if (declarationDescriptor == null) {
            e0(7);
        }
        if (annotations == null) {
            e0(8);
        }
        if (modality == null) {
            e0(9);
        }
        if (descriptorVisibility == null) {
            e0(10);
        }
        if (name == null) {
            e0(11);
        }
        if (kind == null) {
            e0(12);
        }
        if (sourceElement == null) {
            e0(13);
        }
        return new PropertyDescriptorImpl(declarationDescriptor, null, annotations, modality, descriptorVisibility, z10, name, kind, sourceElement, z11, z12, z13, z14, z15, z16);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void e0(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.PropertyDescriptorImpl.e0(int):void");
    }

    public void S0(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, PropertySetterDescriptor propertySetterDescriptor) {
        T0(propertyGetterDescriptorImpl, propertySetterDescriptor, null, null);
    }

    public void X0(KotlinType kotlinType) {
        if (kotlinType == null) {
            e0(14);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V r0(CallableDescriptor.UserDataKey<V> userDataKey) {
        return null;
    }

    private SourceElement Q0(boolean z10, PropertyDescriptor propertyDescriptor) {
        SourceElement sourceElementG;
        if (z10) {
            if (propertyDescriptor == null) {
                propertyDescriptor = a();
            }
            sourceElementG = propertyDescriptor.g();
        } else {
            sourceElementG = SourceElement.f143647a;
        }
        if (sourceElementG == null) {
            e0(28);
        }
        return sourceElementG;
    }

    private static FunctionDescriptor R0(TypeSubstitutor typeSubstitutor, PropertyAccessorDescriptor propertyAccessorDescriptor) {
        if (typeSubstitutor == null) {
            e0(30);
        }
        if (propertyAccessorDescriptor == null) {
            e0(31);
        }
        if (propertyAccessorDescriptor.p0() != null) {
            return propertyAccessorDescriptor.p0().c(typeSubstitutor);
        }
        return null;
    }

    private static DescriptorVisibility W0(DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind) {
        return (kind == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && DescriptorVisibilities.g(descriptorVisibility.f())) ? DescriptorVisibilities.f143603h : descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public boolean A() {
        return this.f143968s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void A0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            e0(40);
        }
        this.f143960k = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor J() {
        return this.f143970u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor N() {
        return this.f143971v;
    }

    protected PropertyDescriptorImpl N0(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, PropertyDescriptor propertyDescriptor, CallableMemberDescriptor.Kind kind, Name name, SourceElement sourceElement) {
        if (declarationDescriptor == null) {
            e0(32);
        }
        if (modality == null) {
            e0(33);
        }
        if (descriptorVisibility == null) {
            e0(34);
        }
        if (kind == null) {
            e0(35);
        }
        if (name == null) {
            e0(36);
        }
        if (sourceElement == null) {
            e0(37);
        }
        return new PropertyDescriptorImpl(declarationDescriptor, propertyDescriptor, getAnnotations(), modality, descriptorVisibility, L(), name, kind, sourceElement, v0(), isConst(), h0(), V(), isExternal(), A());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public FieldDescriptor O() {
        return this.f143957B;
    }

    protected PropertyDescriptor O0(CopyConfiguration copyConfiguration) {
        ReceiverParameterDescriptor receiverParameterDescriptor;
        Function0<NullableLazyValue<ConstantValue<?>>> function0;
        if (copyConfiguration == null) {
            e0(29);
        }
        PropertyDescriptorImpl propertyDescriptorImplN0 = N0(copyConfiguration.f143976a, copyConfiguration.f143977b, copyConfiguration.f143978c, copyConfiguration.f143979d, copyConfiguration.f143981f, copyConfiguration.f143986k, Q0(copyConfiguration.f143980e, copyConfiguration.f143979d));
        List<TypeParameterDescriptor> typeParameters = copyConfiguration.f143985j == null ? getTypeParameters() : copyConfiguration.f143985j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        TypeSubstitutor typeSubstitutorB = DescriptorSubstitutor.b(typeParameters, copyConfiguration.f143982g, propertyDescriptorImplN0, arrayList);
        KotlinType kotlinType = copyConfiguration.f143987l;
        KotlinType kotlinTypeP = typeSubstitutorB.p(kotlinType, Variance.f146798g);
        if (kotlinTypeP == null) {
            return null;
        }
        KotlinType kotlinTypeP2 = typeSubstitutorB.p(kotlinType, Variance.f146797f);
        if (kotlinTypeP2 != null) {
            propertyDescriptorImplN0.X0(kotlinTypeP2);
        }
        ReceiverParameterDescriptor receiverParameterDescriptor2 = copyConfiguration.f143984i;
        if (receiverParameterDescriptor2 != null) {
            ReceiverParameterDescriptor receiverParameterDescriptorC = receiverParameterDescriptor2.c(typeSubstitutorB);
            if (receiverParameterDescriptorC == null) {
                return null;
            }
            receiverParameterDescriptor = receiverParameterDescriptorC;
        } else {
            receiverParameterDescriptor = null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor3 = this.f143971v;
        ReceiverParameterDescriptor receiverParameterDescriptorC1 = receiverParameterDescriptor3 != null ? c1(typeSubstitutorB, propertyDescriptorImplN0, receiverParameterDescriptor3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<ReceiverParameterDescriptor> it = this.f143969t.iterator();
        while (it.hasNext()) {
            ReceiverParameterDescriptor receiverParameterDescriptorB1 = b1(typeSubstitutorB, propertyDescriptorImplN0, it.next());
            if (receiverParameterDescriptorB1 != null) {
                arrayList2.add(receiverParameterDescriptorB1);
            }
        }
        propertyDescriptorImplN0.Z0(kotlinTypeP, arrayList, receiverParameterDescriptor, receiverParameterDescriptorC1, arrayList2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.f143973x == null ? null : new PropertyGetterDescriptorImpl(propertyDescriptorImplN0, this.f143973x.getAnnotations(), copyConfiguration.f143977b, W0(this.f143973x.getVisibility(), copyConfiguration.f143981f), this.f143973x.E(), this.f143973x.isExternal(), this.f143973x.isInline(), copyConfiguration.f143981f, copyConfiguration.o(), SourceElement.f143647a);
        if (propertyGetterDescriptorImpl != null) {
            KotlinType returnType = this.f143973x.getReturnType();
            propertyGetterDescriptorImpl.K0(R0(typeSubstitutorB, this.f143973x));
            propertyGetterDescriptorImpl.N0(returnType != null ? typeSubstitutorB.p(returnType, Variance.f146798g) : null);
        }
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = this.f143974y == null ? null : new PropertySetterDescriptorImpl(propertyDescriptorImplN0, this.f143974y.getAnnotations(), copyConfiguration.f143977b, W0(this.f143974y.getVisibility(), copyConfiguration.f143981f), this.f143974y.E(), this.f143974y.isExternal(), this.f143974y.isInline(), copyConfiguration.f143981f, copyConfiguration.p(), SourceElement.f143647a);
        if (propertySetterDescriptorImpl != null) {
            List<ValueParameterDescriptor> listM0 = FunctionDescriptorImpl.M0(propertySetterDescriptorImpl, this.f143974y.h(), typeSubstitutorB, false, false, null);
            if (listM0 == null) {
                propertyDescriptorImplN0.Y0(true);
                listM0 = Collections.singletonList(PropertySetterDescriptorImpl.M0(propertySetterDescriptorImpl, DescriptorUtilsKt.m(copyConfiguration.f143976a).I(), this.f143974y.h().get(0).getAnnotations()));
            }
            if (listM0.size() != 1) {
                throw new IllegalStateException();
            }
            propertySetterDescriptorImpl.K0(R0(typeSubstitutorB, this.f143974y));
            propertySetterDescriptorImpl.O0(listM0.get(0));
        }
        FieldDescriptor fieldDescriptor = this.f143956A;
        FieldDescriptorImpl fieldDescriptorImpl = fieldDescriptor == null ? null : new FieldDescriptorImpl(fieldDescriptor.getAnnotations(), propertyDescriptorImplN0);
        FieldDescriptor fieldDescriptor2 = this.f143957B;
        propertyDescriptorImplN0.T0(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, fieldDescriptorImpl, fieldDescriptor2 == null ? null : new FieldDescriptorImpl(fieldDescriptor2.getAnnotations(), propertyDescriptorImplN0));
        if (copyConfiguration.f143983h) {
            SmartSet smartSetF = SmartSet.f();
            Iterator<? extends PropertyDescriptor> it2 = d().iterator();
            while (it2.hasNext()) {
                smartSetF.add(it2.next().c(typeSubstitutorB));
            }
            propertyDescriptorImplN0.A0(smartSetF);
        }
        if (isConst() && (function0 = this.f144017h) != null) {
            propertyDescriptorImplN0.I0(this.f144016g, function0);
        }
        return propertyDescriptorImplN0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public PropertyGetterDescriptorImpl getGetter() {
        return this.f143973x;
    }

    public void T0(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, PropertySetterDescriptor propertySetterDescriptor, FieldDescriptor fieldDescriptor, FieldDescriptor fieldDescriptor2) {
        this.f143973x = propertyGetterDescriptorImpl;
        this.f143974y = propertySetterDescriptor;
        this.f143956A = fieldDescriptor;
        this.f143957B = fieldDescriptor2;
    }

    public boolean U0() {
        return this.f143975z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean V() {
        return this.f143966q;
    }

    public CopyConfiguration V0() {
        return new CopyConfiguration();
    }

    public void Y0(boolean z10) {
        this.f143975z = z10;
    }

    public void Z0(KotlinType kotlinType, List<? extends TypeParameterDescriptor> list, ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<ReceiverParameterDescriptor> list2) {
        if (kotlinType == null) {
            e0(17);
        }
        if (list == null) {
            e0(18);
        }
        if (list2 == null) {
            e0(19);
        }
        H0(kotlinType);
        this.f143972w = new ArrayList(list);
        this.f143971v = receiverParameterDescriptor2;
        this.f143970u = receiverParameterDescriptor;
        this.f143969t = list2;
    }

    public void a1(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            e0(20);
        }
        this.f143959j = descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Collection<? extends PropertyDescriptor> d() {
        Collection<? extends PropertyDescriptor> collection = this.f143960k;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            e0(41);
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor.Kind f() {
        CallableMemberDescriptor.Kind kind = this.f143962m;
        if (kind == null) {
            e0(39);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public PropertySetterDescriptor getSetter() {
        return this.f143974y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> list = this.f143972w;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.f143959j;
        if (descriptorVisibility == null) {
            e0(25);
        }
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean h0() {
        return this.f143965p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.f143964o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f143967r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality q() {
        Modality modality = this.f143958i;
        if (modality == null) {
            e0(24);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public FieldDescriptor t0() {
        return this.f143956A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public List<PropertyAccessorDescriptor> u() {
        ArrayList arrayList = new ArrayList(2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.f143973x;
        if (propertyGetterDescriptorImpl != null) {
            arrayList.add(propertyGetterDescriptorImpl);
        }
        PropertySetterDescriptor propertySetterDescriptor = this.f143974y;
        if (propertySetterDescriptor != null) {
            arrayList.add(propertySetterDescriptor);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ReceiverParameterDescriptor> u0() {
        List<ReceiverParameterDescriptor> list = this.f143969t;
        if (list == null) {
            e0(22);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean v0() {
        return this.f143963n;
    }

    private static ReceiverParameterDescriptor b1(TypeSubstitutor typeSubstitutor, PropertyDescriptor propertyDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        KotlinType kotlinTypeP = typeSubstitutor.p(receiverParameterDescriptor.getType(), Variance.f146797f);
        if (kotlinTypeP == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(propertyDescriptor, new ContextReceiver(propertyDescriptor, kotlinTypeP, ((ImplicitContextReceiver) receiverParameterDescriptor.getValue()).a(), receiverParameterDescriptor.getValue()), receiverParameterDescriptor.getAnnotations());
    }

    private static ReceiverParameterDescriptor c1(TypeSubstitutor typeSubstitutor, PropertyDescriptor propertyDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        KotlinType kotlinTypeP = typeSubstitutor.p(receiverParameterDescriptor.getType(), Variance.f146797f);
        if (kotlinTypeP == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(propertyDescriptor, new ExtensionReceiver(propertyDescriptor, kotlinTypeP, receiverParameterDescriptor.getValue()), receiverParameterDescriptor.getAnnotations());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public PropertyDescriptor M(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z10) {
        PropertyDescriptor propertyDescriptorN = V0().u(declarationDescriptor).t(null).s(modality).w(descriptorVisibility).r(kind).q(z10).n();
        if (propertyDescriptorN == null) {
            e0(42);
        }
        return propertyDescriptorN;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public PropertyDescriptor c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            e0(27);
        }
        return typeSubstitutor.k() ? this : V0().v(typeSubstitutor.j()).t(a()).n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        KotlinType type = getType();
        if (type == null) {
            e0(23);
        }
        return type;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public <R, D> R x(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return declarationDescriptorVisitor.c(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public PropertyDescriptor a() {
        PropertyDescriptor propertyDescriptor = this.f143961l;
        PropertyDescriptor propertyDescriptorH0 = propertyDescriptor == this ? this : propertyDescriptor.a();
        if (propertyDescriptorH0 == null) {
            e0(38);
        }
        return propertyDescriptorH0;
    }
}
