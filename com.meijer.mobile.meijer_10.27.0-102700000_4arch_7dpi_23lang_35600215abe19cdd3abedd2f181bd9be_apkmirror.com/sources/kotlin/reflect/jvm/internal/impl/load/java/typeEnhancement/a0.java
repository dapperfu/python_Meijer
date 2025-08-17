package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes13.dex */
class a0 implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f144696a = new a0();

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return SignatureEnhancement.m((CallableMemberDescriptor) obj);
    }
}
