package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import com.medallia.digital.mobilesdk.l3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorVisitor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ExtensionReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver;
import kotlin.reflect.jvm.internal.impl.types.DescriptorSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitution;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.SmartList;

/* loaded from: classes14.dex */
public abstract class FunctionDescriptorImpl extends DeclarationDescriptorNonRootImpl implements FunctionDescriptor {

    /* renamed from: A, reason: collision with root package name */
    private final FunctionDescriptor f144756A;

    /* renamed from: B, reason: collision with root package name */
    private final CallableMemberDescriptor.Kind f144757B;

    /* renamed from: C, reason: collision with root package name */
    private FunctionDescriptor f144758C;

    /* renamed from: D, reason: collision with root package name */
    protected Map<CallableDescriptor.UserDataKey<?>, Object> f144759D;

    /* renamed from: e, reason: collision with root package name */
    private List<TypeParameterDescriptor> f144760e;

    /* renamed from: f, reason: collision with root package name */
    private List<ValueParameterDescriptor> f144761f;

    /* renamed from: g, reason: collision with root package name */
    private KotlinType f144762g;

    /* renamed from: h, reason: collision with root package name */
    private List<ReceiverParameterDescriptor> f144763h;

    /* renamed from: i, reason: collision with root package name */
    private ReceiverParameterDescriptor f144764i;

    /* renamed from: j, reason: collision with root package name */
    private ReceiverParameterDescriptor f144765j;

    /* renamed from: k, reason: collision with root package name */
    private Modality f144766k;

    /* renamed from: l, reason: collision with root package name */
    private DescriptorVisibility f144767l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f144768m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f144769n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f144770o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f144771p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f144772q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f144773r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f144774s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f144775t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f144776u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f144777v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f144778w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f144779x;

    /* renamed from: y, reason: collision with root package name */
    private Collection<? extends FunctionDescriptor> f144780y;

    /* renamed from: z, reason: collision with root package name */
    private volatile Function0<Collection<FunctionDescriptor>> f144781z;

    public class CopyConfiguration implements FunctionDescriptor.CopyBuilder<FunctionDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        protected TypeSubstitution f144782a;

        /* renamed from: b, reason: collision with root package name */
        protected DeclarationDescriptor f144783b;

        /* renamed from: c, reason: collision with root package name */
        protected Modality f144784c;

        /* renamed from: d, reason: collision with root package name */
        protected DescriptorVisibility f144785d;

        /* renamed from: e, reason: collision with root package name */
        protected FunctionDescriptor f144786e;

        /* renamed from: f, reason: collision with root package name */
        protected CallableMemberDescriptor.Kind f144787f;

        /* renamed from: g, reason: collision with root package name */
        protected List<ValueParameterDescriptor> f144788g;

        /* renamed from: h, reason: collision with root package name */
        protected List<ReceiverParameterDescriptor> f144789h;

        /* renamed from: i, reason: collision with root package name */
        protected ReceiverParameterDescriptor f144790i;

        /* renamed from: j, reason: collision with root package name */
        protected ReceiverParameterDescriptor f144791j;

        /* renamed from: k, reason: collision with root package name */
        protected KotlinType f144792k;

        /* renamed from: l, reason: collision with root package name */
        protected Name f144793l;

        /* renamed from: m, reason: collision with root package name */
        protected boolean f144794m;

        /* renamed from: n, reason: collision with root package name */
        protected boolean f144795n;

        /* renamed from: o, reason: collision with root package name */
        protected boolean f144796o;

        /* renamed from: p, reason: collision with root package name */
        protected boolean f144797p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f144798q;

        /* renamed from: r, reason: collision with root package name */
        private List<TypeParameterDescriptor> f144799r;

        /* renamed from: s, reason: collision with root package name */
        private Annotations f144800s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f144801t;

        /* renamed from: u, reason: collision with root package name */
        private Map<CallableDescriptor.UserDataKey<?>, Object> f144802u;

        /* renamed from: v, reason: collision with root package name */
        private Boolean f144803v;

