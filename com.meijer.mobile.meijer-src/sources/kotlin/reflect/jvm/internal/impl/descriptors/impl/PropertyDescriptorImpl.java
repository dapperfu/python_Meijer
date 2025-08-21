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

/* loaded from: classes14.dex */
public class PropertyDescriptorImpl extends VariableDescriptorWithInitializerImpl implements PropertyDescriptor {

    /* renamed from: A, reason: collision with root package name */
    private FieldDescriptor f144863A;

    /* renamed from: B, reason: collision with root package name */
    private FieldDescriptor f144864B;

    /* renamed from: i, reason: collision with root package name */
    private final Modality f144865i;

    /* renamed from: j, reason: collision with root package name */
    private DescriptorVisibility f144866j;

    /* renamed from: k, reason: collision with root package name */
    private Collection<? extends PropertyDescriptor> f144867k;

    /* renamed from: l, reason: collision with root package name */
    private final PropertyDescriptor f144868l;

    /* renamed from: m, reason: collision with root package name */
    private final CallableMemberDescriptor.Kind f144869m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f144870n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f144871o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f144872p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f144873q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f144874r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f144875s;

    /* renamed from: t, reason: collision with root package name */
    private List<ReceiverParameterDescriptor> f144876t;

    /* renamed from: u, reason: collision with root package name */
    private ReceiverParameterDescriptor f144877u;

    /* renamed from: v, reason: collision with root package name */
    private ReceiverParameterDescriptor f144878v;

    /* renamed from: w, reason: collision with root package name */
    private List<TypeParameterDescriptor> f144879w;

    /* renamed from: x, reason: collision with root package name */
    private PropertyGetterDescriptorImpl f144880x;

    /* renamed from: y, reason: collision with root package name */
    private PropertySetterDescriptor f144881y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f144882z;

    public class CopyConfiguration {

        /* renamed from: a, reason: collision with root package name */
        private DeclarationDescriptor f144883a;

        /* renamed from: b, reason: collision with root package name */
        private Modality f144884b;

        /* renamed from: c, reason: collision with root package name */
        private DescriptorVisibility f144885c;

        /* renamed from: f, reason: collision with root package name */
        private CallableMemberDescriptor.Kind f144888f;

        /* renamed from: i, reason: collision with root package name */
        private ReceiverParameterDescriptor f144891i;

        /* renamed from: k, reason: collision with root package name */
        private Name f144893k;

        /* renamed from: l, reason: collision with root package name */
        private KotlinType f144894l;

        /* renamed from: d, reason: collision with root package name */
        private PropertyDescriptor f144886d = null;

        /* renamed from: e, reason: collision with root package name */
        private boolean f144887e = false;

        /* renamed from: g, reason: collision with root package name */
        private TypeSubstitution f144889g = TypeSubstitution.f147685b;

        /* renamed from: h, reason: collision with root package name */
        private boolean f144890h = true;

        /* renamed from: j, reason: collision with root package name */
        private List<TypeParameterDescriptor> f144892j = null;

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
            this.f144883a = PropertyDescriptorImpl.this.b();
            this.f144884b = PropertyDescriptorImpl.this.q();
            this.f144885c = PropertyDescriptorImpl.this.getVisibility();
            this.f144888f = PropertyDescriptorImpl.this.f();
            this.f144891i = PropertyDescriptorImpl.this.f144877u;
            this.f144893k = PropertyDescriptorImpl.this.getName();
            this.f144894l = PropertyDescriptorImpl.this.getType();
        }

        public PropertyDescriptor n() {
            return PropertyDescriptorImpl.this.O0(this);
        }

        PropertyGetterDescriptor o() {
            PropertyDescriptor propertyDescriptor = this.f144886d;
            if (propertyDescriptor == null) {
                return null;
            }
            return propertyDescriptor.getGetter();
        }

