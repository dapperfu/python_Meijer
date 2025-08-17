package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.FunctionTypesKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.OperatorNameConventions;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class FunctionInvokeDescriptor extends SimpleFunctionDescriptorImpl {

    /* renamed from: E, reason: collision with root package name */
    public static final Factory f143472E = new Factory(null);

    @SourceDebugExtension
    public static final class Factory {
        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Factory() {
        }

        public final FunctionInvokeDescriptor a(FunctionClassDescriptor functionClass, boolean z10) {
            Intrinsics.j(functionClass, "functionClass");
            List<TypeParameterDescriptor> listP = functionClass.p();
            FunctionInvokeDescriptor functionInvokeDescriptor = new FunctionInvokeDescriptor(functionClass, null, CallableMemberDescriptor.Kind.DECLARATION, z10, null);
            ReceiverParameterDescriptor receiverParameterDescriptorG0 = functionClass.G0();
            List<ReceiverParameterDescriptor> listM = CollectionsKt.m();
            List<? extends TypeParameterDescriptor> listM2 = CollectionsKt.m();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listP) {
                if (((TypeParameterDescriptor) obj).k() != Variance.f146797f) {
                    break;
                }
                arrayList.add(obj);
            }
            Iterable<IndexedValue> iterableS1 = CollectionsKt.s1(arrayList);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(iterableS1, 10));
            for (IndexedValue indexedValue : iterableS1) {
                arrayList2.add(FunctionInvokeDescriptor.f143472E.b(functionInvokeDescriptor, indexedValue.c(), (TypeParameterDescriptor) indexedValue.d()));
            }
            functionInvokeDescriptor.O0(null, receiverParameterDescriptorG0, listM, listM2, arrayList2, ((TypeParameterDescriptor) CollectionsKt.D0(listP)).o(), Modality.f143622e, DescriptorVisibilities.f143600e);
            functionInvokeDescriptor.W0(true);
            return functionInvokeDescriptor;
        }

        private final ValueParameterDescriptor b(FunctionInvokeDescriptor functionInvokeDescriptor, int i10, TypeParameterDescriptor typeParameterDescriptor) {
            String lowerCase;
            String strB = typeParameterDescriptor.getName().b();
            Intrinsics.i(strB, "asString(...)");
            if (Intrinsics.e(strB, "T")) {
                lowerCase = "instance";
            } else if (Intrinsics.e(strB, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                Intrinsics.i(lowerCase, "toLowerCase(...)");
            }
            Annotations annotationsB = Annotations.f143689s3.b();
            Name nameO = Name.o(lowerCase);
            Intrinsics.i(nameO, "identifier(...)");
            SimpleType simpleTypeO = typeParameterDescriptor.o();
            Intrinsics.i(simpleTypeO, "getDefaultType(...)");
            SourceElement NO_SOURCE = SourceElement.f143647a;
            Intrinsics.i(NO_SOURCE, "NO_SOURCE");
            return new ValueParameterDescriptorImpl(functionInvokeDescriptor, null, i10, annotationsB, nameO, simpleTypeO, false, false, false, null, NO_SOURCE);
        }
    }

    public /* synthetic */ FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, functionInvokeDescriptor, kind, z10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean B() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.MemberDescriptor
    public boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isInline() {
        return false;
    }

    private FunctionInvokeDescriptor(DeclarationDescriptor declarationDescriptor, FunctionInvokeDescriptor functionInvokeDescriptor, CallableMemberDescriptor.Kind kind, boolean z10) {
        super(declarationDescriptor, functionInvokeDescriptor, Annotations.f143689s3.b(), OperatorNameConventions.f147119i, kind, SourceElement.f143647a);
        c1(true);
        e1(z10);
        V0(false);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    protected FunctionDescriptorImpl I0(DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement source) {
        Intrinsics.j(newOwner, "newOwner");
        Intrinsics.j(kind, "kind");
        Intrinsics.j(annotations, "annotations");
        Intrinsics.j(source, "source");
        return new FunctionInvokeDescriptor(newOwner, (FunctionInvokeDescriptor) functionDescriptor, kind, isSuspend());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    protected FunctionDescriptor J0(FunctionDescriptorImpl.CopyConfiguration configuration) {
        Intrinsics.j(configuration, "configuration");
        FunctionInvokeDescriptor functionInvokeDescriptor = (FunctionInvokeDescriptor) super.J0(configuration);
        if (functionInvokeDescriptor == null) {
            return null;
        }
        List<ValueParameterDescriptor> listH = functionInvokeDescriptor.h();
        Intrinsics.i(listH, "getValueParameters(...)");
        List<ValueParameterDescriptor> list = listH;
        if ((list instanceof Collection) && list.isEmpty()) {
            return functionInvokeDescriptor;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            KotlinType type = ((ValueParameterDescriptor) it.next()).getType();
            Intrinsics.i(type, "getType(...)");
            if (FunctionTypesKt.d(type) != null) {
                List<ValueParameterDescriptor> listH2 = functionInvokeDescriptor.h();
                Intrinsics.i(listH2, "getValueParameters(...)");
                List<ValueParameterDescriptor> list2 = listH2;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    KotlinType type2 = ((ValueParameterDescriptor) it2.next()).getType();
                    Intrinsics.i(type2, "getType(...)");
                    arrayList.add(FunctionTypesKt.d(type2));
                }
                return functionInvokeDescriptor.m1(arrayList);
            }
        }
        return functionInvokeDescriptor;
    }

    private final FunctionDescriptor m1(List<Name> list) {
        Name name;
        int size = h().size() - list.size();
        boolean z10 = true;
        if (size == 0) {
            List<ValueParameterDescriptor> listH = h();
            Intrinsics.i(listH, "getValueParameters(...)");
            List<Pair> listU1 = CollectionsKt.u1(list, listH);
            if ((listU1 instanceof Collection) && listU1.isEmpty()) {
                return this;
            }
            for (Pair pair : listU1) {
                if (!Intrinsics.e((Name) pair.a(), ((ValueParameterDescriptor) pair.b()).getName())) {
                }
            }
            return this;
        }
        List<ValueParameterDescriptor> listH2 = h();
        Intrinsics.i(listH2, "getValueParameters(...)");
        List<ValueParameterDescriptor> list2 = listH2;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
        for (ValueParameterDescriptor valueParameterDescriptor : list2) {
            Name name2 = valueParameterDescriptor.getName();
            Intrinsics.i(name2, "getName(...)");
            int index = valueParameterDescriptor.getIndex();
            int i10 = index - size;
            if (i10 >= 0 && (name = list.get(i10)) != null) {
                name2 = name;
            }
            arrayList.add(valueParameterDescriptor.X(this, name2, index));
        }
        FunctionDescriptorImpl.CopyConfiguration copyConfigurationP0 = P0(TypeSubstitutor.f146780b);
        List<Name> list3 = list;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            z10 = false;
        } else {
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                if (((Name) it.next()) == null) {
                    break;
                }
            }
            z10 = false;
        }
        FunctionDescriptorImpl.CopyConfiguration copyConfigurationN = copyConfigurationP0.G(z10).b(arrayList).n(a());
        Intrinsics.i(copyConfigurationN, "setOriginal(...)");
        FunctionDescriptor functionDescriptorJ0 = super.J0(copyConfigurationN);
        Intrinsics.g(functionDescriptorJ0);
        return functionDescriptorJ0;
    }
}