        /* renamed from: w, reason: collision with root package name */
        protected boolean f144804w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ FunctionDescriptorImpl f144805x;

        public CopyConfiguration(FunctionDescriptorImpl functionDescriptorImpl, TypeSubstitution typeSubstitution, DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, List<ValueParameterDescriptor> list, List<ReceiverParameterDescriptor> list2, ReceiverParameterDescriptor receiverParameterDescriptor, KotlinType kotlinType, Name name) {
            if (typeSubstitution == null) {
                u(0);
            }
            if (declarationDescriptor == null) {
                u(1);
            }
            if (modality == null) {
                u(2);
            }
            if (descriptorVisibility == null) {
                u(3);
            }
            if (kind == null) {
                u(4);
            }
            if (list == null) {
                u(5);
            }
            if (list2 == null) {
                u(6);
            }
            if (kotlinType == null) {
                u(7);
            }
            this.f144805x = functionDescriptorImpl;
            this.f144786e = null;
            this.f144791j = functionDescriptorImpl.f144765j;
            this.f144794m = true;
            this.f144795n = false;
            this.f144796o = false;
            this.f144797p = false;
            this.f144798q = functionDescriptorImpl.z0();
            this.f144799r = null;
            this.f144800s = null;
            this.f144801t = functionDescriptorImpl.C0();
            this.f144802u = new LinkedHashMap();
            this.f144803v = null;
            this.f144804w = false;
            this.f144782a = typeSubstitution;
            this.f144783b = declarationDescriptor;
            this.f144784c = modality;
            this.f144785d = descriptorVisibility;
            this.f144787f = kind;
            this.f144788g = list;
            this.f144789h = list2;
            this.f144790i = receiverParameterDescriptor;
            this.f144792k = kotlinType;
            this.f144793l = name;
        }

