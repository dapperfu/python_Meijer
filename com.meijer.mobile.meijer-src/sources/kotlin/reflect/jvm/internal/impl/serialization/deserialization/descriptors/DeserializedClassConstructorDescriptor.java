package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes14.dex */
public final class DeserializedClassConstructorDescriptor extends ClassConstructorDescriptorImpl implements DeserializedCallableMemberDescriptor {

    /* renamed from: F, reason: collision with root package name */
    private final ProtoBuf.Constructor f147372F;

    /* renamed from: G, reason: collision with root package name */
    private final NameResolver f147373G;

    /* renamed from: H, reason: collision with root package name */
    private final TypeTable f147374H;

    /* renamed from: I, reason: collision with root package name */
    private final VersionRequirementTable f147375I;

    /* renamed from: J, reason: collision with root package name */
    private final DeserializedContainerSource f147376J;

    public /* synthetic */ DeserializedClassConstructorDescriptor(ClassDescriptor classDescriptor, ConstructorDescriptor constructorDescriptor, Annotations annotations, boolean z10, CallableMemberDescriptor.Kind kind, ProtoBuf.Constructor constructor, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, DeserializedContainerSource deserializedContainerSource, SourceElement sourceElement, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(classDescriptor, constructorDescriptor, annotations, z10, kind, constructor, nameResolver, typeTable, versionRequirementTable, deserializedContainerSource, (i10 & 1024) != 0 ? null : sourceElement);
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

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.FunctionDescriptorImpl, kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
    public boolean isSuspend() {
        return false;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public DeserializedClassConstructorDescriptor(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r12, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor r13, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations r14, boolean r15, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r16, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Constructor r17, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r18, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r19, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable r20, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource r21, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r22) {
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
            if (r22 != 0) goto L38
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r0 = kotlin.reflect.jvm.internal.impl.descriptors.SourceElement.f144554a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L3f
        L38:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L3f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f147372F = r7
            r11.f147373G = r8
            r11.f147374H = r9
            r11.f147375I = r10
            r1 = r21
            r11.f147376J = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassConstructorDescriptor.<init>(kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations, boolean, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor, kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver, kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable, kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public TypeTable D() {
        return this.f147374H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public NameResolver G() {
        return this.f147373G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    public DeserializedContainerSource H() {
        return this.f147376J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassConstructorDescriptorImpl
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public DeserializedClassConstructorDescriptor I0(DeclarationDescriptor newOwner, FunctionDescriptor functionDescriptor, CallableMemberDescriptor.Kind kind, Name name, Annotations annotations, SourceElement source) {
        Intrinsics.j(newOwner, "newOwner");
        Intrinsics.j(kind, "kind");
        Intrinsics.j(annotations, "annotations");
        Intrinsics.j(source, "source");
        DeserializedClassConstructorDescriptor deserializedClassConstructorDescriptor = new DeserializedClassConstructorDescriptor((ClassDescriptor) newOwner, (ConstructorDescriptor) functionDescriptor, annotations, this.f144724E, kind, c0(), G(), D(), r1(), H(), source);
        deserializedClassConstructorDescriptor.V0(N0());
        return deserializedClassConstructorDescriptor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public ProtoBuf.Constructor c0() {
        return this.f147372F;
    }

    public VersionRequirementTable r1() {
        return this.f147375I;
    }
}
