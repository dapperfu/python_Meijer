package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
public final class DeserializedSimpleFunctionDescriptor extends SimpleFunctionDescriptorImpl implements DeserializedCallableMemberDescriptor {

    /* renamed from: E, reason: collision with root package name */
    private final ProtoBuf.Function f147454E;

    /* renamed from: F, reason: collision with root package name */
    private final NameResolver f147455F;

    /* renamed from: G, reason: collision with root package name */
    private final TypeTable f147456G;

    /* renamed from: H, reason: collision with root package name */
    private final VersionRequirementTable f147457H;

    /* renamed from: I, reason: collision with root package name */
    private final DeserializedContainerSource f147458I;

    public /* synthetic */ DeserializedSimpleFunctionDescriptor(DeclarationDescriptor declarationDescriptor, SimpleFunctionDescriptor simpleFunctionDescriptor, Annotations annotations, Name name, CallableMemberDescriptor.Kind kind, ProtoBuf.Function function, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource, SourceElement sourceElement, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(declarationDescriptor, simpleFunctionDescriptor, annotations, name, kind, function, nameResolver, typeTable, versionRequirementTable, deserializedContainerSource, (i10 & 1024) != 0 ? null : sourceElement);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public DeserializedSimpleFunctionDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r12, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor r13, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r14, kotlin.reflect.jvm.internal.impl.name.Name r15, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r16, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function r17, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r18, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r19, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable r20, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource r21, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r22) {
        /*
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.Intrinsics.j(r12, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.Intrinsics.j(r14, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.j(r15, r0)
            java.lang.String r0 = "kind"
            r5 = r16
            kotlin.jvm.internal.Intrinsics.j(r5, r0)
            java.lang.String r0 = "proto"
            kotlin.jvm.internal.Intrinsics.j(r7, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.Intrinsics.j(r8, r0)
            java.lang.String r0 = "typeTable"
            kotlin.jvm.internal.Intrinsics.j(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            kotlin.jvm.internal.Intrinsics.j(r10, r0)
            if (r22 != 0) goto L3d
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r0 = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.f144554a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L44
        L3d:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L44:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f147454E = r7
            r11.f147455F = r8
            r11.f147456G = r9
            r11.f147457H = r10
            r1 = r21
            r11.f147458I = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedSimpleFunctionDescriptor.<init>(kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations, kotlin.reflect.jvm.internal.impl.name.Name, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public TypeTable D() {
        return this.f147456G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public NameResolver G() {
        return this.f147455F;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public DeserializedContainerSource H() {
        return this.f147458I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.SimpleFunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl
    protected FunctionDescriptorImpl I0(DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement source) {
        Name name2;
        Intrinsics.j(newOwner, "newOwner");
        Intrinsics.j(kind, "kind");
        Intrinsics.j(annotations, "annotations");
        Intrinsics.j(source, "source");
        SimpleFunctionDescriptor simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptor;
        if (name == null) {
            Name name3 = getName();
            Intrinsics.i(name3, "getName(...)");
            name2 = name3;
        } else {
            name2 = name;
        }
        DeserializedSimpleFunctionDescriptor deserializedSimpleFunctionDescriptor = new DeserializedSimpleFunctionDescriptor(newOwner, simpleFunctionDescriptor, annotations, name2, kind, c0(), G(), D(), n1(), H(), source);
        deserializedSimpleFunctionDescriptor.V0(N0());
        return deserializedSimpleFunctionDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Function c0() {
        return this.f147454E;
    }

    public VersionRequirementTable n1() {
        return this.f147457H;
    }
}