        private static /* synthetic */ void u(int i10) {
            String str;
            int i11;
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case l3.f93325e /* 32 */:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case l3.f93325e /* 32 */:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    i11 = 2;
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    i11 = 3;
                    break;
            }
            Object[] objArr = new Object[i11];
            switch (i10) {
                case 1:
                    objArr[0] = "newOwner";
                    break;
                case 2:
                    objArr[0] = "newModality";
                    break;
                case 3:
                    objArr[0] = "newVisibility";
                    break;
                case 4:
                case 14:
                    objArr[0] = "kind";
                    break;
                case 5:
                    objArr[0] = "newValueParameterDescriptors";
                    break;
                case 6:
                    objArr[0] = "newContextReceiverParameters";
                    break;
                case 7:
                    objArr[0] = "newReturnType";
                    break;
                case 8:
                    objArr[0] = "owner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case l3.f93325e /* 32 */:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 10:
                    objArr[0] = "modality";
                    break;
                case 12:
                    objArr[0] = "visibility";
                    break;
                case 17:
                    objArr[0] = "name";
                    break;
                case 19:
                case 21:
                    objArr[0] = "parameters";
                    break;
                case 23:
                    objArr[0] = "type";
                    break;
                case 25:
                    objArr[0] = "contextReceiverParameters";
                    break;
                case 35:
                    objArr[0] = "additionalAnnotations";
                    break;
                case 37:
                default:
                    objArr[0] = "substitution";
                    break;
                case 39:
                    objArr[0] = "userDataKey";
                    break;
            }
            switch (i10) {
                case 9:
                    objArr[1] = "setOwner";
                    break;
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl$CopyConfiguration";
                    break;
                case 11:
                    objArr[1] = "setModality";
                    break;
                case 13:
                    objArr[1] = "setVisibility";
                    break;
                case 15:
                    objArr[1] = "setKind";
                    break;
                case 16:
                    objArr[1] = "setCopyOverrides";
                    break;
                case 18:
                    objArr[1] = "setName";
                    break;
                case 20:
                    objArr[1] = "setValueParameters";
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    objArr[1] = "setTypeParameters";
                    break;
                case 24:
                    objArr[1] = "setReturnType";
                    break;
                case 26:
                    objArr[1] = "setContextReceiverParameters";
                    break;
                case 27:
                    objArr[1] = "setExtensionReceiverParameter";
                    break;
                case 28:
                    objArr[1] = "setDispatchReceiverParameter";
                    break;
                case 29:
                    objArr[1] = "setOriginal";
                    break;
                case 30:
                    objArr[1] = "setSignatureChange";
                    break;
                case 31:
                    objArr[1] = "setPreserveSourceElement";
                    break;
                case l3.f93325e /* 32 */:
                    objArr[1] = "setDropOriginalInContainingParts";
                    break;
                case 33:
                    objArr[1] = "setHiddenToOvercomeSignatureClash";
                    break;
                case 34:
                    objArr[1] = "setHiddenForResolutionEverywhereBesideSupercalls";
                    break;
                case 36:
                    objArr[1] = "setAdditionalAnnotations";
                    break;
                case 38:
                    objArr[1] = "setSubstitution";
                    break;
                case 40:
                    objArr[1] = "putUserData";
                    break;
                case 41:
                    objArr[1] = "getSubstitution";
                    break;
                case 42:
                    objArr[1] = "setJustForTypeSubstitution";
                    break;
            }
            switch (i10) {
                case 8:
                    objArr[2] = "setOwner";
                    break;
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case l3.f93325e /* 32 */:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    break;
                case 10:
                    objArr[2] = "setModality";
                    break;
                case 12:
                    objArr[2] = "setVisibility";
                    break;
                case 14:
                    objArr[2] = "setKind";
                    break;
                case 17:
                    objArr[2] = "setName";
                    break;
                case 19:
                    objArr[2] = "setValueParameters";
                    break;
                case 21:
                    objArr[2] = "setTypeParameters";
                    break;
                case 23:
                    objArr[2] = "setReturnType";
                    break;
                case 25:
                    objArr[2] = "setContextReceiverParameters";
                    break;
                case 35:
                    objArr[2] = "setAdditionalAnnotations";
                    break;
                case 37:
                    objArr[2] = "setSubstitution";
                    break;
                case 39:
                    objArr[2] = "putUserData";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            switch (i10) {
                case 9:
                case 11:
                case 13:
                case 15:
                case 16:
                case 18:
                case 20:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                case 24:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case l3.f93325e /* 32 */:
                case 33:
                case 34:
                case 36:
                case 38:
                case 40:
                case 41:
                case 42:
                    throw new IllegalStateException(str2);
                case 10:
                case 12:
                case 14:
                case 17:
                case 19:
                case 21:
                case 23:
                case 25:
                case 35:
                case 37:
                case 39:
                default:
                    throw new IllegalArgumentException(str2);
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration a() {
            this.f144797p = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration d() {
            this.f144801t = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration i() {
            this.f144798q = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration l() {
            this.f144796o = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration t() {
            this.f144795n = true;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration s(Annotations annotations) {
            if (annotations == null) {
                u(35);
            }
            this.f144800s = annotations;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration o(boolean z10) {
            this.f144794m = z10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration c(ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.f144791j = receiverParameterDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration e(ReceiverParameterDescriptor receiverParameterDescriptor) {
            this.f144790i = receiverParameterDescriptor;
            return this;
        }

        public CopyConfiguration J(boolean z10) {
            this.f144804w = z10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration r(CallableMemberDescriptor.Kind kind) {
            if (kind == null) {
                u(14);
            }
            this.f144787f = kind;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration k(Modality modality) {
            if (modality == null) {
                u(10);
            }
            this.f144784c = modality;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration j(Name name) {
            if (name == null) {
                u(17);
            }
            this.f144793l = name;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration n(CallableMemberDescriptor callableMemberDescriptor) {
            this.f144786e = (FunctionDescriptor) callableMemberDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration q(DeclarationDescriptor declarationDescriptor) {
            if (declarationDescriptor == null) {
                u(8);
            }
            this.f144783b = declarationDescriptor;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: Q, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration m(KotlinType kotlinType) {
            if (kotlinType == null) {
                u(23);
            }
            this.f144792k = kotlinType;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration f(TypeSubstitution typeSubstitution) {
            if (typeSubstitution == null) {
                u(37);
            }
            this.f144782a = typeSubstitution;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: T, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration p(List<TypeParameterDescriptor> list) {
            if (list == null) {
                u(21);
            }
            this.f144799r = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: U, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration b(List<ValueParameterDescriptor> list) {
            if (list == null) {
                u(19);
            }
            this.f144788g = list;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public CopyConfiguration h(DescriptorVisibility descriptorVisibility) {
            if (descriptorVisibility == null) {
                u(12);
            }
            this.f144785d = descriptorVisibility;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public FunctionDescriptor build() {
            return this.f144805x.J0(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor.CopyBuilder
        public <V> FunctionDescriptor.CopyBuilder<FunctionDescriptor> g(CallableDescriptor.UserDataKey<V> userDataKey, V v10) {
            if (userDataKey == null) {
                u(39);
            }
            this.f144802u.put(userDataKey, v10);
            return this;
        }

        public CopyConfiguration G(boolean z10) {
            this.f144803v = Boolean.valueOf(z10);
            return this;
        }
    }

    class a implements Function0<Collection<FunctionDescriptor>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TypeSubstitutor f144806a;

        a(TypeSubstitutor typeSubstitutor) {
            this.f144806a = typeSubstitutor;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Collection<FunctionDescriptor> invoke() {
            SmartList smartList = new SmartList();
            Iterator<? extends FunctionDescriptor> it = FunctionDescriptorImpl.this.d().iterator();
            while (it.hasNext()) {
                smartList.add(it.next().c(this.f144806a));
            }
            return smartList;
        }
    }

    static class b implements Function0<List<VariableDescriptor>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f144808a;

        b(List list) {
            this.f144808a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<VariableDescriptor> invoke() {
            return this.f144808a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected FunctionDescriptorImpl(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, Annotations annotations, Name name, CallableMemberDescriptor.Kind kind, SourceElement sourceElement) {
        super(declarationDescriptor, annotations, name, sourceElement);
        if (declarationDescriptor == null) {
            e0(0);
        }
        if (annotations == null) {
            e0(1);
        }
        if (name == null) {
            e0(2);
        }
        if (kind == null) {
            e0(3);
        }
        if (sourceElement == null) {
            e0(4);
        }
        this.f144767l = DescriptorVisibilities.f144511i;
        this.f144768m = false;
        this.f144769n = false;
        this.f144770o = false;
        this.f144771p = false;
        this.f144772q = false;
        this.f144773r = false;
        this.f144774s = false;
        this.f144775t = false;
        this.f144776u = false;
        this.f144777v = false;
        this.f144778w = true;
        this.f144779x = false;
        this.f144780y = null;
        this.f144781z = null;
        this.f144758C = null;
        this.f144759D = null;
        this.f144756A = functionDescriptor == null ? this : functionDescriptor;
        this.f144757B = kind;
    }

    private static /* synthetic */ void e0(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i11 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 24:
            case 25:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case 28:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case 29:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i10) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case 28:
            case 29:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i10) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    protected abstract FunctionDescriptorImpl I0(DeclarationDescriptor declarationDescriptor, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement sourceElement);

    private SourceElement K0(boolean z10, FunctionDescriptor functionDescriptor) {
        SourceElement sourceElementG;
        if (z10) {
            if (functionDescriptor == null) {
                functionDescriptor = a();
            }
            sourceElementG = functionDescriptor.g();
        } else {
            sourceElementG = SourceElement.f144554a;
        }
        if (sourceElementG == null) {
            e0(27);
        }
        return sourceElementG;
    }

    public static List<ValueParameterDescriptor> L0(FunctionDescriptor functionDescriptor, List<ValueParameterDescriptor> list, TypeSubstitutor typeSubstitutor) {
        if (list == null) {
            e0(28);
        }
        if (typeSubstitutor == null) {
            e0(29);
        }
        return M0(functionDescriptor, list, typeSubstitutor, false, false, null);
    }

    public static List<ValueParameterDescriptor> M0(FunctionDescriptor functionDescriptor, List<ValueParameterDescriptor> list, TypeSubstitutor typeSubstitutor, boolean z10, boolean z11, boolean[] zArr) {
        if (list == null) {
            e0(30);
        }
        if (typeSubstitutor == null) {
            e0(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (ValueParameterDescriptor valueParameterDescriptor : list) {
            KotlinType type = valueParameterDescriptor.getType();
            Variance variance = Variance.f147704f;
            KotlinType kotlinTypeP = typeSubstitutor.p(type, variance);
            KotlinType kotlinTypeS0 = valueParameterDescriptor.s0();
            KotlinType kotlinTypeP2 = kotlinTypeS0 == null ? null : typeSubstitutor.p(kotlinTypeS0, variance);
            if (kotlinTypeP == null) {
                return null;
            }
            if ((kotlinTypeP != valueParameterDescriptor.getType() || kotlinTypeS0 != kotlinTypeP2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(ValueParameterDescriptorImpl.I0(functionDescriptor, z10 ? null : valueParameterDescriptor, valueParameterDescriptor.getIndex(), valueParameterDescriptor.getAnnotations(), valueParameterDescriptor.getName(), kotlinTypeP, valueParameterDescriptor.x0(), valueParameterDescriptor.o0(), valueParameterDescriptor.m0(), kotlinTypeP2, z11 ? valueParameterDescriptor.g() : SourceElement.f144554a, valueParameterDescriptor instanceof ValueParameterDescriptorImpl.WithDestructuringDeclaration ? new b(((ValueParameterDescriptorImpl.WithDestructuringDeclaration) valueParameterDescriptor).N0()) : null));
        }
        return arrayList;
    }

    private void Q0() {
        Function0<Collection<FunctionDescriptor>> function0 = this.f144781z;
        if (function0 != null) {
            this.f144780y = function0.invoke();
            this.f144781z = null;
        }
    }

    private void X0(boolean z10) {
        this.f144776u = z10;
    }

    private void Y0(boolean z10) {
        this.f144775t = z10;
    }

    private void a1(FunctionDescriptor functionDescriptor) {
        this.f144758C = functionDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0(Collection<? extends CallableMemberDescriptor> collection) {
        if (collection == 0) {
            e0(17);
        }
        this.f144780y = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((FunctionDescriptor) it.next()).C0()) {
                this.f144776u = true;
                return;
            }
        }
    }

    public boolean B() {
        return this.f144772q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean C0() {
        return this.f144776u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor J() {
        return this.f144765j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    protected FunctionDescriptor J0(CopyConfiguration copyConfiguration) {
        ?? r15;
        ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl;
        FunctionDescriptor functionDescriptor;
        KotlinType kotlinTypeP;
        if (copyConfiguration == null) {
            e0(25);
        }
        boolean[] zArr = new boolean[1];
        Annotations annotationsA = copyConfiguration.f144800s != null ? AnnotationsKt.a(getAnnotations(), copyConfiguration.f144800s) : getAnnotations();
        DeclarationDescriptor declarationDescriptor = copyConfiguration.f144783b;
        FunctionDescriptor functionDescriptor2 = copyConfiguration.f144786e;
        FunctionDescriptorImpl functionDescriptorImplI0 = I0(declarationDescriptor, functionDescriptor2, copyConfiguration.f144787f, copyConfiguration.f144793l, annotationsA, K0(copyConfiguration.f144796o, functionDescriptor2));
        List<TypeParameterDescriptor> typeParameters = copyConfiguration.f144799r == null ? getTypeParameters() : copyConfiguration.f144799r;
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        TypeSubstitutor typeSubstitutorC = DescriptorSubstitutor.c(typeParameters, copyConfiguration.f144782a, functionDescriptorImplI0, arrayList, zArr);
        ReceiverParameterDescriptor receiverParameterDescriptor = null;
        if (typeSubstitutorC == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!copyConfiguration.f144789h.isEmpty()) {
            int i10 = 0;
            for (ReceiverParameterDescriptor receiverParameterDescriptor2 : copyConfiguration.f144789h) {
                KotlinType kotlinTypeP2 = typeSubstitutorC.p(receiverParameterDescriptor2.getType(), Variance.f147704f);
                if (kotlinTypeP2 == null) {
                    return null;
                }
                int i11 = i10 + 1;
                arrayList2.add(DescriptorFactory.b(functionDescriptorImplI0, kotlinTypeP2, ((ImplicitContextReceiver) receiverParameterDescriptor2.getValue()).a(), receiverParameterDescriptor2.getAnnotations(), i10));
                zArr[0] = zArr[0] | (kotlinTypeP2 != receiverParameterDescriptor2.getType());
                i10 = i11;
            }
        }
        ReceiverParameterDescriptor receiverParameterDescriptor3 = copyConfiguration.f144790i;
        if (receiverParameterDescriptor3 != null) {
            KotlinType kotlinTypeP3 = typeSubstitutorC.p(receiverParameterDescriptor3.getType(), Variance.f147704f);
            if (kotlinTypeP3 == null) {
                return null;
            }
            ReceiverParameterDescriptorImpl receiverParameterDescriptorImpl2 = new ReceiverParameterDescriptorImpl(functionDescriptorImplI0, new ExtensionReceiver(functionDescriptorImplI0, kotlinTypeP3, copyConfiguration.f144790i.getValue()), copyConfiguration.f144790i.getAnnotations());
            zArr[0] = (kotlinTypeP3 != copyConfiguration.f144790i.getType()) | zArr[0];
            r15 = 0;
            receiverParameterDescriptorImpl = receiverParameterDescriptorImpl2;
        } else {
            r15 = 0;
            receiverParameterDescriptorImpl = null;
        }
        ReceiverParameterDescriptor receiverParameterDescriptor4 = copyConfiguration.f144791j;
        if (receiverParameterDescriptor4 != null) {
            ReceiverParameterDescriptor receiverParameterDescriptorC = receiverParameterDescriptor4.c(typeSubstitutorC);
            if (receiverParameterDescriptorC == null) {
                return null;
            }
            zArr[r15] = zArr[r15] | (receiverParameterDescriptorC != copyConfiguration.f144791j ? true : r15);
            functionDescriptor = null;
            receiverParameterDescriptor = receiverParameterDescriptorC;
        } else {
            functionDescriptor = null;
        }
        List<ValueParameterDescriptor> listM0 = M0(functionDescriptorImplI0, copyConfiguration.f144788g, typeSubstitutorC, copyConfiguration.f144797p, copyConfiguration.f144796o, zArr);
        if (listM0 == null || (kotlinTypeP = typeSubstitutorC.p(copyConfiguration.f144792k, Variance.f147705g)) == null) {
            return functionDescriptor;
        }
        boolean z10 = zArr[r15] | (kotlinTypeP != copyConfiguration.f144792k ? true : r15);
        zArr[r15] = z10;
        if (!z10 && copyConfiguration.f144804w) {
            return this;
        }
        functionDescriptorImplI0.O0(receiverParameterDescriptorImpl, receiverParameterDescriptor, arrayList2, arrayList, listM0, kotlinTypeP, copyConfiguration.f144784c, copyConfiguration.f144785d);
        functionDescriptorImplI0.c1(this.f144768m);
        functionDescriptorImplI0.Z0(this.f144769n);
        functionDescriptorImplI0.U0(this.f144770o);
        functionDescriptorImplI0.b1(this.f144771p);
        functionDescriptorImplI0.f1(this.f144772q);
        functionDescriptorImplI0.e1(this.f144777v);
        functionDescriptorImplI0.T0(this.f144773r);
        functionDescriptorImplI0.S0(this.f144774s);
        functionDescriptorImplI0.V0(this.f144778w);
        functionDescriptorImplI0.Y0(copyConfiguration.f144798q);
        functionDescriptorImplI0.X0(copyConfiguration.f144801t);
        functionDescriptorImplI0.W0(copyConfiguration.f144803v != null ? copyConfiguration.f144803v.booleanValue() : this.f144779x);
        if (!copyConfiguration.f144802u.isEmpty() || this.f144759D != null) {
            Map<CallableDescriptor.UserDataKey<?>, Object> map = copyConfiguration.f144802u;
            Map<CallableDescriptor.UserDataKey<?>, Object> map2 = this.f144759D;
            if (map2 != null) {
                for (Map.Entry<CallableDescriptor.UserDataKey<?>, Object> entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                functionDescriptorImplI0.f144759D = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                functionDescriptorImplI0.f144759D = map;
            }
        }
        if (copyConfiguration.f144795n || p0() != null) {
            functionDescriptorImplI0.a1((p0() != null ? p0() : this).c(typeSubstitutorC));
        }
        if (copyConfiguration.f144794m && !a().d().isEmpty()) {
            if (copyConfiguration.f144782a.f()) {
                Function0<Collection<FunctionDescriptor>> function0 = this.f144781z;
                if (function0 != null) {
                    functionDescriptorImplI0.f144781z = function0;
                    return functionDescriptorImplI0;
                }
                functionDescriptorImplI0.A0(d());
                return functionDescriptorImplI0;
            }
            functionDescriptorImplI0.f144781z = new a(typeSubstitutorC);
        }
        return functionDescriptorImplI0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public ReceiverParameterDescriptor N() {
        return this.f144764i;
    }

    public boolean N0() {
        return this.f144778w;
    }

    public FunctionDescriptorImpl O0(ReceiverParameterDescriptor receiverParameterDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor2, List<ReceiverParameterDescriptor> list, List<? extends TypeParameterDescriptor> list2, List<ValueParameterDescriptor> list3, KotlinType kotlinType, Modality modality, DescriptorVisibility descriptorVisibility) {
        if (list == null) {
            e0(5);
        }
        if (list2 == null) {
            e0(6);
        }
        if (list3 == null) {
            e0(7);
        }
        if (descriptorVisibility == null) {
            e0(8);
        }
        this.f144760e = CollectionsKt.j1(list2);
        this.f144761f = CollectionsKt.j1(list3);
        this.f144762g = kotlinType;
        this.f144766k = modality;
        this.f144767l = descriptorVisibility;
        this.f144764i = receiverParameterDescriptor;
        this.f144765j = receiverParameterDescriptor2;
        this.f144763h = list;
        for (int i10 = 0; i10 < list2.size(); i10++) {
            TypeParameterDescriptor typeParameterDescriptor = list2.get(i10);
            if (typeParameterDescriptor.getIndex() != i10) {
                throw new IllegalStateException(typeParameterDescriptor + " index is " + typeParameterDescriptor.getIndex() + " but position is " + i10);
            }
        }
        for (int i11 = 0; i11 < list3.size(); i11++) {
            ValueParameterDescriptor valueParameterDescriptor = list3.get(i11);
            if (valueParameterDescriptor.getIndex() != i11) {
                throw new IllegalStateException(valueParameterDescriptor + "index is " + valueParameterDescriptor.getIndex() + " but position is " + i11);
            }
        }
        return this;
    }

    protected CopyConfiguration P0(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            e0(24);
        }
        return new CopyConfiguration(this, typeSubstitutor.j(), b(), q(), getVisibility(), f(), h(), u0(), N(), getReturnType(), null);
    }

    public <V> void R0(CallableDescriptor.UserDataKey<V> userDataKey, Object obj) {
        if (this.f144759D == null) {
            this.f144759D = new LinkedHashMap();
        }
        this.f144759D.put(userDataKey, obj);
    }

    public void S0(boolean z10) {
        this.f144774s = z10;
    }

    public void T0(boolean z10) {
        this.f144773r = z10;
    }

    public void U0(boolean z10) {
        this.f144770o = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean V() {
        return this.f144774s;
    }

    public void V0(boolean z10) {
        this.f144778w = z10;
    }

    public void W0(boolean z10) {
        this.f144779x = z10;
    }

    public void Z0(boolean z10) {
        this.f144769n = z10;
    }

    public void b1(boolean z10) {
        this.f144771p = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.Substitutable
    public FunctionDescriptor c(TypeSubstitutor typeSubstitutor) {
        if (typeSubstitutor == null) {
            e0(22);
        }
        return typeSubstitutor.k() ? this : P0(typeSubstitutor).n(a()).l().J(true).build();
    }

    public void c1(boolean z10) {
        this.f144768m = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public boolean d0() {
        return this.f144779x;
    }

    public void d1(KotlinType kotlinType) {
        if (kotlinType == null) {
            e0(11);
        }
        this.f144762g = kotlinType;
    }

    public void e1(boolean z10) {
        this.f144777v = z10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public CallableMemberDescriptor.Kind f() {
        CallableMemberDescriptor.Kind kind = this.f144757B;
        if (kind == null) {
            e0(21);
        }
        return kind;
    }

    public void f1(boolean z10) {
        this.f144772q = z10;
    }

    public void g1(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            e0(10);
        }
        this.f144767l = descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public KotlinType getReturnType() {
        return this.f144762g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<TypeParameterDescriptor> getTypeParameters() {
        List<TypeParameterDescriptor> list = this.f144760e;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility
    public DescriptorVisibility getVisibility() {
        DescriptorVisibility descriptorVisibility = this.f144767l;
        if (descriptorVisibility == null) {
            e0(16);
        }
        return descriptorVisibility;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ValueParameterDescriptor> h() {
        List<ValueParameterDescriptor> list = this.f144761f;
        if (list == null) {
            e0(19);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean h0() {
        return this.f144773r;
    }

    public boolean isExternal() {
        return this.f144770o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInfix() {
        if (this.f144769n) {
            return true;
        }
        Iterator<? extends FunctionDescriptor> it = a().d().iterator();
        while (it.hasNext()) {
            if (it.next().isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.f144771p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isOperator() {
        if (this.f144768m) {
            return true;
        }
        Iterator<? extends FunctionDescriptor> it = a().d().iterator();
        while (it.hasNext()) {
            if (it.next().isOperator()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return this.f144777v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public FunctionDescriptor p0() {
        return this.f144758C;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public Modality q() {
        Modality modality = this.f144766k;
        if (modality == null) {
            e0(15);
        }
        return modality;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public <V> V r0(CallableDescriptor.UserDataKey<V> userDataKey) {
        Map<CallableDescriptor.UserDataKey<?>, Object> map = this.f144759D;
        if (map == null) {
            return null;
        }
        return (V) map.get(userDataKey);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> t() {
        CopyConfiguration copyConfigurationP0 = P0(TypeSubstitutor.f147687b);
        if (copyConfigurationP0 == null) {
            e0(23);
        }
        return copyConfigurationP0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor
    public List<ReceiverParameterDescriptor> u0() {
        List<ReceiverParameterDescriptor> list = this.f144763h;
        if (list == null) {
            e0(13);
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean z0() {
        return this.f144775t;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: H0 */
    public FunctionDescriptor M(DeclarationDescriptor declarationDescriptor, Modality modality, DescriptorVisibility descriptorVisibility, CallableMemberDescriptor.Kind kind, boolean z10) {
        FunctionDescriptor functionDescriptorBuild = t().q(declarationDescriptor).k(modality).h(descriptorVisibility).r(kind).o(z10).build();
        if (functionDescriptorBuild == null) {
            e0(26);
        }
        return functionDescriptorBuild;
    }

    public Collection<? extends FunctionDescriptor> d() {
        Q0();
        Collection<? extends FunctionDescriptor> collection = this.f144780y;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            e0(14);
        }
        return collection;
    }

    public <R, D> R x(DeclarationDescriptorVisitor<R, D> declarationDescriptorVisitor, D d10) {
        return declarationDescriptorVisitor.i(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorNonRootImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.DeclarationDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor
    public FunctionDescriptor a() {
        FunctionDescriptor functionDescriptor = this.f144756A;
        FunctionDescriptor functionDescriptorA = functionDescriptor == this ? this : functionDescriptor.a();
        if (functionDescriptorA == null) {
            e0(20);
        }
        return functionDescriptorA;
    }
}
