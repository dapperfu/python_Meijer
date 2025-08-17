package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

@SourceDebugExtension
/* loaded from: classes13.dex */
public final class ClassicBuiltinSpecialProperties {

    /* renamed from: a, reason: collision with root package name */
    public static final ClassicBuiltinSpecialProperties f144169a = new ClassicBuiltinSpecialProperties();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(CallableMemberDescriptor it) {
        Intrinsics.j(it, "it");
        return f144169a.d(it);
    }

    private final boolean e(CallableMemberDescriptor callableMemberDescriptor) {
        if (CollectionsKt.h0(BuiltinSpecialProperties.f144163a.c(), DescriptorUtilsKt.k(callableMemberDescriptor)) && callableMemberDescriptor.h().isEmpty()) {
            return true;
        }
        if (!KotlinBuiltIns.h0(callableMemberDescriptor)) {
            return false;
        }
        Collection<? extends CallableMemberDescriptor> collectionD = callableMemberDescriptor.d();
        Intrinsics.i(collectionD, "getOverriddenDescriptors(...)");
        Collection<? extends CallableMemberDescriptor> collection = collectionD;
        if (collection.isEmpty()) {
            return false;
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            ClassicBuiltinSpecialProperties classicBuiltinSpecialProperties = f144169a;
            Intrinsics.g(callableMemberDescriptor2);
            if (classicBuiltinSpecialProperties.d(callableMemberDescriptor2)) {
                return true;
            }
        }
        return false;
    }

    public final String b(CallableMemberDescriptor callableMemberDescriptor) {
        Name name;
        Intrinsics.j(callableMemberDescriptor, "<this>");
        KotlinBuiltIns.h0(callableMemberDescriptor);
        CallableMemberDescriptor callableMemberDescriptorI = DescriptorUtilsKt.i(DescriptorUtilsKt.w(callableMemberDescriptor), false, e.f144377a, 1, null);
        if (callableMemberDescriptorI == null || (name = BuiltinSpecialProperties.f144163a.a().get(DescriptorUtilsKt.o(callableMemberDescriptorI))) == null) {
            return null;
        }
        return name.b();
    }

    public final boolean d(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.j(callableMemberDescriptor, "callableMemberDescriptor");
        if (BuiltinSpecialProperties.f144163a.d().contains(callableMemberDescriptor.getName())) {
            return e(callableMemberDescriptor);
        }
        return false;
    }

    private ClassicBuiltinSpecialProperties() {
    }
}
