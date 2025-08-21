package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes14.dex */
class k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final k f145290a = new k();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(SpecialBuiltinMembers.k((CallableMemberDescriptor) obj));
    }
}