        PropertySetterDescriptor p() {
            PropertyDescriptor propertyDescriptor = this.f144886d;
            if (propertyDescriptor == null) {
                return null;
            }
            return propertyDescriptor.getSetter();
        }

        public CopyConfiguration q(boolean z10) {
            this.f144890h = z10;
            return this;
        }

        public CopyConfiguration r(CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                a(10);
            }
            this.f144888f = kind;
            return this;
        }

        public CopyConfiguration s(Modality modality) {
            if (modality == null) {
                a(6);
            }
            this.f144884b = modality;
            return this;
        }

        public CopyConfiguration t(CallableMemberDescriptor callableMemberDescriptor) {
            this.f144886d = (PropertyDescriptor) callableMemberDescriptor;
            return this;
        }

        public CopyConfiguration u(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                a(0);
            }
            this.f144883a = declarationDescriptor;
            return this;
        }

        public CopyConfiguration v(TypeSubstitution typeSubstitution) {
            if (typeSubstitution == null) {
                a(15);
            }
            this.f144889g = typeSubstitution;
            return this;
        }

        public CopyConfiguration w(DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility == null) {
                a(8);
            }
            this.f144885c = descriptorVisibility;
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
        this.f144867k = null;
        this.f144876t = Collections.EMPTY_LIST;
        this.f144865i = modality;
        this.f144866j = descriptorVisibility;
        this.f144868l = propertyDescriptor == null ? this : propertyDescriptor;
        this.f144869m = kind;
        this.f144870n = z11;
        this.f144871o = z12;
        this.f144872p = z13;
        this.f144873q = z14;
        this.f144874r = z15;
        this.f144875s = z16;
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
            sourceElementG = SourceElement.f144554a;
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
        return (kind == CallableMemberDescriptor.Kind.FAKE_OVERRIDE && DescriptorVisibilities.g(descriptorVisibility.f())) ? DescriptorVisibilities.f144510h : descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptorWithAccessors
    public boolean A() {
        return this.f144875s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public void A0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            e0(40);
        }
        this.f144867k = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor J() {
        return this.f144877u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor N() {
        return this.f144878v;
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
        return this.f144864B;
    }

    protected PropertyDescriptor O0(CopyConfiguration copyConfiguration) {
        ReceiverParameterDescriptor receiverParameterDescriptor;
        Function0<NullableLazyValue<ConstantValue<?>>> function0;
        if (copyConfiguration == null) {
            e0(29);
        }
        PropertyDescriptorImpl propertyDescriptorImplN0 = N0(copyConfiguration.f144883a, copyConfiguration.f144884b, copyConfiguration.f144885c, copyConfiguration.f144886d, copyConfiguration.f144888f, copyConfiguration.f144893k, Q0(copyConfiguration.f144887e, copyConfiguration.f144886d));
        List<TypeParameterDescriptor> typeParameters = copyConfiguration.f144892j == null ? getTypeParameters() : copyConfiguration.f144892j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        TypeSubstitutor typeSubstitutorB = DescriptorSubstitutor.b(typeParameters, copyConfiguration.f144889g, propertyDescriptorImplN0, arrayList);
        KotlinType kotlinType = copyConfiguration.f144894l;
        KotlinType kotlinTypeP = typeSubstitutorB.p(kotlinType, Variance.f147705g);
        if (kotlinTypeP == null) {
            return null;
        }
        KotlinType kotlinTypeP2 = typeSubstitutorB.p(kotlinType, Variance.f147704f);
        if (kotlinTypeP2 != null) {
            propertyDescriptorImplN0.X0(kotlinTypeP2);
        }
        ReceiverParameterDescriptor receiverParameterDescriptor2 = copyConfiguration.f144891i;
        if (receiverParameterDescriptor2 != null) {
            ReceiverParameterDescriptor receiverParameterDescriptorC = receiverParameterDescriptor2.c(typeSubstitutorB);
            if (receiverParameterDescriptorC == null) {
                return null;
            }
            receiverParameterDescriptor = receiverParameterDescriptorC;
        } else {
            receiverParameterDescriptor = null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor3 = this.f144878v;
        ReceiverParameterDescriptor receiverParameterDescriptorC1 = receiverParameterDescriptor3 != null ? c1(typeSubstitutorB, propertyDescriptorImplN0, receiverParameterDescriptor3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<ReceiverParameterDescriptor> it = this.f144876t.iterator();
        while (it.hasNext()) {
            ReceiverParameterDescriptor receiverParameterDescriptorB1 = b1(typeSubstitutorB, propertyDescriptorImplN0, it.next());
            if (receiverParameterDescriptorB1 != null) {
                arrayList2.add(receiverParameterDescriptorB1);
            }
        }
        propertyDescriptorImplN0.Z0(kotlinTypeP, arrayList, receiverParameterDescriptor, receiverParameterDescriptorC1, arrayList2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.f144880x == null ? null : new PropertyGetterDescriptorImpl(propertyDescriptorImplN0, this.f144880x.getAnnotations(), copyConfiguration.f144884b, W0(this.f144880x.getVisibility(), copyConfiguration.f144888f), this.f144880x.E(), this.f144880x.isExternal(), this.f144880x.isInline(), copyConfiguration.f144888f, copyConfiguration.o(), SourceElement.f144554a);
        if (propertyGetterDescriptorImpl != null) {
            KotlinType returnType = this.f144880x.getReturnType();
            propertyGetterDescriptorImpl.K0(R0(typeSubstitutorB, this.f144880x));
            propertyGetterDescriptorImpl.N0(returnType != null ? typeSubstitutorB.p(returnType, Variance.f147705g) : null);
        }
        PropertySetterDescriptorImpl propertySetterDescriptorImpl = this.f144881y == null ? null : new PropertySetterDescriptorImpl(propertyDescriptorImplN0, this.f144881y.getAnnotations(), copyConfiguration.f144884b, W0(this.f144881y.getVisibility(), copyConfiguration.f144888f), this.f144881y.E(), this.f144881y.isExternal(), this.f144881y.isInline(), copyConfiguration.f144888f, copyConfiguration.p(), SourceElement.f144554a);
        if (propertySetterDescriptorImpl != null) {
            List<ValueParameterDescriptor> listM0 = FunctionDescriptorImpl.M0(propertySetterDescriptorImpl, this.f144881y.h(), typeSubstitutorB, false, false, null);
            if (listM0 == null) {
                propertyDescriptorImplN0.Y0(true);
                listM0 = Collections.singletonList(PropertySetterDescriptorImpl.M0(propertySetterDescriptorImpl, DescriptorUtilsKt.m(copyConfiguration.f144883a).I(), this.f144881y.h().get(0).getAnnotations()));
            }
            if (listM0.size() != 1) {
                throw new IllegalStateException();
            }
            propertySetterDescriptorImpl.K0(R0(typeSubstitutorB, this.f144881y));
            propertySetterDescriptorImpl.O0(listM0.get(0));
        }
        FieldDescriptor fieldDescriptor = this.f144863A;
        FieldDescriptorImpl fieldDescriptorImpl = fieldDescriptor == null ? null : new FieldDescriptorImpl(fieldDescriptor.getAnnotations(), propertyDescriptorImplN0);
        FieldDescriptor fieldDescriptor2 = this.f144864B;
        propertyDescriptorImplN0.T0(propertyGetterDescriptorImpl, propertySetterDescriptorImpl, fieldDescriptorImpl, fieldDescriptor2 == null ? null : new FieldDescriptorImpl(fieldDescriptor2.getAnnotations(), propertyDescriptorImplN0));
        if (copyConfiguration.f144890h) {
            SmartSet smartSetF = SmartSet.f();
            Iterator<? extends PropertyDescriptor> it2 = d().iterator();
            while (it2.hasNext()) {
                smartSetF.add(it2.next().c(typeSubstitutorB));
            }
            propertyDescriptorImplN0.A0(smartSetF);
        }
        if (isConst() && (function0 = this.f144924h) != null) {
            propertyDescriptorImplN0.I0(this.f144923g, function0);
        }
        return propertyDescriptorImplN0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public PropertyGetterDescriptorImpl getGetter() {
        return this.f144880x;
    }

    public void T0(PropertyGetterDescriptorImpl propertyGetterDescriptorImpl, PropertySetterDescriptor propertySetterDescriptor, FieldDescriptor fieldDescriptor, FieldDescriptor fieldDescriptor2) {
        this.f144880x = propertyGetterDescriptorImpl;
        this.f144881y = propertySetterDescriptor;
        this.f144863A = fieldDescriptor;
        this.f144864B = fieldDescriptor2;
    }

    public boolean U0() {
        return this.f144882z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean V() {
        return this.f144873q;
    }

    public CopyConfiguration V0() {
        return new CopyConfiguration();
    }

    public void Y0(boolean z10) {
        this.f144882z = z10;
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
        this.f144879w = new ArrayList(list);
        this.f144878v = receiverParameterDescriptor2;
        this.f144877u = receiverParameterDescriptor;
        this.f144876t = list2;
    }

    public void a1(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            e0(20);
        }
        this.f144866j = descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public Collection<? extends PropertyDescriptor> d() {
        Collection<? extends PropertyDescriptor> collection = this.f144867k;
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
        CallableMemberDescriptor.Kind kind = this.f144869m;
        if (kind == null) {
            e0(39);
        }
        return kind;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public PropertySetterDescriptor getSetter() {
        return this.f144881y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.VariableDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> list = this.f144879w;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.f144866j;
        if (descriptorVisibility == null) {
            e0(25);
        }
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean h0() {
        return this.f144872p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean isConst() {
        return this.f144871o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return this.f144874r;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality q() {
        Modality modality = this.f144865i;
        if (modality == null) {
            e0(24);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public FieldDescriptor t0() {
        return this.f144863A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor
    public List<PropertyAccessorDescriptor> u() {
        ArrayList arrayList = new ArrayList(2);
        PropertyGetterDescriptorImpl propertyGetterDescriptorImpl = this.f144880x;
        if (propertyGetterDescriptorImpl != null) {
            arrayList.add(propertyGetterDescriptorImpl);
        }
        PropertySetterDescriptor propertySetterDescriptor = this.f144881y;
        if (propertySetterDescriptor != null) {
            arrayList.add(propertySetterDescriptor);
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ReceiverParameterDescriptor> u0() {
        List<ReceiverParameterDescriptor> list = this.f144876t;
        if (list == null) {
            e0(22);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor
    public boolean v0() {
        return this.f144870n;
    }

    private static ReceiverParameterDescriptor b1(TypeSubstitutor typeSubstitutor, PropertyDescriptor propertyDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        KotlinType kotlinTypeP = typeSubstitutor.p(receiverParameterDescriptor.getType(), Variance.f147704f);
        if (kotlinTypeP == null) {
            return null;
        }
        return new ReceiverParameterDescriptorImpl(propertyDescriptor, new ContextReceiver(propertyDescriptor, kotlinTypeP, ((ImplicitContextReceiver) receiverParameterDescriptor.getValue()).a(), receiverParameterDescriptor.getValue()), receiverParameterDescriptor.getAnnotations());
    }

    private static ReceiverParameterDescriptor c1(TypeSubstitutor typeSubstitutor, PropertyDescriptor propertyDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        KotlinType kotlinTypeP = typeSubstitutor.p(receiverParameterDescriptor.getType(), Variance.f147704f);
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
        PropertyDescriptor propertyDescriptor = this.f144868l;
        PropertyDescriptor propertyDescriptorH0 = propertyDescriptor == this ? this : propertyDescriptor.a();
        if (propertyDescriptorH0 == null) {
            e0(38);
        }
        return propertyDescriptorH0;
    }
}
